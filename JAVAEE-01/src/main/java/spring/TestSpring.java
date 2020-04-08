package spring;
import bean.TestBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class TestSpring {
    public static void main(String[] args ){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestBean.class);
    }
}
