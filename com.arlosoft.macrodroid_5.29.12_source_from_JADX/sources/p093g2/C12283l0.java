package p093g2;

import android.widget.CompoundButton;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.macrolist.MacroListItem;

/* renamed from: g2.l0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12283l0 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ MacroListItem.FullMacroViewHolder f58932a;

    /* renamed from: b */
    public final /* synthetic */ Macro f58933b;

    /* renamed from: c */
    public final /* synthetic */ boolean f58934c;

    public /* synthetic */ C12283l0(MacroListItem.FullMacroViewHolder fullMacroViewHolder, Macro macro, boolean z) {
        this.f58932a = fullMacroViewHolder;
        this.f58933b = macro;
        this.f58934c = z;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f58932a.m19246D(this.f58933b, this.f58934c, compoundButton, z);
    }
}
