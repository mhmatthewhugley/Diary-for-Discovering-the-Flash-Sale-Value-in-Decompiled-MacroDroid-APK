package p215b8;

/* renamed from: b8.a */
/* compiled from: Permission */
public class C11101a {

    /* renamed from: a */
    public final String f54018a;

    /* renamed from: b */
    public final boolean f54019b;

    /* renamed from: c */
    public final boolean f54020c;

    public C11101a(String str, boolean z, boolean z2) {
        this.f54018a = str;
        this.f54019b = z;
        this.f54020c = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11101a aVar = (C11101a) obj;
        if (this.f54019b == aVar.f54019b && this.f54020c == aVar.f54020c) {
            return this.f54018a.equals(aVar.f54018a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f54018a.hashCode() * 31) + (this.f54019b ? 1 : 0)) * 31) + (this.f54020c ? 1 : 0);
    }

    public String toString() {
        return "Permission{name='" + this.f54018a + '\'' + ", granted=" + this.f54019b + ", shouldShowRequestPermissionRationale=" + this.f54020c + '}';
    }
}
