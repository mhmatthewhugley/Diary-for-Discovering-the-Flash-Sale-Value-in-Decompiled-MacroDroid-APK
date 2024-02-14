package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
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
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.PreferencesActivity;
import com.arlosoft.macrodroid.triggers.services.QueryUiService;
import com.arlosoft.macrodroid.utils.C6378f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p057a2.C2224m;
import p119k3.C7542p1;
import p135n1.C7967d;
import p187x0.C10351d;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* compiled from: ScreenContentTrigger.kt */
public final class ScreenContentTrigger extends Trigger implements C2224m, C4049q.C4050a {
    public static final Parcelable.Creator<ScreenContentTrigger> CREATOR = new C5731a();

    /* renamed from: d */
    public static final C5732b f13677d = new C5732b((C13695i) null);
    private static int triggerCount;
    private ArrayList<String> appNameList;
    private transient EditText applicationsText;
    private transient boolean canTrigger;
    private boolean enableRegex;
    private boolean ignoreCase;
    private ArrayList<String> packageNameList;
    private String textToMatch;
    /* access modifiers changed from: private */
    public transient ArrayList<String> workingAppNameList;
    /* access modifiers changed from: private */
    public transient ArrayList<String> workingPackageNameList;

    /* renamed from: com.arlosoft.macrodroid.triggers.ScreenContentTrigger$a */
    /* compiled from: ScreenContentTrigger.kt */
    public static final class C5731a implements Parcelable.Creator<ScreenContentTrigger> {
        C5731a() {
        }

