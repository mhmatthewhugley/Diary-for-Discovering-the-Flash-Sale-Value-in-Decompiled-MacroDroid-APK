package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbwj extends zzbvm {

    /* renamed from: A */
    private final String f27881A = "";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f27882a;

    /* renamed from: c */
    private zzbwl f27883c;

    /* renamed from: d */
    private zzccd f27884d;

    /* renamed from: f */
    private IObjectWrapper f27885f;

    /* renamed from: g */
    private View f27886g;

    /* renamed from: o */
    private MediationInterstitialAd f27887o;

    /* renamed from: p */
    private UnifiedNativeAdMapper f27888p;

    /* renamed from: s */
    private MediationRewardedAd f27889s;

    /* renamed from: z */
    private MediationInterscrollerAd f27890z;

    public zzbwj(@NonNull Adapter adapter) {
        this.f27882a = adapter;
    }

    /* renamed from: Jb */
    private final Bundle m44437Jb(zzl zzl) {
        Bundle bundle;
        Bundle bundle2 = zzl.f1985D;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.f27882a.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    /* renamed from: Kb */
    private final Bundle m44438Kb(String str, zzl zzl, String str2) throws RemoteException {
        zzcgp.m45224b("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f27882a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzl != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzl.f2003p);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzcgp.m45227e("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: Lb */
    private static final boolean m44439Lb(zzl zzl) {
        if (zzl.f2002o) {
            return true;
        }
        zzaw.m1917b();
        return zzcgi.m45181q();
    }

    @Nullable
    /* renamed from: Mb */
    private static final String m44440Mb(String str, zzl zzl) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzl.f1993L;
        }
    }

    /* renamed from: A7 */
    public final void mo43032A7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.m5050A1(iObjectWrapper);
        Object obj = this.f27882a;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).mo20518a(context);
        }
    }

    /* renamed from: G2 */
    public final void mo43033G2(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbvq zzbvq) throws RemoteException {
        Date date;
        zzl zzl2 = zzl;
        String str3 = str;
        String str4 = str2;
        zzbvq zzbvq2 = zzbvq;
        Object obj = this.f27882a;
        if ((obj instanceof MediationInterstitialAdapter) || (obj instanceof Adapter)) {
            zzcgp.m45224b("Requesting interstitial ad from adapter.");
            Object obj2 = this.f27882a;
            if (obj2 instanceof MediationInterstitialAdapter) {
                try {
                    MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                    List list = zzl2.f2001g;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = zzl2.f1998c;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    zzbwc zzbwc = new zzbwc(date, zzl2.f2000f, hashSet, zzl2.f1983B, m44439Lb(zzl), zzl2.f2003p, zzl2.f1990I, zzl2.f1992K, m44440Mb(str3, zzl2));
                    Bundle bundle = zzl2.f1985D;
                    mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.m5050A1(iObjectWrapper), new zzbwl(zzbvq2), m44438Kb(str3, zzl2, str4), zzbwc, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    zzcgp.m45227e("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.m5050A1(iObjectWrapper), "", m44438Kb(str3, zzl2, str4), m44437Jb(zzl2), m44439Lb(zzl), zzl2.f1983B, zzl2.f2003p, zzl2.f1992K, m44440Mb(str3, zzl2), this.f27881A), new zzbwg(this, zzbvq2));
                } catch (Throwable th2) {
                    zzcgp.m45227e("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f27882a.getClass().getCanonicalName();
            zzcgp.m45229g(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    /* renamed from: J */
    public final void mo43034J() throws RemoteException {
        if (this.f27882a instanceof MediationInterstitialAdapter) {
            zzcgp.m45224b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f27882a).showInterstitial();
            } catch (Throwable th) {
                zzcgp.m45227e("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f27882a.getClass().getCanonicalName();
            zzcgp.m45229g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    /* renamed from: L */
    public final boolean mo43035L() {
        return false;
    }

    /* renamed from: M */
    public final zzbvw mo43036M() {
        return null;
    }

    /* renamed from: P */
    public final void mo43037P() throws RemoteException {
        Object obj = this.f27882a;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzcgp.m45227e("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: P4 */
    public final void mo43038P4(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbvq zzbvq) throws RemoteException {
        zzq zzq2 = zzq;
        zzl zzl2 = zzl;
        String str3 = str;
        if (this.f27882a instanceof Adapter) {
            zzcgp.m45224b("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.f27882a;
                zzbwd zzbwd = new zzbwd(this, zzbvq, adapter);
                Bundle Kb = m44438Kb(str3, zzl2, str2);
                Bundle Jb = m44437Jb(zzl2);
                boolean Lb = m44439Lb(zzl);
                Location location = zzl2.f1983B;
                int i = zzl2.f2003p;
                int i2 = zzl2.f1992K;
                String Mb = m44440Mb(str3, zzl2);
                AdSize e = zzb.m3105e(zzq2.f2029g, zzq2.f2026c);
                MediationBannerAdConfiguration mediationBannerAdConfiguration = r6;
                MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) ObjectWrapper.m5050A1(iObjectWrapper), "", Kb, Jb, Lb, location, i, i2, Mb, e, "");
                adapter.loadInterscrollerAd(mediationBannerAdConfiguration, zzbwd);
            } catch (Exception e2) {
                zzcgp.m45227e("", e2);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.f27882a.getClass().getCanonicalName();
            zzcgp.m45229g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    /* renamed from: Q */
    public final void mo43039Q() throws RemoteException {
        if (this.f27882a instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.f27889s;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.mo20512a((Context) ObjectWrapper.m5050A1(this.f27885f));
            } else {
                zzcgp.m45226d("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.f27882a.getClass().getCanonicalName();
            zzcgp.m45229g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: Q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43040Q2(com.google.android.gms.dynamic.IObjectWrapper r9, com.google.android.gms.internal.ads.zzbru r10, java.util.List r11) throws android.os.RemoteException {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f27882a
            boolean r0 = r0 instanceof com.google.android.gms.ads.mediation.Adapter
            if (r0 == 0) goto L_0x0096
            com.google.android.gms.internal.ads.zzbwe r0 = new com.google.android.gms.internal.ads.zzbwe
            r0.<init>(r8, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0014:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0088
            java.lang.Object r1 = r11.next()
            com.google.android.gms.internal.ads.zzbsa r1 = (com.google.android.gms.internal.ads.zzbsa) r1
            java.lang.String r2 = r1.f27699a
            int r3 = r2.hashCode()
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r3) {
                case -1396342996: goto L_0x0056;
                case -1052618729: goto L_0x004c;
                case -239580146: goto L_0x0042;
                case 604727084: goto L_0x0038;
                case 1911491517: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0060
        L_0x002e:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 3
            goto L_0x0061
        L_0x0038:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 1
            goto L_0x0061
        L_0x0042:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 2
            goto L_0x0061
        L_0x004c:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 4
            goto L_0x0061
        L_0x0056:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 0
            goto L_0x0061
        L_0x0060:
            r2 = -1
        L_0x0061:
            if (r2 == 0) goto L_0x0079
            if (r2 == r7) goto L_0x0076
            if (r2 == r6) goto L_0x0073
            if (r2 == r5) goto L_0x0070
            if (r2 == r4) goto L_0x006d
            r2 = 0
            goto L_0x007b
        L_0x006d:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.NATIVE
            goto L_0x007b
        L_0x0070:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL
            goto L_0x007b
        L_0x0073:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.REWARDED
            goto L_0x007b
        L_0x0076:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.INTERSTITIAL
            goto L_0x007b
        L_0x0079:
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.BANNER
        L_0x007b:
            if (r2 == 0) goto L_0x0014
            com.google.android.gms.ads.mediation.MediationConfiguration r3 = new com.google.android.gms.ads.mediation.MediationConfiguration
            android.os.Bundle r1 = r1.f27700c
            r3.<init>(r2, r1)
            r10.add(r3)
            goto L_0x0014
        L_0x0088:
            java.lang.Object r11 = r8.f27882a
            com.google.android.gms.ads.mediation.Adapter r11 = (com.google.android.gms.ads.mediation.Adapter) r11
            java.lang.Object r9 = com.google.android.gms.dynamic.ObjectWrapper.m5050A1(r9)
            android.content.Context r9 = (android.content.Context) r9
            r11.initialize(r9, r0, r10)
            return
        L_0x0096:
            android.os.RemoteException r9 = new android.os.RemoteException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwj.mo43040Q2(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzbru, java.util.List):void");
    }

    /* renamed from: Q9 */
    public final void mo43041Q9(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.f27882a;
        if (!(obj instanceof Adapter) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f27882a.getClass().getCanonicalName();
            zzcgp.m45229g(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        } else if (obj instanceof MediationInterstitialAdapter) {
            mo43034J();
        } else {
            zzcgp.m45224b("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.f27887o;
            if (mediationInterstitialAd != null) {
                mediationInterstitialAd.mo20495a((Context) ObjectWrapper.m5050A1(iObjectWrapper));
            } else {
                zzcgp.m45226d("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
    }

    /* renamed from: T */
    public final zzbvv mo43042T() {
        return null;
    }

    /* renamed from: X9 */
    public final void mo43043X9(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f27882a instanceof Adapter) {
            zzcgp.m45224b("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.f27889s;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.mo20512a((Context) ObjectWrapper.m5050A1(iObjectWrapper));
            } else {
                zzcgp.m45226d("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.f27882a.getClass().getCanonicalName();
            zzcgp.m45229g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    /* renamed from: b */
    public final Bundle mo43061b() {
        Object obj = this.f27882a;
        if (obj instanceof zzcok) {
            return ((zzcok) obj).zza();
        }
        String canonicalName = zzcok.class.getCanonicalName();
        String canonicalName2 = this.f27882a.getClass().getCanonicalName();
        zzcgp.m45229g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        return new Bundle();
    }

    /* renamed from: c */
    public final Bundle mo43062c() {
        Object obj = this.f27882a;
        if (obj instanceof zzcol) {
            return ((zzcol) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzcol.class.getCanonicalName();
        String canonicalName2 = this.f27882a.getClass().getCanonicalName();
        zzcgp.m45229g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        return new Bundle();
    }

    /* renamed from: d4 */
    public final void mo43044d4(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbvq zzbvq) throws RemoteException {
        AdSize adSize;
        Date date;
        zzq zzq2 = zzq;
        zzl zzl2 = zzl;
        String str3 = str;
        String str4 = str2;
        zzbvq zzbvq2 = zzbvq;
        Object obj = this.f27882a;
        if ((obj instanceof MediationBannerAdapter) || (obj instanceof Adapter)) {
            zzcgp.m45224b("Requesting banner ad from adapter.");
            if (zzq2.f2023E) {
                adSize = zzb.m3104d(zzq2.f2029g, zzq2.f2026c);
            } else {
                adSize = zzb.m3103c(zzq2.f2029g, zzq2.f2026c, zzq2.f2025a);
            }
            AdSize adSize2 = adSize;
            Object obj2 = this.f27882a;
            if (obj2 instanceof MediationBannerAdapter) {
                try {
                    MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                    List list = zzl2.f2001g;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = zzl2.f1998c;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    zzbwc zzbwc = new zzbwc(date, zzl2.f2000f, hashSet, zzl2.f1983B, m44439Lb(zzl), zzl2.f2003p, zzl2.f1990I, zzl2.f1992K, m44440Mb(str3, zzl2));
                    Bundle bundle = zzl2.f1985D;
                    mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.m5050A1(iObjectWrapper), new zzbwl(zzbvq2), m44438Kb(str3, zzl2, str4), adSize2, zzbwc, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    zzcgp.m45227e("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    zzbwf zzbwf = new zzbwf(this, zzbvq2);
                    Bundle Kb = m44438Kb(str3, zzl2, str4);
                    Bundle Jb = m44437Jb(zzl2);
                    boolean Lb = m44439Lb(zzl);
                    Location location = zzl2.f1983B;
                    int i = zzl2.f2003p;
                    int i2 = zzl2.f1992K;
                    String Mb = m44440Mb(str3, zzl2);
                    String str5 = this.f27881A;
                    MediationBannerAdConfiguration mediationBannerAdConfiguration = r2;
                    MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) ObjectWrapper.m5050A1(iObjectWrapper), "", Kb, Jb, Lb, location, i, i2, Mb, adSize2, str5);
                    ((Adapter) obj2).loadBannerAd(mediationBannerAdConfiguration, zzbwf);
                } catch (Throwable th2) {
                    zzcgp.m45227e("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            zzcgp.m45229g(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.f27882a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    @Nullable
    /* renamed from: e */
    public final zzdk mo43045e() {
        Object obj = this.f27882a;
        if (obj instanceof com.google.android.gms.ads.mediation.zzb) {
            try {
                return ((com.google.android.gms.ads.mediation.zzb) obj).getVideoController();
            } catch (Throwable th) {
                zzcgp.m45227e("", th);
            }
        }
        return null;
    }

    /* renamed from: e8 */
    public final void mo43046e8(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzccd zzccd, String str2) throws RemoteException {
        Object obj = this.f27882a;
        if (obj instanceof Adapter) {
            this.f27885f = iObjectWrapper;
            this.f27884d = zzccd;
            zzccd.mo43333D1(ObjectWrapper.m5051g8(obj));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f27882a.getClass().getCanonicalName();
        zzcgp.m45229g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    /* renamed from: f */
    public final Bundle mo43063f() {
        return new Bundle();
    }

    @Nullable
    /* renamed from: g */
    public final zzbmy mo43064g() {
        zzbwl zzbwl = this.f27883c;
        if (zzbwl == null) {
            return null;
        }
        NativeCustomTemplateAd t = zzbwl.mo43155t();
        if (t instanceof zzbmz) {
            return ((zzbmz) t).mo42815b();
        }
        return null;
    }

    @Nullable
    /* renamed from: h */
    public final zzbvt mo43047h() {
        MediationInterscrollerAd mediationInterscrollerAd = this.f27890z;
        if (mediationInterscrollerAd != null) {
            return new zzbwk(mediationInterscrollerAd);
        }
        return null;
    }

    @Nullable
    /* renamed from: i */
    public final zzbvz mo43048i() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        UnifiedNativeAdMapper u;
        Object obj = this.f27882a;
        if (obj instanceof MediationNativeAdapter) {
            zzbwl zzbwl = this.f27883c;
            if (zzbwl == null || (u = zzbwl.mo43156u()) == null) {
                return null;
            }
            return new zzbwo(u);
        } else if (!(obj instanceof Adapter) || (unifiedNativeAdMapper = this.f27888p) == null) {
            return null;
        } else {
            return new zzbwo(unifiedNativeAdMapper);
        }
    }

    /* renamed from: i4 */
    public final void mo43049i4(boolean z) throws RemoteException {
        Object obj = this.f27882a;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
            } catch (Throwable th) {
                zzcgp.m45227e("", th);
            }
        } else {
            String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
            String canonicalName2 = this.f27882a.getClass().getCanonicalName();
            zzcgp.m45224b(canonicalName + " #009 Class mismatch: " + canonicalName2);
        }
    }

    @Nullable
    /* renamed from: j */
    public final zzbxq mo43050j() {
        Object obj = this.f27882a;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbxq.m44633l2(((Adapter) obj).getVersionInfo());
    }

    @Nullable
    /* renamed from: k */
    public final zzbxq mo43051k() {
        Object obj = this.f27882a;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbxq.m44633l2(((Adapter) obj).getSDKVersionInfo());
    }

    /* renamed from: l */
    public final void mo43052l() throws RemoteException {
        Object obj = this.f27882a;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzcgp.m45227e("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: m3 */
    public final void mo43065m3(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbvq zzbvq) throws RemoteException {
        mo43033G2(iObjectWrapper, zzl, str, (String) null, zzbvq);
    }

    /* renamed from: m4 */
    public final void mo43053m4(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbvq zzbvq) throws RemoteException {
        zzl zzl2 = zzl;
        String str2 = str;
        if (this.f27882a instanceof Adapter) {
            zzcgp.m45224b("Requesting rewarded interstitial ad from adapter.");
            try {
                zzbwi zzbwi = new zzbwi(this, zzbvq);
                Bundle Kb = m44438Kb(str2, zzl2, (String) null);
                Bundle Jb = m44437Jb(zzl2);
                boolean Lb = m44439Lb(zzl);
                Location location = zzl2.f1983B;
                int i = zzl2.f2003p;
                int i2 = zzl2.f1992K;
                String Mb = m44440Mb(str2, zzl2);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = r5;
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration((Context) ObjectWrapper.m5050A1(iObjectWrapper), "", Kb, Jb, Lb, location, i, i2, Mb, "");
                ((Adapter) this.f27882a).loadRewardedInterstitialAd(mediationRewardedAdConfiguration, zzbwi);
            } catch (Exception e) {
                zzcgp.m45227e("", e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.f27882a.getClass().getCanonicalName();
            zzcgp.m45229g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    /* renamed from: n */
    public final IObjectWrapper mo43054n() throws RemoteException {
        Object obj = this.f27882a;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.m5051g8(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                zzcgp.m45227e("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return ObjectWrapper.m5051g8(this.f27886g);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f27882a.getClass().getCanonicalName();
            zzcgp.m45229g(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    /* renamed from: o2 */
    public final void mo43055o2(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbvq zzbvq) throws RemoteException {
        zzl zzl2 = zzl;
        String str2 = str;
        if (this.f27882a instanceof Adapter) {
            zzcgp.m45224b("Requesting rewarded ad from adapter.");
            try {
                zzbwi zzbwi = new zzbwi(this, zzbvq);
                Bundle Kb = m44438Kb(str2, zzl2, (String) null);
                Bundle Jb = m44437Jb(zzl2);
                boolean Lb = m44439Lb(zzl);
                Location location = zzl2.f1983B;
                int i = zzl2.f2003p;
                int i2 = zzl2.f1992K;
                String Mb = m44440Mb(str2, zzl2);
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration = r5;
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = new MediationRewardedAdConfiguration((Context) ObjectWrapper.m5050A1(iObjectWrapper), "", Kb, Jb, Lb, location, i, i2, Mb, "");
                ((Adapter) this.f27882a).loadRewardedAd(mediationRewardedAdConfiguration, zzbwi);
            } catch (Exception e) {
                zzcgp.m45227e("", e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.f27882a.getClass().getCanonicalName();
            zzcgp.m45229g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    /* renamed from: o3 */
    public final void mo43056o3(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbvq zzbvq, zzbls zzbls, List list) throws RemoteException {
        Date date;
        zzl zzl2 = zzl;
        String str3 = str;
        String str4 = str2;
        zzbvq zzbvq2 = zzbvq;
        Object obj = this.f27882a;
        if ((obj instanceof MediationNativeAdapter) || (obj instanceof Adapter)) {
            zzcgp.m45224b("Requesting native ad from adapter.");
            Object obj2 = this.f27882a;
            if (obj2 instanceof MediationNativeAdapter) {
                try {
                    MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                    List list2 = zzl2.f2001g;
                    HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                    long j = zzl2.f1998c;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    zzbwn zzbwn = new zzbwn(date, zzl2.f2000f, hashSet, zzl2.f1983B, m44439Lb(zzl), zzl2.f2003p, zzbls, list, zzl2.f1990I, zzl2.f1992K, m44440Mb(str3, zzl2));
                    Bundle bundle = zzl2.f1985D;
                    Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                    this.f27883c = new zzbwl(zzbvq2);
                    mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.m5050A1(iObjectWrapper), this.f27883c, m44438Kb(str3, zzl2, str4), zzbwn, bundle2);
                } catch (Throwable th) {
                    zzcgp.m45227e("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.m5050A1(iObjectWrapper), "", m44438Kb(str3, zzl2, str4), m44437Jb(zzl2), m44439Lb(zzl), zzl2.f1983B, zzl2.f2003p, zzl2.f1992K, m44440Mb(str3, zzl2), this.f27881A, zzbls), new zzbwh(this, zzbvq2));
                } catch (Throwable th2) {
                    zzcgp.m45227e("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f27882a.getClass().getCanonicalName();
            zzcgp.m45229g(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    /* renamed from: p0 */
    public final void mo43057p0() throws RemoteException {
        Object obj = this.f27882a;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzcgp.m45227e("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: p9 */
    public final void mo43066p9(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, zzbvq zzbvq) throws RemoteException {
        mo43044d4(iObjectWrapper, zzq, zzl, str, (String) null, zzbvq);
    }

    /* renamed from: q7 */
    public final void mo43067q7(zzl zzl, String str, String str2) throws RemoteException {
        Object obj = this.f27882a;
        if (obj instanceof Adapter) {
            mo43055o2(this.f27885f, zzl, str, new zzbwm((Adapter) obj, this.f27884d));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f27882a.getClass().getCanonicalName();
        zzcgp.m45229g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    /* renamed from: u0 */
    public final boolean mo43058u0() throws RemoteException {
        if (this.f27882a instanceof Adapter) {
            return this.f27884d != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f27882a.getClass().getCanonicalName();
        zzcgp.m45229g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    /* renamed from: w2 */
    public final void mo43059w2(IObjectWrapper iObjectWrapper, zzccd zzccd, List list) throws RemoteException {
        zzcgp.m45229g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    /* renamed from: w5 */
    public final void mo43060w5(zzl zzl, String str) throws RemoteException {
        mo43067q7(zzl, str, (String) null);
    }

    public zzbwj(@NonNull MediationAdapter mediationAdapter) {
        this.f27882a = mediationAdapter;
    }
}
