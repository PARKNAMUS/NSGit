package park.spring.board.service;

import java.util.ArrayList;
import java.util.List;

import park.spring.board.vo.BoardVO;

public interface BoardService {
	public void insertBoard(BoardVO vo);
	public void updateBoard(BoardVO vo);
	public void deleteBoard(BoardVO vo);
	public BoardVO getBoard(BoardVO vo);
	public List<BoardVO> getBoradList();
}
