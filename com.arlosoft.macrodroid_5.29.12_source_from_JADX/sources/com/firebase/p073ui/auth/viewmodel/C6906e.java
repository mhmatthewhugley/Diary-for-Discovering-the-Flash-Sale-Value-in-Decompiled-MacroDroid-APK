package com.firebase.p073ui.auth.viewmodel;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.p073ui.auth.IdpResponse;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import p127l5.C7688b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.viewmodel.e */
/* compiled from: SignInViewModelBase */
public abstract class C6906e extends C6902a<IdpResponse> {
    protected C6906e(Application application) {
        super(application);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo34273n(@NonNull IdpResponse idpResponse) {
        mo34276q(C7688b.m32058a(new FirebaseAuthAnonymousUpgradeException(5, idpResponse)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo34274o(@NonNull AuthCredential authCredential) {
        mo34273n(new IdpResponse.C6845b().mo34111c(authCredential).mo34109a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo34275p(@NonNull IdpResponse idpResponse, @NonNull AuthResult authResult) {
        mo34276q(C7688b.m32060c(idpResponse.mo34103u(authResult)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo34276q(C7688b<IdpResponse> bVar) {
        super.mo34268j(bVar);
    }
}
