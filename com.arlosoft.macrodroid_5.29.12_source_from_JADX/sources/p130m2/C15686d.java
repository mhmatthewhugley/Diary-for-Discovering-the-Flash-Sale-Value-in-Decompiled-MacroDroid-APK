package p130m2;

import androidx.paging.PageKeyedDataSource;
import java.util.List;
import p216ba.C11113d;

/* renamed from: m2.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C15686d implements C11113d {

    /* renamed from: a */
    public final /* synthetic */ PageKeyedDataSource.LoadCallback f64972a;

    /* renamed from: c */
    public final /* synthetic */ PageKeyedDataSource.LoadParams f64973c;

    public /* synthetic */ C15686d(PageKeyedDataSource.LoadCallback loadCallback, PageKeyedDataSource.LoadParams loadParams) {
        this.f64972a = loadCallback;
        this.f64973c = loadParams;
    }

    public final void accept(Object obj) {
        C7901k.m33072n(this.f64972a, this.f64973c, (List) obj);
    }
}
