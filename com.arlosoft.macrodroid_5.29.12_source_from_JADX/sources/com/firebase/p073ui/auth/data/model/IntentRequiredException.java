package com.firebase.p073ui.auth.data.model;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.FirebaseUiException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.data.model.IntentRequiredException */
public class IntentRequiredException extends FirebaseUiException {
    private final Intent mIntent;
    private final int mRequestCode;

    public IntentRequiredException(@NonNull Intent intent, int i) {
        super(0);
        this.mIntent = intent;
        this.mRequestCode = i;
    }

    @NonNull
    /* renamed from: b */
    public Intent mo34153b() {
        return this.mIntent;
    }

    /* renamed from: c */
    public int mo34154c() {
        return this.mRequestCode;
    }
}
