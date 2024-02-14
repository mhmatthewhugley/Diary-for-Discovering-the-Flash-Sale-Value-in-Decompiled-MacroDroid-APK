package com.android.billingclient.api;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15559w;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo71668d2 = {"Lcom/android/billingclient/api/BillingResult;", "kotlin.jvm.PlatformType", "billingResult", "", "purchaseToken", "Lja/u;", "onConsumeResponse", "(Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 2})
/* compiled from: com.android.billingclient:billing-ktx@@4.0.0 */
final class BillingClientKotlinKt$consumePurchase$2 implements ConsumeResponseListener {
    final /* synthetic */ C15559w $deferred;

    BillingClientKotlinKt$consumePurchase$2(C15559w wVar) {
        this.$deferred = wVar;
    }

    public final void onConsumeResponse(BillingResult billingResult, String str) {
        C13706o.m87928e(billingResult, "billingResult");
        this.$deferred.mo74924u(new ConsumeResult(billingResult, str));
    }
}
