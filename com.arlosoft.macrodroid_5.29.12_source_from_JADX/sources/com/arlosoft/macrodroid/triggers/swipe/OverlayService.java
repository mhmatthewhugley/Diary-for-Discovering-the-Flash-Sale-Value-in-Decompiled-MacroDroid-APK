package com.arlosoft.macrodroid.triggers.swipe;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public abstract class OverlayService extends Service {

    /* renamed from: a */
    protected boolean f14580a = false;

    /* renamed from: c */
    protected boolean f14581c = false;

    /* renamed from: d */
    protected int f14582d = 0;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
