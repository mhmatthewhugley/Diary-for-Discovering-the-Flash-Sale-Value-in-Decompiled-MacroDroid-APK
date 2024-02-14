package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class Batch extends BasePendingResult<BatchResult> {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f3084r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f3085s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f3086t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final PendingResult[] f3087u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final Object f3088v;

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static final class Builder {
    }

    /* renamed from: f */
    public void mo21212f() {
        super.mo21212f();
        for (PendingResult f : this.f3087u) {
            f.mo21212f();
        }
    }

    @NonNull
    /* renamed from: t */
    public BatchResult mo21036h(@NonNull Status status) {
        return new BatchResult(status, this.f3087u);
    }
}
