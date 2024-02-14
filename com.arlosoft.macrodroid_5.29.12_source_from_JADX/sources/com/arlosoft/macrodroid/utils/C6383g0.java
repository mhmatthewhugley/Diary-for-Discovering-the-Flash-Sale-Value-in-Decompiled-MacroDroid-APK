package com.arlosoft.macrodroid.utils;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.email.EmailOauthConfigureActivity;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.util.ExponentialBackOff;
import java.util.Arrays;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.utils.g0 */
/* compiled from: GmailHelper */
public class C6383g0 {

    /* renamed from: d */
    private static final String[] f14973d = {"https://www.googleapis.com/auth/gmail.send"};

    /* renamed from: e */
    private static C6383g0 f14974e;

    /* renamed from: a */
    private final String f14975a = "GmailHelper";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f14976b;

    /* renamed from: c */
    private GoogleAccountCredential f14977c;

    /* renamed from: com.arlosoft.macrodroid.utils.g0$a */
    /* compiled from: GmailHelper */
    class C6384a extends Thread {

        /* renamed from: a */
        final /* synthetic */ String f14978a;

        C6384a(String str) {
            this.f14978a = str;
        }

        public void run() {
            try {
                AccountManager.get(C6383g0.this.f14976b).getAuthToken(new Account(this.f14978a, "com.google"), "oauth2:https://www.googleapis.com/auth/gmail.send", (Bundle) null, true, (AccountManagerCallback) null, (Handler) null);
            } catch (Exception unused) {
            }
        }
    }

    private C6383g0(Context context) {
        this.f14976b = context;
    }

    /* renamed from: d */
    public static C6383g0 m24633d(Context context) {
        if (f14974e == null) {
            f14974e = new C6383g0(context);
        }
        return f14974e;
    }

    /* renamed from: f */
    private boolean m24634f() {
        return true;
    }

    /* renamed from: b */
    public void mo32425b(GoogleAccountCredential googleAccountCredential, Activity activity) {
        try {
            activity.startActivityForResult(googleAccountCredential.mo60273e(), 1000);
        } catch (ActivityNotFoundException e) {
            C15626c.m94876a(this.f14976b.getApplicationContext(), String.format(this.f14976b.getString(2131952680), new Object[]{this.f14976b.getString(C17541R$string.send_email)}), 0).show();
            C4878b.m18868g("No activity found for REQUEST_ACCOUNT_PICKER: " + e.toString());
        }
    }

    /* renamed from: c */
    public GoogleAccountCredential mo32426c() {
        if (this.f14977c == null) {
            this.f14977c = GoogleAccountCredential.m71830h(this.f14976b.getApplicationContext(), Arrays.asList(f14973d)).mo60274f(new ExponentialBackOff()).mo60275g(this.f14976b.getSharedPreferences("GmailHelper", 0).getString("accountName", (String) null));
        }
        return this.f14977c;
    }

    /* renamed from: e */
    public boolean mo32427e(int i, int i2, Intent intent) {
        if (this.f14977c == null) {
            this.f14977c = GoogleAccountCredential.m71830h(this.f14976b.getApplicationContext(), Arrays.asList(f14973d)).mo60274f(new ExponentialBackOff()).mo60275g(this.f14976b.getSharedPreferences("GmailHelper", 0).getString("accountName", (String) null));
        }
        if (i != 1000) {
            if (i == 1002 && i2 != -1) {
                m24634f();
            }
        } else if (!(i2 != -1 || intent == null || intent.getExtras() == null)) {
            String stringExtra = intent.getStringExtra("authAccount");
            if (stringExtra == null) {
                return false;
            }
            this.f14977c.mo60275g(stringExtra);
            SharedPreferences.Editor edit = this.f14976b.getSharedPreferences("GmailHelper", 0).edit();
            edit.putString("accountName", stringExtra);
            edit.apply();
            C5163j2.m20002K3(this.f14976b, stringExtra);
            new C6384a(stringExtra).start();
            return true;
        }
        return true;
    }

    /* renamed from: g */
    public void mo32428g() {
        NotificationManagerCompat.from(this.f14976b).notify(787434, new NotificationCompat.Builder(this.f14976b).setSmallIcon((int) C17530R$drawable.ic_warning_white_24dp).setContentTitle(this.f14976b.getString(C17541R$string.gmail_config_required)).setContentText(this.f14976b.getString(C17541R$string.click_to_configure_gmail)).setContentIntent(PendingIntent.getActivity(this.f14976b, 0, new Intent(this.f14976b, EmailOauthConfigureActivity.class), C6368b1.f14959b | 268435456)).setPriority(2).setDefaults(-1).setChannelId("info_notification").setAutoCancel(true).build());
    }

    /* renamed from: h */
    public void mo32429h(Intent intent) {
        NotificationManagerCompat.from(this.f14976b).notify(787434, new NotificationCompat.Builder(this.f14976b).setSmallIcon((int) C17530R$drawable.ic_warning_white_24dp).setContentTitle(this.f14976b.getString(C17541R$string.gmail_config_required)).setContentText(this.f14976b.getString(C17541R$string.click_to_authorize_gmail)).setContentIntent(PendingIntent.getActivity(this.f14976b, 0, intent, C6368b1.f14959b | 268435456)).setPriority(2).setDefaults(-1).setChannelId("info_notification").setAutoCancel(true).build());
    }

    /* renamed from: i */
    public void mo32430i(String str) {
        SharedPreferences.Editor edit = this.f14976b.getSharedPreferences("GmailHelper", 0).edit();
        edit.putString("accountName", str);
        edit.apply();
        this.f14977c = GoogleAccountCredential.m71830h(this.f14976b.getApplicationContext(), Arrays.asList(f14973d)).mo60274f(new ExponentialBackOff()).mo60275g(str);
    }
}
