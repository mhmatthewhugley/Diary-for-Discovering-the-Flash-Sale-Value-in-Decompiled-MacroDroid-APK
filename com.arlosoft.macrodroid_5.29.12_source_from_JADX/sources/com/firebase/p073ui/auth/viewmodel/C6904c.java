package com.firebase.p073ui.auth.viewmodel;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.p074ui.HelperActivityBase;
import com.google.firebase.auth.FirebaseAuth;
import p127l5.C7688b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.viewmodel.c */
/* compiled from: ProviderSignInBase */
public abstract class C6904c<T> extends C6903b<T, C7688b<IdpResponse>> {
    protected C6904c(Application application) {
        super(application);
    }

    /* renamed from: k */
    public C6904c<T> mo34269k(T t) {
        super.mo34278g(t);
        return this;
    }

    /* renamed from: l */
    public abstract void mo34270l(int i, int i2, @Nullable Intent intent);

    /* renamed from: m */
    public abstract void mo34271m(@NonNull FirebaseAuth firebaseAuth, @NonNull HelperActivityBase helperActivityBase, @NonNull String str);
}
