package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import androidx.webkit.ProxyConfig;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzhl {
    /* renamed from: a */
    public static IntentFilter m67098a(String str) {
        IntentFilter intentFilter = new IntentFilter(str);
        intentFilter.addDataScheme("wear");
        intentFilter.addDataAuthority(ProxyConfig.MATCH_ALL_SCHEMES, (String) null);
        return intentFilter;
    }
}
