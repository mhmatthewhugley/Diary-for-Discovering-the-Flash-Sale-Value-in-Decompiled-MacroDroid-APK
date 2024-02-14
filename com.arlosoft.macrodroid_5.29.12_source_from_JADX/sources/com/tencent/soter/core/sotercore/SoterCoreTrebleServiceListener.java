package com.tencent.soter.core.sotercore;

public interface SoterCoreTrebleServiceListener {
    void onNoServiceWhenCalling();

    void onServiceBinderDied();

    void onServiceConnected();

    void onServiceDisconnected();

    void onStartServiceConnecting();
}
