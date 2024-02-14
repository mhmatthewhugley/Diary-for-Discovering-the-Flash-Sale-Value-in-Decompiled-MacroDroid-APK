package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.DeviceOrientationConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.r */
/* compiled from: DeviceOrientationConstraintInfo */
public class C7640r extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18547g;

    /* renamed from: u */
    public static C4001c1 m31831u() {
        if (f18547g == null) {
            f18547g = new C7640r();
        }
        return f18547g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DeviceOrientationConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_device_orientation_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_rotate_right_variant_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_device_orientation;
    }
}
