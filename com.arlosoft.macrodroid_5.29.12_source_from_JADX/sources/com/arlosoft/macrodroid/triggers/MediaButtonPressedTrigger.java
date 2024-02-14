package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.MediaButtonTriggerReceiver;
import p119k3.C7572x0;
import p148q0.C8151a;

public class MediaButtonPressedTrigger extends Trigger {
    public static final Parcelable.Creator<MediaButtonPressedTrigger> CREATOR = new C5697b();

    /* renamed from: d */
    public static final String f13644d = MacroDroidApplication.m14845u().getString(C17541R$string.trigger_media_button_pressed_single_press);

    /* renamed from: f */
    public static final String f13645f = MacroDroidApplication.m14845u().getString(C17541R$string.trigger_media_button_pressed_2_presses);

    /* renamed from: g */
    public static final String f13646g = MacroDroidApplication.m14845u().getString(C17541R$string.trigger_media_button_pressed_3_presses);

    /* renamed from: o */
    public static final String f13647o = MacroDroidApplication.m14845u().getString(C17541R$string.trigger_media_button_pressed_long_press);
    /* access modifiers changed from: private */
    public static AudioManager s_audioManager;
    /* access modifiers changed from: private */
    public static Handler s_handler;
    private static MediaButtonTriggerReceiver s_mediaButtonTriggerReceiver;
    /* access modifiers changed from: private */
    public static ComponentName s_remoteControlResponder;
    private static ScreenOnOffReceiver s_screenOnOffTriggerReceiver;
    private static int s_triggerCounter = 0;
    private boolean m_cancelPress;
    private String m_option;

