package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6374d1;
import java.lang.reflect.Method;
import p128m0.C7774j3;
import p150q2.C8164a;

public class SetDataAction extends Action {
    public static final Parcelable.Creator<SetDataAction> CREATOR = new C2632a();
    private int m_state;

    /* renamed from: com.arlosoft.macrodroid.action.SetDataAction$a */
    class C2632a implements Parcelable.Creator<SetDataAction> {
        C2632a() {
        }

        /* renamed from: a */
        public SetDataAction createFromParcel(Parcel parcel) {
            return new SetDataAction(parcel, (C2632a) null);
        }

        /* renamed from: b */
        public SetDataAction[] newArray(int i) {
            return new SetDataAction[i];
        }
    }

    /* synthetic */ SetDataAction(Parcel parcel, C2632a aVar) {
        this(parcel);
    }

    /* renamed from: k3 */
    private String[] m12377k3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_data_on), SelectableItem.m15535j1(C17541R$string.action_set_data_off), SelectableItem.m15535j1(C17541R$string.action_set_data_toggle)};
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public /* synthetic */ void m12378l3(DialogInterface dialogInterface, int i) {
        super.mo24714u1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12379m3(boolean r7) {
        /*
            r6 = this;
            r0 = 0
            android.content.Context r1 = r6.mo27827K0()     // Catch:{ Exception -> 0x003b }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ Exception -> 0x003b }
            java.lang.String r2 = "mobile_data"
            r3 = 1
            if (r7 == 0) goto L_0x0010
            r4 = 1
            goto L_0x0011
        L_0x0010:
            r4 = 0
        L_0x0011:
            boolean r1 = android.provider.Settings.Global.putInt(r1, r2, r4)     // Catch:{ Exception -> 0x003b }
            android.content.Context r2 = r6.mo27827K0()     // Catch:{ Exception -> 0x003a }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x003a }
            java.lang.String r4 = "mobile_data1"
            if (r7 == 0) goto L_0x0023
            r5 = 1
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            boolean r1 = android.provider.Settings.Global.putInt(r2, r4, r5)     // Catch:{ Exception -> 0x003a }
            android.content.Context r2 = r6.mo27827K0()     // Catch:{ Exception -> 0x003a }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x003a }
            java.lang.String r4 = "mobile_data2"
            if (r7 == 0) goto L_0x0035
            r0 = 1
        L_0x0035:
            boolean r7 = android.provider.Settings.Global.putInt(r2, r4, r0)     // Catch:{ Exception -> 0x003a }
            goto L_0x003c
        L_0x003a:
            r0 = r1
        L_0x003b:
            r7 = r0
        L_0x003c:
            if (r7 != 0) goto L_0x004b
            java.lang.Long r7 = r6.mo27840Y0()
            long r0 = r7.longValue()
            java.lang.String r7 = "Could not set mobile data, you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r7, r0)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.SetDataAction.m12379m3(boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_state;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m12377k3()[this.m_state];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7774j3.m32453u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        boolean z;
        int i = this.m_state;
        if (i != 0) {
            if (i == 2) {
                ConnectivityManager connectivityManager = (ConnectivityManager) mo27827K0().getSystemService("connectivity");
                try {
                    Method declaredMethod = Class.forName(connectivityManager.getClass().getName()).getDeclaredMethod("getMobileDataEnabled", new Class[0]);
                    declaredMethod.setAccessible(true);
                    z = !((Boolean) declaredMethod.invoke(connectivityManager, new Object[0])).booleanValue();
                } catch (Exception unused) {
                }
            }
            z = false;
        } else {
            z = true;
        }
        if (!C8164a.m33886a()) {
            m12379m3(z);
            return;
        }
        int a = C6374d1.m24616a("com.android.internal.telephony.ITelephony", "setDataEnabled");
        int i2 = Build.VERSION.SDK_INT;
        String str = "enable";
        String str2 = "1";
        if (i2 >= 23) {
            String[] strArr = new String[1];
            StringBuilder sb = new StringBuilder();
            sb.append("service call phone ");
            sb.append(a);
            sb.append(" i32 0 i32 ");
            if (!z) {
                str2 = "0";
            }
            sb.append(str2);
            strArr[0] = sb.toString();
            C4061t1.m15947B0(strArr);
            String[] strArr2 = new String[1];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("svc data ");
            if (!z) {
                str = "disable";
            }
            sb2.append(str);
            strArr2[0] = sb2.toString();
            C4061t1.m15947B0(strArr2);
        } else if (i2 >= 22) {
            String[] strArr3 = new String[1];
            StringBuilder sb3 = new StringBuilder();
            sb3.append("service call phone ");
            sb3.append(a);
            sb3.append(" i32 0 i32 ");
            if (!z) {
                str2 = "0";
            }
            sb3.append(str2);
            strArr3[0] = sb3.toString();
            C4061t1.m15947B0(strArr3);
            String[] strArr4 = new String[1];
            StringBuilder sb4 = new StringBuilder();
            sb4.append("svc data ");
            if (!z) {
                str = "disable";
            }
            sb4.append(str);
            strArr4[0] = sb4.toString();
            C4061t1.m15947B0(strArr4);
        } else {
            String[] strArr5 = new String[1];
            StringBuilder sb5 = new StringBuilder();
            sb5.append("service call phone ");
            sb5.append(a);
            sb5.append(" i32 ");
            if (!z) {
                str2 = "0";
            }
            sb5.append(str2);
            strArr5[0] = sb5.toString();
            C4061t1.m15947B0(strArr5);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m12377k3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.action_set_data);
        builder.setMessage((int) C17541R$string.action_set_data_help);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3313og(this));
        builder.show();
        C5163j2.m20011L5(mo27827K0(), true);
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

    public SetDataAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public SetDataAction() {
        this.m_state = 0;
    }

    private SetDataAction(Parcel parcel) {
        super(parcel);
        this.m_state = parcel.readInt();
    }
}
