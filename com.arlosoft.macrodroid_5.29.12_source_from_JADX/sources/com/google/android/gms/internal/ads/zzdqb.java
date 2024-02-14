package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdqb {

    /* renamed from: a */
    private final zzduy f32771a;

    /* renamed from: b */
    private final zzdtn f32772b;

    /* renamed from: c */
    private final zzcvu f32773c;

    /* renamed from: d */
    private final zzdoy f32774d;

    public zzdqb(zzduy zzduy, zzdtn zzdtn, zzcvu zzcvu, zzdoy zzdoy) {
        this.f32771a = zzduy;
        this.f32772b = zzdtn;
        this.f32773c = zzcvu;
        this.f32774d = zzdoy;
    }

    /* renamed from: a */
    public final View mo44910a() throws zzcna {
        zzcmp a = this.f32771a.mo45004a(zzq.m2419n2(), (zzfdk) null, (zzfdn) null);
        ((View) a).setVisibility(8);
        a.mo44064o0("/sendMessageToSdk", new zzdpv(this));
        a.mo44064o0("/adMuted", new zzdpw(this));
        this.f32772b.mo44981j(new WeakReference(a), "/loadHtml", new zzdpx(this));
        this.f32772b.mo44981j(new WeakReference(a), "/showOverlay", new zzdpy(this));
        this.f32772b.mo44981j(new WeakReference(a), "/hideOverlay", new zzdpz(this));
        return (View) a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo44911b(zzcmp zzcmp, Map map) {
        this.f32772b.mo44978g("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo44912c(zzcmp zzcmp, Map map) {
        this.f32774d.mo44738c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo44913d(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f32772b.mo44978g("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo44914e(zzcmp zzcmp, Map map) {
        zzcgp.m45228f("Showing native ads overlay.");
        zzcmp.mo44027R().setVisibility(0);
        this.f32773c.mo44415d(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo44915f(zzcmp zzcmp, Map map) {
        zzcgp.m45228f("Hiding native ads overlay.");
        zzcmp.mo44027R().setVisibility(8);
        this.f32773c.mo44415d(false);
    }
}
