package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.work.WorkRequest;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.email.EmailActivity;
import com.arlosoft.macrodroid.action.services.UploadLocationService;
import com.arlosoft.macrodroid.action.sms.SMSOutputService2;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4037m;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.SmtpServerConfig;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.IncomingCallTrigger;
import com.arlosoft.macrodroid.triggers.IncomingSMSTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6368b1;
import com.arlosoft.macrodroid.utils.C6383g0;
import com.arlosoft.macrodroid.variables.VariableValue;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationServices;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.p353io.FilenameUtils;
import org.apache.commons.p353io.IOUtils;
import p036l.C1994b;
import p036l.C1998c;
import p036l.C1999d;
import p057a2.C2219h;
import p057a2.C2224m;
import p092g1.C7326a;
import p092g1.C7327b;
import p112j2.C7439d0;
import p128m0.C7751g4;
import p134n0.C7960a;
import p148q0.C8151a;
import p149q1.C8157f;
import p215b8.C11102b;
import p319lc.C15626c;
import p440y9.C16971a;

public class ShareLocationAction extends Action implements C7960a.C7961a, C2219h, GoogleApiClient.OnConnectionFailedListener, LocationListener, C2224m {
    private static final int CALENDAR_OUTPUT = 4;
    public static final Parcelable.Creator<ShareLocationAction> CREATOR = new C2681g();
    private static final float DESIRED_ACCURACY_METERS = 30.0f;
    private static final int EMAIL_ACTIVITY_REQUEST = 18434;
    private static final int EMAIL_OUTPUT = 3;
    private static final int FACEBOOK_OUTPUT = 1;
    private static final int MAX_LOCATION_OBTAIN_PERIOD_MS = 45000;
    private static final int MAX_TIME_DIFF_MS = 120000;
    private static final String TIMEOUT_INTENT = "Timeout";
    private static final int TWITTER_OUTPUT = 2;
    private static final int VARIABLE_OUTPUT = 5;
    /* access modifiers changed from: private */
    public static GoogleApiClient s_googleApiClient;
    private String emailBody;
    private String emailFrom;
    private String emailSubject;
    private final transient android.location.LocationListener locationListenerGPS;
    private final transient android.location.LocationListener locationListenerNetwork;
    /* access modifiers changed from: private */
    public String m_calendarId;
    private String m_email;
    private final transient C6383g0 m_gmailHelper;
    private transient LocationManager m_locationManager;
    /* access modifiers changed from: private */
    public transient Location m_networkLocation;
    private boolean m_oldVariableFormat;
    private int m_outputChannel;
    private int m_simId;
    private Contact m_smsContact;
    private String m_smsNumber;
    private transient PendingIntent m_timeoutPendingIntent;
    private transient TimeOutReceiver m_timeoutReceiver;
    private transient TriggerContextInfo m_triggerContextInfo;
    /* access modifiers changed from: private */
    public transient boolean m_usingGPS;
    private MacroDroidVariable m_variable;
    private transient PowerManager.WakeLock m_wakelock;
    private boolean useSmtpEmail;

