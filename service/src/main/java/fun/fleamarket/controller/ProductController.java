package fun.fleamarket.controller;

import fun.fleamarket.common.controller.BaseController;
import fun.fleamarket.common.domain.AjaxResult;
import fun.fleamarket.dto.PageDTO;
import fun.fleamarket.service.INewsService;
import fun.fleamarket.service.IProductService;
import fun.fleamarket.vo.NewsVO;
import fun.fleamarket.vo.ProductVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @Autowired
    IProductService productService;

    @ApiOperation(value = "产品内容查询")
    @PostMapping(value = "/listall")
    public AjaxResult listall(){
        List<ProductVO> caseVOList = productService.listall();
        return success(caseVOList);
    }

    @ApiOperation(value = "产品内容分页查询")
    @PostMapping(value = "/listpage")
    public AjaxResult listpage(@RequestBody PageDTO pageDTO){
        List<ProductVO> caseVOList = productService.listpage(pageDTO);
        return success(caseVOList);
    }

}
