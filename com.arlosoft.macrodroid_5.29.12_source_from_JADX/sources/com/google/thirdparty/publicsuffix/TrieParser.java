package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Queues;

@GwtCompatible
final class TrieParser {

    /* renamed from: a */
    private static final Joiner f57249a = Joiner.m5314i("");

    TrieParser() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065 A[EDGE_INSN: B:35:0x0065->B:27:0x0065 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m81650a(java.util.Deque<java.lang.CharSequence> r8, java.lang.CharSequence r9, int r10, com.google.common.collect.ImmutableMap.Builder<java.lang.String, com.google.thirdparty.publicsuffix.PublicSuffixType> r11) {
        /*
            int r0 = r9.length()
            r1 = 0
            r2 = r10
        L_0x0006:
            r3 = 58
            r4 = 33
            r5 = 44
            r6 = 63
            if (r2 >= r0) goto L_0x0024
            char r1 = r9.charAt(r2)
            r7 = 38
            if (r1 == r7) goto L_0x0024
            if (r1 == r6) goto L_0x0024
            if (r1 == r4) goto L_0x0024
            if (r1 == r3) goto L_0x0024
            if (r1 != r5) goto L_0x0021
            goto L_0x0024
        L_0x0021:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0024:
            java.lang.CharSequence r7 = r9.subSequence(r10, r2)
            java.lang.CharSequence r7 = m81652c(r7)
            r8.push(r7)
            if (r1 == r4) goto L_0x0037
            if (r1 == r6) goto L_0x0037
            if (r1 == r3) goto L_0x0037
            if (r1 != r5) goto L_0x004a
        L_0x0037:
            com.google.common.base.Joiner r3 = f57249a
            java.lang.String r3 = r3.mo22180e(r8)
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x004a
            com.google.thirdparty.publicsuffix.PublicSuffixType r4 = com.google.thirdparty.publicsuffix.PublicSuffixType.m81647d(r1)
            r11.mo35338g(r3, r4)
        L_0x004a:
            int r2 = r2 + 1
            if (r1 == r6) goto L_0x0065
            if (r1 == r5) goto L_0x0065
        L_0x0050:
            if (r2 >= r0) goto L_0x0065
            int r1 = m81650a(r8, r9, r2, r11)
            int r2 = r2 + r1
            char r1 = r9.charAt(r2)
            if (r1 == r6) goto L_0x0063
            char r1 = r9.charAt(r2)
            if (r1 != r5) goto L_0x0050
        L_0x0063:
            int r2 = r2 + 1
        L_0x0065:
            r8.pop()
            int r2 = r2 - r10
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.thirdparty.publicsuffix.TrieParser.m81650a(java.util.Deque, java.lang.CharSequence, int, com.google.common.collect.ImmutableMap$Builder):int");
    }

    /* renamed from: b */
    static ImmutableMap<String, PublicSuffixType> m81651b(CharSequence charSequence) {
        ImmutableMap.Builder a = ImmutableMap.m27348a();
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            i += m81650a(Queues.m28541a(), charSequence, i, a);
        }
        return a.mo35337d();
    }

    /* renamed from: c */
    private static CharSequence m81652c(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }
}
