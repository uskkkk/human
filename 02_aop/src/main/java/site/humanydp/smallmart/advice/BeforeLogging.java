package site.humanydp.smallmart.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLogging implements MethodBeforeAdvice{

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void before(Method method, Object[] args, Object target) throws Throwable {
//		String name = args[0].toString();
//		System.out.println(method.getName() + " ::" + args[1] + ":: 사전");
//	}
//	
}
