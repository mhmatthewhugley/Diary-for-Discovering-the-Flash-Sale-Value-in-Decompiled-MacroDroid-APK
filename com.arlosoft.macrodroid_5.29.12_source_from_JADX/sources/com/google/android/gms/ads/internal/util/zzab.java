package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzab {

    /* renamed from: a */
    private boolean f2141a = false;

    /* renamed from: b */
    private float f2142b = 1.0f;

    /* renamed from: b */
    public static float m2520b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }

    /* renamed from: f */
    private final synchronized boolean m2521f() {
        return this.f2142b >= 0.0f;
    }

    /* renamed from: a */
    public final synchronized float mo20256a() {
        if (!m2521f()) {
            return 1.0f;
        }
        return this.f2142b;
    }

    /* renamed from: c */
    public final synchronized void mo20257c(boolean z) {
        this.f2141a = z;
    }

    /* renamed from: d */
    public final synchronized void mo20258d(float f) {
        this.f2142b = f;
    }

    /* renamed from: e */
    public final synchronized boolean mo20259e() {
        return this.f2141a;
    }
}
