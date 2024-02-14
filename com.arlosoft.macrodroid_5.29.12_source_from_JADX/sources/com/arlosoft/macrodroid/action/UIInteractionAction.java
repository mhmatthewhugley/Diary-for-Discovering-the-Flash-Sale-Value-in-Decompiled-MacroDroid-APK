package com.arlosoft.macrodroid.action;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.android.p023dx.p026io.Opcodes;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.UiInteractionConfiguration;
import com.arlosoft.macrodroid.action.receivers.UiInteractionNotificationPressReceiver;
import com.arlosoft.macrodroid.action.services.UIInteractionAccessibilityService;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6368b1;
import com.arlosoft.macrodroid.utils.HelperSystemCommands;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13680b0;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15552u0;
import kotlinx.coroutines.C15561w1;
import org.jetbrains.anko.sdk27.coroutines.C16061a;
import p057a2.C2212a;
import p057a2.C2221j;
import p057a2.C2224m;
import p101h3.C7375a;
import p112j2.C7439d0;
import p128m0.C7863v4;
import p149q1.C8157f;
import p150q2.C8164a;
import p270ga.C12318a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16269p;
import p370qa.C16270q;
import p370qa.C16271r;
import p440y9.C16971a;

/* compiled from: UIInteractionAction.kt */
public final class UIInteractionAction extends Action implements C2212a, C2221j, C2224m {
    public static final Parcelable.Creator<UIInteractionAction> CREATOR = new C2743a();
    private static final int REQUEST_CODE_UI_INTERACTION_NOTIFICATION = 47632;

    /* renamed from: d */
    public static final C2744b f7678d = new C2744b((C13695i) null);
    private int action;
    private transient int transientClickOption;
    private transient boolean transientLongClick;
    /* access modifiers changed from: private */
    public UiInteractionConfiguration uiInteractionConfiguration;
    private transient boolean wasPointerOverlayEnabledBefore;

    /* compiled from: UIInteractionAction.kt */
    public static final class UIInteractionOption implements Parcelable {
        public static final Parcelable.Creator<UIInteractionOption> CREATOR = new C2742a();

        /* renamed from: a */
        private final int f7679a;

        /* renamed from: c */
        private final String f7680c;

        /* renamed from: d */
        private final int f7681d;

        /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$UIInteractionOption$a */
        /* compiled from: UIInteractionAction.kt */
        public static final class C2742a implements Parcelable.Creator<UIInteractionOption> {
            /* renamed from: a */
            public final UIInteractionOption createFromParcel(Parcel parcel) {
                C13706o.m87929f(parcel, "parcel");
                return new UIInteractionOption(parcel.readInt(), parcel.readString(), parcel.readInt());
            }

            /* renamed from: b */
            public final UIInteractionOption[] newArray(int i) {
                return new UIInteractionOption[i];
            }
        }

        public UIInteractionOption(int i, String str, int i2) {
            C13706o.m87929f(str, "name");
            this.f7679a = i;
            this.f7680c = str;
            this.f7681d = i2;
        }

        /* renamed from: a */
        public final int mo25893a() {
            return this.f7679a;
        }

        /* renamed from: b */
        public final int mo25894b() {
            return this.f7681d;
        }

