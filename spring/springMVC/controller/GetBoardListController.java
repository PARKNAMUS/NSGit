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
		System.out.println("�۸�Ϻ��� ó��");
		//1. ����� �Է� ���� ����
		//2. �����ͺ��̽� ���� ó��
		BoardVO vo = new BoardVO();
		BoardDAO dao = new BoardDAO();
		List<BoardVO> list = dao.getBoardList(vo);
		//3. ȭ�� �׺���̼�
		ModelAndView mav= new ModelAndView();
		mav.addObject("boardList",list);
		mav.setViewName("getBoardList");
		return mav;
	}

}
