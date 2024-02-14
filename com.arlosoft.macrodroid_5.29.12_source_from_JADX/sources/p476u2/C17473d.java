package p476u2;

import android.widget.CompoundButton;
import com.arlosoft.macrodroid.settings.drawer.DrawerPreferencesFragment;
import p149q1.C8152a;

/* renamed from: u2.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C17473d implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C8152a f69274a;

    /* renamed from: b */
    public final /* synthetic */ DrawerPreferencesFragment f69275b;

    public /* synthetic */ C17473d(C8152a aVar, DrawerPreferencesFragment drawerPreferencesFragment) {
        this.f69274a = aVar;
        this.f69275b = drawerPreferencesFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        DrawerPreferencesFragment.m19772C0(this.f69274a, this.f69275b, compoundButton, z);
    }
}
