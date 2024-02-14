package p153q5;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.gms.auth.api.credentials.Credentials;
import com.google.android.gms.auth.api.credentials.CredentialsClient;
import com.google.android.gms.auth.api.credentials.CredentialsOptions;
import com.google.android.gms.common.GoogleApiAvailability;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: q5.c */
/* compiled from: GoogleApiUtils */
public final class C8179c {
    @NonNull
    /* renamed from: a */
    public static CredentialsClient m33935a(@NonNull Context context) {
        CredentialsOptions c = new CredentialsOptions.Builder().mo20850d().mo20776b();
        if (context instanceof Activity) {
            return Credentials.m3213a((Activity) context, c);
        }
        return Credentials.m3215c(context, c);
    }

    /* renamed from: b */
    public static boolean m33936b(@NonNull Context context) {
        return GoogleApiAvailability.m3521q().mo21156i(context) == 0;
    }
}
