package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ClipboardAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.v */
/* compiled from: ClipboardActionInfo */
public class C7857v extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18912g;

    /* renamed from: u */
    public static C4001c1 m32863u() {
        if (f18912g == null) {
            f18912g = new C7857v();
        }
        return f18912g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ClipboardAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_clipboard_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_clipboard_text_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_clipboard;
    }
}
