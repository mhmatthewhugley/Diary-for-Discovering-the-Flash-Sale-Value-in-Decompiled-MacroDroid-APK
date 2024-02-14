package p119k3;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.BluetoothTrigger;
import com.arlosoft.macrodroid.triggers.C5889c8;

/* renamed from: k3.l */
/* compiled from: BluetoothTriggerInfo */
public class C7526l extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18405g;

    /* renamed from: u */
    public static C4001c1 m31309u() {
        if (f18405g == null) {
            f18405g = new C7526l();
        }
        return f18405g;
    }

    /* renamed from: a */
    public boolean mo27887a() {
        return super.mo27887a() && BluetoothAdapter.getDefaultAdapter() != null;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new BluetoothTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_bluetooth_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_bluetooth_connect_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_bluetooth;
    }
}
