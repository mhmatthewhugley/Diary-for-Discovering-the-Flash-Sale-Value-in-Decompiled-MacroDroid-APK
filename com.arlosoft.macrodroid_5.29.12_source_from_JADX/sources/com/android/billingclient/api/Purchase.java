package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@4.0.0 */
public class Purchase {
    private final String zza;
    private final String zzb;
    private final JSONObject zzc;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.android.billingclient:billing@@4.0.0 */
    public @interface PurchaseState {
        public static final int PENDING = 2;
        public static final int PURCHASED = 1;
        public static final int UNSPECIFIED_STATE = 0;
    }

    /* compiled from: com.android.billingclient:billing@@4.0.0 */
    public static class PurchasesResult {
        @Nullable
        private final List<Purchase> zza;
        private final BillingResult zzb;

        public PurchasesResult(@NonNull BillingResult billingResult, @Nullable List<Purchase> list) {
            this.zza = list;
            this.zzb = billingResult;
        }

        @NonNull
        public BillingResult getBillingResult() {
            return this.zzb;
        }

        @Nullable
        public List<Purchase> getPurchasesList() {
            return this.zza;
        }

        public int getResponseCode() {
            return getBillingResult().getResponseCode();
        }
    }

    public Purchase(@NonNull String str, @NonNull String str2) throws JSONException {
        this.zza = str;
        this.zzb = str2;
        this.zzc = new JSONObject(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.zza, purchase.getOriginalJson()) && TextUtils.equals(this.zzb, purchase.getSignature());
    }

    @Nullable
    public AccountIdentifiers getAccountIdentifiers() {
        String optString = this.zzc.optString("obfuscatedAccountId");
        String optString2 = this.zzc.optString("obfuscatedProfileId");
        if (optString == null && optString2 == null) {
            return null;
        }
        return new AccountIdentifiers(optString, optString2);
    }

    @NonNull
    public String getDeveloperPayload() {
        return this.zzc.optString("developerPayload");
    }

    @NonNull
    public String getOrderId() {
        return this.zzc.optString("orderId");
    }

    @NonNull
    public String getOriginalJson() {
        return this.zza;
    }

    @NonNull
    public String getPackageName() {
        return this.zzc.optString("packageName");
    }

    public int getPurchaseState() {
        return this.zzc.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long getPurchaseTime() {
        return this.zzc.optLong("purchaseTime");
    }

    @NonNull
    public String getPurchaseToken() {
        JSONObject jSONObject = this.zzc;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    @zzd
    public int getQuantity() {
        return this.zzc.optInt("quantity", 1);
    }

    @NonNull
    public String getSignature() {
        return this.zzb;
    }

    @zzc
    @NonNull
    public ArrayList<String> getSkus() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.zzc.has("productIds")) {
            JSONArray optJSONArray = this.zzc.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (this.zzc.has("productId")) {
            arrayList.add(this.zzc.optString("productId"));
        }
        return arrayList;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    public boolean isAcknowledged() {
        return this.zzc.optBoolean("acknowledged", true);
    }

    public boolean isAutoRenewing() {
        return this.zzc.optBoolean("autoRenewing");
    }

    @NonNull
    public String toString() {
        String valueOf = String.valueOf(this.zza);
        return valueOf.length() != 0 ? "Purchase. Json: ".concat(valueOf) : new String("Purchase. Json: ");
    }
}
