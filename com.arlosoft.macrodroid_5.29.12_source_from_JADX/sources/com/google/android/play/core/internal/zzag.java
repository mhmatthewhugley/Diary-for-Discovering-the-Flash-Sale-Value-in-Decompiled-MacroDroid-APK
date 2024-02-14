package com.google.android.play.core.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzag {

    /* renamed from: a */
    private final String f51659a;

    public zzag(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String sb2 = sb.toString();
        String valueOf = String.valueOf(str);
        this.f51659a = valueOf.length() != 0 ? sb2.concat(valueOf) : new String(sb2);
    }

    /* renamed from: f */
    private static String m70793f(String str, String str2, @Nullable Object... objArr) {
        String str3;
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str3 = "Unable to format ".concat(valueOf);
                } else {
                    str3 = new String("Unable to format ");
                }
                Log.e("PlayCore", str3, e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public final int mo59805a(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m70793f(this.f51659a, str, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo59806b(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m70793f(this.f51659a, str, objArr));
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo59807c(Throwable th, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m70793f(this.f51659a, str, objArr), th);
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo59808d(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m70793f(this.f51659a, str, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo59809e(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m70793f(this.f51659a, str, objArr));
        }
        return 0;
    }
}
