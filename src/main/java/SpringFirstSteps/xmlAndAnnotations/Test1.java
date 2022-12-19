package SpringFirstSteps.xmlAndAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xmlAndAnnotations/applicationContext3.xml");
        Employee employee = context.getBean("emp1", Employee.class);




    }
}
