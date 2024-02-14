package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlinx.coroutines.C15559w;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.C15569y;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u001f\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0011H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo71668d2 = {"Lcom/android/billingclient/api/BillingClient;", "Lcom/android/billingclient/api/AcknowledgePurchaseParams;", "params", "Lcom/android/billingclient/api/BillingResult;", "acknowledgePurchase", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/AcknowledgePurchaseParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/android/billingclient/api/ConsumeParams;", "Lcom/android/billingclient/api/ConsumeResult;", "consumePurchase", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/ConsumeParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "skuType", "Lcom/android/billingclient/api/PurchaseHistoryResult;", "queryPurchaseHistory", "(Lcom/android/billingclient/api/BillingClient;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/android/billingclient/api/PurchasesResult;", "queryPurchasesAsync", "Lcom/android/billingclient/api/SkuDetailsParams;", "Lcom/android/billingclient/api/SkuDetailsResult;", "querySkuDetails", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/SkuDetailsParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "java.com.google.android.libraries.play.billing.public.ktbilling_granule"}, mo71669k = 2, mo71670mv = {1, 4, 2})
/* compiled from: com.android.billingclient:billing-ktx@@4.0.0 */
public final class BillingClientKotlinKt {
    @RecentlyNonNull
    public static final Object acknowledgePurchase(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull AcknowledgePurchaseParams acknowledgePurchaseParams, @RecentlyNonNull C13635d<? super BillingResult> dVar) {
        C15559w b = C15569y.m94743b((C15561w1) null, 1, (Object) null);
        billingClient.acknowledgePurchase(acknowledgePurchaseParams, new BillingClientKotlinKt$acknowledgePurchase$2(b));
        return b.mo74869h(dVar);
    }

    @RecentlyNonNull
    public static final Object consumePurchase(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull ConsumeParams consumeParams, @RecentlyNonNull C13635d<? super ConsumeResult> dVar) {
        C15559w b = C15569y.m94743b((C15561w1) null, 1, (Object) null);
        billingClient.consumeAsync(consumeParams, new BillingClientKotlinKt$consumePurchase$2(b));
        return b.mo74869h(dVar);
    }

    @RecentlyNonNull
    public static final Object queryPurchaseHistory(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull String str, @RecentlyNonNull C13635d<? super PurchaseHistoryResult> dVar) {
        C15559w b = C15569y.m94743b((C15561w1) null, 1, (Object) null);
        billingClient.queryPurchaseHistoryAsync(str, new BillingClientKotlinKt$queryPurchaseHistory$2(b));
        return b.mo74869h(dVar);
    }

    @RecentlyNonNull
    public static final Object queryPurchasesAsync(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull String str, @RecentlyNonNull C13635d<? super PurchasesResult> dVar) {
        C15559w b = C15569y.m94743b((C15561w1) null, 1, (Object) null);
        billingClient.queryPurchasesAsync(str, new BillingClientKotlinKt$queryPurchasesAsync$2(b));
        return b.mo74869h(dVar);
    }

    @RecentlyNonNull
    public static final Object querySkuDetails(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull SkuDetailsParams skuDetailsParams, @RecentlyNonNull C13635d<? super SkuDetailsResult> dVar) {
        C15559w b = C15569y.m94743b((C15561w1) null, 1, (Object) null);
        billingClient.querySkuDetailsAsync(skuDetailsParams, new BillingClientKotlinKt$querySkuDetails$2(b));
        return b.mo74869h(dVar);
    }
}
