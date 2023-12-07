package fun.fleamarket.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
@TableName("widget_meta")
@ApiModel(value = "WidgetMeta对象", description = "")
public class WidgetMeta implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("组件meta_id")
    private Long widgetMetaId;

    @ApiModelProperty("组件ID")
    private Long widgetId;

    @ApiModelProperty("key")
    private String metaKey;

    @ApiModelProperty("value")
    private String metaValue;

    @ApiModelProperty("创建时间")
    private Integer createdTime;

    @ApiModelProperty("修改时间")
    private Integer updatedTime;


    public Long getWidgetMetaId() {
        return widgetMetaId;
    }

    public void setWidgetMetaId(Long widgetMetaId) {
        this.widgetMetaId = widgetMetaId;
    }

    public Long getWidgetId() {
        return widgetId;
    }

    public void setWidgetId(Long widgetId) {
        this.widgetId = widgetId;
    }

    public String getMetaKey() {
        return metaKey;
    }

    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey;
    }

    public String getMetaValue() {
        return metaValue;
    }

    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue;
    }

    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return "WidgetMeta{" +
        "widgetMetaId=" + widgetMetaId +
        ", widgetId=" + widgetId +
        ", metaKey=" + metaKey +
        ", metaValue=" + metaValue +
        ", createdTime=" + createdTime +
        ", updatedTime=" + updatedTime +
        "}";
    }
}
