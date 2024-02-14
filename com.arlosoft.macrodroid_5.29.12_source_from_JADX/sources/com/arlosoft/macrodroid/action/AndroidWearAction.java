package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.services.AndroidWearService;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectActivity;
import com.arlosoft.macrodroid.utils.C6457x1;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.Wearable;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p037m.C2009f;
import p057a2.C2224m;
import p128m0.C7745g;
import p148q0.C8151a;

public class AndroidWearAction extends Action implements MessageApi.MessageListener, C2224m {
    private static final int ANDROID_WEAR_BRIGHTNESS = 3;
    private static final int ANDROID_WEAR_NOTIFICATION = 1;
    private static final int ANDROID_WEAR_OPEN_APP = 0;
    private static final int ANDROID_WEAR_VIBRATE = 2;
    private static final int ANDROID_WEAR_WAKE_SCREEN = 4;
    private static final int ANDROID_WEAR_WIFI = 5;
    public static final Parcelable.Creator<AndroidWearAction> CREATOR = new C2335c();
    private static final int NUM_ACTIONS = 4;
    private static final int REQUEST_CODE_ICON_FOR_ACTION = 1;
    private static final int REQUEST_CODE_ICON_FOR_NOTIFICATION = 0;
    private static final String[] s_brightnessOptions = {"1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6"};
    private boolean[] m_actionEnabledStates;
    private String[] m_actionIcons;
    private transient int m_actionIndex;
    private long[] m_actionMacroGuids;
    private String[] m_actionNames;
    private String m_applicationName;
    private int m_brightness;
    /* access modifiers changed from: private */
    public transient GoogleApiClient m_googleApiClient;
    private transient ImageView m_iconImage;
    private transient ImageView m_iconImageAction;
    private String m_imageResourceName;
    private String m_notificationSubject;
    private String m_notificationText;
    private int m_option;
    private String m_packageToLaunch;
    /* access modifiers changed from: private */
    public transient C2009f m_progressDialog;
    private int m_vibratePattern;
    private int m_wifiOption;

    /* renamed from: com.arlosoft.macrodroid.action.AndroidWearAction$a */
    class C2333a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7140a;

        /* renamed from: c */
        final /* synthetic */ EditText f7141c;

        /* renamed from: d */
        final /* synthetic */ EditText f7142d;

        C2333a(Button button, EditText editText, EditText editText2) {
            this.f7140a = button;
            this.f7141c = editText;
            this.f7142d = editText2;
        }

