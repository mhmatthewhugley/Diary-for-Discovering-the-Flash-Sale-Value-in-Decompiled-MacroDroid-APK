package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7847t2;
import p148q0.C8151a;
import p150q2.C8164a;
import p376r7.C16351a;
import p376r7.C16355b;
import p385s7.C16505a;

public class RebootAction extends Action {
    public static final Parcelable.Creator<RebootAction> CREATOR = new C2602a();
    private boolean m_reboot;
    private boolean m_softReebot;
    private int option;

    /* renamed from: com.arlosoft.macrodroid.action.RebootAction$a */
    class C2602a implements Parcelable.Creator<RebootAction> {
        C2602a() {
        }

        /* renamed from: a */
        public RebootAction createFromParcel(Parcel parcel) {
            return new RebootAction(parcel, (C2602a) null);
        }

        /* renamed from: b */
        public RebootAction[] newArray(int i) {
            return new RebootAction[i];
        }
    }

    /* synthetic */ RebootAction(Parcel parcel, C2602a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m11996j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_reboot_reboot), SelectableItem.m15535j1(C17541R$string.action_reboot_power_off), SelectableItem.m15535j1(C17541R$string.action_soft_reboot), SelectableItem.m15535j1(C17541R$string.action_reboot_power_off_alternative)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (this.option == 3) {
            return 3;
        }
        if (this.m_softReebot) {
            return 2;
        }
        return this.m_reboot ? 0 : 1;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        String[] j3 = m11996j3();
        if (this.option == 3) {
            return j3[3];
        }
        if (this.m_softReebot) {
            return j3[2];
        }
        return this.m_reboot ? j3[0] : j3[1];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7847t2.m32811u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        try {
            if (this.option == 3) {
                try {
                    C16505a.m98576q(true, 600000, C16355b.C16359d.SYSTEM_APP).mo79032w(new C16351a(0, 60000, "reboot -p"));
                } catch (Exception unused) {
                }
            } else if (this.m_softReebot) {
                C4061t1.m15947B0(new String[]{"setprop ctl.restart zygote"});
            } else if (this.m_reboot) {
                Runtime.getRuntime().exec("su");
                C16505a.m98574o(true).mo79032w(new C16351a(0, "am start -a android.intent.action.REBOOT"));
            } else {
                Runtime.getRuntime().exec("su");
                C16505a.m98574o(true).mo79032w(new C16351a(0, "am start -a android.intent.action.ACTION_REQUEST_SHUTDOWN"));
            }
        } catch (Exception e) {
            if (C8164a.m33886a()) {
                C8151a.m33873n(new RuntimeException("Reboot Action failed on rooted device: " + e.getMessage()));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m11996j3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_reboot ? 1 : 0);
        parcel.writeInt(this.m_softReebot ? 1 : 0);
        parcel.writeInt(this.option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
        boolean z = true;
        this.m_softReebot = i == 2;
        if (i != 0) {
            z = false;
        }
        this.m_reboot = z;
    }

    public RebootAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private RebootAction() {
        this.m_reboot = true;
    }

    private RebootAction(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.m_reboot = parcel.readInt() != 0;
        this.m_softReebot = parcel.readInt() == 0 ? false : z;
        this.option = parcel.readInt();
    }
}
