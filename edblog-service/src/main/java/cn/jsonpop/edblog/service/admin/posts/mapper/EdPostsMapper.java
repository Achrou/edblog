package cn.jsonpop.edblog.service.admin.posts.mapper;

import cn.jsonpop.edblog.common.base.mapper.BaseMapper;
import cn.jsonpop.edblog.service.admin.posts.model.dto.PostListDTO;
import cn.jsonpop.edblog.service.admin.posts.model.dto.PostLoadDTO;
import cn.jsonpop.edblog.service.admin.posts.model.vo.PostListVO;
import cn.jsonpop.edblog.service.admin.posts.model.vo.PostLoadVO;
import cn.jsonpop.edblog.service.common.posts.entity.EdPosts;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EdPostsMapper extends BaseMapper<EdPosts> {
    /**
     * 文章列表
     *
     * @param postListVO
     * @return
     */
    List<PostListDTO> postList(PostListVO postListVO);

    /**
     * 文章信息加载
     *
     * @param postLoadVO
     * @return
     */
    PostLoadDTO postLoad(PostLoadVO postLoadVO);
}
