package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Escapers {

    /* renamed from: a */
    private static final Escaper f17349a = new CharEscaper() {
        /* renamed from: a */
        public String mo36786a(String str) {
            return (String) Preconditions.m5392s(str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public char[] mo36787b(char c) {
            return null;
        }
    };

    /* renamed from: com.google.common.escape.Escapers$2 */
    class C71482 extends UnicodeEscaper {

        /* renamed from: b */
        final /* synthetic */ CharEscaper f17350b;

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public char[] mo36790c(int i) {
            if (i < 65536) {
                return this.f17350b.mo36787b((char) i);
            }
            char[] cArr = new char[2];
            Character.toChars(i, cArr, 0);
            char[] b = this.f17350b.mo36787b(cArr[0]);
            char[] b2 = this.f17350b.mo36787b(cArr[1]);
            if (b == null && b2 == null) {
                return null;
            }
            int length = b != null ? b.length : 1;
            char[] cArr2 = new char[((b2 != null ? b2.length : 1) + length)];
            if (b != null) {
                for (int i2 = 0; i2 < b.length; i2++) {
                    cArr2[i2] = b[i2];
                }
            } else {
                cArr2[0] = cArr[0];
            }
            if (b2 != null) {
                for (int i3 = 0; i3 < b2.length; i3++) {
                    cArr2[length + i3] = b2[i3];
                }
            } else {
                cArr2[length] = cArr[1];
            }
            return cArr2;
        }
    }

    public static final class Builder {

        /* renamed from: a */
        private final Map<Character, String> f17351a;

        /* renamed from: b */
        private char f17352b;

        /* renamed from: c */
        private char f17353c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f17354d;

        @CanIgnoreReturnValue
        /* renamed from: b */
        public Builder mo36794b(char c, String str) {
            Preconditions.m5392s(str);
            this.f17351a.put(Character.valueOf(c), str);
            return this;
        }

        /* renamed from: c */
        public Escaper mo36795c() {
            return new ArrayBasedCharEscaper(this.f17351a, this.f17352b, this.f17353c) {

                /* renamed from: f */
                private final char[] f17355f;

                {
                    this.f17355f = Builder.this.f17354d != null ? Builder.this.f17354d.toCharArray() : null;
                }

                /* access modifiers changed from: protected */
                /* renamed from: e */
                public char[] mo36788e(char c) {
                    return this.f17355f;
                }
            };
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public Builder mo36796d(char c, char c2) {
            this.f17352b = c;
            this.f17353c = c2;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public Builder mo36797e(String str) {
            this.f17354d = str;
            return this;
        }

        private Builder() {
            this.f17351a = new HashMap();
            this.f17352b = 0;
            this.f17353c = 65535;
            this.f17354d = null;
        }
    }

    private Escapers() {
    }

    /* renamed from: a */
    public static Builder m29222a() {
        return new Builder();
    }
}
