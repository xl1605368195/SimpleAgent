package com.demo;

import java.lang.instrument.Instrumentation;

public class Agent {
    public static void premain(String args, Instrumentation inst) {
        main(args, inst);
    }

    public static void agentmain(String args, Instrumentation inst) {
        main(args, inst);
    }

    private synchronized static void main(String args, final Instrumentation inst) {
        // 打印attach时传入的参数
        System.out.println("args=" + args);
    }
}
