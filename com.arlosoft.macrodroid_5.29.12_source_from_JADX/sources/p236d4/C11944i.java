package p236d4;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.arlosoft.macrodroid.wizard.WizardActivity;

/* renamed from: d4.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11944i implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ WizardActivity f58129a;

    /* renamed from: b */
    public final /* synthetic */ Menu f58130b;

    /* renamed from: c */
    public final /* synthetic */ MenuItem f58131c;

    public /* synthetic */ C11944i(WizardActivity wizardActivity, Menu menu, MenuItem menuItem) {
        this.f58129a = wizardActivity;
        this.f58130b = menu;
        this.f58131c = menuItem;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f58129a.m25157f2(this.f58130b, this.f58131c, view, i, i2, i3, i4, i5, i6, i7, i8);
    }
}
