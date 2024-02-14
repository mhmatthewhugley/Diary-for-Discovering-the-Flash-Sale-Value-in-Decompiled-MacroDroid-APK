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
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.p204firebaseauthapi.zzaay;
import com.google.android.gms.internal.p204firebaseauthapi.zzf;
import com.google.android.gms.internal.p204firebaseauthapi.zzxe;
import com.google.android.gms.internal.p204firebaseauthapi.zzxf;
import com.google.android.gms.internal.p204firebaseauthapi.zzxg;
import com.google.android.gms.internal.p204firebaseauthapi.zzyz;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

@KeepName
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class GenericIdpActivity extends FragmentActivity implements zzxg {

    /* renamed from: g */
    private static long f4568g;

    /* renamed from: o */
    private static final zzbm f4569o = zzbm.m6232c();

    /* renamed from: d */
    private final Executor f4570d = zzf.m57219a().mo49367v(1);

    /* renamed from: f */
    private boolean f4571f = false;

    /* renamed from: L1 */
    private final void m6142L1() {
        f4568g = 0;
        this.f4571f = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent)) {
            f4569o.mo22779f(this, zzai.m6170a("WEB_CONTEXT_CANCELED"));
        } else {
            f4569o.mo22777d(this);
        }
        finish();
    }

    /* renamed from: M1 */
    private final void m6143M1(Status status) {
        f4568g = 0;
        this.f4571f = false;
        Intent intent = new Intent();
        zzbl.m6230c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent)) {
            f4569o.mo22779f(getApplicationContext(), status);
        } else {
            f4569o.mo22777d(this);
        }
        finish();
    }

    /* renamed from: A1 */
    public final void mo22725A1(@NonNull String str, @Nullable Status status) {
        if (status == null) {
            m6142L1();
        } else {
            m6143M1(status);
        }
    }

    @Nullable
    /* renamed from: C */
    public final HttpURLConnection mo22726C(@NonNull URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Nullable
    /* renamed from: K1 */
    public final Uri.Builder mo22727K1(@NonNull Uri.Builder builder, @NonNull Intent intent, @NonNull String str, @NonNull String str2) {
        String str3;
        Uri.Builder builder2 = builder;
        Intent intent2 = intent;
        String stringExtra = intent2.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent2.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent2.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent2.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent2.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            str3 = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str4 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str4);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject.put(str4, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            str3 = jSONObject.toString();
        }
        String uuid = UUID.randomUUID().toString();
        String a = zzxf.m58371a(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent2.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str5 = uuid;
        String str6 = a;
        String str7 = uuid;
        String str8 = action;
        String str9 = str3;
        String str10 = stringExtra2;
        String str11 = stringExtra2;
        String str12 = "GenericIdpActivity";
        String str13 = join;
        zzj.m6258b().mo22795d(getApplicationContext(), str, str5, a, str8, str10, stringExtra3, stringExtra4);
        String c = zzk.m6265a(getApplicationContext(), FirebaseApp.m74384n(stringExtra4).mo61953q()).mo22798c();
        if (TextUtils.isEmpty(c)) {
            Log.e(str12, "Could not generate an encryption key for Generic IDP - cancelling flow.");
            m6143M1(zzai.m6170a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        String str14 = str6;
        if (str14 == null) {
            return null;
        }
        builder2.appendQueryParameter("eid", "p").appendQueryParameter(RegisterSpec.PREFIX, "X".concat(String.valueOf(stringExtra5))).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", str11).appendQueryParameter("sessionId", str14).appendQueryParameter("eventId", str7).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c);
        if (!TextUtils.isEmpty(str13)) {
            builder2.appendQueryParameter("scopes", str13);
        }
        if (!TextUtils.isEmpty(str9)) {
            builder2.appendQueryParameter("customParameters", str9);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder2.appendQueryParameter("tid", stringExtra3);
        }
        return builder2;
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
                Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                intent.addFlags(BasicMeasure.EXACTLY);
                intent.addFlags(268435456);
                startActivity(intent);
                return;
            }
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
            build.launchUrl(this, uri);
            return;
        }
        Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
        mo22725A1(str, (Status) null);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(@NonNull Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long a = DefaultClock.m4871d().mo21950a();
            if (a - f4568g < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                Log.e("GenericIdpActivity", "Could not start operation - already in progress");
                return;
            }
            f4568g = a;
            if (bundle != null) {
                this.f4571f = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                return;
            }
            return;
        }
        Log.e("GenericIdpActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
        m6142L1();
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
                m6143M1(zzbl.m6229b(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                m6142L1();
            } else {
                String stringExtra = intent.getStringExtra("link");
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                zzi a = zzj.m6258b().mo22793a(this, packageName, stringExtra2);
                if (a == null) {
                    m6142L1();
                }
                if (booleanExtra) {
                    stringExtra = zzk.m6265a(getApplicationContext(), FirebaseApp.m74384n(a.mo22788a()).mo61953q()).mo22797b(stringExtra);
                }
                zzaay zzaay = new zzaay(a, stringExtra);
                String e = a.mo22792e();
                String b = a.mo22789b();
                zzaay.mo48813p2(e);
                if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(b) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(b) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(b)) {
                    f4568g = 0;
                    this.f4571f = false;
                    Intent intent2 = new Intent();
                    SafeParcelableSerializer.m4594f(zzaay, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
                    intent2.putExtra("com.google.firebase.auth.internal.OPERATION", b);
                    intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                    if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent2)) {
                        SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                        edit.putString("verifyAssertionRequest", SafeParcelableSerializer.m4595g(zzaay));
                        edit.putString("operation", b);
                        edit.putString("tenantId", e);
                        edit.putLong("timestamp", DefaultClock.m4871d().mo21950a());
                        edit.commit();
                    } else {
                        f4569o.mo22777d(this);
                    }
                    finish();
                    return;
                }
                Log.e("GenericIdpActivity", "unsupported operation: ".concat(b));
                m6142L1();
            }
        } else if (!this.f4571f) {
            String packageName2 = getPackageName();
            try {
                String lowerCase = Hex.m4885b(AndroidUtilsLight.m4839a(this, packageName2)).toLowerCase(Locale.US);
                FirebaseApp n = FirebaseApp.m74384n(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                if (!zzyz.m58519g(n)) {
                    new zzxe(packageName2, lowerCase, getIntent(), n, this).executeOnExecutor(this.f4570d, new Void[0]);
                } else {
                    mo22729n1(mo22727K1(Uri.parse(zzyz.m58513a(n.mo61952p().mo61961b())).buildUpon(), getIntent(), packageName2, lowerCase).build(), packageName2);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                String obj = e2.toString();
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName2 + " " + obj);
                mo22725A1(packageName2, (Status) null);
            }
            this.f4571f = true;
        } else {
            m6142L1();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f4571f);
    }

    @Nullable
    /* renamed from: u */
    public final Uri.Builder mo22730u(@NonNull Intent intent, @NonNull String str, @NonNull String str2) {
        return mo22727K1(new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @NonNull
    public final Context zza() {
        return getApplicationContext();
    }
}
