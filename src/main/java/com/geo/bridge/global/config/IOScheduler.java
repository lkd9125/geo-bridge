package com.geo.bridge.global.config;

import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

public class IOScheduler {

    private static final Scheduler SCHEDULER =
        Schedulers.newBoundedElastic(
            50,         // max threads
            1000,       // queue size
            "mqtt-pool"
        );

    public static Scheduler scheduler() {
        return SCHEDULER;
    }

}
