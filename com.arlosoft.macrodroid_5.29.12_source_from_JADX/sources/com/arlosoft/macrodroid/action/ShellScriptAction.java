package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.HelperSystemCommands;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
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
import p057a2.C2219h;
import p057a2.C2224m;
import p112j2.C7439d0;
import p128m0.C7758h4;
import p148q0.C8151a;
import p177v1.C10316a;
import p177v1.C10317b;
import p182w1.C10328a;
import p182w1.C10329b;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;
import p376r7.C16351a;
import p376r7.C16355b;
import p385s7.C16505a;

/* compiled from: ShellScriptAction.kt */
public final class ShellScriptAction extends Action implements C2224m, C2219h, C2212a, C2216e {
    public static final Parcelable.Creator<ShellScriptAction> CREATOR = new C2682a();
    private static final int[] TIMEOUT_VALUE_SECONDS = {5, 10, 30, 60, 120, 300, 600, 1200, 1800, 3600};

    /* renamed from: f */
    public static final C2683b f7567f = new C2683b((C13695i) null);
    private static C16355b nonRootShell;
    private static C16355b rootShell;
    private static int s_actionCounter;
    /* access modifiers changed from: private */
    public boolean blockNextAction;
    private transient C16351a currentCommand;

    /* renamed from: d */
    public transient C10317b f7568d;
    /* access modifiers changed from: private */
    public transient long lastTerminateTimestamp;
    private boolean m_nonRoot;
    private String m_script;
    /* access modifiers changed from: private */
    public MacroDroidVariable m_variableToSaveResponse;
    /* access modifiers changed from: private */
    public int timeoutSeconds;
    private boolean useHelper;
    /* access modifiers changed from: private */
    public DictionaryKeys varDictionaryKeys;
    /* access modifiers changed from: private */
    public transient DictionaryKeys workingDictionaryKeys;
    /* access modifiers changed from: private */
    public transient MacroDroidVariable workingVariable;

    /* renamed from: com.arlosoft.macrodroid.action.ShellScriptAction$a */
    /* compiled from: ShellScriptAction.kt */
    public static final class C2682a implements Parcelable.Creator<ShellScriptAction> {
        C2682a() {
        }

