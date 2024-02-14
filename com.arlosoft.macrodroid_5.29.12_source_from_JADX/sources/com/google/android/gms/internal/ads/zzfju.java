package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfju implements Runnable {

    /* renamed from: a */
    private final List f35922a = new ArrayList();

    /* renamed from: c */
    private final zzfjw f35923c;

    /* renamed from: d */
    private String f35924d;

    /* renamed from: f */
    private String f35925f;

    /* renamed from: g */
    private zzfdv f35926g;

    /* renamed from: o */
    private zze f35927o;

    /* renamed from: p */
    private Future f35928p;

    /* renamed from: s */
    private int f35929s = 2;

    zzfju(zzfjw zzfjw) {
        this.f35923c = zzfjw;
    }

    /* renamed from: a */
    public final synchronized zzfju mo45822a(zzfjj zzfjj) {
        if (((Boolean) zzbkl.f27408c.mo42728e()).booleanValue()) {
            List list = this.f35922a;
            zzfjj.mo45796f();
            list.add(zzfjj);
            Future future = this.f35928p;
            if (future != null) {
                future.cancel(false);
            }
            this.f35928p = zzchc.f28459d.schedule(this, (long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f27319z7)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    /* renamed from: b */
    public final synchronized zzfju mo45823b(String str) {
        if (((Boolean) zzbkl.f27408c.mo42728e()).booleanValue() && zzfjt.m50322e(str)) {
            this.f35924d = str;
        }
        return this;
    }

    /* renamed from: c */
    public final synchronized zzfju mo45824c(zze zze) {
        if (((Boolean) zzbkl.f27408c.mo42728e()).booleanValue()) {
            this.f35927o = zze;
        }
        return this;
    }

    /* renamed from: d */
    public final synchronized zzfju mo45825d(ArrayList arrayList) {
        if (((Boolean) zzbkl.f27408c.mo42728e()).booleanValue()) {
            if (!arrayList.contains("banner")) {
                if (!arrayList.contains(AdFormat.BANNER.name())) {
                    if (!arrayList.contains("interstitial")) {
                        if (!arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                            if (!arrayList.contains("native")) {
                                if (!arrayList.contains(AdFormat.NATIVE.name())) {
                                    if (!arrayList.contains("rewarded")) {
                                        if (!arrayList.contains(AdFormat.REWARDED.name())) {
                                            if (arrayList.contains("app_open_ad")) {
                                                this.f35929s = 7;
                                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                                this.f35929s = 6;
                                            }
                                        }
                                    }
                                    this.f35929s = 5;
                                }
                            }
                            this.f35929s = 8;
                        }
                    }
                    this.f35929s = 4;
                }
            }
            this.f35929s = 3;
        }
        return this;
    }

    /* renamed from: e */
    public final synchronized zzfju mo45826e(String str) {
        if (((Boolean) zzbkl.f27408c.mo42728e()).booleanValue()) {
            this.f35925f = str;
        }
        return this;
    }

    /* renamed from: f */
    public final synchronized zzfju mo45827f(zzfdv zzfdv) {
        if (((Boolean) zzbkl.f27408c.mo42728e()).booleanValue()) {
            this.f35926g = zzfdv;
        }
        return this;
    }

    /* renamed from: g */
    public final synchronized void mo45828g() {
        if (((Boolean) zzbkl.f27408c.mo42728e()).booleanValue()) {
            Future future = this.f35928p;
            if (future != null) {
                future.cancel(false);
            }
            for (zzfjj zzfjj : this.f35922a) {
                int i = this.f35929s;
                if (i != 2) {
                    zzfjj.mo45802q0(i);
                }
                if (!TextUtils.isEmpty(this.f35924d)) {
                    zzfjj.mo45800h0(this.f35924d);
                }
                if (!TextUtils.isEmpty(this.f35925f) && !zzfjj.mo45798g()) {
                    zzfjj.mo45797f0(this.f35925f);
                }
                zzfdv zzfdv = this.f35926g;
                if (zzfdv != null) {
                    zzfjj.mo45793a(zzfdv);
                } else {
                    zze zze = this.f35927o;
                    if (zze != null) {
                        zzfjj.mo45803r(zze);
                    }
                }
                this.f35923c.mo45831b(zzfjj.mo45799h());
            }
            this.f35922a.clear();
        }
    }

    /* renamed from: h */
    public final synchronized zzfju mo45829h(int i) {
        if (((Boolean) zzbkl.f27408c.mo42728e()).booleanValue()) {
            this.f35929s = i;
        }
        return this;
    }

    public final synchronized void run() {
        mo45828g();
    }
}
