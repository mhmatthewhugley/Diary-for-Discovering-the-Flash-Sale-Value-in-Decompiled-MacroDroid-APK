package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzei {
    @NonNull

    /* renamed from: a */
    public final String f46690a;
    @NonNull

    /* renamed from: b */
    public final String f46691b;

    /* renamed from: c */
    public final long f46692c;
    @NonNull

    /* renamed from: d */
    public final Bundle f46693d;

    public zzei(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.f46690a = str;
        this.f46691b = str2;
        this.f46693d = bundle;
        this.f46692c = j;
    }

    /* renamed from: b */
    public static zzei m65580b(zzaw zzaw) {
        return new zzei(zzaw.f46479a, zzaw.f46481d, zzaw.f46480c.mo55016m2(), zzaw.f46482f);
    }

    /* renamed from: a */
    public final zzaw mo55106a() {
        return new zzaw(this.f46690a, new zzau(new Bundle(this.f46693d)), this.f46691b, this.f46692c);
    }

    public final String toString() {
        String str = this.f46691b;
        String str2 = this.f46690a;
        String obj = this.f46693d.toString();
        return "origin=" + str + ",name=" + str2 + ",params=" + obj;
    }
}
