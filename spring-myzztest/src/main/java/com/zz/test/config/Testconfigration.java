package com.zz.test.config;

import com.zz.test.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.zz.test.**")
public class Testconfigration {

	@Bean("zUser")
	public User  getBean(){
		User user  = new User();
		user.setAge(27);
		user.setIDcard(1000);
		user.setName("zhongzhi");
		user.setWork("JAVA");
		return user;
	}
}
