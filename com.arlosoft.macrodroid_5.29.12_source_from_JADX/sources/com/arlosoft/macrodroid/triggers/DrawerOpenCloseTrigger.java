package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p119k3.C7473a0;

/* compiled from: DrawerOpenCloseTrigger.kt */
public final class DrawerOpenCloseTrigger extends Trigger {
    public static final Parcelable.Creator<DrawerOpenCloseTrigger> CREATOR = new C5639a();
    private static final String[] OPTIONS;

    /* renamed from: d */
    public static final C5640b f13611d = new C5640b((C13695i) null);
    private static int triggerCount;
    private int option;

    /* renamed from: com.arlosoft.macrodroid.triggers.DrawerOpenCloseTrigger$a */
    /* compiled from: DrawerOpenCloseTrigger.kt */
    public static final class C5639a implements Parcelable.Creator<DrawerOpenCloseTrigger> {
        C5639a() {
        }

        /* renamed from: a */
        public DrawerOpenCloseTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new DrawerOpenCloseTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public DrawerOpenCloseTrigger[] newArray(int i) {
            return new DrawerOpenCloseTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.DrawerOpenCloseTrigger$b */
    /* compiled from: DrawerOpenCloseTrigger.kt */
    public static final class C5640b {
        private C5640b() {
        }

        public /* synthetic */ C5640b(C13695i iVar) {
            this();
        }
    }

    static {
        String j1 = SelectableItem.m15535j1(C17541R$string.trigger_drawer_open_close_drawer_openend);
        C13706o.m87928e(j1, "getString(R.string.trigg…pen_close_drawer_openend)");
        String j12 = SelectableItem.m15535j1(C17541R$string.trigger_drawer_open_close_drawer_closed);
        C13706o.m87928e(j12, "getString(R.string.trigg…open_close_drawer_closed)");
        OPTIONS = new String[]{j1, j12};
    }

    public DrawerOpenCloseTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ DrawerOpenCloseTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return OPTIONS[this.option];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        triggerCount--;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7473a0.f18322j.mo37636a();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        triggerCount++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return OPTIONS;
    }

    /* renamed from: g3 */
    public final boolean mo31100g3() {
        return this.option == 0;
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

    public DrawerOpenCloseTrigger() {
    }

    private DrawerOpenCloseTrigger(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}
