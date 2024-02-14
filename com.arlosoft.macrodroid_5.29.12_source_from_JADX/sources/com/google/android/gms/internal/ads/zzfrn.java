package com.google.android.gms.internal.ads;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfrn {

    /* renamed from: a */
    private final String f36303a;

    public zzfrn(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.f36303a = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(str);
    }

    /* renamed from: f */
    private static String m50875f(String str, String str2, @Nullable Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* renamed from: a */
    public final int mo46140a(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m50875f(this.f36303a, "Already connected to the service.", objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo46141b(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m50875f(this.f36303a, str, objArr));
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo46142c(Throwable th, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m50875f(this.f36303a, str, objArr), th);
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo46143d(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m50875f(this.f36303a, str, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo46144e(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m50875f(this.f36303a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
