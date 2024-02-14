package com.arlosoft.macrodroid.utils;

import android.webkit.MimeTypeMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.arlosoft.macrodroid.utils.t0 */
/* compiled from: MimeTypes */
public class C6435t0 {

    /* renamed from: a */
    private final Map<String, String> f15062a = new HashMap();

    /* renamed from: a */
    public String mo32493a(String str) {
        String mimeTypeFromExtension;
        String g = C6362a0.m24601g(str);
        if (g.length() > 0 && (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(g.substring(1))) != null) {
            return mimeTypeFromExtension;
        }
        String str2 = this.f15062a.get(g.toLowerCase());
        return str2 == null ? "*/*" : str2;
    }
}
