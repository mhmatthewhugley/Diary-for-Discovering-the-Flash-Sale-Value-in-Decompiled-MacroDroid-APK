package p124l2;

import androidx.paging.ItemKeyedDataSource;
import java.util.List;
import p216ba.C11113d;

/* renamed from: l2.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C15579b implements C11113d {

    /* renamed from: a */
    public final /* synthetic */ ItemKeyedDataSource.LoadInitialCallback f64818a;

    /* renamed from: c */
    public final /* synthetic */ C7663g f64819c;

    public /* synthetic */ C15579b(ItemKeyedDataSource.LoadInitialCallback loadInitialCallback, C7663g gVar) {
        this.f64818a = loadInitialCallback;
        this.f64819c = gVar;
    }

    public final void accept(Object obj) {
        C7663g.m31943n(this.f64818a, this.f64819c, (List) obj);
    }
}
