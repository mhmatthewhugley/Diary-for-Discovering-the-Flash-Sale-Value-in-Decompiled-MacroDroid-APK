package com.google.android.gms.internal.mlkit_common;

import android.system.Os;
import java.io.FileDescriptor;
import java.util.concurrent.Callable;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzk implements Callable {

    /* renamed from: a */
    public final /* synthetic */ FileDescriptor f42982a;

    public final Object call() {
        return Os.fstat(this.f42982a);
    }
}
