package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.EmptyAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.s0 */
/* compiled from: EmptyActionInfo.kt */
public final class C7837s0 extends C3072g {

    /* renamed from: j */
    public static final C7838a f18883j = new C7838a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18884k = new C7837s0();
    @StringRes

    /* renamed from: g */
    private final int f18885g = C17541R$string.action_empty;

    /* renamed from: h */
    private final int f18886h = C17530R$drawable.ic_crop_square_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18887i = C17541R$string.action_empty_help;

    /* renamed from: m0.s0$a */
    /* compiled from: EmptyActionInfo.kt */
    public static final class C7838a {
        private C7838a() {
        }

        public /* synthetic */ C7838a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37770a() {
            return C7837s0.f18884k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32765v() {
        return f18883j.mo37770a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new EmptyAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18887i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18886h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18885g;
    }
}
