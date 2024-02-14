package com.google.android.gms.nearby.exposurenotification;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class WakeUpService extends Service {
    @Nullable
    public final IBinder onBind(@NonNull Intent intent) {
        return new Messenger(new zzr((zzq) null)).getBinder();
    }
}
