package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* compiled from: com.android.billingclient:billing@@4.0.0 */
public class BillingFlowParams {
    @NonNull
    public static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";
    @NonNull
    public static final String EXTRA_PARAM_KEY_OLD_SKUS = "skusToReplace";
    @NonNull
    public static final String EXTRA_PARAM_KEY_OLD_SKU_PURCHASE_TOKEN = "oldSkuPurchaseToken";
    @NonNull
    public static final String EXTRA_PARAM_KEY_REPLACE_SKUS_PRORATION_MODE = "prorationMode";
    @NonNull
    public static final String EXTRA_PARAM_KEY_VR = "vr";
    /* access modifiers changed from: private */
    public boolean zza;
    /* access modifiers changed from: private */
    public String zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public String zzd;
    /* access modifiers changed from: private */
    public int zze = 0;
    /* access modifiers changed from: private */
    public ArrayList<SkuDetails> zzf;
    /* access modifiers changed from: private */
    public boolean zzg;

    /* compiled from: com.android.billingclient:billing@@4.0.0 */
    public static class Builder {
        private String zza;
        private String zzb;
        private String zzc;
        private int zzd = 0;
        private ArrayList<SkuDetails> zze;
        private boolean zzf;

        private Builder() {
        }

        /* synthetic */ Builder(zzai zzai) {
        }

        @NonNull
        public BillingFlowParams build() {
            ArrayList<SkuDetails> arrayList = this.zze;
            if (arrayList == null || arrayList.isEmpty()) {
                throw new IllegalArgumentException("SkuDetails must be provided.");
            }
            ArrayList<SkuDetails> arrayList2 = this.zze;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (arrayList2.get(i) != null) {
                    i = i2;
                } else {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
            }
            if (this.zze.size() > 1) {
                SkuDetails skuDetails = this.zze.get(0);
                String type = skuDetails.getType();
                ArrayList<SkuDetails> arrayList3 = this.zze;
                int size2 = arrayList3.size();
                int i3 = 0;
                while (i3 < size2) {
                    SkuDetails skuDetails2 = arrayList3.get(i3);
                    if (type.equals("play_pass_subs") || skuDetails2.getType().equals("play_pass_subs") || type.equals(skuDetails2.getType())) {
                        i3++;
                    } else {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String zzc2 = skuDetails.zzc();
                ArrayList<SkuDetails> arrayList4 = this.zze;
                int size3 = arrayList4.size();
                int i4 = 0;
                while (i4 < size3) {
                    SkuDetails skuDetails3 = arrayList4.get(i4);
                    if (type.equals("play_pass_subs") || skuDetails3.getType().equals("play_pass_subs") || zzc2.equals(skuDetails3.zzc())) {
                        i4++;
                    } else {
                        throw new IllegalArgumentException("All SKUs must have the same package name.");
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams((zzai) null);
            boolean unused = billingFlowParams.zza = true ^ this.zze.get(0).zzc().isEmpty();
            String unused2 = billingFlowParams.zzb = this.zza;
            String unused3 = billingFlowParams.zzd = this.zzc;
            String unused4 = billingFlowParams.zzc = this.zzb;
            int unused5 = billingFlowParams.zze = this.zzd;
            ArrayList unused6 = billingFlowParams.zzf = this.zze;
            boolean unused7 = billingFlowParams.zzg = this.zzf;
            return billingFlowParams;
        }

        @NonNull
        public Builder setObfuscatedAccountId(@NonNull String str) {
            this.zza = str;
            return this;
        }

        @NonNull
        public Builder setObfuscatedProfileId(@NonNull String str) {
            this.zzc = str;
            return this;
        }

        @NonNull
        public Builder setSkuDetails(@NonNull SkuDetails skuDetails) {
            ArrayList<SkuDetails> arrayList = new ArrayList<>();
            arrayList.add(skuDetails);
            this.zze = arrayList;
            return this;
        }

        @zzc
        @NonNull
        public Builder setSubscriptionUpdateParams(@NonNull SubscriptionUpdateParams subscriptionUpdateParams) {
            this.zzb = subscriptionUpdateParams.getOldSkuPurchaseToken();
            this.zzd = subscriptionUpdateParams.getReplaceSkusProrationMode();
            return this;
        }

        @NonNull
        public Builder setVrPurchaseFlow(boolean z) {
            this.zzf = z;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.android.billingclient:billing@@4.0.0 */
    public @interface ProrationMode {
        public static final int DEFERRED = 4;
        @zzb
        public static final int IMMEDIATE_AND_CHARGE_FULL_PRICE = 5;
        public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
        public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
        public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
        public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;
    }

    @zzc
    /* compiled from: com.android.billingclient:billing@@4.0.0 */
    public static class SubscriptionUpdateParams {
        /* access modifiers changed from: private */
        public String zza;
        /* access modifiers changed from: private */
        public int zzb = 0;

        @zzc
        /* compiled from: com.android.billingclient:billing@@4.0.0 */
        public static class Builder {
            private String zza;
            private int zzb = 0;

            private Builder() {
            }

            /* synthetic */ Builder(zzai zzai) {
            }

            @zzc
            @NonNull
            public SubscriptionUpdateParams build() {
                if (!TextUtils.isEmpty(this.zza) || !TextUtils.isEmpty((CharSequence) null)) {
                    SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams((zzai) null);
                    String unused = subscriptionUpdateParams.zza = this.zza;
                    int unused2 = subscriptionUpdateParams.zzb = this.zzb;
                    return subscriptionUpdateParams;
                }
                throw new IllegalArgumentException("Old SKU purchase token/id must be provided.");
            }

            @zzc
            @NonNull
            public Builder setOldSkuPurchaseToken(@NonNull String str) {
                this.zza = str;
                return this;
            }

            @zzc
            @NonNull
            public Builder setReplaceSkusProrationMode(int i) {
                this.zzb = i;
                return this;
            }
        }

        private SubscriptionUpdateParams() {
        }

        /* synthetic */ SubscriptionUpdateParams(zzai zzai) {
        }

        @zzc
        @NonNull
        public static Builder newBuilder() {
            return new Builder((zzai) null);
        }

        /* access modifiers changed from: package-private */
        @zzc
        public String getOldSkuPurchaseToken() {
            return this.zza;
        }

        /* access modifiers changed from: package-private */
        @zzc
        public int getReplaceSkusProrationMode() {
            return this.zzb;
        }
    }

    private BillingFlowParams() {
    }

    /* synthetic */ BillingFlowParams(zzai zzai) {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder((zzai) null);
    }

    public boolean getVrPurchaseFlow() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zze;
    }

    @Nullable
    public final String zzf() {
        return this.zzb;
    }

    @Nullable
    public final String zzg() {
        return this.zzd;
    }

    @Nullable
    public final String zzh() {
        return this.zzc;
    }

    @NonNull
    public final ArrayList<SkuDetails> zzj() {
        ArrayList<SkuDetails> arrayList = new ArrayList<>();
        arrayList.addAll(this.zzf);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzm() {
        return (!this.zzg && this.zzb == null && this.zzd == null && this.zze == 0 && !this.zza) ? false : true;
    }
}
