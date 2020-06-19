package com.meituan.sec;

import java.lang.instrument.Instrumentation;

/**
 * @author xule05
 * @date 2020/6/19 上午8:03
 */
public class Agent {

    public static void premain(String agentArgs, Instrumentation inst) {
        main(agentArgs, inst);
    }

    public static void agentmain(String agentArgs, Instrumentation inst) {
        main(agentArgs, inst);
    }

    private static void main(String args, final Instrumentation inst) {
        // 打印 args
        System.out.println("args: " + args);
    }
}