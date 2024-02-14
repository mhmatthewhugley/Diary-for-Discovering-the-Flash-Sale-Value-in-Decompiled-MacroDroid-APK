package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgq {

    /* renamed from: a */
    private final AudioManager f37022a;

    /* renamed from: b */
    private final zzgo f37023b;
    @Nullable

    /* renamed from: c */
    private zzgp f37024c;

    /* renamed from: d */
    private int f37025d;

    /* renamed from: e */
    private float f37026e = 1.0f;

    public zzgq(Context context, Handler handler, zzgp zzgp) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.f37022a = audioManager;
        this.f37024c = zzgp;
        this.f37023b = new zzgo(this, handler);
        this.f37025d = 0;
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m52623c(zzgq zzgq, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzgq.m52626g(3);
                return;
            }
            zzgq.m52625f(0);
            zzgq.m52626g(2);
        } else if (i == -1) {
            zzgq.m52625f(-1);
            zzgq.m52624e();
        } else if (i != 1) {
            zzdw.m48255e("AudioFocusManager", "Unknown focus change type: " + i);
        } else {
            zzgq.m52626g(1);
            zzgq.m52625f(1);
        }
    }

    /* renamed from: e */
    private final void m52624e() {
        if (this.f37025d != 0) {
            if (zzen.f34500a < 26) {
                this.f37022a.abandonAudioFocus(this.f37023b);
            }
            m52626g(0);
        }
    }

    /* renamed from: f */
    private final void m52625f(int i) {
        zzgp zzgp = this.f37024c;
        if (zzgp != null) {
            zzip zzip = (zzip) zzgp;
            boolean s = zzip.f37499a.mo43528s();
            zzip.f37499a.m53754l0(s, i, zzit.m53741Y(s, i));
        }
    }

    /* renamed from: g */
    private final void m52626g(int i) {
        if (this.f37025d != i) {
            this.f37025d = i;
            float f = i == 3 ? 0.2f : 1.0f;
            if (this.f37026e != f) {
                this.f37026e = f;
                zzgp zzgp = this.f37024c;
                if (zzgp != null) {
                    ((zzip) zzgp).f37499a.m53751i0();
                }
            }
        }
    }

    /* renamed from: a */
    public final float mo47143a() {
        return this.f37026e;
    }

    /* renamed from: b */
    public final int mo47144b(boolean z, int i) {
        m52624e();
        return z ? 1 : -1;
    }

    /* renamed from: d */
    public final void mo47145d() {
        this.f37024c = null;
        m52624e();
    }
}
