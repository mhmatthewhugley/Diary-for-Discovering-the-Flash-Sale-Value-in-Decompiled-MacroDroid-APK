package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

public class SessionReportingCoordinator implements CrashlyticsLifecycleEvents {

    /* renamed from: a */
    private final CrashlyticsReportDataCapture f5025a;

    /* renamed from: b */
    private final CrashlyticsReportPersistence f5026b;

    /* renamed from: c */
    private final DataTransportCrashlyticsReportSender f5027c;

    /* renamed from: d */
    private final LogFileManager f5028d;

    /* renamed from: e */
    private final UserMetadata f5029e;

    SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, LogFileManager logFileManager, UserMetadata userMetadata) {
        this.f5025a = crashlyticsReportDataCapture;
        this.f5026b = crashlyticsReportPersistence;
        this.f5027c = dataTransportCrashlyticsReportSender;
        this.f5028d = logFileManager;
        this.f5029e = userMetadata;
    }

    /* renamed from: c */
    private CrashlyticsReport.Session.Event m6779c(CrashlyticsReport.Session.Event event) {
        return m6780d(event, this.f5028d, this.f5029e);
    }

    /* renamed from: d */
    private CrashlyticsReport.Session.Event m6780d(CrashlyticsReport.Session.Event event, LogFileManager logFileManager, UserMetadata userMetadata) {
        CrashlyticsReport.Session.Event.Builder g = event.mo23274g();
        String c = logFileManager.mo23083c();
        if (c != null) {
            g.mo23280d(CrashlyticsReport.Session.Event.Log.m7406a().mo23393b(c).mo23392a());
        } else {
            Logger.m6525f().mo22960i("No log data to include with this event.");
        }
        List<CrashlyticsReport.CustomAttribute> k = m6785k(userMetadata.mo23106b());
        List<CrashlyticsReport.CustomAttribute> k2 = m6785k(userMetadata.mo23107c());
        if (!k.isEmpty() || !k2.isEmpty()) {
            g.mo23278b(event.mo23268b().mo23289g().mo23294c(ImmutableList.m7424c(k)).mo23296e(ImmutableList.m7424c(k2)).mo23292a());
        }
        return g.mo23277a();
    }

    @RequiresApi(api = 30)
    /* renamed from: e */
    private static CrashlyticsReport.ApplicationExitInfo m6781e(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = m6782f(traceInputStream);
            }
        } catch (IOException e) {
            Logger f = Logger.m6525f();
            f.mo22962k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        return CrashlyticsReport.ApplicationExitInfo.m7192a().mo23166b(applicationExitInfo.getImportance()).mo23168d(applicationExitInfo.getProcessName()).mo23170f(applicationExitInfo.getReason()).mo23172h(applicationExitInfo.getTimestamp()).mo23167c(applicationExitInfo.getPid()).mo23169e(applicationExitInfo.getPss()).mo23171g(applicationExitInfo.getRss()).mo23173i(str).mo23165a();
    }

    @RequiresApi(api = 19)
    @VisibleForTesting
    /* renamed from: f */
    public static String m6782f(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: g */
    public static SessionReportingCoordinator m6783g(Context context, IdManager idManager, FileStore fileStore, AppData appData, LogFileManager logFileManager, UserMetadata userMetadata, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter) {
        return new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context, idManager, appData, stackTraceTrimmingStrategy), new CrashlyticsReportPersistence(fileStore, settingsProvider), DataTransportCrashlyticsReportSender.m7553b(context, settingsProvider, onDemandCounter), logFileManager, userMetadata);
    }

    @RequiresApi(api = 30)
    @Nullable
    /* renamed from: j */
    private ApplicationExitInfo m6784j(String str, List<ApplicationExitInfo> list) {
        long q = this.f5026b.mo23493q(str);
        for (ApplicationExitInfo next : list) {
            if (next.getTimestamp() < q) {
                return null;
            }
            if (next.getReason() == 6) {
                return next;
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: k */
    private static List<CrashlyticsReport.CustomAttribute> m6785k(@NonNull Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(CrashlyticsReport.CustomAttribute.m7219a().mo23180b((String) next.getKey()).mo23181c((String) next.getValue()).mo23179a());
        }
        Collections.sort(arrayList, C1873d.f5037a);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public boolean m6787p(@NonNull Task<CrashlyticsReportWithSessionId> task) {
        if (task.mo23719t()) {
            CrashlyticsReportWithSessionId p = task.mo23715p();
            Logger f = Logger.m6525f();
            f.mo22954b("Crashlytics report successfully enqueued to DataTransport: " + p.mo22968d());
            File c = p.mo22967c();
            if (c.delete()) {
                Logger f2 = Logger.m6525f();
                f2.mo22954b("Deleted report file: " + c.getPath());
                return true;
            }
            Logger f3 = Logger.m6525f();
            f3.mo22962k("Crashlytics could not delete report file: " + c.getPath());
            return true;
        }
        Logger.m6525f().mo22963l("Crashlytics report could not be enqueued to DataTransport", task.mo23714o());
        return false;
    }

    /* renamed from: q */
    private void m6788q(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, @NonNull String str2, long j, boolean z) {
        boolean equals = str2.equals("crash");
        CrashlyticsReport.Session.Event c = this.f5025a.mo23037c(th, thread, str2, j, 4, 8, z);
        String str3 = str;
        this.f5026b.mo23496y(m6779c(c), str, equals);
    }

    /* renamed from: h */
    public void mo23059h(@NonNull String str, @NonNull List<NativeSessionFile> list) {
        Logger.m6525f().mo22954b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (NativeSessionFile a : list) {
            CrashlyticsReport.FilesPayload.File a2 = a.mo22976a();
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        this.f5026b.mo23491l(str, CrashlyticsReport.FilesPayload.m7225a().mo23188b(ImmutableList.m7424c(arrayList)).mo23187a());
    }

    /* renamed from: i */
    public void mo23060i(long j, @Nullable String str) {
        this.f5026b.mo23490k(str, j);
    }

    /* renamed from: l */
    public boolean mo23061l() {
        return this.f5026b.mo23494r();
    }

    /* renamed from: n */
    public SortedSet<String> mo23062n() {
        return this.f5026b.mo23492p();
    }

    /* renamed from: o */
    public void mo23063o(@NonNull String str, long j) {
        this.f5026b.mo23497z(this.f5025a.mo23038d(str, j));
    }

    /* renamed from: r */
    public void mo23064r(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, long j) {
        Logger f = Logger.m6525f();
        f.mo22960i("Persisting fatal event for session " + str);
        m6788q(th, thread, str, "crash", j, true);
    }

    /* renamed from: s */
    public void mo23065s(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, long j) {
        Logger f = Logger.m6525f();
        f.mo22960i("Persisting non-fatal event for session " + str);
        m6788q(th, thread, str, "error", j, false);
    }

    @RequiresApi(api = 30)
    /* renamed from: t */
    public void mo23066t(String str, List<ApplicationExitInfo> list, LogFileManager logFileManager, UserMetadata userMetadata) {
        ApplicationExitInfo j = m6784j(str, list);
        if (j == null) {
            Logger f = Logger.m6525f();
            f.mo22960i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        CrashlyticsReport.Session.Event b = this.f5025a.mo23036b(m6781e(j));
        Logger f2 = Logger.m6525f();
        f2.mo22954b("Persisting anr for session " + str);
        this.f5026b.mo23496y(m6780d(b, logFileManager, userMetadata), str, true);
    }

    /* renamed from: u */
    public void mo23067u() {
        this.f5026b.mo23489i();
    }

    /* renamed from: v */
    public Task<Void> mo23068v(@NonNull Executor executor) {
        return mo23069w(executor, (String) null);
    }

    /* renamed from: w */
    public Task<Void> mo23069w(@NonNull Executor executor, @Nullable String str) {
        List<CrashlyticsReportWithSessionId> w = this.f5026b.mo23495w();
        ArrayList arrayList = new ArrayList();
        for (CrashlyticsReportWithSessionId next : w) {
            if (str == null || str.equals(next.mo22968d())) {
                arrayList.add(this.f5027c.mo23512c(next, str != null).mo23711l(executor, new C1872c(this)));
            }
        }
        return Tasks.m66668g(arrayList);
    }
}
