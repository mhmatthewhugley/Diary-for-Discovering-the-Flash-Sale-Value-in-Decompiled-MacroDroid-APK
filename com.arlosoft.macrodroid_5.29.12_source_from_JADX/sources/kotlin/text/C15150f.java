package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo71668d2 = {"Lkotlin/text/f;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "Lwa/e;", "range", "<init>", "(Ljava/lang/String;Lwa/e;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.text.f */
/* compiled from: Regex.kt */
public final class C15150f {

    /* renamed from: a */
    private final String f64367a;

    /* renamed from: b */
    private final C16788e f64368b;

    public C15150f(String str, C16788e eVar) {
        C13706o.m87929f(str, "value");
        C13706o.m87929f(eVar, "range");
        this.f64367a = str;
        this.f64368b = eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15150f)) {
            return false;
        }
        C15150f fVar = (C15150f) obj;
        return C13706o.m87924a(this.f64367a, fVar.f64367a) && C13706o.m87924a(this.f64368b, fVar.f64368b);
    }

    public int hashCode() {
        return (this.f64367a.hashCode() * 31) + this.f64368b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f64367a + ", range=" + this.f64368b + ')';
    }
}
