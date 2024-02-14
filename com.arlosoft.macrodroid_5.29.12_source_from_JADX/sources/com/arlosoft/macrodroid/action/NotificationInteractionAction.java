package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4013g;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4049q;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.services.NotificationService;
import com.arlosoft.macrodroid.utils.C6460y1;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p057a2.C2224m;
import p128m0.C7748g2;
import p187x0.C10351d;
import p297ja.C13339u;
import p370qa.C16265l;

/* compiled from: NotificationInteractionAction.kt */
public final class NotificationInteractionAction extends Action implements C2224m, C4049q.C4050a {
    public static final Parcelable.Creator<NotificationInteractionAction> CREATOR = new C2550a();

    /* renamed from: d */
    public static final C2551b f7393d = new C2551b((C13695i) null);
    private int actionsOption;
    /* access modifiers changed from: private */
    public String applicationName;
    private boolean enableRegex;
    private boolean excludesApps;
    private int matchOption;
    private String matchText;
    /* access modifiers changed from: private */
    public String packageName;

    /* renamed from: com.arlosoft.macrodroid.action.NotificationInteractionAction$a */
    /* compiled from: NotificationInteractionAction.kt */
    public static final class C2550a implements Parcelable.Creator<NotificationInteractionAction> {
        C2550a() {
        }

