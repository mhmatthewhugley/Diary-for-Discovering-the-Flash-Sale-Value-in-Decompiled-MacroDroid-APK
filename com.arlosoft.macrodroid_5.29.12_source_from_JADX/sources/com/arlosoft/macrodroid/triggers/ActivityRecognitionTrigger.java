package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.services.DetectedActivitiesService;
import com.arlosoft.macrodroid.utils.C6368b1;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognition;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import p112j2.C7439d0;
import p119k3.C7472a;
import p148q0.C8151a;

public class ActivityRecognitionTrigger extends Trigger implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, ResultCallback<Status> {
    public static final Parcelable.Creator<ActivityRecognitionTrigger> CREATOR = new C5590b();
    /* access modifiers changed from: private */
    public static GoogleApiClient s_GoogleApiClient;
    private static final int[] s_activityTypes = {0, 1, 8, 7, 3};
    private static int s_triggerCounter;
    private static C5591c s_updateRateReceiver;
    private boolean lessThan;
    private int m_confidenceLevel;
    private int m_selectedIndex;
    /* access modifiers changed from: private */
    public transient int m_transientConfidenceLevel;

    /* renamed from: com.arlosoft.macrodroid.triggers.ActivityRecognitionTrigger$a */
    class C5589a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f13566a;

