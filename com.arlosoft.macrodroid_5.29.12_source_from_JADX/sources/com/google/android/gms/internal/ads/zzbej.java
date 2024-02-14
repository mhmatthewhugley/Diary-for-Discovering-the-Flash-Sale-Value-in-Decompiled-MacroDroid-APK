package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbej implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a */
    final /* synthetic */ zzbeb f26697a;

    /* renamed from: c */
    final /* synthetic */ zzchh f26698c;

    /* renamed from: d */
    final /* synthetic */ zzbel f26699d;

    zzbej(zzbel zzbel, zzbeb zzbeb, zzchh zzchh) {
        this.f26699d = zzbel;
        this.f26697a = zzbeb;
        this.f26698c = zzchh;
    }

    /* renamed from: t1 */
    public final void mo21659t1(int i) {
    }

    /* renamed from: y */
    public final void mo21660y(@Nullable Bundle bundle) {
        synchronized (this.f26699d.f26705d) {
            zzbel zzbel = this.f26699d;
            if (!zzbel.f26703b) {
                zzbel.f26703b = true;
                zzbea a = this.f26699d.f26702a;
                if (a != null) {
                    zzfzp I = zzchc.f28456a.mo46580I(new zzbeg(this, a, this.f26697a, this.f26698c));
                    zzchh zzchh = this.f26698c;
                    zzchh.mo43580q(new zzbeh(zzchh, I), zzchc.f28461f);
                }
            }
        }
    }
}
