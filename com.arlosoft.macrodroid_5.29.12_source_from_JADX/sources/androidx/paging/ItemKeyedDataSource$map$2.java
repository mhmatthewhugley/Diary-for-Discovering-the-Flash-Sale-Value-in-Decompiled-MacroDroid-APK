package androidx.paging;

import androidx.arch.core.util.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0002 \u0005*\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00040\u0004H\n"}, mo71668d2 = {"", "ToValue", "Key", "Value", "", "kotlin.jvm.PlatformType", "list", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: ItemKeyedDataSource.kt */
final class ItemKeyedDataSource$map$2<I, O> implements Function {
    final /* synthetic */ C16265l<Value, ToValue> $function;

    ItemKeyedDataSource$map$2(C16265l<? super Value, ? extends ToValue> lVar) {
        this.$function = lVar;
    }

    public final List<ToValue> apply(List<? extends Value> list) {
        C13706o.m87928e(list, "list");
        C16265l<Value, ToValue> lVar = this.$function;
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(lVar.invoke(it.next()));
        }
        return arrayList;
    }
}
