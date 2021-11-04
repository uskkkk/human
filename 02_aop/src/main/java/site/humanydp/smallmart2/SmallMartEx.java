package site.humanydp.smallmart2;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import site.humanydp.smallmart.advice.AfterLogging;
import site.humanydp.smallmart.advice.AroundLogging;
import site.humanydp.smallmart.advice.BeforeLogging;
import site.humanydp.smallmart.advice.ThrowsLogging;

public class SmallMartEx {
	public static void main(String[] args) {
		SmallMart mart = new SmallMartImpl();
		
		ProxyFactory factory = new ProxyFactory();
		factory.addAdvisor(new DefaultPointcutAdvisor(new StaticMethodMatcherPointcut() {

			public boolean matches(Method arg0, Class<?> arg1) {
				// TODO Auto-generated method stub
				return false;
			}
			
//			@Override
//			public boolean matches(Method arg0, Class<?> atg1) {
//				// TODO Auto-generated method stub
//				return arg0.getName().endsWith("2");
//			}
		} , new MethodBeforeAdvice() {

			public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
				// TODO Auto-generated method stub
				
			}
			
//			@Override
//			public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
//				// TODO Auto-generated method stub
//				System.out.println("핫하");
//			}
		}));
		
		factory.setTarget(mart);
		
		SmallMart proxy = (SmallMart)factory.getProxy();
		
		
		try {
			mart.getProduct("커피");
			proxy.getProduct("커피");
			
			proxy.getProduct2("커피");
//			mart.getProduct(null);
			proxy.getProduct(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
