package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class GmsLogger {

    /* renamed from: a */
    private final String f3653a;
    @Nullable

    /* renamed from: b */
    private final String f3654b;

    @KeepForSdk
    public GmsLogger(@NonNull String str) {
        this(str, (String) null);
    }

    /* renamed from: j */
    private final String m4451j(String str) {
        String str2 = this.f3654b;
        return str2 == null ? str : str2.concat(str);
    }

    @KeepForSdk
    /* renamed from: a */
    public boolean mo21701a(int i) {
        return Log.isLoggable(this.f3653a, i);
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo21702b(@NonNull String str, @NonNull String str2) {
        if (mo21701a(3)) {
            m4451j(str2);
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public void mo21703c(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (mo21701a(3)) {
            m4451j(str2);
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public void mo21704d(@NonNull String str, @NonNull String str2) {
        if (mo21701a(6)) {
            Log.e(str, m4451j(str2));
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void mo21705e(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (mo21701a(6)) {
            Log.e(str, m4451j(str2), th);
        }
    }

    @KeepForSdk
    /* renamed from: f */
    public void mo21706f(@NonNull String str, @NonNull String str2) {
        if (mo21701a(4)) {
            Log.i(str, m4451j(str2));
        }
    }

    @KeepForSdk
    /* renamed from: g */
    public void mo21707g(@NonNull String str, @NonNull String str2) {
        if (mo21701a(2)) {
            m4451j(str2);
        }
    }

    @KeepForSdk
    /* renamed from: h */
    public void mo21708h(@NonNull String str, @NonNull String str2) {
        if (mo21701a(5)) {
            Log.w(str, m4451j(str2));
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public void mo21709i(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (mo21701a(5)) {
            Log.w(str, m4451j(str2), th);
        }
    }

    @KeepForSdk
    public GmsLogger(@NonNull String str, @Nullable String str2) {
        Preconditions.m4489l(str, "log tag cannot be null");
        Preconditions.m4480c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f3653a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f3654b = null;
        } else {
            this.f3654b = str2;
        }
    }
}
