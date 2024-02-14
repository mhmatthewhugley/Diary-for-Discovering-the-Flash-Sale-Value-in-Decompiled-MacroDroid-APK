package p123l1;

import android.app.Activity;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.SystemSettingConstraint;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: l1.z0 */
/* compiled from: SystemSettingConstraintInfo.kt */
public final class C7661z0 extends C4227b0 {

    /* renamed from: g */
    public static final C7662a f18571g = new C7662a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7661z0 f18572h = new C7661z0();

    /* renamed from: l1.z0$a */
    /* compiled from: SystemSettingConstraintInfo.kt */
    public static final class C7662a {
        private C7662a() {
        }

        public /* synthetic */ C7662a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C7661z0 mo37673a() {
            return C7661z0.f18572h;
        }
    }

    /* renamed from: v */
    public static final C7661z0 m31926v() {
        return f18571g.mo37673a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SystemSettingConstraint(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_system_setting_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_cellphone_settings_variant_white_24dp;
    }

    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_system_setting;
    }
}
