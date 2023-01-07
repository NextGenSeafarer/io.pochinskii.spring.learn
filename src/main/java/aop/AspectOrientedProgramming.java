package aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


public class AspectOrientedProgramming {

    /*
    Основания идея AOP - разделение бизнес и служебной логики,
    Разделяя логику методов от служебных методов, которые будут записаны в отдельные классы @Aspect
    Код становится более легко читаемым и изменяемым.
    Из минусов нужно выделить лишь замедление работы программы из-за наличия дополнительных методов
    К служебным методам могут относиться методы логирования, проверки прав доступа
    Т.е. между методом в классе, который мы вызываем и main методом есть proxy, работу и вызов которого берет на себя
    Spring AOP.
    Как отдельный framework - существует AspectJ.

    Advice типы для Aspect:
    - Before (до выполнения основной логики)
    - After returning - только после нормального завершения метода с основной логикой
    - After throwing - только после окончания основной логики, если было выброшено исключения
    - After / finally - всегда выполняется после метода с основной логикой
    - Around - выполняется и до и после метода с основной логикой

    Pointcut - выражение, описывающее где должен быть применен Advice
    Шаблон для pointcut
    execution( modifiers-pattern? || return-type-pattern || declaring-type-pattern? || method-name-pattern(parameters-pattern) ||
    throws-pattern? )
    Если мы хотим, чтобы Advice метод срабатывал для всех методов с любым именем и тд, то шаблон будет:
    execution(* *())




    */

}
