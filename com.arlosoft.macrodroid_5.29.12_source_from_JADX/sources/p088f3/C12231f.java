package p088f3;

import androidx.paging.PageKeyedDataSource;
import java.util.List;
import p216ba.C11113d;

/* renamed from: f3.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12231f implements C11113d {

    /* renamed from: a */
    public final /* synthetic */ C7292l f58723a;

    /* renamed from: c */
    public final /* synthetic */ PageKeyedDataSource.LoadCallback f58724c;

    /* renamed from: d */
    public final /* synthetic */ PageKeyedDataSource.LoadParams f58725d;

    public /* synthetic */ C12231f(C7292l lVar, PageKeyedDataSource.LoadCallback loadCallback, PageKeyedDataSource.LoadParams loadParams) {
        this.f58723a = lVar;
        this.f58724c = loadCallback;
        this.f58725d = loadParams;
    }

    public final void accept(Object obj) {
        C7292l.m30112k(this.f58723a, this.f58724c, this.f58725d, (List) obj);
    }
}