        /* renamed from: c */
        public final String mo25895c() {
            return this.f7680c;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UIInteractionOption)) {
                return false;
            }
            UIInteractionOption uIInteractionOption = (UIInteractionOption) obj;
            return this.f7679a == uIInteractionOption.f7679a && C13706o.m87924a(this.f7680c, uIInteractionOption.f7680c) && this.f7681d == uIInteractionOption.f7681d;
        }

        public int hashCode() {
            return (((this.f7679a * 31) + this.f7680c.hashCode()) * 31) + this.f7681d;
        }

        public String toString() {
            return "UIInteractionOption(id=" + this.f7679a + ", name=" + this.f7680c + ", minSdk=" + this.f7681d + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87929f(parcel, "out");
            parcel.writeInt(this.f7679a);
            parcel.writeString(this.f7680c);
            parcel.writeInt(this.f7681d);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$a */
    /* compiled from: UIInteractionAction.kt */
    public static final class C2743a implements Parcelable.Creator<UIInteractionAction> {
        C2743a() {
        }

        /* renamed from: a */
        public UIInteractionAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new UIInteractionAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public UIInteractionAction[] newArray(int i) {
            return new UIInteractionAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$b */
    /* compiled from: UIInteractionAction.kt */
    public static final class C2744b {
        private C2744b() {
        }

        public /* synthetic */ C2744b(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final String[] m13618c() {
            String Z3 = SelectableItem.m15535j1(C17541R$string.ui_interaction_current_focus);
            C13706o.m87928e(Z3, "getString(R.string.ui_interaction_current_focus)");
            String Z32 = SelectableItem.m15535j1(C17541R$string.ui_interaction_by_text_context);
            C13706o.m87928e(Z32, "getString(R.string.ui_interaction_by_text_context)");
            String Z33 = SelectableItem.m15535j1(C17541R$string.ui_interaction_by_x_y_location);
            C13706o.m87928e(Z33, "getString(R.string.ui_interaction_by_x_y_location)");
            String Z34 = SelectableItem.m15535j1(C17541R$string.ui_interaction_select_in_app);
            C13706o.m87928e(Z34, "getString(R.string.ui_interaction_select_in_app)");
            String Z35 = SelectableItem.m15535j1(C17541R$string.ui_interaction_view_id);
            C13706o.m87928e(Z35, "getString(R.string.ui_interaction_view_id)");
            return new String[]{Z3, Z32, Z33, Z34, Z35};
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final UIInteractionOption[] m13619d() {
            String Z3 = SelectableItem.m15535j1(C17541R$string.ui_interaction_click);
            C13706o.m87928e(Z3, "getString(R.string.ui_interaction_click)");
            String Z32 = SelectableItem.m15535j1(C17541R$string.ui_interaction_long_click);
            C13706o.m87928e(Z32, "getString(R.string.ui_interaction_long_click)");
            String Z33 = SelectableItem.m15535j1(C17541R$string.ui_interaction_copy);
            C13706o.m87928e(Z33, "getString(R.string.ui_interaction_copy)");
            String Z34 = SelectableItem.m15535j1(C17541R$string.ui_interaction_cut);
            C13706o.m87928e(Z34, "getString(R.string.ui_interaction_cut)");
            String Z35 = SelectableItem.m15535j1(C17541R$string.ui_interaction_paste);
            C13706o.m87928e(Z35, "getString(R.string.ui_interaction_paste)");
            String Z36 = SelectableItem.m15535j1(C17541R$string.ui_interaction_clear_selection);
            C13706o.m87928e(Z36, "getString(R.string.ui_interaction_clear_selection)");
            String Z37 = SelectableItem.m15535j1(C17541R$string.ui_interaction_perform_gesture);
            C13706o.m87928e(Z37, "getString(R.string.ui_interaction_perform_gesture)");
            String Z38 = SelectableItem.m15535j1(C17541R$string.ui_interaction_perform_gesture_sequence);
            C13706o.m87928e(Z38, "getString(R.string.ui_in…perform_gesture_sequence)");
            return new UIInteractionOption[]{new UIInteractionOption(0, Z3, 0), new UIInteractionOption(1, Z32, 0), new UIInteractionOption(2, Z33, 0), new UIInteractionOption(3, Z34, 0), new UIInteractionOption(4, Z35, 0), new UIInteractionOption(5, Z36, 0), new UIInteractionOption(6, Z37, 24), new UIInteractionOption(7, Z38, 24)};
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$c */
    /* compiled from: UIInteractionAction.kt */
    static final class C2745c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $magicTextListener;
        int label;
        final /* synthetic */ UIInteractionAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2745c(UIInteractionAction uIInteractionAction, C4023j0.C4028e eVar, C13635d<? super C2745c> dVar) {
            super(3, dVar);
            this.this$0 = uIInteractionAction;
            this.$magicTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2745c(this.this$0, this.$magicTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15697C(this.this$0.mo27850j0(), this.this$0.mo27837X0(), this.$magicTextListener, C17542R$style.Theme_App_Dialog_Action_SmallText);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$d */
    /* compiled from: UIInteractionAction.kt */
    static final class C2746d extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $magicTextListener;
        int label;
        final /* synthetic */ UIInteractionAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2746d(UIInteractionAction uIInteractionAction, C4023j0.C4028e eVar, C13635d<? super C2746d> dVar) {
            super(3, dVar);
            this.this$0 = uIInteractionAction;
            this.$magicTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2746d(this.this$0, this.$magicTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15697C(this.this$0.mo27850j0(), this.this$0.mo27837X0(), this.$magicTextListener, C17542R$style.Theme_App_Dialog_Action_SmallText);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$e */
    /* compiled from: UIInteractionAction.kt */
    static final class C2747e extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ UIInteractionAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2747e(UIInteractionAction uIInteractionAction, C13635d<? super C2747e> dVar) {
            super(2, dVar);
            this.this$0 = uIInteractionAction;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2747e(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2747e) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                this.label = 1;
                if (C15552u0.m94699a(2000, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (this.this$0.mo27850j0() != null) {
                Intent intent = new Intent(this.this$0.mo27850j0(), this.this$0.mo27850j0().getClass());
                intent.setFlags(603979776);
                this.this$0.mo27850j0().startActivity(intent);
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$f */
    /* compiled from: UIInteractionAction.kt */
    static final class C2748f extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ TriggerContextInfo $contextInfo;
        final /* synthetic */ boolean $forceEvenIfNotEnabled;
        final /* synthetic */ int $nextAction;
        final /* synthetic */ ResumeMacroInfo $resumeMacroInfo;
        final /* synthetic */ Stack<Integer> $skipEndifIndexStack;
        final /* synthetic */ long $waitDuration;
        int label;
        final /* synthetic */ UIInteractionAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2748f(long j, UIInteractionAction uIInteractionAction, int i, TriggerContextInfo triggerContextInfo, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, C13635d<? super C2748f> dVar) {
            super(2, dVar);
            this.$waitDuration = j;
            this.this$0 = uIInteractionAction;
            this.$nextAction = i;
            this.$contextInfo = triggerContextInfo;
            this.$forceEvenIfNotEnabled = z;
            this.$skipEndifIndexStack = stack;
            this.$resumeMacroInfo = resumeMacroInfo;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2748f(this.$waitDuration, this.this$0, this.$nextAction, this.$contextInfo, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2748f) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                long j = this.$waitDuration;
                if (j > 0) {
                    this.label = 1;
                    if (C15552u0.m94699a(j + ((long) 100), this) == c) {
                        return c;
                    }
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.this$0.mo27837X0().invokeActions(this.this$0.mo27837X0().getActions(), this.$nextAction, this.$contextInfo, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$g */
    /* compiled from: UIInteractionAction.kt */
    public static final class C2749g implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7682a;

        /* renamed from: c */
        final /* synthetic */ EditText f7683c;

        C2749g(Button button, EditText editText) {
            this.f7682a = button;
            this.f7683c = editText;
        }

        public void afterTextChanged(Editable editable) {
            C13706o.m87929f(editable, "s");
            Button button = this.f7682a;
            if (button != null) {
                Editable text = this.f7683c.getText();
                C13706o.m87928e(text, "viewIdText.text");
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

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$h */
    /* compiled from: UIInteractionAction.kt */
    static final class C2750h extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ UIInteractionAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2750h(UIInteractionAction uIInteractionAction, C13635d<? super C2750h> dVar) {
            super(3, dVar);
            this.this$0 = uIInteractionAction;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2750h(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                int i = 0;
                if (C4031k.m15910j()) {
                    try {
                        i = Settings.System.getInt(this.this$0.mo27827K0().getContentResolver(), "pointer_location");
                    } catch (Exception unused2) {
                    }
                    String str = i == 0 ? "1" : "0";
                    Context K0 = this.this$0.mo27827K0();
                    C13706o.m87928e(K0, "context");
                    HelperSystemCommands.m24582e(K0, "system", "int", "pointer_location", str);
                } else {
                    Activity j0 = this.this$0.mo27850j0();
                    String Z3 = SelectableItem.m15535j1(C17541R$string.helper_apk_required);
                    C13696i0 i0Var = C13696i0.f61931a;
                    String Z32 = SelectableItem.m15535j1(C17541R$string.helper_app_required_setting);
                    C13706o.m87928e(Z32, "getString(R.string.helper_app_required_setting)");
                    String format = String.format(Z32, Arrays.copyOf(new Object[]{"https://macrodroidforum.com/index.php?threads/macrodroid-helper-apk.1/"}, 1));
                    C13706o.m87928e(format, "format(format, *args)");
                    C7439d0.m30905m0(j0, false, false, Z3, format);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$i */
    /* compiled from: UIInteractionAction.kt */
    static final class C2751i extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ UIInteractionAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2751i(UIInteractionAction uIInteractionAction, C13635d<? super C2751i> dVar) {
            super(3, dVar);
            this.this$0 = uIInteractionAction;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2751i(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                int i = 0;
                if (C4031k.m15910j()) {
                    try {
                        i = Settings.System.getInt(this.this$0.mo27827K0().getContentResolver(), "pointer_location");
                    } catch (Exception unused2) {
                    }
                    String str = i == 0 ? "1" : "0";
                    Context K0 = this.this$0.mo27827K0();
                    C13706o.m87928e(K0, "context");
                    HelperSystemCommands.m24582e(K0, "system", "int", "pointer_location", str);
                } else {
                    Activity j0 = this.this$0.mo27850j0();
                    String Z3 = SelectableItem.m15535j1(C17541R$string.helper_apk_required);
                    C13696i0 i0Var = C13696i0.f61931a;
                    String Z32 = SelectableItem.m15535j1(C17541R$string.helper_app_required_setting);
                    C13706o.m87928e(Z32, "getString(R.string.helper_app_required_setting)");
                    String format = String.format(Z32, Arrays.copyOf(new Object[]{"https://macrodroidforum.com/index.php?threads/macrodroid-helper-apk.1/"}, 1));
                    C13706o.m87928e(format, "format(format, *args)");
                    C7439d0.m30905m0(j0, false, false, Z3, format);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$j */
    /* compiled from: UIInteractionAction.kt */
    static final class C2752j extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $magicTextListener;
        int label;
        final /* synthetic */ UIInteractionAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2752j(UIInteractionAction uIInteractionAction, C4023j0.C4028e eVar, C13635d<? super C2752j> dVar) {
            super(3, dVar);
            this.this$0 = uIInteractionAction;
            this.$magicTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2752j(this.this$0, this.$magicTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15697C(this.this$0.mo27850j0(), this.this$0.mo27837X0(), this.$magicTextListener, C17542R$style.Theme_App_Dialog_Action_SmallText);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$k */
    /* compiled from: UIInteractionAction.kt */
    static final class C2753k extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $magicTextListener;
        int label;
        final /* synthetic */ UIInteractionAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2753k(UIInteractionAction uIInteractionAction, C4023j0.C4028e eVar, C13635d<? super C2753k> dVar) {
            super(3, dVar);
            this.this$0 = uIInteractionAction;
            this.$magicTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2753k(this.this$0, this.$magicTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15697C(this.this$0.mo27850j0(), this.this$0.mo27837X0(), this.$magicTextListener, C17542R$style.Theme_App_Dialog_Action_SmallText);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$l */
    /* compiled from: UIInteractionAction.kt */
    static final class C2754l extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ LinearLayout $entriesLayout;
        final /* synthetic */ Button $removeEntryButton;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2754l(LinearLayout linearLayout, Button button, C13635d<? super C2754l> dVar) {
            super(3, dVar);
            this.$entriesLayout = linearLayout;
            this.$removeEntryButton = button;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2754l(this.$entriesLayout, this.$removeEntryButton, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                LinearLayout linearLayout = this.$entriesLayout;
                boolean z = true;
                linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
                Button button = this.$removeEntryButton;
                int i = 0;
                if (this.$entriesLayout.getChildCount() <= 0) {
                    z = false;
                }
                if (!z) {
                    i = 8;
                }
                button.setVisibility(i);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$m */
    /* compiled from: UIInteractionAction.kt */
    static final class C2755m extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ LinearLayout $entriesLayout;
        final /* synthetic */ Button $removeEntryButton;
        int label;
        final /* synthetic */ UIInteractionAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2755m(UIInteractionAction uIInteractionAction, AppCompatDialog appCompatDialog, LinearLayout linearLayout, Button button, C13635d<? super C2755m> dVar) {
            super(3, dVar);
            this.this$0 = uIInteractionAction;
            this.$dialog = appCompatDialog;
            this.$entriesLayout = linearLayout;
            this.$removeEntryButton = button;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2755m(this.this$0, this.$dialog, this.$entriesLayout, this.$removeEntryButton, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                UIInteractionAction uIInteractionAction = this.this$0;
                LayoutInflater layoutInflater = this.$dialog.getLayoutInflater();
                C13706o.m87928e(layoutInflater, "dialog.layoutInflater");
                uIInteractionAction.m13549c4(layoutInflater, this.$entriesLayout, (UiInteractionConfiguration.GestureEntry) null);
                Button button = this.$removeEntryButton;
                if (button != null) {
                    button.setVisibility(0);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$n */
    /* compiled from: UIInteractionAction.kt */
    static final class C2756n extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4023j0.C4028e $magicTextListener;
        int label;
        final /* synthetic */ UIInteractionAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2756n(UIInteractionAction uIInteractionAction, C4023j0.C4028e eVar, C13635d<? super C2756n> dVar) {
            super(3, dVar);
            this.this$0 = uIInteractionAction;
            this.$magicTextListener = eVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2756n(this.this$0, this.$magicTextListener, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C4023j0.m15697C(this.this$0.mo27850j0(), this.this$0.mo27837X0(), this.$magicTextListener, C17542R$style.Theme_App_Dialog_Action_SmallText);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$o */
    /* compiled from: UIInteractionAction.kt */
    static final class C2757o extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ EditText $durationText;
        final /* synthetic */ LinearLayout $entriesLayout;
        final /* synthetic */ int $maxDimension;
        final /* synthetic */ EditText $startX;
        final /* synthetic */ EditText $startY;
        final /* synthetic */ CheckBox $waitCheckBox;
        int label;
        final /* synthetic */ UIInteractionAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2757o(LinearLayout linearLayout, UIInteractionAction uIInteractionAction, EditText editText, EditText editText2, EditText editText3, int i, CheckBox checkBox, AppCompatDialog appCompatDialog, C13635d<? super C2757o> dVar) {
            super(3, dVar);
            this.$entriesLayout = linearLayout;
            this.this$0 = uIInteractionAction;
            this.$startX = editText;
            this.$startY = editText2;
            this.$durationText = editText3;
            this.$maxDimension = i;
            this.$waitCheckBox = checkBox;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2757o(this.$entriesLayout, this.this$0, this.$startX, this.$startY, this.$durationText, this.$maxDimension, this.$waitCheckBox, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            int i;
            int i2;
            String str2;
            int i3;
            String str3;
            int i4;
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                if (this.$entriesLayout.getChildCount() == 0) {
                    C15626c.makeText(this.this$0.mo27850j0(), C17541R$string.ui_interaction_please_add_at_least_one_swipe, 1).show();
                } else {
                    C13684d0 d0Var = new C13684d0();
                    C13684d0 d0Var2 = new C13684d0();
                    C13680b0 b0Var = new C13680b0();
                    C13680b0 b0Var2 = new C13680b0();
                    EditText editText = this.$startX;
                    if (editText != null) {
                        try {
                            b0Var.element = Integer.parseInt(editText.getText().toString());
                            d0Var.element = null;
                        } catch (Exception unused2) {
                            b0Var.element = 0;
                            d0Var.element = editText.getText().toString();
                        }
                    }
                    EditText editText2 = this.$startY;
                    if (editText2 != null) {
                        try {
                            b0Var2.element = Integer.parseInt(editText2.getText().toString());
                            d0Var2.element = null;
                        } catch (Exception unused3) {
                            b0Var2.element = 0;
                            d0Var2.element = editText2.getText().toString();
                        }
                    }
                    try {
                        i = Integer.parseInt(this.$durationText.getText().toString());
                        str = null;
                    } catch (Exception unused4) {
                        str = this.$durationText.getText().toString();
                        i = 0;
                    }
                    ArrayList arrayList = new ArrayList();
                    int childCount = this.$entriesLayout.getChildCount();
                    int i5 = 0;
                    while (i5 < childCount) {
                        View childAt = this.$entriesLayout.getChildAt(i5);
                        EditText editText3 = (EditText) childAt.findViewById(C17532R$id.xLocation);
                        EditText editText4 = (EditText) childAt.findViewById(C17532R$id.yLocation);
                        try {
                            i2 = this.this$0.m13572o4(Integer.parseInt(editText3.getText().toString()), 0, this.$maxDimension);
                            str2 = null;
                        } catch (Exception unused5) {
                            str2 = editText3.getText().toString();
                            i2 = 0;
                        }
                        try {
                            i3 = childCount;
                            try {
                                i4 = this.this$0.m13572o4(Integer.parseInt(editText4.getText().toString()), 0, this.$maxDimension);
                                str3 = null;
                            } catch (Exception unused6) {
                                str3 = editText4.getText().toString();
                                i4 = 0;
                                arrayList.add(new UiInteractionConfiguration.GestureEntry(i2, i4, str2, str3));
                                i5++;
                                childCount = i3;
                            }
                        } catch (Exception unused7) {
                            i3 = childCount;
                            str3 = editText4.getText().toString();
                            i4 = 0;
                            arrayList.add(new UiInteractionConfiguration.GestureEntry(i2, i4, str2, str3));
                            i5++;
                            childCount = i3;
                        }
                        arrayList.add(new UiInteractionConfiguration.GestureEntry(i2, i4, str2, str3));
                        i5++;
                        childCount = i3;
                    }
                    UIInteractionAction uIInteractionAction = this.this$0;
                    int a4 = this.this$0.m13572o4(b0Var.element, 0, this.$maxDimension);
                    int a42 = this.this$0.m13572o4(b0Var2.element, 0, this.$maxDimension);
                    int a43 = this.this$0.m13572o4(i, 0, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
                    String str4 = (String) d0Var.element;
                    String str5 = (String) d0Var2.element;
                    CheckBox checkBox = this.$waitCheckBox;
                    uIInteractionAction.uiInteractionConfiguration = new UiInteractionConfiguration.GestureSequence(a4, a42, a43, str4, str5, str, checkBox != null ? checkBox.isChecked() : true, arrayList);
                    this.$dialog.dismiss();
                    this.this$0.mo24689O1();
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$p */
    /* compiled from: UIInteractionAction.kt */
    static final class C2758p extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        final /* synthetic */ ViewGroup $enterTextLayout;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2758p(ViewGroup viewGroup, C13635d<? super C2758p> dVar) {
            super(4, dVar);
            this.$enterTextLayout = viewGroup;
        }

        /* renamed from: h */
        public final Object mo25924h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C2758p pVar = new C2758p(this.$enterTextLayout, dVar);
            pVar.Z$0 = z;
            return pVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo25924h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                boolean z = this.Z$0;
                ViewGroup viewGroup = this.$enterTextLayout;
                if (viewGroup != null) {
                    viewGroup.setVisibility(z ? 0 : 8);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$q */
    /* compiled from: UIInteractionAction.kt */
    public static final class C2759q implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7684a;

        /* renamed from: c */
        final /* synthetic */ EditText f7685c;

        C2759q(Button button, EditText editText) {
            this.f7684a = button;
            this.f7685c = editText;
        }

        public void afterTextChanged(Editable editable) {
            C13706o.m87929f(editable, "s");
            Button button = this.f7684a;
            if (button != null) {
                Editable text = this.f7685c.getText();
                C13706o.m87928e(text, "textField.text");
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

    /* renamed from: com.arlosoft.macrodroid.action.UIInteractionAction$r */
    /* compiled from: UIInteractionAction.kt */
    static final class C2760r extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        int label;
        final /* synthetic */ UIInteractionAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2760r(UIInteractionAction uIInteractionAction, Activity activity, C13635d<? super C2760r> dVar) {
            super(3, dVar);
            this.this$0 = uIInteractionAction;
            this.$activity = activity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2760r(this.this$0, this.$activity, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            int i;
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                try {
                    i = Settings.System.getInt(this.this$0.mo27827K0().getContentResolver(), "pointer_location");
                } catch (Exception unused2) {
                    i = 0;
                }
                String str = i == 0 ? "1" : "0";
                if (C8164a.m33886a()) {
                    C4061t1.m15947B0(new String[]{"settings put system pointer_location " + str});
                } else if (C4031k.m15910j()) {
                    Context K0 = this.this$0.mo27827K0();
                    C13706o.m87928e(K0, "context");
                    HelperSystemCommands.m24582e(K0, "system", "int", "pointer_location", str);
                } else {
                    Activity activity = this.$activity;
                    String Z3 = SelectableItem.m15535j1(C17541R$string.helper_apk_required);
                    C13696i0 i0Var = C13696i0.f61931a;
                    String Z32 = SelectableItem.m15535j1(C17541R$string.helper_app_required_setting);
                    C13706o.m87928e(Z32, "getString(R.string.helper_app_required_setting)");
                    String format = String.format(Z32, Arrays.copyOf(new Object[]{"https://macrodroidforum.com/index.php?threads/macrodroid-helper-apk.1/"}, 1));
                    C13706o.m87928e(format, "format(format, *args)");
                    C7439d0.m30905m0(activity, false, false, Z3, format);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public UIInteractionAction() {
    }

    public /* synthetic */ UIInteractionAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A4 */
    public static final void m13494A4(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$editText");
        editText.setText(fVar.f10575a);
        C4666m.m18154v(editText);
    }

    /* access modifiers changed from: private */
    /* renamed from: B4 */
    public static final void m13496B4(UIInteractionAction uIInteractionAction, C4023j0.C4028e eVar, View view) {
        C13706o.m87929f(uIInteractionAction, "this$0");
        C13706o.m87929f(eVar, "$magicTextListener");
        C4023j0.m15697C(uIInteractionAction.mo27850j0(), uIInteractionAction.mo27837X0(), eVar, C17542R$style.Theme_App_Dialog_Action_SmallText);
    }

    /* access modifiers changed from: private */
    /* renamed from: C4 */
    public static final void m13498C4(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$editText");
        editText.setText(fVar.f10575a);
        C4666m.m18154v(editText);
    }

    /* access modifiers changed from: private */
    /* renamed from: D4 */
    public static final void m13500D4(UIInteractionAction uIInteractionAction, C4023j0.C4028e eVar, View view) {
        C13706o.m87929f(uIInteractionAction, "this$0");
        C13706o.m87929f(eVar, "$magicTextListener");
        C4023j0.m15697C(uIInteractionAction.mo27850j0(), uIInteractionAction.mo27837X0(), eVar, C17542R$style.Theme_App_Dialog_Action_SmallText);
    }

    /* access modifiers changed from: private */
    /* renamed from: E4 */
    public static final void m13502E4(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$editText");
        editText.setText(fVar.f10575a);
        C4666m.m18154v(editText);
    }

    /* access modifiers changed from: private */
    /* renamed from: F4 */
    public static final void m13504F4(UIInteractionAction uIInteractionAction, C4023j0.C4028e eVar, View view) {
        C13706o.m87929f(uIInteractionAction, "this$0");
        C13706o.m87929f(eVar, "$magicTextListener");
        C4023j0.m15697C(uIInteractionAction.mo27850j0(), uIInteractionAction.mo27837X0(), eVar, C17542R$style.Theme_App_Dialog_Action_SmallText);
    }

    /* access modifiers changed from: private */
    /* renamed from: G4 */
    public static final void m13506G4(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$editText");
        editText.setText(fVar.f10575a);
        C4666m.m18154v(editText);
    }

    /* access modifiers changed from: private */
    /* renamed from: H4 */
    public static final void m13508H4(UIInteractionAction uIInteractionAction, C4023j0.C4028e eVar, View view) {
        C13706o.m87929f(uIInteractionAction, "this$0");
        C13706o.m87929f(eVar, "$magicTextListener");
        C4023j0.m15697C(uIInteractionAction.mo27850j0(), uIInteractionAction.mo27837X0(), eVar, C17542R$style.Theme_App_Dialog_Action_SmallText);
    }

    /* access modifiers changed from: private */
    /* renamed from: I4 */
    public static final void m13510I4(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, UIInteractionAction uIInteractionAction, int i, CheckBox checkBox, AppCompatDialog appCompatDialog, View view) {
        String str;
        int i2;
        String str2;
        int i3;
        String str3;
        int i4;
        String str4;
        int i5;
        String str5;
        int i6;
        String str6;
        String str7;
        String str8;
        String str9;
        UIInteractionAction uIInteractionAction2 = uIInteractionAction;
        int i7 = i;
        C13706o.m87929f(uIInteractionAction2, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        String str10 = null;
        if (editText != null) {
            try {
                i2 = Integer.parseInt(editText.getText().toString());
                str9 = null;
            } catch (Exception unused) {
                str9 = editText.getText().toString();
                i2 = 0;
            }
            str = str9;
        } else {
            str = null;
            i2 = 0;
        }
        if (editText2 != null) {
            try {
                i3 = Integer.parseInt(editText2.getText().toString());
                str8 = null;
            } catch (Exception unused2) {
                str8 = editText2.getText().toString();
                i3 = 0;
            }
            str2 = str8;
        } else {
            str2 = null;
            i3 = 0;
        }
        if (editText3 != null) {
            try {
                i4 = Integer.parseInt(editText3.getText().toString());
                str7 = null;
            } catch (Exception unused3) {
                str7 = editText3.getText().toString();
                i4 = 0;
            }
            str3 = str7;
        } else {
            str3 = null;
            i4 = 0;
        }
        if (editText4 != null) {
            try {
                i5 = Integer.parseInt(editText4.getText().toString());
                str6 = null;
            } catch (Exception unused4) {
                str6 = editText4.getText().toString();
                i5 = 0;
            }
            str4 = str6;
        } else {
            str4 = null;
            i5 = 0;
        }
        if (editText5 != null) {
            try {
                i6 = Integer.parseInt(editText5.getText().toString());
            } catch (Exception unused5) {
                str10 = editText5.getText().toString();
                i6 = 0;
            }
            str5 = str10;
        } else {
            str5 = null;
            i6 = 0;
        }
        uIInteractionAction2.uiInteractionConfiguration = new UiInteractionConfiguration.Gesture(uIInteractionAction2.m13572o4(i2, 0, i7), uIInteractionAction2.m13572o4(i3, 0, i7), uIInteractionAction2.m13572o4(i4, 0, i7), uIInteractionAction2.m13572o4(i5, 0, i7), uIInteractionAction2.m13572o4(i6, 0, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH), str, str2, str3, str4, str5, checkBox != null ? checkBox.isChecked() : true);
        appCompatDialog.dismiss();
        uIInteractionAction.mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: J4 */
    public static final void m13512J4(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: K4 */
    private final void m13514K4() {
        UiInteractionConfiguration.GestureSequence gestureSequence;
        C15264f fVar;
        int i;
        EditText editText;
        CheckBox checkBox;
        EditText editText2;
        int i2;
        Button button;
        EditText editText3;
        LinearLayout linearLayout;
        String str;
        List<UiInteractionConfiguration.GestureEntry> gestures;
        String num;
        String str2;
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_ui_interaction_gesture_sequence_config);
        appCompatDialog.setTitle((int) C17541R$string.ui_interaction_perform_gesture_sequence);
        C4656c.m18115d(appCompatDialog, 0, 1, (Object) null);
        UiInteractionConfiguration uiInteractionConfiguration2 = this.uiInteractionConfiguration;
        if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.GestureSequence) {
            C13706o.m87927d(uiInteractionConfiguration2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.GestureSequence");
            gestureSequence = (UiInteractionConfiguration.GestureSequence) uiInteractionConfiguration2;
        } else {
            gestureSequence = null;
        }
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.topLevelContainer);
        View findViewById = appCompatDialog.findViewById(C17532R$id.showTouchOverlayButton);
        C13706o.m87926c(findViewById);
        Button button2 = (Button) findViewById;
        EditText editText4 = (EditText) appCompatDialog.findViewById(C17532R$id.start_x_location);
        EditText editText5 = (EditText) appCompatDialog.findViewById(C17532R$id.start_y_location);
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.duration);
        C13706o.m87926c(findViewById2);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.resolution_label);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.waitCheckbox);
        TextView textView2 = (TextView) appCompatDialog.findViewById(C17532R$id.msLabel);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.startXMagicTextButton);
        Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.startYMagicTextButton);
        Button button5 = (Button) appCompatDialog.findViewById(C17532R$id.msMagicTextButton);
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.entriesLayout);
        C13706o.m87926c(findViewById3);
        LinearLayout linearLayout2 = (LinearLayout) findViewById3;
        EditText editText6 = (EditText) findViewById2;
        Button button6 = (Button) appCompatDialog.findViewById(C17532R$id.addEntryButton);
        Button button7 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        Button button8 = (Button) appCompatDialog.findViewById(C17532R$id.removeEntryButton);
        C13706o.m87926c(viewGroup);
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        Button button9 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        C13706o.m87928e(layoutTransition, "topLevelContainer!!.getLayoutTransition()");
        layoutTransition.enableTransitionType(4);
        if (textView2 != null) {
            String j1 = SelectableItem.m15535j1(C17541R$string.milliseconds_capital);
            C13706o.m87928e(j1, "getString(R.string.milliseconds_capital)");
            String lowerCase = j1.toLowerCase();
            C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase()");
            textView2.setText(lowerCase);
        }
        if (checkBox2 != null) {
            checkBox2.setChecked(gestureSequence != null ? gestureSequence.getWaitBeforeNext() : true);
        }
        C4666m.m18147o(button2, (C13640g) null, new C2751i(this, (C13635d<? super C2751i>) null), 1, (Object) null);
        String str3 = "0";
        if ((gestureSequence != null ? gestureSequence.getXStartVarName() : null) != null) {
            if (editText4 != null) {
                editText4.setText(gestureSequence.getXStartVarName());
            }
        } else if (editText4 != null) {
            if (gestureSequence == null || (str2 = Integer.valueOf(gestureSequence.getStartX()).toString()) == null) {
                str2 = str3;
            }
            editText4.setText(str2);
        }
        if ((gestureSequence != null ? gestureSequence.getYStartVarName() : null) != null) {
            if (editText5 != null) {
                editText5.setText(gestureSequence.getYStartVarName());
            }
        } else if (editText5 != null) {
            if (!(gestureSequence == null || (num = Integer.valueOf(gestureSequence.getStartY()).toString()) == null)) {
                str3 = num;
            }
            editText5.setText(str3);
        }
        Point point = new Point();
        mo27850j0().getWindowManager().getDefaultDisplay().getRealSize(point);
        if (textView != null) {
            textView.setText(SelectableItem.m15535j1(C17541R$string.screen_resolution) + ": " + point.x + ", " + point.y);
        }
        int max = Math.max(point.x, point.y);
        C13706o.m87926c(editText4);
        C3322op opVar = new C3322op(editText4);
        if (button3 != null) {
            fVar = null;
            C2752j jVar = new C2752j(this, opVar, (C13635d<? super C2752j>) null);
            i = 1;
            C4666m.m18147o(button3, (C13640g) null, jVar, 1, (Object) null);
        } else {
            i = 1;
            fVar = null;
        }
        if (editText5 != null) {
            C3635yo yoVar = new C3635yo(editText5);
            if (button4 != null) {
                C4666m.m18147o(button4, fVar, new C2753k(this, yoVar, fVar), i, fVar);
            }
        }
        if (button8 != null) {
            C4666m.m18147o(button8, fVar, new C2754l(linearLayout2, button8, fVar), i, fVar);
        }
        if (button6 != null) {
            checkBox = checkBox2;
            button = button5;
            i2 = max;
            linearLayout = linearLayout2;
            editText = editText5;
            editText3 = editText6;
            editText2 = editText4;
            C4666m.m18147o(button6, (C13640g) null, new C2755m(this, appCompatDialog, linearLayout2, button8, (C13635d<? super C2755m>) null), 1, (Object) null);
        } else {
            checkBox = checkBox2;
            editText = editText5;
            button = button5;
            editText3 = editText6;
            i2 = max;
            editText2 = editText4;
            linearLayout = linearLayout2;
        }
        if (!(gestureSequence == null || (gestures = gestureSequence.getGestures()) == null)) {
            for (UiInteractionConfiguration.GestureEntry c4 : gestures) {
                LayoutInflater layoutInflater = appCompatDialog.getLayoutInflater();
                C13706o.m87928e(layoutInflater, "dialog.layoutInflater");
                m13549c4(layoutInflater, linearLayout, c4);
            }
        }
        if ((gestureSequence != null ? gestureSequence.getDurationVarName() : null) != null) {
            editText3.setText(gestureSequence.getDurationVarName());
        } else {
            if (gestureSequence == null || (str = Integer.valueOf(gestureSequence.getDurationMs()).toString()) == null) {
                str = "250";
            }
            editText3.setText(str);
        }
        C3238lp lpVar = new C3238lp(editText3);
        if (button != null) {
            C4666m.m18147o(button, (C13640g) null, new C2756n(this, lpVar, (C13635d<? super C2756n>) null), 1, (Object) null);
        }
        if (button8 != null) {
            button8.setVisibility(linearLayout.getChildCount() > 0 ? 0 : 8);
        }
        if (button9 != null) {
            C4666m.m18147o(button9, (C13640g) null, new C2757o(linearLayout, this, editText2, editText, editText3, i2, checkBox, appCompatDialog, (C13635d<? super C2757o>) null), 1, (Object) null);
        }
        if (button7 != null) {
            button7.setOnClickListener(new C3153io(appCompatDialog));
        }
        appCompatDialog.show();
        Window window = appCompatDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L4 */
    public static final void m13516L4(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$editText");
        editText.setText(fVar.f10575a);
        C4666m.m18154v(editText);
    }

    /* access modifiers changed from: private */
    /* renamed from: M4 */
    public static final void m13518M4(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$editText");
        editText.setText(fVar.f10575a);
        C4666m.m18154v(editText);
    }

    /* access modifiers changed from: private */
    /* renamed from: N4 */
    public static final void m13520N4(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$editText");
        editText.setText(fVar.f10575a);
        C4666m.m18154v(editText);
    }

    /* access modifiers changed from: private */
    /* renamed from: O4 */
    public static final void m13522O4(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: P4 */
    private final void m13524P4() {
        UiInteractionConfiguration.Paste paste;
        boolean z;
        String str;
        if (mo27836X()) {
            UiInteractionConfiguration uiInteractionConfiguration2 = this.uiInteractionConfiguration;
            if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.Paste) {
                C13706o.m87927d(uiInteractionConfiguration2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Paste");
                paste = (UiInteractionConfiguration.Paste) uiInteractionConfiguration2;
            } else {
                paste = null;
            }
            UiInteractionConfiguration uiInteractionConfiguration3 = this.uiInteractionConfiguration;
            if (uiInteractionConfiguration3 instanceof UiInteractionConfiguration.Paste) {
                C13706o.m87927d(uiInteractionConfiguration3, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Paste");
                z = ((UiInteractionConfiguration.Paste) uiInteractionConfiguration3).getForceClear();
            } else {
                z = false;
            }
            boolean useClipboard = paste != null ? paste.getUseClipboard() : true;
            Activity j0 = mo27850j0();
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_ui_interaction_paste_options);
            appCompatDialog.setTitle((int) C17541R$string.ui_interaction_paste);
            C4656c.m18115d(appCompatDialog, 0, 1, (Object) null);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.textToMatch);
            Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.magicTextButton);
            RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.useClipboardRadioButton);
            RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.enterTextRadioButton);
            ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.enterTextLayout);
            CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.clearExistingCheckbox);
            if (radioButton != null) {
                radioButton.setChecked(useClipboard);
            }
            if (radioButton2 != null) {
                radioButton2.setChecked(!useClipboard);
            }
            if (checkBox != null) {
                checkBox.setChecked(z);
            }
            if (viewGroup != null) {
                viewGroup.setVisibility(useClipboard ^ true ? 0 : 8);
            }
            if (radioButton2 != null) {
                C16061a.m96671b(radioButton2, (C13640g) null, new C2758p(viewGroup, (C13635d<? super C2758p>) null), 1, (Object) null);
            }
            if (editText != null) {
                if (paste == null || (str = paste.getText()) == null) {
                    str = "";
                }
                editText.setText(str);
            }
            if (editText != null) {
                C4666m.m18154v(editText);
            }
            if (editText != null) {
                C3070fp fpVar = new C3070fp(editText);
                if (button3 != null) {
                    button3.setOnClickListener(new C3409rp(j0, fpVar, this));
                }
            }
            if (button != null) {
                button.setOnClickListener(new C3321oo(this, radioButton, checkBox, editText, appCompatDialog));
            }
            if (button2 != null) {
                button2.setOnClickListener(new C3209ko(appCompatDialog));
            }
            appCompatDialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q4 */
    public static final void m13526Q4(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$it");
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: R4 */
    public static final void m13528R4(Activity activity, C4023j0.C4028e eVar, UIInteractionAction uIInteractionAction, View view) {
        C13706o.m87929f(eVar, "$magicTextListener");
        C13706o.m87929f(uIInteractionAction, "this$0");
        C4023j0.m15698D(activity, eVar, uIInteractionAction.mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, uIInteractionAction.mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: S4 */
    public static final void m13530S4(UIInteractionAction uIInteractionAction, RadioButton radioButton, CheckBox checkBox, EditText editText, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(uIInteractionAction, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        uIInteractionAction.uiInteractionConfiguration = new UiInteractionConfiguration.Paste(radioButton != null ? radioButton.isChecked() : true, checkBox != null ? checkBox.isChecked() : false, String.valueOf(editText != null ? editText.getText() : null));
        appCompatDialog.dismiss();
        uIInteractionAction.mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: T4 */
    public static final void m13532T4(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: U4 */
    private final void m13534U4(@StringRes int i, @StringRes int i2) {
        UiInteractionConfiguration.Click click;
        String str;
        if (mo27836X()) {
            UiInteractionConfiguration uiInteractionConfiguration2 = this.uiInteractionConfiguration;
            String str2 = null;
            if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.Click) {
                C13706o.m87927d(uiInteractionConfiguration2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Click");
                click = (UiInteractionConfiguration.Click) uiInteractionConfiguration2;
            } else {
                click = null;
            }
            Activity j0 = mo27850j0();
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_text_to_match);
            appCompatDialog.setTitle(i);
            boolean z = false;
            C4656c.m18115d(appCompatDialog, 0, 1, (Object) null);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.textToMatch);
            Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.magicTextButton);
            View findViewById = appCompatDialog.findViewById(C17532R$id.containsRadioButton);
            C13706o.m87926c(findViewById);
            RadioButton radioButton = (RadioButton) findViewById;
            View findViewById2 = appCompatDialog.findViewById(C17532R$id.matchesRadioButton);
            C13706o.m87926c(findViewById2);
            RadioButton radioButton2 = (RadioButton) findViewById2;
            if (editText != null) {
                editText.setHint(i);
            }
            if (editText != null) {
                if (click == null || (str = click.getTextContent()) == null) {
                    str = "";
                }
                editText.setText(str);
            }
            if (editText != null) {
                C4666m.m18154v(editText);
            }
            if (click != null) {
                radioButton.setChecked(click.getTextMatchOption() == 0);
                radioButton2.setChecked(click.getTextMatchOption() == 1);
            }
            if (editText != null) {
                editText.addTextChangedListener(new C2759q(button, editText));
            }
            if (editText != null) {
                C3013dp dpVar = new C3013dp(editText);
                if (button3 != null) {
                    button3.setOnClickListener(new C3380qp(j0, dpVar, this));
                }
            }
            if (button != null) {
                button.setOnClickListener(new C3265mo(this, editText, radioButton, appCompatDialog));
            }
            if (button != null) {
                if (click != null) {
                    str2 = click.getTextContent();
                }
                if (str2 == null || str2.length() == 0) {
                    z = true;
                }
                button.setEnabled(!z);
            }
            if (button2 != null) {
                button2.setOnClickListener(new C3237lo(appCompatDialog));
            }
            appCompatDialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V4 */
    public static final void m13536V4(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: W4 */
    public static final void m13538W4(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$it");
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: X4 */
    public static final void m13540X4(Activity activity, C4023j0.C4028e eVar, UIInteractionAction uIInteractionAction, View view) {
        C13706o.m87929f(eVar, "$magicTextListener");
        C13706o.m87929f(uIInteractionAction, "this$0");
        C4023j0.m15698D(activity, eVar, uIInteractionAction.mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, uIInteractionAction.mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: Y4 */
    public static final void m13542Y4(UIInteractionAction uIInteractionAction, EditText editText, RadioButton radioButton, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(uIInteractionAction, "this$0");
        C13706o.m87929f(radioButton, "$containsRadioButton");
        C13706o.m87929f(appCompatDialog, "$dialog");
        uIInteractionAction.uiInteractionConfiguration = new UiInteractionConfiguration.Click(uIInteractionAction.transientClickOption, uIInteractionAction.transientLongClick, new Point(), (String) null, (String) null, String.valueOf(editText != null ? editText.getText() : null), radioButton.isChecked() ^ true ? 1 : 0, (String) null, (String) null);
        appCompatDialog.dismiss();
        uIInteractionAction.mo24689O1();
    }

    /* renamed from: Z4 */
    private final void m13544Z4() {
        UiInteractionConfiguration.Click click;
        Point xyPoint;
        Point xyPoint2;
        Activity j0 = mo27850j0();
        UiInteractionConfiguration uiInteractionConfiguration2 = this.uiInteractionConfiguration;
        String str = null;
        if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.Click) {
            C13706o.m87927d(uiInteractionConfiguration2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Click");
            click = (UiInteractionConfiguration.Click) uiInteractionConfiguration2;
        } else {
            click = null;
        }
        int i = 0;
        try {
            this.wasPointerOverlayEnabledBefore = Settings.System.getInt(mo27827K0().getContentResolver(), "pointer_location") != 0;
        } catch (Settings.SettingNotFoundException unused) {
            this.wasPointerOverlayEnabledBefore = false;
        }
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_ui_interaction_touch_screen_config);
        appCompatDialog.setTitle((int) C17541R$string.ui_interaction_by_x_y_location);
        C4656c.m18115d(appCompatDialog, 0, 1, (Object) null);
        View findViewById = appCompatDialog.findViewById(C17532R$id.showTouchOverlayButton);
        C13706o.m87926c(findViewById);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.touch_screen_config_x_location);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.touch_screen_config_y_location);
        TextView textView = (TextView) appCompatDialog.findViewById(C17532R$id.touch_screen_resolution_label);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.x_magic_text_button);
        Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.y_magic_text_button);
        C4666m.m18147o((Button) findViewById, (C13640g) null, new C2760r(this, j0, (C13635d<? super C2760r>) null), 1, (Object) null);
        if ((click != null ? click.getXVarName() : null) != null) {
            if (editText != null) {
                editText.setText(click.getXVarName());
            }
        } else if (editText != null) {
            editText.setText(String.valueOf((click == null || (xyPoint2 = click.getXyPoint()) == null) ? 0 : xyPoint2.x));
        }
        if (editText != null) {
            C4666m.m18154v(editText);
        }
        if (click != null) {
            str = click.getYVarName();
        }
        if (str != null) {
            if (editText2 != null) {
                editText2.setText(click.getYVarName());
            }
        } else if (editText2 != null) {
            if (!(click == null || (xyPoint = click.getXyPoint()) == null)) {
                i = xyPoint.y;
            }
            editText2.setText(String.valueOf(i));
        }
        if (editText2 != null) {
            C4666m.m18154v(editText2);
        }
        Point point = new Point();
        j0.getWindowManager().getDefaultDisplay().getRealSize(point);
        if (textView != null) {
            textView.setText(SelectableItem.m15535j1(C17541R$string.screen_resolution) + ": " + point.x + ", " + point.y);
        }
        int max = Math.max(point.x, point.y);
        C13706o.m87926c(editText);
        m13557g4(editText);
        C13706o.m87926c(editText2);
        m13557g4(editText2);
        if (button != null) {
            button.setOnClickListener(new C3527up(editText, editText2, this, max, appCompatDialog));
        }
        C3098gp gpVar = new C3098gp(editText);
        if (button3 != null) {
            button3.setOnClickListener(new C3294np(j0, this, gpVar));
        }
        C3662zo zoVar = new C3662zo(editText2);
        if (button4 != null) {
            button4.setOnClickListener(new C3352pp(j0, this, zoVar));
        }
        if (button2 != null) {
            button2.setOnClickListener(new C3351po(this, appCompatDialog));
        }
        appCompatDialog.show();
        appCompatDialog.setOnCancelListener(new C3097go(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a5 */
    public static final void m13546a5(EditText editText, EditText editText2, UIInteractionAction uIInteractionAction, int i, AppCompatDialog appCompatDialog, View view) {
        String str;
        int i2;
        String str2;
        int i3;
        UIInteractionAction uIInteractionAction2 = uIInteractionAction;
        int i4 = i;
        C13706o.m87929f(uIInteractionAction2, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        Editable text = editText.getText();
        boolean z = true;
        String str3 = null;
        if (!(text == null || text.length() == 0)) {
            try {
                i2 = Integer.parseInt(editText.getText().toString());
                str = null;
            } catch (Exception unused) {
                str = editText.getText().toString();
            }
        } else {
            str = null;
            i2 = 0;
        }
        Editable text2 = editText2.getText();
        if (!(text2 == null || text2.length() == 0)) {
            z = false;
        }
        if (!z) {
            try {
                i3 = Integer.parseInt(editText2.getText().toString());
                str2 = null;
            } catch (Exception unused2) {
                str3 = editText2.getText().toString();
            }
            uIInteractionAction2.uiInteractionConfiguration = new UiInteractionConfiguration.Click(uIInteractionAction2.transientClickOption, uIInteractionAction2.transientLongClick, new Point(uIInteractionAction2.m13572o4(i2, 0, i4), uIInteractionAction2.m13572o4(i3, 0, i4)), str, str2, (String) null, 0, "", (String) null);
            uIInteractionAction.mo24689O1();
            appCompatDialog.dismiss();
        }
        str2 = str3;
        i3 = 0;
        uIInteractionAction2.uiInteractionConfiguration = new UiInteractionConfiguration.Click(uIInteractionAction2.transientClickOption, uIInteractionAction2.transientLongClick, new Point(uIInteractionAction2.m13572o4(i2, 0, i4), uIInteractionAction2.m13572o4(i3, 0, i4)), str, str2, (String) null, 0, "", (String) null);
        uIInteractionAction.mo24689O1();
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: b5 */
    public static final void m13548b5(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$it");
        editText.setText(fVar.f10575a);
        editText.setSelection(fVar.f10575a.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public final void m13549c4(LayoutInflater layoutInflater, LinearLayout linearLayout, UiInteractionConfiguration.GestureEntry gestureEntry) {
        String num;
        String str;
        View inflate = layoutInflater.inflate(C17535R$layout.list_item_gesture_sequence_element, linearLayout, false);
        linearLayout.addView(inflate);
        EditText editText = (EditText) inflate.findViewById(C17532R$id.xLocation);
        EditText editText2 = (EditText) inflate.findViewById(C17532R$id.yLocation);
        Button button = (Button) inflate.findViewById(C17532R$id.xMagicTextButton);
        Button button2 = (Button) inflate.findViewById(C17532R$id.yMagicTextButton);
        String str2 = "0";
        if ((gestureEntry != null ? gestureEntry.getXEndVarName() : null) != null) {
            if (editText != null) {
                editText.setText(gestureEntry.getXEndVarName());
            }
        } else if (editText != null) {
            if (gestureEntry == null || (str = Integer.valueOf(gestureEntry.getEndX()).toString()) == null) {
                str = str2;
            }
            editText.setText(str);
        }
        if ((gestureEntry != null ? gestureEntry.getYEndVarName() : null) != null) {
            if (editText2 != null) {
                editText2.setText(gestureEntry.getYEndVarName());
            }
        } else if (editText2 != null) {
            if (!(gestureEntry == null || (num = Integer.valueOf(gestureEntry.getEndY()).toString()) == null)) {
                str2 = num;
            }
            editText2.setText(str2);
        }
        if (editText != null) {
            C3182jp jpVar = new C3182jp(editText);
            if (button != null) {
                C4666m.m18147o(button, (C13640g) null, new C2745c(this, jpVar, (C13635d<? super C2745c>) null), 1, (Object) null);
            }
        }
        if (editText2 != null) {
            C2928ap apVar = new C2928ap(editText2);
            if (button2 != null) {
                C4666m.m18147o(button2, (C13640g) null, new C2746d(this, apVar, (C13635d<? super C2746d>) null), 1, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c5 */
    public static final void m13550c5(Activity activity, UIInteractionAction uIInteractionAction, C4023j0.C4028e eVar, View view) {
        C13706o.m87929f(uIInteractionAction, "this$0");
        C13706o.m87929f(eVar, "$magicTextListener");
        C4023j0.m15697C(activity, uIInteractionAction.mo27837X0(), eVar, C17542R$style.Theme_App_Dialog_Action_SmallText);
    }

    /* access modifiers changed from: private */
    /* renamed from: d4 */
    public static final void m13551d4(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$editText");
        editText.setText(fVar.f10575a);
        C4666m.m18154v(editText);
    }

    /* access modifiers changed from: private */
    /* renamed from: d5 */
    public static final void m13552d5(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$it");
        editText.setText(fVar.f10575a);
        editText.setSelection(fVar.f10575a.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public static final void m13553e4(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$editText");
        editText.setText(fVar.f10575a);
        C4666m.m18154v(editText);
    }

    /* access modifiers changed from: private */
    /* renamed from: e5 */
    public static final void m13554e5(Activity activity, UIInteractionAction uIInteractionAction, C4023j0.C4028e eVar, View view) {
        C13706o.m87929f(uIInteractionAction, "this$0");
        C13706o.m87929f(eVar, "$magicTextListener");
        C4023j0.m15697C(activity, uIInteractionAction.mo27837X0(), eVar, C17542R$style.Theme_App_Dialog_Action_SmallText);
    }

    /* renamed from: f4 */
    private final void m13555f4() {
        if (this.wasPointerOverlayEnabledBefore) {
            return;
        }
        if (C8164a.m33886a()) {
            C4061t1.m15947B0(new String[]{"settings put system pointer_location 0"});
        } else if (C4031k.m15910j()) {
            Context K0 = mo27827K0();
            C13706o.m87928e(K0, "context");
            HelperSystemCommands.m24582e(K0, "system", "int", "pointer_location", "0");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f5 */
    public static final void m13556f5(UIInteractionAction uIInteractionAction, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(uIInteractionAction, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        uIInteractionAction.m13555f4();
        appCompatDialog.dismiss();
    }

    /* renamed from: g4 */
    private final void m13557g4(EditText editText) {
        editText.setOnKeyListener(new C3581wo(editText));
    }

    /* access modifiers changed from: private */
    /* renamed from: g5 */
    public static final void m13558g5(UIInteractionAction uIInteractionAction, DialogInterface dialogInterface) {
        C13706o.m87929f(uIInteractionAction, "this$0");
        uIInteractionAction.m13555f4();
    }

    /* access modifiers changed from: private */
    /* renamed from: h4 */
    public static final boolean m13559h4(EditText editText, View view, int i, KeyEvent keyEvent) {
        C13706o.m87929f(editText, "$editText");
        if (i != 67) {
            return false;
        }
        try {
            Integer.parseInt(editText.getText().toString());
            return false;
        } catch (Exception unused) {
            editText.setText("");
            return false;
        }
    }

    /* renamed from: i4 */
    private final void m13560i4() {
        Intent intent = new Intent(mo27827K0().getApplicationContext(), UiInteractionNotificationPressReceiver.class);
        intent.putExtra(C8157f.ITEM_TYPE, mo27837X0());
        intent.putExtra("current_action", this);
        PendingIntent broadcast = PendingIntent.getBroadcast(mo27827K0().getApplicationContext(), 0, intent, C6368b1.f14959b | 268435456);
        String j1 = SelectableItem.m15535j1(C17541R$string.ui_interaction_notification_navigate_to_app);
        C13706o.m87928e(j1, "getString(R.string.ui_in…fication_navigate_to_app)");
        NotificationCompat.Builder contentIntent = new NotificationCompat.Builder(mo27827K0()).setSmallIcon((int) C17530R$drawable.ic_gesture_double_tap_white_24dp).setContentTitle(SelectableItem.m15535j1(C17541R$string.ui_interaction_identify_ui_control)).setStyle(new NotificationCompat.BigTextStyle().bigText(j1)).setContentText(j1).setAutoCancel(true).setChannelId("vital_functionality").setContentIntent(broadcast);
        C13706o.m87928e(contentIntent, "Builder(context)\n       …tentIntent(pendingIntent)");
        Notification build = contentIntent.build();
        C13706o.m87928e(build, "notificationBuilder.build()");
        Object systemService = mo27827K0().getSystemService("notification");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify(REQUEST_CODE_UI_INTERACTION_NOTIFICATION, build);
        UIInteractionAccessibilityService.f9127g.mo26811c().mo79690V(1).mo79688T(C12318a.m83030b()).mo79679I(C16971a.m100210a()).mo79685P(new C3608xo(this));
        Context K0 = mo27827K0();
        C13706o.m87928e(K0, "context");
        C7375a.m30478a(K0, j1, -1, C17530R$drawable.launcher_no_border, ContextCompat.getColor(mo27827K0(), C17528R$color.actions_primary_dark), 1, true, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static final void m13562j4(UIInteractionAction uIInteractionAction, UiInteractionConfiguration.Click click) {
        C13706o.m87929f(uIInteractionAction, "this$0");
        uIInteractionAction.uiInteractionConfiguration = click;
        uIInteractionAction.mo24689O1();
        C4934n.m18998M().mo29702s0();
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93731c(), (C15486m0) null, new C2747e(uIInteractionAction, (C13635d<? super C2747e>) null), 2, (Object) null);
    }

    /* renamed from: k4 */
    private final List<UIInteractionOption> m13564k4() {
        UIInteractionOption[] b = f7678d.m13619d();
        ArrayList arrayList = new ArrayList();
        for (UIInteractionOption uIInteractionOption : b) {
            if (Build.VERSION.SDK_INT >= uIInteractionOption.mo25894b()) {
                arrayList.add(uIInteractionOption);
            }
        }
        return arrayList;
    }

    /* renamed from: l4 */
    private final long m13566l4(String str, int i) {
        if (str == null) {
            return (long) i;
        }
        MacroDroidVariable q = mo27861q(str);
        if (q != null) {
            return q.mo27731A();
        }
        Long Y0 = mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        C4878b.m18869h("Variable not found: " + str, Y0.longValue());
        return 0;
    }

    /* renamed from: m4 */
    private final void m13568m4() {
        boolean z = false;
        if (Settings.Global.getInt(mo27827K0().getContentResolver(), "always_finish_activities", 0) != 0) {
            z = true;
        }
        if (z) {
            Context K0 = mo27827K0();
            C13706o.m87928e(K0, "context");
            String j1 = SelectableItem.m15535j1(C17541R$string.disable_developer_option_dont_keep_activities);
            C13706o.m87928e(j1, "getString(R.string.disab…ion_dont_keep_activities)");
            C7375a.m30478a(K0, j1, -1, C17530R$drawable.launcher_no_border, -12303292, 1, true, false);
            return;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        mo27827K0().startActivity(intent);
        m13560i4();
    }

    /* renamed from: n4 */
    private final void m13570n4(TriggerContextInfo triggerContextInfo) {
        if (!C4061t1.m15996h0(mo27827K0())) {
            C7439d0.m30911p0(mo27827K0(), mo25559a1(), 10);
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18869h("UI Interaction failed, UI Interaction accessibility service is disabled", Y0.longValue());
            return;
        }
        Intent intent = new Intent(mo27827K0(), UIInteractionAccessibilityService.class);
        intent.putExtra("triggerContextInfo", triggerContextInfo);
        intent.putExtra("macroGuid", mo27837X0().getGUID());
        UiInteractionConfiguration uiInteractionConfiguration2 = this.uiInteractionConfiguration;
        if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.Click) {
            Context K0 = mo27827K0();
            UiInteractionConfiguration uiInteractionConfiguration3 = this.uiInteractionConfiguration;
            C13706o.m87927d(uiInteractionConfiguration3, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Click");
            String t0 = C4023j0.m15760t0(K0, ((UiInteractionConfiguration.Click) uiInteractionConfiguration3).getTextContent(), triggerContextInfo, mo27837X0());
            Context K02 = mo27827K0();
            UiInteractionConfiguration uiInteractionConfiguration4 = this.uiInteractionConfiguration;
            C13706o.m87927d(uiInteractionConfiguration4, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Click");
            String t02 = C4023j0.m15760t0(K02, ((UiInteractionConfiguration.Click) uiInteractionConfiguration4).getViewId(), triggerContextInfo, mo27837X0());
            UiInteractionConfiguration uiInteractionConfiguration5 = this.uiInteractionConfiguration;
            C13706o.m87927d(uiInteractionConfiguration5, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Click");
            C13706o.m87928e(t0, "itemText");
            C13706o.m87928e(t02, "viewId");
            intent.putExtra("uiInteractionConfig", ((UiInteractionConfiguration.Click) uiInteractionConfiguration5).withTextAndViewId(t0, t02));
            UiInteractionConfiguration uiInteractionConfiguration6 = this.uiInteractionConfiguration;
            C13706o.m87927d(uiInteractionConfiguration6, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Click");
            String xVarName = ((UiInteractionConfiguration.Click) uiInteractionConfiguration6).getXVarName();
            UiInteractionConfiguration uiInteractionConfiguration7 = this.uiInteractionConfiguration;
            C13706o.m87927d(uiInteractionConfiguration7, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Click");
            String yVarName = ((UiInteractionConfiguration.Click) uiInteractionConfiguration7).getYVarName();
            if (xVarName != null) {
                MacroDroidVariable q = mo27861q(xVarName);
                if (q != null) {
                    intent.putExtra("xVariableValue", q.mo27731A());
                } else {
                    Long Y02 = mo27840Y0();
                    C13706o.m87928e(Y02, "macroGuid");
                    C4878b.m18869h("X-Location variable not found: " + xVarName, Y02.longValue());
                }
            }
            if (yVarName != null) {
                MacroDroidVariable q2 = mo27861q(yVarName);
                if (q2 != null) {
                    intent.putExtra("yVariableValue", q2.mo27731A());
                } else {
                    String str = "Y-Location variable not found: " + yVarName;
                    Long Y03 = mo27840Y0();
                    C13706o.m87928e(Y03, "macroGuid");
                    C4878b.m18869h(str, Y03.longValue());
                }
            }
        } else if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.Gesture) {
            C13706o.m87927d(uiInteractionConfiguration2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Gesture");
            UiInteractionConfiguration.Gesture gesture = (UiInteractionConfiguration.Gesture) uiInteractionConfiguration2;
            intent.putExtra("xStartVariableValue", m13566l4(gesture.getXStartVarName(), gesture.getStartX()));
            intent.putExtra("yStartVariableValue", m13566l4(gesture.getYStartVarName(), gesture.getStartY()));
            intent.putExtra("xEndVariableValue", m13566l4(gesture.getXEndVarName(), gesture.getEndX()));
            intent.putExtra("yEndVariableValue", m13566l4(gesture.getYEndVarName(), gesture.getEndY()));
            intent.putExtra("durationVariableValue", m13566l4(gesture.getDurationVarName(), gesture.getDurationMs()));
            intent.putExtra("uiInteractionConfig", this.uiInteractionConfiguration);
        } else if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.GestureSequence) {
            C13706o.m87927d(uiInteractionConfiguration2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.GestureSequence");
            UiInteractionConfiguration.GestureSequence gestureSequence = (UiInteractionConfiguration.GestureSequence) uiInteractionConfiguration2;
            intent.putExtra("xStartVariableValue", m13566l4(gestureSequence.getXStartVarName(), gestureSequence.getStartX()));
            intent.putExtra("yStartVariableValue", m13566l4(gestureSequence.getYStartVarName(), gestureSequence.getStartY()));
            intent.putExtra("durationVariableValue", m13566l4(gestureSequence.getDurationVarName(), gestureSequence.getDurationMs()));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (UiInteractionConfiguration.GestureEntry gestureEntry : gestureSequence.getGestures()) {
                arrayList.add(Long.valueOf(m13566l4(gestureEntry.getXEndVarName(), gestureEntry.getEndX())));
                arrayList2.add(Long.valueOf(m13566l4(gestureEntry.getYEndVarName(), gestureEntry.getEndY())));
            }
            intent.putExtra("sequenceXValues", C13566b0.m87403G0(arrayList));
            intent.putExtra("sequenceYValues", C13566b0.m87403G0(arrayList2));
            intent.putExtra("uiInteractionConfig", this.uiInteractionConfiguration);
        } else {
            intent.putExtra("uiInteractionConfig", uiInteractionConfiguration2);
        }
        mo27827K0().startService(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: o4 */
    public final int m13572o4(int i, int i2, int i3) {
        return Math.min(Math.max(i2, i), i3);
    }

    /* renamed from: p4 */
    private final void m13574p4() {
        UiInteractionConfiguration.Click click;
        UiInteractionConfiguration uiInteractionConfiguration2 = this.uiInteractionConfiguration;
        if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.Click) {
            C13706o.m87927d(uiInteractionConfiguration2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Click");
            click = (UiInteractionConfiguration.Click) uiInteractionConfiguration2;
        } else {
            click = null;
        }
        this.transientClickOption = click != null ? click.getClickOption() : 0;
        Activity j0 = mo27850j0();
        C13706o.m87926c(j0);
        AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) f7678d.m13618c(), this.transientClickOption, (DialogInterface.OnClickListener) new C3408ro(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C2984cp(this));
        AlertDialog create = builder.create();
        C13706o.m87928e(create, "builder.create()");
        create.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public static final void m13576q4(UIInteractionAction uIInteractionAction, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(uIInteractionAction, "this$0");
        uIInteractionAction.transientClickOption = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: r4 */
    public static final void m13578r4(UIInteractionAction uIInteractionAction, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(uIInteractionAction, "this$0");
        int i2 = uIInteractionAction.transientClickOption;
        if (i2 == 0) {
            uIInteractionAction.uiInteractionConfiguration = new UiInteractionConfiguration.Click(uIInteractionAction.transientClickOption, uIInteractionAction.transientLongClick, (Point) null, (String) null, (String) null, (String) null, 0, "", (String) null);
            uIInteractionAction.mo24689O1();
        } else if (i2 == 1) {
            uIInteractionAction.m13534U4(C17541R$string.enter_text_to_match, C17541R$string.enter_text_to_match);
        } else if (i2 == 2) {
            uIInteractionAction.m13544Z4();
        } else if (i2 == 3) {
            uIInteractionAction.m13568m4();
        } else if (i2 == 4) {
            uIInteractionAction.mo25892s4();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public static final void m13581t4(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$it");
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public static final void m13583u4(Activity activity, C4023j0.C4028e eVar, UIInteractionAction uIInteractionAction, View view) {
        C13706o.m87929f(eVar, "$magicTextListener");
        C13706o.m87929f(uIInteractionAction, "this$0");
        C4023j0.m15698D(activity, eVar, uIInteractionAction.mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, uIInteractionAction.mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: v4 */
    public static final void m13585v4(UIInteractionAction uIInteractionAction, EditText editText, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(uIInteractionAction, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        uIInteractionAction.uiInteractionConfiguration = new UiInteractionConfiguration.Click(uIInteractionAction.transientClickOption, uIInteractionAction.transientLongClick, (Point) null, (String) null, (String) null, (String) null, 0, (String) null, String.valueOf(editText != null ? editText.getText() : null));
        appCompatDialog.dismiss();
        uIInteractionAction.mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: w4 */
    public static final void m13587w4(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: x4 */
    private final void m13589x4() {
        UiInteractionConfiguration.Gesture gesture;
        AppCompatDialog appCompatDialog;
        String str;
        String num;
        String str2;
        String str3;
        String str4;
        AppCompatDialog appCompatDialog2 = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog2.setContentView((int) C17535R$layout.dialog_ui_interaction_gesture_config);
        appCompatDialog2.setTitle((int) C17541R$string.ui_interaction_perform_gesture);
        C4656c.m18115d(appCompatDialog2, 0, 1, (Object) null);
        UiInteractionConfiguration uiInteractionConfiguration2 = this.uiInteractionConfiguration;
        if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.Gesture) {
            C13706o.m87927d(uiInteractionConfiguration2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Gesture");
            gesture = (UiInteractionConfiguration.Gesture) uiInteractionConfiguration2;
        } else {
            gesture = null;
        }
        View findViewById = appCompatDialog2.findViewById(C17532R$id.showTouchOverlayButton);
        C13706o.m87926c(findViewById);
        EditText editText = (EditText) appCompatDialog2.findViewById(C17532R$id.start_x_location);
        EditText editText2 = (EditText) appCompatDialog2.findViewById(C17532R$id.start_y_location);
        EditText editText3 = (EditText) appCompatDialog2.findViewById(C17532R$id.end_x_location);
        EditText editText4 = (EditText) appCompatDialog2.findViewById(C17532R$id.end_y_location);
        TextView textView = (TextView) appCompatDialog2.findViewById(C17532R$id.resolution_label);
        EditText editText5 = (EditText) appCompatDialog2.findViewById(C17532R$id.duration);
        CheckBox checkBox = (CheckBox) appCompatDialog2.findViewById(C17532R$id.waitCheckbox);
        TextView textView2 = (TextView) appCompatDialog2.findViewById(C17532R$id.msLabel);
        Button button = (Button) appCompatDialog2.findViewById(C17532R$id.startXMagicTextButton);
        Button button2 = (Button) appCompatDialog2.findViewById(C17532R$id.startYMagicTextButton);
        Button button3 = (Button) appCompatDialog2.findViewById(C17532R$id.cancelButton);
        Button button4 = (Button) appCompatDialog2.findViewById(C17532R$id.okButton);
        Button button5 = (Button) appCompatDialog2.findViewById(C17532R$id.endYMagicTextButton);
        AppCompatDialog appCompatDialog3 = appCompatDialog2;
        Button button6 = (Button) appCompatDialog2.findViewById(C17532R$id.msMagicTextButton);
        Button button7 = (Button) appCompatDialog2.findViewById(C17532R$id.endXMagicTextButton);
        C4666m.m18147o((Button) findViewById, (C13640g) null, new C2750h(this, (C13635d<? super C2750h>) null), 1, (Object) null);
        if (textView2 != null) {
            String j1 = SelectableItem.m15535j1(C17541R$string.milliseconds_capital);
            C13706o.m87928e(j1, "getString(R.string.milliseconds_capital)");
            String lowerCase = j1.toLowerCase(Locale.ROOT);
            C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            textView2.setText(lowerCase);
        }
        if (checkBox != null) {
            checkBox.setChecked(gesture != null ? gesture.getWaitBeforeNext() : true);
        }
        String str5 = "0";
        if ((gesture != null ? gesture.getXStartVarName() : null) != null) {
            if (editText != null) {
                editText.setText(gesture.getXStartVarName());
            }
        } else if (editText != null) {
            if (gesture == null || (str4 = Integer.valueOf(gesture.getStartX()).toString()) == null) {
                str4 = str5;
            }
            editText.setText(str4);
        }
        if ((gesture != null ? gesture.getYStartVarName() : null) != null) {
            if (editText2 != null) {
                editText2.setText(gesture.getYStartVarName());
            }
        } else if (editText2 != null) {
            if (gesture == null || (str3 = Integer.valueOf(gesture.getStartY()).toString()) == null) {
                str3 = str5;
            }
            editText2.setText(str3);
        }
        if ((gesture != null ? gesture.getXEndVarName() : null) != null) {
            if (editText3 != null) {
                editText3.setText(gesture.getXEndVarName());
            }
        } else if (editText3 != null) {
            if (gesture == null || (str2 = Integer.valueOf(gesture.getEndX()).toString()) == null) {
                str2 = str5;
            }
            editText3.setText(str2);
        }
        if ((gesture != null ? gesture.getYEndVarName() : null) != null) {
            if (editText4 != null) {
                editText4.setText(gesture.getYEndVarName());
            }
        } else if (editText4 != null) {
            if (!(gesture == null || (num = Integer.valueOf(gesture.getEndY()).toString()) == null)) {
                str5 = num;
            }
            editText4.setText(str5);
        }
        if ((gesture != null ? gesture.getDurationVarName() : null) != null) {
            if (editText5 != null) {
                editText5.setText(gesture.getDurationVarName());
            }
        } else if (editText5 != null) {
            if (gesture == null || (str = Integer.valueOf(gesture.getDurationMs()).toString()) == null) {
                str = "250";
            }
            editText5.setText(str);
        }
        Point point = new Point();
        mo27850j0().getWindowManager().getDefaultDisplay().getRealSize(point);
        if (textView != null) {
            textView.setText(SelectableItem.m15535j1(C17541R$string.screen_resolution) + ": " + point.x + ", " + point.y);
        }
        int max = Math.max(point.x, point.y);
        C13706o.m87926c(editText);
        C3154ip ipVar = new C3154ip(editText);
        if (button != null) {
            button.setOnClickListener(new C3462so(this, ipVar));
        }
        if (editText2 != null) {
            C3210kp kpVar = new C3210kp(editText2);
            if (button2 != null) {
                button2.setOnClickListener(new C3499to(this, kpVar));
            }
        }
        if (editText3 != null) {
            C2956bp bpVar = new C2956bp(editText3);
            if (button7 != null) {
                button7.setOnClickListener(new C3526uo(this, bpVar));
            }
        }
        if (editText4 != null) {
            C3266mp mpVar = new C3266mp(editText4);
            if (button5 != null) {
                button5.setOnClickListener(new C3379qo(this, mpVar));
            }
        }
        if (editText5 != null) {
            C3042ep epVar = new C3042ep(editText5);
            if (button6 != null) {
                button6.setOnClickListener(new C3553vo(this, epVar));
            }
        }
        if (button4 != null) {
            button4.setOnClickListener(new C3500tp(editText, editText2, editText3, editText4, editText5, this, max, checkBox, appCompatDialog3));
        }
        if (button3 != null) {
            appCompatDialog = appCompatDialog3;
            button3.setOnClickListener(new C3125ho(appCompatDialog));
        } else {
            appCompatDialog = appCompatDialog3;
        }
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: y4 */
    public static final void m13591y4(EditText editText, C4023j0.C4029f fVar) {
        C13706o.m87929f(editText, "$editText");
        editText.setText(fVar.f10575a);
        C4666m.m18154v(editText);
    }

    /* access modifiers changed from: private */
    /* renamed from: z4 */
    public static final void m13593z4(UIInteractionAction uIInteractionAction, C4023j0.C4028e eVar, View view) {
        C13706o.m87929f(uIInteractionAction, "this$0");
        C13706o.m87929f(eVar, "$magicTextListener");
        C4023j0.m15697C(uIInteractionAction.mo27850j0(), uIInteractionAction.mo27837X0(), eVar, C17542R$style.Theme_App_Dialog_Action_SmallText);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        List<UIInteractionOption> k4 = m13564k4();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(k4, 10));
        for (UIInteractionOption a : k4) {
            arrayList.add(Integer.valueOf(a.mo25893a()));
        }
        return arrayList.indexOf(Integer.valueOf(this.action));
    }

    /* renamed from: F */
    public String[] mo24440F() {
        UiInteractionConfiguration uiInteractionConfiguration2 = this.uiInteractionConfiguration;
        if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.Click) {
            String[] strArr = new String[2];
            UiInteractionConfiguration.Click click = (UiInteractionConfiguration.Click) uiInteractionConfiguration2;
            String textContent = click.getTextContent();
            String str = "";
            if (textContent == null) {
                textContent = str;
            }
            strArr[0] = textContent;
            String viewId = click.getViewId();
            if (viewId != null) {
                str = viewId;
            }
            strArr[1] = str;
            return strArr;
        } else if (!(uiInteractionConfiguration2 instanceof UiInteractionConfiguration.Paste)) {
            return new String[0];
        } else {
            return new String[]{((UiInteractionConfiguration.Paste) uiInteractionConfiguration2).getText()};
        }
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        String[] strArr2 = strArr;
        C13706o.m87929f(strArr2, "magicText");
        UiInteractionConfiguration uiInteractionConfiguration2 = this.uiInteractionConfiguration;
        if (strArr2.length == 2) {
            if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.Click) {
                this.uiInteractionConfiguration = UiInteractionConfiguration.Click.copy$default((UiInteractionConfiguration.Click) uiInteractionConfiguration2, 0, false, (Point) null, (String) null, (String) null, strArr2[0], 0, (String) null, strArr2[1], Opcodes.XOR_INT_LIT8, (Object) null);
            }
        } else if (strArr2.length == 1 && (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.Paste)) {
            this.uiInteractionConfiguration = UiInteractionConfiguration.Paste.copy$default((UiInteractionConfiguration.Paste) uiInteractionConfiguration2, false, false, strArr2[0], 3, (Object) null);
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str;
        String str2;
        UiInteractionConfiguration uiInteractionConfiguration2 = this.uiInteractionConfiguration;
        if (uiInteractionConfiguration2 != null) {
            Resources resources = mo27827K0().getResources();
            C13706o.m87928e(resources, "context.resources");
            str = uiInteractionConfiguration2.getExtendedDetail(resources);
        } else {
            str = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f7678d.m13619d()[this.action].mo25895c());
        if (!(str == null || str.length() == 0)) {
            str2 = " [" + str + ']';
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo24689O1() {
        super.mo24689O1();
        m13555f4();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7863v4.f18921j.mo37774a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24672O0();
    }

    /* renamed from: a */
    public String[] mo24435a() {
        UiInteractionConfiguration uiInteractionConfiguration2 = this.uiInteractionConfiguration;
        if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.Click) {
            C13706o.m87927d(uiInteractionConfiguration2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Click");
            UiInteractionConfiguration uiInteractionConfiguration3 = this.uiInteractionConfiguration;
            C13706o.m87927d(uiInteractionConfiguration3, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Click");
            return new String[]{((UiInteractionConfiguration.Click) uiInteractionConfiguration2).getXVarName(), ((UiInteractionConfiguration.Click) uiInteractionConfiguration3).getYVarName()};
        } else if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.Gesture) {
            C13706o.m87927d(uiInteractionConfiguration2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Gesture");
            UiInteractionConfiguration.Gesture gesture = (UiInteractionConfiguration.Gesture) uiInteractionConfiguration2;
            return new String[]{gesture.getXStartVarName(), gesture.getYStartVarName(), gesture.getXEndVarName(), gesture.getYEndVarName(), gesture.getDurationVarName()};
        } else if (!(uiInteractionConfiguration2 instanceof UiInteractionConfiguration.GestureSequence)) {
            return new String[0];
        } else {
            C13706o.m87927d(uiInteractionConfiguration2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.GestureSequence");
            UiInteractionConfiguration.GestureSequence gestureSequence = (UiInteractionConfiguration.GestureSequence) uiInteractionConfiguration2;
            String[] strArr = {gestureSequence.getXStartVarName(), gestureSequence.getYStartVarName(), gestureSequence.getDurationVarName()};
            List<UiInteractionConfiguration.GestureEntry> gestures = gestureSequence.getGestures();
            ArrayList arrayList = new ArrayList(C13616u.m87774u(gestures, 10));
            for (UiInteractionConfiguration.GestureEntry gestureEntry : gestures) {
                arrayList.add(C13614t.m87751m(gestureEntry.getXEndVarName(), gestureEntry.getYEndVarName()));
            }
            return (String[]) C13593l.m87568o(strArr, C13616u.m87776w(arrayList));
        }
    }

    /* renamed from: e */
    public void mo24436e(String[] strArr) {
        String[] strArr2 = strArr;
        C13706o.m87929f(strArr2, "varNames");
        UiInteractionConfiguration uiInteractionConfiguration2 = this.uiInteractionConfiguration;
        if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.Click) {
            if (strArr2.length == 2) {
                C13706o.m87927d(uiInteractionConfiguration2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Click");
                UiInteractionConfiguration.Click click = (UiInteractionConfiguration.Click) uiInteractionConfiguration2;
                this.uiInteractionConfiguration = new UiInteractionConfiguration.Click(click.getClickOption(), click.getLongClick(), click.getXyPoint(), strArr2[0], strArr2[1], click.getTextContent(), 0, click.getContentDescription(), click.getViewId());
            }
        } else if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.Gesture) {
            C13706o.m87927d(uiInteractionConfiguration2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Gesture");
            UiInteractionConfiguration.Gesture gesture = (UiInteractionConfiguration.Gesture) uiInteractionConfiguration2;
            this.uiInteractionConfiguration = new UiInteractionConfiguration.Gesture(gesture.getStartX(), gesture.getStartY(), gesture.getEndX(), gesture.getEndY(), gesture.getDurationMs(), strArr2[0], strArr2[1], strArr2[2], strArr2[3], strArr2[4], gesture.getWaitBeforeNext());
        } else if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.GestureSequence) {
            C13706o.m87927d(uiInteractionConfiguration2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.GestureSequence");
            UiInteractionConfiguration.GestureSequence gestureSequence = (UiInteractionConfiguration.GestureSequence) uiInteractionConfiguration2;
            List<UiInteractionConfiguration.GestureEntry> gestures = gestureSequence.getGestures();
            ArrayList arrayList = new ArrayList();
            if (strArr2.length != (gestures.size() * 2) + 3) {
                C4878b.m18868g("Unexepected length when updating variable names. Expected: " + (gestures.size() + 3) + ", Got: " + strArr2.length);
                return;
            }
            int size = gestures.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    UiInteractionConfiguration.GestureEntry gestureEntry = gestures.get(i);
                    int i2 = i * 2;
                    arrayList.add(new UiInteractionConfiguration.GestureEntry(gestureEntry.getEndX(), gestureEntry.getEndY(), strArr2[i2 + 3], strArr2[i2 + 4]));
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            this.uiInteractionConfiguration = new UiInteractionConfiguration.GestureSequence(gestureSequence.getStartX(), gestureSequence.getStartY(), gestureSequence.getDurationMs(), strArr2[0], strArr2[1], strArr2[2], gestureSequence.getWaitBeforeNext(), arrayList);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        List<UIInteractionOption> k4 = m13564k4();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(k4, 10));
        for (UIInteractionOption c : k4) {
            arrayList.add(c.mo25895c());
        }
        Object[] array = arrayList.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24421h(com.arlosoft.macrodroid.triggers.TriggerContextInfo r16, int r17, boolean r18, java.util.Stack<java.lang.Integer> r19, com.arlosoft.macrodroid.data.ResumeMacroInfo r20, boolean r21) {
        /*
            r15 = this;
            r10 = r15
            java.lang.String r0 = "skipEndifIndexStack"
            r7 = r19
            kotlin.jvm.internal.C13706o.m87929f(r7, r0)
            com.arlosoft.macrodroid.action.UiInteractionConfiguration r0 = r10.uiInteractionConfiguration
            boolean r1 = r0 instanceof com.arlosoft.macrodroid.action.UiInteractionConfiguration.Gesture
            r2 = 0
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Gesture"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            com.arlosoft.macrodroid.action.UiInteractionConfiguration$Gesture r0 = (com.arlosoft.macrodroid.action.UiInteractionConfiguration.Gesture) r0
            boolean r0 = r0.getWaitBeforeNext()
            if (r0 == 0) goto L_0x002b
            com.arlosoft.macrodroid.action.UiInteractionConfiguration r0 = r10.uiInteractionConfiguration
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            com.arlosoft.macrodroid.action.UiInteractionConfiguration$Gesture r0 = (com.arlosoft.macrodroid.action.UiInteractionConfiguration.Gesture) r0
            int r0 = r0.getDurationMs()
            long r0 = (long) r0
            r1 = r0
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            r15.m13570n4(r16)
            if (r21 != 0) goto L_0x005b
            kotlinx.coroutines.p1 r11 = kotlinx.coroutines.C15503p1.f64723a
            kotlinx.coroutines.h2 r12 = kotlinx.coroutines.C15186a1.m93731c()
            r13 = 0
            com.arlosoft.macrodroid.action.UIInteractionAction$f r14 = new com.arlosoft.macrodroid.action.UIInteractionAction$f
            r9 = 0
            r0 = r14
            r3 = r15
            r4 = r17
            r5 = r16
            r6 = r18
            r7 = r19
            r8 = r20
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
            r0 = 2
            r1 = 0
            r16 = r11
            r17 = r12
            r18 = r13
            r19 = r14
            r20 = r0
            r21 = r1
            kotlinx.coroutines.C15561w1 unused = kotlinx.coroutines.C15473j.m94492d(r16, r17, r18, r19, r20, r21)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.UIInteractionAction.mo24421h(com.arlosoft.macrodroid.triggers.TriggerContextInfo, int, boolean, java.util.Stack, com.arlosoft.macrodroid.data.ResumeMacroInfo, boolean):void");
    }

    /* renamed from: r2 */
    public boolean mo25499r2() {
        return true;
    }

    /* renamed from: s4 */
    public final void mo25892s4() {
        UiInteractionConfiguration.Click click;
        String str;
        if (mo27836X()) {
            UiInteractionConfiguration uiInteractionConfiguration2 = this.uiInteractionConfiguration;
            String str2 = null;
            if (uiInteractionConfiguration2 instanceof UiInteractionConfiguration.Click) {
                C13706o.m87927d(uiInteractionConfiguration2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.UiInteractionConfiguration.Click");
                click = (UiInteractionConfiguration.Click) uiInteractionConfiguration2;
            } else {
                click = null;
            }
            Activity j0 = mo27850j0();
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_select_view_id);
            appCompatDialog.setTitle((int) C17541R$string.ui_interaction_view_id);
            boolean z = false;
            C4656c.m18115d(appCompatDialog, 0, 1, (Object) null);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.viewIdText);
            Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.magicTextButton);
            if (editText != null) {
                if (click == null || (str = click.getViewId()) == null) {
                    str = "";
                }
                editText.setText(str);
            }
            if (editText != null) {
                C4666m.m18154v(editText);
            }
            if (editText != null) {
                editText.addTextChangedListener(new C2749g(button, editText));
            }
            if (editText != null) {
                C3126hp hpVar = new C3126hp(editText);
                if (button3 != null) {
                    button3.setOnClickListener(new C3463sp(j0, hpVar, this));
                }
            }
            if (button != null) {
                button.setOnClickListener(new C3293no(this, editText, appCompatDialog));
            }
            if (button != null) {
                if (click != null) {
                    str2 = click.getTextContent();
                }
                if (str2 == null || str2.length() == 0) {
                    z = true;
                }
                button.setEnabled(!z);
            }
            if (button2 != null) {
                button2.setOnClickListener(new C3181jo(appCompatDialog));
            }
            appCompatDialog.show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.action;
        switch (i) {
            case 0:
            case 1:
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                this.transientLongClick = z;
                m13574p4();
                return;
            case 2:
                this.uiInteractionConfiguration = UiInteractionConfiguration.Copy.INSTANCE;
                mo24689O1();
                return;
            case 3:
                this.uiInteractionConfiguration = UiInteractionConfiguration.Cut.INSTANCE;
                mo24689O1();
                return;
            case 4:
                m13524P4();
                return;
            case 5:
                this.uiInteractionConfiguration = UiInteractionConfiguration.ClearSelection.INSTANCE;
                mo24689O1();
                return;
            case 6:
                m13589x4();
                return;
            case 7:
                m13514K4();
                return;
            default:
                return;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.uiInteractionConfiguration, i);
        parcel.writeInt(this.action);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.action = m13564k4().get(i).mo25893a();
    }

    public UIInteractionAction(Activity activity, Macro macro) {
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private UIInteractionAction(Parcel parcel) {
        super(parcel);
        this.uiInteractionConfiguration = (UiInteractionConfiguration) parcel.readParcelable(UiInteractionConfiguration.class.getClassLoader());
        this.action = parcel.readInt();
    }
}
