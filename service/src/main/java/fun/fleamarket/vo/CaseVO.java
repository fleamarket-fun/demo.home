package fun.fleamarket.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CaseVO {

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("描述")
    private String description;

    @ApiModelProperty("主图")
    private String mainImage;

}
