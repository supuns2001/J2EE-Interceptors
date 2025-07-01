package lk.jiat.web.interceptor.interceptor;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.AroundTimeout;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import lk.jiat.web.interceptor.anotation.TimeoutLogger;

@TimeoutLogger
@Interceptor
@Priority(1)
public class TimerInterceptor {

    @AroundTimeout
    public Object aroundTimeout(InvocationContext ic) throws Exception{
        System.out.println("Timer interceptor . aroundTimeout");
        return ic.proceed();
    }

}
