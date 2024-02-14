package com.google.firebase.storage;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.StorageTask.ProvideError;
import com.google.firebase.storage.internal.ActivityLifecycleListener;
import com.google.firebase.storage.internal.SmartHandler;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

class TaskListenerImpl<ListenerTypeT, ResultT extends StorageTask.ProvideError> {

    /* renamed from: a */
    private final Queue<ListenerTypeT> f55426a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    private final HashMap<ListenerTypeT, SmartHandler> f55427b = new HashMap<>();

    /* renamed from: c */
    private StorageTask<ResultT> f55428c;

    /* renamed from: d */
    private int f55429d;

    /* renamed from: e */
    private OnRaise<ListenerTypeT, ResultT> f55430e;

    interface OnRaise<ListenerTypeT, ResultT> {
        /* renamed from: a */
        void mo63694a(@NonNull ListenerTypeT listenertypet, @NonNull ResultT resultt);
    }

    public TaskListenerImpl(@NonNull StorageTask<ResultT> storageTask, int i, @NonNull OnRaise<ListenerTypeT, ResultT> onRaise) {
        this.f55428c = storageTask;
        this.f55429d = i;
        this.f55430e = onRaise;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m77549f(Object obj, StorageTask.ProvideError provideError) {
        this.f55430e.mo63694a(obj, provideError);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m77550g(Object obj, StorageTask.ProvideError provideError) {
        this.f55430e.mo63694a(obj, provideError);
    }

    /* renamed from: d */
    public void mo63691d(@Nullable Activity activity, @Nullable Executor executor, @NonNull ListenerTypeT listenertypet) {
        boolean z;
        SmartHandler smartHandler;
        Preconditions.m4488k(listenertypet);
        synchronized (this.f55428c.mo63660Z()) {
            boolean z2 = true;
            z = (this.f55428c.mo63656S() & this.f55429d) != 0;
            this.f55426a.add(listenertypet);
            smartHandler = new SmartHandler(executor);
            this.f55427b.put(listenertypet, smartHandler);
            if (activity != null) {
                if (activity.isDestroyed()) {
                    z2 = false;
                }
                Preconditions.m4479b(z2, "Activity is already destroyed!");
                ActivityLifecycleListener.m77582a().mo63700c(activity, listenertypet, new C11382o(this, listenertypet));
            }
        }
        if (z) {
            smartHandler.mo63720a(new C11384q(this, listenertypet, this.f55428c.mo63668s0()));
        }
    }

    /* renamed from: h */
    public void mo63692h() {
        if ((this.f55428c.mo63656S() & this.f55429d) != 0) {
            ResultT s0 = this.f55428c.mo63668s0();
            for (Object next : this.f55426a) {
                SmartHandler smartHandler = this.f55427b.get(next);
                if (smartHandler != null) {
                    smartHandler.mo63720a(new C11383p(this, next, s0));
                }
            }
        }
    }

    /* renamed from: i */
    public void m77548e(@NonNull ListenerTypeT listenertypet) {
        Preconditions.m4488k(listenertypet);
        synchronized (this.f55428c.mo63660Z()) {
            this.f55427b.remove(listenertypet);
            this.f55426a.remove(listenertypet);
            ActivityLifecycleListener.m77582a().mo63699b(listenertypet);
        }
    }
}
