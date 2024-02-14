package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.app.AppCompatDialog;
import androidx.documentfile.provider.DocumentFile;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6440u1;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import java.util.List;
import java.util.Stack;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import org.jetbrains.anko.sdk27.coroutines.C16061a;
import p057a2.C2212a;
import p057a2.C2216e;
import p057a2.C2220i;
import p128m0.C7832r2;
import p156r2.C8194a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16254a;
import p370qa.C16269p;
import p370qa.C16270q;
import p370qa.C16271r;

/* compiled from: ReadFileAction.kt */
public final class ReadFileAction extends Action implements C2220i, C2212a, C2216e {
    public static final Parcelable.Creator<ReadFileAction> CREATOR = new C2582a();
    private static final int PICKER_ID_FILE = 2;
    private static final int PICKER_ID_FOLDER = 1;

    /* renamed from: d */
    public static final C2583b f7455d = new C2583b((C13695i) null);
    /* access modifiers changed from: private */
    public DictionaryKeys dictionaryKeys;
    private transient TextView dirText;
    /* access modifiers changed from: private */
    public String filename;
    private transient EditText filenameEditText;
    private String pathName;
    /* access modifiers changed from: private */
    public String pathUri;
    /* access modifiers changed from: private */
    public boolean staticFilename;
    private transient TextView staticFilenameText;
    /* access modifiers changed from: private */
    public String staticFilepath;
    /* access modifiers changed from: private */
    public String staticPathUri;
    private transient String temporaryPathName;
    /* access modifiers changed from: private */
    public String variableName;
    /* access modifiers changed from: private */
    public transient DictionaryKeys workingDictionaryKeys;
    /* access modifiers changed from: private */
    public transient String workingVariableName;

    /* renamed from: com.arlosoft.macrodroid.action.ReadFileAction$a */
    /* compiled from: ReadFileAction.kt */
    public static final class C2582a implements Parcelable.Creator<ReadFileAction> {
        C2582a() {
        }

