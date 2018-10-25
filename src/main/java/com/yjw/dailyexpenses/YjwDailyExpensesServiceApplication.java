package com.yjw.dailyexpenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 因为添加了数据库组件，所以autoconfig会去读取数据源配置，
 * 而新建的项目还没有配置数据源，所以会导致异常出现。
 * 需要在注解  @SpringBootApplication  后面添加以下
 * (exclude = {DataSourceAutoConfiguration.class})
 * 才能启动项目
 * 
 * @author YangJianWei
 * @version $Id: YjwInterviewQuestionsApplication.java, v 0.1 2018年10月10日 上午9:52:53 YangJianWei Exp $
 */
//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class YjwDailyExpensesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(YjwDailyExpensesServiceApplication.class, args);
	}
}
