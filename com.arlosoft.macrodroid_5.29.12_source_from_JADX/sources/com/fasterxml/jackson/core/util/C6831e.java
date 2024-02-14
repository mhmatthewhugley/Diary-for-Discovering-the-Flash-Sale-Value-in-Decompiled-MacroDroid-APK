package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.p072io.C6815h;
import com.fasterxml.jackson.core.util.C6822a;
import java.math.BigDecimal;
import java.util.ArrayList;

/* renamed from: com.fasterxml.jackson.core.util.e */
/* compiled from: TextBuffer */
public final class C6831e {

    /* renamed from: l */
    static final char[] f15892l = new char[0];

    /* renamed from: a */
    private final C6822a f15893a;

    /* renamed from: b */
    private char[] f15894b;

    /* renamed from: c */
    private int f15895c;

    /* renamed from: d */
    private int f15896d;

    /* renamed from: e */
    private ArrayList<char[]> f15897e;

    /* renamed from: f */
    private boolean f15898f = false;

    /* renamed from: g */
    private int f15899g;

    /* renamed from: h */
    private char[] f15900h;

    /* renamed from: i */
    private int f15901i;

    /* renamed from: j */
    private String f15902j;

    /* renamed from: k */
    private char[] f15903k;

    public C6831e(C6822a aVar) {
        this.f15893a = aVar;
    }

    /* renamed from: a */
    private char[] m25663a(int i) {
        return new char[i];
    }

