package site.humanydp.aop2;

public final class HelloWorldImpl implements HelloWorld{

	public void sayHello(String msg) {
		System.out.println("안녕 세상::" + msg);
	}

}
