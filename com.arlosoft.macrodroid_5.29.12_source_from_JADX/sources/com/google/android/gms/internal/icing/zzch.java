package com.google.android.gms.internal.icing;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzch extends zzci {

    /* renamed from: a */
    private final byte[] f40795a;

    /* renamed from: b */
    private int f40796b;

    /* renamed from: c */
    private int f40797c;

    /* renamed from: d */
    private int f40798d = Integer.MAX_VALUE;

    /* synthetic */ zzch(byte[] bArr, int i, int i2, boolean z, zzcg zzcg) {
        super((zzcg) null);
        this.f40795a = bArr;
        this.f40796b = 0;
    }

    /* renamed from: a */
    public final int mo50227a(int i) throws zzdj {
        int i2 = this.f40798d;
        this.f40798d = 0;
        int i3 = this.f40796b + this.f40797c;
        this.f40796b = i3;
        if (i3 > 0) {
            this.f40797c = i3;
            this.f40796b = 0;
        } else {
            this.f40797c = 0;
        }
        return i2;
    }
}
