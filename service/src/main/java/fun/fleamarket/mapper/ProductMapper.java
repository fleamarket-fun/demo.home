package fun.fleamarket.mapper;

import fun.fleamarket.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

}
