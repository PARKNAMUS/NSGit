package park.spring.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class LogginAspect {
	@Before("PublicPointcut.publicMethod()")
	public void before() {
		System.out.println("[LA] 메서드 실행 전 처리");
	}
	@AfterReturning(pointcut = "park.spring.common.PublicPointcut.publicMethod()",returning = "ret")
	public void afterReturning(Object ret) {
		System.out.println("[LA] 메서드 실행 후 처리, 리턴값 =" + ret);
	}
	@AfterThrowing(pointcut = "park.spring.common.PublicPointcut.publicMethod()",throwing = "ex")
	public void afterThrowing(Throwable ex) {
		System.out.println("[LA] 메서드 실행 중 예외발생 처리, 예외="+ex.getClass().getName());
	}
	@After("PublicPointcut.publicMethod()")
	public void afterFinally() {
		System.out.println("[LA] 메서드 실행 완료 후 무조건 처리");
	}
}
