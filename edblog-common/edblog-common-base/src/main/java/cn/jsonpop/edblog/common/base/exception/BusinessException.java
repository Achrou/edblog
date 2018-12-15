package cn.jsonpop.edblog.common.base.exception;

import cn.jsonpop.edblog.common.base.enums.ResultStatus;

/**
 * description 自定义异常处理
 * 创建时间 2018/8/2
 *
 * @author 仇兴洲
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    //错误编码
    private Integer code;

    public BusinessException(ResultStatus resultStatus) {
        super(resultStatus.getMsg());
        this.code = resultStatus.getCode();
    }

    public BusinessException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
