package MyRoomObjects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("wallsBean")
@Scope("prototype")
public class Walls {

    private List<AnyObjectInMyRoom> list = new ArrayList<>();

    public List<AnyObjectInMyRoom> getList() {
        List<AnyObjectInMyRoom> copy = new ArrayList<>(list);
        return copy;
    }

    @Autowired
    public Walls(UMSPanel umsPanel, TV tv, Lockers lockers, Watch watch, Fridge fridge) {
        System.out.println("::Constructor Walls:: type -> prototype");
        this.umsPanel = umsPanel;
        this.tv = tv;
        this.lockers = lockers;
        this.watch = watch;
        this.fridge = fridge;
        list.add(umsPanel);
        list.add(tv);
        list.add(lockers);
        list.add(watch);
        list.add(fridge);
    }

    private UMSPanel umsPanel;
    private TV tv;
    private Lockers lockers;
    private Watch watch;
    private Fridge fridge;

}


abstract class AnyObjectInMyRoom {
    String name;
    abstract void doAction();

}

@Component("UMSPanel")
class UMSPanel extends AnyObjectInMyRoom {

    UMSPanel() {
        System.out.println("UMS panel bean is created!");
    }
    @Value("${ums.panel}")
    String name;

    @Override
    public void doAction() {
        System.out.println(name + " makes noise");
    }
}

@Component("TV")
class TV extends AnyObjectInMyRoom {
    @Value("${tv.on.wall}")
    String name;

    TV() {
        System.out.println("TV bean is created!");
    }


    @Override
    public void doAction() {
        System.out.println(name + " showing films");
    }
}

@Component("Lockers")
class Lockers extends AnyObjectInMyRoom {

    @Value("${wood.lockers}")
    String name;

    Lockers() {
        System.out.println("Lockers bean is created!");
    }

    @Override
    public void doAction() {
        System.out.println(name + " keep my clothes");
    }
}

@Component("Watch")
class Watch extends AnyObjectInMyRoom {
    @Value("${watches.on.wall}")
    String name;

    Watch() {
        System.out.println("Watch bean is created!");
    }

    @Override
    public void doAction() {
        System.out.println(name + " showing time");
    }
}

@Component("Fridge")
class Fridge extends AnyObjectInMyRoom {
    @Value("${fridge}")
    String name;

    Fridge() {
        System.out.println("Fridge bean is created!");
    }

    @Override
    public void doAction() {
        System.out.println(name + " keeps veges and fruits fresh");
    }
}