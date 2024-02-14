package androidx.core.util;

import android.util.LruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;
import p370qa.C16271r;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u001a\b\u0006\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00052\u0016\b\u0006\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00072(\b\u0006\u0010\f\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020\u000b0\tH\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u000f"}, mo71668d2 = {"", "K", "V", "", "maxSize", "Lkotlin/Function2;", "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "Lja/u;", "onEntryRemoved", "Landroid/util/LruCache;", "lruCache", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: LruCache.kt */
public final class LruCacheKt {
    public static final <K, V> LruCache<K, V> lruCache(int i, C16269p<? super K, ? super V, Integer> pVar, C16265l<? super K, ? extends V> lVar, C16271r<? super Boolean, ? super K, ? super V, ? super V, C13339u> rVar) {
        C13706o.m87929f(pVar, "sizeOf");
        C13706o.m87929f(lVar, "create");
        C13706o.m87929f(rVar, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i, pVar, lVar, rVar);
    }

    public static /* synthetic */ LruCache lruCache$default(int i, C16269p pVar, C16265l lVar, C16271r rVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = LruCacheKt$lruCache$1.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            lVar = LruCacheKt$lruCache$2.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            rVar = LruCacheKt$lruCache$3.INSTANCE;
        }
        C13706o.m87929f(pVar, "sizeOf");
        C13706o.m87929f(lVar, "create");
        C13706o.m87929f(rVar, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i, pVar, lVar, rVar);
    }
}
