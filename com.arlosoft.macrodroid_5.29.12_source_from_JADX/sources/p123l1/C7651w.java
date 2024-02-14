package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.HeadphonesConnectionConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.w */
/* compiled from: HeadphonesConnectionConstraintInfo */
public class C7651w extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18558g;

    /* renamed from: u */
    public static C4001c1 m31884u() {
        if (f18558g == null) {
            f18558g = new C7651w();
        }
        return f18558g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new HeadphonesConnectionConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_headphones_connection_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_headphones_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_headphones_connection;
    }
}
