package cn.jsonpop.edblog.web.admin.post;

import cn.jsonpop.edblog.common.base.view.ApiResponse;
import cn.jsonpop.edblog.common.base.view.PageModel;
import cn.jsonpop.edblog.service.admin.posts.model.dto.PostListDTO;
import cn.jsonpop.edblog.service.admin.posts.model.vo.PostListVO;
import cn.jsonpop.edblog.service.admin.posts.service.EdPostsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description 文章管理请求接口
 * 创建时间 2018/12/29
 *
 * @author MoMik
 */
@Api(value = "EdPostsController", description = "文章管理请求接口")
@RequestMapping(value = "/posts", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
public class EdPostsController {
    @Autowired
    private EdPostsService edPostsService;

    @ApiOperation(value = "查询列表", notes = "查询列表接口")
    @PostMapping(value = "/list")
    public ApiResponse<PageModel<PostListDTO>> list(@RequestBody PostListVO postListVO) {
        return ApiResponse.success(edPostsService.postList(postListVO));
    }
}
