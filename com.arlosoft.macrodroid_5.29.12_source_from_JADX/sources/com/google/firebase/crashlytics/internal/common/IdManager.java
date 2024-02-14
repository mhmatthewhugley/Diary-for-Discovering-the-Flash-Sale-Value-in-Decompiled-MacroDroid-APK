package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

public class IdManager implements InstallIdProvider {

    /* renamed from: g */
    private static final Pattern f5014g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    private static final String f5015h = Pattern.quote("/");

    /* renamed from: a */
    private final InstallerPackageNameProvider f5016a;

    /* renamed from: b */
    private final Context f5017b;

    /* renamed from: c */
    private final String f5018c;

    /* renamed from: d */
    private final FirebaseInstallationsApi f5019d;

    /* renamed from: e */
    private final DataCollectionArbiter f5020e;

    /* renamed from: f */
    private String f5021f;

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.f5017b = context;
            this.f5018c = str;
            this.f5019d = firebaseInstallationsApi;
            this.f5020e = dataCollectionArbiter;
            this.f5016a = new InstallerPackageNameProvider();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    @NonNull
    /* renamed from: b */
    private synchronized String m6753b(String str, SharedPreferences sharedPreferences) {
        String e;
        e = m6756e(UUID.randomUUID().toString());
        Logger f = Logger.m6525f();
        f.mo22960i("Created new Crashlytics installation ID: " + e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e).putString("firebase.installation.id", str).apply();
        return e;
    }

    /* renamed from: c */
    static String m6754c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    @Nullable
    /* renamed from: d */
    private String m6755d() {
        try {
            return (String) Utils.m6804d(this.f5019d.getId());
        } catch (Exception e) {
            Logger.m6525f().mo22963l("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    /* renamed from: e */
    private static String m6756e(String str) {
        if (str == null) {
            return null;
        }
        return f5014g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: k */
    static boolean m6757k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    /* renamed from: l */
    private String m6758l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", (String) null);
    }

    /* renamed from: m */
    private String m6759m(String str) {
        return str.replaceAll(f5015h, "");
    }

    @NonNull
    /* renamed from: a */
    public synchronized String mo23049a() {
        String str = this.f5021f;
        if (str != null) {
            return str;
        }
        Logger.m6525f().mo22960i("Determining Crashlytics installation ID...");
        SharedPreferences r = CommonUtils.m6595r(this.f5017b);
        String string = r.getString("firebase.installation.id", (String) null);
        Logger f = Logger.m6525f();
        f.mo22960i("Cached Firebase Installation ID: " + string);
        if (this.f5020e.mo23043d()) {
            String d = m6755d();
            Logger f2 = Logger.m6525f();
            f2.mo22960i("Fetched Firebase Installation ID: " + d);
            if (d == null) {
                d = string == null ? m6754c() : string;
            }
            if (d.equals(string)) {
                this.f5021f = m6758l(r);
            } else {
                this.f5021f = m6753b(d, r);
            }
        } else if (m6757k(string)) {
            this.f5021f = m6758l(r);
        } else {
            this.f5021f = m6753b(m6754c(), r);
        }
        if (this.f5021f == null) {
            Logger.m6525f().mo22962k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f5021f = m6753b(m6754c(), r);
        }
        Logger f3 = Logger.m6525f();
        f3.mo22960i("Crashlytics installation ID: " + this.f5021f);
        return this.f5021f;
    }

    /* renamed from: f */
    public String mo23050f() {
        return this.f5018c;
    }

    /* renamed from: g */
    public String mo23051g() {
        return this.f5016a.mo23055a(this.f5017b);
    }

    /* renamed from: h */
    public String mo23052h() {
        return String.format(Locale.US, "%s/%s", new Object[]{m6759m(Build.MANUFACTURER), m6759m(Build.MODEL)});
    }

    /* renamed from: i */
    public String mo23053i() {
        return m6759m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String mo23054j() {
        return m6759m(Build.VERSION.RELEASE);
    }
}
