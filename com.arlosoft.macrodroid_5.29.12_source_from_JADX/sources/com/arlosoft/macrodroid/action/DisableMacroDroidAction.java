package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.MacroDroidService;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.events.MacroDroidDisabledEvent;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p128m0.C7807o0;
import p161s1.C10180a;

/* compiled from: DisableMacroDroidAction.kt */
public final class DisableMacroDroidAction extends Action {
    public static final Parcelable.Creator<DisableMacroDroidAction> CREATOR = new C2411a();

    /* renamed from: d */
    public static final C2412b f7223d = new C2412b((C13695i) null);
    private int state;

    /* renamed from: com.arlosoft.macrodroid.action.DisableMacroDroidAction$a */
    /* compiled from: DisableMacroDroidAction.kt */
    public static final class C2411a implements Parcelable.Creator<DisableMacroDroidAction> {
        C2411a() {
        }

        /* renamed from: a */
        public DisableMacroDroidAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new DisableMacroDroidAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public DisableMacroDroidAction[] newArray(int i) {
            return new DisableMacroDroidAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.DisableMacroDroidAction$b */
    /* compiled from: DisableMacroDroidAction.kt */
    public static final class C2412b {
        private C2412b() {
        }

        public /* synthetic */ C2412b(C13695i iVar) {
            this();
        }
    }

    public DisableMacroDroidAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ DisableMacroDroidAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7807o0.f18834j.mo37764a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        MacroDroidService.C2296a aVar = MacroDroidService.f7040a;
        Context applicationContext = mo27827K0().getApplicationContext();
        C13706o.m87928e(applicationContext, "context.applicationContext");
        aVar.mo24642g(applicationContext);
        C5163j2.m19935B4(mo27827K0(), false);
        Macro.setMacroDroidEnabledState(false);
        C4934n.m18998M().mo29694n0();
        C10180a.m40075a().mo80018i(new MacroDroidDisabledEvent());
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.state);
    }

    public DisableMacroDroidAction() {
    }

    private DisableMacroDroidAction(Parcel parcel) {
        super(parcel);
        this.state = parcel.readInt();
    }
}
