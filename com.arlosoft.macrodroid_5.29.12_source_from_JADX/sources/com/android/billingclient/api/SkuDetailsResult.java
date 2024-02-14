package com.android.billingclient.api;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo71668d2 = {"Lcom/android/billingclient/api/SkuDetailsResult;", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "skuDetailsList", "", "Lcom/android/billingclient/api/SkuDetails;", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "getBillingResult", "()Lcom/android/billingclient/api/BillingResult;", "getSkuDetailsList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "java.com.google.android.libraries.play.billing.public.ktbilling_granule"}, mo71669k = 1, mo71670mv = {1, 4, 2})
/* compiled from: com.android.billingclient:billing-ktx@@4.0.0 */
public final class SkuDetailsResult {
    private final BillingResult zza;
    private final List<SkuDetails> zzb;

    public SkuDetailsResult(@RecentlyNonNull BillingResult billingResult, @Nullable List<? extends SkuDetails> list) {
        C13706o.m87929f(billingResult, "billingResult");
        this.zza = billingResult;
        this.zzb = list;
    }

    @RecentlyNonNull
    public static /* synthetic */ SkuDetailsResult copy$default(@RecentlyNonNull SkuDetailsResult skuDetailsResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List<SkuDetails> list, int i, @RecentlyNonNull Object obj) {
        if ((i & 1) != 0) {
            billingResult = skuDetailsResult.zza;
        }
        if ((i & 2) != 0) {
            list = skuDetailsResult.zzb;
        }
        return skuDetailsResult.copy(billingResult, list);
    }

    public final BillingResult component1() {
        return this.zza;
    }

    @RecentlyNonNull
    public final List<SkuDetails> component2() {
        return this.zzb;
    }

    public final SkuDetailsResult copy(@RecentlyNonNull BillingResult billingResult, @Nullable List<? extends SkuDetails> list) {
        C13706o.m87929f(billingResult, "billingResult");
        return new SkuDetailsResult(billingResult, list);
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetailsResult)) {
            return false;
        }
        SkuDetailsResult skuDetailsResult = (SkuDetailsResult) obj;
        return C13706o.m87924a(this.zza, skuDetailsResult.zza) && C13706o.m87924a(this.zzb, skuDetailsResult.zzb);
    }

    public final BillingResult getBillingResult() {
        return this.zza;
    }

    @RecentlyNonNull
    public final List<SkuDetails> getSkuDetailsList() {
        return this.zzb;
    }

    public int hashCode() {
        BillingResult billingResult = this.zza;
        int i = 0;
        int hashCode = (billingResult != null ? billingResult.hashCode() : 0) * 31;
        List<SkuDetails> list = this.zzb;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SkuDetailsResult(billingResult=" + this.zza + ", skuDetailsList=" + this.zzb + ")";
    }
}
