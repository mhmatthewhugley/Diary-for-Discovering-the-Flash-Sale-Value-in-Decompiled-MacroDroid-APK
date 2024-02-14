package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00060\u0004j\u0002`\u0005B\t\b\u0002¢\u0006\u0004\b%\u0010&J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\u0015\u001a\u00020\u00148\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R(\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u001b0\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030!8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, mo71668d2 = {"Lkotlin/collections/e0;", "", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "readResolve", "other", "", "equals", "", "hashCode", "", "toString", "isEmpty", "key", "containsKey", "value", "a", "b", "", "serialVersionUID", "J", "e", "()I", "size", "", "", "c", "()Ljava/util/Set;", "entries", "d", "keys", "", "f", "()Ljava/util/Collection;", "values", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.collections.e0 */
/* compiled from: Maps.kt */
final class C13579e0 implements Map, Serializable, C16368a {

    /* renamed from: a */
    public static final C13579e0 f61872a = new C13579e0();
    private static final long serialVersionUID = 8246714829545688274L;

    private C13579e0() {
    }

    private final Object readResolve() {
        return f61872a;
    }

    /* renamed from: a */
    public boolean mo71766a(Void voidR) {
        C13706o.m87929f(voidR, "value");
        return false;
    }

    /* renamed from: b */
    public Void get(Object obj) {
        return null;
    }

    /* renamed from: c */
    public Set<Map.Entry> mo71768c() {
        return C13581f0.f61873a;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo71766a((Void) obj);
    }

    /* renamed from: d */
    public Set<Object> mo71772d() {
        return C13581f0.f61873a;
    }

    /* renamed from: e */
    public int mo71773e() {
        return 0;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return mo71768c();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: f */
    public Collection mo71776f() {
        return C13577d0.f61871a;
    }

    /* renamed from: g */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return mo71772d();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo71773e();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return mo71776f();
    }
}
