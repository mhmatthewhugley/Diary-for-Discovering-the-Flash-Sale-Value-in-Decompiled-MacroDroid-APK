package p377r8;

/* renamed from: r8.b */
/* compiled from: ExifInfo */
public class C16363b {

    /* renamed from: a */
    private int f66912a;

    /* renamed from: b */
    private int f66913b;

    /* renamed from: c */
    private int f66914c;

    public C16363b(int i, int i2, int i3) {
        this.f66912a = i;
        this.f66913b = i2;
        this.f66914c = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C16363b bVar = (C16363b) obj;
        if (this.f66912a == bVar.f66912a && this.f66913b == bVar.f66913b && this.f66914c == bVar.f66914c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f66912a * 31) + this.f66913b) * 31) + this.f66914c;
    }
}
