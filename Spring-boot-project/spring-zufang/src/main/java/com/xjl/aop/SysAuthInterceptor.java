package com.xjl.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.Set;

/**
 * 后端登录拦截器
 *
 * @author Zouxf
 */
public class SysAuthInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 不需要登录状态的URI
     */
    private static final Set<String> NO_AUTH_URI = new HashSet<String>();

    static {
        NO_AUTH_URI.add("/web/hotelOrder/updateOrderStatus");
        NO_AUTH_URI.add("/web/hotelOrder/timerUpdateOrderStatus");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        String uri = request.getRequestURI();
        if (NO_AUTH_URI.contains(uri)) {
            return true;
        }
/*        HttpSession session = request.getSession();
        SysUser sessionUser = (SysUser) session.getAttribute(ApiConstants.SESSION_USER_KEY);
        if (null == sessionUser) {
            throw new ApiException(ApiAssertCode.TOKEN_INVALID);
        }
        UserLocal.setCurrentUser(sessionUser);
        logger.info("当前用户是：{}", JSON.toJSON(sessionUser));*/
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

    }

}
