package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.webkit.ProxyConfig;
import androidx.work.WorkRequest;
import com.android.p023dx.rop.code.RegisterSpec;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.p204firebaseauthapi.zzf;
import com.google.android.gms.internal.p204firebaseauthapi.zzxe;
import com.google.android.gms.internal.p204firebaseauthapi.zzxg;
import com.google.android.gms.internal.p204firebaseauthapi.zzxr;
import com.google.android.gms.internal.p204firebaseauthapi.zzyz;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class RecaptchaActivity extends FragmentActivity implements zzxg {

    /* renamed from: f */
    private static final String f4572f = "RecaptchaActivity";

    /* renamed from: g */
    private static final ExecutorService f4573g = zzf.m57219a().mo49367v(2);

    /* renamed from: o */
    private static long f4574o = 0;

    /* renamed from: p */
    private static final zzbm f4575p = zzbm.m6232c();

    /* renamed from: d */
    private boolean f4576d = false;

    /* renamed from: K1 */
    private final void m6153K1() {
        f4574o = 0;
        this.f4576d = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        f4575p.mo22777d(this);
        finish();
    }

    /* renamed from: L1 */
    private final void m6154L1(Status status) {
        f4574o = 0;
        this.f4576d = false;
        Intent intent = new Intent();
        zzbl.m6230c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        f4575p.mo22777d(this);
        finish();
    }

    /* renamed from: A1 */
    public final void mo22725A1(@NonNull String str, @Nullable Status status) {
        if (status == null) {
            m6153K1();
        } else {
            m6154L1(status);
        }
    }

    @Nullable
    /* renamed from: C */
    public final HttpURLConnection mo22726C(@NonNull URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            zzxg.f40592h.mo21839c("Error generating connection", new Object[0]);
            return null;
        }
    }

    @NonNull
    /* renamed from: f0 */
    public final String mo22728f0(@NonNull String str) {
        return zzyz.m58514b(str);
    }

    /* renamed from: n1 */
    public final void mo22729n1(@NonNull Uri uri, @NonNull String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.putExtra("com.android.browser.application_id", str);
                intent.addFlags(BasicMeasure.EXACTLY);
                intent.addFlags(268435456);
                startActivity(intent);
                return;
            }
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.addFlags(BasicMeasure.EXACTLY);
            build.intent.addFlags(268435456);
            build.launchUrl(this, uri);
            return;
        }
        Log.e(f4572f, "Device cannot resolve intent for: android.intent.action.VIEW");
        mo22725A1(str, (Status) null);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(@NonNull Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long a = DefaultClock.m4871d().mo21950a();
            if (a - f4574o < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                Log.e(f4572f, "Could not start operation - already in progress");
                return;
            }
            f4574o = a;
            if (bundle != null) {
                this.f4576d = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
                return;
            }
            return;
        }
        Log.e(f4572f, "Could not do operation - unknown action: ".concat(String.valueOf(action)));
        m6153K1();
    }

    public final void onNewIntent(@NonNull Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                m6154L1(zzbl.m6229b(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                m6153K1();
            } else {
                String stringExtra = intent.getStringExtra("link");
                String c = zzj.m6258b().mo22794c(getApplicationContext(), getPackageName(), intent.getStringExtra("eventId"));
                if (TextUtils.isEmpty(c)) {
                    Log.e(f4572f, "Failed to find registration for this event - failing to prevent session injection.");
                    m6154L1(zzai.m6170a("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = zzk.m6265a(getApplicationContext(), FirebaseApp.m74384n(c).mo61953q()).mo22797b(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                f4574o = 0;
                this.f4576d = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent2)) {
                    SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    edit.putString("recaptchaToken", queryParameter);
                    edit.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                    edit.putLong("timestamp", DefaultClock.m4871d().mo21950a());
                    edit.commit();
                } else {
                    f4575p.mo22777d(this);
                }
                finish();
            }
        } else if (!this.f4576d) {
            Intent intent3 = getIntent();
            String packageName = getPackageName();
            try {
                new zzxe(packageName, Hex.m4885b(AndroidUtilsLight.m4839a(this, packageName)).toLowerCase(Locale.US), intent3, FirebaseApp.m74384n(intent3.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME")), this).executeOnExecutor(f4573g, new Void[0]);
            } catch (PackageManager.NameNotFoundException e) {
                String str = f4572f;
                String obj = e.toString();
                Log.e(str, "Could not get package signature: " + packageName + " " + obj);
                mo22725A1(packageName, (Status) null);
            }
            this.f4576d = true;
        } else {
            m6153K1();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f4576d);
    }

    @Nullable
    /* renamed from: u */
    public final Uri.Builder mo22730u(@NonNull Intent intent, @NonNull String str, @NonNull String str2) {
        String str3;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        FirebaseApp n = FirebaseApp.m74384n(stringExtra3);
        FirebaseAuth instance = FirebaseAuth.getInstance(n);
        zzj.m6258b().mo22796e(getApplicationContext(), str, uuid, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String c = zzk.m6265a(getApplicationContext(), n.mo61953q()).mo22798c();
        if (TextUtils.isEmpty(c)) {
            Log.e(f4572f, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            m6154L1(zzai.m6170a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        if (!TextUtils.isEmpty(instance.mo22616i())) {
            str3 = instance.mo22616i();
        } else {
            str3 = zzxr.m58409a();
        }
        return new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", str3).appendQueryParameter("eventId", uuid).appendQueryParameter(RegisterSpec.PREFIX, "X".concat(String.valueOf(stringExtra2))).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c);
    }

    @NonNull
    public final Context zza() {
        return getApplicationContext();
    }
}
