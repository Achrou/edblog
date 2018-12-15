package cn.jsonpop.edblog.common.base.vo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * description 基础分页请求体
 * 创建时间 2018/12/13
 *
 * @author 仇兴洲
 */
public class PageVO extends BaseVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("当前页码")
    private Integer curPage;
    @ApiModelProperty("每页条目")
    private Integer pageSize;

    public Integer getCurPage() {
        return curPage == null ? 1 : curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public Integer getPageSize() {
        return pageSize == null ? 10 : pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
