package com.google.android.play.core.common;

import android.os.Bundle;
import com.google.android.play.core.internal.zzag;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.3 */
public class PlayCoreVersion {

    /* renamed from: a */
    private static final Set f51644a = new HashSet(Arrays.asList(new String[]{"app_update", "review"}));

    /* renamed from: b */
    private static final Set f51645b = new HashSet(Arrays.asList(new String[]{"native", "unity"}));

    /* renamed from: c */
    private static final Map f51646c = new HashMap();

    /* renamed from: d */
    private static final zzag f51647d = new zzag("PlayCoreVersion");

    private PlayCoreVersion() {
    }

    /* renamed from: a */
    public static Bundle m70767a(String str) {
        Bundle bundle = new Bundle();
        Map b = m70768b(str);
        bundle.putInt("playcore_version_code", ((Integer) b.get("java")).intValue());
        if (b.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) b.get("native")).intValue());
        }
        if (b.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) b.get("unity")).intValue());
        }
        return bundle;
    }

    /* renamed from: b */
    public static synchronized Map m70768b(String str) {
        Map map;
        synchronized (PlayCoreVersion.class) {
            Map map2 = f51646c;
            if (!map2.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 11003);
                map2.put(str, hashMap);
            }
            map = (Map) map2.get(str);
        }
        return map;
    }
}
