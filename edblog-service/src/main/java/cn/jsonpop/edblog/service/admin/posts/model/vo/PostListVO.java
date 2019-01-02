package cn.jsonpop.edblog.service.admin.posts.model.vo;

import cn.jsonpop.edblog.common.base.vo.PageVO;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * description 文章列表请求体
 * 创建时间 2018/12/29
 *
 * @author MoMik
 */
@ApiModel(value = "PostListVO", description = "文章列表请求体")
@Data
public class PostListVO extends PageVO {
}
