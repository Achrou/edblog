package cn.jsonpop.edblog.common.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * description session工具类
 * 创建时间 2018/8/13
 *
 * @author 仇兴洲
 */
public class SessionUtil {
    /**
     * 全局删除id标示
     */
    public static String GLOB_DELETE_ID_VAL = "globDeleteIdVal";

    /**
     * 获取request
     *
     * @return
     */
    public static HttpServletRequest getRequest() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return requestAttributes == null ? null : requestAttributes.getRequest();
    }

    /**
     * 获取session
     *
     * @return
     */
    public static HttpSession getSession() {
        return getRequest().getSession(false);
    }

    /**
     * 获取session id
     *
     * @return
     */
    public static String getId() {
        return getRequest().getSession().getId();
    }

    /**
     * 销毁session会话
     */
    public static void invalidate() {
        getRequest().getSession().invalidate();
    }


    /**
     * 获取真实路径
     *
     * @return
     */
    public static String getRealRootPath() {
        return getRequest().getServletContext().getRealPath("/");
    }

    /**
     * 获取ip
     *
     * @return
     */
    public static String getIp() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();
        if (servletRequestAttributes != null) {
            HttpServletRequest request = servletRequestAttributes.getRequest();
            return request.getRemoteAddr();
        }
        return null;
    }

    /**
     * 获取session中的Attribute
     *
     * @param name
     * @return
     */
    public static Object getSessionAttribute(String name) {
        HttpServletRequest request = getRequest();
        HttpSession session = request.getSession();
        Object result  = session.getAttribute(name);
        return request == null ? null : request.getSession().getAttribute(name);
    }

    /**
     * 设置session的Attribute
     *
     * @param name
     * @param value
     */
    public static void setSessionAttribute(String name, Object value) {
        HttpServletRequest request = getRequest();
        if (request != null) {
            request.getSession().setAttribute(name, value);
        }
    }

    /**
     * 获取request中的Attribute
     *
     * @param name
     * @return
     */
    public static Object getRequestAttribute(String name) {
        HttpServletRequest request = getRequest();
        return request == null ? null : request.getAttribute(name);
    }

    /**
     * 设置request的Attribute
     *
     * @param name
     * @param value
     */
    public static void setRequestAttribute(String name, Object value) {
        HttpServletRequest request = getRequest();
        if (request != null) {
            request.setAttribute(name, value);
        }
    }

    /**
     * 获取上下文path
     *
     * @return
     */
    public static String getContextPath() {
        return getRequest().getContextPath();
    }

    /**
     * 删除session中的Attribute
     *
     * @param name
     */
    public static void removeSessionAttribute(String name) {
        getRequest().getSession().removeAttribute(name);
    }

    /**
     * 获取用户类型
     *
     * @return
     */
    public static String getOrgType() {
        Object orgType = getSessionAttribute("orgType");
        return orgType==null?null:orgType.toString();
    }

    /**
     * 获取组织id
     * @return
     */
    public static String getOrgId() {
        Object orgId = getSessionAttribute("orgId");
        return orgId==null?null:orgId.toString();
    }

    /**
     * 获取门店Id
     * @return
     */
    public static String getStoreId() {
        Object storeId = getSessionAttribute("storeId");
        return storeId==null?null:storeId.toString();
    }

    /**
     * 获取供应商Id
     * @return
     */
    public static String getSupplierId() {
        Object supplierId = getSessionAttribute("supplierId");
        return supplierId==null?null:supplierId.toString();
    }

    /**
     * 获取用户Id
     * @return
     */
    public static Integer getUserId() {
        Object userId = getSessionAttribute("userId");
        return userId==null?null:Integer.parseInt(userId.toString());
    }

    /**
     * 获取用户姓名
     * @return
     */
    public static String getUserName() {
        Object userName = getSessionAttribute("userName");
        return userName==null?null:userName.toString();
    }

    /**
     * 删除用户session信息
     */
    public static void removeUserInfo(){
//        removeSessionAttribute("orgType");
//        removeSessionAttribute("orgId");
//        removeSessionAttribute("storeId");
//        removeSessionAttribute("supplierId");
//        removeSessionAttribute("userId");
//        removeSessionAttribute("userName");
        invalidate();
    }

}
