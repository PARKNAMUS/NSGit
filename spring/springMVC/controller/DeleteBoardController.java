package park.spring.web.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import park.spring.web.board.impl.BoardDAO;


public class DeleteBoardController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글삭제 처리");
		int seq = Integer.parseInt(request.getParameter("seq"));
		BoardVO vo = new BoardVO();
		vo.setSeq(seq);
		BoardDAO dao=  new BoardDAO();
		dao.deleteBoard(vo);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:getBoardList.do");
		return mav;
	}
	
}
