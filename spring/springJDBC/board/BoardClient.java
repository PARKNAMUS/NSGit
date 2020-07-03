package park.spring.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import park.spring.board.dao.BoardDAO;
import park.spring.board.service.BoardService;
import park.spring.board.vo.BoardVO;

public class BoardClient {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("applicationContextThree.xml");
		BoardService service = context.getBean("boardService",BoardService.class);
		BoardVO vo = new BoardVO();
		vo.setTitle("æ»≥Á");
		vo.setContent("«œ¿Ã«œ¿Ã");
		vo.setWriter("º’»ÔπŒ");
		service.insertBoard(vo);
		
		List<BoardVO> array = service.getBoradList();
		for(int i=0;i<array.size();i++) {
			System.out.println("writer:"+array.get(i).getWriter()+" title:"+array.get(i).getTitle()+" content:"+array.get(i).getContent());
		}
	}
}
