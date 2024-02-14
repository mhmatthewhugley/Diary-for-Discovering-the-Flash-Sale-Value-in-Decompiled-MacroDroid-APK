package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
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
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p123l1.C7648v;
import p319lc.C15626c;

/* compiled from: GeofenceConstraint.kt */
public final class GeofenceConstraint extends Constraint {
    private static final int AREA_IS_INSIDE = 0;
    private static final int AREA_IS_OUTSIDE = 1;
    private static final int AREA_IS_UNKNOWN = 2;
    public static final Parcelable.Creator<GeofenceConstraint> CREATOR = new C4143a();
    private static final int OPTION_INSIDE_AREA = 0;
    private static final int OPTION_OUTSIDE_AREA = 1;
    private static final int SELECT_GEOFENCE = 1;

    /* renamed from: g */
    public static final C4144b f10719g = new C4144b((C13695i) null);
    private boolean allowUnknown;

    /* renamed from: f */
    public transient C4716i f10720f;
    private String geofenceId;
    private String geofenceName;
    private transient String oldGeofenceId;
    private int option;
    private int updateRateMinutes;
    private String updateRateText;
    private transient TextView zoneNameButton;

    /* renamed from: com.arlosoft.macrodroid.constraint.GeofenceConstraint$a */
    /* compiled from: GeofenceConstraint.kt */
    public static final class C4143a implements Parcelable.Creator<GeofenceConstraint> {
        C4143a() {
        }

        /* renamed from: a */
        public GeofenceConstraint createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new GeofenceConstraint(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public GeofenceConstraint[] newArray(int i) {
            return new GeofenceConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.GeofenceConstraint$b */
    /* compiled from: GeofenceConstraint.kt */
    public static final class C4144b {
        private C4144b() {
        }

        public /* synthetic */ C4144b(C13695i iVar) {
            this();
        }
    }

    public GeofenceConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ GeofenceConstraint(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: A3 */
    private final void m16494A3() {
        Activity j0 = mo27850j0();
        Intent intent = new Intent(j0, GeofenceListActivity.class);
        intent.putExtra("ThemeType", 2);
        intent.putExtra("picker_mode", true);
        j0.startActivityForResult(intent, 1);
    }

    /* renamed from: D1 */
    private final void m16495D1() {
        MacroDroidApplication.f9883I.mo27302a().mo38306k(this);
    }

    /* renamed from: o3 */
    private final String[] m16503o3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.constraint_geofence_option_inside_area), SelectableItem.m15535j1(C17541R$string.constraint_geofence_option_outside_area)};
    }

