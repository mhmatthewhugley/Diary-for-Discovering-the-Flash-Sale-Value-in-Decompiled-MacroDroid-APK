package com.arlosoft.macrodroid.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.arlosoft.macrodroid.utils.m0 */
/* compiled from: LocaleUtils */
public class C6404m0 {

    /* renamed from: a */
    private static final List f15018a = Collections.unmodifiableList(Arrays.asList(Locale.getAvailableLocales()));

    /* renamed from: b */
    private static final Map f15019b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private static final Map f15020c = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public static Locale m24660a(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.equals("zh-rCN")) {
                return Locale.SIMPLIFIED_CHINESE;
            }
            int length = str.length();
            char charAt = str.charAt(0);
            char charAt2 = str.charAt(1);
            if (charAt < 'a' || charAt > 'z' || charAt2 < 'a' || charAt2 > 'z') {
                throw new IllegalArgumentException("Invalid locale format: " + str);
            } else if (length == 2) {
                return new Locale(str, "");
            } else {
                if (str.charAt(2) == '_') {
                    char charAt3 = str.charAt(3);
                    if (charAt3 == '_') {
                        return new Locale(str.substring(0, 2), "", str.substring(4));
                    }
                    char charAt4 = str.charAt(4);
                    if (charAt3 < 'A' || charAt3 > 'Z' || charAt4 < 'A' || charAt4 > 'Z') {
                        throw new IllegalArgumentException("Invalid locale format: " + str);
                    } else if (length == 5) {
                        return new Locale(str.substring(0, 2), str.substring(3, 5));
                    } else {
                        if (str.charAt(5) == '_') {
                            return new Locale(str.substring(0, 2), str.substring(3, 5), str.substring(6));
                        }
                        throw new IllegalArgumentException("Invalid locale format: " + str);
                    }
                } else {
                    throw new IllegalArgumentException("Invalid locale format: " + str);
                }
            }
        } catch (Exception unused) {
            return Locale.getDefault();
        }
    }
}
