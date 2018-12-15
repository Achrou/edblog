package cn.jsonpop.edblog.common.base.view;


import java.util.List;

/**
 * description 列表数据返回
 * 创建时间 2018/8/10
 *
 * @author 仇兴洲
 */
public class ListModel<T> {
    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
