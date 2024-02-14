package com.google.android.gms.nearby.connection;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class ConnectionInfo {

    /* renamed from: a */
    private final String f47402a;

    /* renamed from: b */
    private final String f47403b;

    /* renamed from: c */
    private final byte[] f47404c;

    /* renamed from: d */
    private final boolean f47405d;

    /* renamed from: e */
    private final boolean f47406e;

    /* renamed from: f */
    private final byte[] f47407f;

    private ConnectionInfo(String str, String str2, byte[] bArr, boolean z, boolean z2, byte[] bArr2) {
        this.f47402a = str;
        this.f47403b = str2;
        this.f47404c = bArr;
        this.f47405d = z;
        this.f47406e = z2;
        this.f47407f = bArr2;
    }

    /* renamed from: a */
    public boolean mo55651a() {
        return this.f47405d;
    }
}
