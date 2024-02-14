package com.firebase.p073ui.auth.data.model;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.FirebaseUiException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.data.model.PhoneNumberVerificationRequiredException */
public class PhoneNumberVerificationRequiredException extends FirebaseUiException {
    private final String mPhoneNumber;

    public PhoneNumberVerificationRequiredException(@NonNull String str) {
        super(4, "Phone number requires verification.");
        this.mPhoneNumber = str;
    }

    @NonNull
    /* renamed from: b */
    public String mo34157b() {
        return this.mPhoneNumber;
    }
}
