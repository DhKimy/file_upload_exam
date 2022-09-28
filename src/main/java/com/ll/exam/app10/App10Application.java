package com.ll.exam.app10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // 수정, 삭제 시간을 자동으로 기록하기 위해 필요한 어노테이션
public class App10Application {

	public static void main(String[] args) {
		SpringApplication.run(App10Application.class, args);
	}


}
