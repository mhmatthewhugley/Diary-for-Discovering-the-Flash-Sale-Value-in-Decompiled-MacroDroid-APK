package p362pb;

import java.util.List;

/* renamed from: pb.c */
/* compiled from: FqName */
public final class C16152c {

    /* renamed from: c */
    public static final C16152c f66287c = new C16152c("");

    /* renamed from: a */
    private final C16153d f66288a;

    /* renamed from: b */
    private transient C16152c f66289b;

    public C16152c(String str) {
        if (str == null) {
            m96985a(1);
        }
        this.f66288a = new C16153d(str, this);
    }

    /* renamed from: a */
    private static /* synthetic */ void m96985a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
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
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: k */
    public static C16152c m96986k(C16157f fVar) {
        if (fVar == null) {
            m96985a(13);
        }
        return new C16152c(C16153d.m96998m(fVar));
    }

    /* renamed from: b */
    public String mo78556b() {
        String b = this.f66288a.mo78568b();
        if (b == null) {
            m96985a(4);
        }
        return b;
    }

    /* renamed from: c */
    public C16152c mo78557c(C16157f fVar) {
        if (fVar == null) {
            m96985a(8);
        }
        return new C16152c(this.f66288a.mo78569c(fVar), this);
    }

    /* renamed from: d */
    public boolean mo78558d() {
        return this.f66288a.mo78570e();
    }

    /* renamed from: e */
    public C16152c mo78559e() {
        C16152c cVar = this.f66289b;
        if (cVar != null) {
            if (cVar == null) {
                m96985a(6);
            }
            return cVar;
        } else if (!mo78558d()) {
            C16152c cVar2 = new C16152c(this.f66288a.mo78573g());
            this.f66289b = cVar2;
            return cVar2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16152c) && this.f66288a.equals(((C16152c) obj).f66288a);
    }

    /* renamed from: f */
    public List<C16157f> mo78561f() {
        List<C16157f> h = this.f66288a.mo78574h();
        if (h == null) {
            m96985a(11);
        }
        return h;
    }

    /* renamed from: g */
    public C16157f mo78562g() {
        C16157f i = this.f66288a.mo78576i();
        if (i == null) {
            m96985a(9);
        }
        return i;
    }

    /* renamed from: h */
    public C16157f mo78563h() {
        C16157f j = this.f66288a.mo78577j();
        if (j == null) {
            m96985a(10);
        }
        return j;
    }

    public int hashCode() {
        return this.f66288a.hashCode();
    }

    /* renamed from: i */
    public boolean mo78565i(C16157f fVar) {
        if (fVar == null) {
            m96985a(12);
        }
        return this.f66288a.mo78578k(fVar);
    }

    /* renamed from: j */
    public C16153d mo78566j() {
        C16153d dVar = this.f66288a;
        if (dVar == null) {
            m96985a(5);
        }
        return dVar;
    }

    public String toString() {
        return this.f66288a.toString();
    }

    public C16152c(C16153d dVar) {
        if (dVar == null) {
            m96985a(2);
        }
        this.f66288a = dVar;
    }

    private C16152c(C16153d dVar, C16152c cVar) {
        if (dVar == null) {
            m96985a(3);
        }
        this.f66288a = dVar;
        this.f66289b = cVar;
    }
}
