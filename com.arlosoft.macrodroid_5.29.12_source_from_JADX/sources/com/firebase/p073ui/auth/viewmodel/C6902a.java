package com.firebase.p073ui.auth.viewmodel;

import android.app.Application;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.google.android.gms.auth.api.credentials.CredentialsClient;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import p127l5.C7688b;
import p153q5.C8179c;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.viewmodel.a */
/* compiled from: AuthViewModelBase */
public abstract class C6902a<T> extends C6903b<FlowParameters, C7688b<T>> {

    /* renamed from: d */
    private CredentialsClient f16144d;

    /* renamed from: e */
    private FirebaseAuth f16145e;

    protected C6902a(Application application) {
        super(application);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo34263h() {
        this.f16145e = FirebaseAuth.getInstance(FirebaseApp.m74384n(((FlowParameters) mo34277f()).f15984a));
        this.f16144d = C8179c.m33935a(getApplication());
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public FirebaseAuth mo34264k() {
        return this.f16145e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public CredentialsClient mo34265l() {
        return this.f16144d;
    }

    @Nullable
    /* renamed from: m */
    public FirebaseUser mo34266m() {
        return this.f16145e.mo22613g();
    }
}
