package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzas {

    /* renamed from: a */
    final String f46465a;

    /* renamed from: b */
    final String f46466b;

    /* renamed from: c */
    final long f46467c;

    /* renamed from: d */
    final long f46468d;

    /* renamed from: e */
    final long f46469e;

    /* renamed from: f */
    final long f46470f;

    /* renamed from: g */
    final long f46471g;

    /* renamed from: h */
    final Long f46472h;

    /* renamed from: i */
    final Long f46473i;

    /* renamed from: j */
    final Long f46474j;

    /* renamed from: k */
    final Boolean f46475k;

    zzas(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        boolean z = true;
        Preconditions.m4478a(j6 >= 0);
        Preconditions.m4478a(j7 >= 0);
        Preconditions.m4478a(j8 >= 0);
        Preconditions.m4478a(j9 < 0 ? false : z);
        this.f46465a = str;
        this.f46466b = str2;
        this.f46467c = j6;
        this.f46468d = j7;
        this.f46469e = j8;
        this.f46470f = j4;
        this.f46471g = j9;
        this.f46472h = l;
        this.f46473i = l2;
        this.f46474j = l3;
        this.f46475k = bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzas mo55008a(Long l, Long l2, Boolean bool) {
        return new zzas(this.f46465a, this.f46466b, this.f46467c, this.f46468d, this.f46469e, this.f46470f, this.f46471g, this.f46472h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final zzas mo55009b(long j, long j2) {
        return new zzas(this.f46465a, this.f46466b, this.f46467c, this.f46468d, this.f46469e, this.f46470f, j, Long.valueOf(j2), this.f46473i, this.f46474j, this.f46475k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final zzas mo55010c(long j) {
        return new zzas(this.f46465a, this.f46466b, this.f46467c, this.f46468d, this.f46469e, j, this.f46471g, this.f46472h, this.f46473i, this.f46474j, this.f46475k);
    }
}
