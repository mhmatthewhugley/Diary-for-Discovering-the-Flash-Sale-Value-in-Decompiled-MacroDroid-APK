package com.google.android.gms.internal.ads;

import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgw implements zzjh {

    /* renamed from: a */
    private final zzwi f37358a;

    /* renamed from: b */
    private final long f37359b = zzen.m49163f0(50000);

    /* renamed from: c */
    private final long f37360c = zzen.m49163f0(50000);

    /* renamed from: d */
    private final long f37361d = zzen.m49163f0(2500);

    /* renamed from: e */
    private final long f37362e = zzen.m49163f0(5000);

    /* renamed from: f */
    private final long f37363f = zzen.m49163f0(0);

    /* renamed from: g */
    private int f37364g = 13107200;

    /* renamed from: h */
    private boolean f37365h;

    public zzgw() {
        zzwi zzwi = new zzwi(true, 65536);
        m53570h(2500, 0, "bufferForPlaybackMs", "0");
        m53570h(SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m53570h(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m53570h(50000, SamsungIrisUnlockModule.IRIS_ERROR_NEED_TO_RETRY, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m53570h(50000, 50000, "maxBufferMs", "minBufferMs");
        m53570h(0, 0, "backBufferDurationMs", "0");
        this.f37358a = zzwi;
    }

    /* renamed from: h */
    private static void m53570h(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        zzdd.m47211e(z, str + " cannot be less than " + str2);
    }

    /* renamed from: i */
    private final void m53571i(boolean z) {
        this.f37364g = 13107200;
        this.f37365h = false;
        if (z) {
            this.f37358a.mo48342e();
        }
    }

    /* renamed from: a */
    public final void mo43930a() {
        m53571i(true);
    }

    /* renamed from: b */
    public final boolean mo43931b(long j, float f, boolean z, long j2) {
        long j3;
        long e0 = zzen.m49161e0(j, f);
        if (z) {
            j3 = this.f37362e;
        } else {
            j3 = this.f37361d;
        }
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || e0 >= j3 || this.f37358a.mo48338a() >= this.f37364g;
    }

    /* renamed from: c */
    public final boolean mo43932c() {
        return false;
    }

    /* renamed from: d */
    public final void mo43933d() {
        m53571i(true);
    }

    /* renamed from: e */
    public final boolean mo43934e(long j, long j2, float f) {
        int a = this.f37358a.mo48338a();
        int i = this.f37364g;
        long j3 = this.f37359b;
        if (f > 1.0f) {
            j3 = Math.min(zzen.m49157c0(j3, f), this.f37360c);
        }
        boolean z = false;
        if (j2 < Math.max(j3, 500000)) {
            if (a < i) {
                z = true;
            }
            this.f37365h = z;
            if (!z && j2 < 500000) {
                zzdw.m48255e("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f37360c || a >= i) {
            this.f37365h = false;
        }
        return this.f37365h;
    }

    /* renamed from: f */
    public final void mo43935f(zzka[] zzkaArr, zzuh zzuh, zzvt[] zzvtArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = zzkaArr.length;
            int i3 = 13107200;
            if (i < 2) {
                if (zzvtArr[i] != null) {
                    if (zzkaArr[i].zzb() != 1) {
                        i3 = 131072000;
                    }
                    i2 += i3;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.f37364g = max;
                this.f37358a.mo48343f(max);
                return;
            }
        }
    }

    /* renamed from: g */
    public final zzwi mo43936g() {
        return this.f37358a;
    }

    public final long zza() {
        return this.f37363f;
    }

    public final void zzb() {
        m53571i(false);
    }
}
