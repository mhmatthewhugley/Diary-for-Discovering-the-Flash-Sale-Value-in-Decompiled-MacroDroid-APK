package com.google.android.gms.internal.ads;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.ads.AdRequest;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class zzcgp {

    /* renamed from: a */
    protected static final zzftk f28444a = zzftk.m50963b(4000);

    @VisibleForTesting
    /* renamed from: a */
    static String m45223a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        return str + " @" + lineNumber;
    }

    /* renamed from: b */
    public static void m45224b(String str) {
        if (m45232j(3) && str.length() > 4000) {
            for (String str2 : f28444a.mo46184d(str)) {
            }
        }
    }

    /* renamed from: c */
    public static void m45225c(String str, Throwable th) {
        m45232j(3);
    }

    /* renamed from: d */
    public static void m45226d(String str) {
        if (!m45232j(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e(AdRequest.LOGTAG, str);
            return;
        }
        boolean z = true;
        for (String str2 : f28444a.mo46184d(str)) {
            if (z) {
                Log.e(AdRequest.LOGTAG, str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z = false;
        }
    }

    /* renamed from: e */
    public static void m45227e(String str, Throwable th) {
        if (m45232j(6)) {
            Log.e(AdRequest.LOGTAG, str, th);
        }
    }

    /* renamed from: f */
    public static void m45228f(String str) {
        if (!m45232j(4)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.i(AdRequest.LOGTAG, str);
            return;
        }
        boolean z = true;
        for (String str2 : f28444a.mo46184d(str)) {
            if (z) {
                Log.i(AdRequest.LOGTAG, str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z = false;
        }
    }

    /* renamed from: g */
    public static void m45229g(String str) {
        if (!m45232j(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w(AdRequest.LOGTAG, str);
            return;
        }
        boolean z = true;
        for (String str2 : f28444a.mo46184d(str)) {
            if (z) {
                Log.w(AdRequest.LOGTAG, str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z = false;
        }
    }

    /* renamed from: h */
    public static void m45230h(String str, Throwable th) {
        if (m45232j(5)) {
            Log.w(AdRequest.LOGTAG, str, th);
        }
    }

    /* renamed from: i */
    public static void m45231i(String str, @Nullable Throwable th) {
        if (!m45232j(5)) {
            return;
        }
        if (th != null) {
            m45230h(m45223a(str), th);
        } else {
            m45229g(m45223a(str));
        }
    }

    /* renamed from: j */
    public static boolean m45232j(int i) {
        return i >= 5 || Log.isLoggable(AdRequest.LOGTAG, i);
    }
}
