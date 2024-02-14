package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

class CrashlyticsController {

    /* renamed from: s */
    static final FilenameFilter f4907s = C1870a.f5034a;

    /* renamed from: a */
    private final Context f4908a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final DataCollectionArbiter f4909b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final CrashlyticsFileMarker f4910c;

    /* renamed from: d */
    private final UserMetadata f4911d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final CrashlyticsBackgroundWorker f4912e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final IdManager f4913f;

    /* renamed from: g */
    private final FileStore f4914g;

    /* renamed from: h */
    private final AppData f4915h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final LogFileManager f4916i;

    /* renamed from: j */
    private final CrashlyticsNativeComponent f4917j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final AnalyticsEventLogger f4918k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final SessionReportingCoordinator f4919l;

    /* renamed from: m */
    private CrashlyticsUncaughtExceptionHandler f4920m;

    /* renamed from: n */
    private SettingsProvider f4921n = null;

    /* renamed from: o */
    final TaskCompletionSource<Boolean> f4922o = new TaskCompletionSource<>();

    /* renamed from: p */
    final TaskCompletionSource<Boolean> f4923p = new TaskCompletionSource<>();

    /* renamed from: q */
    final TaskCompletionSource<Void> f4924q = new TaskCompletionSource<>();

    /* renamed from: r */
    final AtomicBoolean f4925r = new AtomicBoolean(false);

    CrashlyticsController(Context context, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger) {
        this.f4908a = context;
        this.f4912e = crashlyticsBackgroundWorker;
        this.f4913f = idManager;
        this.f4909b = dataCollectionArbiter;
        this.f4914g = fileStore;
        this.f4910c = crashlyticsFileMarker;
        this.f4915h = appData;
        this.f4911d = userMetadata;
        this.f4916i = logFileManager;
        this.f4917j = crashlyticsNativeComponent;
        this.f4918k = analyticsEventLogger;
        this.f4919l = sessionReportingCoordinator;
    }

    /* renamed from: A */
    private static boolean m6618A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    @Nullable
    /* renamed from: B */
    public String m6619B() {
        SortedSet<String> n = this.f4919l.mo23062n();
        if (!n.isEmpty()) {
            return n.first();
        }
        return null;
    }

    /* renamed from: C */
    private static long m6620C() {
        return m6622E(System.currentTimeMillis());
    }

