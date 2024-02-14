package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.lang.reflect.Method;
import p123l1.C7632n;

public class DataOnOffConstraint extends Constraint {
    public static final Parcelable.Creator<DataOnOffConstraint> CREATOR = new C4133a();
    private boolean m_dataOn;

    /* renamed from: com.arlosoft.macrodroid.constraint.DataOnOffConstraint$a */
    class C4133a implements Parcelable.Creator<DataOnOffConstraint> {
        C4133a() {
        }

        /* renamed from: a */
        public DataOnOffConstraint createFromParcel(Parcel parcel) {
            return new DataOnOffConstraint(parcel, (C4133a) null);
        }

        /* renamed from: b */
        public DataOnOffConstraint[] newArray(int i) {
            return new DataOnOffConstraint[i];
        }
    }

    /* synthetic */ DataOnOffConstraint(Parcel parcel, C4133a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16379g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_data_on_off_option_on), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_data_on_off_option_off)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_dataOn ^ true ? 1 : 0;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_dataOn ? m16379g3()[0] : m16379g3()[1];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) mo27827K0().getSystemService("connectivity");
        try {
            Method declaredMethod = Class.forName(connectivityManager.getClass().getName()).getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            z = ((Boolean) declaredMethod.invoke(connectivityManager, new Object[0])).booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        if (this.m_dataOn == z) {
            return true;
        }
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7632n.m31789u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16379g3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_dataOn ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_dataOn = i == 0;
    }

    public DataOnOffConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private DataOnOffConstraint() {
        this.m_dataOn = true;
    }

    private DataOnOffConstraint(Parcel parcel) {
        super(parcel);
        this.m_dataOn = parcel.readInt() != 0;
    }
}
