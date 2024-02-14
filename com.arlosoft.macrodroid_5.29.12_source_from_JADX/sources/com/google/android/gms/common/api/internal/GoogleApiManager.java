package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArraySet;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.zal;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class GoogleApiManager implements Handler.Callback {
    @NonNull

    /* renamed from: I */
    public static final Status f3177I = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: J */
    public static final Status f3178J = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: K */
    public static final Object f3179K = new Object();
    @Nullable

    /* renamed from: L */
    private static GoogleApiManager f3180L;

    /* renamed from: A */
    private final AtomicInteger f3181A = new AtomicInteger(1);

    /* renamed from: B */
    private final AtomicInteger f3182B = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final Map f3183C = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: D */
    public zaae f3184D = null;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final Set f3185E = new ArraySet();

    /* renamed from: F */
    private final Set f3186F = new ArraySet();
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final Handler f3187G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public volatile boolean f3188H = true;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public long f3189a = 5000;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f3190c = 120000;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f3191d = WorkRequest.MIN_BACKOFF_MILLIS;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f3192f = false;
    @Nullable

    /* renamed from: g */
    private TelemetryData f3193g;
    @Nullable

    /* renamed from: o */
    private TelemetryLoggingClient f3194o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Context f3195p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final GoogleApiAvailability f3196s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final zal f3197z;

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f3195p = context;
        zau zau = new zau(looper, this);
        this.f3187G = zau;
        this.f3196s = googleApiAvailability;
        this.f3197z = new zal(googleApiAvailability);
        if (DeviceProperties.m4875a(context)) {
            this.f3188H = false;
        }
        zau.sendMessage(zau.obtainMessage(6));
    }

    @KeepForSdk
    /* renamed from: a */
    public static void m3751a() {
        synchronized (f3179K) {
            GoogleApiManager googleApiManager = f3180L;
            if (googleApiManager != null) {
                googleApiManager.f3182B.incrementAndGet();
                Handler handler = googleApiManager.f3187G;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static Status m3753i(ApiKey apiKey, ConnectionResult connectionResult) {
        String b = apiKey.mo21304b();
        String valueOf = String.valueOf(connectionResult);
        return new Status(connectionResult, "API: " + b + " is not available on this device. Connection failed with: " + valueOf);
    }

    @WorkerThread
    /* renamed from: j */
    private final zabq m3754j(GoogleApi googleApi) {
        ApiKey v = googleApi.mo21236v();
        zabq zabq = (zabq) this.f3183C.get(v);
        if (zabq == null) {
            zabq = new zabq(this, googleApi);
            this.f3183C.put(v, zabq);
        }
        if (zabq.mo21480N()) {
            this.f3186F.add(v);
        }
        zabq.mo21470C();
        return zabq;
    }

    @WorkerThread
    /* renamed from: k */
    private final TelemetryLoggingClient m3755k() {
        if (this.f3194o == null) {
            this.f3194o = TelemetryLogging.m4507a(this.f3195p);
        }
        return this.f3194o;
    }

    @WorkerThread
    /* renamed from: l */
    private final void m3756l() {
        TelemetryData telemetryData = this.f3193g;
        if (telemetryData != null) {
            if (telemetryData.mo21731l2() > 0 || mo21351g()) {
                m3755k().mo21735a(telemetryData);
            }
            this.f3193g = null;
        }
    }

    /* renamed from: m */
    private final void m3757m(TaskCompletionSource taskCompletionSource, int i, GoogleApi googleApi) {
        zacd b;
        if (i != 0 && (b = zacd.m4161b(this, i, googleApi.mo21236v())) != null) {
            Task a = taskCompletionSource.mo56137a();
            Handler handler = this.f3187G;
            handler.getClass();
            a.mo23703d(new zabk(handler), b);
        }
    }

    @NonNull
    /* renamed from: y */
    public static GoogleApiManager m3767y(@NonNull Context context) {
        GoogleApiManager googleApiManager;
        synchronized (f3179K) {
            if (f3180L == null) {
                f3180L = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.m4445d().getLooper(), GoogleApiAvailability.m3521q());
            }
            googleApiManager = f3180L;
        }
        return googleApiManager;
    }

    @NonNull
    /* renamed from: A */
    public final Task mo21340A(@NonNull GoogleApi googleApi) {
        zaaf zaaf = new zaaf(googleApi.mo21236v());
        Handler handler = this.f3187G;
        handler.sendMessage(handler.obtainMessage(14, zaaf));
        return zaaf.mo21432b().mo56137a();
    }

    @NonNull
    /* renamed from: B */
    public final Task mo21341B(@NonNull GoogleApi googleApi, @NonNull RegisterListenerMethod registerListenerMethod, @NonNull UnregisterListenerMethod unregisterListenerMethod, @NonNull Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m3757m(taskCompletionSource, registerListenerMethod.mo21393e(), googleApi);
        zaf zaf = new zaf(new zaci(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource);
        Handler handler = this.f3187G;
        handler.sendMessage(handler.obtainMessage(8, new zach(zaf, this.f3182B.get(), googleApi)));
        return taskCompletionSource.mo56137a();
    }

    @NonNull
    /* renamed from: C */
    public final Task mo21342C(@NonNull GoogleApi googleApi, @NonNull ListenerHolder.ListenerKey listenerKey, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m3757m(taskCompletionSource, i, googleApi);
        zah zah = new zah(listenerKey, taskCompletionSource);
        Handler handler = this.f3187G;
        handler.sendMessage(handler.obtainMessage(13, new zach(zah, this.f3182B.get(), googleApi)));
        return taskCompletionSource.mo56137a();
    }

    /* renamed from: H */
    public final void mo21343H(@NonNull GoogleApi googleApi, int i, @NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zae zae = new zae(i, apiMethodImpl);
        Handler handler = this.f3187G;
        handler.sendMessage(handler.obtainMessage(4, new zach(zae, this.f3182B.get(), googleApi)));
    }

    /* renamed from: I */
    public final void mo21344I(@NonNull GoogleApi googleApi, int i, @NonNull TaskApiCall taskApiCall, @NonNull TaskCompletionSource taskCompletionSource, @NonNull StatusExceptionMapper statusExceptionMapper) {
        m3757m(taskCompletionSource, taskApiCall.mo21403f(), googleApi);
        zag zag = new zag(i, taskApiCall, taskCompletionSource, statusExceptionMapper);
        Handler handler = this.f3187G;
        handler.sendMessage(handler.obtainMessage(4, new zach(zag, this.f3182B.get(), googleApi)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo21345J(MethodInvocation methodInvocation, int i, long j, int i2) {
        Handler handler = this.f3187G;
        handler.sendMessage(handler.obtainMessage(18, new zace(methodInvocation, i, j, i2)));
    }

    /* renamed from: K */
    public final void mo21346K(@NonNull ConnectionResult connectionResult, int i) {
        if (!mo21352h(connectionResult, i)) {
            Handler handler = this.f3187G;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* renamed from: b */
    public final void mo21347b() {
        Handler handler = this.f3187G;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: c */
    public final void mo21348c(@NonNull GoogleApi googleApi) {
        Handler handler = this.f3187G;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    /* renamed from: d */
    public final void mo21349d(@NonNull zaae zaae) {
        synchronized (f3179K) {
            if (this.f3184D != zaae) {
                this.f3184D = zaae;
                this.f3185E.clear();
            }
            this.f3185E.addAll(zaae.mo21430t());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo21350e(@NonNull zaae zaae) {
        synchronized (f3179K) {
            if (this.f3184D == zaae) {
                this.f3184D = null;
                this.f3185E.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: g */
    public final boolean mo21351g() {
        if (this.f3192f) {
            return false;
        }
        RootTelemetryConfiguration a = RootTelemetryConfigManager.m4496b().mo21722a();
        if (a != null && !a.mo21727n2()) {
            return false;
        }
        int a2 = this.f3197z.mo21762a(this.f3195p, 203400000);
        if (a2 == -1 || a2 == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo21352h(ConnectionResult connectionResult, int i) {
        return this.f3196s.mo21152C(this.f3195p, connectionResult, i);
    }

    @WorkerThread
    public final boolean handleMessage(@NonNull Message message) {
        int i = message.what;
        long j = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        zabq zabq = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = WorkRequest.MIN_BACKOFF_MILLIS;
                }
                this.f3191d = j;
                this.f3187G.removeMessages(12);
                for (ApiKey obtainMessage : this.f3183C.keySet()) {
                    Handler handler = this.f3187G;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f3191d);
                }
                break;
            case 2:
                zal zal = (zal) message.obj;
                Iterator it = zal.mo21521a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        ApiKey apiKey = (ApiKey) it.next();
                        zabq zabq2 = (zabq) this.f3183C.get(apiKey);
                        if (zabq2 == null) {
                            zal.mo21522b(apiKey, new ConnectionResult(13), (String) null);
                            break;
                        } else if (zabq2.mo21479M()) {
                            zal.mo21522b(apiKey, ConnectionResult.f3044g, zabq2.mo21485s().mo21199g());
                        } else {
                            ConnectionResult q = zabq2.mo21484q();
                            if (q != null) {
                                zal.mo21522b(apiKey, q, (String) null);
                            } else {
                                zabq2.mo21475H(zal);
                                zabq2.mo21470C();
                            }
                        }
                    }
                }
            case 3:
                for (zabq zabq3 : this.f3183C.values()) {
                    zabq3.mo21469B();
                    zabq3.mo21470C();
                }
                break;
            case 4:
            case 8:
            case 13:
                zach zach = (zach) message.obj;
                zabq zabq4 = (zabq) this.f3183C.get(zach.f3414c.mo21236v());
                if (zabq4 == null) {
                    zabq4 = m3754j(zach.f3414c);
                }
                if (zabq4.mo21480N() && this.f3182B.get() != zach.f3413b) {
                    zach.f3412a.mo21510a(f3177I);
                    zabq4.mo21477J();
                    break;
                } else {
                    zabq4.mo21471D(zach.f3412a);
                    break;
                }
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.f3183C.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zabq zabq5 = (zabq) it2.next();
                        if (zabq5.mo21482o() == i2) {
                            zabq = zabq5;
                        }
                    }
                }
                if (zabq != null) {
                    if (connectionResult.mo21133l2() != 13) {
                        zabq.m4083d(m3753i(zabq.f3377d, connectionResult));
                        break;
                    } else {
                        String g = this.f3196s.mo21155g(connectionResult.mo21133l2());
                        String m2 = connectionResult.mo21134m2();
                        zabq.m4083d(new Status(17, "Error resolution was canceled by the user, original error message: " + g + ": " + m2));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i2 + " while trying to fail enqueued calls.", new Exception());
                    break;
                }
            case 6:
                if (this.f3195p.getApplicationContext() instanceof Application) {
                    BackgroundDetector.m3708c((Application) this.f3195p.getApplicationContext());
                    BackgroundDetector.m3707b().mo21307a(new zabl(this));
                    if (!BackgroundDetector.m3707b().mo21309e(true)) {
                        this.f3191d = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
                        break;
                    }
                }
                break;
            case 7:
                m3754j((GoogleApi) message.obj);
                break;
            case 9:
                if (this.f3183C.containsKey(message.obj)) {
                    ((zabq) this.f3183C.get(message.obj)).mo21476I();
                    break;
                }
                break;
            case 10:
                for (ApiKey remove : this.f3186F) {
                    zabq zabq6 = (zabq) this.f3183C.remove(remove);
                    if (zabq6 != null) {
                        zabq6.mo21477J();
                    }
                }
                this.f3186F.clear();
                break;
            case 11:
                if (this.f3183C.containsKey(message.obj)) {
                    ((zabq) this.f3183C.get(message.obj)).mo21478K();
                    break;
                }
                break;
            case 12:
                if (this.f3183C.containsKey(message.obj)) {
                    ((zabq) this.f3183C.get(message.obj)).mo21481a();
                    break;
                }
                break;
            case 14:
                zaaf zaaf = (zaaf) message.obj;
                ApiKey a = zaaf.mo21431a();
                if (this.f3183C.containsKey(a)) {
                    zaaf.mo21432b().mo56139c(Boolean.valueOf(((zabq) this.f3183C.get(a)).m4093n(false)));
                    break;
                } else {
                    zaaf.mo21432b().mo56139c(Boolean.FALSE);
                    break;
                }
            case 15:
                zabs zabs = (zabs) message.obj;
                if (this.f3183C.containsKey(zabs.f3384a)) {
                    zabq.m4099z((zabq) this.f3183C.get(zabs.f3384a), zabs);
                    break;
                }
                break;
            case 16:
                zabs zabs2 = (zabs) message.obj;
                if (this.f3183C.containsKey(zabs2.f3384a)) {
                    zabq.m4079A((zabq) this.f3183C.get(zabs2.f3384a), zabs2);
                    break;
                }
                break;
            case 17:
                m3756l();
                break;
            case 18:
                zace zace = (zace) message.obj;
                if (zace.f3407c != 0) {
                    TelemetryData telemetryData = this.f3193g;
                    if (telemetryData != null) {
                        List m22 = telemetryData.mo21732m2();
                        if (telemetryData.mo21731l2() != zace.f3406b || (m22 != null && m22.size() >= zace.f3408d)) {
                            this.f3187G.removeMessages(17);
                            m3756l();
                        } else {
                            this.f3193g.mo21733n2(zace.f3405a);
                        }
                    }
                    if (this.f3193g == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zace.f3405a);
                        this.f3193g = new TelemetryData(zace.f3406b, arrayList);
                        Handler handler2 = this.f3187G;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zace.f3407c);
                        break;
                    }
                } else {
                    m3755k().mo21735a(new TelemetryData(zace.f3406b, Arrays.asList(new MethodInvocation[]{zace.f3405a})));
                    break;
                }
                break;
            case 19:
                this.f3192f = false;
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
        return true;
    }

    /* renamed from: n */
    public final int mo21354n() {
        return this.f3181A.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: x */
    public final zabq mo21355x(ApiKey apiKey) {
        return (zabq) this.f3183C.get(apiKey);
    }
}
