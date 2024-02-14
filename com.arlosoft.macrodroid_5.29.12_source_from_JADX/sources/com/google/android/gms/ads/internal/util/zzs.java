package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.impl.C1721R;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbiu;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbka;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzcmg;
import com.google.android.gms.internal.ads.zzcnm;
import com.google.android.gms.internal.ads.zzdvb;
import com.google.android.gms.internal.ads.zzfdk;
import com.google.android.gms.internal.ads.zzfdn;
import com.google.android.gms.internal.ads.zzfpz;
import com.google.android.gms.internal.ads.zzfzg;
import com.google.android.gms.internal.ads.zzfzp;
import com.google.android.gms.internal.ads.zzgxw;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.apache.http.protocol.HTTP;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzs {

    /* renamed from: i */
    public static final zzfpz f2304i = new zzf(Looper.getMainLooper());

    /* renamed from: a */
    private final AtomicReference f2305a = new AtomicReference((Object) null);

    /* renamed from: b */
    private final AtomicReference f2306b = new AtomicReference((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f2307c = true;

    /* renamed from: d */
    private final Object f2308d = new Object();

    /* renamed from: e */
    private String f2309e;

    /* renamed from: f */
    private boolean f2310f = false;

    /* renamed from: g */
    private boolean f2311g = false;

    /* renamed from: h */
    private final Executor f2312h = Executors.newSingleThreadExecutor();

    /* renamed from: C */
    public static void m2734C(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzchc.f28456a.execute(runnable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m2735I(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L_0x0009
        L_0x0007:
            r2 = r0
            goto L_0x0013
        L_0x0009:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0007
            android.app.Activity r2 = (android.app.Activity) r2
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.m2735I(android.view.View):boolean");
    }

    /* renamed from: J */
    public static final void m2736J(Context context, Intent intent) {
        Bundle bundle;
        if (intent != null) {
            if (intent.getExtras() != null) {
                bundle = intent.getExtras();
            } else {
                bundle = new Bundle();
            }
            bundle.putBinder(CustomTabsIntent.EXTRA_SESSION, (IBinder) null);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(bundle);
        }
    }

    /* renamed from: K */
    public static final ViewGroup.LayoutParams m2737K() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    /* renamed from: L */
    public static final String m2738L(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return m2771v(m2770u(context));
    }

    /* renamed from: M */
    static final String m2739M() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* renamed from: N */
    public static final String m2740N() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    /* renamed from: O */
    public static final DisplayMetrics m2741O(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: P */
    protected static final int[] m2742P() {
        return new int[]{0, 0};
    }

    /* renamed from: Q */
    public static final long m2743Q(View view) {
        float f;
        int i;
        float f2 = Float.MAX_VALUE;
        Object obj = view;
        do {
            f = 0.0f;
            if (!(obj instanceof View)) {
                break;
            }
            View view2 = (View) obj;
            f2 = Math.min(f2, view2.getAlpha());
            i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            obj = view2.getParent();
        } while (i > 0);
        if (f2 >= 0.0f) {
            f = f2;
        }
        return (long) Math.round(f * 100.0f);
    }

    @Nullable
    /* renamed from: R */
    public static final WebResourceResponse m2744R(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(HTTP.USER_AGENT, zzt.m2905r().mo20412z(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).mo20332b(0, str2, hashMap, (byte[]) null).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            zzcgp.m45230h("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    /* renamed from: S */
    public static final String m2745S() {
        Resources d = zzt.m2904q().mo43491d();
        return d != null ? d.getString(C1721R.string.f1787s7) : "Test Ad";
    }

    @Nullable
    /* renamed from: T */
    public static final zzbr m2746T(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzcgp.m45226d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof zzbr ? (zzbr) queryLocalInterface : new zzbp(iBinder);
        } catch (Exception e) {
            zzt.m2904q().mo43503t(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    /* renamed from: U */
    public static final boolean m2747U(Context context, String str) {
        Context a = zzcbq.m44809a(context);
        return Wrappers.m4929a(a).mo21959b(str, a.getPackageName()) == 0;
    }

    /* renamed from: V */
    public static final boolean m2748V(String str) {
        if (!zzcgo.m45209l()) {
            return false;
        }
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27086c4)).booleanValue()) {
            return false;
        }
        String str2 = (String) zzay.m1924c().mo42663b(zzbjc.f27106e4);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) zzay.m1924c().mo42663b(zzbjc.f27096d4);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    public static final boolean m2749W(Context context) {
        KeyguardManager t;
        if (context == null || (t = m2769t(context)) == null || !t.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m2750a(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzcgp.m45227e("Error loading class.", th);
            zzt.m2904q().mo43503t(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m2751b() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    /* renamed from: c */
    public static final boolean m2752c(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                                return true;
                            }
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null) {
                                return true;
                            }
                            if (powerManager.isScreenOn()) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m2753d(Context context) {
        Bundle u = m2770u(context);
        return TextUtils.isEmpty(m2771v(u)) && !TextUtils.isEmpty(u.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    /* renamed from: e */
    public static final boolean m2754e(Context context) {
        Window window;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final void m2755f(View view, int i, MotionEvent motionEvent) {
        int i2;
        String str;
        int i3;
        int i4;
        String str2;
        zzfdk t;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof zzdvb) {
                view2 = ((zzdvb) view2).getChildAt(0);
            }
            if ((view2 instanceof zzg) || (view2 instanceof NativeAdView)) {
                str = "NATIVE";
                i2 = 1;
            } else {
                str = "UNKNOWN";
                i2 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i3 = rect.width();
                i4 = rect.height();
            } else {
                i4 = 0;
                i3 = 0;
            }
            zzt.m2905r();
            long Q = m2743Q(view2);
            view2.getLocationOnScreen(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            String str3 = "none";
            if (view2 instanceof zzcnm) {
                zzfdn O = ((zzcnm) view2).mo44022O();
                if (O != null) {
                    str2 = O.f35566b;
                    int hashCode = view2.hashCode();
                    view2.setContentDescription(str2 + ":" + hashCode);
                    if ((view2 instanceof zzcmg) && (t = ((zzcmg) view2).mo43986t()) != null) {
                        str = zzfdk.m49940a(t.f35521b);
                        i2 = t.f35529f;
                        str3 = t.f35498F;
                    }
                    zzcgp.m45228f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(Q), Integer.toString(i, 2)}));
                }
            }
            str2 = str3;
            str = zzfdk.m49940a(t.f35521b);
            i2 = t.f35529f;
            str3 = t.f35498F;
            zzcgp.m45228f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(Q), Integer.toString(i, 2)}));
        } catch (Exception e) {
            zzcgp.m45227e("Failure getting view location.", e);
        }
    }

    /* renamed from: g */
    public static final AlertDialog.Builder m2756g(Context context) {
        return new AlertDialog.Builder(context, zzt.m2906s().mo20246a());
    }

    /* renamed from: h */
    public static final void m2757h(Context context, String str, String str2) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str2);
        for (String zzby : arrayList) {
            new zzby(context, str, zzby).mo20314b();
        }
    }

    /* renamed from: i */
    public static final void m2758i(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) zzbla.f27484b.mo42728e()).booleanValue()) {
                    CrashUtils.m4870a(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: j */
    public static final void m2759j(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* renamed from: k */
    public static final int m2760k(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            zzcgp.m45229g("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    @Nullable
    /* renamed from: l */
    public static final Map m2761l(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, uri.getQueryParameter(next));
            }
        }
        return hashMap;
    }

    /* renamed from: m */
    public static final WebResourceResponse m2762m(HttpURLConnection httpURLConnection) throws IOException {
        String str;
        zzt.m2905r();
        String contentType = httpURLConnection.getContentType();
        String str2 = "";
        if (TextUtils.isEmpty(contentType)) {
            str = str2;
        } else {
            str = contentType.split(";")[0].trim();
        }
        zzt.m2905r();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str2 = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str3 = str2;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).isEmpty())) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return zzt.m2906s().mo20248c(str, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    /* renamed from: n */
    public static final int[] m2763n(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return m2742P();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] m2764o(android.app.Activity r6) {
        /*
            android.view.Window r0 = r6.getWindow()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto L_0x0021
            int[] r4 = new int[r1]
            int r5 = r0.getTop()
            r4[r3] = r5
            int r0 = r0.getBottom()
            r4[r2] = r0
            goto L_0x0025
        L_0x0021:
            int[] r4 = m2742P()
        L_0x0025:
            int[] r0 = new int[r1]
            com.google.android.gms.internal.ads.zzcgi r1 = com.google.android.gms.ads.internal.client.zzaw.m1917b()
            r5 = r4[r3]
            int r1 = r1.mo43547c(r6, r5)
            r0[r3] = r1
            com.google.android.gms.internal.ads.zzcgi r1 = com.google.android.gms.ads.internal.client.zzaw.m1917b()
            r3 = r4[r2]
            int r6 = r1.mo43547c(r6, r3)
            r0[r2] = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.m2764o(android.app.Activity):int[]");
    }

    /* renamed from: p */
    public static final boolean m2765p(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = zzt.m2905r().f2307c || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || m2735I(view);
        long Q = m2743Q(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27103e1)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27200n8)).booleanValue()) {
                    return true;
                }
                if (Q < ((long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f27220p8)).intValue())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public static final void m2766q(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m2736J(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            zzcgp.m45224b("Opening " + uri2 + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            zzcgp.m45227e("No browser is found.", e);
        }
    }

    /* renamed from: r */
    public static final int[] m2767r(Activity activity) {
        int[] n = m2763n(activity);
        return new int[]{zzaw.m1917b().mo43547c(activity, n[0]), zzaw.m1917b().mo43547c(activity, n[1])};
    }

    /* renamed from: s */
    public static final boolean m2768s(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return m2765p(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m2769t(context));
    }

    @Nullable
    /* renamed from: t */
    private static KeyguardManager m2769t(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    @Nullable
    /* renamed from: u */
    private static Bundle m2770u(Context context) {
        try {
            return Wrappers.m4929a(context).mo21960c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.m2646l("Error getting metadata", e);
            return null;
        }
    }

    /* renamed from: v */
    private static String m2771v(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        if (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) {
            return string;
        }
        return "";
    }

    /* renamed from: w */
    private static boolean m2772w(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    /* renamed from: x */
    public static int m2773x(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        zzcgp.m45229g("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    /* renamed from: B */
    public final void mo20405B(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int x = m2773x(i);
        zzcgp.m45228f("HTTP timeout: " + x + " milliseconds.");
        httpURLConnection.setConnectTimeout(x);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(x);
        httpURLConnection.setRequestProperty(HTTP.USER_AGENT, mo20412z(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: D */
    public final boolean mo20406D(String str) {
        return m2772w(str, this.f2305a, (String) zzay.m1924c().mo42663b(zzbjc.f27052Z));
    }

    /* renamed from: E */
    public final boolean mo20407E(String str) {
        return m2772w(str, this.f2306b, (String) zzay.m1924c().mo42663b(zzbjc.f27062a0));
    }

    /* renamed from: F */
    public final boolean mo20408F(Context context) {
        if (this.f2311g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbjc.m43542c(context);
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26855E8)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzp(this, (zzo) null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(this, (zzo) null), intentFilter, 4);
        }
        this.f2311g = true;
        return true;
    }

    /* renamed from: G */
    public final boolean mo20409G(Context context) {
        if (this.f2310f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbjc.m43542c(context);
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26855E8)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzr(this, (zzq) null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzr(this, (zzq) null), intentFilter, 4);
        }
        this.f2310f = true;
        return true;
    }

    /* renamed from: H */
    public final int mo20410H(Context context, Uri uri) {
        int i;
        if (context == null) {
            zze.m2645k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            zze.m2645k("Chrome Custom Tabs can only work with Activity context.");
            i = 2;
        } else {
            i = 0;
        }
        zzbiu zzbiu = zzbjc.f26890I3;
        zzbiu zzbiu2 = zzbjc.f26900J3;
        if (true == ((Boolean) zzay.m1924c().mo42663b(zzbiu)).equals(zzay.m1924c().mo42663b(zzbiu2))) {
            i = 9;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i;
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbiu)).booleanValue()) {
            zzbka zzbka = new zzbka();
            zzbka.mo42724e(new zzn(this, zzbka, context, uri));
            zzbka.mo42721b((Activity) context);
        }
        if (!((Boolean) zzay.m1924c().mo42663b(zzbiu2)).booleanValue()) {
            return 5;
        }
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        build.intent.setPackage(zzgxw.m53666a(context));
        build.launchUrl(context, uri);
        return 5;
    }

    /* renamed from: y */
    public final zzfzp mo20411y(Uri uri) {
        return zzfzg.m51416k(new zzl(uri), this.f2312h);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:11|12|(1:14)(3:15|(1:17)(1:18)|19)|20|21|22|(1:24)|25|(1:27)|28|(3:29|30|(1:32))|36|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[Catch:{ Exception -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b A[Catch:{ Exception -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083 A[Catch:{ Exception -> 0x0099 }] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo20412z(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f2308d
            monitor-enter(r0)
            java.lang.String r1 = r4.f2309e     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return r1
        L_0x0009:
            if (r6 != 0) goto L_0x0011
            java.lang.String r5 = m2739M()     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return r5
        L_0x0011:
            com.google.android.gms.ads.internal.util.zzce r1 = com.google.android.gms.ads.internal.util.zzce.m2627a()     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = r1.f2244a     // Catch:{ Exception -> 0x0045 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0045 }
            if (r2 != 0) goto L_0x001e
            goto L_0x0041
        L_0x001e:
            boolean r2 = com.google.android.gms.common.util.ClientLibraryUtils.m4857a()     // Catch:{ Exception -> 0x0045 }
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.ads.internal.util.zzcc r2 = new com.google.android.gms.ads.internal.util.zzcc     // Catch:{ Exception -> 0x0045 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r2 = com.google.android.gms.ads.internal.util.zzcb.m2626a(r5, r2)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0045 }
            goto L_0x003f
        L_0x0030:
            android.content.Context r2 = com.google.android.gms.common.GooglePlayServicesUtilLight.m3564e(r5)     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.ads.internal.util.zzcd r3 = new com.google.android.gms.ads.internal.util.zzcd     // Catch:{ Exception -> 0x0045 }
            r3.<init>(r2, r5)     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r2 = com.google.android.gms.ads.internal.util.zzcb.m2626a(r5, r3)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0045 }
        L_0x003f:
            r1.f2244a = r2     // Catch:{ Exception -> 0x0045 }
        L_0x0041:
            java.lang.String r1 = r1.f2244a     // Catch:{ Exception -> 0x0045 }
            r4.f2309e = r1     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            java.lang.String r1 = r4.f2309e     // Catch:{ all -> 0x00ba }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0053
            java.lang.String r1 = android.webkit.WebSettings.getDefaultUserAgent(r5)     // Catch:{ all -> 0x00ba }
            r4.f2309e = r1     // Catch:{ all -> 0x00ba }
        L_0x0053:
            java.lang.String r1 = r4.f2309e     // Catch:{ all -> 0x00ba }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = m2739M()     // Catch:{ all -> 0x00ba }
            r4.f2309e = r1     // Catch:{ all -> 0x00ba }
        L_0x0061:
            java.lang.String r1 = r4.f2309e     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r2.<init>()     // Catch:{ all -> 0x00ba }
            r2.append(r1)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = " (Mobile; "
            r2.append(r1)     // Catch:{ all -> 0x00ba }
            r2.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00ba }
            r4.f2309e = r6     // Catch:{ all -> 0x00ba }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r5 = com.google.android.gms.common.wrappers.Wrappers.m4929a(r5)     // Catch:{ Exception -> 0x0099 }
            boolean r5 = r5.mo21964g()     // Catch:{ Exception -> 0x0099 }
            if (r5 == 0) goto L_0x00a3
            java.lang.String r5 = r4.f2309e     // Catch:{ Exception -> 0x0099 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r6.<init>()     // Catch:{ Exception -> 0x0099 }
            r6.append(r5)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = ";aia"
            r6.append(r5)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0099 }
            r4.f2309e = r5     // Catch:{ Exception -> 0x0099 }
            goto L_0x00a3
        L_0x0099:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzcfy r6 = com.google.android.gms.ads.internal.zzt.m2904q()     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.mo43503t(r5, r1)     // Catch:{ all -> 0x00ba }
        L_0x00a3:
            java.lang.String r5 = r4.f2309e     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r6.<init>()     // Catch:{ all -> 0x00ba }
            r6.append(r5)     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = ")"
            r6.append(r5)     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x00ba }
            r4.f2309e = r5     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return r5
        L_0x00ba:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.mo20412z(android.content.Context, java.lang.String):java.lang.String");
    }
}
