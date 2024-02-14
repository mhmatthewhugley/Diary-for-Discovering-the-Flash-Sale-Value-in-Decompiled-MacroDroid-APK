package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.DockTrigger;

/* renamed from: k3.z */
/* compiled from: DockTriggerInfo */
public class C7577z extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18485g;

    /* renamed from: u */
    public static C4001c1 m31550u() {
        if (f18485g == null) {
            f18485g = new C7577z();
        }
        return f18485g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DockTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_dock_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_cellphone_dock_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_dock;
    }
}
