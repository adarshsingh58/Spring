Java based Configuration: What if we dot require XMLs for spring at all. What we directly move to Annotations instead of writing XMLs. That is done bybfew extra annotations for Java that make Spring XML-free. Lets understand them.
@Configuration & @Bean Annotations

package com.tutorialspoint;
import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {
   @Bean 
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}
The above code will be equivalent to the following XML configuration −

<beans>
   <bean id = "helloWorld" class = "com.tutorialspoint.HelloWorld" />
</beans>

So while using @configuration we say that this is not a normal java class but a java class that is equivalent to a spring XML file. i.e. we will be extracting Spring Beans out of it.

While using @Bean we say that this is not a normal Java method, this is a java method which will return you a Spring Bean Object. The name of method is = id of bean definition, return type is the Bean object we difine in XML to be returned or injected.

 So <beans> tag is = @configuration
and <bean> tag is =@Bean

Now we dont need an XML, so how to fetch the objects from these Spring CLasses?

public static void main(String[] args) {
   ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
   
   HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
   helloWorld.setMessage("Hello World!");
   helloWorld.getMessage();
}

For that purpose we dont use ClassPathXmlApplicationContext() to create the IOC container , we use AnnotationConfigApplicationContext() and passing name of the CLass annotted with @configuration. NOw we can get beans from the object by using getBean() by passing class name of the Bean we want (dont pass the id i.e. method name here). This will now go to HelloWorldConfig class and look for a method(bean id) which return HelloWorld object, when found it executes that method and get the required object in return.

Now this method is equivalent to <bean> tag where we can assign all the properties or list/set/properies/map..etc value to the bean object we wat to return. How to do that?

Injecting Bean Dependencies in Java Based Spring COnfi:
package com.tutorialspoint;
import org.springframework.context.annotation.*;

@Configuration
public class TextEditorConfig {
   @Bean 
   public TextEditor textEditor(){
      return new TextEditor( spellChecker() );
   }

   @Bean 
   public SpellChecker spellChecker(){
      return new SpellChecker( );
   }
}
Here, when textEditor object will be created or requiested object of SpellCHeker will automatically get injected in it. it is equi to:
<bean class="com.tutorialspoint.TextEditor" id="textEditor">
<prpoerty name="spellCHecker" ref="spellcheker">
</property>
</bean>

<bean id="spellcheker" class="com.tutorialspoint.SpellChecker " />


Hence we see that inside the method itself we can do all the Setting of data.

 @Scope: We can specify scope of bean by using this annotation:

@Configuration
public class AppConfig {
   @Bean
   @Scope("prototype")
   public Foo foo() {
      return new Foo();
   }
}


initMethod and destroyMethod: This can be done as:
	public class Foo {
   public void init() {
      // initialization logic
   }
   public void cleanup() {
      // destruction logic
   }
}
@Configuration
public class AppConfig {
   @Bean(initMethod = "init", destroyMethod = "cleanup" )
   public Foo foo() {
      return new Foo();
   }
}
