package p408uc;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15899a0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, mo71668d2 = {"Luc/k;", "", "", "toString", "Lokhttp3/a0;", "protocol", "", "code", "message", "<init>", "(Lokhttp3/a0;ILjava/lang/String;)V", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: uc.k */
/* compiled from: StatusLine.kt */
public final class C16696k {

    /* renamed from: d */
    public static final C16697a f67596d = new C16697a((C13695i) null);

    /* renamed from: a */
    public final C15899a0 f67597a;

    /* renamed from: b */
    public final int f67598b;

    /* renamed from: c */
    public final String f67599c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, mo71668d2 = {"Luc/k$a;", "", "", "statusLine", "Luc/k;", "a", "", "HTTP_CONTINUE", "I", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: uc.k$a */
    /* compiled from: StatusLine.kt */
    public static final class C16697a {
        private C16697a() {
        }

        public /* synthetic */ C16697a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C16696k mo79605a(String str) throws IOException {
            C15899a0 a0Var;
            String str2;
            C13706o.m87929f(str, "statusLine");
            int i = 9;
            if (C15176v.m93634I(str, "HTTP/1.", false, 2, (Object) null)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    a0Var = C15899a0.HTTP_1_0;
                } else if (charAt == 1) {
                    a0Var = C15899a0.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else if (C15176v.m93634I(str, "ICY ", false, 2, (Object) null)) {
                a0Var = C15899a0.HTTP_1_0;
                i = 4;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                try {
                    String substring = str.substring(i, i2);
                    C13706o.m87928e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i2) {
                        str2 = "";
                    } else if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                        C13706o.m87928e(str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    return new C16696k(a0Var, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
    }

    public C16696k(C15899a0 a0Var, int i, String str) {
        C13706o.m87929f(a0Var, "protocol");
        C13706o.m87929f(str, "message");
        this.f67597a = a0Var;
        this.f67598b = i;
        this.f67599c = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f67597a == C15899a0.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f67598b);
        sb.append(' ');
        sb.append(this.f67599c);
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
