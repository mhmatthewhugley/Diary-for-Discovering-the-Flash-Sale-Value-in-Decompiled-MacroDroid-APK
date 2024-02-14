package p093g2;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.macrolist.MacroListFragment;

/* renamed from: g2.g0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12273g0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MacroListFragment f58910a;

    /* renamed from: c */
    public final /* synthetic */ Macro f58911c;

    /* renamed from: d */
    public final /* synthetic */ String[] f58912d;

    public /* synthetic */ C12273g0(MacroListFragment macroListFragment, Macro macro, String[] strArr) {
        this.f58910a = macroListFragment;
        this.f58911c = macro;
        this.f58912d = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f58910a.m19154a2(this.f58911c, this.f58912d, dialogInterface, i);
    }
}
