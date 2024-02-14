package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.BrightnessConstraint;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.h */
/* compiled from: BrightnessConstraintInfo */
public class C7615h extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18522g;

    /* renamed from: u */
    public static C4001c1 m31712u() {
        if (f18522g == null) {
            f18522g = new C7615h();
        }
        return f18522g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new BrightnessConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_brightness_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_brightness_4_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_set_brightness;
    }
}
