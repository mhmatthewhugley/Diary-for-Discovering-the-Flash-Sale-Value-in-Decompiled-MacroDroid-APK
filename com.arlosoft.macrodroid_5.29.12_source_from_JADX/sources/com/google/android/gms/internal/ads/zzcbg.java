package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcbg {

    /* renamed from: A */
    private int f28144A;

    /* renamed from: B */
    private final String f28145B;

    /* renamed from: C */
    private boolean f28146C;

    /* renamed from: a */
    private int f28147a;

    /* renamed from: b */
    private boolean f28148b;

    /* renamed from: c */
    private boolean f28149c;

    /* renamed from: d */
    private int f28150d;

    /* renamed from: e */
    private int f28151e;

    /* renamed from: f */
    private int f28152f;

    /* renamed from: g */
    private String f28153g;

    /* renamed from: h */
    private int f28154h;

    /* renamed from: i */
    private int f28155i;

    /* renamed from: j */
    private int f28156j;

    /* renamed from: k */
    private boolean f28157k;

    /* renamed from: l */
    private int f28158l;

    /* renamed from: m */
    private double f28159m;

    /* renamed from: n */
    private boolean f28160n;

    /* renamed from: o */
    private String f28161o;

    /* renamed from: p */
    private String f28162p;

    /* renamed from: q */
    private final boolean f28163q;

    /* renamed from: r */
    private final boolean f28164r;

    /* renamed from: s */
    private final String f28165s;

    /* renamed from: t */
    private final boolean f28166t;

    /* renamed from: u */
    private final boolean f28167u;

    /* renamed from: v */
    private final boolean f28168v;

    /* renamed from: w */
    private final String f28169w;

    /* renamed from: x */
    private final String f28170x;

    /* renamed from: y */
    private float f28171y;

    /* renamed from: z */
    private int f28172z;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a A[Catch:{ Exception -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzcbg(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            com.google.android.gms.internal.ads.zzbjc.m43542c(r7)
            r6.m44798c(r7)
            r6.m44800e(r7)
            r6.m44799d(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = m44797b(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0023
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            r6.f28163q = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = m44797b(r0, r2)
            if (r2 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            r6.f28164r = r3
            java.lang.String r2 = r1.getCountry()
            r6.f28165s = r2
            com.google.android.gms.ads.internal.zzt.m2905r()
            com.google.android.gms.ads.internal.client.zzaw.m1917b()
            boolean r2 = com.google.android.gms.internal.ads.zzcgi.m45181q()
            r6.f28166t = r2
            boolean r2 = com.google.android.gms.common.util.DeviceProperties.m4877c(r7)
            r6.f28167u = r2
            boolean r2 = com.google.android.gms.common.util.DeviceProperties.m4878d(r7)
            r6.f28168v = r2
            java.lang.String r1 = r1.getLanguage()
            r6.f28169w = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = m44797b(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L_0x0063
        L_0x0061:
            r0 = r2
            goto L_0x008a
        L_0x0063:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L_0x0068
            goto L_0x0061
        L_0x0068:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.m4929a(r7)     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r5 = r0.packageName     // Catch:{ NameNotFoundException -> 0x0061 }
            android.content.pm.PackageInfo r3 = r3.mo21963f(r5, r4)     // Catch:{ NameNotFoundException -> 0x0061 }
            if (r3 == 0) goto L_0x0061
            int r3 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r0 = r0.packageName     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0061 }
            r4.<init>()     // Catch:{ NameNotFoundException -> 0x0061 }
            r4.append(r3)     // Catch:{ NameNotFoundException -> 0x0061 }
            r4.append(r1)     // Catch:{ NameNotFoundException -> 0x0061 }
            r4.append(r0)     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r0 = r4.toString()     // Catch:{ NameNotFoundException -> 0x0061 }
        L_0x008a:
            r6.f28170x = r0
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.m4929a(r7)     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r0.mo21963f(r3, r4)     // Catch:{ Exception -> 0x00b1 }
            if (r0 == 0) goto L_0x00b2
            int r3 = r0.versionCode     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r0 = r0.packageName     // Catch:{ Exception -> 0x00b1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b1 }
            r4.<init>()     // Catch:{ Exception -> 0x00b1 }
            r4.append(r3)     // Catch:{ Exception -> 0x00b1 }
            r4.append(r1)     // Catch:{ Exception -> 0x00b1 }
            r4.append(r0)     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b2
        L_0x00b1:
        L_0x00b2:
            r6.f28145B = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto L_0x00bb
            return
        L_0x00bb:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 != 0) goto L_0x00c2
            return
        L_0x00c2:
            float r0 = r7.density
            r6.f28171y = r0
            int r0 = r7.widthPixels
            r6.f28172z = r0
            int r7 = r7.heightPixels
            r6.f28144A = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcbg.<init>(android.content.Context):void");
    }

    @Nullable
    /* renamed from: b */
    private static ResolveInfo m44797b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            zzt.m2904q().mo43503t(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: c */
    private final void m44798c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f28147a = audioManager.getMode();
                this.f28148b = audioManager.isMusicActive();
                this.f28149c = audioManager.isSpeakerphoneOn();
                this.f28150d = audioManager.getStreamVolume(3);
                this.f28151e = audioManager.getRingerMode();
                this.f28152f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                zzt.m2904q().mo43503t(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f28147a = -2;
        this.f28148b = false;
        this.f28149c = false;
        this.f28150d = 0;
        this.f28151e = 2;
        this.f28152f = 0;
    }

    /* renamed from: d */
    private final void m44799d(Context context) {
        Intent intent;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26855E8)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            intent = context.registerReceiver((BroadcastReceiver) null, intentFilter);
        } else {
            intent = context.registerReceiver((BroadcastReceiver) null, intentFilter, 4);
        }
        boolean z = false;
        if (intent != null) {
            int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            this.f28159m = (double) (((float) intent.getIntExtra("level", -1)) / ((float) intent.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f28160n = z;
            return;
        }
        this.f28159m = -1.0d;
        this.f28160n = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0050  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m44800e(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.f28153g = r2
            boolean r2 = com.google.android.gms.common.util.PlatformVersion.m4907l()
            r3 = 0
            if (r2 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzbiu r2 = com.google.android.gms.internal.ads.zzbjc.f27199n7
            com.google.android.gms.internal.ads.zzbja r4 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r2 = r4.mo42663b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0031
            r2 = 0
            goto L_0x0035
        L_0x0031:
            int r2 = r0.getNetworkType()
        L_0x0035:
            r5.f28155i = r2
            int r0 = r0.getPhoneType()
            r5.f28156j = r0
            r0 = -2
            r5.f28154h = r0
            r5.f28157k = r3
            r0 = -1
            r5.f28158l = r0
            com.google.android.gms.ads.internal.zzt.m2905r()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = com.google.android.gms.ads.internal.util.zzs.m2747U(r6, r2)
            if (r6 == 0) goto L_0x006f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L_0x0067
            int r0 = r6.getType()
            r5.f28154h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.f28158l = r6
            goto L_0x0069
        L_0x0067:
            r5.f28154h = r0
        L_0x0069:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.f28157k = r6
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcbg.m44800e(android.content.Context):void");
    }

    /* renamed from: a */
    public final zzcbh mo43286a() {
        return new zzcbh(this.f28147a, this.f28163q, this.f28164r, this.f28153g, this.f28165s, this.f28166t, this.f28167u, this.f28168v, this.f28148b, this.f28149c, this.f28169w, this.f28170x, this.f28145B, this.f28150d, this.f28154h, this.f28155i, this.f28156j, this.f28151e, this.f28152f, this.f28171y, this.f28172z, this.f28144A, this.f28159m, this.f28160n, this.f28157k, this.f28158l, this.f28161o, this.f28146C, this.f28162p);
    }

    public zzcbg(Context context, zzcbh zzcbh) {
        zzbjc.m43542c(context);
        m44798c(context);
        m44800e(context);
        m44799d(context);
        this.f28161o = Build.FINGERPRINT;
        this.f28162p = Build.DEVICE;
        this.f28146C = zzbka.m43635g(context);
        this.f28163q = zzcbh.f28173a;
        this.f28164r = zzcbh.f28174b;
        this.f28165s = zzcbh.f28176d;
        this.f28166t = zzcbh.f28177e;
        this.f28167u = zzcbh.f28178f;
        this.f28168v = zzcbh.f28179g;
        this.f28169w = zzcbh.f28180h;
        this.f28170x = zzcbh.f28181i;
        this.f28145B = zzcbh.f28182j;
        this.f28171y = zzcbh.f28185m;
        this.f28172z = zzcbh.f28186n;
        this.f28144A = zzcbh.f28187o;
    }
}
