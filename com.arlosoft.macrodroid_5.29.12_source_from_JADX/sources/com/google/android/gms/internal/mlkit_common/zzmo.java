package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.model.RemoteModel;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzmo implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzmq f43037a;

    /* renamed from: c */
    public final /* synthetic */ zzmh f43038c;

    /* renamed from: d */
    public final /* synthetic */ zzms f43039d;

    /* renamed from: f */
    public final /* synthetic */ RemoteModel f43040f;

    public /* synthetic */ zzmo(zzmq zzmq, zzmh zzmh, zzms zzms, RemoteModel remoteModel) {
        this.f43037a = zzmq;
        this.f43038c = zzmh;
        this.f43039d = zzms;
        this.f43040f = remoteModel;
    }

    public final void run() {
        this.f43037a.mo52009c(this.f43038c, this.f43039d, this.f43040f);
    }
}
