package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p203authapi.zzaz;

@KeepName
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class SignInHubActivity extends FragmentActivity {

    /* renamed from: s */
    private static boolean f2918s = false;

    /* renamed from: d */
    private boolean f2919d = false;

    /* renamed from: f */
    private SignInConfiguration f2920f;

    /* renamed from: g */
    private boolean f2921g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f2922o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Intent f2923p;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    private class zzc implements LoaderManager.LoaderCallbacks<Void> {
        private zzc() {
        }

        public final Loader<Void> onCreateLoader(int i, Bundle bundle) {
            return new zzd(SignInHubActivity.this, GoogleApiClient.m3652j());
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            Void voidR = (Void) obj;
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f2922o, SignInHubActivity.this.f2923p);
            SignInHubActivity.this.finish();
        }

        public final void onLoaderReset(Loader<Void> loader) {
        }
    }

    /* renamed from: L1 */
    private final void m3340L1(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f2918s = false;
    }

    /* renamed from: N1 */
    private final void m3342N1() {
        getSupportLoaderManager().initLoader(0, (Bundle) null, new zzc());
        f2918s = false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (!this.f2919d) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.mo21001K1() != null) {
                        GoogleSignInAccount K1 = signInAccount.mo21001K1();
                        zzq.m3385c(this).mo21042b(this.f2920f.mo21010l2(), (GoogleSignInAccount) zzaz.m55705a(K1));
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", K1);
                        this.f2921g = true;
                        this.f2922o = i2;
                        this.f2923p = intent;
                        m3342N1();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        m3340L1(intExtra);
                        return;
                    }
                }
                m3340L1(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String str = (String) zzaz.m55705a(intent.getAction());
        if ("com.google.android.gms.auth.NO_IMPL".equals(str)) {
            m3340L1(12500);
        } else if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || str.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) ((Bundle) zzaz.m55705a(intent.getBundleExtra("config"))).getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f2920f = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.f2921g = z;
                if (z) {
                    this.f2922o = bundle.getInt("signInResultCode");
                    this.f2923p = (Intent) zzaz.m55705a((Intent) bundle.getParcelable("signInResultData"));
                    m3342N1();
                }
            } else if (f2918s) {
                setResult(0);
                m3340L1(12502);
            } else {
                f2918s = true;
                Intent intent2 = new Intent(str);
                if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.f2920f);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.f2919d = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    m3340L1(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f2921g);
        if (this.f2921g) {
            bundle.putInt("signInResultCode", this.f2922o);
            bundle.putParcelable("signInResultData", this.f2923p);
        }
    }
}
