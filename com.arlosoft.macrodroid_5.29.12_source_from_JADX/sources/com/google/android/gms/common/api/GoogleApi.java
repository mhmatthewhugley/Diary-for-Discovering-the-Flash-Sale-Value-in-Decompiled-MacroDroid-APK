package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {

    /* renamed from: a */
    private final Context f3093a;
    @Nullable

    /* renamed from: b */
    private final String f3094b;

    /* renamed from: c */
    private final Api f3095c;

    /* renamed from: d */
    private final Api.ApiOptions f3096d;

    /* renamed from: e */
    private final ApiKey f3097e;

    /* renamed from: f */
    private final Looper f3098f;

    /* renamed from: g */
    private final int f3099g;

    /* renamed from: h */
    private final GoogleApiClient f3100h;

    /* renamed from: i */
    private final StatusExceptionMapper f3101i;
    @NonNull

    /* renamed from: j */
    protected final GoogleApiManager f3102j;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class Settings {
        @NonNull
        @KeepForSdk

        /* renamed from: c */
        public static final Settings f3103c = new Builder().mo21241a();
        @NonNull

        /* renamed from: a */
        public final StatusExceptionMapper f3104a;
        @NonNull

        /* renamed from: b */
        public final Looper f3105b;

        @KeepForSdk
        /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
        public static class Builder {

            /* renamed from: a */
            private StatusExceptionMapper f3106a;

            /* renamed from: b */
            private Looper f3107b;

            @NonNull
            @KeepForSdk
            /* renamed from: a */
            public Settings mo21241a() {
                if (this.f3106a == null) {
                    this.f3106a = new ApiExceptionMapper();
                }
                if (this.f3107b == null) {
                    this.f3107b = Looper.getMainLooper();
                }
                return new Settings(this.f3106a, this.f3107b);
            }

            @NonNull
            @KeepForSdk
            @CanIgnoreReturnValue
            /* renamed from: b */
            public Builder mo21242b(@NonNull Looper looper) {
                Preconditions.m4489l(looper, "Looper must not be null.");
                this.f3107b = looper;
                return this;
            }

            @NonNull
            @KeepForSdk
            @CanIgnoreReturnValue
            /* renamed from: c */
            public Builder mo21243c(@NonNull StatusExceptionMapper statusExceptionMapper) {
                Preconditions.m4489l(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.f3106a = statusExceptionMapper;
                return this;
            }
        }

        @KeepForSdk
        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.f3104a = statusExceptionMapper;
            this.f3105b = looper;
        }
    }

    @MainThread
    @KeepForSdk
    public GoogleApi(@NonNull Activity activity, @NonNull Api<O> api, @NonNull O o, @NonNull Settings settings) {
        this(activity, activity, api, o, settings);
    }

    /* renamed from: E */
    private final BaseImplementation.ApiMethodImpl m3625E(int i, @NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.mo21330p();
        this.f3102j.mo21343H(this, i, apiMethodImpl);
        return apiMethodImpl;
    }

    /* renamed from: F */
    private final Task m3626F(int i, @NonNull TaskApiCall taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f3102j.mo21344I(this, i, taskApiCall, taskCompletionSource, this.f3101i);
        return taskCompletionSource.mo56137a();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: A */
    public <L> ListenerHolder<L> mo21221A(@NonNull L l, @NonNull String str) {
        return ListenerHolders.m3811a(l, this.f3098f, str);
    }

    /* renamed from: B */
    public final int mo21222B() {
        return this.f3099g;
    }

    @WorkerThread
    /* renamed from: C */
    public final Api.Client mo21223C(Looper looper, zabq zabq) {
        Looper looper2 = looper;
        Api.Client c = ((Api.AbstractClientBuilder) Preconditions.m4488k(this.f3095c.mo21188a())).mo20768c(this.f3093a, looper2, mo21226l().mo21680a(), this.f3096d, zabq, zabq);
        String y = mo21239y();
        if (y != null && (c instanceof BaseGmsClient)) {
            ((BaseGmsClient) c).mo21636U(y);
        }
        if (y != null && (c instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) c).mo21387w(y);
        }
        return c;
    }

    /* renamed from: D */
    public final zact mo21224D(Context context, Handler handler) {
        return new zact(context, handler, mo21226l().mo21680a());
    }

    @NonNull
    @KeepForSdk
    /* renamed from: k */
    public GoogleApiClient mo21225k() {
        return this.f3100h;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: l */
    public ClientSettings.Builder mo21226l() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount K1;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        Api.ApiOptions apiOptions = this.f3096d;
        if (!(apiOptions instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (K1 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).mo21193K1()) == null) {
            Api.ApiOptions apiOptions2 = this.f3096d;
            account = apiOptions2 instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) apiOptions2).mo21192K() : null;
        } else {
            account = K1.mo20960K();
        }
        builder.mo21683d(account);
        Api.ApiOptions apiOptions3 = this.f3096d;
        if (apiOptions3 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) {
            GoogleSignInAccount K12 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions3).mo21193K1();
            if (K12 == null) {
                set = Collections.emptySet();
            } else {
                set = K12.mo20970q2();
            }
        } else {
            set = Collections.emptySet();
        }
        builder.mo21682c(set);
        builder.mo21684e(this.f3093a.getClass().getName());
        builder.mo21681b(this.f3093a.getPackageName());
        return builder;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: m */
    public Task<Boolean> mo21227m() {
        return this.f3102j.mo21340A(this);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: n */
    public <TResult, A extends Api.AnyClient> Task<TResult> mo21228n(@NonNull TaskApiCall<A, TResult> taskApiCall) {
        return m3626F(2, taskApiCall);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: o */
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo21229o(@NonNull T t) {
        m3625E(0, t);
        return t;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: p */
    public <TResult, A extends Api.AnyClient> Task<TResult> mo21230p(@NonNull TaskApiCall<A, TResult> taskApiCall) {
        return m3626F(0, taskApiCall);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: q */
    public <A extends Api.AnyClient> Task<Void> mo21231q(@NonNull RegistrationMethods<A, ?> registrationMethods) {
        Preconditions.m4488k(registrationMethods);
        Preconditions.m4489l(registrationMethods.f3224a.mo21390b(), "Listener has already been released.");
        Preconditions.m4489l(registrationMethods.f3225b.mo21410a(), "Listener has already been released.");
        return this.f3102j.mo21341B(this, registrationMethods.f3224a, registrationMethods.f3225b, registrationMethods.f3226c);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: r */
    public Task<Boolean> mo21232r(@NonNull ListenerHolder.ListenerKey<?> listenerKey) {
        return mo21233s(listenerKey, 0);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: s */
    public Task<Boolean> mo21233s(@NonNull ListenerHolder.ListenerKey<?> listenerKey, int i) {
        Preconditions.m4489l(listenerKey, "Listener key cannot be null.");
        return this.f3102j.mo21342C(this, listenerKey, i);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: t */
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo21234t(@NonNull T t) {
        m3625E(1, t);
        return t;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: u */
    public <TResult, A extends Api.AnyClient> Task<TResult> mo21235u(@NonNull TaskApiCall<A, TResult> taskApiCall) {
        return m3626F(1, taskApiCall);
    }

    @NonNull
    /* renamed from: v */
    public final ApiKey<O> mo21236v() {
        return this.f3097e;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: w */
    public O mo21237w() {
        return this.f3096d;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: x */
    public Context mo21238x() {
        return this.f3093a;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    /* renamed from: y */
    public String mo21239y() {
        return this.f3094b;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: z */
    public Looper mo21240z() {
        return this.f3098f;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GoogleApi(@androidx.annotation.NonNull android.app.Activity r2, @androidx.annotation.NonNull com.google.android.gms.common.api.Api<O> r3, @androidx.annotation.NonNull O r4, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.mo21243c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.mo21242b(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.mo21241a()
            r1.<init>((android.app.Activity) r2, r3, r4, (com.google.android.gms.common.api.GoogleApi.Settings) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.app.Activity, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }

    private GoogleApi(@NonNull Context context, @Nullable Activity activity, Api api, Api.ApiOptions apiOptions, Settings settings) {
        Preconditions.m4489l(context, "Null context is not permitted.");
        Preconditions.m4489l(api, "Api must not be null.");
        Preconditions.m4489l(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f3093a = context.getApplicationContext();
        String str = null;
        if (PlatformVersion.m4907l()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f3094b = str;
        this.f3095c = api;
        this.f3096d = apiOptions;
        this.f3098f = settings.f3105b;
        ApiKey a = ApiKey.m3705a(api, apiOptions, str);
        this.f3097e = a;
        this.f3100h = new zabv(this);
        GoogleApiManager y = GoogleApiManager.m3767y(this.f3093a);
        this.f3102j = y;
        this.f3099g = y.mo21354n();
        this.f3101i = settings.f3104a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            zaae.m3923u(activity, y, a);
        }
        y.mo21348c(this);
    }

    @KeepForSdk
    public GoogleApi(@NonNull Context context, @NonNull Api<O> api, @NonNull O o, @NonNull Settings settings) {
        this(context, (Activity) null, api, o, settings);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GoogleApi(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.google.android.gms.common.api.Api<O> r3, @androidx.annotation.NonNull O r4, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.mo21243c(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.mo21241a()
            r1.<init>((android.content.Context) r2, r3, r4, (com.google.android.gms.common.api.GoogleApi.Settings) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.<init>(android.content.Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper):void");
    }
}
