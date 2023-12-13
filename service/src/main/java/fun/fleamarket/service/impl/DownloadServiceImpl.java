package fun.fleamarket.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fun.fleamarket.dto.PageDTO;
import fun.fleamarket.entity.Case;
import fun.fleamarket.entity.Download;
import fun.fleamarket.mapper.DownloadMapper;
import fun.fleamarket.service.IDownloadService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.fleamarket.vo.CaseVO;
import fun.fleamarket.vo.DownloadVO;
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
public class DownloadServiceImpl extends ServiceImpl<DownloadMapper, Download> implements IDownloadService {

    @Autowired
    DownloadMapper downloadMapper;

    @Override
    public List<DownloadVO> listall() {
        QueryWrapper<Download> queryWrapper = new QueryWrapper<>();
        List<Download> downloads = downloadMapper.selectList(queryWrapper);
        List<DownloadVO> vos = new ArrayList<>();
        downloads.forEach(item ->{
            DownloadVO vo = new DownloadVO();
            BeanUtils.copyProperties(item, vo);
            vos.add(vo);
        });
        return vos;
    }

    @Override
    public List<DownloadVO> listpage(PageDTO pageDTO) {
        Page<Download> page = new Page<>(pageDTO.getCurrent(),pageDTO.getPagesize());
        QueryWrapper queryWrapper = new QueryWrapper();
        List<DownloadVO> downloads = downloadMapper.selectList(page,queryWrapper);
        List<DownloadVO> vos = new ArrayList<>();
        downloads.forEach(item ->{
            DownloadVO vo = new DownloadVO();
            BeanUtils.copyProperties(item, vo);
            vos.add(vo);
        });
        return vos;
    }
}
