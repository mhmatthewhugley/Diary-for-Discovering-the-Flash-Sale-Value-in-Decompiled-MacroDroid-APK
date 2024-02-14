package p297ja;

import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0011J \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0011\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0002¨\u0006\u0013"}, mo71668d2 = {"Lja/e;", "", "", "major", "minor", "patch", "d", "", "toString", "", "other", "", "equals", "hashCode", "b", "<init>", "(III)V", "(II)V", "a", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: ja.e */
/* compiled from: KotlinVersion.kt */
public final class C13318e implements Comparable<C13318e> {

    /* renamed from: g */
    public static final C13319a f61315g = new C13319a((C13695i) null);

    /* renamed from: o */
    public static final C13318e f61316o = C13320f.m85664a();

    /* renamed from: a */
    private final int f61317a;

    /* renamed from: c */
    private final int f61318c;

    /* renamed from: d */
    private final int f61319d;

    /* renamed from: f */
    private final int f61320f;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo71668d2 = {"Lja/e$a;", "", "Lja/e;", "CURRENT", "Lja/e;", "", "MAX_COMPONENT_VALUE", "I", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: ja.e$a */
    /* compiled from: KotlinVersion.kt */
    public static final class C13319a {
        private C13319a() {
        }

        public /* synthetic */ C13319a(C13695i iVar) {
            this();
        }
    }

    public C13318e(int i, int i2, int i3) {
        this.f61317a = i;
        this.f61318c = i2;
        this.f61319d = i3;
        this.f61320f = m85662d(i, i2, i3);
    }

    /* renamed from: d */
    private final int m85662d(int i, int i2, int i3) {
        boolean z = false;
        if (new C16788e(0, 255).mo79775k(i) && new C16788e(0, 255).mo79775k(i2) && new C16788e(0, 255).mo79775k(i3)) {
            z = true;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + FilenameUtils.EXTENSION_SEPARATOR + i2 + FilenameUtils.EXTENSION_SEPARATOR + i3).toString());
    }

    /* renamed from: b */
    public int compareTo(C13318e eVar) {
        C13706o.m87929f(eVar, "other");
        return this.f61320f - eVar.f61320f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C13318e eVar = obj instanceof C13318e ? (C13318e) obj : null;
        if (eVar != null && this.f61320f == eVar.f61320f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f61320f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f61317a);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(this.f61318c);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(this.f61319d);
        return sb.toString();
    }

    public C13318e(int i, int i2) {
        this(i, i2, 0);
    }
}
