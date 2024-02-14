package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import p128m0.C7825q3;

public class SetLocationModeAction extends Action {
    public static final Parcelable.Creator<SetLocationModeAction> CREATOR = new C2640a();
    private static final int OPTION_BATTERY_SAVING = 2;
    private static final int OPTION_DEVICE_ONLY = 3;
    private static final int OPTION_HIGH_ACCURACY = 1;
    private static final int OPTION_LOCATION_SERVICES_OFF = 0;
    private int m_state;

    /* renamed from: com.arlosoft.macrodroid.action.SetLocationModeAction$a */
    class C2640a implements Parcelable.Creator<SetLocationModeAction> {
        C2640a() {
        }

        /* renamed from: a */
        public SetLocationModeAction createFromParcel(Parcel parcel) {
            return new SetLocationModeAction(parcel, (C2640a) null);
        }

        /* renamed from: b */
        public SetLocationModeAction[] newArray(int i) {
            return new SetLocationModeAction[i];
        }
    }

    /* synthetic */ SetLocationModeAction(Parcel parcel, C2640a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m12482j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_location_mode_off), SelectableItem.m15535j1(C17541R$string.action_set_location_mode_high_accuracy), SelectableItem.m15535j1(C17541R$string.action_set_location_mode_battery_saving), SelectableItem.m15535j1(C17541R$string.action_set_location_mode_device_only)};
    }

    /* renamed from: k3 */
    private String[] m12483k3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_location_mode_off), SelectableItem.m15535j1(C17541R$string.action_set_location_mode_on)};
    }

    /* renamed from: l3 */
    private int m12484l3() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.m_state > 0 ? 1 : 0;
        }
        return this.m_state;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return m12484l3();
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return mo24676g1()[m12484l3()];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7825q3.m32709u();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A[Catch:{ Exception -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo r13) {
        /*
            r12 = this;
            boolean r13 = p150q2.C8164a.m33886a()
            r0 = 29
            r1 = 3
            r2 = 2
            r3 = 1
            if (r13 != 0) goto L_0x0050
            int r13 = r12.m12484l3()
            r4 = 0
            if (r13 == 0) goto L_0x0018
            if (r13 == r3) goto L_0x001d
            if (r13 == r2) goto L_0x001c
            if (r13 == r1) goto L_0x001a
        L_0x0018:
            r1 = 0
            goto L_0x001d
        L_0x001a:
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 2
        L_0x001d:
            android.content.Context r13 = r12.mo27827K0()     // Catch:{ Exception -> 0x003f }
            android.content.ContentResolver r13 = r13.getContentResolver()     // Catch:{ Exception -> 0x003f }
            java.lang.String r2 = "location_mode"
            boolean r4 = android.provider.Settings.Secure.putInt(r13, r2, r1)     // Catch:{ Exception -> 0x003f }
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x003f }
            if (r13 < r0) goto L_0x0040
            android.content.Context r13 = r12.mo27827K0()     // Catch:{ Exception -> 0x003f }
            android.content.ContentResolver r13 = r13.getContentResolver()     // Catch:{ Exception -> 0x003f }
            java.lang.String r0 = "location_providers_allowed"
            boolean r13 = android.provider.Settings.Secure.putInt(r13, r0, r1)     // Catch:{ Exception -> 0x003f }
            r4 = r4 | r13
            goto L_0x0040
        L_0x003f:
        L_0x0040:
            if (r4 != 0) goto L_0x004f
            java.lang.Long r13 = r12.mo27840Y0()
            long r0 = r13.longValue()
            java.lang.String r13 = "Could not set location mode, you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r13, r0)
        L_0x004f:
            return
        L_0x0050:
            int r13 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            java.lang.String r5 = "settings put secure location_mode 1"
            java.lang.String r6 = "settings put secure location_mode 0"
            if (r13 < r4) goto L_0x00e0
            int r4 = r12.m12484l3()
            java.lang.String r7 = "settings put secure location_providers_allowed -wifi"
            java.lang.String r8 = "settings put secure location_providers_allowed -network"
            java.lang.String r9 = "settings put secure location_providers_allowed -gps"
            if (r4 == 0) goto L_0x00c1
            java.lang.String r6 = "settings put secure location_providers_allowed +wifi"
            java.lang.String r10 = "settings put secure location_providers_allowed +network"
            java.lang.String r11 = "settings put secure location_providers_allowed +gps"
            if (r4 == r3) goto L_0x00a2
            if (r4 == r2) goto L_0x008b
            if (r4 == r1) goto L_0x0074
            goto L_0x0118
        L_0x0074:
            java.lang.String[] r13 = new java.lang.String[]{r11}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r13)
            java.lang.String[] r13 = new java.lang.String[]{r8}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r13)
            java.lang.String[] r13 = new java.lang.String[]{r7}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r13)
            goto L_0x0118
        L_0x008b:
            java.lang.String[] r13 = new java.lang.String[]{r9}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r13)
            java.lang.String[] r13 = new java.lang.String[]{r10}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r13)
            java.lang.String[] r13 = new java.lang.String[]{r6}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r13)
            goto L_0x0118
        L_0x00a2:
            java.lang.String[] r1 = new java.lang.String[]{r11}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r1)
            java.lang.String[] r1 = new java.lang.String[]{r10}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r1)
            java.lang.String[] r1 = new java.lang.String[]{r6}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r1)
            if (r13 < r0) goto L_0x0118
            java.lang.String[] r13 = new java.lang.String[]{r5}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r13)
            goto L_0x0118
        L_0x00c1:
            java.lang.String[] r1 = new java.lang.String[]{r9}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r1)
            java.lang.String[] r1 = new java.lang.String[]{r8}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r1)
            java.lang.String[] r1 = new java.lang.String[]{r7}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r1)
            if (r13 < r0) goto L_0x0118
            java.lang.String[] r13 = new java.lang.String[]{r6}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r13)
            goto L_0x0118
        L_0x00e0:
            int r13 = r12.m12484l3()
            if (r13 == 0) goto L_0x010f
            if (r13 == r3) goto L_0x0103
            if (r13 == r2) goto L_0x00f7
            if (r13 == r1) goto L_0x00ed
            goto L_0x0118
        L_0x00ed:
            java.lang.String r13 = "settings put secure location_providers_allowed gps"
            java.lang.String[] r13 = new java.lang.String[]{r5, r13}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r13)
            goto L_0x0118
        L_0x00f7:
            java.lang.String r13 = "settings put secure location_mode 2"
            java.lang.String r0 = "settings put secure location_providers_allowed wifi,network"
            java.lang.String[] r13 = new java.lang.String[]{r13, r0}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r13)
            goto L_0x0118
        L_0x0103:
            java.lang.String r13 = "settings put secure location_mode 3"
            java.lang.String r0 = "settings put secure location_providers_allowed gps,wifi,network"
            java.lang.String[] r13 = new java.lang.String[]{r13, r0}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r13)
            goto L_0x0118
        L_0x010f:
            java.lang.String r13 = "settings put secure location_providers_allowed ' '"
            java.lang.String[] r13 = new java.lang.String[]{r6, r13}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r13)
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.SetLocationModeAction.mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        if (Build.VERSION.SDK_INT >= 29) {
            return m12483k3();
        }
        return m12482j3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_state);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_state = i;
    }

    public SetLocationModeAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SetLocationModeAction() {
        this.m_state = 0;
    }

    private SetLocationModeAction(Parcel parcel) {
        super(parcel);
        this.m_state = parcel.readInt();
    }
}
