package p324m8;

import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001d\b\u0002\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b#\u0010$B1\b\u0016\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b#\u0010'B1\b\u0012\u0012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b#\u0010(J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0001H\u0001¢\u0006\u0004\b\u000f\u0010\rJ\u001a\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0007H\u0001R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a0\u00168\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0014\u0010!\u001a\u00020\t8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006)"}, mo71668d2 = {"Lm8/b;", "K", "V", "Lm8/a;", "", "", "other", "", "equals", "", "hashCode", "key", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "z0", "()Lm8/a;", "inverse", "", "d", "()Ljava/util/Set;", "values", "", "a", "entries", "b", "keys", "c", "()I", "size", "delegate", "<init>", "(Ljava/util/Map;)V", "forward", "backward", "(Ljava/util/Map;Ljava/util/Map;)V", "(Ljava/util/Map;Lm8/a;)V", "kotlinx-bimap"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: m8.b */
/* compiled from: BiMaps.kt */
final class C15702b<K, V> implements C15701a<K, V>, Map<K, V>, C16368a {

    /* renamed from: a */
    private C15701a<V, K> f65007a;

    /* renamed from: c */
    private final /* synthetic */ Map f65008c;

    private C15702b(Map<K, ? extends V> map) {
        this.f65008c = map;
    }

    /* renamed from: a */
    public Set<Map.Entry<K, V>> mo75113a() {
        return this.f65008c.entrySet();
    }

    /* renamed from: b */
    public Set<K> mo75114b() {
        return this.f65008c.keySet();
    }

    /* renamed from: c */
    public int mo75115c() {
        return this.f65008c.size();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return this.f65008c.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f65008c.containsValue(obj);
    }

    /* renamed from: d */
    public Set<V> mo75122d() {
        return mo75112z0().keySet();
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo75113a();
    }

    public boolean equals(Object obj) {
        return C15703c.m94962c(this, obj);
    }

    public V get(Object obj) {
        return this.f65008c.get(obj);
    }

    public int hashCode() {
        return C15703c.m94963d(this);
    }

    public boolean isEmpty() {
        return this.f65008c.isEmpty();
    }

    public final /* bridge */ Set<K> keySet() {
        return mo75114b();
    }

    public V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V replace(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo75115c();
    }

    public final /* bridge */ Set<V> values() {
        return mo75122d();
    }

    /* renamed from: z0 */
    public C15701a<V, K> mo75112z0() {
        C15701a<V, K> aVar = this.f65007a;
        if (aVar == null) {
            C13706o.m87945v("_inverse");
        }
        return aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15702b(Map<K, ? extends V> map, Map<V, ? extends K> map2) {
        this(map);
        C13706o.m87930g(map, "forward");
        C13706o.m87930g(map2, "backward");
        this.f65007a = new C15702b(map2, this);
    }

    private C15702b(Map<K, ? extends V> map, C15701a<V, K> aVar) {
        this(map);
        this.f65007a = aVar;
    }
}
