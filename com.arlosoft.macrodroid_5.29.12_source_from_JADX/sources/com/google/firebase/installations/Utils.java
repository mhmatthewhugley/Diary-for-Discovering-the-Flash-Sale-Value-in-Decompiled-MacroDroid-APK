package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.time.Clock;
import com.google.firebase.installations.time.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class Utils {

    /* renamed from: b */
    public static final long f54856b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    private static final Pattern f54857c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    private static Utils f54858d;

    /* renamed from: a */
    private final Clock f54859a;

    private Utils(Clock clock) {
        this.f54859a = clock;
    }

    /* renamed from: c */
    public static Utils m76642c() {
        return m76643d(SystemClock.m76773b());
    }

    /* renamed from: d */
    public static Utils m76643d(Clock clock) {
        if (f54858d == null) {
            f54858d = new Utils(clock);
        }
        return f54858d;
    }

    /* renamed from: g */
    static boolean m76644g(@Nullable String str) {
        return f54857c.matcher(str).matches();
    }

    /* renamed from: h */
    static boolean m76645h(@Nullable String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long mo63241a() {
        return this.f54859a.mo63311a();
    }

    /* renamed from: b */
    public long mo63242b() {
        return TimeUnit.MILLISECONDS.toSeconds(mo63241a());
    }

    /* renamed from: e */
    public long mo63243e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean mo63244f(@NonNull PersistedInstallationEntry persistedInstallationEntry) {
        if (!TextUtils.isEmpty(persistedInstallationEntry.mo63249b()) && persistedInstallationEntry.mo63256h() + persistedInstallationEntry.mo63250c() >= mo63242b() + f54856b) {
            return false;
        }
        return true;
    }
}
