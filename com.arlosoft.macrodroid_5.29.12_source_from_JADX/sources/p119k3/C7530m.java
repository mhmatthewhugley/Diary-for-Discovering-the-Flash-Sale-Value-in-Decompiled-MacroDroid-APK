package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.BootTrigger;
import com.arlosoft.macrodroid.triggers.C5889c8;

/* renamed from: k3.m */
/* compiled from: BootTriggerInfo */
public class C7530m extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18412g;

    /* renamed from: u */
    public static C4001c1 m31329u() {
        if (f18412g == null) {
            f18412g = new C7530m();
        }
        return f18412g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new BootTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_boot_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_stars_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_boot;
    }
}
