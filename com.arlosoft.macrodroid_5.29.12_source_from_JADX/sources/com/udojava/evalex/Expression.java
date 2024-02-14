package com.udojava.evalex;

import androidx.webkit.ProxyConfig;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import org.apache.commons.cli.HelpFormatter;
import p333n8.C15757a;
import p333n8.C15759c;

public class Expression {

    /* renamed from: k */
    public static final BigDecimal f57734k;

    /* renamed from: l */
    public static final BigDecimal f57735l;

    /* renamed from: m */
    private static final Map<String, BigDecimal> f57736m;

    /* renamed from: n */
    private static final C11882y1 f57737n = new C11838k();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public MathContext f57738a;

    /* renamed from: b */
    private int f57739b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f57740c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f57741d;

    /* renamed from: e */
    private final String f57742e;

    /* renamed from: f */
    private String f57743f;

    /* renamed from: g */
    private List<C11807a2> f57744g;

    /* renamed from: h */
    protected Map<String, C11897g> f57745h;

    /* renamed from: i */
    protected Map<String, C11895e> f57746i;

    /* renamed from: j */
    protected Map<String, C11882y1> f57747j;

    public static class ExpressionException extends RuntimeException {
        private static final long serialVersionUID = 1118142866870779047L;

        public ExpressionException(String str) {
            super(str);
        }

