If you have many setter methods, then it is convenient to use p-namespace in the XML configuration file. Instead of writing:
   <property name = "name" value = "John Doe"/>
We can write:
   p:name = "John Doe"
inside the bean tag itself as an attribute.
We need to import property as in main beans :
	xmlns:p = "http://www.springframework.org/schema/p"
	
	Total <beans> tag becomes:

	<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:p = "http://www.springframework.org/schema/p"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

	Normal:
<bean id = "john-classic" class = "com.example.Person">
      <property name = "name" value = "John Doe"/>
      <property name = "spouse" ref = "jane"/>
   </bean>
Spring:
 <bean id = "john-classic" class = "com.example.Person"
      p:name = "John Doe"
      p:spouse-ref = "jane"/>
   </bean>
