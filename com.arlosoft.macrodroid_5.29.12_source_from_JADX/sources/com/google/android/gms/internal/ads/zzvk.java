package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(32)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzvk {

    /* renamed from: a */
    private final Spatializer f38703a;

    /* renamed from: b */
    private final boolean f38704b;
    @Nullable

    /* renamed from: c */
    private Handler f38705c;
    @Nullable

    /* renamed from: d */
    private Spatializer.OnSpatializerStateChangedListener f38706d;

    private zzvk(Spatializer spatializer) {
        this.f38703a = spatializer;
        this.f38704b = spatializer.getImmersiveAudioLevel() != 0;
    }

    @Nullable
    /* renamed from: a */
    public static zzvk m55187a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new zzvk(audioManager.getSpatializer());
    }

    /* renamed from: b */
    public final void mo48299b(zzvr zzvr, Looper looper) {
        if (this.f38706d == null && this.f38705c == null) {
            this.f38706d = new zzvj(this, zzvr);
            Handler handler = new Handler(looper);
            this.f38705c = handler;
            this.f38703a.addOnSpatializerStateChangedListener(new zzvi(handler), this.f38706d);
        }
    }

    /* renamed from: c */
    public final void mo48300c() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f38706d;
        if (onSpatializerStateChangedListener != null && this.f38705c != null) {
            this.f38703a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            Handler handler = this.f38705c;
            int i = zzen.f34500a;
            handler.removeCallbacksAndMessages((Object) null);
            this.f38705c = null;
            this.f38706d = null;
        }
    }

    /* renamed from: d */
    public final boolean mo48301d(zzk zzk, zzaf zzaf) {
        int i;
        if (!"audio/eac3-joc".equals(zzaf.f24213l) || zzaf.f24226y != 16) {
            i = zzaf.f24226y;
        } else {
            i = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzen.m49145T(i));
        int i2 = zzaf.f24227z;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        return this.f38703a.canBeSpatialized(zzk.mo47767a().f37480a, channelMask.build());
    }

    /* renamed from: e */
    public final boolean mo48302e() {
        return this.f38703a.isAvailable();
    }

    /* renamed from: f */
    public final boolean mo48303f() {
        return this.f38703a.isEnabled();
    }

    /* renamed from: g */
    public final boolean mo48304g() {
        return this.f38704b;
    }
}
