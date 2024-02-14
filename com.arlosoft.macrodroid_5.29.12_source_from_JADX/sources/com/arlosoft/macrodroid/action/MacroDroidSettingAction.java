package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.MacroDroidService;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.FaceUpDownConstraint;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5141f2;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Locale;
import p128m0.C7716c2;

public class MacroDroidSettingAction extends Action {
    public static final Parcelable.Creator<MacroDroidSettingAction> CREATOR = new C2537a();
    private static final int OPTION_ACTIVITY_RECOGNITION_UPDATE_RATE = 11;
    private static final int OPTION_DEVICE_FACING_CONSTRAINT_SCREEN_OFF = 15;
    private static final int OPTION_FLIP_DEVICE_SCREEN_OFF = 5;
    private static final int OPTION_FLIP_DEVICE_VIBRATE = 6;
    private static final int OPTION_FORCE_HIDE_NOTIFICATION_ICON = 12;
    private static final int OPTION_LIGHT_SENSOR_BG_SCAN = 14;
    private static final int OPTION_NOTIFICATION_BAR_ICON = 8;
    private static final int OPTION_NOTIFICATION_BLACK_BUTTON_BAR = 17;
    private static final int OPTION_NOTIFICATION_CELL_TOWER_UPDATE_RATE = 9;
    private static final int OPTION_NOTIFICATION_PRIORITY = 13;
    private static final int OPTION_NOTIFICATION_SHOW_BUTTON_BAR = 16;
    private static final int OPTION_PLAY_SOUND_AUDIO_STREAM = 3;
    private static final int OPTION_PROXIMITY_SENSOR_SCREEN_OFF = 7;
    private static final int OPTION_READ_SCREEN_CONTENTS_UPDATE_RATE = 19;
    private static final int OPTION_SHAKE_TRIGGER_WORK_WITH_SCREEN_OFF = 18;
    private static final int OPTION_SHOW_BUTTON_BAR = 0;
    private static final int OPTION_SHOW_LANGUAGE_TO_SPEAK = 1;
    private static final int OPTION_SHOW_SPOKEN_TEXT_AUDIO_STREAM = 2;
    private static final int OPTION_WIDGET_BUTTON_VIBRATE = 4;
    private static final int OPTION_WIFI_BACKGROUND_SCAN_RATE = 10;
    private int m_activityRecognitionUpdateRate;
    private int m_audioStreamSecondaryOption;
    private boolean m_booleanSecondayOption;
    private int m_cellTowerUpdateRate;
    private String m_languageSecondaryOption;
    private int m_lightSensorBgOption;
    private int m_notificationPriorityOption;
    private int m_option;
    private int m_wifiScanRate;
    private String readScreenUpdateRate;

    /* renamed from: com.arlosoft.macrodroid.action.MacroDroidSettingAction$a */
    class C2537a implements Parcelable.Creator<MacroDroidSettingAction> {
        C2537a() {
        }

        /* renamed from: a */
        public MacroDroidSettingAction createFromParcel(Parcel parcel) {
            return new MacroDroidSettingAction(parcel, (C2537a) null);
        }

        /* renamed from: b */
        public MacroDroidSettingAction[] newArray(int i) {
            return new MacroDroidSettingAction[i];
        }
    }

    /* synthetic */ MacroDroidSettingAction(Parcel parcel, C2537a aVar) {
        this(parcel);
    }

