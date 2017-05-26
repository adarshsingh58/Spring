https://www.youtube.com/watch?v=QdyLsX0nG30

AOP: Make sure to have these 4 jars for AOP to work:
aopalliance-
aspectj-1.6.9
aspectjrt
aspectj-weaver
	
Aspect Oriented Programming (AOP): In a proper OOP language tehre should be little to no dependency,i.e.e it should be loosly cioupled. Spring Core does that part for quite a stretch but there are some dependcies which are necessary evils. We can tackle them with AOP.

public void withdraw(int amount,int balance)
{
logMessage();
initiateTransaction()
balance=balance-amount;
setBalance();
closeTransaction();
logMessage();
}


In the above example we see that the purpose of the method of doing a withdraw from balance is diluted by adding logs and transactions. They  ,though important and relevant for the withdraw functionality, are doing something which the function is not directly intended to. FUnctions jon is to withdraw and not to log message or start a transaction. So here we have a dependency on these funcyionality (logging and transaction opeing and closeing). Now there functionalities are commonly used across a major portion of code, which measn it is generally duplicated as a code in all those portions/methods/code by calling same thing again and again. It will be a huge addon if they automatically get called on certain instances withoit having them to add in the method itself. These additional functionalities which should not be in actual methods are called cross-cutting concerns.

That is what AOP does. before going onto code lets see some termonologies:

⦁	Aspect:This is a class/module which has a set of methods/APIs, called Advices, providing cross-cutting requirements (like logging). For example, a logging module would be called AOP aspect for logging. An application can have any number of aspects depending on the requirement.
⦁	Join point:A joinpoint has the info at what method/target is getting called and some other info. It can be used as a param in the Advice method. Joinpoint means all the place in your code where advice can be applied, for SPring AOP its always method. i.e. joinpints are the methods on which advice is applioed (i.e. targets).So joinpoints basically represents targets itself but targetis a termnology but joinpoint is an actual class that can be used inside our advices. (for Aspect AOP joinpints can also be var names).Few imp joinpoints functions are, jointpont.toString(), jointpont.getTarget()
⦁	Advice:This is the method we declare by ourself which will run when we define it to.All advices are binded by a target(some method in main code) which s taken as a point using whom we can apply conditions for the advices to run. This is the actual action to be taken either before or after the method/target execution. This is an actual piece of code that is invoked during the program execution by Spring AOP framework. Cross cutting concerns are nothing but the functionality in advices.
⦁	Pointcut:This is a set of one or more joinpoints/targets where an advice should be executed. You can specify pointcuts using expressions or patterns or methods name directly or package names etc as we will see in our AOP examples.
⦁	Introduction:An introduction allows you to add new methods or attributes to the existing classes.
⦁	Target object:The object being advised by one or more aspects. This object will always be a proxied object, also referred to as the advised object. This is actually the method on which(before or after) we run our advice method.
⦁	Weaving:Weaving is the process of linking aspects with other application types or objects to create an advised object. This can be done at compile time, load time, or at runtime.

There are following advice types;
⦁	before:Run advice before the a method execution.
⦁	after:Run advice after the method execution, regardless of its outcome.
⦁	after-returning:Run advice after the a method execution only if method completes successfully.
⦁	after-throwing:Run advice after the a method execution only if method exits by throwing an exception.
⦁	around:Run advice before and after the advised method is invoked.

So basically with the help of AOP you can execute a common set of code or API(Advices) before,after or around (types of advices) your Project methods(Targets/JoinPoints) without having to call them inside your Project methods.


Now we have seen the terminologies and types of advies and stuff, lets get into coding.

As Aspect AOP is Annotation Oriented, we need to define it in XML that we are gonna use AOP. For that do the following:
⦁	Add following namespace:
xmlns:aop = "http://www.springframework.org/schema/aop" 
⦁	Add follwoing in XMlSchemaLocation:
http://www.springframework.org/schema/aop    http://www.springframework.org/schema/aop/spring-aop-3.0.xsd
⦁	Add AOP tag:
<aop:aspectj-autoproxy/>

Our XMl Setting is done. Lets get into Java Coding.
⦁	So just like what we did with @COnfiguration for XMl in Java , we create a class/module which is given special privelage which makes it an Aspect. For this we difine the class with @Aspect annotation saying this is an ASpect class.
⦁	Then we craete methods inside it which will be Advices to execute on certain targets. We annote these methods according to which type of advice we want to run. Lets say we tag them with @Before

Now @Before is teh advice type but we now need to tell it the target it needs to run before. for that we pass in pointcut to it as parameter. Pointcut is a set of jionponts or targets. Soo we will tell our advice to run before certain set od targets like:
	@Before("execution(public void getMessage())")
	public void adviceForMEssage(){
		System.outprintln("Aspect Executed");
		}
This will make Aspect to execute adviceForMessage() before any method as public void getMessage(). 

Now here we passed a joinpoint ,technically. As this is just one target. To pass a pintcut i.e. a set of joinpoints or target w will say:
	@Before("execution(* get*(*))")
Now this wil execute the advice on any method which starts with get and has any parameter and has any return type. (* )stands for one or more. SO in this case one parameter is mandatiory for the advice to run. If we want that advice to run if parameters are 0 or more use (..) instead of (*). {* and .. are called wildcards}.
Now this was inline pointcut. WE should create a seperate pointcut and call it in our @Before tag. It will go like this:

@Pointcut("execution(public String getMessage())")
	private void pointcutForGetters(){};

	@Before("pointcutForGetters()")
	public void logBeforeAdvice()
	{
		System.out.println("Get method called. Before Advice logAdvice 	from Aspect AopAspect executed");
	}


⦁	If you want to execute an advice for all the methods/targets in a certain package/class use follwoing sybtax:
	@Before("within(FULLY CLASSIFIED CLASS NAME OR PACKAGE NAME)")

⦁	Now thsese advices are empty parametr methods. We can pass in Joinpoint in it to extract the name of the target mthod which is in context of execution. It can be done as:
	
	Before("pointcutForGetters()")
	public void logBeforeAdvice(JoinPoint joinpoint)
	{
		System.out.println(joinpoint.toString()+" executed");
	
	}
	This will give name of the method on which advice is currently 	getting executed on.

	If we want to take out the current object of the target method's class we can use joinpoint.getTarget(); That will give us current class's object.
	