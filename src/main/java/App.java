import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld helloWorld =(HelloWorld) applicationContext.getBean("helloworld");
        Cat firstCat = (Cat)  applicationContext.getBean("Cat");
        Cat secondCat= (Cat)    applicationContext.getBean("Cat");
        System.out.println(helloWorld== bean);
        System.out.println(firstCat==secondCat);
    }
}