package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;
import p370qa.C16271r;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u001a\b\u0006\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00052\u0016\b\u0006\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00072(\b\u0006\u0010\f\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020\u000b0\tH\b¨\u0006\u000f"}, mo71668d2 = {"", "K", "V", "", "maxSize", "Lkotlin/Function2;", "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "Lja/u;", "onEntryRemoved", "Landroidx/collection/LruCache;", "lruCache", "collection-ktx"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* compiled from: LruCache.kt */
public final class LruCacheKt {
    public static final <K, V> LruCache<K, V> lruCache(int i, C16269p<? super K, ? super V, Integer> pVar, C16265l<? super K, ? extends V> lVar, C16271r<? super Boolean, ? super K, ? super V, ? super V, C13339u> rVar) {
        C13706o.m87930g(pVar, "sizeOf");
        C13706o.m87930g(lVar, "create");
        C13706o.m87930g(rVar, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(pVar, lVar, rVar, i, i);
    }

    public static /* synthetic */ LruCache lruCache$default(int i, C16269p pVar, C16265l lVar, C16271r rVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = LruCacheKt$lruCache$1.INSTANCE;
        }
        C16269p pVar2 = pVar;
        if ((i2 & 4) != 0) {
            lVar = LruCacheKt$lruCache$2.INSTANCE;
        }
        C16265l lVar2 = lVar;
        if ((i2 & 8) != 0) {
            rVar = LruCacheKt$lruCache$3.INSTANCE;
        }
        C16271r rVar2 = rVar;
        C13706o.m87930g(pVar2, "sizeOf");
        C13706o.m87930g(lVar2, "create");
        C13706o.m87930g(rVar2, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(pVar2, lVar2, rVar2, i, i);
    }
}
