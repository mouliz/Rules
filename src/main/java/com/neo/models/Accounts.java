package com.neo.models;

import java.util.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.concretepage.bean.Book;
import com.dev.neo.model.*;

//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "Accounts")
public class Accounts {

	//@XmlElement(name = "Account", type = Account.class)
	private List<Account> account = new ArrayList<Account>();

	public Accounts(List<Account> account) {
		super();
		this.account = account;
	}

	public Accounts() {
		super();
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}
	
	
	
	
}
