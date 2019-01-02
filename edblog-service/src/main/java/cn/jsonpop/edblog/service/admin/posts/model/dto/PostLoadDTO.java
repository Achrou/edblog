package cn.jsonpop.edblog.service.admin.posts.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * description 文章信息加载返回体
 * 创建时间 2019/1/2
 *
 * @author 仇兴洲
 */
@ApiModel(value = "PostLoadDTO", description = "文章信息加载返回体")
@Data
public class PostLoadDTO {
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
    @ApiModelProperty("内容")
    private String content;
}
