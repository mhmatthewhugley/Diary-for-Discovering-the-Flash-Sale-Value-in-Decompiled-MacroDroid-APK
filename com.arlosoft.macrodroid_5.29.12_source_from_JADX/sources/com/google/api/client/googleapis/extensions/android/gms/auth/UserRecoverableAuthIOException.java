package com.google.api.client.googleapis.extensions.android.gms.auth;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.api.client.util.Beta;

@Beta
public class UserRecoverableAuthIOException extends GoogleAuthIOException {
    private static final long serialVersionUID = 1;

    public UserRecoverableAuthIOException(UserRecoverableAuthException userRecoverableAuthException) {
        super(userRecoverableAuthException);
    }

    /* renamed from: b */
    public UserRecoverableAuthException getCause() {
        return (UserRecoverableAuthException) super.getCause();
    }

    /* renamed from: c */
    public final Intent mo60280c() {
        return getCause().mo20760a();
    }
}
