package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.PebbleConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.p0 */
/* compiled from: PebbleConstraintInfo */
public class C7637p0 extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18544g;

    /* renamed from: u */
    public static C4001c1 m31815u() {
        if (f18544g == null) {
            f18544g = new C7637p0();
        }
        return f18544g;
    }

    /* renamed from: a */
    public boolean mo27887a() {
        return super.mo27887a() && C4031k.m15911k();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new PebbleConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_pebble_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_watch_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_pebble;
    }
}
