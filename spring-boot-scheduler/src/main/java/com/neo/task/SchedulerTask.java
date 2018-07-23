package com.neo.task;

import org.springframework.stereotype.Component;

/**
 * Created by summer on 2016/12/1.
 */

@Component
public class SchedulerTask {

    private int count=0;

    //@Scheduled(cron="*/6 * * * * ?")
    private void process(){
        System.out.println("this is scheduler task runing  "+(count++));
    }

}
