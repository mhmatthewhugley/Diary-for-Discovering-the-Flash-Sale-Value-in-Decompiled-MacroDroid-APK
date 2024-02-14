package p123l1;

import android.app.Activity;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.GeofenceConstraint;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: l1.v */
/* compiled from: GeofenceConstraintInfo.kt */
public final class C7648v extends C4227b0 {

    /* renamed from: g */
    public static final C7649a f18555g = new C7649a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7648v f18556h = new C7648v();

    /* renamed from: l1.v$a */
    /* compiled from: GeofenceConstraintInfo.kt */
    public static final class C7649a {
        private C7649a() {
        }

        public /* synthetic */ C7649a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C7648v mo37669a() {
            return C7648v.f18556h;
        }
    }

    /* renamed from: v */
    public static final C7648v m31873v() {
        return f18555g.mo37669a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new GeofenceConstraint(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_geofence_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_map_marker_circle_white_24dp;
    }

    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_geofence;
    }
}
