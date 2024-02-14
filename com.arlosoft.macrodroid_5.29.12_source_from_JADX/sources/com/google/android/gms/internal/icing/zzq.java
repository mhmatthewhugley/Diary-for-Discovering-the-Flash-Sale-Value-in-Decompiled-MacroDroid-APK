package com.google.android.gms.internal.icing;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@VisibleForTesting
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzq {
    @VisibleForTesting

    /* renamed from: a */
    static final String[] f41038a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};

    /* renamed from: b */
    private static final Map<String, Integer> f41039b = new HashMap(10);

    static {
        int i = 0;
        while (true) {
            String[] strArr = f41038a;
            int length = strArr.length;
            if (i < 10) {
                f41039b.put(strArr[i], Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static String m59120a(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = f41038a;
        int length = strArr.length;
        if (i >= 10) {
            return null;
        }
        return strArr[i];
    }
}
