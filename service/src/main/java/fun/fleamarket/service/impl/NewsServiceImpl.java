package fun.fleamarket.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fun.fleamarket.dto.PageDTO;
import fun.fleamarket.entity.Job;
import fun.fleamarket.entity.News;
import fun.fleamarket.mapper.JobMapper;
import fun.fleamarket.mapper.NewsMapper;
import fun.fleamarket.service.INewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.fleamarket.vo.NewsVO;
import fun.fleamarket.vo.NewsVO;
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
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements INewsService {

    @Autowired
    NewsMapper newsMapper;

    @Override
    public List<NewsVO> listall() {
        QueryWrapper<News> queryWrapper = new QueryWrapper<>();
        List<News> news = newsMapper.selectList(queryWrapper);
        List<NewsVO> vos = new ArrayList<>();
        news.forEach(item ->{
            NewsVO vo = new NewsVO();
            BeanUtils.copyProperties(item, vo);
            vos.add(vo);
        });
        return vos;
    }

    @Override
    public List<NewsVO> listpage(PageDTO pageDTO) {
        Page<News> page = new Page<>(pageDTO.getCurrent(),pageDTO.getPagesize());
        QueryWrapper queryWrapper = new QueryWrapper();
        List<News> news = newsMapper.selectList(page,queryWrapper);
        List<NewsVO> vos = new ArrayList<>();
        news.forEach(item ->{
            NewsVO vo = new NewsVO();
            BeanUtils.copyProperties(item, vo);
            vos.add(vo);
        });
        return vos;
    }
}
