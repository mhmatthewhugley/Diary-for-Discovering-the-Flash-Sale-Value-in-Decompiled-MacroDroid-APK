package p362pb;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.apache.commons.p353io.FilenameUtils;

/* renamed from: pb.b */
/* compiled from: ClassId */
public final class C16151b {

    /* renamed from: a */
    private final C16152c f66284a;

    /* renamed from: b */
    private final C16152c f66285b;

    /* renamed from: c */
    private final boolean f66286c;

    public C16151b(C16152c cVar, C16152c cVar2, boolean z) {
        if (cVar == null) {
            m96972a(1);
        }
        if (cVar2 == null) {
            m96972a(2);
        }
        this.f66284a = cVar;
        this.f66285b = cVar2;
        this.f66286c = z;
    }

    /* renamed from: a */
    private static /* synthetic */ void m96972a(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 5 || i == 6 || i == 7 || i == 9)) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 5 || i == 6 || i == 7 || i == 9)) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case 12:
                objArr[0] = TypedValues.Custom.S_STRING;
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i == 7) {
            objArr[1] = "getShortClassName";
        } else if (i != 9) {
            switch (i) {
                case 13:
                case 14:
                    objArr[1] = "asString";
                    break;
                case 15:
                case 16:
                    objArr[1] = "asFqNameString";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                    break;
            }
        } else {
            objArr[1] = "asSingleFqName";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 5 || i == 6 || i == 7 || i == 9)) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: e */
    public static C16151b m96973e(String str) {
        if (str == null) {
            m96972a(11);
        }
        return m96974f(str, false);
    }

    /* renamed from: f */
    public static C16151b m96974f(String str, boolean z) {
        String str2;
        if (str == null) {
            m96972a(12);
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            str2 = "";
        } else {
            String replace = str.substring(0, lastIndexOf).replace('/', FilenameUtils.EXTENSION_SEPARATOR);
            str = str.substring(lastIndexOf + 1);
            str2 = replace;
        }
        return new C16151b(new C16152c(str2), new C16152c(str), z);
    }

    /* renamed from: m */
    public static C16151b m96975m(C16152c cVar) {
        if (cVar == null) {
            m96972a(0);
        }
        return new C16151b(cVar.mo78559e(), cVar.mo78562g());
    }

    /* renamed from: b */
    public C16152c mo78544b() {
        if (this.f66284a.mo78558d()) {
            C16152c cVar = this.f66285b;
            if (cVar == null) {
                m96972a(9);
            }
            return cVar;
        }
        return new C16152c(this.f66284a.mo78556b() + "." + this.f66285b.mo78556b());
    }

    /* renamed from: c */
    public String mo78545c() {
        if (this.f66284a.mo78558d()) {
            String b = this.f66285b.mo78556b();
            if (b == null) {
                m96972a(13);
            }
            return b;
        }
        String str = this.f66284a.mo78556b().replace(FilenameUtils.EXTENSION_SEPARATOR, '/') + "/" + this.f66285b.mo78556b();
        if (str == null) {
            m96972a(14);
        }
        return str;
    }

    /* renamed from: d */
    public C16151b mo78546d(C16157f fVar) {
        if (fVar == null) {
            m96972a(8);
        }
        return new C16151b(mo78549h(), this.f66285b.mo78557c(fVar), this.f66286c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16151b.class != obj.getClass()) {
            return false;
        }
        C16151b bVar = (C16151b) obj;
        if (!this.f66284a.equals(bVar.f66284a) || !this.f66285b.equals(bVar.f66285b) || this.f66286c != bVar.f66286c) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public C16151b mo78548g() {
        C16152c e = this.f66285b.mo78559e();
        if (e.mo78558d()) {
            return null;
        }
        return new C16151b(mo78549h(), e, this.f66286c);
    }

    /* renamed from: h */
    public C16152c mo78549h() {
        C16152c cVar = this.f66284a;
        if (cVar == null) {
            m96972a(5);
        }
        return cVar;
    }

    public int hashCode() {
        return (((this.f66284a.hashCode() * 31) + this.f66285b.hashCode()) * 31) + Boolean.valueOf(this.f66286c).hashCode();
    }

    /* renamed from: i */
    public C16152c mo78551i() {
        C16152c cVar = this.f66285b;
        if (cVar == null) {
            m96972a(6);
        }
        return cVar;
    }

    /* renamed from: j */
    public C16157f mo78552j() {
        C16157f g = this.f66285b.mo78562g();
        if (g == null) {
            m96972a(7);
        }
        return g;
    }

    /* renamed from: k */
    public boolean mo78553k() {
        return this.f66286c;
    }

    /* renamed from: l */
    public boolean mo78554l() {
        return !this.f66285b.mo78559e().mo78558d();
    }

    public String toString() {
        if (!this.f66284a.mo78558d()) {
            return mo78545c();
        }
        return "/" + mo78545c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C16151b(C16152c cVar, C16157f fVar) {
        this(cVar, C16152c.m96986k(fVar), false);
        if (cVar == null) {
            m96972a(3);
        }
        if (fVar == null) {
            m96972a(4);
        }
    }
}
