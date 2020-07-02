package park.spring.member.service;

import park.spring.member.vo.MemberVO;
import park.spring.member.vo.UpdateInfo;

public class MemberServiceImpl implements MemberService{
	//원래대로 하면 여기에 dao를 주입
	@Override
	public void regist(MemberVO vo) {
		System.out.println("[service] - MemberServiceImpl.regist() 메서드가 실행됬음");
	}

	@Override
	public boolean update(String id, UpdateInfo info) {
		System.out.println("[Service] - MemberServiceImpl.update() 메서드 실행");
		return true;
	}

}
