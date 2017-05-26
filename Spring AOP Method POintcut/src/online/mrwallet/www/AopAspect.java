package online.mrwallet.www;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopAspect {
	
	/**
	 * Before Advice which will get executed before execution of pointcut 'public String getMessage()' 
	 */
	@Before("pointcutForGetters()")
	public void logBeforeAdvice()
	{
		System.out.println("Get method called. Before Advice logAdvice from Aspect AopAspect executed");
	}
	
	@After("pointcutForGetters()")
	public void logAfterAdvice()
	{
		System.out.println("Get method called. After Advice logAdvice from Aspect AopAspect executed");
	}
	
	/**
	 * This will run this advice before call of fall the funtions/methods within the package/class defined
	 */
	@Before("within(online.mrwallet.www.Message)")
	public void logBeforeAdviceAllMethod(JoinPoint joinpoint)
	{
			System.out.println(joinpoint.toString()+" executed");
			Message message=(Message) joinpoint.getTarget();
			System.out.println("Inside advice logBeforeAdviceAllMethod and message is:"+message.getMessage());
	}
	
	@Pointcut("execution(public String getMessage())")
	private void pointcutForGetters(){};
}
