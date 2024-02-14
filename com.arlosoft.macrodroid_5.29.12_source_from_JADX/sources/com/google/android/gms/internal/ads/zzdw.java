package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import java.net.UnknownHostException;
import org.apache.commons.p353io.IOUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdw {

    /* renamed from: a */
    private static final Object f33252a = new Object();
    @GuardedBy("lock")

    /* renamed from: b */
    private static final zzdv f33253b = zzdv.f33198a;

    /* renamed from: a */
    public static void m48251a(@Size(max = 23) String str, String str2) {
        synchronized (f33252a) {
        }
    }

    /* renamed from: b */
    public static void m48252b(@Size(max = 23) String str, String str2) {
        synchronized (f33252a) {
            Log.e(str, str2);
        }
    }

    /* renamed from: c */
    public static void m48253c(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m48252b(str, m48257g(str2, th));
    }

    /* renamed from: d */
    public static void m48254d(@Size(max = 23) String str, String str2) {
        synchronized (f33252a) {
            Log.i(str, str2);
        }
    }

    /* renamed from: e */
    public static void m48255e(@Size(max = 23) String str, String str2) {
        synchronized (f33252a) {
            Log.w(str, str2);
        }
    }

    /* renamed from: f */
    public static void m48256f(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m48255e(str, m48257g(str2, th));
    }

    /* renamed from: g */
    private static String m48257g(String str, @Nullable Throwable th) {
        String str2;
        synchronized (f33252a) {
            if (th != null) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        str2 = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    } else if (th2 instanceof UnknownHostException) {
                        str2 = "UnknownHostException (no network)";
                        break;
                    } else {
                        th2 = th2.getCause();
                    }
                }
            } else {
                try {
                    str2 = null;
                } catch (Throwable th3) {
                    while (true) {
                        throw th3;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String replace = str2.replace(IOUtils.LINE_SEPARATOR_UNIX, "\n  ");
        return str + "\n  " + replace + IOUtils.LINE_SEPARATOR_UNIX;
    }
}
