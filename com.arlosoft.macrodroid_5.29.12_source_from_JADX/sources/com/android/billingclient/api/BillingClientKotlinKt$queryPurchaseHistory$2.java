package com.android.billingclient.api;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15559w;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002,\u0010\u0006\u001a(\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u0001 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00050\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, mo71668d2 = {"Lcom/android/billingclient/api/BillingResult;", "kotlin.jvm.PlatformType", "billingResult", "", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "", "purchaseHistoryRecordList", "Lja/u;", "onPurchaseHistoryResponse", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 2})
/* compiled from: com.android.billingclient:billing-ktx@@4.0.0 */
final class BillingClientKotlinKt$queryPurchaseHistory$2 implements PurchaseHistoryResponseListener {
    final /* synthetic */ C15559w $deferred;

    BillingClientKotlinKt$queryPurchaseHistory$2(C15559w wVar) {
        this.$deferred = wVar;
    }

    public final void onPurchaseHistoryResponse(BillingResult billingResult, List<PurchaseHistoryRecord> list) {
        C13706o.m87928e(billingResult, "billingResult");
        this.$deferred.mo74924u(new PurchaseHistoryResult(billingResult, list));
    }
}
