package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C13681c;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.IOUtils;
import p297ja.C13328m;
import p297ja.C13337s;
import p372qc.C16279b;
import p379ra.C16368a;
import p424wa.C16785c;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\u0018\u0000 \u00052\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u0017\u001eB\u0017\b\u0002\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0004\u001a\u00020\u0003J\u001b\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, mo71668d2 = {"Lokhttp3/u;", "", "Lja/m;", "", "name", "c", "", "index", "d", "i", "", "j", "", "iterator", "Lokhttp3/u$a;", "f", "", "other", "", "equals", "hashCode", "toString", "", "a", "[Ljava/lang/String;", "namesAndValues", "size", "()I", "<init>", "([Ljava/lang/String;)V", "b", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.u */
/* compiled from: Headers.kt */
public final class C15986u implements Iterable<C13328m<? extends String, ? extends String>>, C16368a {

    /* renamed from: c */
    public static final C15988b f65791c = new C15988b((C13695i) null);

    /* renamed from: a */
    private final String[] f65792a;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002J\u0019\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0006\u0010\u0011\u001a\u00020\nR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo71668d2 = {"Lokhttp3/u$a;", "", "", "line", "c", "(Ljava/lang/String;)Lokhttp3/u$a;", "name", "value", "a", "e", "Lokhttp3/u;", "headers", "b", "d", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/u$a;", "h", "i", "f", "", "Ljava/util/List;", "g", "()Ljava/util/List;", "namesAndValues", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.u$a */
    /* compiled from: Headers.kt */
    public static final class C15987a {

        /* renamed from: a */
        private final List<String> f65793a = new ArrayList(20);

        /* renamed from: a */
        public final C15987a mo76251a(String str, String str2) {
            C13706o.m87929f(str, "name");
            C13706o.m87929f(str2, "value");
            C15988b bVar = C15986u.f65791c;
            bVar.m96320d(str);
            bVar.m96321e(str2, str);
            mo76254d(str, str2);
            return this;
        }

        /* renamed from: b */
        public final C15987a mo76252b(C15986u uVar) {
            C13706o.m87929f(uVar, "headers");
            int size = uVar.size();
            for (int i = 0; i < size; i++) {
                mo76254d(uVar.mo76242d(i), uVar.mo76246i(i));
            }
            return this;
        }

        /* renamed from: c */
        public final C15987a mo76253c(String str) {
            C13706o.m87929f(str, "line");
            int Z = C15177w.m93681Z(str, ':', 1, false, 4, (Object) null);
            if (Z != -1) {
                String substring = str.substring(0, Z);
                C13706o.m87928e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(Z + 1);
                C13706o.m87928e(substring2, "(this as java.lang.String).substring(startIndex)");
                mo76254d(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                C13706o.m87928e(substring3, "(this as java.lang.String).substring(startIndex)");
                mo76254d("", substring3);
            } else {
                mo76254d("", str);
            }
            return this;
        }

        /* renamed from: d */
        public final C15987a mo76254d(String str, String str2) {
            C13706o.m87929f(str, "name");
            C13706o.m87929f(str2, "value");
            this.f65793a.add(str);
            this.f65793a.add(C15177w.m93672R0(str2).toString());
            return this;
        }

        /* renamed from: e */
        public final C15987a mo76255e(String str, String str2) {
            C13706o.m87929f(str, "name");
            C13706o.m87929f(str2, "value");
            C15986u.f65791c.m96320d(str);
            mo76254d(str, str2);
            return this;
        }

        /* renamed from: f */
        public final C15986u mo76256f() {
            Object[] array = this.f65793a.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new C15986u((String[]) array, (C13695i) null);
        }

        /* renamed from: g */
        public final List<String> mo76257g() {
            return this.f65793a;
        }

        /* renamed from: h */
        public final C15987a mo76258h(String str) {
            C13706o.m87929f(str, "name");
            int i = 0;
            while (i < this.f65793a.size()) {
                if (C15176v.m93641v(str, this.f65793a.get(i), true)) {
                    this.f65793a.remove(i);
                    this.f65793a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: i */
        public final C15987a mo76259i(String str, String str2) {
            C13706o.m87929f(str, "name");
            C13706o.m87929f(str2, "value");
            C15988b bVar = C15986u.f65791c;
            bVar.m96320d(str);
            bVar.m96321e(str2, str);
            mo76258h(str);
            mo76254d(str, str2);
            return this;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J#\u0010\r\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo71668d2 = {"Lokhttp3/u$b;", "", "", "", "namesAndValues", "name", "f", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lja/u;", "d", "value", "e", "Lokhttp3/u;", "g", "([Ljava/lang/String;)Lokhttp3/u;", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: okhttp3.u$b */
    /* compiled from: Headers.kt */
    public static final class C15988b {
        private C15988b() {
        }

        public /* synthetic */ C15988b(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m96320d(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if ('!' <= charAt && '~' >= charAt) {
                        i++;
                    } else {
                        throw new IllegalArgumentException(C16279b.m97663q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final void m96321e(String str, String str2) {
            String str3;
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (!(charAt == 9 || (' ' <= charAt && '~' >= charAt))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C16279b.m97663q("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                    if (C16279b.m97628D(str2)) {
                        str3 = "";
                    } else {
                        str3 = ": " + str;
                    }
                    sb.append(str3);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final String m96322f(String[] strArr, String str) {
            C16785c j = C16792h.m99548j(C16792h.m99547i(strArr.length - 2, 0), 2);
            int d = j.mo79764d();
            int f = j.mo79766f();
            int h = j.mo79767h();
            if (h >= 0) {
                if (d > f) {
                    return null;
                }
            } else if (d < f) {
                return null;
            }
            while (!C15176v.m93641v(str, strArr[d], true)) {
                if (d == f) {
                    return null;
                }
                d += h;
            }
            return strArr[d + 1];
        }

        /* renamed from: g */
        public final C15986u mo76260g(String... strArr) {
            C13706o.m87929f(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                int i = 0;
                while (i < length) {
                    if (strArr2[i] != null) {
                        String str = strArr2[i];
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        strArr2[i] = C15177w.m93672R0(str).toString();
                        i++;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                C16785c j = C16792h.m99548j(C13596m.m87579D(strArr2), 2);
                int d = j.mo79764d();
                int f = j.mo79766f();
                int h = j.mo79767h();
                if (h < 0 ? d >= f : d <= f) {
                    while (true) {
                        String str2 = strArr2[d];
                        String str3 = strArr2[d + 1];
                        m96320d(str2);
                        m96321e(str3, str2);
                        if (d == f) {
                            break;
                        }
                        d += h;
                    }
                }
                return new C15986u(strArr2, (C13695i) null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    private C15986u(String[] strArr) {
        this.f65792a = strArr;
    }

    /* renamed from: h */
    public static final C15986u m96302h(String... strArr) {
        return f65791c.mo76260g(strArr);
    }

    /* renamed from: c */
    public final String mo76241c(String str) {
        C13706o.m87929f(str, "name");
        return f65791c.m96322f(this.f65792a, str);
    }

    /* renamed from: d */
    public final String mo76242d(int i) {
        return this.f65792a[i * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof C15986u) && Arrays.equals(this.f65792a, ((C15986u) obj).f65792a);
    }

    /* renamed from: f */
    public final C15987a mo76244f() {
        C15987a aVar = new C15987a();
        boolean unused = C13624y.m87792A(aVar.mo76257g(), this.f65792a);
        return aVar;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f65792a);
    }

    /* renamed from: i */
    public final String mo76246i(int i) {
        return this.f65792a[(i * 2) + 1];
    }

    public Iterator<C13328m<String, String>> iterator() {
        int size = size();
        C13328m[] mVarArr = new C13328m[size];
        for (int i = 0; i < size; i++) {
            mVarArr[i] = C13337s.m85692a(mo76242d(i), mo76246i(i));
        }
        return C13681c.m87864a(mVarArr);
    }

    /* renamed from: j */
    public final List<String> mo76248j(String str) {
        C13706o.m87929f(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (C15176v.m93641v(str, mo76242d(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo76246i(i));
            }
        }
        if (arrayList == null) {
            return C13614t.m87748j();
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        C13706o.m87928e(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public final int size() {
        return this.f65792a.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String d = mo76242d(i);
            String i2 = mo76246i(i);
            sb.append(d);
            sb.append(": ");
            if (C16279b.m97628D(d)) {
                i2 = "██";
            }
            sb.append(i2);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ C15986u(String[] strArr, C13695i iVar) {
        this(strArr);
    }
}
