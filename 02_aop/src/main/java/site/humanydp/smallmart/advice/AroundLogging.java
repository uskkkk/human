package site.humanydp.smallmart.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class AroundLogging implements MethodInterceptor{

	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Object invoke(MethodInvocation arg0) throws Throwable {
//		System.out.println(arg0.getMethod().getName() + "::" + arg0.getArguments()[0] + ":: around 사전");
//		Object obj = arg0.proceed();
//		System.out.println(arg0.getMethod().getName() + "::" + arg0.getArguments()[0] + ":: around 사전");
//		return obj;
//	}


}
