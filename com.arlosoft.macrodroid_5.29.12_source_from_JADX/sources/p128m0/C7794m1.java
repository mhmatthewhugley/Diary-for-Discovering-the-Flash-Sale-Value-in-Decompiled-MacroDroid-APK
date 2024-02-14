package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ImmersiveModeAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.Collections;
import java.util.List;

/* renamed from: m0.m1 */
/* compiled from: ImmersiveModeActionInfo */
public class C7794m1 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18813g;

    /* renamed from: u */
    public static C4001c1 m32550u() {
        if (f18813g == null) {
            f18813g = new C7794m1();
        }
        return f18813g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ImmersiveModeAction(activity, macro);
    }

    /* renamed from: c */
    public List<String> mo27889c() {
        return Collections.singletonList("android.permission.WRITE_SECURE_SETTINGS");
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_immersive_mode_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_fullscreen_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_immersive_mode;
    }

    /* renamed from: l */
    public int mo27894l() {
        return 1;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 20;
    }
}
