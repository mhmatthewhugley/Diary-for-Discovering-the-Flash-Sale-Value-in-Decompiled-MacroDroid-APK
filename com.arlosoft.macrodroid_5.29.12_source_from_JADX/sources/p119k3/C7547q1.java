package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.ScreenOnOffTrigger;

/* renamed from: k3.q1 */
/* compiled from: ScreenOnOffTriggerInfo */
public class C7547q1 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18438g;

    /* renamed from: u */
    public static C4001c1 m31407u() {
        if (f18438g == null) {
            f18438g = new C7547q1();
        }
        return f18438g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ScreenOnOffTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_screen_on_off_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_lightbulb_outline_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_screen_on_off;
    }
}
