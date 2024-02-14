package retrofit2;

import java.io.IOException;
import java.util.regex.Pattern;
import okhttp3.C15904b0;
import okhttp3.C15907c0;
import okhttp3.C15979s;
import okhttp3.C15986u;
import okhttp3.C15989v;
import okhttp3.C15995x;
import okhttp3.C15997y;
import p226cd.C11179b;
import p226cd.C11184c;

/* renamed from: retrofit2.q */
/* compiled from: RequestBuilder */
final class C17296q {

    /* renamed from: l */
    private static final char[] f68900l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    private static final Pattern f68901m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    private final String f68902a;

    /* renamed from: b */
    private final C15989v f68903b;

    /* renamed from: c */
    private String f68904c;

    /* renamed from: d */
    private C15989v.C15990a f68905d;

    /* renamed from: e */
    private final C15904b0.C15905a f68906e = new C15904b0.C15905a();

    /* renamed from: f */
    private final C15986u.C15987a f68907f;

    /* renamed from: g */
    private C15995x f68908g;

    /* renamed from: h */
    private final boolean f68909h;

    /* renamed from: i */
    private C15997y.C15998a f68910i;

    /* renamed from: j */
    private C15979s.C15980a f68911j;

    /* renamed from: k */
    private C15907c0 f68912k;

    /* renamed from: retrofit2.q$a */
    /* compiled from: RequestBuilder */
    private static class C17297a extends C15907c0 {

        /* renamed from: b */
        private final C15907c0 f68913b;

        /* renamed from: c */
        private final C15995x f68914c;

        C17297a(C15907c0 c0Var, C15995x xVar) {
            this.f68913b = c0Var;
            this.f68914c = xVar;
        }

        /* renamed from: a */
        public long mo75937a() throws IOException {
            return this.f68913b.mo75937a();
        }

        /* renamed from: b */
        public C15995x mo75938b() {
            return this.f68914c;
        }

        /* renamed from: h */
        public void mo75941h(C11184c cVar) throws IOException {
            this.f68913b.mo75941h(cVar);
        }
    }

    C17296q(String str, C15989v vVar, String str2, C15986u uVar, C15995x xVar, boolean z, boolean z2, boolean z3) {
        this.f68902a = str;
        this.f68903b = vVar;
        this.f68904c = str2;
        this.f68908g = xVar;
        this.f68909h = z;
        if (uVar != null) {
            this.f68907f = uVar.mo76244f();
        } else {
            this.f68907f = new C15986u.C15987a();
        }
        if (z2) {
            this.f68911j = new C15979s.C15980a();
        } else if (z3) {
            C15997y.C15998a aVar = new C15997y.C15998a();
            this.f68910i = aVar;
            aVar.mo76325d(C15997y.f65826k);
        }
    }

    /* renamed from: i */
    private static String m100944i(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                C11179b bVar = new C11179b();
                bVar.mo62460v0(str, 0, i);
                m100945j(bVar, str, i, length, z);
                return bVar.mo62471z();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: j */
    private static void m100945j(C11179b bVar, String str, int i, int i2, boolean z) {
        C11179b bVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (bVar2 == null) {
                        bVar2 = new C11179b();
                    }
                    bVar2.mo62440j0(codePointAt);
                    while (!bVar2.mo62469x1()) {
                        byte readByte = bVar2.readByte() & 255;
                        bVar.writeByte(37);
                        char[] cArr = f68900l;
                        bVar.writeByte(cArr[(readByte >> 4) & 15]);
                        bVar.writeByte(cArr[readByte & 15]);
                    }
                } else {
                    bVar.mo62440j0(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo80579a(String str, String str2, boolean z) {
        if (z) {
            this.f68911j.mo76229b(str, str2);
        } else {
            this.f68911j.mo76228a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo80580b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f68908g = C15995x.m96395e(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e);
            }
        } else {
            this.f68907f.mo76251a(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo80581c(C15986u uVar) {
        this.f68907f.mo76252b(uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo80582d(C15986u uVar, C15907c0 c0Var) {
        this.f68910i.mo76322a(uVar, c0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo80583e(C15997y.C16000c cVar) {
        this.f68910i.mo76323b(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo80584f(String str, String str2, boolean z) {
        if (this.f68904c != null) {
            String i = m100944i(str2, z);
            String str3 = this.f68904c;
            String replace = str3.replace("{" + str + "}", i);
            if (!f68901m.matcher(replace).matches()) {
                this.f68904c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo80585g(String str, String str2, boolean z) {
        String str3 = this.f68904c;
        if (str3 != null) {
            C15989v.C15990a l = this.f68903b.mo76272l(str3);
            this.f68905d = l;
            if (l != null) {
                this.f68904c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f68903b + ", Relative: " + this.f68904c);
            }
        }
        if (z) {
            this.f68905d.mo76282a(str, str2);
        } else {
            this.f68905d.mo76283b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public <T> void mo80586h(Class<T> cls, T t) {
        this.f68906e.mo75934m(cls, t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C15904b0.C15905a mo80587k() {
        C15989v vVar;
        C15989v.C15990a aVar = this.f68905d;
        if (aVar != null) {
            vVar = aVar.mo76284c();
        } else {
            vVar = this.f68903b.mo76277q(this.f68904c);
            if (vVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f68903b + ", Relative: " + this.f68904c);
            }
        }
        C17297a aVar2 = this.f68912k;
        if (aVar2 == null) {
            C15979s.C15980a aVar3 = this.f68911j;
            if (aVar3 != null) {
                aVar2 = aVar3.mo76230c();
            } else {
                C15997y.C15998a aVar4 = this.f68910i;
                if (aVar4 != null) {
                    aVar2 = aVar4.mo76324c();
                } else if (this.f68909h) {
                    aVar2 = C15907c0.m95944e((C15995x) null, new byte[0]);
                }
            }
        }
        C15995x xVar = this.f68908g;
        if (xVar != null) {
            if (aVar2 != null) {
                aVar2 = new C17297a(aVar2, xVar);
            } else {
                this.f68907f.mo76251a("Content-Type", xVar.toString());
            }
        }
        return this.f68906e.mo75936o(vVar).mo75928g(this.f68907f.mo76256f()).mo75929h(this.f68902a, aVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo80588l(C15907c0 c0Var) {
        this.f68912k = c0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo80589m(Object obj) {
        this.f68904c = obj.toString();
    }
}
