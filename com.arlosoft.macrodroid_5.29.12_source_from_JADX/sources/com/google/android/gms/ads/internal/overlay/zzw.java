package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzcmp;
import com.google.android.gms.internal.ads.zzfqq;
import com.google.android.gms.internal.ads.zzfqr;
import com.google.android.gms.internal.ads.zzfqs;
import com.google.android.gms.internal.ads.zzfqt;
import com.google.android.gms.internal.ads.zzfrc;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfrf;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfrh;
import com.google.android.gms.internal.ads.zzfsb;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzw {
    @Nullable

    /* renamed from: a */
    private String f2130a = null;
    @Nullable

    /* renamed from: b */
    private String f2131b = null;
    @Nullable

    /* renamed from: c */
    private zzcmp f2132c = null;
    @Nullable

    /* renamed from: d */
    private zzfqs f2133d = null;

    /* renamed from: e */
    private boolean f2134e = false;

    /* renamed from: f */
    private zzfrf f2135f;

    /* renamed from: l */
    private final zzfrh m2478l() {
        zzfrg c = zzfrh.m50863c();
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27005T8)).booleanValue() || TextUtils.isEmpty(this.f2131b)) {
            String str = this.f2130a;
            if (str != null) {
                c.mo46120b(str);
            } else {
                mo20234f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            c.mo46119a(this.f2131b);
        }
        return c.mo46121c();
    }

    /* renamed from: m */
    private final void m2479m() {
        if (this.f2135f == null) {
            this.f2135f = new zzv(this);
        }
    }

    /* renamed from: a */
    public final synchronized void mo20229a(@Nullable zzcmp zzcmp, Context context) {
        this.f2132c = zzcmp;
        if (!mo20239k(context)) {
            mo20234f("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        mo20233e("on_play_store_bind", hashMap);
    }

    /* renamed from: b */
    public final void mo20230b() {
        zzfqs zzfqs;
        if (!this.f2134e || (zzfqs = this.f2133d) == null) {
            zze.m2645k("LastMileDelivery not connected");
            return;
        }
        zzfqs.mo46130d(m2478l(), this.f2135f);
        mo20232d("onLMDOverlayCollapse");
    }

    /* renamed from: c */
    public final void mo20231c() {
        zzfqs zzfqs;
        if (!this.f2134e || (zzfqs = this.f2133d) == null) {
            zze.m2645k("LastMileDelivery not connected");
            return;
        }
        zzfqq c = zzfqr.m50812c();
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27005T8)).booleanValue() || TextUtils.isEmpty(this.f2131b)) {
            String str = this.f2130a;
            if (str != null) {
                c.mo46083b(str);
            } else {
                mo20234f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            c.mo46082a(this.f2131b);
        }
        zzfqs.mo46127a(c.mo46084c(), this.f2135f);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: d */
    public final void mo20232d(String str) {
        mo20233e(str, new HashMap());
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: e */
    public final void mo20233e(String str, Map map) {
        zzchc.f28460e.execute(new zzu(this, str, map));
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: f */
    public final void mo20234f(String str, String str2) {
        zze.m2645k(str);
        if (this.f2132c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            mo20233e("onError", hashMap);
        }
    }

    /* renamed from: g */
    public final void mo20235g() {
        zzfqs zzfqs;
        if (!this.f2134e || (zzfqs = this.f2133d) == null) {
            zze.m2645k("LastMileDelivery not connected");
            return;
        }
        zzfqs.mo46128b(m2478l(), this.f2135f);
        mo20232d("onLMDOverlayExpand");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo20236h(String str, Map map) {
        zzcmp zzcmp = this.f2132c;
        if (zzcmp != null) {
            zzcmp.mo42954y(str, map);
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: i */
    public final void mo20237i(zzfre zzfre) {
        if (!TextUtils.isEmpty(zzfre.mo46115b())) {
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27005T8)).booleanValue()) {
                this.f2130a = zzfre.mo46115b();
            }
        }
        switch (zzfre.mo46114a()) {
            case 8152:
                mo20232d("onLMDOverlayOpened");
                return;
            case 8153:
                mo20232d("onLMDOverlayClicked");
                return;
            case 8155:
                mo20232d("onLMDOverlayClose");
                return;
            case 8157:
                this.f2130a = null;
                this.f2131b = null;
                this.f2134e = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzfre.mo46114a()));
                mo20233e("onLMDOverlayFailedToOpen", hashMap);
                return;
            default:
                return;
        }
    }

    /* renamed from: j */
    public final void mo20238j(@Nullable zzcmp zzcmp, @Nullable zzfrc zzfrc) {
        if (zzcmp == null) {
            mo20234f("adWebview missing", "onLMDShow");
            return;
        }
        this.f2132c = zzcmp;
        if (this.f2134e || mo20239k(zzcmp.getContext())) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27005T8)).booleanValue()) {
                this.f2131b = zzfrc.mo46106g();
            }
            m2479m();
            zzfqs zzfqs = this.f2133d;
            if (zzfqs != null) {
                zzfqs.mo46129c(zzfrc, this.f2135f);
                return;
            }
            return;
        }
        mo20234f("LMDOverlay not bound", "on_play_store_bind");
    }

    /* renamed from: k */
    public final synchronized boolean mo20239k(Context context) {
        if (!zzfsb.m50910a(context)) {
            return false;
        }
        try {
            this.f2133d = zzfqt.m50819a(context);
        } catch (NullPointerException e) {
            zze.m2645k("Error connecting LMD Overlay service");
            zzt.m2904q().mo43503t(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f2133d == null) {
            this.f2134e = false;
            return false;
        }
        m2479m();
        this.f2134e = true;
        return true;
    }
}
