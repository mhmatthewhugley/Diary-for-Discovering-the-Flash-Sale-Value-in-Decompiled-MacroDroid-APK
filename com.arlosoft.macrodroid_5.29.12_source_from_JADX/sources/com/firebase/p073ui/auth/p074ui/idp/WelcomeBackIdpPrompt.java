package com.firebase.p073ui.auth.p074ui.idp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.ViewModelProvider;
import com.firebase.p073ui.auth.AuthUI;
import com.firebase.p073ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.R$id;
import com.firebase.p073ui.auth.R$layout;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.data.model.User;
import com.firebase.p073ui.auth.p074ui.AppCompatBase;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.firebase.p073ui.auth.viewmodel.C6904c;
import com.firebase.p073ui.auth.viewmodel.C6905d;
import p133m5.C7936c;
import p133m5.C7939d;
import p133m5.C7942e;
import p133m5.C7948f;
import p159r5.C8205f;
import p159r5.C8207h;
import p175u5.C10297a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt */
public class WelcomeBackIdpPrompt extends AppCompatBase {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C6904c<?> f16096f;

    /* renamed from: g */
    private Button f16097g;

    /* renamed from: o */
    private ProgressBar f16098o;

    /* renamed from: p */
    private TextView f16099p;

    /* renamed from: com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt$a */
    class C6886a extends C6905d<IdpResponse> {

        /* renamed from: e */
        final /* synthetic */ C10297a f16100e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6886a(HelperActivityBase helperActivityBase, C10297a aVar) {
            super(helperActivityBase);
            this.f16100e = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            this.f16100e.mo40914B(IdpResponse.m25762f(exc));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull IdpResponse idpResponse) {
            if (!(WelcomeBackIdpPrompt.this.mo34179N1().mo34054m() || !AuthUI.f15909g.contains(idpResponse.mo34095n())) || idpResponse.mo34097p() || this.f16100e.mo40915x()) {
                this.f16100e.mo40914B(idpResponse);
            } else {
                WelcomeBackIdpPrompt.this.mo34177L1(-1, idpResponse.mo34101t());
            }
        }
    }

    /* renamed from: com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt$b */
    class C6887b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f16102a;

        C6887b(String str) {
            this.f16102a = str;
        }

        public void onClick(View view) {
            WelcomeBackIdpPrompt.this.f16096f.mo34271m(WelcomeBackIdpPrompt.this.mo34178M1(), WelcomeBackIdpPrompt.this, this.f16102a);
        }
    }

    /* renamed from: com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt$c */
    class C6888c extends C6905d<IdpResponse> {
        C6888c(HelperActivityBase helperActivityBase) {
            super(helperActivityBase);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                WelcomeBackIdpPrompt.this.mo34177L1(5, ((FirebaseAuthAnonymousUpgradeException) exc).mo34081a().mo34101t());
                return;
            }
            WelcomeBackIdpPrompt.this.mo34177L1(0, IdpResponse.m25764k(exc));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull IdpResponse idpResponse) {
            WelcomeBackIdpPrompt.this.mo34177L1(-1, idpResponse.mo34101t());
        }
    }

    /* renamed from: V1 */
    public static Intent m26000V1(Context context, FlowParameters flowParameters, User user) {
        return m26001W1(context, flowParameters, user, (IdpResponse) null);
    }

    /* renamed from: W1 */
    public static Intent m26001W1(Context context, FlowParameters flowParameters, User user, @Nullable IdpResponse idpResponse) {
        return HelperActivityBase.m25831K1(context, WelcomeBackIdpPrompt.class, flowParameters).putExtra("extra_idp_response", idpResponse).putExtra("extra_user", user);
    }

    /* renamed from: E */
    public void mo34183E() {
        this.f16097g.setEnabled(true);
        this.f16098o.setVisibility(4);
    }

    /* renamed from: b1 */
    public void mo34184b1(int i) {
        this.f16097g.setEnabled(false);
        this.f16098o.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f16096f.mo34270l(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        String str;
        Class cls = C7939d.class;
        super.onCreate(bundle);
        setContentView(R$layout.fui_welcome_back_idp_prompt_layout);
        this.f16097g = (Button) findViewById(R$id.welcome_back_idp_button);
        this.f16098o = (ProgressBar) findViewById(R$id.top_progress_bar);
        this.f16099p = (TextView) findViewById(R$id.welcome_back_idp_prompt);
        User e = User.m25816e(getIntent());
        IdpResponse g = IdpResponse.m25763g(getIntent());
        ViewModelProvider viewModelProvider = new ViewModelProvider(this);
        C10297a aVar = (C10297a) viewModelProvider.get(C10297a.class);
        aVar.mo34278g(mo34180O1());
        if (g != null) {
            aVar.mo40913A(C8207h.m34077d(g), e.mo34158a());
        }
        String d = e.mo34161d();
        AuthUI.IdpConfig e2 = C8207h.m34078e(mo34180O1().f15985c, d);
        if (e2 == null) {
            mo34177L1(0, IdpResponse.m25764k(new FirebaseUiException(3, "Firebase login unsuccessful. Account linking failed due to provider not enabled by application: " + d)));
            return;
        }
        String string = e2.mo34056a().getString("generic_oauth_provider_id");
        boolean m = mo34179N1().mo34054m();
        d.hashCode();
        if (d.equals("google.com")) {
            if (m) {
                this.f16096f = ((C7939d) viewModelProvider.get(cls)).mo34269k(C7942e.m33188w());
            } else {
                this.f16096f = ((C7948f) viewModelProvider.get(C7948f.class)).mo34269k(new C7948f.C7949a(e2, e.mo34158a()));
            }
            str = getString(R$string.fui_idp_name_google);
        } else if (d.equals("facebook.com")) {
            if (m) {
                this.f16096f = ((C7939d) viewModelProvider.get(cls)).mo34269k(C7942e.m33187v());
            } else {
                this.f16096f = ((C7936c) viewModelProvider.get(C7936c.class)).mo34269k(e2);
            }
            str = getString(R$string.fui_idp_name_facebook);
        } else if (TextUtils.equals(d, string)) {
            this.f16096f = ((C7939d) viewModelProvider.get(cls)).mo34269k(e2);
            str = e2.mo34056a().getString("generic_oauth_provider_name");
        } else {
            throw new IllegalStateException("Invalid provider id: " + d);
        }
        this.f16096f.mo34267i().observe(this, new C6886a(this, aVar));
        this.f16099p.setText(getString(R$string.fui_welcome_back_idp_prompt, new Object[]{e.mo34158a(), str}));
        this.f16097g.setOnClickListener(new C6887b(d));
        aVar.mo34267i().observe(this, new C6888c(this));
        C8205f.m34072f(this, mo34180O1(), (TextView) findViewById(R$id.email_footer_tos_and_pp_text));
    }
}
