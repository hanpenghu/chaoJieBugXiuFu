package com.ipace.chaoJie;
import com.ipace.chaoJie.A000Component.ICnst;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling//使用定时任务
@MapperScan(ICnst.daoP)//扫描mybatis  dao层
@SpringBootApplication//开启所有基础配置
public class ChaoJieApplication {
	public static void main(String[] args) {
		SpringApplication.run(ChaoJieApplication.class, args);
	}
}
