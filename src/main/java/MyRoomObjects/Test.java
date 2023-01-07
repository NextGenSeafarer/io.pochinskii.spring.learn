package MyRoomObjects;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myRoomObjectsXML/myApp.xml");
        Walls walls = context.getBean("wallsBean", Walls.class);
        List<AnyObjectInMyRoom> list = walls.getList();
        list.forEach(AnyObjectInMyRoom::doAction);


        context.close();

    }
}
