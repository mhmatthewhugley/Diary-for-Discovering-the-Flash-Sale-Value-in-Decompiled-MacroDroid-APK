package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class Logger {

    /* renamed from: a */
    private final String f3791a;

    /* renamed from: b */
    private final String f3792b;

    /* renamed from: c */
    private final GmsLogger f3793c;

    /* renamed from: d */
    private final int f3794d;

    @KeepForSdk
    public Logger(@NonNull String str, @NonNull String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        }
        this.f3792b = str2;
        this.f3791a = str;
        this.f3793c = new GmsLogger(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f3791a, i)) {
            i++;
        }
        this.f3794d = i;
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo21837a(@NonNull String str, @NonNull Object... objArr) {
        if (mo21842f(3)) {
            mo21840d(str, objArr);
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo21838b(@NonNull String str, @NonNull Throwable th, @NonNull Object... objArr) {
        Log.e(this.f3791a, mo21840d(str, objArr), th);
    }

    @KeepForSdk
    /* renamed from: c */
    public void mo21839c(@NonNull String str, @NonNull Object... objArr) {
        Log.e(this.f3791a, mo21840d(str, objArr));
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public String mo21840d(@NonNull String str, @NonNull Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f3792b.concat(str);
    }

    @KeepForSdk
    /* renamed from: e */
    public void mo21841e(@NonNull String str, @NonNull Object... objArr) {
        Log.i(this.f3791a, mo21840d(str, objArr));
    }

    @KeepForSdk
    /* renamed from: f */
    public boolean mo21842f(int i) {
        return this.f3794d <= i;
    }

    @KeepForSdk
    /* renamed from: g */
    public void mo21843g(@NonNull String str, @NonNull Object... objArr) {
        if (mo21842f(2)) {
            mo21840d(str, objArr);
        }
    }

    @KeepForSdk
    /* renamed from: h */
    public void mo21844h(@NonNull String str, @NonNull Object... objArr) {
        Log.w(this.f3791a, mo21840d(str, objArr));
    }

    @KeepForSdk
    /* renamed from: i */
    public void mo21845i(@NonNull String str, @NonNull Throwable th, @NonNull Object... objArr) {
        Log.wtf(this.f3791a, mo21840d(str, objArr), th);
    }

    @KeepForSdk
    /* renamed from: j */
    public void mo21846j(@NonNull Throwable th) {
        Log.wtf(this.f3791a, th);
    }
}