    protected class TimeOutReceiver extends BroadcastReceiver {
        protected TimeOutReceiver() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r5, android.content.Intent r6) {
            /*
                r4 = this;
                com.google.android.gms.common.api.GoogleApiClient r5 = com.arlosoft.macrodroid.action.ShareLocationAction.s_googleApiClient
                if (r5 == 0) goto L_0x0011
                com.google.android.gms.location.FusedLocationProviderApi r5 = com.google.android.gms.location.LocationServices.f45844b     // Catch:{ Exception -> 0x0011 }
                com.google.android.gms.common.api.GoogleApiClient r6 = com.arlosoft.macrodroid.action.ShareLocationAction.s_googleApiClient     // Catch:{ Exception -> 0x0011 }
                com.arlosoft.macrodroid.action.ShareLocationAction r0 = com.arlosoft.macrodroid.action.ShareLocationAction.this     // Catch:{ Exception -> 0x0011 }
                r5.mo50650a(r6, r0)     // Catch:{ Exception -> 0x0011 }
            L_0x0011:
                r5 = 1
                r6 = 0
                com.arlosoft.macrodroid.action.ShareLocationAction r0 = com.arlosoft.macrodroid.action.ShareLocationAction.this     // Catch:{ Exception -> 0x0027 }
                android.content.Context r0 = r0.mo27827K0()     // Catch:{ Exception -> 0x0027 }
                android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x0027 }
                java.lang.String r1 = "location_mode"
                int r0 = android.provider.Settings.Secure.getInt(r0, r1)     // Catch:{ Exception -> 0x0027 }
                if (r0 != r5) goto L_0x0027
                r0 = 1
                goto L_0x0028
            L_0x0027:
                r0 = 0
            L_0x0028:
                if (r0 != 0) goto L_0x004b
                com.arlosoft.macrodroid.action.ShareLocationAction r1 = com.arlosoft.macrodroid.action.ShareLocationAction.this
                android.location.Location r1 = r1.m_networkLocation
                if (r1 == 0) goto L_0x004b
                com.arlosoft.macrodroid.action.ShareLocationAction r5 = com.arlosoft.macrodroid.action.ShareLocationAction.this
                android.location.Location r6 = r5.m_networkLocation
                r5.m12921V4(r6)
                com.arlosoft.macrodroid.action.ShareLocationAction r5 = com.arlosoft.macrodroid.action.ShareLocationAction.this
                java.lang.Long r5 = r5.mo27840Y0()
                long r5 = r5.longValue()
                java.lang.String r0 = "Share Location TIMEOUT (Using network location)"
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18883v(r0, r5)
                goto L_0x00a1
            L_0x004b:
                com.arlosoft.macrodroid.action.ShareLocationAction r1 = com.arlosoft.macrodroid.action.ShareLocationAction.this
                android.content.Context r1 = r1.mo27827K0()
                android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)
                java.lang.String r2 = "preferences:share_location_notify_failure"
                boolean r5 = r1.getBoolean(r2, r5)
                if (r5 == 0) goto L_0x0080
                com.arlosoft.macrodroid.action.ShareLocationAction r5 = com.arlosoft.macrodroid.action.ShareLocationAction.this
                android.content.Context r5 = r5.mo27827K0()
                com.arlosoft.macrodroid.action.ShareLocationAction r1 = com.arlosoft.macrodroid.action.ShareLocationAction.this
                android.content.Context r1 = r1.mo27827K0()
                r2 = 2131952261(0x7f130285, float:1.954096E38)
                java.lang.String r1 = r1.getString(r2)
                com.arlosoft.macrodroid.action.ShareLocationAction r2 = com.arlosoft.macrodroid.action.ShareLocationAction.this
                android.content.Context r2 = r2.mo27827K0()
                r3 = 2131952260(0x7f130284, float:1.9540958E38)
                java.lang.String r2 = r2.getString(r3)
                com.arlosoft.macrodroid.common.C4061t1.m16023v(r5, r1, r2, r6)
            L_0x0080:
                if (r0 == 0) goto L_0x0092
                com.arlosoft.macrodroid.action.ShareLocationAction r5 = com.arlosoft.macrodroid.action.ShareLocationAction.this
                java.lang.Long r5 = r5.mo27840Y0()
                long r5 = r5.longValue()
                java.lang.String r0 = "Share Location TIMEOUT (No fix available - Sensors only mode set cannot use network info)"
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18883v(r0, r5)
                goto L_0x00a1
            L_0x0092:
                com.arlosoft.macrodroid.action.ShareLocationAction r5 = com.arlosoft.macrodroid.action.ShareLocationAction.this
                java.lang.Long r5 = r5.mo27840Y0()
                long r5 = r5.longValue()
                java.lang.String r0 = "Share Location TIMEOUT (No fix available)"
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18883v(r0, r5)
            L_0x00a1:
                com.arlosoft.macrodroid.action.ShareLocationAction r5 = com.arlosoft.macrodroid.action.ShareLocationAction.this
                r5.m12929Z4()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.ShareLocationAction.TimeOutReceiver.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ShareLocationAction$a */
    class C2675a implements android.location.LocationListener {
        C2675a() {
        }

        public void onLocationChanged(Location location) {
            C4878b.m18874m("Found GPS location - sharing now", ShareLocationAction.this.mo27840Y0().longValue());
            ShareLocationAction.this.m12921V4(location);
            ShareLocationAction.this.m12929Z4();
        }

        public void onProviderDisabled(String str) {
        }

        public void onProviderEnabled(String str) {
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ShareLocationAction$b */
    class C2676b implements android.location.LocationListener {
        C2676b() {
        }

        public void onLocationChanged(Location location) {
            if (location != null) {
                long abs = Math.abs(System.currentTimeMillis() - location.getTime());
                if (abs > 120000) {
                    C4878b.m18869h("Rejecting network fix as it is too old: " + (abs / 1000) + "s", ShareLocationAction.this.mo27840Y0().longValue());
                } else if (!ShareLocationAction.this.m_usingGPS) {
                    C4878b.m18874m("Found network location - sharing now", ShareLocationAction.this.mo27840Y0().longValue());
                    ShareLocationAction.this.m12921V4(location);
                    ShareLocationAction.this.m12929Z4();
                } else if (!location.hasAccuracy() || location.getAccuracy() >= ShareLocationAction.DESIRED_ACCURACY_METERS) {
                    C4878b.m18874m("Found network based location - storing", ShareLocationAction.this.mo27840Y0().longValue());
                    Location unused = ShareLocationAction.this.m_networkLocation = location;
                } else {
                    C4878b.m18874m("Found accurate network based location - sharing now", ShareLocationAction.this.mo27840Y0().longValue());
                    ShareLocationAction.this.m12921V4(location);
                    ShareLocationAction.this.m12929Z4();
                }
            }
        }

        public void onProviderDisabled(String str) {
        }

        public void onProviderEnabled(String str) {
        }

        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ShareLocationAction$c */
    class C2677c implements C1998c {

        /* renamed from: a */
        final /* synthetic */ String f7558a;

        C2677c(String str) {
            this.f7558a = str;
        }

        /* renamed from: a */
        public long mo24040a() {
            return 15000;
        }

        /* renamed from: b */
        public void mo24041b(String str) {
            C4878b.m18869h("Failed to send location to: " + this.f7558a + ": " + str.replace(IOUtils.LINE_SEPARATOR_UNIX, ". "), ShareLocationAction.this.mo27840Y0().longValue());
            if (C5163j2.m20047R(ShareLocationAction.this.mo27827K0())) {
                C4061t1.m16023v(ShareLocationAction.this.mo27827K0(), SelectableItem.m15535j1(C17541R$string.action_share_location), String.format(SelectableItem.m15535j1(C17541R$string.email_failed_to_x), new Object[]{this.f7558a}), false);
            }
        }

        public void onSuccess() {
            C4878b.m18873l("Location sent to: " + this.f7558a);
            if (C5163j2.m20054S(ShareLocationAction.this.mo27827K0())) {
                C4061t1.m16023v(ShareLocationAction.this.mo27827K0(), SelectableItem.m15535j1(C17541R$string.action_share_location), String.format(SelectableItem.m15535j1(C17541R$string.email_sent_to_x), new Object[]{this.f7558a}), false);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ShareLocationAction$d */
    class C2678d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7560a;

        C2678d(Button button) {
            this.f7560a = button;
        }

        public void afterTextChanged(Editable editable) {
            this.f7560a.setEnabled(editable.toString().contains("[") || C4061t1.m15998i0(editable.toString()));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ShareLocationAction$e */
    class C2679e implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ List f7562a;

        C2679e(List list) {
            this.f7562a = list;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String unused = ShareLocationAction.this.m_calendarId = ((C7327b) this.f7562a.get(i)).f17928a;
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ShareLocationAction$f */
    class C2680f implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7564a;

        /* renamed from: c */
        final /* synthetic */ EditText f7565c;

        C2680f(Button button, EditText editText) {
            this.f7564a = button;
            this.f7565c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7564a.setEnabled(this.f7565c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ShareLocationAction$g */
    class C2681g implements Parcelable.Creator<ShareLocationAction> {
        C2681g() {
        }

        /* renamed from: a */
        public ShareLocationAction createFromParcel(Parcel parcel) {
            return new ShareLocationAction(parcel, (C2675a) null);
        }

        /* renamed from: b */
        public ShareLocationAction[] newArray(int i) {
            return new ShareLocationAction[i];
        }
    }

    /* synthetic */ ShareLocationAction(Parcel parcel, C2675a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A4 */
    public /* synthetic */ void m12879A4(EditText editText, AppCompatDialog appCompatDialog, View view) {
        this.m_smsNumber = editText.getText().toString();
        appCompatDialog.dismiss();
        m12933d4();
    }

    /* access modifiers changed from: private */
    /* renamed from: C4 */
    public static /* synthetic */ void m12883C4(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: D4 */
    public /* synthetic */ void m12885D4(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: E4 */
    public /* synthetic */ void m12887E4(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            m12931b4();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F4 */
    public /* synthetic */ void m12889F4(List list, DialogInterface dialogInterface, int i) {
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        if (checkedItemPosition > 0) {
            this.m_variable = (MacroDroidVariable) list.get(checkedItemPosition - 1);
            mo24689O1();
            return;
        }
        m12901L4();
    }

    /* access modifiers changed from: private */
    /* renamed from: G4 */
    public /* synthetic */ void m12891G4(DialogInterface dialogInterface, int i) {
        this.m_oldVariableFormat = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition() == 0;
        m12913R4();
    }

    /* access modifiers changed from: private */
    /* renamed from: I4 */
    public /* synthetic */ void m12895I4(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: J4 */
    public /* synthetic */ void m12897J4(DialogInterface dialogInterface, int i) {
        if (((AlertDialog) dialogInterface).getListView().getCheckedItemPosition() == 0) {
            this.useSmtpEmail = false;
            m12928Z3();
            return;
        }
        this.useSmtpEmail = true;
        m12930a4();
    }

    /* access modifiers changed from: private */
    /* renamed from: K4 */
    public /* synthetic */ void m12899K4(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* renamed from: L4 */
    private void m12901L4() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.enter_new_variable_name_dialog);
        appCompatDialog.setTitle((int) C17541R$string.action_share_location_new_variable);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.enter_new_variable_name_dialog_variable_name);
        button.setEnabled(false);
        editText.addTextChangedListener(new C2680f(button, editText));
        button.setOnClickListener(new C2923ak(this, editText, (RadioButton) appCompatDialog.findViewById(C17532R$id.radio_button_local), appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3603xj(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: M4 */
    private void m12903M4() {
        if (Build.VERSION.SDK_INT < 23 || mo27827K0().checkSelfPermission("android.permission.READ_CALENDAR") == 0) {
            Pair<String, List<C7327b>> d = C7327b.m30262d(mo27827K0());
            String str = (String) d.first;
            List list = (List) d.second;
            if (list.size() == 0) {
                C15626c.m94876a(mo27827K0().getApplicationContext(), mo27827K0().getString(C17541R$string.action_add_calendar_event_no_calendars), 1).show();
                return;
            }
            if (this.m_calendarId == null) {
                this.m_calendarId = str;
            }
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    i = 0;
                    break;
                } else if (((C7327b) list.get(i)).f17928a.equals(this.m_calendarId)) {
                    break;
                } else {
                    i++;
                }
            }
            Activity j0 = mo27850j0();
            AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
            builder.setTitle((CharSequence) mo27827K0().getString(C17541R$string.action_share_location_send_select_calendar));
            Spinner spinner = new Spinner(j0);
            int dimensionPixelSize = mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.input_text_dialog_top_margin);
            int dimensionPixelSize2 = mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.margin_medium);
            if (list.size() >= 1) {
                spinner.setVisibility(0);
                C7326a aVar = new C7326a(j0, list);
                aVar.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
                spinner.setAdapter(aVar);
                spinner.setSelection(i);
            }
            spinner.setOnItemSelectedListener(new C2679e(list));
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3261mk(this));
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C3454sj.f9198a);
            AlertDialog create = builder.create();
            create.setView(spinner, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, 0);
            create.show();
            return;
        }
        ActivityCompat.requestPermissions(mo27850j0(), new String[]{"android.permission.READ_CALENDAR"}, 34);
    }

    /* renamed from: N4 */
    private void m12905N4() {
        Activity j0 = mo27850j0();
        AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
        builder.setTitle((CharSequence) mo27827K0().getString(C17541R$string.action_share_location_send_via_email));
        int dimensionPixelOffset = mo27827K0().getResources().getDimensionPixelOffset(C17529R$dimen.margin_medium);
        LinearLayout linearLayout = new LinearLayout(j0);
        linearLayout.setOrientation(0);
        Button button = new Button(j0);
        button.setText("...");
        button.setPadding(0, 0, 0, 0);
        button.setTextColor(ContextCompat.getColor(j0, C17528R$color.default_text_color_inverse));
        ViewCompat.setBackgroundTintList(button, ColorStateList.valueOf(ContextCompat.getColor(j0, C17528R$color.actions_accent)));
        EditText editText = new EditText(new ContextThemeWrapper((Context) j0, mo24705l0()));
        editText.setMinimumWidth(mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.alert_dialog_input_min_width));
        editText.setInputType(32);
        editText.setHint(mo27827K0().getString(C17541R$string.action_share_location_enter_email));
        int dimensionPixelSize = mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.input_text_dialog_top_margin);
        String str = this.m_email;
        if (str != null) {
            editText.setText(str);
            editText.setSelection(editText.length());
        }
        editText.setSingleLine();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        editText.setLayoutParams(layoutParams);
        linearLayout.addView(editText);
        linearLayout.addView(button);
        button.getLayoutParams().width = j0.getResources().getDimensionPixelSize(C17529R$dimen.special_text_button_width);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3316oj(this, editText));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C3521uj.f9370a);
        AlertDialog create = builder.create();
        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
        layoutParams2.copyFrom(create.getWindow().getAttributes());
        layoutParams2.width = -1;
        create.getWindow().setAttributes(layoutParams2);
        create.setView(linearLayout, dimensionPixelOffset, dimensionPixelSize, dimensionPixelOffset, 0);
        create.show();
        Button button2 = create.getButton(-1);
        button2.setEnabled(C4061t1.m15998i0(editText.getText().toString()));
        editText.addTextChangedListener(new C2678d(button2));
        button.setOnClickListener(new C3657zj(this, j0, new C3065fk(editText)));
    }

    /* renamed from: O4 */
    private void m12907O4() {
        Activity j0 = mo27850j0();
        List<Contact> D = C4061t1.m15950D(j0);
        boolean z = true;
        boolean z2 = true;
        for (Trigger next : mo27856n1()) {
            if (!(next instanceof IncomingSMSTrigger)) {
                z = false;
            }
            if (!(next instanceof IncomingCallTrigger)) {
                z2 = false;
            }
        }
        if (z) {
            D.add(0, new Contact("Incoming_Contact", mo27827K0().getString(C17541R$string.select_incoming_sms_num), "Incoming_Contact"));
        } else if (z2) {
            D.add(0, new Contact("Incoming_Contact", mo27827K0().getString(C17541R$string.select_incoming_call_num), "Incoming_Contact"));
        }
        Contact[] contactArr = new Contact[D.size()];
        D.toArray(contactArr);
        int size = D.size();
        String[] strArr = new String[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = contactArr[i2].mo27713g();
            Contact contact = this.m_smsContact;
            if (contact != null && contact.mo27713g().equals(strArr[i2])) {
                i = i2;
            }
        }
        if (this.m_smsContact == null && D.size() > 0) {
            this.m_smsContact = D.get(0);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
        builder.setTitle((CharSequence) mo27827K0().getString(C17541R$string.select_contact));
        builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) new C3374qj(this, D));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3288nj(this));
        AlertDialog create = builder.create();
        create.show();
        create.getListView().setFastScrollEnabled(true);
    }

    /* renamed from: P4 */
    private void m12909P4() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_sms_number);
        appCompatDialog.setTitle((int) C17541R$string.select_number);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.sms_number);
        editText.setText(this.m_smsNumber);
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C2951bk(this, editText, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3548vj(appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.magic_text_button)).setOnClickListener(new C3630yj(this, j0, new C3036ek(editText)));
        appCompatDialog.show();
    }

    /* renamed from: Q4 */
    private void m12911Q4() {
        new C11102b((FragmentActivity) mo27850j0()).mo62231o("android.permission.SEND_SMS").mo79679I(C16971a.m100210a()).mo79685P(new C2979ck(this));
    }

    /* renamed from: R4 */
    private void m12913R4() {
        ArrayList<MacroDroidVariable> r0 = mo27863r0();
        String[] strArr = new String[(r0.size() + 1)];
        int i = 0;
        strArr[0] = SelectableItem.m15535j1(C17541R$string.new_variable);
        int i2 = 0;
        while (i < r0.size()) {
            int i3 = i + 1;
            strArr[i3] = r0.get(i).getName();
            MacroDroidVariable macroDroidVariable = this.m_variable;
            if (macroDroidVariable != null && macroDroidVariable.getName().equals(strArr[i3])) {
                i2 = i3;
            }
            i = i3;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.action_set_variable_select);
        builder.setSingleChoiceItems((CharSequence[]) strArr, i2, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3403rj(this, r0));
        builder.create().show();
    }

    /* renamed from: S4 */
    private void m12915S4() {
        String[] strArr = {SelectableItem.m15535j1(C17541R$string.lat_lon), SelectableItem.m15535j1(C17541R$string.google_maps_link)};
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_format);
        builder.setSingleChoiceItems((CharSequence[]) strArr, true ^ this.m_oldVariableFormat ? 1 : 0, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3177jk(this));
        builder.create().show();
    }

    /* renamed from: T4 */
    private void m12917T4(String str, String str2, String str3, String str4) {
        SmtpServerConfig b2 = C5163j2.m20121b2(mo27827K0());
        if (!b2.isValid()) {
            C4878b.m18869h("Failed to share location via email to: " + this.m_email + ". SMTP Configuration is invalid", mo27840Y0().longValue());
            return;
        }
        C1994b N = new C1994b().mo24010I(b2.getServerAddress()).mo24012K(b2.getUsername()).mo24011J(b2.getPassword()).mo24008G(b2.getServerPort()).mo24004C(b2.getStartTlsEnabled()).mo24016O(C1999d.PLAIN).mo24015N(str2);
        if (str == null) {
            str = "";
        }
        N.mo24019i(str).mo24014M(str3).mo24018g(str4).mo24007F(new C2677c(str2)).mo24006E();
    }

    /* renamed from: U4 */
    private void m12919U4(Location location) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(FilenameUtils.EXTENSION_SEPARATOR);
        DecimalFormat decimalFormat = new DecimalFormat("#.#######", decimalFormatSymbols);
        String str = "http://maps.google.com/maps?q=" + location.getLatitude() + "," + location.getLongitude() + "&center=" + decimalFormat.format(location.getLatitude()) + "," + decimalFormat.format(location.getLongitude());
        if (this.m_smsNumber != null) {
            SMSOutputService2.m14460d(mo27827K0(), str, C4023j0.m15760t0(mo27827K0().getApplicationContext(), this.m_smsNumber, this.m_triggerContextInfo, mo27837X0()), false, 1, this.m_simId);
            return;
        }
        Contact contact = this.m_smsContact;
        if (!(contact == null || contact.mo27709b() == null || !contact.mo27709b().equals("Incoming_Contact"))) {
            TriggerContextInfo triggerContextInfo = this.m_triggerContextInfo;
            if (triggerContextInfo == null || triggerContextInfo.mo31561n() == null) {
                C8151a.m33873n(new RuntimeException("m_triggerContextInfo is invalid in ShareLocationAction"));
            } else {
                contact.mo27715j(this.m_triggerContextInfo.mo31561n().mo27723b());
            }
        }
        SMSOutputService2.m14459c(mo27827K0(), str, contact, (String) null, false, 1, this.m_simId);
    }

    /* access modifiers changed from: private */
    /* renamed from: V4 */
    public void m12921V4(Location location) {
        String str;
        Date date = new Date(location.getTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        C4878b.m18874m("Share location obtained: " + simpleDateFormat.format(date) + " provider=" + location.getProvider() + ", Accuracy = " + location.getAccuracy(), mo27840Y0().longValue());
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(FilenameUtils.EXTENSION_SEPARATOR);
        DecimalFormat decimalFormat = new DecimalFormat("#.#######", decimalFormatSymbols);
        int i = this.m_outputChannel;
        if (i != 0) {
            if (i == 1) {
                String str2 = mo27827K0().getString(C17541R$string.action_share_location_facebook_message) + " " + "http://maps.google.com/maps?q=" + decimalFormat.format(location.getLatitude()) + "," + decimalFormat.format(location.getLongitude());
                Intent intent = new Intent(mo27827K0(), UploadLocationService.class);
                intent.putExtra("UploadSite", "Facebook");
                intent.putExtra("LocationMessage", str2);
                mo27827K0().startService(intent);
            } else if (i == 2) {
                String str3 = DateFormat.getDateFormat(mo27827K0()).format(new Date()) + " " + DateFormat.getTimeFormat(mo27827K0()).format(new Date()) + " - " + "http://maps.google.com/maps?q=" + decimalFormat.format(location.getLatitude()) + "," + decimalFormat.format(location.getLongitude());
                Intent intent2 = new Intent(mo27827K0(), UploadLocationService.class);
                intent2.putExtra("UploadSite", "Twitter");
                intent2.putExtra("LocationMessage", str3);
                mo27827K0().startService(intent2);
            } else if (i == 3) {
                String t0 = C4023j0.m15760t0(mo27827K0().getApplicationContext(), this.m_email, this.m_triggerContextInfo, mo27837X0());
                String str4 = "http://maps.google.com/maps?q=" + location.getLatitude() + "," + location.getLongitude() + "&center=" + decimalFormat.format(location.getLatitude()) + "," + decimalFormat.format(location.getLongitude());
                if (this.useSmtpEmail) {
                    m12917T4(C4023j0.m15760t0(mo27827K0(), this.emailFrom, this.m_triggerContextInfo, mo27837X0()), t0, C4023j0.m15760t0(mo27827K0(), m12935f4(), this.m_triggerContextInfo, mo27837X0()), str4);
                    return;
                }
                Intent intent3 = new Intent(mo27827K0(), UploadLocationService.class);
                intent3.putExtra("UploadSite", "Email");
                intent3.putExtra("LocationMessage", str4);
                intent3.putExtra("EmailAddress", t0);
                mo27827K0().startService(intent3);
            } else if (i != 4) {
                if (i == 5 && this.m_variable != null) {
                    if (this.m_oldVariableFormat) {
                        str = location.getLatitude() + "," + location.getLongitude();
                    } else {
                        str = "http://maps.google.com/maps?q=" + location.getLatitude() + "," + location.getLongitude() + "&center=" + decimalFormat.format(location.getLatitude()) + "," + decimalFormat.format(location.getLongitude());
                    }
                    MacroDroidVariable q = mo27861q(this.m_variable.getName());
                    if (q != null) {
                        mo27832M2(q, new VariableValue.StringValue(str, (List<String>) null));
                    }
                }
            } else if (ContextCompat.checkSelfPermission(mo27827K0(), "android.permission.WRITE_CALENDAR") != 0) {
                C7439d0.m30909o0(mo27827K0(), "android.permission.WRITE_CALENDAR", mo27827K0().getString(C17541R$string.action_share_location), true, false);
            } else {
                C4037m.m15935a(mo27827K0(), this.m_calendarId, mo27827K0().getString(C17541R$string.action_share_location_location) + ": " + location.getLatitude() + "," + location.getLongitude(), "http://maps.google.com/maps?q=" + location.getLatitude() + "," + location.getLongitude() + "&center=" + decimalFormat.format(location.getLatitude()) + "," + decimalFormat.format(location.getLongitude()), System.currentTimeMillis() - WorkRequest.MIN_BACKOFF_MILLIS, 0, false, 1);
            }
        } else if (ContextCompat.checkSelfPermission(mo27827K0(), "android.permission.SEND_SMS") != 0) {
            C4878b.m18869h("Share location failed - needs SMS permission", mo27840Y0().longValue());
            C7439d0.m30909o0(mo27827K0(), "android.permission.SEND_SMS", (String) null, true, false);
        } else {
            m12919U4(location);
        }
    }

    /* renamed from: W4 */
    private void m12923W4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), C17542R$style.Theme_App_Dialog_Variables);
        builder.setTitle((int) C17541R$string.variable_creation_failed);
        builder.setMessage((int) C17541R$string.variable_already_exists);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) C3494tj.f9297a);
        builder.show();
    }

    /* renamed from: X3 */
    private synchronized void m12924X3() {
        if (s_googleApiClient == null) {
            GoogleApiClient d = new GoogleApiClient.Builder(mo27827K0()).mo21264a(LocationServices.f45843a).mo21266c(this).mo21267d();
            s_googleApiClient = d;
            d.mo21249e();
        }
    }

    /* renamed from: X4 */
    private void m12925X4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) m12934e4(), this.useSmtpEmail ? 1 : 0, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3205kk(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3233lk(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C3093gk(this));
    }

    @RequiresApi(api = 22)
    /* renamed from: Y3 */
    private void m12926Y3() {
        try {
            List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) mo27827K0().getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
            if (activeSubscriptionInfoList != null) {
                if (activeSubscriptionInfoList.size() > 1) {
                    m12932c4(activeSubscriptionInfoList);
                    return;
                }
            }
            mo24689O1();
        } catch (SecurityException unused) {
            mo24689O1();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0044 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072 A[Catch:{ Exception -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082 A[SYNTHETIC, Splitter:B:24:0x0082] */
    /* renamed from: Y4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m12927Y4() {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 1
            android.content.Context r1 = r7.mo27827K0()     // Catch:{ SettingNotFoundException -> 0x0044 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x0044 }
            java.lang.String r2 = "location_mode"
            int r1 = android.provider.Settings.Secure.getInt(r1, r2)     // Catch:{ SettingNotFoundException -> 0x0044 }
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0026
            if (r1 == r0) goto L_0x0023
            r3 = 2
            if (r1 == r3) goto L_0x0020
            r3 = 3
            if (r1 == r3) goto L_0x001d
            goto L_0x0028
        L_0x001d:
            java.lang.String r2 = "High Accuracy"
            goto L_0x0028
        L_0x0020:
            java.lang.String r2 = "Battery Saving"
            goto L_0x0028
        L_0x0023:
            java.lang.String r2 = "Sensors Only"
            goto L_0x0028
        L_0x0026:
            java.lang.String r2 = "Off"
        L_0x0028:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SettingNotFoundException -> 0x0044 }
            r1.<init>()     // Catch:{ SettingNotFoundException -> 0x0044 }
            java.lang.String r3 = "Location Mode = "
            r1.append(r3)     // Catch:{ SettingNotFoundException -> 0x0044 }
            r1.append(r2)     // Catch:{ SettingNotFoundException -> 0x0044 }
            java.lang.String r1 = r1.toString()     // Catch:{ SettingNotFoundException -> 0x0044 }
            java.lang.Long r2 = r7.mo27840Y0()     // Catch:{ SettingNotFoundException -> 0x0044 }
            long r2 = r2.longValue()     // Catch:{ SettingNotFoundException -> 0x0044 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18874m(r1, r2)     // Catch:{ SettingNotFoundException -> 0x0044 }
        L_0x0044:
            android.content.Context r1 = r7.mo27827K0()     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = "location"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ all -> 0x00b0 }
            android.location.LocationManager r1 = (android.location.LocationManager) r1     // Catch:{ all -> 0x00b0 }
            r7.m_locationManager = r1     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = "gps"
            boolean r1 = r1.isProviderEnabled(r2)     // Catch:{ all -> 0x00b0 }
            r7.m_usingGPS = r1     // Catch:{ all -> 0x00b0 }
            android.content.Context r1 = r7.mo27827K0()     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r2)     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x0082
            android.content.Context r1 = r7.mo27827K0()     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r1, r2)     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x0082
            android.content.Context r1 = r7.mo27827K0()     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String r3 = r7.mo25559a1()     // Catch:{ all -> 0x00b0 }
            r4 = 0
            p112j2.C7439d0.m30909o0(r1, r2, r3, r0, r4)     // Catch:{ all -> 0x00b0 }
            monitor-exit(r7)
            return
        L_0x0082:
            android.location.LocationManager r1 = r7.m_locationManager     // Catch:{ Exception -> 0x008f }
            java.lang.String r2 = "network"
            r3 = 0
            r5 = 0
            android.location.LocationListener r6 = r7.locationListenerNetwork     // Catch:{ Exception -> 0x008f }
            r1.requestLocationUpdates(r2, r3, r5, r6)     // Catch:{ Exception -> 0x008f }
            goto L_0x0094
        L_0x008f:
            java.lang.String r0 = "Network Provider not available"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18882u(r0)     // Catch:{ all -> 0x00b0 }
        L_0x0094:
            android.location.LocationManager r1 = r7.m_locationManager     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r2 = "gps"
            r3 = 0
            r5 = 0
            android.location.LocationListener r6 = r7.locationListenerGPS     // Catch:{ Exception -> 0x00a1 }
            r1.requestLocationUpdates(r2, r3, r5, r6)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00ae
        L_0x00a1:
            java.lang.String r0 = "GPS Provider not available"
            java.lang.Long r1 = r7.mo27840Y0()     // Catch:{ all -> 0x00b0 }
            long r1 = r1.longValue()     // Catch:{ all -> 0x00b0 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18874m(r0, r1)     // Catch:{ all -> 0x00b0 }
        L_0x00ae:
            monitor-exit(r7)
            return
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.ShareLocationAction.m12927Y4():void");
    }

    /* renamed from: Z3 */
    private void m12928Z3() {
        GoogleAccountCredential c = this.m_gmailHelper.mo32426c();
        if (c.mo60271b() == null) {
            this.m_gmailHelper.mo32425b(c, mo27850j0());
        } else {
            m12905N4();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0045 */
    /* renamed from: Z4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m12929Z4() {
        /*
            r2 = this;
            android.os.PowerManager$WakeLock r0 = r2.m_wakelock
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isHeld()
            if (r0 == 0) goto L_0x000f
            android.os.PowerManager$WakeLock r0 = r2.m_wakelock
            r0.release()
        L_0x000f:
            r0 = 0
            r2.m_wakelock = r0
        L_0x0012:
            com.arlosoft.macrodroid.app.MacroDroidApplication r0 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            java.lang.String r1 = "alarm"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0
            android.app.PendingIntent r1 = r2.m_timeoutPendingIntent
            if (r1 == 0) goto L_0x0025
            r0.cancel(r1)
        L_0x0025:
            android.location.LocationManager r0 = r2.m_locationManager
            if (r0 != 0) goto L_0x0037
            android.content.Context r0 = r2.mo27827K0()
            java.lang.String r1 = "location"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            r2.m_locationManager = r0
        L_0x0037:
            android.location.LocationManager r0 = r2.m_locationManager     // Catch:{ SecurityException -> 0x0045 }
            android.location.LocationListener r1 = r2.locationListenerGPS     // Catch:{ SecurityException -> 0x0045 }
            r0.removeUpdates(r1)     // Catch:{ SecurityException -> 0x0045 }
            android.location.LocationManager r0 = r2.m_locationManager     // Catch:{ SecurityException -> 0x0045 }
            android.location.LocationListener r1 = r2.locationListenerNetwork     // Catch:{ SecurityException -> 0x0045 }
            r0.removeUpdates(r1)     // Catch:{ SecurityException -> 0x0045 }
        L_0x0045:
            com.arlosoft.macrodroid.app.MacroDroidApplication r0 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ IllegalArgumentException -> 0x004e }
            com.arlosoft.macrodroid.action.ShareLocationAction$TimeOutReceiver r1 = r2.m_timeoutReceiver     // Catch:{ IllegalArgumentException -> 0x004e }
            r0.unregisterReceiver(r1)     // Catch:{ IllegalArgumentException -> 0x004e }
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.ShareLocationAction.m12929Z4():void");
    }

    /* renamed from: a4 */
    private void m12930a4() {
        Activity j0 = mo27850j0();
        Intent intent = new Intent(j0, EmailActivity.class);
        intent.putParcelableArrayListExtra("Trigger", this.m_macro.getTriggerList());
        intent.putExtra("From", this.emailFrom);
        intent.putExtra("Address", this.m_email);
        intent.putExtra("Subject", m12935f4());
        intent.putExtra("Body", this.emailBody);
        intent.putExtra("SmtpMode", this.useSmtpEmail);
        intent.putExtra("HideMessageText", true);
        intent.putExtra(C8157f.ITEM_TYPE, mo27837X0());
        intent.putExtra("SendingAttachment", true);
        j0.startActivityForResult(intent, EMAIL_ACTIVITY_REQUEST);
    }

    /* renamed from: b4 */
    private void m12931b4() {
        int i = 0;
        String[] strArr = {SelectableItem.m15535j1(C17541R$string.select_contact), SelectableItem.m15535j1(C17541R$string.select_number)};
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo27827K0().getString(C17541R$string.select_option));
        if (this.m_smsNumber != null) {
            i = 1;
        }
        builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3289nk(this));
        AlertDialog create = builder.create();
        create.show();
        create.getListView().setFastScrollEnabled(true);
    }

    @RequiresApi(api = 22)
    /* renamed from: c4 */
    private void m12932c4(List<SubscriptionInfo> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (SubscriptionInfo next : list) {
            arrayList.add((next.getSimSlotIndex() + 1) + " : " + next.getDisplayName() + " - " + next.getCarrierName());
            if (next.getSubscriptionId() == this.m_simId) {
                i = i2;
            }
            i2++;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.sim_card);
        builder.setSingleChoiceItems((CharSequence[]) (String[]) arrayList.toArray(new String[0]), i, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3121hk(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3346pj(this, list));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C3232lj(this));
    }

    /* renamed from: d4 */
    private void m12933d4() {
        if (Build.VERSION.SDK_INT < 22) {
            mo24689O1();
        } else {
            new C11102b((FragmentActivity) mo27850j0()).mo62231o("android.permission.READ_PHONE_STATE").mo79679I(C16971a.m100210a()).mo79685P(new C3008dk(this));
        }
    }

    /* renamed from: e4 */
    private String[] m12934e4() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.gmail_account), SelectableItem.m15535j1(C17541R$string.smtp_server)};
    }

    /* renamed from: f4 */
    private String m12935f4() {
        String str = this.emailSubject;
        if (str != null) {
            return str;
        }
        return SelectableItem.m15535j1(C17541R$string.action_share_location);
    }

    /* renamed from: g4 */
    private String[] m12936g4() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_share_location_option_sms), MacroDroidApplication.m14845u().getString(C17541R$string.action_share_location_option_facebook), MacroDroidApplication.m14845u().getString(C17541R$string.action_share_location_option_twitter), MacroDroidApplication.m14845u().getString(C17541R$string.action_share_location_option_email), MacroDroidApplication.m14845u().getString(C17541R$string.action_share_location_option_calendar), MacroDroidApplication.m14845u().getString(C17541R$string.action_share_location_option_variable)};
    }

    /* renamed from: h4 */
    private String[] m12937h4() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_share_location_option_sms), MacroDroidApplication.m14845u().getString(C17541R$string.action_share_location_option_twitter), MacroDroidApplication.m14845u().getString(C17541R$string.action_share_location_option_email), MacroDroidApplication.m14845u().getString(C17541R$string.action_share_location_option_calendar), MacroDroidApplication.m14845u().getString(C17541R$string.action_share_location_option_variable)};
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public /* synthetic */ void m12938i4(DialogInterface dialogInterface, int i) {
        if (((AlertDialog) dialogInterface).getListView().getCheckedItemPosition() == 0) {
            m12907O4();
        } else {
            m12909P4();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public /* synthetic */ void m12940j4(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public /* synthetic */ void m12942k4(DialogInterface dialogInterface, int i) {
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        this.m_outputChannel = checkedItemPosition == 0 ? 0 : checkedItemPosition + 1;
        mo27873w2();
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public /* synthetic */ void m12944l4(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public /* synthetic */ void m12946m4(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public /* synthetic */ void m12948n4(List list, DialogInterface dialogInterface, int i) {
        this.m_simId = ((SubscriptionInfo) list.get(((AlertDialog) dialogInterface).getListView().getCheckedItemPosition())).getSubscriptionId();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: o4 */
    public /* synthetic */ void m12950o4(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public /* synthetic */ void m12952p4(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            m12926Y3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public /* synthetic */ void m12954q4(EditText editText, RadioButton radioButton, AppCompatDialog appCompatDialog, View view) {
        if (mo27837X0().findLocalVariableByName(editText.getText().toString()) != null) {
            m12923W4();
            return;
        }
        MacroDroidVariable macroDroidVariable = new MacroDroidVariable(2, editText.getText().toString(), radioButton.isChecked());
        mo27835S(macroDroidVariable);
        this.m_variable = macroDroidVariable;
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public /* synthetic */ void m12958s4(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public static /* synthetic */ void m12960t4(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public /* synthetic */ void m12962u4(EditText editText, DialogInterface dialogInterface, int i) {
        this.m_email = editText.getText().toString();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: v4 */
    public static /* synthetic */ void m12964v4(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: w4 */
    public static /* synthetic */ void m12966w4(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: x4 */
    public /* synthetic */ void m12968x4(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: y4 */
    public /* synthetic */ void m12970y4(List list, DialogInterface dialogInterface, int i) {
        this.m_smsContact = (Contact) list.get(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: z4 */
    public /* synthetic */ void m12972z4(DialogInterface dialogInterface, int i) {
        this.m_smsNumber = null;
        m12933d4();
    }

    /* renamed from: A1 */
    public void mo21388A1(@NonNull ConnectionResult connectionResult) {
        C4878b.m18869h("Connection to Google Play services failed", mo27840Y0().longValue());
        m12929Z4();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_outputChannel;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_email, this.m_smsNumber};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 2) {
            this.m_email = strArr[0];
            this.m_smsNumber = strArr[1];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: L */
    public void mo25739L() {
        mo24689O1();
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        if (this.m_outputChannel != 0 || this.m_smsNumber != null) {
            return true;
        }
        Contact contact = this.m_smsContact;
        if (contact == null) {
            return false;
        }
        if (!contact.mo27709b().equals("Incoming_Contact") || this.m_macro.hasOnlyTrigger(IncomingSMSTrigger.class) || this.m_macro.hasOnlyTrigger(IncomingCallTrigger.class)) {
            return !this.m_smsContact.mo27709b().equals("Select_Contact");
        }
        return false;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        MacroDroidVariable macroDroidVariable;
        int i = this.m_outputChannel;
        if (i == 0) {
            if (this.m_smsNumber != null) {
                return mo27827K0().getString(C17541R$string.action_share_location_send_to) + " " + this.m_smsNumber;
            } else if (this.m_smsContact == null) {
                return "";
            } else {
                return mo27827K0().getString(C17541R$string.action_share_location_send_to) + " " + this.m_smsContact.mo27713g();
            }
        } else if (i == 3 && this.m_email != null) {
            return mo27827K0().getString(C17541R$string.action_share_location_send_to) + " " + this.m_email;
        } else if (i == 5 && (macroDroidVariable = this.m_variable) != null) {
            return macroDroidVariable.getName();
        } else {
            if (i == 4) {
                return SelectableItem.m15535j1(C17541R$string.action_share_location_option_calendar);
            }
            return "";
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7751g4.m32342u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo24694V2() {
        m12924X3();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24825a0() {
        /*
            r6 = this;
            int r0 = r6.m_outputChannel
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r0 = r6.m_smsNumber
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            r0 = 0
            com.arlosoft.macrodroid.common.Contact r2 = r6.m_smsContact
            if (r2 == 0) goto L_0x001f
            java.lang.String r2 = r2.mo27713g()
            java.lang.String r3 = com.arlosoft.macrodroid.common.Contact.m15398d()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001f
            return r1
        L_0x001f:
            com.arlosoft.macrodroid.common.Contact r2 = r6.m_smsContact
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = r2.mo27713g()
            java.lang.String r3 = com.arlosoft.macrodroid.common.Contact.m15397c()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0032
            return r1
        L_0x0032:
            android.content.Context r2 = r6.mo27827K0()
            java.util.List r2 = com.arlosoft.macrodroid.common.C4061t1.m15950D(r2)
            com.arlosoft.macrodroid.common.Contact r3 = r6.m_smsContact
            if (r3 == 0) goto L_0x0061
            java.util.Iterator r2 = r2.iterator()
        L_0x0042:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0061
            java.lang.Object r3 = r2.next()
            com.arlosoft.macrodroid.common.Contact r3 = (com.arlosoft.macrodroid.common.Contact) r3
            java.lang.String r4 = r3.mo27713g()
            com.arlosoft.macrodroid.common.Contact r5 = r6.m_smsContact
            java.lang.String r5 = r5.mo27713g()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0042
            r6.m_smsContact = r3
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            if (r1 != 0) goto L_0x0073
            com.arlosoft.macrodroid.common.Contact r0 = new com.arlosoft.macrodroid.common.Contact
            java.lang.String r2 = com.arlosoft.macrodroid.common.Contact.m15400i()
            java.lang.String r3 = "Select_Contact"
            java.lang.String r4 = "Incoming_Contact"
            r0.<init>(r3, r2, r4)
            r6.m_smsContact = r0
        L_0x0073:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.ShareLocationAction.mo24825a0():boolean");
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo27827K0().getSystemService("power")).newWakeLock(1, "macrodroid:sharelocationaction");
        this.m_wakelock = newWakeLock;
        newWakeLock.acquire();
        this.m_networkLocation = null;
        this.m_triggerContextInfo = triggerContextInfo;
        m12927Y4();
        AlarmManager alarmManager = (AlarmManager) MacroDroidApplication.m14845u().getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent pendingIntent = this.m_timeoutPendingIntent;
        if (pendingIntent != null) {
            alarmManager.cancel(pendingIntent);
        }
        MacroDroidApplication.m14845u().registerReceiver(this.m_timeoutReceiver, new IntentFilter(TIMEOUT_INTENT));
        this.m_timeoutPendingIntent = PendingIntent.getBroadcast(MacroDroidApplication.m14845u(), 0, new Intent(TIMEOUT_INTENT), 134217728 | C6368b1.f14959b);
        alarmManager.set(0, System.currentTimeMillis() + 45000, this.m_timeoutPendingIntent);
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_CONTACTS", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    }

    /* renamed from: c3 */
    public void mo24699c3() {
        m12929Z4();
    }

    /* renamed from: d1 */
    public String[] mo24826d1() {
        return new String[]{"android.permission.READ_CONTACTS"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m12936g4();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public AlertDialog mo24883h0() {
        int i = this.m_outputChannel;
        if (i >= 1) {
            i--;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) m12937h4(), i, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3260mj(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3149ik(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C3576wj(this));
        return create;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.action_share_location_select_output);
    }

    public synchronized void onLocationChanged(Location location) {
        C4878b.m18874m("Found fused location - sharing now", mo27840Y0().longValue());
        m12921V4(location);
        m12929Z4();
        try {
            LocationServices.f45844b.mo50650a(s_googleApiClient, this);
        } catch (Exception unused) {
        }
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i2 == -1 && intent != null) {
            if (i == 1000) {
                if (this.m_gmailHelper.mo32427e(i, i2, intent)) {
                    m12905N4();
                }
            } else if (i == EMAIL_ACTIVITY_REQUEST) {
                this.emailFrom = intent.getExtras().getString("From");
                this.m_email = intent.getExtras().getString("Address");
                this.emailBody = intent.getExtras().getString("Body");
                this.emailSubject = intent.getExtras().getString("Subject");
                mo24689O1();
            }
        }
    }

    /* renamed from: s */
    public MacroDroidVariable mo24432s() {
        return this.m_variable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        Activity j0 = mo27850j0();
        int i = this.m_outputChannel;
        if (i == 0) {
            m12911Q4();
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m12925X4();
                } else if (i == 4) {
                    m12903M4();
                } else if (i == 5) {
                    m12915S4();
                }
            } else if (!C7960a.m33245h(j0)) {
                C7960a.m33246i(j0, this);
            } else {
                mo24689O1();
            }
        } else if (C5163j2.m20075V(mo27827K0()) != null) {
            mo24689O1();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_outputChannel);
        parcel.writeParcelable(this.m_smsContact, i);
        parcel.writeString(this.m_email);
        parcel.writeString(this.m_calendarId);
        parcel.writeParcelable(this.m_variable, i);
        parcel.writeInt(this.m_oldVariableFormat ? 1 : 0);
        parcel.writeInt(this.m_simId);
        parcel.writeString(this.emailSubject);
        parcel.writeString(this.emailBody);
        parcel.writeString(this.emailFrom);
        parcel.writeInt(this.useSmtpEmail ? 1 : 0);
    }

    public ShareLocationAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public ShareLocationAction() {
        this.m_timeoutReceiver = new TimeOutReceiver();
        this.locationListenerGPS = new C2675a();
        this.locationListenerNetwork = new C2676b();
        this.m_outputChannel = 0;
        this.m_email = "";
        this.m_gmailHelper = C6383g0.m24633d(mo27827K0().getApplicationContext());
    }

    private ShareLocationAction(Parcel parcel) {
        super(parcel);
        this.m_timeoutReceiver = new TimeOutReceiver();
        this.locationListenerGPS = new C2675a();
        this.locationListenerNetwork = new C2676b();
        this.m_gmailHelper = C6383g0.m24633d(mo27827K0().getApplicationContext());
        this.m_outputChannel = parcel.readInt();
        this.m_smsContact = (Contact) parcel.readParcelable(Contact.class.getClassLoader());
        this.m_email = parcel.readString();
        this.m_calendarId = parcel.readString();
        this.m_variable = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        boolean z = true;
        this.m_oldVariableFormat = parcel.readInt() != 0;
        this.m_simId = parcel.readInt();
        this.emailSubject = parcel.readString();
        this.emailBody = parcel.readString();
        this.emailFrom = parcel.readString();
        this.useSmtpEmail = parcel.readInt() == 0 ? false : z;
    }
}
