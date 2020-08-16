package com.dentnav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dentnav.service.MailService;
import com.dentnav.service.pojo.Mail;

@SpringBootApplication
public class DentnavApplication {

	public static void main(String[] args) {
//		Mail mail = new Mail();
//		mail.setMailFrom("aravindh841995@gmail.com");
//		mail.setMailTo("pradeepn29051994@gmail.com");
//		mail.setMailSubject("Dentnav Guideness");
//		mail.setMailContent("I welcome to Dentnav");

		ApplicationContext ctx = SpringApplication.run(DentnavApplication.class, args);
		//MailService mailService = (MailService) ctx.getBean("mailService");
		//mailService.sendEmail(mail);
	}

}
