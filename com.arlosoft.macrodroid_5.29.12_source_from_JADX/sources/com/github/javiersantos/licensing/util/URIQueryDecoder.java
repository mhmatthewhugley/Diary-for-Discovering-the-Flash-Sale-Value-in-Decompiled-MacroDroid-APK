package com.github.javiersantos.licensing.util;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Map;
import java.util.Scanner;

public class URIQueryDecoder {
    /* renamed from: a */
    public static void m26192a(URI uri, Map<String, String> map) {
        String str;
        Scanner scanner = new Scanner(uri.getRawQuery());
        scanner.useDelimiter("&");
        while (scanner.hasNext()) {
            try {
                String[] split = scanner.next().split("=");
                if (split.length == 1) {
                    str = null;
                } else if (split.length == 2) {
                    str = URLDecoder.decode(split[1], "UTF-8");
                } else {
                    throw new IllegalArgumentException("query parameter invalid");
                }
                map.put(URLDecoder.decode(split[0], "UTF-8"), str);
            } catch (UnsupportedEncodingException unused) {
                Log.e("URIQueryDecoder", "UTF-8 Not Recognized as a charset.  Device configuration Error.");
                return;
            }
        }
    }
}
