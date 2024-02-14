package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.AutoSyncChangeTrigger;
import com.arlosoft.macrodroid.triggers.C5889c8;

/* renamed from: k3.g */
/* compiled from: AutoSyncChangeTriggerInfo */
public class C7502g extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18368g;

    /* renamed from: u */
    public static C4001c1 m31195u() {
        if (f18368g == null) {
            f18368g = new C7502g();
        }
        return f18368g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new AutoSyncChangeTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_autosync_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_sync_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_autosync;
    }
}
