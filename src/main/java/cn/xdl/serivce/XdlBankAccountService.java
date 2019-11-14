package cn.xdl.serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.bean.XdlBankAccount;
import cn.xdl.mapper.XdlBankAccountDao;

@Service("bankService")
public class XdlBankAccountService {
	@Autowired
	private XdlBankAccountDao accountDao;
	public XdlBankAccount login(String acc_no,String acc_password) {
		return accountDao.findXdlBankAccountByAccNoAndAccName(acc_no,acc_password);
	}
}
