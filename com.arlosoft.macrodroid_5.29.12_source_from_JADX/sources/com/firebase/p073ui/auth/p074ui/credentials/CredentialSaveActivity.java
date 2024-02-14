package com.firebase.p073ui.auth.p074ui.credentials;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.firebase.p073ui.auth.p074ui.InvisibleActivityBase;
import com.firebase.p073ui.auth.viewmodel.C6905d;
import com.google.android.gms.auth.api.credentials.Credential;
import p127l5.C7688b;
import p186w5.C10349a;

/* renamed from: com.firebase.ui.auth.ui.credentials.CredentialSaveActivity */
public class CredentialSaveActivity extends InvisibleActivityBase {

    /* renamed from: p */
    private C10349a f16009p;

    /* renamed from: com.firebase.ui.auth.ui.credentials.CredentialSaveActivity$a */
    class C6856a extends C6905d<IdpResponse> {

        /* renamed from: e */
        final /* synthetic */ IdpResponse f16010e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6856a(HelperActivityBase helperActivityBase, IdpResponse idpResponse) {
            super(helperActivityBase);
            this.f16010e = idpResponse;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo34115b(@NonNull Exception exc) {
            CredentialSaveActivity.this.mo34177L1(-1, this.f16010e.mo34101t());
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34116c(@NonNull IdpResponse idpResponse) {
            CredentialSaveActivity.this.mo34177L1(-1, idpResponse.mo34101t());
        }
    }

    @NonNull
    /* renamed from: U1 */
    public static Intent m25844U1(Context context, FlowParameters flowParameters, Credential credential, IdpResponse idpResponse) {
        return HelperActivityBase.m25831K1(context, CredentialSaveActivity.class, flowParameters).putExtra("extra_credential", credential).putExtra("extra_idp_response", idpResponse);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f16009p.mo41009s(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        IdpResponse idpResponse = (IdpResponse) getIntent().getParcelableExtra("extra_idp_response");
        Credential credential = (Credential) getIntent().getParcelableExtra("extra_credential");
        C10349a aVar = (C10349a) new ViewModelProvider(this).get(C10349a.class);
        this.f16009p = aVar;
        aVar.mo34278g(mo34180O1());
        this.f16009p.mo41011u(idpResponse);
        this.f16009p.mo34267i().observe(this, new C6856a(this, idpResponse));
        if (((C7688b) this.f16009p.mo34267i().getValue()) == null) {
            this.f16009p.mo41010t(credential);
        }
    }
}
