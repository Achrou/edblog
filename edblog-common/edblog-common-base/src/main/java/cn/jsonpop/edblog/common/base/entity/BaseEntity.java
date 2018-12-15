package cn.jsonpop.edblog.common.base.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * description 基础Bean所有持久化类均继承该类
 * 创建时间 2018/10/20
 *
 * @author 仇兴洲
 */
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
