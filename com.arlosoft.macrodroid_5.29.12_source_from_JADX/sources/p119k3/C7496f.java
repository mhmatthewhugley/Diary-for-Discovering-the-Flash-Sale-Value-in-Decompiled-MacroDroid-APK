package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.AutoRotateChangeTrigger;
import com.arlosoft.macrodroid.triggers.C5889c8;

/* renamed from: k3.f */
/* compiled from: AutoRotateChangeTriggerInfo */
public class C7496f extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18359g;

    /* renamed from: u */
    public static C4001c1 m31170u() {
        if (f18359g == null) {
            f18359g = new C7496f();
        }
        return f18359g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new AutoRotateChangeTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_autorotate_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_screen_rotation_lock_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_autorotate;
    }
}
