package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import p128m0.C7871w4;

public class USBTetheringAction extends Action {
    public static final Parcelable.Creator<USBTetheringAction> CREATOR = new C2761a();
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.action.USBTetheringAction$a */
    class C2761a implements Parcelable.Creator<USBTetheringAction> {
        C2761a() {
        }

        /* renamed from: a */
        public USBTetheringAction createFromParcel(Parcel parcel) {
            return new USBTetheringAction(parcel, (C2761a) null);
        }

        /* renamed from: b */
        public USBTetheringAction[] newArray(int i) {
            return new USBTetheringAction[i];
        }
    }

    /* synthetic */ USBTetheringAction(Parcel parcel, C2761a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m13632j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.f7056on), SelectableItem.m15535j1(C17541R$string.off), SelectableItem.m15535j1(C17541R$string.toggle)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(C17541R$string.action_usb_tethering) + " " + m13632j3()[this.m_option];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7871w4.m32927u();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        if (((java.lang.String[]) r2.invoke(r6, new java.lang.Object[0])).length == 0) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0072  */
    /* renamed from: a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo r6) {
        /*
            r5 = this;
            int r6 = r5.m_option
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x0050
            r2 = 2
            if (r6 == r2) goto L_0x000a
            goto L_0x004e
        L_0x000a:
            android.content.Context r6 = r5.mo27827K0()
            java.lang.String r2 = "connectivity"
            java.lang.Object r6 = r6.getSystemService(r2)
            android.net.ConnectivityManager r6 = (android.net.ConnectivityManager) r6
            java.lang.Class r2 = r6.getClass()     // Catch:{ Exception -> 0x0039 }
            java.lang.String r2 = r2.getName()     // Catch:{ Exception -> 0x0039 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r3 = "getTetheredIfaces"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0039 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch:{ Exception -> 0x0039 }
            r2.setAccessible(r0)     // Catch:{ Exception -> 0x0039 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0039 }
            java.lang.Object r6 = r2.invoke(r6, r3)     // Catch:{ Exception -> 0x0039 }
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ Exception -> 0x0039 }
            int r6 = r6.length     // Catch:{ Exception -> 0x0039 }
            if (r6 != 0) goto L_0x004e
            goto L_0x0050
        L_0x0039:
            r6 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "USB Tethering - could not determing if should enabled: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r6)
        L_0x004e:
            r6 = 0
            goto L_0x0051
        L_0x0050:
            r6 = 1
        L_0x0051:
            java.lang.String r2 = "android.net.IConnectivityManager"
            java.lang.String r3 = "setUsbTethering"
            int r2 = com.arlosoft.macrodroid.utils.C6374d1.m24616a(r2, r3)
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "service call connectivity "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " i32 "
            r3.append(r2)
            if (r6 == 0) goto L_0x0072
            java.lang.String r6 = "1"
            goto L_0x0074
        L_0x0072:
            java.lang.String r6 = "0"
        L_0x0074:
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r0[r1] = r6
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.USBTetheringAction.mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m13632j3();
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

    public USBTetheringAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public USBTetheringAction() {
        this.m_option = 0;
    }

    private USBTetheringAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
