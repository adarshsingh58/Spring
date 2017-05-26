package online.mrwallet.www;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AopAspect {
	
	/**
	 * Before Advice which will get executed before execution of pointcut 'public String getMessage()' 
	 */
	@Before("execution(public String getMessage())")
	public void logBeforeAdvice()
	{
		System.out.println("Get method called. Before Advice logAdvice from Aspect AopAspect executed");
	}
	
	@After("execution(public String getMessage())")
	public void logAfterAdvice()
	{
		System.out.println("Get method called. After Advice logAdvice from Aspect AopAspect executed");
	}
}
