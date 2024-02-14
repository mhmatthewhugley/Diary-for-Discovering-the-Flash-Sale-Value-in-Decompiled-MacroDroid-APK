package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.activities.PauseActionActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import p057a2.C2216e;
import p057a2.C2219h;
import p128m0.C7801n2;
import p149q1.C8157f;
import p149q1.C8162k;

public class PauseAction extends Action implements C2219h, C2216e {
    public static final Parcelable.Creator<PauseAction> CREATOR = new C2575a();
    private static final int SET_DELAY = 1066;
    private int m_delayInMilliSeconds;
    private int m_delayInSeconds;
    private boolean m_useAlarm;
    private MacroDroidVariable m_variable;
    private int unitForVariables;
    private DictionaryKeys varDictionaryKeys;

    /* renamed from: com.arlosoft.macrodroid.action.PauseAction$a */
    class C2575a implements Parcelable.Creator<PauseAction> {
        C2575a() {
        }

        /* renamed from: a */
        public PauseAction createFromParcel(Parcel parcel) {
            return new PauseAction(parcel, (C2575a) null);
        }

        /* renamed from: b */
        public PauseAction[] newArray(int i) {
            return new PauseAction[i];
        }
    }

    /* synthetic */ PauseAction(Parcel parcel, C2575a aVar) {
        this(parcel);
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        String str;
        String str2;
        String j1 = SelectableItem.m15535j1(C17541R$string.wait_duration_parameter);
        if (this.m_variable != null) {
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append(SelectableItem.m15535j1(C17541R$string.variable_short_name));
            sb.append(": ");
            sb.append(this.m_variable.getName());
            sb.append(C6520o0.m24912e0(this.varDictionaryKeys));
            sb.append(" (");
            sb.append(this.unitForVariables == 0 ? SelectableItem.m15535j1(C17541R$string.seconds) : SelectableItem.m15535j1(C17541R$string.minutes));
            sb.append(")");
            objArr[0] = sb.toString();
            return String.format(j1, objArr);
        }
        int i = this.m_delayInSeconds;
        if (i < 1) {
            return String.format(j1, new Object[]{this.m_delayInMilliSeconds + " " + SelectableItem.m15535j1(C17541R$string.milliseconds_capital).toLowerCase()});
        }
        String str3 = "";
        if (i == 1) {
            Object[] objArr2 = new Object[1];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("1 ");
            sb2.append(SelectableItem.m15535j1(C17541R$string.second));
            if (this.m_delayInMilliSeconds != 0) {
                str3 = " " + this.m_delayInMilliSeconds + " " + SelectableItem.m15535j1(C17541R$string.milliseconds_capital).toLowerCase();
            }
            sb2.append(str3);
            objArr2[0] = sb2.toString();
            return String.format(j1, objArr2);
        } else if (i < 60) {
            Object[] objArr3 = new Object[1];
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.m_delayInSeconds);
            sb3.append(" ");
            sb3.append(SelectableItem.m15535j1(C17541R$string.seconds));
            if (this.m_delayInMilliSeconds != 0) {
                str3 = " " + this.m_delayInMilliSeconds + " " + SelectableItem.m15535j1(C17541R$string.milliseconds_capital).toLowerCase();
            }
            sb3.append(str3);
            objArr3[0] = sb3.toString();
            return String.format(j1, objArr3);
        } else if (i < 120) {
            int i2 = i % 60;
            Object[] objArr4 = new Object[1];
            StringBuilder sb4 = new StringBuilder();
            sb4.append("1 ");
            sb4.append(SelectableItem.m15535j1(C17541R$string.minute));
            if (i2 != 0) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(" ");
                if (i2 != 1) {
                    str2 = i2 + " " + SelectableItem.m15535j1(C17541R$string.seconds);
                } else {
                    str2 = "1 " + SelectableItem.m15535j1(C17541R$string.second);
                }
                sb5.append(str2);
                str3 = sb5.toString();
            }
            sb4.append(str3);
            objArr4[0] = sb4.toString();
            return String.format(j1, objArr4);
        } else {
            int i3 = i % 60;
            Object[] objArr5 = new Object[1];
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.m_delayInSeconds / 60);
            sb6.append(" ");
            sb6.append(SelectableItem.m15535j1(C17541R$string.minutes));
            if (i3 != 0) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(" ");
                if (i3 != 1) {
                    str = i3 + " " + SelectableItem.m15535j1(C17541R$string.seconds);
                } else {
                    str = "1 " + SelectableItem.m15535j1(C17541R$string.second);
                }
                sb7.append(str);
                str3 = sb7.toString();
            }
            sb6.append(str3);
            objArr5[0] = sb6.toString();
            return String.format(j1, objArr5);
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7801n2.m32592u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    @Nullable
    /* renamed from: b */
    public DictionaryKeys mo24426b() {
        return this.varDictionaryKeys;
    }

    /* renamed from: j3 */
    public int mo25460j3() {
        return (this.m_delayInSeconds * 1000) + this.m_delayInMilliSeconds;
    }

    /* renamed from: k */
    public void mo24427k(@Nullable DictionaryKeys dictionaryKeys) {
        this.varDictionaryKeys = dictionaryKeys;
    }

    /* renamed from: k3 */
    public int mo25461k3() {
        return this.unitForVariables;
    }

    /* renamed from: l3 */
    public boolean mo25462l3() {
        return this.m_useAlarm;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == SET_DELAY && i2 == -1) {
            this.unitForVariables = intent.getIntExtra("UnitForVars", 0);
            this.m_variable = (MacroDroidVariable) intent.getParcelableExtra(C8162k.ITEM_TYPE);
            this.m_delayInSeconds = intent.getIntExtra("Seconds", 0);
            this.m_delayInMilliSeconds = intent.getIntExtra("MilliSeconds", 0);
            this.m_useAlarm = intent.getBooleanExtra("Alarm", false);
            this.varDictionaryKeys = (DictionaryKeys) intent.getParcelableExtra("DictionaryKeys");
            mo24689O1();
        }
    }

    /* renamed from: s */
    public MacroDroidVariable mo24432s() {
        return this.m_variable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (mo27836X()) {
            Activity j0 = mo27850j0();
            Intent intent = new Intent(j0, PauseActionActivity.class);
            intent.putExtra("UnitForVars", this.unitForVariables);
            intent.putExtra("Seconds", this.m_delayInSeconds);
            intent.putExtra(C8162k.ITEM_TYPE, this.m_variable);
            intent.putExtra("MilliSeconds", this.m_delayInMilliSeconds);
            intent.putExtra("Alarm", this.m_useAlarm);
            intent.putExtra("Seconds", this.m_delayInSeconds);
            intent.putExtra("DictionaryKeys", this.varDictionaryKeys);
            if (C4934n.m18998M().mo29682Q(mo27837X0().getGUID()) != null) {
                intent.putExtra("MacroGuid", mo27837X0().getGUID());
            } else {
                intent.putExtra(C8157f.ITEM_TYPE, mo27837X0());
            }
            intent.putExtra("selectable_item", this);
            j0.startActivityForResult(intent, SET_DELAY);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_delayInSeconds);
        parcel.writeInt(this.m_delayInMilliSeconds);
        parcel.writeParcelable(this.m_variable, i);
        parcel.writeInt(this.m_useAlarm ? 1 : 0);
        parcel.writeInt(this.unitForVariables);
        parcel.writeParcelable(this.varDictionaryKeys, i);
    }

    public PauseAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public PauseAction() {
        this.m_useAlarm = true;
        this.m_delayInSeconds = 1;
    }

    private PauseAction(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.m_useAlarm = true;
        this.m_delayInSeconds = parcel.readInt();
        this.m_delayInMilliSeconds = parcel.readInt();
        this.m_variable = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        this.m_useAlarm = parcel.readInt() == 0 ? false : z;
        this.unitForVariables = parcel.readInt();
        this.varDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
