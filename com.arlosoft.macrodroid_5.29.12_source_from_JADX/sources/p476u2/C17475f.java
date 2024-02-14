package p476u2;

import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import com.arlosoft.macrodroid.settings.drawer.DrawerPreferencesFragment;

/* renamed from: u2.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C17475f implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    public final /* synthetic */ DrawerPreferencesFragment f69277a;

    /* renamed from: b */
    public final /* synthetic */ CheckBoxPreference f69278b;

    public /* synthetic */ C17475f(DrawerPreferencesFragment drawerPreferencesFragment, CheckBoxPreference checkBoxPreference) {
        this.f69277a = drawerPreferencesFragment;
        this.f69278b = checkBoxPreference;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        return DrawerPreferencesFragment.m19785n0(this.f69277a, this.f69278b, preference, obj);
    }
}
