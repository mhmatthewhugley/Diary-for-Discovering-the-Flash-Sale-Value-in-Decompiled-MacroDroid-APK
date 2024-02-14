package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.p007os.UserManagerCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.tracing.ComponentMonitor;
import com.google.firebase.tracing.FirebaseTrace;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class FirebaseApp {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Object f53735k = new Object();

    /* renamed from: l */
    private static final Executor f53736l = new UiExecutor();
    @GuardedBy("LOCK")

    /* renamed from: m */
    static final Map<String, FirebaseApp> f53737m = new ArrayMap();

    /* renamed from: a */
    private final Context f53738a;

    /* renamed from: b */
    private final String f53739b;

    /* renamed from: c */
    private final FirebaseOptions f53740c;

    /* renamed from: d */
    private final ComponentRuntime f53741d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f53742e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f53743f = new AtomicBoolean();

    /* renamed from: g */
    private final Lazy<DataCollectionConfigStorage> f53744g;

    /* renamed from: h */
    private final Provider<DefaultHeartBeatController> f53745h;

    /* renamed from: i */
    private final List<BackgroundStateChangeListener> f53746i = new CopyOnWriteArrayList();

    /* renamed from: j */
    private final List<FirebaseAppLifecycleListener> f53747j = new CopyOnWriteArrayList();

    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        /* renamed from: a */
        void mo61957a(boolean z);
    }

    private static class GlobalBackgroundStateListener implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a */
        private static AtomicReference<GlobalBackgroundStateListener> f53748a = new AtomicReference<>();

        private GlobalBackgroundStateListener() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static void m74403c(Context context) {
            if (PlatformVersion.m4896a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f53748a.get() == null) {
                    GlobalBackgroundStateListener globalBackgroundStateListener = new GlobalBackgroundStateListener();
                    if (f53748a.compareAndSet((Object) null, globalBackgroundStateListener)) {
                        BackgroundDetector.m3708c(application);
                        BackgroundDetector.m3707b().mo21307a(globalBackgroundStateListener);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo21320a(boolean z) {
            synchronized (FirebaseApp.f53735k) {
                Iterator it = new ArrayList(FirebaseApp.f53737m.values()).iterator();
                while (it.hasNext()) {
                    FirebaseApp firebaseApp = (FirebaseApp) it.next();
                    if (firebaseApp.f53742e.get()) {
                        firebaseApp.m74374A(z);
                    }
                }
            }
        }
    }

    private static class UiExecutor implements Executor {

        /* renamed from: a */
        private static final Handler f53749a = new Handler(Looper.getMainLooper());

        private UiExecutor() {
        }

        public void execute(@NonNull Runnable runnable) {
            f53749a.post(runnable);
        }
    }

    private static class UserUnlockReceiver extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<UserUnlockReceiver> f53750b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f53751a;

        public UserUnlockReceiver(Context context) {
            this.f53751a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m74406b(Context context) {
            if (f53750b.get() == null) {
                UserUnlockReceiver userUnlockReceiver = new UserUnlockReceiver(context);
                if (f53750b.compareAndSet((Object) null, userUnlockReceiver)) {
                    context.registerReceiver(userUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void mo61959c() {
            this.f53751a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.f53735k) {
                for (FirebaseApp d : FirebaseApp.f53737m.values()) {
                    d.m74385r();
                }
            }
            mo61959c();
        }
    }

    protected FirebaseApp(Context context, String str, FirebaseOptions firebaseOptions) {
        this.f53738a = (Context) Preconditions.m4488k(context);
        this.f53739b = Preconditions.m4484g(str);
        this.f53740c = (FirebaseOptions) Preconditions.m4488k(firebaseOptions);
        FirebaseTrace.m77683b("Firebase");
        FirebaseTrace.m77683b("ComponentDiscovery");
        List<Provider<ComponentRegistrar>> b = ComponentDiscovery.m6375c(context, ComponentDiscoveryService.class).mo22889b();
        FirebaseTrace.m77682a();
        FirebaseTrace.m77683b("Runtime");
        ComponentRuntime e = ComponentRuntime.m6388i(f53736l).mo22897d(b).mo22896c(new FirebaseCommonRegistrar()).mo22895b(Component.m6349q(context, Context.class, new Class[0])).mo22895b(Component.m6349q(this, FirebaseApp.class, new Class[0])).mo22895b(Component.m6349q(firebaseOptions, FirebaseOptions.class, new Class[0])).mo22899g(new ComponentMonitor()).mo22898e();
        this.f53741d = e;
        FirebaseTrace.m77682a();
        this.f53744g = new Lazy<>(new C11053b(this, context));
        this.f53745h = e.mo22887d(DefaultHeartBeatController.class);
        mo61946g(new C11040a(this));
        FirebaseTrace.m77682a();
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m74374A(boolean z) {
        for (BackgroundStateChangeListener a : this.f53746i) {
            a.mo61957a(z);
        }
    }

    /* renamed from: i */
    private void m74381i() {
        Preconditions.m4494q(!this.f53743f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: k */
    private static List<String> m74382k() {
        ArrayList arrayList = new ArrayList();
        synchronized (f53735k) {
            for (FirebaseApp o : f53737m.values()) {
                arrayList.add(o.mo61951o());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @NonNull
    /* renamed from: m */
    public static FirebaseApp m74383m() {
        FirebaseApp firebaseApp;
        synchronized (f53735k) {
            firebaseApp = f53737m.get("[DEFAULT]");
            if (firebaseApp == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.m4909a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return firebaseApp;
    }

    @NonNull
    /* renamed from: n */
    public static FirebaseApp m74384n(@NonNull String str) {
        FirebaseApp firebaseApp;
        String str2;
        synchronized (f53735k) {
            firebaseApp = f53737m.get(m74391z(str));
            if (firebaseApp != null) {
                firebaseApp.f53745h.get().mo63203n();
            } else {
                List<String> k = m74382k();
                if (k.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", k);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return firebaseApp;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m74385r() {
        if (!UserManagerCompat.isUserUnlocked(this.f53738a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + mo61951o());
            UserUnlockReceiver.m74406b(this.f53738a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + mo61951o());
        this.f53741d.mo22894l(mo61956w());
        this.f53745h.get().mo63203n();
    }

    @Nullable
    /* renamed from: s */
    public static FirebaseApp m74386s(@NonNull Context context) {
        synchronized (f53735k) {
            if (f53737m.containsKey("[DEFAULT]")) {
                FirebaseApp m = m74383m();
                return m;
            }
            FirebaseOptions a = FirebaseOptions.m74418a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            FirebaseApp t = m74387t(context, a);
            return t;
        }
    }

    @NonNull
    /* renamed from: t */
    public static FirebaseApp m74387t(@NonNull Context context, @NonNull FirebaseOptions firebaseOptions) {
        return m74388u(context, firebaseOptions, "[DEFAULT]");
    }

    @NonNull
    /* renamed from: u */
    public static FirebaseApp m74388u(@NonNull Context context, @NonNull FirebaseOptions firebaseOptions, @NonNull String str) {
        FirebaseApp firebaseApp;
        GlobalBackgroundStateListener.m74403c(context);
        String z = m74391z(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f53735k) {
            Map<String, FirebaseApp> map = f53737m;
            boolean z2 = !map.containsKey(z);
            Preconditions.m4494q(z2, "FirebaseApp name " + z + " already exists!");
            Preconditions.m4489l(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, z, firebaseOptions);
            map.put(z, firebaseApp);
        }
        firebaseApp.m74385r();
        return firebaseApp;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ DataCollectionConfigStorage m74389x(Context context) {
        return new DataCollectionConfigStorage(context, mo61953q(), (Publisher) this.f53741d.mo22868a(Publisher.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m74390y(boolean z) {
        if (!z) {
            this.f53745h.get().mo63203n();
        }
    }

    /* renamed from: z */
    private static String m74391z(@NonNull String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        return this.f53739b.equals(((FirebaseApp) obj).mo61951o());
    }

    @KeepForSdk
    /* renamed from: g */
    public void mo61946g(BackgroundStateChangeListener backgroundStateChangeListener) {
        m74381i();
        if (this.f53742e.get() && BackgroundDetector.m3707b().mo21308d()) {
            backgroundStateChangeListener.mo61957a(true);
        }
        this.f53746i.add(backgroundStateChangeListener);
    }

    @KeepForSdk
    /* renamed from: h */
    public void mo61947h(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        m74381i();
        Preconditions.m4488k(firebaseAppLifecycleListener);
        this.f53747j.add(firebaseAppLifecycleListener);
    }

    public int hashCode() {
        return this.f53739b.hashCode();
    }

    @KeepForSdk
    /* renamed from: j */
    public <T> T mo61949j(Class<T> cls) {
        m74381i();
        return this.f53741d.mo22868a(cls);
    }

    @NonNull
    /* renamed from: l */
    public Context mo61950l() {
        m74381i();
        return this.f53738a;
    }

    @NonNull
    /* renamed from: o */
    public String mo61951o() {
        m74381i();
        return this.f53739b;
    }

    @NonNull
    /* renamed from: p */
    public FirebaseOptions mo61952p() {
        m74381i();
        return this.f53740c;
    }

    @KeepForSdk
    /* renamed from: q */
    public String mo61953q() {
        return Base64Utils.m4855e(mo61951o().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.m4855e(mo61952p().mo61962c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return Objects.m4472c(this).mo21720a("name", this.f53739b).mo21720a("options", this.f53740c).toString();
    }

    @KeepForSdk
    /* renamed from: v */
    public boolean mo61955v() {
        m74381i();
        return this.f53744g.get().mo63312b();
    }

    @VisibleForTesting
    @KeepForSdk
    /* renamed from: w */
    public boolean mo61956w() {
        return "[DEFAULT]".equals(mo61951o());
    }
}
