package fun.fleamarket.controller;

import fun.fleamarket.common.controller.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  产品内容接口
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
@Api(value="ProductController",tags={"产品内容接口"})
@RestController
@RequestMapping("/product")
public class ProductController extends BaseController {



}
