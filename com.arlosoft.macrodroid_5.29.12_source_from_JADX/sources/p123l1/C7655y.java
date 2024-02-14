package p123l1;

import android.app.Activity;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.InvocationMethodConstraint;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: l1.y */
/* compiled from: InvocationMethodConstraintInfo.kt */
public final class C7655y extends C4227b0 {

    /* renamed from: g */
    public static final C7656a f18562g = new C7656a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C7655y f18563h = new C7655y();

    /* renamed from: l1.y$a */
    /* compiled from: InvocationMethodConstraintInfo.kt */
    public static final class C7656a {
        private C7656a() {
        }

        public /* synthetic */ C7656a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C7655y mo37670a() {
            return C7655y.f18563h;
        }
    }

    /* renamed from: v */
    public static final C7655y m31905v() {
        return f18562g.mo37670a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new InvocationMethodConstraint(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constrant_invocation_method_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_beaker_question;
    }

    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constrant_invocation_method;
    }
}
