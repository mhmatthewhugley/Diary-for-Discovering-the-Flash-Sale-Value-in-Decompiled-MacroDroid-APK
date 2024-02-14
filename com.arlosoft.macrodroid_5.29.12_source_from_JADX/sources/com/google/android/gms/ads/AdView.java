package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class AdView extends BaseAdView {
    public AdView(@NonNull Context context) {
        super(context, 0);
        Preconditions.m4489l(context, "Context cannot be null");
    }

    @NonNull
    /* renamed from: e */
    public final VideoController mo19697e() {
        return this.f1699a.mo20053i();
    }

    public AdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }
}
