package com.wulee.administrator.zuji.utils.network;



public interface NetChangeObserver {

    void onConnect(NetworkUtils.NetworkType type);

    void onDisConnect();

}
