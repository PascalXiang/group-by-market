package cn.bugstack.domain.activity.service.trial.thread;

import cn.bugstack.domain.activity.adapter.repository.IActivityRepository;
import cn.bugstack.domain.activity.model.valobj.SkuVO;

import java.util.concurrent.Callable;

/**
 * @author Pascal
 * @Desc   查询商品信息任务
 * @Create 2025-08-25 0:51
 */
public class QuerySkuVOFromDBThreadTask implements Callable<SkuVO> {
    private final String goodsId;

    private final IActivityRepository activityRepository;

    public QuerySkuVOFromDBThreadTask(String goodsId, IActivityRepository activityRepository) {
        this.goodsId = goodsId;
        this.activityRepository = activityRepository;
    }

    @Override
    public SkuVO call() throws Exception {
        return activityRepository.querySkuByGoodsId(goodsId);
    }
}
