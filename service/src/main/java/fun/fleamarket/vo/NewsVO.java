package fun.fleamarket.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class NewsVO {

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("描述")
    private String description;

}
