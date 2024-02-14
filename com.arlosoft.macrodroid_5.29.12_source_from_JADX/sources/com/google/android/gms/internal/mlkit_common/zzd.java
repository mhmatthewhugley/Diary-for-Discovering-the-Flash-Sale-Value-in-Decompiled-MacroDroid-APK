package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import androidx.core.content.ContextCompat;
import java.util.concurrent.Callable;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzd implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f42044a;

    public final Object call() {
        Context context = this.f42044a;
        int i = zzi.f42662d;
        return ContextCompat.getExternalCacheDirs(context);
    }
}
