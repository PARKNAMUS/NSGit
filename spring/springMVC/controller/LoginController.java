package park.spring.web.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import park.spring.web.user.impl.UserDAO;

public class LoginController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		//2.�����ͺ��̽� ���� ó��
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(pw);
		
		UserDAO dao = new UserDAO();
		UserVO vo2 = dao.getUser(vo);
		//3.ȭ�� �׺���̼�
		ModelAndView mav = new ModelAndView();
		if(vo2 !=null){
			HttpSession session= request.getSession();
			session.setAttribute("id", vo2.getId());
			mav.setViewName("redirect:getBoardList.do");
		}else{
			mav.setViewName("redirect:login.jsp");
			
		}
		return mav;

	}

}
