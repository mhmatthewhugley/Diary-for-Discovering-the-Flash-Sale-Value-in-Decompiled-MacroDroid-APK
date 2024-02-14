package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@4.0.0 */
public class SkuDetailsParams {
    /* access modifiers changed from: private */
    public String zza;
    /* access modifiers changed from: private */
    public List<String> zzb;

    /* compiled from: com.android.billingclient:billing@@4.0.0 */
    public static class Builder {
        private String zza;
        private List<String> zzb;

        private Builder() {
        }

        /* synthetic */ Builder(zzan zzan) {
        }

        @NonNull
        public SkuDetailsParams build() {
            if (this.zza == null) {
                throw new IllegalArgumentException("SKU type must be set");
            } else if (this.zzb != null) {
                SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
                String unused = skuDetailsParams.zza = this.zza;
                List unused2 = skuDetailsParams.zzb = this.zzb;
                return skuDetailsParams;
            } else {
                throw new IllegalArgumentException("SKU list or SkuWithOffer list must be set");
            }
        }

        @NonNull
        public Builder setSkusList(@NonNull List<String> list) {
            this.zzb = new ArrayList(list);
            return this;
        }

        @NonNull
        public Builder setType(@NonNull String str) {
            this.zza = str;
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder((zzan) null);
    }

    @NonNull
    public String getSkuType() {
        return this.zza;
    }

    @NonNull
    public List<String> getSkusList() {
        return this.zzb;
    }
}
