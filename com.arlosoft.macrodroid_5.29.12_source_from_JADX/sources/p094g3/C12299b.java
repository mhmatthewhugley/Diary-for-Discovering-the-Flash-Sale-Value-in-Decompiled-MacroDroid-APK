package p094g3;

import androidx.paging.PageKeyedDataSource;
import java.util.List;
import p216ba.C11113d;

/* renamed from: g3.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12299b implements C11113d {

    /* renamed from: a */
    public final /* synthetic */ PageKeyedDataSource.LoadCallback f58968a;

    /* renamed from: c */
    public final /* synthetic */ PageKeyedDataSource.LoadParams f58969c;

    public /* synthetic */ C12299b(PageKeyedDataSource.LoadCallback loadCallback, PageKeyedDataSource.LoadParams loadParams) {
        this.f58968a = loadCallback;
        this.f58969c = loadParams;
    }

    public final void accept(Object obj) {
        C7330i.m30283m(this.f58968a, this.f58969c, (List) obj);
    }
}
