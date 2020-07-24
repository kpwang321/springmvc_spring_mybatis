package cn.itcast.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author kpwang
 * @create 2020-07-24 1:21
 */
public class MyInterceptor2 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String id = request.getParameter("id");
        if ("1".equals(id)){
            System.out.println("进入拦截器2.。。。。。。。");
            return true;
        }else {
            request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);
        }
        System.out.println("会来这里吗？。。。。。。");

        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("进入拦截器2中的postHandle方法。。。。。。");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("进入拦截器2中的afterCompletion方法。。。。。。");
    }
}
