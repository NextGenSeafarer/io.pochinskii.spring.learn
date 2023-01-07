package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {


    @Pointcut("execution(public void get*())")
    private void allGetMethods(){}

    //@Before("execution(public void aop.UniLibrary.getBook())") // <- point cut только для метода из UniLibrary
    @Before("allGetMethods()") // <- point cut из созданного выше reference
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice : попытка получить книгу");
    }

    @Before("execution(public void get*(String))") // <- point cut для методов, которые начинаются на get* и принимают тип параметра String
    public void beforeGetBookAdviceWithParameter(){
        System.out.println("beforeGetBookAdviceWithParameter : попытка получить книгу");
    }

    @Before("execution(public void get*(..))")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice : проверка прав");
    }



}
