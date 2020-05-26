package com.demo;

import java.lang.instrument.Instrumentation;

/**
 * @author xule05
 * @date 2020/5/26 下午8:20
 */
public class Agent {
    public static void premain(String param, Instrumentation inst) {
        main(param, inst);
    }

    public static void agentmain(String param, Instrumentation inst) {
        main(param, inst);
    }

    private synchronized static void main(String args, final Instrumentation inst) {
        // 打印 attach时传入的参数
        System.out.println("args: " + args);
    }
}
