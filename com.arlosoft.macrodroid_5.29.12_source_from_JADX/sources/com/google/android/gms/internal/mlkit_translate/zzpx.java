package com.google.android.gms.internal.mlkit_translate;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzpx implements zzpj {

    /* renamed from: a */
    private final zzlf f44445a;

    /* renamed from: b */
    private zznp f44446b = new zznp();

    private zzpx(zzlf zzlf, int i) {
        this.f44445a = zzlf;
        zzrf.m62243a();
    }

    /* renamed from: f */
    public static zzpj m62188f(zzlf zzlf) {
        return new zzpx(zzlf, 0);
    }

    /* renamed from: g */
    public static zzpj m62189g() {
        return new zzpx(new zzlf(), 0);
    }

    /* renamed from: a */
    public final byte[] mo52431a(int i, boolean z) {
        this.f44446b.mo52342f(Boolean.valueOf(1 == (i ^ 1)));
        this.f44446b.mo52341e(Boolean.FALSE);
        this.f44445a.mo52254l(this.f44446b.mo52349m());
        try {
            zzrf.m62243a();
            if (i == 0) {
                return new JsonDataEncoderBuilder().mo23614j(zzjp.f43922a).mo23615k(true).mo23613i().encode(this.f44445a.mo52255m()).getBytes("utf-8");
            }
            zzlh m = this.f44445a.mo52255m();
            zzbk zzbk = new zzbk();
            zzjp.f43922a.mo19313a(zzbk);
            return zzbk.mo52094b().mo52095a(m);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* renamed from: b */
    public final zzpj mo52432b(zzle zzle) {
        this.f44445a.mo52249g(zzle);
        return this;
    }

    /* renamed from: c */
    public final zzpj mo52433c(zznp zznp) {
        this.f44446b = zznp;
        return this;
    }

    /* renamed from: d */
    public final String mo52434d() {
        zznr h = this.f44445a.mo52255m().mo52263h();
        return (h == null || zzl.m61938c(h.mo52360k())) ? "NA" : (String) Preconditions.m4488k(h.mo52360k());
    }

    /* renamed from: e */
    public final zzpj mo52435e(zzll zzll) {
        this.f44445a.mo52251i(zzll);
        return this;
    }
}
