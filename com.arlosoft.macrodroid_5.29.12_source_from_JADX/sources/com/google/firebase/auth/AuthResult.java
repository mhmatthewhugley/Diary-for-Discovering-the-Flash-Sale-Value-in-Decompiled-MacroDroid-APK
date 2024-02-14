package com.google.firebase.auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public interface AuthResult extends SafeParcelable {
    @Nullable
    /* renamed from: J */
    AuthCredential mo22578J();

    @Nullable
    /* renamed from: N1 */
    AdditionalUserInfo mo22579N1();

    @Nullable
    FirebaseUser getUser();
}
