package p153q5;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.firebase.auth.FirebaseUser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: q5.a */
/* compiled from: CredentialUtils */
public class C8177a {
    @Nullable
    /* renamed from: a */
    public static Credential m33932a(@NonNull FirebaseUser firebaseUser, @Nullable String str, @Nullable String str2) {
        String l2 = firebaseUser.mo22647l2();
        String n2 = firebaseUser.mo22649n2();
        Uri parse = firebaseUser.mo22650o2() == null ? null : Uri.parse(firebaseUser.mo22650o2().toString());
        if (TextUtils.isEmpty(l2) && TextUtils.isEmpty(n2)) {
            Log.w("CredentialUtils", "User (accountType=" + str2 + ") has no email or phone number, cannot build credential.");
            return null;
        } else if (str == null && str2 == null) {
            Log.w("CredentialUtils", "User has no accountType or password, cannot build credential.");
            return null;
        } else {
            if (TextUtils.isEmpty(l2)) {
                l2 = n2;
            }
            Credential.Builder e = new Credential.Builder(l2).mo20819c(firebaseUser.mo22651p0()).mo20821e(parse);
            if (TextUtils.isEmpty(str)) {
                e.mo20818b(str2);
            } else {
                e.mo20820d(str);
            }
            return e.mo20817a();
        }
    }

    @NonNull
    /* renamed from: b */
    public static Credential m33933b(@NonNull FirebaseUser firebaseUser, @Nullable String str, @Nullable String str2) {
        Credential a = m33932a(firebaseUser, str, str2);
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Unable to build credential");
    }
}
