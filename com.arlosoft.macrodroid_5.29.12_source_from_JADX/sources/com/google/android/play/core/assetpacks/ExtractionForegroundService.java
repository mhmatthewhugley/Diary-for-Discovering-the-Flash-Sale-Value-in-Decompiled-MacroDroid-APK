package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.play:core@@1.10.3 */
public class ExtractionForegroundService extends Service {

    /* renamed from: a */
    private final IBinder f51172a = new zzch(this);

    /* renamed from: a */
    public final synchronized void mo59587a() {
        stopForeground(true);
        stopSelf();
    }

    @Nullable
    public final IBinder onBind(Intent intent) {
        return this.f51172a;
    }
}
