package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzerh implements zzeve {

    /* renamed from: a */
    private final zzfzq f34780a;

    /* renamed from: b */
    private final Context f34781b;

    zzerh(zzfzq zzfzq, Context context) {
        this.f34780a = zzfzq;
        this.f34781b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzeri mo45444a() throws Exception {
        Intent intent;
        double d;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26855E8)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            intent = this.f34781b.registerReceiver((BroadcastReceiver) null, intentFilter);
        } else {
            intent = this.f34781b.registerReceiver((BroadcastReceiver) null, intentFilter, 4);
        }
        boolean z = false;
        if (intent != null) {
            int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            d = ((double) intent.getIntExtra("level", -1)) / ((double) intent.getIntExtra("scale", -1));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d = -1.0d;
        }
        return new zzeri(d, z);
    }

    public final int zza() {
        return 14;
    }

    public final zzfzp zzb() {
        return this.f34780a.mo46579F(new zzerg(this));
    }
}
