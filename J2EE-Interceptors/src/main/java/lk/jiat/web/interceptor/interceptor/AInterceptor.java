package lk.jiat.web.interceptor.interceptor;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import lk.jiat.web.interceptor.anotation.Login;

import java.util.Map;

@Interceptor
@Login
@Priority(2)
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
