package com.firebase.p073ui.auth.p074ui.idp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.lifecycle.ViewModelProvider;
import com.firebase.p073ui.auth.AuthMethodPickerLayout;
import com.firebase.p073ui.auth.AuthUI;
import com.firebase.p073ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.R$id;
import com.firebase.p073ui.auth.R$layout;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.data.model.UserCancellationException;
import com.firebase.p073ui.auth.p074ui.AppCompatBase;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.firebase.p073ui.auth.viewmodel.C6904c;
import com.firebase.p073ui.auth.viewmodel.C6905d;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p133m5.C7932a;
import p133m5.C7935b;
import p133m5.C7936c;
import p133m5.C7942e;
import p133m5.C7948f;
import p133m5.C7950g;
import p159r5.C8205f;
import p175u5.C10305b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity */
public class AuthMethodPickerActivity extends AppCompatBase {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C10305b f16080f;

    /* renamed from: g */
    private List<C6904c<?>> f16081g;

    /* renamed from: o */
    private ProgressBar f16082o;

    /* renamed from: p */
    private ViewGroup f16083p;

    /* renamed from: s */
    private AuthMethodPickerLayout f16084s;

    /* renamed from: com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity$a */
    class C6881a extends C6905d<IdpResponse> {
        C6881a(HelperActivityBase helperActivityBase, int i) {
            super(helperActivityBase, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            if (!(exc instanceof UserCancellationException)) {
                if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                    AuthMethodPickerActivity.this.mo34177L1(5, ((FirebaseAuthAnonymousUpgradeException) exc).mo34081a().mo34101t());
                } else if (exc instanceof FirebaseUiException) {
                    AuthMethodPickerActivity.this.mo34177L1(0, IdpResponse.m25762f((FirebaseUiException) exc).mo34101t());
                } else {
                    Toast.makeText(AuthMethodPickerActivity.this, AuthMethodPickerActivity.this.getString(R$string.fui_error_unknown), 0).show();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull IdpResponse idpResponse) {
            AuthMethodPickerActivity authMethodPickerActivity = AuthMethodPickerActivity.this;
            authMethodPickerActivity.mo34182Q1(authMethodPickerActivity.f16080f.mo34266m(), idpResponse, (String) null);
        }
    }

    /* renamed from: com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity$b */
    class C6882b extends C6905d<IdpResponse> {

        /* renamed from: e */
        final /* synthetic */ String f16086e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6882b(HelperActivityBase helperActivityBase, String str) {
            super(helperActivityBase);
            this.f16086e = str;
        }

        /* renamed from: d */
        private void m25987d(@NonNull IdpResponse idpResponse) {
            int i = 0;
            boolean z = AuthUI.f15909g.contains(this.f16086e) && !AuthMethodPickerActivity.this.mo34179N1().mo34054m();
            if (!idpResponse.mo34099r()) {
                AuthMethodPickerActivity.this.f16080f.mo40921E(idpResponse);
            } else if (z) {
                AuthMethodPickerActivity.this.f16080f.mo40921E(idpResponse);
            } else {
                AuthMethodPickerActivity authMethodPickerActivity = AuthMethodPickerActivity.this;
                if (idpResponse.mo34099r()) {
                    i = -1;
                }
                authMethodPickerActivity.mo34177L1(i, idpResponse.mo34101t());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                AuthMethodPickerActivity.this.mo34177L1(0, new Intent().putExtra("extra_idp_response", IdpResponse.m25762f(exc)));
            } else {
                m25987d(IdpResponse.m25762f(exc));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo34116c(@NonNull IdpResponse idpResponse) {
            m25987d(idpResponse);
        }
    }

    /* renamed from: com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity$c */
    class C6883c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6904c f16088a;

        /* renamed from: c */
        final /* synthetic */ AuthUI.IdpConfig f16089c;

        C6883c(C6904c cVar, AuthUI.IdpConfig idpConfig) {
            this.f16088a = cVar;
            this.f16089c = idpConfig;
        }

        public void onClick(View view) {
            if (AuthMethodPickerActivity.this.mo34181P1()) {
                Snackbar.m69560c0(AuthMethodPickerActivity.this.findViewById(16908290), AuthMethodPickerActivity.this.getString(R$string.fui_no_internet), -1).mo58859S();
            } else {
                this.f16088a.mo34271m(AuthMethodPickerActivity.this.mo34178M1(), AuthMethodPickerActivity.this, this.f16089c.mo34057b());
            }
        }
    }

    /* renamed from: W1 */
    public static Intent m25977W1(Context context, FlowParameters flowParameters) {
        return HelperActivityBase.m25831K1(context, AuthMethodPickerActivity.class, flowParameters);
    }

    /* renamed from: X1 */
    private void m25978X1(AuthUI.IdpConfig idpConfig, View view) {
        C6904c cVar;
        Class cls = C7942e.class;
        ViewModelProvider viewModelProvider = new ViewModelProvider(this);
        String b = idpConfig.mo34057b();
        AuthUI N1 = mo34179N1();
        b.hashCode();
        char c = 65535;
        switch (b.hashCode()) {
            case -2095811475:
                if (b.equals("anonymous")) {
                    c = 0;
                    break;
                }
                break;
            case -1536293812:
                if (b.equals("google.com")) {
                    c = 1;
                    break;
                }
                break;
            case -364826023:
                if (b.equals("facebook.com")) {
                    c = 2;
                    break;
                }
                break;
            case 106642798:
                if (b.equals("phone")) {
                    c = 3;
                    break;
                }
                break;
            case 1216985755:
                if (b.equals("password")) {
                    c = 4;
                    break;
                }
                break;
            case 2120171958:
                if (b.equals("emailLink")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                cVar = ((C7932a) viewModelProvider.get(C7932a.class)).mo34269k(mo34180O1());
                break;
            case 1:
                if (!N1.mo34054m()) {
                    cVar = ((C7948f) viewModelProvider.get(C7948f.class)).mo34269k(new C7948f.C7949a(idpConfig));
                    break;
                } else {
                    cVar = ((C7942e) viewModelProvider.get(cls)).mo34269k(C7942e.m33188w());
                    break;
                }
            case 2:
                if (!N1.mo34054m()) {
                    cVar = ((C7936c) viewModelProvider.get(C7936c.class)).mo34269k(idpConfig);
                    break;
                } else {
                    cVar = ((C7942e) viewModelProvider.get(cls)).mo34269k(C7942e.m33187v());
                    break;
                }
            case 3:
                cVar = ((C7950g) viewModelProvider.get(C7950g.class)).mo34269k(idpConfig);
                break;
            case 4:
            case 5:
                cVar = ((C7935b) viewModelProvider.get(C7935b.class)).mo34269k(null);
                break;
            default:
                if (!TextUtils.isEmpty(idpConfig.mo34056a().getString("generic_oauth_provider_id"))) {
                    cVar = ((C7942e) viewModelProvider.get(cls)).mo34269k(idpConfig);
                    break;
                } else {
                    throw new IllegalStateException("Unknown provider: " + b);
                }
        }
        this.f16081g.add(cVar);
        cVar.mo34267i().observe(this, new C6882b(this, b));
        view.setOnClickListener(new C6883c(cVar, idpConfig));
    }

    /* renamed from: Y1 */
    private void m25979Y1(List<AuthUI.IdpConfig> list) {
        int i;
        new ViewModelProvider(this);
        this.f16081g = new ArrayList();
        for (AuthUI.IdpConfig next : list) {
            String b = next.mo34057b();
            b.hashCode();
            char c = 65535;
            switch (b.hashCode()) {
                case -2095811475:
                    if (b.equals("anonymous")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1536293812:
                    if (b.equals("google.com")) {
                        c = 1;
                        break;
                    }
                    break;
                case -364826023:
                    if (b.equals("facebook.com")) {
                        c = 2;
                        break;
                    }
                    break;
                case 106642798:
                    if (b.equals("phone")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1216985755:
                    if (b.equals("password")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2120171958:
                    if (b.equals("emailLink")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i = R$layout.fui_provider_button_anonymous;
                    break;
                case 1:
                    i = R$layout.fui_idp_button_google;
                    break;
                case 2:
                    i = R$layout.fui_idp_button_facebook;
                    break;
                case 3:
                    i = R$layout.fui_provider_button_phone;
                    break;
                case 4:
                case 5:
                    i = R$layout.fui_provider_button_email;
                    break;
                default:
                    if (!TextUtils.isEmpty(next.mo34056a().getString("generic_oauth_provider_id"))) {
                        i = next.mo34056a().getInt("generic_oauth_button_id");
                        break;
                    } else {
                        throw new IllegalStateException("Unknown provider: " + b);
                    }
            }
            View inflate = getLayoutInflater().inflate(i, this.f16083p, false);
            m25978X1(next, inflate);
            this.f16083p.addView(inflate);
        }
    }

    /* renamed from: Z1 */
    private void m25980Z1(List<AuthUI.IdpConfig> list) {
        Integer num;
        Map<String, Integer> b = this.f16084s.mo34041b();
        for (AuthUI.IdpConfig next : list) {
            Integer num2 = b.get(m25981a2(next.mo34057b()));
            if (num2 != null) {
                m25978X1(next, findViewById(num2.intValue()));
            } else {
                throw new IllegalStateException("No button found for auth provider: " + next.mo34057b());
            }
        }
        for (String next2 : b.keySet()) {
            if (next2 != null) {
                boolean z = false;
                Iterator<AuthUI.IdpConfig> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (next2.equals(m25981a2(it.next().mo34057b()))) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!z && (num = b.get(next2)) != null) {
                    findViewById(num.intValue()).setVisibility(8);
                }
            }
        }
    }

    @NonNull
    /* renamed from: a2 */
    private String m25981a2(@NonNull String str) {
        return str.equals("emailLink") ? "password" : str;
    }

    /* renamed from: E */
    public void mo34183E() {
        if (this.f16084s == null) {
            this.f16082o.setVisibility(4);
            for (int i = 0; i < this.f16083p.getChildCount(); i++) {
                View childAt = this.f16083p.getChildAt(i);
                childAt.setEnabled(true);
                childAt.setAlpha(1.0f);
            }
        }
    }

    /* renamed from: b1 */
    public void mo34184b1(int i) {
        if (this.f16084s == null) {
            this.f16082o.setVisibility(0);
            for (int i2 = 0; i2 < this.f16083p.getChildCount(); i2++) {
                View childAt = this.f16083p.getChildAt(i2);
                childAt.setEnabled(false);
                childAt.setAlpha(0.75f);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f16080f.mo40920D(i, i2, intent);
        for (C6904c<?> l : this.f16081g) {
            l.mo34270l(i, i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        int i;
        super.onCreate(bundle);
        FlowParameters O1 = mo34180O1();
        this.f16084s = O1.f15983F;
        C10305b bVar = (C10305b) new ViewModelProvider(this).get(C10305b.class);
        this.f16080f = bVar;
        bVar.mo34278g(O1);
        this.f16081g = new ArrayList();
        AuthMethodPickerLayout authMethodPickerLayout = this.f16084s;
        if (authMethodPickerLayout != null) {
            setContentView(authMethodPickerLayout.mo34040a());
            m25980Z1(O1.f15985c);
        } else {
            setContentView(R$layout.fui_auth_method_picker_layout);
            this.f16082o = (ProgressBar) findViewById(R$id.top_progress_bar);
            this.f16083p = (ViewGroup) findViewById(R$id.btn_holder);
            m25979Y1(O1.f15985c);
            int i2 = O1.f15988g;
            if (i2 == -1) {
                findViewById(R$id.logo).setVisibility(8);
                ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R$id.root);
                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone(constraintLayout);
                int i3 = R$id.container;
                constraintSet.setHorizontalBias(i3, 0.5f);
                constraintSet.setVerticalBias(i3, 0.5f);
                constraintSet.applyTo(constraintLayout);
            } else {
                ((ImageView) findViewById(R$id.logo)).setImageResource(i2);
            }
        }
        boolean z = mo34180O1().mo34143e() && mo34180O1().mo34146h();
        AuthMethodPickerLayout authMethodPickerLayout2 = this.f16084s;
        if (authMethodPickerLayout2 == null) {
            i = R$id.main_tos_and_pp;
        } else {
            i = authMethodPickerLayout2.mo34042c();
        }
        if (i >= 0) {
            TextView textView = (TextView) findViewById(i);
            if (!z) {
                textView.setVisibility(8);
            } else {
                C8205f.m34071e(this, mo34180O1(), textView);
            }
        }
        this.f16080f.mo34267i().observe(this, new C6881a(this, R$string.fui_progress_dialog_signing_in));
    }
}
