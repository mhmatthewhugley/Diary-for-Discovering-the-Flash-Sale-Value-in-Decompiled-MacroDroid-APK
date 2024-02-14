package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p112j2.C7439d0;
import p123l1.C7650v0;

public class SignalOnOffConstraint extends Constraint {
    public static final Parcelable.Creator<SignalOnOffConstraint> CREATOR = new C4186a();
    private static int s_constraintCounter;
    /* access modifiers changed from: private */
    public static boolean s_hasService;
    private static C4187b s_serviceStateListener;
    private transient boolean m_constraintCheckingEnabled;
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.constraint.SignalOnOffConstraint$a */
    class C4186a implements Parcelable.Creator<SignalOnOffConstraint> {
        C4186a() {
        }

        /* renamed from: a */
        public SignalOnOffConstraint createFromParcel(Parcel parcel) {
            return new SignalOnOffConstraint(parcel, (C4186a) null);
        }

        /* renamed from: b */
        public SignalOnOffConstraint[] newArray(int i) {
            return new SignalOnOffConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.SignalOnOffConstraint$b */
    private static class C4187b extends PhoneStateListener {
        private C4187b() {
        }

        public void onServiceStateChanged(ServiceState serviceState) {
            super.onServiceStateChanged(serviceState);
            if (serviceState.getState() != 0) {
                boolean unused = SignalOnOffConstraint.s_hasService = false;
            } else {
                boolean unused2 = SignalOnOffConstraint.s_hasService = true;
            }
        }

        /* synthetic */ C4187b(C4186a aVar) {
            this();
        }
    }

    /* synthetic */ SignalOnOffConstraint(Parcel parcel, C4186a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m16994j3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_signal_on_off_service_available), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_signal_on_off_service_unavailable)};
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public /* synthetic */ void m16995k3() {
        try {
            ((TelephonyManager) mo27827K0().getSystemService("phone")).listen(s_serviceStateListener, 0);
        } catch (SecurityException unused) {
            C7439d0.m30909o0(mo27827K0(), "android.permission.READ_PHONE_STATE", SelectableItem.m15535j1(C17541R$string.constraint_signal_on_off), true, false);
        }
        s_serviceStateListener = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void m16996l3() {
        s_serviceStateListener = new C4187b((C4186a) null);
        try {
            ((TelephonyManager) mo27827K0().getSystemService("phone")).listen(s_serviceStateListener, 1);
        } catch (SecurityException unused) {
            C7439d0.m30909o0(mo27827K0(), "android.permission.READ_PHONE_STATE", SelectableItem.m15535j1(C17541R$string.constraint_signal_on_off), true, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: H0 */
    public String mo27823H0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m16994j3()[this.m_option];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        if (s_hasService) {
            if (!(Settings.System.getInt(mo27827K0().getContentResolver(), "airplane_mode_on", 0) != 0)) {
                if (this.m_option == 0) {
                    return true;
                }
                return false;
            } else if (this.m_option != 0) {
                return true;
            } else {
                return false;
            }
        } else if (this.m_option != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7650v0.m31879u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public void mo28052T2() {
        if (this.m_constraintCheckingEnabled) {
            this.m_constraintCheckingEnabled = false;
            int i = s_constraintCounter - 1;
            s_constraintCounter = i;
            if (i == 0) {
                new Handler(mo27827K0().getMainLooper()).post(new C4224a3(this));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo28053V2() {
        if (!this.m_constraintCheckingEnabled) {
            this.m_constraintCheckingEnabled = true;
            if (s_constraintCounter == 0) {
                new Handler(mo27827K0().getMainLooper()).post(new C4354z2(this));
            }
            s_constraintCounter++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16994j3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.constraint_signal_on_off);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public SignalOnOffConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SignalOnOffConstraint() {
        this.m_option = 0;
    }

    private SignalOnOffConstraint(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
