package fun.fleamarket.service.impl;

import fun.fleamarket.entity.Product;
import fun.fleamarket.mapper.ProductMapper;
import fun.fleamarket.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
