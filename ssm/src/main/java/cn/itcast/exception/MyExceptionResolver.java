package cn.itcast.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author kpwang
 * @create 2020-07-24 14:49
 */
public class MyExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        //获取异常对象
        MyException ex=null;
        if (e instanceof MyException){
            ex=(MyException) e;
        }else {
            ex=new MyException("系统正在维护.....");
        }
        //
        ModelAndView mav=new ModelAndView();
        mav.addObject("errorMsg",ex.getMessage());
        mav.setViewName("error");
        return mav;
    }
}
