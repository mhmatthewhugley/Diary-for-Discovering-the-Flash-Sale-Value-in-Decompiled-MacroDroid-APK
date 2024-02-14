package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzffh {
    @Nullable
    @VisibleForTesting

    /* renamed from: a */
    static Task f35684a;
    @Nullable
    @VisibleForTesting

    /* renamed from: b */
    public static AppSetIdClient f35685b;

    /* renamed from: c */
    private static final Object f35686c = new Object();

    @Nullable
    /* renamed from: a */
    public static Task m50086a(Context context) {
        Task task;
        m50087b(context, false);
        synchronized (f35686c) {
            task = f35684a;
        }
        return task;
    }

    /* renamed from: b */
    public static void m50087b(Context context, boolean z) {
        synchronized (f35686c) {
            if (f35685b == null) {
                f35685b = AppSet.m3109a(context);
            }
            Task task = f35684a;
            if (task == null || ((task.mo23718s() && !f35684a.mo23719t()) || (z && f35684a.mo23718s()))) {
                f35684a = ((AppSetIdClient) Preconditions.m4489l(f35685b, "the appSetIdClient shouldn't be null")).mo20736h();
            }
        }
    }
}
