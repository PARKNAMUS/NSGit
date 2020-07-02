package park.spring.board.dao;

import park.spring.board.vo.ArticleVO;

public class OracleArticleDAO implements ArticleDAO{

	@Override
	public void insert(ArticleVO article) {
		System.out.println("[DAO] - MyOracleArticleDAO.insert()메서드 실행");
	}
	@Override
	public void updateReadCount(int id) {
		System.out.println("[DAO] - MyOracleArticleDAO.updateReadCount()메서드 실행");
	}

}
