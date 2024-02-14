package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.auth.C0271a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.WithinAppServiceBinder;
import java.util.concurrent.ExecutorService;

public abstract class EnhancedIntentService extends Service {
    @VisibleForTesting

    /* renamed from: a */
    final ExecutorService f54964a = FcmExecutors.m76839d();

    /* renamed from: c */
    private Binder f54965c;

    /* renamed from: d */
    private final Object f54966d = new Object();

    /* renamed from: f */
    private int f54967f;

    /* renamed from: g */
    private int f54968g = 0;

    /* renamed from: d */
    private void m76817d(Intent intent) {
        if (intent != null) {
            WakeLockHolder.m77080c(intent);
        }
        synchronized (this.f54966d) {
            int i = this.f54968g - 1;
            this.f54968g = i;
            if (i == 0) {
                mo63329k(this.f54967f);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m76818h(Intent intent, Task task) {
        m76817d(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m76819i(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            mo63327f(intent);
        } finally {
            taskCompletionSource.mo56139c(null);
        }
    }

    /* access modifiers changed from: private */
    @MainThread
    /* renamed from: j */
    public Task<Void> m76820j(Intent intent) {
        if (mo63328g(intent)) {
            return Tasks.m66667f(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f54964a.execute(new C11299b(this, intent, taskCompletionSource));
        return taskCompletionSource.mo56137a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Intent mo63326e(Intent intent) {
        return intent;
    }

    /* renamed from: f */
    public abstract void mo63327f(Intent intent);

    /* renamed from: g */
    public boolean mo63328g(Intent intent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo63329k(int i) {
        return stopSelfResult(i);
    }

    public final synchronized IBinder onBind(Intent intent) {
        boolean isLoggable = Log.isLoggable("EnhancedIntentService", 3);
        if (this.f54965c == null) {
            this.f54965c = new WithinAppServiceBinder(new WithinAppServiceBinder.IntentHandler() {
                @KeepForSdk
                /* renamed from: a */
                public Task<Void> mo63333a(Intent intent) {
                    return EnhancedIntentService.this.m76820j(intent);
                }
            });
        }
        return this.f54965c;
    }

    @CallSuper
    public void onDestroy() {
        this.f54964a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f54966d) {
            this.f54967f = i2;
            this.f54968g++;
        }
        Intent e = mo63326e(intent);
        if (e == null) {
            m76817d(intent);
            return 2;
        }
        Task<Void> j = m76820j(e);
        if (j.mo23718s()) {
            m76817d(intent);
            return 2;
        }
        j.mo23703d(C0271a.f317a, new C11297a(this, intent));
        return 3;
    }
}
