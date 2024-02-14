package p093g2;

import android.widget.CompoundButton;
import com.arlosoft.macrodroid.macrolist.MacroListCategoryHeader;
import com.arlosoft.macrodroid.macrolist.MacroListFragment;

/* renamed from: g2.v */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12293v implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ MacroListFragment f58958a;

    /* renamed from: b */
    public final /* synthetic */ MacroListCategoryHeader f58959b;

    public /* synthetic */ C12293v(MacroListFragment macroListFragment, MacroListCategoryHeader macroListCategoryHeader) {
        this.f58958a = macroListFragment;
        this.f58959b = macroListCategoryHeader;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f58958a.m19182n2(this.f58959b, compoundButton, z);
    }
}