    /* renamed from: c */
    private char[] m25664c() {
        int i;
        String str = this.f15902j;
        if (str != null) {
            return str.toCharArray();
        }
        if (this.f15895c >= 0) {
            int i2 = this.f15896d;
            if (i2 < 1) {
                return f15892l;
            }
            char[] a = m25663a(i2);
            System.arraycopy(this.f15894b, this.f15895c, a, 0, this.f15896d);
            return a;
        }
        int x = mo33978x();
        if (x < 1) {
            return f15892l;
        }
        char[] a2 = m25663a(x);
        ArrayList<char[]> arrayList = this.f15897e;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i3 = 0; i3 < size; i3++) {
                char[] cArr = this.f15897e.get(i3);
                int length = cArr.length;
                System.arraycopy(cArr, 0, a2, i, length);
                i += length;
            }
        } else {
            i = 0;
        }
        System.arraycopy(this.f15900h, 0, a2, i, this.f15901i);
        return a2;
    }

    /* renamed from: d */
    private void m25665d() {
        this.f15898f = false;
        this.f15897e.clear();
        this.f15899g = 0;
        this.f15901i = 0;
    }

    /* renamed from: j */
    private void m25666j(int i) {
        if (this.f15897e == null) {
            this.f15897e = new ArrayList<>();
        }
        char[] cArr = this.f15900h;
        this.f15898f = true;
        this.f15897e.add(cArr);
        this.f15899g += cArr.length;
        int length = cArr.length;
        int i2 = length >> 1;
        if (i2 >= i) {
            i = i2;
        }
        char[] a = m25663a(Math.min(262144, length + i));
        this.f15901i = 0;
        this.f15900h = a;
    }

    /* renamed from: l */
    private char[] m25667l(int i) {
        C6822a aVar = this.f15893a;
        if (aVar != null) {
            return aVar.mo33941c(C6822a.C6824b.TEXT_BUFFER, i);
        }
        return new char[Math.max(i, 1000)];
    }

    /* renamed from: y */
    private void m25668y(int i) {
        int i2 = this.f15896d;
        this.f15896d = 0;
        char[] cArr = this.f15894b;
        this.f15894b = null;
        int i3 = this.f15895c;
        this.f15895c = -1;
        int i4 = i + i2;
        char[] cArr2 = this.f15900h;
        if (cArr2 == null || i4 > cArr2.length) {
            this.f15900h = m25667l(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.f15900h, 0, i2);
        }
        this.f15899g = 0;
        this.f15901i = i2;
    }

    /* renamed from: b */
    public void mo33959b(char[] cArr, int i, int i2) {
        if (this.f15895c >= 0) {
            m25668y(i2);
        }
        this.f15902j = null;
        this.f15903k = null;
        char[] cArr2 = this.f15900h;
        int length = cArr2.length;
        int i3 = this.f15901i;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.f15901i += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            m25666j(i2);
            int min = Math.min(this.f15900h.length, i2);
            System.arraycopy(cArr, i, this.f15900h, 0, min);
            this.f15901i += min;
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    /* renamed from: e */
    public char[] mo33960e() {
        char[] cArr = this.f15903k;
        if (cArr != null) {
            return cArr;
        }
        char[] c = m25664c();
        this.f15903k = c;
        return c;
    }

    /* renamed from: f */
    public BigDecimal mo33961f() throws NumberFormatException {
        if (this.f15903k != null) {
            return new BigDecimal(this.f15903k);
        }
        if (this.f15895c >= 0) {
            return new BigDecimal(this.f15894b, this.f15895c, this.f15896d);
        }
        if (this.f15899g == 0) {
            return new BigDecimal(this.f15900h, 0, this.f15901i);
        }
        return new BigDecimal(mo33960e());
    }

    /* renamed from: g */
    public double mo33962g() throws NumberFormatException {
        return C6815h.m25616b(mo33963h());
    }

    /* renamed from: h */
    public String mo33963h() {
        if (this.f15902j == null) {
            char[] cArr = this.f15903k;
            if (cArr != null) {
                this.f15902j = new String(cArr);
            } else {
                int i = this.f15895c;
                String str = "";
                if (i >= 0) {
                    int i2 = this.f15896d;
                    if (i2 < 1) {
                        this.f15902j = str;
                        return str;
                    }
                    this.f15902j = new String(this.f15894b, i, i2);
                } else {
                    int i3 = this.f15899g;
                    int i4 = this.f15901i;
                    if (i3 == 0) {
                        if (i4 != 0) {
                            str = new String(this.f15900h, 0, i4);
                        }
                        this.f15902j = str;
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList<char[]> arrayList = this.f15897e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = this.f15897e.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.f15900h, 0, this.f15901i);
                        this.f15902j = sb.toString();
                    }
                }
            }
        }
        return this.f15902j;
    }

    /* renamed from: i */
    public char[] mo33964i() {
        this.f15895c = -1;
        this.f15901i = 0;
        this.f15896d = 0;
        this.f15894b = null;
        this.f15902j = null;
        this.f15903k = null;
        if (this.f15898f) {
            m25665d();
        }
        char[] cArr = this.f15900h;
        if (cArr != null) {
            return cArr;
        }
        char[] l = m25667l(0);
        this.f15900h = l;
        return l;
    }

    /* renamed from: k */
    public char[] mo33965k() {
        int i;
        char[] cArr = this.f15900h;
        int length = cArr.length;
        if (length == 262144) {
            i = 262145;
        } else {
            i = Math.min(262144, (length >> 1) + length);
        }
        char[] a = m25663a(i);
        this.f15900h = a;
        System.arraycopy(cArr, 0, a, 0, length);
        return this.f15900h;
    }

    /* renamed from: m */
    public char[] mo33966m() {
        if (this.f15897e == null) {
            this.f15897e = new ArrayList<>();
        }
        this.f15898f = true;
        this.f15897e.add(this.f15900h);
        int length = this.f15900h.length;
        this.f15899g += length;
        char[] a = m25663a(Math.min(length + (length >> 1), 262144));
        this.f15901i = 0;
        this.f15900h = a;
        return a;
    }

    /* renamed from: n */
    public char[] mo33967n() {
        if (this.f15895c >= 0) {
            m25668y(1);
        } else {
            char[] cArr = this.f15900h;
            if (cArr == null) {
                this.f15900h = m25667l(0);
            } else if (this.f15901i >= cArr.length) {
                m25666j(1);
            }
        }
        return this.f15900h;
    }

    /* renamed from: o */
    public int mo33968o() {
        return this.f15901i;
    }

    /* renamed from: p */
    public char[] mo33969p() {
        if (this.f15895c >= 0) {
            return this.f15894b;
        }
        char[] cArr = this.f15903k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f15902j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f15903k = charArray;
            return charArray;
        } else if (!this.f15898f) {
            return this.f15900h;
        } else {
            return mo33960e();
        }
    }

    /* renamed from: q */
    public int mo33970q() {
        int i = this.f15895c;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    /* renamed from: r */
    public void mo33971r() {
        if (this.f15893a == null) {
            mo33973t();
        } else if (this.f15900h != null) {
            mo33973t();
            char[] cArr = this.f15900h;
            this.f15900h = null;
            this.f15893a.mo33943g(C6822a.C6824b.TEXT_BUFFER, cArr);
        }
    }

    /* renamed from: s */
    public void mo33972s(char[] cArr, int i, int i2) {
        this.f15894b = null;
        this.f15895c = -1;
        this.f15896d = 0;
        this.f15902j = null;
        this.f15903k = null;
        if (this.f15898f) {
            m25665d();
        } else if (this.f15900h == null) {
            this.f15900h = m25667l(i2);
        }
        this.f15899g = 0;
        this.f15901i = 0;
        mo33959b(cArr, i, i2);
    }

    /* renamed from: t */
    public void mo33973t() {
        this.f15895c = -1;
        this.f15901i = 0;
        this.f15896d = 0;
        this.f15894b = null;
        this.f15902j = null;
        this.f15903k = null;
        if (this.f15898f) {
            m25665d();
        }
    }

    public String toString() {
        return mo33963h();
    }

    /* renamed from: u */
    public void mo33975u(char[] cArr, int i, int i2) {
        this.f15902j = null;
        this.f15903k = null;
        this.f15894b = cArr;
        this.f15895c = i;
        this.f15896d = i2;
        if (this.f15898f) {
            m25665d();
        }
    }

    /* renamed from: v */
    public void mo33976v(String str) {
        this.f15894b = null;
        this.f15895c = -1;
        this.f15896d = 0;
        this.f15902j = str;
        this.f15903k = null;
        if (this.f15898f) {
            m25665d();
        }
        this.f15901i = 0;
    }

    /* renamed from: w */
    public void mo33977w(int i) {
        this.f15901i = i;
    }

    /* renamed from: x */
    public int mo33978x() {
        if (this.f15895c >= 0) {
            return this.f15896d;
        }
        char[] cArr = this.f15903k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f15902j;
        if (str != null) {
            return str.length();
        }
        return this.f15899g + this.f15901i;
    }
}
