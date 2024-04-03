package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.model.News;

public class NewsApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Assuming you have a bean named 'news' in your applicationContext.xml
        News news = context.getBean("news", News.class);

        // Output the News object (toString() method will be called)
        System.out.println(news);
    }
}
