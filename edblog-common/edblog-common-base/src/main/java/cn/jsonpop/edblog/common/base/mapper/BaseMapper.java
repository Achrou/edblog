package cn.jsonpop.edblog.common.base.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * description 封装通用Mapper方法
 * 创建时间 2018/10/19
 *
 * @author 仇兴洲
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
