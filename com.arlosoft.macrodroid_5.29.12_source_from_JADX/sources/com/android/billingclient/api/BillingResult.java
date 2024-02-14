package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* compiled from: com.android.billingclient:billing@@4.0.0 */
public final class BillingResult {
    /* access modifiers changed from: private */
    public int zza;
    /* access modifiers changed from: private */
    public String zzb;

    /* compiled from: com.android.billingclient:billing@@4.0.0 */
    public static class Builder {
        private int zza;
        private String zzb = "";

        private Builder() {
        }

        /* synthetic */ Builder(zzaj zzaj) {
        }

        @NonNull
        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            int unused = billingResult.zza = this.zza;
            String unused2 = billingResult.zzb = this.zzb;
            return billingResult;
        }

        @NonNull
        public Builder setDebugMessage(@NonNull String str) {
            this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setResponseCode(int i) {
            this.zza = i;
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder((zzaj) null);
    }

    @NonNull
    public String getDebugMessage() {
        return this.zzb;
    }

    public int getResponseCode() {
        return this.zza;
    }
}
