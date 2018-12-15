package cn.jsonpop.edblog.common.base.service.impl;

import cn.jsonpop.edblog.common.base.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

/**
 * description 封装基础service接口实现
 * 创建时间 2018/10/19
 *
 * @author 仇兴洲
 */
public abstract class BaseService<T> implements IService<T> {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected Mapper<T> mapper;

    public Mapper<T> getMapper() {
        return mapper;
    }
}
