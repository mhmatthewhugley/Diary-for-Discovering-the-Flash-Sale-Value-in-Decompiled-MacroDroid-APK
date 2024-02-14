package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbvh;
import com.google.android.gms.internal.ads.zzcgp;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    /* access modifiers changed from: protected */
    public final void onHandleIntent(@NonNull Intent intent) {
        try {
            zzaw.m1916a().mo19880k(this, new zzbvh()).mo43227F1(intent);
        } catch (RemoteException e) {
            zzcgp.m45226d("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
