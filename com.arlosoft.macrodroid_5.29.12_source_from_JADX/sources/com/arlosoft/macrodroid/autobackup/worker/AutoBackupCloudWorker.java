package com.arlosoft.macrodroid.autobackup.worker;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.arlosoft.macrodroid.firebase.C4688h;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* compiled from: AutoBackupCloudWorker.kt */
public final class AutoBackupCloudWorker extends Worker {

    /* renamed from: c */
    public static final C3873a f10017c = new C3873a((C13695i) null);

    /* renamed from: a */
    private final Context f10018a;

    /* renamed from: b */
    private final WorkerParameters f10019b;

    /* renamed from: com.arlosoft.macrodroid.autobackup.worker.AutoBackupCloudWorker$a */
    /* compiled from: AutoBackupCloudWorker.kt */
    public static final class C3873a {
        private C3873a() {
        }

        public /* synthetic */ C3873a(C13695i iVar) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ void m15060c(C3873a aVar, Context context, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = 6;
            }
            aVar.mo27429b(context, j);
        }

        /* renamed from: a */
        public final void mo27428a(Context context) {
            C13706o.m87929f(context, "context");
            WorkManager instance = WorkManager.getInstance(context);
            C13706o.m87928e(instance, "getInstance(context)");
            instance.cancelUniqueWork("cloud_backup");
        }

        /* renamed from: b */
        public final void mo27429b(Context context, long j) {
            C13706o.m87929f(context, "context");
            if (C5163j2.m20310z(context) && C5163j2.m19922A(context) != null) {
                Constraints build = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
                C13706o.m87928e(build, "Builder().setRequiredNet…rkType.CONNECTED).build()");
                WorkRequest build2 = ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(AutoBackupCloudWorker.class).setConstraints(build)).setInitialDelay(j, TimeUnit.HOURS)).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 5, TimeUnit.MINUTES)).build();
                C13706o.m87928e(build2, "OneTimeWorkRequestBuilde…                 .build()");
                C4878b.m18864c("==> Scheduling a new cloud backup for around 2 hours time");
                WorkManager instance = WorkManager.getInstance(context);
                C13706o.m87928e(instance, "getInstance(context)");
                instance.enqueueUniqueWork("cloud_backup", ExistingWorkPolicy.REPLACE, (OneTimeWorkRequest) build2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoBackupCloudWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C13706o.m87929f(context, "context");
        C13706o.m87929f(workerParameters, "params");
        this.f10018a = context;
        this.f10019b = workerParameters;
    }

    /* renamed from: a */
    public static final void m15059a(Context context, long j) {
        f10017c.mo27429b(context, j);
    }

    public ListenableWorker.Result doWork() {
        new C4688h(this.f10018a).mo29134l();
        ListenableWorker.Result success = ListenableWorker.Result.success();
        C13706o.m87928e(success, "success()");
        return success;
    }
}
