package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.List;

@zze
/* compiled from: com.android.billingclient:billing@@4.0.0 */
public interface PurchasesResponseListener {
    @zze
    void onQueryPurchasesResponse(@NonNull BillingResult billingResult, @NonNull List<Purchase> list);
}
