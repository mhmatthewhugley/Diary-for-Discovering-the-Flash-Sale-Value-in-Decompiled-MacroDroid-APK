package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.p007os.EnvironmentCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcaf implements zzcah {

    /* renamed from: f */
    private static final Object f28047f = new Object();
    @VisibleForTesting

    /* renamed from: g */
    static zzcah f28048g;
    @VisibleForTesting

    /* renamed from: h */
    static zzcah f28049h;

    /* renamed from: a */
    private final Object f28050a = new Object();

    /* renamed from: b */
    private final Context f28051b;

    /* renamed from: c */
    private final WeakHashMap f28052c = new WeakHashMap();

    /* renamed from: d */
    private final ExecutorService f28053d;

    /* renamed from: e */
    private final zzcgv f28054e;

    protected zzcaf(Context context, zzcgv zzcgv) {
        zzfpy.m50764a();
        this.f28053d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f28051b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f28054e = zzcgv;
    }

    /* renamed from: c */
    public static zzcah m44757c(Context context) {
        synchronized (f28047f) {
            if (f28048g == null) {
                if (((Boolean) zzbla.f27487e.mo42728e()).booleanValue()) {
                    if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26883H6)).booleanValue()) {
                        f28048g = new zzcaf(context, zzcgv.m45239l2());
                    }
                }
                f28048g = new zzcag();
            }
        }
        return f28048g;
    }

    /* renamed from: d */
    public static zzcah m44758d(Context context, zzcgv zzcgv) {
        synchronized (f28047f) {
            if (f28049h == null) {
                if (((Boolean) zzbla.f27487e.mo42728e()).booleanValue()) {
                    if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26883H6)).booleanValue()) {
                        zzcaf zzcaf = new zzcaf(context, zzcgv);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzcaf.f28050a) {
                                zzcaf.f28052c.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new zzcae(zzcaf, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzcad(zzcaf, Thread.getDefaultUncaughtExceptionHandler()));
                        f28049h = zzcaf;
                    }
                }
                f28049h = new zzcag();
            }
        }
        return f28049h;
    }

    /* renamed from: a */
    public final void mo43252a(Throwable th, String str, float f) {
        boolean z;
        String str2;
        if (zzcgi.m45177f(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            double d = (double) f;
            double random = Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (random < d) {
                ArrayList<String> arrayList = new ArrayList<>();
                try {
                    z = Wrappers.m4929a(this.f28051b).mo21964g();
                } catch (Throwable th2) {
                    zzcgp.m45227e("Error fetching instant app info", th2);
                    z = false;
                }
                try {
                    str2 = this.f28051b.getPackageName();
                } catch (Throwable unused) {
                    zzcgp.m45229g("Cannot obtain package name, proceeding.");
                    str2 = EnvironmentCompat.MEDIA_UNKNOWN;
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    str4 = str3 + " " + str4;
                }
                arrayList.add(appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.f28054e.f28446a).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", zzbjc.m43540a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "474357726").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbla.f27485c.mo42728e())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.m3542h().mo21171b(this.f28051b))).appendQueryParameter("lite", true != this.f28054e.f28450g ? "0" : "1").toString());
                for (String zzcac : arrayList) {
                    this.f28053d.execute(new zzcac(new zzcgu((String) null), zzcac));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo43253b(Throwable th, String str) {
        mo43252a(th, str, 1.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo43254e(Thread thread, Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= zzcgi.m45178n(stackTraceElement.getClassName());
                    z2 |= zzcaf.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z && !z2) {
                mo43252a(th, "", 1.0f);
            }
        }
    }
}