        /* renamed from: a */
        public NotificationInteractionAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new NotificationInteractionAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public NotificationInteractionAction[] newArray(int i) {
            return new NotificationInteractionAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.NotificationInteractionAction$b */
    /* compiled from: NotificationInteractionAction.kt */
    public static final class C2551b {
        private C2551b() {
        }

        public /* synthetic */ C2551b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.NotificationInteractionAction$c */
    /* compiled from: NotificationInteractionAction.kt */
    public static final class C2552c implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C10351d f7394a;

        C2552c(C10351d dVar) {
            this.f7394a = dVar;
        }

        public boolean onQueryTextChange(String str) {
            C13706o.m87929f(str, "newText");
            this.f7394a.getFilter().mo41019a(str, true);
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            C13706o.m87929f(str, "query");
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.NotificationInteractionAction$d */
    /* compiled from: NotificationInteractionAction.kt */
    static final class C2553d extends C13708q implements C16265l<C4013g, C13339u> {
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ NotificationInteractionAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2553d(NotificationInteractionAction notificationInteractionAction, AppCompatDialog appCompatDialog) {
            super(1);
            this.this$0 = notificationInteractionAction;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: a */
        public final void mo25404a(C4013g gVar) {
            C13706o.m87929f(gVar, "appInfo");
            NotificationInteractionAction notificationInteractionAction = this.this$0;
            String str = gVar.f10397b;
            C13706o.m87928e(str, "appInfo.packageName");
            notificationInteractionAction.packageName = str;
            NotificationInteractionAction notificationInteractionAction2 = this.this$0;
            String str2 = gVar.f10396a;
            C13706o.m87928e(str2, "appInfo.applicationName");
            notificationInteractionAction2.applicationName = str2;
            this.this$0.m11623x3();
            this.$dialog.dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo25404a((C4013g) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.NotificationInteractionAction$e */
    /* compiled from: NotificationInteractionAction.kt */
    public static final class C2554e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7395a;

        /* renamed from: c */
        final /* synthetic */ EditText f7396c;

        C2554e(Button button, EditText editText) {
            this.f7395a = button;
            this.f7396c = editText;
        }

        public void afterTextChanged(Editable editable) {
            C13706o.m87929f(editable, "s");
            Button button = this.f7395a;
            if (button != null) {
                Editable text = this.f7396c.getText();
                C13706o.m87928e(text, "textContent.text");
                button.setEnabled(text.length() > 0);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }
    }

    public NotificationInteractionAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ NotificationInteractionAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static final void m11602A3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            if (radioButton != null) {
                radioButton.setChecked(false);
            }
            if (radioButton2 != null) {
                radioButton2.setChecked(false);
            }
            if (radioButton3 != null) {
                radioButton3.setChecked(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static final void m11603B3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            if (radioButton != null) {
                radioButton.setChecked(false);
            }
            if (radioButton2 != null) {
                radioButton2.setChecked(false);
            }
            if (radioButton3 != null) {
                radioButton3.setChecked(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static final void m11604C3(RadioButton radioButton, NotificationInteractionAction notificationInteractionAction, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, Spinner spinner, EditText editText, CheckBox checkBox, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(notificationInteractionAction, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        boolean z = true;
        int i = 0;
        if (radioButton != null && radioButton.isChecked()) {
            notificationInteractionAction.matchOption = 0;
        } else {
            if (radioButton2 != null && radioButton2.isChecked()) {
                notificationInteractionAction.matchOption = 1;
            } else {
                if (radioButton3 != null && radioButton3.isChecked()) {
                    notificationInteractionAction.matchOption = 2;
                } else {
                    if (radioButton4 == null || !radioButton4.isChecked()) {
                        z = false;
                    }
                    if (z) {
                        notificationInteractionAction.matchOption = 3;
                    }
                }
            }
        }
        if (spinner != null) {
            i = spinner.getSelectedItemPosition();
        }
        notificationInteractionAction.actionsOption = i;
        notificationInteractionAction.matchText = String.valueOf(editText != null ? editText.getText() : null);
        C13706o.m87926c(checkBox);
        notificationInteractionAction.enableRegex = checkBox.isChecked();
        appCompatDialog.dismiss();
        notificationInteractionAction.mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static final void m11605D3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static final void m11606E3(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87926c(editText);
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
    public static final void m11607F3(Activity activity, C4023j0.C4028e eVar, NotificationInteractionAction notificationInteractionAction, View view) {
        C13706o.m87929f(eVar, "$magicTextListener");
        C13706o.m87929f(notificationInteractionAction, "this$0");
        C4023j0.m15700F(activity, eVar, notificationInteractionAction.mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, notificationInteractionAction.mo24686E1());
    }

    /* renamed from: G3 */
    private final boolean m11608G3(NotificationService.C6109d dVar) {
        if (!C13706o.m87924a(dVar.f14515b, this.packageName)) {
            return false;
        }
        String t0 = C4023j0.m15760t0(mo27827K0(), this.matchText, (TriggerContextInfo) null, mo27837X0());
        C13706o.m87928e(t0, "textContent");
        Locale locale = Locale.ROOT;
        String lowerCase = t0.toLowerCase(locale);
        C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String c = C6460y1.m24791c(lowerCase, this.enableRegex);
        String lowerCase2 = t0.toLowerCase(locale);
        C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String b = C6460y1.m24790b(lowerCase2, this.enableRegex);
        int i = this.matchOption;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            String str = dVar.f14518e;
            C13706o.m87928e(str, "notification.title");
            String lowerCase3 = str.toLowerCase(locale);
            C13706o.m87928e(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (!C6460y1.m24792d(lowerCase3, c, this.enableRegex)) {
                String str2 = dVar.f14519f;
                C13706o.m87928e(str2, "notification.text");
                String lowerCase4 = str2.toLowerCase(locale);
                C13706o.m87928e(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (C6460y1.m24792d(lowerCase4, c, this.enableRegex)) {
                    return true;
                }
            }
            return true;
        } else if (i == 2) {
            String str3 = dVar.f14518e;
            C13706o.m87928e(str3, "notification.title");
            String lowerCase5 = str3.toLowerCase(locale);
            C13706o.m87928e(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (!C6460y1.m24792d(lowerCase5, b, this.enableRegex)) {
                String str4 = dVar.f14519f;
                C13706o.m87928e(str4, "notification.text");
                String lowerCase6 = str4.toLowerCase(locale);
                C13706o.m87928e(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (C6460y1.m24792d(lowerCase6, b, this.enableRegex)) {
                    return true;
                }
            }
            return true;
        } else if (i == 3) {
            String str5 = dVar.f14518e;
            C13706o.m87928e(str5, "notification.title");
            String lowerCase7 = str5.toLowerCase(locale);
            C13706o.m87928e(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (!C6460y1.m24792d(lowerCase7, b, this.enableRegex)) {
                String str6 = dVar.f14519f;
                C13706o.m87928e(str6, "notification.text");
                String lowerCase8 = str6.toLowerCase(locale);
                C13706o.m87928e(lowerCase8, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!C6460y1.m24792d(lowerCase8, b, this.enableRegex)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: v3 */
    private final void m11621v3(List<? extends C4013g> list) {
        Activity j0 = mo27850j0();
        if (j0 != null) {
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_app_chooser);
            appCompatDialog.setTitle((int) C17541R$string.select_application);
            ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.button_bar);
            ListView listView = (ListView) appCompatDialog.findViewById(C17532R$id.application_list);
            SearchView searchView = (SearchView) appCompatDialog.findViewById(C17532R$id.search_view);
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            C2553d dVar = new C2553d(this, appCompatDialog);
            List I0 = C13566b0.m87405I0(list);
            for (C4013g gVar : list) {
                if (C13706o.m87924a(gVar.f10397b, this.packageName)) {
                    I0.add(0, gVar);
                }
            }
            C3168jb jbVar = new C3168jb(dVar);
            WindowManager.LayoutParams layoutParams = null;
            C10351d dVar2 = new C10351d(j0, I0, (List<Boolean>) null, jbVar);
            C13706o.m87926c(listView);
            listView.setAdapter(dVar2);
            C13706o.m87926c(searchView);
            searchView.setOnQueryTextListener(new C2552c(dVar2));
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
            Window window = appCompatDialog.getWindow();
            if (window != null) {
                layoutParams = window.getAttributes();
            }
            layoutParams2.copyFrom(layoutParams);
            layoutParams2.width = -1;
            layoutParams2.height = -2;
            appCompatDialog.show();
            Window window2 = appCompatDialog.getWindow();
            if (window2 != null) {
                window2.setAttributes(layoutParams2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m11622w3(C16265l lVar, C4013g gVar) {
        C13706o.m87929f(lVar, "$tmp0");
        lVar.invoke(gVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public final void m11623x3() {
        Button button;
        CheckBox checkBox;
        Spinner spinner;
        RadioButton radioButton;
        AppCompatDialog appCompatDialog;
        boolean z;
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog2 = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog2.setContentView((int) C17535R$layout.notification_text_dialog);
        appCompatDialog2.setTitle((int) C17541R$string.action_notification_interaction);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog2.getWindow();
        layoutParams.copyFrom(window != null ? window.getAttributes() : null);
        layoutParams.width = -1;
        Window window2 = appCompatDialog2.getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        Button button2 = (Button) appCompatDialog2.findViewById(C17532R$id.okButton);
        Button button3 = (Button) appCompatDialog2.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog2.findViewById(C17532R$id.notification_text_dialog_text_content);
        RadioButton radioButton2 = (RadioButton) appCompatDialog2.findViewById(C17532R$id.notification_text_dialog_any_radio_button);
        RadioButton radioButton3 = (RadioButton) appCompatDialog2.findViewById(C17532R$id.notification_text_dialog_matches_radio_button);
        RadioButton radioButton4 = (RadioButton) appCompatDialog2.findViewById(C17532R$id.notification_text_dialog_contains_radio_button);
        RadioButton radioButton5 = (RadioButton) appCompatDialog2.findViewById(C17532R$id.notification_text_dialog_excludes_radio_button);
        CheckBox checkBox2 = (CheckBox) appCompatDialog2.findViewById(C17532R$id.enable_regex);
        CheckBox checkBox3 = (CheckBox) appCompatDialog2.findViewById(C17532R$id.notification_text_dialog_exclude_ongoing);
        Button button4 = (Button) appCompatDialog2.findViewById(C17532R$id.magic_text_button);
        CheckBox checkBox4 = (CheckBox) appCompatDialog2.findViewById(C17532R$id.notification_text_dialog_supress_multiples);
        if (checkBox4 != null) {
            checkBox4.setVisibility(8);
        }
        ViewGroup viewGroup = (ViewGroup) appCompatDialog2.findViewById(C17532R$id.actions_container);
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        Spinner spinner2 = (Spinner) appCompatDialog2.findViewById(C17532R$id.notification_actions_spinner);
        String j1 = SelectableItem.m15535j1(C17541R$string.action_notification_interaction_action_click_content);
        Button button5 = button4;
        C13706o.m87928e(j1, "getString(R.string.actio…ion_action_click_content)");
        List p = C13614t.m87754p(j1);
        int i = 1;
        while (i < 6) {
            C13696i0 i0Var = C13696i0.f61931a;
            String j12 = SelectableItem.m15535j1(C17541R$string.action_notification_interaction_action_click_action_number);
            C13706o.m87928e(j12, "getString(R.string.actio…tion_click_action_number)");
            String format = String.format(j12, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            C13706o.m87928e(format, "format(format, *args)");
            p.add(format);
            i++;
            button3 = button3;
            appCompatDialog2 = appCompatDialog2;
        }
        AppCompatDialog appCompatDialog3 = appCompatDialog2;
        Button button6 = button3;
        ArrayAdapter arrayAdapter = new ArrayAdapter(j0, 17367048, p);
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        if (spinner2 != null) {
            spinner2.setAdapter(arrayAdapter);
        }
        if (spinner2 != null) {
            spinner2.setSelection(this.actionsOption, false);
        }
        if (checkBox3 != null) {
            checkBox3.setVisibility(8);
        }
        if (editText != null) {
            editText.setText(this.matchText);
        }
        if (checkBox2 != null) {
            checkBox2.setChecked(this.enableRegex);
        }
        if (radioButton3 != null) {
            radioButton3.setChecked(false);
        }
        if (radioButton4 != null) {
            radioButton4.setChecked(false);
        }
        if (radioButton5 != null) {
            radioButton5.setChecked(false);
        }
        if (radioButton2 != null) {
            radioButton2.setChecked(false);
        }
        int i2 = this.matchOption;
        if (i2 == 0) {
            if (radioButton2 != null) {
                radioButton2.setChecked(true);
            }
            if (editText != null) {
                editText.setEnabled(false);
            }
            if (button2 != null) {
                button2.setEnabled(false);
            }
        } else if (i2 == 1) {
            if (radioButton3 != null) {
                radioButton3.setChecked(true);
            }
            if (editText != null) {
                editText.setEnabled(true);
            }
            if (button2 != null) {
                C13706o.m87926c(editText);
                button2.setEnabled(editText.length() > 0);
            }
        } else if (i2 == 2) {
            if (radioButton4 != null) {
                radioButton4.setChecked(true);
            }
            if (editText != null) {
                editText.setEnabled(true);
            }
            C13706o.m87926c(button2);
            C13706o.m87926c(editText);
            button2.setEnabled(editText.length() > 0);
        } else if (i2 == 3) {
            if (radioButton5 != null) {
                radioButton5.setChecked(true);
            }
            if (editText != null) {
                editText.setEnabled(true);
            }
            if (button2 != null) {
                C13706o.m87926c(editText);
                button2.setEnabled(editText.length() > 0);
            }
        }
        if (radioButton2 != null) {
            spinner = spinner2;
            button = button5;
            checkBox = checkBox2;
            radioButton2.setOnCheckedChangeListener(new C3027eb(editText, button2, radioButton3, radioButton4, radioButton5));
        } else {
            spinner = spinner2;
            button = button5;
            checkBox = checkBox2;
        }
        if (radioButton3 != null) {
            radioButton3.setOnCheckedChangeListener(new C3056fb(radioButton2, radioButton4, radioButton5));
        }
        if (radioButton4 != null) {
            radioButton4.setOnCheckedChangeListener(new C3084gb(radioButton3, radioButton2, radioButton5));
        }
        if (radioButton5 != null) {
            radioButton5.setOnCheckedChangeListener(new C3112hb(radioButton3, radioButton4, radioButton2));
        }
        if (editText != null) {
            editText.addTextChangedListener(new C2554e(button2, editText));
        }
        if (button2 != null) {
            radioButton = radioButton2;
            button2.setOnClickListener(new C2970cb(radioButton2, this, radioButton3, radioButton4, radioButton5, spinner, editText, checkBox, appCompatDialog3));
        } else {
            radioButton = radioButton2;
        }
        if (button2 != null) {
            if (this.matchOption != 0) {
                C13706o.m87926c(radioButton);
                if (radioButton.length() <= 0) {
                    z = false;
                    button2.setEnabled(z);
                }
            }
            z = true;
            button2.setEnabled(z);
        }
        if (button6 != null) {
            appCompatDialog = appCompatDialog3;
            button6.setOnClickListener(new C2999db(appCompatDialog));
        } else {
            appCompatDialog = appCompatDialog3;
        }
        C3140ib ibVar = new C3140ib(editText);
        C13706o.m87926c(button);
        button.setOnClickListener(new C2942bb(j0, ibVar, this));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static final void m11624y3(EditText editText, Button button, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (editText != null) {
            editText.setEnabled(!z);
        }
        boolean z2 = true;
        if (z) {
            C13706o.m87926c(button);
            button.setEnabled(true);
            if (radioButton != null) {
                radioButton.setChecked(false);
            }
            if (radioButton2 != null) {
                radioButton2.setChecked(false);
            }
            if (radioButton3 != null) {
                radioButton3.setChecked(false);
            }
        } else if (button != null) {
            C13706o.m87926c(editText);
            Editable text = editText.getText();
            C13706o.m87926c(text);
            if (text.length() <= 0) {
                z2 = false;
            }
            button.setEnabled(z2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static final void m11625z3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            if (radioButton != null) {
                radioButton.setChecked(false);
            }
            if (radioButton2 != null) {
                radioButton2.setChecked(false);
            }
            if (radioButton3 != null) {
                radioButton3.setChecked(false);
            }
        }
    }

    /* renamed from: B0 */
    public void mo24816B0(List<? extends C4013g> list, boolean z) {
        C13706o.m87929f(list, "appInfoList");
        if (mo27836X() && z) {
            m11621v3(list);
        }
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.matchText};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        C13706o.m87929f(strArr, "magicText");
        if (strArr.length == 1) {
            this.matchText = strArr[0];
            return;
        }
        FirebaseCrashlytics a = FirebaseCrashlytics.m6487a();
        a.mo22936d(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ')'));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str;
        if (this.actionsOption == 0) {
            str = SelectableItem.m15535j1(C17541R$string.action_notification_interaction_action_click_content);
        } else {
            C13696i0 i0Var = C13696i0.f61931a;
            String j1 = SelectableItem.m15535j1(C17541R$string.action_notification_interaction_action_click_action_number);
            C13706o.m87928e(j1, "getString(R.string.actio…tion_click_action_number)");
            str = String.format(j1, Arrays.copyOf(new Object[]{Integer.valueOf(this.actionsOption)}, 1));
            C13706o.m87928e(str, "format(format, *args)");
        }
        C13706o.m87928e(str, "if (actionsOption == 0) … actionsOption)\n        }");
        int i = this.matchOption;
        if (i == 0) {
            return SelectableItem.m15535j1(C17541R$string.trigger_notification_any_content) + " (" + this.applicationName + ") - " + str;
        } else if (i == 3) {
            return SelectableItem.m15535j1(C17541R$string.trigger_notification_excludes) + ' ' + this.matchText + " (" + this.applicationName + ") - " + str;
        } else if (i == 1) {
            return SelectableItem.m15535j1(C17541R$string.trigger_notification_matches) + ' ' + this.matchText + " (" + this.applicationName + ") - " + str;
        } else {
            return SelectableItem.m15535j1(C17541R$string.trigger_notification_contains) + ' ' + this.matchText + " (" + this.applicationName + ") - " + str;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7748g2.f18733j.mo37752a();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        StatusBarNotification[] g = NotificationService.m24182g();
        if (g != null) {
            for (StatusBarNotification statusBarNotification : g) {
                NotificationService.C6109d k = NotificationService.m24186k(statusBarNotification);
                C13706o.m87928e(k, "notificationInfo");
                if (m11608G3(k)) {
                    if (this.actionsOption == 0) {
                        try {
                            PendingIntent pendingIntent = statusBarNotification.getNotification().contentIntent;
                            if (pendingIntent != null) {
                                pendingIntent.send();
                            }
                        } catch (PendingIntent.CanceledException e) {
                            Long Y0 = mo27840Y0();
                            C13706o.m87928e(Y0, "macroGuid");
                            C4878b.m18869h("Unable to invoke notification, perhaps it's already been invoked once and cannot be again?: " + e, Y0.longValue());
                        }
                    } else {
                        Notification.Action[] actionArr = statusBarNotification.getNotification().actions;
                        int i = this.actionsOption - 1;
                        if (actionArr == null) {
                            Long Y02 = mo27840Y0();
                            C13706o.m87928e(Y02, "macroGuid");
                            C4878b.m18862a("Cannot invoke action " + this.actionsOption + " Notification has no actions", Y02.longValue());
                        } else if (actionArr.length < i) {
                            Long Y03 = mo27840Y0();
                            C13706o.m87928e(Y03, "macroGuid");
                            C4878b.m18862a("Cannot invoke action " + this.actionsOption + " Notification has " + actionArr.length + " actions", Y03.longValue());
                        } else {
                            try {
                                PendingIntent pendingIntent2 = actionArr[i].actionIntent;
                                if (pendingIntent2 != null) {
                                    pendingIntent2.send();
                                }
                            } catch (Exception e2) {
                                Long Y04 = mo27840Y0();
                                C13706o.m87928e(Y04, "macroGuid");
                                C4878b.m18862a("Cannot invoke action " + this.actionsOption + ": " + e2, Y04.longValue());
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: q2 */
    public boolean mo24773q2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        new C4049q(this, mo27850j0(), true, false, ContextCompat.getColor(mo27827K0(), C17528R$color.actions_accent)).execute(new Void[]{null});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.packageName);
        parcel.writeString(this.applicationName);
        parcel.writeInt(this.matchOption);
        parcel.writeString(this.matchText);
        parcel.writeInt(this.excludesApps ? 1 : 0);
        parcel.writeInt(this.enableRegex ? 1 : 0);
        parcel.writeInt(this.actionsOption);
    }

    private NotificationInteractionAction() {
        this.packageName = "";
        this.applicationName = "";
        this.matchText = "";
    }

    private NotificationInteractionAction(Parcel parcel) {
        super(parcel);
        String str = "";
        this.packageName = str;
        this.applicationName = str;
        this.matchText = str;
        String readString = parcel.readString();
        this.packageName = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.applicationName = readString2 == null ? str : readString2;
        this.matchOption = parcel.readInt();
        String readString3 = parcel.readString();
        this.matchText = readString3 != null ? readString3 : str;
        boolean z = true;
        this.excludesApps = parcel.readInt() != 0;
        this.enableRegex = parcel.readInt() == 0 ? false : z;
        this.actionsOption = parcel.readInt();
    }
}
