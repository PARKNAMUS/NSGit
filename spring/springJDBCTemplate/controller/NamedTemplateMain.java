package park.spring.guestbook.controller;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import park.spring.guestbook.dao.GuestMessageDao;
import park.spring.guestbook.dao.JdbcTemplateGuestMessageDao;
import park.spring.guestbook.dao.NameParamGuestMessageDao;
import park.spring.guestbook.vo.GuestMessage;

public class NamedTemplateMain {
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
		GuestMessageDao dao = context.getBean("nameParamGuestMessageDao",NameParamGuestMessageDao.class);
		NamedTemplateMain main = new NamedTemplateMain();
		dao.insert(main.makeGuestMessage("hong", "hihi"));
		dao.insert(main.makeGuestMessage("jang", "hihi"));
		dao.insert(main.makeGuestMessage("hwang", "hihi"));
		int count = dao.count();
		List<GuestMessage> list = dao.select(1, count);
		for(GuestMessage msg : list) {
			System.out.println(msg.getId()+" : "+msg.getGuestName()+" : "+msg.getMessage()+" : "+msg.getRegistryDate());
		}
	}
}
