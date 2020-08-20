package com.dentnav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dentnav.service.MailService;
import com.dentnav.service.pojo.LoginSingUpInfo;
import com.dentnav.service.pojo.Mail;
import com.dentnav.service.pojo.ProtectedInfo;

@RestController
@CrossOrigin
@RequestMapping("dentnav")
public class DentnavMailServiceController {

	@Autowired
	MailService mailService;
	
    @Autowired
    private Environment env;

	@PostMapping("/sendmail")
	public String sendMail(@RequestBody Mail mail) {
		
		System.out.println("mail "+mail);

		try {
			if (mail != null) {
				mail.setMailFrom(env.getProperty("spring.mail.username"));
				mail.setMailTo(env.getProperty("spring.mail.username"));
				mail.setMailHeader(env.getProperty("spring.mail.header"));
				mailService.sendEmail(mail);
			} else {
				System.out.println("please provide mail details");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("unable to send mail, please try againg");
		}

		return "Mail sent successfully";
	}
	
	@GetMapping("/check")
	public String sendMail() {
		return "welcom to www.dentnav.com service";
	}
	
	@GetMapping("/protectedStatusFlag")
	public ProtectedInfo fetchProctectedStatus() {
		return new ProtectedInfo();
	}
	
	@GetMapping("/loginSingUpFlag")
	public LoginSingUpInfo fetchLoginSingUpStatus() {
		return new LoginSingUpInfo();
	}
	
	

}
