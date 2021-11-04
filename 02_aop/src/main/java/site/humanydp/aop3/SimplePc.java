package site.humanydp.aop3;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class SimplePc extends StaticMethodMatcherPointcut{

	public boolean matches(Method arg0, Class<?> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public boolean matches(Method arg0, Class<?> arg1) {
//		
//		return arg0.getName().equals("first") && arg1 == One.class;
//	}

}
