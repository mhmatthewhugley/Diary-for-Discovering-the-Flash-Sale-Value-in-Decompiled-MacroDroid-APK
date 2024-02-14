package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaad {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map f3262a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map f3263b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: h */
    private final void m3917h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f3262a) {
            hashMap = new HashMap(this.f3262a);
        }
        synchronized (this.f3263b) {
            hashMap2 = new HashMap(this.f3263b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo21326i(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).mo56140d(new ApiException(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo21423c(BasePendingResult basePendingResult, boolean z) {
        this.f3262a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo21270c(new zaab(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo21424d(TaskCompletionSource taskCompletionSource, boolean z) {
        this.f3263b.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.mo56137a().mo23702c(new zaac(this, taskCompletionSource));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo21425e(int i, @Nullable String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        m3917h(true, new Status(20, sb.toString()));
    }

    /* renamed from: f */
    public final void mo21426f() {
        m3917h(false, GoogleApiManager.f3177I);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo21427g() {
        return !this.f3262a.isEmpty() || !this.f3263b.isEmpty();
    }
}
