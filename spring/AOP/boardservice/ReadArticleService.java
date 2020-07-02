package park.spring.board.service;

import park.spring.board.vo.ArticleNotFoundException;
import park.spring.board.vo.ArticleVO;

public interface ReadArticleService {
	ArticleVO getArticleAndIncreaseReadCount(int id)throws ArticleNotFoundException;
}
