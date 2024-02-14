package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ScreenOnAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.List;

/* renamed from: m0.y2 */
/* compiled from: ScreenOnActionInfo */
public class C7883y2 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18953g;

    /* renamed from: u */
    public static C4001c1 m32983u() {
        if (f18953g == null) {
            f18953g = new C7883y2();
        }
        return f18953g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ScreenOnAction(activity, macro);
    }

    /* renamed from: d */
    public List<Integer> mo27890d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(C17541R$string.action_screen_on_off));
        return arrayList;
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_screen_on_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_lightbulb_outline_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_screen_on;
    }
}