package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.data.NotificationActionButton;
import com.arlosoft.macrodroid.actionblock.common.ActionBlockData;
import com.arlosoft.macrodroid.actionblock.common.C3666b;
import com.arlosoft.macrodroid.actionblock.common.C3670c;
import com.arlosoft.macrodroid.actionblock.common.C3671d;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.EditNotificationChannelsActivity;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectActivity;
import com.arlosoft.macrodroid.triggers.receivers.InvokeMacroReceiver;
import com.arlosoft.macrodroid.utils.C6368b1;
import com.arlosoft.macrodroid.utils.C6455x0;
import com.google.android.material.textfield.TextInputLayout;
import com.thebluealliance.spectrum.C11766a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p057a2.C2223l;
import p057a2.C2224m;
import p057a2.C2225n;
import p106i2.C7395a;
import p106i2.C7396b;
import p128m0.C7740f2;
import p148q0.C8151a;
import p297ja.C13339u;
import p370qa.C16265l;

public class NotificationAction extends Action implements C2224m, C2225n, C2223l {
    public static final Parcelable.Creator<NotificationAction> CREATOR = new C2549g();
    private static final int CUSTOM_CHANNEL = 2;
    private static final int HIGH_PRIORITY_CHANNEL = 1;
    private static final int REQUEST_CODE_EDIT_NOTIFICATION_CHANNELS = 7823;
    private static final int REQUEST_CODE_ICON_SELECT = 7824;
    private static final int STANDARD_CHANNEL = 0;
    private static final String THIS_MACRO = SelectableItem.m15535j1(C17541R$string.constraint_last_run_time_this_macro);
    private static int notificationId = 20000000;
    private static int s_requestCodeStart = 385250;
    /* access modifiers changed from: private */
    public ActionBlockData actionBlockData;
    protected boolean blockNextAction;
    private transient Spinner channelSpinner;

    /* renamed from: d */
    transient C6455x0 f7367d;
    private int m_iconBgColor;
    private transient ImageView m_iconImage;
    protected int m_imageResourceId;
    protected String m_imageResourceName;
    private long m_macroGUIDToRun;
    private int m_notificationChannelType;
    protected String m_notificationSubject;
    protected String m_notificationText;
    protected boolean m_overwriteExisting;
    private int m_priority;
    protected int m_ringtoneIndex;
    protected String m_ringtoneName;
    private boolean m_runMacroWhenPressed;
    protected boolean maintainSpaces;
    private ArrayList<NotificationActionButton> notificationActionButtons;
    private String notificationChannelName;
    protected boolean preventBackButtonClosing;
    /* access modifiers changed from: private */
    public transient String tempNotificationChannelName;
    /* access modifiers changed from: private */
    public transient ActionBlockData workingActionBlockData;
    private transient ArrayList<NotificationActionButton> workingNotificationActionButtons;

    /* renamed from: com.arlosoft.macrodroid.action.NotificationAction$a */
    class C2541a implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        private boolean f7368a = true;

        /* renamed from: c */
        final /* synthetic */ Activity f7369c;

