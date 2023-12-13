package fun.fleamarket.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fun.fleamarket.dto.PageDTO;
import fun.fleamarket.entity.News;
import fun.fleamarket.entity.Product;
import fun.fleamarket.mapper.NewsMapper;
import fun.fleamarket.mapper.ProductMapper;
import fun.fleamarket.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.fleamarket.vo.ProductVO;
import fun.fleamarket.vo.ProductVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<ProductVO> listall() {
        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
        List<Product> products = productMapper.selectList(queryWrapper);
        List<ProductVO> vos = new ArrayList<>();
        products.forEach(item ->{
            ProductVO vo = new ProductVO();
            BeanUtils.copyProperties(item, vo);
            vos.add(vo);
        });
        return vos;
    }

    @Override
    public List<ProductVO> listpage(PageDTO pageDTO) {
        Page<Product> page = new Page<>(pageDTO.getCurrent(),pageDTO.getPagesize());
        QueryWrapper queryWrapper = new QueryWrapper();
        List<Product> products = productMapper.selectList(page,queryWrapper);
        List<ProductVO> vos = new ArrayList<>();
        products.forEach(item ->{
            ProductVO vo = new ProductVO();
            BeanUtils.copyProperties(item, vo);
            vos.add(vo);
        });
        return vos;
    }
}
