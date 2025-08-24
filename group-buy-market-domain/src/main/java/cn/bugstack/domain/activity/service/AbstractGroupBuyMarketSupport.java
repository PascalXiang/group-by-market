package cn.bugstack.domain.activity.service;

import cn.bugstack.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import cn.bugstack.types.design.framework.tree.AbstractStrategyRouter;

/**
 * @author Pascal
 * @Desc   抽象拼团营销支撑类
 * @Create 2025-08-24 19:45
 */
public abstract class AbstractGroupBuyMarketSupport<MarketProductEntity, DynamicContext, TrialBalanceEntity> extends AbstractStrategyRouter<cn.bugstack.domain.activity.model.entity.MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, cn.bugstack.domain.activity.model.entity.TrialBalanceEntity> {


}
