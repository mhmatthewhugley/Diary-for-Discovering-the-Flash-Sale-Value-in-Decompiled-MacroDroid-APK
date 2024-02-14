package p093g2;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.macrolist.MacroListFragment;

/* renamed from: g2.j0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12279j0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MacroListFragment f58925a;

    /* renamed from: c */
    public final /* synthetic */ String f58926c;

    /* renamed from: d */
    public final /* synthetic */ boolean f58927d;

    /* renamed from: f */
    public final /* synthetic */ Category f58928f;

    public /* synthetic */ C12279j0(MacroListFragment macroListFragment, String str, boolean z, Category category) {
        this.f58925a = macroListFragment;
        this.f58926c = str;
        this.f58927d = z;
        this.f58928f = category;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f58925a.m19127O1(this.f58926c, this.f58927d, this.f58928f, dialogInterface, i);
    }
}
