package com.google.android.gms.cloudmessaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class zze implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CloudMessagingReceiver f2979a;

    /* renamed from: c */
    public final /* synthetic */ Intent f2980c;

    /* renamed from: d */
    public final /* synthetic */ Context f2981d;

    /* renamed from: f */
    public final /* synthetic */ boolean f2982f;

    /* renamed from: g */
    public final /* synthetic */ BroadcastReceiver.PendingResult f2983g;

    public /* synthetic */ zze(CloudMessagingReceiver cloudMessagingReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f2979a = cloudMessagingReceiver;
        this.f2980c = intent;
        this.f2981d = context;
        this.f2982f = z;
        this.f2983g = pendingResult;
    }

    public final void run() {
        this.f2979a.mo21072d(this.f2980c, this.f2981d, this.f2982f, this.f2983g);
    }
}
