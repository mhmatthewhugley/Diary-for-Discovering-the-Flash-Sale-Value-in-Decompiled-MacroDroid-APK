package com.google.android.gms.ads.admanager;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class AdManagerAdRequest extends AdRequest {

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static final class Builder extends AdRequest.Builder {
        @NonNull
        /* renamed from: i */
        public AdManagerAdRequest mo19671c() {
            return new AdManagerAdRequest(this, (zza) null);
        }
    }

    /* synthetic */ AdManagerAdRequest(Builder builder, zza zza) {
        super(builder);
    }

    /* renamed from: a */
    public final zzdr mo19668a() {
        return this.f1673a;
    }
}
