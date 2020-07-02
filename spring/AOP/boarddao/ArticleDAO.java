package park.spring.board.dao;

import park.spring.board.vo.ArticleVO;

public interface ArticleDAO {
	void insert(ArticleVO article);
	void updateReadCount(int id);
	
}
