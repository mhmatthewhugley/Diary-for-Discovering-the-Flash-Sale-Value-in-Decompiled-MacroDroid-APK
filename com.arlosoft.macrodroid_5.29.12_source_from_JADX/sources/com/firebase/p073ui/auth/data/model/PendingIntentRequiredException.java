package com.firebase.p073ui.auth.data.model;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.FirebaseUiException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.data.model.PendingIntentRequiredException */
public class PendingIntentRequiredException extends FirebaseUiException {
    private final PendingIntent mPendingIntent;
    private final int mRequestCode;

    public PendingIntentRequiredException(@NonNull PendingIntent pendingIntent, int i) {
        super(0);
        this.mPendingIntent = pendingIntent;
        this.mRequestCode = i;
    }

    @NonNull
    /* renamed from: b */
    public PendingIntent mo34155b() {
        return this.mPendingIntent;
    }

    /* renamed from: c */
    public int mo34156c() {
        return this.mRequestCode;
    }
}
