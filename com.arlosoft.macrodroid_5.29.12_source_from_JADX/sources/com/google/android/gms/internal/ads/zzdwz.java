package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdwz implements zzdhr, zza, zzddu, zzdde {

    /* renamed from: a */
    private final Context f33284a;

    /* renamed from: c */
    private final zzfeu f33285c;

    /* renamed from: d */
    private final zzdxq f33286d;

    /* renamed from: f */
    private final zzfdw f33287f;

    /* renamed from: g */
    private final zzfdk f33288g;

    /* renamed from: o */
    private final zzego f33289o;
    @Nullable

    /* renamed from: p */
    private Boolean f33290p;

    /* renamed from: s */
    private final boolean f33291s = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27012U5)).booleanValue();

    public zzdwz(Context context, zzfeu zzfeu, zzdxq zzdxq, zzfdw zzfdw, zzfdk zzfdk, zzego zzego) {
        this.f33284a = context;
        this.f33285c = zzfeu;
        this.f33286d = zzdxq;
        this.f33287f = zzfdw;
        this.f33288g = zzfdk;
        this.f33289o = zzego;
    }

    /* renamed from: a */
    private final zzdxp m48291a(String str) {
        zzdxp a = this.f33286d.mo45050a();
        a.mo45044e(this.f33287f.f35590b.f35587b);
        a.mo45043d(this.f33288g);
        a.mo45041b("action", str);
        boolean z = false;
        if (!this.f33288g.f35555u.isEmpty()) {
            a.mo45041b("ancn", (String) this.f33288g.f35555u.get(0));
        }
        if (this.f33288g.f35540k0) {
            a.mo45041b("device_connectivity", true != zzt.m2904q().mo43505v(this.f33284a) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            a.mo45041b("event_timestamp", String.valueOf(zzt.m2889b().mo21950a()));
            a.mo45041b("offline_ad", "1");
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27098d6)).booleanValue()) {
            if (zzf.m3063d(this.f33287f.f35589a.f35583a) != 1) {
                z = true;
            }
            a.mo45041b("scar", String.valueOf(z));
            if (z) {
                zzl zzl = this.f33287f.f35589a.f35583a.f35629d;
                a.mo45042c("ragent", zzl.f1988G);
                a.mo45042c("rtype", zzf.m3060a(zzf.m3061b(zzl)));
            }
        }
        return a;
    }

    /* renamed from: c */
    private final void m48292c(zzdxp zzdxp) {
        if (this.f33288g.f35540k0) {
            this.f33289o.mo45279f(new zzegq(zzt.m2889b().mo21950a(), this.f33287f.f35590b.f35587b.f35566b, zzdxp.mo45045f(), 2));
            return;
        }
        zzdxp.mo45046g();
    }

    /* renamed from: e */
    private final boolean m48293e() {
        if (this.f33290p == null) {
            synchronized (this) {
                if (this.f33290p == null) {
                    String str = (String) zzay.m1924c().mo42663b(zzbjc.f27183m1);
                    zzt.m2905r();
                    String L = zzs.m2738L(this.f33284a);
                    boolean z = false;
                    if (!(str == null || L == null)) {
                        try {
                            z = Pattern.matches(str, L);
                        } catch (RuntimeException e) {
                            zzt.m2904q().mo43503t(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f33290p = Boolean.valueOf(z);
                }
            }
        }
        return this.f33290p.booleanValue();
    }

    /* renamed from: b */
    public final void mo44544b() {
        if (m48293e()) {
            m48291a("adapter_impression").mo45046g();
        }
    }

    /* renamed from: d */
    public final void mo44546d() {
        if (m48293e()) {
            m48291a("adapter_shown").mo45046g();
        }
    }

    /* renamed from: j */
    public final void mo44390j() {
        if (m48293e() || this.f33288g.f35540k0) {
            m48292c(m48291a("impression"));
        }
    }

    public final void onAdClicked() {
        if (this.f33288g.f35540k0) {
            m48292c(m48291a("click"));
        }
    }

    /* renamed from: r */
    public final void mo44574r(zze zze) {
        zze zze2;
        if (this.f33291s) {
            zzdxp a = m48291a("ifts");
            a.mo45041b("reason", "adapter");
            int i = zze.f1934a;
            String str = zze.f1935c;
            if (zze.f1936d.equals("com.google.android.gms.ads") && (zze2 = zze.f1937f) != null && !zze2.f1936d.equals("com.google.android.gms.ads")) {
                zze zze3 = zze.f1937f;
                i = zze3.f1934a;
                str = zze3.f1935c;
            }
            if (i >= 0) {
                a.mo45041b("arec", String.valueOf(i));
            }
            String a2 = this.f33285c.mo45632a(str);
            if (a2 != null) {
                a.mo45041b("areec", a2);
            }
            a.mo45046g();
        }
    }

    /* renamed from: y0 */
    public final void mo44575y0(zzdmo zzdmo) {
        if (this.f33291s) {
            zzdxp a = m48291a("ifts");
            a.mo45041b("reason", "exception");
            if (!TextUtils.isEmpty(zzdmo.getMessage())) {
                a.mo45041b(NotificationCompat.CATEGORY_MESSAGE, zzdmo.getMessage());
            }
            a.mo45046g();
        }
    }

    public final void zzb() {
        if (this.f33291s) {
            zzdxp a = m48291a("ifts");
            a.mo45041b("reason", "blocked");
            a.mo45046g();
        }
    }
}
