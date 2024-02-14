package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgbo {

    /* renamed from: a */
    private final Object f36653a;

    /* renamed from: b */
    private final byte[] f36654b;

    /* renamed from: c */
    private final int f36655c;

    /* renamed from: d */
    private final zzgbl f36656d;

    /* renamed from: e */
    private final int f36657e;

    /* renamed from: f */
    private final int f36658f;

    zzgbo(Object obj, byte[] bArr, int i, int i2, int i3, zzgbl zzgbl) {
        this.f36653a = obj;
        this.f36654b = Arrays.copyOf(bArr, bArr.length);
        this.f36657e = i;
        this.f36658f = i2;
        this.f36655c = i3;
        this.f36656d = zzgbl;
    }

    /* renamed from: a */
    public final int mo46699a() {
        return this.f36655c;
    }

    /* renamed from: b */
    public final zzgbl mo46700b() {
        return this.f36656d;
    }

    /* renamed from: c */
    public final Object mo46701c() {
        return this.f36653a;
    }

    /* renamed from: d */
    public final byte[] mo46702d() {
        byte[] bArr = this.f36654b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: e */
    public final int mo46703e() {
        return this.f36657e;
    }

    /* renamed from: f */
    public final int mo46704f() {
        return this.f36658f;
    }
}
