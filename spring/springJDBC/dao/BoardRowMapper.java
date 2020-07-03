package park.spring.board.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import park.spring.board.vo.BoardVO;

public class BoardRowMapper implements RowMapper<BoardVO>{

	@Override
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardVO vo = new BoardVO();
		vo.setSeq(rs.getInt("seq"));
		vo.setWriter(rs.getString("writer"));
		vo.setTitle(rs.getString("title"));
		vo.setContent(rs.getString("content"));
		vo.setRegdate(rs.getDate("regdate"));
		return vo;
	}

}
