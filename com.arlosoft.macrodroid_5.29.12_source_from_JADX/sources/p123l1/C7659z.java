package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.IpAddressConstraint;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: l1.z */
/* compiled from: IpAddressConstraintInfo.kt */
public final class C7659z extends C4227b0 {

    /* renamed from: j */
    public static final C7660a f18566j = new C7660a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18567k = new C7659z();
    @StringRes

    /* renamed from: g */
    private final int f18568g = C17541R$string.constraint_ip_address;

    /* renamed from: h */
    private final int f18569h = C17530R$drawable.ethernet;
    @StringRes

    /* renamed from: i */
    private final int f18570i = C17541R$string.constraint_ip_address_help;

    /* renamed from: l1.z$a */
    /* compiled from: IpAddressConstraintInfo.kt */
    public static final class C7660a {
        private C7660a() {
        }

        public /* synthetic */ C7660a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37672a() {
            return C7659z.f18567k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m31919v() {
        return f18566j.mo37672a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new IpAddressConstraint(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18570i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18569h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18568g;
    }
}
