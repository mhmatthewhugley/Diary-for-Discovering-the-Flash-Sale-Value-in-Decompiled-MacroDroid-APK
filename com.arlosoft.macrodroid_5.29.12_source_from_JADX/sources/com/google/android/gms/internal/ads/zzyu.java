package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzyu {

    /* renamed from: a */
    protected final zzyo f39005a;

    /* renamed from: b */
    protected final zzyt f39006b;
    @Nullable

    /* renamed from: c */
    protected zzyq f39007c;

    /* renamed from: d */
    private final int f39008d;

    protected zzyu(zzyr zzyr, zzyt zzyt, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f39006b = zzyt;
        this.f39008d = i;
        this.f39005a = new zzyo(zzyr, j, 0, j3, j4, j5, j6);
    }

    /* renamed from: f */
    protected static final int m55463f(zzzj zzzj, long j, zzaai zzaai) {
        if (j == zzzj.mo41252c()) {
            return 0;
        }
        zzaai.f23733a = j;
        return 1;
    }

    /* renamed from: g */
    protected static final boolean m55464g(zzzj zzzj, long j) throws IOException {
        long c = j - zzzj.mo41252c();
        if (c < 0 || c > 262144) {
            return false;
        }
        ((zzyy) zzzj).mo48459p((int) c, false);
        return true;
    }

    /* renamed from: a */
    public final int mo48444a(zzzj zzzj, zzaai zzaai) throws IOException {
        while (true) {
            zzyq zzyq = this.f39007c;
            zzdd.m47208b(zzyq);
            long b = zzyq.f38998f;
            long a = zzyq.f38999g;
            long c = zzyq.f39000h;
            if (a - b <= ((long) this.f39008d)) {
                mo48446c(false, b);
                return m55463f(zzzj, b, zzaai);
            } else if (!m55464g(zzzj, c)) {
                return m55463f(zzzj, c, zzaai);
            } else {
                zzzj.mo48452h();
                zzys a2 = this.f39006b.mo41243a(zzzj, zzyq.f38994b);
                int a3 = a2.f39002a;
                if (a3 == -3) {
                    mo48446c(false, c);
                    return m55463f(zzzj, c, zzaai);
                } else if (a3 == -2) {
                    zzyq.m55453h(zzyq, a2.f39003b, a2.f39004c);
                } else if (a3 != -1) {
                    m55464g(zzzj, a2.f39004c);
                    mo48446c(true, a2.f39004c);
                    return m55463f(zzzj, a2.f39004c, zzaai);
                } else {
                    zzyq.m55452g(zzyq, a2.f39003b, a2.f39004c);
                }
            }
        }
    }

    /* renamed from: b */
    public final zzaal mo48445b() {
        return this.f39005a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo48446c(boolean z, long j) {
        this.f39007c = null;
        this.f39006b.zzb();
    }

    /* renamed from: d */
    public final void mo48447d(long j) {
        long j2 = j;
        zzyq zzyq = this.f39007c;
        if (zzyq == null || zzyq.f38993a != j2) {
            long i = this.f39005a.mo48443i(j2);
            zzyo zzyo = this.f39005a;
            zzyq zzyq2 = r1;
            zzyq zzyq3 = new zzyq(j, i, 0, zzyo.f38989c, zzyo.f38990d, zzyo.f38991e, zzyo.f38992f);
            this.f39007c = zzyq2;
        }
    }

    /* renamed from: e */
    public final boolean mo48448e() {
        return this.f39007c != null;
    }
}
