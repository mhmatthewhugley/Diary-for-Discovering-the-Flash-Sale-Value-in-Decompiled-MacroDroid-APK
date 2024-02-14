package androidx.paging;

import androidx.arch.core.util.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004H\n"}, mo71668d2 = {"", "ToValue", "Key", "Value", "", "list", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: DataSource.kt */
final class DataSource$map$1 extends C13708q implements C16265l<List<? extends Value>, List<? extends ToValue>> {
    final /* synthetic */ Function<Value, ToValue> $function;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DataSource$map$1(Function<Value, ToValue> function) {
        super(1);
        this.$function = function;
    }

    public final List<ToValue> invoke(List<? extends Value> list) {
        C13706o.m87929f(list, "list");
        Function<Value, ToValue> function = this.$function;
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }
}
