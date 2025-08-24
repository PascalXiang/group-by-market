package cn.bugstack.domain.activity.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Pascal
 * @Desc   试算结果实体对象（给用户展示拼团可获得的优惠信息）
 * @Create 2025-08-24 19:41
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TrialBalanceEntity {
    private String goodsId;

    private String goodsName;

    private BigDecimal originalPrice;

    private BigDecimal deductionPrice;

    private Integer targetCount;

    private Date startTime;

    private Date endTime;

    private Boolean isVisible;

    private Boolean isEnable;
}
