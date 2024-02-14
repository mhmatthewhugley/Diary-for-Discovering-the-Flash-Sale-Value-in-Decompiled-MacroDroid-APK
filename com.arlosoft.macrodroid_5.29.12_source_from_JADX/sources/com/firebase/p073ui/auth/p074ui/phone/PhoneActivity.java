package com.firebase.p073ui.auth.p074ui.phone;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import com.firebase.p073ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.R$id;
import com.firebase.p073ui.auth.R$layout;
import com.firebase.p073ui.auth.R$string;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.data.model.PhoneNumberVerificationRequiredException;
import com.firebase.p073ui.auth.data.model.User;
import com.firebase.p073ui.auth.p074ui.AppCompatBase;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.firebase.p073ui.auth.viewmodel.C6905d;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuthException;
import p138n5.C7985a;
import p147p5.C8138b;
import p147p5.C8142c;
import p147p5.C8144d;
import p147p5.C8145e;
import p153q5.C8178b;
import p180v5.C10323a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.phone.PhoneActivity */
public class PhoneActivity extends AppCompatBase {

    /* renamed from: f */
    private C8142c f16119f;

    /* renamed from: com.firebase.ui.auth.ui.phone.PhoneActivity$a */
    class C6891a extends C6905d<IdpResponse> {

        /* renamed from: e */
        final /* synthetic */ C10323a f16120e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6891a(HelperActivityBase helperActivityBase, int i, C10323a aVar) {
            super(helperActivityBase, i);
            this.f16120e = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            PhoneActivity.this.m26029a2(exc);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull IdpResponse idpResponse) {
            PhoneActivity.this.mo34182Q1(this.f16120e.mo34266m(), idpResponse, (String) null);
        }
    }

    /* renamed from: com.firebase.ui.auth.ui.phone.PhoneActivity$b */
    class C6892b extends C6905d<C8144d> {

        /* renamed from: e */
        final /* synthetic */ C10323a f16122e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6892b(HelperActivityBase helperActivityBase, int i, C10323a aVar) {
            super(helperActivityBase, i);
            this.f16122e = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            if (exc instanceof PhoneNumberVerificationRequiredException) {
                if (PhoneActivity.this.getSupportFragmentManager().findFragmentByTag("SubmitConfirmationCodeFragment") == null) {
                    PhoneActivity.this.m26030b2(((PhoneNumberVerificationRequiredException) exc).mo34157b());
                }
                PhoneActivity.this.m26029a2((Exception) null);
                return;
            }
            PhoneActivity.this.m26029a2(exc);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull C8144d dVar) {
            if (dVar.mo38159c()) {
                Toast.makeText(PhoneActivity.this, R$string.fui_auto_verified, 1).show();
                FragmentManager supportFragmentManager = PhoneActivity.this.getSupportFragmentManager();
                if (supportFragmentManager.findFragmentByTag("SubmitConfirmationCodeFragment") != null) {
                    supportFragmentManager.popBackStack();
                }
            }
            this.f16122e.mo40949u(dVar.mo38157a(), new IdpResponse.C6845b(new User.C6853b("phone", (String) null).mo34173c(dVar.mo38158b()).mo34171a()).mo34109a());
        }
    }

