/*package com.esprit.project;


//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.project.entity.Account;
import com.esprit.project.entity.Role;
//import com.esprit.project.entity.User;
//import com.esprit.project.service.AccountServiceImpl;
import com.esprit.project.service.IAccountService;
//import com.esprit.project.service.IUserService;
//import com.esprit.project.service.UserServiceImpl;
import com.sun.el.parser.ParseException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceImplAddTest {
	
	//private static final Logger l = LogManager.getLogger(AccountServiceImpl.class);
	@Autowired 
	IAccountService us;
	
	@Test
	public void test() throws ParseException, java.text.ParseException {
		Account acc = new Account(5,"youssef","benammar",Role.PARENT);
		us.addAccount(acc);
	}

}
*/