        /* renamed from: a */
        public ShellScriptAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ShellScriptAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public ShellScriptAction[] newArray(int i) {
            return new ShellScriptAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ShellScriptAction$b */
    /* compiled from: ShellScriptAction.kt */
    public static final class C2683b {
        private C2683b() {
        }

        public /* synthetic */ C2683b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ShellScriptAction$c */
    /* compiled from: ShellScriptAction.kt */
    public static final class C2684c implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ ShellScriptAction f7569a;

        /* renamed from: b */
        final /* synthetic */ Spinner f7570b;

        C2684c(ShellScriptAction shellScriptAction, Spinner spinner) {
            this.f7569a = shellScriptAction;
            this.f7570b = spinner;
        }

        /* renamed from: a */
        public void mo24722a(int i, String str) {
            C13706o.m87929f(str, "value");
            this.f7569a.workingVariable = null;
            this.f7569a.workingDictionaryKeys = null;
        }

        /* renamed from: b */
        public void mo24723b(MacroDroidVariable macroDroidVariable, List<String> list) {
            C13706o.m87929f(macroDroidVariable, "variable");
            this.f7570b.setEnabled(true);
            this.f7570b.setAlpha(1.0f);
            this.f7569a.workingVariable = macroDroidVariable;
            this.f7569a.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ShellScriptAction$d */
    /* compiled from: ShellScriptAction.kt */
    public static final class C2685d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7571a;

        /* renamed from: c */
        final /* synthetic */ EditText f7572c;

        C2685d(Button button, EditText editText) {
            this.f7571a = button;
            this.f7572c = editText;
        }

        public void afterTextChanged(Editable editable) {
            C13706o.m87929f(editable, "s");
            Button button = this.f7571a;
            if (button != null) {
                button.setEnabled(this.f7572c.getText().length() > 0);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ShellScriptAction$e */
    /* compiled from: ShellScriptAction.kt */
    public static final class C2686e extends C16351a {

        /* renamed from: p */
        private final StringBuilder f7573p = new StringBuilder();

        /* renamed from: q */
        final /* synthetic */ ShellScriptAction f7574q;

        /* renamed from: r */
        final /* synthetic */ boolean f7575r;

        /* renamed from: s */
        final /* synthetic */ int f7576s;

        /* renamed from: t */
        final /* synthetic */ TriggerContextInfo f7577t;

        /* renamed from: u */
        final /* synthetic */ boolean f7578u;

        /* renamed from: v */
        final /* synthetic */ Stack<Integer> f7579v;

        /* renamed from: w */
        final /* synthetic */ ResumeMacroInfo f7580w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2686e(ShellScriptAction shellScriptAction, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, int i2, Object[] objArr) {
            super(0, i2, (String[]) objArr);
            this.f7574q = shellScriptAction;
            this.f7575r = z;
            this.f7576s = i;
            this.f7577t = triggerContextInfo;
            this.f7578u = z2;
            this.f7579v = stack;
            this.f7580w = resumeMacroInfo;
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public static final void m13046s(ShellScriptAction shellScriptAction, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
            C13706o.m87929f(shellScriptAction, "this$0");
            C13706o.m87929f(stack, "$skipEndifIndexStack");
            if (shellScriptAction.blockNextAction && !z) {
                shellScriptAction.mo27837X0().invokeActions(shellScriptAction.mo27837X0().getActions(), i, triggerContextInfo, z2, stack, resumeMacroInfo);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public static final void m13047t(ShellScriptAction shellScriptAction, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
            C13706o.m87929f(shellScriptAction, "this$0");
            C13706o.m87929f(stack, "$skipEndifIndexStack");
            if (shellScriptAction.blockNextAction && !z) {
                shellScriptAction.mo27837X0().invokeActions(shellScriptAction.mo27837X0().getActions(), i, triggerContextInfo, z2, stack, resumeMacroInfo);
            }
        }

        /* renamed from: a */
        public void mo25774a(int i, int i2) {
            List<String> list;
            super.mo25774a(i, i2);
            if (this.f7574q.m_variableToSaveResponse != null) {
                ShellScriptAction shellScriptAction = this.f7574q;
                MacroDroidVariable q3 = shellScriptAction.m_variableToSaveResponse;
                C13706o.m87926c(q3);
                MacroDroidVariable q = shellScriptAction.mo27861q(q3.getName());
                if (q != null) {
                    Context K0 = this.f7574q.mo27827K0();
                    C13706o.m87928e(K0, "getContext()");
                    DictionaryKeys s3 = this.f7574q.varDictionaryKeys;
                    if (s3 == null || (list = s3.getKeys()) == null) {
                        list = C13614t.m87748j();
                    }
                    TriggerContextInfo triggerContextInfo = this.f7577t;
                    Macro X0 = this.f7574q.mo27837X0();
                    C13706o.m87928e(X0, "macro");
                    ArrayList<String> C = C6520o0.m24868C(K0, list, triggerContextInfo, X0);
                    String sb = this.f7573p.toString();
                    C13706o.m87928e(sb, "shellOutput.toString()");
                    this.f7574q.mo27832M2(q, new VariableValue.StringValue(sb, C));
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to save command line output to variable: ");
                    MacroDroidVariable q32 = this.f7574q.m_variableToSaveResponse;
                    C13706o.m87926c(q32);
                    sb2.append(q32.getName());
                    sb2.append(" not found");
                    String sb3 = sb2.toString();
                    Long Y0 = this.f7574q.mo27840Y0();
                    C13706o.m87928e(Y0, "macroGuid");
                    C4878b.m18869h(sb3, Y0.longValue());
                }
            }
            new Handler(Looper.getMainLooper()).post(new C3495tk(this.f7574q, this.f7575r, this.f7576s, this.f7577t, this.f7578u, this.f7579v, this.f7580w));
        }

        /* renamed from: c */
        public void mo25775c(int i, String str) {
            C13706o.m87929f(str, "line");
            super.mo25775c(i, str);
            this.f7573p.append(str);
        }

        /* renamed from: d */
        public void mo25776d(int i, String str) {
            C13706o.m87929f(str, "reason");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > this.f7574q.lastTerminateTimestamp + ((long) 1000)) {
                String str2 = "Shell script terminated. Reason: " + str;
                Long Y0 = this.f7574q.mo27840Y0();
                C13706o.m87928e(Y0, "macroGuid");
                C4878b.m18869h(str2, Y0.longValue());
                new Handler(Looper.getMainLooper()).post(new C3522uk(this.f7574q, this.f7575r, this.f7576s, this.f7577t, this.f7578u, this.f7579v, this.f7580w));
                this.f7574q.lastTerminateTimestamp = currentTimeMillis;
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ShellScriptAction$f */
    /* compiled from: ShellScriptAction.kt */
    static final class C2687f extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ TriggerContextInfo $contextInfo;
        final /* synthetic */ boolean $forceEvenIfNotEnabled;
        final /* synthetic */ boolean $isTest;
        final /* synthetic */ int $nextAction;
        final /* synthetic */ int $requestId;
        final /* synthetic */ ResumeMacroInfo $resumeMacroInfo;
        final /* synthetic */ Stack<Integer> $skipEndifIndexStack;
        int label;
        final /* synthetic */ ShellScriptAction this$0;

        /* renamed from: com.arlosoft.macrodroid.action.ShellScriptAction$f$a */
        /* compiled from: ShellScriptAction.kt */
        static final class C2688a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ TriggerContextInfo $contextInfo;
            final /* synthetic */ boolean $forceEvenIfNotEnabled;
            final /* synthetic */ boolean $isTest;
            final /* synthetic */ int $nextAction;
            final /* synthetic */ int $requestId;
            final /* synthetic */ ResumeMacroInfo $resumeMacroInfo;
            final /* synthetic */ Stack<Integer> $skipEndifIndexStack;
            int label;
            final /* synthetic */ ShellScriptAction this$0;

            /* renamed from: com.arlosoft.macrodroid.action.ShellScriptAction$f$a$a */
            /* compiled from: ShellScriptAction.kt */
            static final class C2689a<T> implements C15288g {

                /* renamed from: a */
                final /* synthetic */ ShellScriptAction f7581a;

                /* renamed from: c */
                final /* synthetic */ TriggerContextInfo f7582c;

                /* renamed from: d */
                final /* synthetic */ boolean f7583d;

                /* renamed from: f */
                final /* synthetic */ int f7584f;

                /* renamed from: g */
                final /* synthetic */ boolean f7585g;

                /* renamed from: o */
                final /* synthetic */ Stack<Integer> f7586o;

                /* renamed from: p */
                final /* synthetic */ ResumeMacroInfo f7587p;

                C2689a(ShellScriptAction shellScriptAction, TriggerContextInfo triggerContextInfo, boolean z, int i, boolean z2, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo) {
                    this.f7581a = shellScriptAction;
                    this.f7582c = triggerContextInfo;
                    this.f7583d = z;
                    this.f7584f = i;
                    this.f7585g = z2;
                    this.f7586o = stack;
                    this.f7587p = resumeMacroInfo;
                }

                /* access modifiers changed from: private */
                /* renamed from: e */
                public static final void m13054e(ShellScriptAction shellScriptAction, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
                    C13706o.m87929f(shellScriptAction, "this$0");
                    C13706o.m87929f(stack, "$skipEndifIndexStack");
                    if (shellScriptAction.blockNextAction && !z) {
                        shellScriptAction.mo27837X0().invokeActions(shellScriptAction.mo27837X0().getActions(), i, triggerContextInfo, z2, stack, resumeMacroInfo);
                    }
                }

                /* renamed from: d */
                public final Object emit(C10328a aVar, C13635d<? super C13339u> dVar) {
                    List<String> list;
                    C13706o.m87927d(aVar, "null cannot be cast to non-null type com.arlosoft.macrodroid.helper.data.ShellScriptResult");
                    C10329b bVar = (C10329b) aVar;
                    if (bVar.mo40954b()) {
                        Long Y0 = this.f7581a.mo27840Y0();
                        C13706o.m87928e(Y0, "macroGuid");
                        C4878b.m18869h("Shell script timed out", Y0.longValue());
                    } else if (this.f7581a.m_variableToSaveResponse != null) {
                        ShellScriptAction shellScriptAction = this.f7581a;
                        MacroDroidVariable q3 = shellScriptAction.m_variableToSaveResponse;
                        C13706o.m87926c(q3);
                        MacroDroidVariable q = shellScriptAction.mo27861q(q3.getName());
                        if (q != null) {
                            Context K0 = this.f7581a.mo27827K0();
                            C13706o.m87928e(K0, "context");
                            DictionaryKeys s3 = this.f7581a.varDictionaryKeys;
                            if (s3 == null || (list = s3.getKeys()) == null) {
                                list = C13614t.m87748j();
                            }
                            TriggerContextInfo triggerContextInfo = this.f7582c;
                            Macro X0 = this.f7581a.mo27837X0();
                            C13706o.m87928e(X0, "macro");
                            this.f7581a.mo27832M2(q, new VariableValue.StringValue(bVar.mo40955c(), C6520o0.m24868C(K0, list, triggerContextInfo, X0)));
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to save command line output to variable: ");
                            MacroDroidVariable q32 = this.f7581a.m_variableToSaveResponse;
                            C13706o.m87926c(q32);
                            sb.append(q32.getName());
                            sb.append(" not found");
                            String sb2 = sb.toString();
                            Long Y02 = this.f7581a.mo27840Y0();
                            C13706o.m87928e(Y02, "macroGuid");
                            C4878b.m18869h(sb2, Y02.longValue());
                        }
                    }
                    new Handler(Looper.getMainLooper()).post(new C3577wk(this.f7581a, this.f7583d, this.f7584f, this.f7582c, this.f7585g, this.f7586o, this.f7587p));
                    return C13339u.f61331a;
                }
            }

            /* renamed from: com.arlosoft.macrodroid.action.ShellScriptAction$f$a$b */
            /* compiled from: SafeCollector.common.kt */
            public static final class C2690b implements C15285f<C10328a> {

                /* renamed from: a */
                final /* synthetic */ C15285f f7588a;

                /* renamed from: c */
                final /* synthetic */ int f7589c;

                /* renamed from: com.arlosoft.macrodroid.action.ShellScriptAction$f$a$b$a */
                /* compiled from: Emitters.kt */
                public static final class C2691a<T> implements C15288g {

                    /* renamed from: a */
                    final /* synthetic */ C15288g f7590a;

                    /* renamed from: c */
                    final /* synthetic */ int f7591c;

                    /* renamed from: com.arlosoft.macrodroid.action.ShellScriptAction$f$a$b$a$a */
                    /* compiled from: Emitters.kt */
                    public static final class C2692a extends C13656d {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;
                        final /* synthetic */ C2691a this$0;

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public C2692a(C2691a aVar, C13635d dVar) {
                            super(dVar);
                            this.this$0 = aVar;
                        }

                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return this.this$0.emit((Object) null, this);
                        }
                    }

                    public C2691a(C15288g gVar, int i) {
                        this.f7590a = gVar;
                        this.f7591c = i;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.C13635d r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof com.arlosoft.macrodroid.action.ShellScriptAction.C2687f.C2688a.C2690b.C2691a.C2692a
                            if (r0 == 0) goto L_0x0013
                            r0 = r7
                            com.arlosoft.macrodroid.action.ShellScriptAction$f$a$b$a$a r0 = (com.arlosoft.macrodroid.action.ShellScriptAction.C2687f.C2688a.C2690b.C2691a.C2692a) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0013
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L_0x0018
                        L_0x0013:
                            com.arlosoft.macrodroid.action.ShellScriptAction$f$a$b$a$a r0 = new com.arlosoft.macrodroid.action.ShellScriptAction$f$a$b$a$a
                            r0.<init>(r5, r7)
                        L_0x0018:
                            java.lang.Object r7 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L_0x0031
                            if (r2 != r3) goto L_0x0029
                            p297ja.C13332o.m85685b(r7)
                            goto L_0x004f
                        L_0x0029:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L_0x0031:
                            p297ja.C13332o.m85685b(r7)
                            kotlinx.coroutines.flow.g r7 = r5.f7590a
                            r2 = r6
                            w1.a r2 = (p182w1.C10328a) r2
                            int r2 = r2.mo40953a()
                            int r4 = r5.f7591c
                            if (r2 != r4) goto L_0x0043
                            r2 = 1
                            goto L_0x0044
                        L_0x0043:
                            r2 = 0
                        L_0x0044:
                            if (r2 == 0) goto L_0x004f
                            r0.label = r3
                            java.lang.Object r6 = r7.emit(r6, r0)
                            if (r6 != r1) goto L_0x004f
                            return r1
                        L_0x004f:
                            ja.u r6 = p297ja.C13339u.f61331a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.ShellScriptAction.C2687f.C2688a.C2690b.C2691a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                    }
                }

                public C2690b(C15285f fVar, int i) {
                    this.f7588a = fVar;
                    this.f7589c = i;
                }

                public Object collect(C15288g gVar, C13635d dVar) {
                    Object collect = this.f7588a.collect(new C2691a(gVar, this.f7589c), dVar);
                    if (collect == C13652d.m87832c()) {
                        return collect;
                    }
                    return C13339u.f61331a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2688a(ShellScriptAction shellScriptAction, int i, TriggerContextInfo triggerContextInfo, boolean z, int i2, boolean z2, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, C13635d<? super C2688a> dVar) {
                super(2, dVar);
                this.this$0 = shellScriptAction;
                this.$requestId = i;
                this.$contextInfo = triggerContextInfo;
                this.$isTest = z;
                this.$nextAction = i2;
                this.$forceEvenIfNotEnabled = z2;
                this.$skipEndifIndexStack = stack;
                this.$resumeMacroInfo = resumeMacroInfo;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C2688a(this.this$0, this.$requestId, this.$contextInfo, this.$isTest, this.$nextAction, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C2688a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c = C13652d.m87832c();
                int i = this.label;
                if (i == 0) {
                    C13332o.m85685b(obj);
                    C15285f B = C15290h.m94111B(new C2690b(this.this$0.mo25762A3().mo40938a(), this.$requestId), 1);
                    C2689a aVar = new C2689a(this.this$0, this.$contextInfo, this.$isTest, this.$nextAction, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo);
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
        C2687f(ShellScriptAction shellScriptAction, int i, TriggerContextInfo triggerContextInfo, boolean z, int i2, boolean z2, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, C13635d<? super C2687f> dVar) {
            super(2, dVar);
            this.this$0 = shellScriptAction;
            this.$requestId = i;
            this.$contextInfo = triggerContextInfo;
            this.$isTest = z;
            this.$nextAction = i2;
            this.$forceEvenIfNotEnabled = z2;
            this.$skipEndifIndexStack = stack;
            this.$resumeMacroInfo = resumeMacroInfo;
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public static final void m13052p(ShellScriptAction shellScriptAction, boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
            Long Y0 = shellScriptAction.mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18869h("Shell script timed out", Y0.longValue());
            if (shellScriptAction.blockNextAction && !z) {
                shellScriptAction.mo27837X0().invokeActions(shellScriptAction.mo27837X0().getActions(), i, triggerContextInfo, z2, stack, resumeMacroInfo);
            }
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2687f(this.this$0, this.$requestId, this.$contextInfo, this.$isTest, this.$nextAction, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2687f) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C2688a aVar = new C2688a(this.this$0, this.$requestId, this.$contextInfo, this.$isTest, this.$nextAction, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo, (C13635d<? super C2688a>) null);
                this.label = 1;
                obj2 = C15576z2.m94763c(((long) (this.this$0.timeoutSeconds + 2)) * 1000, aVar, this);
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
                new Handler(Looper.getMainLooper()).post(new C3549vk(this.this$0, this.$isTest, this.$nextAction, this.$contextInfo, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo));
            }
            return C13339u.f61331a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShellScriptAction(Activity activity, Macro macro) {
        this();
        C13706o.m87929f(macro, "macro");
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ ShellScriptAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: B3 */
    private final String[] m12997B3() {
        String j1 = SelectableItem.m15535j1(C17541R$string.seconds_5);
        C13706o.m87928e(j1, "getString(R.string.seconds_5)");
        String j12 = SelectableItem.m15535j1(C17541R$string.seconds_10);
        C13706o.m87928e(j12, "getString(R.string.seconds_10)");
        String j13 = SelectableItem.m15535j1(C17541R$string.seconds_30);
        C13706o.m87928e(j13, "getString(R.string.seconds_30)");
        String j14 = SelectableItem.m15535j1(C17541R$string.minute_1);
        C13706o.m87928e(j14, "getString(R.string.minute_1)");
        String j15 = SelectableItem.m15535j1(C17541R$string.minutes_2);
        C13706o.m87928e(j15, "getString(R.string.minutes_2)");
        String j16 = SelectableItem.m15535j1(C17541R$string.minutes_5);
        C13706o.m87928e(j16, "getString(R.string.minutes_5)");
        String j17 = SelectableItem.m15535j1(C17541R$string.minutes_10);
        C13706o.m87928e(j17, "getString(R.string.minutes_10)");
        String j18 = SelectableItem.m15535j1(C17541R$string.minutes_20);
        C13706o.m87928e(j18, "getString(R.string.minutes_20)");
        String j19 = SelectableItem.m15535j1(C17541R$string.minutes_30);
        C13706o.m87928e(j19, "getString(R.string.minutes_30)");
        String j110 = SelectableItem.m15535j1(C17541R$string.minutes_60);
        C13706o.m87928e(j110, "getString(R.string.minutes_60)");
        return new String[]{j1, j12, j13, j14, j15, j16, j17, j18, j19, j110};
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static final void m12998C3(ShellScriptAction shellScriptAction, CheckBox checkBox, EditText editText, AppCompatDialog appCompatDialog, RadioButton radioButton, CheckBox checkBox2, Spinner spinner, Activity activity, View view) {
        C13706o.m87929f(shellScriptAction, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        shellScriptAction.m_variableToSaveResponse = shellScriptAction.workingVariable;
        shellScriptAction.varDictionaryKeys = shellScriptAction.workingDictionaryKeys;
        shellScriptAction.useHelper = checkBox.isChecked();
        C13706o.m87926c(editText);
        shellScriptAction.m_script = editText.getText().toString();
        appCompatDialog.dismiss();
        C13706o.m87926c(radioButton);
        shellScriptAction.m_nonRoot = radioButton.isChecked();
        C13706o.m87926c(checkBox2);
        shellScriptAction.blockNextAction = checkBox2.isChecked();
        int[] iArr = TIMEOUT_VALUE_SECONDS;
        C13706o.m87926c(spinner);
        shellScriptAction.timeoutSeconds = iArr[spinner.getSelectedItemPosition()];
        shellScriptAction.mo24689O1();
        if (shellScriptAction.mo27858o2(C4031k.m15904d())) {
            C7439d0.m30903l0(activity, false, false, shellScriptAction.mo24738G0());
        }
    }

    /* renamed from: D1 */
    private final void m12999D1() {
        MacroDroidApplication.f9883I.mo27302a().mo38315t(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static final void m13000D3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static final void m13001E3(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(fVar, "pair");
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
    public static final void m13002F3(Activity activity, C4023j0.C4028e eVar, ShellScriptAction shellScriptAction, View view) {
        C13706o.m87929f(eVar, "$magicTextListener");
        C13706o.m87929f(shellScriptAction, "this$0");
        C4023j0.m15700F(activity, eVar, shellScriptAction.mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, shellScriptAction.mo24686E1());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:18|19|20|(2:22|23)|24|25|(2:27|28)|29|30|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007e, code lost:
        if (r0.f66878n != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cc, code lost:
        r0 = nonRootShell;
        kotlin.jvm.internal.C13706o.m87926c(r0);
        r0.mo79032w(r11.currentCommand);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d7, code lost:
        r0 = rootShell;
        kotlin.jvm.internal.C13706o.m87926c(r0);
        r0.mo79032w(r11.currentCommand);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e3, code lost:
        r1 = r14.mo27840Y0();
        kotlin.jvm.internal.C13706o.m87928e(r1, "macroGuid");
        com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h("Shell script action failed: " + r0, r1.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0064, code lost:
        if (r0.f66878n != false) goto L_0x0066;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00b8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00c2 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bc A[SYNTHETIC, Splitter:B:27:0x00bc] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc A[Catch:{ Exception -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d7 A[Catch:{ Exception -> 0x00e2 }] */
    /* renamed from: H3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13003H3(java.lang.String r13, com.arlosoft.macrodroid.action.ShellScriptAction r14, boolean r15, int r16, com.arlosoft.macrodroid.triggers.TriggerContextInfo r17, boolean r18, java.util.Stack r19, com.arlosoft.macrodroid.data.ResumeMacroInfo r20) {
        /*
            r11 = r14
            java.lang.String r12 = "macroGuid"
            java.lang.String r0 = "$script"
            r1 = r13
            kotlin.jvm.internal.C13706o.m87929f(r13, r0)
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C13706o.m87929f(r14, r0)
            java.lang.String r0 = "$skipEndifIndexStack"
            r7 = r19
            kotlin.jvm.internal.C13706o.m87929f(r7, r0)
            java.lang.String r2 = "\\n"
            java.lang.String r3 = "\n"
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r13
            java.lang.String r0 = kotlin.text.C15176v.m93630E(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00e2 }
            kotlin.text.j r1 = new kotlin.text.j     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r2 = "\n"
            r1.<init>((java.lang.String) r2)     // Catch:{ Exception -> 0x00e2 }
            r2 = 0
            java.util.List r0 = r1.mo74470e(r0, r2)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ Exception -> 0x00e2 }
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ Exception -> 0x00e2 }
            int r1 = r11.timeoutSeconds     // Catch:{ Exception -> 0x00e2 }
            int r9 = r1 * 1000
            int r1 = r0.length     // Catch:{ Exception -> 0x00e2 }
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ Exception -> 0x00e2 }
            com.arlosoft.macrodroid.action.ShellScriptAction$e r0 = new com.arlosoft.macrodroid.action.ShellScriptAction$e     // Catch:{ Exception -> 0x00e2 }
            r1 = r0
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00e2 }
            r11.currentCommand = r0     // Catch:{ Exception -> 0x00e2 }
            boolean r0 = r11.m_nonRoot     // Catch:{ Exception -> 0x008e }
            if (r0 == 0) goto L_0x0075
            r7.b r0 = nonRootShell     // Catch:{ Exception -> 0x008e }
            if (r0 == 0) goto L_0x0066
            kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ Exception -> 0x008e }
            boolean r0 = r0.f66878n     // Catch:{ Exception -> 0x008e }
            if (r0 == 0) goto L_0x0069
        L_0x0066:
            r14.m13019y3()     // Catch:{ Exception -> 0x008e }
        L_0x0069:
            r7.b r0 = nonRootShell     // Catch:{ Exception -> 0x008e }
            kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ Exception -> 0x008e }
            r7.a r1 = r11.currentCommand     // Catch:{ Exception -> 0x008e }
            r0.mo79032w(r1)     // Catch:{ Exception -> 0x008e }
            goto L_0x0102
        L_0x0075:
            r7.b r0 = rootShell     // Catch:{ Exception -> 0x008e }
            if (r0 == 0) goto L_0x0080
            kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ Exception -> 0x008e }
            boolean r0 = r0.f66878n     // Catch:{ Exception -> 0x008e }
            if (r0 == 0) goto L_0x0083
        L_0x0080:
            r14.m13020z3()     // Catch:{ Exception -> 0x008e }
        L_0x0083:
            r7.b r0 = rootShell     // Catch:{ Exception -> 0x008e }
            kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ Exception -> 0x008e }
            r7.a r1 = r11.currentCommand     // Catch:{ Exception -> 0x008e }
            r0.mo79032w(r1)     // Catch:{ Exception -> 0x008e }
            goto L_0x0102
        L_0x008e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e2 }
            r1.<init>()     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r2 = "Error with shell, creating new shell and retrying: "
            r1.append(r2)     // Catch:{ Exception -> 0x00e2 }
            r1.append(r0)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00e2 }
            java.lang.Long r1 = r14.mo27840Y0()     // Catch:{ Exception -> 0x00e2 }
            kotlin.jvm.internal.C13706o.m87928e(r1, r12)     // Catch:{ Exception -> 0x00e2 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00e2 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r0, r1)     // Catch:{ Exception -> 0x00e2 }
            r7.b r0 = nonRootShell     // Catch:{ Exception -> 0x00e2 }
            if (r0 == 0) goto L_0x00b8
            kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ Exception -> 0x00b8 }
            r0.mo79033y()     // Catch:{ Exception -> 0x00b8 }
        L_0x00b8:
            r7.b r0 = rootShell     // Catch:{ Exception -> 0x00e2 }
            if (r0 == 0) goto L_0x00c2
            kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ Exception -> 0x00c2 }
            r0.mo79033y()     // Catch:{ Exception -> 0x00c2 }
        L_0x00c2:
            r14.m13019y3()     // Catch:{ Exception -> 0x00e2 }
            r14.m13020z3()     // Catch:{ Exception -> 0x00e2 }
            boolean r0 = r11.m_nonRoot     // Catch:{ Exception -> 0x00e2 }
            if (r0 == 0) goto L_0x00d7
            r7.b r0 = nonRootShell     // Catch:{ Exception -> 0x00e2 }
            kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ Exception -> 0x00e2 }
            r7.a r1 = r11.currentCommand     // Catch:{ Exception -> 0x00e2 }
            r0.mo79032w(r1)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x0102
        L_0x00d7:
            r7.b r0 = rootShell     // Catch:{ Exception -> 0x00e2 }
            kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ Exception -> 0x00e2 }
            r7.a r1 = r11.currentCommand     // Catch:{ Exception -> 0x00e2 }
            r0.mo79032w(r1)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x0102
        L_0x00e2:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Shell script action failed: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Long r1 = r14.mo27840Y0()
            kotlin.jvm.internal.C13706o.m87928e(r1, r12)
            long r1 = r1.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r0, r1)
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.ShellScriptAction.m13003H3(java.lang.String, com.arlosoft.macrodroid.action.ShellScriptAction, boolean, int, com.arlosoft.macrodroid.triggers.TriggerContextInfo, boolean, java.util.Stack, com.arlosoft.macrodroid.data.ResumeMacroInfo):void");
    }

    /* renamed from: I3 */
    private final void m13004I3(String str, TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        if (C4031k.m15910j()) {
            Context K0 = mo27827K0();
            C13706o.m87928e(K0, "context");
            String name = mo27837X0().getName();
            C13706o.m87928e(name, "macro.name");
            int d = HelperSystemCommands.m24581d(K0, str, this.timeoutSeconds, !this.m_nonRoot, name);
            if (!this.blockNextAction && !z2) {
                mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
            }
            C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, (C13640g) null, (C15486m0) null, new C2687f(this, d, triggerContextInfo, z2, i, z, stack, resumeMacroInfo, (C13635d<? super C2687f>) null), 3, (Object) null);
            return;
        }
        Long Y0 = mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18869h("Shell Script action is configured to use the helper file, but the helper file is not installed. Please see: https://macrodroidforum.com/index.php?threads/macrodroid-helper-apk.1/", Y0.longValue());
        Context K02 = mo27827K0();
        C13706o.m87928e(K02, "context");
        String a1 = mo25559a1();
        C13706o.m87928e(a1, "name");
        C10316a.m40521a(K02, a1, "1.7");
    }

    /* renamed from: x3 */
    private final void m13018x3(Spinner spinner) {
        String str;
        List e = C13612s.m87736e(SelectableItem.m15535j1(C17541R$string.dont_save_output_in_variable));
        Activity j0 = mo27850j0();
        C13706o.m87928e(j0, "activity");
        Macro X0 = mo27837X0();
        String str2 = null;
        if (mo24432s() != null) {
            StringBuilder sb = new StringBuilder();
            MacroDroidVariable s = mo24432s();
            if (s != null) {
                str2 = s.getName();
            }
            sb.append(str2);
            sb.append(C6520o0.m24912e0(this.varDictionaryKeys));
            str = sb.toString();
        } else {
            str = null;
        }
        C6520o0.m24881J(j0, C17542R$style.Theme_App_Dialog_Action, this, spinner, X0, e, str, true, new C2684c(this, spinner));
    }

    /* renamed from: y3 */
    private final void m13019y3() {
        Long Y0 = mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18880s("Creating non-root shell", Y0.longValue());
        try {
            nonRootShell = C16505a.m98576q(false, 600000, C16355b.C16359d.NORMAL);
            Long Y02 = mo27840Y0();
            C13706o.m87928e(Y02, "macroGuid");
            C4878b.m18880s("Created non-root shell", Y02.longValue());
        } catch (Exception e) {
            Long Y03 = mo27840Y0();
            C13706o.m87928e(Y03, "macroGuid");
            C4878b.m18869h("Failed to create non-root shell: " + e, Y03.longValue());
        }
    }

    /* renamed from: z3 */
    private final void m13020z3() {
        Long Y0 = mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18880s("Creating root shell", Y0.longValue());
        try {
            rootShell = C16505a.m98576q(true, 600000, C16355b.C16359d.SYSTEM_APP);
            Long Y02 = mo27840Y0();
            C13706o.m87928e(Y02, "macroGuid");
            C4878b.m18880s("Created root shell", Y02.longValue());
        } catch (Exception unused) {
        }
    }

    /* renamed from: A3 */
    public final C10317b mo25762A3() {
        C10317b bVar = this.f7568d;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("helperResultHandler");
        return null;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_script};
    }

    /* renamed from: G3 */
    public final void mo25763G3(String str, TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        C13706o.m87929f(str, "script");
        C13706o.m87929f(stack, "skipEndifIndexStack");
        new Thread(new C3455sk(str, this, z2, i, triggerContextInfo, z, stack, resumeMacroInfo)).start();
        if (!this.blockNextAction && !z2) {
            mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
        }
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        C13706o.m87929f(strArr, "magicText");
        if (strArr.length == 1) {
            this.m_script = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ')'));
    }

    /* renamed from: K1 */
    public boolean mo25764K1() {
        return !this.m_nonRoot;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_script;
    }

    /* renamed from: T */
    public boolean mo25765T() {
        return true;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        C4001c1 u = C7758h4.m32378u();
        C13706o.m87928e(u, "getInstance()");
        return u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public void mo24692U2() {
        try {
            int i = s_actionCounter - 1;
            s_actionCounter = i;
            if (i == 0) {
                C16355b bVar = rootShell;
                if (bVar != null) {
                    C13706o.m87926c(bVar);
                    if (!bVar.f66878n) {
                        C16355b bVar2 = rootShell;
                        C13706o.m87926c(bVar2);
                        bVar2.mo79033y();
                    }
                }
                C16355b bVar3 = nonRootShell;
                if (bVar3 != null) {
                    C13706o.m87926c(bVar3);
                    if (!bVar3.f66878n) {
                        C16355b bVar4 = nonRootShell;
                        C13706o.m87926c(bVar4);
                        bVar4.mo79033y();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: V2 */
    public void mo24694V2() {
        try {
            if (s_actionCounter == 0) {
                m13019y3();
                m13020z3();
            }
            s_actionCounter++;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public DictionaryKeys mo24426b() {
        return this.varDictionaryKeys;
    }

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        C13706o.m87929f(stack, "skipEndifIndexStack");
        String t0 = C4023j0.m15760t0(mo27827K0(), this.m_script, triggerContextInfo, mo27837X0());
        if (this.useHelper) {
            C13706o.m87928e(t0, "script");
            m13004I3(t0, triggerContextInfo, i, z, stack, resumeMacroInfo, z2);
            return;
        }
        C13706o.m87928e(t0, "script");
        mo25763G3(t0, triggerContextInfo, i, z, stack, resumeMacroInfo, z2);
    }

    /* renamed from: h3 */
    public void mo24703h3(TriggerContextInfo triggerContextInfo) {
        if (mo27839Y()) {
            C13706o.m87926c(triggerContextInfo);
            mo24421h(triggerContextInfo, 0, true, new Stack(), (ResumeMacroInfo) null, true);
        }
    }

    /* renamed from: k */
    public void mo24427k(DictionaryKeys dictionaryKeys) {
        this.varDictionaryKeys = dictionaryKeys;
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo25559a1() + " '" + mo24690R2(this.m_script, triggerContextInfo) + '\'';
    }

    /* renamed from: p2 */
    public Pair<Integer, String> mo24959p2() {
        if (this.useHelper) {
            return new Pair<>(7, "1.7");
        }
        return null;
    }

    /* renamed from: s */
    public MacroDroidVariable mo24432s() {
        return this.m_variableToSaveResponse;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_shell_script);
        appCompatDialog.setTitle((int) C17541R$string.action_shell_script);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
        this.workingVariable = this.m_variableToSaveResponse;
        this.workingDictionaryKeys = this.varDictionaryKeys;
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.dialog_shell_script_text);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.dialog_shell_script_magic_text_button);
        View findViewById = appCompatDialog.findViewById(C17532R$id.dialog_shell_script_variable_spinner);
        C13706o.m87926c(findViewById);
        Spinner spinner = (Spinner) findViewById;
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.root_only);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.non_rooted);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.blockActionsCheckbox);
        Spinner spinner2 = (Spinner) appCompatDialog.findViewById(C17532R$id.timeoutSpinner);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.helperFileCheckBox);
        C13706o.m87926c(checkBox2);
        checkBox2.setChecked(this.useHelper);
        int length = TIMEOUT_VALUE_SECONDS.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = 0;
                break;
            }
            int i2 = length;
            if (this.timeoutSeconds == TIMEOUT_VALUE_SECONDS[i]) {
                break;
            }
            i++;
            length = i2;
        }
        Button button4 = button3;
        ArrayAdapter arrayAdapter = new ArrayAdapter(j0, C17535R$layout.simple_spinner_item, m12997B3());
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        if (spinner2 != null) {
            spinner2.setAdapter(arrayAdapter);
        }
        if (spinner2 != null) {
            spinner2.setSelection(0, false);
        }
        if (spinner2 != null) {
            spinner2.setSelection(i);
        }
        appCompatDialog.dismiss();
        if (radioButton != null) {
            radioButton.setChecked(!this.m_nonRoot);
        }
        if (radioButton2 != null) {
            radioButton2.setChecked(this.m_nonRoot);
        }
        if (checkBox != null) {
            checkBox.setChecked(this.blockNextAction);
        }
        m13018x3(spinner);
        String str = this.m_script;
        if (!(str == null || str.length() == 0)) {
            if (editText != null) {
                editText.setText(this.m_script);
            }
            if (editText != null) {
                editText.setSelection(editText.length());
            }
            if (button != null) {
                button.setEnabled(true);
            }
        } else if (button != null) {
            button.setEnabled(false);
        }
        if (editText != null) {
            editText.addTextChangedListener(new C2685d(button, editText));
        }
        if (button != null) {
            button.setOnClickListener(new C3375qk(this, checkBox2, editText, appCompatDialog, radioButton2, checkBox, spinner2, j0));
        }
        if (button2 != null) {
            button2.setOnClickListener(new C3347pk(appCompatDialog));
        }
        C3404rk rkVar = new C3404rk(editText);
        C13706o.m87926c(button4);
        button4.setOnClickListener(new C3317ok(j0, rkVar, this));
        appCompatDialog.show();
    }

    /* renamed from: w3 */
    public final void mo25766w3() {
        C16351a aVar = this.currentCommand;
        if (aVar != null) {
            aVar.mo79021n();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_script);
        parcel.writeParcelable(this.m_variableToSaveResponse, i);
        parcel.writeInt(this.m_nonRoot ? 1 : 0);
        parcel.writeInt(this.blockNextAction ? 1 : 0);
        parcel.writeInt(this.timeoutSeconds);
        parcel.writeInt(this.useHelper ? 1 : 0);
        parcel.writeParcelable(this.varDictionaryKeys, i);
    }

    private ShellScriptAction() {
        this.m_script = "";
        m12999D1();
        this.timeoutSeconds = 600;
    }

    private ShellScriptAction(Parcel parcel) {
        super(parcel);
        String str = "";
        this.m_script = str;
        m12999D1();
        String readString = parcel.readString();
        this.m_script = readString != null ? readString : str;
        this.m_variableToSaveResponse = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        boolean z = true;
        this.m_nonRoot = parcel.readInt() != 0;
        this.blockNextAction = parcel.readInt() != 0;
        this.timeoutSeconds = parcel.readInt();
        this.useHelper = parcel.readInt() == 0 ? false : z;
        this.varDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
