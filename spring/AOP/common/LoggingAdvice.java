package park.spring.common;

public class LoggingAdvice {
	public void before() {
		System.out.println("[LA] 메서드 실행 전 처리");
	}
	public void afterReturning(Object ret) {
		System.out.println("[LA] 메서드 실행 후 처리, 리턴값 =" + ret);
	}
	public void afterThrowing(Throwable ex) {
		System.out.println("[LA] 메서드 실행 중 예외발생 처리, 예외="+ex);
	}
	public void afterFinally() {
		System.out.println("[LA] 메서드 실행 완료 후 무조건 처리");
	}
}
