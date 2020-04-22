package aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: dengzhiwen
 * @Date: 2020/4/20 12:57
 */
@Aspect
@Component
public class JdbcAspect {

    @Pointcut("execution(* org.spring.mvc.service.*.*(..))")
    public void service(){}


    @Before("service()")
    public void beforeService(JoinPoint joinPoint){

        System.out.print(new Date()+":");
        System.out.println("执行的方法：" + joinPoint.getSignature());
    }


    @After("service()")
    public void afterService(){
        System.out.print(new Date()+":");
        System.out.println("方法执行完毕！");

    }

//    @Around("service()")
//    public void aroundService(ProceedingJoinPoint joinPoint){
//
//    }


}