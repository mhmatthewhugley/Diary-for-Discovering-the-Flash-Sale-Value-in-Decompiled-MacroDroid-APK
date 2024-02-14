package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.DemoModeAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.List;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.i0 */
/* compiled from: DemoModeActionInfo.kt */
public final class C7760i0 extends C3072g {

    /* renamed from: l */
    public static final C7761a f18748l = new C7761a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C4001c1 f18749m = new C7760i0();
    @StringRes

    /* renamed from: g */
    private final int f18750g = C17541R$string.action_demo_mode;

    /* renamed from: h */
    private final int f18751h = C17530R$drawable.ic_alpha_d_box_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18752i = C17541R$string.action_demo_mode_help;

    /* renamed from: j */
    private final List<String> f18753j = C13614t.m87751m("android.permission.WRITE_SECURE_SETTINGS", "android.permission.DUMP");

    /* renamed from: k */
    private final boolean f18754k = true;

    /* renamed from: m0.i0$a */
    /* compiled from: DemoModeActionInfo.kt */
    public static final class C7761a {
        private C7761a() {
        }

        public /* synthetic */ C7761a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37753a() {
            return C7760i0.f18749m;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32392v() {
        return f18748l.mo37753a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DemoModeAction(activity, macro);
    }

    /* renamed from: c */
    public List<String> mo27889c() {
        return this.f18753j;
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18752i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18751h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18750g;
    }

    /* renamed from: q */
    public boolean mo27899q() {
        return this.f18754k;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 23;
    }
}
