package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzkl {

    /* renamed from: a */
    private final Context f37750a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f37751b;

    /* renamed from: c */
    private final zzkh f37752c;

    /* renamed from: d */
    private final AudioManager f37753d;
    @Nullable

    /* renamed from: e */
    private zzkk f37754e;

    /* renamed from: f */
    private int f37755f = 3;

    /* renamed from: g */
    private int f37756g;

    /* renamed from: h */
    private boolean f37757h;

    public zzkl(Context context, Handler handler, zzkh zzkh) {
        Context applicationContext = context.getApplicationContext();
        this.f37750a = applicationContext;
        this.f37751b = handler;
        this.f37752c = zzkh;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        zzdd.m47208b(audioManager);
        this.f37753d = audioManager;
        this.f37756g = m54064g(audioManager, 3);
        this.f37757h = m54066i(audioManager, this.f37755f);
        zzkk zzkk = new zzkk(this, (zzkj) null);
        try {
            zzen.m49152a(applicationContext, zzkk, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f37754e = zzkk;
        } catch (RuntimeException e) {
            zzdw.m48256f("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* renamed from: g */
    private static int m54064g(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            zzdw.m48256f("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m54065h() {
        int g = m54064g(this.f37753d, this.f37755f);
        boolean i = m54066i(this.f37753d, this.f37755f);
        if (this.f37756g != g || this.f37757h != i) {
            this.f37756g = g;
            this.f37757h = i;
            zzdt w0 = ((zzip) this.f37752c).f37499a.f37547k;
            w0.mo44968d(30, new zzik(g, i));
            w0.mo44967c();
        }
    }

    /* renamed from: i */
    private static boolean m54066i(AudioManager audioManager, int i) {
        if (zzen.f34500a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return m54064g(audioManager, i) == 0;
    }

    /* renamed from: a */
    public final int mo47802a() {
        return this.f37753d.getStreamMaxVolume(this.f37755f);
    }

    /* renamed from: b */
    public final int mo47803b() {
        if (zzen.f34500a >= 28) {
            return this.f37753d.getStreamMinVolume(this.f37755f);
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo47804e() {
        zzkk zzkk = this.f37754e;
        if (zzkk != null) {
            try {
                this.f37750a.unregisterReceiver(zzkk);
            } catch (RuntimeException e) {
                zzdw.m48256f("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f37754e = null;
        }
    }

    /* renamed from: f */
    public final void mo47805f(int i) {
        if (this.f37755f != 3) {
            this.f37755f = 3;
            m54065h();
            zzip zzip = (zzip) this.f37752c;
            zzt v0 = zzit.m53746d0(zzip.f37499a.f37561y);
            if (!v0.equals(zzip.f37499a.f37531b0)) {
                zzip.f37499a.f37531b0 = v0;
                zzdt w0 = zzip.f37499a.f37547k;
                w0.mo44968d(29, new zzil(v0));
                w0.mo44967c();
            }
        }
    }
}
