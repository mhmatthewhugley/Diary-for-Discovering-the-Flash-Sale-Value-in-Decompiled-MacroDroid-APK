package p123l1;

import android.app.Activity;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.SunsetSunriseConstraint;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: l1.y0 */
/* compiled from: SunsetSunriseConstraintInfo.kt */
public final class C7657y0 extends C4227b0 {

    /* renamed from: g */
    public static final C7658a f18564g = new C7658a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7657y0 f18565h = new C7657y0();

    /* renamed from: l1.y0$a */
    /* compiled from: SunsetSunriseConstraintInfo.kt */
    public static final class C7658a {
        private C7658a() {
        }

        public /* synthetic */ C7658a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C7657y0 mo37671a() {
            return C7657y0.f18565h;
        }
    }

    /* renamed from: v */
    public static final C7657y0 m31912v() {
        return f18564g.mo37671a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SunsetSunriseConstraint(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_sunrise_sunset_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_wb_sunny_white_24dp;
    }

    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_sunrise_sunset;
    }
}
