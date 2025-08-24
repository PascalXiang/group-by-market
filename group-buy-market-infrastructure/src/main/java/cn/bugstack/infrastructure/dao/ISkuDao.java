package cn.bugstack.infrastructure.dao;

import cn.bugstack.infrastructure.dao.po.Sku;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Pascal
 * @Desc   商品查询
 * @Create 2025-08-25 0:07
 */
@Mapper
public interface ISkuDao {

    Sku querySkuByGoodsId(String goodsId);

}
