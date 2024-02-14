package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class CredentialsOptions extends Auth.AuthCredentialsOptions {

    /* renamed from: g */
    public static final CredentialsOptions f2777g = ((CredentialsOptions) new Builder().mo20776b());

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class Builder extends Auth.AuthCredentialsOptions.Builder {
        @ShowFirstParty
        /* renamed from: a */
        public final /* synthetic */ Auth.AuthCredentialsOptions.Builder mo20775a(String str) {
            this.f2680c = str;
            return this;
        }

        /* renamed from: c */
        public final CredentialsOptions mo20776b() {
            return new CredentialsOptions(this);
        }

        /* renamed from: d */
        public final Builder mo20850d() {
            this.f2679b = Boolean.TRUE;
            return this;
        }
    }

    private CredentialsOptions(Builder builder) {
        super(builder);
    }
}
