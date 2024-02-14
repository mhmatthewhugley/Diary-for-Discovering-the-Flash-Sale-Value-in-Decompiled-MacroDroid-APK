package p362pb;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p370qa.C16265l;

/* renamed from: pb.d */
/* compiled from: FqNameUnsafe */
public final class C16153d {

    /* renamed from: e */
    private static final C16157f f66290e = C16157f.m97021l("<root>");

    /* renamed from: f */
    private static final Pattern f66291f = Pattern.compile("\\.");

    /* renamed from: g */
    private static final C16265l<String, C16157f> f66292g = new C16154a();

    /* renamed from: a */
    private final String f66293a;

    /* renamed from: b */
    private transient C16152c f66294b;

    /* renamed from: c */
    private transient C16153d f66295c;

    /* renamed from: d */
    private transient C16157f f66296d;

    /* renamed from: pb.d$a */
    /* compiled from: FqNameUnsafe */
    static class C16154a implements C16265l<String, C16157f> {
        C16154a() {
        }

        /* renamed from: a */
        public C16157f invoke(String str) {
            return C16157f.m97018g(str);
        }
    }

    C16153d(String str, C16152c cVar) {
        if (str == null) {
            m96996a(0);
        }
        if (cVar == null) {
            m96996a(1);
        }
        this.f66293a = str;
        this.f66294b = cVar;
    }

    /* renamed from: a */
    private static /* synthetic */ void m96996a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: d */
    private void m96997d() {
        int lastIndexOf = this.f66293a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f66296d = C16157f.m97018g(this.f66293a.substring(lastIndexOf + 1));
            this.f66295c = new C16153d(this.f66293a.substring(0, lastIndexOf));
            return;
        }
        this.f66296d = C16157f.m97018g(this.f66293a);
        this.f66295c = C16152c.f66287c.mo78566j();
    }

    /* renamed from: m */
    public static C16153d m96998m(C16157f fVar) {
        if (fVar == null) {
            m96996a(16);
        }
        return new C16153d(fVar.mo78583d(), C16152c.f66287c.mo78566j(), fVar);
    }

    /* renamed from: b */
    public String mo78568b() {
        String str = this.f66293a;
        if (str == null) {
            m96996a(4);
        }
        return str;
    }

    /* renamed from: c */
    public C16153d mo78569c(C16157f fVar) {
        String str;
        if (fVar == null) {
            m96996a(9);
        }
        if (mo78570e()) {
            str = fVar.mo78583d();
        } else {
            str = this.f66293a + "." + fVar.mo78583d();
        }
        return new C16153d(str, this, fVar);
    }

    /* renamed from: e */
    public boolean mo78570e() {
        return this.f66293a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16153d) && this.f66293a.equals(((C16153d) obj).f66293a);
    }

    /* renamed from: f */
    public boolean mo78572f() {
        return this.f66294b != null || mo78568b().indexOf(60) < 0;
    }

    /* renamed from: g */
    public C16153d mo78573g() {
        C16153d dVar = this.f66295c;
        if (dVar != null) {
            if (dVar == null) {
                m96996a(7);
            }
            return dVar;
        } else if (!mo78570e()) {
            m96997d();
            C16153d dVar2 = this.f66295c;
            if (dVar2 == null) {
                m96996a(8);
            }
            return dVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    /* renamed from: h */
    public List<C16157f> mo78574h() {
        List<C16157f> emptyList = mo78570e() ? Collections.emptyList() : C13596m.m87593R(f66291f.split(this.f66293a), f66292g);
        if (emptyList == null) {
            m96996a(14);
        }
        return emptyList;
    }

    public int hashCode() {
        return this.f66293a.hashCode();
    }

    /* renamed from: i */
    public C16157f mo78576i() {
        C16157f fVar = this.f66296d;
        if (fVar != null) {
            if (fVar == null) {
                m96996a(10);
            }
            return fVar;
        } else if (!mo78570e()) {
            m96997d();
            C16157f fVar2 = this.f66296d;
            if (fVar2 == null) {
                m96996a(11);
            }
            return fVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    /* renamed from: j */
    public C16157f mo78577j() {
        if (mo78570e()) {
            C16157f fVar = f66290e;
            if (fVar == null) {
                m96996a(12);
            }
            return fVar;
        }
        C16157f i = mo78576i();
        if (i == null) {
            m96996a(13);
        }
        return i;
    }

    /* renamed from: k */
    public boolean mo78578k(C16157f fVar) {
        if (fVar == null) {
            m96996a(15);
        }
        if (mo78570e()) {
            return false;
        }
        int indexOf = this.f66293a.indexOf(46);
        String str = this.f66293a;
        String d = fVar.mo78583d();
        if (indexOf == -1) {
            indexOf = this.f66293a.length();
        }
        return str.regionMatches(0, d, 0, indexOf);
    }

    /* renamed from: l */
    public C16152c mo78579l() {
        C16152c cVar = this.f66294b;
        if (cVar != null) {
            if (cVar == null) {
                m96996a(5);
            }
            return cVar;
        }
        C16152c cVar2 = new C16152c(this);
        this.f66294b = cVar2;
        return cVar2;
    }

    public String toString() {
        String d = mo78570e() ? f66290e.mo78583d() : this.f66293a;
        if (d == null) {
            m96996a(17);
        }
        return d;
    }

    public C16153d(String str) {
        if (str == null) {
            m96996a(2);
        }
        this.f66293a = str;
    }

    private C16153d(String str, C16153d dVar, C16157f fVar) {
        if (str == null) {
            m96996a(3);
        }
        this.f66293a = str;
        this.f66295c = dVar;
        this.f66296d = fVar;
    }
}
