package com.google.firebase.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p204firebaseauthapi.zzxo;
import com.google.android.gms.internal.p204firebaseauthapi.zzyz;
import com.google.firebase.auth.internal.GenericIdpActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class OAuthProvider extends FederatedAuthProvider {

    /* renamed from: a */
    private final Bundle f4520a;

    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static class Builder {

        /* renamed from: a */
        private final FirebaseAuth f4521a;
        @VisibleForTesting

        /* renamed from: b */
        final Bundle f4522b;

        /* renamed from: c */
        private final Bundle f4523c;

        /* synthetic */ Builder(String str, FirebaseAuth firebaseAuth, zzad zzad) {
            Bundle bundle = new Bundle();
            this.f4522b = bundle;
            Bundle bundle2 = new Bundle();
            this.f4523c = bundle2;
            this.f4521a = firebaseAuth;
            bundle.putString("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.mo22612f().mo61952p().mo61961b());
            bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
            bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzxo.m58381a().mo50038b());
            bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.mo22618k());
            bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", firebaseAuth.mo22612f().mo61951o());
        }

        @NonNull
        /* renamed from: a */
        public Builder mo22673a(@NonNull Map<String, String> map) {
            for (Map.Entry next : map.entrySet()) {
                this.f4523c.putString((String) next.getKey(), (String) next.getValue());
            }
            return this;
        }

        @NonNull
        /* renamed from: b */
        public OAuthProvider mo22674b() {
            return new OAuthProvider(this.f4522b, (zzaf) null);
        }

        @NonNull
        /* renamed from: c */
        public Builder mo22675c(@NonNull List<String> list) {
            this.f4522b.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList(list));
            return this;
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static class CredentialBuilder {
    }

    /* synthetic */ OAuthProvider(Bundle bundle, zzaf zzaf) {
        this.f4520a = bundle;
    }

    @NonNull
    /* renamed from: d */
    public static Builder m6079d(@NonNull String str, @NonNull FirebaseAuth firebaseAuth) {
        Preconditions.m4484g(str);
        Preconditions.m4488k(firebaseAuth);
        if (!"facebook.com".equals(str) || zzyz.m58519g(firebaseAuth.mo22612f())) {
            return new Builder(str, firebaseAuth, (zzad) null);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }

    /* renamed from: a */
    public final void mo22591a(@NonNull Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f4520a);
        activity.startActivity(intent);
    }

    /* renamed from: b */
    public final void mo22592b(@NonNull Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f4520a);
        activity.startActivity(intent);
    }

    @Nullable
    /* renamed from: c */
    public String mo22672c() {
        return this.f4520a.getString("com.google.firebase.auth.KEY_PROVIDER_ID");
    }
}