        public void afterTextChanged(Editable editable) {
            this.f7140a.setEnabled(this.f7141c.getText().length() > 0 && this.f7142d.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.AndroidWearAction$b */
    class C2334b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7144a;

        /* renamed from: c */
        final /* synthetic */ EditText f7145c;

        /* renamed from: d */
        final /* synthetic */ Spinner f7146d;

        C2334b(Button button, EditText editText, Spinner spinner) {
            this.f7144a = button;
            this.f7145c = editText;
            this.f7146d = spinner;
        }

        public void afterTextChanged(Editable editable) {
            this.f7144a.setEnabled(this.f7145c.getText().length() > 0 && this.f7146d.getAdapter().getCount() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.AndroidWearAction$c */
    class C2335c implements Parcelable.Creator<AndroidWearAction> {
        C2335c() {
        }

        /* renamed from: a */
        public AndroidWearAction createFromParcel(Parcel parcel) {
            return new AndroidWearAction(parcel, (C2333a) null);
        }

        /* renamed from: b */
        public AndroidWearAction[] newArray(int i) {
            return new AndroidWearAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.AndroidWearAction$d */
    private class C2336d extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a */
        private final String f7148a;

        /* renamed from: b */
        private int f7149b;

        public C2336d(String str) {
            this.f7148a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m9832d(DialogInterface dialogInterface, int i) {
            AndroidWearAction.this.m9765P3();
            dialogInterface.cancel();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Integer doInBackground(Void... voidArr) {
            this.f7149b = 0;
            AndroidWearAction androidWearAction = AndroidWearAction.this;
            GoogleApiClient unused = androidWearAction.m_googleApiClient = new GoogleApiClient.Builder(androidWearAction.mo27827K0()).mo21264a(Wearable.f48096f).mo21267d();
            if (!AndroidWearAction.this.m_googleApiClient.mo21248d(30, TimeUnit.SECONDS).mo21137p2()) {
                Log.e(AndroidWearAction.this.m_classType, "Failed to connect to GoogleApiClient.");
                return 0;
            }
            HashSet hashSet = new HashSet();
            for (Node id : Wearable.f48094d.mo56223a(AndroidWearAction.this.m_googleApiClient).mo21271d().mo56224s()) {
                hashSet.add(id.getId());
            }
            if (hashSet.size() > 0) {
                MessageApi messageApi = Wearable.f48093c;
                messageApi.mo56211c(AndroidWearAction.this.m_googleApiClient, AndroidWearAction.this);
                MessageApi.SendMessageResult d = messageApi.mo56209a(AndroidWearAction.this.m_googleApiClient, (String) hashSet.iterator().next(), "/macrodroid/request-installed-apps", (byte[]) null).mo21271d();
                if (!d.getStatus().mo21297q2()) {
                    String M3 = AndroidWearAction.this.m_classType;
                    Log.e(M3, "ERROR: failed to send Message: " + d.getStatus());
                    messageApi.mo56210b(AndroidWearAction.this.m_googleApiClient, AndroidWearAction.this);
                    this.f7149b = 2;
                } else {
                    String unused2 = AndroidWearAction.this.m_classType;
                    StringBuilder sb = new StringBuilder();
                    sb.append("SENT: sent Message: ");
                    sb.append(d.getStatus());
                    return 3;
                }
            } else {
                this.f7149b = 2;
            }
            AndroidWearAction.this.m_googleApiClient.mo21250f();
            return Integer.valueOf(this.f7149b);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void onPostExecute(Integer num) {
            Activity j0 = AndroidWearAction.this.mo27850j0();
            if (AndroidWearAction.this.m_progressDialog != null) {
                AndroidWearAction.this.m_progressDialog.dismiss();
            }
            if (num.intValue() != 3) {
                try {
                    if (AndroidWearAction.this.mo27836X()) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(j0, AndroidWearAction.this.mo24705l0());
                        builder.setTitle((int) C17541R$string.action_android_wear_connection_failed);
                        builder.setMessage((int) C17541R$string.action_android_wear_could_not_connect);
                        builder.setPositiveButton((int) C17541R$string.retry, (DialogInterface.OnClickListener) new C3466t0(this));
                        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C3502u0.f9321a);
                        builder.show();
                    }
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void onProgressUpdate(Void... voidArr) {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C2009f unused = AndroidWearAction.this.m_progressDialog = new C2009f.C2014d(AndroidWearAction.this.mo27850j0()).mo24100t(C17541R$string.please_wait).mo24085e(C17541R$string.action_android_wear_obtaining_app_list).mo24098r(true, 0).mo24084c(false).mo24103w(ContextCompat.getColor(AndroidWearAction.this.mo27850j0(), C17528R$color.actions_primary)).mo24099s();
        }
    }

    /* synthetic */ AndroidWearAction(Parcel parcel, C2333a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public void m9765P3() {
        new C2336d("/macrodroid/request-installed-apps").execute((Object[]) null);
    }

    /* renamed from: Q3 */
    private void m9766Q3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.action_set_brightness);
        builder.setSingleChoiceItems((CharSequence[]) s_brightnessOptions, this.m_brightness - 1, (DialogInterface.OnClickListener) new C3241m0(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C3555w.f9453a);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3269n0(this));
        builder.create().show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0086, code lost:
        if (mo27827K0().getResources().getDrawable(r2) == null) goto L_0x0088;
     */
    /* renamed from: R3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9767R3(com.arlosoft.macrodroid.triggers.TriggerContextInfo r14) {
        /*
            r13 = this;
            android.content.Context r0 = r13.mo27827K0()
            java.lang.String r1 = r13.m_notificationText
            com.arlosoft.macrodroid.macro.Macro r2 = r13.mo27837X0()
            java.lang.String r0 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r0, r1, r14, r2)
            java.lang.String r1 = r13.m_notificationSubject
            if (r1 != 0) goto L_0x0014
            r14 = r0
            goto L_0x0022
        L_0x0014:
            android.content.Context r1 = r13.mo27827K0()
            java.lang.String r2 = r13.m_notificationSubject
            com.arlosoft.macrodroid.macro.Macro r3 = r13.mo27837X0()
            java.lang.String r14 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r1, r2, r14, r3)
        L_0x0022:
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r13.mo27827K0()
            java.lang.Class<com.arlosoft.macrodroid.homescreen.NewHomeScreenActivity> r3 = com.arlosoft.macrodroid.homescreen.NewHomeScreenActivity.class
            r1.<init>(r2, r3)
            java.lang.String r2 = "EventId"
            r3 = 1
            r1.putExtra(r2, r3)
            android.content.Context r2 = r13.mo27827K0()
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r5 = 0
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r2, r5, r1, r4)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.VIEW"
            r2.<init>(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "geo:0,0?q="
            r4.append(r6)
            java.lang.String r6 = "21.32323,10.3443324"
            java.lang.String r6 = android.net.Uri.encode(r6)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r2.setData(r4)
            java.lang.String r2 = r13.m_imageResourceName
            r4 = -1
            r6 = 2131230895(0x7f0800af, float:1.8077856E38)
            if (r2 == 0) goto L_0x0077
            android.content.Context r2 = r13.mo27827K0()
            java.lang.String r7 = r13.m_imageResourceName
            int r2 = com.arlosoft.macrodroid.common.C4061t1.m15976V(r2, r7)
            if (r2 != r4) goto L_0x007a
        L_0x0077:
            r2 = 2131230895(0x7f0800af, float:1.8077856E38)
        L_0x007a:
            android.content.Context r7 = r13.mo27827K0()     // Catch:{ NotFoundException -> 0x0088 }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ NotFoundException -> 0x0088 }
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r2)     // Catch:{ NotFoundException -> 0x0088 }
            if (r7 != 0) goto L_0x008b
        L_0x0088:
            r2 = 2131230895(0x7f0800af, float:1.8077856E38)
        L_0x008b:
            androidx.core.app.NotificationCompat$WearableExtender r7 = new androidx.core.app.NotificationCompat$WearableExtender
            r7.<init>()
        L_0x0090:
            r8 = 4
            if (r5 >= r8) goto L_0x00de
            boolean[] r8 = r13.m_actionEnabledStates
            boolean r8 = r8[r5]
            if (r8 == 0) goto L_0x00db
            android.content.Context r8 = r13.mo27827K0()
            java.lang.String[] r9 = r13.m_actionIcons
            r9 = r9[r5]
            int r8 = com.arlosoft.macrodroid.common.C4061t1.m15976V(r8, r9)
            if (r8 != r4) goto L_0x00aa
            r8 = 2131230895(0x7f0800af, float:1.8077856E38)
        L_0x00aa:
            android.content.Intent r9 = new android.content.Intent
            android.content.Context r10 = r13.mo27827K0()
            java.lang.Class<com.arlosoft.macrodroid.action.receivers.AndroidWearActionReceiver> r11 = com.arlosoft.macrodroid.action.receivers.AndroidWearActionReceiver.class
            r9.<init>(r10, r11)
            long[] r10 = r13.m_actionMacroGuids
            r11 = r10[r5]
            java.lang.String r10 = "AndroidWearActionMacroId"
            r9.putExtra(r10, r11)
            android.content.Context r10 = r13.mo27827K0()
            r11 = 268435456(0x10000000, float:2.5243549E-29)
            int r12 = com.arlosoft.macrodroid.utils.C6368b1.f14960c
            r11 = r11 | r12
            android.app.PendingIntent r9 = android.app.PendingIntent.getBroadcast(r10, r5, r9, r11)
            androidx.core.app.NotificationCompat$Action$Builder r10 = new androidx.core.app.NotificationCompat$Action$Builder
            java.lang.String[] r11 = r13.m_actionNames
            r11 = r11[r5]
            r10.<init>((int) r8, (java.lang.CharSequence) r11, (android.app.PendingIntent) r9)
            androidx.core.app.NotificationCompat$Action r8 = r10.build()
            r7.addAction(r8)
        L_0x00db:
            int r5 = r5 + 1
            goto L_0x0090
        L_0x00de:
            androidx.core.app.NotificationCompat$Builder r5 = new androidx.core.app.NotificationCompat$Builder
            android.content.Context r6 = r13.mo27827K0()
            r5.<init>(r6)
            androidx.core.app.NotificationCompat$Builder r2 = r5.setSmallIcon((int) r2)
            androidx.core.app.NotificationCompat$Builder r14 = r2.setContentTitle(r14)
            androidx.core.app.NotificationCompat$Builder r14 = r14.setContentText(r0)
            androidx.core.app.NotificationCompat$Builder r14 = r14.setContentIntent(r1)
            r0 = 2
            androidx.core.app.NotificationCompat$Builder r14 = r14.setPriority(r0)
            androidx.core.app.NotificationCompat$Builder r14 = r14.setDefaults(r4)
            androidx.core.app.NotificationCompat$Builder r14 = r14.extend(r7)
            java.lang.String r0 = "action_notification"
            androidx.core.app.NotificationCompat$Builder r14 = r14.setChannelId(r0)
            android.content.Context r0 = r13.mo27827K0()
            androidx.core.app.NotificationManagerCompat r0 = androidx.core.app.NotificationManagerCompat.from(r0)
            android.app.Notification r14 = r14.build()
            r0.notify(r3, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.AndroidWearAction.m9767R3(com.arlosoft.macrodroid.triggers.TriggerContextInfo):void");
    }

    /* renamed from: S3 */
    private void m9768S3(int i, ImageView imageView, int i2) {
        String str;
        int V;
        int i3 = i;
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.android_wear_notification_action);
        appCompatDialog.setTitle((CharSequence) mo25559a1());
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.android_wear_notification_action_title);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.android_wear_notification_action_enabled_radio_button);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.android_wear_notification_action_change_icon_button);
        this.m_iconImageAction = (ImageView) appCompatDialog.findViewById(C17532R$id.android_wear_notification_action_icon);
        ((RadioButton) appCompatDialog.findViewById(C17532R$id.android_wear_notification_action_disabled_radio_button)).setChecked(!this.m_actionEnabledStates[i3]);
        radioButton.setChecked(this.m_actionEnabledStates[i3]);
        editText.setText(this.m_actionNames[i3]);
        editText.setSelection(editText.length());
        String[] strArr = this.m_actionIcons;
        if (!(strArr == null || strArr[i3] == null || (V = C4061t1.m15976V(mo27827K0(), this.m_actionIcons[i3])) == -1)) {
            this.m_iconImage.setImageResource(V);
        }
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.android_wear_notification_action_macro_spinner);
        List<Macro> B = C4934n.m18998M().mo29672B(true);
        String[] strArr2 = new String[B.size()];
        int i4 = 0;
        for (int i5 = 0; i5 < B.size(); i5++) {
            if (this.m_actionMacroGuids[i3] == B.get(i5).getGUID()) {
                i4 = i5;
            }
            if (B.get(i5).getIsFavourite()) {
                str = "⭐ " + B.get(i5).getName();
            } else {
                str = B.get(i5).getName();
            }
            strArr2[i5] = str;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(j0, 17367048, strArr2);
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setSelection(i4);
        button3.setOnClickListener(new C3610y(this, i3, j0));
        editText.addTextChangedListener(new C2334b(button, editText, spinner));
        button.setOnClickListener(new C3016e0(this, appCompatDialog, i, radioButton, editText, B, spinner, imageView));
        button.setEnabled(editText.getText().length() > 0 && spinner.getAdapter().getCount() > 0);
        button2.setOnClickListener(new C2987d0(this, appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: T3 */
    private void m9769T3() {
        int V;
        int V2;
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.android_wear_notification);
        appCompatDialog.setTitle((CharSequence) mo25559a1());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.android_wear_notification_notification_text);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.android_wear_notification_subject_text);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.android_wear_notification_change_icon_button);
        this.m_iconImage = (ImageView) appCompatDialog.findViewById(C17532R$id.android_wear_notification_preview_image);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.android_wear_notification_magic_text_button);
        Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.android_wear_notification_magic_subject_button);
        Button button5 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        AppCompatDialog appCompatDialog2 = appCompatDialog;
        boolean z = true;
        ImageView[] imageViewArr = {(ImageView) appCompatDialog.findViewById(C17532R$id.android_wear_notification_action_1), (ImageView) appCompatDialog.findViewById(C17532R$id.android_wear_notification_action_2), (ImageView) appCompatDialog.findViewById(C17532R$id.android_wear_notification_action_3), (ImageView) appCompatDialog.findViewById(C17532R$id.android_wear_notification_action_4)};
        ImageView[] imageViewArr2 = {(ImageView) appCompatDialog.findViewById(C17532R$id.android_wear_notification_icon_action_1), (ImageView) appCompatDialog.findViewById(C17532R$id.android_wear_notification_icon_action_2), (ImageView) appCompatDialog.findViewById(C17532R$id.android_wear_notification_icon_action_3), (ImageView) appCompatDialog.findViewById(C17532R$id.android_wear_notification_icon_action_4)};
        for (int i = 0; i < 4; i++) {
            int identifier = mo27827K0().getResources().getIdentifier(this.m_actionIcons[i], TypedValues.Custom.S_STRING, mo27827K0().getPackageName());
            if (identifier == 0) {
                identifier = C17541R$string.fa_cog;
            }
            imageViewArr[i].setOnClickListener(new C3637z(this, i, imageViewArr2, identifier));
            String[] strArr = this.m_actionIcons;
            if (!(strArr == null || strArr[i] == null || (V2 = C4061t1.m15976V(mo27827K0(), this.m_actionIcons[i])) == -1)) {
                imageViewArr2[i].setImageResource(V2);
            }
            imageViewArr2[i].setAlpha(this.m_actionEnabledStates[i] ? 1.0f : 0.25f);
        }
        if (!(this.m_imageResourceName == null || (V = C4061t1.m15976V(mo27827K0(), this.m_imageResourceName)) == -1)) {
            this.m_iconImage.setImageResource(V);
        }
        button2.setOnClickListener(new C3583x(j0));
        String str = this.m_notificationText;
        if (str != null) {
            editText.setText(str);
            editText.setSelection(editText.length());
        }
        String str2 = this.m_notificationSubject;
        if (str2 != null) {
            editText2.setText(str2);
            editText2.setSelection(editText2.length());
        }
        C2333a aVar = new C2333a(button, editText, editText2);
        editText.addTextChangedListener(aVar);
        editText2.addTextChangedListener(aVar);
        AppCompatDialog appCompatDialog3 = appCompatDialog2;
        button.setOnClickListener(new C3045f0(this, appCompatDialog3, editText, editText2));
        if (editText.getText().length() <= 0 || editText2.getText().length() <= 0) {
            z = false;
        }
        button.setEnabled(z);
        button5.setOnClickListener(new C2959c0(this, appCompatDialog3));
        button4.setOnClickListener(new C2803a0(this, j0, new C3101h0(editText2)));
        button3.setOnClickListener(new C2931b0(this, j0, new C3129i0(editText)));
        appCompatDialog3.show();
    }

    /* renamed from: U3 */
    private void m9770U3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.action_pebble_vibrate_pattern);
        builder.setSingleChoiceItems((CharSequence[]) C6457x1.m24785a(), this.m_vibratePattern, (DialogInterface.OnClickListener) new C3327p0(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C3412s0.f9066a);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3297o0(this));
        builder.create().show();
    }

