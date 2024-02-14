package p123l1;

import android.app.Activity;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.CategoryEnabledConstraint;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: l1.j */
/* compiled from: CategoryEnabledConstraintInfo.kt */
public final class C7621j extends C4227b0 {

    /* renamed from: g */
    public static final C7622a f18528g = new C7622a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7621j f18529h = new C7621j();

    /* renamed from: l1.j$a */
    /* compiled from: CategoryEnabledConstraintInfo.kt */
    public static final class C7622a {
        private C7622a() {
        }

        public /* synthetic */ C7622a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C7621j mo37666a() {
            return C7621j.f18529h;
        }
    }

    /* renamed from: v */
    public static final C7621j m31743v() {
        return f18528g.mo37666a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new CategoryEnabledConstraint(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_category_enabled_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_list_white_24dp;
    }

    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_category_enabled;
    }
}
