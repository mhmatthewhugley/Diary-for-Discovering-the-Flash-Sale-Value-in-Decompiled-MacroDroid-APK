package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1674d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Uploader f1532a;

    /* renamed from: c */
    public final /* synthetic */ TransportContext f1533c;

    /* renamed from: d */
    public final /* synthetic */ int f1534d;

    /* renamed from: f */
    public final /* synthetic */ Runnable f1535f;

    public /* synthetic */ C1674d(Uploader uploader, TransportContext transportContext, int i, Runnable runnable) {
        this.f1532a = uploader;
        this.f1533c = transportContext;
        this.f1534d = i;
        this.f1535f = runnable;
    }

    public final void run() {
        this.f1532a.m1464t(this.f1533c, this.f1534d, this.f1535f);
    }
}
