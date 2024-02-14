package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgoa implements zzgas {

    /* renamed from: f */
    private static final byte[] f36948f = new byte[0];

    /* renamed from: a */
    private final zzgod f36949a;

    /* renamed from: b */
    private final String f36950b;

    /* renamed from: c */
    private final byte[] f36951c;

    /* renamed from: d */
    private final zzgny f36952d;

    /* renamed from: e */
    private final int f36953e;

    public zzgoa(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, zzgny zzgny) throws GeneralSecurityException {
        zzgoe.m52447d(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f36949a = new zzgod(eCPublicKey);
        this.f36951c = bArr;
        this.f36950b = str;
        this.f36953e = i;
        this.f36952d = zzgny;
    }

    /* renamed from: a */
    public final byte[] mo46661a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzgoc a = this.f36949a.mo47032a(this.f36950b, this.f36951c, bArr2, this.f36952d.zza(), this.f36953e);
        byte[] a2 = this.f36952d.mo46752b(a.mo47031b()).mo46771a(bArr, f36948f);
        byte[] a3 = a.mo47030a();
        return ByteBuffer.allocate(a3.length + a2.length).put(a3).put(a2).array();
    }
}