    /* renamed from: V3 */
    private void m9771V3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.action_set_wifi);
        builder.setSingleChoiceItems((CharSequence[]) m9773X3(), this.m_wifiOption, (DialogInterface.OnClickListener) new C3528v(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3073g0(this));
        builder.create().show();
    }

    /* renamed from: W3 */
    private String[] m9772W3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_android_wear_open_app), MacroDroidApplication.m14845u().getString(C17541R$string.action_android_wear_notification), MacroDroidApplication.m14845u().getString(C17541R$string.action_android_wear_vibrate_device), MacroDroidApplication.m14845u().getString(C17541R$string.action_android_wear_set_brightness), MacroDroidApplication.m14845u().getString(C17541R$string.action_android_wear_wake_screen), MacroDroidApplication.m14845u().getString(C17541R$string.action_set_wifi)};
    }

    /* renamed from: X3 */
    private String[] m9773X3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_wifi_enable), SelectableItem.m15535j1(C17541R$string.action_set_wifi_disable), SelectableItem.m15535j1(C17541R$string.action_set_wifi_toggle)};
    }

    /* renamed from: Y3 */
    private void m9774Y3(byte[] bArr) {
        String str;
        Activity j0 = mo27850j0();
        j0.runOnUiThread(new C3185k0(this));
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            str = null;
        }
        try {
            String[] split = str.split(":");
            if (split != null && split.length == 2) {
                int i = 0;
                String[] split2 = split[0].split(",");
                String[] split3 = split[1].split(",");
                if (this.m_packageToLaunch != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= split2.length) {
                            break;
                        } else if (this.m_packageToLaunch.equals(split2[i2])) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
                builder.setTitle((CharSequence) mo24772h1());
                builder.setSingleChoiceItems((CharSequence[]) split3, i, (DialogInterface.OnClickListener) new C3355q0(this, split2, split3));
                builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C3383r0.f9009a);
                builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3213l0(this));
                j0.runOnUiThread(new C3157j0(j0, builder));
            }
        } catch (Exception unused2) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public /* synthetic */ void m9775Z3(DialogInterface dialogInterface, int i) {
        this.m_brightness = i + 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public static /* synthetic */ void m9776a4(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public /* synthetic */ void m9777b4(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public /* synthetic */ void m9778c4(int i, Activity activity, View view) {
        this.m_actionIndex = i;
        Intent intent = new Intent(activity, IconSelectActivity.class);
        intent.putExtra("DisplayAppIcons", false);
        activity.startActivityForResult(intent, 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: d4 */
    public /* synthetic */ void m9779d4(AppCompatDialog appCompatDialog, int i, RadioButton radioButton, EditText editText, List list, Spinner spinner, ImageView imageView, View view) {
        appCompatDialog.cancel();
        this.m_actionEnabledStates[i] = radioButton.isChecked();
        this.m_actionNames[i] = editText.getText().toString();
        this.m_actionMacroGuids[i] = ((Macro) list.get(spinner.getSelectedItemPosition())).getGUID();
        int V = C4061t1.m15976V(mo27827K0(), this.m_actionIcons[i]);
        if (V != -1) {
            imageView.setAlpha(this.m_actionEnabledStates[i] ? 1.0f : 0.25f);
            imageView.setImageResource(V);
        }
        this.m_iconImageAction = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public /* synthetic */ void m9780e4(AppCompatDialog appCompatDialog, View view) {
        this.m_iconImageAction = null;
        appCompatDialog.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public /* synthetic */ void m9781f4(int i, ImageView[] imageViewArr, int i2, View view) {
        m9768S3(i, imageViewArr[i], i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: g4 */
    public static /* synthetic */ void m9782g4(Activity activity, View view) {
        Intent intent = new Intent(activity, IconSelectActivity.class);
        intent.putExtra("DisplayAppIcons", false);
        activity.startActivityForResult(intent, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: h4 */
    public /* synthetic */ void m9783h4(AppCompatDialog appCompatDialog, EditText editText, EditText editText2, View view) {
        appCompatDialog.cancel();
        this.m_notificationText = editText.getText().toString();
        this.m_notificationSubject = editText2.getText().toString();
        this.m_iconImage = null;
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public /* synthetic */ void m9784i4(AppCompatDialog appCompatDialog, View view) {
        this.m_iconImage = null;
        appCompatDialog.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static /* synthetic */ void m9786j4(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public /* synthetic */ void m9788k4(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public static /* synthetic */ void m9790l4(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public /* synthetic */ void m9792m4(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public /* synthetic */ void m9794n4(DialogInterface dialogInterface, int i) {
        this.m_vibratePattern = i;
        C6457x1.m24786b(mo27827K0(), this.m_vibratePattern);
    }

    /* access modifiers changed from: private */
    /* renamed from: o4 */
    public static /* synthetic */ void m9796o4(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public /* synthetic */ void m9798p4(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public /* synthetic */ void m9800q4(DialogInterface dialogInterface, int i) {
        this.m_wifiOption = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: r4 */
    public /* synthetic */ void m9802r4(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public static /* synthetic */ void m9804s4(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public /* synthetic */ void m9806t4(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public static /* synthetic */ void m9808u4(Activity activity, AlertDialog.Builder builder) {
        if (!((MacroDroidBaseActivity) activity).mo27315N1()) {
            builder.create().show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v4 */
    public /* synthetic */ void m9810v4() {
        try {
            C2009f fVar = this.m_progressDialog;
            if (fVar != null) {
                fVar.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w4 */
    public /* synthetic */ void m9812w4(String[] strArr, String[] strArr2, DialogInterface dialogInterface, int i) {
        this.m_packageToLaunch = strArr[i];
        this.m_applicationName = strArr2[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_notificationText, this.m_notificationSubject};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 2) {
            this.m_notificationText = strArr[0];
            this.m_notificationSubject = strArr[1];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        int i = this.m_option;
        if (i == 0) {
            return SelectableItem.m15535j1(C17541R$string.action_android_wear_open_app) + ": " + this.m_applicationName;
        } else if (i == 1) {
            return SelectableItem.m15535j1(C17541R$string.action_android_wear_notification) + ": " + this.m_notificationSubject;
        } else if (i == 2) {
            return SelectableItem.m15535j1(C17541R$string.action_android_wear_vibrate_device) + ": " + C6457x1.m24785a()[this.m_vibratePattern];
        } else if (i == 3) {
            return SelectableItem.m15535j1(C17541R$string.action_android_wear_set_brightness) + ": " + this.m_brightness;
        } else if (i == 4) {
            return SelectableItem.m15535j1(C17541R$string.action_android_wear_wake_screen);
        } else {
            if (i != 5) {
                return null;
            }
            return SelectableItem.m15535j1(C17541R$string.action_set_wifi) + ": " + m9773X3()[this.m_wifiOption];
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7745g.m32314u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        int i = this.m_option;
        if (i == 0) {
            AndroidWearService.m14326i(mo27827K0(), this.m_packageToLaunch);
        } else if (i == 1) {
            m9767R3(triggerContextInfo);
        } else if (i == 2) {
            AndroidWearService.m14330m(mo27827K0(), this.m_vibratePattern);
        } else if (i == 3) {
            AndroidWearService.m14327j(mo27827K0(), this.m_brightness);
        } else if (i == 4) {
            AndroidWearService.m14331n(mo27827K0());
        } else if (i == 5) {
            AndroidWearService.m14328k(mo27827K0(), this.m_wifiOption);
        }
    }

    /* renamed from: g */
    public void mo24754g(MessageEvent messageEvent) {
        if (messageEvent.getPath().equals("/macrodroid/response-installed-apps")) {
            m9774Y3(messageEvent.getData());
            Wearable.f48093c.mo56210b(this.m_googleApiClient, this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m9772W3();
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i2 == 0) {
            return;
        }
        if (i == 0) {
            this.m_imageResourceName = intent.getStringExtra("drawableName");
            if (this.m_iconImage != null) {
                this.m_iconImage.setImageResource(C4061t1.m15976V(mo27827K0(), this.m_imageResourceName));
            }
        } else if (i == 1) {
            this.m_actionIcons[this.m_actionIndex] = intent.getStringExtra("drawableName");
            int V = C4061t1.m15976V(mo27827K0(), this.m_actionIcons[this.m_actionIndex]);
            ImageView imageView = this.m_iconImageAction;
            if (imageView != null) {
                imageView.setImageResource(V);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.m_option;
        if (i == 0) {
            m9765P3();
        } else if (i == 1) {
            m9769T3();
        } else if (i == 2) {
            m9770U3();
        } else if (i == 3) {
            m9766Q3();
        } else if (i == 4) {
            super.mo24677v2();
        } else if (i != 5) {
            super.mo24677v2();
        } else {
            m9771V3();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeString(this.m_packageToLaunch);
        parcel.writeString(this.m_applicationName);
        parcel.writeInt(this.m_vibratePattern);
        parcel.writeInt(this.m_brightness);
        parcel.writeString(this.m_notificationText);
        parcel.writeString(this.m_notificationSubject);
        parcel.writeString(this.m_imageResourceName);
        parcel.writeStringArray(this.m_actionNames);
        parcel.writeStringArray(this.m_actionIcons);
        parcel.writeLongArray(this.m_actionMacroGuids);
        parcel.writeBooleanArray(this.m_actionEnabledStates);
        parcel.writeInt(this.m_wifiOption);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public AndroidWearAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
        this.m_option = 0;
        this.m_actionNames = new String[4];
        this.m_actionMacroGuids = new long[4];
        this.m_actionEnabledStates = new boolean[4];
        String j1 = SelectableItem.m15535j1(C17541R$string.fa_cog);
        this.m_actionIcons = new String[]{j1, j1, j1, j1};
    }

    private AndroidWearAction() {
    }

    private AndroidWearAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
        this.m_packageToLaunch = parcel.readString();
        this.m_applicationName = parcel.readString();
        this.m_vibratePattern = parcel.readInt();
        this.m_brightness = parcel.readInt();
        this.m_notificationText = parcel.readString();
        this.m_notificationSubject = parcel.readString();
        this.m_imageResourceName = parcel.readString();
        String[] strArr = new String[4];
        this.m_actionNames = strArr;
        parcel.readStringArray(strArr);
        String[] strArr2 = new String[4];
        this.m_actionIcons = strArr2;
        parcel.readStringArray(strArr2);
        long[] jArr = new long[4];
        this.m_actionMacroGuids = jArr;
        parcel.readLongArray(jArr);
        boolean[] zArr = new boolean[4];
        this.m_actionEnabledStates = zArr;
        parcel.readBooleanArray(zArr);
        this.m_wifiOption = parcel.readInt();
    }
}
