package park.spring.common;

import org.aspectj.lang.JoinPoint;

import park.spring.member.vo.UpdateInfo;

public class UpdateMemeberInfoTraceAdvice {
	public void traceReturn(JoinPoint joinPoint,boolean result,String id,UpdateInfo info) {
		System.out.println("[TA] 정보수정 결과="+result+", 대상회원="+id+", 수정정보="+info);
	}
}
