package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.cli.HelpFormatter;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzaq extends zzgl {

    /* renamed from: c */
    private long f46454c;

    /* renamed from: d */
    private String f46455d;

    /* renamed from: e */
    private AccountManager f46456e;

    /* renamed from: f */
    private Boolean f46457f;

    /* renamed from: g */
    private long f46458g;

    zzaq(zzfr zzfr) {
        super(zzfr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo55000g() {
        Calendar instance = Calendar.getInstance();
        this.f46454c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f46455d = lowerCase + HelpFormatter.DEFAULT_OPT_PREFIX + lowerCase2;
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: m */
    public final long mo55001m() {
        mo55073e();
        return this.f46458g;
    }

    /* renamed from: n */
    public final long mo55002n() {
        mo55243i();
        return this.f46454c;
    }

    /* renamed from: o */
    public final String mo55003o() {
        mo55243i();
        return this.f46455d;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: p */
    public final void mo55004p() {
        mo55073e();
        this.f46457f = null;
        this.f46458g = 0;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: q */
    public final boolean mo55005q() {
        mo55073e();
        long a = this.f46899a.mo55201a().mo21950a();
        if (a - this.f46458g > 86400000) {
            this.f46457f = null;
        }
        Boolean bool = this.f46457f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (ContextCompat.checkSelfPermission(this.f46899a.mo55202c(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f46899a.mo55221z().mo55105w().mo55091a("Permission error checking for dasher/unicorn accounts");
            this.f46458g = a;
            this.f46457f = Boolean.FALSE;
            return false;
        }
        if (this.f46456e == null) {
            this.f46456e = AccountManager.get(this.f46899a.mo55202c());
        }
        try {
            Account[] result = this.f46456e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f46456e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f46457f = Boolean.TRUE;
                    this.f46458g = a;
                    return true;
                }
                this.f46458g = a;
                this.f46457f = Boolean.FALSE;
                return false;
            }
            this.f46457f = Boolean.TRUE;
            this.f46458g = a;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            this.f46899a.mo55221z().mo55100r().mo55092b("Exception checking account types", e);
        }
    }
}
