package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(myConfig.class);
        UniLibrary uniLibrary = context.getBean("ULBean", UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("SLBean", SchoolLibrary.class);

        uniLibrary.getBook();
        schoolLibrary.getBook();
        uniLibrary.getMagazine();
        System.out.println("-------------------------------------------------------");
        uniLibrary.getBookWithParameter("Преступление и Наказание");





        context.close();
    }
}
