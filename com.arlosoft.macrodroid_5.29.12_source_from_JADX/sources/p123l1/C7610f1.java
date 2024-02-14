package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.VolumeLevelConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.f1 */
/* compiled from: VolumeLevelConstraintInfo */
public class C7610f1 extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18517g;

    /* renamed from: u */
    public static C4001c1 m31688u() {
        if (f18517g == null) {
            f18517g = new C7610f1();
        }
        return f18517g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new VolumeLevelConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_volume_level_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_volume_medium_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_volume_level;
    }
}
