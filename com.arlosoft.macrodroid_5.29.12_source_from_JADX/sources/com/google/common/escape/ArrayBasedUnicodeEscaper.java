package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ArrayBasedUnicodeEscaper extends UnicodeEscaper {

    /* renamed from: b */
    private final char[][] f17338b;

    /* renamed from: c */
    private final int f17339c;

    /* renamed from: d */
    private final int f17340d;

    /* renamed from: e */
    private final int f17341e;

    /* renamed from: f */
    private final char f17342f;

    /* renamed from: g */
    private final char f17343g;

    /* renamed from: a */
    public final String mo36786a(String str) {
        Preconditions.m5392s(str);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < this.f17339c && this.f17338b[charAt] != null) || charAt > this.f17343g || charAt < this.f17342f) {
                return mo36800d(str, i);
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final char[] mo36790c(int i) {
        char[] cArr;
        if (i < this.f17339c && (cArr = this.f17338b[i]) != null) {
            return cArr;
        }
        if (i < this.f17340d || i > this.f17341e) {
            return mo36792g(i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo36791f(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if ((charAt < this.f17339c && this.f17338b[charAt] != null) || charAt > this.f17343g || charAt < this.f17342f) {
                break;
            }
            i++;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract char[] mo36792g(int i);
}
