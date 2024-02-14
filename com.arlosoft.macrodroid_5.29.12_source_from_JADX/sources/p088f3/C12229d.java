package p088f3;

import androidx.paging.PageKeyedDataSource;
import p216ba.C11113d;

/* renamed from: f3.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12229d implements C11113d {

    /* renamed from: a */
    public final /* synthetic */ PageKeyedDataSource.LoadCallback f58720a;

    /* renamed from: c */
    public final /* synthetic */ PageKeyedDataSource.LoadParams f58721c;

    public /* synthetic */ C12229d(PageKeyedDataSource.LoadCallback loadCallback, PageKeyedDataSource.LoadParams loadParams) {
        this.f58720a = loadCallback;
        this.f58721c = loadParams;
    }

    public final void accept(Object obj) {
        C7292l.m30113l(this.f58720a, this.f58721c, (Throwable) obj);
    }
}
