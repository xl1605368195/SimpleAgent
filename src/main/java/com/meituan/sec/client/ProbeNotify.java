package com.meituan.sec.client;

public interface ProbeNotify {
    void onConnect();
    void onDisconnect();
    void onConfig(String config);
    void onControl(int action);
    void onDetect();
}
