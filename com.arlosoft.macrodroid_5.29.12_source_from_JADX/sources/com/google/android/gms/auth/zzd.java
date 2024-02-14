package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;

public class zzd {

    /* renamed from: a */
    private static final String[] f2948a = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: b */
    public static final String f2949b = "callerUid";

    /* renamed from: c */
    public static final String f2950c = "androidPackageName";

    /* renamed from: d */
    private static final ComponentName f2951d = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Logger f2952e = new Logger("Auth", "GoogleAuthUtil");

    zzd() {
    }

    /* renamed from: a */
    private static void m3407a(Context context, int i) throws GoogleAuthException {
        try {
            GooglePlayServicesUtilLight.m3561b(context.getApplicationContext(), i);
        } catch (GooglePlayServicesRepairableException e) {
            throw new GooglePlayServicesAvailabilityException(e.mo21177b(), e.getMessage(), e.mo21187a());
        } catch (GooglePlayServicesNotAvailableException e2) {
            throw new GoogleAuthException(e2.getMessage());
        }
    }

    /* renamed from: b */
    public static String m3408b(Context context, Account account, String str) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return m3409c(context, account, str, new Bundle());
    }

    /* renamed from: c */
    public static String m3409c(Context context, Account account, String str, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        m3417k(account);
        return m3415i(context, account, str, bundle).mo20758m2();
    }

    @Deprecated
    /* renamed from: d */
    public static String m3410d(Context context, String str, String str2) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return m3408b(context, new Account(str, "com.google"), str2);
    }

    @RequiresPermission("android.permission.MANAGE_ACCOUNTS")
    @Deprecated
    /* renamed from: e */
    public static void m3411e(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    /* renamed from: g */
    private static <T> T m3413g(Context context, ComponentName componentName, zzj<T> zzj) throws IOException, GoogleAuthException {
        BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
        GmsClientSupervisor c = GmsClientSupervisor.m4444c(context);
        if (c.mo21696a(componentName, blockingServiceConnection, "GoogleAuthUtil")) {
            try {
                T a = zzj.mo21064a(blockingServiceConnection.mo21127a());
                c.mo21697e(componentName, blockingServiceConnection, "GoogleAuthUtil");
                return a;
            } catch (RemoteException | InterruptedException e) {
                f2952e.mo21841e("GoogleAuthUtil", "Error on service connection.", e);
                throw new IOException("Error on service connection.", e);
            } catch (Throwable th) {
                c.mo21697e(componentName, blockingServiceConnection, "GoogleAuthUtil");
                throw th;
            }
        } else {
            throw new IOException("Could not bind to service.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static <T> T m3414h(T t) throws IOException {
        if (t != null) {
            return t;
        }
        f2952e.mo21844h("GoogleAuthUtil", "Binder call returned null.");
        throw new IOException("Service unavailable.");
    }

    /* renamed from: i */
    public static TokenData m3415i(Context context, Account account, String str, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        Preconditions.m4487j("Calling this from your main thread can lead to deadlock");
        Preconditions.m4485h(str, "Scope cannot be empty or null.");
        m3417k(account);
        m3407a(context, 8400000);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        String str3 = f2950c;
        if (TextUtils.isEmpty(bundle2.getString(str3))) {
            bundle2.putString(str3, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return (TokenData) m3413g(context, f2951d, new zze(account, str, bundle2));
    }

    /* renamed from: k */
    private static void m3417k(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        } else if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = f2948a;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!strArr[i].equals(account.type)) {
                    i++;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        } else {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
    }
}
