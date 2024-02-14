package com.google.android.gms.internal.appset;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class zzl implements AppSetIdClient {
    @GuardedBy("InternalAppSetAppSideClientImpl.class")
    @Nullable

    /* renamed from: e */
    private static AppSetIdClient f39081e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f39082a;

    /* renamed from: b */
    private boolean f39083b = false;

    /* renamed from: c */
    private final ScheduledExecutorService f39084c;

    /* renamed from: d */
    private final ExecutorService f39085d;

    zzl(Context context) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f39084c = newSingleThreadScheduledExecutor;
        this.f39085d = Executors.newSingleThreadExecutor();
        this.f39082a = context;
        if (!this.f39083b) {
            newSingleThreadScheduledExecutor.scheduleAtFixedRate(new zzj(this, (zzi) null), 0, 86400, TimeUnit.SECONDS);
            this.f39083b = true;
        }
    }

    @NonNull
    /* renamed from: c */
    static synchronized AppSetIdClient m55614c(@NonNull Context context) {
        AppSetIdClient appSetIdClient;
        synchronized (zzl.class) {
            Preconditions.m4489l(context, "Context must not be null");
            if (f39081e == null) {
                f39081e = new zzl(context.getApplicationContext());
            }
            appSetIdClient = f39081e;
        }
        return appSetIdClient;
    }

    @VisibleForTesting
    /* renamed from: e */
    protected static final void m55615e(Context context) {
        String str;
        if (!m55616f(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                str = "Failed to clear app set ID generated for App ".concat(valueOf);
            } else {
                str = new String("Failed to clear app set ID generated for App ");
            }
            Log.e("AppSet", str);
        }
        if (!m55616f(context).edit().remove("app_set_id_last_used_time").commit()) {
            String valueOf2 = String.valueOf(context.getPackageName());
            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
        }
    }

    /* renamed from: f */
    private static final SharedPreferences m55616f(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    /* renamed from: g */
    private static final void m55617g(Context context) throws zzk {
        String str;
        SharedPreferences f = m55616f(context);
        if (!f.edit().putLong("app_set_id_last_used_time", DefaultClock.m4871d().mo21950a()).commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                str = "Failed to store app set ID last used time for App ".concat(valueOf);
            } else {
                str = new String("Failed to store app set ID last used time for App ");
            }
            Log.e("AppSet", str);
            throw new zzk("Failed to store the app set ID last used time.");
        }
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: a */
    public final long mo48492a() {
        long j = m55616f(this.f39082a).getLong("app_set_id_last_used_time", -1);
        if (j != -1) {
            return j + 33696000000L;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo48493d(TaskCompletionSource taskCompletionSource) {
        String str;
        String str2;
        String string = m55616f(this.f39082a).getString("app_set_id", (String) null);
        long a = mo48492a();
        if (string == null || DefaultClock.m4871d().mo21950a() > a) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f39082a;
                if (!m55616f(context).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    if (valueOf.length() != 0) {
                        str2 = "Failed to store app set ID generated for App ".concat(valueOf);
                    } else {
                        str2 = new String("Failed to store app set ID generated for App ");
                    }
                    Log.e("AppSet", str2);
                    throw new zzk("Failed to store the app set ID.");
                }
                m55617g(context);
                Context context2 = this.f39082a;
                SharedPreferences f = m55616f(context2);
                if (!f.edit().putLong("app_set_id_creation_time", DefaultClock.m4871d().mo21950a()).commit()) {
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    if (valueOf2.length() != 0) {
                        str = "Failed to store app set ID creation time for App ".concat(valueOf2);
                    } else {
                        str = new String("Failed to store app set ID creation time for App ");
                    }
                    Log.e("AppSet", str);
                    throw new zzk("Failed to store the app set ID creation time.");
                }
            } catch (zzk e) {
                taskCompletionSource.mo56138b(e);
                return;
            }
        } else {
            try {
                m55617g(this.f39082a);
            } catch (zzk e2) {
                taskCompletionSource.mo56138b(e2);
                return;
            }
        }
        taskCompletionSource.mo56139c(new AppSetIdInfo(string, 1));
    }

    /* renamed from: h */
    public final Task<AppSetIdInfo> mo20736h() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f39085d.execute(new zzh(this, taskCompletionSource));
        return taskCompletionSource.mo56137a();
    }
}
