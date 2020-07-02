package park.spring.board.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import park.spring.board.service.WriteArticleService;
import park.spring.board.vo.ArticleVO;
import park.spring.member.service.MemberService;
import park.spring.member.vo.MemberVO;

public class MainOne {
	
	public static void main(String[] args) {
		String [] configLocations = new String[]{"applicationContextOne.xml"};
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
		WriteArticleService articleService = (WriteArticleService)context.getBean("writeArticleService");
		articleService.write(new ArticleVO());
		
		MemberService memberService = context.getBean("memberService",MemberService.class);
		memberService.regist(new MemberVO());
		context.close();
	}
}
