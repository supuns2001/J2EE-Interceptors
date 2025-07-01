package lk.jiat.web.interceptor.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;

import java.util.Map;

public class AInterceptor {

    @AroundInvoke
    public Object interceptor(InvocationContext ic)throws  Exception{
        System.out.println("A Intercept - Intercepts start");

//        Map<String, Object> contextData = ic.getContextData();
//        System.out.println(contextData);


        Object proceed = ic.proceed();
        System.out.println("A Interceptor :"+proceed);

        System.out.println("A Intercept - Intercepts end");

        return proceed;

    }
}
