package com.google.android.gms.auth.api;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzf;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.p203authapi.zzj;
import com.google.android.gms.internal.p203authapi.zzq;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class Auth {

    /* renamed from: a */
    public static final Api.ClientKey<zzq> f2664a;

    /* renamed from: b */
    public static final Api.ClientKey<zzf> f2665b;

    /* renamed from: c */
    private static final Api.AbstractClientBuilder<zzq, AuthCredentialsOptions> f2666c;

    /* renamed from: d */
    private static final Api.AbstractClientBuilder<zzf, GoogleSignInOptions> f2667d;
    @ShowFirstParty
    @KeepForSdk
    @Deprecated

    /* renamed from: e */
    public static final Api<AuthProxyOptions> f2668e = AuthProxy.f2683c;

    /* renamed from: f */
    public static final Api<AuthCredentialsOptions> f2669f;

    /* renamed from: g */
    public static final Api<GoogleSignInOptions> f2670g;
    @ShowFirstParty
    @KeepForSdk
    @Deprecated

    /* renamed from: h */
    public static final ProxyApi f2671h = AuthProxy.f2684d;

    /* renamed from: i */
    public static final CredentialsApi f2672i = new zzj();

    /* renamed from: j */
    public static final GoogleSignInApi f2673j = new zzg();

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class AuthCredentialsOptions implements Api.ApiOptions.Optional {

        /* renamed from: f */
        public static final AuthCredentialsOptions f2674f = new Builder().mo20776b();
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f2675a;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final boolean f2676c;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: d */
        public final String f2677d;

        public AuthCredentialsOptions(Builder builder) {
            this.f2675a = builder.f2678a;
            this.f2676c = builder.f2679b.booleanValue();
            this.f2677d = builder.f2680c;
        }

        @Nullable
        /* renamed from: a */
        public final String mo20770a() {
            return this.f2677d;
        }

        /* renamed from: b */
        public final Bundle mo20771b() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", this.f2675a);
            bundle.putBoolean("force_save_dialog", this.f2676c);
            bundle.putString("log_session_id", this.f2677d);
            return bundle;
        }

        @Nullable
        /* renamed from: d */
        public final String mo20772d() {
            return this.f2675a;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AuthCredentialsOptions)) {
                return false;
            }
            AuthCredentialsOptions authCredentialsOptions = (AuthCredentialsOptions) obj;
            return Objects.m4470a(this.f2675a, authCredentialsOptions.f2675a) && this.f2676c == authCredentialsOptions.f2676c && Objects.m4470a(this.f2677d, authCredentialsOptions.f2677d);
        }

        public int hashCode() {
            return Objects.m4471b(this.f2675a, Boolean.valueOf(this.f2676c), this.f2677d);
        }

        @Deprecated
        /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
        public static class Builder {

            /* renamed from: a */
            protected String f2678a;

            /* renamed from: b */
            protected Boolean f2679b = Boolean.FALSE;
            @Nullable

            /* renamed from: c */
            protected String f2680c;

            public Builder() {
            }

            @ShowFirstParty
            /* renamed from: a */
            public Builder mo20775a(String str) {
                this.f2680c = str;
                return this;
            }

            @ShowFirstParty
            /* renamed from: b */
            public AuthCredentialsOptions mo20776b() {
                return new AuthCredentialsOptions(this);
            }

            @ShowFirstParty
            public Builder(AuthCredentialsOptions authCredentialsOptions) {
                this.f2678a = authCredentialsOptions.f2675a;
                this.f2679b = Boolean.valueOf(authCredentialsOptions.f2676c);
                this.f2680c = authCredentialsOptions.f2677d;
            }
        }
    }

    static {
        Api.ClientKey<zzq> clientKey = new Api.ClientKey<>();
        f2664a = clientKey;
        Api.ClientKey<zzf> clientKey2 = new Api.ClientKey<>();
        f2665b = clientKey2;
        zzc zzc = new zzc();
        f2666c = zzc;
        zzd zzd = new zzd();
        f2667d = zzd;
        f2669f = new Api<>("Auth.CREDENTIALS_API", zzc, clientKey);
        f2670g = new Api<>("Auth.GOOGLE_SIGN_IN_API", zzd, clientKey2);
    }

    private Auth() {
    }
}
