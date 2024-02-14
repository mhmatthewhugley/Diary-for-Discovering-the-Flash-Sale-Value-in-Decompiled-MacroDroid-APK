package com.firebase.p073ui.auth.p074ui.email;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.firebase.p073ui.auth.AuthUI;
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.R$anim;
import com.firebase.p073ui.auth.R$id;
import com.firebase.p073ui.auth.R$layout;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.data.model.User;
import com.firebase.p073ui.auth.p074ui.AppCompatBase;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.firebase.p073ui.auth.p074ui.email.C6862a;
import com.firebase.p073ui.auth.p074ui.email.C6867c;
import com.firebase.p073ui.auth.p074ui.email.C6875e;
import com.firebase.p073ui.auth.p074ui.email.C6879f;
import com.firebase.p073ui.auth.p074ui.idp.WelcomeBackIdpPrompt;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.ActionCodeSettings;
import p159r5.C8202d;
import p159r5.C8207h;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.email.EmailActivity */
public class EmailActivity extends AppCompatBase implements C6862a.C6864b, C6875e.C6878c, C6867c.C6871c, C6879f.C6880a {
    /* renamed from: U1 */
    public static Intent m25848U1(Context context, FlowParameters flowParameters) {
        return HelperActivityBase.m25831K1(context, EmailActivity.class, flowParameters);
    }

    /* renamed from: V1 */
    public static Intent m25849V1(Context context, FlowParameters flowParameters, String str) {
        return HelperActivityBase.m25831K1(context, EmailActivity.class, flowParameters).putExtra("extra_email", str);
    }

    /* renamed from: W1 */
    public static Intent m25850W1(Context context, FlowParameters flowParameters, IdpResponse idpResponse) {
        return m25849V1(context, flowParameters, idpResponse.mo34091i()).putExtra("extra_idp_response", idpResponse);
    }

    /* renamed from: X1 */
    private void m25851X1(Exception exc) {
        mo34177L1(0, IdpResponse.m25764k(new FirebaseUiException(3, exc.getMessage())));
    }

    /* renamed from: Y1 */
    private void m25852Y1() {
        overridePendingTransition(R$anim.fui_slide_in_right, R$anim.fui_slide_out_left);
    }

    /* renamed from: Z1 */
    private void m25853Z1(AuthUI.IdpConfig idpConfig, String str) {
        mo34175S1(C6867c.m25933i0(str, (ActionCodeSettings) idpConfig.mo34056a().getParcelable("action_code_settings")), R$id.fragment_register_email, "EmailLinkFragment");
    }

    /* renamed from: E */
    public void mo34183E() {
        throw new UnsupportedOperationException("Email fragments must handle progress updates.");
    }

    /* renamed from: H */
    public void mo34188H(Exception exc) {
        m25851X1(exc);
    }

    /* renamed from: O0 */
    public void mo34189O0(String str) {
        mo34176T1(C6879f.m25969W(str), R$id.fragment_register_email, "TroubleSigningInFragment", true, true);
    }

    /* renamed from: R0 */
    public void mo34190R0(User user) {
        startActivityForResult(WelcomeBackIdpPrompt.m26000V1(this, mo34180O1(), user), 103);
        m25852Y1();
    }

    /* renamed from: V */
    public void mo34191V(Exception exc) {
        m25851X1(exc);
    }

    /* renamed from: a0 */
    public void mo34192a0(User user) {
        if (user.mo34161d().equals("emailLink")) {
            m25853Z1(C8207h.m34079f(mo34180O1().f15985c, "emailLink"), user.mo34158a());
            return;
        }
        startActivityForResult(WelcomeBackPasswordPrompt.m25899X1(this, mo34180O1(), new IdpResponse.C6845b(user).mo34109a()), 104);
        m25852Y1();
    }

    /* renamed from: b1 */
    public void mo34184b1(@StringRes int i) {
        throw new UnsupportedOperationException("Email fragments must handle progress updates.");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 104 || i == 103) {
            mo34177L1(i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.fui_activity_register_email);
        if (bundle == null) {
            String string = getIntent().getExtras().getString("extra_email");
            IdpResponse idpResponse = (IdpResponse) getIntent().getExtras().getParcelable("extra_idp_response");
            if (string == null || idpResponse == null) {
                AuthUI.IdpConfig e = C8207h.m34078e(mo34180O1().f15985c, "password");
                if (e != null) {
                    string = e.mo34056a().getString("extra_default_email");
                }
                mo34175S1(C6862a.m25912Z(string), R$id.fragment_register_email, "CheckEmailFragment");
                return;
            }
            AuthUI.IdpConfig f = C8207h.m34079f(mo34180O1().f15985c, "emailLink");
            C8202d.m34038b().mo38285e(getApplication(), idpResponse);
            mo34175S1(C6867c.m25934j0(string, (ActionCodeSettings) f.mo34056a().getParcelable("action_code_settings"), idpResponse, f.mo34056a().getBoolean("force_same_device")), R$id.fragment_register_email, "EmailLinkFragment");
        }
    }

    /* renamed from: r1 */
    public void mo34193r1(String str) {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
        }
        m25853Z1(C8207h.m34079f(mo34180O1().f15985c, "emailLink"), str);
    }

    /* renamed from: y */
    public void mo34194y(IdpResponse idpResponse) {
        mo34177L1(5, idpResponse.mo34101t());
    }

    /* renamed from: z1 */
    public void mo34195z1(User user) {
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(R$id.email_layout);
        AuthUI.IdpConfig e = C8207h.m34078e(mo34180O1().f15985c, "password");
        if (e == null) {
            e = C8207h.m34078e(mo34180O1().f15985c, "emailLink");
        }
        if (e.mo34056a().getBoolean("extra_allow_new_emails", true)) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            if (e.mo34057b().equals("emailLink")) {
                m25853Z1(e, user.mo34158a());
                return;
            }
            beginTransaction.replace(R$id.fragment_register_email, (Fragment) C6875e.m25959f0(user), "RegisterEmailFragment");
            if (textInputLayout != null) {
                String string = getString(R$string.fui_email_field_name);
                ViewCompat.setTransitionName(textInputLayout, string);
                beginTransaction.addSharedElement(textInputLayout, string);
            }
            beginTransaction.disallowAddToBackStack().commit();
            return;
        }
        textInputLayout.setError(getString(R$string.fui_error_email_does_not_exist));
    }
}
