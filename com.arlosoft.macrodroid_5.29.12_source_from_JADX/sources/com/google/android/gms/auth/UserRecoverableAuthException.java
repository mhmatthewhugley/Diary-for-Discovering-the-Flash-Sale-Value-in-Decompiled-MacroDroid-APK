package com.google.android.gms.auth;

import android.content.Intent;

public class UserRecoverableAuthException extends GoogleAuthException {
    private final Intent mIntent;

    public UserRecoverableAuthException(String str, Intent intent) {
        super(str);
        this.mIntent = intent;
    }

    /* renamed from: a */
    public Intent mo20760a() {
        if (this.mIntent == null) {
            return null;
        }
        return new Intent(this.mIntent);
    }
}
