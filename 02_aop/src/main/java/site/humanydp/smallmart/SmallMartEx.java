package site.humanydp.smallmart;

import org.springframework.aop.framework.ProxyFactory;

import site.humanydp.smallmart.advice.AfterLogging;
import site.humanydp.smallmart.advice.AroundLogging;
import site.humanydp.smallmart.advice.BeforeLogging;
import site.humanydp.smallmart.advice.ThrowsLogging;

public class SmallMartEx {
	public static void main(String[] args) {
		SmallMart mart = new SmallMartImpl();
		
		ProxyFactory factory = new ProxyFactory();
		factory.addAdvice(new AroundLogging());
		factory.addAdvice(new BeforeLogging());
		factory.addAdvice(new BeforeLogging());
		factory.addAdvice(new AfterLogging());
		factory.addAdvice(new ThrowsLogging());
		
		factory.setTarget(mart);
		
		SmallMart proxy = (SmallMart)factory.getProxy();
		
		
		try {
//			mart.getProduct("커피");
			proxy.getProduct("커피");
//			mart.getProduct(null);
			proxy.getProduct(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
