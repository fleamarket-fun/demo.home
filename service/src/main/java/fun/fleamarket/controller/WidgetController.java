package fun.fleamarket.controller;

import fun.fleamarket.common.controller.BaseController;
import fun.fleamarket.common.domain.AjaxResult;
import fun.fleamarket.vo.CarouselVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  组件数据控制器
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
@Api(value="WidgetController",tags={"组件数据获取接口"})
@Controller
@RestController("/widget")
public class WidgetController  extends BaseController {

    @ApiOperation(value = "获取首页的跑马灯数据")
    @PostMapping(value = "/carousel")
    public AjaxResult carousel(){

        List<CarouselVO> carouselVOList = new ArrayList<>();

        CarouselVO carouselVO = new CarouselVO();
        carouselVO.setImageUrl("/static/images/banner/1.jpg");
        carouselVOList.add(carouselVO);

        CarouselVO carouselVO2 = new CarouselVO();
        carouselVO2.setImageUrl("/static/images/banner/2.jpg");
        carouselVOList.add(carouselVO2);

        return success(carouselVOList);
    }

}
