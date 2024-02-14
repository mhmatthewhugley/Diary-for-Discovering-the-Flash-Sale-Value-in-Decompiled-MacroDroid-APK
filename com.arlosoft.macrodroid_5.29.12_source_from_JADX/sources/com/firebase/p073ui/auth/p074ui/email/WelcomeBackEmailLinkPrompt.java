package com.firebase.p073ui.auth.p074ui.email;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.R$id;
import com.firebase.p073ui.auth.R$layout;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.p074ui.AppCompatBase;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.firebase.p073ui.auth.util.p075ui.C6901d;
import p159r5.C8205f;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.email.WelcomeBackEmailLinkPrompt */
public class WelcomeBackEmailLinkPrompt extends AppCompatBase implements View.OnClickListener {

    /* renamed from: f */
    private IdpResponse f16024f;

    /* renamed from: g */
    private Button f16025g;

    /* renamed from: o */
    private ProgressBar f16026o;

    /* renamed from: U1 */
    public static Intent m25889U1(Context context, FlowParameters flowParameters, IdpResponse idpResponse) {
        return HelperActivityBase.m25831K1(context, WelcomeBackEmailLinkPrompt.class, flowParameters).putExtra("extra_idp_response", idpResponse);
    }

    /* renamed from: V1 */
    private void m25890V1() {
        this.f16025g = (Button) findViewById(R$id.button_sign_in);
        this.f16026o = (ProgressBar) findViewById(R$id.top_progress_bar);
    }

    /* renamed from: W1 */
    private void m25891W1() {
        TextView textView = (TextView) findViewById(R$id.welcome_back_email_link_body);
        String string = getString(R$string.fui_welcome_back_email_link_prompt_body, new Object[]{this.f16024f.mo34091i(), this.f16024f.mo34095n()});
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        C6901d.m26060a(spannableStringBuilder, string, this.f16024f.mo34091i());
        C6901d.m26060a(spannableStringBuilder, string, this.f16024f.mo34095n());
        textView.setText(spannableStringBuilder);
        if (Build.VERSION.SDK_INT >= 26) {
            textView.setJustificationMode(1);
        }
    }

    /* renamed from: X1 */
    private void m25892X1() {
        C8205f.m34072f(this, mo34180O1(), (TextView) findViewById(R$id.email_footer_tos_and_pp_text));
    }

    /* renamed from: Y1 */
    private void m25893Y1() {
        startActivityForResult(EmailActivity.m25850W1(this, mo34180O1(), this.f16024f), 112);
    }

    private void setOnClickListeners() {
        this.f16025g.setOnClickListener(this);
    }

    /* renamed from: E */
    public void mo34183E() {
        this.f16026o.setEnabled(true);
        this.f16026o.setVisibility(4);
    }

    /* renamed from: b1 */
    public void mo34184b1(int i) {
        this.f16025g.setEnabled(false);
        this.f16026o.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo34177L1(i2, intent);
    }

    public void onClick(View view) {
        if (view.getId() == R$id.button_sign_in) {
            m25893Y1();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.fui_welcome_back_email_link_prompt_layout);
        this.f16024f = IdpResponse.m25763g(getIntent());
        m25890V1();
        m25891W1();
        setOnClickListeners();
        m25892X1();
    }
}
