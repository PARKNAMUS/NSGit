package park.spring.guestbook.controller;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import park.spring.guestbook.dao.JdbcTemplateGuestMessageDao;
import park.spring.guestbook.vo.GuestMessage;

public class JdbcTemplateMain {
	private GuestMessage makeGuestMessage(String guestName, String message) {
		GuestMessage msg = new GuestMessage();
		msg.setGuestName(guestName);
		msg.setMessage(message);
		msg.setRegistryDate(new Date());
		return msg;
	}
	public static void main(String[] args) {
		String [] configs = new String[] {"applicationContext.xml"};
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configs);
		JdbcTemplateGuestMessageDao dao = context.getBean("jdbcTemplateGuestMessageDao",JdbcTemplateGuestMessageDao.class);
		JdbcTemplateMain main = new JdbcTemplateMain();
		dao.insert(main.makeGuestMessage("lee", "hihi"));
		dao.insert(main.makeGuestMessage("park", "hihi"));
		dao.insert(main.makeGuestMessage("son", "hihi"));
		int count = dao.count();
		List<GuestMessage> list = dao.select(1, count);
		for(GuestMessage msg : list) {
			System.out.println(msg.getId()+" : "+msg.getGuestName()+" : "+msg.getMessage()+" : "+msg.getRegistryDate());
		}
	}
}
