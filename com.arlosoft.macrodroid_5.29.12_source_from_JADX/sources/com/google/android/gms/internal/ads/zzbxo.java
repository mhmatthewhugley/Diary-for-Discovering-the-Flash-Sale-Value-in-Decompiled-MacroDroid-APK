package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbxo extends zzbxc {

    /* renamed from: a */
    private final RtbAdapter f27923a;

    /* renamed from: c */
    private MediationInterstitialAd f27924c;

    /* renamed from: d */
    private MediationRewardedAd f27925d;

    /* renamed from: f */
    private String f27926f = "";

    public zzbxo(RtbAdapter rtbAdapter) {
        this.f27923a = rtbAdapter;
    }

    /* renamed from: Kb */
    private final Bundle m44615Kb(zzl zzl) {
        Bundle bundle;
        Bundle bundle2 = zzl.f1985D;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.f27923a.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    /* renamed from: Lb */
    private static final Bundle m44616Lb(String str) throws RemoteException {
        zzcgp.m45229g("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            zzcgp.m45227e("", e);
            throw new RemoteException();
        }
    }

    /* renamed from: Mb */
    private static final boolean m44617Mb(zzl zzl) {
        if (zzl.f2002o) {
            return true;
        }
        zzaw.m1917b();
        return zzcgi.m45181q();
    }

    @Nullable
    /* renamed from: Nb */
    private static final String m44618Nb(String str, zzl zzl) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzl.f1993L;
        }
    }

    /* renamed from: C7 */
    public final void mo43170C7(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbwx zzbwx, zzbvq zzbvq) throws RemoteException {
        mo43183v4(str, str2, zzl, iObjectWrapper, zzbwx, zzbvq, (zzbls) null);
    }

    /* renamed from: D5 */
    public final void mo43171D5(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbxa zzbxa, zzbvq zzbvq) throws RemoteException {
        zzl zzl2 = zzl;
        try {
            this.f27923a.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.m5050A1(iObjectWrapper), str, m44616Lb(str2), m44615Kb(zzl2), m44617Mb(zzl), zzl2.f1983B, zzl2.f2003p, zzl2.f1992K, m44618Nb(str2, zzl), this.f27926f), new zzbxn(this, zzbxa, zzbvq));
        } catch (Throwable th) {
            zzcgp.m45227e("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: M2 */
    public final void mo43172M2(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbwr zzbwr, zzbvq zzbvq, zzq zzq) throws RemoteException {
        zzl zzl2 = zzl;
        zzq zzq2 = zzq;
        try {
            zzbxj zzbxj = new zzbxj(this, zzbwr, zzbvq);
            RtbAdapter rtbAdapter = this.f27923a;
            Bundle Lb = m44616Lb(str2);
            Bundle Kb = m44615Kb(zzl2);
            boolean Mb = m44617Mb(zzl);
            Location location = zzl2.f1983B;
            int i = zzl2.f2003p;
            int i2 = zzl2.f1992K;
            String Nb = m44618Nb(str2, zzl);
            AdSize c = zzb.m3103c(zzq2.f2029g, zzq2.f2026c, zzq2.f2025a);
            String str3 = this.f27926f;
            MediationBannerAdConfiguration mediationBannerAdConfiguration = r5;
            MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) ObjectWrapper.m5050A1(iObjectWrapper), str, Lb, Kb, Mb, location, i, i2, Nb, c, str3);
            rtbAdapter.loadRtbInterscrollerAd(mediationBannerAdConfiguration, zzbxj);
        } catch (Throwable th) {
            zzcgp.m45227e("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: T9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43173T9(com.google.android.gms.dynamic.IObjectWrapper r8, java.lang.String r9, android.os.Bundle r10, android.os.Bundle r11, com.google.android.gms.ads.internal.client.zzq r12, com.google.android.gms.internal.ads.zzbxg r13) throws android.os.RemoteException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbxm r0 = new com.google.android.gms.internal.ads.zzbxm     // Catch:{ all -> 0x008c }
            r0.<init>(r7, r13)     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r13 = r7.f27923a     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.mediation.MediationConfiguration r1 = new com.google.android.gms.ads.mediation.MediationConfiguration     // Catch:{ all -> 0x008c }
            int r2 = r9.hashCode()     // Catch:{ all -> 0x008c }
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1396342996: goto L_0x003d;
                case -1052618729: goto L_0x0033;
                case -239580146: goto L_0x0029;
                case 604727084: goto L_0x001f;
                case 1911491517: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0047
        L_0x0015:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 3
            goto L_0x0048
        L_0x001f:
            java.lang.String r2 = "interstitial"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 1
            goto L_0x0048
        L_0x0029:
            java.lang.String r2 = "rewarded"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 2
            goto L_0x0048
        L_0x0033:
            java.lang.String r2 = "native"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 4
            goto L_0x0048
        L_0x003d:
            java.lang.String r2 = "banner"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 0
            goto L_0x0048
        L_0x0047:
            r9 = -1
        L_0x0048:
            if (r9 == 0) goto L_0x0066
            if (r9 == r6) goto L_0x0063
            if (r9 == r5) goto L_0x0060
            if (r9 == r4) goto L_0x005d
            if (r9 != r3) goto L_0x0055
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.NATIVE     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0055:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x008c }
            java.lang.String r9 = "Internal Error"
            r8.<init>(r9)     // Catch:{ all -> 0x008c }
            throw r8     // Catch:{ all -> 0x008c }
        L_0x005d:
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0060:
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.REWARDED     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0063:
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.INTERSTITIAL     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0066:
            com.google.android.gms.ads.AdFormat r9 = com.google.android.gms.ads.AdFormat.BANNER     // Catch:{ all -> 0x008c }
        L_0x0068:
            r1.<init>(r9, r11)     // Catch:{ all -> 0x008c }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x008c }
            r9.<init>()     // Catch:{ all -> 0x008c }
            r9.add(r1)     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.mediation.rtb.RtbSignalData r11 = new com.google.android.gms.ads.mediation.rtb.RtbSignalData     // Catch:{ all -> 0x008c }
            java.lang.Object r8 = com.google.android.gms.dynamic.ObjectWrapper.m5050A1(r8)     // Catch:{ all -> 0x008c }
            android.content.Context r8 = (android.content.Context) r8     // Catch:{ all -> 0x008c }
            int r1 = r12.f2029g     // Catch:{ all -> 0x008c }
            int r2 = r12.f2026c     // Catch:{ all -> 0x008c }
            java.lang.String r12 = r12.f2025a     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.AdSize r12 = com.google.android.gms.ads.zzb.m3103c(r1, r2, r12)     // Catch:{ all -> 0x008c }
            r11.<init>(r8, r9, r10, r12)     // Catch:{ all -> 0x008c }
            r13.collectSignals(r11, r0)     // Catch:{ all -> 0x008c }
            return
        L_0x008c:
            r8 = move-exception
            java.lang.String r9 = "Error generating signals for RTB"
            com.google.android.gms.internal.ads.zzcgp.m45227e(r9, r8)
            android.os.RemoteException r8 = new android.os.RemoteException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxo.mo43173T9(com.google.android.gms.dynamic.IObjectWrapper, java.lang.String, android.os.Bundle, android.os.Bundle, com.google.android.gms.ads.internal.client.zzq, com.google.android.gms.internal.ads.zzbxg):void");
    }

    /* renamed from: V4 */
    public final void mo43174V4(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbxa zzbxa, zzbvq zzbvq) throws RemoteException {
        zzl zzl2 = zzl;
        try {
            this.f27923a.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.m5050A1(iObjectWrapper), str, m44616Lb(str2), m44615Kb(zzl2), m44617Mb(zzl), zzl2.f1983B, zzl2.f2003p, zzl2.f1992K, m44618Nb(str2, zzl), this.f27926f), new zzbxn(this, zzbxa, zzbvq));
        } catch (Throwable th) {
            zzcgp.m45227e("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: X1 */
    public final void mo43175X1(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbwr zzbwr, zzbvq zzbvq, zzq zzq) throws RemoteException {
        zzl zzl2 = zzl;
        zzq zzq2 = zzq;
        try {
            zzbxi zzbxi = new zzbxi(this, zzbwr, zzbvq);
            RtbAdapter rtbAdapter = this.f27923a;
            Bundle Lb = m44616Lb(str2);
            Bundle Kb = m44615Kb(zzl2);
            boolean Mb = m44617Mb(zzl);
            Location location = zzl2.f1983B;
            int i = zzl2.f2003p;
            int i2 = zzl2.f1992K;
            String Nb = m44618Nb(str2, zzl);
            AdSize c = zzb.m3103c(zzq2.f2029g, zzq2.f2026c, zzq2.f2025a);
            String str3 = this.f27926f;
            MediationBannerAdConfiguration mediationBannerAdConfiguration = r5;
            MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) ObjectWrapper.m5050A1(iObjectWrapper), str, Lb, Kb, Mb, location, i, i2, Nb, c, str3);
            rtbAdapter.loadRtbBannerAd(mediationBannerAdConfiguration, zzbxi);
        } catch (Throwable th) {
            zzcgp.m45227e("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a0 */
    public final void mo43176a0(String str) {
        this.f27926f = str;
    }

    @Nullable
    /* renamed from: b */
    public final zzdk mo43177b() {
        RtbAdapter rtbAdapter = this.f27923a;
        if (rtbAdapter instanceof com.google.android.gms.ads.mediation.zzb) {
            try {
                return ((com.google.android.gms.ads.mediation.zzb) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                zzcgp.m45227e("", th);
            }
        }
        return null;
    }

    /* renamed from: c */
    public final zzbxq mo43178c() throws RemoteException {
        return zzbxq.m44633l2(this.f27923a.getVersionInfo());
    }

    /* renamed from: c0 */
    public final boolean mo43179c0(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.f27925d;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.mo20512a((Context) ObjectWrapper.m5050A1(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzcgp.m45227e("", th);
            return true;
        }
    }

    /* renamed from: f */
    public final zzbxq mo43180f() throws RemoteException {
        return zzbxq.m44633l2(this.f27923a.getSDKVersionInfo());
    }

    /* renamed from: q3 */
    public final boolean mo43181q3(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.f27924c;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.mo20495a((Context) ObjectWrapper.m5050A1(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzcgp.m45227e("", th);
            return true;
        }
    }

    /* renamed from: t2 */
    public final void mo43182t2(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbwu zzbwu, zzbvq zzbvq) throws RemoteException {
        zzl zzl2 = zzl;
        try {
            this.f27923a.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.m5050A1(iObjectWrapper), str, m44616Lb(str2), m44615Kb(zzl2), m44617Mb(zzl), zzl2.f1983B, zzl2.f2003p, zzl2.f1992K, m44618Nb(str2, zzl), this.f27926f), new zzbxk(this, zzbwu, zzbvq));
        } catch (Throwable th) {
            zzcgp.m45227e("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: v4 */
    public final void mo43183v4(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbwx zzbwx, zzbvq zzbvq, zzbls zzbls) throws RemoteException {
        zzl zzl2 = zzl;
        try {
            zzbxl zzbxl = new zzbxl(this, zzbwx, zzbvq);
            RtbAdapter rtbAdapter = this.f27923a;
            MediationNativeAdConfiguration mediationNativeAdConfiguration = r4;
            MediationNativeAdConfiguration mediationNativeAdConfiguration2 = new MediationNativeAdConfiguration((Context) ObjectWrapper.m5050A1(iObjectWrapper), str, m44616Lb(str2), m44615Kb(zzl2), m44617Mb(zzl), zzl2.f1983B, zzl2.f2003p, zzl2.f1992K, m44618Nb(str2, zzl), this.f27926f, zzbls);
            rtbAdapter.loadRtbNativeAd(mediationNativeAdConfiguration, zzbxl);
        } catch (Throwable th) {
            zzcgp.m45227e("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }
}
