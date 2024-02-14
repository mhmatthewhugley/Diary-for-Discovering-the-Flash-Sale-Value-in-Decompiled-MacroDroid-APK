package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import com.android.billingclient.api.Purchase;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.android.billingclient:billing@@4.0.0 */
public abstract class BillingClient {

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.android.billingclient:billing@@4.0.0 */
    public @interface BillingResponseCode {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;

        /* renamed from: OK */
        public static final int f1030OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;
        public static final int SERVICE_TIMEOUT = -3;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    @AnyThread
    /* compiled from: com.android.billingclient:billing@@4.0.0 */
    public static final class Builder {
        private volatile String zza;
        private volatile boolean zzb;
        private final Context zzc;
        private volatile PurchasesUpdatedListener zzd;

        /* synthetic */ Builder(Context context, zzi zzi) {
            this.zzc = context;
        }

        @NonNull
        public BillingClient build() {
            if (this.zzc == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            } else if (this.zzd == null) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            } else if (this.zzb) {
                return new BillingClientImpl((String) null, this.zzb, this.zzc, this.zzd);
            } else {
                throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
            }
        }

        @NonNull
        public Builder enablePendingPurchases() {
            this.zzb = true;
            return this;
        }

        @NonNull
        public Builder setListener(@NonNull PurchasesUpdatedListener purchasesUpdatedListener) {
            this.zzd = purchasesUpdatedListener;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.android.billingclient:billing@@4.0.0 */
    public @interface ConnectionState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.android.billingclient:billing@@4.0.0 */
    public @interface FeatureType {
        @NonNull
        public static final String IN_APP_ITEMS_ON_VR = "inAppItemsOnVr";
        @NonNull
        public static final String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";
        @NonNull
        public static final String SUBSCRIPTIONS = "subscriptions";
        @NonNull
        public static final String SUBSCRIPTIONS_ON_VR = "subscriptionsOnVr";
        @NonNull
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.android.billingclient:billing@@4.0.0 */
    public @interface SkuType {
        @NonNull
        public static final String INAPP = "inapp";
        @NonNull
        public static final String SUBS = "subs";
    }

    @NonNull
    @AnyThread
    public static Builder newBuilder(@NonNull Context context) {
        return new Builder(context, (zzi) null);
    }

    @AnyThread
    public abstract void acknowledgePurchase(@NonNull AcknowledgePurchaseParams acknowledgePurchaseParams, @NonNull AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    @AnyThread
    public abstract void consumeAsync(@NonNull ConsumeParams consumeParams, @NonNull ConsumeResponseListener consumeResponseListener);

    @AnyThread
    public abstract void endConnection();

    @AnyThread
    public abstract int getConnectionState();

    @NonNull
    @AnyThread
    public abstract BillingResult isFeatureSupported(@NonNull String str);

    @AnyThread
    public abstract boolean isReady();

    @UiThread
    @NonNull
    public abstract BillingResult launchBillingFlow(@NonNull Activity activity, @NonNull BillingFlowParams billingFlowParams);

    @UiThread
    public abstract void launchPriceChangeConfirmationFlow(@NonNull Activity activity, @NonNull PriceChangeFlowParams priceChangeFlowParams, @NonNull PriceChangeConfirmationListener priceChangeConfirmationListener);

    @AnyThread
    public abstract void queryPurchaseHistoryAsync(@NonNull String str, @NonNull PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    @NonNull
    @Deprecated
    public abstract Purchase.PurchasesResult queryPurchases(@NonNull String str);

    @AnyThread
    @zze
    public abstract void queryPurchasesAsync(@NonNull String str, @NonNull PurchasesResponseListener purchasesResponseListener);

    @AnyThread
    public abstract void querySkuDetailsAsync(@NonNull SkuDetailsParams skuDetailsParams, @NonNull SkuDetailsResponseListener skuDetailsResponseListener);

    @AnyThread
    public abstract void startConnection(@NonNull BillingClientStateListener billingClientStateListener);
}