        /* renamed from: a */
        public ReadFileAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ReadFileAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public ReadFileAction[] newArray(int i) {
            return new ReadFileAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ReadFileAction$b */
    /* compiled from: ReadFileAction.kt */
    public static final class C2583b {
        private C2583b() {
        }

        public /* synthetic */ C2583b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ReadFileAction$c */
    /* compiled from: ReadFileAction.kt */
    static final class C2584c extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Button $okButton;
        final /* synthetic */ RadioButton $radioButtonStatic;
        final /* synthetic */ Spinner $stringVarSpinner;
        final /* synthetic */ ViewFlipper $viewFlipper;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ ReadFileAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2584c(ViewFlipper viewFlipper, ReadFileAction readFileAction, Button button, RadioButton radioButton, Spinner spinner, C13635d<? super C2584c> dVar) {
            super(4, dVar);
            this.$viewFlipper = viewFlipper;
            this.this$0 = readFileAction;
            this.$okButton = button;
            this.$radioButtonStatic = radioButton;
            this.$stringVarSpinner = spinner;
        }

        /* renamed from: h */
        public final Object mo25492h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C2584c cVar = new C2584c(this.$viewFlipper, this.this$0, this.$okButton, this.$radioButtonStatic, this.$stringVarSpinner, dVar);
            cVar.Z$0 = z;
            return cVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo25492h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$viewFlipper.setDisplayedChild(this.Z$0 ^ true ? 1 : 0);
                this.this$0.m11907O3(this.$okButton, this.$radioButtonStatic, this.$stringVarSpinner);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ReadFileAction$d */
    /* compiled from: ReadFileAction.kt */
    static final class C2585d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Button $okButton;
        final /* synthetic */ RadioButton $radioButtonStatic;
        final /* synthetic */ Spinner $stringVarSpinner;
        int label;
        final /* synthetic */ ReadFileAction this$0;

        /* renamed from: com.arlosoft.macrodroid.action.ReadFileAction$d$a */
        /* compiled from: ReadFileAction.kt */
        static final class C2586a extends C13708q implements C16254a<C13339u> {
            final /* synthetic */ Button $okButton;
            final /* synthetic */ RadioButton $radioButtonStatic;
            final /* synthetic */ Spinner $stringVarSpinner;
            final /* synthetic */ ReadFileAction this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2586a(ReadFileAction readFileAction, Button button, RadioButton radioButton, Spinner spinner) {
                super(0);
                this.this$0 = readFileAction;
                this.$okButton = button;
                this.$radioButtonStatic = radioButton;
                this.$stringVarSpinner = spinner;
            }

            public final void invoke() {
                this.this$0.m11907O3(this.$okButton, this.$radioButtonStatic, this.$stringVarSpinner);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2585d(Activity activity, Spinner spinner, ReadFileAction readFileAction, Button button, RadioButton radioButton, C13635d<? super C2585d> dVar) {
            super(3, dVar);
            this.$activity = activity;
            this.$stringVarSpinner = spinner;
            this.this$0 = readFileAction;
            this.$okButton = button;
            this.$radioButtonStatic = radioButton;
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public static final void m11939r(ReadFileAction readFileAction, Spinner spinner, Button button, RadioButton radioButton, MacroDroidVariable macroDroidVariable) {
            readFileAction.workingVariableName = macroDroidVariable.getName();
            readFileAction.workingDictionaryKeys = null;
            readFileAction.m11905M3(spinner, new C2586a(readFileAction, button, radioButton, spinner));
            readFileAction.m11907O3(button, radioButton, spinner);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                Activity activity = this.$activity;
                Spinner spinner = this.$stringVarSpinner;
                ReadFileAction readFileAction = this.this$0;
                C6440u1.m24747d(activity, spinner, readFileAction, C17542R$style.Theme_App_Dialog_Action, 2, new C3030ee(readFileAction, spinner, this.$okButton, this.$radioButtonStatic));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: p */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2585d(this.$activity, this.$stringVarSpinner, this.this$0, this.$okButton, this.$radioButtonStatic, dVar).invokeSuspend(C13339u.f61331a);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ReadFileAction$e */
    /* compiled from: ReadFileAction.kt */
    static final class C2587e extends C13708q implements C16254a<C13339u> {
        final /* synthetic */ Button $okButton;
        final /* synthetic */ RadioButton $radioButtonStatic;
        final /* synthetic */ Spinner $stringVarSpinner;
        final /* synthetic */ ReadFileAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2587e(ReadFileAction readFileAction, Button button, RadioButton radioButton, Spinner spinner) {
            super(0);
            this.this$0 = readFileAction;
            this.$okButton = button;
            this.$radioButtonStatic = radioButton;
            this.$stringVarSpinner = spinner;
        }

        public final void invoke() {
            this.this$0.m11907O3(this.$okButton, this.$radioButtonStatic, this.$stringVarSpinner);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ReadFileAction$f */
    /* compiled from: ReadFileAction.kt */
    public static final class C2588f implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ReadFileAction f7456a;

        /* renamed from: c */
        final /* synthetic */ Button f7457c;

        /* renamed from: d */
        final /* synthetic */ RadioButton f7458d;

        /* renamed from: f */
        final /* synthetic */ Spinner f7459f;

        C2588f(ReadFileAction readFileAction, Button button, RadioButton radioButton, Spinner spinner) {
            this.f7456a = readFileAction;
            this.f7457c = button;
            this.f7458d = radioButton;
            this.f7459f = spinner;
        }

        public void afterTextChanged(Editable editable) {
            C13706o.m87929f(editable, "s");
            this.f7456a.m11907O3(this.f7457c, this.f7458d, this.f7459f);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ReadFileAction$g */
    /* compiled from: ReadFileAction.kt */
    public static final class C2589g implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ ReadFileAction f7460a;

        /* renamed from: b */
        final /* synthetic */ C16254a<C13339u> f7461b;

        C2589g(ReadFileAction readFileAction, C16254a<C13339u> aVar) {
            this.f7460a = readFileAction;
            this.f7461b = aVar;
        }

        /* renamed from: a */
        public void mo24722a(int i, String str) {
            C13706o.m87929f(str, "value");
        }

        /* renamed from: b */
        public void mo24723b(MacroDroidVariable macroDroidVariable, List<String> list) {
            C13706o.m87929f(macroDroidVariable, "variable");
            this.f7460a.workingVariableName = macroDroidVariable.getName();
            this.f7460a.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
            this.f7461b.invoke();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ReadFileAction$h */
    /* compiled from: ReadFileAction.kt */
    static final class C2590h extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ TriggerContextInfo $contextInfo;
        final /* synthetic */ boolean $forceEvenIfNotEnabled;
        final /* synthetic */ boolean $isTest;
        final /* synthetic */ int $nextAction;
        final /* synthetic */ ResumeMacroInfo $resumeMacroInfo;
        final /* synthetic */ Stack<Integer> $skipEndifIndexStack;
        Object L$0;
        int label;
        final /* synthetic */ ReadFileAction this$0;

        /* renamed from: com.arlosoft.macrodroid.action.ReadFileAction$h$a */
        /* compiled from: ReadFileAction.kt */
        static final class C2591a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ TriggerContextInfo $contextInfo;
            final /* synthetic */ boolean $forceEvenIfNotEnabled;
            final /* synthetic */ boolean $isTest;
            final /* synthetic */ int $nextAction;
            final /* synthetic */ ResumeMacroInfo $resumeMacroInfo;
            final /* synthetic */ Stack<Integer> $skipEndifIndexStack;
            int label;
            final /* synthetic */ ReadFileAction this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2591a(boolean z, ReadFileAction readFileAction, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, C13635d<? super C2591a> dVar) {
                super(2, dVar);
                this.$isTest = z;
                this.this$0 = readFileAction;
                this.$nextAction = i;
                this.$contextInfo = triggerContextInfo;
                this.$forceEvenIfNotEnabled = z2;
                this.$skipEndifIndexStack = stack;
                this.$resumeMacroInfo = resumeMacroInfo;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C2591a(this.$isTest, this.this$0, this.$nextAction, this.$contextInfo, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C2591a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    if (!this.$isTest) {
                        this.this$0.mo27837X0().invokeActions(this.this$0.mo27837X0().getActions(), this.$nextAction, this.$contextInfo, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo);
                    }
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2590h(ReadFileAction readFileAction, TriggerContextInfo triggerContextInfo, boolean z, int i, boolean z2, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, C13635d<? super C2590h> dVar) {
            super(2, dVar);
            this.this$0 = readFileAction;
            this.$contextInfo = triggerContextInfo;
            this.$isTest = z;
            this.$nextAction = i;
            this.$forceEvenIfNotEnabled = z2;
            this.$skipEndifIndexStack = stack;
            this.$resumeMacroInfo = resumeMacroInfo;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2590h(this.this$0, this.$contextInfo, this.$isTest, this.$nextAction, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2590h) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:51:0x011f, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
            kotlin.p312io.C13667b.m87853a(r9, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0123, code lost:
            throw r4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0195 A[Catch:{ all -> 0x018e }] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01c1 A[SYNTHETIC, Splitter:B:82:0x01c1] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01e7 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x01ed A[SYNTHETIC, Splitter:B:91:0x01ed] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0215 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0216  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r14.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0027
                if (r1 == r4) goto L_0x0022
                if (r1 == r3) goto L_0x0022
                if (r1 == r2) goto L_0x0019
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0019:
                java.lang.Object r0 = r14.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                p297ja.C13332o.m85685b(r15)
                goto L_0x0217
            L_0x0022:
                p297ja.C13332o.m85685b(r15)
                goto L_0x01e8
            L_0x0027:
                p297ja.C13332o.m85685b(r15)
                com.arlosoft.macrodroid.action.ReadFileAction r15 = r14.this$0
                boolean r15 = r15.staticFilename
                if (r15 == 0) goto L_0x0039
                com.arlosoft.macrodroid.action.ReadFileAction r15 = r14.this$0
                java.lang.String r15 = r15.staticPathUri
                goto L_0x003f
            L_0x0039:
                com.arlosoft.macrodroid.action.ReadFileAction r15 = r14.this$0
                java.lang.String r15 = r15.pathUri
            L_0x003f:
                com.arlosoft.macrodroid.action.ReadFileAction r1 = r14.this$0
                java.lang.String r5 = r1.variableName
                com.arlosoft.macrodroid.common.MacroDroidVariable r1 = r1.mo27861q(r5)
                java.lang.String r5 = "macroGuid"
                if (r1 != 0) goto L_0x007c
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r0 = "Error - could not read from file: "
                r15.append(r0)
                com.arlosoft.macrodroid.action.ReadFileAction r0 = r14.this$0
                java.lang.String r0 = r0.variableName
                r15.append(r0)
                java.lang.String r0 = " does not exist"
                r15.append(r0)
                java.lang.String r15 = r15.toString()
                com.arlosoft.macrodroid.action.ReadFileAction r0 = r14.this$0
                java.lang.Long r0 = r0.mo27840Y0()
                kotlin.jvm.internal.C13706o.m87928e(r0, r5)
                long r0 = r0.longValue()
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r15, r0)
                ja.u r15 = p297ja.C13339u.f61331a
                return r15
            L_0x007c:
                com.arlosoft.macrodroid.action.ReadFileAction r6 = r14.this$0
                boolean r6 = r6.staticFilename
                if (r6 == 0) goto L_0x008b
                com.arlosoft.macrodroid.action.ReadFileAction r6 = r14.this$0
                java.lang.String r6 = r6.staticFilepath
                goto L_0x0091
            L_0x008b:
                com.arlosoft.macrodroid.action.ReadFileAction r6 = r14.this$0
                java.lang.String r6 = r6.filename
            L_0x0091:
                java.lang.String r7 = ""
                if (r6 != 0) goto L_0x0096
                r6 = r7
            L_0x0096:
                r8 = 0
                android.net.Uri r15 = android.net.Uri.parse(r15)     // Catch:{ Exception -> 0x0190 }
                com.arlosoft.macrodroid.action.ReadFileAction r9 = r14.this$0     // Catch:{ Exception -> 0x0190 }
                boolean r9 = r9.staticFilename     // Catch:{ Exception -> 0x0190 }
                if (r9 == 0) goto L_0x00ae
                com.arlosoft.macrodroid.action.ReadFileAction r9 = r14.this$0     // Catch:{ Exception -> 0x0190 }
                android.content.Context r9 = r9.mo27827K0()     // Catch:{ Exception -> 0x0190 }
                androidx.documentfile.provider.DocumentFile r15 = androidx.documentfile.provider.DocumentFile.fromSingleUri(r9, r15)     // Catch:{ Exception -> 0x0190 }
                goto L_0x00d7
            L_0x00ae:
                com.arlosoft.macrodroid.action.ReadFileAction r9 = r14.this$0     // Catch:{ Exception -> 0x0190 }
                android.content.Context r9 = r9.mo27827K0()     // Catch:{ Exception -> 0x0190 }
                androidx.documentfile.provider.DocumentFile r15 = androidx.documentfile.provider.DocumentFile.fromTreeUri(r9, r15)     // Catch:{ Exception -> 0x0190 }
                com.arlosoft.macrodroid.action.ReadFileAction r9 = r14.this$0     // Catch:{ Exception -> 0x0190 }
                android.content.Context r9 = r9.mo27827K0()     // Catch:{ Exception -> 0x0190 }
                com.arlosoft.macrodroid.action.ReadFileAction r10 = r14.this$0     // Catch:{ Exception -> 0x0190 }
                java.lang.String r10 = r10.filename     // Catch:{ Exception -> 0x0190 }
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r11 = r14.$contextInfo     // Catch:{ Exception -> 0x0190 }
                com.arlosoft.macrodroid.action.ReadFileAction r12 = r14.this$0     // Catch:{ Exception -> 0x0190 }
                com.arlosoft.macrodroid.macro.Macro r12 = r12.mo27837X0()     // Catch:{ Exception -> 0x0190 }
                java.lang.String r9 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r9, r10, r11, r12)     // Catch:{ Exception -> 0x0190 }
                kotlin.jvm.internal.C13706o.m87926c(r15)     // Catch:{ Exception -> 0x0190 }
                androidx.documentfile.provider.DocumentFile r15 = r15.findFile(r9)     // Catch:{ Exception -> 0x0190 }
            L_0x00d7:
                if (r15 != 0) goto L_0x00e0
                com.arlosoft.macrodroid.action.ReadFileAction r15 = r14.this$0     // Catch:{ Exception -> 0x0190 }
                r15.m11906N3(r6)     // Catch:{ Exception -> 0x0190 }
                goto L_0x0165
            L_0x00e0:
                com.arlosoft.macrodroid.action.ReadFileAction r9 = r14.this$0     // Catch:{ Exception -> 0x0190 }
                android.content.Context r9 = r9.mo27827K0()     // Catch:{ Exception -> 0x0190 }
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch:{ Exception -> 0x0190 }
                android.net.Uri r15 = r15.getUri()     // Catch:{ Exception -> 0x0190 }
                java.io.InputStream r15 = r9.openInputStream(r15)     // Catch:{ Exception -> 0x0190 }
                if (r15 == 0) goto L_0x0115
                java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                java.nio.charset.Charset r10 = kotlin.text.C15147d.f64349b     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                r9.<init>(r15, r10)     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                r10 = 8192(0x2000, float:1.14794E-41)
                boolean r11 = r9 instanceof java.io.BufferedReader     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                if (r11 == 0) goto L_0x0104
                java.io.BufferedReader r9 = (java.io.BufferedReader) r9     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                goto L_0x0116
            L_0x0104:
                java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                r11.<init>(r9, r10)     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                r9 = r11
                goto L_0x0116
            L_0x010b:
                r1 = move-exception
                r8 = r15
                r15 = r1
                goto L_0x01eb
            L_0x0110:
                r1 = move-exception
                r8 = r15
                r15 = r1
                goto L_0x0191
            L_0x0115:
                r9 = r8
            L_0x0116:
                if (r9 == 0) goto L_0x0124
                java.lang.String r10 = kotlin.p312io.C13675i.m87863f(r9)     // Catch:{ all -> 0x011d }
                goto L_0x0125
            L_0x011d:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x011f }
            L_0x011f:
                r4 = move-exception
                kotlin.p312io.C13667b.m87853a(r9, r1)     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                throw r4     // Catch:{ Exception -> 0x0110, all -> 0x010b }
            L_0x0124:
                r10 = r8
            L_0x0125:
                kotlin.p312io.C13667b.m87853a(r9, r8)     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                if (r10 != 0) goto L_0x012b
                goto L_0x012c
            L_0x012b:
                r7 = r10
            L_0x012c:
                com.arlosoft.macrodroid.action.ReadFileAction r8 = r14.this$0     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                android.content.Context r8 = r8.mo27827K0()     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                java.lang.String r9 = "context"
                kotlin.jvm.internal.C13706o.m87928e(r8, r9)     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                com.arlosoft.macrodroid.action.ReadFileAction r9 = r14.this$0     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                com.arlosoft.macrodroid.variables.DictionaryKeys r9 = r9.dictionaryKeys     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                if (r9 == 0) goto L_0x0145
                java.util.List r9 = r9.getKeys()     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                if (r9 != 0) goto L_0x0149
            L_0x0145:
                java.util.List r9 = kotlin.collections.C13614t.m87748j()     // Catch:{ Exception -> 0x0110, all -> 0x010b }
            L_0x0149:
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r10 = r14.$contextInfo     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                com.arlosoft.macrodroid.action.ReadFileAction r11 = r14.this$0     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                com.arlosoft.macrodroid.macro.Macro r11 = r11.mo27837X0()     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                java.lang.String r12 = "macro"
                kotlin.jvm.internal.C13706o.m87928e(r11, r12)     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                java.util.ArrayList r8 = com.arlosoft.macrodroid.variables.C6520o0.m24868C(r8, r9, r10, r11)     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                com.arlosoft.macrodroid.variables.VariableValue$StringValue r9 = new com.arlosoft.macrodroid.variables.VariableValue$StringValue     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                r9.<init>(r7, r8)     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                com.arlosoft.macrodroid.action.ReadFileAction r7 = r14.this$0     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                r7.mo27832M2(r1, r9)     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                r8 = r15
            L_0x0165:
                if (r8 == 0) goto L_0x016c
                r8.close()     // Catch:{ Exception -> 0x016b }
                goto L_0x016c
            L_0x016b:
            L_0x016c:
                kotlinx.coroutines.h2 r15 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.action.ReadFileAction$h$a r1 = new com.arlosoft.macrodroid.action.ReadFileAction$h$a
                boolean r6 = r14.$isTest
                com.arlosoft.macrodroid.action.ReadFileAction r7 = r14.this$0
                int r8 = r14.$nextAction
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r9 = r14.$contextInfo
                boolean r10 = r14.$forceEvenIfNotEnabled
                java.util.Stack<java.lang.Integer> r11 = r14.$skipEndifIndexStack
                com.arlosoft.macrodroid.data.ResumeMacroInfo r12 = r14.$resumeMacroInfo
                r13 = 0
                r5 = r1
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
                r14.label = r4
                java.lang.Object r15 = kotlinx.coroutines.C15414h.m94298g(r15, r1, r14)
                if (r15 != r0) goto L_0x01e8
                return r0
            L_0x018e:
                r15 = move-exception
                goto L_0x01eb
            L_0x0190:
                r15 = move-exception
            L_0x0191:
                boolean r1 = r15 instanceof java.lang.SecurityException     // Catch:{ all -> 0x018e }
                if (r1 == 0) goto L_0x019a
                com.arlosoft.macrodroid.action.ReadFileAction r1 = r14.this$0     // Catch:{ all -> 0x018e }
                r1.m11906N3(r6)     // Catch:{ all -> 0x018e }
            L_0x019a:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018e }
                r1.<init>()     // Catch:{ all -> 0x018e }
                java.lang.String r4 = "Error - reading from file: "
                r1.append(r4)     // Catch:{ all -> 0x018e }
                java.lang.String r15 = r15.getMessage()     // Catch:{ all -> 0x018e }
                r1.append(r15)     // Catch:{ all -> 0x018e }
                java.lang.String r15 = r1.toString()     // Catch:{ all -> 0x018e }
                com.arlosoft.macrodroid.action.ReadFileAction r1 = r14.this$0     // Catch:{ all -> 0x018e }
                java.lang.Long r1 = r1.mo27840Y0()     // Catch:{ all -> 0x018e }
                kotlin.jvm.internal.C13706o.m87928e(r1, r5)     // Catch:{ all -> 0x018e }
                long r4 = r1.longValue()     // Catch:{ all -> 0x018e }
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r15, r4)     // Catch:{ all -> 0x018e }
                if (r8 == 0) goto L_0x01c6
                r8.close()     // Catch:{ Exception -> 0x01c5 }
                goto L_0x01c6
            L_0x01c5:
            L_0x01c6:
                kotlinx.coroutines.h2 r15 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.action.ReadFileAction$h$a r1 = new com.arlosoft.macrodroid.action.ReadFileAction$h$a
                boolean r5 = r14.$isTest
                com.arlosoft.macrodroid.action.ReadFileAction r6 = r14.this$0
                int r7 = r14.$nextAction
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r8 = r14.$contextInfo
                boolean r9 = r14.$forceEvenIfNotEnabled
                java.util.Stack<java.lang.Integer> r10 = r14.$skipEndifIndexStack
                com.arlosoft.macrodroid.data.ResumeMacroInfo r11 = r14.$resumeMacroInfo
                r12 = 0
                r4 = r1
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                r14.label = r3
                java.lang.Object r15 = kotlinx.coroutines.C15414h.m94298g(r15, r1, r14)
                if (r15 != r0) goto L_0x01e8
                return r0
            L_0x01e8:
                ja.u r15 = p297ja.C13339u.f61331a
                return r15
            L_0x01eb:
                if (r8 == 0) goto L_0x01f2
                r8.close()     // Catch:{ Exception -> 0x01f1 }
                goto L_0x01f2
            L_0x01f1:
            L_0x01f2:
                kotlinx.coroutines.h2 r1 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.action.ReadFileAction$h$a r12 = new com.arlosoft.macrodroid.action.ReadFileAction$h$a
                boolean r4 = r14.$isTest
                com.arlosoft.macrodroid.action.ReadFileAction r5 = r14.this$0
                int r6 = r14.$nextAction
                com.arlosoft.macrodroid.triggers.TriggerContextInfo r7 = r14.$contextInfo
                boolean r8 = r14.$forceEvenIfNotEnabled
                java.util.Stack<java.lang.Integer> r9 = r14.$skipEndifIndexStack
                com.arlosoft.macrodroid.data.ResumeMacroInfo r10 = r14.$resumeMacroInfo
                r11 = 0
                r3 = r12
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                r14.L$0 = r15
                r14.label = r2
                java.lang.Object r1 = kotlinx.coroutines.C15414h.m94298g(r1, r12, r14)
                if (r1 != r0) goto L_0x0216
                return r0
            L_0x0216:
                r0 = r15
            L_0x0217:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.ReadFileAction.C2590h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ReadFileAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ ReadFileAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: C3 */
    private final void m11895C3() {
        try {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.setType("*/*");
            mo27850j0().startActivityForResult(intent, 2);
            Context applicationContext = mo27827K0().getApplicationContext();
            C15626c.m94876a(applicationContext, "   " + SelectableItem.m15535j1(C17541R$string.select_file) + "   ", 1).show();
        } catch (Exception unused) {
            Context applicationContext2 = mo27827K0().getApplicationContext();
            C15626c.m94876a(applicationContext2, "ACTION_OPEN_DOCUMENT" + SelectableItem.m15535j1(C17541R$string.not_supported), 0).show();
        }
    }

    /* renamed from: D3 */
    private final void m11896D3() {
        try {
            mo27850j0().startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), 1);
            Context applicationContext = mo27827K0().getApplicationContext();
            C15626c.m94876a(applicationContext, "   " + SelectableItem.m15535j1(C17541R$string.action_write_to_file_select_folder) + "   ", 1).show();
        } catch (Exception unused) {
            Context applicationContext2 = mo27827K0().getApplicationContext();
            C15626c.m94876a(applicationContext2, "ACTION_OPEN_DOCUMENT_TREE " + SelectableItem.m15535j1(C17541R$string.not_supported), 0).show();
        }
    }

    /* renamed from: E3 */
    private final void m11897E3() {
        this.workingVariableName = this.variableName;
        this.workingDictionaryKeys = this.dictionaryKeys;
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_read_from_file);
        appCompatDialog.setTitle((CharSequence) mo25559a1());
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
        Button button = (Button) findViewById;
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87926c(findViewById2);
        Button button2 = (Button) findViewById2;
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.selectFileButton);
        C13706o.m87926c(findViewById3);
        ImageButton imageButton = (ImageButton) findViewById3;
        View findViewById4 = appCompatDialog.findViewById(C17532R$id.staticFilenameRadioButton);
        C13706o.m87926c(findViewById4);
        RadioButton radioButton = (RadioButton) findViewById4;
        View findViewById5 = appCompatDialog.findViewById(C17532R$id.dynamicFilenameRadioButton);
        C13706o.m87926c(findViewById5);
        View findViewById6 = appCompatDialog.findViewById(C17532R$id.filename);
        C13706o.m87926c(findViewById6);
        this.filenameEditText = (EditText) findViewById6;
        View findViewById7 = appCompatDialog.findViewById(C17532R$id.pick_dir_button);
        C13706o.m87926c(findViewById7);
        ImageButton imageButton2 = (ImageButton) findViewById7;
        this.dirText = (TextView) appCompatDialog.findViewById(C17532R$id.directory_text);
        View findViewById8 = appCompatDialog.findViewById(C17532R$id.staticFilename);
        C13706o.m87926c(findViewById8);
        this.staticFilenameText = (TextView) findViewById8;
        View findViewById9 = appCompatDialog.findViewById(C17532R$id.viewFlipper);
        C13706o.m87926c(findViewById9);
        ViewFlipper viewFlipper = (ViewFlipper) findViewById9;
        View findViewById10 = appCompatDialog.findViewById(C17532R$id.stringVariableSpinner);
        C13706o.m87926c(findViewById10);
        Spinner spinner = (Spinner) findViewById10;
        View findViewById11 = appCompatDialog.findViewById(C17532R$id.addStringVariableButton);
        C13706o.m87926c(findViewById11);
        radioButton.setChecked(this.staticFilename);
        ((RadioButton) findViewById5).setChecked(!this.staticFilename);
        C2584c cVar = r0;
        Button button3 = (Button) findViewById11;
        Spinner spinner2 = spinner;
        Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.special_text_button_filename);
        C2584c cVar2 = new C2584c(viewFlipper, this, button, radioButton, spinner, (C13635d<? super C2584c>) null);
        C16061a.m96671b(radioButton, (C13640g) null, cVar, 1, (Object) null);
        viewFlipper.setDisplayedChild(this.staticFilename ^ true ? 1 : 0);
        TextView textView = this.staticFilenameText;
        C13706o.m87926c(textView);
        textView.setText(this.staticFilepath);
        this.temporaryPathName = this.pathName;
        EditText editText = this.filenameEditText;
        C13706o.m87926c(editText);
        editText.setText(this.filename);
        String str = this.temporaryPathName;
        if (str != null) {
            TextView textView2 = this.dirText;
            if (textView2 != null) {
                textView2.setText(str);
            }
        } else {
            TextView textView3 = this.dirText;
            if (textView3 != null) {
                textView3.setText('<' + SelectableItem.m15535j1(C17541R$string.action_write_to_file_select_folder) + '>');
            }
        }
        imageButton2.setOnClickListener(new C2917ae(this));
        Spinner spinner3 = spinner2;
        C2588f fVar = new C2588f(this, button, radioButton, spinner3);
        C2585d dVar = r0;
        C2585d dVar2 = new C2585d(j0, spinner3, this, button, radioButton, (C13635d<? super C2585d>) null);
        C4666m.m18147o(button3, (C13640g) null, dVar, 1, (Object) null);
        m11905M3(spinner3, new C2587e(this, button, radioButton, spinner3));
        EditText editText2 = this.filenameEditText;
        C13706o.m87926c(editText2);
        editText2.addTextChangedListener(fVar);
        TextView textView4 = this.staticFilenameText;
        C13706o.m87926c(textView4);
        textView4.addTextChangedListener(fVar);
        imageButton.setOnClickListener(new C3651zd(this));
        button.setOnClickListener(new C2973ce(this, appCompatDialog, radioButton));
        m11907O3(button, radioButton, spinner3);
        button2.setOnClickListener(new C2945be(this, appCompatDialog));
        appCompatDialog.setOnCancelListener(new C3597xd(this, appCompatDialog));
        C3002de deVar = new C3002de(this);
        C13706o.m87926c(button4);
        button4.setOnClickListener(new C3624yd(j0, deVar, this));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static final void m11898F3(ReadFileAction readFileAction, View view) {
        C13706o.m87929f(readFileAction, "this$0");
        readFileAction.m11896D3();
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public static final void m11899G3(ReadFileAction readFileAction, View view) {
        C13706o.m87929f(readFileAction, "this$0");
        readFileAction.m11895C3();
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public static final void m11900H3(ReadFileAction readFileAction, AppCompatDialog appCompatDialog, RadioButton radioButton, View view) {
        C13706o.m87929f(readFileAction, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        C13706o.m87929f(radioButton, "$radioButtonStatic");
        if (readFileAction.staticFilename || readFileAction.temporaryPathName != null) {
            readFileAction.pathName = readFileAction.temporaryPathName;
            appCompatDialog.dismiss();
            readFileAction.variableName = readFileAction.workingVariableName;
            readFileAction.dictionaryKeys = readFileAction.workingDictionaryKeys;
            if (radioButton.isChecked()) {
                TextView textView = readFileAction.staticFilenameText;
                C13706o.m87926c(textView);
                readFileAction.staticFilepath = textView.getText().toString();
            } else {
                EditText editText = readFileAction.filenameEditText;
                C13706o.m87926c(editText);
                readFileAction.filename = editText.getText().toString();
            }
            readFileAction.dirText = null;
            readFileAction.staticFilename = radioButton.isChecked();
            readFileAction.mo24689O1();
            return;
        }
        C15626c.makeText(readFileAction.mo27827K0(), C17541R$string.action_write_to_file_select_folder, 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public static final void m11901I3(ReadFileAction readFileAction, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(readFileAction, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        readFileAction.dirText = null;
        appCompatDialog.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public static final void m11902J3(ReadFileAction readFileAction, AppCompatDialog appCompatDialog, DialogInterface dialogInterface) {
        C13706o.m87929f(readFileAction, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        readFileAction.dirText = null;
        appCompatDialog.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public static final void m11903K3(ReadFileAction readFileAction, C4023j0.C4029f fVar) {
        C13706o.m87929f(readFileAction, "this$0");
        C13706o.m87929f(fVar, "pair");
        EditText editText = readFileAction.filenameEditText;
        C13706o.m87926c(editText);
        int max = Math.max(editText.getSelectionStart(), 0);
        EditText editText2 = readFileAction.filenameEditText;
        C13706o.m87926c(editText2);
        int max2 = Math.max(editText2.getSelectionEnd(), 0);
        EditText editText3 = readFileAction.filenameEditText;
        C13706o.m87926c(editText3);
        Editable text = editText3.getText();
        C13706o.m87926c(text);
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public static final void m11904L3(Activity activity, C4023j0.C4028e eVar, ReadFileAction readFileAction, View view) {
        C13706o.m87929f(eVar, "$filenameMagicTextListener");
        C13706o.m87929f(readFileAction, "this$0");
        C4023j0.m15700F(activity, eVar, readFileAction.mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, readFileAction.mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public final void m11905M3(Spinner spinner, C16254a<C13339u> aVar) {
        String str;
        List e = mo27875y0().isEmpty() ? C13612s.m87736e(SelectableItem.m15535j1(C17541R$string.action_set_variable_select)) : C13614t.m87748j();
        Activity j0 = mo27850j0();
        C13706o.m87928e(j0, "activity");
        Macro X0 = mo27837X0();
        if (this.workingVariableName != null) {
            str = this.workingVariableName + C6520o0.m24912e0(this.dictionaryKeys);
        } else {
            str = null;
        }
        C6520o0.m24881J(j0, C17542R$style.Theme_App_Dialog_Action, this, spinner, X0, e, str, true, new C2589g(this, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public final void m11906N3(String str) {
        Long Y0 = mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18869h("Error - could not read from file: " + str + ". Need to re-select path and grant access.", Y0.longValue());
        Context K0 = mo27827K0();
        C13706o.m87928e(K0, "context");
        String j1 = SelectableItem.m15535j1(C17541R$string.read_file_failed_please_reconfigure_directory);
        C13706o.m87928e(j1, "getString(R.string.read_…se_reconfigure_directory)");
        String name = mo27837X0().getName();
        C13706o.m87928e(name, "macro.name");
        C8194a.m34000a(K0, j1, name);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r2.workingVariableName != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r2.workingVariableName != null) goto L_0x0045;
     */
    /* renamed from: O3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m11907O3(android.widget.Button r3, android.widget.RadioButton r4, android.widget.Spinner r5) {
        /*
            r2 = this;
            boolean r4 = r4.isChecked()
            r5 = 1
            r0 = 0
            if (r4 == 0) goto L_0x0026
            android.widget.TextView r4 = r2.staticFilenameText
            kotlin.jvm.internal.C13706o.m87926c(r4)
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r1 = "staticFilenameText!!.text"
            kotlin.jvm.internal.C13706o.m87928e(r4, r1)
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x001e
            r4 = 1
            goto L_0x001f
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r4 == 0) goto L_0x0044
            java.lang.String r4 = r2.workingVariableName
            if (r4 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0026:
            android.widget.EditText r4 = r2.filenameEditText
            kotlin.jvm.internal.C13706o.m87926c(r4)
            android.text.Editable r4 = r4.getText()
            java.lang.String r1 = "filenameEditText!!.text"
            kotlin.jvm.internal.C13706o.m87928e(r4, r1)
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x003c
            r4 = 1
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            if (r4 == 0) goto L_0x0044
            java.lang.String r4 = r2.workingVariableName
            if (r4 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r5 = 0
        L_0x0045:
            r3.setEnabled(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.ReadFileAction.m11907O3(android.widget.Button, android.widget.RadioButton, android.widget.Spinner):void");
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.staticFilename ? this.staticFilepath : this.filename);
        sb.append(" -> ");
        sb.append(this.variableName);
        sb.append(C6520o0.m24912e0(this.dictionaryKeys));
        return sb.toString();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7832r2.f18875j.mo37769a();
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

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        Stack<Integer> stack2 = stack;
        C13706o.m87929f(stack2, "skipEndifIndexStack");
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new C2590h(this, triggerContextInfo, z2, i, z, stack2, resumeMacroInfo, (C13635d<? super C2590h>) null), 2, (Object) null);
    }

    /* renamed from: k */
    public void mo24427k(DictionaryKeys dictionaryKeys2) {
        this.dictionaryKeys = dictionaryKeys2;
    }

    /* renamed from: m */
    public String mo24434m() {
        return this.variableName;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        String name;
        C13706o.m87929f(activity, "activity");
        mo27877y2(activity);
        if (i2 == -1) {
            String str = "";
            Uri uri = null;
            if (i == 1) {
                if (intent != null) {
                    uri = intent.getData();
                }
                this.pathUri = String.valueOf(uri);
                ContentResolver contentResolver = mo27827K0().getContentResolver();
                C13706o.m87926c(uri);
                contentResolver.takePersistableUriPermission(uri, 1);
                DocumentFile fromTreeUri = DocumentFile.fromTreeUri(mo27827K0(), uri);
                C13706o.m87926c(fromTreeUri);
                DocumentFile parentFile = fromTreeUri.getParentFile();
                StringBuilder sb = new StringBuilder();
                if (parentFile != null) {
                    str = parentFile.getName();
                }
                sb.append(str);
                sb.append('/');
                sb.append(fromTreeUri.getName());
                String sb2 = sb.toString();
                this.temporaryPathName = sb2;
                TextView textView = this.dirText;
                if (textView != null) {
                    textView.setText(sb2);
                }
            } else if (i == 2) {
                if (intent != null) {
                    uri = intent.getData();
                }
                this.staticPathUri = String.valueOf(uri);
                ContentResolver contentResolver2 = mo27827K0().getContentResolver();
                C13706o.m87926c(uri);
                contentResolver2.takePersistableUriPermission(uri, 1);
                DocumentFile fromSingleUri = DocumentFile.fromSingleUri(mo27827K0(), uri);
                TextView textView2 = this.staticFilenameText;
                if (textView2 != null) {
                    if (!(fromSingleUri == null || (name = fromSingleUri.getName()) == null)) {
                        str = name;
                    }
                    textView2.setText(str);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        m11897E3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.variableName);
        parcel.writeParcelable(this.dictionaryKeys, i);
        parcel.writeString(this.staticFilepath);
        parcel.writeString(this.staticPathUri);
        parcel.writeString(this.filename);
        parcel.writeString(this.pathUri);
        parcel.writeString(this.pathName);
        parcel.writeInt(this.staticFilename ? 1 : 0);
    }

    public ReadFileAction() {
        this.staticFilename = true;
    }

    private ReadFileAction(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.staticFilename = true;
        this.variableName = parcel.readString();
        this.dictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
        this.staticFilepath = parcel.readString();
        this.staticPathUri = parcel.readString();
        this.filename = parcel.readString();
        this.pathUri = parcel.readString();
        this.pathName = parcel.readString();
        this.staticFilename = parcel.readInt() == 0 ? false : z;
    }
}