        /* renamed from: a */
        public ScreenContentTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ScreenContentTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public ScreenContentTrigger[] newArray(int i) {
            return new ScreenContentTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ScreenContentTrigger$b */
    /* compiled from: ScreenContentTrigger.kt */
    public static final class C5732b {
        private C5732b() {
        }

        public /* synthetic */ C5732b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ScreenContentTrigger$c */
    /* compiled from: ScreenContentTrigger.kt */
    public static final class C5733c implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ C10351d f13678a;

        /* renamed from: b */
        final /* synthetic */ CheckBox f13679b;

        C5733c(C10351d dVar, CheckBox checkBox) {
            this.f13678a = dVar;
            this.f13679b = checkBox;
        }

        public boolean onQueryTextChange(String str) {
            C13706o.m87929f(str, "newText");
            this.f13678a.getFilter().mo41019a(str, this.f13679b.isChecked());
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            C13706o.m87929f(str, "query");
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ScreenContentTrigger$d */
    /* compiled from: ScreenContentTrigger.kt */
    static final class C5734d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C10351d $adapter;
        final /* synthetic */ AppCompatDialog $dialog;
        int label;
        final /* synthetic */ ScreenContentTrigger this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5734d(ScreenContentTrigger screenContentTrigger, C10351d dVar, AppCompatDialog appCompatDialog, C13635d<? super C5734d> dVar2) {
            super(3, dVar2);
            this.this$0 = screenContentTrigger;
            this.$adapter = dVar;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5734d(this.this$0, this.$adapter, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.workingPackageNameList = new ArrayList();
                this.this$0.workingAppNameList = new ArrayList();
                List<C4013g> g = this.$adapter.mo41012g();
                int size = g.size();
                int i = 0;
                boolean z = false;
                while (i < size) {
                    C4013g gVar = g.get(i);
                    this.this$0.workingPackageNameList.add(gVar.f10397b);
                    this.this$0.workingAppNameList.add(gVar.f10396a);
                    EditText u3 = this.this$0.mo31457u3();
                    if (u3 != null) {
                        ScreenContentTrigger screenContentTrigger = this.this$0;
                        screenContentTrigger.m23085E3(u3, screenContentTrigger.workingAppNameList);
                    }
                    i++;
                    z = true;
                }
                if (z) {
                    this.$dialog.dismiss();
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ScreenContentTrigger$e */
    /* compiled from: ScreenContentTrigger.kt */
    static final class C5735e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;
        final /* synthetic */ ScreenContentTrigger this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5735e(ScreenContentTrigger screenContentTrigger, AppCompatDialog appCompatDialog, C13635d<? super C5735e> dVar) {
            super(3, dVar);
            this.this$0 = screenContentTrigger;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5735e(this.this$0, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.workingPackageNameList = new ArrayList();
                this.this$0.workingAppNameList = new ArrayList();
                EditText u3 = this.this$0.mo31457u3();
                if (u3 != null) {
                    ScreenContentTrigger screenContentTrigger = this.this$0;
                    screenContentTrigger.m23085E3(u3, screenContentTrigger.workingAppNameList);
                }
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ScreenContentTrigger$f */
    /* compiled from: ScreenContentTrigger.kt */
    static final class C5736f extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $magicTextListener;
        int label;
        final /* synthetic */ ScreenContentTrigger this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5736f(ScreenContentTrigger screenContentTrigger, C4023j0.C4028e eVar, C13635d<? super C5736f> dVar) {
            super(3, dVar);
            this.this$0 = screenContentTrigger;
            this.$magicTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5736f(this.this$0, this.$magicTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15698D(this.this$0.mo27850j0(), this.$magicTextListener, this.this$0.mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, C7967d.NONE);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ScreenContentTrigger$g */
    /* compiled from: ScreenContentTrigger.kt */
    static final class C5737g extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ScreenContentTrigger this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5737g(ScreenContentTrigger screenContentTrigger, C13635d<? super C5737g> dVar) {
            super(3, dVar);
            this.this$0 = screenContentTrigger;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5737g(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                ScreenContentTrigger screenContentTrigger = this.this$0;
                new C4049q(screenContentTrigger, screenContentTrigger.mo27850j0(), true, false, ContextCompat.getColor(this.this$0.mo27827K0(), C17528R$color.actions_accent)).execute(new Void[]{null});
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ScreenContentTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ ScreenContentTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static final void m23083A3(ScreenContentTrigger screenContentTrigger, EditText editText, CheckBox checkBox, CheckBox checkBox2, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(screenContentTrigger, "this$0");
        C13706o.m87929f(editText, "$textToMatchView");
        C13706o.m87929f(checkBox, "$enableRegexCheckBox");
        C13706o.m87929f(checkBox2, "$ignoreCaseCheckBox");
        C13706o.m87929f(appCompatDialog, "$dialog");
        screenContentTrigger.textToMatch = editText.getText().toString();
        screenContentTrigger.enableRegex = checkBox.isChecked();
        screenContentTrigger.ignoreCase = checkBox2.isChecked();
        screenContentTrigger.packageNameList = screenContentTrigger.workingPackageNameList;
        screenContentTrigger.appNameList = screenContentTrigger.workingAppNameList;
        screenContentTrigger.mo24689O1();
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static final void m23084B3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public final void m23085E3(EditText editText, List<String> list) {
        if (list.isEmpty()) {
            editText.setText(SelectableItem.m15535j1(C17541R$string.all_applications));
        } else {
            editText.setText(C15176v.m93630E(C15176v.m93630E(C13566b0.m87449x0(list).toString(), "[", "", false, 4, (Object) null), "]", "", false, 4, (Object) null));
        }
    }

    /* renamed from: r3 */
    private final void m23097r3(List<? extends C4013g> list) {
        List<C4013g> b = C6378f.m24625b(list, this.packageNameList);
        ArrayList arrayList = new ArrayList(b.size());
        int size = b.size();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < size) {
                int size2 = this.packageNameList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        z = false;
                        break;
                    } else if (C13706o.m87924a(this.packageNameList.get(i2), b.get(i).f10397b)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                arrayList.add(Boolean.valueOf(z));
                i++;
            } else {
                Activity j0 = mo27850j0();
                AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
                appCompatDialog.setContentView((int) C17535R$layout.dialog_app_chooser);
                appCompatDialog.setTitle((int) C17541R$string.select_applications);
                View findViewById = appCompatDialog.findViewById(C17532R$id.application_list);
                C13706o.m87926c(findViewById);
                View findViewById2 = appCompatDialog.findViewById(C17532R$id.okButton);
                C13706o.m87926c(findViewById2);
                View findViewById3 = appCompatDialog.findViewById(C17532R$id.cancelButton);
                C13706o.m87926c(findViewById3);
                View findViewById4 = appCompatDialog.findViewById(C17532R$id.include_exclude_options);
                C13706o.m87926c(findViewById4);
                View findViewById5 = appCompatDialog.findViewById(C17532R$id.radio_options);
                C13706o.m87926c(findViewById5);
                View findViewById6 = appCompatDialog.findViewById(C17532R$id.non_launchable_checkbox);
                C13706o.m87926c(findViewById6);
                CheckBox checkBox = (CheckBox) findViewById6;
                View findViewById7 = appCompatDialog.findViewById(C17532R$id.search_view);
                C13706o.m87926c(findViewById7);
                SearchView searchView = (SearchView) findViewById7;
                View findViewById8 = appCompatDialog.findViewById(C17532R$id.allAppsButton);
                C13706o.m87926c(findViewById8);
                Button button = (Button) findViewById8;
                button.setVisibility(0);
                ((ViewGroup) findViewById4).setVisibility(0);
                ((ViewGroup) findViewById5).setVisibility(8);
                checkBox.setVisibility(0);
                C10351d dVar = new C10351d(j0, b, arrayList, (C10351d.C10353b) null);
                ((ListView) findViewById).setAdapter(dVar);
                dVar.getFilter().mo41019a("", false);
                checkBox.setOnCheckedChangeListener(new C5888c7(dVar, searchView));
                searchView.setOnQueryTextListener(new C5733c(dVar, checkBox));
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = appCompatDialog.getWindow();
                C13706o.m87926c(window);
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                ((Button) findViewById3).setOnClickListener(new C6200y6(appCompatDialog));
                C4666m.m18147o((Button) findViewById2, (C13640g) null, new C5734d(this, dVar, appCompatDialog, (C13635d<? super C5734d>) null), 1, (Object) null);
                C4666m.m18147o(button, (C13640g) null, new C5735e(this, appCompatDialog, (C13635d<? super C5735e>) null), 1, (Object) null);
                appCompatDialog.show();
                Window window2 = appCompatDialog.getWindow();
                C13706o.m87926c(window2);
                window2.setAttributes(layoutParams);
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m23098s3(C10351d dVar, SearchView searchView, CompoundButton compoundButton, boolean z) {
        C13706o.m87929f(dVar, "$adapter");
        C13706o.m87929f(searchView, "$searchView");
        dVar.getFilter().mo41019a(searchView.getQuery().toString(), z);
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static final void m23099t3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static final void m23100y3(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$textToMatchView");
        int b = C16792h.m99540b(editText.getSelectionStart(), 0);
        int b2 = C16792h.m99540b(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        if (text != null) {
            int min = Math.min(b, b2);
            int max = Math.max(b, b2);
            String str = fVar.f10575a;
            text.replace(min, max, str, 0, str.length());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static final void m23101z3(ScreenContentTrigger screenContentTrigger, View view) {
        C13706o.m87929f(screenContentTrigger, "this$0");
        Intent intent = new Intent(screenContentTrigger.mo27850j0(), PreferencesActivity.class);
        intent.putExtra("shortcut", 5);
        screenContentTrigger.mo27850j0().startActivity(intent);
    }

    /* renamed from: B0 */
    public void mo24816B0(List<? extends C4013g> list, boolean z) {
        C13706o.m87929f(list, "appInfoList");
        if (mo27836X() && z) {
            m23097r3(list);
        }
    }

    /* renamed from: C3 */
    public final boolean mo31454C3() {
        return this.ignoreCase;
    }

    /* renamed from: D3 */
    public final boolean mo31455D3() {
        return this.enableRegex;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        String[] strArr = new String[1];
        String str = this.textToMatch;
        if (str == null) {
            str = "";
        }
        strArr[0] = str;
        return strArr;
    }

    /* renamed from: F3 */
    public final void mo31456F3(boolean z) {
        this.canTrigger = z;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return super.mo25559a1() + " (" + this.textToMatch + ')';
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        boolean z = true;
        if (strArr == null || strArr.length != 1) {
            z = false;
        }
        if (z) {
            this.textToMatch = strArr[0];
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (!this.appNameList.isEmpty()) {
            return C15176v.m93630E(C15176v.m93630E(C13566b0.m87449x0(this.appNameList).toString(), "[", "", false, 4, (Object) null), "]", "", false, 4, (Object) null);
        }
        String j1 = SelectableItem.m15535j1(C17541R$string.all_applications);
        C13706o.m87928e(j1, "getString(R.string.all_applications)");
        return j1;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = triggerCount - 1;
        triggerCount = i;
        if (i == 0) {
            mo27827K0().stopService(new Intent(mo27827K0(), QueryUiService.class));
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7542p1.f18427j.mo37648a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " [" + mo24672O0() + ']';
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (triggerCount == 0) {
            mo27827K0().startService(new Intent(mo27827K0(), QueryUiService.class));
        }
        triggerCount++;
    }

    /* renamed from: r2 */
    public boolean mo25499r2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_ui_query_config);
        appCompatDialog.setTitle((int) C17541R$string.trigger_screen_content);
        this.workingPackageNameList = this.packageNameList;
        this.workingAppNameList = this.appNameList;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
        View findViewById = appCompatDialog.findViewById(C17532R$id.okButton);
        C13706o.m87926c(findViewById);
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87926c(findViewById2);
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.textToMatch);
        C13706o.m87926c(findViewById3);
        EditText editText = (EditText) findViewById3;
        View findViewById4 = appCompatDialog.findViewById(C17532R$id.magicTextButton);
        C13706o.m87926c(findViewById4);
        View findViewById5 = appCompatDialog.findViewById(C17532R$id.enableRegexCheckbox);
        C13706o.m87926c(findViewById5);
        CheckBox checkBox = (CheckBox) findViewById5;
        View findViewById6 = appCompatDialog.findViewById(C17532R$id.selectAppsButton);
        C13706o.m87926c(findViewById6);
        View findViewById7 = appCompatDialog.findViewById(C17532R$id.ignoreCaseCheckbox);
        C13706o.m87926c(findViewById7);
        CheckBox checkBox2 = (CheckBox) findViewById7;
        View findViewById8 = appCompatDialog.findViewById(C17532R$id.updateRateLink);
        C13706o.m87926c(findViewById8);
        View findViewById9 = appCompatDialog.findViewById(C17532R$id.applicationsText);
        C13706o.m87926c(findViewById9);
        EditText editText2 = (EditText) findViewById9;
        this.applicationsText = editText2;
        C13706o.m87926c(editText2);
        m23085E3(editText2, this.appNameList);
        editText.setText(this.textToMatch);
        checkBox.setChecked(this.enableRegex);
        checkBox2.setChecked(this.ignoreCase);
        C4666m.m18147o((Button) findViewById4, (C13640g) null, new C5736f(this, new C5900d7(editText), (C13635d<? super C5736f>) null), 1, (Object) null);
        C4666m.m18147o((ImageButton) findViewById6, (C13640g) null, new C5737g(this, (C13635d<? super C5737g>) null), 1, (Object) null);
        findViewById8.setOnClickListener(new C5813a7(this));
        ((Button) findViewById).setOnClickListener(new C5876b7(this, editText, checkBox, checkBox2, appCompatDialog));
        ((Button) findViewById2).setOnClickListener(new C6212z6(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: u3 */
    public final EditText mo31457u3() {
        return this.applicationsText;
    }

    /* renamed from: v3 */
    public final boolean mo31458v3() {
        return this.canTrigger;
    }

    /* renamed from: w3 */
    public final ArrayList<String> mo31459w3() {
        return this.packageNameList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.textToMatch);
        parcel.writeInt(this.ignoreCase ? 1 : 0);
        parcel.writeInt(this.enableRegex ? 1 : 0);
        parcel.writeStringList(this.packageNameList);
        parcel.writeStringList(this.appNameList);
    }

    /* renamed from: x3 */
    public final String mo31460x3() {
        if (this.textToMatch == null) {
            return null;
        }
        String t0 = C4023j0.m15760t0(mo27827K0().getApplicationContext(), this.textToMatch, (TriggerContextInfo) null, mo27837X0());
        if (!this.ignoreCase) {
            return t0;
        }
        C13706o.m87928e(t0, "text");
        String lowerCase = t0.toLowerCase(Locale.ROOT);
        C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public ScreenContentTrigger() {
        this.packageNameList = new ArrayList<>();
        this.appNameList = new ArrayList<>();
        this.ignoreCase = true;
        this.workingPackageNameList = new ArrayList<>();
        this.workingAppNameList = new ArrayList<>();
        this.canTrigger = true;
    }

    private ScreenContentTrigger(Parcel parcel) {
        super(parcel);
        this.packageNameList = new ArrayList<>();
        this.appNameList = new ArrayList<>();
        boolean z = true;
        this.ignoreCase = true;
        this.workingPackageNameList = new ArrayList<>();
        this.workingAppNameList = new ArrayList<>();
        this.canTrigger = true;
        this.textToMatch = parcel.readString();
        this.ignoreCase = parcel.readInt() != 0;
        this.enableRegex = parcel.readInt() == 0 ? false : z;
        this.packageNameList = new ArrayList<>();
        this.appNameList = new ArrayList<>();
        parcel.readStringList(this.packageNameList);
        parcel.readStringList(this.appNameList);
    }
}
