package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.geofences.C4716i;
import com.arlosoft.macrodroid.geofences.GeofenceListActivity;
import com.arlosoft.macrodroid.macro.Macro;
import p119k3.C7512i0;
import p125l3.C7665a;
import p319lc.C15626c;

public class GeofenceTrigger extends Trigger implements C7665a {
    public static final Parcelable.Creator<GeofenceTrigger> CREATOR = new C5654c();
    private static final int SELECT_GEOFENCE = 878;
    private static int s_triggerCounter;

    /* renamed from: d */
    transient C4716i f13620d;
    private boolean m_enterArea;
    private String m_geofenceId;
    private int m_geofenceUpdateRateMinutes;
    private transient PendingIntent m_pendingIntent;
    private boolean m_triggerFromUnknown;
    private String m_updateRateText;
    private transient String oldGeofenceId;
    /* access modifiers changed from: private */
    public transient TextView zoneNameButton;

    /* renamed from: com.arlosoft.macrodroid.triggers.GeofenceTrigger$a */
    class C5652a implements View.OnClickListener {
        C5652a() {
        }

        public void onClick(View view) {
            GeofenceTrigger.this.m22273x3();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.GeofenceTrigger$b */
    class C5653b implements DialogInterface.OnDismissListener {
        C5653b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            TextView unused = GeofenceTrigger.this.zoneNameButton = null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.GeofenceTrigger$c */
    class C5654c implements Parcelable.Creator<GeofenceTrigger> {
        C5654c() {
        }

        /* renamed from: a */
        public GeofenceTrigger createFromParcel(Parcel parcel) {
            return new GeofenceTrigger(parcel, (C5652a) null);
        }

        /* renamed from: b */
        public GeofenceTrigger[] newArray(int i) {
            return new GeofenceTrigger[i];
        }
    }

    /* synthetic */ GeofenceTrigger(Parcel parcel, C5652a aVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private void m22257D1() {
        MacroDroidApplication.f9885K.mo38300e(this);
        this.m_enterArea = true;
        this.m_geofenceUpdateRateMinutes = 5;
        this.m_updateRateText = SelectableItem.m15535j1(C17541R$string.minutes_5);
    }

    /* renamed from: n3 */
    private String m22265n3() {
        return this.f13620d.mo29201k(this.m_geofenceId);
    }

    /* renamed from: o3 */
    private int m22266o3() {
        int i = this.m_geofenceUpdateRateMinutes;
        if (i == 0) {
            return 30000;
        }
        return i * 60 * 1000;
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m22267r3(TextView textView, View view) {
        m22272w3(textView);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void m22268s3(RadioButton radioButton, CheckBox checkBox, AppCompatDialog appCompatDialog, View view) {
        if (this.m_geofenceId != null) {
            String str = this.oldGeofenceId;
            if (str != null) {
                this.f13620d.mo29203r(str, mo27847f1(), mo27837X0().getName(), mo27840Y0().longValue());
            }
            this.m_enterArea = radioButton.isChecked();
            this.m_triggerFromUnknown = checkBox.isChecked();
            appCompatDialog.dismiss();
            mo24689O1();
            return;
        }
        C15626c.makeText(mo27827K0(), C17541R$string.select_zone, 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m22270u3(DialogInterface dialogInterface, int i) {
        mo24679x2(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m22271v3(String[] strArr, int[] iArr, TextView textView, DialogInterface dialogInterface, int i) {
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        String str = strArr[checkedItemPosition];
        this.m_updateRateText = str;
        this.m_geofenceUpdateRateMinutes = iArr[checkedItemPosition];
        textView.setText(str);
    }

    /* renamed from: w3 */
    private void m22272w3(TextView textView) {
        String[] stringArray = mo27827K0().getResources().getStringArray(C17525R$array.geofence_trigger_update_rate_names);
        int[] intArray = mo27827K0().getResources().getIntArray(C17525R$array.geofence_trigger_update_rates_int);
        int length = intArray.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (intArray[i2] == this.m_geofenceUpdateRateMinutes) {
                i = i3;
                break;
            } else {
                i3++;
                i2++;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) stringArray, i, (DialogInterface.OnClickListener) new C5872b3(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5884c3(this, stringArray, intArray, textView));
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public void m22273x3() {
        Activity j0 = mo27850j0();
        Intent intent = new Intent(j0, GeofenceListActivity.class);
        intent.putExtra("ThemeType", 1);
        intent.putExtra("picker_mode", true);
        j0.startActivityForResult(intent, SELECT_GEOFENCE);
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(this.m_enterArea ? C17541R$string.trigger_geofence_enter : C17541R$string.trigger_geofence_exited);
    }

    /* renamed from: H */
    public void mo31172H() {
        this.m_geofenceId = null;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m22265n3();
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        String str = this.m_geofenceId;
        if (str != null) {
            this.f13620d.mo29203r(str, mo27847f1(), mo27837X0().getName(), mo27840Y0().longValue());
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7512i0.m31245u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        String str = this.m_geofenceId;
        if (str != null) {
            this.f13620d.mo29199h(str, mo27847f1(), m22266o3(), mo27837X0().getName(), mo27840Y0().longValue());
        }
    }

    /* renamed from: Y2 */
    public TriggerContextInfo mo30911Y2() {
        return new TriggerContextInfo((Trigger) this, "Testing: lat?,lon?");
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    }

    /* renamed from: n2 */
    public boolean mo25733n2() {
        return true;
    }

    /* renamed from: o */
    public String mo31173o() {
        return this.m_geofenceId;
    }

    /* renamed from: p3 */
    public boolean mo31174p3() {
        return this.m_enterArea;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == SELECT_GEOFENCE && i2 == -1 && this.zoneNameButton != null) {
            this.oldGeofenceId = this.m_geofenceId;
            this.m_geofenceId = intent.getStringExtra("selected_geofence_id");
            this.zoneNameButton.setText(m22265n3());
        }
    }

    /* renamed from: q3 */
    public boolean mo31175q3() {
        return this.m_enterArea;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (mo27836X()) {
            AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_geofence_configure);
            appCompatDialog.setTitle((int) C17541R$string.select_option);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            appCompatDialog.getWindow().setAttributes(layoutParams);
            RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.area_enter_option);
            RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.area_exit_option);
            CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.location_unknown_checkbox);
            TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.update_frequency_link);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            this.zoneNameButton = (TextView) appCompatDialog.findViewById(C17532R$id.zone_name_button);
            ((ViewGroup) appCompatDialog.findViewById(C17532R$id.update_rate_container)).setVisibility(0);
            ((TextView) appCompatDialog.findViewById(C17532R$id.update_rate_description)).setVisibility(0);
            textView.setText(this.m_updateRateText);
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            textView.setOnClickListener(new C5920f3(this, textView));
            String n3 = m22265n3();
            TextView textView2 = this.zoneNameButton;
            if (TextUtils.isEmpty(n3)) {
                n3 = "<" + SelectableItem.m15535j1(C17541R$string.select_zone) + ">";
            }
            textView2.setText(n3);
            TextView textView3 = this.zoneNameButton;
            textView3.setPaintFlags(textView3.getPaintFlags() | 8);
            this.zoneNameButton.setOnClickListener(new C5652a());
            if (this.m_enterArea) {
                radioButton.setChecked(true);
            } else {
                radioButton2.setChecked(true);
            }
            checkBox.setChecked(this.m_triggerFromUnknown);
            button.setOnClickListener(new C5908e3(this, radioButton, checkBox, appCompatDialog));
            button2.setOnClickListener(new C5896d3(appCompatDialog));
            appCompatDialog.show();
            appCompatDialog.setOnDismissListener(new C5653b());
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_enterArea ^ true ? 1 : 0);
        parcel.writeInt(this.m_triggerFromUnknown ^ true ? 1 : 0);
        parcel.writeString(this.m_geofenceId);
        parcel.writeInt(this.m_geofenceUpdateRateMinutes);
        parcel.writeString(this.m_updateRateText);
    }

    public GeofenceTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public GeofenceTrigger() {
        this.oldGeofenceId = null;
        this.zoneNameButton = null;
        m22257D1();
    }

    private GeofenceTrigger(Parcel parcel) {
        super(parcel);
        this.oldGeofenceId = null;
        this.zoneNameButton = null;
        m22257D1();
        boolean z = true;
        this.m_enterArea = parcel.readInt() == 0;
        this.m_triggerFromUnknown = parcel.readInt() != 0 ? false : z;
        this.m_geofenceId = parcel.readString();
        this.m_geofenceUpdateRateMinutes = parcel.readInt();
        this.m_updateRateText = parcel.readString();
    }
}
