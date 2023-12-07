package fun.fleamarket.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value = "News对象", description = "")
public class News implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("新闻ID")
    @TableId(value = "news_id", type = IdType.AUTO)
    private Long newsId;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("描述")
    @TableField("`description`")
    private String description;

    @ApiModelProperty("创建时间")
    private Integer createdTime;

    @ApiModelProperty("修改时间")
    private Integer updatedTime;


    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "News{" +
        "newsId=" + newsId +
        ", title=" + title +
        ", description=" + description +
        ", createdTime=" + createdTime +
        ", updatedTime=" + updatedTime +
        "}";
    }
}
