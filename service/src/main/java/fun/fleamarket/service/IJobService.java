package fun.fleamarket.service;

import fun.fleamarket.dto.PageDTO;
import fun.fleamarket.entity.Job;
import com.baomidou.mybatisplus.extension.service.IService;
import fun.fleamarket.vo.JobVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
public interface IJobService extends IService<Job> {

    List<JobVO> listall();

    List<JobVO> listpage(PageDTO pageDTO);
}
