package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzhz implements OnFailureListener {

    /* renamed from: a */
    final /* synthetic */ String f44749a;

    /* renamed from: b */
    final /* synthetic */ zzih f44750b;

    /* renamed from: c */
    public final void mo22733c(Exception exc) {
        if (!(exc instanceof ApiException) || ((ApiException) exc).mo21210b() != 8003) {
            this.f44750b.m62587N(this.f44749a);
        }
    }
}
