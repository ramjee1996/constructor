package com.constctorexample;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("index.xml");
        
        Jio obj = (Jio) context.getBean("jio");  
      
         obj.stateName();
         obj.topUpAmount();
         System.out.println(obj.data);
         System.out.println(obj.name);
         System.out.println(obj.fullName);
         System.out.println(obj.rollNo);
         
        
         
         System.out.println(obj.sub);
     
         System.out.println(obj.properties);
         //Jio jio =new Jio();
         //jio.subscription.getAmazonPrime();
         System.out.println("***********************");
         
         Subscription subs = context.getBean("subscription",Subscription.class);  
         System.out.println(subs.name);
         
         context.registerShutdownHook();
         
        // System.out.println(jio.data);
       // System.out.println(jio.name);
        // obj.Subscription();
      }
  
    }

