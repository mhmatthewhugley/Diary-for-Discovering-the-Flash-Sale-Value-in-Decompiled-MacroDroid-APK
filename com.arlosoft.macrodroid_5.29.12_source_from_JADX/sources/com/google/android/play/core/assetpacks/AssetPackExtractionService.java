package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: com.google.android.play:core@@1.10.3 */
public class AssetPackExtractionService extends Service {

    /* renamed from: a */
    zzb f51170a;

    public final IBinder onBind(Intent intent) {
        return this.f51170a;
    }

    public final void onCreate() {
        super.onCreate();
        zzd.m70651a(getApplicationContext()).mo59591a(this);
    }
}
