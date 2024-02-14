package com.firebase.p073ui.auth.p074ui.email;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.lifecycle.ViewModelProvider;
import com.firebase.p073ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.R$id;
import com.firebase.p073ui.auth.R$layout;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.p074ui.AppCompatBase;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.firebase.p073ui.auth.util.p075ui.C6898c;
import com.firebase.p073ui.auth.util.p075ui.C6901d;
import com.firebase.p073ui.auth.viewmodel.C6905d;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import p153q5.C8178b;
import p159r5.C8205f;
import p159r5.C8207h;
import p170t5.C10273e;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.email.WelcomeBackPasswordPrompt */
public class WelcomeBackPasswordPrompt extends AppCompatBase implements View.OnClickListener, C6898c.C6900b {

    /* renamed from: f */
    private IdpResponse f16027f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C10273e f16028g;

    /* renamed from: o */
    private Button f16029o;

    /* renamed from: p */
    private ProgressBar f16030p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public TextInputLayout f16031s;

    /* renamed from: z */
    private EditText f16032z;

    /* renamed from: com.firebase.ui.auth.ui.email.WelcomeBackPasswordPrompt$a */
    class C6861a extends C6905d<IdpResponse> {
        C6861a(HelperActivityBase helperActivityBase, int i) {
            super(helperActivityBase, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                WelcomeBackPasswordPrompt.this.mo34177L1(5, ((FirebaseAuthAnonymousUpgradeException) exc).mo34081a().mo34101t());
            } else if (!(exc instanceof FirebaseAuthException) || C8178b.m33934b((FirebaseAuthException) exc) != C8178b.ERROR_USER_DISABLED) {
                TextInputLayout W1 = WelcomeBackPasswordPrompt.this.f16031s;
                WelcomeBackPasswordPrompt welcomeBackPasswordPrompt = WelcomeBackPasswordPrompt.this;
                W1.setError(welcomeBackPasswordPrompt.getString(welcomeBackPasswordPrompt.m25900Y1(exc)));
            } else {
                WelcomeBackPasswordPrompt.this.mo34177L1(0, IdpResponse.m25762f(new FirebaseUiException(12)).mo34101t());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull IdpResponse idpResponse) {
            WelcomeBackPasswordPrompt welcomeBackPasswordPrompt = WelcomeBackPasswordPrompt.this;
            welcomeBackPasswordPrompt.mo34182Q1(welcomeBackPasswordPrompt.f16028g.mo34266m(), idpResponse, WelcomeBackPasswordPrompt.this.f16028g.mo40884x());
        }
    }

    /* renamed from: X1 */
    public static Intent m25899X1(Context context, FlowParameters flowParameters, IdpResponse idpResponse) {
        return HelperActivityBase.m25831K1(context, WelcomeBackPasswordPrompt.class, flowParameters).putExtra("extra_idp_response", idpResponse);
    }

    /* access modifiers changed from: private */
    @StringRes
    /* renamed from: Y1 */
    public int m25900Y1(Exception exc) {
        if (exc instanceof FirebaseAuthInvalidCredentialsException) {
            return R$string.fui_error_invalid_password;
        }
        return R$string.fui_error_unknown;
    }

    /* renamed from: Z1 */
    private void m25901Z1() {
        startActivity(RecoverPasswordActivity.m25880W1(this, mo34180O1(), this.f16027f.mo34091i()));
    }

    /* renamed from: a2 */
    private void m25902a2() {
        m25903b2(this.f16032z.getText().toString());
    }

    /* renamed from: b2 */
    private void m25903b2(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f16031s.setError(getString(R$string.fui_error_invalid_password));
            return;
        }
        this.f16031s.setError((CharSequence) null);
        this.f16028g.mo40885y(this.f16027f.mo34091i(), str, this.f16027f, C8207h.m34077d(this.f16027f));
    }

    /* renamed from: E */
    public void mo34183E() {
        this.f16029o.setEnabled(true);
        this.f16030p.setVisibility(4);
    }

    /* renamed from: b1 */
    public void mo34184b1(int i) {
        this.f16029o.setEnabled(false);
        this.f16030p.setVisibility(0);
    }

    /* renamed from: j1 */
    public void mo34200j1() {
        m25902a2();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.button_done) {
            m25902a2();
        } else if (id == R$id.trouble_signing_in) {
            m25901Z1();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.fui_welcome_back_password_prompt_layout);
        getWindow().setSoftInputMode(4);
        IdpResponse g = IdpResponse.m25763g(getIntent());
        this.f16027f = g;
        String i = g.mo34091i();
        this.f16029o = (Button) findViewById(R$id.button_done);
        this.f16030p = (ProgressBar) findViewById(R$id.top_progress_bar);
        this.f16031s = (TextInputLayout) findViewById(R$id.password_layout);
        EditText editText = (EditText) findViewById(R$id.password);
        this.f16032z = editText;
        C6898c.m26058a(editText, this);
        String string = getString(R$string.fui_welcome_back_password_prompt_body, new Object[]{i});
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        C6901d.m26060a(spannableStringBuilder, string, i);
        ((TextView) findViewById(R$id.welcome_back_password_body)).setText(spannableStringBuilder);
        this.f16029o.setOnClickListener(this);
        findViewById(R$id.trouble_signing_in).setOnClickListener(this);
        C10273e eVar = (C10273e) new ViewModelProvider(this).get(C10273e.class);
        this.f16028g = eVar;
        eVar.mo34278g(mo34180O1());
        this.f16028g.mo34267i().observe(this, new C6861a(this, R$string.fui_progress_dialog_signing_in));
        C8205f.m34072f(this, mo34180O1(), (TextView) findViewById(R$id.email_footer_tos_and_pp_text));
    }
}
