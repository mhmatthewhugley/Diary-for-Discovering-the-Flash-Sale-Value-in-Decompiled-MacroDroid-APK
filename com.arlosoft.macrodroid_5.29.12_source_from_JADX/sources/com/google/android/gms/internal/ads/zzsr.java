package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzsr {

    /* renamed from: a */
    public final int f38444a;
    @Nullable

    /* renamed from: b */
    public final zzsi f38445b;

    /* renamed from: c */
    private final CopyOnWriteArrayList f38446c;

    public zzsr() {
        this(new CopyOnWriteArrayList(), 0, (zzsi) null, 0);
    }

    private zzsr(CopyOnWriteArrayList copyOnWriteArrayList, int i, @Nullable zzsi zzsi, long j) {
        this.f38446c = copyOnWriteArrayList;
        this.f38444a = i;
        this.f38445b = zzsi;
    }

    /* renamed from: n */
    private static final long m54907n(long j) {
        long j0 = zzen.m49171j0(j);
        if (j0 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j0;
    }

    @CheckResult
    /* renamed from: a */
    public final zzsr mo48167a(int i, @Nullable zzsi zzsi, long j) {
        return new zzsr(this.f38446c, i, zzsi, 0);
    }

    /* renamed from: b */
    public final void mo48168b(Handler handler, zzss zzss) {
        Objects.requireNonNull(zzss);
        this.f38446c.add(new zzsq(handler, zzss));
    }

    /* renamed from: c */
    public final void mo48169c(zzse zzse) {
        Iterator it = this.f38446c.iterator();
        while (it.hasNext()) {
            zzsq zzsq = (zzsq) it.next();
            zzen.m49186y(zzsq.f38442a, new zzsl(this, zzsq.f38443b, zzse));
        }
    }

    /* renamed from: d */
    public final void mo48170d(int i, @Nullable zzaf zzaf, int i2, @Nullable Object obj, long j) {
        mo48169c(new zzse(1, i, zzaf, 0, (Object) null, m54907n(j), -9223372036854775807L));
    }

    /* renamed from: e */
    public final void mo48171e(zzrz zzrz, zzse zzse) {
        Iterator it = this.f38446c.iterator();
        while (it.hasNext()) {
            zzsq zzsq = (zzsq) it.next();
            zzen.m49186y(zzsq.f38442a, new zzsm(this, zzsq.f38443b, zzrz, zzse));
        }
    }

    /* renamed from: f */
    public final void mo48172f(zzrz zzrz, int i, int i2, @Nullable zzaf zzaf, int i3, @Nullable Object obj, long j, long j2) {
        zzrz zzrz2 = zzrz;
        mo48171e(zzrz, new zzse(1, -1, (zzaf) null, 0, (Object) null, m54907n(j), m54907n(j2)));
    }

    /* renamed from: g */
    public final void mo48173g(zzrz zzrz, zzse zzse) {
        Iterator it = this.f38446c.iterator();
        while (it.hasNext()) {
            zzsq zzsq = (zzsq) it.next();
            zzen.m49186y(zzsq.f38442a, new zzsp(this, zzsq.f38443b, zzrz, zzse));
        }
    }

    /* renamed from: h */
    public final void mo48174h(zzrz zzrz, int i, int i2, @Nullable zzaf zzaf, int i3, @Nullable Object obj, long j, long j2) {
        zzrz zzrz2 = zzrz;
        mo48173g(zzrz, new zzse(1, -1, (zzaf) null, 0, (Object) null, m54907n(j), m54907n(j2)));
    }

    /* renamed from: i */
    public final void mo48175i(zzrz zzrz, zzse zzse, IOException iOException, boolean z) {
        Iterator it = this.f38446c.iterator();
        while (it.hasNext()) {
            zzsq zzsq = (zzsq) it.next();
            zzen.m49186y(zzsq.f38442a, new zzsn(this, zzsq.f38443b, zzrz, zzse, iOException, z));
        }
    }

    /* renamed from: j */
    public final void mo48176j(zzrz zzrz, int i, int i2, @Nullable zzaf zzaf, int i3, @Nullable Object obj, long j, long j2, IOException iOException, boolean z) {
        zzrz zzrz2 = zzrz;
        mo48175i(zzrz, new zzse(1, -1, (zzaf) null, 0, (Object) null, m54907n(j), m54907n(j2)), iOException, z);
    }

    /* renamed from: k */
    public final void mo48177k(zzrz zzrz, zzse zzse) {
        Iterator it = this.f38446c.iterator();
        while (it.hasNext()) {
            zzsq zzsq = (zzsq) it.next();
            zzen.m49186y(zzsq.f38442a, new zzso(this, zzsq.f38443b, zzrz, zzse));
        }
    }

    /* renamed from: l */
    public final void mo48178l(zzrz zzrz, int i, int i2, @Nullable zzaf zzaf, int i3, @Nullable Object obj, long j, long j2) {
        zzrz zzrz2 = zzrz;
        mo48177k(zzrz, new zzse(1, -1, (zzaf) null, 0, (Object) null, m54907n(j), m54907n(j2)));
    }

    /* renamed from: m */
    public final void mo48179m(zzss zzss) {
        Iterator it = this.f38446c.iterator();
        while (it.hasNext()) {
            zzsq zzsq = (zzsq) it.next();
            if (zzsq.f38443b == zzss) {
                this.f38446c.remove(zzsq);
            }
        }
    }
}
