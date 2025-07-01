package lk.jiat.web.interceptor.interceptor;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.interceptor.AroundConstruct;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

public class TestInterceptor {


    @AroundConstruct
    public void aroundConstructor(InvocationContext ic){
        System.out.println("aroundConstructor ;"+ ic.getConstructor());
    }


    @PostConstruct
    public void init(InvocationContext ic){
        Constructor<?> constructor = ic.getConstructor();
        System.out.println(constructor);
        System.out.println("test Init....");
    }

    @AroundInvoke
    public Object interceptor(InvocationContext ic)throws  Exception{
        System.out.println("Test Intercept - Intercepts start");



        Constructor<?> constructor = ic.getConstructor();
        System.out.println(constructor);

        Object proceed = ic.proceed();
        System.out.println("Test Interceptor :"+proceed);

        if (true) {
            throw new Exception("Test Intercept - Intercepts fail");
        }
        System.out.println("Test Intercept - Intercepts end");

        return proceed;

    }

    @PreDestroy
    public void destroy(InvocationContext ic){
        System.out.println("test destroy....");
    }
}
