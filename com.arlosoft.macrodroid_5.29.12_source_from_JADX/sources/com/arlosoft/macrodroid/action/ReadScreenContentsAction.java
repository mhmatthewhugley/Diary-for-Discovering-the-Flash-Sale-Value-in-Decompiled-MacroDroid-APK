package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.services.UIInteractionAccessibilityService;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.upgrade.UpgradeActivity2;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.C15576z2;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import kotlinx.coroutines.flow.C15290h;
import p057a2.C2212a;
import p057a2.C2216e;
import p057a2.C2220i;
import p057a2.C2224m;
import p112j2.C7439d0;
import p128m0.C7840s2;
import p148q0.C8151a;
import p162s2.C10182a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16265l;
import p370qa.C16269p;

/* compiled from: ReadScreenContentsAction.kt */
public final class ReadScreenContentsAction extends Action implements C2220i, C2212a, C2224m, C2216e {
    public static final Parcelable.Creator<ReadScreenContentsAction> CREATOR = new C2592a();
    private static final int READ_SCREEN_TIMEOUT_SECONDS = 5;

    /* renamed from: g */
    public static final C2593b f7462g = new C2593b((C13695i) null);

    /* renamed from: d */
    public transient C10182a f7463d;
    /* access modifiers changed from: private */
    public DictionaryKeys dictionaryKeys;

    /* renamed from: f */
    public transient C4083b f7464f;
    /* access modifiers changed from: private */
    public boolean isLocalVar;
    private transient int selectedIndex;
    /* access modifiers changed from: private */
    public String variableName;

    /* renamed from: com.arlosoft.macrodroid.action.ReadScreenContentsAction$a */
    /* compiled from: ReadScreenContentsAction.kt */
    public static final class C2592a implements Parcelable.Creator<ReadScreenContentsAction> {
        C2592a() {
        }

