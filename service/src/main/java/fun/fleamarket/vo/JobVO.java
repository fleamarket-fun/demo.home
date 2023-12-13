package fun.fleamarket.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class JobVO {

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("描述")
    private String description;

}