    /* renamed from: B3 */
    private String[] m11418B3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.action_macrodroid_settings_show_button_bar), MacroDroidApplication.m14845u().getString(C17541R$string.action_macrodroid_settings_language_to_speak), MacroDroidApplication.m14845u().getString(C17541R$string.action_macrodroid_settings_spoken_text_audio_stream), MacroDroidApplication.m14845u().getString(C17541R$string.action_macrodroid_settings_play_sound_audio_stream), MacroDroidApplication.m14845u().getString(C17541R$string.action_macrodroid_settings_widget_button_vibrate), MacroDroidApplication.m14845u().getString(C17541R$string.action_macrodroid_settings_flip_device_screen_off), MacroDroidApplication.m14845u().getString(C17541R$string.action_macrodroid_settings_flip_device_vibrate), MacroDroidApplication.m14845u().getString(C17541R$string.action_macrodroid_settings_proximity_sensore_screen_off), MacroDroidApplication.m14845u().getString(C17541R$string.action_macrodroid_settings_notification_bar_icon), MacroDroidApplication.m14845u().getString(C17541R$string.action_macrodroid_settings_cell_tower_update_rate), MacroDroidApplication.m14845u().getString(C17541R$string.action_macrodroid_settings_wifi_background_scan), MacroDroidApplication.m14845u().getString(C17541R$string.action_macrodroid_settings_activity_recognition_update_rate), MacroDroidApplication.m14845u().getString(C17541R$string.action_macrodroid_settings_force_hide_icon), MacroDroidApplication.m14845u().getString(C17541R$string.action_macrodroid_settings_notification_priority), SelectableItem.m15535j1(C17541R$string.light_sensor_bg_update_rate), SelectableItem.m15535j1(C17541R$string.constraint_face_up_down) + " - " + SelectableItem.m15535j1(C17541R$string.work_with_screen_off), SelectableItem.m15535j1(C17541R$string.configure_button_bar) + " - " + SelectableItem.m15535j1(C17541R$string.show_button_bar), SelectableItem.m15535j1(C17541R$string.configure_button_bar) + " - " + SelectableItem.m15535j1(C17541R$string.black_backgroud), SelectableItem.m15535j1(C17541R$string.shake_trigger) + " - " + SelectableItem.m15535j1(C17541R$string.work_with_screen_off), SelectableItem.m15535j1(C17541R$string.read_screen_update_rate)};
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public /* synthetic */ void m11419C3(int[] iArr, DialogInterface dialogInterface, int i) {
        this.m_activityRecognitionUpdateRate = iArr[i];
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m11420D3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m11421E3(int[] iArr, DialogInterface dialogInterface, int i) {
        this.m_audioStreamSecondaryOption = iArr[i];
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m11422F3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m11423G3(DialogInterface dialogInterface, int i) {
        this.m_booleanSecondayOption = i == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void m11424H3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public /* synthetic */ void m11425I3(int[] iArr, DialogInterface dialogInterface, int i) {
        this.m_cellTowerUpdateRate = iArr[i];
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public /* synthetic */ void m11426J3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public /* synthetic */ void m11427K3(String[] strArr, DialogInterface dialogInterface, int i) {
        this.m_languageSecondaryOption = strArr[i];
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public /* synthetic */ void m11428L3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public /* synthetic */ void m11429M3(int[] iArr, DialogInterface dialogInterface, int i) {
        this.m_lightSensorBgOption = iArr[i];
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public /* synthetic */ void m11430N3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public /* synthetic */ void m11431O3(String[] strArr, DialogInterface dialogInterface, int i) {
        this.m_notificationPriorityOption = Integer.valueOf(strArr[i]).intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public /* synthetic */ void m11432P3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public /* synthetic */ void m11433Q3(String[] strArr, DialogInterface dialogInterface, int i) {
        this.readScreenUpdateRate = strArr[i];
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public /* synthetic */ void m11434R3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public /* synthetic */ void m11435S3(int[] iArr, DialogInterface dialogInterface, int i) {
        this.m_wifiScanRate = iArr[i];
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public /* synthetic */ void m11436T3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* renamed from: U3 */
    private synchronized void m11437U3() {
        Macro.setMacroDroidEnabledState(false);
        C4934n.m18998M().mo29694n0();
        Macro.setMacroDroidEnabledState(true);
        C4934n.m18998M().mo29694n0();
    }

    /* renamed from: V3 */
    private void m11438V3(String str) {
        String[] stringArray = mo27827K0().getResources().getStringArray(C17525R$array.activity_recognition_trigger_update_rates);
        String[] stringArray2 = mo27827K0().getResources().getStringArray(C17525R$array.activity_recognition_trigger_update_rate_names);
        int length = stringArray2.length;
        int[] iArr = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = Integer.valueOf(stringArray[i2]).intValue();
            if (this.m_activityRecognitionUpdateRate == iArr[i2]) {
                i = i2;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) str);
        builder.setSingleChoiceItems((CharSequence[]) stringArray2, i, (DialogInterface.OnClickListener) new C3336p9(this, iArr));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3538v9(this));
        builder.create().show();
    }

    /* renamed from: W3 */
    private void m11439W3(String str) {
        String[] stringArray = mo27827K0().getResources().getStringArray(C17525R$array.audio_streams);
        String[] stringArray2 = mo27827K0().getResources().getStringArray(C17525R$array.audio_streams_values);
        int length = stringArray2.length;
        int[] iArr = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = Integer.valueOf(stringArray2[i2]).intValue();
            if (this.m_audioStreamSecondaryOption == iArr[i2]) {
                i = i2;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) str);
        builder.setSingleChoiceItems((CharSequence[]) stringArray, i, (DialogInterface.OnClickListener) new C3250m9(this, iArr));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3593x9(this));
        builder.create().show();
    }

    /* renamed from: X3 */
    private void m11440X3(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) str);
        builder.setSingleChoiceItems((CharSequence[]) new String[]{mo27827K0().getString(C17541R$string.enable), mo27827K0().getString(C17541R$string.disable)}, this.m_booleanSecondayOption ^ true ? 1 : 0, (DialogInterface.OnClickListener) new C2813aa(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C2941ba(this));
        builder.create().show();
    }

    /* renamed from: Y3 */
    private void m11441Y3(String str) {
        String[] stringArray = mo27827K0().getResources().getStringArray(C17525R$array.cell_tower_trigger_update_rates);
        String[] stringArray2 = mo27827K0().getResources().getStringArray(C17525R$array.cell_tower_trigger_update_rate_names);
        int length = stringArray2.length;
        int[] iArr = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = Integer.valueOf(stringArray[i2]).intValue();
            if (this.m_cellTowerUpdateRate == iArr[i2]) {
                i = i2;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) str);
        builder.setSingleChoiceItems((CharSequence[]) stringArray2, i, (DialogInterface.OnClickListener) new C3222l9(this, iArr));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3194k9(this));
        builder.create().show();
    }

    /* renamed from: Z3 */
    private void m11442Z3(String str) {
        Locale[] localeArr = C5163j2.f12950b;
        String[] strArr = new String[localeArr.length];
        int i = 0;
        for (int i2 = 0; i2 < localeArr.length; i2++) {
            strArr[i2] = localeArr[i2].getDisplayName();
            if (this.m_languageSecondaryOption == null) {
                this.m_languageSecondaryOption = strArr[i2];
            }
            if (this.m_languageSecondaryOption.equals(strArr[i2])) {
                i = i2;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) str);
        builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) new C3392r9(this, strArr));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3475t9(this));
        builder.create().show();
    }

    /* renamed from: a4 */
    private void m11443a4(String str) {
        String[] stringArray = mo27827K0().getResources().getStringArray(C17525R$array.wifi_background_scan_rates);
        String[] stringArray2 = mo27827K0().getResources().getStringArray(C17525R$array.wifi_background_scan_rate_names);
        int length = stringArray2.length;
        int[] iArr = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = Integer.valueOf(stringArray[i2]).intValue();
            if (this.m_lightSensorBgOption == iArr[i2]) {
                i = i2;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) str);
        builder.setSingleChoiceItems((CharSequence[]) stringArray2, i, (DialogInterface.OnClickListener) new C3306o9(this, iArr));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3620y9(this));
        builder.create().show();
    }

    /* renamed from: b4 */
    private void m11444b4(String str) {
        String[] stringArray = mo27827K0().getResources().getStringArray(C17525R$array.notification_priority_values);
        String[] stringArray2 = mo27827K0().getResources().getStringArray(C17525R$array.notification_priority_names);
        int[] iArr = new int[stringArray2.length];
        int i = 0;
        for (int i2 = 0; i2 < stringArray.length; i2++) {
            iArr[i2] = Integer.valueOf(stringArray[i2]).intValue();
            if (this.m_notificationPriorityOption == iArr[i2]) {
                i = i2;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) str);
        builder.setSingleChoiceItems((CharSequence[]) stringArray2, i, (DialogInterface.OnClickListener) new C3421s9(this, stringArray));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3511u9(this));
        builder.create().show();
    }

    /* renamed from: c4 */
    private void m11445c4() {
        String[] stringArray = mo27827K0().getResources().getStringArray(C17525R$array.read_screen_content_update_rate_seconds);
        if (this.readScreenUpdateRate == null) {
            int v1 = C5163j2.m20280v1(mo27827K0());
            if (v1 > 1000) {
                this.readScreenUpdateRate = String.valueOf(v1 / 1000);
            } else {
                this.readScreenUpdateRate = String.valueOf(((double) v1) / 1000.0d);
            }
        }
        int i = 0;
        for (int i2 = 0; i2 < stringArray.length; i2++) {
            if (this.readScreenUpdateRate.equals(stringArray[i2]) || this.readScreenUpdateRate.equals(stringArray[i2])) {
                i = i2;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.read_screen_update_rate_seconds);
        builder.setSingleChoiceItems((CharSequence[]) stringArray, i, (DialogInterface.OnClickListener) new C3364q9(this, stringArray));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3647z9(this));
        builder.create().show();
    }

    /* renamed from: d4 */
    private void m11446d4(String str) {
        String[] stringArray = mo27827K0().getResources().getStringArray(C17525R$array.wifi_background_scan_rates);
        String[] stringArray2 = mo27827K0().getResources().getStringArray(C17525R$array.wifi_background_scan_rate_names);
        int length = stringArray2.length;
        int[] iArr = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = Integer.valueOf(stringArray[i2]).intValue();
            if (this.m_wifiScanRate == iArr[i2]) {
                i = i2;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) str);
        builder.setSingleChoiceItems((CharSequence[]) stringArray2, i, (DialogInterface.OnClickListener) new C3278n9(this, iArr));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3566w9(this));
        builder.create().show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m11418B3()[this.m_option];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7716c2.m32171u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        switch (this.m_option) {
            case 0:
                C5163j2.m19936B5(mo27827K0(), this.m_booleanSecondayOption);
                MacroDroidService.m9500e(mo27827K0());
                return;
            case 1:
                if (this.m_languageSecondaryOption != null) {
                    C5163j2.m20053R5(mo27827K0(), this.m_languageSecondaryOption);
                    return;
                }
                return;
            case 2:
                C5163j2.m20060S5(mo27827K0(), this.m_audioStreamSecondaryOption);
                return;
            case 3:
                C5163j2.m20087W4(mo27827K0(), this.m_audioStreamSecondaryOption);
                return;
            case 4:
                C5163j2.m20221n6(mo27827K0(), this.m_booleanSecondayOption);
                return;
            case 5:
                C5163j2.m20023N3(mo27827K0(), this.m_booleanSecondayOption);
                m11437U3();
                return;
            case 6:
                C5163j2.m20030O3(mo27827K0(), this.m_booleanSecondayOption);
                return;
            case 7:
                C5163j2.m20124b5(mo27827K0(), this.m_booleanSecondayOption);
                m11437U3();
                return;
            case 8:
                C5163j2.m20065T3(mo27827K0(), this.m_booleanSecondayOption);
                MacroDroidService.m9500e(mo27827K0());
                return;
            case 9:
                C5163j2.m20266t3(mo27827K0(), this.m_cellTowerUpdateRate);
                mo27827K0().sendBroadcast(new Intent("CellTowerUpdateRateIntent"));
                return;
            case 10:
                C5163j2.m20229o6(mo27827K0(), this.m_wifiScanRate);
                mo27827K0().sendBroadcast(new Intent("WifiBackgroundScanRateIntent"));
                return;
            case 11:
                C5163j2.m20170h3(mo27827K0(), this.m_activityRecognitionUpdateRate);
                mo27827K0().sendBroadcast(new Intent("ActivityRecognitionUpdateRateIntent"));
                return;
            case 12:
                C5163j2.m20037P3(mo27827K0(), this.m_booleanSecondayOption);
                MacroDroidService.m9500e(mo27827K0());
                return;
            case 13:
                C5163j2.m20052R4(mo27827K0(), this.m_notificationPriorityOption);
                MacroDroidService.m9500e(mo27827K0());
                return;
            case 14:
                C5163j2.m20259s4(mo27827K0(), this.m_lightSensorBgOption);
                mo27827K0().sendBroadcast(new Intent("LightSensorBackgroundScanRateIntent"));
                return;
            case 15:
                SelectableItem.m15520I2(mo27827K0(), FaceUpDownConstraint.f10716f, this.m_booleanSecondayOption);
                FaceUpDownConstraint.m16455B3();
                return;
            case 16:
                C5163j2.m19936B5(mo27827K0(), this.m_booleanSecondayOption);
                MacroDroidService.m9502g(mo27827K0(), true);
                return;
            case 17:
                C5163j2.m20226o3(mo27827K0(), this.m_booleanSecondayOption);
                MacroDroidService.m9502g(mo27827K0(), true);
                return;
            case 18:
                C5163j2.m20236p5(mo27827K0(), this.m_booleanSecondayOption);
                C5141f2.m19811F2();
                return;
            case 19:
                C5163j2.m20188j5(mo27827K0(), this.readScreenUpdateRate);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m11418B3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (mo27836X()) {
            String[] B3 = m11418B3();
            int i = this.m_option;
            switch (i) {
                case 0:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                    m11440X3(B3[i]);
                    return;
                case 1:
                    m11442Z3(B3[i]);
                    return;
                case 2:
                case 3:
                    m11439W3(B3[i]);
                    return;
                case 9:
                    m11441Y3(B3[i]);
                    return;
                case 10:
                    m11446d4(B3[i]);
                    return;
                case 11:
                    m11438V3(B3[i]);
                    return;
                case 13:
                    m11444b4(B3[i]);
                    return;
                case 14:
                    m11443a4(B3[i]);
                    return;
                case 19:
                    m11445c4();
                    return;
                default:
                    return;
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeInt(this.m_booleanSecondayOption ^ true ? 1 : 0);
        parcel.writeInt(this.m_audioStreamSecondaryOption);
        parcel.writeString(this.m_languageSecondaryOption);
        parcel.writeInt(this.m_cellTowerUpdateRate);
        parcel.writeInt(this.m_wifiScanRate);
        parcel.writeInt(this.m_activityRecognitionUpdateRate);
        parcel.writeInt(this.m_notificationPriorityOption);
        parcel.writeInt(this.m_lightSensorBgOption);
        parcel.writeString(this.readScreenUpdateRate);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public MacroDroidSettingAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private MacroDroidSettingAction() {
        this.m_option = 0;
        this.m_booleanSecondayOption = true;
    }

    private MacroDroidSettingAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
        this.m_booleanSecondayOption = parcel.readInt() == 0;
        this.m_audioStreamSecondaryOption = parcel.readInt();
        this.m_languageSecondaryOption = parcel.readString();
        this.m_cellTowerUpdateRate = parcel.readInt();
        this.m_wifiScanRate = parcel.readInt();
        this.m_activityRecognitionUpdateRate = parcel.readInt();
        this.m_notificationPriorityOption = parcel.readInt();
        this.m_lightSensorBgOption = parcel.readInt();
        this.readScreenUpdateRate = parcel.readString();
    }
}
