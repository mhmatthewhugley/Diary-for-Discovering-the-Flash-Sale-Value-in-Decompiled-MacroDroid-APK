package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzes {

    /* renamed from: a */
    private final String f46721a;

    /* renamed from: b */
    private final long f46722b;

    /* renamed from: c */
    private boolean f46723c;

    /* renamed from: d */
    private long f46724d;

    /* renamed from: e */
    final /* synthetic */ zzew f46725e;

    public zzes(zzew zzew, String str, long j) {
        this.f46725e = zzew;
        Preconditions.m4484g(str);
        this.f46721a = str;
        this.f46722b = j;
    }

    @WorkerThread
    /* renamed from: a */
    public final long mo55120a() {
        if (!this.f46723c) {
            this.f46723c = true;
            this.f46724d = this.f46725e.mo55127m().getLong(this.f46721a, this.f46722b);
        }
        return this.f46724d;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo55121b(long j) {
        SharedPreferences.Editor edit = this.f46725e.mo55127m().edit();
        edit.putLong(this.f46721a, j);
        edit.apply();
        this.f46724d = j;
    }
}
