package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.geofences.GeofenceInfo;
import com.arlosoft.macrodroid.geofences.GeofenceListActivity;
import com.arlosoft.macrodroid.geofences.GeofenceStore;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.receivers.RequestLocationReceiver;
import com.arlosoft.macrodroid.triggers.services.C6127g;
import com.arlosoft.macrodroid.utils.C6368b1;
import p081e1.C7264a;
import p119k3.C7556t0;
import p125l3.C7665a;
import p148q0.C8151a;

public class LocationTrigger extends Trigger implements C7665a {
    public static final Parcelable.Creator<LocationTrigger> CREATOR = new C5686b();
    private static final int MIN_UPDATE_DISTANCE_M = 3;
    private static final int MIN_UPDATE_RATE_MS = 1000;
    private static final int SELECT_GEOFENCE = 878;
    private static final int TRIGGER_FROM_UNKNOWN_DISABLED = 2;
    private static final int TRIGGER_FROM_UNKNOWN_ENABLED = 1;
    private static final int TRIGGER_FROM_UNKNOWN_NOT_SET = 0;
    private static final LocationListener locationUpdateListenerLocal = new C5685a();
    private static int s_triggerCounter;
    private static C5687c s_updateRateReceiver;
    private transient C7264a m_cache;
    private boolean m_dontTriggerFromUnknownEnter;
    private boolean m_enterArea;
    private String m_geofenceId;
    private transient GeofenceInfo m_geofenceInfo;
    private transient GeofenceStore m_geofenceStore;
    private double m_latitude;
    private transient LocationManager m_locationManager;
    private double m_longitude;
    private int m_newTriggerFromUnknown;
    private int m_radius;
    private boolean m_triggerFromUnknown;

    /* renamed from: com.arlosoft.macrodroid.triggers.LocationTrigger$a */
    class C5685a implements LocationListener {
        C5685a() {
        }

        public void onLocationChanged(Location location) {
            if (C5163j2.m20013M0(MacroDroidApplication.m14845u())) {
                C4878b.m18879r("LocationTrigger: Passive location obtained");
                C6127g.m24242a(location);
            }
        }

        public void onProviderDisabled(String str) {
        }

