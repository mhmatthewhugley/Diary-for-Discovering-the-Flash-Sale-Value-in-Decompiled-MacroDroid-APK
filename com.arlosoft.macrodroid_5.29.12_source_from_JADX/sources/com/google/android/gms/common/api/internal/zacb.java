package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final /* synthetic */ class zacb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ListenerHolder f3397a;

    /* renamed from: c */
    public final /* synthetic */ ListenerHolder.Notifier f3398c;

    public /* synthetic */ zacb(ListenerHolder listenerHolder, ListenerHolder.Notifier notifier) {
        this.f3397a = listenerHolder;
        this.f3398c = notifier;
    }

    public final void run() {
        this.f3397a.mo21378d(this.f3398c);
    }
}
