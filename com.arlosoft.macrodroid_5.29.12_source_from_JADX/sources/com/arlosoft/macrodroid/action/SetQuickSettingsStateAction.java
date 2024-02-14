package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.events.QuickSettingSetToggleStateEvent;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.quicksettings.QuickSettingButton;
import com.arlosoft.macrodroid.quicksettings.QuickSettingsData;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectActivity;
import java.lang.ref.WeakReference;
import java.util.List;
import p057a2.C2224m;
import p081e1.C7264a;
import p128m0.C7884y3;
import p144p2.C8059d;
import p148q0.C8151a;
import p161s1.C10180a;
import p319lc.C15626c;

public class SetQuickSettingsStateAction extends Action implements C2224m {
    public static final Parcelable.Creator<SetQuickSettingsStateAction> CREATOR = new C2655a();
    private static final int REQUEST_CODE_QUICK_SETTINGS = 21765234;
    private static final int REQUEST_CODE_SELECT_ICON = 837834;
    private transient WeakReference<ImageView> iconRef;
    private int iconRes;
    private String iconResName;
    private transient C8059d itemsAdapter;
    private String label;
    private transient ListView listView;
    private int m_tileOption;
    private int m_toggleOption;
    private transient int selectedIconRes;
    private transient String selectedIconResName;
    private transient int selectedTileOption;
    private boolean setImage;
    private boolean setLabel;
    private boolean setToggleState;

    /* renamed from: com.arlosoft.macrodroid.action.SetQuickSettingsStateAction$a */
    class C2655a implements Parcelable.Creator<SetQuickSettingsStateAction> {
        C2655a() {
        }

        /* renamed from: a */
        public SetQuickSettingsStateAction createFromParcel(Parcel parcel) {
            return new SetQuickSettingsStateAction(parcel, (C2655a) null);
        }

        /* renamed from: b */
        public SetQuickSettingsStateAction[] newArray(int i) {
            return new SetQuickSettingsStateAction[i];
        }
    }

