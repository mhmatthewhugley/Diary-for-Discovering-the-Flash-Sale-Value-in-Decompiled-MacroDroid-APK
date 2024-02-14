package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.errorprone.annotations.CheckReturnValue;

@CheckReturnValue
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
class zzx {

    /* renamed from: e */
    private static final zzx f4006e = new zzx(true, 3, 1, (String) null, (Throwable) null);

    /* renamed from: a */
    final boolean f4007a;

    /* renamed from: b */
    final String f4008b;

    /* renamed from: c */
    final Throwable f4009c;

    /* renamed from: d */
    final int f4010d;

    private zzx(boolean z, int i, int i2, String str, Throwable th) {
        this.f4007a = z;
        this.f4010d = i;
        this.f4008b = str;
        this.f4009c = th;
    }

    /* synthetic */ zzx(boolean z, int i, int i2, String str, Throwable th, zzw zzw) {
        this(false, 1, 5, (String) null, (Throwable) null);
    }

    @Deprecated
    /* renamed from: b */
    static zzx m4957b() {
        return f4006e;
    }

    /* renamed from: c */
    static zzx m4958c(@NonNull String str) {
        return new zzx(false, 1, 5, str, (Throwable) null);
    }

    /* renamed from: d */
    static zzx m4959d(@NonNull String str, @NonNull Throwable th) {
        return new zzx(false, 1, 5, str, th);
    }

    /* renamed from: f */
    static zzx m4960f(int i) {
        return new zzx(true, i, 1, (String) null, (Throwable) null);
    }

    /* renamed from: g */
    static zzx m4961g(int i, int i2, @NonNull String str, Throwable th) {
        return new zzx(false, i, i2, str, th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo21990a() {
        return this.f4008b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo21991e() {
        if (!this.f4007a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f4009c != null) {
                mo21990a();
            } else {
                mo21990a();
            }
        }
    }
}
