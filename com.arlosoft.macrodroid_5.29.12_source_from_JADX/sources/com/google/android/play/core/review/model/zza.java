package com.google.android.play.core.review.model;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zza {

    /* renamed from: a */
    private static final Map f51742a;

    /* renamed from: b */
    private static final Map f51743b;

    static {
        HashMap hashMap = new HashMap();
        f51742a = hashMap;
        HashMap hashMap2 = new HashMap();
        f51743b = hashMap2;
        hashMap.put(-1, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-2, "INVALID_REQUEST");
    }
}
