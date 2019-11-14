package cn.xdl.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.xdl.bean.XdlBankAccount;
import cn.xdl.serivce.XdlBankAccountService;

@Controller
public class XdkbankaAccountController {
	@Autowired
	private XdlBankAccountService bankService;
	@RequestMapping("/toLogin.do")
	public String toLogin() { 
		return "login";
	}
	@RequestMapping("/toMain.do")
	public String toMain() {
		return "main";
	}
	@RequestMapping("/login.do")
	public String login(String name,String password,HttpServletRequest request) {
		XdlBankAccount account=bankService.login(name, password);
		if(account != null) {
			request.getSession().setAttribute("account", account);
			return "redirect:toMain.do";
			//return "login";
		}
		request.setAttribute("msg", "��¼ʧ��");
		return "login";
		//return "redirect:toMain.do";
	}
}
 












