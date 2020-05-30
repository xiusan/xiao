package com.xjl.aop;



import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.Set;


/**
 * 登录验证拦截器
 *
 * @author Zouxf
 */
public class AuthInterceptor implements HandlerInterceptor {

    private static final Set<String> NO_AUTH_URI = new HashSet<String>();

    // 不需要登录状态的URI
    static {
        NO_AUTH_URI.add("/api/qtest/addblob");
        NO_AUTH_URI.add("/api/qtest/addtext");
        NO_AUTH_URI.add("/api/qtest/getimg");
        NO_AUTH_URI.add("/hotelOrder/updateOrderStatus");
        NO_AUTH_URI.add("/hotelOrder/timerUpdateOrderStatus");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        String uri = request.getRequestURI();
      /*  if (NO_AUTH_URI.contains(uri) || NO_AUTH_URI.contains(ApiConstants.BASE_URI + uri)) {
            return true;
        }
        HttpSession session = request.getSession();
        SessionUser sessionUser = (SessionUser) session.getAttribute(ApiConstants.SESSION_USER_KEY);
        if (sessionUser == null) {
            String token = request.getHeader("token");
            //// 无token代表未登录
            if (StringUtils.isEmpty(token)) {
                throw new ApiException(ApiResultCode.NO_AUTH);
            } else { // 有token代表登录失效
                throw new ApiException(ApiResultCode.LOGIN_EXPIRE);
            }
        }*/
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
