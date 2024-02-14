package com.arlosoft.macrodroid.logging.systemlog;

import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.database.room.C4402h;
import com.arlosoft.macrodroid.database.room.C4403i;
import com.arlosoft.macrodroid.database.room.C4429s;
import com.arlosoft.macrodroid.database.room.SystemLogEntry;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.Arrays;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15488m1;
import kotlinx.coroutines.C15516s2;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.C15568x2;
import p148q0.C8151a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.logging.systemlog.b */
/* compiled from: SystemLog.kt */
public final class C4878b {

    /* renamed from: a */
    public static final C4878b f12260a = new C4878b();

    /* renamed from: b */
    private static final C15478k0 f12261b = C15482l0.m94502a(C15516s2.m94604b((C15561w1) null, 1, (Object) null).plus(C15186a1.m93731c()));

    /* renamed from: c */
    private static final C15488m1 f12262c = C15568x2.m94741d("databaseDispatcher");

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.b$a */
    /* compiled from: SystemLog.kt */
    static final class C4879a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ SystemLogEntry $logEntry;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4879a(SystemLogEntry systemLogEntry, C13635d<? super C4879a> dVar) {
            super(2, dVar);
            this.$logEntry = systemLogEntry;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C4879a(this.$logEntry, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4879a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4429s g = MacroDroidApplication.f9883I.mo27303b().mo27299x().mo28681g();
                SystemLogEntry systemLogEntry = this.$logEntry;
                this.label = 1;
                if (g.mo28779d(systemLogEntry, 15000, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                try {
                    C13332o.m85685b(obj);
                } catch (Exception unused) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    private C4878b() {
    }

    /* renamed from: a */
    public static final void m18862a(String str, long j) {
        C13706o.m87929f(str, "actionName");
        m18885x(f12260a, C4403i.INFO, str, j, (String) null, (String) null, (String) null, C4402h.ACTION, 56, (Object) null);
    }

    /* renamed from: b */
    public static final void m18863b(String str, long j) {
        C13706o.m87929f(str, "logText");
        m18885x(f12260a, C4403i.INFO, str, j, (String) null, (String) null, (String) null, C4402h.CONSTRAINT, 56, (Object) null);
    }

    /* renamed from: c */
    public static final void m18864c(String str) {
        C13706o.m87929f(str, "logText");
        m18885x(f12260a, C4403i.DEBUG, str, 0, (String) null, (String) null, (String) null, (C4402h) null, 112, (Object) null);
    }

    /* renamed from: d */
    public static final void m18865d(String str, long j, String str2) {
        C13706o.m87929f(str, "logText");
        m18885x(f12260a, C4403i.DEBUG, str, j, (String) null, str2, (String) null, (C4402h) null, 104, (Object) null);
    }

    /* renamed from: e */
    public static final void m18866e(String str, long j, String str2) {
        C13706o.m87929f(str, "logText");
    }

    /* renamed from: f */
    public static /* synthetic */ void m18867f(String str, long j, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        m18866e(str, j, str2);
    }

    /* renamed from: g */
    public static final void m18868g(String str) {
        C13706o.m87929f(str, "logText");
        m18885x(f12260a, C4403i.ERROR, str, 0, (String) null, (String) null, (String) null, (C4402h) null, 112, (Object) null);
    }

    /* renamed from: h */
    public static final void m18869h(String str, long j) {
        C13706o.m87929f(str, "logText");
        m18885x(f12260a, C4403i.ERROR, str, j, (String) null, (String) null, (String) null, (C4402h) null, 112, (Object) null);
    }

    /* renamed from: i */
    public static final void m18870i(String str, long j, String str2, String str3) {
        C13706o.m87929f(str, "logText");
        m18885x(f12260a, C4403i.ERROR, str, j, (String) null, str2, str3, (C4402h) null, 72, (Object) null);
    }

    /* renamed from: j */
    public static final void m18871j(String str, String str2) {
        C13706o.m87929f(str, "logText");
        m18885x(f12260a, C4403i.ERROR, str, 0, (String) null, (String) null, str2, (C4402h) null, 80, (Object) null);
    }

    /* renamed from: k */
    public static /* synthetic */ void m18872k(String str, long j, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        m18870i(str, j, str2, str3);
    }

    /* renamed from: l */
    public static final void m18873l(String str) {
        C13706o.m87929f(str, "logText");
        m18885x(f12260a, C4403i.INFO, str, 0, (String) null, (String) null, (String) null, (C4402h) null, 112, (Object) null);
    }

    /* renamed from: m */
    public static final void m18874m(String str, long j) {
        C13706o.m87929f(str, "logText");
        m18885x(f12260a, C4403i.INFO, str, j, (String) null, (String) null, (String) null, (C4402h) null, 112, (Object) null);
    }

    /* renamed from: n */
    public static final void m18875n(String str, long j, String str2) {
        C13706o.m87929f(str, "logText");
        m18885x(f12260a, C4403i.INFO, str, j, (String) null, str2, (String) null, (C4402h) null, 104, (Object) null);
    }

    /* renamed from: o */
    public static final void m18876o(String str, long j) {
        C13706o.m87929f(str, "actionName");
        C4878b bVar = f12260a;
        C4403i iVar = C4403i.INFO;
        m18885x(bVar, iVar, "Testing: " + str, j, (String) null, (String) null, (String) null, C4402h.ACTION, 56, (Object) null);
    }

    /* renamed from: p */
    public static final void m18877p(String str, long j) {
        C13706o.m87929f(str, "triggerName");
        m18885x(f12260a, C4403i.INFO, str, j, (String) null, (String) null, (String) null, C4402h.TRIGGER, 56, (Object) null);
    }

    /* renamed from: q */
    public static final void m18878q(String str, String str2, String str3, long j, boolean z) {
        String str4 = str3;
        String str5 = str;
        C13706o.m87929f(str, "variableName");
        C13706o.m87929f(str2, "oldValue");
        C13706o.m87929f(str4, "newValue");
        C4403i iVar = C4403i.INFO;
        C13696i0 i0Var = C13696i0.f61931a;
        String string = MacroDroidApplication.f9883I.mo27303b().getString(C17541R$string.system_log_variable_updated_from_to);
        C13706o.m87928e(string, "MacroDroidApplication.in…variable_updated_from_to)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str2, str4}, 2));
        C13706o.m87928e(format, "format(format, *args)");
        m18885x(f12260a, iVar, format, j, str, (String) null, (String) null, z ? C4402h.LOCAL_VARIABLE : C4402h.GLOBAL_VARIABLE, 32, (Object) null);
    }

    /* renamed from: r */
    public static final void m18879r(String str) {
        C13706o.m87929f(str, "logText");
        m18885x(f12260a, C4403i.VERBOSE, str, 0, (String) null, (String) null, (String) null, (C4402h) null, 112, (Object) null);
    }

    /* renamed from: s */
    public static final void m18880s(String str, long j) {
        C13706o.m87929f(str, "logText");
        m18885x(f12260a, C4403i.VERBOSE, str, j, (String) null, (String) null, (String) null, (C4402h) null, 112, (Object) null);
    }

    /* renamed from: t */
    public static final void m18881t(String str, long j, String str2) {
        C13706o.m87929f(str, "logText");
        m18885x(f12260a, C4403i.VERBOSE, str, j, (String) null, str2, (String) null, (C4402h) null, 104, (Object) null);
    }

    /* renamed from: u */
    public static final void m18882u(String str) {
        C13706o.m87929f(str, "logText");
        m18885x(f12260a, C4403i.WARNING, str, 0, (String) null, (String) null, (String) null, (C4402h) null, 112, (Object) null);
    }

    /* renamed from: v */
    public static final void m18883v(String str, long j) {
        C13706o.m87929f(str, "logText");
        m18885x(f12260a, C4403i.WARNING, str, j, (String) null, (String) null, (String) null, (C4402h) null, 112, (Object) null);
    }

    /* renamed from: w */
    private final void m18884w(C4403i iVar, String str, long j, String str2, String str3, String str4, C4402h hVar) {
        long j2 = j;
        SystemLogEntry systemLogEntry = new SystemLogEntry(iVar, System.currentTimeMillis(), C15182y.m93715X0(str, PathInterpolatorCompat.MAX_NUM_POINTS), j, str2, str3, str4, hVar, 0, 256, (C13695i) null);
        try {
            if (iVar != C4403i.ERROR) {
                long j3 = j;
                if (j3 != 0 && C4934n.m19004Y()) {
                    C4934n P = C4934n.m19001P();
                    Macro Q = P != null ? P.mo29682Q(j3) : null;
                    if (Q != null && Q.isExcludedFromLog()) {
                        return;
                    }
                }
            }
            C15561w1 unused = C15473j.m94492d(f12261b, f12262c, (C15486m0) null, new C4879a(systemLogEntry, (C13635d<? super C4879a>) null), 2, (Object) null);
        } catch (Exception e) {
            C8151a.m33873n(e);
        }
    }

    /* renamed from: x */
    static /* synthetic */ void m18885x(C4878b bVar, C4403i iVar, String str, long j, String str2, String str3, String str4, C4402h hVar, int i, Object obj) {
        bVar.m18884w(iVar, str, (i & 4) != 0 ? 0 : j, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? C4402h.NONE : hVar);
    }
}
