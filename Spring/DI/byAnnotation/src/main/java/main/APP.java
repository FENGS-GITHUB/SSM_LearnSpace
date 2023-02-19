package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {
    public static void main(String[] args) {
        ApplicationContext testContext=new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("容器内对象数量");
        System.out.println(testContext.getBeanDefinitionCount());
        System.out.println(testContext.getBean("Info1"));
        String[] namelist=testContext.getBeanDefinitionNames();
        //容器对象方法:查看容器对象的名字
        for (String s:
                namelist) {
            System.out.println("    "+s);
        }

    }
}