        C2541a(Activity activity) {
            this.f7369c = activity;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f7368a) {
                this.f7368a = false;
            } else if (i > 1) {
                C4061t1.m16028x0(this.f7369c, i - 2, 2, 5);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.NotificationAction$b */
    class C2542b implements View.OnClickListener {
        C2542b() {
        }

        public void onClick(View view) {
            NotificationAction.this.mo27850j0().startActivityForResult(new Intent(NotificationAction.this.mo27850j0(), EditNotificationChannelsActivity.class), NotificationAction.REQUEST_CODE_EDIT_NOTIFICATION_CHANNELS);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.NotificationAction$c */
    class C2543c implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ Button f7372a;

        /* renamed from: c */
        final /* synthetic */ List f7373c;

        /* renamed from: d */
        final /* synthetic */ List f7374d;

        /* renamed from: f */
        final /* synthetic */ Activity f7375f;

        /* renamed from: com.arlosoft.macrodroid.action.NotificationAction$c$a */
        class C2544a implements C16265l<ActionBlockData, C13339u> {
            C2544a() {
            }

            /* renamed from: a */
            public C13339u invoke(ActionBlockData actionBlockData) {
                ActionBlockData unused = NotificationAction.this.workingActionBlockData = actionBlockData;
                return null;
            }
        }

        C2543c(Button button, List list, List list2, Activity activity) {
            this.f7372a = button;
            this.f7373c = list;
            this.f7374d = list2;
            this.f7375f = activity;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m11595b(Activity activity, ActionBlock actionBlock, View view) {
            C3666b.m14512c(activity, actionBlock, NotificationAction.this.workingActionBlockData, NotificationAction.this, new C2544a());
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ActionBlockData actionBlockData;
            this.f7372a.setVisibility(((C3671d) this.f7373c.get(i)).mo27106e() ? 0 : 8);
            ActionBlock actionBlock = (i <= 0 || i > this.f7374d.size()) ? null : (ActionBlock) this.f7374d.get(i - 1);
            if (actionBlock != null) {
                NotificationAction notificationAction = NotificationAction.this;
                if (notificationAction.actionBlockData != null) {
                    actionBlockData = NotificationAction.this.actionBlockData;
                } else {
                    actionBlockData = new ActionBlockData(actionBlock.getName(), actionBlock.getGUID(), new HashMap(), new HashMap());
                }
                ActionBlockData unused = notificationAction.workingActionBlockData = actionBlockData;
                this.f7372a.setOnClickListener(new C3621ya(this, this.f7375f, actionBlock));
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.NotificationAction$d */
    class C2545d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f7378a;

        /* renamed from: c */
        final /* synthetic */ Button f7379c;

        /* renamed from: d */
        final /* synthetic */ EditText f7380d;

        /* renamed from: f */
        final /* synthetic */ EditText f7381f;

        C2545d(LinearLayout linearLayout, Button button, EditText editText, EditText editText2) {
            this.f7378a = linearLayout;
            this.f7379c = button;
            this.f7380d = editText;
            this.f7381f = editText2;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= this.f7378a.getChildCount()) {
                    z = true;
                    break;
                } else if (TextUtils.isEmpty(((TextView) this.f7378a.getChildAt(i).findViewById(C17532R$id.actionButtonLabel)).getText().toString())) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            Button button = this.f7379c;
            if (z && this.f7380d.getText().length() > 0 && this.f7381f.getText().length() > 0) {
                z2 = true;
            }
            button.setEnabled(z2);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.NotificationAction$e */
    class C2546e implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ Button f7383a;

        /* renamed from: c */
        final /* synthetic */ List f7384c;

        /* renamed from: d */
        final /* synthetic */ List f7385d;

        /* renamed from: f */
        final /* synthetic */ NotificationActionButton f7386f;

        /* renamed from: g */
        final /* synthetic */ Activity f7387g;

        /* renamed from: com.arlosoft.macrodroid.action.NotificationAction$e$a */
        class C2547a implements C16265l<ActionBlockData, C13339u> {

            /* renamed from: a */
            final /* synthetic */ NotificationActionButton f7389a;

            C2547a(NotificationActionButton notificationActionButton) {
                this.f7389a = notificationActionButton;
            }

            /* renamed from: a */
            public C13339u invoke(ActionBlockData actionBlockData) {
                this.f7389a.setActionBlockData(actionBlockData);
                return null;
            }
        }

        C2546e(Button button, List list, List list2, NotificationActionButton notificationActionButton, Activity activity) {
            this.f7383a = button;
            this.f7384c = list;
            this.f7385d = list2;
            this.f7386f = notificationActionButton;
            this.f7387g = activity;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m11598b(Activity activity, ActionBlock actionBlock, ActionBlockData actionBlockData, NotificationActionButton notificationActionButton, View view) {
            C3666b.m14512c(activity, actionBlock, actionBlockData, NotificationAction.this, new C2547a(notificationActionButton));
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ActionBlockData actionBlockData;
            this.f7383a.setVisibility(((C3671d) this.f7384c.get(i)).mo27106e() ? 0 : 8);
            ActionBlock actionBlock = (i <= 0 || i > this.f7385d.size()) ? null : (ActionBlock) this.f7385d.get(i - 1);
            if (actionBlock != null) {
                if (this.f7386f.getActionBlockData() != null) {
                    actionBlockData = this.f7386f.getActionBlockData();
                } else {
                    actionBlockData = new ActionBlockData(actionBlock.getName(), actionBlock.getGUID(), new HashMap(), new HashMap());
                }
                this.f7386f.setActionBlockData(actionBlockData);
                this.f7383a.setOnClickListener(new C3648za(this, this.f7387g, actionBlock, actionBlockData, this.f7386f));
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.NotificationAction$f */
    class C2548f implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ List f7391a;

        C2548f(List list) {
            this.f7391a = list;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String unused = NotificationAction.this.tempNotificationChannelName = (String) this.f7391a.get(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.NotificationAction$g */
    class C2549g implements Parcelable.Creator<NotificationAction> {
        C2549g() {
        }

        /* renamed from: a */
        public NotificationAction createFromParcel(Parcel parcel) {
            return new NotificationAction(parcel);
        }

        /* renamed from: b */
        public NotificationAction[] newArray(int i) {
            return new NotificationAction[i];
        }
    }

    public NotificationAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
        this.m_runMacroWhenPressed = false;
    }

    /* renamed from: C3 */
    private void m11529C3(Activity activity, Context context, LinearLayout linearLayout, List<NotificationActionButton> list, NotificationActionButton notificationActionButton, List<C3671d> list2, List<ActionBlock> list3, Button button, TextWatcher textWatcher) {
        LinearLayout linearLayout2 = linearLayout;
        List<C3671d> list4 = list2;
        int i = 0;
        View inflate = LayoutInflater.from(context).inflate(C17535R$layout.include_notification_action_button, linearLayout2, false);
        EditText editText = (EditText) inflate.findViewById(C17532R$id.actionButtonLabel);
        Spinner spinner = (Spinner) inflate.findViewById(C17532R$id.macroSpinner);
        Activity activity2 = activity;
        ((Button) inflate.findViewById(C17532R$id.actionButtonLabelMagicTextButton)).setOnClickListener(new C3539va(this, activity, new C3223la(editText)));
        editText.setText(notificationActionButton.getLabel());
        linearLayout2.addView(inflate);
        editText.addTextChangedListener(textWatcher);
        ((CheckBox) inflate.findViewById(C17532R$id.clearOnPress)).setChecked(notificationActionButton.getClearOnPress());
        NotificationActionButton notificationActionButton2 = notificationActionButton;
        ((ImageView) inflate.findViewById(C17532R$id.delete_button)).setOnClickListener(new C3365qa(linearLayout2, inflate, button, list, notificationActionButton2));
        spinner.setAdapter(new C3670c(mo27850j0(), list4));
        spinner.setOnItemSelectedListener(new C2546e((Button) inflate.findViewById(C17532R$id.configInputOutputParams), list2, list3, notificationActionButton2, activity));
        int i2 = 0;
        while (true) {
            if (i2 >= list2.size()) {
                break;
            } else if (notificationActionButton.getMacroGuid() == list4.get(i2).mo27105d()) {
                C3671d dVar = list4.get(i2);
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        spinner.setSelection(i);
        C3671d dVar2 = list4.get(i);
    }

    /* renamed from: D1 */
    private void m11530D1() {
        MacroDroidApplication.f9885K.mo38311p(this);
    }

    /* renamed from: I3 */
    private void m11531I3() {
        int i;
        CheckBox checkBox;
        CheckBox checkBox2;
        NotificationAction notificationAction = this;
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.configure_notification);
        appCompatDialog.setTitle((CharSequence) mo25559a1());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.configure_notification_notification_text);
        CheckBox checkBox3 = (CheckBox) appCompatDialog.findViewById(C17532R$id.configure_notification_invoke_macro_checkbox);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.configure_notification_magic_text_button);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.configure_notification_invoke_macro_spinner);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.configure_notification_magic_subject_button);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.configInputOutputParams);
        Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.configure_notification_change_icon_button);
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.configure_notification_icon_container);
        Spinner spinner2 = (Spinner) appCompatDialog.findViewById(C17532R$id.configure_notification_notification_sound);
        Button button5 = (Button) appCompatDialog.findViewById(C17532R$id.configure_notification_icon_background);
        Spinner spinner3 = (Spinner) appCompatDialog.findViewById(C17532R$id.configure_notification_priority_spinner);
        CheckBox checkBox4 = (CheckBox) appCompatDialog.findViewById(C17532R$id.configure_notification_overwrite_checkbox);
        ViewGroup viewGroup2 = (ViewGroup) appCompatDialog.findViewById(C17532R$id.notification_container);
        Button button6 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        ViewGroup viewGroup3 = (ViewGroup) appCompatDialog.findViewById(C17532R$id.sound_options_container);
        Button button7 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        ViewGroup viewGroup4 = (ViewGroup) appCompatDialog.findViewById(C17532R$id.notification_channel_container);
        CheckBox checkBox5 = (CheckBox) appCompatDialog.findViewById(C17532R$id.configure_notification_block_next_action);
        notificationAction.channelSpinner = (Spinner) appCompatDialog.findViewById(C17532R$id.notification_channels_spinner);
        Button button8 = (Button) appCompatDialog.findViewById(C17532R$id.edit_notification_channels);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.configure_notification_subject_text);
        Button button9 = (Button) appCompatDialog.findViewById(C17532R$id.actionActionButtonButton);
        LinearLayout linearLayout = (LinearLayout) appCompatDialog.findViewById(C17532R$id.actionButtonsContainer);
        CheckBox checkBox6 = (CheckBox) appCompatDialog.findViewById(C17532R$id.prevent_back_button_checkbox);
        ViewGroup viewGroup5 = (ViewGroup) appCompatDialog.findViewById(C17532R$id.maintain_spaces_container);
        TextInputLayout textInputLayout = (TextInputLayout) appCompatDialog.findViewById(C17532R$id.notification_subject_input_layout);
        CheckBox checkBox7 = (CheckBox) appCompatDialog.findViewById(C17532R$id.maintain_spaces_checkbox);
        TextInputLayout textInputLayout2 = (TextInputLayout) appCompatDialog.findViewById(C17532R$id.notification_text_input_layout);
        notificationAction.workingNotificationActionButtons.clear();
        AppCompatDialog appCompatDialog2 = appCompatDialog;
        int i2 = 0;
        while (i2 < notificationAction.notificationActionButtons.size()) {
            notificationAction.workingNotificationActionButtons.add(notificationAction.notificationActionButtons.get(i2));
            i2++;
            button3 = button3;
        }
        Button button10 = button3;
        viewGroup5.setVisibility(mo25364G3() ? 0 : 8);
        checkBox7.setChecked(notificationAction.maintainSpaces);
        viewGroup2.setVisibility(mo25373j4() ? 0 : 8);
        viewGroup3.setVisibility(mo25374k4() ? 0 : 8);
        viewGroup4.setVisibility(mo25372i4() ? 0 : 8);
        List<String> X = C4061t1.m15978X(mo27827K0(), 2, false);
        X.add(0, mo27827K0().getString(C17541R$string.none));
        X.add(0, mo27827K0().getString(C17541R$string.notification_default));
        String[] strArr = (String[]) X.toArray(new String[0]);
        m11548f4();
        ArrayAdapter arrayAdapter = new ArrayAdapter(j0, 17367048, strArr);
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter);
        int i3 = notificationAction.m_ringtoneIndex;
        if (i3 < 2) {
            spinner2.setSelection(i3);
        } else {
            int i4 = 0;
            while (true) {
                if (i4 >= X.size()) {
                    break;
                } else if (X.get(i4).equals(notificationAction.m_ringtoneName)) {
                    spinner2.setSelection(i4);
                    break;
                } else {
                    i4++;
                }
            }
        }
        spinner3.setSelection(((spinner3.getAdapter().getCount() - 1) - notificationAction.m_priority) - 2);
        spinner2.setOnItemSelectedListener(new C2541a(j0));
        editText.setSingleLine(mo25370P3());
        if (!mo25367L3()) {
            checkBox3.setVisibility(8);
            spinner.setVisibility(8);
        }
        if (notificationAction.m_runMacroWhenPressed) {
            checkBox3.setChecked(true);
            spinner.setEnabled(true);
        } else {
            checkBox3.setChecked(false);
            spinner.setEnabled(false);
        }
        button8.setOnClickListener(new C2542b());
        checkBox3.setOnCheckedChangeListener(new C3195ka(spinner));
        List<Macro> A = C4934n.m18998M().mo29671A(mo27837X0(), true);
        List<ActionBlock> i5 = m11532M3().mo29651i();
        ArrayList arrayList = new ArrayList();
        CheckBox checkBox8 = checkBox3;
        arrayList.add(new C3671d("(" + mo27827K0().getString(C17541R$string.button_off) + ")", 0, false));
        int i6 = 0;
        while (i6 < i5.size()) {
            ActionBlock actionBlock = i5.get(i6);
            arrayList.add(new C3671d(actionBlock.getName(), actionBlock.getGUID(), true));
            i6++;
            spinner2 = spinner2;
            spinner3 = spinner3;
        }
        Spinner spinner4 = spinner2;
        Spinner spinner5 = spinner3;
        int i7 = 0;
        while (i7 < A.size()) {
            Macro macro = A.get(i7);
            arrayList.add(new C3671d(macro.getName(), macro.getGUID(), false));
            i7++;
            A = A;
            checkBox7 = checkBox7;
        }
        CheckBox checkBox9 = checkBox7;
        arrayList.add(new C3671d(THIS_MACRO, mo27837X0().getGUID(), false));
        spinner.setAdapter(new C3670c(mo27850j0(), arrayList));
        CheckBox checkBox10 = checkBox8;
        Button button11 = button;
        Button button12 = button2;
        String[] strArr2 = strArr;
        Spinner spinner6 = spinner4;
        Button button13 = button4;
        ViewGroup viewGroup6 = viewGroup;
        Spinner spinner7 = spinner;
        Button button14 = button11;
        Button button15 = button5;
        Spinner spinner8 = spinner5;
        List<ActionBlock> list = i5;
        List<ActionBlock> list2 = i5;
        CheckBox checkBox11 = checkBox4;
        spinner7.setOnItemSelectedListener(new C2543c(button10, arrayList, list, j0));
        int i8 = 0;
        while (true) {
            if (i8 >= arrayList.size()) {
                i8 = 0;
                break;
            } else if (notificationAction.m_macroGUIDToRun == ((C3671d) arrayList.get(i8)).mo27105d()) {
                break;
            } else {
                i8++;
            }
        }
        spinner7.setSelection(i8);
        AppCompatDialog appCompatDialog3 = appCompatDialog2;
        ImageView imageView = (ImageView) appCompatDialog3.findViewById(C17532R$id.configure_notification_preview_image);
        notificationAction.m_iconImage = imageView;
        ((GradientDrawable) imageView.getBackground()).setColor(notificationAction.m_iconBgColor);
        viewGroup6.setVisibility(mo25371h4() ? 0 : 8);
        button15.setOnClickListener(new C3393ra(notificationAction, j0));
        int V = C4061t1.m15976V(mo27827K0(), notificationAction.m_imageResourceName);
        if (V == -1) {
            try {
                int i9 = notificationAction.m_imageResourceId;
                if (i9 > 0) {
                    notificationAction.m_iconImage.setImageResource(i9);
                } else {
                    notificationAction.m_iconImage.setImageResource(C17530R$drawable.not_icon_setup);
                }
            } catch (Exception unused) {
                notificationAction.m_iconImage.setImageResource(C17530R$drawable.not_icon_setup);
            }
        } else {
            notificationAction.m_iconImage.setImageResource(V);
        }
        button13.setOnClickListener(new C3337pa(j0));
        textInputLayout2.setHint((CharSequence) mo25368N3());
        textInputLayout.setHint((CharSequence) mo25369O3());
        String str = notificationAction.m_notificationText;
        if (str != null) {
            editText.setText(str);
            editText.setSelection(editText.length());
        }
        String str2 = notificationAction.m_notificationSubject;
        EditText editText3 = editText2;
        if (str2 != null) {
            editText3.setText(str2);
            editText3.setSelection(editText3.length());
        }
        if (mo25365J3()) {
            checkBox11.setChecked(notificationAction.m_overwriteExisting);
            i = 8;
        } else {
            i = 8;
            checkBox11.setVisibility(8);
        }
        if (mo25363F3()) {
            checkBox = checkBox5;
            checkBox.setChecked(notificationAction.blockNextAction);
        } else {
            checkBox = checkBox5;
            checkBox.setVisibility(i);
        }
        if (mo25366K3()) {
            checkBox2 = checkBox6;
            checkBox2.setChecked(notificationAction.preventBackButtonClosing);
        } else {
            checkBox2 = checkBox6;
            checkBox2.setVisibility(i);
        }
        CheckBox checkBox12 = checkBox2;
        C2545d dVar = r0;
        C2545d dVar2 = new C2545d(linearLayout, button7, editText, editText3);
        editText.addTextChangedListener(dVar);
        editText3.addTextChangedListener(dVar);
        int i10 = 0;
        while (i10 < notificationAction.notificationActionButtons.size()) {
            Context context = appCompatDialog3.getContext();
            ArrayList<NotificationActionButton> arrayList2 = notificationAction.workingNotificationActionButtons;
            CheckBox checkBox13 = checkBox9;
            m11529C3(j0, context, linearLayout, arrayList2, arrayList2.get(i10), arrayList, list2, button9, dVar);
            i10++;
            appCompatDialog3 = appCompatDialog3;
            checkBox11 = checkBox11;
            checkBox = checkBox;
            list2 = list2;
            arrayList = arrayList;
            checkBox12 = checkBox12;
            button9 = button9;
            notificationAction = this;
        }
        AppCompatDialog appCompatDialog4 = appCompatDialog3;
        ArrayList arrayList3 = arrayList;
        CheckBox checkBox14 = checkBox;
        Button button16 = button9;
        CheckBox checkBox15 = checkBox12;
        CheckBox checkBox16 = checkBox9;
        List<ActionBlock> list3 = list2;
        CheckBox checkBox17 = checkBox11;
        if (linearLayout.getChildCount() >= 3 || !mo25362E3()) {
            button16.setVisibility(8);
        }
        C2545d dVar3 = dVar;
        C3422sa saVar = r0;
        C3422sa saVar2 = new C3422sa(this, j0, appCompatDialog4, linearLayout, arrayList3, list3, button16, dVar3, button7);
        button16.setOnClickListener(saVar);
        Button button17 = button6;
        EditText editText4 = editText3;
        AppCompatDialog appCompatDialog5 = appCompatDialog4;
        EditText editText5 = editText;
        Activity activity = j0;
        C3594xa xaVar = r0;
        C3594xa xaVar2 = new C3594xa(this, appCompatDialog4, editText, editText3, checkBox17, checkBox8, spinner6, strArr2, spinner8, arrayList3, spinner7, checkBox14, checkBox15, checkBox16, linearLayout);
        Button button18 = button7;
        button18.setOnClickListener(xaVar);
        button18.setEnabled(editText5.getText().length() > 0 && editText4.getText().length() > 0);
        AppCompatDialog appCompatDialog6 = appCompatDialog5;
        button17.setOnClickListener(new C3567wa(this, appCompatDialog6));
        Activity activity2 = activity;
        button12.setOnClickListener(new C3512ua(this, activity2, new C3251ma(editText4)));
        button14.setOnClickListener(new C3476ta(this, activity2, new C3279na(editText5)));
        appCompatDialog6.show();
        appCompatDialog6.setOnCancelListener(new C3167ja(this));
    }

    /* renamed from: M3 */
    private C4915a m11532M3() {
        return C4934n.m18998M();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public static /* synthetic */ void m11533Q3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public /* synthetic */ void m11534R3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public static /* synthetic */ void m11535S3(LinearLayout linearLayout, View view, Button button, List list, NotificationActionButton notificationActionButton, View view2) {
        linearLayout.removeView(view);
        button.setVisibility(0);
        list.remove(notificationActionButton);
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public /* synthetic */ void m11537U3(boolean z, int i) {
        if (z) {
            this.m_iconBgColor = i;
            ((GradientDrawable) this.m_iconImage.getBackground()).setColor(this.m_iconBgColor);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V3 */
    public /* synthetic */ void m11538V3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: W3 */
    public /* synthetic */ void m11539W3(DialogInterface dialogInterface) {
        this.m_iconImage = null;
        this.channelSpinner = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: X3 */
    public /* synthetic */ void m11540X3(Activity activity, View view) {
        new C11766a.C11769c(mo27827K0()).mo66987g(C17541R$string.select_color).mo66982b(C17525R$array.notification_colors).mo66986f(this.m_iconBgColor).mo66983c(true).mo66985e(1).mo66984d(new C3307oa(this)).mo66981a().show(((AppCompatActivity) activity).getSupportFragmentManager(), "");
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public static /* synthetic */ void m11541Y3(Activity activity, View view) {
        if (activity != null) {
            Intent intent = new Intent(activity, IconSelectActivity.class);
            intent.putExtra("DisplayAppIcons", false);
            activity.startActivityForResult(intent, REQUEST_CODE_ICON_SELECT);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public /* synthetic */ void m11542Z3(Activity activity, AppCompatDialog appCompatDialog, LinearLayout linearLayout, List list, List list2, Button button, TextWatcher textWatcher, Button button2, View view) {
        NotificationActionButton notificationActionButton = new NotificationActionButton("", 0, false, (ActionBlockData) null);
        this.workingNotificationActionButtons.add(notificationActionButton);
        m11529C3(activity, appCompatDialog.getContext(), linearLayout, this.workingNotificationActionButtons, notificationActionButton, list, list2, button, textWatcher);
        if (linearLayout.getChildCount() >= 3) {
            button.setVisibility(8);
        }
        button2.setEnabled(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public /* synthetic */ void m11543a4(AppCompatDialog appCompatDialog, EditText editText, EditText editText2, CheckBox checkBox, CheckBox checkBox2, Spinner spinner, String[] strArr, Spinner spinner2, List list, Spinner spinner3, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, LinearLayout linearLayout, View view) {
        List list2 = list;
        appCompatDialog.dismiss();
        this.m_notificationText = editText.getText().toString();
        this.m_notificationSubject = editText2.getText().toString();
        this.m_overwriteExisting = checkBox.isChecked();
        this.m_runMacroWhenPressed = checkBox2.isChecked();
        int selectedItemPosition = spinner.getSelectedItemPosition();
        this.m_ringtoneIndex = selectedItemPosition;
        this.m_ringtoneName = strArr[selectedItemPosition];
        int i = 2;
        this.m_priority = ((spinner2.getAdapter().getCount() - 1) - spinner2.getSelectedItemPosition()) - 2;
        this.m_macroGUIDToRun = ((C3671d) list2.get(spinner3.getSelectedItemPosition())).mo27105d();
        int selectedItemPosition2 = this.channelSpinner.getSelectedItemPosition();
        if (selectedItemPosition2 < 2) {
            i = selectedItemPosition2;
        }
        this.m_notificationChannelType = i;
        Spinner spinner4 = this.channelSpinner;
        if (spinner4 != null) {
            this.notificationChannelName = (String) spinner4.getSelectedItem();
        }
        this.blockNextAction = checkBox3.isChecked();
        this.preventBackButtonClosing = checkBox4.isChecked();
        mo24689O1();
        this.m_iconImage = null;
        this.channelSpinner = null;
        this.maintainSpaces = checkBox5.isChecked();
        this.actionBlockData = this.workingActionBlockData;
        this.notificationActionButtons = new ArrayList<>();
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            View childAt = linearLayout.getChildAt(i2);
            this.notificationActionButtons.add(new NotificationActionButton(((TextView) childAt.findViewById(C17532R$id.actionButtonLabel)).getText().toString(), ((C3671d) list2.get(((Spinner) childAt.findViewById(C17532R$id.macroSpinner)).getSelectedItemPosition())).mo27105d(), ((CheckBox) childAt.findViewById(C17532R$id.clearOnPress)).isChecked(), this.workingNotificationActionButtons.get(i2).getActionBlockData()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public /* synthetic */ void m11544b4(AppCompatDialog appCompatDialog, View view) {
        this.channelSpinner = null;
        appCompatDialog.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public static /* synthetic */ void m11545c4(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: d4 */
    public /* synthetic */ void m11546d4(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public static /* synthetic */ void m11547e4(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* renamed from: f4 */
    private void m11548f4() {
        C7396b f = this.f7367d.mo32509f();
        ArrayList<C7395a> arrayList = new ArrayList<>();
        arrayList.add(new C7395a(SelectableItem.m15535j1(C17541R$string.notification_channel_action), 3));
        arrayList.add(new C7395a(SelectableItem.m15535j1(C17541R$string.notification_channel_action_high_priority), 4));
        arrayList.addAll(f.mo37428a());
        ArrayList arrayList2 = new ArrayList();
        for (C7395a a : arrayList) {
            arrayList2.add(a.mo37426a());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(mo27850j0(), C17535R$layout.simple_spinner_item, arrayList2);
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        this.channelSpinner.setAdapter(arrayAdapter);
        this.channelSpinner.setOnItemSelectedListener(new C2548f(arrayList2));
        int i = this.m_notificationChannelType;
        if (i < 2) {
            this.channelSpinner.setSelection(i);
        } else if (this.notificationChannelName != null) {
            int indexOf = arrayList2.indexOf(this.tempNotificationChannelName);
            if (indexOf < 0) {
                indexOf = arrayList2.indexOf(this.notificationChannelName);
            }
            if (indexOf >= 0) {
                this.channelSpinner.setSelection(indexOf);
            }
        } else {
            this.channelSpinner.setSelection(0);
        }
    }

    @NonNull
    /* renamed from: C */
    public ArrayList<Long> mo24438C() {
        ArrayList<Long> arrayList = new ArrayList<>();
        arrayList.add(Long.valueOf(this.m_macroGUIDToRun));
        Iterator<NotificationActionButton> it = this.notificationActionButtons.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().getMacroGuid()));
        }
        return arrayList;
    }

    /* renamed from: D3 */
    public ActionBlockData mo25379D3(ActionBlockData actionBlockData2, TriggerContextInfo triggerContextInfo) {
        HashMap hashMap = new HashMap(actionBlockData2.mo27085e());
        for (String str : hashMap.keySet()) {
            if (((String) hashMap.get(str)).contains("lv=")) {
                hashMap.put(str, C4023j0.m15760t0(MacroDroidApplication.m14845u(), (String) hashMap.get(str), triggerContextInfo, mo27837X0()));
            }
        }
        return actionBlockData2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E3 */
    public boolean mo25362E3() {
        return true;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.m_notificationText);
        arrayList.add(this.m_notificationSubject);
        Iterator<NotificationActionButton> it = this.notificationActionButtons.iterator();
        while (it.hasNext()) {
            NotificationActionButton next = it.next();
            arrayList.add(next.getLabel());
            if (next.getActionBlockData() != null) {
                HashMap<String, String> e = next.getActionBlockData().mo27085e();
                for (String next2 : e.keySet()) {
                    arrayList.add(e.get(next2) == null ? "" : e.get(next2));
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F3 */
    public boolean mo25363F3() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G3 */
    public boolean mo25364G3() {
        return false;
    }

    /* renamed from: H3 */
    public void mo25380H3(Context context, TriggerContextInfo triggerContextInfo, String str, String str2, boolean z, int i, PendingIntent pendingIntent, int i2, Uri uri, int i3, String str3) {
        Context context2 = context;
        TriggerContextInfo triggerContextInfo2 = triggerContextInfo;
        String str4 = str;
        String str5 = str2;
        Uri uri2 = uri;
        int i4 = notificationId;
        notificationId = i4 + 1;
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (z) {
                notificationManager.cancelAll();
            }
            int i5 = C17530R$drawable.not_icon_setup;
            int i6 = i;
            if (i6 == -1) {
                i6 = C17530R$drawable.not_icon_setup;
            }
            try {
                if (context.getResources().getDrawable(i6) != null) {
                    i5 = i6;
                }
            } catch (Resources.NotFoundException unused) {
            }
            PendingIntent activity = pendingIntent == null ? PendingIntent.getActivity(context, 0, new Intent(), C6368b1.f14959b) : pendingIntent;
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
            builder.setContentTitle(str4).setTicker(str4).setWhen(System.currentTimeMillis()).setContentText(str5).setContentIntent(activity).setSmallIcon(i5).setAutoCancel(true).setColor(i2).setStyle(new NotificationCompat.BigTextStyle().bigText(str5)).setPriority(i3).setGroup(String.valueOf(i4)).setChannelId(str3);
            Iterator<NotificationActionButton> it = this.notificationActionButtons.iterator();
            while (it.hasNext()) {
                NotificationActionButton next = it.next();
                Intent intent = new Intent(mo27827K0(), InvokeMacroReceiver.class);
                intent.putExtra("parent_macro_id", mo27840Y0());
                intent.putExtra("MacroGuid", next.getMacroGuid());
                if (next.getActionBlockData() != null) {
                    intent.putExtra("action_block_data", mo25379D3(next.getActionBlockData(), triggerContextInfo));
                }
                if (next.getClearOnPress()) {
                    intent.putExtra("cancel_notification_id", i4);
                }
                Context K0 = mo27827K0();
                int i7 = s_requestCodeStart;
                s_requestCodeStart = i7 + 1;
                builder.addAction(C17530R$drawable.ic_action_cancel, mo24690R2(next.getLabel(), triggerContextInfo), PendingIntent.getBroadcast(K0, i7, intent, 134217728 | C6368b1.f14959b));
            }
            if (uri2 != null) {
                builder.setSound(uri2);
            } else {
                builder.setSound((Uri) null);
            }
            notificationManager.notify(String.valueOf(i4), i4, builder.build());
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("displayNotification exception: " + e.getMessage()));
        }
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        this.m_notificationText = strArr[0];
        this.m_notificationSubject = strArr[1];
        Iterator<NotificationActionButton> it = this.notificationActionButtons.iterator();
        int i = 2;
        while (it.hasNext()) {
            NotificationActionButton next = it.next();
            next.setLabel(strArr[i]);
            i++;
            if (next.getActionBlockData() != null) {
                HashMap<String, String> e = next.getActionBlockData().mo27085e();
                for (String put : e.keySet()) {
                    e.put(put, strArr[i].equals("") ? null : strArr[i]);
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J3 */
    public boolean mo25365J3() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K3 */
    public boolean mo25366K3() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L3 */
    public boolean mo25367L3() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N3 */
    public String mo25368N3() {
        return SelectableItem.m15535j1(C17541R$string.notification_text);
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_notificationText;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O3 */
    public String mo25369O3() {
        return SelectableItem.m15535j1(C17541R$string.title);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P3 */
    public boolean mo25370P3() {
        return true;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7740f2.m32291u();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo r21) {
        /*
            r20 = this;
            r12 = r20
            r13 = r21
            java.lang.String r0 = r12.m_notificationText
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r12.mo24690R2(r0, r13)
            goto L_0x000f
        L_0x000d:
            java.lang.String r0 = ""
        L_0x000f:
            r14 = r0
            java.lang.String r0 = r12.m_notificationSubject
            if (r0 != 0) goto L_0x0016
            r15 = r14
            goto L_0x001b
        L_0x0016:
            java.lang.String r0 = r12.mo24690R2(r0, r13)
            r15 = r0
        L_0x001b:
            boolean r0 = r12.m_runMacroWhenPressed
            r1 = 0
            if (r0 == 0) goto L_0x005e
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r2 = r20.mo27827K0()
            java.lang.Class<com.arlosoft.macrodroid.triggers.receivers.InvokeMacroReceiver> r3 = com.arlosoft.macrodroid.triggers.receivers.InvokeMacroReceiver.class
            r0.<init>(r2, r3)
            long r2 = r12.m_macroGUIDToRun
            java.lang.String r4 = "MacroGuid"
            r0.putExtra(r4, r2)
            java.lang.Long r2 = r20.mo27840Y0()
            java.lang.String r3 = "parent_macro_id"
            r0.putExtra(r3, r2)
            com.arlosoft.macrodroid.actionblock.common.ActionBlockData r2 = r12.actionBlockData
            if (r2 == 0) goto L_0x0048
            com.arlosoft.macrodroid.actionblock.common.ActionBlockData r2 = r12.mo25379D3(r2, r13)
            java.lang.String r3 = "action_block_data"
            r0.putExtra(r3, r2)
        L_0x0048:
            android.content.Context r2 = r20.mo27827K0()
            int r3 = s_requestCodeStart
            int r4 = r3 + 1
            s_requestCodeStart = r4
            r4 = 134217728(0x8000000, float:3.85186E-34)
            int r5 = com.arlosoft.macrodroid.utils.C6368b1.f14959b
            r4 = r4 | r5
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r2, r3, r0, r4)
            r16 = r0
            goto L_0x0060
        L_0x005e:
            r16 = r1
        L_0x0060:
            int r0 = r12.m_ringtoneIndex
            r2 = 0
            r11 = 1
            r3 = 2
            if (r0 >= r3) goto L_0x0071
            if (r0 != r11) goto L_0x006a
            goto L_0x00a9
        L_0x006a:
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r3)
        L_0x006e:
            r17 = r0
            goto L_0x00ab
        L_0x0071:
            android.media.RingtoneManager r0 = new android.media.RingtoneManager
            android.content.Context r4 = r20.mo27827K0()
            r0.<init>(r4)
            android.content.Context r4 = r20.mo27827K0()
            java.util.List r4 = com.arlosoft.macrodroid.common.C4061t1.m15978X(r4, r3, r2)
            r5 = 0
        L_0x0083:
            int r6 = r4.size()
            if (r5 >= r6) goto L_0x00a9
            java.lang.Object r6 = r4.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r12.m_ringtoneName
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00a6
            r0.setType(r3)
            android.database.Cursor r1 = r0.getCursor()
            android.net.Uri r0 = r0.getRingtoneUri(r5)
            r1.close()
            goto L_0x006e
        L_0x00a6:
            int r5 = r5 + 1
            goto L_0x0083
        L_0x00a9:
            r17 = r1
        L_0x00ab:
            int r0 = r12.m_notificationChannelType
            java.lang.String r1 = "action_notification"
            if (r0 != r3) goto L_0x00b4
            java.lang.String r0 = r12.notificationChannelName
            goto L_0x00ba
        L_0x00b4:
            if (r0 != 0) goto L_0x00b8
            r0 = r1
            goto L_0x00ba
        L_0x00b8:
            java.lang.String r0 = "action_notification_high_priority"
        L_0x00ba:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L_0x00f6
            android.content.Context r3 = r20.mo27827K0()
            java.lang.String r4 = "notification"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            android.app.NotificationChannel r3 = r3.getNotificationChannel(r0)
            if (r3 != 0) goto L_0x00f6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Notification channel ("
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ") not available - using default"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Long r3 = r20.mo27840Y0()
            long r3 = r3.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r0, r3)
            r18 = r1
            goto L_0x00f8
        L_0x00f6:
            r18 = r0
        L_0x00f8:
            java.lang.String r0 = r12.m_imageResourceName
            if (r0 == 0) goto L_0x012e
            java.lang.String r1 = "/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x0105
            goto L_0x0150
        L_0x0105:
            android.content.Context r0 = r20.mo27827K0()
            java.lang.String r1 = r12.m_imageResourceName
            int r6 = com.arlosoft.macrodroid.common.C4061t1.m15976V(r0, r1)
            r0 = -1
            if (r6 == r0) goto L_0x0150
            android.content.Context r1 = r20.mo27827K0()
            boolean r5 = r12.m_overwriteExisting
            int r8 = r12.m_iconBgColor
            int r10 = r12.m_priority
            r0 = r20
            r2 = r21
            r3 = r15
            r4 = r14
            r7 = r16
            r9 = r17
            r19 = 1
            r11 = r18
            r0.mo25380H3(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x014f
        L_0x012e:
            r19 = 1
            int r0 = r12.m_imageResourceId
            if (r0 <= 0) goto L_0x0150
            android.content.Context r1 = r20.mo27827K0()
            boolean r5 = r12.m_overwriteExisting
            int r6 = r12.m_imageResourceId
            int r8 = r12.m_iconBgColor
            int r10 = r12.m_priority
            r0 = r20
            r2 = r21
            r3 = r15
            r4 = r14
            r7 = r16
            r9 = r17
            r11 = r18
            r0.mo25380H3(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x014f:
            r2 = 1
        L_0x0150:
            if (r2 != 0) goto L_0x016c
            android.content.Context r1 = r20.mo27827K0()
            boolean r5 = r12.m_overwriteExisting
            r6 = -1
            int r8 = r12.m_iconBgColor
            int r10 = r12.m_priority
            r0 = r20
            r2 = r21
            r3 = r15
            r4 = r14
            r7 = r16
            r9 = r17
            r11 = r18
            r0.mo25380H3(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.NotificationAction.mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo):void");
    }

    /* renamed from: g3 */
    public void mo24702g3(Macro macro, @Nullable Macro macro2) {
        if (macro != null) {
            if (macro2 != null) {
                if (macro2.getGUID() == this.m_macroGUIDToRun) {
                    this.m_macroGUIDToRun = macro.getGUID();
                }
                Iterator<NotificationActionButton> it = this.notificationActionButtons.iterator();
                while (it.hasNext()) {
                    NotificationActionButton next = it.next();
                    if (macro2.getGUID() == next.getMacroGuid()) {
                        next.setMacroGuid(macro.getGUID());
                    }
                }
            }
            super.mo24687G2(macro);
        }
    }

    /* renamed from: g4 */
    public boolean mo25381g4(String str, String str2) {
        String str3 = this.notificationChannelName;
        if (str3 == null || !str3.equals(str)) {
            String str4 = this.tempNotificationChannelName;
            if (str4 != null && str4.equals(str)) {
                this.tempNotificationChannelName = str2;
            }
            return false;
        }
        this.notificationChannelName = str2;
        return true;
    }

    /* renamed from: h4 */
    public boolean mo25371h4() {
        return true;
    }

    @NonNull
    /* renamed from: i */
    public List<String> mo24442i() {
        ArrayList arrayList = new ArrayList();
        List<ActionBlock> c = m11532M3().mo29645c();
        if (this.m_macroGUIDToRun != 0) {
            Iterator<ActionBlock> it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActionBlock next = it.next();
                if (next.getGUID() == this.m_macroGUIDToRun) {
                    arrayList.add(next.getName());
                    break;
                }
            }
        }
        Iterator<NotificationActionButton> it2 = this.notificationActionButtons.iterator();
        while (it2.hasNext()) {
            NotificationActionButton next2 = it2.next();
            Iterator<ActionBlock> it3 = c.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                ActionBlock next3 = it3.next();
                if (next3.getGUID() == next2.getMacroGuid()) {
                    arrayList.add(next3.getName());
                    break;
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i4 */
    public boolean mo25372i4() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j4 */
    public boolean mo25373j4() {
        return Build.VERSION.SDK_INT < 26;
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo25559a1() + ": " + mo24690R2(this.m_notificationSubject, triggerContextInfo) + " / " + mo24690R2(this.m_notificationText, triggerContextInfo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k4 */
    public boolean mo25374k4() {
        return Build.VERSION.SDK_INT < 26;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == REQUEST_CODE_EDIT_NOTIFICATION_CHANNELS) {
            m11548f4();
        } else if (i == REQUEST_CODE_ICON_SELECT && i2 != 0 && this.m_iconImage != null) {
            this.m_imageResourceId = intent.getIntExtra("drawableId", 0);
            String stringExtra = intent.getStringExtra("drawableName");
            this.m_imageResourceName = stringExtra;
            if (stringExtra == null) {
                int i3 = this.m_imageResourceId;
                if (i3 > 0) {
                    this.m_iconImage.setImageResource(i3);
                    this.m_imageResourceName = null;
                }
            } else if (this.m_iconImage != null) {
                this.m_iconImage.setImageResource(C4061t1.m15976V(mo27827K0(), this.m_imageResourceName));
            }
        }
    }

    /* renamed from: r */
    public void mo24439r(@NonNull ArrayList<Long> arrayList) {
        this.m_macroGUIDToRun = arrayList.get(0).longValue();
        ArrayList<NotificationActionButton> arrayList2 = new ArrayList<>();
        Iterator<NotificationActionButton> it = this.notificationActionButtons.iterator();
        int i = 1;
        while (it.hasNext()) {
            NotificationActionButton next = it.next();
            arrayList2.add(next.copy(next.getLabel(), arrayList.get(i).longValue(), next.getClearOnPress(), next.getActionBlockData()));
            i++;
        }
        this.notificationActionButtons = arrayList2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m11531I3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_notificationText);
        parcel.writeInt(this.m_overwriteExisting ^ true ? 1 : 0);
        parcel.writeString(this.m_notificationSubject);
        parcel.writeString(this.m_imageResourceName);
        parcel.writeInt(this.m_runMacroWhenPressed ^ true ? 1 : 0);
        parcel.writeLong(this.m_macroGUIDToRun);
        parcel.writeParcelable(this.actionBlockData, i);
        parcel.writeInt(this.m_imageResourceId);
        parcel.writeInt(this.m_iconBgColor);
        parcel.writeString(this.m_ringtoneName);
        parcel.writeInt(this.m_ringtoneIndex);
        parcel.writeInt(this.m_priority);
        parcel.writeInt(this.m_notificationChannelType);
        parcel.writeString(this.notificationChannelName);
        NotificationActionButton[] notificationActionButtonArr = new NotificationActionButton[this.notificationActionButtons.size()];
        this.notificationActionButtons.toArray(notificationActionButtonArr);
        parcel.writeParcelableArray(notificationActionButtonArr, i);
    }

    public NotificationAction() {
        this.blockNextAction = false;
        this.preventBackButtonClosing = false;
        this.notificationActionButtons = new ArrayList<>();
        this.workingNotificationActionButtons = new ArrayList<>();
        m11530D1();
        this.m_iconBgColor = ContextCompat.getColor(mo27827K0(), 2131100777);
    }

    public NotificationAction(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.blockNextAction = false;
        this.preventBackButtonClosing = false;
        this.notificationActionButtons = new ArrayList<>();
        this.workingNotificationActionButtons = new ArrayList<>();
        m11530D1();
        this.m_notificationText = parcel.readString();
        this.m_overwriteExisting = parcel.readInt() == 0;
        this.m_notificationSubject = parcel.readString();
        this.m_imageResourceName = parcel.readString();
        this.m_runMacroWhenPressed = parcel.readInt() == 0 ? true : z;
        this.m_macroGUIDToRun = parcel.readLong();
        this.actionBlockData = (ActionBlockData) parcel.readParcelable(ActionBlockData.class.getClassLoader());
        this.m_imageResourceId = parcel.readInt();
        this.m_iconBgColor = parcel.readInt();
        this.m_ringtoneName = parcel.readString();
        this.m_ringtoneIndex = parcel.readInt();
        this.m_priority = parcel.readInt();
        this.m_notificationChannelType = parcel.readInt();
        this.notificationChannelName = parcel.readString();
        this.notificationActionButtons = new ArrayList<>();
        Parcelable[] readParcelableArray = parcel.readParcelableArray(NotificationActionButton.class.getClassLoader());
        if (readParcelableArray != null) {
            Collections.addAll(this.notificationActionButtons, (NotificationActionButton[]) Arrays.copyOf(readParcelableArray, readParcelableArray.length, NotificationActionButton[].class));
        }
    }
}
