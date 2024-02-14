package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.DataOnOffConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.n */
/* compiled from: DataOnOffConstraintInfo */
public class C7632n extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18539g;

    /* renamed from: u */
    public static C4001c1 m31789u() {
        if (f18539g == null) {
            f18539g = new C7632n();
        }
        return f18539g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DataOnOffConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_data_on_off_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_swap_vertical_circle_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_data_on_off;
    }
}
