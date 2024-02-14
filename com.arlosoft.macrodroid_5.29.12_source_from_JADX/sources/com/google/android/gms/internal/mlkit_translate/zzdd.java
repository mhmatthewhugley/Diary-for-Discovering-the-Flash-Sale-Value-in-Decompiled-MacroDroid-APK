package com.google.android.gms.internal.mlkit_translate;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzdd extends zzbx {
    zzdd() {
    }

    /* renamed from: e */
    private static final zzbo m61712e(zzdt zzdt, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 5) {
            return new zzbu(zzdt.mo52175f());
        }
        if (i2 == 6) {
            return new zzbu((Number) new zzca(zzdt.mo52175f()));
        }
        if (i2 == 7) {
            return new zzbu(Boolean.valueOf(zzdt.mo52184s()));
        }
        if (i2 == 8) {
            zzdt.mo52180m();
            return zzbq.f43162a;
        }
        zzdu.m61756a(i);
        throw new IllegalStateException("Unexpected token: ".concat(zzdu.m61756a(i)));
    }

    /* renamed from: f */
    private static final zzbo m61713f(zzdt zzdt, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            zzdt.mo52176g();
            return new zzbn();
        } else if (i2 != 2) {
            return null;
        } else {
            zzdt.mo52177h();
            return new zzbr();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo52121a(zzdt zzdt) throws IOException {
        int u = zzdt.mo52186u();
        zzbo f = m61713f(zzdt, u);
        if (f == null) {
            return m61712e(zzdt, u);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzdt.mo52182p()) {
                String e = f instanceof zzbr ? zzdt.mo52174e() : null;
                int u2 = zzdt.mo52186u();
                zzbo f2 = m61713f(zzdt, u2);
                zzbo e2 = f2 == null ? m61712e(zzdt, u2) : f2;
                if (f instanceof zzbn) {
                    ((zzbn) f).mo52097d(e2);
                } else {
                    ((zzbr) f).mo52111j(e, e2);
                }
                if (f2 != null) {
                    arrayDeque.addLast(f);
                    f = e2;
                }
            } else {
                if (f instanceof zzbn) {
                    zzdt.mo52178i();
                } else {
                    zzdt.mo52179j();
                }
                if (arrayDeque.isEmpty()) {
                    return f;
                }
                f = (zzbo) arrayDeque.removeLast();
            }
        }
    }

    /* renamed from: d */
    public final void mo52122b(zzdv zzdv, zzbo zzbo) throws IOException {
        if (zzbo == null || (zzbo instanceof zzbq)) {
            zzdv.mo52194h();
        } else if (zzbo instanceof zzbu) {
            zzbu zzbu = (zzbu) zzbo;
            if (zzbu.mo52120k()) {
                zzdv.mo52195i(zzbu.mo52115f());
            } else if (zzbu.mo52119j()) {
                zzdv.mo52197m(zzbu.mo52118i());
            } else {
                zzdv.mo52196j(zzbu.mo52116h());
            }
        } else if (zzbo instanceof zzbn) {
            zzdv.mo52187b();
            Iterator it = ((zzbn) zzbo).iterator();
            while (it.hasNext()) {
                mo52122b(zzdv, (zzbo) it.next());
            }
            zzdv.mo52190e();
        } else if (zzbo instanceof zzbr) {
            zzdv.mo52188c();
            for (Map.Entry entry : zzbo.mo52101c().mo52110i()) {
                zzdv.mo52193g((String) entry.getKey());
                mo52122b(zzdv, (zzbo) entry.getValue());
            }
            zzdv.mo52191f();
        } else {
            Class<?> cls = zzbo.getClass();
            cls.toString();
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(cls)));
        }
    }
}
