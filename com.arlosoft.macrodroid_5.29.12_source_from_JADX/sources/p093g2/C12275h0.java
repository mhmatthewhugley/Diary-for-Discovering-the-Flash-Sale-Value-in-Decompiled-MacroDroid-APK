package p093g2;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.macrolist.MacroListFragment;

/* renamed from: g2.h0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12275h0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MacroListFragment f58914a;

    /* renamed from: c */
    public final /* synthetic */ String f58915c;

    /* renamed from: d */
    public final /* synthetic */ int f58916d;

    /* renamed from: f */
    public final /* synthetic */ boolean f58917f;

    /* renamed from: g */
    public final /* synthetic */ boolean f58918g;

    /* renamed from: o */
    public final /* synthetic */ int f58919o;

    public /* synthetic */ C12275h0(MacroListFragment macroListFragment, String str, int i, boolean z, boolean z2, int i2) {
        this.f58914a = macroListFragment;
        this.f58915c = str;
        this.f58916d = i;
        this.f58917f = z;
        this.f58918g = z2;
        this.f58919o = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f58914a.m19174j2(this.f58915c, this.f58916d, this.f58917f, this.f58918g, this.f58919o, dialogInterface, i);
    }
}
