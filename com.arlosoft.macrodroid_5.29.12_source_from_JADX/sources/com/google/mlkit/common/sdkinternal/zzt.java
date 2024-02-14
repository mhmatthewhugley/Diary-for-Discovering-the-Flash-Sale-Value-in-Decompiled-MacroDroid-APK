package com.google.mlkit.common.sdkinternal;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzt implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TaskQueue f56426a;

    /* renamed from: c */
    public final /* synthetic */ Runnable f56427c;

    public /* synthetic */ zzt(TaskQueue taskQueue, Runnable runnable) {
        this.f56426a = taskQueue;
        this.f56427c = runnable;
    }

    public final void run() {
        TaskQueue taskQueue = this.f56426a;
        Runnable runnable = this.f56427c;
        zzx zzx = new zzx(taskQueue, (zzw) null);
        try {
            runnable.run();
            zzx.close();
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
