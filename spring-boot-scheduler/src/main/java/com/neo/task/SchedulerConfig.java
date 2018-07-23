package com.neo.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/**
 * Created by maobin(phone:15829581409,mail:mb19890630@126.com) on 2018-07-23.
 */
@Configuration
public class SchedulerConfig implements SchedulingConfigurer{

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.initialize();
        scheduler.setPoolSize(2);
        taskRegistrar.setScheduler(scheduler);
    }
}
