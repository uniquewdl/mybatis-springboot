package com.example.springbootmybatis.config;

import com.example.springbootmybatis.Hump;
import com.example.springbootmybatis.vo.TestVo;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.lang.reflect.Parameter;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 15:06 2019/6/4
 */
public class HumpMehthodArgResolve implements HandlerMethodArgumentResolver {
    private static final String TAG = "HumpMehthodArgResolve";

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.hasParameterAnnotation(Hump.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        TestVo  testVo=new TestVo();
        testVo.setFirstName("firstName");
        testVo.setSex("男");
        testVo.setUserPassword("123456");
        Parameter parameter = methodParameter.getParameter();
        System.out.println("==========================>"+parameter);
        return testVo;
    }
}