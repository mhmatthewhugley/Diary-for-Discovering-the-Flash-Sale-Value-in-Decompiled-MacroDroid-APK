package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.services.WifiHotspotService;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7796m3;
import p150q2.C8164a;

public class SetHotspotAction extends Action {
    public static final Parcelable.Creator<SetHotspotAction> CREATOR = new C2636a();
    private int m_state;
    private boolean m_turnWifiOn;
    private boolean m_useLegacyMechanism;
    private int mechanism;

    /* renamed from: com.arlosoft.macrodroid.action.SetHotspotAction$a */
    class C2636a implements Parcelable.Creator<SetHotspotAction> {
        C2636a() {
        }

        /* renamed from: a */
        public SetHotspotAction createFromParcel(Parcel parcel) {
            return new SetHotspotAction(parcel, (C2636a) null);
        }

        /* renamed from: b */
        public SetHotspotAction[] newArray(int i) {
            return new SetHotspotAction[i];
        }
    }

    /* synthetic */ SetHotspotAction(Parcel parcel, C2636a aVar) {
        this(parcel);
    }

    /* renamed from: q3 */
    private String[] m12421q3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_hotspot_enable), SelectableItem.m15535j1(C17541R$string.action_set_hotspot_disable), SelectableItem.m15535j1(C17541R$string.action_set_hotspot_toggle)};
    }

    /* renamed from: r3 */
    private String[] m12422r3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_hotspot_enable_wifi), SelectableItem.m15535j1(C17541R$string.action_set_hotspot_disable_wifi)};
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static /* synthetic */ void m12423s3(CheckBox checkBox, CompoundButton compoundButton, boolean z) {
        if (z) {
            checkBox.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static /* synthetic */ void m12424t3(CheckBox checkBox, CompoundButton compoundButton, boolean z) {
        if (z) {
            checkBox.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m12425u3(CheckBox checkBox, CheckBox checkBox2, AppCompatDialog appCompatDialog, RadioButton radioButton, RadioButton radioButton2, Activity activity, View view) {
        this.m_useLegacyMechanism = checkBox.isChecked();
        this.mechanism = checkBox2.isChecked() ? 1 : 0;
        appCompatDialog.dismiss();
        int i = radioButton.isChecked() ? 0 : radioButton2.isChecked() ? 1 : 2;
        this.m_state = i;
        if (i > 0) {
            m12430z3(activity);
        } else {
            mo24689O1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m12427w3(DialogInterface dialogInterface, int i) {
        mo24883h0();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m12428x3(DialogInterface dialogInterface, int i) {
        this.m_turnWifiOn = i == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m12429y3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* renamed from: z3 */
    private void m12430z3(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, mo24705l0());
        builder.setTitle((int) C17541R$string.action_set_hotspot_when_ap_disabled);
        builder.setSingleChoiceItems((CharSequence[]) m12422r3(), this.m_turnWifiOn ^ true ? 1 : 0, (DialogInterface.OnClickListener) new C3451sg(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3400rg(this));
        builder.create().show();
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m12421q3()[this.m_state];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_state == 1 ? m12422r3()[true ^ this.m_turnWifiOn] : "";
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7796m3.m32563u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        try {
            Intent intent = new Intent(mo27827K0(), WifiHotspotService.class);
            intent.putExtra("ForceLegacy", this.m_useLegacyMechanism);
            intent.putExtra("WifiAPState", this.m_state);
            intent.putExtra("TurnOnWifi", this.m_turnWifiOn);
            intent.putExtra("Mechanism", this.mechanism);
            intent.putExtra("com.arlosoft.macrodroid.MACRO_NAME", mo27837X0().getName());
            mo27827K0().startService(intent);
        } catch (IllegalStateException e) {
            C4878b.m18869h("Could not start hotspot service - foreground service not enabled? " + e.toString(), mo27840Y0().longValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public AlertDialog mo24883h0() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_hotspot_options);
        appCompatDialog.setTitle((int) C17541R$string.action_set_hotspot);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.enable_hotspot);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.disable_hotspot);
        RadioButton radioButton3 = (RadioButton) appCompatDialog.findViewById(C17532R$id.toggle_hotspot);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.force_legacy_setting);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.alternative_mechanism);
        int i = Build.VERSION.SDK_INT;
        if (i < 25) {
            checkBox.setVisibility(8);
        }
        checkBox.setChecked(this.m_useLegacyMechanism);
        checkBox.setOnCheckedChangeListener(new C3573wg(checkBox2));
        if (i < 26) {
            checkBox2.setVisibility(8);
        }
        boolean z = false;
        checkBox2.setChecked(this.mechanism == 1);
        checkBox2.setOnCheckedChangeListener(new C3600xg(checkBox));
        radioButton.setChecked(this.m_state == 0);
        radioButton2.setChecked(this.m_state == 1);
        if (this.m_state == 2) {
            z = true;
        }
        radioButton3.setChecked(z);
        button.setOnClickListener(new C3545vg(this, checkBox, checkBox2, appCompatDialog, radioButton, radioButton2, j0));
        button2.setOnClickListener(new C3518ug(appCompatDialog));
        appCompatDialog.show();
        return null;
    }

    /* renamed from: p2 */
    public Pair<Integer, String> mo24959p2() {
        if (Build.VERSION.SDK_INT < 29 || C8164a.m33886a() || !this.m_turnWifiOn || this.m_state == 0) {
            return null;
        }
        return new Pair<>(2, "1.2");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.action_set_hotspot);
        builder.setMessage((int) C17541R$string.hotspot_warning);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3491tg(this));
        builder.show();
        C5163j2.m20011L5(mo27827K0(), true);
    }

    /* renamed from: u2 */
    public boolean mo25103u2() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_state);
        parcel.writeInt(this.m_turnWifiOn ? 1 : 0);
        parcel.writeInt(this.m_useLegacyMechanism ? 1 : 0);
        parcel.writeInt(this.mechanism);
    }

    public SetHotspotAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public SetHotspotAction() {
        this.mechanism = 0;
        this.m_state = 0;
        this.m_turnWifiOn = true;
    }

    private SetHotspotAction(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.mechanism = 0;
        this.m_state = parcel.readInt();
        this.m_turnWifiOn = parcel.readInt() != 0;
        this.m_useLegacyMechanism = parcel.readInt() != 0 ? true : z;
        this.mechanism = parcel.readInt();
    }
}
