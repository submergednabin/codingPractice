package com.nabin;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.nabin.service.CustomerServiceImpl;
import com.nabin.util.SpringConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CustomerServiceImpl service = null;
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        service = (CustomerServiceImpl) context.getBean("customerService");
        System.out.println(service.fetchCustomer());
        service.delete(12);
        context.close();
    }
}