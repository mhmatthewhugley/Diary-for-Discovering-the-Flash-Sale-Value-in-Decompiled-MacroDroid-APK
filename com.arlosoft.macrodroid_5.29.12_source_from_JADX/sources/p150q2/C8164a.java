package p150q2;

import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import kotlin.jvm.internal.C13706o;
import p385s7.C16505a;

/* renamed from: q2.a */
/* compiled from: RootToolsHelper.kt */
public final class C8164a {

    /* renamed from: a */
    public static final C8164a f19788a = new C8164a();

    /* renamed from: b */
    private static Boolean f19789b;

    /* renamed from: c */
    private static Boolean f19790c;

    private C8164a() {
    }

    /* renamed from: a */
    public static final boolean m33886a() {
        Boolean bool = f19790c;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (f19789b == null) {
            f19789b = Boolean.valueOf(C16505a.m98583x());
        }
        try {
            boolean w = C16505a.m98582w(1000, 1);
            if (C13706o.m87924a(f19789b, Boolean.TRUE) && !w) {
                return w;
            }
            f19790c = Boolean.valueOf(w);
            return w;
        } catch (Exception e) {
            C4878b.m18868g("Error checking RootTools.isAccessGiven(): " + e);
            return false;
        }
    }
}
