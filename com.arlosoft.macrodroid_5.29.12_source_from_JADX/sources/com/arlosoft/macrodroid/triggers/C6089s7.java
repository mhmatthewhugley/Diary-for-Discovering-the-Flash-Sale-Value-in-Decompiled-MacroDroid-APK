package com.arlosoft.macrodroid.triggers;

import android.content.Intent;
import android.os.PowerManager;

/* renamed from: com.arlosoft.macrodroid.triggers.s7 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6089s7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ StopwatchTrigger f14412a;

    /* renamed from: c */
    public final /* synthetic */ Intent f14413c;

    /* renamed from: d */
    public final /* synthetic */ PowerManager.WakeLock f14414d;

    public /* synthetic */ C6089s7(StopwatchTrigger stopwatchTrigger, Intent intent, PowerManager.WakeLock wakeLock) {
        this.f14412a = stopwatchTrigger;
        this.f14413c = intent;
        this.f14414d = wakeLock;
    }

    public final void run() {
        this.f14412a.m23225D3(this.f14413c, this.f14414d);
    }
}