    /* synthetic */ SetQuickSettingsStateAction(Parcel parcel, C2655a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static /* synthetic */ void m12576A3(RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, CompoundButton compoundButton, boolean z) {
        radioButton.setEnabled(z);
        radioButton2.setEnabled(z);
        radioGroup.setAlpha(z ? 1.0f : 0.5f);
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static /* synthetic */ void m12577B3(EditText editText, CompoundButton compoundButton, boolean z) {
        editText.setEnabled(z);
        editText.setAlpha(z ? 1.0f : 0.5f);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static /* synthetic */ void m12578C3(ViewGroup viewGroup, ImageView imageView, CompoundButton compoundButton, boolean z) {
        viewGroup.setAlpha(z ? 1.0f : 0.5f);
        imageView.setEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static /* synthetic */ void m12579D3(Activity activity, View view) {
        Intent intent = new Intent(activity, IconSelectActivity.class);
        intent.putExtra("DisplayAppIcons", false);
        activity.startActivityForResult(intent, REQUEST_CODE_SELECT_ICON);
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static /* synthetic */ void m12580E3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m12581F3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m12582G3(CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, Activity activity, RadioButton radioButton, EditText editText, AppCompatDialog appCompatDialog, View view) {
        if (checkBox.isChecked() || checkBox2.isChecked() || checkBox3.isChecked()) {
            this.m_tileOption = this.selectedTileOption;
            this.setLabel = checkBox.isChecked();
            this.setToggleState = checkBox2.isChecked();
            this.setImage = checkBox3.isChecked();
            this.m_toggleOption = radioButton.isChecked() ^ true ? 1 : 0;
            this.label = editText.getText().toString();
            this.iconRes = this.selectedIconRes;
            this.iconResName = this.selectedIconResName;
            mo24689O1();
            appCompatDialog.dismiss();
            return;
        }
        C15626c.makeText(activity.getApplicationContext(), C17541R$string.action_set_bluetooth_invalid, 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public /* synthetic */ void m12584I3(AppCompatDialog appCompatDialog, View view) {
        this.selectedTileOption = this.listView.getCheckedItemPosition();
        appCompatDialog.dismiss();
        mo25677u3();
        this.listView = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public /* synthetic */ void m12585J3(AppCompatDialog appCompatDialog, View view) {
        appCompatDialog.dismiss();
        this.listView = null;
    }

    /* renamed from: v3 */
    private void m12597v3() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, C17542R$style.Theme_App_Dialog_Action);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_quick_settings_trigger);
        appCompatDialog.setTitle((int) C17541R$string.action_set_quick_settings_state);
        this.selectedTileOption = this.m_tileOption;
        this.listView = (ListView) appCompatDialog.findViewById(2131363053);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.configure_tiles);
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        textView.setOnClickListener(new C3202kh(j0));
        C8059d dVar = new C8059d(appCompatDialog.getContext(), m12598w3(), m12599x3());
        this.itemsAdapter = dVar;
        this.listView.setAdapter(dVar);
        this.listView.setChoiceMode(1);
        this.listView.setSelection(this.m_tileOption);
        this.listView.setItemChecked(this.m_tileOption, true);
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C3314oh(this, appCompatDialog));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C3344ph(this, appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: w3 */
    private String[] m12598w3() {
        QuickSettingsData quickSettingsData = (QuickSettingsData) MacroDroidApplication.m14845u().mo27293q(QuickSettingsData.QUICK_SETTINGS_CACHE).mo37133c(QuickSettingsData.QUICK_SETTINGS_DATA_KEY, QuickSettingsData.class);
        int length = m12600y3().length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String str = null;
            if (quickSettingsData != null) {
                str = quickSettingsData.getQuickSettingsButtonList().get(i).getLabel();
            }
            if (TextUtils.isEmpty(str)) {
                str = m12600y3()[i];
            }
            strArr[i] = str;
        }
        return strArr;
    }

    /* renamed from: x3 */
    private boolean[] m12599x3() {
        QuickSettingsData quickSettingsData = (QuickSettingsData) MacroDroidApplication.m14845u().mo27293q(QuickSettingsData.QUICK_SETTINGS_CACHE).mo37133c(QuickSettingsData.QUICK_SETTINGS_DATA_KEY, QuickSettingsData.class);
        if (quickSettingsData == null) {
            quickSettingsData = QuickSettingsData.createDefault();
        }
        List<QuickSettingButton> quickSettingsButtonList = quickSettingsData.getQuickSettingsButtonList();
        boolean[] zArr = new boolean[8];
        for (int i = 0; i < quickSettingsButtonList.size(); i++) {
            zArr[i] = quickSettingsButtonList.get(i).getEnabled();
        }
        return zArr;
    }

    /* renamed from: y3 */
    public static String[] m12600y3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.macrodroid_tile_1), SelectableItem.m15535j1(C17541R$string.macrodroid_tile_2), SelectableItem.m15535j1(C17541R$string.macrodroid_tile_3), SelectableItem.m15535j1(C17541R$string.macrodroid_tile_4), SelectableItem.m15535j1(C17541R$string.macrodroid_tile_5), SelectableItem.m15535j1(C17541R$string.macrodroid_tile_6), SelectableItem.m15535j1(C17541R$string.macrodroid_tile_7), SelectableItem.m15535j1(C17541R$string.macrodroid_tile_8)};
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.label};
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return String.format(SelectableItem.m15535j1(C17541R$string.action_set_quick_settings_state_with_tile_number), new Object[]{Integer.valueOf(this.m_tileOption + 1)});
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.label = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        if (this.setToggleState) {
            sb.append(SelectableItem.m15535j1(this.m_toggleOption == 0 ? C17541R$string.f7056on : C17541R$string.off));
            sb.append(", ");
        }
        if (this.setLabel) {
            sb.append(SelectableItem.m15535j1(C17541R$string.label));
            sb.append(" ");
            sb.append(this.label.isEmpty() ? SelectableItem.m15535j1(C17541R$string.empty) : this.label);
            sb.append(", ");
        }
        if (this.setImage) {
            sb.append(SelectableItem.m15535j1(C17541R$string.action_set_quick_tile_icon));
            sb.append(", ");
        }
        if (sb.length() >= 2) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.toString();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7884y3.m32989u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        boolean z;
        boolean z2 = true;
        C10180a.m40075a().mo80018i(new QuickSettingSetToggleStateEvent(this.m_tileOption + 1, this.m_toggleOption == 0));
        C7264a q = MacroDroidApplication.m14845u().mo27293q(QuickSettingsData.QUICK_SETTINGS_CACHE);
        QuickSettingsData quickSettingsData = (QuickSettingsData) q.mo37133c(QuickSettingsData.QUICK_SETTINGS_DATA_KEY, QuickSettingsData.class);
        if (quickSettingsData != null) {
            QuickSettingButton quickSettingButton = quickSettingsData.getQuickSettingsButtonList().get(this.m_tileOption);
            boolean enabled = quickSettingButton.getEnabled();
            String label2 = quickSettingButton.getLabel();
            int image = quickSettingButton.getImage();
            String imageName = quickSettingButton.getImageName();
            if (this.setToggleState) {
                if (this.m_toggleOption != 0) {
                    z2 = false;
                }
                z = z2;
            } else {
                z = enabled;
            }
            if (this.setLabel) {
                label2 = C4023j0.m15760t0(mo27827K0(), this.label, triggerContextInfo, mo27837X0());
            }
            String str = label2;
            if (this.setImage) {
                image = this.iconRes;
                imageName = this.iconResName;
            }
            quickSettingsData.replaceButton(quickSettingButton, QuickSettingButton.create(str, image, quickSettingButton.getEnabled(), quickSettingButton.isToggle(), z, quickSettingButton.getCollapseOnPress(), imageName));
            q.mo37132b(QuickSettingsData.QUICK_SETTINGS_DATA_KEY, quickSettingsData);
        }
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        ImageView imageView;
        if (i == REQUEST_CODE_QUICK_SETTINGS && i2 == -1) {
            C8059d dVar = new C8059d(new ContextThemeWrapper(activity, C17542R$style.Theme_App_Dialog_Action), m12598w3(), m12599x3());
            this.itemsAdapter = dVar;
            this.listView.setAdapter(dVar);
            this.listView.setSelection(this.m_tileOption);
            this.listView.setItemChecked(this.m_tileOption, true);
        }
        if (i == REQUEST_CODE_SELECT_ICON && i2 == -1) {
            this.selectedIconRes = intent.getIntExtra("drawableId", 0);
            this.selectedIconResName = intent.getStringExtra("drawableName");
            WeakReference<ImageView> weakReference = this.iconRef;
            if (weakReference != null && (imageView = (ImageView) weakReference.get()) != null) {
                imageView.setImageResource(this.selectedIconRes);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m12597v3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u3 */
    public void mo25677u3() {
        Activity j0 = mo27850j0();
        if (this.iconRes == 0) {
            this.selectedIconRes = C17530R$drawable.notification_icon_cog_box;
            this.iconRes = C17530R$drawable.notification_icon_cog_box;
        }
        if (this.iconResName == null) {
            this.selectedIconResName = "notification_icon_cog_box";
            this.iconResName = "notification_icon_cog_box";
        }
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_quick_tile_configure);
        appCompatDialog.setTitle((CharSequence) m12600y3()[this.selectedTileOption]);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        if (!j0.getResources().getBoolean(C17527R$bool.is_tablet)) {
            layoutParams.width = -1;
        }
        appCompatDialog.getWindow().setAttributes(layoutParams);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.setOnOffStateCheckBox);
        RadioGroup radioGroup = (RadioGroup) appCompatDialog.findViewById(C17532R$id.radioGroupOnOff);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.onRadioButton);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.offRadioButton);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.setLabelCheckBox);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.labelText);
        CheckBox checkBox3 = (CheckBox) appCompatDialog.findViewById(C17532R$id.setIconCheckBox);
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.icon_container);
        ImageView imageView = (ImageView) appCompatDialog.findViewById(2131362906);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.magicTextButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        this.iconRef = new WeakReference<>(imageView);
        checkBox.setChecked(this.setToggleState);
        checkBox2.setChecked(this.setLabel);
        checkBox3.setChecked(this.setImage);
        int i = this.m_toggleOption;
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        boolean z = true;
        radioButton.setChecked(i == 0);
        if (this.m_toggleOption != 1) {
            z = false;
        }
        radioButton2.setChecked(z);
        editText.setText(this.label);
        radioButton.setEnabled(this.setToggleState);
        radioButton2.setEnabled(this.setToggleState);
        float f = 1.0f;
        radioGroup.setAlpha(this.setToggleState ? 1.0f : 0.5f);
        checkBox.setOnCheckedChangeListener(new C3452sh(radioButton, radioButton2, radioGroup));
        editText.setEnabled(this.setLabel);
        editText.setAlpha(this.setLabel ? 1.0f : 0.5f);
        checkBox2.setOnCheckedChangeListener(new C3401rh(editText));
        if (!this.setImage) {
            f = 0.5f;
        }
        viewGroup.setAlpha(f);
        imageView.setEnabled(this.setImage);
        checkBox3.setOnCheckedChangeListener(new C3372qh(viewGroup, imageView));
        imageView.setImageResource(C4061t1.m15977W(j0, this.iconResName));
        imageView.setOnClickListener(new C3146ih(j0));
        button.setOnClickListener(new C3258mh(this, j0, new C3174jh(editText)));
        button2.setOnClickListener(new C3286nh(this, checkBox2, checkBox, checkBox3, j0, radioButton, editText, appCompatDialog));
        button3.setOnClickListener(new C3230lh(appCompatDialog));
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_tileOption);
        parcel.writeInt(this.m_toggleOption);
        parcel.writeString(this.label);
        parcel.writeInt(this.iconRes);
        parcel.writeString(this.iconResName);
        parcel.writeInt(this.setToggleState ? 1 : 0);
        parcel.writeInt(this.setLabel ? 1 : 0);
        parcel.writeInt(this.setImage ? 1 : 0);
    }

    public SetQuickSettingsStateAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public SetQuickSettingsStateAction() {
        this.iconRef = null;
        this.selectedIconRes = this.iconRes;
        this.selectedIconResName = this.iconResName;
    }

    private SetQuickSettingsStateAction(Parcel parcel) {
        super(parcel);
        this.iconRef = null;
        this.selectedIconRes = this.iconRes;
        this.selectedIconResName = this.iconResName;
        this.m_tileOption = parcel.readInt();
        this.m_toggleOption = parcel.readInt();
        this.label = parcel.readString();
        this.iconRes = parcel.readInt();
        this.iconResName = parcel.readString();
        boolean z = true;
        this.setToggleState = parcel.readInt() != 0;
        this.setLabel = parcel.readInt() != 0;
        this.setImage = parcel.readInt() == 0 ? false : z;
    }
}
