package com.google.android.play.core.tasks;

import androidx.annotation.NonNull;
import com.google.android.play.core.internal.zzci;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class Tasks {
    private Tasks() {
    }

    /* renamed from: a */
    public static <ResultT> ResultT m71248a(@NonNull Task<ResultT> task) throws ExecutionException, InterruptedException {
        zzci.m70929a(task, "Task must not be null");
        if (task.mo60022h()) {
            return m71251d(task);
        }
        zzo zzo = new zzo((zzn) null);
        m71252e(task, zzo);
        zzo.mo60041a();
        return m71251d(task);
    }

    /* renamed from: b */
    public static Task m71249b(Exception exc) {
        zzm zzm = new zzm();
        zzm.mo60037j(exc);
        return zzm;
    }

    /* renamed from: c */
    public static Task m71250c(Object obj) {
        zzm zzm = new zzm();
        zzm.mo60038k(obj);
        return zzm;
    }

    /* renamed from: d */
    private static Object m71251d(Task task) throws ExecutionException {
        if (task.mo60023i()) {
            return task.mo60021g();
        }
        throw new ExecutionException(task.mo60020f());
    }

    /* renamed from: e */
    private static void m71252e(Task task, zzp zzp) {
        Executor executor = TaskExecutors.f51956b;
        task.mo60019e(executor, zzp);
        task.mo60017c(executor, zzp);
    }
}
