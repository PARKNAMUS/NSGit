package park.spring.web.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import park.spring.web.board.impl.BoardDAO;


public class GetBoardController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글상세보기 처리");
		int seq = Integer.parseInt(request.getParameter("seq"));
		BoardVO vo = new BoardVO();
		vo.setSeq(seq);
		BoardDAO dao = new BoardDAO();
		BoardVO vo2 = dao.getBoard(vo);
		ModelAndView mav = new ModelAndView();
		mav.addObject("board",vo2);
		mav.setViewName("getBoard");
		return mav;
	}

}
