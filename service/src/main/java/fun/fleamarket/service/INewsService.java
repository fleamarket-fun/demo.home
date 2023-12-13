package fun.fleamarket.service;

import fun.fleamarket.dto.PageDTO;
import fun.fleamarket.entity.News;
import com.baomidou.mybatisplus.extension.service.IService;
import fun.fleamarket.vo.NewsVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
public interface INewsService extends IService<News> {

    List<NewsVO> listall();

    List<NewsVO> listpage(PageDTO pageDTO);
}
