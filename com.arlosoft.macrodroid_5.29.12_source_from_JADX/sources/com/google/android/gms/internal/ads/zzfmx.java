package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfmx {

    /* renamed from: e */
    private static volatile int f36130e = 1;

    /* renamed from: f */
    public static final /* synthetic */ int f36131f = 0;

    /* renamed from: a */
    private final Context f36132a;

    /* renamed from: b */
    private final Executor f36133b;

    /* renamed from: c */
    private final Task f36134c;

    /* renamed from: d */
    private final boolean f36135d;

    zzfmx(@NonNull Context context, @NonNull Executor executor, @NonNull Task task, boolean z) {
        this.f36132a = context;
        this.f36133b = executor;
        this.f36134c = task;
        this.f36135d = z;
    }

    /* renamed from: a */
    public static zzfmx m50574a(@NonNull Context context, @NonNull Executor executor, boolean z) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executor.execute(new zzfmt(context, taskCompletionSource));
        } else {
            executor.execute(new zzfmu(taskCompletionSource));
        }
        return new zzfmx(context, executor, taskCompletionSource.mo56137a(), z);
    }

    /* renamed from: g */
    static void m50575g(int i) {
        f36130e = i;
    }

    /* renamed from: h */
    private final Task m50576h(int i, long j, Exception exc, String str, Map map, String str2) {
        if (!this.f36135d) {
            return this.f36134c.mo23711l(this.f36133b, zzfmv.f36127a);
        }
        zzalw F = zzama.m41731F();
        F.mo41643n(this.f36132a.getPackageName());
        F.mo41647x(j);
        F.mo41642A(f36130e);
        if (exc != null) {
            F.mo41648y(zzfto.m50974a(exc));
            F.mo41646v(exc.getClass().getName());
        }
        if (str2 != null) {
            F.mo41644o(str2);
        }
        if (str != null) {
            F.mo41645u(str);
        }
        return this.f36134c.mo23711l(this.f36133b, new zzfmw(F, i));
    }

    /* renamed from: b */
    public final Task mo45981b(int i, String str) {
        return m50576h(i, 0, (Exception) null, (String) null, (Map) null, str);
    }

    /* renamed from: c */
    public final Task mo45982c(int i, long j, Exception exc) {
        return m50576h(i, j, exc, (String) null, (Map) null, (String) null);
    }

    /* renamed from: d */
    public final Task mo45983d(int i, long j) {
        return m50576h(i, j, (Exception) null, (String) null, (Map) null, (String) null);
    }

    /* renamed from: e */
    public final Task mo45984e(int i, long j, String str) {
        return m50576h(i, j, (Exception) null, (String) null, (Map) null, str);
    }

    /* renamed from: f */
    public final Task mo45985f(int i, long j, String str, Map map) {
        return m50576h(i, j, (Exception) null, str, (Map) null, (String) null);
    }
}
