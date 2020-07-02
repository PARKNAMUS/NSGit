package park.spring.board.service;

import park.spring.board.vo.ArticleNotFoundException;
import park.spring.board.vo.ArticleVO;

public class ReadArticleServiceImpl implements ReadArticleService {

	@Override
	public ArticleVO getArticleAndIncreaseReadCount(int id) throws ArticleNotFoundException {
		if(id ==0) {
			throw new ArticleNotFoundException();
		}
		return new ArticleVO();
	}

}
