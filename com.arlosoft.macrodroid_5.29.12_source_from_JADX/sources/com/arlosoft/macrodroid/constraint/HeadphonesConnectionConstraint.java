package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7651w;

public class HeadphonesConnectionConstraint extends Constraint {
    public static final Parcelable.Creator<HeadphonesConnectionConstraint> CREATOR = new C4145a();
    private boolean m_connected;

    /* renamed from: com.arlosoft.macrodroid.constraint.HeadphonesConnectionConstraint$a */
    class C4145a implements Parcelable.Creator<HeadphonesConnectionConstraint> {
        C4145a() {
        }

        /* renamed from: a */
        public HeadphonesConnectionConstraint createFromParcel(Parcel parcel) {
            return new HeadphonesConnectionConstraint(parcel, (C4145a) null);
        }

        /* renamed from: b */
        public HeadphonesConnectionConstraint[] newArray(int i) {
            return new HeadphonesConnectionConstraint[i];
        }
    }

    /* synthetic */ HeadphonesConnectionConstraint(Parcel parcel, C4145a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16527g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_headphones_connection_in), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_headphones_connection_out)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_connected ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        int i;
        Context context;
        if (this.m_connected) {
            context = mo27827K0();
            i = C17541R$string.constraint_headphones_connection_in;
        } else {
            context = mo27827K0();
            i = C17541R$string.constraint_headphones_connection_out;
        }
        return context.getString(i);
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            AudioManager audioManager = (AudioManager) mo27827K0().getSystemService("audio");
            AudioDeviceInfo[] devices = audioManager.getDevices(2);
            int i = 0;
            while (true) {
                if (i >= devices.length) {
                    z = false;
                    break;
                }
                AudioDeviceInfo audioDeviceInfo = devices[i];
                if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 8) {
                    z = true;
                } else {
                    i++;
                }
            }
            z = true;
            if (!z) {
                z = audioManager.isWiredHeadsetOn();
            }
            if (this.m_connected == z) {
                return true;
            }
            return false;
        } else if (this.m_connected == ((AudioManager) mo27827K0().getSystemService("audio")).isWiredHeadsetOn()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7651w.m31884u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16527g3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.constraint_headphones_connection_select_state);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_connected ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_connected = i == 0;
    }

    public HeadphonesConnectionConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public HeadphonesConnectionConstraint() {
        this.m_connected = true;
    }

    private HeadphonesConnectionConstraint(Parcel parcel) {
        super(parcel);
        this.m_connected = parcel.readInt() != 0;
    }
}
