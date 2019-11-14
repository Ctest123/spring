package cn.xdl.mapper;

import org.apache.ibatis.annotations.Param;

import cn.xdl.bean.XdlBankAccount;

public interface XdlBankAccountDao {
	XdlBankAccount findXdlBankAccountByAccNoAndAccName(
			@Param("name")String name,
			@Param("password")String password);
}
