package com.arlosoft.macrodroid.advert;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p148q0.C8151a;
import p455ag.C17105a;

/* compiled from: AdvertActivity.kt */
public abstract class AdvertActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: D */
    public static final C3775a f9860D = new C3775a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: E */
    public static Intent f9861E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public static boolean f9862F;

    /* renamed from: G */
    private static long f9863G;

    /* renamed from: A */
    public C4083b f9864A;

    /* renamed from: B */
    private int f9865B;

    /* renamed from: C */
    public Map<Integer, View> f9866C = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public InterstitialAd f9867s;

    /* renamed from: z */
    public C5070a f9868z;

    /* renamed from: com.arlosoft.macrodroid.advert.AdvertActivity$a */
    /* compiled from: AdvertActivity.kt */
    public static final class C3775a {
        private C3775a() {
        }

        public /* synthetic */ C3775a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo27271a(Intent intent) {
            AdvertActivity.f9862F = true;
            AdvertActivity.f9861E = intent;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.advert.AdvertActivity$b */
    /* compiled from: AdvertActivity.kt */
    public static final class C3776b extends InterstitialAdLoadCallback {

        /* renamed from: a */
        final /* synthetic */ AdvertActivity f9869a;

        C3776b(AdvertActivity advertActivity) {
            this.f9869a = advertActivity;
        }

        /* renamed from: a */
        public void onAdLoaded(InterstitialAd interstitialAd) {
            C13706o.m87929f(interstitialAd, "interstitialAd");
            C17105a.m100579a("Advert Loaded", new Object[0]);
            C8151a.m33865f();
            this.f9869a.f9867s = interstitialAd;
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            C13706o.m87929f(loadAdError, "loadAdError");
            C17105a.m100579a("Advert Failed to load: " + loadAdError.mo19647c(), new Object[0]);
            String c = loadAdError.mo19647c();
            C13706o.m87928e(c, "loadAdError.message");
            C8151a.m33863d(c);
            this.f9869a.f9867s = null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.advert.AdvertActivity$c */
    /* compiled from: AdvertActivity.kt */
    public static final class C3777c extends FullScreenContentCallback {

        /* renamed from: a */
        final /* synthetic */ AdvertActivity f9870a;

        C3777c(AdvertActivity advertActivity) {
            this.f9870a = advertActivity;
        }

        public void onAdClicked() {
            C8151a.m33862c();
        }

        public void onAdDismissedFullScreenContent() {
            this.f9870a.m14794c2();
            this.f9870a.m14793b2();
            if (this.f9870a.f9867s != null) {
                InterstitialAd R1 = this.f9870a.f9867s;
                if (R1 != null) {
                    R1.mo20462c((FullScreenContentCallback) null);
                }
                this.f9870a.f9867s = null;
            }
            this.f9870a.m14792a2();
        }

        public void onAdFailedToShowFullScreenContent(AdError adError) {
            C13706o.m87929f(adError, "adError");
            C17105a.m100579a("The ad failed to show: " + adError.mo19647c(), new Object[0]);
            this.f9870a.m14794c2();
            this.f9870a.m14793b2();
            this.f9870a.m14792a2();
        }

        public void onAdShowedFullScreenContent() {
            C8151a.m33864e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public final void m14792a2() {
        AdRequest c = new AdRequest.Builder().mo19671c();
        C13706o.m87928e(c, "Builder().build()");
        String string = getString(C17541R$string.fullscreen_ad_id);
        C13706o.m87928e(string, "getString(R.string.fullscreen_ad_id)");
        try {
            InterstitialAd.m2914b(this, string, c, new C3776b(this));
        } catch (UnsupportedOperationException e) {
            C8151a.m33873n(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public final void m14793b2() {
        Intent intent = f9861E;
        if (intent != null) {
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e) {
                FirebaseCrashlytics a = FirebaseCrashlytics.m6487a();
                a.mo22935c("Intent, action = " + intent.getAction() + ", data=" + intent.getData());
                FirebaseCrashlytics.m6487a().mo22936d(e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public final void m14794c2() {
        if (this.f9865B > 2) {
            Object systemService = getSystemService("audio");
            C13706o.m87927d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            ((AudioManager) systemService).setStreamVolume(3, this.f9865B, 0);
        }
    }

    /* renamed from: d2 */
    public static final void m14795d2(Intent intent) {
        f9860D.mo27271a(intent);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:(1:3)|4|5|6|(2:8|9)|10|11|(2:13|24)(1:21)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0038 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[Catch:{ all -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: e2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14796e2() {
        /*
            r7 = this;
            com.google.android.gms.ads.interstitial.InterstitialAd r0 = r7.f9867s
            r1 = 0
            if (r0 == 0) goto L_0x004b
            if (r0 != 0) goto L_0x0008
            goto L_0x0010
        L_0x0008:
            com.arlosoft.macrodroid.advert.AdvertActivity$c r2 = new com.arlosoft.macrodroid.advert.AdvertActivity$c
            r2.<init>(r7)
            r0.mo20462c(r2)
        L_0x0010:
            java.lang.String r0 = "audio"
            java.lang.Object r0 = r7.getSystemService(r0)     // Catch:{ all -> 0x0040 }
            java.lang.String r2 = "null cannot be cast to non-null type android.media.AudioManager"
            kotlin.jvm.internal.C13706o.m87927d(r0, r2)     // Catch:{ all -> 0x0040 }
            android.media.AudioManager r0 = (android.media.AudioManager) r0     // Catch:{ all -> 0x0040 }
            r2 = 3
            int r3 = r0.getStreamVolume(r2)     // Catch:{ all -> 0x0040 }
            r7.f9865B = r3     // Catch:{ all -> 0x0040 }
            int r3 = r0.getStreamMaxVolume(r2)     // Catch:{ all -> 0x0040 }
            double r3 = (double) r3     // Catch:{ all -> 0x0040 }
            r5 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r3 = r3 * r5
            int r3 = (int) r3     // Catch:{ all -> 0x0040 }
            int r4 = r7.f9865B     // Catch:{ all -> 0x0040 }
            if (r4 <= r3) goto L_0x0038
            r0.setStreamVolume(r2, r3, r1)     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            com.google.android.gms.ads.interstitial.InterstitialAd r0 = r7.f9867s     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0074
            r0.mo20464e(r7)     // Catch:{ all -> 0x0040 }
            goto L_0x0074
        L_0x0040:
            r0 = move-exception
            p148q0.C8151a.m33873n(r0)
            r7.m14793b2()
            r7.m14792a2()
            goto L_0x0074
        L_0x004b:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "Interstitial advert is not loaded"
            p455ag.C17105a.m100579a(r2, r0)
            com.arlosoft.macrodroid.remoteconfig.a r0 = r7.mo27270Z1()
            long r2 = r0.mo29975b()
            double r2 = (double) r2
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 / r4
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            double r4 = r0.nextDouble()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0071
            android.content.Intent r0 = f9861E
            r7.m14798g2(r1, r0)
            goto L_0x0074
        L_0x0071:
            r7.m14793b2()
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.advert.AdvertActivity.m14796e2():void");
    }

    /* renamed from: f2 */
    private final void m14797f2() {
        if (mo27269Y1().mo28009e().mo28008a()) {
            m14793b2();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f9863G < 75000) {
            m14793b2();
            return;
        }
        boolean z = false;
        if (new Random().nextDouble() < ((double) mo27270Z1().mo29984k()) / 100.0d) {
            C17105a.m100579a("Forcing in house advert", new Object[0]);
            z = true;
        }
        f9863G = currentTimeMillis;
        if (z) {
            m14798g2(true, f9861E);
        } else {
            m14796e2();
        }
    }

    /* renamed from: g2 */
    private final void m14798g2(boolean z, Intent intent) {
        MacroDroidProAdvertActivity2.f9877J.mo27280a(this, z, intent);
    }

    /* renamed from: Y1 */
    public final C4083b mo27269Y1() {
        C4083b bVar = this.f9864A;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("premiumStatusHandler");
        return null;
    }

    /* renamed from: Z1 */
    public final C5070a mo27270Z1() {
        C5070a aVar = this.f9868z;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("remoteConfig");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!mo27269Y1().mo28009e().mo28008a()) {
            m14792a2();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!mo27269Y1().mo28009e().mo28008a() && f9862F) {
            f9862F = false;
            m14797f2();
        }
    }
}
