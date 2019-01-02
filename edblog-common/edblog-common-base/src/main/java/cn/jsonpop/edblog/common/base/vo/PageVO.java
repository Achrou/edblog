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
    private Integer current;
    @ApiModelProperty("每页条目")
    private Integer size;

    public Integer getCurrent() {
        return current == null ? 1 : current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getSize() {
        return size == null ? 10 : size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
