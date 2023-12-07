package fun.fleamarket.entity;

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
@ApiModel(value = "Widget对象", description = "")
public class Widget implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键id")
    private Long widgetId;

    @ApiModelProperty("组件标识")
    private String widgetKey;

    @ApiModelProperty("描述")
    private String title;

    @ApiModelProperty("组件类型")
    private String widgetType;


    public Long getWidgetId() {
        return widgetId;
    }

    public void setWidgetId(Long widgetId) {
        this.widgetId = widgetId;
    }

    public String getWidgetKey() {
        return widgetKey;
    }

    public void setWidgetKey(String widgetKey) {
        this.widgetKey = widgetKey;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWidgetType() {
        return widgetType;
    }

    public void setWidgetType(String widgetType) {
        this.widgetType = widgetType;
    }

    @Override
    public String toString() {
        return "Widget{" +
        "widgetId=" + widgetId +
        ", widgetKey=" + widgetKey +
        ", title=" + title +
        ", widgetType=" + widgetType +
        "}";
    }
}
