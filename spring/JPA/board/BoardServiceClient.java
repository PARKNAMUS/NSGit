package park.spring.board;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BoardServiceClient {
	public static void main(String[] args) {
		//EntitiManager
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPAProject");
		EntityManager manager = factory.createEntityManager();
		
		//transaction 생성
		EntityTransaction tx = manager.getTransaction();
		try {
			tx.begin();//트랜잭션 시작
			Board board = new Board();
			board.setTitle("JPA 테스트");
			board.setWriter("손오공");
			board.setContent("JPA 글 등록 테스트");
			
			manager.persist(board);//글등록
			
			//글목록 조회
			String jpasql = "select m from Board m order by m.seq desc";
			List<Board> boardList = manager.createQuery(jpasql,Board.class).getResultList();
			for(Board myboard : boardList) {
				System.out.println("--->" +myboard.toString());
			}
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			manager.clear();
		}
		factory.close();
	}
}
