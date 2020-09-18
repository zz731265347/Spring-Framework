package com.zz.test;

import com.zz.test.config.Testconfigration;
import com.zz.test.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class Springtest {
	public static void main(String[] args) {

		System.out.println("启动...........");

		Date startTime = new Date();

		System.out.println("开始时间:" + startTime + " ");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				Testconfigration.class
		);

		User bean = (User) context.getBean("zUser");

		System.out.println("信息:" + bean.toString());

		Date endTime = new Date();

		System.out.println("结束时间:" + endTime + "");



	}

}
