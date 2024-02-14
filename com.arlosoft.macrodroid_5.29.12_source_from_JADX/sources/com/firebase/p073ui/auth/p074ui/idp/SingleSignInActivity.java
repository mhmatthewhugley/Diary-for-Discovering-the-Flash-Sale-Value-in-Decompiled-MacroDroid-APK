package com.firebase.p073ui.auth.p074ui.idp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.ViewModelProvider;
import com.firebase.p073ui.auth.AuthUI;
import com.firebase.p073ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.p073ui.auth.FirebaseUiException;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.data.model.User;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.firebase.p073ui.auth.p074ui.InvisibleActivityBase;
import com.firebase.p073ui.auth.viewmodel.C6904c;
import com.firebase.p073ui.auth.viewmodel.C6905d;
import p133m5.C7936c;
import p133m5.C7942e;
import p133m5.C7948f;
import p159r5.C8207h;
import p175u5.C10305b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.ui.idp.SingleSignInActivity */
public class SingleSignInActivity extends InvisibleActivityBase {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C10305b f16091p;

    /* renamed from: s */
    private C6904c<?> f16092s;

    /* renamed from: com.firebase.ui.auth.ui.idp.SingleSignInActivity$a */
    class C6884a extends C6905d<IdpResponse> {

        /* renamed from: e */
        final /* synthetic */ String f16093e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6884a(HelperActivityBase helperActivityBase, String str) {
            super(helperActivityBase);
            this.f16093e = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                SingleSignInActivity.this.mo34177L1(0, new Intent().putExtra("extra_idp_response", IdpResponse.m25762f(exc)));
            } else {
                SingleSignInActivity.this.f16091p.mo40921E(IdpResponse.m25762f(exc));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull IdpResponse idpResponse) {
            int i = 0;
            if ((AuthUI.f15909g.contains(this.f16093e) && !SingleSignInActivity.this.mo34179N1().mo34054m()) || !idpResponse.mo34099r()) {
                SingleSignInActivity.this.f16091p.mo40921E(idpResponse);
                return;
            }
            SingleSignInActivity singleSignInActivity = SingleSignInActivity.this;
            if (idpResponse.mo34099r()) {
                i = -1;
            }
            singleSignInActivity.mo34177L1(i, idpResponse.mo34101t());
        }
    }

    /* renamed from: com.firebase.ui.auth.ui.idp.SingleSignInActivity$b */
    class C6885b extends C6905d<IdpResponse> {
        C6885b(HelperActivityBase helperActivityBase) {
            super(helperActivityBase);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                SingleSignInActivity.this.mo34177L1(0, new Intent().putExtra("extra_idp_response", ((FirebaseAuthAnonymousUpgradeException) exc).mo34081a()));
                return;
            }
            SingleSignInActivity.this.mo34177L1(0, IdpResponse.m25764k(exc));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull IdpResponse idpResponse) {
            SingleSignInActivity singleSignInActivity = SingleSignInActivity.this;
            singleSignInActivity.mo34182Q1(singleSignInActivity.f16091p.mo34266m(), idpResponse, (String) null);
        }
    }

    /* renamed from: V1 */
    public static Intent m25992V1(Context context, FlowParameters flowParameters, User user) {
        return HelperActivityBase.m25831K1(context, SingleSignInActivity.class, flowParameters).putExtra("extra_user", user);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f16091p.mo40920D(i, i2, intent);
        this.f16092s.mo34270l(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        Class cls = C7942e.class;
        super.onCreate(bundle);
        User e = User.m25816e(getIntent());
        String d = e.mo34161d();
        AuthUI.IdpConfig e2 = C8207h.m34078e(mo34180O1().f15985c, d);
        if (e2 == null) {
            mo34177L1(0, IdpResponse.m25764k(new FirebaseUiException(3, "Provider not enabled: " + d)));
            return;
        }
        ViewModelProvider viewModelProvider = new ViewModelProvider(this);
        C10305b bVar = (C10305b) viewModelProvider.get(C10305b.class);
        this.f16091p = bVar;
        bVar.mo34278g(mo34180O1());
        boolean m = mo34179N1().mo34054m();
        d.hashCode();
        if (!d.equals("google.com")) {
            if (!d.equals("facebook.com")) {
                if (!TextUtils.isEmpty(e2.mo34056a().getString("generic_oauth_provider_id"))) {
                    this.f16092s = ((C7942e) viewModelProvider.get(cls)).mo34269k(e2);
                } else {
                    throw new IllegalStateException("Invalid provider id: " + d);
                }
            } else if (m) {
                this.f16092s = ((C7942e) viewModelProvider.get(cls)).mo34269k(C7942e.m33187v());
            } else {
                this.f16092s = ((C7936c) viewModelProvider.get(C7936c.class)).mo34269k(e2);
            }
        } else if (m) {
            this.f16092s = ((C7942e) viewModelProvider.get(cls)).mo34269k(C7942e.m33188w());
        } else {
            this.f16092s = ((C7948f) viewModelProvider.get(C7948f.class)).mo34269k(new C7948f.C7949a(e2, e.mo34158a()));
        }
        this.f16092s.mo34267i().observe(this, new C6884a(this, d));
        this.f16091p.mo34267i().observe(this, new C6885b(this));
        if (this.f16091p.mo34267i().getValue() == null) {
            this.f16092s.mo34271m(mo34178M1(), this, d);
        }
    }
}
