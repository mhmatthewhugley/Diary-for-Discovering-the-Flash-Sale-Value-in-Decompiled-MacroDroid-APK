package p307ka;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.C13580f;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b \u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&¨\u0006\r"}, mo71668d2 = {"Lka/a;", "", "E", "K", "V", "Lkotlin/collections/f;", "element", "", "d", "(Ljava/util/Map$Entry;)Z", "f", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: ka.a */
/* compiled from: MapBuilder.kt */
public abstract class C13424a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends C13580f<E> {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo70876d((Map.Entry) obj);
    }

    /* renamed from: d */
    public final boolean mo70876d(E e) {
        C13706o.m87929f(e, "element");
        return mo70877f(e);
    }

    /* renamed from: f */
    public abstract boolean mo70877f(Map.Entry<? extends K, ? extends V> entry);

    /* renamed from: h */
    public abstract /* bridge */ boolean mo70878h(Map.Entry<?, ?> entry);

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo70878h((Map.Entry) obj);
    }
}
