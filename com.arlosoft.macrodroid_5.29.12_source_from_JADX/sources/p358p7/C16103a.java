package p358p7;

import java.io.IOException;
import java.net.ProtocolException;
import p345o7.C15814d;

/* renamed from: p7.a */
/* compiled from: StatusLine */
public final class C16103a {

    /* renamed from: a */
    public final C15814d f66071a;

    /* renamed from: b */
    public final int f66072b;

    /* renamed from: c */
    public final String f66073c;

    public C16103a(C15814d dVar, int i, String str) {
        this.f66071a = dVar;
        this.f66072b = i;
        this.f66073c = str;
    }

    /* renamed from: a */
    public static C16103a m96726a(String str) throws IOException {
        C15814d dVar;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                dVar = C15814d.HTTP_1_0;
            } else if (charAt == 1) {
                dVar = C15814d.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            dVar = C15814d.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                return new C16103a(dVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f66071a == C15814d.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f66072b);
        if (this.f66073c != null) {
            sb.append(' ');
            sb.append(this.f66073c);
        }
        return sb.toString();
    }
}
