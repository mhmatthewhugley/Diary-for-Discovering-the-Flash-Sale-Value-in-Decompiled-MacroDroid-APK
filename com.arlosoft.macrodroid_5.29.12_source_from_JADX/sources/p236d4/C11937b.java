package p236d4;

import android.view.View;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.wizard.AddedItemViewHolder;
import java.util.List;

/* renamed from: d4.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11937b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AddedItemViewHolder f58112a;

    /* renamed from: c */
    public final /* synthetic */ SelectableItem f58113c;

    /* renamed from: d */
    public final /* synthetic */ int f58114d;

    /* renamed from: f */
    public final /* synthetic */ List f58115f;

    public /* synthetic */ C11937b(AddedItemViewHolder addedItemViewHolder, SelectableItem selectableItem, int i, List list) {
        this.f58112a = addedItemViewHolder;
        this.f58113c = selectableItem;
        this.f58114d = i;
        this.f58115f = list;
    }

    public final void onClick(View view) {
        this.f58112a.m25139x(this.f58113c, this.f58114d, this.f58115f, view);
    }
}
