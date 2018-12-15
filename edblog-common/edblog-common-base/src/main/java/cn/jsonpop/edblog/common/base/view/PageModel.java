package cn.jsonpop.edblog.common.base.view;


/**
 * description 分页返回体
 * 创建时间 2018/8/2
 *
 * @author 仇兴洲
 */
public class PageModel<T> {
    //当前页码
    private Integer curPage;
    //每页记录数
    private Integer pageSize;
    //总记录数
    private Long count;
    //总页数
    private Integer pageCount;
    //数据列表
    private Object data;

    public PageModel(Integer curPage, Integer pageSize) {
        this.curPage = curPage;
        this.pageSize = pageSize;
    }

    public PageModel() {
    }

    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
