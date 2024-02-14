package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@KeepForSdk
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class ClientSettings {

    /* renamed from: a */
    private final Account f3606a;

    /* renamed from: b */
    private final Set f3607b;

    /* renamed from: c */
    private final Set f3608c;

    /* renamed from: d */
    private final Map f3609d;

    /* renamed from: e */
    private final int f3610e;

    /* renamed from: f */
    private final View f3611f;

    /* renamed from: g */
    private final String f3612g;

    /* renamed from: h */
    private final String f3613h;

    /* renamed from: i */
    private final SignInOptions f3614i;

    /* renamed from: j */
    private Integer f3615j;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static final class Builder {

        /* renamed from: a */
        private Account f3616a;

        /* renamed from: b */
        private ArraySet f3617b;

        /* renamed from: c */
        private String f3618c;

        /* renamed from: d */
        private String f3619d;

        /* renamed from: e */
        private SignInOptions f3620e = SignInOptions.f47937A;

        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public ClientSettings mo21680a() {
            return new ClientSettings(this.f3616a, this.f3617b, (Map) null, 0, (View) null, this.f3618c, this.f3619d, this.f3620e, false);
        }

        @NonNull
        @KeepForSdk
        @CanIgnoreReturnValue
        /* renamed from: b */
        public Builder mo21681b(@NonNull String str) {
            this.f3618c = str;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: c */
        public final Builder mo21682c(@NonNull Collection collection) {
            if (this.f3617b == null) {
                this.f3617b = new ArraySet();
            }
            this.f3617b.addAll(collection);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: d */
        public final Builder mo21683d(Account account) {
            this.f3616a = account;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: e */
        public final Builder mo21684e(@NonNull String str) {
            this.f3619d = str;
            return this;
        }
    }

    public ClientSettings(Account account, @NonNull Set set, @NonNull Map map, int i, View view, @NonNull String str, @NonNull String str2, SignInOptions signInOptions, boolean z) {
        this.f3606a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f3607b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f3609d = map;
        this.f3611f = view;
        this.f3610e = i;
        this.f3612g = str;
        this.f3613h = str2;
        this.f3614i = signInOptions == null ? SignInOptions.f47937A : signInOptions;
        HashSet hashSet = new HashSet(emptySet);
        for (zab zab : map.values()) {
            hashSet.addAll(zab.f3697a);
        }
        this.f3608c = Collections.unmodifiableSet(hashSet);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static ClientSettings m4412a(@NonNull Context context) {
        return new GoogleApiClient.Builder(context).mo21269f();
    }

    @KeepForSdk
    @Nullable
    /* renamed from: b */
    public Account mo21668b() {
        return this.f3606a;
    }

    @KeepForSdk
    @Deprecated
    @Nullable
    /* renamed from: c */
    public String mo21669c() {
        Account account = this.f3606a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: d */
    public Account mo21670d() {
        Account account = this.f3606a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    @NonNull
    @KeepForSdk
    /* renamed from: e */
    public Set<Scope> mo21671e() {
        return this.f3608c;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: f */
    public Set<Scope> mo21672f(@NonNull Api<?> api) {
        zab zab = (zab) this.f3609d.get(api);
        if (zab == null || zab.f3697a.isEmpty()) {
            return this.f3607b;
        }
        HashSet hashSet = new HashSet(this.f3607b);
        hashSet.addAll(zab.f3697a);
        return hashSet;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: g */
    public String mo21673g() {
        return this.f3612g;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: h */
    public Set<Scope> mo21674h() {
        return this.f3607b;
    }

    @NonNull
    /* renamed from: i */
    public final SignInOptions mo21675i() {
        return this.f3614i;
    }

    @Nullable
    /* renamed from: j */
    public final Integer mo21676j() {
        return this.f3615j;
    }

    @Nullable
    /* renamed from: k */
    public final String mo21677k() {
        return this.f3613h;
    }

    @NonNull
    /* renamed from: l */
    public final Map mo21678l() {
        return this.f3609d;
    }

    /* renamed from: m */
    public final void mo21679m(@NonNull Integer num) {
        this.f3615j = num;
    }
}
