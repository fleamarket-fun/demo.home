package fun.fleamarket.service;

import fun.fleamarket.dto.PageDTO;
import fun.fleamarket.entity.Download;
import com.baomidou.mybatisplus.extension.service.IService;
import fun.fleamarket.vo.DownloadVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
public interface IDownloadService extends IService<Download> {

    List<DownloadVO> listall();

    List<DownloadVO> listpage(PageDTO pageDTO);
}
