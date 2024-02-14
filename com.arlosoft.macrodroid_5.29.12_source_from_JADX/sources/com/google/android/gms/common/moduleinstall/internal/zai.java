package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final /* synthetic */ class zai implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ zay f3818a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f3819b;

    /* renamed from: c */
    public final /* synthetic */ InstallStatusListener f3820c;

    /* renamed from: d */
    public final /* synthetic */ ApiFeatureRequest f3821d;

    /* renamed from: e */
    public final /* synthetic */ zaab f3822e;

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zay zay = this.f3818a;
        AtomicReference atomicReference = this.f3819b;
        InstallStatusListener installStatusListener = this.f3820c;
        ApiFeatureRequest apiFeatureRequest = this.f3821d;
        zaab zaab = this.f3822e;
        ((zaf) ((zaz) obj).mo21626I()).mo21876sb(new zau(zay, atomicReference, (TaskCompletionSource) obj2, installStatusListener), apiFeatureRequest, zaab);
    }
}
