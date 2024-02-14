package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.VolumeButtonTrigger;

/* renamed from: k3.d2 */
/* compiled from: VolumeButtonTriggerInfo */
public class C7490d2 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18348g;

    /* renamed from: u */
    public static C4001c1 m31137u() {
        if (f18348g == null) {
            f18348g = new C7490d2();
        }
        return f18348g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new VolumeButtonTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_volume_button_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_volume_high_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_volume_button;
    }
}