    @NonNull
    /* renamed from: D */
    static List<NativeSessionFile> m6621D(NativeSessionFileProvider nativeSessionFileProvider, String str, FileStore fileStore, byte[] bArr) {
        File o = fileStore.mo23510o(str, "user-data");
        File o2 = fileStore.mo23510o(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BytesBackedNativeSessionFile("logs_file", "logs", bArr));
        arrayList.add(new FileBackedNativeSessionFile("crash_meta_file", "metadata", nativeSessionFileProvider.mo22948c()));
        arrayList.add(new FileBackedNativeSessionFile("session_meta_file", "session", nativeSessionFileProvider.mo22951f()));
        arrayList.add(new FileBackedNativeSessionFile("app_meta_file", "app", nativeSessionFileProvider.mo22949d()));
        arrayList.add(new FileBackedNativeSessionFile("device_meta_file", "device", nativeSessionFileProvider.mo22946a()));
        arrayList.add(new FileBackedNativeSessionFile("os_meta_file", "os", nativeSessionFileProvider.mo22950e()));
        arrayList.add(new FileBackedNativeSessionFile("minidump_file", "minidump", nativeSessionFileProvider.mo22947b()));
        arrayList.add(new FileBackedNativeSessionFile("user_meta_file", "user", o));
        arrayList.add(new FileBackedNativeSessionFile("keys_file", "keys", o2));
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static long m6622E(long j) {
        return j / 1000;
    }

    /* renamed from: K */
    private Task<Void> m6624K(final long j) {
        if (m6618A()) {
            Logger.m6525f().mo22962k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.m66667f(null);
        }
        Logger.m6525f().mo22954b("Logging app exception event to Firebase Analytics");
        return Tasks.m66664c(new ScheduledThreadPoolExecutor(1), new Callable<Void>() {
            /* renamed from: a */
            public Void call() throws Exception {
                Bundle bundle = new Bundle();
                bundle.putInt("fatal", 1);
                bundle.putLong("timestamp", j);
                CrashlyticsController.this.f4918k.mo22940a("_ae", bundle);
                return null;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public Task<Void> m6625L() {
        ArrayList arrayList = new ArrayList();
        for (File next : mo22992J()) {
            try {
                arrayList.add(m6624K(Long.parseLong(next.getName().substring(3))));
            } catch (NumberFormatException unused) {
                Logger f = Logger.m6525f();
                f.mo22962k("Could not parse app exception timestamp from file " + next.getName());
            }
            next.delete();
        }
        return Tasks.m66668g(arrayList);
    }

    /* renamed from: P */
    private Task<Boolean> m6626P() {
        if (this.f4909b.mo23043d()) {
            Logger.m6525f().mo22954b("Automatic data collection is enabled. Allowing upload.");
            this.f4922o.mo56141e(Boolean.FALSE);
            return Tasks.m66667f(Boolean.TRUE);
        }
        Logger.m6525f().mo22954b("Automatic data collection is disabled.");
        Logger.m6525f().mo22960i("Notifying that unsent reports are available.");
        this.f4922o.mo56141e(Boolean.TRUE);
        Task<TContinuationResult> u = this.f4909b.mo23044g().mo23720u(new SuccessContinuation<Void, Boolean>() {
            @NonNull
            /* renamed from: b */
            public Task<Boolean> mo21121a(@Nullable Void voidR) throws Exception {
                return Tasks.m66667f(Boolean.TRUE);
            }
        });
        Logger.m6525f().mo22954b("Waiting for send/deleteUnsentReports to be called.");
        return Utils.m6810j(u, this.f4923p.mo56137a());
    }

    /* renamed from: Q */
    private void m6627Q(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            List historicalProcessExitReasons = ((ActivityManager) this.f4908a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f4919l.mo23066t(str, historicalProcessExitReasons, new LogFileManager(this.f4914g, str), UserMetadata.m6890f(str, this.f4914g, this.f4912e));
                return;
            }
            Logger f = Logger.m6525f();
            f.mo22960i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        Logger f2 = Logger.m6525f();
        f2.mo22960i("ANR feature enabled, but device is API " + i);
    }

    /* renamed from: o */
    private static StaticSessionData.AppData m6642o(IdManager idManager, AppData appData) {
        return StaticSessionData.AppData.m7430b(idManager.mo23050f(), appData.f4870e, appData.f4871f, idManager.mo23049a(), DeliveryMechanism.m6740b(appData.f4868c).mo23046d(), appData.f4872g);
    }

    /* renamed from: p */
    private static StaticSessionData.DeviceData m6643p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return StaticSessionData.DeviceData.m7437c(CommonUtils.m6589l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.m6596s(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), CommonUtils.m6601x(), CommonUtils.m6590m(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: q */
    private static StaticSessionData.OsData m6644q() {
        return StaticSessionData.OsData.m7447a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.m6602y());
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static void m6645r(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6646u(boolean r4, com.google.firebase.crashlytics.internal.settings.SettingsProvider r5) {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r1 = r3.f4919l
            java.util.SortedSet r1 = r1.mo23062n()
            r0.<init>(r1)
            int r1 = r0.size()
            if (r1 > r4) goto L_0x001b
            com.google.firebase.crashlytics.internal.Logger r4 = com.google.firebase.crashlytics.internal.Logger.m6525f()
            java.lang.String r5 = "No open sessions to be closed."
            r4.mo22960i(r5)
            return
        L_0x001b:
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            com.google.firebase.crashlytics.internal.settings.Settings r5 = r5.mo23526b()
            com.google.firebase.crashlytics.internal.settings.Settings$FeatureFlagData r5 = r5.f5481b
            boolean r5 = r5.f5489b
            if (r5 == 0) goto L_0x002f
            r3.m6627Q(r1)
            goto L_0x0038
        L_0x002f:
            com.google.firebase.crashlytics.internal.Logger r5 = com.google.firebase.crashlytics.internal.Logger.m6525f()
            java.lang.String r2 = "ANR feature disabled."
            r5.mo22960i(r2)
        L_0x0038:
            com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent r5 = r3.f4917j
            boolean r5 = r5.mo22945d(r1)
            if (r5 == 0) goto L_0x0043
            r3.m6649y(r1)
        L_0x0043:
            r5 = 0
            if (r4 == 0) goto L_0x004e
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
        L_0x004e:
            com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator r4 = r3.f4919l
            long r0 = m6620C()
            r4.mo23060i(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CrashlyticsController.m6646u(boolean, com.google.firebase.crashlytics.internal.settings.SettingsProvider):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m6647v(String str) {
        long C = m6620C();
        Logger f = Logger.m6525f();
        f.mo22954b("Opening a new session with ID " + str);
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{CrashlyticsCore.m6683i()});
        StaticSessionData.AppData o = m6642o(this.f4913f, this.f4915h);
        StaticSessionData.OsData q = m6644q();
        StaticSessionData.DeviceData p = m6643p();
        this.f4917j.mo22944c(str, format, C, StaticSessionData.m7426b(o, q, p));
        this.f4916i.mo23084e(str);
        this.f4919l.mo23063o(str, C);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m6648w(long j) {
        try {
            FileStore fileStore = this.f4914g;
            if (!fileStore.mo23501e(".ae" + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Logger.m6525f().mo22963l("Could not create app exception marker file.", e);
        }
    }

    /* renamed from: y */
    private void m6649y(String str) {
        Logger f = Logger.m6525f();
        f.mo22960i("Finalizing native report for session " + str);
        NativeSessionFileProvider a = this.f4917j.mo22942a(str);
        File b = a.mo22947b();
        if (b == null || !b.exists()) {
            Logger f2 = Logger.m6525f();
            f2.mo22962k("No minidump data found for session " + str);
            return;
        }
        long lastModified = b.lastModified();
        LogFileManager logFileManager = new LogFileManager(this.f4914g, str);
        File i = this.f4914g.mo23505i(str);
        if (!i.isDirectory()) {
            Logger.m6525f().mo22962k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        m6648w(lastModified);
        List<NativeSessionFile> D = m6621D(a, str, this.f4914g, logFileManager.mo23082b());
        NativeSessionFileGzipper.m6773b(i, D);
        Logger.m6525f().mo22954b("CrashlyticsController#finalizePreviousNativeSession");
        this.f4919l.mo23059h(str, D);
        logFileManager.mo23081a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo22989F(@NonNull SettingsProvider settingsProvider, @NonNull Thread thread, @NonNull Throwable th) {
        mo22990G(settingsProvider, thread, th, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public synchronized void mo22990G(@NonNull SettingsProvider settingsProvider, @NonNull Thread thread, @NonNull Throwable th, boolean z) {
        Logger f = Logger.m6525f();
        f.mo22954b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        final long currentTimeMillis = System.currentTimeMillis();
        final Throwable th2 = th;
        final Thread thread2 = thread;
        final SettingsProvider settingsProvider2 = settingsProvider;
        final boolean z2 = z;
        try {
            Utils.m6804d(this.f4912e.mo22984i(new Callable<Task<Void>>() {
                /* renamed from: a */
                public Task<Void> call() throws Exception {
                    long b = CrashlyticsController.m6622E(currentTimeMillis);
                    final String c = CrashlyticsController.this.m6619B();
                    if (c == null) {
                        Logger.m6525f().mo22956d("Tried to write a fatal exception while no session was open.");
                        return Tasks.m66667f(null);
                    }
                    CrashlyticsController.this.f4910c.mo23033a();
                    CrashlyticsController.this.f4919l.mo23064r(th2, thread2, c, b);
                    CrashlyticsController.this.m6648w(currentTimeMillis);
                    CrashlyticsController.this.mo22999t(settingsProvider2);
                    CrashlyticsController.this.m6647v(new CLSUUID(CrashlyticsController.this.f4913f).toString());
                    if (!CrashlyticsController.this.f4909b.mo23043d()) {
                        return Tasks.m66667f(null);
                    }
                    final Executor c2 = CrashlyticsController.this.f4912e.mo22981c();
                    return settingsProvider2.mo23525a().mo23721v(c2, new SuccessContinuation<Settings, Void>() {
                        @NonNull
                        /* renamed from: b */
                        public Task<Void> mo21121a(@Nullable Settings settings) throws Exception {
                            String str = null;
                            if (settings == null) {
                                Logger.m6525f().mo22962k("Received null app settings, cannot send reports at crash time.");
                                return Tasks.m66667f(null);
                            }
                            Task[] taskArr = new Task[2];
                            taskArr[0] = CrashlyticsController.this.m6625L();
                            SessionReportingCoordinator h = CrashlyticsController.this.f4919l;
                            Executor executor = c2;
                            if (z2) {
                                str = c;
                            }
                            taskArr[1] = h.mo23069w(executor, str);
                            return Tasks.m66669h(taskArr);
                        }
                    });
                }
            }));
        } catch (TimeoutException unused) {
            Logger.m6525f().mo22956d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e) {
            Logger.m6525f().mo22957e("Error handling uncaught exception", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo22991H() {
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.f4920m;
        return crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.mo23039a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public List<File> mo22992J() {
        return this.f4914g.mo23502f(f4907s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo22993M(final String str) {
        this.f4912e.mo22983h(new Callable<Void>() {
            /* renamed from: a */
            public Void call() throws Exception {
                CrashlyticsController.this.m6647v(str);
                return null;
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo22994N(String str) {
        this.f4911d.mo23109i(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public Task<Void> mo22995O(final Task<Settings> task) {
        if (!this.f4919l.mo23061l()) {
            Logger.m6525f().mo22960i("No crash reports are available to be sent.");
            this.f4922o.mo56141e(Boolean.FALSE);
            return Tasks.m66667f(null);
        }
        Logger.m6525f().mo22960i("Crash reports are available to be sent.");
        return m6626P().mo23720u(new SuccessContinuation<Boolean, Void>() {
            @NonNull
            /* renamed from: b */
            public Task<Void> mo21121a(@Nullable final Boolean bool) throws Exception {
                return CrashlyticsController.this.f4912e.mo22984i(new Callable<Task<Void>>() {
                    /* renamed from: a */
                    public Task<Void> call() throws Exception {
                        if (!bool.booleanValue()) {
                            Logger.m6525f().mo22960i("Deleting cached crash reports...");
                            CrashlyticsController.m6645r(CrashlyticsController.this.mo22992J());
                            CrashlyticsController.this.f4919l.mo23067u();
                            CrashlyticsController.this.f4924q.mo56141e(null);
                            return Tasks.m66667f(null);
                        }
                        Logger.m6525f().mo22954b("Sending cached crash reports...");
                        CrashlyticsController.this.f4909b.mo23042c(bool.booleanValue());
                        final Executor c = CrashlyticsController.this.f4912e.mo22981c();
                        return task.mo23721v(c, new SuccessContinuation<Settings, Void>() {
                            @NonNull
                            /* renamed from: b */
                            public Task<Void> mo21121a(@Nullable Settings settings) throws Exception {
                                if (settings == null) {
                                    Logger.m6525f().mo22962k("Received null app settings at app startup. Cannot send cached reports");
                                    return Tasks.m66667f(null);
                                }
                                Task unused = CrashlyticsController.this.m6625L();
                                CrashlyticsController.this.f4919l.mo23068v(c);
                                CrashlyticsController.this.f4924q.mo56141e(null);
                                return Tasks.m66667f(null);
                            }
                        });
                    }
                });
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo22996R(@NonNull Thread thread, @NonNull Throwable th) {
        final long currentTimeMillis = System.currentTimeMillis();
        final Throwable th2 = th;
        final Thread thread2 = thread;
        this.f4912e.mo22982g(new Runnable() {
            public void run() {
                if (!CrashlyticsController.this.mo22991H()) {
                    long b = CrashlyticsController.m6622E(currentTimeMillis);
                    String c = CrashlyticsController.this.m6619B();
                    if (c == null) {
                        Logger.m6525f().mo22962k("Tried to write a non-fatal exception while no session was open.");
                    } else {
                        CrashlyticsController.this.f4919l.mo23065s(th2, thread2, c, b);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo22997S(final long j, final String str) {
        this.f4912e.mo22983h(new Callable<Void>() {
            /* renamed from: a */
            public Void call() throws Exception {
                if (CrashlyticsController.this.mo22991H()) {
                    return null;
                }
                CrashlyticsController.this.f4916i.mo23086g(j, str);
                return null;
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo22998s() {
        if (!this.f4910c.mo23034c()) {
            String B = m6619B();
            if (B == null || !this.f4917j.mo22945d(B)) {
                return false;
            }
            return true;
        }
        Logger.m6525f().mo22960i("Found previous crash marker.");
        this.f4910c.mo23035d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo22999t(SettingsProvider settingsProvider) {
        m6646u(false, settingsProvider);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo23000x(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsProvider settingsProvider) {
        this.f4921n = settingsProvider;
        mo22993M(str);
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() {
            /* renamed from: a */
            public void mo23002a(@NonNull SettingsProvider settingsProvider, @NonNull Thread thread, @NonNull Throwable th) {
                CrashlyticsController.this.mo22989F(settingsProvider, thread, th);
            }
        }, settingsProvider, uncaughtExceptionHandler, this.f4917j);
        this.f4920m = crashlyticsUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo23001z(SettingsProvider settingsProvider) {
        this.f4912e.mo22980b();
        if (mo22991H()) {
            Logger.m6525f().mo22962k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Logger.m6525f().mo22960i("Finalizing previously open sessions.");
        try {
            m6646u(true, settingsProvider);
            Logger.m6525f().mo22960i("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            Logger.m6525f().mo22957e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }
}
