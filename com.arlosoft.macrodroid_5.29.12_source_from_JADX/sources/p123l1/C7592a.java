package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.ActiveApplicationConstraint;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.a */
/* compiled from: ActiveApplicationConstraintInfo */
public class C7592a extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18499g;

    /* renamed from: u */
    public static C4001c1 m31597u() {
        if (f18499g == null) {
            f18499g = new C7592a();
        }
        return f18499g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ActiveApplicationConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_active_application_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_apps_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_active_application;
    }
}
