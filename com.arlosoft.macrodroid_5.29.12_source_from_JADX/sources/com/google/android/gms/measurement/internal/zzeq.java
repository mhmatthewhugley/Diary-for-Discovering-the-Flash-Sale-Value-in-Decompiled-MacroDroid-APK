package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzeq {

    /* renamed from: a */
    private final String f46712a;

    /* renamed from: b */
    private final boolean f46713b;

    /* renamed from: c */
    private boolean f46714c;

    /* renamed from: d */
    private boolean f46715d;

    /* renamed from: e */
    final /* synthetic */ zzew f46716e;

    public zzeq(zzew zzew, String str, boolean z) {
        this.f46716e = zzew;
        Preconditions.m4484g(str);
        this.f46712a = str;
        this.f46713b = z;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo55116a(boolean z) {
        SharedPreferences.Editor edit = this.f46716e.mo55127m().edit();
        edit.putBoolean(this.f46712a, z);
        edit.apply();
        this.f46715d = z;
    }

    @WorkerThread
    /* renamed from: b */
    public final boolean mo55117b() {
        if (!this.f46714c) {
            this.f46714c = true;
            this.f46715d = this.f46716e.mo55127m().getBoolean(this.f46712a, this.f46713b);
        }
        return this.f46715d;
    }
}
