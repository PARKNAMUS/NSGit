package park.spring.member.service;

import park.spring.member.vo.MemberVO;
import park.spring.member.vo.UpdateInfo;

public interface MemberService {
	void regist(MemberVO vo);
	boolean update(String id,UpdateInfo info);
}
