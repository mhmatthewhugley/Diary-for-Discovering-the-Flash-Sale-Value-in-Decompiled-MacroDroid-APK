package p112j2;

import android.app.Activity;
import android.content.DialogInterface;
import com.arlosoft.macrodroid.common.SelectableItem;

/* renamed from: j2.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C13259h implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SelectableItem f61200a;

    /* renamed from: c */
    public final /* synthetic */ Activity f61201c;

    /* renamed from: d */
    public final /* synthetic */ boolean f61202d;

    public /* synthetic */ C13259h(SelectableItem selectableItem, Activity activity, boolean z) {
        this.f61200a = selectableItem;
        this.f61201c = activity;
        this.f61202d = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C7439d0.m30865L(this.f61200a, this.f61201c, this.f61202d, dialogInterface, i);
    }
}
