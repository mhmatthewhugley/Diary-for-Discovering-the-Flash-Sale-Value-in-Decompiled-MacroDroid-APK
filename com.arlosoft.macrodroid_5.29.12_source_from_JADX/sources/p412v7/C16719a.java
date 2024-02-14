package p412v7;

import java.util.NoSuchElementException;
import java.util.Vector;

/* renamed from: v7.a */
/* compiled from: MimeTypeFile */
class C16719a {

    /* renamed from: a */
    private int f67646a = 0;

    /* renamed from: b */
    private int f67647b;

    /* renamed from: c */
    private String f67648c;

    /* renamed from: d */
    private Vector f67649d = new Vector();

    public C16719a(String str) {
        this.f67648c = str;
        this.f67647b = str.length();
    }

    /* renamed from: c */
    private void m99257c() {
        while (true) {
            int i = this.f67646a;
            if (i < this.f67647b && Character.isWhitespace(this.f67648c.charAt(i))) {
                this.f67646a++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean mo79636a() {
        if (this.f67649d.size() > 0) {
            return true;
        }
        m99257c();
        if (this.f67646a < this.f67647b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public String mo79637b() {
        int size = this.f67649d.size();
        if (size > 0) {
            int i = size - 1;
            String str = (String) this.f67649d.elementAt(i);
            this.f67649d.removeElementAt(i);
            return str;
        }
        m99257c();
        int i2 = this.f67646a;
        if (i2 < this.f67647b) {
            char charAt = this.f67648c.charAt(i2);
            if (charAt != '\"') {
                if ("=".indexOf(charAt) < 0) {
                    while (true) {
                        int i3 = this.f67646a;
                        if (i3 >= this.f67647b || "=".indexOf(this.f67648c.charAt(i3)) >= 0 || Character.isWhitespace(this.f67648c.charAt(this.f67646a))) {
                            break;
                        }
                        this.f67646a++;
                    }
                } else {
                    this.f67646a++;
                }
            } else {
                this.f67646a++;
                boolean z = false;
                while (true) {
                    int i4 = this.f67646a;
                    if (i4 >= this.f67647b) {
                        break;
                    }
                    String str2 = this.f67648c;
                    this.f67646a = i4 + 1;
                    char charAt2 = str2.charAt(i4);
                    if (charAt2 == '\\') {
                        this.f67646a++;
                        z = true;
                    } else if (charAt2 == '\"') {
                        if (!z) {
                            return this.f67648c.substring(i2 + 1, this.f67646a - 1);
                        }
                        StringBuffer stringBuffer = new StringBuffer();
                        for (int i5 = i2 + 1; i5 < this.f67646a - 1; i5++) {
                            char charAt3 = this.f67648c.charAt(i5);
                            if (charAt3 != '\\') {
                                stringBuffer.append(charAt3);
                            }
                        }
                        return stringBuffer.toString();
                    }
                }
            }
            return this.f67648c.substring(i2, this.f67646a);
        }
        throw new NoSuchElementException();
    }
}
