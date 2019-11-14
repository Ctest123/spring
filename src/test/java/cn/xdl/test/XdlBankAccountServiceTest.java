package cn.xdl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.xdl.serivce.XdlBankAccountService;

public class XdlBankAccountServiceTest {
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		XdlBankAccountService bankService=app.getBean("bankService", XdlBankAccountService.class);
		System.out.println(bankService.login("abc", "123"));
	}
}