    /* renamed from: com.firebase.ui.auth.ui.phone.PhoneActivity$c */
    static /* synthetic */ class C6893c {

        /* renamed from: a */
        static final /* synthetic */ int[] f16124a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                q5.b[] r0 = p153q5.C8178b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16124a = r0
                q5.b r1 = p153q5.C8178b.ERROR_INVALID_PHONE_NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16124a     // Catch:{ NoSuchFieldError -> 0x001d }
                q5.b r1 = p153q5.C8178b.ERROR_TOO_MANY_REQUESTS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16124a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q5.b r1 = p153q5.C8178b.ERROR_QUOTA_EXCEEDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16124a     // Catch:{ NoSuchFieldError -> 0x0033 }
                q5.b r1 = p153q5.C8178b.ERROR_INVALID_VERIFICATION_CODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f16124a     // Catch:{ NoSuchFieldError -> 0x003e }
                q5.b r1 = p153q5.C8178b.ERROR_SESSION_EXPIRED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.firebase.p073ui.auth.p074ui.phone.PhoneActivity.C6893c.<clinit>():void");
        }
    }

    /* renamed from: W1 */
    public static Intent m26025W1(Context context, FlowParameters flowParameters, Bundle bundle) {
        return HelperActivityBase.m25831K1(context, PhoneActivity.class, flowParameters).putExtra("extra_params", bundle);
    }

    @NonNull
    /* renamed from: X1 */
    private C7985a m26026X1() {
        C7985a aVar = (C8138b) getSupportFragmentManager().findFragmentByTag("VerifyPhoneFragment");
        if (aVar == null || aVar.getView() == null) {
            aVar = (C8145e) getSupportFragmentManager().findFragmentByTag("SubmitConfirmationCodeFragment");
        }
        if (aVar != null && aVar.getView() != null) {
            return aVar;
        }
        throw new IllegalStateException("No fragments added");
    }

    /* renamed from: Y1 */
    private String m26027Y1(C8178b bVar) {
        int i = C6893c.f16124a[bVar.ordinal()];
        if (i == 1) {
            return getString(R$string.fui_invalid_phone_number);
        }
        if (i == 2) {
            return getString(R$string.fui_error_too_many_attempts);
        }
        if (i == 3) {
            return getString(R$string.fui_error_quota_exceeded);
        }
        if (i == 4) {
            return getString(R$string.fui_incorrect_code_dialog_body);
        }
        if (i != 5) {
            return bVar.getDescription();
        }
        return getString(R$string.fui_error_session_expired);
    }

    @Nullable
    /* renamed from: Z1 */
    private TextInputLayout m26028Z1() {
        C8138b bVar = (C8138b) getSupportFragmentManager().findFragmentByTag("VerifyPhoneFragment");
        C8145e eVar = (C8145e) getSupportFragmentManager().findFragmentByTag("SubmitConfirmationCodeFragment");
        if (bVar != null && bVar.getView() != null) {
            return (TextInputLayout) bVar.getView().findViewById(R$id.phone_layout);
        }
        if (eVar == null || eVar.getView() == null) {
            return null;
        }
        return (TextInputLayout) eVar.getView().findViewById(R$id.confirmation_code_layout);
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public void m26029a2(@Nullable Exception exc) {
        TextInputLayout Z1 = m26028Z1();
        if (Z1 != null) {
            if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                mo34177L1(5, ((FirebaseAuthAnonymousUpgradeException) exc).mo34081a().mo34101t());
            } else if (exc instanceof FirebaseAuthException) {
                C8178b b = C8178b.m33934b((FirebaseAuthException) exc);
                if (b == C8178b.ERROR_USER_DISABLED) {
                    mo34177L1(0, IdpResponse.m25762f(new FirebaseUiException(12)).mo34101t());
                } else {
                    Z1.setError(m26027Y1(b));
                }
            } else if (exc != null) {
                Z1.setError(m26027Y1(C8178b.ERROR_UNKNOWN));
            } else {
                Z1.setError((CharSequence) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public void m26030b2(String str) {
        getSupportFragmentManager().beginTransaction().replace(R$id.fragment_phone, (Fragment) C8145e.m33841m0(str), "SubmitConfirmationCodeFragment").addToBackStack((String) null).commit();
    }

    /* renamed from: E */
    public void mo34183E() {
        m26026X1().mo34183E();
    }

    /* renamed from: b1 */
    public void mo34184b1(int i) {
        m26026X1().mo34184b1(i);
    }

    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.fui_activity_register_phone);
        C10323a aVar = (C10323a) new ViewModelProvider(this).get(C10323a.class);
        aVar.mo34278g(mo34180O1());
        aVar.mo34267i().observe(this, new C6891a(this, R$string.fui_progress_dialog_signing_in, aVar));
        C8142c cVar = (C8142c) new ViewModelProvider(this).get(C8142c.class);
        this.f16119f = cVar;
        cVar.mo34278g(mo34180O1());
        this.f16119f.mo38153s(bundle);
        this.f16119f.mo34267i().observe(this, new C6892b(this, R$string.fui_verifying, aVar));
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().replace(R$id.fragment_phone, (Fragment) C8138b.m33803e0(getIntent().getExtras().getBundle("extra_params")), "VerifyPhoneFragment").disallowAddToBackStack().commit();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f16119f.mo38154t(bundle);
    }
}