        public ExpressionException(String str, int i) {
            super(str + " at character position " + i);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$a */
    class C11804a extends C11885z1 {
        C11804a(String str, int i, boolean z, boolean z2) {
            super(str, i, z, z2);
        }

        /* renamed from: d */
        public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            Expression.m82012h(bigDecimal, bigDecimal2);
            boolean z = true;
            if (bigDecimal.compareTo(BigDecimal.ZERO) != 0) {
                return BigDecimal.ONE;
            }
            if (bigDecimal2.compareTo(BigDecimal.ZERO) == 0) {
                z = false;
            }
            return z ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.udojava.evalex.Expression$a0 */
    class C11805a0 extends C11876w1 {
        C11805a0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(1.0d / Math.tan(Math.toRadians(list.get(0).doubleValue())), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$a1 */
    class C11806a1 extends C11876w1 {
        C11806a1(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            if (!list.isEmpty()) {
                BigDecimal bigDecimal = null;
                for (BigDecimal next : list) {
                    Expression.m82011g(next);
                    if (bigDecimal == null || next.compareTo(bigDecimal) > 0) {
                        bigDecimal = next;
                    }
                }
                return bigDecimal;
            }
            throw new ExpressionException("MAX requires at least one parameter");
        }
    }

    /* renamed from: com.udojava.evalex.Expression$a2 */
    public class C11807a2 {

        /* renamed from: a */
        public String f57751a = "";

        /* renamed from: b */
        public C11811b2 f57752b;

        /* renamed from: c */
        public int f57753c;

        public C11807a2() {
        }

        /* renamed from: a */
        public void mo67118a(char c) {
            this.f57751a += c;
        }

        /* renamed from: b */
        public void mo67119b(String str) {
            this.f57751a += str;
        }

        /* renamed from: c */
        public char mo67120c(int i) {
            return this.f57751a.charAt(i);
        }

        /* renamed from: d */
        public int mo67121d() {
            return this.f57751a.length();
        }

        public String toString() {
            return this.f57751a;
        }
    }

    /* renamed from: com.udojava.evalex.Expression$b */
    class C11808b extends C11885z1 {
        C11808b(String str, int i, boolean z, boolean z2) {
            super(str, i, z, z2);
        }

        /* renamed from: d */
        public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            Expression.m82012h(bigDecimal, bigDecimal2);
            return bigDecimal.compareTo(bigDecimal2) == 1 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.udojava.evalex.Expression$b0 */
    class C11809b0 extends C11876w1 {
        C11809b0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(1.0d / Math.cos(Math.toRadians(list.get(0).doubleValue())), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$b1 */
    class C11810b1 extends C11876w1 {
        C11810b1(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            if (!list.isEmpty()) {
                BigDecimal bigDecimal = null;
                for (BigDecimal next : list) {
                    Expression.m82011g(next);
                    if (bigDecimal == null || next.compareTo(bigDecimal) < 0) {
                        bigDecimal = next;
                    }
                }
                return bigDecimal;
            }
            throw new ExpressionException("MIN requires at least one parameter");
        }
    }

    /* renamed from: com.udojava.evalex.Expression$b2 */
    enum C11811b2 {
        VARIABLE,
        FUNCTION,
        LITERAL,
        OPERATOR,
        UNARY_OPERATOR,
        OPEN_PAREN,
        COMMA,
        CLOSE_PAREN,
        HEX_LITERAL,
        STRINGPARAM
    }

    /* renamed from: com.udojava.evalex.Expression$c */
    class C11812c extends C11885z1 {
        C11812c(String str, int i, boolean z, boolean z2) {
            super(str, i, z, z2);
        }

        /* renamed from: d */
        public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            Expression.m82012h(bigDecimal, bigDecimal2);
            return bigDecimal.compareTo(bigDecimal2) >= 0 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.udojava.evalex.Expression$c0 */
    class C11813c0 extends C11876w1 {
        C11813c0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(1.0d / Math.sin(Math.toRadians(list.get(0).doubleValue())), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$c1 */
    class C11814c1 extends C11885z1 {
        C11814c1(String str, int i, boolean z) {
            super(str, i, z);
        }

        /* renamed from: d */
        public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            Expression.m82012h(bigDecimal, bigDecimal2);
            return bigDecimal.multiply(bigDecimal2, Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$c2 */
    private class C11815c2 implements Iterator<C11807a2> {

        /* renamed from: a */
        private int f57772a = 0;

        /* renamed from: c */
        private String f57773c;

        /* renamed from: d */
        private C11807a2 f57774d;

        /* renamed from: f */
        private C11807a2 f57775f;

        public C11815c2(String str) {
            this.f57775f = new C11807a2();
            this.f57773c = str.trim();
        }

        /* renamed from: a */
        private char m82036a(C11807a2 a2Var) {
            String str = this.f57773c;
            int i = this.f57772a;
            this.f57772a = i + 1;
            a2Var.mo67118a(str.charAt(i));
            if (this.f57772a >= this.f57773c.length()) {
                return 0;
            }
            return this.f57773c.charAt(this.f57772a);
        }

        /* renamed from: b */
        private boolean m82037b(char c) {
            return c == 'x' || c == 'X' || (c >= '0' && c <= '9') || ((c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'));
        }

        /* renamed from: d */
        private char m82038d() {
            if (this.f57772a >= this.f57773c.length() - 1) {
                return 0;
            }
            return this.f57773c.charAt(this.f57772a + 1);
        }

        /* renamed from: e */
        private char m82039e() {
            int i = this.f57772a + 1;
            this.f57772a = i;
            if (i >= this.f57773c.length()) {
                return 0;
            }
            return this.f57773c.charAt(this.f57772a);
        }

        /* renamed from: g */
        private void m82040g(C11807a2 a2Var) {
            char e = m82039e();
            while (e != '\"' && e != 0) {
                e = m82036a(a2Var);
            }
            if (e != 0) {
                m82039e();
                a2Var.f57752b = C11811b2.STRINGPARAM;
                return;
            }
            throw new TokenizerException("unterminated string literal", a2Var.f57753c);
        }

        /* JADX WARNING: Removed duplicated region for block: B:135:0x0251  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x0254  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.udojava.evalex.Expression.C11807a2 next() {
            /*
                r11 = this;
                com.udojava.evalex.Expression$a2 r0 = new com.udojava.evalex.Expression$a2
                com.udojava.evalex.Expression r1 = com.udojava.evalex.Expression.this
                r0.<init>()
                int r1 = r11.f57772a
                java.lang.String r2 = r11.f57773c
                int r2 = r2.length()
                r3 = 0
                if (r1 < r2) goto L_0x0015
                r11.f57774d = r3
                return r3
            L_0x0015:
                java.lang.String r1 = r11.f57773c
                int r2 = r11.f57772a
                char r1 = r1.charAt(r2)
            L_0x001d:
                boolean r2 = java.lang.Character.isWhitespace(r1)
                if (r2 == 0) goto L_0x0032
                int r2 = r11.f57772a
                java.lang.String r4 = r11.f57773c
                int r4 = r4.length()
                if (r2 >= r4) goto L_0x0032
                char r1 = r11.m82039e()
                goto L_0x001d
            L_0x0032:
                int r2 = r11.f57772a
                r0.f57753c = r2
                java.lang.String r4 = r11.f57773c
                int r4 = r4.length()
                r5 = 1
                int r4 = r4 - r5
                if (r2 >= r4) goto L_0x0048
                com.udojava.evalex.Expression$a2 r2 = r11.f57775f
                int r3 = r11.f57772a
                int r3 = r3 + r5
                r2.f57753c = r3
                goto L_0x004a
            L_0x0048:
                r11.f57775f = r3
            L_0x004a:
                r2 = 0
                boolean r3 = java.lang.Character.isDigit(r1)
                r4 = 46
                if (r3 != 0) goto L_0x01d3
                if (r1 != r4) goto L_0x0061
                char r3 = r11.m82038d()
                boolean r3 = java.lang.Character.isDigit(r3)
                if (r3 == 0) goto L_0x0061
                goto L_0x01d3
            L_0x0061:
                r2 = 34
                if (r1 != r2) goto L_0x006a
                r11.m82040g(r0)
                goto L_0x0258
            L_0x006a:
                boolean r2 = java.lang.Character.isLetter(r1)
                r3 = 40
                if (r2 != 0) goto L_0x015a
                com.udojava.evalex.Expression r2 = com.udojava.evalex.Expression.this
                java.lang.String r2 = r2.f57740c
                int r2 = r2.indexOf(r1)
                if (r2 < 0) goto L_0x0080
                goto L_0x015a
            L_0x0080:
                r2 = 41
                if (r1 == r3) goto L_0x0143
                if (r1 == r2) goto L_0x0143
                r4 = 44
                if (r1 != r4) goto L_0x008c
                goto L_0x0143
            L_0x008c:
                int r1 = r11.f57772a
                java.lang.String r5 = r11.f57773c
                char r5 = r5.charAt(r1)
                r6 = -1
                java.lang.String r7 = ""
                r8 = -1
            L_0x0098:
                boolean r9 = java.lang.Character.isLetter(r5)
                if (r9 != 0) goto L_0x00e6
                boolean r9 = java.lang.Character.isDigit(r5)
                if (r9 != 0) goto L_0x00e6
                com.udojava.evalex.Expression r9 = com.udojava.evalex.Expression.this
                java.lang.String r9 = r9.f57740c
                int r9 = r9.indexOf(r5)
                if (r9 >= 0) goto L_0x00e6
                boolean r9 = java.lang.Character.isWhitespace(r5)
                if (r9 != 0) goto L_0x00e6
                if (r5 == r3) goto L_0x00e6
                if (r5 == r2) goto L_0x00e6
                if (r5 == r4) goto L_0x00e6
                int r9 = r11.f57772a
                java.lang.String r10 = r11.f57773c
                int r10 = r10.length()
                if (r9 >= r10) goto L_0x00e6
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r7)
                r9.append(r5)
                java.lang.String r7 = r9.toString()
                char r5 = r11.m82039e()
                com.udojava.evalex.Expression r9 = com.udojava.evalex.Expression.this
                java.util.Map<java.lang.String, com.udojava.evalex.g> r9 = r9.f57745h
                boolean r9 = r9.containsKey(r7)
                if (r9 == 0) goto L_0x0098
                int r8 = r11.f57772a
                goto L_0x0098
            L_0x00e6:
                if (r8 == r6) goto L_0x00f4
                java.lang.String r2 = r11.f57773c
                java.lang.String r1 = r2.substring(r1, r8)
                r0.mo67119b(r1)
                r11.f57772a = r8
                goto L_0x00f7
            L_0x00f4:
                r0.mo67119b(r7)
            L_0x00f7:
                com.udojava.evalex.Expression$a2 r1 = r11.f57774d
                if (r1 == 0) goto L_0x0128
                com.udojava.evalex.Expression$b2 r2 = r1.f57752b
                com.udojava.evalex.Expression$b2 r3 = com.udojava.evalex.Expression.C11811b2.OPERATOR
                if (r2 != r3) goto L_0x0113
                com.udojava.evalex.Expression r2 = com.udojava.evalex.Expression.this
                java.util.Map<java.lang.String, com.udojava.evalex.g> r2 = r2.f57745h
                java.lang.String r1 = r1.f57751a
                java.lang.Object r1 = r2.get(r1)
                com.udojava.evalex.g r1 = (com.udojava.evalex.C11897g) r1
                boolean r1 = r1.mo67140c()
                if (r1 == 0) goto L_0x0128
            L_0x0113:
                com.udojava.evalex.Expression$a2 r1 = r11.f57774d
                com.udojava.evalex.Expression$b2 r1 = r1.f57752b
                com.udojava.evalex.Expression$b2 r2 = com.udojava.evalex.Expression.C11811b2.OPEN_PAREN
                if (r1 == r2) goto L_0x0128
                com.udojava.evalex.Expression$b2 r2 = com.udojava.evalex.Expression.C11811b2.COMMA
                if (r1 == r2) goto L_0x0128
                com.udojava.evalex.Expression$b2 r2 = com.udojava.evalex.Expression.C11811b2.UNARY_OPERATOR
                if (r1 != r2) goto L_0x0124
                goto L_0x0128
            L_0x0124:
                r0.f57752b = r3
                goto L_0x0258
            L_0x0128:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r0.f57751a
                r1.append(r2)
                java.lang.String r2 = "u"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.f57751a = r1
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.UNARY_OPERATOR
                r0.f57752b = r1
                goto L_0x0258
            L_0x0143:
                if (r1 != r3) goto L_0x014a
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.OPEN_PAREN
                r0.f57752b = r1
                goto L_0x0155
            L_0x014a:
                if (r1 != r2) goto L_0x0151
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.CLOSE_PAREN
                r0.f57752b = r1
                goto L_0x0155
            L_0x0151:
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.COMMA
                r0.f57752b = r1
            L_0x0155:
                r11.m82036a(r0)
                goto L_0x0258
            L_0x015a:
                boolean r2 = java.lang.Character.isLetter(r1)
                if (r2 != 0) goto L_0x0184
                boolean r2 = java.lang.Character.isDigit(r1)
                if (r2 != 0) goto L_0x0184
                com.udojava.evalex.Expression r2 = com.udojava.evalex.Expression.this
                java.lang.String r2 = r2.f57741d
                int r2 = r2.indexOf(r1)
                if (r2 >= 0) goto L_0x0184
                int r2 = r0.mo67121d()
                if (r2 != 0) goto L_0x0193
                com.udojava.evalex.Expression r2 = com.udojava.evalex.Expression.this
                java.lang.String r2 = r2.f57740c
                int r2 = r2.indexOf(r1)
                if (r2 < 0) goto L_0x0193
            L_0x0184:
                int r2 = r11.f57772a
                java.lang.String r4 = r11.f57773c
                int r4 = r4.length()
                if (r2 >= r4) goto L_0x0193
                char r1 = r11.m82036a(r0)
                goto L_0x015a
            L_0x0193:
                boolean r2 = java.lang.Character.isWhitespace(r1)
                if (r2 == 0) goto L_0x01b3
            L_0x0199:
                boolean r2 = java.lang.Character.isWhitespace(r1)
                if (r2 == 0) goto L_0x01ae
                int r2 = r11.f57772a
                java.lang.String r4 = r11.f57773c
                int r4 = r4.length()
                if (r2 >= r4) goto L_0x01ae
                char r1 = r11.m82039e()
                goto L_0x0199
            L_0x01ae:
                int r2 = r11.f57772a
                int r2 = r2 - r5
                r11.f57772a = r2
            L_0x01b3:
                com.udojava.evalex.Expression r2 = com.udojava.evalex.Expression.this
                java.util.Map<java.lang.String, com.udojava.evalex.g> r2 = r2.f57745h
                java.lang.String r4 = r0.f57751a
                boolean r2 = r2.containsKey(r4)
                if (r2 == 0) goto L_0x01c5
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.OPERATOR
                r0.f57752b = r1
                goto L_0x0258
            L_0x01c5:
                if (r1 != r3) goto L_0x01cd
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.FUNCTION
                r0.f57752b = r1
                goto L_0x0258
            L_0x01cd:
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.VARIABLE
                r0.f57752b = r1
                goto L_0x0258
            L_0x01d3:
                r3 = 48
                if (r1 != r3) goto L_0x01e8
                char r3 = r11.m82038d()
                r6 = 120(0x78, float:1.68E-43)
                if (r3 == r6) goto L_0x01e7
                char r3 = r11.m82038d()
                r6 = 88
                if (r3 != r6) goto L_0x01e8
            L_0x01e7:
                r2 = 1
            L_0x01e8:
                if (r2 == 0) goto L_0x01f0
                boolean r3 = r11.m82037b(r1)
                if (r3 != 0) goto L_0x024a
            L_0x01f0:
                boolean r3 = java.lang.Character.isDigit(r1)
                if (r3 != 0) goto L_0x0240
                if (r1 == r4) goto L_0x0240
                r3 = 101(0x65, float:1.42E-43)
                if (r1 == r3) goto L_0x0240
                r6 = 69
                if (r1 == r6) goto L_0x0240
                r7 = 45
                if (r1 != r7) goto L_0x0220
                int r7 = r0.mo67121d()
                if (r7 <= 0) goto L_0x0220
                int r7 = r0.mo67121d()
                int r7 = r7 - r5
                char r7 = r0.mo67120c(r7)
                if (r3 == r7) goto L_0x0240
                int r7 = r0.mo67121d()
                int r7 = r7 - r5
                char r7 = r0.mo67120c(r7)
                if (r6 == r7) goto L_0x0240
            L_0x0220:
                r7 = 43
                if (r1 != r7) goto L_0x024f
                int r1 = r0.mo67121d()
                if (r1 <= 0) goto L_0x024f
                int r1 = r0.mo67121d()
                int r1 = r1 - r5
                char r1 = r0.mo67120c(r1)
                if (r3 == r1) goto L_0x0240
                int r1 = r0.mo67121d()
                int r1 = r1 - r5
                char r1 = r0.mo67120c(r1)
                if (r6 != r1) goto L_0x024f
            L_0x0240:
                int r1 = r11.f57772a
                java.lang.String r3 = r11.f57773c
                int r3 = r3.length()
                if (r1 >= r3) goto L_0x024f
            L_0x024a:
                char r1 = r11.m82036a(r0)
                goto L_0x01e8
            L_0x024f:
                if (r2 == 0) goto L_0x0254
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.HEX_LITERAL
                goto L_0x0256
            L_0x0254:
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.LITERAL
            L_0x0256:
                r0.f57752b = r1
            L_0x0258:
                r11.f57774d = r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.udojava.evalex.Expression.C11815c2.next():com.udojava.evalex.Expression$a2");
        }

        public boolean hasNext() {
            return this.f57772a < this.f57773c.length();
        }

        public void remove() {
            throw new ExpressionException("remove() not supported");
        }
    }

    /* renamed from: com.udojava.evalex.Expression$d */
    class C11816d extends C11885z1 {
        C11816d(String str, int i, boolean z, boolean z2) {
            super(str, i, z, z2);
        }

        /* renamed from: d */
        public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            Expression.m82012h(bigDecimal, bigDecimal2);
            return bigDecimal.compareTo(bigDecimal2) == -1 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.udojava.evalex.Expression$d0 */
    class C11817d0 extends C11876w1 {
        C11817d0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.asin(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$d1 */
    class C11818d1 extends C11876w1 {
        C11818d1(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return list.get(0).abs(Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$d2 */
    public abstract class C11819d2 extends C11891c {
        public C11819d2(String str, int i, boolean z) {
            super(str, i, z);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$e */
    class C11820e extends C11885z1 {
        C11820e(String str, int i, boolean z, boolean z2) {
            super(str, i, z, z2);
        }

        /* renamed from: d */
        public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            Expression.m82012h(bigDecimal, bigDecimal2);
            return bigDecimal.compareTo(bigDecimal2) <= 0 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.udojava.evalex.Expression$e0 */
    class C11821e0 extends C11876w1 {
        C11821e0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.acos(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$e1 */
    class C11822e1 extends C11876w1 {
        C11822e1(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.log(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$f */
    class C11823f extends C11885z1 {
        C11823f(String str, int i, boolean z, boolean z2) {
            super(str, i, z, z2);
        }

        /* renamed from: d */
        public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            if (bigDecimal == bigDecimal2) {
                return BigDecimal.ONE;
            }
            if (bigDecimal == null || bigDecimal2 == null) {
                return BigDecimal.ZERO;
            }
            return bigDecimal.compareTo(bigDecimal2) == 0 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.udojava.evalex.Expression$f0 */
    class C11824f0 extends C11876w1 {
        C11824f0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.atan(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$f1 */
    class C11825f1 extends C11876w1 {
        C11825f1(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.log10(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$g */
    class C11826g extends C11885z1 {
        C11826g(String str, int i, boolean z, boolean z2) {
            super(str, i, z, z2);
        }

        /* renamed from: d */
        public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return ((C11885z1) Expression.this.f57745h.get("=")).mo67116d(bigDecimal, bigDecimal2);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$g0 */
    class C11827g0 extends C11885z1 {
        C11827g0(String str, int i, boolean z) {
            super(str, i, z);
        }

        /* renamed from: d */
        public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            Expression.m82012h(bigDecimal, bigDecimal2);
            return bigDecimal.add(bigDecimal2, Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$g1 */
    class C11828g1 extends C11876w1 {
        C11828g1(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82012h(list.get(0), list.get(1));
            return list.get(0).setScale(list.get(1).intValue(), Expression.this.f57738a.getRoundingMode());
        }
    }

    /* renamed from: com.udojava.evalex.Expression$h */
    class C11829h extends C11885z1 {
        C11829h(String str, int i, boolean z, boolean z2) {
            super(str, i, z, z2);
        }

        /* renamed from: d */
        public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            if (bigDecimal == bigDecimal2) {
                return BigDecimal.ZERO;
            }
            if (bigDecimal == null || bigDecimal2 == null) {
                return BigDecimal.ONE;
            }
            return bigDecimal.compareTo(bigDecimal2) != 0 ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.udojava.evalex.Expression$h0 */
    class C11830h0 extends C11876w1 {
        C11830h0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            if (list.get(0).doubleValue() != 0.0d) {
                return new BigDecimal(Math.atan(1.0d / list.get(0).doubleValue()), Expression.this.f57738a);
            }
            throw new ExpressionException("Number must not be 0");
        }
    }

    /* renamed from: com.udojava.evalex.Expression$h1 */
    class C11831h1 extends C11876w1 {
        C11831h1(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return list.get(0).setScale(0, RoundingMode.FLOOR);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$i */
    class C11832i extends C11885z1 {
        C11832i(String str, int i, boolean z, boolean z2) {
            super(str, i, z, z2);
        }

        /* renamed from: d */
        public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            Expression.m82012h(bigDecimal, bigDecimal2);
            return ((C11885z1) Expression.this.f57745h.get("!=")).mo67116d(bigDecimal, bigDecimal2);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$i0 */
    class C11833i0 extends C11876w1 {
        C11833i0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82012h(list.get(0), list.get(1));
            return new BigDecimal(Math.atan2(list.get(0).doubleValue(), list.get(1).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$i1 */
    class C11834i1 extends C11876w1 {
        C11834i1(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return list.get(0).setScale(0, RoundingMode.CEILING);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$j */
    class C11835j extends C11819d2 {
        C11835j(String str, int i, boolean z) {
            super(str, i, z);
        }

        /* renamed from: g */
        public BigDecimal mo67127g(BigDecimal bigDecimal) {
            return bigDecimal.multiply(new BigDecimal(-1));
        }
    }

    /* renamed from: com.udojava.evalex.Expression$j0 */
    class C11836j0 extends C11876w1 {
        C11836j0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.toDegrees(Math.asin(list.get(0).doubleValue())), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$j1 */
    class C11837j1 extends C11876w1 {
        C11837j1(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            BigInteger shiftRight;
            Expression.m82011g(list.get(0));
            BigDecimal bigDecimal = list.get(0);
            if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
                return new BigDecimal(0);
            }
            if (bigDecimal.signum() >= 0) {
                BigInteger bigInteger = bigDecimal.movePointRight(Expression.this.f57738a.getPrecision() << 1).toBigInteger();
                BigInteger shiftRight2 = bigInteger.shiftRight((bigInteger.bitLength() + 1) >> 1);
                while (true) {
                    shiftRight = shiftRight2.add(bigInteger.divide(shiftRight2)).shiftRight(1);
                    Thread.yield();
                    BigInteger abs = shiftRight.subtract(shiftRight2).abs();
                    if (abs.compareTo(BigInteger.ZERO) != 0 && abs.compareTo(BigInteger.ONE) != 0) {
                        shiftRight2 = shiftRight;
                    }
                }
                return new BigDecimal(shiftRight, Expression.this.f57738a.getPrecision());
            }
            throw new ExpressionException("Argument to SQRT() function must not be negative");
        }
    }

    /* renamed from: com.udojava.evalex.Expression$k */
    class C11838k implements C11882y1 {
        C11838k() {
        }

        /* renamed from: a */
        public BigDecimal mo67128a() {
            return null;
        }
    }

    /* renamed from: com.udojava.evalex.Expression$k0 */
    class C11839k0 extends C11876w1 {
        C11839k0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.toDegrees(Math.acos(list.get(0).doubleValue())), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$k1 */
    class C11840k1 implements C11882y1 {

        /* renamed from: a */
        final /* synthetic */ C11807a2 f57800a;

        /* renamed from: b */
        final /* synthetic */ C11882y1 f57801b;

        C11840k1(C11807a2 a2Var, C11882y1 y1Var) {
            this.f57800a = a2Var;
            this.f57801b = y1Var;
        }

        /* renamed from: a */
        public BigDecimal mo67128a() {
            return Expression.this.f57745h.get(this.f57800a.f57751a).mo67130e(this.f57801b, (C11882y1) null).mo67128a();
        }
    }

    /* renamed from: com.udojava.evalex.Expression$l */
    class C11841l extends C11819d2 {
        C11841l(String str, int i, boolean z) {
            super(str, i, z);
        }

        /* renamed from: g */
        public BigDecimal mo67127g(BigDecimal bigDecimal) {
            return bigDecimal.multiply(BigDecimal.ONE);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$l0 */
    class C11842l0 extends C11876w1 {
        C11842l0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.toDegrees(Math.atan(list.get(0).doubleValue())), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$l1 */
    class C11843l1 implements C11882y1 {

        /* renamed from: a */
        final /* synthetic */ C11807a2 f57805a;

        /* renamed from: b */
        final /* synthetic */ C11882y1 f57806b;

        C11843l1(C11807a2 a2Var, C11882y1 y1Var) {
            this.f57805a = a2Var;
            this.f57806b = y1Var;
        }

        /* renamed from: a */
        public BigDecimal mo67128a() {
            return Expression.this.f57745h.get(this.f57805a.f57751a).mo67130e(this.f57806b, (C11882y1) null).mo67128a();
        }
    }

    /* renamed from: com.udojava.evalex.Expression$m */
    class C11844m extends C11876w1 {
        C11844m(String str, int i, boolean z) {
            super(str, i, z);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            int intValue = list.get(0).intValue();
            BigDecimal bigDecimal = BigDecimal.ONE;
            for (int i = 1; i <= intValue; i++) {
                bigDecimal = bigDecimal.multiply(new BigDecimal(i));
            }
            return bigDecimal;
        }
    }

    /* renamed from: com.udojava.evalex.Expression$m0 */
    class C11845m0 extends C11876w1 {
        C11845m0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            if (list.get(0).doubleValue() != 0.0d) {
                return new BigDecimal(Math.toDegrees(Math.atan(1.0d / list.get(0).doubleValue())), Expression.this.f57738a);
            }
            throw new ExpressionException("Number must not be 0");
        }
    }

    /* renamed from: com.udojava.evalex.Expression$m1 */
    class C11846m1 implements C11882y1 {

        /* renamed from: a */
        final /* synthetic */ C11807a2 f57810a;

        /* renamed from: b */
        final /* synthetic */ C11882y1 f57811b;

        /* renamed from: c */
        final /* synthetic */ C11882y1 f57812c;

        C11846m1(C11807a2 a2Var, C11882y1 y1Var, C11882y1 y1Var2) {
            this.f57810a = a2Var;
            this.f57811b = y1Var;
            this.f57812c = y1Var2;
        }

        /* renamed from: a */
        public BigDecimal mo67128a() {
            return Expression.this.f57745h.get(this.f57810a.f57751a).mo67130e(this.f57811b, this.f57812c).mo67128a();
        }
    }

    /* renamed from: com.udojava.evalex.Expression$n */
    class C11847n extends C11876w1 {
        C11847n(String str, int i, boolean z) {
            super(str, i, z);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            boolean z = false;
            Expression.m82011g(list.get(0));
            if (list.get(0).compareTo(BigDecimal.ZERO) == 0) {
                z = true;
            }
            return z ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.udojava.evalex.Expression$n0 */
    class C11848n0 extends C11876w1 {
        C11848n0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82012h(list.get(0), list.get(1));
            return new BigDecimal(Math.toDegrees(Math.atan2(list.get(0).doubleValue(), list.get(1).doubleValue())), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$n1 */
    class C11849n1 extends C11885z1 {
        C11849n1(String str, int i, boolean z) {
            super(str, i, z);
        }

        /* renamed from: d */
        public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            Expression.m82012h(bigDecimal, bigDecimal2);
            return bigDecimal.divide(bigDecimal2, Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$o */
    class C11850o extends C11879x1 {
        C11850o(String str, int i) {
            super(str, i);
        }

        /* renamed from: a */
        public C11882y1 mo67129a(List<C11882y1> list) {
            return new C11896f(list);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$o0 */
    class C11851o0 extends C11876w1 {
        C11851o0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.sinh(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$o1 */
    class C11852o1 implements C11882y1 {

        /* renamed from: a */
        final /* synthetic */ C11807a2 f57819a;

        C11852o1(C11807a2 a2Var) {
            this.f57819a = a2Var;
        }

        /* renamed from: a */
        public BigDecimal mo67128a() {
            BigDecimal bigDecimal;
            C11882y1 y1Var = Expression.this.f57747j.get(this.f57819a.f57751a);
            if (y1Var == null) {
                bigDecimal = null;
            } else {
                bigDecimal = y1Var.mo67128a();
            }
            if (bigDecimal == null) {
                return null;
            }
            return bigDecimal.round(Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$p */
    class C11853p extends C11876w1 {
        C11853p(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            return new BigDecimal(Math.random(), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$p0 */
    class C11854p0 extends C11876w1 {
        C11854p0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.cosh(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$p1 */
    class C11855p1 implements C11882y1 {

        /* renamed from: a */
        final /* synthetic */ C11807a2 f57823a;

        C11855p1(C11807a2 a2Var) {
            this.f57823a = a2Var;
        }

        /* renamed from: a */
        public BigDecimal mo67128a() {
            if (this.f57823a.f57751a.equalsIgnoreCase("NULL")) {
                return null;
            }
            return new BigDecimal(this.f57823a.f57751a, Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$q */
    class C11856q extends C11876w1 {
        C11856q(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.sin(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$q0 */
    class C11857q0 extends C11876w1 {
        C11857q0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.tanh(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$q1 */
    class C11858q1 implements C11882y1 {

        /* renamed from: a */
        final /* synthetic */ C11807a2 f57827a;

        C11858q1(C11807a2 a2Var) {
            this.f57827a = a2Var;
        }

        /* renamed from: a */
        public BigDecimal mo67128a() {
            return null;
        }
    }

    /* renamed from: com.udojava.evalex.Expression$r */
    class C11859r extends C11876w1 {
        C11859r(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.cos(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$r0 */
    class C11860r0 extends C11885z1 {
        C11860r0(String str, int i, boolean z) {
            super(str, i, z);
        }

        /* renamed from: d */
        public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            Expression.m82012h(bigDecimal, bigDecimal2);
            return bigDecimal.subtract(bigDecimal2, Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$r1 */
    class C11861r1 implements C11882y1 {

        /* renamed from: a */
        final /* synthetic */ C11807a2 f57831a;

        C11861r1(C11807a2 a2Var) {
            this.f57831a = a2Var;
        }

        /* renamed from: a */
        public BigDecimal mo67128a() {
            return new BigDecimal(new BigInteger(this.f57831a.f57751a.substring(2), 16), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$s */
    class C11862s extends C11876w1 {
        C11862s(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.tan(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$s0 */
    class C11863s0 extends C11876w1 {
        C11863s0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(1.0d / Math.cosh(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$s1 */
    static /* synthetic */ class C11864s1 {

        /* renamed from: a */
        static final /* synthetic */ int[] f57835a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.udojava.evalex.Expression$b2[] r0 = com.udojava.evalex.Expression.C11811b2.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f57835a = r0
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.STRINGPARAM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f57835a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.LITERAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f57835a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.HEX_LITERAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f57835a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.VARIABLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f57835a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.FUNCTION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f57835a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.COMMA     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f57835a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.OPERATOR     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f57835a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.UNARY_OPERATOR     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f57835a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.OPEN_PAREN     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f57835a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.udojava.evalex.Expression$b2 r1 = com.udojava.evalex.Expression.C11811b2.CLOSE_PAREN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.udojava.evalex.Expression.C11864s1.<clinit>():void");
        }
    }

    /* renamed from: com.udojava.evalex.Expression$t */
    class C11865t extends C11876w1 {
        C11865t(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(1.0d / Math.tan(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$t0 */
    class C11866t0 extends C11876w1 {
        C11866t0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(1.0d / Math.sinh(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$t1 */
    class C11867t1 extends C11885z1 {
        C11867t1(String str, int i, boolean z) {
            super(str, i, z);
        }

        /* renamed from: d */
        public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            Expression.m82012h(bigDecimal, bigDecimal2);
            return bigDecimal.remainder(bigDecimal2, Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$u */
    class C11868u extends C11876w1 {
        C11868u(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(1.0d / Math.cos(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$u0 */
    class C11869u0 extends C11876w1 {
        C11869u0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(1.0d / Math.tanh(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$u1 */
    class C11870u1 extends C11885z1 {
        C11870u1(String str, int i, boolean z) {
            super(str, i, z);
        }

        /* renamed from: d */
        public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            Expression.m82012h(bigDecimal, bigDecimal2);
            int signum = bigDecimal2.signum();
            double doubleValue = bigDecimal.doubleValue();
            BigDecimal multiply = bigDecimal2.multiply(new BigDecimal(signum));
            BigDecimal remainder = multiply.remainder(BigDecimal.ONE);
            BigDecimal multiply2 = bigDecimal.pow(multiply.subtract(remainder).intValueExact(), Expression.this.f57738a).multiply(BigDecimal.valueOf(Math.pow(doubleValue, remainder.doubleValue())), Expression.this.f57738a);
            return signum == -1 ? BigDecimal.ONE.divide(multiply2, Expression.this.f57738a.getPrecision(), RoundingMode.HALF_UP) : multiply2;
        }
    }

    /* renamed from: com.udojava.evalex.Expression$v */
    class C11871v implements C11882y1 {

        /* renamed from: a */
        final /* synthetic */ BigDecimal f57842a;

        C11871v(BigDecimal bigDecimal) {
            this.f57842a = bigDecimal;
        }

        /* renamed from: a */
        public BigDecimal mo67128a() {
            return this.f57842a;
        }
    }

    /* renamed from: com.udojava.evalex.Expression$v0 */
    class C11872v0 extends C11876w1 {
        C11872v0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.log(list.get(0).doubleValue() + Math.sqrt(Math.pow(list.get(0).doubleValue(), 2.0d) + 1.0d)), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$v1 */
    class C11873v1 extends C11885z1 {
        C11873v1(String str, int i, boolean z, boolean z2) {
            super(str, i, z, z2);
        }

        /* renamed from: d */
        public BigDecimal mo67116d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            Expression.m82012h(bigDecimal, bigDecimal2);
            boolean z = true;
            if (!(bigDecimal.compareTo(BigDecimal.ZERO) != 0)) {
                return BigDecimal.ZERO;
            }
            if (bigDecimal2.compareTo(BigDecimal.ZERO) == 0) {
                z = false;
            }
            return z ? BigDecimal.ONE : BigDecimal.ZERO;
        }
    }

    /* renamed from: com.udojava.evalex.Expression$w */
    class C11874w extends C11876w1 {
        C11874w(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(1.0d / Math.sin(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$w0 */
    class C11875w0 extends C11876w1 {
        C11875w0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            if (Double.compare(list.get(0).doubleValue(), 1.0d) >= 0) {
                return new BigDecimal(Math.log(list.get(0).doubleValue() + Math.sqrt(Math.pow(list.get(0).doubleValue(), 2.0d) - 1.0d)), Expression.this.f57738a);
            }
            throw new ExpressionException("Number must be x >= 1");
        }
    }

    /* renamed from: com.udojava.evalex.Expression$x */
    class C11877x extends C11876w1 {
        C11877x(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.sin(Math.toRadians(list.get(0).doubleValue())), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$x0 */
    class C11878x0 extends C11876w1 {
        C11878x0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            if (Math.abs(list.get(0).doubleValue()) <= 1.0d && Math.abs(list.get(0).doubleValue()) != 1.0d) {
                return new BigDecimal(Math.log((list.get(0).doubleValue() + 1.0d) / (1.0d - list.get(0).doubleValue())) * 0.5d, Expression.this.f57738a);
            }
            throw new ExpressionException("Number must be |x| < 1");
        }
    }

    /* renamed from: com.udojava.evalex.Expression$x1 */
    public abstract class C11879x1 extends C15757a {
        public C11879x1(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$y */
    class C11880y extends C11876w1 {
        C11880y(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.cos(Math.toRadians(list.get(0).doubleValue())), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$y0 */
    class C11881y0 extends C11876w1 {
        C11881y0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.toRadians(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$y1 */
    public interface C11882y1 {
        /* renamed from: a */
        BigDecimal mo67128a();
    }

    /* renamed from: com.udojava.evalex.Expression$z */
    class C11883z extends C11876w1 {
        C11883z(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.tan(Math.toRadians(list.get(0).doubleValue())), Expression.this.f57738a);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$z0 */
    class C11884z0 extends C11876w1 {
        C11884z0(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public BigDecimal mo67117c(List<BigDecimal> list) {
            Expression.m82011g(list.get(0));
            return new BigDecimal(Math.toDegrees(list.get(0).doubleValue()), Expression.this.f57738a);
        }
    }

    static {
        BigDecimal bigDecimal = new BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679");
        f57734k = bigDecimal;
        BigDecimal bigDecimal2 = new BigDecimal("2.71828182845904523536028747135266249775724709369995957496696762772407663");
        f57735l = bigDecimal2;
        HashMap hashMap = new HashMap();
        f57736m = hashMap;
        hashMap.put("e", bigDecimal2);
        hashMap.put("PI", bigDecimal);
        hashMap.put("NULL", (Object) null);
        hashMap.put("TRUE", BigDecimal.ONE);
        hashMap.put("FALSE", BigDecimal.ZERO);
    }

    public Expression(String str, MathContext mathContext) {
        this(str, C11893d.m82117a().mo67134b(mathContext).mo67133a());
    }

    /* renamed from: g */
    public static void m82011g(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            throw new ArithmeticException("Operand may not be null");
        }
    }

    /* renamed from: h */
    public static void m82012h(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (bigDecimal == null) {
            throw new ArithmeticException("First operand may not be null");
        } else if (bigDecimal2 == null) {
            throw new ArithmeticException("Second operand may not be null");
        }
    }

    /* renamed from: l */
    private List<C11807a2> m82013l() {
        if (this.f57744g == null) {
            List<C11807a2> n = m82015n(this.f57743f);
            this.f57744g = n;
            m82016o(n);
        }
        return this.f57744g;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0007 A[EDGE_INSN: B:20:0x0007->B:2:0x0007 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0011  */
    /* renamed from: m */
    private void m82014m(java.util.List<com.udojava.evalex.Expression.C11807a2> r6, java.util.Stack<com.udojava.evalex.Expression.C11807a2> r7, com.udojava.evalex.C11897g r8) {
        /*
            r5 = this;
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x000f
        L_0x0009:
            java.lang.Object r0 = r7.peek()
            com.udojava.evalex.Expression$a2 r0 = (com.udojava.evalex.Expression.C11807a2) r0
        L_0x000f:
            if (r0 == 0) goto L_0x005e
            com.udojava.evalex.Expression$b2 r2 = r0.f57752b
            com.udojava.evalex.Expression$b2 r3 = com.udojava.evalex.Expression.C11811b2.OPERATOR
            if (r2 == r3) goto L_0x001b
            com.udojava.evalex.Expression$b2 r3 = com.udojava.evalex.Expression.C11811b2.UNARY_OPERATOR
            if (r2 != r3) goto L_0x005e
        L_0x001b:
            boolean r2 = r8.mo67138a()
            if (r2 == 0) goto L_0x0035
            int r2 = r8.mo67139b()
            java.util.Map<java.lang.String, com.udojava.evalex.g> r3 = r5.f57745h
            java.lang.String r4 = r0.f57751a
            java.lang.Object r3 = r3.get(r4)
            com.udojava.evalex.g r3 = (com.udojava.evalex.C11897g) r3
            int r3 = r3.mo67139b()
            if (r2 <= r3) goto L_0x0049
        L_0x0035:
            int r2 = r8.mo67139b()
            java.util.Map<java.lang.String, com.udojava.evalex.g> r3 = r5.f57745h
            java.lang.String r0 = r0.f57751a
            java.lang.Object r0 = r3.get(r0)
            com.udojava.evalex.g r0 = (com.udojava.evalex.C11897g) r0
            int r0 = r0.mo67139b()
            if (r2 >= r0) goto L_0x005e
        L_0x0049:
            java.lang.Object r0 = r7.pop()
            r6.add(r0)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0057
            goto L_0x0007
        L_0x0057:
            java.lang.Object r0 = r7.peek()
            com.udojava.evalex.Expression$a2 r0 = (com.udojava.evalex.Expression.C11807a2) r0
            goto L_0x000f
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.udojava.evalex.Expression.m82014m(java.util.List, java.util.Stack, com.udojava.evalex.g):void");
    }

    /* renamed from: n */
    private List<C11807a2> m82015n(String str) {
        C11811b2 b2Var;
        C11811b2 b2Var2;
        C11811b2 b2Var3;
        ArrayList arrayList = new ArrayList();
        Stack stack = new Stack();
        C11815c2 c2Var = new C11815c2(str);
        C11807a2 a2Var = null;
        C11807a2 a2Var2 = null;
        while (c2Var.hasNext()) {
            C11807a2 c = c2Var.next();
            switch (C11864s1.f57835a[c.f57752b.ordinal()]) {
                case 1:
                    stack.push(c);
                    break;
                case 2:
                case 3:
                    if (a2Var == null || !((b2Var = a2Var.f57752b) == C11811b2.LITERAL || b2Var == C11811b2.HEX_LITERAL)) {
                        arrayList.add(c);
                        break;
                    } else {
                        throw new ExpressionException("Missing operator", c.f57753c);
                    }
                case 4:
                    arrayList.add(c);
                    break;
                case 5:
                    stack.push(c);
                    a2Var2 = c;
                    break;
                case 6:
                    if (a2Var == null || a2Var.f57752b != C11811b2.OPERATOR) {
                        while (!stack.isEmpty() && ((C11807a2) stack.peek()).f57752b != C11811b2.OPEN_PAREN) {
                            arrayList.add(stack.pop());
                        }
                        if (!stack.isEmpty()) {
                            break;
                        } else if (a2Var2 == null) {
                            throw new ExpressionException("Unexpected comma", c.f57753c);
                        } else {
                            throw new ExpressionException("Parse error for function " + a2Var2, c.f57753c);
                        }
                    } else {
                        throw new ExpressionException("Missing parameter(s) for operator " + a2Var, a2Var.f57753c);
                    }
                    break;
                case 7:
                    if (a2Var == null || !this.f57745h.containsKey(c.f57751a) || (!((b2Var2 = a2Var.f57752b) == C11811b2.COMMA || b2Var2 == C11811b2.OPEN_PAREN) || this.f57745h.get(c.f57751a).mo67140c())) {
                        C11897g gVar = this.f57745h.get(c.f57751a);
                        if (gVar != null) {
                            m82014m(arrayList, stack, gVar);
                            stack.push(c);
                            break;
                        } else {
                            throw new ExpressionException("Unknown operator " + c, c.f57753c + 1);
                        }
                    } else {
                        throw new ExpressionException("Missing parameter(s) for operator " + c, c.f57753c);
                    }
                case 8:
                    if (a2Var == null || (b2Var3 = a2Var.f57752b) == C11811b2.OPERATOR || b2Var3 == C11811b2.COMMA || b2Var3 == C11811b2.OPEN_PAREN || b2Var3 == C11811b2.UNARY_OPERATOR) {
                        C11897g gVar2 = this.f57745h.get(c.f57751a);
                        if (gVar2 != null) {
                            m82014m(arrayList, stack, gVar2);
                            stack.push(c);
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unknown unary operator ");
                            String str2 = c.f57751a;
                            sb.append(str2.substring(0, str2.length() - 1));
                            throw new ExpressionException(sb.toString(), c.f57753c + 1);
                        }
                    } else {
                        throw new ExpressionException("Invalid position for unary operator " + c, c.f57753c);
                    }
                    break;
                case 9:
                    if (a2Var != null) {
                        C11811b2 b2Var4 = a2Var.f57752b;
                        if (b2Var4 == C11811b2.LITERAL || b2Var4 == C11811b2.CLOSE_PAREN || b2Var4 == C11811b2.VARIABLE || b2Var4 == C11811b2.HEX_LITERAL) {
                            C11807a2 a2Var3 = new C11807a2();
                            a2Var3.mo67119b(ProxyConfig.MATCH_ALL_SCHEMES);
                            a2Var3.f57752b = C11811b2.OPERATOR;
                            stack.push(a2Var3);
                        }
                        if (a2Var.f57752b == C11811b2.FUNCTION) {
                            arrayList.add(c);
                        }
                    }
                    stack.push(c);
                    break;
                case 10:
                    if (a2Var == null || a2Var.f57752b != C11811b2.OPERATOR || this.f57745h.get(a2Var.f57751a).mo67140c()) {
                        while (!stack.isEmpty() && ((C11807a2) stack.peek()).f57752b != C11811b2.OPEN_PAREN) {
                            arrayList.add(stack.pop());
                        }
                        if (!stack.isEmpty()) {
                            stack.pop();
                            if (!stack.isEmpty() && ((C11807a2) stack.peek()).f57752b == C11811b2.FUNCTION) {
                                arrayList.add(stack.pop());
                                break;
                            }
                        } else {
                            throw new ExpressionException("Mismatched parentheses");
                        }
                    } else {
                        throw new ExpressionException("Missing parameter(s) for operator " + a2Var, a2Var.f57753c);
                    }
                    break;
            }
            a2Var = c;
        }
        while (!stack.isEmpty()) {
            C11807a2 a2Var4 = (C11807a2) stack.pop();
            C11811b2 b2Var5 = a2Var4.f57752b;
            if (b2Var5 == C11811b2.OPEN_PAREN || b2Var5 == C11811b2.CLOSE_PAREN) {
                throw new ExpressionException("Mismatched parentheses");
            }
            arrayList.add(a2Var4);
        }
        return arrayList;
    }

    /* renamed from: o */
    private void m82016o(List<C11807a2> list) {
        Stack stack = new Stack();
        stack.push(0);
        for (C11807a2 next : list) {
            int i = C11864s1.f57835a[next.f57752b.ordinal()];
            if (i == 5) {
                C11895e eVar = this.f57746i.get(next.f57751a.toUpperCase(Locale.ROOT));
                if (eVar != null) {
                    int intValue = ((Integer) stack.pop()).intValue();
                    if (!eVar.mo67136d() && intValue != eVar.mo67135b()) {
                        throw new ExpressionException("Function " + next + " expected " + eVar.mo67135b() + " parameters, got " + intValue);
                    } else if (!stack.isEmpty()) {
                        stack.set(stack.size() - 1, Integer.valueOf(((Integer) stack.peek()).intValue() + 1));
                    } else {
                        throw new ExpressionException("Too many function calls, maximum scope exceeded");
                    }
                } else {
                    throw new ExpressionException("Unknown function " + next, next.f57753c + 1);
                }
            } else if (i == 7) {
                int i2 = 2;
                if (this.f57745h.get(next.f57751a).mo67140c()) {
                    i2 = 1;
                }
                if (((Integer) stack.peek()).intValue() < i2) {
                    throw new ExpressionException("Missing parameter(s) for operator " + next);
                } else if (i2 > 1) {
                    stack.set(stack.size() - 1, Integer.valueOf((((Integer) stack.peek()).intValue() - i2) + 1));
                }
            } else if (i != 8) {
                if (i != 9) {
                    stack.set(stack.size() - 1, Integer.valueOf(((Integer) stack.peek()).intValue() + 1));
                } else {
                    stack.push(0);
                }
            } else if (((Integer) stack.peek()).intValue() < 1) {
                throw new ExpressionException("Missing parameter(s) for operator " + next);
            }
        }
        if (stack.size() > 1) {
            throw new ExpressionException("Too many unhandled function parameter lists");
        } else if (((Integer) stack.peek()).intValue() > 1) {
            throw new ExpressionException("Too many numbers or variables");
        } else if (((Integer) stack.peek()).intValue() < 1) {
            throw new ExpressionException("Empty expression");
        }
    }

    /* renamed from: d */
    public C15759c mo67107d(C15759c cVar) {
        return (C15759c) this.f57746i.put(cVar.getName(), cVar);
    }

    /* renamed from: e */
    public C11895e mo67108e(C11895e eVar) {
        return this.f57746i.put(eVar.getName(), eVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Expression expression = (Expression) obj;
        String str = this.f57743f;
        if (str != null) {
            return str.equals(expression.f57743f);
        }
        if (expression.f57743f == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public <OPERATOR extends C11897g> OPERATOR mo67110f(OPERATOR operator) {
        String f = operator.mo67141f();
        if (operator instanceof C11891c) {
            f = f + "u";
        }
        return (C11897g) this.f57745h.put(f, operator);
    }

    public int hashCode() {
        String str = this.f57743f;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C11882y1 mo67112i(BigDecimal bigDecimal) {
        return new C11871v(bigDecimal);
    }

    /* renamed from: j */
    public BigDecimal mo67113j() {
        return mo67114k(true);
    }

    /* renamed from: k */
    public BigDecimal mo67114k(boolean z) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (C11807a2 next : m82013l()) {
            switch (C11864s1.f57835a[next.f57752b.ordinal()]) {
                case 1:
                    arrayDeque.push(new C11858q1(next));
                    break;
                case 2:
                    arrayDeque.push(new C11855p1(next));
                    break;
                case 3:
                    arrayDeque.push(new C11861r1(next));
                    break;
                case 4:
                    if (this.f57747j.containsKey(next.f57751a)) {
                        arrayDeque.push(new C11852o1(next));
                        break;
                    } else {
                        throw new ExpressionException("Unknown operator or function: " + next);
                    }
                case 5:
                    C11895e eVar = this.f57746i.get(next.f57751a.toUpperCase(Locale.ROOT));
                    ArrayList arrayList = new ArrayList(!eVar.mo67136d() ? eVar.mo67135b() : 0);
                    while (!arrayDeque.isEmpty() && arrayDeque.peek() != f57737n) {
                        arrayList.add(0, arrayDeque.pop());
                    }
                    if (arrayDeque.peek() == f57737n) {
                        arrayDeque.pop();
                    }
                    arrayDeque.push(eVar.mo67129a(arrayList));
                    break;
                case 7:
                    if (!this.f57745h.get(next.f57751a).mo67140c()) {
                        arrayDeque.push(new C11846m1(next, (C11882y1) arrayDeque.pop(), (C11882y1) arrayDeque.pop()));
                        break;
                    } else {
                        arrayDeque.push(new C11843l1(next, (C11882y1) arrayDeque.pop()));
                        break;
                    }
                case 8:
                    arrayDeque.push(new C11840k1(next, (C11882y1) arrayDeque.pop()));
                    break;
                case 9:
                    arrayDeque.push(f57737n);
                    break;
                default:
                    throw new ExpressionException("Unexpected token " + next.f57751a, next.f57753c);
            }
        }
        BigDecimal a = ((C11882y1) arrayDeque.pop()).mo67128a();
        if (a == null) {
            return null;
        }
        return z ? a.stripTrailingZeros() : a;
    }

    public String toString() {
        return this.f57743f;
    }

    /* renamed from: com.udojava.evalex.Expression$w1 */
    public abstract class C11876w1 extends C11886a {
        public C11876w1(String str, int i) {
            super(str, i);
        }

        public C11876w1(String str, int i, boolean z) {
            super(str, i, z);
        }
    }

    /* renamed from: com.udojava.evalex.Expression$z1 */
    public abstract class C11885z1 extends C11888b {
        public C11885z1(String str, int i, boolean z, boolean z2) {
            super(str, i, z, z2);
        }

        public C11885z1(String str, int i, boolean z) {
            super(str, i, z);
        }
    }

    public Expression(String str, C11893d dVar) {
        this.f57739b = 40;
        this.f57740c = "_";
        this.f57741d = "_";
        this.f57743f = null;
        this.f57744g = null;
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        this.f57745h = new TreeMap(comparator);
        this.f57746i = new TreeMap(comparator);
        this.f57747j = new TreeMap(comparator);
        this.f57738a = dVar.mo67131b();
        this.f57739b = dVar.mo67132c();
        this.f57743f = str;
        this.f57742e = str;
        mo67110f(new C11827g0("+", 20, true));
        mo67110f(new C11860r0(HelpFormatter.DEFAULT_OPT_PREFIX, 20, true));
        mo67110f(new C11814c1(ProxyConfig.MATCH_ALL_SCHEMES, 30, true));
        mo67110f(new C11849n1("/", 30, true));
        mo67110f(new C11867t1(TaskerPlugin.VARIABLE_PREFIX, 30, true));
        mo67110f(new C11870u1("^", this.f57739b, false));
        mo67110f(new C11873v1("&&", 4, false, true));
        mo67110f(new C11804a("||", 2, false, true));
        mo67110f(new C11808b(">", 10, false, true));
        mo67110f(new C11812c(">=", 10, false, true));
        mo67110f(new C11816d("<", 10, false, true));
        mo67110f(new C11820e("<=", 10, false, true));
        mo67110f(new C11823f("=", 7, false, true));
        mo67110f(new C11826g("==", 7, false, true));
        mo67110f(new C11829h("!=", 7, false, true));
        mo67110f(new C11832i("<>", 7, false, true));
        mo67110f(new C11835j(HelpFormatter.DEFAULT_OPT_PREFIX, 60, false));
        mo67110f(new C11841l("+", 60, false));
        mo67107d(new C11844m("FACT", 1, false));
        mo67107d(new C11847n("NOT", 1, true));
        mo67108e(new C11850o("IF", 3));
        mo67107d(new C11853p("RANDOM", 0));
        mo67107d(new C11856q("SINR", 1));
        mo67107d(new C11859r("COSR", 1));
        mo67107d(new C11862s("TANR", 1));
        mo67107d(new C11865t("COTR", 1));
        mo67107d(new C11868u("SECR", 1));
        mo67107d(new C11874w("CSCR", 1));
        mo67107d(new C11877x("SIN", 1));
        mo67107d(new C11880y("COS", 1));
        mo67107d(new C11883z("TAN", 1));
        mo67107d(new C11805a0("COT", 1));
        mo67107d(new C11809b0("SEC", 1));
        mo67107d(new C11813c0("CSC", 1));
        mo67107d(new C11817d0("ASINR", 1));
        mo67107d(new C11821e0("ACOSR", 1));
        mo67107d(new C11824f0("ATANR", 1));
        mo67107d(new C11830h0("ACOTR", 1));
        mo67107d(new C11833i0("ATAN2R", 2));
        mo67107d(new C11836j0("ASIN", 1));
        mo67107d(new C11839k0("ACOS", 1));
        mo67107d(new C11842l0("ATAN", 1));
        mo67107d(new C11845m0("ACOT", 1));
        mo67107d(new C11848n0("ATAN2", 2));
        mo67107d(new C11851o0("SINH", 1));
        mo67107d(new C11854p0("COSH", 1));
        mo67107d(new C11857q0("TANH", 1));
        mo67107d(new C11863s0("SECH", 1));
        mo67107d(new C11866t0("CSCH", 1));
        mo67107d(new C11869u0("COTH", 1));
        mo67107d(new C11872v0("ASINH", 1));
        mo67107d(new C11875w0("ACOSH", 1));
        mo67107d(new C11878x0("ATANH", 1));
        mo67107d(new C11881y0("RAD", 1));
        mo67107d(new C11884z0("DEG", 1));
        mo67107d(new C11806a1("MAX", -1));
        mo67107d(new C11810b1("MIN", -1));
        mo67107d(new C11818d1("ABS", 1));
        mo67107d(new C11822e1("LOG", 1));
        mo67107d(new C11825f1("LOG10", 1));
        mo67107d(new C11828g1("ROUND", 2));
        mo67107d(new C11831h1("FLOOR", 1));
        mo67107d(new C11834i1("CEILING", 1));
        mo67107d(new C11837j1("SQRT", 1));
        for (Map.Entry next : f57736m.entrySet()) {
            BigDecimal bigDecimal = (BigDecimal) next.getValue();
            this.f57747j.put(next.getKey(), bigDecimal == null ? null : mo67112i(bigDecimal));
        }
    }
}
