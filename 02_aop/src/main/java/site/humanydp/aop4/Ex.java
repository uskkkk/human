package site.humanydp.aop4;

import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.sun.javafx.binding.Logging;

public class Ex {
   public static void main(String[] args) {
      One one = new One();
      //
      System.out.println("=============== Advisor 프록시 결과 =================");
      ProxyFactory factory = new ProxyFactory();

      AspectJExpressionPointcut pc = new AspectJExpressionPointcut();
      pc.setExpression("execution(* first(..))");
      
//      AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
//      advisor.setAdvice(new LoggingAdv());
//      advisor.setExpression("execution(* first(..))");
      
      Advisor advisor = new DefaultPointcutAdvisor(pc, new LoggingAdv());
      
      factory.addAdvisor(advisor);
      factory.setTarget(one);
      One oneP1 = (One) factory.getProxy();

      oneP1.first();
      oneP1.second();
   }

}