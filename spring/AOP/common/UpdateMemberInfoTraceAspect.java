package park.spring.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import park.spring.member.vo.UpdateInfo;

@Aspect
@Order(3)
public class UpdateMemberInfoTraceAspect {
	@AfterReturning(pointcut = "args(id,info)",returning="result",argNames = "result,id,info")//argNames엔 joinpoint x;
	public void traceReturn(JoinPoint joinPoint,boolean result,String id,UpdateInfo info) {
		System.out.println("[TA] 정보수정 결과="+result+", 대상회원="+id+", 수정정보="+info);
	}
}
