package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

@Deprecated
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class GoogleApiClient {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Set f3109a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static final class Builder {
        @Nullable

        /* renamed from: a */
        private Account f3110a;

        /* renamed from: b */
        private final Set f3111b = new HashSet();

        /* renamed from: c */
        private final Set f3112c = new HashSet();

        /* renamed from: d */
        private int f3113d;

        /* renamed from: e */
        private View f3114e;

        /* renamed from: f */
        private String f3115f;

        /* renamed from: g */
        private String f3116g;

        /* renamed from: h */
        private final Map f3117h = new ArrayMap();

        /* renamed from: i */
        private final Context f3118i;

        /* renamed from: j */
        private final Map f3119j = new ArrayMap();

        /* renamed from: k */
        private LifecycleActivity f3120k;

        /* renamed from: l */
        private int f3121l = -1;
        @Nullable

        /* renamed from: m */
        private OnConnectionFailedListener f3122m;

        /* renamed from: n */
        private Looper f3123n;

        /* renamed from: o */
        private GoogleApiAvailability f3124o = GoogleApiAvailability.m3521q();

        /* renamed from: p */
        private Api.AbstractClientBuilder f3125p = zad.f47964c;

        /* renamed from: q */
        private final ArrayList f3126q = new ArrayList();

        /* renamed from: r */
        private final ArrayList f3127r = new ArrayList();

        public Builder(@NonNull Context context) {
            this.f3118i = context;
            this.f3123n = context.getMainLooper();
            this.f3115f = context.getPackageName();
            this.f3116g = context.getClass().getName();
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: a */
        public Builder mo21264a(@NonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.m4489l(api, "Api must not be null");
            this.f3119j.put(api, (Object) null);
            List<Scope> a = ((Api.BaseClientBuilder) Preconditions.m4489l(api.mo21190c(), "Base client builder must not be null")).mo21057a(null);
            this.f3112c.addAll(a);
            this.f3111b.addAll(a);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: b */
        public Builder mo21265b(@NonNull ConnectionCallbacks connectionCallbacks) {
            Preconditions.m4489l(connectionCallbacks, "Listener must not be null");
            this.f3126q.add(connectionCallbacks);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: c */
        public Builder mo21266c(@NonNull OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.m4489l(onConnectionFailedListener, "Listener must not be null");
            this.f3127r.add(onConnectionFailedListener);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.google.android.gms.common.api.Api} */
        /* JADX WARNING: Multi-variable type inference failed */
        @androidx.annotation.NonNull
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.gms.common.api.GoogleApiClient mo21267d() {
            /*
                r22 = this;
                r1 = r22
                java.util.Map r0 = r1.f3119j
                boolean r0 = r0.isEmpty()
                r2 = 1
                r0 = r0 ^ r2
                java.lang.String r3 = "must call addApi() to add at least one API"
                com.google.android.gms.common.internal.Preconditions.m4479b(r0, r3)
                com.google.android.gms.common.internal.ClientSettings r0 = r22.mo21269f()
                java.util.Map r3 = r0.mo21678l()
                androidx.collection.ArrayMap r11 = new androidx.collection.ArrayMap
                r11.<init>()
                androidx.collection.ArrayMap r14 = new androidx.collection.ArrayMap
                r14.<init>()
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                java.util.Map r4 = r1.f3119j
                java.util.Set r4 = r4.keySet()
                java.util.Iterator r12 = r4.iterator()
                r13 = 0
                r4 = 0
                r16 = r4
                r17 = 0
            L_0x0036:
                boolean r4 = r12.hasNext()
                if (r4 == 0) goto L_0x00c1
                java.lang.Object r4 = r12.next()
                r10 = r4
                com.google.android.gms.common.api.Api r10 = (com.google.android.gms.common.api.Api) r10
                java.util.Map r4 = r1.f3119j
                java.lang.Object r18 = r4.get(r10)
                java.lang.Object r4 = r3.get(r10)
                if (r4 == 0) goto L_0x0051
                r4 = 1
                goto L_0x0052
            L_0x0051:
                r4 = 0
            L_0x0052:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
                r11.put(r10, r5)
                com.google.android.gms.common.api.internal.zat r9 = new com.google.android.gms.common.api.internal.zat
                r9.<init>(r10, r4)
                r15.add(r9)
                com.google.android.gms.common.api.Api$AbstractClientBuilder r4 = r10.mo21188a()
                java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.m4488k(r4)
                r19 = r4
                com.google.android.gms.common.api.Api$AbstractClientBuilder r19 = (com.google.android.gms.common.api.Api.AbstractClientBuilder) r19
                android.content.Context r5 = r1.f3118i
                android.os.Looper r6 = r1.f3123n
                r4 = r19
                r7 = r0
                r8 = r18
                r20 = r9
                r21 = r10
                r10 = r20
                com.google.android.gms.common.api.Api$Client r4 = r4.mo20768c(r5, r6, r7, r8, r9, r10)
                com.google.android.gms.common.api.Api$AnyClientKey r5 = r21.mo21189b()
                r14.put(r5, r4)
                int r5 = r19.mo21194b()
                if (r5 != r2) goto L_0x0094
                if (r18 == 0) goto L_0x0092
                r17 = 1
                goto L_0x0094
            L_0x0092:
                r17 = 0
            L_0x0094:
                boolean r4 = r4.mo21031d()
                if (r4 == 0) goto L_0x0036
                if (r16 != 0) goto L_0x009f
                r16 = r21
                goto L_0x0036
            L_0x009f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r21.mo21191d()
                java.lang.String r3 = r16.mo21191d()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                java.lang.String r2 = " cannot be used with "
                r4.append(r2)
                r4.append(r3)
                java.lang.String r2 = r4.toString()
                r0.<init>(r2)
                throw r0
            L_0x00c1:
                if (r16 == 0) goto L_0x010f
                if (r17 != 0) goto L_0x00ef
                android.accounts.Account r3 = r1.f3110a
                if (r3 != 0) goto L_0x00cb
                r3 = 1
                goto L_0x00cc
            L_0x00cb:
                r3 = 0
            L_0x00cc:
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.mo21191d()
                r4[r13] = r5
                java.lang.String r5 = "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead"
                com.google.android.gms.common.internal.Preconditions.m4495r(r3, r5, r4)
                java.util.Set r3 = r1.f3111b
                java.util.Set r4 = r1.f3112c
                boolean r3 = r3.equals(r4)
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.mo21191d()
                r4[r13] = r5
                java.lang.String r5 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead."
                com.google.android.gms.common.internal.Preconditions.m4495r(r3, r5, r4)
                goto L_0x010f
            L_0x00ef:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r16.mo21191d()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "With using "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = ", GamesOptions can only be specified within GoogleSignInOptions.Builder"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r0.<init>(r2)
                throw r0
            L_0x010f:
                java.util.Collection r3 = r14.values()
                int r16 = com.google.android.gms.common.api.internal.zabe.m4020v(r3, r2)
                com.google.android.gms.common.api.internal.zabe r2 = new com.google.android.gms.common.api.internal.zabe
                android.content.Context r5 = r1.f3118i
                java.util.concurrent.locks.ReentrantLock r6 = new java.util.concurrent.locks.ReentrantLock
                r6.<init>()
                android.os.Looper r7 = r1.f3123n
                com.google.android.gms.common.GoogleApiAvailability r9 = r1.f3124o
                com.google.android.gms.common.api.Api$AbstractClientBuilder r10 = r1.f3125p
                java.util.ArrayList r12 = r1.f3126q
                java.util.ArrayList r13 = r1.f3127r
                int r3 = r1.f3121l
                r4 = r2
                r8 = r0
                r0 = r15
                r15 = r3
                r17 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                java.util.Set r3 = com.google.android.gms.common.api.GoogleApiClient.f3109a
                monitor-enter(r3)
                java.util.Set r0 = com.google.android.gms.common.api.GoogleApiClient.f3109a     // Catch:{ all -> 0x0154 }
                r0.add(r2)     // Catch:{ all -> 0x0154 }
                monitor-exit(r3)     // Catch:{ all -> 0x0154 }
                int r0 = r1.f3121l
                if (r0 < 0) goto L_0x0153
                com.google.android.gms.common.api.internal.LifecycleActivity r0 = r1.f3120k
                com.google.android.gms.common.api.internal.zak r0 = com.google.android.gms.common.api.internal.zak.m4232t(r0)
                int r3 = r1.f3121l
                com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r4 = r1.f3122m
                r0.mo21519u(r3, r2, r4)
            L_0x0153:
                return r2
            L_0x0154:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0154 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiClient.Builder.mo21267d():com.google.android.gms.common.api.GoogleApiClient");
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: e */
        public Builder mo21268e(@NonNull Handler handler) {
            Preconditions.m4489l(handler, "Handler must not be null");
            this.f3123n = handler.getLooper();
            return this;
        }

        @NonNull
        @VisibleForTesting
        /* renamed from: f */
        public final ClientSettings mo21269f() {
            SignInOptions signInOptions = SignInOptions.f47937A;
            Map map = this.f3119j;
            Api api = zad.f47968g;
            if (map.containsKey(api)) {
                signInOptions = (SignInOptions) this.f3119j.get(api);
            }
            return new ClientSettings(this.f3110a, this.f3111b, this.f3117h, this.f3113d, this.f3114e, this.f3115f, this.f3116g, signInOptions, false);
        }
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: j */
    public static Set<GoogleApiClient> m3652j() {
        Set<GoogleApiClient> set = f3109a;
        synchronized (set) {
        }
        return set;
    }

    @NonNull
    /* renamed from: d */
    public abstract ConnectionResult mo21248d(long j, @NonNull TimeUnit timeUnit);

    /* renamed from: e */
    public abstract void mo21249e();

    /* renamed from: f */
    public abstract void mo21250f();

    /* renamed from: g */
    public abstract void mo21251g(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr);

    @NonNull
    @KeepForSdk
    /* renamed from: h */
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo21252h(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: i */
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo21253i(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: k */
    public Looper mo21254k() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: l */
    public abstract boolean mo21255l();

    /* renamed from: m */
    public abstract boolean mo21256m();

    @KeepForSdk
    /* renamed from: n */
    public boolean mo21257n(@NonNull SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    /* renamed from: o */
    public void mo21258o() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: p */
    public abstract void mo21259p(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    @NonNull
    @KeepForSdk
    /* renamed from: q */
    public <L> ListenerHolder<L> mo21260q(@NonNull L l) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: r */
    public abstract void mo21261r(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    /* renamed from: s */
    public void mo21262s(zada zada) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: t */
    public void mo21263t(zada zada) {
        throw new UnsupportedOperationException();
    }
}
