package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzoa {
    @Nullable

    /* renamed from: a */
    private final zznz f37987a;

    /* renamed from: b */
    private int f37988b;

    /* renamed from: c */
    private long f37989c;

    /* renamed from: d */
    private long f37990d;

    /* renamed from: e */
    private long f37991e;

    /* renamed from: f */
    private long f37992f;

    public zzoa(AudioTrack audioTrack) {
        int i = zzen.f34500a;
        this.f37987a = new zznz(audioTrack);
        m54366h(0);
    }

    /* renamed from: h */
    private final void m54366h(int i) {
        this.f37988b = i;
        long j = WorkRequest.MIN_BACKOFF_MILLIS;
        if (i == 0) {
            this.f37991e = 0;
            this.f37992f = -1;
            this.f37989c = System.nanoTime() / 1000;
        } else if (i != 1) {
            j = (i == 2 || i == 3) ? 10000000 : 500000;
        } else {
            this.f37990d = WorkRequest.MIN_BACKOFF_MILLIS;
            return;
        }
        this.f37990d = j;
    }

    /* renamed from: a */
    public final long mo47938a() {
        return this.f37987a.mo47935a();
    }

    /* renamed from: b */
    public final long mo47939b() {
        return this.f37987a.mo47936b();
    }

    /* renamed from: c */
    public final void mo47940c() {
        if (this.f37988b == 4) {
            m54366h(0);
        }
    }

    /* renamed from: d */
    public final void mo47941d() {
        m54366h(4);
    }

    /* renamed from: e */
    public final void mo47942e() {
        m54366h(0);
    }

    /* renamed from: f */
    public final boolean mo47943f() {
        return this.f37988b == 2;
    }

    /* renamed from: g */
    public final boolean mo47944g(long j) {
        zznz zznz = this.f37987a;
        if (j - this.f37991e < this.f37990d) {
            return false;
        }
        this.f37991e = j;
        boolean c = zznz.mo47937c();
        int i = this.f37988b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (!c) {
                            return false;
                        }
                        m54366h(0);
                        return true;
                    }
                } else if (c) {
                    return true;
                } else {
                    m54366h(0);
                    return false;
                }
            } else if (!c) {
                m54366h(0);
            } else if (this.f37987a.mo47935a() > this.f37992f) {
                m54366h(2);
                return true;
            }
        } else if (c) {
            if (this.f37987a.mo47936b() < this.f37989c) {
                return false;
            }
            this.f37992f = this.f37987a.mo47935a();
            m54366h(1);
            return true;
        } else if (j - this.f37989c > 500000) {
            m54366h(3);
            return false;
        }
        return c;
    }
}
