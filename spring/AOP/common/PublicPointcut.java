package park.spring.common;

import org.aspectj.lang.annotation.Pointcut;

public class PublicPointcut {
	@Pointcut("execution(public * park.spring..*(..))")
	public void publicMethod() {
		
	}
}
