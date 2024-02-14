package com.google.android.gms.internal.p204firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzb extends ContextCompat {
    @Deprecated
    @Nullable
    /* renamed from: a */
    public static Intent m56922a(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (!zza.m55988a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, true != zza.m55988a() ? 0 : 2);
    }
}
