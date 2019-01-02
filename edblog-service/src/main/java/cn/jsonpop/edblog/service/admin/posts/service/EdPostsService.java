package cn.jsonpop.edblog.service.admin.posts.service;

import cn.jsonpop.edblog.service.admin.posts.model.dto.PostListDTO;
import cn.jsonpop.edblog.service.admin.posts.model.dto.PostLoadDTO;
import cn.jsonpop.edblog.service.admin.posts.model.vo.PostListVO;
import cn.jsonpop.edblog.service.admin.posts.model.vo.PostLoadVO;
import com.github.pagehelper.PageInfo;

/**
 * description 描述这个类的主要功能、用途
 * 创建时间 2018/12/29
 *
 * @author MoMik
 */
public interface EdPostsService {
    /**
     * 文章列表
     *
     * @param postListVO
     * @return
     */
    PageInfo<PostListDTO> postList(PostListVO postListVO);

    /**
     * 文章信息加载
     *
     * @param postLoadVO
     * @return
     */
    PostLoadDTO postLoad(PostLoadVO postLoadVO);
}
