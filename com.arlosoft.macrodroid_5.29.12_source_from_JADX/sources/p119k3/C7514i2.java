package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.WidgetPressedTrigger;

/* renamed from: k3.i2 */
/* compiled from: WidgetPressedTriggerInfo */
public class C7514i2 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18383g;

    /* renamed from: u */
    public static C4001c1 m31256u() {
        if (f18383g == null) {
            f18383g = new C7514i2();
        }
        return f18383g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new WidgetPressedTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_widget_pressed_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_widgets_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_widget_pressed;
    }
}
