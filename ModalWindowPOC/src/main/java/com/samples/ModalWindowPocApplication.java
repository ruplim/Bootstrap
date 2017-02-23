package com.samples;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ModalWindowPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModalWindowPocApplication.class, args);
	}
	
	@RequestMapping(value="/accounts", method=RequestMethod.GET)
	public List<String>getAccounts() throws Exception {
		
/*		System.out.println("Sleeping started");
		Thread.sleep(1000 * 10);
		System.out.println("Sleeping done");
*/		
		List<String> accountList = new ArrayList();
		accountList.add("123455");
		accountList.add("4556");
		accountList.add("86756");
		accountList.add("77777");
		accountList.add("674537");
		accountList.add("123455");
		accountList.add("4556");
		accountList.add("86756");
		accountList.add("77777");
		accountList.add("674537");
		accountList.add("123455");
		accountList.add("4556");
		accountList.add("86756");
		accountList.add("77777");
		accountList.add("674537");
		accountList.add("123455");
		accountList.add("4556");
		accountList.add("86756");
		accountList.add("77777");
		accountList.add("674537");
		accountList.add("123455");
		accountList.add("4556");
		accountList.add("86756");
		accountList.add("77777");
		accountList.add("674537");
		accountList.add("123455");
		accountList.add("4556");
		accountList.add("86756");
		accountList.add("77777");
		accountList.add("674537");
		accountList.add("123455");
		accountList.add("4556");
		accountList.add("86756");
		accountList.add("77777");
		accountList.add("674537");
		accountList.add("123455");
		accountList.add("4556");
		accountList.add("86756");
		accountList.add("77777");
		accountList.add("674537");
		
//		if(accountList.size() > 1) throw new Exception("Error from server");
		
		return accountList;
		
	}
}
