package lk.jiat.web.interceptor.ejb;

import jakarta.ejb.Stateless;
import jakarta.interceptor.Interceptors;
import lk.jiat.web.interceptor.interceptor.AInterceptor;
import lk.jiat.web.interceptor.interceptor.TestInterceptor;

@Stateless
@Interceptors({TestInterceptor.class, AInterceptor.class})
public class UserSessionBean {



    public String doAction(String name , int age){
        System.out.println("User SessionBean DoAction start");
        System.out.println("User SessionBean DoAction..." + name+" "+age);
        System.out.println("User SessionBean DoAction End" );


        return "success";
    }


}
