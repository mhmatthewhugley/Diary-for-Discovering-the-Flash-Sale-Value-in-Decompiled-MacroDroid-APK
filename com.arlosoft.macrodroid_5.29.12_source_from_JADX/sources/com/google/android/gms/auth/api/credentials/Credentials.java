package com.google.android.gms.auth.api.credentials;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.Auth;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class Credentials {
    /* renamed from: a */
    public static CredentialsClient m3213a(@NonNull Activity activity, @NonNull CredentialsOptions credentialsOptions) {
        return new CredentialsClient(activity, (Auth.AuthCredentialsOptions) credentialsOptions);
    }

    /* renamed from: b */
    public static CredentialsClient m3214b(@NonNull Context context) {
        return new CredentialsClient(context, (Auth.AuthCredentialsOptions) CredentialsOptions.f2777g);
    }

    /* renamed from: c */
    public static CredentialsClient m3215c(@NonNull Context context, @NonNull CredentialsOptions credentialsOptions) {
        return new CredentialsClient(context, (Auth.AuthCredentialsOptions) credentialsOptions);
    }
}
