package cn.bugstack.domain.activity.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pascal
 * @Desc   营销商品实体信息，通过这样一个信息获取商品优惠信息
 * @Create 2025-08-24 19:40
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MarketProductEntity {

    private String userId;

    private String goodsId;

    private String source;

    private String channel;
}
