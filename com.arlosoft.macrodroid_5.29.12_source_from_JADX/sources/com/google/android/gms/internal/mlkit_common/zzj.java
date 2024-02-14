package com.google.android.gms.internal.mlkit_common;

import android.system.Os;
import java.util.concurrent.Callable;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzj implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f42908a;

    public final Object call() {
        return Os.lstat(this.f42908a);
    }
}
