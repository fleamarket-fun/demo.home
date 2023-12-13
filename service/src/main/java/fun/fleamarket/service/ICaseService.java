package fun.fleamarket.service;

import fun.fleamarket.dto.PageDTO;
import fun.fleamarket.entity.Case;
import com.baomidou.mybatisplus.extension.service.IService;
import fun.fleamarket.vo.CaseVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhujun
 * @since 2023-12-07
 */
public interface ICaseService extends IService<Case> {

    List<CaseVO> listall();

    List<CaseVO> listpage(PageDTO pageDTO);
}
