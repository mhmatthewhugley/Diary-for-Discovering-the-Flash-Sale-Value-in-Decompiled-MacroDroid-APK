package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import p128m0.C7718c4;

public class SetVibrateAction extends Action {
    public static final Parcelable.Creator<SetVibrateAction> CREATOR = new C2666a();
    private static final String DISABLE_VIBRATE_WHEN_RINGING;
    private static final String ENABLE_VIBRATE_WHEN_RINGING;
    private static final int OPTION_DISABLE_VIBRATE_WHEN_RINGING = 3;
    private static final int OPTION_ENABLE_VIBRATE_WHEN_RINGING = 2;
    private static final int OPTION_SILENT_VIBRATE_ON = 0;
    private static final int OPTION_TOGGLE_VIBRATE_WHEN_RINGING = 4;
    private static final int OPTION_VIBRATE_ENABLE = 1;
    private static final String SILENT_VIBRATE_ON;
    private static final String TOGGLE_VIBRATE_WHEN_RINGING;
    private static final String VIBRATE_ENABLE;
    private static String[] s_options;
    private String m_option;
    private int m_optionInt;

    /* renamed from: com.arlosoft.macrodroid.action.SetVibrateAction$a */
    class C2666a implements Parcelable.Creator<SetVibrateAction> {
        C2666a() {
        }

        /* renamed from: a */
        public SetVibrateAction createFromParcel(Parcel parcel) {
            return new SetVibrateAction(parcel, (C2666a) null);
        }

        /* renamed from: b */
        public SetVibrateAction[] newArray(int i) {
            return new SetVibrateAction[i];
        }
    }

    static {
        String j1 = SelectableItem.m15535j1(C17541R$string.action_set_vibrate_silent_on);
        SILENT_VIBRATE_ON = j1;
        String j12 = SelectableItem.m15535j1(C17541R$string.action_set_vibrate_normal_off);
        VIBRATE_ENABLE = j12;
        String j13 = SelectableItem.m15535j1(C17541R$string.action_set_vibrate_enable_ringing);
        ENABLE_VIBRATE_WHEN_RINGING = j13;
        String j14 = SelectableItem.m15535j1(C17541R$string.action_set_vibrate_disable_ringing);
        DISABLE_VIBRATE_WHEN_RINGING = j14;
        String j15 = SelectableItem.m15535j1(C17541R$string.action_set_vibrate_toggle_ringing);
        TOGGLE_VIBRATE_WHEN_RINGING = j15;
        String[] strArr = new String[5];
        s_options = strArr;
        strArr[0] = j1;
        strArr[1] = j12;
        strArr[2] = j13;
        strArr[3] = j14;
        strArr[4] = j15;
    }

    /* synthetic */ SetVibrateAction(Parcel parcel, C2666a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private int m12755j3() {
        int i = 0;
        while (true) {
            String[] strArr = s_options;
            if (i >= strArr.length) {
                return 0;
            }
            if (this.m_option.equals(strArr[i])) {
                return i;
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        int i = this.m_optionInt;
        if (i >= 0) {
            return i;
        }
        return m12755j3();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.m_optionInt < 0) {
            this.m_optionInt = m12755j3();
        }
        return s_options[this.m_optionInt];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7718c4.m32181u();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (android.provider.Settings.System.getInt(mo27827K0().getContentResolver(), "vibrate_when_ringing", 0) == 0) goto L_0x0052;
     */
    /* renamed from: a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo r5) {
        /*
            r4 = this;
            android.content.Context r5 = r4.mo27827K0()
            java.lang.String r0 = "audio"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 != 0) goto L_0x0019
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "SetVibrateAction - audioManager is null"
            r5.<init>(r0)
            p148q0.C8151a.m33873n(r5)
            return
        L_0x0019:
            int r0 = r4.m_optionInt
            r1 = -1
            if (r0 != r1) goto L_0x0024
            int r0 = r4.m12755j3()
            r4.m_optionInt = r0
        L_0x0024:
            int r0 = r4.m_optionInt
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x007e
            r3 = 2
            if (r0 == r1) goto L_0x0074
            java.lang.String r5 = "vibrate_when_ringing"
            if (r0 == r3) goto L_0x0052
            r3 = 3
            if (r0 == r3) goto L_0x0051
            r3 = 4
            if (r0 == r3) goto L_0x0042
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Invalid vibrate option"
            r0.<init>(r1)
            p148q0.C8151a.m33873n(r0)
            goto L_0x0051
        L_0x0042:
            android.content.Context r0 = r4.mo27827K0()
            android.content.ContentResolver r0 = r0.getContentResolver()
            int r0 = android.provider.Settings.System.getInt(r0, r5, r2)
            if (r0 != 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x0068
            android.content.Context r0 = r4.mo27827K0()
            com.arlosoft.macrodroid.macro.Macro r2 = r4.mo27837X0()
            java.lang.String r2 = r2.getName()
            com.arlosoft.macrodroid.utils.C6401l0.m24656b(r0, r5, r1, r2)
            goto L_0x0073
        L_0x0068:
            android.content.Context r0 = r4.mo27827K0()
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.provider.Settings.System.putInt(r0, r5, r1)
        L_0x0073:
            return
        L_0x0074:
            r5.setRingerMode(r3)
            r5.setVibrateSetting(r2, r2)
            r5.setVibrateSetting(r1, r2)
            return
        L_0x007e:
            r5.setRingerMode(r1)
            r5.setVibrateSetting(r2, r1)
            r5.setVibrateSetting(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.SetVibrateAction.mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo):void");
    }

    /* renamed from: e2 */
    public boolean mo25672e2() {
        if (!C5163j2.m20223o0(mo27827K0()) && Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return s_options;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return SelectableItem.m15535j1(C17541R$string.action_set_vibrate_set);
    }

    /* renamed from: m2 */
    public boolean mo24739m2() {
        return Build.VERSION.SDK_INT >= 23 && this.m_optionInt > 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_option);
        parcel.writeInt(this.m_optionInt);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_optionInt = i;
        this.m_option = s_options[i];
    }

    public SetVibrateAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
        this.m_optionInt = -1;
    }

    private SetVibrateAction() {
        this.m_option = s_options[0];
    }

    private SetVibrateAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readString();
        this.m_optionInt = parcel.readInt();
    }
}
