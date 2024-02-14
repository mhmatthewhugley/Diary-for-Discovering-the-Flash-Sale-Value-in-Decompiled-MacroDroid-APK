package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SetNotificationBarIconAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.v3 */
/* compiled from: SetNotificationBarIconActionInfo */
public class C7862v3 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18920g;

    /* renamed from: u */
    public static C4001c1 m32885u() {
        if (f18920g == null) {
            f18920g = new C7862v3();
        }
        return f18920g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SetNotificationBarIconAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_set_notification_button_icon_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_image_edit_outline;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_set_notification_button_icon;
    }
}
