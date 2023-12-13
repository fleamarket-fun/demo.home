package fun.fleamarket.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
@Api(value="JobController",tags={"工作内容信息接口"})
@RestController
@RequestMapping("/job")
public class JobController {

}
