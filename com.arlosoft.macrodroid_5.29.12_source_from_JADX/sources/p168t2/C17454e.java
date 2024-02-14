package p168t2;

import android.view.View;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.selectableitemlist.classic.SelectableItemAdapter;

/* renamed from: t2.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C17454e implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ SelectableItemAdapter f69240a;

    /* renamed from: c */
    public final /* synthetic */ C4001c1 f69241c;

    public /* synthetic */ C17454e(SelectableItemAdapter selectableItemAdapter, C4001c1 c1Var) {
        this.f69240a = selectableItemAdapter;
        this.f69241c = c1Var;
    }

    public final boolean onLongClick(View view) {
        return this.f69240a.m19670K(this.f69241c, view);
    }
}
