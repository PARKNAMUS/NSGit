package park.spring.board.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import park.spring.board.vo.BoardVO;
@Repository("dao")
public class BoardDAO {
	@Autowired
	JdbcTemplate template;
	private final String INSERT = "insert into myboard(seq,title,writer,content) values((select max(seq) from myboard)+1,?,?,?)";
	private final String UPDATE = "update from myboard set title=?,content=? where seq =?";
	private final String DELETE = "delete from myboard where seq =?";
	private final String GET_BOARD = "select * from myboard where seq=?";
	private final String GET_BOARDLIST = "select * from myboard";
	
	public void insertBoard(BoardVO vo) {
		System.out.println("sprig insert 角青");
		 template.update(INSERT,vo.getTitle(),vo.getWriter(),vo.getContent());
	}
	public void updateBoard(BoardVO vo) {
		System.out.println("spring update 角青");
		template.update(UPDATE,vo.getTitle(),vo.getContent(),vo.getSeq());
	}
	public void deleteBoard(BoardVO vo) {
		System.out.println("spring delete 角青");
		template.update(DELETE,vo.getSeq());
	}
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("spring getboard 角青");
		Object[] args = {vo.getSeq()};
		return template.queryForObject(GET_BOARD, args,new BoardRowMapper());
	}
	public List<BoardVO> getBoardList(){
		System.out.println("spring getboarlist 角青");
		return template.query(GET_BOARDLIST, new BoardRowMapper());
	}
}
