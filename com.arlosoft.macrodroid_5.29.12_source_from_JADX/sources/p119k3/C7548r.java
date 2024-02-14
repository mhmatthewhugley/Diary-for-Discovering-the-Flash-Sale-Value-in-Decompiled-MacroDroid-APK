package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.CellTowerTrigger;

/* renamed from: k3.r */
/* compiled from: CellTowerTriggerInfo */
public class C7548r extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18439g;

    /* renamed from: u */
    public static C4001c1 m31412u() {
        if (f18439g == null) {
            f18439g = new C7548r();
        }
        return f18439g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new CellTowerTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_cell_tower_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_radio_tower_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_cell_tower;
    }
}
