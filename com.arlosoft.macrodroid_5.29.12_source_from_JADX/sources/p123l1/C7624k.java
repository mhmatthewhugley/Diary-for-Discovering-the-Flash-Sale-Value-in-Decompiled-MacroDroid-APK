package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.CellTowerConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.k */
/* compiled from: CellTowerConstraintInfo */
public class C7624k extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18531g;

    /* renamed from: u */
    public static C4001c1 m31754u() {
        if (f18531g == null) {
            f18531g = new C7624k();
        }
        return f18531g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new CellTowerConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_cell_towers_constraint_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_radio_tower_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_cell_towers;
    }
}
