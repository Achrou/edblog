package cn.jsonpop.edblog.service.common.posts.entity;

import cn.jsonpop.edblog.common.base.entity.BaseEntity;
import java.util.Date;
import lombok.*;

/**
 * 
 * ed_posts
 *
 * @generation date 2018-12-29 09:59:09
 */
@Data
public class EdPosts extends BaseEntity {
    /**
     * ed_posts.ID
     * @generation date 2018-12-29 09:59:09
     */
    private Long id;

    /**
     * 作者
     * ed_posts.post_author
     * @generation date 2018-12-29 09:59:09
     */
    private Long postAuthor;

    /**
     * 发布时间
     * ed_posts.post_date
     * @generation date 2018-12-29 09:59:09
     */
    private Date postDate;

    /**
     * 文章状态
     * ed_posts.post_status
     * @generation date 2018-12-29 09:59:09
     */
    private String postStatus;

    /**
     * 评论状态
     * ed_posts.comment_status
     * @generation date 2018-12-29 09:59:09
     */
    private String commentStatus;

    /**
     * 文章密码
     * ed_posts.post_password
     * @generation date 2018-12-29 09:59:09
     */
    private String postPassword;

    /**
     * 文章缩率名
     * ed_posts.post_name
     * @generation date 2018-12-29 09:59:09
     */
    private String postName;

    /**
     * 修改时间
     * ed_posts.post_modified
     * @generation date 2018-12-29 09:59:09
     */
    private Date postModified;

    /**
     * 文章url
     * ed_posts.guid
     * @generation date 2018-12-29 09:59:09
     */
    private String guid;

    /**
     * 排序
     * ed_posts.menu_order
     * @generation date 2018-12-29 09:59:09
     */
    private Integer menuOrder;

    /**
     * 文章类型（post/page等）
     * ed_posts.post_type
     * @generation date 2018-12-29 09:59:09
     */
    private String postType;

    /**
     * 正文
     * ed_posts.post_content
     * @generation date 2018-12-29 09:59:09
     */
    private String postContent;

    /**
     * 标题
     * ed_posts.post_title
     * @generation date 2018-12-29 09:59:09
     */
    private String postTitle;

    /**
     * 摘录
     * ed_posts.post_excerpt
     * @generation date 2018-12-29 09:59:09
     */
    private String postExcerpt;
}