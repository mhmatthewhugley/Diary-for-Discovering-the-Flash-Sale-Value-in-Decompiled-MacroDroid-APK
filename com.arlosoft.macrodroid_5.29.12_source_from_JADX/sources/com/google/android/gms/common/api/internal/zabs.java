package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zabs {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ApiKey f3384a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Feature f3385b;

    /* synthetic */ zabs(ApiKey apiKey, Feature feature, zabr zabr) {
        this.f3384a = apiKey;
        this.f3385b = feature;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof zabs)) {
            zabs zabs = (zabs) obj;
            if (!Objects.m4470a(this.f3384a, zabs.f3384a) || !Objects.m4470a(this.f3385b, zabs.f3385b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f3384a, this.f3385b);
    }

    public final String toString() {
        return Objects.m4472c(this).mo21720a("key", this.f3384a).mo21720a("feature", this.f3385b).toString();
    }
}
