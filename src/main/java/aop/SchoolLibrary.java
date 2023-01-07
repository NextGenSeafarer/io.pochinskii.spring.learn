package aop;


import org.springframework.stereotype.Component;

@Component("SLBean")
public class SchoolLibrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из SchoolLibrary");
    }

    @Override
    public void getBookWithParameter(String bookName) {

    }
}
