package p123l1;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.BluetoothConstraint;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.g */
/* compiled from: BluetoothConstraintInfo */
public class C7611g extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18518g;

    /* renamed from: u */
    public static C4001c1 m31693u() {
        if (f18518g == null) {
            f18518g = new C7611g();
        }
        return f18518g;
    }

    /* renamed from: a */
    public boolean mo27887a() {
        return super.mo27887a() && BluetoothAdapter.getDefaultAdapter() != null;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new BluetoothConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_bluetooth_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_bluetooth_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_bluetooth;
    }
}
