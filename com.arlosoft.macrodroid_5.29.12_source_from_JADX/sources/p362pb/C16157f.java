package p362pb;

/* renamed from: pb.f */
/* compiled from: Name */
public final class C16157f implements Comparable<C16157f> {

    /* renamed from: a */
    private final String f66298a;

    /* renamed from: c */
    private final boolean f66299c;

    private C16157f(String str, boolean z) {
        if (str == null) {
            m97017b(0);
        }
        this.f66298a = str;
        this.f66299c = z;
    }

    /* renamed from: b */
    private static /* synthetic */ void m97017b(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3)];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2 || i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: g */
    public static C16157f m97018g(String str) {
        if (str == null) {
            m97017b(8);
        }
        if (str.startsWith("<")) {
            return m97021l(str);
        }
        return m97019i(str);
    }

    /* renamed from: i */
    public static C16157f m97019i(String str) {
        if (str == null) {
            m97017b(5);
        }
        return new C16157f(str, false);
    }

    /* renamed from: k */
    public static boolean m97020k(String str) {
        if (str == null) {
            m97017b(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public static C16157f m97021l(String str) {
        if (str == null) {
            m97017b(7);
        }
        if (str.startsWith("<")) {
            return new C16157f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    /* renamed from: d */
    public String mo78583d() {
        String str = this.f66298a;
        if (str == null) {
            m97017b(1);
        }
        return str;
    }

    /* renamed from: e */
    public int compareTo(C16157f fVar) {
        return this.f66298a.compareTo(fVar.f66298a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16157f)) {
            return false;
        }
        C16157f fVar = (C16157f) obj;
        return this.f66299c == fVar.f66299c && this.f66298a.equals(fVar.f66298a);
    }

    /* renamed from: f */
    public String mo78586f() {
        if (!this.f66299c) {
            String d = mo78583d();
            if (d == null) {
                m97017b(2);
            }
            return d;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public int hashCode() {
        return (this.f66298a.hashCode() * 31) + (this.f66299c ? 1 : 0);
    }

    /* renamed from: j */
    public boolean mo78588j() {
        return this.f66299c;
    }

    public String toString() {
        return this.f66298a;
    }
}
