package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo71668d2 = {"Lcom/android/billingclient/api/PurchasesResult;", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "purchasesList", "", "Lcom/android/billingclient/api/Purchase;", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "getBillingResult", "()Lcom/android/billingclient/api/BillingResult;", "getPurchasesList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "java.com.google.android.libraries.play.billing.public.ktbilling_granule"}, mo71669k = 1, mo71670mv = {1, 4, 2})
/* compiled from: com.android.billingclient:billing-ktx@@4.0.0 */
public final class PurchasesResult {
    private final BillingResult zza;
    private final List<Purchase> zzb;

    public PurchasesResult(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List<? extends Purchase> list) {
        C13706o.m87929f(billingResult, "billingResult");
        C13706o.m87929f(list, "purchasesList");
        this.zza = billingResult;
        this.zzb = list;
    }

    @RecentlyNonNull
    public static /* synthetic */ PurchasesResult copy$default(@RecentlyNonNull PurchasesResult purchasesResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List<Purchase> list, int i, @RecentlyNonNull Object obj) {
        if ((i & 1) != 0) {
            billingResult = purchasesResult.zza;
        }
        if ((i & 2) != 0) {
            list = purchasesResult.zzb;
        }
        return purchasesResult.copy(billingResult, list);
    }

    public final BillingResult component1() {
        return this.zza;
    }

    public final List<Purchase> component2() {
        return this.zzb;
    }

    public final PurchasesResult copy(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List<? extends Purchase> list) {
        C13706o.m87929f(billingResult, "billingResult");
        C13706o.m87929f(list, "purchasesList");
        return new PurchasesResult(billingResult, list);
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasesResult)) {
            return false;
        }
        PurchasesResult purchasesResult = (PurchasesResult) obj;
        return C13706o.m87924a(this.zza, purchasesResult.zza) && C13706o.m87924a(this.zzb, purchasesResult.zzb);
    }

    public final BillingResult getBillingResult() {
        return this.zza;
    }

    public final List<Purchase> getPurchasesList() {
        return this.zzb;
    }

    public int hashCode() {
        BillingResult billingResult = this.zza;
        int i = 0;
        int hashCode = (billingResult != null ? billingResult.hashCode() : 0) * 31;
        List<Purchase> list = this.zzb;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "PurchasesResult(billingResult=" + this.zza + ", purchasesList=" + this.zzb + ")";
    }
}
