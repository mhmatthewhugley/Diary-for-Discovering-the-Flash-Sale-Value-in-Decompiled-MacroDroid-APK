package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.quicksettings.QuickSettingButton;
import com.arlosoft.macrodroid.quicksettings.QuickSettingsActivity;
import com.arlosoft.macrodroid.quicksettings.QuickSettingsData;
import java.util.List;
import p119k3.C7529l1;
import p144p2.C8059d;
import p319lc.C15626c;

public class QuickSettingsTileTrigger extends Trigger {
    public static final Parcelable.Creator<QuickSettingsTileTrigger> CREATOR = new C5725a();
    private int REQUEST_CODE_QUICK_SETTINGS;
    private transient ArrayAdapter itemsAdapter;
    private transient ListView listView;
    private int m_tileOption;
    private int m_toggleOption;

    /* renamed from: com.arlosoft.macrodroid.triggers.QuickSettingsTileTrigger$a */
    class C5725a implements Parcelable.Creator<QuickSettingsTileTrigger> {
        C5725a() {
        }

        /* renamed from: a */
        public QuickSettingsTileTrigger createFromParcel(Parcel parcel) {
            return new QuickSettingsTileTrigger(parcel, (C5725a) null);
        }

        /* renamed from: b */
        public QuickSettingsTileTrigger[] newArray(int i) {
            return new QuickSettingsTileTrigger[i];
        }
    }

    /* synthetic */ QuickSettingsTileTrigger(Parcel parcel, C5725a aVar) {
        this(parcel);
    }

