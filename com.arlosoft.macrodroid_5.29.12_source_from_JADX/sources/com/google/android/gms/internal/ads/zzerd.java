package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzerd implements zzeve {

    /* renamed from: a */
    private final zzfzq f34765a;

    /* renamed from: b */
    private final Context f34766b;

    public zzerd(zzfzq zzfzq, Context context) {
        this.f34765a = zzfzq;
        this.f34766b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzere mo45442a() throws Exception {
        int i;
        AudioManager audioManager = (AudioManager) this.f34766b.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        int i2 = -1;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26845D8)).booleanValue()) {
            i = zzt.m2906s().mo20253h(audioManager);
            i2 = audioManager.getStreamMaxVolume(3);
        } else {
            i = -1;
        }
        return new zzere(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i, i2, audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzt.m2907t().mo20256a(), zzt.m2907t().mo20259e());
    }

    public final int zza() {
        return 13;
    }

    public final zzfzp zzb() {
        return this.f34765a.mo46579F(new zzerc(this));
    }
}