    /* renamed from: p3 */
    private final int m16504p3() {
        int i = this.updateRateMinutes;
        if (i == 0) {
            return 30000;
        }
        return i * 60 * 1000;
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m16505r3(GeofenceConstraint geofenceConstraint, TextView textView, View view) {
        C13706o.m87929f(geofenceConstraint, "this$0");
        geofenceConstraint.m16510w3(textView);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m16506s3(GeofenceConstraint geofenceConstraint, View view) {
        C13706o.m87929f(geofenceConstraint, "this$0");
        geofenceConstraint.m16494A3();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static final void m16507t3(GeofenceConstraint geofenceConstraint, RadioButton radioButton, CheckBox checkBox, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(geofenceConstraint, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        if (geofenceConstraint.geofenceId == null || geofenceConstraint.geofenceName == null) {
            C15626c.makeText(geofenceConstraint.mo27827K0(), C17541R$string.select_zone, 1).show();
            return;
        }
        String str = geofenceConstraint.oldGeofenceId;
        if (str != null) {
            C4716i n3 = geofenceConstraint.mo28163n3();
            long f1 = geofenceConstraint.mo27847f1();
            String name = geofenceConstraint.mo27837X0().getName();
            C13706o.m87928e(name, "macro.name");
            Long Y0 = geofenceConstraint.mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            n3.mo29203r(str, f1, name, Y0.longValue());
        }
        C13706o.m87926c(radioButton);
        geofenceConstraint.option = radioButton.isChecked() ^ true ? 1 : 0;
        C13706o.m87926c(checkBox);
        geofenceConstraint.allowUnknown = checkBox.isChecked();
        appCompatDialog.dismiss();
        geofenceConstraint.mo24689O1();
        geofenceConstraint.zoneNameButton = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public static final void m16508u3(GeofenceConstraint geofenceConstraint, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(geofenceConstraint, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        geofenceConstraint.zoneNameButton = null;
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static final void m16509v3(GeofenceConstraint geofenceConstraint, DialogInterface dialogInterface) {
        C13706o.m87929f(geofenceConstraint, "this$0");
        geofenceConstraint.zoneNameButton = null;
    }

    /* renamed from: w3 */
    private final void m16510w3(TextView textView) {
        String[] stringArray = mo27827K0().getResources().getStringArray(C17525R$array.geofence_trigger_update_rate_names);
        C13706o.m87928e(stringArray, "context.resources.getStr…rigger_update_rate_names)");
        int[] intArray = mo27827K0().getResources().getIntArray(C17525R$array.geofence_trigger_update_rates_int);
        C13706o.m87928e(intArray, "context.resources.getInt…trigger_update_rates_int)");
        int length = intArray.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (intArray[i2] == this.updateRateMinutes) {
                i = i3;
                break;
            } else {
                i3++;
                i2++;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) stringArray, i, (DialogInterface.OnClickListener) new C4297o0(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4302p0(this, stringArray, intArray, textView));
        AlertDialog create = builder.create();
        C13706o.m87928e(create, "builder.create()");
        create.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m16511x3(GeofenceConstraint geofenceConstraint, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(geofenceConstraint, "this$0");
        geofenceConstraint.mo24679x2(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static final void m16512y3(GeofenceConstraint geofenceConstraint, String[] strArr, int[] iArr, TextView textView, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(geofenceConstraint, "this$0");
        C13706o.m87929f(strArr, "$options");
        C13706o.m87929f(iArr, "$values");
        C13706o.m87929f(textView, "$updateRateTextView");
        C13706o.m87929f(dialogInterface, "dialog");
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        String str = strArr[checkedItemPosition];
        geofenceConstraint.updateRateText = str;
        geofenceConstraint.updateRateMinutes = iArr[checkedItemPosition];
        textView.setText(str);
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (this.geofenceName != null) {
            return m16503o3()[this.option] + ": " + this.geofenceName;
        }
        return m16503o3()[this.option] + ": <" + SelectableItem.m15535j1(C17541R$string.select_zone) + '>';
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        if (this.geofenceId == null) {
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18869h("The configured Geofence could not be found (" + mo27837X0().getName() + ')', Y0.longValue());
            return this.allowUnknown;
        }
        C4716i n3 = mo28163n3();
        String str = this.geofenceId;
        C13706o.m87926c(str);
        int i = n3.mo29200i(str);
        if (i != 1) {
            if (i != 2) {
                return this.allowUnknown;
            }
            if (this.option == 1) {
                return true;
            }
            return false;
        } else if (this.option == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7648v.f18555g.mo37669a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public void mo28052T2() {
        super.mo28052T2();
        String str = this.geofenceId;
        if (str != null) {
            C4716i n3 = mo28163n3();
            long f1 = mo27847f1();
            String name = mo27837X0().getName();
            C13706o.m87928e(name, "macro.name");
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            n3.mo29203r(str, f1, name, Y0.longValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo28053V2() {
        super.mo28053V2();
        String str = this.geofenceId;
        if (str != null) {
            C4716i n3 = mo28163n3();
            long f1 = mo27847f1();
            int p3 = m16504p3();
            String Z0 = mo24798Z0();
            C13706o.m87928e(Z0, "macroName");
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            n3.mo29199h(str, f1, p3, Z0, Y0.longValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    }

    /* renamed from: n2 */
    public boolean mo25733n2() {
        return true;
    }

    /* renamed from: n3 */
    public final C4716i mo28163n3() {
        C4716i iVar = this.f10720f;
        if (iVar != null) {
            return iVar;
        }
        C13706o.m87945v("geofenceManager");
        return null;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        C13706o.m87929f(activity, "activity");
        mo27877y2(activity);
        if (i == 1 && i2 == -1 && intent != null) {
            this.oldGeofenceId = this.geofenceId;
            this.geofenceId = intent.getStringExtra("selected_geofence_id");
            String k = mo28163n3().mo29201k(this.geofenceId);
            this.geofenceName = k;
            TextView textView = this.zoneNameButton;
            if (textView != null) {
                textView.setText(k);
            }
        }
    }

    /* renamed from: q3 */
    public final String mo28164q3() {
        return this.geofenceName;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        String str;
        if (mo27836X()) {
            AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_geofence_constraint_configure);
            appCompatDialog.setTitle((int) C17541R$string.select_option);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            Window window = appCompatDialog.getWindow();
            C13706o.m87926c(window);
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = -1;
            Window window2 = appCompatDialog.getWindow();
            C13706o.m87926c(window2);
            window2.setAttributes(layoutParams);
            RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.area_inside_option);
            RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.area_outside_option);
            CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.location_unknown_checkbox);
            TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.update_frequency_link);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            TextView textView2 = (TextView) appCompatDialog.findViewById(C17532R$id.update_rate_description);
            ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.update_rate_container);
            this.zoneNameButton = (TextView) appCompatDialog.findViewById(C17532R$id.zone_name_button);
            boolean z = false;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (textView != null) {
                textView.setText(this.updateRateText);
            }
            if (textView != null) {
                textView.setPaintFlags(textView.getPaintFlags() | 8);
            }
            textView.setOnClickListener(new C4317s0(this, textView));
            TextView textView3 = this.zoneNameButton;
            if (textView3 != null) {
                String str2 = this.geofenceName;
                if (str2 == null || str2.length() == 0) {
                    z = true;
                }
                if (!z) {
                    str = this.geofenceName;
                } else {
                    str = '<' + SelectableItem.m15535j1(C17541R$string.select_zone) + '>';
                }
                textView3.setText(str);
            }
            TextView textView4 = this.zoneNameButton;
            if (textView4 != null) {
                C13706o.m87926c(textView4);
                textView4.setPaintFlags(textView4.getPaintFlags() | 8);
            }
            TextView textView5 = this.zoneNameButton;
            if (textView5 != null) {
                textView5.setOnClickListener(new C4307q0(this));
            }
            if (this.option == 0) {
                if (radioButton != null) {
                    radioButton.setChecked(true);
                }
            } else if (radioButton2 != null) {
                radioButton2.setChecked(true);
            }
            if (checkBox != null) {
                checkBox.setChecked(this.allowUnknown);
            }
            if (button != null) {
                button.setOnClickListener(new C4312r0(this, radioButton, checkBox, appCompatDialog));
            }
            if (button2 != null) {
                button2.setOnClickListener(new C4322t0(this, appCompatDialog));
            }
            appCompatDialog.setOnCancelListener(new C4292n0(this));
            appCompatDialog.show();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.option);
        parcel.writeString(this.geofenceId);
        parcel.writeString(this.geofenceName);
        parcel.writeInt(this.allowUnknown ? 1 : 0);
        parcel.writeString(this.updateRateText);
        parcel.writeInt(this.updateRateMinutes);
    }

    /* renamed from: z3 */
    public final void mo28165z3(String str) {
        C13706o.m87929f(str, "zoneName");
        this.geofenceName = str;
    }

    public GeofenceConstraint() {
        this.updateRateText = SelectableItem.m15535j1(C17541R$string.minutes_5);
        this.updateRateMinutes = 5;
        m16495D1();
    }

    private GeofenceConstraint(Parcel parcel) {
        super(parcel);
        this.updateRateText = SelectableItem.m15535j1(C17541R$string.minutes_5);
        this.updateRateMinutes = 5;
        m16495D1();
        this.option = parcel.readInt();
        this.geofenceId = parcel.readString();
        this.geofenceName = parcel.readString();
        this.allowUnknown = parcel.readInt() != 0;
        this.updateRateText = parcel.readString();
        this.updateRateMinutes = parcel.readInt();
    }
}
