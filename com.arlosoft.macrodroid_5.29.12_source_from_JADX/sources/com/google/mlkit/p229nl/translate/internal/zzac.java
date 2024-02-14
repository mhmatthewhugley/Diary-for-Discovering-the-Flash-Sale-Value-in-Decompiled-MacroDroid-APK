package com.google.mlkit.p229nl.translate.internal;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_translate.zzba;
import com.google.android.gms.internal.mlkit_translate.zzf;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;

/* renamed from: com.google.mlkit.nl.translate.internal.zzac */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzac {

    /* renamed from: e */
    private static final GmsLogger f56467e = new GmsLogger("TranslateModelLoader", "");

    /* renamed from: f */
    public static final /* synthetic */ int f56468f = 0;

    /* renamed from: a */
    private final zzi f56469a;

    /* renamed from: b */
    private final zzz f56470b;
    @Nullable

    /* renamed from: c */
    private Task f56471c;
    @Nullable

    /* renamed from: d */
    private CancellationTokenSource f56472d;

    /* synthetic */ zzac(zzi zzi, zzz zzz, zzab zzab) {
        this.f56469a = zzi;
        this.f56470b = zzz;
    }

    /* renamed from: g */
    private final void m79177g() throws MlKitException {
        if (!this.f56469a.mo64685j()) {
            f56467e.mo21702b("TranslateModelLoader", "No existing model file");
            throw new MlKitException("No existing model file", 13);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Task mo64654a(DownloadConditions downloadConditions, Task task) throws Exception {
        if (task.mo23717r()) {
            return Tasks.m66667f(zzf.m61779b());
        }
        return this.f56469a.mo64676a(downloadConditions);
    }

    @WorkerThread
    /* renamed from: b */
    public final Task mo64655b(DownloadConditions downloadConditions) {
        Preconditions.m4481d(MLTaskExecutor.m79033b().mo64549a());
        if (this.f56471c == null) {
            f56467e.mo21702b("TranslateModelLoader", "Initial loading, check for model updates.");
            CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
            this.f56472d = cancellationTokenSource;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.mo56135b());
            MLTaskExecutor.m79033b().mo64552e(new zzv(taskCompletionSource), (long) (this.f56470b.f56549a * 1000.0d));
            this.f56471c = taskCompletionSource.mo56137a().mo23713n(zzba.m61609a(), new zzw(this, downloadConditions)).mo23711l(zzba.m61609a(), new zzx(this));
        }
        return this.f56471c.mo23711l(zzba.m61609a(), new zzy(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Void mo64656c(Task task) throws Exception {
        this.f56471c = null;
        Exception o = task.mo23714o();
        if (o != null) {
            zzz.m79275b(this.f56470b);
        }
        if (o != null || !((zzf) task.mo23715p()).mo52018a()) {
            throw new MlKitException("Model not downloaded.", 13, o);
        }
        this.f56470b.f56549a = 0.0d;
        m79177g();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Void mo64657d(Task task) throws Exception {
        if (task.mo23719t()) {
            return (Void) task.mo23715p();
        }
        try {
            f56467e.mo21702b("TranslateModelLoader", "Try to load newly downloaded model file.");
            if (this.f56469a.mo64677b() != null) {
                return null;
            }
            throw new MlKitException("Newly downloaded model file could not be loaded.", 13);
        } catch (MlKitException unused) {
            f56467e.mo21702b("TranslateModelLoader", "Loading existing model file.");
            m79177g();
            return null;
        }
    }

    @WorkerThread
    /* renamed from: e */
    public final void mo64658e() throws MlKitException {
        CancellationTokenSource cancellationTokenSource = this.f56472d;
        if (cancellationTokenSource != null) {
            cancellationTokenSource.mo56134a();
        }
        this.f56469a.mo64681f();
        this.f56471c = null;
    }

    @WorkerThread
    /* renamed from: f */
    public final boolean mo64659f() {
        return this.f56469a.mo64685j();
    }
}
