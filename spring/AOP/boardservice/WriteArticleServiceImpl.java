package park.spring.board.service;

import park.spring.board.dao.ArticleDAO;
import park.spring.board.vo.ArticleVO;

public class WriteArticleServiceImpl implements WriteArticleService{
	
	private ArticleDAO articleDao;
	
	public WriteArticleServiceImpl() {
		super();
	}

	public WriteArticleServiceImpl(ArticleDAO articleDao) {
		super();
		this.articleDao = articleDao;
	}

	@Override
	public void write(ArticleVO article) {
		System.out.println("[Service] - WriteArticleServiceImpl.write()메서드 실행");
		articleDao.insert(article);
	}

}
