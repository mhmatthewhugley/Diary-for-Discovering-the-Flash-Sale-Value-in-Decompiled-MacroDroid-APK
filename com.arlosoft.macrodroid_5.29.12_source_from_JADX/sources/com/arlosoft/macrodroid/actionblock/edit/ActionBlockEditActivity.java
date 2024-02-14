package com.arlosoft.macrodroid.actionblock.edit;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.app.NotificationCompat;
import androidx.core.content.FileProvider;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.araujo.jordan.excuseme.C1624a;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.ConditionAction;
import com.arlosoft.macrodroid.action.ElseIfConditionAction;
import com.arlosoft.macrodroid.action.ElseIfConfirmedThenAction;
import com.arlosoft.macrodroid.action.ElseParentAction;
import com.arlosoft.macrodroid.action.EndIfAction;
import com.arlosoft.macrodroid.action.EndParentAction;
import com.arlosoft.macrodroid.action.IfConditionAction;
import com.arlosoft.macrodroid.action.ParentAction;
import com.arlosoft.macrodroid.action.WaitUntilTriggerAction;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.actionblock.list.ActionBlockListActivity;
import com.arlosoft.macrodroid.advert.AdvertActivity;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.common.C4007e1;
import com.arlosoft.macrodroid.common.C4068u1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.constraint.LogicConstraint;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.editscreen.C4633q0;
import com.arlosoft.macrodroid.editscreen.C4653z0;
import com.arlosoft.macrodroid.editscreen.LocalVarsAdapter;
import com.arlosoft.macrodroid.events.ShowActionBlockTestSummaryEvent;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.C4921g;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.selectableitemlist.AddActionActivity;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.EmptyTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.WidgetPressedTrigger;
import com.arlosoft.macrodroid.utils.C6416p0;
import com.arlosoft.macrodroid.utils.C6421r;
import com.arlosoft.macrodroid.utils.C6422r0;
import com.arlosoft.macrodroid.variables.C6487a;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.VariableValue;
import com.arlosoft.macrodroid.widget.C6637e;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.text.C15159j;
import kotlinx.coroutines.C15478k0;
import net.cachapa.expandablelayout.ExpandableLayout;
import org.apache.commons.cli.HelpFormatter;
import p018c0.C1423a;
import p100h2.C7365a;
import p100h2.C7366i;
import p139o1.C7989a;
import p142p0.C8056a;
import p161s1.C10180a;
import p172u1.C10283c;
import p176v0.C10312a;
import p190x3.C10378a;
import p215b8.C11102b;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16254a;
import p370qa.C16265l;
import p370qa.C16270q;
import p440y9.C16971a;

/* compiled from: ActionBlockEditActivity.kt */
public final class ActionBlockEditActivity extends MacroDroidDaggerBaseActivity implements C6637e {

    /* renamed from: X */
    public static final C3674a f9722X = new C3674a((C13695i) null);

    /* renamed from: A */
    public C4915a f9723A;

    /* renamed from: B */
    public C10312a f9724B;

    /* renamed from: C */
    public C4083b f9725C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C7989a f9726D;

    /* renamed from: E */
    private C4633q0<Action> f9727E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public ActionBlock f9728F;

    /* renamed from: G */
    private boolean f9729G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f9730H;

    /* renamed from: I */
    private boolean f9731I;

    /* renamed from: J */
    private SelectableItem f9732J;

    /* renamed from: K */
    private boolean f9733K;

    /* renamed from: L */
    private LocalVarsAdapter f9734L;

    /* renamed from: M */
    private LocalVarsAdapter f9735M;

    /* renamed from: N */
    private LocalVarsAdapter f9736N;

    /* renamed from: O */
    private boolean f9737O;

    /* renamed from: P */
    private boolean f9738P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public boolean f9739Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public Action f9740R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C4653z0 f9741S;

    /* renamed from: T */
    private ActionBlock f9742T;

    /* renamed from: U */
    private final C4068u1 f9743U = new C3727n(this);
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C3693n f9744V = new C3693n(this);

    /* renamed from: W */
    public Map<Integer, View> f9745W = new LinkedHashMap();

    /* renamed from: s */
    public ActionBlockEditViewModel f9746s;

    /* renamed from: z */
    public C7366i f9747z;

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$a */
    /* compiled from: ActionBlockEditActivity.kt */
    public static final class C3674a {
        private C3674a() {
        }

        public /* synthetic */ C3674a(C13695i iVar) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ Intent m14635b(C3674a aVar, Activity activity, boolean z, ActionBlock actionBlock, boolean z2, int i, Object obj) {
            if ((i & 8) != 0) {
                z2 = false;
            }
            return aVar.mo27148a(activity, z, actionBlock, z2);
        }

        /* renamed from: a */
        public final Intent mo27148a(Activity activity, boolean z, ActionBlock actionBlock, boolean z2) {
            C13706o.m87929f(activity, "activity");
            C13706o.m87929f(actionBlock, "actionBlock");
            Intent intent = new Intent(activity, ActionBlockEditActivity.class);
            intent.putExtra("no_advert", z);
            intent.putExtra("ActionBlockGuid", actionBlock.getGUID());
            intent.putExtra("adding_new", z2);
            return intent;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$a0 */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3675a0 extends C13708q implements C16265l<List<? extends SelectableItem>, C13339u> {
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3675a0(ActionBlockEditActivity actionBlockEditActivity) {
            super(1);
            this.this$0 = actionBlockEditActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends SelectableItem>) (List) obj);
            return C13339u.f61331a;
        }

