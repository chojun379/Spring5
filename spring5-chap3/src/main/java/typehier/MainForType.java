package typehier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainForType {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtxType.class);
		Printer p1 = ctx.getBean("prin"
				+ "ter", Printer.class);
		Printer p2 = ctx.getBean("printer", ConsolePrinter.class);
		System.out.println("p1 == p2 = " + (p1 == p2));
		ctx.close();
		
	}

}