        public void onProviderEnabled(String str) {
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.LocationTrigger$b */
    class C5686b implements Parcelable.Creator<LocationTrigger> {
        C5686b() {
        }

        /* renamed from: a */
        public LocationTrigger createFromParcel(Parcel parcel) {
            return new LocationTrigger(parcel, (C5685a) null);
        }

        /* renamed from: b */
        public LocationTrigger[] newArray(int i) {
            return new LocationTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.LocationTrigger$c */
    private class C5687c extends BroadcastReceiver {
        private C5687c() {
        }

        public void onReceive(Context context, Intent intent) {
            LocationTrigger.m22612s3(context, true);
        }

        /* synthetic */ C5687c(LocationTrigger locationTrigger, C5685a aVar) {
            this();
        }
    }

    /* synthetic */ LocationTrigger(Parcel parcel, C5685a aVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private void m22602D1() {
        this.m_newTriggerFromUnknown = 0;
        this.m_cache = MacroDroidApplication.m14845u().mo27293q("GeofenceInfo");
        this.m_enterArea = true;
        this.m_locationManager = (LocationManager) mo27827K0().getSystemService("location");
        mo31292v3();
        this.m_geofenceInfo = this.m_geofenceStore.getGeofenceMap().get(this.m_geofenceId);
    }

    /* renamed from: j3 */
    private void m22606j3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.trigger_location);
        builder.setMessage((int) C17541R$string.location_trigger_legacy_warning);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6138t4(this));
        builder.show();
        C5163j2.m20011L5(mo27827K0(), true);
    }

    /* renamed from: k3 */
    public static void m22607k3() {
        MacroDroidApplication.m14845u().sendBroadcast(new Intent("LocUpdateRateIntent"));
    }

    /* renamed from: m3 */
    private String[] m22608m3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.trigger_location_area_entered), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_location_area_exited)};
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m22609p3(DialogInterface dialogInterface, int i) {
        mo31291t3();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m22610q3(RadioButton radioButton, CheckBox checkBox, AppCompatDialog appCompatDialog, View view) {
        this.m_enterArea = radioButton.isChecked();
        this.m_newTriggerFromUnknown = checkBox.isChecked() ? 1 : 2;
        appCompatDialog.dismiss();
        m22613u3();
    }

    /* renamed from: s3 */
    public static void m22612s3(Context context, boolean z) {
        int I0 = (z ? 1 : C5163j2.m19985I0(context)) * 1000;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, RequestLocationReceiver.class), 134217728 | C6368b1.f14959b);
        if (Build.VERSION.SDK_INT >= 23) {
            alarmManager.setExactAndAllowWhileIdle(0, System.currentTimeMillis() + ((long) I0), broadcast);
        } else {
            alarmManager.setExact(0, System.currentTimeMillis() + ((long) I0), broadcast);
        }
    }

    /* renamed from: u3 */
    private void m22613u3() {
        Activity j0 = mo27850j0();
        Intent intent = new Intent(j0, GeofenceListActivity.class);
        intent.putExtra("ThemeType", 1);
        intent.putExtra("picker_mode", true);
        j0.startActivityForResult(intent, SELECT_GEOFENCE);
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_enterArea ? m22608m3()[0] : m22608m3()[1];
    }

    /* renamed from: H */
    public void mo31172H() {
        this.m_geofenceId = null;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.m_latitude != 0.0d || this.m_longitude != 0.0d) {
            return null;
        }
        GeofenceInfo geofenceInfo = this.m_geofenceStore.getGeofenceMap().get(this.m_geofenceId);
        if (geofenceInfo != null) {
            return geofenceInfo.getName();
        }
        return "<" + SelectableItem.m15535j1(C17541R$string.select_zone) + ">";
    }

    /* renamed from: O1 */
    public void mo24689O1() {
        super.mo24689O1();
        C5163j2.m20283v4(MacroDroidApplication.m14845u(), this, C6127g.C6128a.UNKNOWN);
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                this.m_locationManager.removeUpdates(locationUpdateListenerLocal);
            } catch (Throwable unused) {
                C4878b.m18868g("Failed to remove passive location listener");
            }
            if (s_updateRateReceiver != null) {
                try {
                    mo27827K0().unregisterReceiver(s_updateRateReceiver);
                } catch (Exception e) {
                    C8151a.m33873n(e);
                }
                s_updateRateReceiver = null;
            }
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7556t0.m31451u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        mo31292v3();
        this.m_geofenceInfo = this.m_geofenceStore.getGeofenceMap().get(this.m_geofenceId);
        if (s_triggerCounter == 0) {
            m22612s3(mo27827K0(), true);
            IntentFilter intentFilter = new IntentFilter("LocUpdateRateIntent");
            s_updateRateReceiver = new C5687c(this, (C5685a) null);
            mo27827K0().registerReceiver(s_updateRateReceiver, intentFilter);
            try {
                if (this.m_locationManager.isProviderEnabled("passive")) {
                    this.m_locationManager.requestLocationUpdates("passive", 1000, 3.0f, locationUpdateListenerLocal);
                }
            } catch (Throwable th) {
                if (!(th instanceof SecurityException)) {
                    C8151a.m33873n(th);
                }
            }
        }
        s_triggerCounter++;
    }

    /* renamed from: Y2 */
    public TriggerContextInfo mo30911Y2() {
        return new TriggerContextInfo((Trigger) this, "Testing: lat?,lon?");
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    }

    /* renamed from: l3 */
    public Location mo31288l3() {
        Location location = new Location("");
        if (this.m_longitude == 0.0d && this.m_latitude == 0.0d) {
            GeofenceInfo geofenceInfo = this.m_geofenceInfo;
            if (geofenceInfo != null) {
                location.setLatitude(geofenceInfo.getLatitude());
                location.setLongitude(this.m_geofenceInfo.getLongitude());
                location.setAccuracy((float) this.m_geofenceInfo.getRadius());
            } else {
                C4878b.m18868g("Geofence not found for macro: " + mo27837X0().getName());
                location.setAccuracy(0.0f);
            }
        } else {
            location.setLatitude(this.m_latitude);
            location.setLongitude(this.m_longitude);
            location.setAccuracy((float) this.m_radius);
        }
        return location;
    }

    /* renamed from: n2 */
    public boolean mo25733n2() {
        return true;
    }

    /* renamed from: n3 */
    public boolean mo31289n3() {
        int i = this.m_newTriggerFromUnknown;
        if (i != 0) {
            return i == 1;
        }
        if (!this.m_enterArea) {
            return this.m_triggerFromUnknown;
        }
        if (!this.m_dontTriggerFromUnknownEnter) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public String mo31173o() {
        return this.m_geofenceId;
    }

    /* renamed from: o3 */
    public boolean mo31290o3() {
        return this.m_enterArea;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == SELECT_GEOFENCE && i2 == -1) {
            this.m_latitude = 0.0d;
            this.m_longitude = 0.0d;
            this.m_radius = 0;
            mo31292v3();
            this.m_geofenceId = intent.getStringExtra("selected_geofence_id");
            this.m_geofenceInfo = this.m_geofenceStore.getGeofenceMap().get(this.m_geofenceId);
            mo24689O1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t3 */
    public void mo31291t3() {
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
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            if (this.m_enterArea) {
                radioButton.setChecked(true);
            } else {
                radioButton2.setChecked(true);
            }
            checkBox.setChecked(mo31289n3());
            button.setOnClickListener(new C6162v4(this, radioButton, checkBox, appCompatDialog));
            button2.setOnClickListener(new C6150u4(appCompatDialog));
            appCompatDialog.show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m22606j3();
    }

    /* renamed from: v3 */
    public void mo31292v3() {
        GeofenceStore geofenceStore = (GeofenceStore) this.m_cache.mo37133c("GeofenceInfo", GeofenceStore.class);
        this.m_geofenceStore = geofenceStore;
        if (geofenceStore == null) {
            this.m_geofenceStore = new GeofenceStore();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeDouble(this.m_latitude);
        parcel.writeDouble(this.m_longitude);
        parcel.writeInt(this.m_radius);
        parcel.writeInt(this.m_enterArea ? 1 : 0);
        parcel.writeInt(this.m_triggerFromUnknown ? 1 : 0);
        parcel.writeInt(this.m_dontTriggerFromUnknownEnter ? 1 : 0);
        parcel.writeInt(this.m_newTriggerFromUnknown);
        parcel.writeString(this.m_geofenceId);
    }

    public LocationTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public LocationTrigger() {
        m22602D1();
    }

    private LocationTrigger(Parcel parcel) {
        super(parcel);
        m22602D1();
        this.m_latitude = parcel.readDouble();
        this.m_longitude = parcel.readDouble();
        this.m_radius = parcel.readInt();
        boolean z = true;
        this.m_enterArea = parcel.readInt() != 0;
        this.m_triggerFromUnknown = parcel.readInt() != 0;
        this.m_dontTriggerFromUnknownEnter = parcel.readInt() == 0 ? false : z;
        this.m_newTriggerFromUnknown = parcel.readInt();
        this.m_geofenceId = parcel.readString();
    }
}
