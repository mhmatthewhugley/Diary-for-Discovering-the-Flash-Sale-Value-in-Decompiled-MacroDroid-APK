package p093g2;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.macrolist.MacroListFragment;

/* renamed from: g2.i0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12277i0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MacroListFragment f58921a;

    /* renamed from: c */
    public final /* synthetic */ String f58922c;

    /* renamed from: d */
    public final /* synthetic */ boolean f58923d;

    public /* synthetic */ C12277i0(MacroListFragment macroListFragment, String str, boolean z) {
        this.f58921a = macroListFragment;
        this.f58922c = str;
        this.f58923d = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f58921a.m19120L1(this.f58922c, this.f58923d, dialogInterface, i);
    }
}
