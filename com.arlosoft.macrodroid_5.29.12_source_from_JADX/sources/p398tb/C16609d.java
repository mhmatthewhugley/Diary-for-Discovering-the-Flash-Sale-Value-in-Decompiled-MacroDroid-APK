package p398tb;

import org.apache.commons.p353io.FilenameUtils;
import p362pb.C16151b;
import p362pb.C16152c;

/* renamed from: tb.d */
/* compiled from: JvmClassName */
public class C16609d {

    /* renamed from: a */
    private final String f67434a;

    /* renamed from: b */
    private C16152c f67435b;

    private C16609d(String str) {
        if (str == null) {
            m98926a(5);
        }
        this.f67434a = str;
    }

    /* renamed from: a */
    private static /* synthetic */ void m98926a(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 6 || i == 7 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static C16609d m98927b(C16151b bVar) {
        if (bVar == null) {
            m98926a(1);
        }
        C16152c h = bVar.mo78549h();
        String replace = bVar.mo78551i().mo78556b().replace(FilenameUtils.EXTENSION_SEPARATOR, '$');
        if (h.mo78558d()) {
            return new C16609d(replace);
        }
        return new C16609d(h.mo78556b().replace(FilenameUtils.EXTENSION_SEPARATOR, '/') + "/" + replace);
    }

    /* renamed from: c */
    public static C16609d m98928c(C16152c cVar) {
        if (cVar == null) {
            m98926a(2);
        }
        C16609d dVar = new C16609d(cVar.mo78556b().replace(FilenameUtils.EXTENSION_SEPARATOR, '/'));
        dVar.f67435b = cVar;
        return dVar;
    }

    /* renamed from: d */
    public static C16609d m98929d(String str) {
        if (str == null) {
            m98926a(0);
        }
        return new C16609d(str);
    }

    /* renamed from: e */
    public C16152c mo79456e() {
        return new C16152c(this.f67434a.replace('/', FilenameUtils.EXTENSION_SEPARATOR));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f67434a.equals(((C16609d) obj).f67434a);
    }

    /* renamed from: f */
    public String mo79458f() {
        String str = this.f67434a;
        if (str == null) {
            m98926a(8);
        }
        return str;
    }

    /* renamed from: g */
    public C16152c mo79459g() {
        int lastIndexOf = this.f67434a.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return new C16152c(this.f67434a.substring(0, lastIndexOf).replace('/', FilenameUtils.EXTENSION_SEPARATOR));
        }
        C16152c cVar = C16152c.f66287c;
        if (cVar == null) {
            m98926a(7);
        }
        return cVar;
    }

    public int hashCode() {
        return this.f67434a.hashCode();
    }

    public String toString() {
        return this.f67434a;
    }
}
