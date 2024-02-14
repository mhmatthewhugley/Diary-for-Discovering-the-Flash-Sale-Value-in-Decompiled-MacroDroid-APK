package p236d4;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.wizard.AddedItemViewHolder;

/* renamed from: d4.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11936a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AddedItemViewHolder f58108a;

    /* renamed from: c */
    public final /* synthetic */ String[] f58109c;

    /* renamed from: d */
    public final /* synthetic */ SelectableItem f58110d;

    /* renamed from: f */
    public final /* synthetic */ int f58111f;

    public /* synthetic */ C11936a(AddedItemViewHolder addedItemViewHolder, String[] strArr, SelectableItem selectableItem, int i) {
        this.f58108a = addedItemViewHolder;
        this.f58109c = strArr;
        this.f58110d = selectableItem;
        this.f58111f = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f58108a.m25140y(this.f58109c, this.f58110d, this.f58111f, dialogInterface, i);
    }
}
