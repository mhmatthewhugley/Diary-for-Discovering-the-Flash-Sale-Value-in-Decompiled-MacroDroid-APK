package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7647u0;

public class ScreenOnOffConstraint extends Constraint {
    public static final Parcelable.Creator<ScreenOnOffConstraint> CREATOR = new C4185a();

    /* renamed from: a */
    private boolean f10753a;
    private boolean m_screenOn;

    /* renamed from: com.arlosoft.macrodroid.constraint.ScreenOnOffConstraint$a */
    class C4185a implements Parcelable.Creator<ScreenOnOffConstraint> {
        C4185a() {
        }

        /* renamed from: a */
        public ScreenOnOffConstraint createFromParcel(Parcel parcel) {
            return new ScreenOnOffConstraint(parcel, (C4185a) null);
        }

        /* renamed from: b */
        public ScreenOnOffConstraint[] newArray(int i) {
            return new ScreenOnOffConstraint[i];
        }
    }

    /* synthetic */ ScreenOnOffConstraint(Parcel parcel, C4185a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16982g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_screen_on_off_screen_on), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_screen_on_off_screen_off)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (!this.f10753a) {
            this.m_screenOn = false;
        }
        return this.m_screenOn ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (!this.f10753a) {
            this.m_screenOn = false;
        }
        return m16982g3()[!this.m_screenOn];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        if (!this.f10753a) {
            this.m_screenOn = false;
        }
        if (this.m_screenOn == ((PowerManager) mo27827K0().getSystemService("power")).isInteractive()) {
            return true;
        }
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7647u0.m31867u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16982g3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_screenOn ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        boolean z = true;
        this.f10753a = true;
        if (i != 0) {
            z = false;
        }
        this.m_screenOn = z;
    }

    public ScreenOnOffConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ScreenOnOffConstraint() {
        this.f10753a = true;
        this.m_screenOn = true;
    }

    private ScreenOnOffConstraint(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.f10753a = true;
        this.m_screenOn = parcel.readInt() == 0 ? false : z;
    }
}
