package cn.jsonpop.edblog.common.base.enums;

/**
 * description 错误响应信息
 * 创建时间 2018/8/1
 *
 * @author 仇兴洲
 */
public enum ResultStatus {

    SYSTEM_ERROR(500, "系统错误"),
    PARAMETER_CHECK_ERROR(501, "参数校验错误"),
    UNLOGIN_ERROR(401, "用户未登录或登录状态超时失效"),
    AUTH_VALID_ERROR(402, "用户权限不足"),
    ILLEGAL_REQUEST_ERROR(403, "非法请求"),
    MD5_ENCRYPT_ERRO(300,"MD5加密异常"),
    JAVABEANTOMAP_ERROR(301,"JavaBean转Map异常"),
    FILEUPLOAD_ERROR(302,"文件上传异常"),
    FILEDOWN_ERROR(303,"文件下载异常"),
    FILETYPE_ERROR(304,"不支持的文件类型上传"),
    REDIS_ERROR(305,"Redis操作异常");
    //错误编码
    private final Integer code;
    //消息
    private final String msg;

    ResultStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return code.toString();
    }


    public static ResultStatus getByCode(Integer code) {
        for (ResultStatus _enum : values()) {
            if (_enum.getCode() == code||_enum.getCode().equals(code)) {
                return _enum;
            }
        }
        return null;
    }
}
