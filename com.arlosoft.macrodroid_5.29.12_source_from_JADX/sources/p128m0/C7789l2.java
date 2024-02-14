package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.OpenWebPageAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.List;

/* renamed from: m0.l2 */
/* compiled from: OpenWebPageActionInfo */
public class C7789l2 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18808g;

    /* renamed from: u */
    public static C4001c1 m32523u() {
        if (f18808g == null) {
            f18808g = new C7789l2();
        }
        return f18808g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new OpenWebPageAction(activity, macro);
    }

    /* renamed from: d */
    public List<Integer> mo27890d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(C17541R$string.url));
        return arrayList;
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_open_web_page_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_web_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_open_web_page;
    }
}