        C5589a(TextView textView) {
            this.f13566a = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int unused = ActivityRecognitionTrigger.this.m_transientConfidenceLevel = i + 10;
            TextView textView = this.f13566a;
            textView.setText(ActivityRecognitionTrigger.this.m_transientConfidenceLevel + TaskerPlugin.VARIABLE_PREFIX);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ActivityRecognitionTrigger$b */
    class C5590b implements Parcelable.Creator<ActivityRecognitionTrigger> {
        C5590b() {
        }

        /* renamed from: a */
        public ActivityRecognitionTrigger createFromParcel(Parcel parcel) {
            return new ActivityRecognitionTrigger(parcel, (C5589a) null);
        }

        /* renamed from: b */
        public ActivityRecognitionTrigger[] newArray(int i) {
            return new ActivityRecognitionTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ActivityRecognitionTrigger$c */
    private class C5591c extends BroadcastReceiver {
        private C5591c() {
        }

        public void onReceive(Context context, Intent intent) {
            ActivityRecognitionTrigger.s_GoogleApiClient.mo21250f();
            ActivityRecognitionTrigger.this.m21410m3();
        }

        /* synthetic */ C5591c(ActivityRecognitionTrigger activityRecognitionTrigger, C5589a aVar) {
            this();
        }
    }

    /* synthetic */ ActivityRecognitionTrigger(Parcel parcel, C5589a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public synchronized void m21410m3() {
        GoogleApiClient d = new GoogleApiClient.Builder(mo27827K0()).mo21265b(this).mo21266c(this).mo21264a(ActivityRecognition.f45781a).mo21267d();
        s_GoogleApiClient = d;
        d.mo21249e();
    }

    /* renamed from: n3 */
    private void m21411n3() {
        if (mo27836X()) {
            AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_activity_recognition_confidence);
            appCompatDialog.setTitle((CharSequence) m21413s3()[this.m_selectedIndex]);
            SeekBar seekBar = (SeekBar) appCompatDialog.findViewById(C17532R$id.dialog_activity_recognition_confidence_seek_bar);
            TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.dialog_activity_recognition_confidence_percent_label);
            RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.less_than_radio_button);
            ((RadioButton) appCompatDialog.findViewById(C17532R$id.greater_than_radio_button)).setChecked(!this.lessThan);
            radioButton.setChecked(this.lessThan);
            this.m_transientConfidenceLevel = Math.max(10, this.m_confidenceLevel);
            seekBar.setMax(90);
            seekBar.setProgress(this.m_transientConfidenceLevel - 10);
            textView.setText(this.m_transientConfidenceLevel + TaskerPlugin.VARIABLE_PREFIX);
            seekBar.setOnSeekBarChangeListener(new C5589a(textView));
            ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C5868b(this, appCompatDialog, radioButton));
            ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C5805a(appCompatDialog));
            appCompatDialog.show();
        }
    }

    /* renamed from: o3 */
    private PendingIntent m21412o3() {
        return PendingIntent.getService(mo27827K0(), 0, new Intent(mo27827K0(), DetectedActivitiesService.class), C6368b1.f14960c | 134217728);
    }

    /* renamed from: s3 */
    private String[] m21413s3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.trigger_activity_recognition_option_in_vehicle), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_activity_recognition_option_on_bicycle), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_activity_recognition_option_running), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_activity_recognition_option_walking), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_activity_recognition_option_still)};
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m21414t3(AppCompatDialog appCompatDialog, RadioButton radioButton, View view) {
        appCompatDialog.cancel();
        this.m_confidenceLevel = this.m_transientConfidenceLevel;
        this.lessThan = radioButton.isChecked();
        mo24689O1();
    }

    /* renamed from: A1 */
    public void mo21388A1(@NonNull ConnectionResult connectionResult) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_selectedIndex;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(C17541R$string.trigger_activity_activity) + " - " + m21413s3()[this.m_selectedIndex];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        sb.append(SelectableItem.m15535j1(C17541R$string.trigger_activity_recognition_confidence));
        sb.append(this.lessThan ? " < " : " >= ");
        sb.append(this.m_confidenceLevel);
        sb.append(TaskerPlugin.VARIABLE_PREFIX);
        return sb.toString();
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                GoogleApiClient googleApiClient = s_GoogleApiClient;
                if (googleApiClient != null && googleApiClient.mo21255l()) {
                    ActivityRecognition.f45782b.mo50638a(s_GoogleApiClient, m21412o3());
                }
                GoogleApiClient googleApiClient2 = s_GoogleApiClient;
                if (googleApiClient2 != null && (googleApiClient2.mo21255l() || s_GoogleApiClient.mo21256m())) {
                    s_GoogleApiClient.mo21250f();
                }
            } catch (Exception unused) {
            }
            if (s_updateRateReceiver != null) {
                try {
                    mo27827K0().unregisterReceiver(s_updateRateReceiver);
                } catch (Exception e) {
                    C8151a.m33873n(e);
                }
            }
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7472a.m31055u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo24738G0());
        sb.append(this.lessThan ? " < " : " >= ");
        sb.append(this.m_confidenceLevel);
        sb.append(TaskerPlugin.VARIABLE_PREFIX);
        return sb.toString();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        DetectedActivitiesService.m24105a(this);
        if (s_triggerCounter == 0) {
            m21410m3();
            IntentFilter intentFilter = new IntentFilter("ActivityRecognitionUpdateRateIntent");
            s_updateRateReceiver = new C5591c(this, (C5589a) null);
            mo27827K0().registerReceiver(s_updateRateReceiver, intentFilter);
        }
        s_triggerCounter++;
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        if (Build.VERSION.SDK_INT >= 29) {
            return new String[]{"android.permission.ACTIVITY_RECOGNITION"};
        }
        return super.mo24727c1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m21413s3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return SelectableItem.m15535j1(C17541R$string.trigger_activity_recognition);
    }

    /* renamed from: p3 */
    public int mo30887p3() {
        return s_activityTypes[this.m_selectedIndex];
    }

    /* renamed from: q3 */
    public int mo30888q3() {
        return this.m_confidenceLevel;
    }

    /* renamed from: r3 */
    public boolean mo30889r3() {
        return this.lessThan;
    }

    /* renamed from: t1 */
    public void mo21335t1(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        m21411n3();
    }

    /* renamed from: v3 */
    public void mo21280A(@NonNull Status status) {
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_selectedIndex);
        parcel.writeInt(this.m_confidenceLevel);
        parcel.writeInt(this.lessThan ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_selectedIndex = i;
    }

    /* renamed from: y */
    public void mo21336y(Bundle bundle) {
        try {
            ActivityRecognition.f45782b.mo50639b(s_GoogleApiClient, (long) (C5163j2.m20166h(mo27827K0()) * 1000), m21412o3()).mo21273g(this);
        } catch (SecurityException unused) {
            C7439d0.m30909o0(mo27827K0(), "android.permission.ACTIVITY_RECOGNITION", mo25559a1(), true, false);
        }
    }

    public ActivityRecognitionTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ActivityRecognitionTrigger() {
        this.m_selectedIndex = 0;
        this.m_confidenceLevel = 50;
    }

    private ActivityRecognitionTrigger(Parcel parcel) {
        super(parcel);
        this.m_selectedIndex = parcel.readInt();
        this.m_confidenceLevel = parcel.readInt();
        this.lessThan = parcel.readInt() != 0;
    }
}
