package p018c0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0015"}, mo71668d2 = {"Lc0/a;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "granted", "Ljava/util/List;", "b", "()Ljava/util/List;", "setGranted", "(Ljava/util/List;)V", "denied", "a", "setDenied", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "excuseme_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: c0.a */
/* compiled from: PermissionStatus.kt */
public final class C1423a {

    /* renamed from: a */
    private List<String> f754a;

    /* renamed from: b */
    private List<String> f755b;

    public C1423a() {
        this((List) null, (List) null, 3, (C13695i) null);
    }

    public C1423a(List<String> list, List<String> list2) {
        C13706o.m87930g(list, "granted");
        C13706o.m87930g(list2, "denied");
        this.f754a = list;
        this.f755b = list2;
    }

    /* renamed from: a */
    public final List<String> mo16887a() {
        return this.f755b;
    }

    /* renamed from: b */
    public final List<String> mo16888b() {
        return this.f754a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1423a)) {
            return false;
        }
        C1423a aVar = (C1423a) obj;
        return C13706o.m87924a(this.f754a, aVar.f754a) && C13706o.m87924a(this.f755b, aVar.f755b);
    }

    public int hashCode() {
        List<String> list = this.f754a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f755b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "PermissionStatus(granted=" + this.f754a + ", denied=" + this.f755b + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1423a(List list, List list2, int i, C13695i iVar) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2);
    }
}
