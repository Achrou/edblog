package cn.jsonpop.edblog.common.base.view;

import cn.jsonpop.edblog.common.base.enums.ResultStatus;
import com.github.pagehelper.PageInfo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * description 统一响应结果
 * 创建时间 2018/8/1
 *
 * @author 仇兴洲
 */
public class ApiResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private final static Integer SUCCESS_CODE = 200;
    private final static Integer FAIL_CODE = 201;

    //响应状态
    private Integer status;
    //提示信息
    private String msg;
    //数据主体
    private T body;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public ApiResponse() {
        this.status = SUCCESS_CODE;
        this.msg = "SUCCESS";
    }

    public ApiResponse(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ApiResponse(Integer status, String msg, T body) {
        this.status = status;
        this.msg = msg;
        this.body = body;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", status=").append(status);
        sb.append(", msg=").append(msg);
        sb.append(", body=").append(body);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    //快速返回成功

    /**
     * 快速返回状态为200，内容为：请求成功
     * @return
     */
    public static ApiResponse<String> success() {
        return new ApiResponse<String>(SUCCESS_CODE, "请求成功");
    }

    /**
     * 快速放回状态为200 自定义msg+返回结果
     * @param msg
     * @param result
     * @param <T>
     * @return
     */
    public static <T> ApiResponse<T> success(String msg, T result) {
        return new ApiResponse<T>(SUCCESS_CODE, msg, result);
    }

    /**
     * 可自定义返回结果
     * @param result
     * @param <T>
     * @return
     */
    public static <T> ApiResponse<T> success(T result) {
        return new ApiResponse<T>(SUCCESS_CODE, "请求成功", result);
    }

    /**
     * 状态、msg自定义
     * @param status
     * @param msg
     * @return
     */
    public static ApiResponse<String> success(Integer status, String msg) {
        return new ApiResponse<String>(status, msg);
    }

    /**
     * 状态、msg自定义+自定义返回结果
     * @param status
     * @param msg
     * @param result
     * @param <T>
     * @return
     */
    public static <T> ApiResponse<T> success(Integer status, String msg, T result) {
        return new ApiResponse<T>(status, msg, result);
    }

    /**
     * 响应结果为List 不含分页
     * @param result
     * @param <T>
     * @return
     */
    public static <T> ApiResponse<ListModel<T>> success(List<T> result) {
        ListModel<T> listModel = new ListModel<T>();
        listModel.setData(result);
        return new ApiResponse<ListModel<T>>(SUCCESS_CODE, "请求成功", listModel);
    }

    /**
     * 快速响应分页结果
     * @param pageInfo
     * @param <T>
     * @return
     */
    public static <T> ApiResponse<PageModel<T>> success(PageInfo<T> pageInfo) {
        PageModel<T> pageModel = new PageModel<T>();
        pageModel.setCurPage(pageInfo.getPageNum());
        pageModel.setPageSize(pageInfo.getPageSize());
        pageModel.setCount(pageInfo.getTotal());
        pageModel.setPageCount(pageInfo.getPages());
        pageModel.setData(pageInfo.getList());
        return new ApiResponse<PageModel<T>>(SUCCESS_CODE, "请求成功", pageModel);
    }

    /**
     * 快速响应分页结果+自定义msg
     * @param msg
     * @param pageInfo
     * @param <T>
     * @return
     */
    public static <T> ApiResponse<PageModel<T>> success(String msg, PageInfo<T> pageInfo) {
        PageModel<T> pageModel = new PageModel<T>();
        pageModel.setCurPage(pageInfo.getPageNum());
        pageModel.setPageSize(pageInfo.getPageSize());
        pageModel.setCount(pageInfo.getTotal());
        pageModel.setPageCount(pageInfo.getPages());
        pageModel.setData(pageInfo.getList());
        return new ApiResponse<PageModel<T>>(SUCCESS_CODE, msg, pageModel);
    }

    /**
     * 分页结果非pageInfo
     * @param curPage
     * @param pageSize
     * @param count
     * @param pageCount
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ApiResponse<PageModel<T>> success(Integer curPage, Integer pageSize, long count, Integer pageCount, T data) {
        PageModel<T> pageModel = new PageModel<T>();
        pageModel.setCurPage(curPage);
        pageModel.setPageSize(pageSize);
        pageModel.setCount(count);
        pageModel.setPageCount(pageCount);
        pageModel.setData(data);
        return new ApiResponse<PageModel<T>>(SUCCESS_CODE, "请求成功", pageModel);
    }

    /**
     * 分页：map+list
     * @param result
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ApiResponse<PageModel<T>> success(Map<String,Object> result, T data) {
        Integer curPage = 0;
        Integer pageSize = 0;
        Long count = new Long(0);
        Integer pageCount = 0;
        if(result!=null&&!result.isEmpty()){
            curPage = Integer.parseInt(result.get("curPage").toString());
            pageSize = Integer.parseInt(result.get("pageSize").toString());
            count = Long.valueOf(result.get("count").toString());
            pageCount = Integer.parseInt(result.get("pageCount").toString());
        }
        PageModel<T> pageModel = new PageModel<T>();
        pageModel.setCurPage(curPage);
        pageModel.setPageSize(pageSize);
        pageModel.setCount(count);
        pageModel.setPageCount(pageCount);
        pageModel.setData(data);
        return new ApiResponse<PageModel<T>>(SUCCESS_CODE, "请求成功", pageModel);
    }


    //快速返回失败状态
    public static ApiResponse<String> fail() {
        return new ApiResponse<String>(FAIL_CODE, "请求失败");
    }

    public static ApiResponse<String> fail(Integer code) {
        return new ApiResponse<String>(code, ResultStatus.getByCode(code).getMsg());
    }

    public static ApiResponse<String> fail(String msg) {
        return new ApiResponse<String>(FAIL_CODE, msg);
    }

    public static ApiResponse<String> fail(Integer code, String msg) {
        return new ApiResponse<String>(code, msg);
    }

    public static <T> ApiResponse<T> fail(T result) {
        return new ApiResponse<T>(FAIL_CODE, "请求失败", result);
    }

    public <T> ApiResponse<T> fail(String message, T result) {
        return new ApiResponse<T>(FAIL_CODE, message, result);
    }

    public static <T> ApiResponse<T> fail(Integer code, String msg, T result) {
        return new ApiResponse<T>(code, msg, result);
    }

    public static ApiResponse<String> fail(ResultStatus resultStatus) {
        return new ApiResponse<String>(resultStatus.getCode(), resultStatus.getMsg());
    }
}
