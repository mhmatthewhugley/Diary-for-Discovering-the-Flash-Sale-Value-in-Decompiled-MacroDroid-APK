package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.messaging.t */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11318t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ImageDownload f55159a;

    /* renamed from: c */
    public final /* synthetic */ TaskCompletionSource f55160c;

    public /* synthetic */ C11318t(ImageDownload imageDownload, TaskCompletionSource taskCompletionSource) {
        this.f55159a = imageDownload;
        this.f55160c = taskCompletionSource;
    }

    public final void run() {
        this.f55159a.m76916h(this.f55160c);
    }
}
