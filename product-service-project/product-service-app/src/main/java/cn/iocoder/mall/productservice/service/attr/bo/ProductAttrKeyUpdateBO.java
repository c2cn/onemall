package cn.iocoder.mall.productservice.service.attr.bo;

import cn.iocoder.common.framework.enums.CommonStatusEnum;
import cn.iocoder.common.framework.validator.InEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 商品规格键更新 BO
 */
@Data
@Accessors(chain = true)
public class ProductAttrKeyUpdateBO {

    /**
     * 规格键编号
     */
    @NotNull(message = "规格键编号不能为空")
    private Integer id;
    /**
     * 规格键名称
     */
    @NotEmpty(message = "规格键名称不能为空")
    private String name;
    /**
     * 状态
     */
    @NotNull(message = "状态不能为空")
    @InEnum(value = CommonStatusEnum.class, message = "修改状态必须是 {value}")
    private Integer status;

}
