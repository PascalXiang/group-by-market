package cn.bugstack.domain.activity.service;

import cn.bugstack.domain.activity.model.entity.MarketProductEntity;
import cn.bugstack.domain.activity.model.entity.TrialBalanceEntity;

/**
 * @author Pascal
 * @Desc   首页营销服务接口
 * @Create 2025-08-24 19:57
 */
public interface IIndexGroupBuyMarketService {

    TrialBalanceEntity indexMarketTrial(MarketProductEntity marketProductEntity) throws Exception;

}