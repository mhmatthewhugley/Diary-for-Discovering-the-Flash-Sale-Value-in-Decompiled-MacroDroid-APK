package com.google.android.gms.nearby.connection;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzg {

    /* renamed from: a */
    private String f47480a;

    /* renamed from: b */
    private String f47481b;

    /* renamed from: c */
    private byte[] f47482c;

    /* renamed from: d */
    private boolean f47483d;

    /* renamed from: e */
    private boolean f47484e;

    /* renamed from: f */
    private byte[] f47485f;

    @Deprecated
    /* renamed from: a */
    public final zzg mo55714a(String str) {
        this.f47481b = str;
        return this;
    }

    /* renamed from: b */
    public final zzg mo55715b(byte[] bArr) {
        this.f47485f = bArr;
        return this;
    }

    /* renamed from: c */
    public final zzg mo55716c(String str) {
        this.f47480a = str;
        return this;
    }

    @Deprecated
    /* renamed from: d */
    public final zzg mo55717d(boolean z) {
        this.f47484e = z;
        return this;
    }

    /* renamed from: e */
    public final zzg mo55718e(boolean z) {
        this.f47483d = z;
        return this;
    }

    /* renamed from: f */
    public final zzg mo55719f(byte[] bArr) {
        this.f47482c = bArr;
        return this;
    }

    /* renamed from: g */
    public final ConnectionInfo mo55720g() {
        return new ConnectionInfo(this.f47480a, this.f47481b, this.f47482c, this.f47483d, this.f47484e, this.f47485f);
    }
}
