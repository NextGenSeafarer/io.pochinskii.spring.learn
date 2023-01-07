package aop;

import org.springframework.stereotype.Component;

@Component("ULBean")
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook(){
        System.out.println("Мы берем книгу из UniLibrary");
    }

    @Override
    public void getBookWithParameter(String bookName) {
        System.out.println("Мы берем книгу из UniLibrary с именем: " + bookName);
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал из UniLibrary");
    }

}
