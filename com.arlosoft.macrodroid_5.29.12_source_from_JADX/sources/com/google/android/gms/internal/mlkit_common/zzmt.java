package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zzmt implements zzmh {

    /* renamed from: a */
    private final zzja f43053a;

    /* renamed from: b */
    private zzle f43054b = new zzle();

    private zzmt(zzja zzja, int i) {
        this.f43053a = zzja;
        zzne.m61545a();
    }

    /* renamed from: f */
    public static zzmh m61528f(zzja zzja) {
        return new zzmt(zzja, 0);
    }

    /* renamed from: g */
    public static zzmh m61529g() {
        return new zzmt(new zzja(), 0);
    }

    /* renamed from: a */
    public final byte[] mo51997a(int i, boolean z) {
        this.f43054b.mo51946f(Boolean.valueOf(1 == (i ^ 1)));
        this.f43054b.mo51945e(Boolean.FALSE);
        this.f43053a.mo51889j(this.f43054b.mo51953m());
        try {
            zzne.m61545a();
            if (i == 0) {
                return new JsonDataEncoderBuilder().mo23614j(zzhk.f42658a).mo23615k(true).mo23613i().encode(this.f43053a.mo51890k()).getBytes("utf-8");
            }
            zzjc k = this.f43053a.mo51890k();
            zzbp zzbp = new zzbp();
            zzhk.f42658a.mo19313a(zzbp);
            return zzbp.mo51834b().mo51835a(k);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* renamed from: b */
    public final zzmh mo51998b(zziz zziz) {
        this.f43053a.mo51885f(zziz);
        return this;
    }

    /* renamed from: c */
    public final zzmh mo51999c(zzjg zzjg) {
        this.f43053a.mo51888i(zzjg);
        return this;
    }

    /* renamed from: d */
    public final String mo52000d() {
        zzlg f = this.f43053a.mo51890k().mo51896f();
        return (f == null || zzad.m61140c(f.mo51964k())) ? "NA" : (String) Preconditions.m4488k(f.mo51964k());
    }

    /* renamed from: e */
    public final zzmh mo52001e(zzle zzle) {
        this.f43054b = zzle;
        return this;
    }
}
