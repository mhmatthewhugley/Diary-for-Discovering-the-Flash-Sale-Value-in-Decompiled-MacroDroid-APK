package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class Storage {

    /* renamed from: c */
    private static final Lock f2925c = new ReentrantLock();
    @Nullable

    /* renamed from: d */
    private static Storage f2926d;

    /* renamed from: a */
    private final Lock f2927a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f2928b;

    @VisibleForTesting
    Storage(Context context) {
        this.f2928b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static Storage m3343b(@NonNull Context context) {
        Preconditions.m4488k(context);
        Lock lock = f2925c;
        lock.lock();
        try {
            if (f2926d == null) {
                f2926d = new Storage(context.getApplicationContext());
            }
            Storage storage = f2926d;
            lock.unlock();
            return storage;
        } catch (Throwable th) {
            f2925c.unlock();
            throw th;
        }
    }

    /* renamed from: k */
    private static final String m3344k(String str, String str2) {
        return str + ":" + str2;
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo21013a() {
        this.f2927a.lock();
        try {
            this.f2928b.edit().clear().apply();
        } finally {
            this.f2927a.unlock();
        }
    }

    @KeepForSdk
    @Nullable
    /* renamed from: c */
    public GoogleSignInAccount mo21014c() {
        String g;
        String g2 = mo21018g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo21018g(m3344k("googleSignInAccount", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m3284t2(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    @KeepForSdk
    @Nullable
    /* renamed from: d */
    public GoogleSignInOptions mo21015d() {
        String g;
        String g2 = mo21018g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo21018g(m3344k("googleSignInOptions", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m3308t2(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    @KeepForSdk
    @Nullable
    /* renamed from: e */
    public String mo21016e() {
        return mo21018g("refreshToken");
    }

    @KeepForSdk
    /* renamed from: f */
    public void mo21017f(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        Preconditions.m4488k(googleSignInAccount);
        Preconditions.m4488k(googleSignInOptions);
        mo21021j("defaultGoogleSignInAccount", googleSignInAccount.mo20972u2());
        Preconditions.m4488k(googleSignInAccount);
        Preconditions.m4488k(googleSignInOptions);
        String u2 = googleSignInAccount.mo20972u2();
        mo21021j(m3344k("googleSignInAccount", u2), googleSignInAccount.mo20973v2());
        mo21021j(m3344k("googleSignInOptions", u2), googleSignInOptions.mo20989x2());
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: g */
    public final String mo21018g(@NonNull String str) {
        this.f2927a.lock();
        try {
            return this.f2928b.getString(str, (String) null);
        } finally {
            this.f2927a.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo21019h(@NonNull String str) {
        this.f2927a.lock();
        try {
            this.f2928b.edit().remove(str).apply();
        } finally {
            this.f2927a.unlock();
        }
    }

    /* renamed from: i */
    public final void mo21020i() {
        String g = mo21018g("defaultGoogleSignInAccount");
        mo21019h("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(g)) {
            mo21019h(m3344k("googleSignInAccount", g));
            mo21019h(m3344k("googleSignInOptions", g));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo21021j(@NonNull String str, @NonNull String str2) {
        this.f2927a.lock();
        try {
            this.f2928b.edit().putString(str, str2).apply();
        } finally {
            this.f2927a.unlock();
        }
    }
}
