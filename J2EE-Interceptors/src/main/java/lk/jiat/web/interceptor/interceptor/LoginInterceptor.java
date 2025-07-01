package lk.jiat.web.interceptor.interceptor;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import lk.jiat.web.interceptor.anotation.Login;

@Interceptor
@Login
@Priority(1)
public class LoginInterceptor {

    @AroundInvoke
    public Object interceptor(InvocationContext ic)throws  Exception{

        System.out.println("Login Intercept - Intercepts start");

        Object proceed = ic.proceed();
        System.out.println("Login Intercept - Intercepts end");

        return proceed;

    }
}