    public static class ScreenOnOffReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            intent.getAction().equals("android.intent.action.SCREEN_ON");
            if (MediaButtonPressedTrigger.s_audioManager != null) {
                MediaButtonPressedTrigger.s_audioManager.registerMediaButtonEventReceiver(MediaButtonPressedTrigger.s_remoteControlResponder);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.MediaButtonPressedTrigger$a */
    class C5696a implements Runnable {
        C5696a() {
        }

        public void run() {
            MediaButtonPressedTrigger.s_audioManager.registerMediaButtonEventReceiver(MediaButtonPressedTrigger.s_remoteControlResponder);
            MediaButtonPressedTrigger.s_handler.postDelayed(this, 5000);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.MediaButtonPressedTrigger$b */
    class C5697b implements Parcelable.Creator<MediaButtonPressedTrigger> {
        C5697b() {
        }

        /* renamed from: a */
        public MediaButtonPressedTrigger createFromParcel(Parcel parcel) {
            return new MediaButtonPressedTrigger(parcel, (C5696a) null);
        }

        /* renamed from: b */
        public MediaButtonPressedTrigger[] newArray(int i) {
            return new MediaButtonPressedTrigger[i];
        }
    }

    /* synthetic */ MediaButtonPressedTrigger(Parcel parcel, C5696a aVar) {
        this(parcel);
    }

    /* renamed from: o3 */
    private String[] m22678o3() {
        return new String[]{f13644d, f13645f, f13646g, f13647o};
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m22679p3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, AppCompatDialog appCompatDialog, View view) {
        if (radioButton.isChecked()) {
            this.m_option = f13644d;
        } else if (radioButton2.isChecked()) {
            this.m_option = f13645f;
        } else if (radioButton3.isChecked()) {
            this.m_option = f13646g;
        } else {
            this.m_option = f13647o;
        }
        appCompatDialog.dismiss();
        mo24677v2();
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m22681r3(ResolveInfo resolveInfo, DialogInterface dialogInterface, int i) {
        mo27827K0().startActivity(m22683t3(mo27827K0(), resolveInfo.activityInfo.packageName));
        super.mo24677v2();
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void m22682s3(DialogInterface dialogInterface, int i) {
        super.mo24677v2();
    }

    /* renamed from: t3 */
    public static Intent m22683t3(Context context, String str) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("package:" + str));
        return intent;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_option;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_mediaButtonTriggerReceiver);
                s_audioManager.unregisterMediaButtonEventReceiver(s_remoteControlResponder);
                MacroDroidApplication.m14845u().unregisterReceiver(s_screenOnOffTriggerReceiver);
                s_handler.removeCallbacksAndMessages((Object) null);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_mediaButtonTriggerReceiver = null;
            s_screenOnOffTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7572x0.m31523u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_mediaButtonTriggerReceiver = new MediaButtonTriggerReceiver();
            s_screenOnOffTriggerReceiver = new ScreenOnOffReceiver();
            s_audioManager = (AudioManager) MacroDroidApplication.m14845u().getSystemService("audio");
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            intentFilter.setPriority(Integer.MAX_VALUE);
            MacroDroidApplication.m14845u().registerReceiver(s_mediaButtonTriggerReceiver, intentFilter);
            ComponentName componentName = new ComponentName(mo27827K0().getPackageName(), MediaButtonTriggerReceiver.class.getName());
            s_remoteControlResponder = componentName;
            s_audioManager.registerMediaButtonEventReceiver(componentName);
            IntentFilter intentFilter2 = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter2.addAction("android.intent.action.SCREEN_OFF");
            MacroDroidApplication.m14845u().registerReceiver(s_screenOnOffTriggerReceiver, intentFilter2);
            Handler handler = new Handler();
            s_handler = handler;
            handler.postDelayed(new C5696a(), 5000);
        }
        s_triggerCounter++;
    }

    /* renamed from: W1 */
    public void mo25540W1() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_media_button_pressed_options);
        appCompatDialog.setTitle((int) C17541R$string.trigger_media_button_pressed_title);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.single_press);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.double_press);
        RadioButton radioButton3 = (RadioButton) appCompatDialog.findViewById(C17532R$id.treble_press);
        RadioButton radioButton4 = (RadioButton) appCompatDialog.findViewById(C17532R$id.long_press);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        if (this.m_option.equals(f13645f)) {
            radioButton2.setChecked(true);
        } else if (this.m_option.equals(f13646g)) {
            radioButton3.setChecked(true);
        } else if (this.m_option.equals(f13647o)) {
            radioButton4.setChecked(true);
        } else {
            radioButton.setChecked(true);
        }
        button.setOnClickListener(new C6210z4(this, radioButton, radioButton2, radioButton3, appCompatDialog));
        button2.setOnClickListener(new C6198y4(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: n3 */
    public String mo31320n3() {
        return this.m_option;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (!this.m_option.equals(f13647o)) {
            super.mo24677v2();
            return;
        }
        PackageManager packageManager = mo27827K0().getPackageManager();
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.speech.action.WEB_SEARCH"), 65536);
        String str = resolveActivity.activityInfo.packageName;
        String charSequence = resolveActivity.loadLabel(packageManager).toString();
        if (str.equals("com.arlosoft.macrodroid") || str.equals("android")) {
            super.mo24677v2();
            return;
        }
        new AlertDialog.Builder(mo27850j0(), mo24705l0()).setTitle((int) C17541R$string.trigger_media_button_pressed).setMessage((CharSequence) String.format(mo27827K0().getString(C17541R$string.clear_long_press_default), new Object[]{charSequence})).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6186x4(this, resolveActivity)).setNegativeButton(17039360, (DialogInterface.OnClickListener) new C6174w4(this)).show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_option);
        parcel.writeInt(this.m_cancelPress ? 1 : 0);
    }

    public MediaButtonPressedTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
        this.m_cancelPress = false;
    }

    private MediaButtonPressedTrigger() {
        this.m_option = m22678o3()[0];
    }

    private MediaButtonPressedTrigger(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readString();
        this.m_cancelPress = parcel.readInt() == 0;
    }
}
