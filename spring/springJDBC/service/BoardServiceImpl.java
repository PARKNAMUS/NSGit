package park.spring.board.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import park.spring.board.dao.BoardDAO;
import park.spring.board.vo.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO dao;
	
	@Override
	public void insertBoard(BoardVO vo) {
		dao.insertBoard(vo);

	}

	@Override
	public void updateBoard(BoardVO vo) {
		dao.updateBoard(vo);

	}

	@Override
	public void deleteBoard(BoardVO vo) {
		dao.deleteBoard(vo);

	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		
		return dao.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoradList() {
		
		return dao.getBoardList();
	}

}
