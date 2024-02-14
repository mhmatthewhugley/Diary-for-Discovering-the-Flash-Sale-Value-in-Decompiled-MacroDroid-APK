package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzees implements zzdhr, zza, zzddu, zzdde {

    /* renamed from: a */
    private final Context f33837a;

    /* renamed from: c */
    private final zzfeu f33838c;

    /* renamed from: d */
    private final zzfdw f33839d;

    /* renamed from: f */
    private final zzfdk f33840f;

    /* renamed from: g */
    private final zzego f33841g;
    @Nullable

    /* renamed from: o */
    private Boolean f33842o;

    /* renamed from: p */
    private final boolean f33843p = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27012U5)).booleanValue();
    @NonNull

    /* renamed from: s */
    private final zzfir f33844s;

    /* renamed from: z */
    private final String f33845z;

    public zzees(Context context, zzfeu zzfeu, zzfdw zzfdw, zzfdk zzfdk, zzego zzego, @NonNull zzfir zzfir, String str) {
        this.f33837a = context;
        this.f33838c = zzfeu;
        this.f33839d = zzfdw;
        this.f33840f = zzfdk;
        this.f33841g = zzego;
        this.f33844s = zzfir;
        this.f33845z = str;
    }

    /* renamed from: a */
    private final zzfiq m48680a(String str) {
        zzfiq b = zzfiq.m50227b(str);
        b.mo45779h(this.f33839d, (zzcgc) null);
        b.mo45777f(this.f33840f);
        b.mo45774a("request_id", this.f33845z);
        if (!this.f33840f.f35555u.isEmpty()) {
            b.mo45774a("ancn", (String) this.f33840f.f35555u.get(0));
        }
        if (this.f33840f.f35540k0) {
            b.mo45774a("device_connectivity", true != zzt.m2904q().mo43505v(this.f33837a) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            b.mo45774a("event_timestamp", String.valueOf(zzt.m2889b().mo21950a()));
            b.mo45774a("offline_ad", "1");
        }
        return b;
    }

    /* renamed from: c */
    private final void m48681c(zzfiq zzfiq) {
        if (this.f33840f.f35540k0) {
            this.f33841g.mo45279f(new zzegq(zzt.m2889b().mo21950a(), this.f33839d.f35590b.f35587b.f35566b, this.f33844s.mo45783b(zzfiq), 2));
            return;
        }
        this.f33844s.mo45782a(zzfiq);
    }

    /* renamed from: e */
    private final boolean m48682e() {
        if (this.f33842o == null) {
            synchronized (this) {
                if (this.f33842o == null) {
                    String str = (String) zzay.m1924c().mo42663b(zzbjc.f27183m1);
                    zzt.m2905r();
                    String L = zzs.m2738L(this.f33837a);
                    boolean z = false;
                    if (!(str == null || L == null)) {
                        try {
                            z = Pattern.matches(str, L);
                        } catch (RuntimeException e) {
                            zzt.m2904q().mo43503t(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f33842o = Boolean.valueOf(z);
                }
            }
        }
        return this.f33842o.booleanValue();
    }

    /* renamed from: b */
    public final void mo44544b() {
        if (m48682e()) {
            this.f33844s.mo45782a(m48680a("adapter_impression"));
        }
    }

    /* renamed from: d */
    public final void mo44546d() {
        if (m48682e()) {
            this.f33844s.mo45782a(m48680a("adapter_shown"));
        }
    }

    /* renamed from: j */
    public final void mo44390j() {
        if (m48682e() || this.f33840f.f35540k0) {
            m48681c(m48680a("impression"));
        }
    }

    public final void onAdClicked() {
        if (this.f33840f.f35540k0) {
            m48681c(m48680a("click"));
        }
    }

    /* renamed from: r */
    public final void mo44574r(zze zze) {
        zze zze2;
        if (this.f33843p) {
            int i = zze.f1934a;
            String str = zze.f1935c;
            if (zze.f1936d.equals("com.google.android.gms.ads") && (zze2 = zze.f1937f) != null && !zze2.f1936d.equals("com.google.android.gms.ads")) {
                zze zze3 = zze.f1937f;
                i = zze3.f1934a;
                str = zze3.f1935c;
            }
            String a = this.f33838c.mo45632a(str);
            zzfiq a2 = m48680a("ifts");
            a2.mo45774a("reason", "adapter");
            if (i >= 0) {
                a2.mo45774a("arec", String.valueOf(i));
            }
            if (a != null) {
                a2.mo45774a("areec", a);
            }
            this.f33844s.mo45782a(a2);
        }
    }

    /* renamed from: y0 */
    public final void mo44575y0(zzdmo zzdmo) {
        if (this.f33843p) {
            zzfiq a = m48680a("ifts");
            a.mo45774a("reason", "exception");
            if (!TextUtils.isEmpty(zzdmo.getMessage())) {
                a.mo45774a(NotificationCompat.CATEGORY_MESSAGE, zzdmo.getMessage());
            }
            this.f33844s.mo45782a(a);
        }
    }

    public final void zzb() {
        if (this.f33843p) {
            zzfir zzfir = this.f33844s;
            zzfiq a = m48680a("ifts");
            a.mo45774a("reason", "blocked");
            zzfir.mo45782a(a);
        }
    }
}
