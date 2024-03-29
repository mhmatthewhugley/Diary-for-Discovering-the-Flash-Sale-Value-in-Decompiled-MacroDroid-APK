package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo71668d2 = {"Lkotlinx/coroutines/f1;", "Lkotlinx/coroutines/r1;", "", "toString", "", "a", "Z", "b", "()Z", "isActive", "Lkotlinx/coroutines/i2;", "c", "()Lkotlinx/coroutines/i2;", "list", "<init>", "(Z)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.f1 */
/* compiled from: JobSupport.kt */
final class C15266f1 implements C15511r1 {

    /* renamed from: a */
    private final boolean f64483a;

    public C15266f1(boolean z) {
        this.f64483a = z;
    }

    /* renamed from: b */
    public boolean mo74521b() {
        return this.f64483a;
    }

    /* renamed from: c */
    public C15427i2 mo74522c() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(mo74521b() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
