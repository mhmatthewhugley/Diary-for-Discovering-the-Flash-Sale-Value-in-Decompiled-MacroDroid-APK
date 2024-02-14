package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzebe {
    @VisibleForTesting

    /* renamed from: a */
    final Map f33621a = new HashMap();

    /* renamed from: b */
    private final Context f33622b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzeas f33623c;

    /* renamed from: d */
    private final zzfzq f33624d;

    /* renamed from: e */
    private zzeak f33625e;

    zzebe(Context context, zzeas zzeas, zzfzq zzfzq) {
        this.f33622b = context;
        this.f33623c = zzeas;
        this.f33624d = zzfzq;
    }

    /* renamed from: h */
    private static AdRequest m48543h() {
        return new AdRequest.Builder().mo19671c();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static String m48544i(Object obj) {
        ResponseInfo responseInfo;
        zzdh f;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).mo19724f();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).mo19777a();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).mo20461a();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).mo20711a();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).mo20715a();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (obj instanceof NativeAd) {
                responseInfo = ((NativeAd) obj).mo20590a();
            }
            return "";
        }
        if (responseInfo == null || (f = responseInfo.mo19745f()) == null) {
            return "";
        }
        try {
            return f.mo19994e();
        } catch (RemoteException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final synchronized void m48545j(String str, String str2) {
        try {
            zzfzg.m51423r(this.f33625e.mo45123b(str), new zzebc(this, str2), this.f33624d);
        } catch (NullPointerException e) {
            zzt.m2904q().mo43503t(e, "OutOfContextTester.setAdAsOutOfContext");
            this.f33623c.mo45142f(str2);
        }
    }

    /* renamed from: k */
    private final synchronized void m48546k(String str, String str2) {
        try {
            zzfzg.m51423r(this.f33625e.mo45123b(str), new zzebd(this, str2), this.f33624d);
        } catch (NullPointerException e) {
            zzt.m2904q().mo43503t(e, "OutOfContextTester.setAdAsShown");
            this.f33623c.mo45142f(str2);
        }
    }

    /* renamed from: d */
    public final void mo45143d(zzeak zzeak) {
        this.f33625e = zzeak;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final synchronized void mo45144e(String str, Object obj, String str2) {
        this.f33621a.put(str, obj);
        m48545j(m48544i(obj), str2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo45145f(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r8.hashCode()     // Catch:{ all -> 0x00dd }
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1999289321: goto L_0x0040;
                case -1372958932: goto L_0x0036;
                case -428325382: goto L_0x002c;
                case 543046670: goto L_0x0022;
                case 1854800829: goto L_0x0018;
                case 1951953708: goto L_0x000e;
                default: goto L_0x000d;
            }     // Catch:{ all -> 0x00dd }
        L_0x000d:
            goto L_0x004a
        L_0x000e:
            java.lang.String r0 = "BANNER"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 1
            goto L_0x004b
        L_0x0018:
            java.lang.String r0 = "REWARDED_INTERSTITIAL"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 5
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "REWARDED"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 4
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "APP_OPEN_AD"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 0
            goto L_0x004b
        L_0x0036:
            java.lang.String r0 = "INTERSTITIAL"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 2
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "NATIVE"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 3
            goto L_0x004b
        L_0x004a:
            r8 = -1
        L_0x004b:
            if (r8 == 0) goto L_0x00cd
            if (r8 == r5) goto L_0x00ad
            if (r8 == r4) goto L_0x009d
            if (r8 == r3) goto L_0x0079
            if (r8 == r2) goto L_0x0069
            if (r8 == r1) goto L_0x0059
            monitor-exit(r6)
            return
        L_0x0059:
            android.content.Context r8 = r6.f33622b     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.AdRequest r0 = m48543h()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzeba r1 = new com.google.android.gms.internal.ads.zzeba     // Catch:{ all -> 0x00dd }
            r1.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd.m3097b(r8, r7, r0, r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x0069:
            android.content.Context r8 = r6.f33622b     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.AdRequest r0 = m48543h()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzeaz r1 = new com.google.android.gms.internal.ads.zzeaz     // Catch:{ all -> 0x00dd }
            r1.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.rewarded.RewardedAd.m3094b(r8, r7, r0, r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x0079:
            com.google.android.gms.ads.AdLoader$Builder r8 = new com.google.android.gms.ads.AdLoader$Builder     // Catch:{ all -> 0x00dd }
            android.content.Context r0 = r6.f33622b     // Catch:{ all -> 0x00dd }
            r8.<init>(r0, r7)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzeav r0 = new com.google.android.gms.internal.ads.zzeav     // Catch:{ all -> 0x00dd }
            r0.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            r8.mo19663c(r0)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzebb r7 = new com.google.android.gms.internal.ads.zzebb     // Catch:{ all -> 0x00dd }
            r7.<init>(r6, r9)     // Catch:{ all -> 0x00dd }
            r8.mo19665e(r7)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.AdLoader r7 = r8.mo19661a()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.AdRequest r8 = m48543h()     // Catch:{ all -> 0x00dd }
            r7.mo19659a(r8)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x009d:
            android.content.Context r8 = r6.f33622b     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.AdRequest r0 = m48543h()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzeay r1 = new com.google.android.gms.internal.ads.zzeay     // Catch:{ all -> 0x00dd }
            r1.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.interstitial.InterstitialAd.m2914b(r8, r7, r0, r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x00ad:
            com.google.android.gms.ads.AdView r8 = new com.google.android.gms.ads.AdView     // Catch:{ all -> 0x00dd }
            android.content.Context r0 = r6.f33622b     // Catch:{ all -> 0x00dd }
            r8.<init>(r0)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.AdSize r0 = com.google.android.gms.ads.AdSize.f1675i     // Catch:{ all -> 0x00dd }
            r8.setAdSize(r0)     // Catch:{ all -> 0x00dd }
            r8.setAdUnitId(r7)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzeax r0 = new com.google.android.gms.internal.ads.zzeax     // Catch:{ all -> 0x00dd }
            r0.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x00dd }
            r8.setAdListener(r0)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.AdRequest r7 = m48543h()     // Catch:{ all -> 0x00dd }
            r8.mo19705b(r7)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x00cd:
            android.content.Context r8 = r6.f33622b     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.AdRequest r0 = m48543h()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.zzeaw r1 = new com.google.android.gms.internal.ads.zzeaw     // Catch:{ all -> 0x00dd }
            r1.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.ads.appopen.AppOpenAd.m1764b(r8, r7, r0, r5, r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x00dd:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebe.mo45145f(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: g */
    public final synchronized void mo45146g(String str, String str2) {
        Activity a = this.f33623c.mo45138a();
        if (a != null) {
            Object obj = this.f33621a.get(str);
            if (obj != null) {
                this.f33621a.remove(str);
                m48546k(m48544i(obj), str2);
                if (obj instanceof AppOpenAd) {
                    ((AppOpenAd) obj).mo19778c(a);
                } else if (obj instanceof InterstitialAd) {
                    ((InterstitialAd) obj).mo20464e(a);
                } else if (obj instanceof RewardedAd) {
                    ((RewardedAd) obj).mo20712c(a, zzeat.f33594a);
                } else if (obj instanceof RewardedInterstitialAd) {
                    ((RewardedInterstitialAd) obj).mo20716c(a, zzeau.f33595a);
                }
            }
        }
    }
}