        /* renamed from: a */
        public ReadScreenContentsAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ReadScreenContentsAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public ReadScreenContentsAction[] newArray(int i) {
            return new ReadScreenContentsAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ReadScreenContentsAction$b */
    /* compiled from: ReadScreenContentsAction.kt */
    public static final class C2593b {
        private C2593b() {
        }

        public /* synthetic */ C2593b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ReadScreenContentsAction$c */
    /* compiled from: ReadScreenContentsAction.kt */
    public static final class C2594c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7465a;

        /* renamed from: c */
        final /* synthetic */ EditText f7466c;

        C2594c(Button button, EditText editText) {
            this.f7465a = button;
            this.f7466c = editText;
        }

        public void afterTextChanged(Editable editable) {
            C13706o.m87929f(editable, "s");
            Button button = this.f7465a;
            C13706o.m87926c(button);
            Editable text = this.f7466c.getText();
            C13706o.m87928e(text, "keyName.text");
            button.setEnabled(text.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ReadScreenContentsAction$d */
    /* compiled from: ReadScreenContentsAction.kt */
    public static final class C2595d implements C6520o0.C6530d {

        /* renamed from: a */
        final /* synthetic */ ReadScreenContentsAction f7467a;

        C2595d(ReadScreenContentsAction readScreenContentsAction) {
            this.f7467a = readScreenContentsAction;
        }

        /* renamed from: a */
        public void mo25509a(MacroDroidVariable macroDroidVariable, boolean z) {
            C13706o.m87929f(macroDroidVariable, "variable");
            macroDroidVariable.mo27761i0(false);
            if ((macroDroidVariable.mo27754c0() && this.f7467a.mo27837X0().findLocalVariableByName(macroDroidVariable.getName()) != null) || (!macroDroidVariable.mo27754c0() && C4064u.m16048t().mo27996w(macroDroidVariable.getName()) != null)) {
                this.f7467a.m11943A3();
            } else if (z) {
                this.f7467a.mo27835S(macroDroidVariable);
                this.f7467a.m11945C3(macroDroidVariable, macroDroidVariable.mo27770n(), new ArrayList(), 0);
            } else {
                this.f7467a.isLocalVar = macroDroidVariable.mo27754c0();
                this.f7467a.m11945C3(macroDroidVariable, macroDroidVariable.mo27770n(), new ArrayList(), 0);
            }
        }

        /* renamed from: b */
        public boolean mo25510b(String str) {
            C13706o.m87929f(str, "variableName");
            return this.f7467a.mo27837X0().findLocalVariableByName(str) == null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ReadScreenContentsAction$e */
    /* compiled from: ReadScreenContentsAction.kt */
    static final class C2596e extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ TriggerContextInfo $contextInfo;
        final /* synthetic */ boolean $forceEvenIfNotEnabled;
        final /* synthetic */ boolean $isTest;
        final /* synthetic */ int $nextAction;
        final /* synthetic */ ResumeMacroInfo $resumeMacroInfo;
        final /* synthetic */ Stack<Integer> $skipEndifIndexStack;
        final /* synthetic */ C13684d0<MacroDroidVariable> $variable;
        int label;
        final /* synthetic */ ReadScreenContentsAction this$0;

        /* renamed from: com.arlosoft.macrodroid.action.ReadScreenContentsAction$e$a */
        /* compiled from: ReadScreenContentsAction.kt */
        static final class C2597a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ TriggerContextInfo $contextInfo;
            final /* synthetic */ boolean $forceEvenIfNotEnabled;
            final /* synthetic */ boolean $isTest;
            final /* synthetic */ int $nextAction;
            final /* synthetic */ ResumeMacroInfo $resumeMacroInfo;
            final /* synthetic */ Stack<Integer> $skipEndifIndexStack;
            final /* synthetic */ C13684d0<MacroDroidVariable> $variable;
            int label;
            final /* synthetic */ ReadScreenContentsAction this$0;

            /* renamed from: com.arlosoft.macrodroid.action.ReadScreenContentsAction$e$a$a */
            /* compiled from: ReadScreenContentsAction.kt */
            static final class C2598a<T> implements C15288g {

                /* renamed from: a */
                final /* synthetic */ ReadScreenContentsAction f7468a;

                /* renamed from: c */
                final /* synthetic */ TriggerContextInfo f7469c;

                /* renamed from: d */
                final /* synthetic */ C13684d0<MacroDroidVariable> f7470d;

                /* renamed from: f */
                final /* synthetic */ boolean f7471f;

                /* renamed from: g */
                final /* synthetic */ int f7472g;

                /* renamed from: o */
                final /* synthetic */ boolean f7473o;

                /* renamed from: p */
                final /* synthetic */ Stack<Integer> f7474p;

                /* renamed from: s */
                final /* synthetic */ ResumeMacroInfo f7475s;

                C2598a(ReadScreenContentsAction readScreenContentsAction, TriggerContextInfo triggerContextInfo, C13684d0<MacroDroidVariable> d0Var, boolean z, int i, boolean z2, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo) {
                    this.f7468a = readScreenContentsAction;
                    this.f7469c = triggerContextInfo;
                    this.f7470d = d0Var;
                    this.f7471f = z;
                    this.f7472g = i;
                    this.f7473o = z2;
                    this.f7474p = stack;
                    this.f7475s = resumeMacroInfo;
                }

                /* access modifiers changed from: private */
                /* renamed from: e */
                public static final void m11987e(boolean z, ReadScreenContentsAction readScreenContentsAction, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
                    C13706o.m87929f(readScreenContentsAction, "this$0");
                    C13706o.m87929f(stack, "$skipEndifIndexStack");
                    if (!z) {
                        readScreenContentsAction.mo27837X0().invokeActions(readScreenContentsAction.mo27837X0().getActions(), i, triggerContextInfo, z2, stack, resumeMacroInfo);
                    }
                }

                /* renamed from: d */
                public final Object emit(Map<String, String> map, C13635d<? super C13339u> dVar) {
                    List<String> list;
                    Context K0 = this.f7468a.mo27827K0();
                    C13706o.m87928e(K0, "context");
                    DictionaryKeys n3 = this.f7468a.dictionaryKeys;
                    if (n3 == null || (list = n3.getKeys()) == null) {
                        list = C13614t.m87748j();
                    }
                    TriggerContextInfo triggerContextInfo = this.f7469c;
                    Macro X0 = this.f7468a.mo27837X0();
                    C13706o.m87928e(X0, "macro");
                    VariableValue.Dictionary dictionary = new VariableValue.Dictionary(new ArrayList(), false, C6520o0.m24868C(K0, list, triggerContextInfo, X0));
                    for (String next : map.keySet()) {
                        List<VariableValue.DictionaryEntry> entries = dictionary.getEntries();
                        String str = map.get(next);
                        if (str == null) {
                            str = "";
                        }
                        entries.add(new VariableValue.DictionaryEntry(next, new VariableValue.StringValue(str, (List) null, 2, (C13695i) null), (List) null, 4, (C13695i) null));
                    }
                    this.f7468a.mo27837X0().variableUpdate((MacroDroidVariable) this.f7470d.element, dictionary);
                    new Handler(Looper.getMainLooper()).post(new C3171je(this.f7471f, this.f7468a, this.f7472g, this.f7469c, this.f7473o, this.f7474p, this.f7475s));
                    return C13339u.f61331a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2597a(ReadScreenContentsAction readScreenContentsAction, TriggerContextInfo triggerContextInfo, C13684d0<MacroDroidVariable> d0Var, boolean z, int i, boolean z2, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, C13635d<? super C2597a> dVar) {
                super(2, dVar);
                this.this$0 = readScreenContentsAction;
                this.$contextInfo = triggerContextInfo;
                this.$variable = d0Var;
                this.$isTest = z;
                this.$nextAction = i;
                this.$forceEvenIfNotEnabled = z2;
                this.$skipEndifIndexStack = stack;
                this.$resumeMacroInfo = resumeMacroInfo;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C2597a(this.this$0, this.$contextInfo, this.$variable, this.$isTest, this.$nextAction, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C2597a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c = C13652d.m87832c();
                int i = this.label;
                if (i == 0) {
                    C13332o.m85685b(obj);
                    C15285f<Map<String, String>> B = C15290h.m94111B(this.this$0.mo25501z3().mo40782a(), 1);
                    C2598a aVar = new C2598a(this.this$0, this.$contextInfo, this.$variable, this.$isTest, this.$nextAction, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo);
                    this.label = 1;
                    if (B.collect(aVar, this) == c) {
                        return c;
                    }
                } else if (i == 1) {
                    C13332o.m85685b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13339u.f61331a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2596e(ReadScreenContentsAction readScreenContentsAction, TriggerContextInfo triggerContextInfo, C13684d0<MacroDroidVariable> d0Var, boolean z, int i, boolean z2, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, C13635d<? super C2596e> dVar) {
            super(2, dVar);
            this.this$0 = readScreenContentsAction;
            this.$contextInfo = triggerContextInfo;
            this.$variable = d0Var;
            this.$isTest = z;
            this.$nextAction = i;
            this.$forceEvenIfNotEnabled = z2;
            this.$skipEndifIndexStack = stack;
            this.$resumeMacroInfo = resumeMacroInfo;
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public static final void m11985p(ReadScreenContentsAction readScreenContentsAction, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
            Long Y0 = readScreenContentsAction.mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18869h("Read Screen contents timed out", Y0.longValue());
            if (!z) {
                readScreenContentsAction.mo27837X0().invokeActions(readScreenContentsAction.mo27837X0().getActions(), i, triggerContextInfo, z2, stack, resumeMacroInfo);
            }
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2596e(this.this$0, this.$contextInfo, this.$variable, this.$isTest, this.$nextAction, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2596e) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C2597a aVar = new C2597a(this.this$0, this.$contextInfo, this.$variable, this.$isTest, this.$nextAction, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo, (C13635d<? super C2597a>) null);
                this.label = 1;
                obj2 = C15576z2.m94763c(5000, aVar, this);
                if (obj2 == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((C13339u) obj2) == null) {
                new Handler(Looper.getMainLooper()).post(new C3143ie(this.this$0, this.$isTest, this.$nextAction, this.$contextInfo, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo));
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ReadScreenContentsAction$f */
    /* compiled from: ReadScreenContentsAction.kt */
    static final class C2599f extends C13708q implements C16265l<VariableValue, Boolean> {

        /* renamed from: a */
        public static final C2599f f7476a = new C2599f();

        C2599f() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(VariableValue variableValue) {
            boolean z;
            C13706o.m87929f(variableValue, "variableValue");
            if (variableValue instanceof VariableValue.Dictionary) {
                VariableValue.Dictionary dictionary = (VariableValue.Dictionary) variableValue;
                if (!dictionary.isArray() || dictionary.hasDictionaryChildren(dictionary)) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ReadScreenContentsAction$g */
    /* compiled from: ReadScreenContentsAction.kt */
    public static final class C2600g implements C6520o0.C6521a {

        /* renamed from: a */
        final /* synthetic */ ArrayList<String> f7477a;

        /* renamed from: b */
        final /* synthetic */ ReadScreenContentsAction f7478b;

        /* renamed from: c */
        final /* synthetic */ MacroDroidVariable f7479c;

        /* renamed from: d */
        final /* synthetic */ int f7480d;

        /* renamed from: e */
        final /* synthetic */ VariableValue.Dictionary f7481e;

        /* renamed from: com.arlosoft.macrodroid.action.ReadScreenContentsAction$g$a */
        /* compiled from: ReadScreenContentsAction.kt */
        static final class C2601a extends C13708q implements C16265l<C6520o0.C6523b, C13339u> {
            final /* synthetic */ MacroDroidVariable $variable;
            final /* synthetic */ ReadScreenContentsAction this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2601a(ReadScreenContentsAction readScreenContentsAction, MacroDroidVariable macroDroidVariable) {
                super(1);
                this.this$0 = readScreenContentsAction;
                this.$variable = macroDroidVariable;
            }

            /* renamed from: a */
            public final void mo25515a(C6520o0.C6523b bVar) {
                C13706o.m87929f(bVar, "<name for destructuring parameter 0>");
                List<String> a = bVar.mo32706a();
                bVar.mo32707b();
                this.this$0.variableName = this.$variable.getName();
                this.this$0.dictionaryKeys = new DictionaryKeys(a);
                this.this$0.mo24689O1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo25515a((C6520o0.C6523b) obj);
                return C13339u.f61331a;
            }
        }

        C2600g(ArrayList<String> arrayList, ReadScreenContentsAction readScreenContentsAction, MacroDroidVariable macroDroidVariable, int i, VariableValue.Dictionary dictionary) {
            this.f7477a = arrayList;
            this.f7478b = readScreenContentsAction;
            this.f7479c = macroDroidVariable;
            this.f7480d = i;
            this.f7481e = dictionary;
        }

        /* renamed from: a */
        public void mo24836a() {
            this.f7478b.variableName = this.f7479c.getName();
            this.f7478b.dictionaryKeys = new DictionaryKeys(this.f7477a);
            this.f7478b.mo24689O1();
        }

        /* renamed from: b */
        public void mo24837b(List<String> list) {
            Activity j0 = this.f7478b.mo27850j0();
            C13706o.m87928e(j0, "activity");
            MacroDroidVariable macroDroidVariable = this.f7479c;
            VariableValue.Dictionary dictionary = this.f7481e;
            Macro o3 = this.f7478b.m_macro;
            ArrayList<String> arrayList = this.f7477a;
            ReadScreenContentsAction readScreenContentsAction = this.f7478b;
            C6520o0.m24902Z(j0, C17542R$style.Theme_App_Dialog_Action, macroDroidVariable, dictionary, o3, arrayList, list, false, readScreenContentsAction, new C2601a(readScreenContentsAction, this.f7479c));
        }

        /* renamed from: c */
        public void mo24838c() {
        }

        /* renamed from: d */
        public void mo24839d() {
            this.f7478b.m11958u3(this.f7479c, this.f7481e, this.f7477a);
        }

        /* renamed from: e */
        public void mo24840e(VariableValue.DictionaryEntry dictionaryEntry) {
            C13706o.m87929f(dictionaryEntry, "dictionaryEntry");
            this.f7477a.add(dictionaryEntry.getKey());
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                ReadScreenContentsAction readScreenContentsAction = this.f7478b;
                MacroDroidVariable macroDroidVariable = this.f7479c;
                VariableValue variable = dictionaryEntry.getVariable();
                C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                readScreenContentsAction.m11945C3(macroDroidVariable, (VariableValue.Dictionary) variable, this.f7477a, this.f7480d + 1);
                return;
            }
            this.f7478b.variableName = this.f7479c.getName();
            this.f7478b.dictionaryKeys = new DictionaryKeys(this.f7477a);
            this.f7478b.mo24689O1();
        }
    }

    public ReadScreenContentsAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ ReadScreenContentsAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public final void m11943A3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), C17542R$style.Theme_App_Dialog_Variables);
        builder.setTitle((int) C17541R$string.variable_creation_failed);
        builder.setMessage((int) C17541R$string.variable_already_exists);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) C3059fe.f8330a);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public static final void m11944B3(DialogInterface dialogInterface, int i) {
        C13706o.m87929f(dialogInterface, "dialog");
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public final void m11945C3(MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, ArrayList<String> arrayList, int i) {
        int i2 = i;
        DictionaryKeys dictionaryKeys2 = this.dictionaryKeys;
        List<String> list = null;
        String str = (dictionaryKeys2 == null || dictionaryKeys2.getKeys().size() <= i2) ? null : dictionaryKeys2.getKeys().get(i2);
        Activity j0 = mo27850j0();
        C13706o.m87928e(j0, "activity");
        C2599f fVar = C2599f.f7476a;
        String str2 = str;
        DictionaryKeys dictionaryKeys3 = this.dictionaryKeys;
        if (dictionaryKeys3 != null) {
            list = dictionaryKeys3.getKeys();
        }
        C6520o0.m24884K0(j0, C17542R$style.Theme_App_Dialog_Action, dictionary, fVar, str2, true, new C6520o0.C6525c(true, list), false, C6520o0.C6538e.SHOW_DICTIONARIES_ONLY, true, new C2600g(arrayList, this, macroDroidVariable, i, dictionary));
    }

    /* renamed from: D1 */
    private final void m11946D1() {
        MacroDroidApplication.f9883I.mo27302a().mo38309n(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public final void m11958u3(MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, ArrayList<String> arrayList) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.variable_new_variable_dialog);
        appCompatDialog.setTitle((int) C17541R$string.action_set_variable_create);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        View findViewById = appCompatDialog.findViewById(C17532R$id.variable_new_variable_dialog_name);
        C13706o.m87926c(findViewById);
        EditText editText = (EditText) findViewById;
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.type_container);
        ViewGroup viewGroup2 = (ViewGroup) appCompatDialog.findViewById(C17532R$id.local_global_layout);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        if (dictionary.isArray()) {
            appCompatDialog.setTitle((int) C17541R$string.variable_dictionary_add_array_index);
            editText.setHint(C17541R$string.variable_array_index);
            editText.setInputType(2);
        } else {
            appCompatDialog.setTitle((int) C17541R$string.variable_dictionary_add_key);
            editText.setHint(C17541R$string.variable_dictionary_key);
            editText.setInputType(655361);
        }
        editText.addTextChangedListener(new C2594c(button, editText));
        C13706o.m87926c(button);
        button.setOnClickListener(new C3115he(this, macroDroidVariable, arrayList, editText, appCompatDialog));
        C13706o.m87926c(button2);
        button2.setOnClickListener(new C3087ge(appCompatDialog));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static final void m11959v3(ReadScreenContentsAction readScreenContentsAction, MacroDroidVariable macroDroidVariable, ArrayList arrayList, EditText editText, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(readScreenContentsAction, "this$0");
        C13706o.m87929f(macroDroidVariable, "$variable");
        C13706o.m87929f(arrayList, "$parentKeys");
        C13706o.m87929f(editText, "$keyName");
        C13706o.m87929f(appCompatDialog, "$dialog");
        readScreenContentsAction.variableName = macroDroidVariable.getName();
        readScreenContentsAction.dictionaryKeys = new DictionaryKeys(C13566b0.m87443r0(arrayList, editText.getText().toString()));
        readScreenContentsAction.mo24689O1();
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m11960w3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: x3 */
    private final void m11961x3() {
        Activity j0 = mo27850j0();
        C13706o.m87928e(j0, "activity");
        C6520o0.m24897U(j0, mo25500y3().mo28009e().mo28008a(), true, C17542R$style.Theme_App_Dialog_Action, true, true, C17535R$layout.simple_spinner_dropdown_item_2_lines, "#999999", true, mo27837X0(), 4, new C2595d(this));
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return true;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        List<String> keys;
        String[] strArr = new String[1];
        String str = this.variableName;
        if (str == null) {
            str = "";
        }
        strArr[0] = str;
        List p = C13614t.m87754p(strArr);
        DictionaryKeys dictionaryKeys2 = this.dictionaryKeys;
        if (!(dictionaryKeys2 == null || (keys = dictionaryKeys2.getKeys()) == null)) {
            p.addAll(keys);
        }
        Object[] array = p.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        C13706o.m87929f(strArr, "magicText");
        if (strArr.length == 0) {
            C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ')'));
            return;
        }
        this.variableName = strArr[0];
        if (strArr.length > 1) {
            this.dictionaryKeys = new DictionaryKeys(C13566b0.m87416Q(C13596m.m87619r0(strArr), 1));
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return "➔ " + this.variableName + C6520o0.m24912e0(this.dictionaryKeys);
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7840s2.f18889j.mo37771a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: b */
    public DictionaryKeys mo24426b() {
        return this.dictionaryKeys;
    }

    /* renamed from: f */
    public void mo24433f(String str) {
        this.variableName = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        int i;
        ArrayList<MacroDroidVariable> p0 = mo27859p0();
        C13706o.m87928e(p0, "allDictionaryAndArrayVariables");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = p0.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            MacroDroidVariable macroDroidVariable = (MacroDroidVariable) next;
            if (!macroDroidVariable.mo27748X() || macroDroidVariable.mo27776v()) {
                i = 1;
            }
            if (i != 0) {
                arrayList.add(next);
            }
        }
        String[] strArr = new String[(arrayList.size() + 1)];
        strArr[0] = SelectableItem.m15535j1(C17541R$string.new_variable);
        int size = arrayList.size();
        while (i < size) {
            int i2 = i + 1;
            strArr[i2] = ((MacroDroidVariable) arrayList.get(i)).getName();
            i = i2;
        }
        return strArr;
    }

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        C13706o.m87929f(stack, "skipEndifIndexStack");
        if (!C4061t1.m15996h0(mo27827K0())) {
            C7439d0.m30911p0(mo27827K0(), mo25559a1(), 10);
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18869h("Read Screen Contents failed, UI Interaction accessibility service is disabled", Y0.longValue());
            return;
        }
        String t0 = C4023j0.m15760t0(mo27827K0(), this.variableName, triggerContextInfo, mo27837X0());
        if (t0 == null || t0.length() == 0) {
            Long Y02 = mo27840Y0();
            C13706o.m87928e(Y02, "macroGuid");
            C4878b.m18869h("Cannot read screen contents, dictionary variable name is blank", Y02.longValue());
            return;
        }
        C13684d0 d0Var = new C13684d0();
        T q = mo27861q(t0);
        d0Var.element = q;
        if (q == null) {
            C13706o.m87928e(t0, "varName");
            mo27835S(new MacroDroidVariable(4, t0, this.isLocalVar));
            d0Var.element = mo27861q(t0);
        }
        if (d0Var.element == null) {
            Long Y03 = mo27840Y0();
            C13706o.m87928e(Y03, "macroGuid");
            C4878b.m18869h("Cannot read screen contents, dictionary variable not available: " + this.variableName + C6520o0.m24912e0(this.dictionaryKeys), Y03.longValue());
            return;
        }
        UIInteractionAccessibilityService.C3437a aVar = UIInteractionAccessibilityService.f9127g;
        Context K0 = mo27827K0();
        C13706o.m87928e(K0, "context");
        aVar.mo26812d(K0);
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, (C13640g) null, (C15486m0) null, new C2596e(this, triggerContextInfo, d0Var, z2, i, z, stack, resumeMacroInfo, (C13635d<? super C2596e>) null), 3, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        String string = mo27827K0().getString(C17541R$string.action_set_variable_select);
        C13706o.m87928e(string, "context.getString(R.stri…tion_set_variable_select)");
        return string;
    }

    /* renamed from: k */
    public void mo24427k(DictionaryKeys dictionaryKeys2) {
        this.dictionaryKeys = dictionaryKeys2;
    }

    /* renamed from: m */
    public String mo24434m() {
        return this.variableName;
    }

    /* renamed from: r2 */
    public boolean mo25499r2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.selectedIndex != 0) {
            ArrayList<MacroDroidVariable> p0 = mo27859p0();
            C13706o.m87928e(p0, "allDictionaryAndArrayVariables");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = p0.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                MacroDroidVariable macroDroidVariable = (MacroDroidVariable) next;
                if (!macroDroidVariable.mo27748X() || macroDroidVariable.mo27776v()) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            if (this.selectedIndex > arrayList.size()) {
                C15626c.makeText(mo27827K0(), C17541R$string.variable_does_not_exit, 0).show();
                return;
            }
            MacroDroidVariable macroDroidVariable2 = (MacroDroidVariable) arrayList.get(this.selectedIndex - 1);
            if (macroDroidVariable2.mo27751a0() || macroDroidVariable2.mo27748X()) {
                m11945C3((MacroDroidVariable) arrayList.get(this.selectedIndex - 1), macroDroidVariable2.mo27770n(), new ArrayList(), 0);
                return;
            }
            this.dictionaryKeys = null;
            this.variableName = macroDroidVariable2.getName();
            mo24689O1();
        } else if (mo25500y3().mo28009e().mo28008a()) {
            m11961x3();
        } else {
            UpgradeActivity2.C6289a aVar = UpgradeActivity2.f14829L;
            Activity j0 = mo27850j0();
            C13706o.m87928e(j0, "activity");
            aVar.mo32326a(j0);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.variableName);
        parcel.writeInt(this.isLocalVar ? 1 : 0);
        parcel.writeParcelable(this.dictionaryKeys, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.selectedIndex = i;
    }

    /* renamed from: y3 */
    public final C4083b mo25500y3() {
        C4083b bVar = this.f7464f;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("premiumStatusHandler");
        return null;
    }

    /* renamed from: z3 */
    public final C10182a mo25501z3() {
        C10182a aVar = this.f7463d;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("screenContentsCache");
        return null;
    }

    public ReadScreenContentsAction() {
        m11946D1();
    }

    private ReadScreenContentsAction(Parcel parcel) {
        super(parcel);
        m11946D1();
        this.variableName = parcel.readString();
        this.isLocalVar = parcel.readInt() != 0;
        this.dictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
