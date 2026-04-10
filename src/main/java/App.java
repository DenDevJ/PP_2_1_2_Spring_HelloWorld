import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("First HelloWorld message: " + helloWorld1.getMessage());
        HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("helloworld");
        boolean isHelloWorldSame = (helloWorld1 == helloWorld2);
        System.out.println("HelloWorld beans are the same: " + isHelloWorldSame);
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println("First Cat object: " + cat1);
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println("Second Cat object: " + cat2);
        boolean isCatSame = (cat1 == cat2);
        System.out.println("Cat beans are the same: " + isCatSame);
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}