package com.android.billingclient.api;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15559w;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Lcom/android/billingclient/api/BillingResult;", "kotlin.jvm.PlatformType", "it", "Lja/u;", "onAcknowledgePurchaseResponse", "(Lcom/android/billingclient/api/BillingResult;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 2})
/* compiled from: com.android.billingclient:billing-ktx@@4.0.0 */
final class BillingClientKotlinKt$acknowledgePurchase$2 implements AcknowledgePurchaseResponseListener {
    final /* synthetic */ C15559w $deferred;

    BillingClientKotlinKt$acknowledgePurchase$2(C15559w wVar) {
        this.$deferred = wVar;
    }

    public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
        C15559w wVar = this.$deferred;
        C13706o.m87928e(billingResult, "it");
        wVar.mo74924u(billingResult);
    }
}
