package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbsz implements zzbsr, zzbsp {

    /* renamed from: a */
    private final zzcmp f27723a;

    public zzbsz(Context context, zzcgv zzcgv, @Nullable zzape zzape, zza zza) throws zzcna {
        zzt.m2887B();
        zzcmp a = zzcnb.m45940a(context, zzcoe.m46199a(), "", false, false, (zzape) null, (zzbkb) null, zzcgv, (zzbjr) null, (zzl) null, (zza) null, zzbep.m43241a(), (zzfdk) null, (zzfdn) null);
        this.f27723a = a;
        ((View) a).setWillNotDraw(true);
    }

    /* renamed from: I */
    private static final void m44069I(Runnable runnable) {
        zzaw.m1917b();
        if (zzcgi.m45184t()) {
            runnable.run();
        } else {
            zzs.f2304i.post(runnable);
        }
    }

    /* renamed from: J0 */
    public final void mo42969J0(String str, zzbpu zzbpu) {
        this.f27723a.mo44026Q0(str, new zzbst(zzbpu));
    }

    /* renamed from: L0 */
    public final void mo42970L0(String str, zzbpu zzbpu) {
        this.f27723a.mo44064o0(str, new zzbsy(this, zzbpu));
    }

    /* renamed from: W */
    public final void mo42957W(String str) {
        m44069I(new zzbsv(this, str));
    }

    /* renamed from: a */
    public final void mo42958a() {
        this.f27723a.destroy();
    }

    /* renamed from: b */
    public final /* synthetic */ void mo42953b(String str, JSONObject jSONObject) {
        zzbso.m44054b(this, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo42971d(String str) {
        this.f27723a.mo42955o(str);
    }

    /* renamed from: d1 */
    public final /* synthetic */ void mo42972d1(String str, JSONObject jSONObject) {
        zzbso.m44056d(this, str, jSONObject);
    }

    /* renamed from: e1 */
    public final void mo42959e1(zzbtf zzbtf) {
        this.f27723a.mo44044e0().mo44099d0(new zzbss(zzbtf, (byte[]) null));
    }

    /* renamed from: g */
    public final boolean mo42960g() {
        return this.f27723a.mo44037X0();
    }

    /* renamed from: h */
    public final zzbty mo42961h() {
        return new zzbty(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo42973j(String str) {
        this.f27723a.loadData(str, "text/html", "UTF-8");
    }

    /* renamed from: o */
    public final void mo42955o(String str) {
        m44069I(new zzbsu(this, str));
    }

    /* renamed from: q */
    public final /* synthetic */ void mo42956q(String str, String str2) {
        zzbso.m44055c(this, str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final /* synthetic */ void mo42974s(String str) {
        this.f27723a.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final /* synthetic */ void mo42975v(String str) {
        this.f27723a.loadData(str, "text/html", "UTF-8");
    }

    /* renamed from: w0 */
    public final void mo42962w0(String str) {
        m44069I(new zzbsw(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    /* renamed from: y */
    public final /* synthetic */ void mo42954y(String str, Map map) {
        zzbso.m44053a(this, str, map);
    }

    /* renamed from: z0 */
    public final void mo42963z0(String str) {
        m44069I(new zzbsx(this, str));
    }
}
