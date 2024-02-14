package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zao extends ContextCompat {
    @Deprecated
    @Nullable
    /* renamed from: a */
    public static Intent m55863a(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (!zan.m55862a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, true != zan.m55862a() ? 0 : 2);
    }
}
