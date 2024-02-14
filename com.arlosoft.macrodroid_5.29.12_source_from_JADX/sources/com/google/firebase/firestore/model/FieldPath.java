package com.google.firebase.firestore.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class FieldPath extends BasePath<FieldPath> {

    /* renamed from: c */
    public static final FieldPath f54449c = m75865t("__name__");

    /* renamed from: d */
    public static final FieldPath f54450d = new FieldPath(Collections.emptyList());

    private FieldPath(List<String> list) {
        super(list);
    }

    /* renamed from: s */
    public static FieldPath m75864s(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '\\') {
                i++;
                if (i != str.length()) {
                    sb.append(str.charAt(i));
                } else {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
            } else if (charAt == '.') {
                if (!z) {
                    String sb2 = sb.toString();
                    if (!sb2.isEmpty()) {
                        StringBuilder sb3 = new StringBuilder();
                        arrayList.add(sb2);
                        sb = sb3;
                    } else {
                        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
                    }
                } else {
                    sb.append(charAt);
                }
            } else if (charAt == '`') {
                z = !z;
            } else {
                sb.append(charAt);
            }
            i++;
        }
        String sb4 = sb.toString();
        if (!sb4.isEmpty()) {
            arrayList.add(sb4);
            return new FieldPath(arrayList);
        }
        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
    }

    /* renamed from: t */
    public static FieldPath m75865t(String str) {
        return new FieldPath(Collections.singletonList(str));
    }

    /* renamed from: w */
    private static boolean m75866w(String str) {
        if (str.isEmpty()) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt != '_' && ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z'))) {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 != '_' && ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < '0' || charAt2 > '9')))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public String mo62797e() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f54436a.size(); i++) {
            if (i > 0) {
                sb.append(".");
            }
            String replace = this.f54436a.get(i).replace("\\", "\\\\").replace("`", "\\`");
            if (!m75866w(replace)) {
                replace = '`' + replace + '`';
            }
            sb.append(replace);
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public FieldPath mo62800g(List<String> list) {
        return new FieldPath(list);
    }

    /* renamed from: v */
    public boolean mo62849v() {
        return equals(f54449c);
    }
}
