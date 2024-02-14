package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdmu implements zzdda, zzdjx {

    /* renamed from: a */
    private final zzcec f32479a;

    /* renamed from: c */
    private final Context f32480c;

    /* renamed from: d */
    private final zzceu f32481d;
    @Nullable

    /* renamed from: f */
    private final View f32482f;

    /* renamed from: g */
    private String f32483g;

    /* renamed from: o */
    private final zzbez f32484o;

    public zzdmu(zzcec zzcec, Context context, zzceu zzceu, @Nullable View view, zzbez zzbez) {
        this.f32479a = zzcec;
        this.f32480c = context;
        this.f32481d = zzceu;
        this.f32482f = view;
        this.f32484o = zzbez;
    }

    /* renamed from: H */
    public final void mo44387H() {
    }

    /* renamed from: c */
    public final void mo44545c() {
    }

    /* renamed from: f */
    public final void mo44548f() {
        if (this.f32484o != zzbez.APP_OPEN) {
            String i = this.f32481d.mo43432i(this.f32480c);
            this.f32483g = i;
            this.f32483g = String.valueOf(i).concat(this.f32484o == zzbez.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }

    /* renamed from: h */
    public final void mo44389h() {
        this.f32479a.mo43422b(false);
    }

    /* renamed from: k */
    public final void mo44391k() {
    }

    /* renamed from: l */
    public final void mo44392l() {
        View view = this.f32482f;
        if (!(view == null || this.f32483g == null)) {
            this.f32481d.mo43447x(view.getContext(), this.f32483g);
        }
        this.f32479a.mo43422b(true);
    }

    /* renamed from: q */
    public final void mo44395q() {
    }

    /* renamed from: x */
    public final void mo44398x(zzcbs zzcbs, String str, String str2) {
        if (this.f32481d.mo43449z(this.f32480c)) {
            try {
                zzceu zzceu = this.f32481d;
                Context context = this.f32480c;
                zzceu.mo43443t(context, zzceu.mo43429f(context), this.f32479a.mo43421a(), zzcbs.mo43291a(), zzcbs.zzb());
            } catch (RemoteException e) {
                zzcgp.m45230h("Remote Exception to get reward item.", e);
            }
        }
    }
}
