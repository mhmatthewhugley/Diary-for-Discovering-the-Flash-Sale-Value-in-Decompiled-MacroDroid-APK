package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseException;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class PhoneAuthProvider {

    @SafeParcelable.Class
    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static class ForceResendingToken extends AbstractSafeParcelable {
        @NonNull
        public static final Parcelable.Creator<ForceResendingToken> CREATOR = new zzd();

        @SafeParcelable.Constructor
        ForceResendingToken() {
        }

        @NonNull
        /* renamed from: l2 */
        public static ForceResendingToken m6117l2() {
            return new ForceResendingToken();
        }

        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            SafeParcelWriter.m4564b(parcel, SafeParcelWriter.m4563a(parcel));
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static abstract class OnVerificationStateChangedCallbacks {

        /* renamed from: a */
        private static final Logger f4551a = new Logger("PhoneAuthProvider", new String[0]);

        /* renamed from: a */
        public void mo22703a(@NonNull String str) {
            f4551a.mo21841e("Sms auto retrieval timed-out.", new Object[0]);
        }

        /* renamed from: b */
        public void mo22704b(@NonNull String str, @NonNull ForceResendingToken forceResendingToken) {
        }

        /* renamed from: c */
        public abstract void mo22705c(@NonNull PhoneAuthCredential phoneAuthCredential);

        /* renamed from: d */
        public abstract void mo22706d(@NonNull FirebaseException firebaseException);
    }

    @NonNull
    /* renamed from: a */
    public static PhoneAuthCredential m6115a(@NonNull String str, @NonNull String str2) {
        return PhoneAuthCredential.m6086p2(str, str2);
    }

    /* renamed from: b */
    public static void m6116b(@NonNull PhoneAuthOptions phoneAuthOptions) {
        Preconditions.m4488k(phoneAuthOptions);
        phoneAuthOptions.mo22686c().mo22595G(phoneAuthOptions);
    }
}
