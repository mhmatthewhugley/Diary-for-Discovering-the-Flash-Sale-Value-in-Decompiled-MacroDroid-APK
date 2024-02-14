package androidx.paging;

import androidx.paging.DataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, mo71668d2 = {"", "Key", "Value", "Landroidx/paging/DataSource$InvalidatedCallback;", "it", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
/* compiled from: DataSource.kt */
final class DataSource$invalidateCallbackTracker$1 extends C13708q implements C16265l<DataSource.InvalidatedCallback, C13339u> {
    public static final DataSource$invalidateCallbackTracker$1 INSTANCE = new DataSource$invalidateCallbackTracker$1();

    DataSource$invalidateCallbackTracker$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DataSource.InvalidatedCallback) obj);
        return C13339u.f61331a;
    }

    public final void invoke(DataSource.InvalidatedCallback invalidatedCallback) {
        C13706o.m87929f(invalidatedCallback, "it");
        invalidatedCallback.onInvalidated();
    }
}
