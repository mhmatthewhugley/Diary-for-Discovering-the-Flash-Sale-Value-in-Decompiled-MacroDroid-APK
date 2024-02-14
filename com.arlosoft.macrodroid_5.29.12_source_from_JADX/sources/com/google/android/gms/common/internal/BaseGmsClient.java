package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class BaseGmsClient<T extends IInterface> {
    @NonNull
    @KeepForSdk

    /* renamed from: U */
    public static final String[] f3571U = {"service_esmobile", "service_googleme"};

    /* renamed from: V */
    private static final Feature[] f3572V = new Feature[0];

    /* renamed from: A */
    private final GmsClientSupervisor f3573A;

    /* renamed from: B */
    private final GoogleApiAvailabilityLight f3574B;

    /* renamed from: C */
    final Handler f3575C;

    /* renamed from: D */
    private final Object f3576D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final Object f3577E;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: F */
    public IGmsServiceBroker f3578F;
    @NonNull
    @VisibleForTesting

    /* renamed from: G */
    protected ConnectionProgressReportCallbacks f3579G;
    @Nullable

    /* renamed from: H */
    private IInterface f3580H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final ArrayList f3581I;
    @Nullable

    /* renamed from: J */
    private zze f3582J;

    /* renamed from: K */
    private int f3583K;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: L */
    public final BaseConnectionCallbacks f3584L;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: M */
    public final BaseOnConnectionFailedListener f3585M;

    /* renamed from: N */
    private final int f3586N;
    @Nullable

    /* renamed from: O */
    private final String f3587O;
    @Nullable

    /* renamed from: P */
    private volatile String f3588P;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: Q */
    public ConnectionResult f3589Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public boolean f3590R;
    @Nullable

    /* renamed from: S */
    private volatile zzj f3591S;
    @NonNull
    @VisibleForTesting

    /* renamed from: T */
    protected AtomicInteger f3592T;

    /* renamed from: a */
    private int f3593a;

    /* renamed from: c */
    private long f3594c;

    /* renamed from: d */
    private long f3595d;

    /* renamed from: f */
    private int f3596f;

    /* renamed from: g */
    private long f3597g;
    @Nullable

    /* renamed from: o */
    private volatile String f3598o;
    @VisibleForTesting

    /* renamed from: p */
    zzu f3599p;

    /* renamed from: s */
    private final Context f3600s;

    /* renamed from: z */
    private final Looper f3601z;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface BaseConnectionCallbacks {
        @KeepForSdk
        /* renamed from: t1 */
        void mo21659t1(int i);

        @KeepForSdk
        /* renamed from: y */
        void mo21660y(@Nullable Bundle bundle);
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface BaseOnConnectionFailedListener {
        @KeepForSdk
        /* renamed from: A1 */
        void mo21661A1(@NonNull ConnectionResult connectionResult);
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface ConnectionProgressReportCallbacks {
        @KeepForSdk
        /* renamed from: a */
        void mo21444a(@NonNull ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    protected class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        @KeepForSdk
        public LegacyClientCallbackAdapter() {
        }

        /* renamed from: a */
        public final void mo21444a(@NonNull ConnectionResult connectionResult) {
            if (connectionResult.mo21137p2()) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                baseGmsClient.mo21650m((IAccountAccessor) null, baseGmsClient.mo21625H());
            } else if (BaseGmsClient.this.f3585M != null) {
                BaseGmsClient.this.f3585M.mo21661A1(connectionResult);
            }
        }
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface SignOutCallbacks {
        @KeepForSdk
        /* renamed from: a */
        void mo21468a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected BaseGmsClient(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull android.os.Looper r11, int r12, @androidx.annotation.Nullable com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r13, @androidx.annotation.Nullable com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r14, @androidx.annotation.Nullable java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.m4444c(r10)
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.m3542h()
            com.google.android.gms.common.internal.Preconditions.m4488k(r13)
            com.google.android.gms.common.internal.Preconditions.m4488k(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener, java.lang.String):void");
    }

    /* renamed from: h0 */
    static /* bridge */ /* synthetic */ void m4353h0(BaseGmsClient baseGmsClient, zzj zzj) {
        RootTelemetryConfiguration rootTelemetryConfiguration;
        baseGmsClient.f3591S = zzj;
        if (baseGmsClient.mo21639X()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzj.f3763f;
            RootTelemetryConfigManager b = RootTelemetryConfigManager.m4496b();
            if (connectionTelemetryConfiguration == null) {
                rootTelemetryConfiguration = null;
            } else {
                rootTelemetryConfiguration = connectionTelemetryConfiguration.mo21690q2();
            }
            b.mo21723c(rootTelemetryConfiguration);
        }
    }

    /* renamed from: i0 */
    static /* bridge */ /* synthetic */ void m4354i0(BaseGmsClient baseGmsClient, int i) {
        int i2;
        int i3;
        synchronized (baseGmsClient.f3576D) {
            i2 = baseGmsClient.f3583K;
        }
        if (i2 == 3) {
            baseGmsClient.f3590R = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = baseGmsClient.f3575C;
        handler.sendMessage(handler.obtainMessage(i3, baseGmsClient.f3592T.get(), 16));
    }

    /* renamed from: l0 */
    static /* bridge */ /* synthetic */ boolean m4356l0(BaseGmsClient baseGmsClient, int i, int i2, IInterface iInterface) {
        synchronized (baseGmsClient.f3576D) {
            if (baseGmsClient.f3583K != i) {
                return false;
            }
            baseGmsClient.m4358n0(i2, iInterface);
            return true;
        }
    }

    /* renamed from: m0 */
    static /* bridge */ /* synthetic */ boolean m4357m0(BaseGmsClient baseGmsClient) {
        if (baseGmsClient.f3590R || TextUtils.isEmpty(baseGmsClient.mo21029J()) || TextUtils.isEmpty(baseGmsClient.mo21624G())) {
            return false;
        }
        try {
            Class.forName(baseGmsClient.mo21029J());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public final void m4358n0(int i, @Nullable IInterface iInterface) {
        zzu zzu;
        zzu zzu2;
        boolean z = false;
        if ((i == 4) == (iInterface != null)) {
            z = true;
        }
        Preconditions.m4478a(z);
        synchronized (this.f3576D) {
            this.f3583K = i;
            this.f3580H = iInterface;
            if (i == 1) {
                zze zze = this.f3582J;
                if (zze != null) {
                    GmsClientSupervisor gmsClientSupervisor = this.f3573A;
                    String c = this.f3599p.mo21833c();
                    Preconditions.m4488k(c);
                    gmsClientSupervisor.mo21699g(c, this.f3599p.mo21832b(), this.f3599p.mo21831a(), zze, mo21642c0(), this.f3599p.mo21834d());
                    this.f3582J = null;
                }
            } else if (i == 2 || i == 3) {
                zze zze2 = this.f3582J;
                if (!(zze2 == null || (zzu2 = this.f3599p) == null)) {
                    String c2 = zzu2.mo21833c();
                    String b = zzu2.mo21832b();
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c2 + " on " + b);
                    GmsClientSupervisor gmsClientSupervisor2 = this.f3573A;
                    String c3 = this.f3599p.mo21833c();
                    Preconditions.m4488k(c3);
                    gmsClientSupervisor2.mo21699g(c3, this.f3599p.mo21832b(), this.f3599p.mo21831a(), zze2, mo21642c0(), this.f3599p.mo21834d());
                    this.f3592T.incrementAndGet();
                }
                zze zze3 = new zze(this, this.f3592T.get());
                this.f3582J = zze3;
                if (this.f3583K != 3 || mo21624G() == null) {
                    zzu = new zzu(mo21627L(), mo21030K(), false, GmsClientSupervisor.m4443b(), mo21629N());
                } else {
                    zzu = new zzu(mo21621D().getPackageName(), mo21624G(), true, GmsClientSupervisor.m4443b(), false);
                }
                this.f3599p = zzu;
                if (zzu.mo21834d()) {
                    if (mo21032q() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f3599p.mo21833c())));
                    }
                }
                GmsClientSupervisor gmsClientSupervisor3 = this.f3573A;
                String c4 = this.f3599p.mo21833c();
                Preconditions.m4488k(c4);
                if (!gmsClientSupervisor3.mo21700h(new zzn(c4, this.f3599p.mo21832b(), this.f3599p.mo21831a(), this.f3599p.mo21834d()), zze3, mo21642c0(), mo21619B())) {
                    String c5 = this.f3599p.mo21833c();
                    String b2 = this.f3599p.mo21832b();
                    Log.w("GmsClient", "unable to connect to service: " + c5 + " on " + b2);
                    mo21649j0(16, (Bundle) null, this.f3592T.get());
                }
            } else if (i == 4) {
                Preconditions.m4488k(iInterface);
                mo21631P(iInterface);
            }
        }
    }

    @NonNull
    @KeepForSdk
    /* renamed from: A */
    public Feature[] mo21618A() {
        return f3572V;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    /* renamed from: B */
    public Executor mo21619B() {
        return null;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: C */
    public Bundle mo21620C() {
        return null;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: D */
    public final Context mo21621D() {
        return this.f3600s;
    }

    @KeepForSdk
    /* renamed from: E */
    public int mo21622E() {
        return this.f3586N;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: F */
    public Bundle mo21623F() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    /* renamed from: G */
    public String mo21624G() {
        return null;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: H */
    public Set<Scope> mo21625H() {
        return Collections.emptySet();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: I */
    public final T mo21626I() throws DeadObjectException {
        T t;
        synchronized (this.f3576D) {
            if (this.f3583K != 5) {
                mo21656w();
                t = this.f3580H;
                Preconditions.m4489l(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: J */
    public abstract String mo21029J();

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: K */
    public abstract String mo21030K();

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: L */
    public String mo21627L() {
        return "com.google.android.gms";
    }

    @KeepForSdk
    @Nullable
    /* renamed from: M */
    public ConnectionTelemetryConfiguration mo21628M() {
        zzj zzj = this.f3591S;
        if (zzj == null) {
            return null;
        }
        return zzj.f3763f;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: N */
    public boolean mo21629N() {
        return mo21032q() >= 211700000;
    }

    @KeepForSdk
    /* renamed from: O */
    public boolean mo21630O() {
        return this.f3591S != null;
    }

    /* access modifiers changed from: protected */
    @CallSuper
    @KeepForSdk
    /* renamed from: P */
    public void mo21631P(@NonNull T t) {
        this.f3595d = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @CallSuper
    @KeepForSdk
    /* renamed from: Q */
    public void mo21632Q(@NonNull ConnectionResult connectionResult) {
        this.f3596f = connectionResult.mo21133l2();
        this.f3597g = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @CallSuper
    @KeepForSdk
    /* renamed from: R */
    public void mo21633R(int i) {
        this.f3593a = i;
        this.f3594c = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: S */
    public void mo21634S(int i, @Nullable IBinder iBinder, @Nullable Bundle bundle, int i2) {
        Handler handler = this.f3575C;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new zzf(this, i, iBinder, bundle)));
    }

    @KeepForSdk
    /* renamed from: T */
    public boolean mo21635T() {
        return false;
    }

    @KeepForSdk
    /* renamed from: U */
    public void mo21636U(@NonNull String str) {
        this.f3588P = str;
    }

    @KeepForSdk
    /* renamed from: V */
    public void mo21637V(int i) {
        Handler handler = this.f3575C;
        handler.sendMessage(handler.obtainMessage(6, this.f3592T.get(), i));
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @VisibleForTesting
    /* renamed from: W */
    public void mo21638W(@NonNull ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i, @Nullable PendingIntent pendingIntent) {
        Preconditions.m4489l(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.f3579G = connectionProgressReportCallbacks;
        Handler handler = this.f3575C;
        handler.sendMessage(handler.obtainMessage(3, this.f3592T.get(), i, pendingIntent));
    }

    @KeepForSdk
    /* renamed from: X */
    public boolean mo21639X() {
        return false;
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo21640b() {
        this.f3592T.incrementAndGet();
        synchronized (this.f3581I) {
            int size = this.f3581I.size();
            for (int i = 0; i < size; i++) {
                ((zzc) this.f3581I.get(i)).mo21798d();
            }
            this.f3581I.clear();
        }
        synchronized (this.f3577E) {
            this.f3578F = null;
        }
        m4358n0(1, (IInterface) null);
    }

    @KeepForSdk
    /* renamed from: c */
    public boolean mo21641c() {
        boolean z;
        synchronized (this.f3576D) {
            z = this.f3583K == 4;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: c0 */
    public final String mo21642c0() {
        String str = this.f3587O;
        return str == null ? this.f3600s.getClass().getName() : str;
    }

    @KeepForSdk
    /* renamed from: d */
    public boolean mo21031d() {
        return false;
    }

    @KeepForSdk
    /* renamed from: e */
    public void mo21643e(@NonNull String str) {
        this.f3598o = str;
        mo21640b();
    }

    @KeepForSdk
    /* renamed from: f */
    public boolean mo21644f() {
        boolean z;
        synchronized (this.f3576D) {
            int i = this.f3583K;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: g */
    public String mo21645g() {
        zzu zzu;
        if (mo21641c() && (zzu = this.f3599p) != null) {
            return zzu.mo21832b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @KeepForSdk
    /* renamed from: h */
    public void mo21646h(@NonNull ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Preconditions.m4489l(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.f3579G = connectionProgressReportCallbacks;
        m4358n0(2, (IInterface) null);
    }

    @KeepForSdk
    /* renamed from: i */
    public boolean mo21647i() {
        return true;
    }

    @KeepForSdk
    /* renamed from: j */
    public boolean mo21648j() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public final void mo21649j0(int i, @Nullable Bundle bundle, int i2) {
        Handler handler = this.f3575C;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new zzg(this, i, (Bundle) null)));
    }

    @WorkerThread
    @KeepForSdk
    /* renamed from: m */
    public void mo21650m(@Nullable IAccountAccessor iAccountAccessor, @NonNull Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle F = mo21623F();
        int i = this.f3586N;
        String str = this.f3588P;
        int i2 = GoogleApiAvailabilityLight.f3062a;
        Scope[] scopeArr = GetServiceRequest.f3629F;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f3630G;
        GetServiceRequest getServiceRequest = r3;
        GetServiceRequest getServiceRequest2 = new GetServiceRequest(6, i, i2, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, featureArr, featureArr, true, 0, false, str);
        GetServiceRequest getServiceRequest3 = getServiceRequest;
        getServiceRequest3.f3639f = this.f3600s.getPackageName();
        getServiceRequest3.f3642p = F;
        if (set2 != null) {
            getServiceRequest3.f3641o = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (mo21648j()) {
            Account z = mo21658z();
            if (z == null) {
                z = new Account("<<default account>>", "com.google");
            }
            getServiceRequest3.f3643s = z;
            if (iAccountAccessor != null) {
                getServiceRequest3.f3640g = iAccountAccessor.asBinder();
            }
        } else if (mo21635T()) {
            getServiceRequest3.f3643s = mo21658z();
        }
        getServiceRequest3.f3644z = f3572V;
        getServiceRequest3.f3631A = mo21618A();
        if (mo21639X()) {
            getServiceRequest3.f3634D = true;
        }
        try {
            synchronized (this.f3577E) {
                IGmsServiceBroker iGmsServiceBroker = this.f3578F;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.mo21715P7(new zzd(this, this.f3592T.get()), getServiceRequest3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo21637V(3);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo21634S(8, (IBinder) null, (Bundle) null, this.f3592T.get());
        }
    }

    @KeepForSdk
    /* renamed from: n */
    public void mo21651n(@NonNull SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.mo21468a();
    }

    @KeepForSdk
    /* renamed from: o */
    public void mo21652o(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.f3576D) {
            i = this.f3583K;
            iInterface = this.f3580H;
        }
        synchronized (this.f3577E) {
            iGmsServiceBroker = this.f3578F;
        }
        printWriter.append(str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo21029J()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f3595d > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f3595d;
            String format = simpleDateFormat.format(new Date(j));
            append.println(j + " " + format);
        }
        if (this.f3594c > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.f3593a;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append(String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f3594c;
            String format2 = simpleDateFormat.format(new Date(j2));
            append2.println(j2 + " " + format2);
        }
        if (this.f3597g > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(CommonStatusCodes.m3624a(this.f3596f));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f3597g;
            String format3 = simpleDateFormat.format(new Date(j3));
            append3.println(j3 + " " + format3);
        }
    }

    @KeepForSdk
    /* renamed from: q */
    public int mo21032q() {
        return GoogleApiAvailabilityLight.f3062a;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: r */
    public final Feature[] mo21653r() {
        zzj zzj = this.f3591S;
        if (zzj == null) {
            return null;
        }
        return zzj.f3761c;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: t */
    public String mo21654t() {
        return this.f3598o;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: u */
    public Intent mo21034u() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @KeepForSdk
    /* renamed from: v */
    public void mo21655v() {
        int j = this.f3574B.mo21157j(this.f3600s, mo21032q());
        if (j != 0) {
            m4358n0(1, (IInterface) null);
            mo21638W(new LegacyClientCallbackAdapter(), j, (PendingIntent) null);
            return;
        }
        mo21646h(new LegacyClientCallbackAdapter());
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: w */
    public final void mo21656w() {
        if (!mo21641c()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    /* renamed from: x */
    public abstract T mo21035x(@NonNull IBinder iBinder);

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: y */
    public boolean mo21657y() {
        return false;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: z */
    public Account mo21658z() {
        return null;
    }

    @KeepForSdk
    @VisibleForTesting
    protected BaseGmsClient(@NonNull Context context, @NonNull Looper looper, @NonNull GmsClientSupervisor gmsClientSupervisor, @NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, @Nullable BaseConnectionCallbacks baseConnectionCallbacks, @Nullable BaseOnConnectionFailedListener baseOnConnectionFailedListener, @Nullable String str) {
        this.f3598o = null;
        this.f3576D = new Object();
        this.f3577E = new Object();
        this.f3581I = new ArrayList();
        this.f3583K = 1;
        this.f3589Q = null;
        this.f3590R = false;
        this.f3591S = null;
        this.f3592T = new AtomicInteger(0);
        Preconditions.m4489l(context, "Context must not be null");
        this.f3600s = context;
        Preconditions.m4489l(looper, "Looper must not be null");
        this.f3601z = looper;
        Preconditions.m4489l(gmsClientSupervisor, "Supervisor must not be null");
        this.f3573A = gmsClientSupervisor;
        Preconditions.m4489l(googleApiAvailabilityLight, "API availability must not be null");
        this.f3574B = googleApiAvailabilityLight;
        this.f3575C = new zzb(this, looper);
        this.f3586N = i;
        this.f3584L = baseConnectionCallbacks;
        this.f3585M = baseOnConnectionFailedListener;
        this.f3587O = str;
    }
}
