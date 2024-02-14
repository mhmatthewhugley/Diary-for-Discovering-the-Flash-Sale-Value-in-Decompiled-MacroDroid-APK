package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;
import p370qa.C16269p;
import p370qa.C16271r;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo71668d2 = {"androidx/collection/LruCacheKt$lruCache$4", "Landroidx/collection/LruCache;", "key", "value", "", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "create", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "evicted", "oldValue", "newValue", "Lja/u;", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "collection-ktx"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: LruCache.kt */
public final class LruCacheKt$lruCache$4 extends LruCache<K, V> {
    final /* synthetic */ C16265l $create;
    final /* synthetic */ int $maxSize;
    final /* synthetic */ C16271r $onEntryRemoved;
    final /* synthetic */ C16269p $sizeOf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LruCacheKt$lruCache$4(C16269p pVar, C16265l lVar, C16271r rVar, int i, int i2) {
        super(i2);
        this.$sizeOf = pVar;
        this.$create = lVar;
        this.$onEntryRemoved = rVar;
        this.$maxSize = i;
    }

    /* access modifiers changed from: protected */
    public V create(K k) {
        C13706o.m87930g(k, "key");
        return this.$create.invoke(k);
    }

    /* access modifiers changed from: protected */
    public void entryRemoved(boolean z, K k, V v, V v2) {
        C13706o.m87930g(k, "key");
        C13706o.m87930g(v, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z), k, v, v2);
    }

    /* access modifiers changed from: protected */
    public int sizeOf(K k, V v) {
        C13706o.m87930g(k, "key");
        C13706o.m87930g(v, "value");
        return ((Number) this.$sizeOf.invoke(k, v)).intValue();
    }
}
