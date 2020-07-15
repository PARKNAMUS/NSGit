package park.spring.web.board;

import java.util.List;

import park.spring.web.board.impl.BoardDAO;

public class BoardServiceClient {
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		BoardVO vo = new BoardVO();
		vo.setTitle("mybatis Test");
		vo.setWriter("삼장");
		vo.setContent("mybatis 내용");
		
		dao.insertBoard(vo);
		vo.setSearchCondition("title");
		vo.setSearchKeyword("");
		
		List<BoardVO> boardList  = dao.getBoardList(vo);
		for(BoardVO board: boardList) {
			System.out.println("-->"+board.toString());
		}
	}
}
