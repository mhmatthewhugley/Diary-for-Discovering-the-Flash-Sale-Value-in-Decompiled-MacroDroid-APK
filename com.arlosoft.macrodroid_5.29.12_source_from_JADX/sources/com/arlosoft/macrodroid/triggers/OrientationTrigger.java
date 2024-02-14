package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.WindowManager;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15552u0;
import kotlinx.coroutines.C15561w1;
import p119k3.C7498f1;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* compiled from: OrientationTrigger.kt */
public final class OrientationTrigger extends Trigger {
    public static final Parcelable.Creator<OrientationTrigger> CREATOR = new C5710a();
    private static final String[] ORIENTATION_OPTIONS = {SelectableItem.m15535j1(C17541R$string.trigger_device_orientation_portrait), SelectableItem.m15535j1(C17541R$string.trigger_device_orientation_landscape)};

    /* renamed from: d */
    public static final C5711b f13665d = new C5711b((C13695i) null);
    /* access modifiers changed from: private */
    public static boolean isPortrait = true;
    private static int triggerCount;
    /* access modifiers changed from: private */
    public boolean checkOrientationAlive;
    private int option;

    /* renamed from: com.arlosoft.macrodroid.triggers.OrientationTrigger$a */
    /* compiled from: OrientationTrigger.kt */
    public static final class C5710a implements Parcelable.Creator<OrientationTrigger> {
        C5710a() {
        }

        /* renamed from: a */
        public OrientationTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new OrientationTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public OrientationTrigger[] newArray(int i) {
            return new OrientationTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.OrientationTrigger$b */
    /* compiled from: OrientationTrigger.kt */
    public static final class C5711b {
        private C5711b() {
        }

        public /* synthetic */ C5711b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.OrientationTrigger$c */
    /* compiled from: OrientationTrigger.kt */
    static final class C5712c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ OrientationTrigger this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5712c(OrientationTrigger orientationTrigger, C13635d<? super C5712c> dVar) {
            super(2, dVar);
            this.this$0 = orientationTrigger;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5712c(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5712c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0 || i == 1) {
                C13332o.m85685b(obj);
                while (this.this$0.checkOrientationAlive) {
                    Object systemService = this.this$0.mo27827K0().getSystemService("window");
                    C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    if (this.this$0.m22884o3(((WindowManager) systemService).getDefaultDisplay().getRotation()) != OrientationTrigger.isPortrait) {
                        this.this$0.m22882m3(!OrientationTrigger.isPortrait);
                    }
                    this.label = 1;
                    if (C15552u0.m94699a(1500, this) == c) {
                        return c;
                    }
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public OrientationTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ OrientationTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: l3 */
    private final void m22881l3() {
        this.checkOrientationAlive = true;
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, (C13640g) null, (C15486m0) null, new C5712c(this, (C13635d<? super C5712c>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public final void m22882m3(boolean z) {
        int i;
        isPortrait = z;
        ArrayList<Macro> arrayList = new ArrayList<>();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (it.hasNext()) {
                Trigger next2 = it.next();
                if ((next2 instanceof OrientationTrigger) && ((((i = ((OrientationTrigger) next2).option) == 0 && z) || (i == 1 && !z)) && next2.mo31374R2())) {
                    next.setTriggerThatInvoked(next2);
                    if (next.canInvoke(next.getTriggerContextInfo())) {
                        C13706o.m87928e(next, "macro");
                        arrayList.add(next);
                    }
                }
            }
        }
        for (Macro b6Var : arrayList) {
            new Handler(Looper.getMainLooper()).post(new C5875b6(b6Var));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m22883n3(Macro macro) {
        C13706o.m87929f(macro, "$macro");
        macro.invokeActions(macro.getTriggerContextInfo());
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public final boolean m22884o3(int i) {
        return i == 0 || i == 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = ORIENTATION_OPTIONS[this.option];
        C13706o.m87928e(str, "ORIENTATION_OPTIONS[option]");
        return str;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = triggerCount - 1;
        triggerCount = i;
        if (i == 0) {
            this.checkOrientationAlive = false;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7498f1.f18361j.mo37640a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + ": " + mo24672O0();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (triggerCount == 0) {
            m22881l3();
        }
        triggerCount++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return ORIENTATION_OPTIONS;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    public OrientationTrigger() {
    }

    private OrientationTrigger(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}
