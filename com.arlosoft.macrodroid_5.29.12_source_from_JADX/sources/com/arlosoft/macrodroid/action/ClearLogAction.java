package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.database.room.C4429s;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.io.File;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import p128m0.C7836s;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* compiled from: ClearLogAction.kt */
public final class ClearLogAction extends Action {
    public static final Parcelable.Creator<ClearLogAction> CREATOR = new C2358a();

    /* renamed from: f */
    public static final C2359b f7173f = new C2359b((C13695i) null);

    /* renamed from: d */
    public transient MacroDroidRoomDatabase f7174d;
    private boolean m_userLog;

    /* renamed from: com.arlosoft.macrodroid.action.ClearLogAction$a */
    /* compiled from: ClearLogAction.kt */
    public static final class C2358a implements Parcelable.Creator<ClearLogAction> {
        C2358a() {
        }

        /* renamed from: a */
        public ClearLogAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ClearLogAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public ClearLogAction[] newArray(int i) {
            return new ClearLogAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ClearLogAction$b */
    /* compiled from: ClearLogAction.kt */
    public static final class C2359b {
        private C2359b() {
        }

        public /* synthetic */ C2359b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ClearLogAction$c */
    /* compiled from: ClearLogAction.kt */
    static final class C2360c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ClearLogAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2360c(ClearLogAction clearLogAction, C13635d<? super C2360c> dVar) {
            super(2, dVar);
            this.this$0 = clearLogAction;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2360c(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2360c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4429s g = this.this$0.mo24842k3().mo28681g();
                this.label = 1;
                if (g.mo28776a(this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClearLogAction(Activity activity, Macro macro) {
        this();
        C13706o.m87929f(macro, "macro");
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ ClearLogAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private final void m10042D1() {
        MacroDroidApplication.f9883I.mo27302a().mo38307l(this);
    }

    /* renamed from: j3 */
    private final String[] m10043j3() {
        MacroDroidApplication.C3787a aVar = MacroDroidApplication.f9883I;
        return new String[]{aVar.mo27303b().getString(C17541R$string.user_log), aVar.mo27303b().getString(C17541R$string.action_clear_log_option_system_log)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_userLog ^ true ? 1 : 0;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = m10043j3()[!this.m_userLog];
        C13706o.m87928e(str, "getOptions()[if (m_userLog) 0 else 1]");
        return str;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        C4001c1 u = C7836s.m32759u();
        C13706o.m87928e(u, "getInstance()");
        return u;
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (this.m_userLog) {
            File file = new File(mo27827K0().getFilesDir(), "MacroDroidUserLog.txt");
            if (file.exists()) {
                file.delete();
                return;
            }
            return;
        }
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new C2360c(this, (C13635d<? super C2360c>) null), 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m10043j3();
    }

    /* renamed from: k3 */
    public final MacroDroidRoomDatabase mo24842k3() {
        MacroDroidRoomDatabase macroDroidRoomDatabase = this.f7174d;
        if (macroDroidRoomDatabase != null) {
            return macroDroidRoomDatabase;
        }
        C13706o.m87945v("roomDatabase");
        return null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_userLog ^ true ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_userLog = i == 0;
    }

    private ClearLogAction() {
        m10042D1();
        this.m_userLog = true;
    }

    private ClearLogAction(Parcel parcel) {
        super(parcel);
        m10042D1();
        this.m_userLog = parcel.readInt() == 0;
    }
}
