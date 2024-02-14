package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.zzaq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@4.0.0 */
public final class zza {

    /* renamed from: a */
    public static final int f45477a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static int m63882a(Bundle bundle, String str) {
        String str2;
        if (bundle == null) {
            m63892k(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m63891j(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            String name = obj.getClass().getName();
            if (name.length() != 0) {
                str2 = "Unexpected type for bundle response code: ".concat(name);
            } else {
                str2 = new String("Unexpected type for bundle response code: ");
            }
            m63892k(str, str2);
            return 6;
        }
    }

    /* renamed from: b */
    public static Bundle m63883b(AcknowledgePurchaseParams acknowledgePurchaseParams, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    /* renamed from: c */
    public static Bundle m63884c(ConsumeParams consumeParams, boolean z, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        return bundle;
    }

    /* renamed from: d */
    public static Bundle m63885d(int i, boolean z, String str, @Nullable String str2, ArrayList<zzaq> arrayList) {
        Bundle bundle = new Bundle();
        if (i >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (i >= 9 && z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i >= 14) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            boolean z2 = false;
            for (int i2 = 0; i2 < size; i2++) {
                zzaq zzaq = arrayList.get(i2);
                arrayList2.add((Object) null);
                z2 |= !TextUtils.isEmpty((CharSequence) null);
            }
            if (z2) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
        }
        return bundle;
    }

    /* renamed from: e */
    public static Bundle m63886e(BillingFlowParams billingFlowParams, boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (billingFlowParams.zzb() != 0) {
            bundle.putInt(BillingFlowParams.EXTRA_PARAM_KEY_REPLACE_SKUS_PRORATION_MODE, billingFlowParams.zzb());
        }
        if (!TextUtils.isEmpty(billingFlowParams.zzf())) {
            bundle.putString(BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, billingFlowParams.zzf());
        }
        if (!TextUtils.isEmpty(billingFlowParams.zzg())) {
            bundle.putString("obfuscatedProfileId", billingFlowParams.zzg());
        }
        if (billingFlowParams.getVrPurchaseFlow()) {
            bundle.putBoolean(BillingFlowParams.EXTRA_PARAM_KEY_VR, true);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bundle.putStringArrayList(BillingFlowParams.EXTRA_PARAM_KEY_OLD_SKUS, new ArrayList(Arrays.asList(new String[]{null})));
        }
        if (!TextUtils.isEmpty(billingFlowParams.zzh())) {
            bundle.putString(BillingFlowParams.EXTRA_PARAM_KEY_OLD_SKU_PURCHASE_TOKEN, billingFlowParams.zzh());
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bundle.putString("oldSkuPurchaseId", (String) null);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            bundle.putString("paymentsPurchaseParams", (String) null);
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    /* renamed from: f */
    public static Bundle m63887f(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    /* renamed from: g */
    public static BillingResult m63888g(Intent intent, String str) {
        if (intent == null) {
            m63892k("BillingHelper", "Got null intent!");
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(6);
            newBuilder.setDebugMessage("An internal error occurred.");
            return newBuilder.build();
        }
        BillingResult.Builder newBuilder2 = BillingResult.newBuilder();
        newBuilder2.setResponseCode(m63882a(intent.getExtras(), str));
        newBuilder2.setDebugMessage(m63889h(intent.getExtras(), str));
        return newBuilder2.build();
    }

    /* renamed from: h */
    public static String m63889h(Bundle bundle, String str) {
        if (bundle == null) {
            m63892k(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m63891j(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            String name = obj.getClass().getName();
            m63892k(str, name.length() != 0 ? "Unexpected type for debug message: ".concat(name) : new String("Unexpected type for debug message: "));
            return "";
        }
    }

    /* renamed from: i */
    public static List<Purchase> m63890i(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            m63892k("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
            Purchase l = m63893l(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (l == null) {
                m63892k("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(l);
        } else {
            int i = 0;
            while (i < stringArrayList.size() && i < stringArrayList2.size()) {
                Purchase l2 = m63893l(stringArrayList.get(i), stringArrayList2.get(i));
                if (l2 != null) {
                    arrayList.add(l2);
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static void m63891j(String str, String str2) {
        Log.isLoggable(str, 2);
    }

    /* renamed from: k */
    public static void m63892k(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* renamed from: l */
    private static Purchase m63893l(String str, String str2) {
        if (str == null || str2 == null) {
            m63892k("BillingHelper", "Received a bad purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 47);
            sb.append("Got JSONException while parsing purchase data: ");
            sb.append(valueOf);
            m63892k("BillingHelper", sb.toString());
            return null;
        }
    }
}