        public final void invoke(List<? extends SelectableItem> list) {
            C13706o.m87929f(list, "itemsList");
            this.this$0.mo27138H3();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$b */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3676b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3676b(ActionBlockEditActivity actionBlockEditActivity, C13635d<? super C3676b> dVar) {
            super(3, dVar);
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3676b(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C7989a r2 = this.this$0.f9726D;
                ActionBlock actionBlock = null;
                if (r2 == null) {
                    C13706o.m87945v("binding");
                    r2 = null;
                }
                FrameLayout frameLayout = r2.f19153C;
                C13706o.m87928e(frameLayout, "binding.localVarsContent");
                if (frameLayout.getVisibility() == 0) {
                    C7989a r22 = this.this$0.f9726D;
                    if (r22 == null) {
                        C13706o.m87945v("binding");
                        r22 = null;
                    }
                    FrameLayout frameLayout2 = r22.f19153C;
                    C13706o.m87928e(frameLayout2, "binding.localVarsContent");
                    frameLayout2.setVisibility(8);
                    C7989a r23 = this.this$0.f9726D;
                    if (r23 == null) {
                        C13706o.m87945v("binding");
                        r23 = null;
                    }
                    ObjectAnimator.ofFloat(r23.f19199y, View.ROTATION, new float[]{180.0f, 0.0f}).setDuration(500).start();
                    ActionBlock q2 = this.this$0.f9728F;
                    if (q2 == null) {
                        C13706o.m87945v("actionBlock");
                    } else {
                        actionBlock = q2;
                    }
                    actionBlock.setLocalExpanded(false);
                } else {
                    C7989a r24 = this.this$0.f9726D;
                    if (r24 == null) {
                        C13706o.m87945v("binding");
                        r24 = null;
                    }
                    FrameLayout frameLayout3 = r24.f19153C;
                    C13706o.m87928e(frameLayout3, "binding.localVarsContent");
                    frameLayout3.setVisibility(0);
                    C7989a r25 = this.this$0.f9726D;
                    if (r25 == null) {
                        C13706o.m87945v("binding");
                        r25 = null;
                    }
                    ObjectAnimator.ofFloat(r25.f19199y, View.ROTATION, new float[]{0.0f, 180.0f}).setDuration(500).start();
                    ActionBlock q22 = this.this$0.f9728F;
                    if (q22 == null) {
                        C13706o.m87945v("actionBlock");
                    } else {
                        actionBlock = q22;
                    }
                    actionBlock.setLocalExpanded(true);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$b0 */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3677b0 extends C13708q implements C16265l<MacroDroidVariable, C13339u> {
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3677b0(ActionBlockEditActivity actionBlockEditActivity) {
            super(1);
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: a */
        public final void mo27151a(MacroDroidVariable macroDroidVariable) {
            C13706o.m87929f(macroDroidVariable, "it");
            this.this$0.m14550M3(macroDroidVariable);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27151a((MacroDroidVariable) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$c */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3678c extends C13708q implements C16265l<String, C13339u> {
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3678c(ActionBlockEditActivity actionBlockEditActivity) {
            super(1);
            this.this$0 = actionBlockEditActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13339u.f61331a;
        }

        public final void invoke(String str) {
            C13706o.m87929f(str, "it");
            this.this$0.f9730H = true;
            this.this$0.m14556P3();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$c0 */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3679c0 extends C13708q implements C16265l<MacroDroidVariable, C13339u> {
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3679c0(ActionBlockEditActivity actionBlockEditActivity) {
            super(1);
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: a */
        public final void mo27153a(MacroDroidVariable macroDroidVariable) {
            C13706o.m87929f(macroDroidVariable, "it");
            this.this$0.m14550M3(macroDroidVariable);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27153a((MacroDroidVariable) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$d */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3680d extends C13708q implements C16265l<String, C13339u> {
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3680d(ActionBlockEditActivity actionBlockEditActivity) {
            super(1);
            this.this$0 = actionBlockEditActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13339u.f61331a;
        }

        public final void invoke(String str) {
            C13706o.m87929f(str, "it");
            this.this$0.f9730H = true;
            this.this$0.m14556P3();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$d0 */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3681d0 extends C13708q implements C16265l<MacroDroidVariable, C13339u> {
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3681d0(ActionBlockEditActivity actionBlockEditActivity) {
            super(1);
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: a */
        public final void mo27155a(MacroDroidVariable macroDroidVariable) {
            C13706o.m87929f(macroDroidVariable, "it");
            this.this$0.m14550M3(macroDroidVariable);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27155a((MacroDroidVariable) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$e */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3682e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3682e(ActionBlockEditActivity actionBlockEditActivity, C13635d<? super C3682e> dVar) {
            super(3, dVar);
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3682e(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                ActionBlock actionBlock = null;
                this.this$0.f9740R = null;
                Intent intent = new Intent(this.this$0, AddActionActivity.class);
                ActionBlock q2 = this.this$0.f9728F;
                if (q2 == null) {
                    C13706o.m87945v("actionBlock");
                } else {
                    actionBlock = q2;
                }
                intent.putExtra("MacroId", actionBlock.getId());
                this.this$0.startActivityForResult(intent, 501);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$e0 */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3683e0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4633q0<T> $adapter;
        final /* synthetic */ ImageButton $button;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3683e0(C4633q0<T> q0Var, ImageButton imageButton, C13635d<? super C3683e0> dVar) {
            super(3, dVar);
            this.$adapter = q0Var;
            this.$button = imageButton;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3683e0(this.$adapter, this.$button, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                if (this.$adapter.mo29057N()) {
                    this.$button.setSelected(false);
                    this.$adapter.mo29064W(false);
                    this.$adapter.mo29068a0(false);
                    this.$adapter.notifyDataSetChanged();
                } else {
                    this.$button.setSelected(true);
                    this.$adapter.mo29064W(true);
                    this.$adapter.mo29068a0(true);
                    this.$adapter.notifyDataSetChanged();
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$f */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3684f extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3684f(ActionBlockEditActivity actionBlockEditActivity, C13635d<? super C3684f> dVar) {
            super(3, dVar);
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3684f(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m14565T2(C3740z.INPUT);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$f0 */
    /* compiled from: ActionBlockEditActivity.kt */
    public static final class C3685f0 implements C6487a {

        /* renamed from: a */
        final /* synthetic */ ActionBlockEditActivity f9748a;

        /* renamed from: b */
        final /* synthetic */ MacroDroidVariable f9749b;

        C3685f0(ActionBlockEditActivity actionBlockEditActivity, MacroDroidVariable macroDroidVariable) {
            this.f9748a = actionBlockEditActivity;
            this.f9749b = macroDroidVariable;
        }

        /* renamed from: a */
        public void mo27159a() {
            this.f9748a.f9730H = true;
            ActionBlockEditActivity.m14532C3(this.f9748a, false, 1, (Object) null);
            this.f9748a.m14556P3();
        }

        /* renamed from: b */
        public void mo27160b() {
            this.f9748a.f9730H = true;
            ActionBlockEditActivity.m14532C3(this.f9748a, false, 1, (Object) null);
            this.f9748a.m14556P3();
        }

        /* renamed from: c */
        public void mo27161c(VariableValue.DictionaryEntry dictionaryEntry) {
            C13706o.m87929f(dictionaryEntry, "removedEntry");
            this.f9748a.f9730H = true;
            ActionBlockEditActivity.m14532C3(this.f9748a, false, 1, (Object) null);
            this.f9748a.m14556P3();
        }

        /* renamed from: d */
        public void mo27162d(VariableValue.DictionaryEntry dictionaryEntry, VariableValue.DictionaryEntry dictionaryEntry2) {
            C13706o.m87929f(dictionaryEntry, "newEntry");
            this.f9748a.f9730H = true;
            ActionBlockEditActivity.m14532C3(this.f9748a, false, 1, (Object) null);
            this.f9748a.m14556P3();
        }

        /* renamed from: e */
        public void mo27163e() {
            ActionBlock q2 = this.f9748a.f9728F;
            if (q2 == null) {
                C13706o.m87945v("actionBlock");
                q2 = null;
            }
            q2.getLocalVariables().remove(this.f9749b);
            this.f9748a.f9730H = true;
            this.f9748a.m14556P3();
            this.f9748a.mo27136B3(true);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$g */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3686g extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3686g(ActionBlockEditActivity actionBlockEditActivity, C13635d<? super C3686g> dVar) {
            super(3, dVar);
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3686g(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m14565T2(C3740z.OUTPUT);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$h */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3687h extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3687h(ActionBlockEditActivity actionBlockEditActivity, C13635d<? super C3687h> dVar) {
            super(3, dVar);
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3687h(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m14565T2(C3740z.LOCAL_WORKING_VAR);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$i */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3688i extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3688i(ActionBlockEditActivity actionBlockEditActivity, C13635d<? super C3688i> dVar) {
            super(3, dVar);
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3688i(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m14601n3();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$j */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3689j extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3689j(ActionBlockEditActivity actionBlockEditActivity, C13635d<? super C3689j> dVar) {
            super(3, dVar);
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3689j(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C7989a r2 = this.this$0.f9726D;
                ActionBlock actionBlock = null;
                if (r2 == null) {
                    C13706o.m87945v("binding");
                    r2 = null;
                }
                FrameLayout frameLayout = r2.f19197w;
                C13706o.m87928e(frameLayout, "binding.inputVarsContent");
                if (frameLayout.getVisibility() == 0) {
                    C7989a r22 = this.this$0.f9726D;
                    if (r22 == null) {
                        C13706o.m87945v("binding");
                        r22 = null;
                    }
                    FrameLayout frameLayout2 = r22.f19197w;
                    C13706o.m87928e(frameLayout2, "binding.inputVarsContent");
                    frameLayout2.setVisibility(8);
                    C7989a r23 = this.this$0.f9726D;
                    if (r23 == null) {
                        C13706o.m87945v("binding");
                        r23 = null;
                    }
                    ObjectAnimator.ofFloat(r23.f19193s, View.ROTATION, new float[]{180.0f, 0.0f}).setDuration(500).start();
                    ActionBlock q2 = this.this$0.f9728F;
                    if (q2 == null) {
                        C13706o.m87945v("actionBlock");
                    } else {
                        actionBlock = q2;
                    }
                    actionBlock.setInputExpanded(false);
                } else {
                    C7989a r24 = this.this$0.f9726D;
                    if (r24 == null) {
                        C13706o.m87945v("binding");
                        r24 = null;
                    }
                    FrameLayout frameLayout3 = r24.f19197w;
                    C13706o.m87928e(frameLayout3, "binding.inputVarsContent");
                    frameLayout3.setVisibility(0);
                    C7989a r25 = this.this$0.f9726D;
                    if (r25 == null) {
                        C13706o.m87945v("binding");
                        r25 = null;
                    }
                    ObjectAnimator.ofFloat(r25.f19193s, View.ROTATION, new float[]{0.0f, 180.0f}).setDuration(500).start();
                    ActionBlock q22 = this.this$0.f9728F;
                    if (q22 == null) {
                        C13706o.m87945v("actionBlock");
                    } else {
                        actionBlock = q22;
                    }
                    actionBlock.setInputExpanded(true);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$k */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3690k extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3690k(ActionBlockEditActivity actionBlockEditActivity, C13635d<? super C3690k> dVar) {
            super(3, dVar);
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3690k(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C7989a r2 = this.this$0.f9726D;
                ActionBlock actionBlock = null;
                if (r2 == null) {
                    C13706o.m87945v("binding");
                    r2 = null;
                }
                FrameLayout frameLayout = r2.f19165O;
                C13706o.m87928e(frameLayout, "binding.outputVarsContent");
                if (frameLayout.getVisibility() == 0) {
                    C7989a r22 = this.this$0.f9726D;
                    if (r22 == null) {
                        C13706o.m87945v("binding");
                        r22 = null;
                    }
                    FrameLayout frameLayout2 = r22.f19165O;
                    C13706o.m87928e(frameLayout2, "binding.outputVarsContent");
                    frameLayout2.setVisibility(8);
                    C7989a r23 = this.this$0.f9726D;
                    if (r23 == null) {
                        C13706o.m87945v("binding");
                        r23 = null;
                    }
                    ObjectAnimator.ofFloat(r23.f19161K, View.ROTATION, new float[]{180.0f, 0.0f}).setDuration(500).start();
                    ActionBlock q2 = this.this$0.f9728F;
                    if (q2 == null) {
                        C13706o.m87945v("actionBlock");
                    } else {
                        actionBlock = q2;
                    }
                    actionBlock.setOutputExpanded(false);
                } else {
                    C7989a r24 = this.this$0.f9726D;
                    if (r24 == null) {
                        C13706o.m87945v("binding");
                        r24 = null;
                    }
                    FrameLayout frameLayout3 = r24.f19165O;
                    C13706o.m87928e(frameLayout3, "binding.outputVarsContent");
                    frameLayout3.setVisibility(0);
                    C7989a r25 = this.this$0.f9726D;
                    if (r25 == null) {
                        C13706o.m87945v("binding");
                        r25 = null;
                    }
                    ObjectAnimator.ofFloat(r25.f19161K, View.ROTATION, new float[]{0.0f, 180.0f}).setDuration(500).start();
                    ActionBlock q22 = this.this$0.f9728F;
                    if (q22 == null) {
                        C13706o.m87945v("actionBlock");
                    } else {
                        actionBlock = q22;
                    }
                    actionBlock.setOutputExpanded(true);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$l */
    /* compiled from: View.kt */
    public static final class C3691l implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ ActionBlockEditActivity f9750a;

        public C3691l(ActionBlockEditActivity actionBlockEditActivity) {
            this.f9750a = actionBlockEditActivity;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C13706o.m87929f(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f9750a.m14540G3(true);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$m */
    /* compiled from: ActionBlockEditActivity.kt */
    public static final class C3692m implements C6520o0.C6530d {

        /* renamed from: a */
        final /* synthetic */ C3740z f9751a;

        /* renamed from: b */
        final /* synthetic */ ActionBlockEditActivity f9752b;

        C3692m(C3740z zVar, ActionBlockEditActivity actionBlockEditActivity) {
            this.f9751a = zVar;
            this.f9752b = actionBlockEditActivity;
        }

        /* renamed from: a */
        public void mo25509a(MacroDroidVariable macroDroidVariable, boolean z) {
            C13706o.m87929f(macroDroidVariable, "variable");
            boolean z2 = false;
            macroDroidVariable.mo27761i0(this.f9751a == C3740z.INPUT);
            if (this.f9751a == C3740z.LOCAL_WORKING_VAR) {
                z2 = true;
            }
            macroDroidVariable.mo27760h0(z2);
            ActionBlock q2 = this.f9752b.f9728F;
            if (q2 == null) {
                C13706o.m87945v("actionBlock");
                q2 = null;
            }
            q2.getLocalVariables().add(macroDroidVariable);
            this.f9752b.f9730H = true;
            this.f9752b.m14536E3();
            this.f9752b.m14556P3();
        }

        /* renamed from: b */
        public boolean mo25510b(String str) {
            C13706o.m87929f(str, "variableName");
            ActionBlock q2 = this.f9752b.f9728F;
            if (q2 == null) {
                C13706o.m87945v("actionBlock");
                q2 = null;
            }
            return q2.findLocalVariableByName(str) == null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$n */
    /* compiled from: ActionBlockEditActivity.kt */
    public static final class C3693n implements C7366i.C7369c {

        /* renamed from: a */
        final /* synthetic */ ActionBlockEditActivity f9753a;

        C3693n(ActionBlockEditActivity actionBlockEditActivity) {
            this.f9753a = actionBlockEditActivity;
        }

        /* renamed from: a */
        public void mo27170a(C7365a aVar) {
            C13706o.m87929f(aVar, "nearbyDevice");
            this.f9753a.m14540G3(false);
            C7989a r2 = this.f9753a.f9726D;
            if (r2 == null) {
                C13706o.m87945v("binding");
                r2 = null;
            }
            r2.f19156F.mo75513c();
            this.f9753a.mo27142Z2().mo37358P();
            this.f9753a.mo27142Z2().mo37363x();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$o */
    /* compiled from: TextView.kt */
    public static final class C3694o implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ActionBlockEditActivity f9754a;

        public C3694o(ActionBlockEditActivity actionBlockEditActivity) {
            this.f9754a = actionBlockEditActivity;
        }

        public void afterTextChanged(Editable editable) {
            this.f9754a.mo27144b3().mo27196v(String.valueOf(editable));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$p */
    /* compiled from: TextView.kt */
    public static final class C3695p implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ActionBlockEditActivity f9755a;

        public C3695p(ActionBlockEditActivity actionBlockEditActivity) {
            this.f9755a = actionBlockEditActivity;
        }

        public void afterTextChanged(Editable editable) {
            this.f9755a.mo27144b3().mo27195u(String.valueOf(editable));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$q */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3696q extends C13708q implements C16265l<Boolean, C13339u> {
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3696q(ActionBlockEditActivity actionBlockEditActivity) {
            super(1);
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: a */
        public final void mo27177a(boolean z) {
            this.this$0.m14543I3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27177a(((Boolean) obj).booleanValue());
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$r */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3697r extends C13708q implements C16254a<C13339u> {
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3697r(ActionBlockEditActivity actionBlockEditActivity) {
            super(0);
            this.this$0 = actionBlockEditActivity;
        }

        public final void invoke() {
            ActionBlockEditActivity.m14532C3(this.this$0, false, 1, (Object) null);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$s */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3698s extends C13708q implements C16254a<C13339u> {
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3698s(ActionBlockEditActivity actionBlockEditActivity) {
            super(0);
            this.this$0 = actionBlockEditActivity;
        }

        public final void invoke() {
            ActionBlockEditActivity.m14532C3(this.this$0, false, 1, (Object) null);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$t */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3699t extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3699t(ActionBlockEditActivity actionBlockEditActivity, C13635d<? super C3699t> dVar) {
            super(3, dVar);
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3699t(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.onBackPressed();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$u */
    /* compiled from: ActionBlockEditActivity.kt */
    public static final class C3700u implements ExpandableLayout.C15793c {

        /* renamed from: a */
        final /* synthetic */ ActionBlockEditActivity f9756a;

        C3700u(ActionBlockEditActivity actionBlockEditActivity) {
            this.f9756a = actionBlockEditActivity;
        }

        /* renamed from: a */
        public void mo27179a(float f, int i) {
            if (i == 0 || i == 3) {
                this.f9756a.m14540G3(true);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$v */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3701v extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3701v(AppCompatDialog appCompatDialog, C13635d<? super C3701v> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C3701v(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.$dialog.dismiss();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$w */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3702w extends C13708q implements C16265l<C1423a, C13339u> {
        final /* synthetic */ String $permissionRequired;
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$w$a */
        /* compiled from: ActionBlockEditActivity.kt */
        static final class C3703a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ ActionBlockEditActivity this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3703a(ActionBlockEditActivity actionBlockEditActivity, C13635d<? super C3703a> dVar) {
                super(3, dVar);
                this.this$0 = actionBlockEditActivity;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C3703a(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.m14540G3(false);
                    C7989a r2 = this.this$0.f9726D;
                    if (r2 == null) {
                        C13706o.m87945v("binding");
                        r2 = null;
                    }
                    r2.f19156F.mo75513c();
                    this.this$0.mo27142Z2().mo37358P();
                    this.this$0.mo27142Z2().mo37363x();
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$w$b */
        /* compiled from: ActionBlockEditActivity.kt */
        static final class C3704b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ ActionBlockEditActivity this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3704b(ActionBlockEditActivity actionBlockEditActivity, C13635d<? super C3704b> dVar) {
                super(3, dVar);
                this.this$0 = actionBlockEditActivity;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C3704b(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.mo27142Z2().mo37354F();
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3702w(String str, ActionBlockEditActivity actionBlockEditActivity) {
            super(1);
            this.$permissionRequired = str;
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: a */
        public final void mo27181a(C1423a aVar) {
            C13706o.m87929f(aVar, "it");
            if (aVar.mo16888b().contains(this.$permissionRequired)) {
                this.this$0.m14540G3(false);
                C7989a r2 = this.this$0.f9726D;
                if (r2 == null) {
                    C13706o.m87945v("binding");
                    r2 = null;
                }
                r2.f19156F.mo75515e();
                C7366i Z2 = this.this$0.mo27142Z2();
                ActionBlock q2 = this.this$0.f9728F;
                if (q2 == null) {
                    C13706o.m87945v("actionBlock");
                    q2 = null;
                }
                Z2.mo37353D(q2, this.this$0.f9744V);
                C7989a r22 = this.this$0.f9726D;
                if (r22 == null) {
                    C13706o.m87945v("binding");
                    r22 = null;
                }
                ImageView imageView = r22.f19191q;
                C13706o.m87928e(imageView, "binding.dismissButton");
                C4666m.m18147o(imageView, (C13640g) null, new C3703a(this.this$0, (C13635d<? super C3703a>) null), 1, (Object) null);
                this.this$0.mo27142Z2().mo37356L("com.arlosoft.macrodroid.ACTION_BLOCK_SHARE");
                C7989a r23 = this.this$0.f9726D;
                if (r23 == null) {
                    C13706o.m87945v("binding");
                    r23 = null;
                }
                Button button = r23.f19190p;
                C13706o.m87928e(button, "binding.deviceButton");
                C4666m.m18147o(button, (C13640g) null, new C3704b(this.this$0, (C13635d<? super C3704b>) null), 1, (Object) null);
                this.this$0.f9739Q = true;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27181a((C1423a) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$x */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3705x extends C13708q implements C16265l<SelectableItem, C13339u> {
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3705x(ActionBlockEditActivity actionBlockEditActivity) {
            super(1);
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: a */
        public final void mo27184a(SelectableItem selectableItem) {
            C13706o.m87929f(selectableItem, "item");
            ActionBlockEditActivity actionBlockEditActivity = this.this$0;
            ActionBlock q2 = actionBlockEditActivity.f9728F;
            if (q2 == null) {
                C13706o.m87945v("actionBlock");
                q2 = null;
            }
            actionBlockEditActivity.mo27139K3(selectableItem, q2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27184a((SelectableItem) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$y */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3706y extends C13708q implements C16265l<SelectableItem, C13339u> {
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3706y(ActionBlockEditActivity actionBlockEditActivity) {
            super(1);
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: a */
        public final void mo27185a(SelectableItem selectableItem) {
            C13706o.m87929f(selectableItem, "item");
            if (!(selectableItem instanceof ElseParentAction) && !(selectableItem instanceof EndIfAction)) {
                C4653z0 t2 = this.this$0.f9741S;
                if (t2 == null) {
                    C13706o.m87945v("topLevelEditHelper");
                    t2 = null;
                }
                t2.mo29101n(selectableItem);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27185a((SelectableItem) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$z */
    /* compiled from: ActionBlockEditActivity.kt */
    static final class C3707z extends C13708q implements C16265l<SelectableItem, C13339u> {
        final /* synthetic */ ActionBlockEditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3707z(ActionBlockEditActivity actionBlockEditActivity) {
            super(1);
            this.this$0 = actionBlockEditActivity;
        }

        /* renamed from: a */
        public final void mo27186a(SelectableItem selectableItem) {
            C13706o.m87929f(selectableItem, "item");
            C4653z0 t2 = this.this$0.f9741S;
            if (t2 == null) {
                C13706o.m87945v("topLevelEditHelper");
                t2 = null;
            }
            t2.mo29099l(selectableItem);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27186a((SelectableItem) obj);
            return C13339u.f61331a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public static final void m14529A3(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* renamed from: C3 */
    public static /* synthetic */ void m14532C3(ActionBlockEditActivity actionBlockEditActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        actionBlockEditActivity.mo27136B3(z);
    }

    /* renamed from: D2 */
    private final void m14533D2(ActionBlock actionBlock) {
        Iterator<Action> it = actionBlock.getActions().iterator();
        while (it.hasNext()) {
            Action next = it.next();
            next.mo25810V();
            for (Constraint V : next.mo27826J0()) {
                V.mo25810V();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: o1.a} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [com.arlosoft.macrodroid.macro.Macro] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: D3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14534D3(boolean r21) {
        /*
            r20 = this;
            r10 = r20
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r0 = r10.f9728F
            java.lang.String r11 = "actionBlock"
            r12 = 0
            if (r0 != 0) goto L_0x000d
            kotlin.jvm.internal.C13706o.m87945v(r11)
            r0 = r12
        L_0x000d:
            java.util.ArrayList r0 = r0.getActions()
            int r0 = r0.size()
            java.lang.String r1 = "binding.actionsList"
            r2 = 8
            java.lang.String r3 = "binding.noActionsText"
            r13 = 0
            java.lang.String r14 = "binding"
            if (r0 != 0) goto L_0x0043
            o1.a r0 = r10.f9726D
            if (r0 != 0) goto L_0x0028
            kotlin.jvm.internal.C13706o.m87945v(r14)
            r0 = r12
        L_0x0028:
            android.widget.TextView r0 = r0.f19157G
            kotlin.jvm.internal.C13706o.m87928e(r0, r3)
            r0.setVisibility(r13)
            o1.a r0 = r10.f9726D
            if (r0 != 0) goto L_0x0038
            kotlin.jvm.internal.C13706o.m87945v(r14)
            goto L_0x0039
        L_0x0038:
            r12 = r0
        L_0x0039:
            com.arlosoft.macrodroid.widget.SelectableItemsRecyclerView r0 = r12.f19181g
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            r0.setVisibility(r2)
            goto L_0x0180
        L_0x0043:
            o1.a r0 = r10.f9726D
            if (r0 != 0) goto L_0x004b
            kotlin.jvm.internal.C13706o.m87945v(r14)
            r0 = r12
        L_0x004b:
            android.widget.TextView r0 = r0.f19157G
            kotlin.jvm.internal.C13706o.m87928e(r0, r3)
            r0.setVisibility(r2)
            o1.a r0 = r10.f9726D
            if (r0 != 0) goto L_0x005b
            kotlin.jvm.internal.C13706o.m87945v(r14)
            r0 = r12
        L_0x005b:
            com.arlosoft.macrodroid.widget.SelectableItemsRecyclerView r0 = r0.f19181g
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            r0.setVisibility(r13)
            com.arlosoft.macrodroid.editscreen.q0<com.arlosoft.macrodroid.action.Action> r0 = r10.f9727E
            if (r0 == 0) goto L_0x006d
            boolean r0 = r0.mo29057N()
            r15 = r0
            goto L_0x006e
        L_0x006d:
            r15 = 0
        L_0x006e:
            com.arlosoft.macrodroid.editscreen.q0<com.arlosoft.macrodroid.action.Action> r0 = r10.f9727E
            r9 = 1
            java.lang.String r8 = "actionBlock.actions"
            if (r0 == 0) goto L_0x0092
            if (r21 == 0) goto L_0x0078
            goto L_0x0092
        L_0x0078:
            if (r0 == 0) goto L_0x008c
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r1 = r10.f9728F
            if (r1 != 0) goto L_0x0082
            kotlin.jvm.internal.C13706o.m87945v(r11)
            r1 = r12
        L_0x0082:
            java.util.ArrayList r1 = r1.getActions()
            kotlin.jvm.internal.C13706o.m87928e(r1, r8)
            r0.mo29067Z(r1)
        L_0x008c:
            r19 = r8
            r1 = 1
            r2 = 0
            goto L_0x013a
        L_0x0092:
            com.arlosoft.macrodroid.editscreen.q0 r7 = new com.arlosoft.macrodroid.editscreen.q0
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r0 = r10.f9728F
            if (r0 != 0) goto L_0x009d
            kotlin.jvm.internal.C13706o.m87945v(r11)
            r2 = r12
            goto L_0x009e
        L_0x009d:
            r2 = r0
        L_0x009e:
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r0 = r10.f9728F
            if (r0 != 0) goto L_0x00a6
            kotlin.jvm.internal.C13706o.m87945v(r11)
            r0 = r12
        L_0x00a6:
            java.util.ArrayList r3 = r0.getActions()
            kotlin.jvm.internal.C13706o.m87928e(r3, r8)
            com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$x r4 = new com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$x
            r4.<init>(r10)
            com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$y r5 = new com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$y
            r5.<init>(r10)
            com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$z r6 = new com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$z
            r6.<init>(r10)
            boolean r1 = r10.f9729G
            r16 = 1
            com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$a0 r0 = new com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity$a0
            r0.<init>(r10)
            r17 = r0
            r0 = r7
            r18 = r1
            r1 = r20
            r13 = r7
            r7 = r18
            r19 = r8
            r8 = r16
            r9 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f9727E = r13
            e6.m r0 = new e6.m
            r0.<init>()
            com.arlosoft.macrodroid.editscreen.q0<com.arlosoft.macrodroid.action.Action> r1 = r10.f9727E
            kotlin.jvm.internal.C13706o.m87926c(r1)
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r0.mo68422i(r1)
            java.lang.String r2 = "dragDropManager.createWr…Adapter(actionsAdapter!!)"
            kotlin.jvm.internal.C13706o.m87928e(r1, r2)
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r2.<init>(r10)
            o1.a r3 = r10.f9726D
            if (r3 != 0) goto L_0x00fa
            kotlin.jvm.internal.C13706o.m87945v(r14)
            r3 = r12
        L_0x00fa:
            com.arlosoft.macrodroid.widget.SelectableItemsRecyclerView r3 = r3.f19181g
            r3.setItemAnimator(r12)
            o1.a r3 = r10.f9726D
            if (r3 != 0) goto L_0x0107
            kotlin.jvm.internal.C13706o.m87945v(r14)
            r3 = r12
        L_0x0107:
            com.arlosoft.macrodroid.widget.SelectableItemsRecyclerView r3 = r3.f19181g
            r4 = 0
            r3.setNestedScrollingEnabled(r4)
            o1.a r3 = r10.f9726D
            if (r3 != 0) goto L_0x0115
            kotlin.jvm.internal.C13706o.m87945v(r14)
            r3 = r12
        L_0x0115:
            com.arlosoft.macrodroid.widget.SelectableItemsRecyclerView r3 = r3.f19181g
            r3.setLayoutManager(r2)
            o1.a r2 = r10.f9726D
            if (r2 != 0) goto L_0x0122
            kotlin.jvm.internal.C13706o.m87945v(r14)
            r2 = r12
        L_0x0122:
            com.arlosoft.macrodroid.widget.SelectableItemsRecyclerView r2 = r2.f19181g
            r2.setAdapter(r1)
            int r1 = com.arlosoft.macrodroid.C17532R$id.actionsList
            android.view.View r1 = r10.mo27145o2(r1)
            com.arlosoft.macrodroid.widget.SelectableItemsRecyclerView r1 = (com.arlosoft.macrodroid.widget.SelectableItemsRecyclerView) r1
            r0.mo68413a(r1)
            r1 = 1
            r0.mo68419d0(r1)
            r2 = 0
            r0.mo68412Z(r2)
        L_0x013a:
            com.arlosoft.macrodroid.editscreen.q0<com.arlosoft.macrodroid.action.Action> r0 = r10.f9727E
            if (r0 != 0) goto L_0x013f
            goto L_0x0159
        L_0x013f:
            if (r15 == 0) goto L_0x0155
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r3 = r10.f9728F
            if (r3 != 0) goto L_0x0149
            kotlin.jvm.internal.C13706o.m87945v(r11)
            r3 = r12
        L_0x0149:
            java.util.ArrayList r3 = r3.getActions()
            int r3 = r3.size()
            if (r3 <= r1) goto L_0x0155
            r13 = 1
            goto L_0x0156
        L_0x0155:
            r13 = 0
        L_0x0156:
            r0.mo29064W(r13)
        L_0x0159:
            int r0 = com.arlosoft.macrodroid.C17532R$id.reorderActionsButton
            android.view.View r0 = r10.mo27145o2(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            java.lang.String r1 = "reorderActionsButton"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            com.arlosoft.macrodroid.editscreen.q0<com.arlosoft.macrodroid.action.Action> r1 = r10.f9727E
            kotlin.jvm.internal.C13706o.m87926c(r1)
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r2 = r10.f9728F
            if (r2 != 0) goto L_0x0173
            kotlin.jvm.internal.C13706o.m87945v(r11)
            goto L_0x0174
        L_0x0173:
            r12 = r2
        L_0x0174:
            java.util.ArrayList r2 = r12.getActions()
            r3 = r19
            kotlin.jvm.internal.C13706o.m87928e(r2, r3)
            r10.m14545J3(r0, r1, r2)
        L_0x0180:
            com.arlosoft.macrodroid.common.SelectableItem r0 = r10.f9732J
            boolean r1 = r0 instanceof com.arlosoft.macrodroid.action.ConditionAction
            if (r1 == 0) goto L_0x0190
            java.lang.String r1 = "null cannot be cast to non-null type com.arlosoft.macrodroid.action.ConditionAction"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            com.arlosoft.macrodroid.action.ConditionAction r0 = (com.arlosoft.macrodroid.action.ConditionAction) r0
            r0.mo24876r3()
        L_0x0190:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity.m14534D3(boolean):void");
    }

    /* renamed from: E2 */
    private final void m14535E2(boolean z) {
        HashSet hashSet = new HashSet();
        ActionBlock actionBlock = this.f9728F;
        if (actionBlock == null) {
            C13706o.m87945v("actionBlock");
            actionBlock = null;
        }
        Iterator<Action> it = actionBlock.getActions().iterator();
        while (it.hasNext()) {
            Action next = it.next();
            String[] e1 = next.mo24700e1();
            hashSet.addAll(Arrays.asList(Arrays.copyOf(e1, e1.length)));
            if (!next.mo27876y1(this)) {
                return;
            }
        }
        if (Build.VERSION.SDK_INT < 23 || hashSet.size() == 0) {
            m14544J2(z);
            return;
        }
        Object[] array = hashSet.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        new C11102b((FragmentActivity) this).mo62231o((String[]) Arrays.copyOf(strArr, strArr.length)).mo79679I(C16971a.m100210a()).mo79685P(new C3726m(this, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public final void m14536E3() {
        runOnUiThread(new C3728o(this));
    }

    /* renamed from: F2 */
    static /* synthetic */ void m14537F2(ActionBlockEditActivity actionBlockEditActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        actionBlockEditActivity.m14535E2(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static final void m14538F3(ActionBlockEditActivity actionBlockEditActivity) {
        ActionBlock actionBlock;
        ActionBlock actionBlock2;
        ActionBlock actionBlock3;
        ActionBlockEditActivity actionBlockEditActivity2 = actionBlockEditActivity;
        C13706o.m87929f(actionBlockEditActivity2, "this$0");
        ActionBlock actionBlock4 = actionBlockEditActivity2.f9728F;
        C7989a aVar = null;
        if (actionBlock4 == null) {
            C13706o.m87945v("actionBlock");
            actionBlock = null;
        } else {
            actionBlock = actionBlock4;
        }
        boolean z = actionBlockEditActivity2.f9729G;
        Resources resources = actionBlockEditActivity.getResources();
        C13706o.m87928e(resources, "resources");
        actionBlockEditActivity2.f9734L = new LocalVarsAdapter(actionBlock, z, false, resources, true, new C3677b0(actionBlockEditActivity2), C3740z.INPUT);
        ActionBlock actionBlock5 = actionBlockEditActivity2.f9728F;
        if (actionBlock5 == null) {
            C13706o.m87945v("actionBlock");
            actionBlock5 = null;
        }
        int i = 0;
        List<MacroDroidVariable> inputOnlyActionBlockVariables = actionBlock5.getInputOnlyActionBlockVariables(false);
        C13696i0 i0Var = C13696i0.f61931a;
        String string = actionBlockEditActivity2.getString(C17541R$string.input_variables_with_count);
        C13706o.m87928e(string, "getString(R.string.input_variables_with_count)");
        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(inputOnlyActionBlockVariables.size())}, 1));
        C13706o.m87928e(format, "format(format, *args)");
        ((TextView) actionBlockEditActivity2.mo27145o2(C17532R$id.inputVariablesHeading)).setText(format);
        C7989a aVar2 = actionBlockEditActivity2.f9726D;
        if (aVar2 == null) {
            C13706o.m87945v("binding");
            aVar2 = null;
        }
        RecyclerView recyclerView = aVar2.f19198x;
        LocalVarsAdapter localVarsAdapter = actionBlockEditActivity2.f9734L;
        if (localVarsAdapter == null) {
            C13706o.m87945v("inputVarsAdapter");
            localVarsAdapter = null;
        }
        recyclerView.setAdapter(localVarsAdapter);
        C7989a aVar3 = actionBlockEditActivity2.f9726D;
        if (aVar3 == null) {
            C13706o.m87945v("binding");
            aVar3 = null;
        }
        aVar3.f19198x.setItemAnimator((RecyclerView.ItemAnimator) null);
        C7989a aVar4 = actionBlockEditActivity2.f9726D;
        if (aVar4 == null) {
            C13706o.m87945v("binding");
            aVar4 = null;
        }
        aVar4.f19198x.setNestedScrollingEnabled(false);
        C7989a aVar5 = actionBlockEditActivity2.f9726D;
        if (aVar5 == null) {
            C13706o.m87945v("binding");
            aVar5 = null;
        }
        TextView textView = aVar5.f19158H;
        C13706o.m87928e(textView, "binding.noInputVarsText");
        textView.setVisibility(inputOnlyActionBlockVariables.isEmpty() ? 0 : 8);
        C7989a aVar6 = actionBlockEditActivity2.f9726D;
        if (aVar6 == null) {
            C13706o.m87945v("binding");
            aVar6 = null;
        }
        RecyclerView recyclerView2 = aVar6.f19198x;
        C13706o.m87928e(recyclerView2, "binding.inputVarsList");
        C13706o.m87928e(inputOnlyActionBlockVariables, "inputVars");
        recyclerView2.setVisibility(inputOnlyActionBlockVariables.isEmpty() ^ true ? 0 : 8);
        ActionBlock actionBlock6 = actionBlockEditActivity2.f9728F;
        if (actionBlock6 == null) {
            C13706o.m87945v("actionBlock");
            actionBlock2 = null;
        } else {
            actionBlock2 = actionBlock6;
        }
        boolean z2 = actionBlockEditActivity2.f9729G;
        Resources resources2 = actionBlockEditActivity.getResources();
        C13706o.m87928e(resources2, "resources");
        actionBlockEditActivity2.f9735M = new LocalVarsAdapter(actionBlock2, z2, false, resources2, true, new C3679c0(actionBlockEditActivity2), C3740z.OUTPUT);
        ActionBlock actionBlock7 = actionBlockEditActivity2.f9728F;
        if (actionBlock7 == null) {
            C13706o.m87945v("actionBlock");
            actionBlock7 = null;
        }
        List<MacroDroidVariable> outputOnlyActionBlockVariables = actionBlock7.getOutputOnlyActionBlockVariables(false);
        C7989a aVar7 = actionBlockEditActivity2.f9726D;
        if (aVar7 == null) {
            C13706o.m87945v("binding");
            aVar7 = null;
        }
        TextView textView2 = aVar7.f19163M;
        String string2 = actionBlockEditActivity2.getString(C17541R$string.output_variables_with_count);
        C13706o.m87928e(string2, "getString(R.string.output_variables_with_count)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(outputOnlyActionBlockVariables.size())}, 1));
        C13706o.m87928e(format2, "format(format, *args)");
        textView2.setText(format2);
        C7989a aVar8 = actionBlockEditActivity2.f9726D;
        if (aVar8 == null) {
            C13706o.m87945v("binding");
            aVar8 = null;
        }
        RecyclerView recyclerView3 = aVar8.f19166P;
        LocalVarsAdapter localVarsAdapter2 = actionBlockEditActivity2.f9735M;
        if (localVarsAdapter2 == null) {
            C13706o.m87945v("outputVarsAdapter");
            localVarsAdapter2 = null;
        }
        recyclerView3.setAdapter(localVarsAdapter2);
        C7989a aVar9 = actionBlockEditActivity2.f9726D;
        if (aVar9 == null) {
            C13706o.m87945v("binding");
            aVar9 = null;
        }
        aVar9.f19166P.setItemAnimator((RecyclerView.ItemAnimator) null);
        C7989a aVar10 = actionBlockEditActivity2.f9726D;
        if (aVar10 == null) {
            C13706o.m87945v("binding");
            aVar10 = null;
        }
        aVar10.f19166P.setNestedScrollingEnabled(false);
        C7989a aVar11 = actionBlockEditActivity2.f9726D;
        if (aVar11 == null) {
            C13706o.m87945v("binding");
            aVar11 = null;
        }
        TextView textView3 = aVar11.f19160J;
        C13706o.m87928e(textView3, "binding.noOutputVarsText");
        textView3.setVisibility(outputOnlyActionBlockVariables.isEmpty() ? 0 : 8);
        C7989a aVar12 = actionBlockEditActivity2.f9726D;
        if (aVar12 == null) {
            C13706o.m87945v("binding");
            aVar12 = null;
        }
        RecyclerView recyclerView4 = aVar12.f19166P;
        C13706o.m87928e(recyclerView4, "binding.outputVarsList");
        C13706o.m87928e(outputOnlyActionBlockVariables, "outputVars");
        recyclerView4.setVisibility(outputOnlyActionBlockVariables.isEmpty() ^ true ? 0 : 8);
        ActionBlock actionBlock8 = actionBlockEditActivity2.f9728F;
        if (actionBlock8 == null) {
            C13706o.m87945v("actionBlock");
            actionBlock3 = null;
        } else {
            actionBlock3 = actionBlock8;
        }
        boolean z3 = actionBlockEditActivity2.f9729G;
        Resources resources3 = actionBlockEditActivity.getResources();
        C13706o.m87928e(resources3, "resources");
        actionBlockEditActivity2.f9736N = new LocalVarsAdapter(actionBlock3, z3, false, resources3, true, new C3681d0(actionBlockEditActivity2), C3740z.LOCAL_WORKING_VAR);
        ActionBlock actionBlock9 = actionBlockEditActivity2.f9728F;
        if (actionBlock9 == null) {
            C13706o.m87945v("actionBlock");
            actionBlock9 = null;
        }
        List<MacroDroidVariable> actionBlockWorkingVariables = actionBlock9.getActionBlockWorkingVariables(false);
        C7989a aVar13 = actionBlockEditActivity2.f9726D;
        if (aVar13 == null) {
            C13706o.m87945v("binding");
            aVar13 = null;
        }
        TextView textView4 = aVar13.f19151A;
        String string3 = actionBlockEditActivity2.getString(C17541R$string.working_variables_with_count);
        C13706o.m87928e(string3, "getString(R.string.working_variables_with_count)");
        String format3 = String.format(string3, Arrays.copyOf(new Object[]{Integer.valueOf(actionBlockWorkingVariables.size())}, 1));
        C13706o.m87928e(format3, "format(format, *args)");
        textView4.setText(format3);
        C7989a aVar14 = actionBlockEditActivity2.f9726D;
        if (aVar14 == null) {
            C13706o.m87945v("binding");
            aVar14 = null;
        }
        RecyclerView recyclerView5 = aVar14.f19154D;
        LocalVarsAdapter localVarsAdapter3 = actionBlockEditActivity2.f9736N;
        if (localVarsAdapter3 == null) {
            C13706o.m87945v("localVarsAdapter");
            localVarsAdapter3 = null;
        }
        recyclerView5.setAdapter(localVarsAdapter3);
        C7989a aVar15 = actionBlockEditActivity2.f9726D;
        if (aVar15 == null) {
            C13706o.m87945v("binding");
            aVar15 = null;
        }
        aVar15.f19154D.setItemAnimator((RecyclerView.ItemAnimator) null);
        C7989a aVar16 = actionBlockEditActivity2.f9726D;
        if (aVar16 == null) {
            C13706o.m87945v("binding");
            aVar16 = null;
        }
        aVar16.f19154D.setNestedScrollingEnabled(false);
        C7989a aVar17 = actionBlockEditActivity2.f9726D;
        if (aVar17 == null) {
            C13706o.m87945v("binding");
            aVar17 = null;
        }
        TextView textView5 = aVar17.f19159I;
        C13706o.m87928e(textView5, "binding.noLocalVarsText");
        textView5.setVisibility(actionBlockWorkingVariables.isEmpty() ? 0 : 8);
        C7989a aVar18 = actionBlockEditActivity2.f9726D;
        if (aVar18 == null) {
            C13706o.m87945v("binding");
        } else {
            aVar = aVar18;
        }
        RecyclerView recyclerView6 = aVar.f19154D;
        C13706o.m87928e(recyclerView6, "binding.localVarsList");
        C13706o.m87928e(actionBlockWorkingVariables, "localVars");
        if (!(!actionBlockWorkingVariables.isEmpty())) {
            i = 8;
        }
        recyclerView6.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public static final void m14539G2(ActionBlockEditActivity actionBlockEditActivity, boolean z, Boolean bool) {
        C13706o.m87929f(actionBlockEditActivity, "this$0");
        C13706o.m87928e(bool, "granted");
        if (bool.booleanValue()) {
            actionBlockEditActivity.m14544J2(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public final void m14540G3(boolean z) {
        C7989a aVar = this.f9726D;
        C7989a aVar2 = null;
        if (aVar == null) {
            C13706o.m87945v("binding");
            aVar = null;
        }
        aVar.f19194t.setLayoutTransition(new LayoutTransition());
        C7989a aVar3 = this.f9726D;
        if (aVar3 == null) {
            C13706o.m87945v("binding");
            aVar3 = null;
        }
        aVar3.f19162L.setLayoutTransition(new LayoutTransition());
        C7989a aVar4 = this.f9726D;
        if (aVar4 == null) {
            C13706o.m87945v("binding");
            aVar4 = null;
        }
        aVar4.f19174X.setLayoutTransition(new LayoutTransition());
        if (z) {
            C7989a aVar5 = this.f9726D;
            if (aVar5 == null) {
                C13706o.m87945v("binding");
                aVar5 = null;
            }
            aVar5.f19194t.getLayoutTransition().enableTransitionType(4);
            C7989a aVar6 = this.f9726D;
            if (aVar6 == null) {
                C13706o.m87945v("binding");
                aVar6 = null;
            }
            aVar6.f19162L.getLayoutTransition().enableTransitionType(4);
            C7989a aVar7 = this.f9726D;
            if (aVar7 == null) {
                C13706o.m87945v("binding");
            } else {
                aVar2 = aVar7;
            }
            aVar2.f19174X.getLayoutTransition().enableTransitionType(4);
            return;
        }
        C7989a aVar8 = this.f9726D;
        if (aVar8 == null) {
            C13706o.m87945v("binding");
            aVar8 = null;
        }
        aVar8.f19194t.getLayoutTransition().disableTransitionType(4);
        C7989a aVar9 = this.f9726D;
        if (aVar9 == null) {
            C13706o.m87945v("binding");
            aVar9 = null;
        }
        aVar9.f19162L.getLayoutTransition().disableTransitionType(4);
        C7989a aVar10 = this.f9726D;
        if (aVar10 == null) {
            C13706o.m87945v("binding");
        } else {
            aVar2 = aVar10;
        }
        aVar2.f19174X.getLayoutTransition().disableTransitionType(4);
    }

    /* renamed from: H2 */
    private final void m14541H2() {
        ActionBlock actionBlock = this.f9728F;
        ActionBlock actionBlock2 = null;
        if (actionBlock == null) {
            C13706o.m87945v("actionBlock");
            actionBlock = null;
        }
        Iterator<Trigger> it = actionBlock.getTriggerList().iterator();
        while (it.hasNext()) {
            it.next().mo27842c0();
        }
        ActionBlock actionBlock3 = this.f9728F;
        if (actionBlock3 == null) {
            C13706o.m87945v("actionBlock");
            actionBlock3 = null;
        }
        Iterator<Action> it2 = actionBlock3.getActions().iterator();
        while (it2.hasNext()) {
            it2.next().mo27842c0();
        }
        ActionBlock actionBlock4 = this.f9728F;
        if (actionBlock4 == null) {
            C13706o.m87945v("actionBlock");
        } else {
            actionBlock2 = actionBlock4;
        }
        for (Constraint c0 : actionBlock2.getConstraints()) {
            c0.mo27842c0();
        }
    }

    /* renamed from: I2 */
    private final void m14542I2(boolean z) {
        if (this.f9730H && z && !this.f9738P) {
            AdvertActivity.f9860D.mo27271a((Intent) null);
        }
        if (this.f9738P && this.f9731I) {
            Intent a = ActionBlockListActivity.f9803G.mo27228a(this, false);
            a.addFlags(131072);
            startActivity(a);
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public final void m14543I3(boolean z) {
        this.f9730H = z;
    }

    /* renamed from: J2 */
    private final void m14544J2(boolean z) {
        ActionBlockEditViewModel b3 = mo27144b3();
        ActionBlock actionBlock = this.f9728F;
        C7989a aVar = null;
        if (actionBlock == null) {
            C13706o.m87945v("actionBlock");
            actionBlock = null;
        }
        C7989a aVar2 = this.f9726D;
        if (aVar2 == null) {
            C13706o.m87945v("binding");
            aVar2 = null;
        }
        String obj = aVar2.f19178d.getText().toString();
        C7989a aVar3 = this.f9726D;
        if (aVar3 == null) {
            C13706o.m87945v("binding");
        } else {
            aVar = aVar3;
        }
        b3.mo27193s(actionBlock, obj, String.valueOf(aVar.f19188n.getText()), ((ExpandableLayout) mo27145o2(C17532R$id.descriptionExpandable)).mo75517g(), z);
    }

    /* renamed from: J3 */
    private final <T extends SelectableItem> void m14545J3(ImageButton imageButton, C4633q0<T> q0Var, List<? extends SelectableItem> list) {
        int i = 0;
        imageButton.setSelected(false);
        if (!(q0Var.getItemCount() >= 2)) {
            i = 8;
        }
        imageButton.setVisibility(i);
        C4666m.m18147o(imageButton, (C13640g) null, new C3683e0(q0Var, imageButton, (C13635d<? super C3683e0>) null), 1, (Object) null);
        list.size();
    }

    /* renamed from: K2 */
    private final void m14546K2() {
        C7989a aVar = this.f9726D;
        if (aVar == null) {
            C13706o.m87945v("binding");
            aVar = null;
        }
        String obj = aVar.f19178d.getText().toString();
        ActionBlock actionBlock = this.f9728F;
        if (actionBlock == null) {
            C13706o.m87945v("actionBlock");
            actionBlock = null;
        }
        if (!C13706o.m87924a(obj, actionBlock.getName())) {
            C7989a aVar2 = this.f9726D;
            if (aVar2 == null) {
                C13706o.m87945v("binding");
                aVar2 = null;
            }
            EditText editText = aVar2.f19178d;
            ActionBlock actionBlock2 = this.f9728F;
            if (actionBlock2 == null) {
                C13706o.m87945v("actionBlock");
                actionBlock2 = null;
            }
            editText.setText(actionBlock2.getName());
        }
        C7989a aVar3 = this.f9726D;
        if (aVar3 == null) {
            C13706o.m87945v("binding");
            aVar3 = null;
        }
        String valueOf = String.valueOf(aVar3.f19188n.getText());
        ActionBlock actionBlock3 = this.f9728F;
        if (actionBlock3 == null) {
            C13706o.m87945v("actionBlock");
            actionBlock3 = null;
        }
        if (!C13706o.m87924a(valueOf, actionBlock3.getDescription())) {
            C7989a aVar4 = this.f9726D;
            if (aVar4 == null) {
                C13706o.m87945v("binding");
                aVar4 = null;
            }
            AppCompatEditText appCompatEditText = aVar4.f19188n;
            ActionBlock actionBlock4 = this.f9728F;
            if (actionBlock4 == null) {
                C13706o.m87945v("actionBlock");
                actionBlock4 = null;
            }
            appCompatEditText.setText(actionBlock4.getDescription());
        }
        ActionBlock actionBlock5 = this.f9728F;
        if (actionBlock5 == null) {
            C13706o.m87945v("actionBlock");
            actionBlock5 = null;
        }
        if (actionBlock5.isDescriptionOpen()) {
            ((ExpandableLayout) mo27145o2(C17532R$id.descriptionExpandable)).mo75516f(false);
        } else {
            ((ExpandableLayout) mo27145o2(C17532R$id.descriptionExpandable)).mo75514d(false);
        }
        C7989a aVar5 = this.f9726D;
        if (aVar5 == null) {
            C13706o.m87945v("binding");
            aVar5 = null;
        }
        aVar5.f19181g.addItemDecoration(new C4007e1(getApplicationContext(), C17530R$drawable.line_divider_edit_macro));
        C7989a aVar6 = this.f9726D;
        if (aVar6 == null) {
            C13706o.m87945v("binding");
            aVar6 = null;
        }
        EditText editText2 = aVar6.f19178d;
        C13706o.m87928e(editText2, "binding.actionBlockNameText");
        C4666m.m18138f(editText2, new C3678c(this));
        C7989a aVar7 = this.f9726D;
        if (aVar7 == null) {
            C13706o.m87945v("binding");
            aVar7 = null;
        }
        AppCompatEditText appCompatEditText2 = aVar7.f19188n;
        C13706o.m87928e(appCompatEditText2, "binding.description");
        C4666m.m18138f(appCompatEditText2, new C3680d(this));
        C7989a aVar8 = this.f9726D;
        if (aVar8 == null) {
            C13706o.m87945v("binding");
            aVar8 = null;
        }
        ImageButton imageButton = aVar8.f19182h;
        C13706o.m87928e(imageButton, "binding.addActionButton");
        C4666m.m18147o(imageButton, (C13640g) null, new C3682e(this, (C13635d<? super C3682e>) null), 1, (Object) null);
        m14536E3();
        C7989a aVar9 = this.f9726D;
        if (aVar9 == null) {
            C13706o.m87945v("binding");
            aVar9 = null;
        }
        ImageButton imageButton2 = aVar9.f19183i;
        C13706o.m87928e(imageButton2, "binding.addInputVariableButton");
        C4666m.m18147o(imageButton2, (C13640g) null, new C3684f(this, (C13635d<? super C3684f>) null), 1, (Object) null);
        C7989a aVar10 = this.f9726D;
        if (aVar10 == null) {
            C13706o.m87945v("binding");
            aVar10 = null;
        }
        ImageButton imageButton3 = aVar10.f19185k;
        C13706o.m87928e(imageButton3, "binding.addOutputVariableButton");
        C4666m.m18147o(imageButton3, (C13640g) null, new C3686g(this, (C13635d<? super C3686g>) null), 1, (Object) null);
        C7989a aVar11 = this.f9726D;
        if (aVar11 == null) {
            C13706o.m87945v("binding");
            aVar11 = null;
        }
        ImageButton imageButton4 = aVar11.f19184j;
        C13706o.m87928e(imageButton4, "binding.addLocalVariableButton");
        C4666m.m18147o(imageButton4, (C13640g) null, new C3687h(this, (C13635d<? super C3687h>) null), 1, (Object) null);
        C7989a aVar12 = this.f9726D;
        if (aVar12 == null) {
            C13706o.m87945v("binding");
            aVar12 = null;
        }
        ImageButton imageButton5 = aVar12.f19167Q;
        C13706o.m87928e(imageButton5, "binding.pasteActionButton");
        C4666m.m18147o(imageButton5, (C13640g) null, new C3688i(this, (C13635d<? super C3688i>) null), 1, (Object) null);
        C7989a aVar13 = this.f9726D;
        if (aVar13 == null) {
            C13706o.m87945v("binding");
            aVar13 = null;
        }
        FrameLayout frameLayout = aVar13.f19197w;
        C13706o.m87928e(frameLayout, "binding.inputVarsContent");
        ActionBlock actionBlock6 = this.f9728F;
        if (actionBlock6 == null) {
            C13706o.m87945v("actionBlock");
            actionBlock6 = null;
        }
        int i = 8;
        frameLayout.setVisibility(actionBlock6.isInputExpanded() ? 0 : 8);
        C7989a aVar14 = this.f9726D;
        if (aVar14 == null) {
            C13706o.m87945v("binding");
            aVar14 = null;
        }
        FrameLayout frameLayout2 = aVar14.f19165O;
        C13706o.m87928e(frameLayout2, "binding.outputVarsContent");
        ActionBlock actionBlock7 = this.f9728F;
        if (actionBlock7 == null) {
            C13706o.m87945v("actionBlock");
            actionBlock7 = null;
        }
        frameLayout2.setVisibility(actionBlock7.isOutputExpanded() ? 0 : 8);
        C7989a aVar15 = this.f9726D;
        if (aVar15 == null) {
            C13706o.m87945v("binding");
            aVar15 = null;
        }
        FrameLayout frameLayout3 = aVar15.f19153C;
        C13706o.m87928e(frameLayout3, "binding.localVarsContent");
        ActionBlock actionBlock8 = this.f9728F;
        if (actionBlock8 == null) {
            C13706o.m87945v("actionBlock");
            actionBlock8 = null;
        }
        if (actionBlock8.isLocalExpanded()) {
            i = 0;
        }
        frameLayout3.setVisibility(i);
        C7989a aVar16 = this.f9726D;
        if (aVar16 == null) {
            C13706o.m87945v("binding");
            aVar16 = null;
        }
        ImageButton imageButton6 = aVar16.f19193s;
        ActionBlock actionBlock9 = this.f9728F;
        if (actionBlock9 == null) {
            C13706o.m87945v("actionBlock");
            actionBlock9 = null;
        }
        float f = 180.0f;
        imageButton6.setRotation(actionBlock9.isInputExpanded() ? 180.0f : 0.0f);
        C7989a aVar17 = this.f9726D;
        if (aVar17 == null) {
            C13706o.m87945v("binding");
            aVar17 = null;
        }
        ImageButton imageButton7 = aVar17.f19161K;
        ActionBlock actionBlock10 = this.f9728F;
        if (actionBlock10 == null) {
            C13706o.m87945v("actionBlock");
            actionBlock10 = null;
        }
        imageButton7.setRotation(actionBlock10.isOutputExpanded() ? 180.0f : 0.0f);
        C7989a aVar18 = this.f9726D;
        if (aVar18 == null) {
            C13706o.m87945v("binding");
            aVar18 = null;
        }
        ImageButton imageButton8 = aVar18.f19199y;
        ActionBlock actionBlock11 = this.f9728F;
        if (actionBlock11 == null) {
            C13706o.m87945v("actionBlock");
            actionBlock11 = null;
        }
        if (!actionBlock11.isLocalExpanded()) {
            f = 0.0f;
        }
        imageButton8.setRotation(f);
        C7989a aVar19 = this.f9726D;
        if (aVar19 == null) {
            C13706o.m87945v("binding");
            aVar19 = null;
        }
        ImageButton imageButton9 = aVar19.f19193s;
        C13706o.m87928e(imageButton9, "binding.inputCollapseExpandButton");
        C4666m.m18147o(imageButton9, (C13640g) null, new C3689j(this, (C13635d<? super C3689j>) null), 1, (Object) null);
        C7989a aVar20 = this.f9726D;
        if (aVar20 == null) {
            C13706o.m87945v("binding");
            aVar20 = null;
        }
        ImageButton imageButton10 = aVar20.f19161K;
        C13706o.m87928e(imageButton10, "binding.outputCollapseExpandButton");
        C4666m.m18147o(imageButton10, (C13640g) null, new C3690k(this, (C13635d<? super C3690k>) null), 1, (Object) null);
        C7989a aVar21 = this.f9726D;
        if (aVar21 == null) {
            C13706o.m87945v("binding");
            aVar21 = null;
        }
        ImageButton imageButton11 = aVar21.f19199y;
        C13706o.m87928e(imageButton11, "binding.localCollapseExpandButton");
        C4666m.m18147o(imageButton11, (C13640g) null, new C3676b(this, (C13635d<? super C3676b>) null), 1, (Object) null);
        ((FloatingActionButton) mo27145o2(C17532R$id.acceptButton)).setOnClickListener(new C3721h(this));
        C4633q0<Action> q0Var = this.f9727E;
        if (q0Var != null) {
            q0Var.mo29064W(false);
        }
        m14532C3(this, false, 1, (Object) null);
        m14558Q3();
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m14547L2(ActionBlockEditActivity actionBlockEditActivity, View view) {
        C13706o.m87929f(actionBlockEditActivity, "this$0");
        if (actionBlockEditActivity.m14581d3()) {
            m14537F2(actionBlockEditActivity, false, 1, (Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.arlosoft.macrodroid.editscreen.z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.arlosoft.macrodroid.editscreen.z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.arlosoft.macrodroid.editscreen.z0} */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.arlosoft.macrodroid.macro.Macro] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13, types: [com.arlosoft.macrodroid.macro.Macro] */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v15, types: [com.arlosoft.macrodroid.macro.Macro] */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m14548L3(com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity r9, java.lang.String[] r10, com.arlosoft.macrodroid.common.SelectableItem r11, com.arlosoft.macrodroid.macro.Macro r12, android.content.DialogInterface r13, int r14) {
        /*
            java.lang.Class<com.arlosoft.macrodroid.selectableitemlist.AddActionActivity> r13 = com.arlosoft.macrodroid.selectableitemlist.AddActionActivity.class
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            java.lang.String r0 = "$optionsToShow"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            java.lang.String r0 = "$item"
            kotlin.jvm.internal.C13706o.m87929f(r11, r0)
            java.lang.String r0 = "$macro"
            kotlin.jvm.internal.C13706o.m87929f(r12, r0)
            r0 = 0
            r9.f9740R = r0
            r10 = r10[r14]
            r14 = 2131952388(0x7f130304, float:1.9541217E38)
            java.lang.String r14 = r9.getString(r14)
            boolean r14 = kotlin.jvm.internal.C13706o.m87924a(r10, r14)
            java.lang.String r1 = "ParentGUID"
            java.lang.String r2 = "MacroId"
            java.lang.String r3 = "actionBlock"
            if (r14 == 0) goto L_0x0051
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r9, r13)
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r12 = r9.f9728F
            if (r12 != 0) goto L_0x003b
            kotlin.jvm.internal.C13706o.m87945v(r3)
            goto L_0x003c
        L_0x003b:
            r0 = r12
        L_0x003c:
            int r12 = r0.getId()
            r10.putExtra(r2, r12)
            long r11 = r11.mo27847f1()
            r10.putExtra(r1, r11)
            r11 = 503(0x1f7, float:7.05E-43)
            r9.startActivityForResult(r10, r11)
            goto L_0x0459
        L_0x0051:
            r14 = 2131954553(0x7f130b79, float:1.9545608E38)
            java.lang.String r14 = r9.getString(r14)
            boolean r14 = kotlin.jvm.internal.C13706o.m87924a(r10, r14)
            java.lang.String r4 = "null cannot be cast to non-null type com.arlosoft.macrodroid.action.Action"
            r5 = 0
            r6 = 1
            if (r14 == 0) goto L_0x00e8
            com.arlosoft.macrodroid.common.SelectableItem r10 = com.arlosoft.macrodroid.utils.C6421r.m24721b()
            if (r10 == 0) goto L_0x0071
            com.arlosoft.macrodroid.common.SelectableItem r10 = com.arlosoft.macrodroid.utils.C6421r.m24721b()
            java.util.List r10 = kotlin.collections.C13612s.m87736e(r10)
            goto L_0x0075
        L_0x0071:
            java.util.List r10 = com.arlosoft.macrodroid.utils.C6421r.m24723d()
        L_0x0075:
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r12 = r9.f9728F
            if (r12 != 0) goto L_0x007d
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r12 = r0
        L_0x007d:
            java.util.ArrayList r12 = r12.getActions()
            int r12 = r12.size()
            r13 = 0
        L_0x0086:
            if (r13 >= r12) goto L_0x00de
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r14 = r9.f9728F
            if (r14 != 0) goto L_0x0090
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r14 = r0
        L_0x0090:
            java.util.ArrayList r14 = r14.getActions()
            java.lang.Object r14 = r14.get(r13)
            com.arlosoft.macrodroid.action.Action r14 = (com.arlosoft.macrodroid.action.Action) r14
            long r1 = r14.mo27847f1()
            long r7 = r11.mo27847f1()
            int r14 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r14 != 0) goto L_0x00db
            java.lang.String r11 = "copyItems"
            kotlin.jvm.internal.C13706o.m87928e(r10, r11)
            java.util.List r10 = kotlin.collections.C13566b0.m87444s0(r10)
            java.util.Iterator r10 = r10.iterator()
        L_0x00b3:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00de
            java.lang.Object r11 = r10.next()
            com.arlosoft.macrodroid.common.SelectableItem r11 = (com.arlosoft.macrodroid.common.SelectableItem) r11
            kotlin.jvm.internal.C13706o.m87927d(r11, r4)
            com.arlosoft.macrodroid.action.Action r11 = (com.arlosoft.macrodroid.action.Action) r11
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r12 = r9.f9728F
            if (r12 != 0) goto L_0x00cc
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r12 = r0
        L_0x00cc:
            r12.addActionAtIndex(r11, r13)
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r12 = r9.f9728F
            if (r12 != 0) goto L_0x00d7
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r12 = r0
        L_0x00d7:
            r11.mo24687G2(r12)
            goto L_0x00b3
        L_0x00db:
            int r13 = r13 + 1
            goto L_0x0086
        L_0x00de:
            com.arlosoft.macrodroid.utils.C6421r.m24725f()
            r9.f9730H = r6
            m14532C3(r9, r5, r6, r0)
            goto L_0x0459
        L_0x00e8:
            r14 = 2131952383(0x7f1302ff, float:1.9541207E38)
            java.lang.String r14 = r9.getString(r14)
            boolean r14 = kotlin.jvm.internal.C13706o.m87924a(r10, r14)
            if (r14 == 0) goto L_0x011a
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r9, r13)
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r12 = r9.f9728F
            if (r12 != 0) goto L_0x0102
            kotlin.jvm.internal.C13706o.m87945v(r3)
            goto L_0x0103
        L_0x0102:
            r0 = r12
        L_0x0103:
            int r12 = r0.getId()
            r10.putExtra(r2, r12)
            long r11 = r11.mo27847f1()
            java.lang.String r13 = "ParentGUIDInsert"
            r10.putExtra(r13, r11)
            r11 = 501(0x1f5, float:7.02E-43)
            r9.startActivityForResult(r10, r11)
            goto L_0x0459
        L_0x011a:
            r13 = 2131952391(0x7f130307, float:1.9541223E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x014c
            android.content.Intent r10 = new android.content.Intent
            java.lang.Class<com.arlosoft.macrodroid.selectableitemlist.AddConstraintActivity> r12 = com.arlosoft.macrodroid.selectableitemlist.AddConstraintActivity.class
            r10.<init>(r9, r12)
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r12 = r9.f9728F
            if (r12 != 0) goto L_0x0136
            kotlin.jvm.internal.C13706o.m87945v(r3)
            goto L_0x0137
        L_0x0136:
            r0 = r12
        L_0x0137:
            int r12 = r0.getId()
            r10.putExtra(r2, r12)
            long r11 = r11.mo27847f1()
            r10.putExtra(r1, r11)
            r11 = 502(0x1f6, float:7.03E-43)
            r9.startActivityForResult(r10, r11)
            goto L_0x0459
        L_0x014c:
            r13 = 2131952690(0x7f130432, float:1.954183E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x0161
            r11.mo27877y2(r9)
            r11.mo25540W1()
            goto L_0x0459
        L_0x0161:
            r13 = 2131955055(0x7f130d6f, float:1.9546627E38)
            java.lang.String r14 = r9.getString(r13)
            boolean r14 = kotlin.jvm.internal.C13706o.m87924a(r10, r14)
            java.lang.String r1 = ""
            if (r14 == 0) goto L_0x0192
            java.util.List r9 = kotlin.collections.C13614t.m87748j()
            java.util.List r10 = kotlin.collections.C13614t.m87748j()
            com.arlosoft.macrodroid.common.SelectableItem r9 = com.arlosoft.macrodroid.utils.C6421r.m24722c(r11, r9, r10)
            kotlin.jvm.internal.C13706o.m87927d(r9, r4)
            com.arlosoft.macrodroid.action.Action r9 = (com.arlosoft.macrodroid.action.Action) r9
            com.arlosoft.macrodroid.macro.Macro r10 = r11.mo27837X0()
            r9.mo24687G2(r10)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r10 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            r10.<init>((java.lang.String) r1)
            r9.mo24703h3(r10)
            goto L_0x0459
        L_0x0192:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r13 = r9.getString(r13)
            r14.append(r13)
            java.lang.String r13 = " ("
            r14.append(r13)
            r13 = 2131955057(0x7f130d71, float:1.954663E38)
            java.lang.String r13 = r9.getString(r13)
            r14.append(r13)
            r13 = 41
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x01c8
            com.arlosoft.macrodroid.action.Action r11 = (com.arlosoft.macrodroid.action.Action) r11
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r9 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            r9.<init>((java.lang.String) r1)
            r11.mo24704i3(r9)
            goto L_0x0459
        L_0x01c8:
            r13 = 2131955056(0x7f130d70, float:1.9546629E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x01dc
            com.arlosoft.macrodroid.triggers.Trigger r11 = (com.arlosoft.macrodroid.triggers.Trigger) r11
            r11.mo31547e3()
            goto L_0x0459
        L_0x01dc:
            r13 = 2131953819(0x7f13089b, float:1.954412E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            java.lang.String r14 = "topLevelEditHelper"
            if (r13 == 0) goto L_0x01f9
            com.arlosoft.macrodroid.editscreen.z0 r9 = r9.f9741S
            if (r9 != 0) goto L_0x01f3
            kotlin.jvm.internal.C13706o.m87945v(r14)
            goto L_0x01f4
        L_0x01f3:
            r0 = r9
        L_0x01f4:
            r0.mo29101n(r11)
            goto L_0x0459
        L_0x01f9:
            r13 = 2131954555(0x7f130b7b, float:1.9545613E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x024d
            com.arlosoft.macrodroid.common.SelectableItem r10 = com.arlosoft.macrodroid.utils.C6421r.m24721b()
            java.lang.String r12 = "null cannot be cast to non-null type com.arlosoft.macrodroid.constraint.Constraint"
            kotlin.jvm.internal.C13706o.m87927d(r10, r12)
            com.arlosoft.macrodroid.constraint.Constraint r10 = (com.arlosoft.macrodroid.constraint.Constraint) r10
            r11.mo27834R(r10)
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r12 = r9.f9728F
            if (r12 != 0) goto L_0x021c
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r12 = r0
        L_0x021c:
            r10.mo24687G2(r12)
            boolean r12 = r10 instanceof com.arlosoft.macrodroid.constraint.LogicConstraint
            if (r12 == 0) goto L_0x0243
            java.util.List r12 = r10.mo27826J0()
            java.lang.String r13 = "constraint.getConstraints()"
            kotlin.jvm.internal.C13706o.m87928e(r12, r13)
            boolean r12 = r9.m14619x3(r5, r12)
            if (r12 == 0) goto L_0x0243
            r11.mo27849i0(r10)
            android.content.Context r10 = r9.getApplicationContext()
            r11 = 2131952565(0x7f1303b5, float:1.9541576E38)
            android.widget.Toast r10 = p319lc.C15626c.makeText(r10, r11, r5)
            r10.show()
        L_0x0243:
            com.arlosoft.macrodroid.utils.C6421r.m24725f()
            r9.f9730H = r6
            m14532C3(r9, r5, r6, r0)
            goto L_0x0459
        L_0x024d:
            r13 = 2131955624(0x7f130fa8, float:1.954778E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            r1 = 2131952961(0x7f130541, float:1.954238E38)
            if (r13 == 0) goto L_0x028d
            boolean r10 = r11 instanceof com.arlosoft.macrodroid.action.ParentAction
            if (r10 == 0) goto L_0x0270
            com.arlosoft.macrodroid.editscreen.z0 r10 = r9.f9741S
            if (r10 != 0) goto L_0x0269
            kotlin.jvm.internal.C13706o.m87945v(r14)
            r10 = r0
        L_0x0269:
            r13 = r11
            com.arlosoft.macrodroid.action.ParentAction r13 = (com.arlosoft.macrodroid.action.ParentAction) r13
            r10.mo29097f(r13, r12)
            goto L_0x0273
        L_0x0270:
            com.arlosoft.macrodroid.utils.C6421r.m24726g(r11)
        L_0x0273:
            android.content.Context r10 = r9.getApplicationContext()
            android.widget.Toast r10 = p319lc.C15626c.makeText(r10, r1, r5)
            r10.show()
            r9.m14558Q3()
            r12.removeItem(r11)
            r9.f9732J = r0
            r9.f9730H = r6
            m14532C3(r9, r5, r6, r0)
            goto L_0x0459
        L_0x028d:
            r13 = 2131951859(0x7f1300f3, float:1.9540144E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x02c0
            boolean r10 = r11 instanceof com.arlosoft.macrodroid.action.ParentAction
            if (r10 == 0) goto L_0x02ad
            com.arlosoft.macrodroid.editscreen.z0 r10 = r9.f9741S
            if (r10 != 0) goto L_0x02a6
            kotlin.jvm.internal.C13706o.m87945v(r14)
            goto L_0x02a7
        L_0x02a6:
            r0 = r10
        L_0x02a7:
            com.arlosoft.macrodroid.action.ParentAction r11 = (com.arlosoft.macrodroid.action.ParentAction) r11
            r0.mo29097f(r11, r12)
            goto L_0x02b0
        L_0x02ad:
            com.arlosoft.macrodroid.utils.C6421r.m24726g(r11)
        L_0x02b0:
            android.content.Context r10 = r9.getApplicationContext()
            android.widget.Toast r10 = p319lc.C15626c.makeText(r10, r1, r5)
            r10.show()
            r9.m14558Q3()
            goto L_0x0459
        L_0x02c0:
            r13 = 2131953020(0x7f13057c, float:1.95425E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x02e1
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r10 = r9.f9728F
            if (r10 != 0) goto L_0x02d5
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r10 = r0
        L_0x02d5:
            r10.removeItem(r11)
            r9.f9732J = r0
            r9.f9730H = r6
            m14532C3(r9, r5, r6, r0)
            goto L_0x0459
        L_0x02e1:
            r13 = 2131953029(0x7f130585, float:1.9542517E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x02f5
            com.arlosoft.macrodroid.action.ParentAction r11 = (com.arlosoft.macrodroid.action.ParentAction) r11
            r9.m14557Q2(r11)
            goto L_0x0459
        L_0x02f5:
            r13 = 2131952395(0x7f13030b, float:1.9541232E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            r1 = -1
            java.lang.String r2 = "macro.actions"
            if (r13 == 0) goto L_0x0347
            java.util.ArrayList r10 = r12.getActions()
            kotlin.jvm.internal.C13706o.m87928e(r10, r2)
            int r10 = kotlin.collections.C13566b0.m87427b0(r10, r11)
            java.util.ArrayList r11 = r12.getActions()
            int r11 = com.arlosoft.macrodroid.utils.C6416p0.m24705b(r11, r10)
            java.util.ArrayList r13 = r12.getActions()
            int r10 = com.arlosoft.macrodroid.utils.C6416p0.m24704a(r13, r10)
            com.arlosoft.macrodroid.action.ElseIfConditionAction r13 = new com.arlosoft.macrodroid.action.ElseIfConditionAction
            r13.<init>()
            r9.f9740R = r13
            r9.f9732J = r13
            if (r10 == r1) goto L_0x032c
            r11 = r10
        L_0x032c:
            r12.addActionAtIndex(r13, r11)
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r10 = r9.f9728F
            if (r10 != 0) goto L_0x0337
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r10 = r0
        L_0x0337:
            r13.mo24687G2(r10)
            r13.mo27877y2(r9)
            r13.mo25540W1()
            r9.f9730H = r6
            m14532C3(r9, r5, r6, r0)
            goto L_0x0459
        L_0x0347:
            r13 = 2131952396(0x7f13030c, float:1.9541234E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x0396
            java.util.ArrayList r10 = r12.getActions()
            kotlin.jvm.internal.C13706o.m87928e(r10, r2)
            int r10 = kotlin.collections.C13566b0.m87427b0(r10, r11)
            java.util.ArrayList r11 = r12.getActions()
            int r11 = com.arlosoft.macrodroid.utils.C6416p0.m24705b(r11, r10)
            java.util.ArrayList r13 = r12.getActions()
            int r10 = com.arlosoft.macrodroid.utils.C6416p0.m24704a(r13, r10)
            com.arlosoft.macrodroid.action.ElseIfConfirmedThenAction r13 = new com.arlosoft.macrodroid.action.ElseIfConfirmedThenAction
            r13.<init>()
            r9.f9740R = r13
            r9.f9732J = r13
            if (r10 == r1) goto L_0x037b
            r11 = r10
        L_0x037b:
            r12.addActionAtIndex(r13, r11)
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r10 = r9.f9728F
            if (r10 != 0) goto L_0x0386
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r10 = r0
        L_0x0386:
            r13.mo24687G2(r10)
            r13.mo27877y2(r9)
            r13.mo25540W1()
            r9.f9730H = r6
            m14532C3(r9, r5, r6, r0)
            goto L_0x0459
        L_0x0396:
            r13 = 2131952394(0x7f13030a, float:1.954123E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x03c5
            java.util.ArrayList r10 = r12.getActions()
            kotlin.jvm.internal.C13706o.m87928e(r10, r2)
            int r10 = kotlin.collections.C13566b0.m87427b0(r10, r11)
            java.util.ArrayList r11 = r12.getActions()
            int r10 = com.arlosoft.macrodroid.utils.C6416p0.m24705b(r11, r10)
            com.arlosoft.macrodroid.action.ElseAction r11 = new com.arlosoft.macrodroid.action.ElseAction
            r11.<init>()
            r12.addActionAtIndex(r11, r10)
            r9.f9730H = r6
            m14532C3(r9, r5, r6, r0)
            goto L_0x0459
        L_0x03c5:
            r13 = 2131953126(0x7f1305e6, float:1.9542714E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x03e5
            r9.f9730H = r6
            r11.mo27818D2(r6)
            boolean r10 = r11 instanceof com.arlosoft.macrodroid.action.ParentAction
            if (r10 == 0) goto L_0x03e0
            com.arlosoft.macrodroid.action.Action r11 = (com.arlosoft.macrodroid.action.Action) r11
            r12.enableParentItem(r11)
        L_0x03e0:
            m14532C3(r9, r5, r6, r0)
            goto L_0x0459
        L_0x03e5:
            r13 = 2131953130(0x7f1305ea, float:1.9542722E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x03fd
            r9.f9730H = r6
            com.arlosoft.macrodroid.action.Action r11 = (com.arlosoft.macrodroid.action.Action) r11
            r12.enableOrDisableItemAndChildren(r11, r6)
            m14532C3(r9, r5, r6, r0)
            goto L_0x0459
        L_0x03fd:
            r13 = 2131953057(0x7f1305a1, float:1.9542574E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x0413
            r9.f9730H = r6
            r11.mo27818D2(r5)
            m14532C3(r9, r5, r6, r0)
            goto L_0x0459
        L_0x0413:
            r13 = 2131953058(0x7f1305a2, float:1.9542576E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x042b
            r9.f9730H = r6
            com.arlosoft.macrodroid.action.Action r11 = (com.arlosoft.macrodroid.action.Action) r11
            r12.enableOrDisableItemAndChildren(r11, r5)
            m14532C3(r9, r5, r6, r0)
            goto L_0x0459
        L_0x042b:
            r12 = 2131952389(0x7f130305, float:1.954122E38)
            java.lang.String r13 = r9.getString(r12)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 != 0) goto L_0x0445
            r13 = 2131953106(0x7f1305d2, float:1.9542674E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x0459
        L_0x0445:
            com.arlosoft.macrodroid.editscreen.z0 r13 = r9.f9741S
            if (r13 != 0) goto L_0x044d
            kotlin.jvm.internal.C13706o.m87945v(r14)
            goto L_0x044e
        L_0x044d:
            r0 = r13
        L_0x044e:
            java.lang.String r9 = r9.getString(r12)
            boolean r9 = kotlin.jvm.internal.C13706o.m87924a(r10, r9)
            r0.mo29098g(r11, r10, r9)
        L_0x0459:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity.m14548L3(com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity, java.lang.String[], com.arlosoft.macrodroid.common.SelectableItem, com.arlosoft.macrodroid.macro.Macro, android.content.DialogInterface, int):void");
    }

    /* renamed from: M2 */
    private final void m14549M2() {
        mo27144b3().mo27188o().observe(this, new C3723j(this));
        mo27144b3().mo27191q().observe(this, new C3724k(this));
        mo27144b3().mo27190p().observe(this, new C3722i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public final void m14550M3(MacroDroidVariable macroDroidVariable) {
        C6520o0 o0Var = C6520o0.f15162a;
        ActionBlock actionBlock = this.f9728F;
        if (actionBlock == null) {
            C13706o.m87945v("actionBlock");
            actionBlock = null;
        }
        o0Var.mo32704H0(this, macroDroidVariable, actionBlock, C17542R$style.Theme_App_Dialog_LocalVariables_ActionBlock_NoTitle, C17542R$style.Theme_App_Dialog_LocalVariables_ActionBlock, new C3685f0(this, macroDroidVariable));
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public static final void m14551N2(ActionBlockEditActivity actionBlockEditActivity, ActionBlock actionBlock) {
        C13706o.m87929f(actionBlockEditActivity, "this$0");
        C13706o.m87928e(actionBlock, "it");
        actionBlockEditActivity.f9728F = actionBlock;
        C7989a aVar = null;
        if (!actionBlockEditActivity.f9733K) {
            if (actionBlock == null) {
                C13706o.m87945v("actionBlock");
                actionBlock = null;
            }
            actionBlockEditActivity.f9742T = actionBlock.exactClone();
        }
        ActionBlock actionBlock2 = actionBlockEditActivity.f9728F;
        if (actionBlock2 == null) {
            C13706o.m87945v("actionBlock");
            actionBlock2 = null;
        }
        actionBlock2.addLocalVariableUpdatedListener(actionBlockEditActivity.f9743U);
        if (!actionBlockEditActivity.f9737O) {
            actionBlockEditActivity.m14541H2();
            C7989a aVar2 = actionBlockEditActivity.f9726D;
            if (aVar2 == null) {
                C13706o.m87945v("binding");
                aVar2 = null;
            }
            LinearLayout linearLayout = aVar2.f19174X;
            C13706o.m87928e(linearLayout, "binding.topLevelLayout");
            linearLayout.setVisibility(0);
            C7989a aVar3 = actionBlockEditActivity.f9726D;
            if (aVar3 == null) {
                C13706o.m87945v("binding");
            } else {
                aVar = aVar3;
            }
            LinearLayout linearLayout2 = aVar.f19174X;
            C13706o.m87928e(linearLayout2, "binding.topLevelLayout");
            if (!ViewCompat.isLaidOut(linearLayout2) || linearLayout2.isLayoutRequested()) {
                linearLayout2.addOnLayoutChangeListener(new C3691l(actionBlockEditActivity));
            } else {
                actionBlockEditActivity.m14540G3(true);
            }
            actionBlockEditActivity.f9737O = true;
        }
        actionBlockEditActivity.m14546K2();
    }

    /* renamed from: N3 */
    private final String m14552N3(String str) {
        return new C15159j("[\\\\/:*?\"<>|]").mo74469d(C15176v.m93629D(str, ' ', '_', false, 4, (Object) null), HelpFormatter.DEFAULT_OPT_PREFIX);
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public static final void m14553O2(ActionBlockEditActivity actionBlockEditActivity, Boolean bool) {
        C13706o.m87929f(actionBlockEditActivity, "this$0");
        actionBlockEditActivity.m14542I2(bool != null ? bool.booleanValue() : false);
    }

    /* renamed from: O3 */
    private final void m14554O3() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Testing Action Block: ");
            ActionBlock actionBlock = this.f9728F;
            if (actionBlock == null) {
                C13706o.m87945v("actionBlock");
                actionBlock = null;
            }
            sb.append(actionBlock.getName());
            String sb2 = sb.toString();
            ActionBlock actionBlock2 = this.f9728F;
            if (actionBlock2 == null) {
                C13706o.m87945v("actionBlock");
                actionBlock2 = null;
            }
            C4878b.m18874m(sb2, actionBlock2.getGUID());
            TriggerContextInfo triggerContextInfo = new TriggerContextInfo((Trigger) new EmptyTrigger());
            ActionBlock actionBlock3 = this.f9728F;
            if (actionBlock3 == null) {
                C13706o.m87945v("actionBlock");
                actionBlock3 = null;
            }
            ActionBlock cloneActionBlock = actionBlock3.cloneActionBlock(false);
            cloneActionBlock.setIsClonedInstance(true);
            cloneActionBlock.setTestMode(true);
            cloneActionBlock.setTriggerThatInvoked((Trigger) null);
            mo27141X2().mo29647e(cloneActionBlock);
            cloneActionBlock.invokeActions(triggerContextInfo, true, (ResumeMacroInfo) null);
        } catch (Exception e) {
            C4878b.m18868g("Error when testing action block: " + e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public static final void m14555P2(ActionBlockEditActivity actionBlockEditActivity, ActionBlock actionBlock) {
        C13706o.m87929f(actionBlockEditActivity, "this$0");
        actionBlockEditActivity.m14542I2(false);
        if (actionBlock != null) {
            actionBlockEditActivity.startActivity(C3674a.m14635b(f9722X, actionBlockEditActivity, true, actionBlock, false, 8, (Object) null));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r0.length() > 0) == false) goto L_0x0040;
     */
    /* renamed from: P3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m14556P3() {
        /*
            r5 = this;
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r0 = r5.f9728F
            java.lang.String r1 = "actionBlock"
            r2 = 0
            if (r0 != 0) goto L_0x000b
            kotlin.jvm.internal.C13706o.m87945v(r1)
            r0 = r2
        L_0x000b:
            boolean r0 = r0.isCompleted()
            java.lang.String r3 = "binding"
            if (r0 != 0) goto L_0x0065
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r0 = r5.f9728F
            if (r0 != 0) goto L_0x001b
            kotlin.jvm.internal.C13706o.m87945v(r1)
            r0 = r2
        L_0x001b:
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x0052
            o1.a r0 = r5.f9726D
            if (r0 != 0) goto L_0x0029
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r0 = r2
        L_0x0029:
            android.widget.EditText r0 = r0.f19178d
            android.text.Editable r0 = r0.getText()
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L_0x003f
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x003b
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            if (r0 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            if (r1 != 0) goto L_0x0052
            o1.a r0 = r5.f9726D
            if (r0 != 0) goto L_0x004a
            kotlin.jvm.internal.C13706o.m87945v(r3)
            goto L_0x004b
        L_0x004a:
            r2 = r0
        L_0x004b:
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f19176b
            r0.mo57926t()
            goto L_0x00b6
        L_0x0052:
            boolean r0 = r5.f9733K
            if (r0 != 0) goto L_0x00b6
            o1.a r0 = r5.f9726D
            if (r0 != 0) goto L_0x005e
            kotlin.jvm.internal.C13706o.m87945v(r3)
            goto L_0x005f
        L_0x005e:
            r2 = r0
        L_0x005f:
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f19176b
            r0.mo57926t()
            goto L_0x00b6
        L_0x0065:
            boolean r0 = r5.f9730H
            if (r0 != 0) goto L_0x009a
            int r0 = com.arlosoft.macrodroid.C17532R$id.acceptButton
            android.view.View r0 = r5.mo27145o2(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x00b6
            o1.a r0 = r5.f9726D
            if (r0 != 0) goto L_0x007f
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r0 = r2
        L_0x007f:
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r0.f19176b
            r0.mo57882l()
            o1.a r0 = r5.f9726D
            if (r0 != 0) goto L_0x008c
            kotlin.jvm.internal.C13706o.m87945v(r3)
            goto L_0x008d
        L_0x008c:
            r2 = r0
        L_0x008d:
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f19176b
            java.lang.String r1 = "binding.acceptButton"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x00b6
        L_0x009a:
            int r0 = com.arlosoft.macrodroid.C17532R$id.acceptButton
            android.view.View r0 = r5.mo27145o2(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            boolean r0 = r0.isShown()
            if (r0 != 0) goto L_0x00b6
            o1.a r0 = r5.f9726D
            if (r0 != 0) goto L_0x00b0
            kotlin.jvm.internal.C13706o.m87945v(r3)
            goto L_0x00b1
        L_0x00b0:
            r2 = r0
        L_0x00b1:
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.f19176b
            r0.mo57926t()
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity.m14556P3():void");
    }

    /* renamed from: Q2 */
    private final void m14557Q2(ParentAction parentAction) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Action);
        builder.setTitle((int) C17541R$string.delete);
        builder.setMessage((CharSequence) getString(C17541R$string.delete_condition_or_loop_including_children_confirm));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3735v(this, parentAction));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C3717d.f9772a);
        builder.show();
    }

    /* renamed from: Q3 */
    private final void m14558Q3() {
        SelectableItem b = C6421r.m24721b();
        C7989a aVar = this.f9726D;
        if (aVar == null) {
            C13706o.m87945v("binding");
            aVar = null;
        }
        ImageButton imageButton = aVar.f19167Q;
        C13706o.m87928e(imageButton, "binding.pasteActionButton");
        imageButton.setVisibility(8);
        if (b != null && (b instanceof Action) && !(b instanceof WaitUntilTriggerAction)) {
            ImageButton imageButton2 = (ImageButton) mo27145o2(C17532R$id.pasteActionButton);
            C13706o.m87928e(imageButton2, "pasteActionButton");
            imageButton2.setVisibility(0);
        } else if (C6421r.m24723d() != null) {
            ImageButton imageButton3 = (ImageButton) mo27145o2(C17532R$id.pasteActionButton);
            C13706o.m87928e(imageButton3, "pasteActionButton");
            imageButton3.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public static final void m14560R2(ActionBlockEditActivity actionBlockEditActivity, ParentAction parentAction, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(actionBlockEditActivity, "this$0");
        C13706o.m87929f(parentAction, "$action");
        ActionBlock actionBlock = actionBlockEditActivity.f9728F;
        if (actionBlock == null) {
            C13706o.m87945v("actionBlock");
            actionBlock = null;
        }
        actionBlock.removeItemAndChildren(parentAction);
        actionBlockEditActivity.f9732J = null;
        actionBlockEditActivity.m14543I3(true);
        m14532C3(actionBlockEditActivity, false, 1, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: o1.a} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [com.arlosoft.macrodroid.macro.Macro] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: R3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m14561R3() {
        /*
            r6 = this;
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r0 = r6.f9728F
            java.lang.String r1 = "actionBlock"
            r2 = 0
            if (r0 != 0) goto L_0x000b
            kotlin.jvm.internal.C13706o.m87945v(r1)
            r0 = r2
        L_0x000b:
            java.util.ArrayList r0 = r0.getActions()
            int r0 = com.arlosoft.macrodroid.action.Action.m9593S2(r0)
            r3 = 2131953969(0x7f130931, float:1.9544424E38)
            if (r0 < 0) goto L_0x0053
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 2131953971(0x7f130933, float:1.9544428E38)
            java.lang.String r5 = r6.getString(r5)
            r4.append(r5)
            r5 = 32
            r4.append(r5)
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r5 = r6.f9728F
            if (r5 != 0) goto L_0x0034
            kotlin.jvm.internal.C13706o.m87945v(r1)
            goto L_0x0035
        L_0x0034:
            r2 = r5
        L_0x0035:
            java.util.ArrayList r1 = r2.getActions()
            java.lang.Object r0 = r1.get(r0)
            com.arlosoft.macrodroid.action.Action r0 = (com.arlosoft.macrodroid.action.Action) r0
            java.lang.String r0 = r0.mo24738G0()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = r6.getString(r3)
            com.arlosoft.macrodroid.common.C4061t1.m16019t(r6, r1, r0)
            goto L_0x00e4
        L_0x0053:
            o1.a r0 = r6.f9726D
            java.lang.String r4 = "binding"
            if (r0 != 0) goto L_0x005d
            kotlin.jvm.internal.C13706o.m87945v(r4)
            r0 = r2
        L_0x005d:
            android.widget.EditText r0 = r0.f19178d
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r5 = 2132017801(0x7f140289, float:1.967389E38)
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = r6.getString(r3)
            r1 = 2131954596(0x7f130ba4, float:1.9545696E38)
            java.lang.String r1 = r6.getString(r1)
            com.arlosoft.macrodroid.common.C4061t1.m16021u(r6, r0, r1, r5)
            goto L_0x00e4
        L_0x007f:
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r0 = r6.f9728F
            if (r0 != 0) goto L_0x0087
            kotlin.jvm.internal.C13706o.m87945v(r1)
            r0 = r2
        L_0x0087:
            java.util.ArrayList r0 = r0.getActions()
            int r0 = r0.size()
            if (r0 != 0) goto L_0x00a0
            java.lang.String r0 = r6.getString(r3)
            r1 = 2131954580(0x7f130b94, float:1.9545663E38)
            java.lang.String r1 = r6.getString(r1)
            com.arlosoft.macrodroid.common.C4061t1.m16021u(r6, r0, r1, r5)
            goto L_0x00e4
        L_0x00a0:
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r0 = r6.f9728F
            if (r0 != 0) goto L_0x00a8
            kotlin.jvm.internal.C13706o.m87945v(r1)
            r0 = r2
        L_0x00a8:
            boolean r0 = r0.isValid()
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = r6.getString(r3)
            r1 = 2131953143(0x7f1305f7, float:1.9542749E38)
            java.lang.String r1 = r6.getString(r1)
            com.arlosoft.macrodroid.common.C4061t1.m16021u(r6, r0, r1, r5)
            goto L_0x00e4
        L_0x00bd:
            o1.a r0 = r6.f9726D
            if (r0 != 0) goto L_0x00c5
            kotlin.jvm.internal.C13706o.m87945v(r4)
            goto L_0x00c6
        L_0x00c5:
            r2 = r0
        L_0x00c6:
            android.widget.EditText r0 = r2.f19178d
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r6.m14569V2(r0)
            if (r0 == 0) goto L_0x00e6
            java.lang.String r0 = r6.getString(r3)
            r1 = 2131951721(0x7f130069, float:1.9539865E38)
            java.lang.String r1 = r6.getString(r1)
            com.arlosoft.macrodroid.common.C4061t1.m16021u(r6, r0, r1, r5)
        L_0x00e4:
            r0 = 0
            return r0
        L_0x00e6:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity.m14561R3():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m14563S2(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public final void m14565T2(C3740z zVar) {
        C6520o0.m24897U(this, mo27143a3().mo28009e().mo28008a(), true, C17542R$style.Theme_App_Dialog_LocalVariables_ActionBlock, false, false, C17535R$layout.simple_spinner_dropdown_item_2_lines_white_text, "#DDDDDD", false, (Macro) null, (Integer) null, new C3692m(zVar, this));
    }

    /* renamed from: U2 */
    private final void m14567U2() {
        setResult(0, new Intent());
        C4934n M = C4934n.m18998M();
        ActionBlock actionBlock = this.f9728F;
        if (actionBlock == null) {
            C13706o.m87945v("actionBlock");
            actionBlock = null;
        }
        M.mo29692k0(actionBlock, false);
        ActionBlock actionBlock2 = this.f9742T;
        if (actionBlock2 != null) {
            C4934n.m18998M().mo29703t(actionBlock2, true, actionBlock2.isEnabled());
        }
        m14571W2();
        mo27141X2().mo29644b();
        finish();
    }

    /* renamed from: V2 */
    private final boolean m14569V2(String str) {
        for (ActionBlock actionBlock : mo27141X2().mo29645c()) {
            ActionBlock actionBlock2 = this.f9728F;
            if (actionBlock2 == null) {
                C13706o.m87945v("actionBlock");
                actionBlock2 = null;
            }
            if (!C13706o.m87924a(actionBlock, actionBlock2) && C13706o.m87924a(actionBlock.getName(), str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W2 */
    private final void m14571W2() {
        Object systemService = getSystemService("input_method");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        C7989a aVar = this.f9726D;
        if (aVar == null) {
            C13706o.m87945v("binding");
            aVar = null;
        }
        inputMethodManager.hideSoftInputFromWindow(aVar.f19188n.getWindowToken(), 0);
    }

    /* renamed from: Y2 */
    public static final Intent m14574Y2(Activity activity, boolean z, ActionBlock actionBlock, boolean z2) {
        return f9722X.mo27148a(activity, z, actionBlock, z2);
    }

    /* renamed from: c3 */
    private final void m14579c3() {
        ActionBlock actionBlock = this.f9728F;
        if (actionBlock == null) {
            C13706o.m87945v("actionBlock");
            actionBlock = null;
        }
        int i = C17532R$id.descriptionExpandable;
        actionBlock.setDescriptionOpen(!((ExpandableLayout) mo27145o2(i)).mo75517g());
        ((ExpandableLayout) mo27145o2(i)).mo75524i();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: o1.a} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v8, types: [com.arlosoft.macrodroid.macro.Macro] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m14581d3() {
        /*
            r8 = this;
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r0 = r8.f9728F
            java.lang.String r1 = "actionBlock"
            r2 = 0
            if (r0 != 0) goto L_0x000b
            kotlin.jvm.internal.C13706o.m87945v(r1)
            r0 = r2
        L_0x000b:
            java.util.ArrayList r0 = r0.getActions()
            int r0 = com.arlosoft.macrodroid.action.Action.m9593S2(r0)
            r3 = 2131953969(0x7f130931, float:1.9544424E38)
            if (r0 < 0) goto L_0x0053
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 2131953971(0x7f130933, float:1.9544428E38)
            java.lang.String r5 = r8.getString(r5)
            r4.append(r5)
            r5 = 32
            r4.append(r5)
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r5 = r8.f9728F
            if (r5 != 0) goto L_0x0034
            kotlin.jvm.internal.C13706o.m87945v(r1)
            goto L_0x0035
        L_0x0034:
            r2 = r5
        L_0x0035:
            java.util.ArrayList r1 = r2.getActions()
            java.lang.Object r0 = r1.get(r0)
            com.arlosoft.macrodroid.action.Action r0 = (com.arlosoft.macrodroid.action.Action) r0
            java.lang.String r0 = r0.mo24738G0()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = r8.getString(r3)
            com.arlosoft.macrodroid.common.C4061t1.m16019t(r8, r1, r0)
            goto L_0x0141
        L_0x0053:
            o1.a r0 = r8.f9726D
            java.lang.String r4 = "binding"
            if (r0 != 0) goto L_0x005d
            kotlin.jvm.internal.C13706o.m87945v(r4)
            r0 = r2
        L_0x005d:
            android.widget.EditText r0 = r0.f19178d
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r5 = 17039360(0x1040000, float:2.424457E-38)
            r6 = 2131953063(0x7f1305a7, float:1.9542586E38)
            r7 = 2132017801(0x7f140289, float:1.967389E38)
            if (r0 == 0) goto L_0x0095
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            r0.<init>(r8, r7)
            r0.setTitle((int) r3)
            r1 = 2131954596(0x7f130ba4, float:1.9545696E38)
            r0.setMessage((int) r1)
            com.arlosoft.macrodroid.actionblock.edit.c r1 = com.arlosoft.macrodroid.actionblock.edit.C3716c.f9771a
            r0.setPositiveButton((int) r5, (android.content.DialogInterface.OnClickListener) r1)
            com.arlosoft.macrodroid.actionblock.edit.r r1 = new com.arlosoft.macrodroid.actionblock.edit.r
            r1.<init>(r8)
            r0.setNeutralButton((int) r6, (android.content.DialogInterface.OnClickListener) r1)
            r0.show()
            goto L_0x0141
        L_0x0095:
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r0 = r8.f9728F
            if (r0 != 0) goto L_0x009d
            kotlin.jvm.internal.C13706o.m87945v(r1)
            r0 = r2
        L_0x009d:
            java.util.ArrayList r0 = r0.getActions()
            int r0 = r0.size()
            if (r0 != 0) goto L_0x00c7
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            r0.<init>(r8, r7)
            r0.setTitle((int) r3)
            r1 = 2131954580(0x7f130b94, float:1.9545663E38)
            r0.setMessage((int) r1)
            com.arlosoft.macrodroid.actionblock.edit.g r1 = com.arlosoft.macrodroid.actionblock.edit.C3720g.f9775a
            r0.setPositiveButton((int) r5, (android.content.DialogInterface.OnClickListener) r1)
            com.arlosoft.macrodroid.actionblock.edit.q r1 = new com.arlosoft.macrodroid.actionblock.edit.q
            r1.<init>(r8)
            r0.setNeutralButton((int) r6, (android.content.DialogInterface.OnClickListener) r1)
            r0.show()
            goto L_0x0141
        L_0x00c7:
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r0 = r8.f9728F
            if (r0 != 0) goto L_0x00cf
            kotlin.jvm.internal.C13706o.m87945v(r1)
            r0 = r2
        L_0x00cf:
            boolean r0 = r0.isValid()
            r1 = 1
            if (r0 != 0) goto L_0x010a
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            r0.<init>(r8, r7)
            r0.setTitle((int) r3)
            r2 = 2131953143(0x7f1305f7, float:1.9542749E38)
            androidx.appcompat.app.AlertDialog$Builder r2 = r0.setMessage((int) r2)
            androidx.appcompat.app.AlertDialog$Builder r1 = r2.setCancelable(r1)
            r2 = 2131954768(0x7f130c50, float:1.9546045E38)
            com.arlosoft.macrodroid.actionblock.edit.u r3 = new com.arlosoft.macrodroid.actionblock.edit.u
            r3.<init>(r8)
            androidx.appcompat.app.AlertDialog$Builder r1 = r1.setPositiveButton((int) r2, (android.content.DialogInterface.OnClickListener) r3)
            r2 = 2131952563(0x7f1303b3, float:1.9541572E38)
            com.arlosoft.macrodroid.actionblock.edit.b r3 = com.arlosoft.macrodroid.actionblock.edit.C3715b.f9770a
            androidx.appcompat.app.AlertDialog$Builder r1 = r1.setNeutralButton((int) r2, (android.content.DialogInterface.OnClickListener) r3)
            com.arlosoft.macrodroid.actionblock.edit.t r2 = new com.arlosoft.macrodroid.actionblock.edit.t
            r2.<init>(r8)
            r1.setNegativeButton((int) r6, (android.content.DialogInterface.OnClickListener) r2)
            r0.show()
            goto L_0x0141
        L_0x010a:
            o1.a r0 = r8.f9726D
            if (r0 != 0) goto L_0x0112
            kotlin.jvm.internal.C13706o.m87945v(r4)
            goto L_0x0113
        L_0x0112:
            r2 = r0
        L_0x0113:
            android.widget.EditText r0 = r2.f19178d
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r8.m14569V2(r0)
            if (r0 == 0) goto L_0x0143
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            r0.<init>(r8, r7)
            r0.setTitle((int) r3)
            r1 = 2131951721(0x7f130069, float:1.9539865E38)
            r0.setMessage((int) r1)
            com.arlosoft.macrodroid.actionblock.edit.e r1 = com.arlosoft.macrodroid.actionblock.edit.C3718e.f9773a
            r0.setPositiveButton((int) r5, (android.content.DialogInterface.OnClickListener) r1)
            com.arlosoft.macrodroid.actionblock.edit.l r1 = new com.arlosoft.macrodroid.actionblock.edit.l
            r1.<init>(r8)
            r0.setNeutralButton((int) r6, (android.content.DialogInterface.OnClickListener) r1)
            r0.show()
        L_0x0141:
            r0 = 0
            return r0
        L_0x0143:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity.m14581d3():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public static final void m14583e3(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public static final void m14585f3(ActionBlockEditActivity actionBlockEditActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(actionBlockEditActivity, "this$0");
        actionBlockEditActivity.m14567U2();
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public static final void m14587g3(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public static final void m14589h3(ActionBlockEditActivity actionBlockEditActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(actionBlockEditActivity, "this$0");
        actionBlockEditActivity.m14567U2();
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public static final void m14591i3(ActionBlockEditActivity actionBlockEditActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(actionBlockEditActivity, "this$0");
        C13706o.m87929f(dialogInterface, "dialog");
        dialogInterface.dismiss();
        m14537F2(actionBlockEditActivity, false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m14593j3(DialogInterface dialogInterface, int i) {
        C13706o.m87929f(dialogInterface, "dialog");
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m14595k3(ActionBlockEditActivity actionBlockEditActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(actionBlockEditActivity, "this$0");
        dialogInterface.dismiss();
        actionBlockEditActivity.m14567U2();
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m14597l3(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m14599m3(ActionBlockEditActivity actionBlockEditActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(actionBlockEditActivity, "this$0");
        actionBlockEditActivity.m14567U2();
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public final void m14601n3() {
        if (C6421r.m24721b() != null) {
            SelectableItem b = C6421r.m24721b();
            C13706o.m87927d(b, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.Action");
            Action action = (Action) b;
            ActionBlock actionBlock = this.f9728F;
            if (actionBlock == null) {
                C13706o.m87945v("actionBlock");
                actionBlock = null;
            }
            actionBlock.getActions().add(action);
            ActionBlock actionBlock2 = this.f9728F;
            if (actionBlock2 == null) {
                C13706o.m87945v("actionBlock");
                actionBlock2 = null;
            }
            action.mo24687G2(actionBlock2);
        } else if (C6421r.m24723d() != null) {
            for (SelectableItem next : C6421r.m24723d()) {
                C13706o.m87927d(next, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.Action");
                Action action2 = (Action) next;
                ActionBlock actionBlock3 = this.f9728F;
                if (actionBlock3 == null) {
                    C13706o.m87945v("actionBlock");
                    actionBlock3 = null;
                }
                actionBlock3.getActions().add(action2);
                ActionBlock actionBlock4 = this.f9728F;
                if (actionBlock4 == null) {
                    C13706o.m87945v("actionBlock");
                    actionBlock4 = null;
                }
                action2.mo24687G2(actionBlock4);
            }
        }
        C15626c.makeText(getApplicationContext(), C17541R$string.item_pasted, 0).show();
        C6421r.m24725f();
        this.f9730H = true;
        m14532C3(this, false, 1, (Object) null);
    }

    /* renamed from: o3 */
    private final long m14602o3(InputStream inputStream) {
        T t = "";
        C13684d0 d0Var = new C13684d0();
        try {
            d0Var.element = new BufferedReader(new InputStreamReader(inputStream));
            C13684d0 d0Var2 = new C13684d0();
            d0Var2.element = t;
            while (m14604p3(d0Var2, d0Var) != null) {
                t = t + ((String) d0Var2.element);
            }
            Object j = C10283c.m40413c().mo64006e(Macro.class, new C4921g(getApplicationContext(), true, true, true)).mo64006e(ActionBlock.class, new C4921g(getApplicationContext(), true, true, true)).mo64004c().mo63976j(t, ActionBlock.class);
            C13706o.m87928e(j, "gson.fromJson(json, ActionBlock::class.java)");
            this.f9728F = (ActionBlock) j;
            C4915a X2 = mo27141X2();
            ActionBlock actionBlock = this.f9728F;
            ActionBlock actionBlock2 = null;
            if (actionBlock == null) {
                C13706o.m87945v("actionBlock");
                actionBlock = null;
            }
            ActionBlock actionBlock3 = this.f9728F;
            if (actionBlock3 == null) {
                C13706o.m87945v("actionBlock");
                actionBlock3 = null;
            }
            List<ActionBlock> actionBlocksToImport = actionBlock3.getActionBlocksToImport();
            C13706o.m87928e(actionBlocksToImport, "actionBlock.actionBlocksToImport");
            C8056a.m33601a(X2, actionBlock, actionBlocksToImport, true);
            ActionBlock actionBlock4 = this.f9728F;
            if (actionBlock4 == null) {
                C13706o.m87945v("actionBlock");
                actionBlock4 = null;
            }
            actionBlock4.setNewRandomGUID();
            ActionBlock actionBlock5 = this.f9728F;
            if (actionBlock5 == null) {
                C13706o.m87945v("actionBlock");
                actionBlock5 = null;
            }
            actionBlock5.setCompleted(false);
            ActionBlock actionBlock6 = this.f9728F;
            if (actionBlock6 == null) {
                C13706o.m87945v("actionBlock");
                actionBlock6 = null;
            }
            m14533D2(actionBlock6);
            this.f9733K = true;
            this.f9731I = true;
            ActionBlock actionBlock7 = this.f9728F;
            if (actionBlock7 == null) {
                C13706o.m87945v("actionBlock");
                actionBlock7 = null;
            }
            actionBlock7.setIsBeingImported(true);
            C4915a X22 = mo27141X2();
            ActionBlock actionBlock8 = this.f9728F;
            if (actionBlock8 == null) {
                C13706o.m87945v("actionBlock");
                actionBlock8 = null;
            }
            X22.mo29647e(actionBlock8);
            ActionBlock actionBlock9 = this.f9728F;
            if (actionBlock9 == null) {
                C13706o.m87945v("actionBlock");
            } else {
                actionBlock2 = actionBlock9;
            }
            long guid = actionBlock2.getGUID();
            inputStream.close();
            BufferedReader bufferedReader = (BufferedReader) d0Var.element;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return guid;
        } catch (Exception e) {
            C15626c.m94876a(getApplicationContext(), "The selected file could not be imported into MacroDroid", 1).show();
            FirebaseCrashlytics.m6487a().mo22936d(new RuntimeException("Failed to import macro: " + e.getMessage()));
            finish();
            inputStream.close();
            BufferedReader bufferedReader2 = (BufferedReader) d0Var.element;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            return -1;
        } catch (Throwable th) {
            inputStream.close();
            BufferedReader bufferedReader3 = (BufferedReader) d0Var.element;
            if (bufferedReader3 != null) {
                bufferedReader3.close();
            }
            throw th;
        }
    }

    /* renamed from: p3 */
    private static final String m14604p3(C13684d0 d0Var, C13684d0 d0Var2) {
        T readLine = ((BufferedReader) d0Var2.element).readLine();
        d0Var.element = readLine;
        return readLine;
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m14607r3(ActionBlockEditActivity actionBlockEditActivity, MacroDroidVariable macroDroidVariable, VariableValue variableValue, VariableValue variableValue2, long j) {
        C13706o.m87929f(actionBlockEditActivity, "this$0");
        C13706o.m87929f(macroDroidVariable, "variable");
        C13706o.m87929f(variableValue, "newVariable");
        C13706o.m87929f(variableValue2, "oldValue");
        actionBlockEditActivity.m14536E3();
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m14609s3(ActionBlockEditActivity actionBlockEditActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(actionBlockEditActivity, "this$0");
        m14537F2(actionBlockEditActivity, false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static final void m14611t3(ActionBlockEditActivity actionBlockEditActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(actionBlockEditActivity, "this$0");
        actionBlockEditActivity.m14567U2();
    }

    /* renamed from: u3 */
    private final void m14613u3() {
        C6422r0 r0Var = C6422r0.f15045a;
        File filesDir = getFilesDir();
        C13706o.m87928e(filesDir, "filesDir");
        ActionBlock actionBlock = this.f9728F;
        if (actionBlock == null) {
            C13706o.m87945v("actionBlock");
            actionBlock = null;
        }
        File b = r0Var.mo32452b(filesDir, actionBlock, mo27141X2());
        if (b != null) {
            try {
                ArrayList arrayList = new ArrayList();
                C10378a aVar = C10378a.f23596a;
                MacroDroidApplication a = aVar.mo41059a();
                arrayList.add(FileProvider.getUriForFile(a, aVar.mo41059a().getPackageName() + ".provider", b));
                Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
                intent.addFlags(268435456);
                intent.setType("text/plain");
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                startActivity(Intent.createChooser(intent, getString(C17541R$string.menu_share)));
            } catch (Exception e) {
                C15626c.makeText(getApplicationContext(), C17541R$string.export_failed, 0).show();
                C4878b.m18868g("Failed to export file: " + e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fa A[Catch:{ IOException -> 0x00e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104 A[Catch:{ IOException -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: v3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14615v3() {
        /*
            r9 = this;
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r9, r0)
            if (r1 == 0) goto L_0x0012
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 3000(0xbb8, float:4.204E-42)
            androidx.core.app.ActivityCompat.requestPermissions(r9, r0, r1)
            return
        L_0x0012:
            o1.a r0 = r9.f9726D
            r1 = 0
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C13706o.m87945v(r0)
            r0 = r1
        L_0x001d:
            androidx.core.widget.NestedScrollView r0 = r0.f19170T
            java.lang.String r2 = "binding.scrollView"
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r2 = r9.f9728F
            java.lang.String r3 = "actionBlock"
            if (r2 != 0) goto L_0x002e
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r2 = r1
        L_0x002e:
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "actionBlock.name"
            kotlin.jvm.internal.C13706o.m87928e(r2, r4)
            r5 = 50
            android.graphics.Bitmap r0 = com.arlosoft.macrodroid.utils.C6377e1.m24623a(r0, r2, r5)
            java.io.File r2 = new java.io.File
            java.io.File r5 = r9.getExternalFilesDir(r1)
            java.lang.String r6 = "Export"
            r2.<init>(r5, r6)
            boolean r5 = r2.exists()
            if (r5 != 0) goto L_0x0051
            r2.mkdirs()
        L_0x0051:
            java.io.File r2 = new java.io.File
            x3.a r5 = p190x3.C10378a.f23596a
            com.arlosoft.macrodroid.app.MacroDroidApplication r6 = r5.mo41059a()
            java.io.File r6 = r6.getFilesDir()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r8 = r9.f9728F
            if (r8 != 0) goto L_0x006a
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r8 = r1
        L_0x006a:
            java.lang.String r3 = r8.getName()
            kotlin.jvm.internal.C13706o.m87928e(r3, r4)
            java.lang.String r3 = r9.m14552N3(r3)
            r7.append(r3)
            java.lang.String r3 = ".png"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r2.<init>(r6, r3)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00ef, all -> 0x00eb }
            r3.<init>(r2)     // Catch:{ Exception -> 0x00ef, all -> 0x00eb }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x00e9 }
            r4 = 100
            r0.compress(r1, r4, r3)     // Catch:{ Exception -> 0x00e9 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x00e9 }
            r1.<init>()     // Catch:{ Exception -> 0x00e9 }
            com.arlosoft.macrodroid.app.MacroDroidApplication r4 = r5.mo41059a()     // Catch:{ Exception -> 0x00e9 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e9 }
            r6.<init>()     // Catch:{ Exception -> 0x00e9 }
            com.arlosoft.macrodroid.app.MacroDroidApplication r5 = r5.mo41059a()     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ Exception -> 0x00e9 }
            r6.append(r5)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r5 = ".provider"
            r6.append(r5)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x00e9 }
            android.net.Uri r2 = androidx.core.content.FileProvider.getUriForFile(r4, r5, r2)     // Catch:{ Exception -> 0x00e9 }
            r1.add(r2)     // Catch:{ Exception -> 0x00e9 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r4 = "android.intent.action.SEND_MULTIPLE"
            r2.<init>(r4)     // Catch:{ Exception -> 0x00e9 }
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r4)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r4 = "image/png"
            r2.setType(r4)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r4 = "android.intent.extra.STREAM"
            r2.putParcelableArrayListExtra(r4, r1)     // Catch:{ Exception -> 0x00e9 }
            r1 = 2131954276(0x7f130a64, float:1.9545047E38)
            java.lang.String r1 = r9.getString(r1)     // Catch:{ Exception -> 0x00e9 }
            android.content.Intent r1 = android.content.Intent.createChooser(r2, r1)     // Catch:{ Exception -> 0x00e9 }
            r9.startActivity(r1)     // Catch:{ Exception -> 0x00e9 }
            r0.recycle()     // Catch:{ IOException -> 0x00e4 }
            r3.close()     // Catch:{ IOException -> 0x00e4 }
            goto L_0x00fd
        L_0x00e4:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00fd
        L_0x00e9:
            r1 = move-exception
            goto L_0x00f2
        L_0x00eb:
            r2 = move-exception
            r3 = r1
            r1 = r2
            goto L_0x00ff
        L_0x00ef:
            r2 = move-exception
            r3 = r1
            r1 = r2
        L_0x00f2:
            r1.printStackTrace()     // Catch:{ all -> 0x00fe }
            r0.recycle()     // Catch:{ IOException -> 0x00e4 }
            if (r3 == 0) goto L_0x00fd
            r3.close()     // Catch:{ IOException -> 0x00e4 }
        L_0x00fd:
            return
        L_0x00fe:
            r1 = move-exception
        L_0x00ff:
            r0.recycle()     // Catch:{ IOException -> 0x0108 }
            if (r3 == 0) goto L_0x010c
            r3.close()     // Catch:{ IOException -> 0x0108 }
            goto L_0x010c
        L_0x0108:
            r0 = move-exception
            r0.printStackTrace()
        L_0x010c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity.m14615v3():void");
    }

    /* renamed from: w3 */
    private final void m14617w3() {
        String str = Build.VERSION.SDK_INT < 31 ? "android.permission.ACCESS_FINE_LOCATION" : "android.permission.BLUETOOTH_CONNECT";
        C1624a.f1072f.mo19234c(this).mo19240i(new String[]{str}, new C3702w(str, this));
    }

    /* renamed from: x3 */
    private final boolean m14619x3(int i, List<? extends Constraint> list) {
        if (i == 10) {
            return true;
        }
        for (Constraint constraint : list) {
            if (constraint instanceof LogicConstraint) {
                List<Constraint> J0 = constraint.mo27826J0();
                C13706o.m87928e(J0, "childConstraint.getConstraints()");
                if (m14619x3(i + 1, J0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: y3 */
    private final void m14621y3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.menu_delete_action_block);
        builder.setMessage((CharSequence) getString(C17541R$string.are_you_sure_delete_action_block));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3714a(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C3719f.f9774a);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static final void m14623z3(ActionBlockEditActivity actionBlockEditActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(actionBlockEditActivity, "this$0");
        ActionBlockEditViewModel b3 = actionBlockEditActivity.mo27144b3();
        ActionBlock actionBlock = actionBlockEditActivity.f9728F;
        if (actionBlock == null) {
            C13706o.m87945v("actionBlock");
            actionBlock = null;
        }
        b3.mo27187n(actionBlock);
    }

    /* renamed from: B3 */
    public final void mo27136B3(boolean z) {
        m14534D3(z);
        m14536E3();
        m14556P3();
    }

    /* renamed from: C0 */
    public void mo27137C0(Object obj) {
        C13706o.m87929f(obj, "obj");
        SelectableItem selectableItem = this.f9732J;
        if (selectableItem != null) {
            selectableItem.mo25307s1(obj);
        }
    }

    /* renamed from: H3 */
    public final void mo27138H3() {
        this.f9730H = true;
        m14556P3();
    }

    /* renamed from: K3 */
    public final void mo27139K3(SelectableItem selectableItem, Macro macro) {
        SelectableItem selectableItem2 = selectableItem;
        Macro macro2 = macro;
        C13706o.m87929f(selectableItem2, "item");
        C13706o.m87929f(macro2, "macro");
        this.f9732J = selectableItem2;
        ArrayList arrayList = new ArrayList();
        if (selectableItem2 instanceof EndParentAction) {
            if ((C6421r.m24721b() != null && (C6421r.m24721b() instanceof Action)) || C6421r.m24723d() != null) {
                arrayList.add(getString(C17541R$string.paste_action_above));
            }
            arrayList.add(getString(C17541R$string.add_action_above));
        } else if (selectableItem2 instanceof ElseParentAction) {
            if ((selectableItem2 instanceof ElseIfConditionAction) || (selectableItem2 instanceof ElseIfConfirmedThenAction)) {
                arrayList.add(getString(C17541R$string.configure));
            }
            if ((C6421r.m24721b() != null && (C6421r.m24721b() instanceof Action)) || C6421r.m24723d() != null) {
                arrayList.add(getString(C17541R$string.paste_action_above));
            }
            arrayList.add(getString(C17541R$string.add_action_above));
            arrayList.add(getString(C17541R$string.add_child_action));
            ElseParentAction elseParentAction = (ElseParentAction) selectableItem2;
            if (TextUtils.isEmpty(elseParentAction.mo27820F0())) {
                arrayList.add(getString(C17541R$string.add_comment));
            } else {
                arrayList.add(getString(C17541R$string.edit_comment));
            }
            arrayList.add(getString(C17541R$string.delete));
            ParentAction parentAction = macro2.getParentAction((Action) selectableItem2);
            if (parentAction != null && parentAction.mo27822G1()) {
                arrayList.add(getString(elseParentAction.mo27822G1() ? C17541R$string.disable : C17541R$string.enable));
                arrayList.add(getString(selectableItem.mo27822G1() ? C17541R$string.disable_condition_or_loop_action_including_children : C17541R$string.enable_condition_or_loop_action_including_children));
            }
        } else {
            if (selectableItem.mo24788B1()) {
                arrayList.add(getString(C17541R$string.configure));
            }
            if (selectableItem2 instanceof Trigger) {
                arrayList.add(getString(C17541R$string.test_trigger));
            }
            boolean z = true;
            if (selectableItem2 instanceof Action) {
                if (!(selectableItem2 instanceof ParentAction)) {
                    arrayList.add(getString(C17541R$string.test_action));
                    List<Constraint> J0 = ((Action) selectableItem2).mo27826J0();
                    C13706o.m87928e(J0, "item.constraints");
                    if (!J0.isEmpty()) {
                        arrayList.add(getString(C17541R$string.test_action) + " (" + getString(C17541R$string.testing_trigger_or_action_with_constraints) + ')');
                    }
                }
                arrayList.add(getString(C17541R$string.add_action_above));
                if ((C6421r.m24721b() != null && (C6421r.m24721b() instanceof Action)) || C6421r.m24723d() != null) {
                    arrayList.add(getString(C17541R$string.paste_action_above));
                }
            }
            boolean z2 = selectableItem2 instanceof ParentAction;
            if (z2) {
                arrayList.add(getString(C17541R$string.add_child_action));
            } else if (!(selectableItem2 instanceof Constraint) || (selectableItem2 instanceof LogicConstraint)) {
                arrayList.add(getString(C17541R$string.add_constraint));
                if (C6421r.m24721b() != null && (C6421r.m24721b() instanceof Constraint)) {
                    arrayList.add(getString(C17541R$string.paste_constraint));
                }
            }
            if (selectableItem2 instanceof IfConditionAction) {
                int indexOf = macro.getActions().indexOf(selectableItem2);
                int b = C6416p0.m24705b(macro.getActions(), indexOf);
                int a = C6416p0.m24704a(macro.getActions(), indexOf);
                arrayList.add(getString(C17541R$string.add_else_if_clause));
                arrayList.add(getString(C17541R$string.add_else_if_confirmed_clause));
                if (1 > a || a >= b) {
                    z = false;
                }
                if (!z) {
                    arrayList.add(getString(C17541R$string.add_else_clause));
                }
            }
            if (TextUtils.isEmpty(selectableItem.mo27820F0())) {
                arrayList.add(getString(C17541R$string.add_comment));
            } else {
                arrayList.add(getString(C17541R$string.edit_comment));
            }
            boolean z3 = selectableItem2 instanceof WidgetPressedTrigger;
            if (!z3) {
                arrayList.add(getString(C17541R$string.ui_interaction_cut));
            }
            if (!z3) {
                arrayList.add(getString(C17541R$string.action_file_operation_copy));
            }
            arrayList.add(getString(C17541R$string.delete));
            if (z2) {
                arrayList.add(getString(C17541R$string.delete_condition_or_loop_including_children));
            }
            arrayList.add(getString(selectableItem.mo27822G1() ? C17541R$string.disable : C17541R$string.enable));
            if (z2) {
                arrayList.add(getString(((ParentAction) selectableItem2).mo27822G1() ? C17541R$string.disable_condition_or_loop_action_including_children : C17541R$string.enable_condition_or_loop_action_including_children));
            }
            arrayList.add(getString(C17541R$string.help));
        }
        if (arrayList.size() != 0) {
            Object[] array = arrayList.toArray(new String[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            C4653z0 z0Var = this.f9741S;
            if (z0Var == null) {
                C13706o.m87945v("topLevelEditHelper");
                z0Var = null;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this, z0Var.mo29100m(selectableItem2));
            builder.setTitle((CharSequence) selectableItem.mo27831M0()).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C3736w(this, strArr, selectableItem2, macro2));
            builder.show();
        }
    }

    /* renamed from: W0 */
    public void mo27140W0() {
        SelectableItem selectableItem = this.f9732J;
        if (selectableItem != null) {
            selectableItem.mo27864r1();
        }
    }

    /* renamed from: X2 */
    public final C4915a mo27141X2() {
        C4915a aVar = this.f9723A;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("actionBlockStore");
        return null;
    }

    /* renamed from: Z2 */
    public final C7366i mo27142Z2() {
        C7366i iVar = this.f9747z;
        if (iVar != null) {
            return iVar;
        }
        C13706o.m87945v("nearbyHelper");
        return null;
    }

    /* renamed from: a3 */
    public final C4083b mo27143a3() {
        C4083b bVar = this.f9725C;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("premiumStatusHandler");
        return null;
    }

    /* renamed from: b3 */
    public final ActionBlockEditViewModel mo27144b3() {
        ActionBlockEditViewModel actionBlockEditViewModel = this.f9746s;
        if (actionBlockEditViewModel != null) {
            return actionBlockEditViewModel;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    /* renamed from: o2 */
    public View mo27145o2(int i) {
        Map<Integer, View> map = this.f9745W;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 1
            r1 = -1
            switch(r6) {
                case 501: goto L_0x0016;
                case 502: goto L_0x0016;
                case 503: goto L_0x0016;
                default: goto L_0x0008;
            }
        L_0x0008:
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r2 = r5.f9728F
            if (r2 == 0) goto L_0x0034
            r3 = 0
            java.lang.String r4 = "actionBlock"
            if (r2 != 0) goto L_0x001b
            kotlin.jvm.internal.C13706o.m87945v(r4)
            r2 = r3
            goto L_0x001b
        L_0x0016:
            if (r7 != r1) goto L_0x001a
            r5.f9730H = r0
        L_0x001a:
            return
        L_0x001b:
            com.arlosoft.macrodroid.action.Action r2 = r2.getActionBeingConfigured()
            if (r2 == 0) goto L_0x0034
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r2 = r5.f9728F
            if (r2 != 0) goto L_0x0029
            kotlin.jvm.internal.C13706o.m87945v(r4)
            goto L_0x002a
        L_0x0029:
            r3 = r2
        L_0x002a:
            com.arlosoft.macrodroid.action.Action r2 = r3.getActionBeingConfigured()
            if (r2 == 0) goto L_0x003b
            r2.mo24713q1(r5, r6, r7, r8)
            goto L_0x003b
        L_0x0034:
            com.arlosoft.macrodroid.common.SelectableItem r2 = r5.f9732J
            if (r2 == 0) goto L_0x003b
            r2.mo24713q1(r5, r6, r7, r8)
        L_0x003b:
            if (r7 != r1) goto L_0x003f
            r5.f9730H = r0
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        if (this.f9733K && ((EditText) mo27145o2(C17532R$id.actionBlockNameText)).length() == 0) {
            ActionBlock actionBlock = this.f9728F;
            ActionBlock actionBlock2 = null;
            if (actionBlock == null) {
                C13706o.m87945v("actionBlock");
                actionBlock = null;
            }
            if (actionBlock.getActions().size() == 0) {
                ActionBlock actionBlock3 = this.f9728F;
                if (actionBlock3 == null) {
                    C13706o.m87945v("actionBlock");
                    actionBlock3 = null;
                }
                if (actionBlock3.getLocalVariables().size() == 0) {
                    ActionBlockEditViewModel b3 = mo27144b3();
                    ActionBlock actionBlock4 = this.f9728F;
                    if (actionBlock4 == null) {
                        C13706o.m87945v("actionBlock");
                    } else {
                        actionBlock2 = actionBlock4;
                    }
                    b3.mo27187n(actionBlock2);
                    finish();
                    return;
                }
            }
        }
        if (!m14581d3()) {
            return;
        }
        if (this.f9730H) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle((int) C17541R$string.save_changes);
            builder.setMessage((int) C17541R$string.do_you_wish_to_save_changes);
            builder.setPositiveButton((int) C17541R$string.save, (DialogInterface.OnClickListener) new C3732s(this));
            builder.setNegativeButton((int) C17541R$string.discard, (DialogInterface.OnClickListener) new C3729p(this));
            builder.show();
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        boolean z;
        long j;
        super.onCreate(bundle);
        C7989a c = C7989a.m33286c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f9726D = c;
        C7989a aVar = null;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        this.f9729G = C5163j2.m20026O(this);
        this.f9741S = new C4653z0(this, new C3696q(this), new C3697r(this), new C3698s(this));
        Intent intent = getIntent();
        this.f9738P = intent != null ? intent.getBooleanExtra("no_advert", false) : false;
        if (bundle != null) {
            this.f9732J = (SelectableItem) bundle.getParcelable("selectable_item");
        }
        Intent intent2 = getIntent();
        this.f9733K = intent2 != null ? intent2.getBooleanExtra("adding_new", false) : false;
        if (getIntent() == null || getIntent().getAction() == null || !C13706o.m87924a(getIntent().getAction(), "android.intent.action.VIEW") || getIntent().getData() == null) {
            j = getIntent().getLongExtra("ActionBlockGuid", -1);
            z = false;
        } else {
            this.f9738P = true;
            Uri data = getIntent().getData();
            if (C15176v.m93640u(String.valueOf(data), ".ablock", false, 2, (Object) null) || C15176v.m93634I(String.valueOf(data), "content://", false, 2, (Object) null)) {
                try {
                    ContentResolver contentResolver = getContentResolver();
                    C13706o.m87926c(data);
                    InputStream openInputStream = contentResolver.openInputStream(data);
                    C13706o.m87926c(openInputStream);
                    j = m14602o3(openInputStream);
                } catch (Exception e) {
                    C15626c.m94876a(getApplicationContext(), "The selected file could not be imported into MacroDroid", 1).show();
                    FirebaseCrashlytics.m6487a().mo22936d(new RuntimeException("Failed to import action block from input stream: " + e.getMessage()));
                    finish();
                    return;
                }
            } else {
                C13706o.m87926c(data);
                List<String> pathSegments = data.getPathSegments();
                C13706o.m87928e(pathSegments, "uri!!.pathSegments");
                Object i0 = C13566b0.m87434i0(pathSegments);
                C13706o.m87928e(i0, "uri!!.pathSegments.last()");
                j = Long.parseLong((String) i0);
            }
            z = true;
        }
        mo27144b3().mo27194t(j, z);
        getLifecycle().addObserver(mo27144b3());
        C7989a aVar2 = this.f9726D;
        if (aVar2 == null) {
            C13706o.m87945v("binding");
            aVar2 = null;
        }
        setSupportActionBar(aVar2.f19172V);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
        C7989a aVar3 = this.f9726D;
        if (aVar3 == null) {
            C13706o.m87945v("binding");
            aVar3 = null;
        }
        ImageButton imageButton = aVar3.f19177c;
        C13706o.m87928e(imageButton, "binding.actionBack");
        C4666m.m18147o(imageButton, (C13640g) null, new C3699t(this, (C13635d<? super C3699t>) null), 1, (Object) null);
        C7989a aVar4 = this.f9726D;
        if (aVar4 == null) {
            C13706o.m87945v("binding");
            aVar4 = null;
        }
        EditText editText = aVar4.f19178d;
        C13706o.m87928e(editText, "binding.actionBlockNameText");
        editText.addTextChangedListener(new C3694o(this));
        C7989a aVar5 = this.f9726D;
        if (aVar5 == null) {
            C13706o.m87945v("binding");
            aVar5 = null;
        }
        AppCompatEditText appCompatEditText = aVar5.f19188n;
        C13706o.m87928e(appCompatEditText, "binding.description");
        appCompatEditText.addTextChangedListener(new C3695p(this));
        C7989a aVar6 = this.f9726D;
        if (aVar6 == null) {
            C13706o.m87945v("binding");
        } else {
            aVar = aVar6;
        }
        aVar.f19156F.setOnExpansionUpdateListener(new C3700u(this));
        m14549M2();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C13706o.m87929f(menu, "menu");
        getMenuInflater().inflate(C17536R$menu.edit_action_block_menu, menu);
        if (this.f9728F == null) {
            finish();
            return true;
        }
        MenuItem findItem = menu.findItem(C17532R$id.menu_allow_logging);
        ActionBlock actionBlock = this.f9728F;
        if (actionBlock == null) {
            C13706o.m87945v("actionBlock");
            actionBlock = null;
        }
        findItem.setChecked(!actionBlock.isExcludedFromLog());
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        ActionBlock actionBlock = this.f9728F;
        if (actionBlock != null) {
            if (actionBlock == null) {
                C13706o.m87945v("actionBlock");
                actionBlock = null;
            }
            actionBlock.removeLocalVariableUpdatedListener(this.f9743U);
        }
    }

    public final void onEventMainThread(ShowActionBlockTestSummaryEvent showActionBlockTestSummaryEvent) {
        C13706o.m87929f(showActionBlockTestSummaryEvent, NotificationCompat.CATEGORY_EVENT);
        try {
            if (!showActionBlockTestSummaryEvent.mo29103a().isEmpty()) {
                AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog_NoTitle);
                appCompatDialog.setContentView((int) C17535R$layout.dialog_action_block_test_output);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = appCompatDialog.getWindow();
                C13706o.m87926c(window);
                layoutParams.copyFrom(window.getAttributes());
                if (!getResources().getBoolean(C17527R$bool.is_tablet)) {
                    layoutParams.width = -1;
                }
                Window window2 = appCompatDialog.getWindow();
                C13706o.m87926c(window2);
                window2.setAttributes(layoutParams);
                View findViewById = appCompatDialog.findViewById(C17532R$id.outputVars);
                C13706o.m87926c(findViewById);
                View findViewById2 = appCompatDialog.findViewById(C17532R$id.okButton);
                C13706o.m87926c(findViewById2);
                ((RecyclerView) findViewById).setAdapter(new C3738y(showActionBlockTestSummaryEvent.mo29103a()));
                C4666m.m18147o((Button) findViewById2, (C13640g) null, new C3701v(appCompatDialog, (C13635d<? super C3701v>) null), 1, (Object) null);
                appCompatDialog.show();
            }
        } catch (Exception e) {
            C4878b.m18868g("Failed to display variable summary: " + e);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        ActionBlock actionBlock = null;
        switch (menuItem.getItemId()) {
            case C17532R$id.menu_allow_logging:
                ActionBlock actionBlock2 = this.f9728F;
                if (actionBlock2 == null) {
                    C13706o.m87945v("actionBlock");
                    actionBlock2 = null;
                }
                ActionBlock actionBlock3 = this.f9728F;
                if (actionBlock3 == null) {
                    C13706o.m87945v("actionBlock");
                    actionBlock3 = null;
                }
                actionBlock2.setExcludeFromLog(!actionBlock3.isExcludedFromLog());
                ActionBlock actionBlock4 = this.f9728F;
                if (actionBlock4 == null) {
                    C13706o.m87945v("actionBlock");
                } else {
                    actionBlock = actionBlock4;
                }
                menuItem.setChecked(!actionBlock.isExcludedFromLog());
                break;
            case C17532R$id.menu_clone_action_block:
                ActionBlockEditViewModel b3 = mo27144b3();
                ActionBlock actionBlock5 = this.f9728F;
                if (actionBlock5 == null) {
                    C13706o.m87945v("actionBlock");
                } else {
                    actionBlock = actionBlock5;
                }
                b3.mo27192r(actionBlock);
                break;
            case C17532R$id.menu_delete:
                m14621y3();
                break;
            case C17532R$id.menu_save_changes:
                m14541H2();
                if (m14561R3()) {
                    this.f9730H = false;
                    m14535E2(false);
                    mo27136B3(true);
                    break;
                }
                break;
            case C17532R$id.menu_share_action_block:
                m14613u3();
                break;
            case C17532R$id.menu_share_as_image:
                m14615v3();
                break;
            case C17532R$id.menu_share_nearby:
                m14617w3();
                break;
            case C17532R$id.menu_test_actions:
                m14554O3();
                break;
            case C17532R$id.menu_text_size:
                boolean z = !this.f9729G;
                this.f9729G = z;
                C5163j2.m19988I3(this, z);
                mo27136B3(true);
                break;
            case C17532R$id.menu_toggle_description:
                m14579c3();
                break;
        }
        return true;
    }

    public void onPause() {
        C10180a.m40075a().mo80020p(this);
        if (this.f9739Q) {
            mo27142Z2().mo37358P();
            mo27142Z2().mo37363x();
            mo27142Z2().mo37359r();
        }
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        C13706o.m87929f(menu, "menu");
        menu.findItem(C17532R$id.menu_save_changes).setVisible(this.f9730H);
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f9739Q = false;
        C10180a.m40075a().mo80019m(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C13706o.m87929f(bundle, "outState");
        ActionBlock actionBlock = this.f9728F;
        if (actionBlock == null) {
            C13706o.m87945v("actionBlock");
            actionBlock = null;
        }
        bundle.putLong("MacroGuid", actionBlock.getGUID());
        bundle.putParcelable("selectable_item", this.f9732J);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: q3 */
    public final boolean mo27147q3() {
        return this.f9732J instanceof ConditionAction;
    }
}
