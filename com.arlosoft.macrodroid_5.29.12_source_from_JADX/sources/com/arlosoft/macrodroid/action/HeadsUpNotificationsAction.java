package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import p128m0.C7762i1;

public class HeadsUpNotificationsAction extends Action {
    public static final Parcelable.Creator<HeadsUpNotificationsAction> CREATOR = new C2474a();
    private int option;

    /* renamed from: com.arlosoft.macrodroid.action.HeadsUpNotificationsAction$a */
    class C2474a implements Parcelable.Creator<HeadsUpNotificationsAction> {
        C2474a() {
        }

        /* renamed from: a */
        public HeadsUpNotificationsAction createFromParcel(Parcel parcel) {
            return new HeadsUpNotificationsAction(parcel, (C2474a) null);
        }

        /* renamed from: b */
        public HeadsUpNotificationsAction[] newArray(int i) {
            return new HeadsUpNotificationsAction[i];
        }
    }

    /* synthetic */ HeadsUpNotificationsAction(Parcel parcel, C2474a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m10940j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.enable), SelectableItem.m15535j1(C17541R$string.disable), SelectableItem.m15535j1(C17541R$string.toggle)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(C17541R$string.action_heads_up) + " " + m10940j3()[this.option];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7762i1.m32401u();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027 A[SYNTHETIC, Splitter:B:16:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo r6) {
        /*
            r5 = this;
            java.lang.String r6 = "heads_up_notifications_enabled"
            r0 = 1
            r1 = 0
            android.content.Context r2 = r5.mo27827K0()     // Catch:{ SettingNotFoundException -> 0x0014 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x0014 }
            int r2 = android.provider.Settings.Global.getInt(r2, r6)     // Catch:{ SettingNotFoundException -> 0x0014 }
            if (r2 == 0) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            int r3 = r5.option
            if (r3 == r0) goto L_0x0020
            r4 = 2
            if (r3 == r4) goto L_0x001e
            r2 = 1
            goto L_0x0021
        L_0x001e:
            r2 = r2 ^ r0
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            boolean r3 = p150q2.C8164a.m33886a()
            if (r3 != 0) goto L_0x0049
            android.content.Context r3 = r5.mo27827K0()     // Catch:{ Exception -> 0x0038 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Exception -> 0x0038 }
            if (r2 == 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            boolean r1 = android.provider.Settings.Global.putInt(r3, r6, r0)     // Catch:{ Exception -> 0x0038 }
            goto L_0x0039
        L_0x0038:
        L_0x0039:
            if (r1 != 0) goto L_0x0048
            java.lang.Long r6 = r5.mo27840Y0()
            long r0 = r6.longValue()
            java.lang.String r6 = "Could not set heads up status, you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r6, r0)
        L_0x0048:
            return
        L_0x0049:
            if (r2 == 0) goto L_0x0055
            java.lang.String r6 = "settings put global heads_up_notifications_enabled 1"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r6)
            goto L_0x005e
        L_0x0055:
            java.lang.String r6 = "settings put global heads_up_notifications_enabled 0"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r6)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.HeadsUpNotificationsAction.mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m10940j3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    public HeadsUpNotificationsAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private HeadsUpNotificationsAction() {
        this.option = 0;
    }

    private HeadsUpNotificationsAction(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}
