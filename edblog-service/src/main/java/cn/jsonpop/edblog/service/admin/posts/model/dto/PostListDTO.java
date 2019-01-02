package cn.jsonpop.edblog.service.admin.posts.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * description 文章列表返回体
 * 创建时间 2018/12/29
 *
 * @author MoMik
 */
@ApiModel(value = "PostListDTO", description = "文章列表返回体")
@Data
public class PostListDTO {
    @ApiModelProperty("文章id")
    private String id;
    @ApiModelProperty("文章url")
    private String guid;
    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("作者")
    private String author;
    @ApiModelProperty("分类目录")
    private String category;
    @ApiModelProperty("标签")
    private String tag;
    @ApiModelProperty("评论")
    private String comment;
    @ApiModelProperty("修改时间")
    private String modified;
    @ApiModelProperty("图片")
    private String pic;
}
