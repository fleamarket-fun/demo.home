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
@ApiModel(value = "Case对象", description = "")
public class Case implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "case_id", type = IdType.AUTO)
    private Long caseId;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("描述")
    @TableField("`description`")
    private String description;

    @ApiModelProperty("主图")
    private String mainImage;

    @ApiModelProperty("创建时间")
    private Integer createdTime;

    @ApiModelProperty("修改时间")
    private Integer updatedTime;


    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
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

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
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
        return "Case{" +
        "caseId=" + caseId +
        ", title=" + title +
        ", description=" + description +
        ", mainImage=" + mainImage +
        ", createdTime=" + createdTime +
        ", updatedTime=" + updatedTime +
        "}";
    }
}
