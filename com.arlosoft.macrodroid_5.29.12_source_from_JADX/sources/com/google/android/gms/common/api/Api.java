package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class Api<O extends ApiOptions> {

    /* renamed from: a */
    private final AbstractClientBuilder f3080a;

    /* renamed from: b */
    private final ClientKey f3081b;

    /* renamed from: c */
    private final String f3082c;

    @KeepForSdk
    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static abstract class AbstractClientBuilder<T extends Client, O> extends BaseClientBuilder<T, O> {
        @NonNull
        @KeepForSdk
        @Deprecated
        /* renamed from: c */
        public T mo20768c(@NonNull Context context, @NonNull Looper looper, @NonNull ClientSettings clientSettings, @NonNull O o, @NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks, @NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return mo20952d(context, looper, clientSettings, o, connectionCallbacks, onConnectionFailedListener);
        }

        @NonNull
        @KeepForSdk
        /* renamed from: d */
        public T mo20952d(@NonNull Context context, @NonNull Looper looper, @NonNull ClientSettings clientSettings, @NonNull O o, @NonNull ConnectionCallbacks connectionCallbacks, @NonNull OnConnectionFailedListener onConnectionFailedListener) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface AnyClient {
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class AnyClientKey<C extends AnyClient> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface ApiOptions {
        @NonNull

        /* renamed from: b */
        public static final NoOptions f3083b = new NoOptions((zaa) null);

        /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            @NonNull
            /* renamed from: K */
            Account mo21192K();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
        public interface HasGoogleSignInAccountOptions extends HasOptions {
            @Nullable
            /* renamed from: K1 */
            GoogleSignInAccount mo21193K1();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
        public interface HasOptions extends ApiOptions {
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
        public static final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }

            /* synthetic */ NoOptions(zaa zaa) {
            }
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
        public interface NotRequiredOptions extends ApiOptions {
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    @KeepForSdk
    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static abstract class BaseClientBuilder<T extends AnyClient, O> {
        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public List<Scope> mo21057a(@Nullable O o) {
            return Collections.emptyList();
        }

        @KeepForSdk
        /* renamed from: b */
        public int mo21194b() {
            return Integer.MAX_VALUE;
        }
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface Client extends AnyClient {
        @KeepForSdk
        /* renamed from: b */
        void mo21195b();

        @KeepForSdk
        /* renamed from: c */
        boolean mo21196c();

        @KeepForSdk
        /* renamed from: d */
        boolean mo21031d();

        @KeepForSdk
        /* renamed from: e */
        void mo21197e(@NonNull String str);

        @KeepForSdk
        /* renamed from: f */
        boolean mo21198f();

        @NonNull
        @KeepForSdk
        /* renamed from: g */
        String mo21199g();

        @KeepForSdk
        /* renamed from: h */
        void mo21200h(@NonNull BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        @KeepForSdk
        /* renamed from: i */
        boolean mo21201i();

        @KeepForSdk
        /* renamed from: j */
        boolean mo21202j();

        @NonNull
        @KeepForSdk
        /* renamed from: l */
        Set<Scope> mo21203l();

        @KeepForSdk
        /* renamed from: m */
        void mo21204m(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set<Scope> set);

        @KeepForSdk
        /* renamed from: n */
        void mo21205n(@NonNull BaseGmsClient.SignOutCallbacks signOutCallbacks);

        @KeepForSdk
        /* renamed from: o */
        void mo21206o(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr);

        @KeepForSdk
        /* renamed from: q */
        int mo21032q();

        @NonNull
        @KeepForSdk
        /* renamed from: r */
        Feature[] mo21207r();

        @KeepForSdk
        @Nullable
        /* renamed from: t */
        String mo21208t();

        @NonNull
        @KeepForSdk
        /* renamed from: u */
        Intent mo21034u();
    }

    @KeepForSdk
    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static final class ClientKey<C extends Client> extends AnyClientKey<C> {
    }

    @KeepForSdk
    public <C extends Client> Api(@NonNull String str, @NonNull AbstractClientBuilder<C, O> abstractClientBuilder, @NonNull ClientKey<C> clientKey) {
        Preconditions.m4489l(abstractClientBuilder, "Cannot construct an Api with a null ClientBuilder");
        Preconditions.m4489l(clientKey, "Cannot construct an Api with a null ClientKey");
        this.f3082c = str;
        this.f3080a = abstractClientBuilder;
        this.f3081b = clientKey;
    }

    @NonNull
    /* renamed from: a */
    public final AbstractClientBuilder mo21188a() {
        return this.f3080a;
    }

    @NonNull
    /* renamed from: b */
    public final AnyClientKey mo21189b() {
        return this.f3081b;
    }

    @NonNull
    /* renamed from: c */
    public final BaseClientBuilder mo21190c() {
        return this.f3080a;
    }

    @NonNull
    /* renamed from: d */
    public final String mo21191d() {
        return this.f3082c;
    }
}
