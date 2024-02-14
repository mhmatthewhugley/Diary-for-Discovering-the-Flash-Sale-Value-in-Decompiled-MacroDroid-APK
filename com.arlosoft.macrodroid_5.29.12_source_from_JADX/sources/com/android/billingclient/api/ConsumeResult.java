package com.android.billingclient.api;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo71668d2 = {"Lcom/android/billingclient/api/ConsumeResult;", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "purchaseToken", "", "(Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;)V", "getBillingResult", "()Lcom/android/billingclient/api/BillingResult;", "getPurchaseToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "java.com.google.android.libraries.play.billing.public.ktbilling_granule"}, mo71669k = 1, mo71670mv = {1, 4, 2})
/* compiled from: com.android.billingclient:billing-ktx@@4.0.0 */
public final class ConsumeResult {
    private final BillingResult zza;
    private final String zzb;

    public ConsumeResult(@RecentlyNonNull BillingResult billingResult, @Nullable String str) {
        C13706o.m87929f(billingResult, "billingResult");
        this.zza = billingResult;
        this.zzb = str;
    }

    @RecentlyNonNull
    public static /* synthetic */ ConsumeResult copy$default(@RecentlyNonNull ConsumeResult consumeResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull String str, int i, @RecentlyNonNull Object obj) {
        if ((i & 1) != 0) {
            billingResult = consumeResult.zza;
        }
        if ((i & 2) != 0) {
            str = consumeResult.zzb;
        }
        return consumeResult.copy(billingResult, str);
    }

    public final BillingResult component1() {
        return this.zza;
    }

    @RecentlyNonNull
    public final String component2() {
        return this.zzb;
    }

    public final ConsumeResult copy(@RecentlyNonNull BillingResult billingResult, @Nullable String str) {
        C13706o.m87929f(billingResult, "billingResult");
        return new ConsumeResult(billingResult, str);
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumeResult)) {
            return false;
        }
        ConsumeResult consumeResult = (ConsumeResult) obj;
        return C13706o.m87924a(this.zza, consumeResult.zza) && C13706o.m87924a(this.zzb, consumeResult.zzb);
    }

    public final BillingResult getBillingResult() {
        return this.zza;
    }

    @RecentlyNonNull
    public final String getPurchaseToken() {
        return this.zzb;
    }

    public int hashCode() {
        BillingResult billingResult = this.zza;
        int i = 0;
        int hashCode = (billingResult != null ? billingResult.hashCode() : 0) * 31;
        String str = this.zzb;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ConsumeResult(billingResult=" + this.zza + ", purchaseToken=" + this.zzb + ")";
    }
}
