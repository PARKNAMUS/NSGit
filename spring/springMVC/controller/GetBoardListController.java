package park.spring.web.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import park.spring.web.board.impl.BoardDAO;


public class GetBoardListController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글목록보기 처리");
		//1. 사용자 입력 정보 추출
		//2. 데이터베이스 연동 처리
		BoardVO vo = new BoardVO();
		BoardDAO dao = new BoardDAO();
		List<BoardVO> list = dao.getBoardList(vo);
		//3. 화면 네비게이션
		ModelAndView mav= new ModelAndView();
		mav.addObject("boardList",list);
		mav.setViewName("getBoardList");
		return mav;
	}

}