    /* renamed from: m3 */
    private void m22997m3() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, C17542R$style.Theme_App_Dialog_Trigger);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_quick_settings_trigger);
        appCompatDialog.setTitle((int) C17541R$string.select_option);
        this.listView = (ListView) appCompatDialog.findViewById(2131363053);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.configure_tiles);
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        textView.setOnClickListener(new C6019n6(this, j0));
        C8059d dVar = new C8059d(appCompatDialog.getContext(), m22998o3(), m22999p3());
        this.itemsAdapter = dVar;
        this.listView.setAdapter(dVar);
        this.listView.setChoiceMode(1);
        this.listView.setSelection(this.m_tileOption);
        this.listView.setItemChecked(this.m_tileOption, true);
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C6031o6(this, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C6043p6(this, appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: o3 */
    private String[] m22998o3() {
        QuickSettingsData quickSettingsData = (QuickSettingsData) MacroDroidApplication.m14845u().mo27293q(QuickSettingsData.QUICK_SETTINGS_CACHE).mo37133c(QuickSettingsData.QUICK_SETTINGS_DATA_KEY, QuickSettingsData.class);
        int length = m23000q3().length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String str = null;
            if (quickSettingsData != null) {
                str = quickSettingsData.getQuickSettingsButtonList().get(i).getLabel();
            }
            if (TextUtils.isEmpty(str)) {
                str = m23000q3()[i];
            }
            strArr[i] = str;
        }
        return strArr;
    }

    /* renamed from: p3 */
    private boolean[] m22999p3() {
        QuickSettingsData quickSettingsData = (QuickSettingsData) MacroDroidApplication.m14845u().mo27293q(QuickSettingsData.QUICK_SETTINGS_CACHE).mo37133c(QuickSettingsData.QUICK_SETTINGS_DATA_KEY, QuickSettingsData.class);
        if (quickSettingsData == null) {
            quickSettingsData = QuickSettingsData.createDefault();
        }
        List<QuickSettingButton> quickSettingsButtonList = quickSettingsData.getQuickSettingsButtonList();
        boolean[] zArr = new boolean[8];
        int i = 0;
        while (i < quickSettingsButtonList.size() && i < 8) {
            zArr[i] = quickSettingsButtonList.get(i).getEnabled();
            i++;
        }
        return zArr;
    }

    /* renamed from: q3 */
    private String[] m23000q3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.macrodroid_tile_1), SelectableItem.m15535j1(C17541R$string.macrodroid_tile_2), SelectableItem.m15535j1(C17541R$string.macrodroid_tile_3), SelectableItem.m15535j1(C17541R$string.macrodroid_tile_4), SelectableItem.m15535j1(C17541R$string.macrodroid_tile_5), SelectableItem.m15535j1(C17541R$string.macrodroid_tile_6), SelectableItem.m15535j1(C17541R$string.macrodroid_tile_7), SelectableItem.m15535j1(C17541R$string.macrodroid_tile_8)};
    }

    /* renamed from: t3 */
    private String[] m23001t3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_quick_settings_option_toggle_on), SelectableItem.m15535j1(C17541R$string.trigger_quick_settings_option_toggle_off)};
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m23002u3(Activity activity, View view) {
        activity.startActivityForResult(new Intent(activity, QuickSettingsActivity.class), this.REQUEST_CODE_QUICK_SETTINGS);
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m23003v3(AppCompatDialog appCompatDialog, View view) {
        this.m_tileOption = this.listView.getCheckedItemPosition();
        appCompatDialog.dismiss();
        mo31423n3();
        this.listView = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m23004w3(AppCompatDialog appCompatDialog, View view) {
        appCompatDialog.dismiss();
        this.listView = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m23006y3(DialogInterface dialogInterface, int i) {
        this.m_toggleOption = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m23007z3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(this.m_toggleOption == 0 ? C17541R$string.quick_tile_on_press : C17541R$string.quick_tile_off);
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        QuickSettingsData quickSettingsData = (QuickSettingsData) MacroDroidApplication.m14845u().mo27293q(QuickSettingsData.QUICK_SETTINGS_CACHE).mo37133c(QuickSettingsData.QUICK_SETTINGS_DATA_KEY, QuickSettingsData.class);
        String label = quickSettingsData != null ? quickSettingsData.getQuickSettingsButtonList().get(this.m_tileOption).getLabel() : null;
        return TextUtils.isEmpty(label) ? m23000q3()[this.m_tileOption] : label;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7529l1.m31323u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n3 */
    public void mo31423n3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_option);
        builder.setSingleChoiceItems((CharSequence[]) m23001t3(), this.m_toggleOption, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C6007m6.f14194a);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5995l6(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C5983k6(this));
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        if (i == this.REQUEST_CODE_QUICK_SETTINGS && i2 == -1 && this.itemsAdapter != null && this.listView != null) {
            C8059d dVar = new C8059d(new ContextThemeWrapper(activity, C17542R$style.Theme_App_Dialog_Trigger), m22998o3(), m22999p3());
            this.itemsAdapter = dVar;
            this.listView.setAdapter(dVar);
            this.listView.setSelection(this.m_tileOption);
            this.listView.setItemChecked(this.m_tileOption, true);
        }
    }

    /* renamed from: r3 */
    public int mo31424r3() {
        return this.m_tileOption + 1;
    }

    /* renamed from: s3 */
    public int mo31425s3() {
        return this.m_toggleOption;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (Build.VERSION.SDK_INT < 24) {
            Context applicationContext = mo27827K0().getApplicationContext();
            C15626c.m94876a(applicationContext, SelectableItem.m15535j1(C17541R$string.sorry_this_feature_requires_android_version) + "7.0+", 0).show();
            return;
        }
        m22997m3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_tileOption);
        parcel.writeInt(this.m_toggleOption);
    }

    public QuickSettingsTileTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public QuickSettingsTileTrigger() {
        this.REQUEST_CODE_QUICK_SETTINGS = 9212945;
    }

    private QuickSettingsTileTrigger(Parcel parcel) {
        super(parcel);
        this.REQUEST_CODE_QUICK_SETTINGS = 9212945;
        this.m_tileOption = parcel.readInt();
        this.m_toggleOption = parcel.readInt();
    }
}
