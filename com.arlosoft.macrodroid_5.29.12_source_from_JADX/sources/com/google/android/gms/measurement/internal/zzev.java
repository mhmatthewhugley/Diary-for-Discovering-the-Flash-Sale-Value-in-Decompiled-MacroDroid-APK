package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzev {

    /* renamed from: a */
    private final String f46731a;

    /* renamed from: b */
    private boolean f46732b;

    /* renamed from: c */
    private String f46733c;

    /* renamed from: d */
    final /* synthetic */ zzew f46734d;

    public zzev(zzew zzew, String str, String str2) {
        this.f46734d = zzew;
        Preconditions.m4484g(str);
        this.f46731a = str;
    }

    @WorkerThread
    /* renamed from: a */
    public final String mo55124a() {
        if (!this.f46732b) {
            this.f46732b = true;
            this.f46733c = this.f46734d.mo55127m().getString(this.f46731a, (String) null);
        }
        return this.f46733c;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo55125b(String str) {
        SharedPreferences.Editor edit = this.f46734d.mo55127m().edit();
        edit.putString(this.f46731a, str);
        edit.apply();
        this.f46733c = str;
    }
}
