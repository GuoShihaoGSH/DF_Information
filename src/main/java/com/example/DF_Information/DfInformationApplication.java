package com.example.DF_Information;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class DfInformationApplication {

	/**
	 *
	 * @Description:springboot启动方法
	 *
	 * @param: [args]
	 * @return: void
	 * @auther: guoshihao
	 * @date: 2019/1/4 17:43
	 */
	public static void main(String[] args) {
		SpringApplication.run(DfInformationApplication.class, args);
	}

}

