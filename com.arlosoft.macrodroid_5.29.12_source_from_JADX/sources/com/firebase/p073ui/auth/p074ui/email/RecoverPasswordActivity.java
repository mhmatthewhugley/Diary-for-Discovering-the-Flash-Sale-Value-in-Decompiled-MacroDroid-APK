package com.firebase.p073ui.auth.p074ui.email;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.ViewModelProvider;
import com.firebase.p073ui.auth.R$id;
import com.firebase.p073ui.auth.R$layout;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.p074ui.AppCompatBase;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.firebase.p073ui.auth.util.p075ui.C6898c;
import com.firebase.p073ui.auth.viewmodel.C6905d;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import p159r5.C8205f;
import p165s5.C10234b;
import p170t5.C10271d;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.email.RecoverPasswordActivity */
public class RecoverPasswordActivity extends AppCompatBase implements View.OnClickListener, C6898c.C6900b {

    /* renamed from: f */
    private C10271d f16016f;

    /* renamed from: g */
    private ProgressBar f16017g;

    /* renamed from: o */
    private Button f16018o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public TextInputLayout f16019p;

    /* renamed from: s */
    private EditText f16020s;

    /* renamed from: z */
    private C10234b f16021z;

    /* renamed from: com.firebase.ui.auth.ui.email.RecoverPasswordActivity$a */
    class C6859a extends C6905d<String> {
        C6859a(HelperActivityBase helperActivityBase, int i) {
            super(helperActivityBase, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            if ((exc instanceof FirebaseAuthInvalidUserException) || (exc instanceof FirebaseAuthInvalidCredentialsException)) {
                RecoverPasswordActivity.this.f16019p.setError(RecoverPasswordActivity.this.getString(R$string.fui_error_email_does_not_exist));
            } else {
                RecoverPasswordActivity.this.f16019p.setError(RecoverPasswordActivity.this.getString(R$string.fui_error_unknown));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull String str) {
            RecoverPasswordActivity.this.f16019p.setError((CharSequence) null);
            RecoverPasswordActivity.this.m25882Y1(str);
        }
    }

    /* renamed from: com.firebase.ui.auth.ui.email.RecoverPasswordActivity$b */
    class C6860b implements DialogInterface.OnDismissListener {
        C6860b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            RecoverPasswordActivity.this.mo34177L1(-1, new Intent());
        }
    }

    /* renamed from: W1 */
    public static Intent m25880W1(Context context, FlowParameters flowParameters, String str) {
        return HelperActivityBase.m25831K1(context, RecoverPasswordActivity.class, flowParameters).putExtra("extra_email", str);
    }

    /* renamed from: X1 */
    private void m25881X1(String str, @Nullable ActionCodeSettings actionCodeSettings) {
        this.f16016f.mo40883o(str, actionCodeSettings);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public void m25882Y1(String str) {
        new AlertDialog.Builder(this).setTitle(R$string.fui_title_confirm_recover_password).setMessage((CharSequence) getString(R$string.fui_confirm_recovery_body, new Object[]{str})).setOnDismissListener(new C6860b()).setPositiveButton(17039370, (DialogInterface.OnClickListener) null).show();
    }

    /* renamed from: E */
    public void mo34183E() {
        this.f16018o.setEnabled(true);
        this.f16017g.setVisibility(4);
    }

    /* renamed from: b1 */
    public void mo34184b1(int i) {
        this.f16018o.setEnabled(false);
        this.f16017g.setVisibility(0);
    }

    /* renamed from: j1 */
    public void mo34200j1() {
        if (!this.f16021z.mo40845b(this.f16020s.getText())) {
            return;
        }
        if (mo34180O1().f15992z != null) {
            m25881X1(this.f16020s.getText().toString(), mo34180O1().f15992z);
        } else {
            m25881X1(this.f16020s.getText().toString(), (ActionCodeSettings) null);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R$id.button_done) {
            mo34200j1();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.fui_forgot_password_layout);
        C10271d dVar = (C10271d) new ViewModelProvider(this).get(C10271d.class);
        this.f16016f = dVar;
        dVar.mo34278g(mo34180O1());
        this.f16016f.mo34267i().observe(this, new C6859a(this, R$string.fui_progress_dialog_sending));
        this.f16017g = (ProgressBar) findViewById(R$id.top_progress_bar);
        this.f16018o = (Button) findViewById(R$id.button_done);
        this.f16019p = (TextInputLayout) findViewById(R$id.email_layout);
        this.f16020s = (EditText) findViewById(R$id.email);
        this.f16021z = new C10234b(this.f16019p);
        String stringExtra = getIntent().getStringExtra("extra_email");
        if (stringExtra != null) {
            this.f16020s.setText(stringExtra);
        }
        C6898c.m26058a(this.f16020s, this);
        this.f16018o.setOnClickListener(this);
        C8205f.m34072f(this, mo34180O1(), (TextView) findViewById(R$id.email_footer_tos_and_pp_text));
    }
}
