package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.NumberPicker;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p112j2.C7439d0;
import p128m0.C7697a4;

public class SetScreenTimeoutAction extends Action {
    public static final Parcelable.Creator<SetScreenTimeoutAction> CREATOR = new C2657a();
    private static final int CUSTOM_VALUE = -99;
    private static final int[] s_delayValues = {15, 30, 60, 120, 300, 600, 1800, -1, CUSTOM_VALUE};
    private int m_customValueDelay;
    private int m_timeoutDelay;
    private String m_timeoutDelayString;
    private transient int timeoutDelaySelected;
    private transient String timeoutStringSelected;

    /* renamed from: com.arlosoft.macrodroid.action.SetScreenTimeoutAction$a */
    class C2657a implements Parcelable.Creator<SetScreenTimeoutAction> {
        C2657a() {
        }

        /* renamed from: a */
        public SetScreenTimeoutAction createFromParcel(Parcel parcel) {
            return new SetScreenTimeoutAction(parcel, (C2657a) null);
        }

        /* renamed from: b */
        public SetScreenTimeoutAction[] newArray(int i) {
            return new SetScreenTimeoutAction[i];
        }
    }

    /* synthetic */ SetScreenTimeoutAction(Parcel parcel, C2657a aVar) {
        this(parcel);
    }

    /* renamed from: l3 */
    private String[] m12626l3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_screen_timeout_15s), SelectableItem.m15535j1(C17541R$string.seconds_30), SelectableItem.m15535j1(C17541R$string.minute_1), SelectableItem.m15535j1(C17541R$string.minutes_2), SelectableItem.m15535j1(C17541R$string.minutes_5), SelectableItem.m15535j1(C17541R$string.minutes_10), SelectableItem.m15535j1(C17541R$string.minutes_30), SelectableItem.m15535j1(C17541R$string.action_set_screen_timeout_never), SelectableItem.m15535j1(C17541R$string.action_set_screen_timeout_custom)};
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public /* synthetic */ void m12627m3(NumberPicker numberPicker, NumberPicker numberPicker2, AppCompatDialog appCompatDialog, View view) {
        this.m_customValueDelay = (numberPicker.getValue() * 60) + numberPicker2.getValue();
        this.m_timeoutDelayString = this.timeoutStringSelected;
        this.m_timeoutDelay = this.timeoutDelaySelected;
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* renamed from: o3 */
    private void m12629o3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_screen_timeout_custom);
        appCompatDialog.setTitle((int) C17541R$string.action_set_screen_timeout);
        NumberPicker numberPicker = (NumberPicker) appCompatDialog.findViewById(C17532R$id.screen_timeout_custom_minutes);
        NumberPicker numberPicker2 = (NumberPicker) appCompatDialog.findViewById(C17532R$id.screen_timeout_custom_seconds);
        numberPicker.setValue(this.m_customValueDelay / 60);
        numberPicker2.setValue(this.m_customValueDelay % 60);
        numberPicker.setMinimum(0);
        numberPicker2.setMinimum(0);
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C3519uh(this, numberPicker, numberPicker2, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3492th(appCompatDialog));
        appCompatDialog.show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        int i = 0;
        while (true) {
            int[] iArr = s_delayValues;
            if (i >= iArr.length) {
                this.timeoutStringSelected = m12626l3()[0];
                this.timeoutDelaySelected = iArr[0];
                return 0;
            } else if (this.m_timeoutDelay == iArr[i]) {
                this.timeoutStringSelected = m12626l3()[i];
                this.timeoutDelaySelected = this.m_timeoutDelay;
                return i;
            } else {
                i++;
            }
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = "";
        if (this.m_timeoutDelay == CUSTOM_VALUE) {
            int i = this.m_customValueDelay;
            int i2 = i / 60;
            int i3 = i % 60;
            if (i2 == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(i3);
                sb.append(" ");
                sb.append(i3 == 1 ? SelectableItem.m15535j1(C17541R$string.second) : SelectableItem.m15535j1(C17541R$string.seconds));
                return sb.toString().toLowerCase();
            } else if (i2 == 1) {
                return "1 " + SelectableItem.m15535j1(C17541R$string.minute);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i2);
                sb2.append(" ");
                sb2.append(i2 == 1 ? SelectableItem.m15535j1(C17541R$string.minute) : SelectableItem.m15535j1(C17541R$string.minutes));
                if (i3 != 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(" ");
                    sb3.append(i3);
                    sb3.append(" ");
                    sb3.append(i3 == 1 ? SelectableItem.m15535j1(C17541R$string.second) : SelectableItem.m15535j1(C17541R$string.seconds));
                    str = sb3.toString();
                }
                sb2.append(str);
                return sb2.toString().toLowerCase();
            }
        } else {
            String str2 = this.m_timeoutDelayString;
            return str2 != null ? str2.toLowerCase() : str;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7697a4.m32097u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + mo24672O0() + ")";
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (Build.VERSION.SDK_INT < 23 || Settings.System.canWrite(mo27827K0())) {
            int i = this.m_timeoutDelay;
            if (i == CUSTOM_VALUE) {
                i = this.m_customValueDelay;
            }
            Settings.System.putInt(mo27827K0().getContentResolver(), "screen_off_timeout", i > 0 ? i * 1000 : Integer.MAX_VALUE);
            return;
        }
        C7439d0.m30911p0(mo27827K0(), mo25559a1(), 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m12626l3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return SelectableItem.m15535j1(C17541R$string.action_set_screen_timeout_select);
    }

    /* renamed from: u2 */
    public boolean mo25103u2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.timeoutDelaySelected;
        if (i == CUSTOM_VALUE) {
            m12629o3();
            return;
        }
        this.m_timeoutDelayString = this.timeoutStringSelected;
        this.m_timeoutDelay = i;
        mo24689O1();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_timeoutDelay);
        parcel.writeString(this.m_timeoutDelayString);
        parcel.writeInt(this.m_customValueDelay);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.timeoutStringSelected = m12626l3()[i];
        this.timeoutDelaySelected = s_delayValues[i];
    }

    public SetScreenTimeoutAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public SetScreenTimeoutAction() {
        this.m_timeoutDelay = s_delayValues[0];
    }

    private SetScreenTimeoutAction(Parcel parcel) {
        super(parcel);
        this.m_timeoutDelay = parcel.readInt();
        this.m_timeoutDelayString = parcel.readString();
        this.m_customValueDelay = parcel.readInt();
    }
}
