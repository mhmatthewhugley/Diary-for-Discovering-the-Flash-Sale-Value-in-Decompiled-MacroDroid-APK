package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.QuickSettingsTileTrigger;

/* renamed from: k3.l1 */
/* compiled from: QuickSettingsTileTriggerInfo */
public class C7529l1 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18411g;

    /* renamed from: u */
    public static C4001c1 m31323u() {
        if (f18411g == null) {
            f18411g = new C7529l1();
        }
        return f18411g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new QuickSettingsTileTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_quick_settings_tile_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_settings_applications_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_quick_settings_tile;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 24;
    }
}
