package com.arlosoft.macrodroid.autobackup.worker;

import android.content.Context;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* compiled from: AutoBackupWorker.kt */
public final class AutoBackupWorker extends Worker {

    /* renamed from: c */
    public static final C3874a f10020c = new C3874a((C13695i) null);

    /* renamed from: a */
    private final Context f10021a;

    /* renamed from: b */
    private final WorkerParameters f10022b;

    /* renamed from: com.arlosoft.macrodroid.autobackup.worker.AutoBackupWorker$a */
    /* compiled from: AutoBackupWorker.kt */
    public static final class C3874a {
        private C3874a() {
        }

        public /* synthetic */ C3874a(C13695i iVar) {
            this();
        }

        /* renamed from: c */
        private final boolean m15064c(String str) {
            try {
                ListenableFuture<List<WorkInfo>> workInfosByTag = WorkManager.getInstance().getWorkInfosByTag(str);
                C13706o.m87928e(workInfosByTag, "getInstance().getWorkInfosByTag(tag)");
                try {
                    boolean z = false;
                    for (WorkInfo state : workInfosByTag.get()) {
                        WorkInfo.State state2 = state.getState();
                        C13706o.m87928e(state2, "workInfo.state");
                        z = (state2 == WorkInfo.State.ENQUEUED) | (state2 == WorkInfo.State.RUNNING);
                    }
                    return z;
                } catch (Exception unused) {
                    return false;
                }
            } catch (Exception unused2) {
                return true;
            }
        }

        /* renamed from: a */
        public final void mo27430a() {
            WorkManager.getInstance().cancelAllWorkByTag("AutoBackup");
        }

        /* renamed from: b */
        public final void mo27431b() {
            if (!m15064c("AutoBackup")) {
                WorkRequest build = ((PeriodicWorkRequest.Builder) new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) AutoBackupWorker.class, 24, TimeUnit.HOURS).addTag("AutoBackup")).build();
                C13706o.m87928e(build, "periodicWorkBuilder.addT…ACKUP_WORKER_TAG).build()");
                WorkManager.getInstance().enqueueUniquePeriodicWork("AutoBackup", ExistingPeriodicWorkPolicy.KEEP, (PeriodicWorkRequest) build);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoBackupWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C13706o.m87929f(context, "context");
        C13706o.m87929f(workerParameters, "params");
        this.f10021a = context;
        this.f10022b = workerParameters;
    }

    /* renamed from: a */
    private final void m15063a(File file) {
        try {
            File[] listFiles = file.listFiles();
            C13706o.m87928e(listFiles, "backupDir.listFiles()");
            for (File file2 : listFiles) {
                if (TimeUnit.DAYS.convert(new Date().getTime() - file2.lastModified(), TimeUnit.MILLISECONDS) > 14) {
                    file2.delete();
                }
            }
        } catch (Exception e) {
            C4878b.m18868g("Failed to clean up old backup files: " + e);
        }
    }

    public ListenableWorker.Result doWork() {
        File file = new File(this.f10021a.getFilesDir().getAbsolutePath(), "MacroDroid/AutoBackup");
        File file2 = new File(this.f10021a.getExternalFilesDir((String) null), "MacroDroid/AutoBackup");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("[yyyy_MM_dd]");
        String str = file2.getAbsolutePath() + '/' + simpleDateFormat.format(new Date()) + ".mdr";
        if (!C4934n.m19004Y()) {
            Thread.sleep(WorkRequest.MIN_BACKOFF_MILLIS);
        }
        if (C4934n.m18999N(this.f10021a.getApplicationContext()).mo29710z().size() > 0 && !new File(str).exists()) {
            try {
                if (C4934n.m18999N(this.f10021a.getApplicationContext()).mo29706v0(str, true, true, false)) {
                    if (file.exists() && file.isDirectory()) {
                        m15063a(file);
                    }
                    if (file2.exists() && file2.isDirectory()) {
                        m15063a(file2);
                    }
                }
            } catch (Exception e) {
                C4878b.m18868g("Autobackup failed: " + e);
                FirebaseCrashlytics.m6487a().mo22936d(e);
            }
        }
        ListenableWorker.Result success = ListenableWorker.Result.success();
        C13706o.m87928e(success, "success()");
        return success;
    }
}
