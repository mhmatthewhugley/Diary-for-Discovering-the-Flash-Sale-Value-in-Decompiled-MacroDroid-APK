package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ArrayBasedCharEscaper extends CharEscaper {

    /* renamed from: b */
    private final char[][] f17332b;

    /* renamed from: c */
    private final int f17333c;

    /* renamed from: d */
    private final char f17334d;

    /* renamed from: e */
    private final char f17335e;

    protected ArrayBasedCharEscaper(Map<Character, String> map, char c, char c2) {
        this(ArrayBasedEscaperMap.m29208a(map), c, c2);
    }

    /* renamed from: a */
    public final String mo36786a(String str) {
        Preconditions.m5392s(str);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < this.f17333c && this.f17332b[charAt] != null) || charAt > this.f17335e || charAt < this.f17334d) {
                return mo36793c(str, i);
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final char[] mo36787b(char c) {
        char[] cArr;
        if (c < this.f17333c && (cArr = this.f17332b[c]) != null) {
            return cArr;
        }
        if (c < this.f17334d || c > this.f17335e) {
            return mo36788e(c);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract char[] mo36788e(char c);

    protected ArrayBasedCharEscaper(ArrayBasedEscaperMap arrayBasedEscaperMap, char c, char c2) {
        Preconditions.m5392s(arrayBasedEscaperMap);
        char[][] c3 = arrayBasedEscaperMap.mo36789c();
        this.f17332b = c3;
        this.f17333c = c3.length;
        if (c2 < c) {
            c2 = 0;
            c = 65535;
        }
        this.f17334d = c;
        this.f17335e = c2;
    }
}
