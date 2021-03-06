package com.plf.task.scheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringbootTaskScheduledApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTaskScheduledApplication.class, args);
	}
	
	
	@Bean
	public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
		ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
		threadPoolTaskScheduler.setPoolSize(20);
		threadPoolTaskScheduler.setThreadNamePrefix("threadPoolTaskScheduler-");
		threadPoolTaskScheduler.setWaitForTasksToCompleteOnShutdown(true);
		threadPoolTaskScheduler.setAwaitTerminationSeconds(60);
		log.info("已经载入ThreadPoolTaskScheduler的Bean对象,对象为{}",threadPoolTaskScheduler);
		return threadPoolTaskScheduler;
	}
}
