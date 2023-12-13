package fun.fleamarket.service;

import fun.fleamarket.dto.PageDTO;
import fun.fleamarket.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import fun.fleamarket.vo.ProductVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
public interface IProductService extends IService<Product> {

    List<ProductVO> listall();

    List<ProductVO> listpage(PageDTO pageDTO);
}
