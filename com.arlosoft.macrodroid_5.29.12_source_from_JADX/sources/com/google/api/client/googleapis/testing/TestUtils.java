package com.google.api.client.googleapis.testing;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class TestUtils {
    private TestUtils() {
    }

    /* renamed from: a */
    public static Map<String, String> m71931a(String str) throws IOException {
        HashMap hashMap = new HashMap();
        for (String k : Splitter.m5427f('&').mo22236k(str)) {
            ArrayList<E> i = Lists.m27833i(Splitter.m5427f('=').mo22236k(k));
            if (i.size() == 2) {
                hashMap.put(URLDecoder.decode((String) i.get(0), "UTF-8"), URLDecoder.decode((String) i.get(1), "UTF-8"));
            } else {
                throw new IOException("Invalid Query String");
            }
        }
        return hashMap;
    }
}
