package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.AccessibilityServiceAction;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.List;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.a */
/* compiled from: AccessibilityServiceActionInfo.kt */
public final class C7690a extends C3072g {

    /* renamed from: l */
    public static final C7691a f18632l = new C7691a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C4001c1 f18633m = new C7690a();
    @StringRes

    /* renamed from: g */
    private final int f18634g = C17541R$string.action_accessibility_service;

    /* renamed from: h */
    private final int f18635h = C17530R$drawable.ic_baseline_accessibility_24;
    @StringRes

    /* renamed from: i */
    private final int f18636i = C17541R$string.action_accessibility_service_help;

    /* renamed from: j */
    private final int f18637j = 1;

    /* renamed from: k */
    private final List<String> f18638k = C13612s.m87736e("android.permission.WRITE_SECURE_SETTINGS");

    /* renamed from: m0.a$a */
    /* compiled from: AccessibilityServiceActionInfo.kt */
    public static final class C7691a {
        private C7691a() {
        }

        public /* synthetic */ C7691a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37739a() {
            return C7690a.f18633m;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32066v() {
        return f18632l.mo37739a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new AccessibilityServiceAction(activity, macro);
    }

    /* renamed from: c */
    public List<String> mo27889c() {
        return this.f18638k;
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18636i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18635h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18634g;
    }

    /* renamed from: l */
    public int mo27894l() {
        return this.f18637j;
    }
}
