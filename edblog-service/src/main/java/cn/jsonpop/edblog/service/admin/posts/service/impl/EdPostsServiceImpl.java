package cn.jsonpop.edblog.service.admin.posts.service.impl;

import cn.jsonpop.edblog.service.admin.posts.model.vo.PostListVO;
import cn.jsonpop.edblog.service.admin.posts.service.EdPostsService;
import cn.jsonpop.edblog.service.admin.posts.mapper.EdPostsMapper;
import cn.jsonpop.edblog.service.admin.posts.model.dto.PostListDTO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description 描述这个类的主要功能、用途
 * 创建时间 2018/12/29
 *
 * @author 仇兴洲
 */
@Service
public class EdPostsServiceImpl implements EdPostsService {
    @Autowired
    private EdPostsMapper edPostsMapper;

    /**
     * 文章列表
     *
     * @param postListVO
     * @return
     */
    @Override
    public PageInfo<PostListDTO> postList(PostListVO postListVO) {
        PageHelper.startPage(1, 10);
        List<PostListDTO> list = edPostsMapper.postList(postListVO);
        PageInfo<PostListDTO> pageList = new PageInfo<>(list);
        return pageList;
    }
}
