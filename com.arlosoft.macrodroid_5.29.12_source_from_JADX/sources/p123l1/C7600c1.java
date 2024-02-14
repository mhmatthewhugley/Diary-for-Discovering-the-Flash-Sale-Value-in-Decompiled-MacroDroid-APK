package p123l1;

import android.app.Activity;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.TorchConstraint;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: l1.c1 */
/* compiled from: TorchConstraintInfo.kt */
public final class C7600c1 extends C4227b0 {

    /* renamed from: g */
    public static final C7601a f18507g = new C7601a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7600c1 f18508h = new C7600c1();

    /* renamed from: l1.c1$a */
    /* compiled from: TorchConstraintInfo.kt */
    public static final class C7601a {
        private C7601a() {
        }

        public /* synthetic */ C7601a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C7600c1 mo37664a() {
            return C7600c1.f18508h;
        }
    }

    /* renamed from: v */
    public static final C7600c1 m31638v() {
        return f18507g.mo37664a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new TorchConstraint(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_torch_on_off_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_flashlight_white_24dp;
    }

    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_torch_on_off;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 23;
    }
}
