package com.neo.task;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by summer on 2016/12/1.
 */

@Component
//@EnableAsync
public class Scheduler2Task {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private static final Logger LOGGER = Logger.getLogger(Scheduler2Task.class);

    @Async
    @Scheduled(fixedRate = 6000)
    //@Scheduled(cron = "0/6 * *  * * ? ")
    public void reportCurrentTime() {
        LOGGER.info(Thread.currentThread().getId()+" reportCurrentTime Begin现在时间：" + dateFormat.format(new Date()));
        //System.out.println(Thread.currentThread().getId()+" reportCurrentTime Begin现在时间：" + dateFormat.format(new Date()));
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info(Thread.currentThread().getId()+" reportCurrentTime End现在时间：" + dateFormat.format(new Date()));
        //System.out.println(Thread.currentThread().getId()+" reportCurrentTime End现在时间：" + dateFormat.format(new Date()));
    }

    @Async
    @Scheduled(fixedRate = 6000)
    //@Scheduled(cron = "0/6 * *  * * ? ")
    public void reportCurrentTime01() {
        LOGGER.info(Thread.currentThread().getId()+" reportCurrentTime01 Begin现在时间：" + dateFormat.format(new Date()));
        //System.out.println(Thread.currentThread().getId()+" reportCurrentTime01 Begin现在时间：" + dateFormat.format(new Date()));
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info(Thread.currentThread().getId()+" reportCurrentTime01 End现在时间：" + dateFormat.format(new Date()));
        //System.out.println(Thread.currentThread().getId()+" reportCurrentTime01 End现在时间：" + dateFormat.format(new Date()));
    }

}
