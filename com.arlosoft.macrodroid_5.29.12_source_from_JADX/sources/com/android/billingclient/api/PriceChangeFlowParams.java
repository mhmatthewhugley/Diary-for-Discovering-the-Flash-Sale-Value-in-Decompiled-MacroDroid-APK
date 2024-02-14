package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* compiled from: com.android.billingclient:billing@@4.0.0 */
public class PriceChangeFlowParams {
    /* access modifiers changed from: private */
    public SkuDetails zza;

    /* compiled from: com.android.billingclient:billing@@4.0.0 */
    public static class Builder {
        private SkuDetails zza;

        @NonNull
        public PriceChangeFlowParams build() {
            if (this.zza != null) {
                PriceChangeFlowParams priceChangeFlowParams = new PriceChangeFlowParams();
                SkuDetails unused = priceChangeFlowParams.zza = this.zza;
                return priceChangeFlowParams;
            }
            throw new IllegalArgumentException("SkuDetails must be set");
        }

        @NonNull
        public Builder setSkuDetails(@NonNull SkuDetails skuDetails) {
            this.zza = skuDetails;
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public SkuDetails getSkuDetails() {
        return this.zza;
    }
}
