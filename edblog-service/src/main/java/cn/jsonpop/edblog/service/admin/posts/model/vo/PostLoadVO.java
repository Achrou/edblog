package cn.jsonpop.edblog.service.admin.posts.model.vo;

import cn.jsonpop.edblog.common.base.vo.BaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * description 文章信息加载请求体
 * 创建时间 2019/1/2
 *
 * @author MoMik
 */
@ApiModel(value = "PostLoadVO", description = "文章信息加载请求体")
@Data
public class PostLoadVO extends BaseVO {
    @ApiModelProperty("文章id")
    private String id;
}
