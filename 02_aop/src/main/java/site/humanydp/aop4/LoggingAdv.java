package site.humanydp.aop4;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdv implements MethodInterceptor{

	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Object invoke(MethodInvocation arg0) throws Throwable {
//		System.out.println("advice 적용됨");
//		return arg0.proceed();
//	}

}
