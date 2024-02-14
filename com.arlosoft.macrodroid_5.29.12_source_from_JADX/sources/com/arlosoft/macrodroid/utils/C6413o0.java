package com.arlosoft.macrodroid.utils;

import android.text.Html;
import android.text.Spanned;

/* renamed from: com.arlosoft.macrodroid.utils.o0 */
/* compiled from: MDTextUtils */
public class C6413o0 {
    /* renamed from: a */
    public static Spanned m24692a(String str) {
        return Html.fromHtml(str);
    }

    /* renamed from: b */
    public static String m24693b(String str, int i) {
        if (str == null || str.length() <= i) {
            return str;
        }
        return str.substring(0, i) + "..";
    }

    /* renamed from: c */
    public static String m24694c(String str, int i) {
        if (str == null) {
            return "";
        }
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
        }
        if (str == null || str.length() <= i) {
            return str;
        }
        return str.substring(0, i) + "..";
    }
}
