package kotlin.jvm.internal;

import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001e\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo71668d2 = {"Lkotlin/jvm/internal/u;", "Lkotlin/jvm/internal/f;", "", "other", "", "equals", "", "hashCode", "", "toString", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "jClass", "c", "Ljava/lang/String;", "moduleName", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.jvm.internal.u */
/* compiled from: PackageReference.kt */
public final class C13712u implements C13688f {

    /* renamed from: a */
    private final Class<?> f61934a;

    /* renamed from: c */
    private final String f61935c;

    public C13712u(Class<?> cls, String str) {
        C13706o.m87929f(cls, "jClass");
        C13706o.m87929f(str, "moduleName");
        this.f61934a = cls;
        this.f61935c = str;
    }

    /* renamed from: e */
    public Class<?> mo71931e() {
        return this.f61934a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13712u) && C13706o.m87924a(mo71931e(), ((C13712u) obj).mo71931e());
    }

    public int hashCode() {
        return mo71931e().hashCode();
    }

    public String toString() {
        return mo71931e().toString() + " (Kotlin reflection is not available)";
    }
}
