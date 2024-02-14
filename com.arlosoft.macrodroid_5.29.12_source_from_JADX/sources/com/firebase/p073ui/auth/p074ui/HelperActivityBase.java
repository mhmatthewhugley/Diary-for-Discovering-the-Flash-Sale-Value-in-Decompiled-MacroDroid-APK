package com.firebase.p073ui.auth.p074ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatActivity;
import com.firebase.p073ui.auth.AuthUI;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.p074ui.credentials.CredentialSaveActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import p138n5.C7988c;
import p153q5.C8177a;
import p153q5.C8180d;
import p159r5.C8207h;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.HelperActivityBase */
public abstract class HelperActivityBase extends AppCompatActivity implements C7988c {

    /* renamed from: d */
    private FlowParameters f16003d;

    /* renamed from: K1 */
    protected static Intent m25831K1(@NonNull Context context, @NonNull Class<? extends Activity> cls, @NonNull FlowParameters flowParameters) {
        Intent putExtra = new Intent((Context) C8180d.m33938b(context, "context cannot be null", new Object[0]), (Class) C8180d.m33938b(cls, "target activity cannot be null", new Object[0])).putExtra("extra_flow_params", (Parcelable) C8180d.m33938b(flowParameters, "flowParams cannot be null", new Object[0]));
        putExtra.setExtrasClassLoader(AuthUI.class.getClassLoader());
        return putExtra;
    }

    /* renamed from: L1 */
    public void mo34177L1(int i, @Nullable Intent intent) {
        setResult(i, intent);
        finish();
    }

    /* renamed from: M1 */
    public FirebaseAuth mo34178M1() {
        return mo34179N1().mo34051f();
    }

    /* renamed from: N1 */
    public AuthUI mo34179N1() {
        return AuthUI.m25699l(mo34180O1().f15984a);
    }

    /* renamed from: O1 */
    public FlowParameters mo34180O1() {
        if (this.f16003d == null) {
            this.f16003d = FlowParameters.m25800a(getIntent());
        }
        return this.f16003d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P1 */
    public boolean mo34181P1() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService("connectivity");
        return connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting();
    }

    /* renamed from: Q1 */
    public void mo34182Q1(FirebaseUser firebaseUser, IdpResponse idpResponse, @Nullable String str) {
        startActivityForResult(CredentialSaveActivity.m25844U1(this, mo34180O1(), C8177a.m33932a(firebaseUser, str, C8207h.m34080g(idpResponse)), idpResponse), 102);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 102 || i2 == 5) {
            mo34177L1(i2, intent);
        }
    }
}
