package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13328m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\b\u001aQ\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\b"}, mo71668d2 = {"K", "V", "Landroidx/collection/ArrayMap;", "arrayMapOf", "", "Lja/m;", "pairs", "([Lja/m;)Landroidx/collection/ArrayMap;", "collection-ktx"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* compiled from: ArrayMap.kt */
public final class ArrayMapKt {
    public static final <K, V> ArrayMap<K, V> arrayMapOf() {
        return new ArrayMap<>();
    }

    public static final <K, V> ArrayMap<K, V> arrayMapOf(C13328m<? extends K, ? extends V>... mVarArr) {
        C13706o.m87930g(mVarArr, "pairs");
        ArrayMap<K, V> arrayMap = new ArrayMap<>(mVarArr.length);
        for (C13328m<? extends K, ? extends V> mVar : mVarArr) {
            arrayMap.put(mVar.mo70154c(), mVar.mo70155d());
        }
        return arrayMap;
    }
}
