package com.arlosoft.macrodroid.editscreen;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Range;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.araujo.jordan.excuseme.C1624a;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.ActionBlockAction;
import com.arlosoft.macrodroid.action.CancelActiveMacroAction;
import com.arlosoft.macrodroid.action.ConditionAction;
import com.arlosoft.macrodroid.action.DisableMacroAction;
import com.arlosoft.macrodroid.action.ElseIfConditionAction;
import com.arlosoft.macrodroid.action.ElseIfConfirmedThenAction;
import com.arlosoft.macrodroid.action.ElseParentAction;
import com.arlosoft.macrodroid.action.EndIfAction;
import com.arlosoft.macrodroid.action.EndParentAction;
import com.arlosoft.macrodroid.action.ExitActionBlockAction;
import com.arlosoft.macrodroid.action.ForceMacroRunAction;
import com.arlosoft.macrodroid.action.IfConditionAction;
import com.arlosoft.macrodroid.action.LoopAction;
import com.arlosoft.macrodroid.action.ParentAction;
import com.arlosoft.macrodroid.action.WaitUntilTriggerAction;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity;
import com.arlosoft.macrodroid.actionblock.edit.C3740z;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.autobackup.worker.AutoBackupCloudWorker;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.common.C4007e1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.C4068u1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.constraint.LogicConstraint;
import com.arlosoft.macrodroid.events.MacroDeletedEvent;
import com.arlosoft.macrodroid.events.RefreshEditMacroPageEvent;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.C4921g;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.selectableitemlist.AddActionActivity;
import com.arlosoft.macrodroid.selectableitemlist.AddConstraintActivity;
import com.arlosoft.macrodroid.selectableitemlist.AddTriggerActivity;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.EmptyTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.WidgetPressedTrigger;
import com.arlosoft.macrodroid.utils.C6416p0;
import com.arlosoft.macrodroid.utils.C6421r;
import com.arlosoft.macrodroid.utils.C6422r0;
import com.arlosoft.macrodroid.utils.C6437u;
import com.arlosoft.macrodroid.variables.C6487a;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.MacroDroidVariablesActivity;
import com.arlosoft.macrodroid.variables.VariableValue;
import com.arlosoft.macrodroid.widget.C6637e;
import com.arlosoft.macrodroid.widget.LockableScrollView;
import com.arlosoft.macrodroid.widget.SelectableItemsRecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C13603n0;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13654b;
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
import p099h1.C7363c;
import p100h2.C7365a;
import p100h2.C7366i;
import p112j2.C7439d0;
import p142p0.C8056a;
import p161s1.C10180a;
import p172u1.C10283c;
import p190x3.C10378a;
import p215b8.C11102b;
import p247e6.C12156m;
import p277h9.C12408a;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p363pc.C16164b;
import p370qa.C16254a;
import p370qa.C16265l;
import p370qa.C16270q;
import p424wa.C16788e;
import p440y9.C16971a;
import p474sf.C17435a;

/* compiled from: EditMacroActivity.kt */
public final class EditMacroActivity extends MacroDroidDaggerBaseActivity implements C6637e {

    /* renamed from: j0 */
    public static final C4544a f11552j0 = new C4544a((C13695i) null);

    /* renamed from: A */
    public C4915a f11553A;

    /* renamed from: B */
    public C7366i f11554B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public Macro f11555C;

    /* renamed from: D */
    private SelectableItem f11556D;

    /* renamed from: E */
    private int f11557E;

    /* renamed from: F */
    private boolean f11558F;

    /* renamed from: G */
    private C4633q0<Action> f11559G;

    /* renamed from: H */
    private C4633q0<Trigger> f11560H;

    /* renamed from: I */
    private C4633q0<Constraint> f11561I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public boolean f11562J;

    /* renamed from: K */
    private boolean f11563K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f11564L;

    /* renamed from: M */
    private boolean f11565M;

    /* renamed from: N */
    private int f11566N;

    /* renamed from: O */
    private boolean f11567O;

    /* renamed from: P */
    private boolean f11568P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public boolean f11569Q;

    /* renamed from: R */
    private boolean f11570R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public BottomSheetBehavior<View> f11571S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public boolean f11572T = true;

    /* renamed from: U */
    private boolean f11573U;

    /* renamed from: V */
    private boolean f11574V;

    /* renamed from: W */
    private LocalVarsAdapter f11575W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public ViewGroup f11576X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public int f11577Y = 1;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public int f11578Z;

    /* renamed from: a0 */
    private MenuItem f11579a0;

    /* renamed from: b0 */
    private boolean f11580b0;

    /* renamed from: c0 */
    private Action f11581c0;

    /* renamed from: d0 */
    private Macro f11582d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public boolean f11583e0;

    /* renamed from: f0 */
    private final C16254a<C13339u> f11584f0 = new C4560i(this);

    /* renamed from: g0 */
    private final C4068u1 f11585g0 = new C4650y(this);
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public final C4562j f11586h0 = new C4562j(this);

    /* renamed from: i0 */
    public Map<Integer, View> f11587i0 = new LinkedHashMap();

    /* renamed from: s */
    public C4083b f11588s;

    /* renamed from: z */
    public C5070a f11589z;

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$a */
    /* compiled from: EditMacroActivity.kt */
    public static final class C4544a {
        private C4544a() {
        }

        public /* synthetic */ C4544a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$a0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4545a0 extends C13708q implements C16265l<SelectableItem, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4545a0(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: a */
        public final void mo28963a(SelectableItem selectableItem) {
            C13706o.m87929f(selectableItem, "item");
            this.this$0.m17872a5(selectableItem);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo28963a((SelectableItem) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$b */
    /* compiled from: EditMacroActivity.kt */
    static final class C4546b extends C13708q implements C16265l<Integer, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4546b(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: a */
        public final void mo28964a(int i) {
            boolean z = false;
            if (!this.this$0.f11572T) {
                this.this$0.f11564L = true;
                this.this$0.m17884d5();
                Macro L2 = this.this$0.f11555C;
                if (L2 == null) {
                    C13706o.m87945v("macro");
                    L2 = null;
                }
                if (i == 1) {
                    z = true;
                }
                L2.setConstraintIsOrCondition(z);
                return;
            }
            this.this$0.f11572T = false;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo28964a(((Number) obj).intValue());
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$b0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4547b0 extends C13708q implements C16265l<SelectableItem, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4547b0(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: a */
        public final void mo28965a(SelectableItem selectableItem) {
            C13706o.m87929f(selectableItem, "item");
            this.this$0.m17797C3(selectableItem);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo28965a((SelectableItem) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$c */
    /* compiled from: EditMacroActivity.kt */
    static final class C4548c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4548c(EditMacroActivity editMacroActivity, C13635d<? super C4548c> dVar) {
            super(3, dVar);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4548c(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m17927r3();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$c0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4549c0 extends C13708q implements C16265l<List<? extends SelectableItem>, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4549c0(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends SelectableItem>) (List) obj);
            return C13339u.f61331a;
        }

        public final void invoke(List<? extends SelectableItem> list) {
            C13706o.m87929f(list, "viewHolder");
            this.this$0.mo28959U4();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$d */
    /* compiled from: EditMacroActivity.kt */
    public static final class C4550d implements C6520o0.C6530d {

        /* renamed from: a */
        final /* synthetic */ EditMacroActivity f11590a;

        C4550d(EditMacroActivity editMacroActivity) {
            this.f11590a = editMacroActivity;
        }

        /* renamed from: a */
        public void mo25509a(MacroDroidVariable macroDroidVariable, boolean z) {
            C13706o.m87929f(macroDroidVariable, "variable");
            Macro L2 = this.f11590a.f11555C;
            if (L2 == null) {
                C13706o.m87945v("macro");
                L2 = null;
            }
            L2.getLocalVariables().add(macroDroidVariable);
            this.f11590a.f11564L = true;
            this.f11590a.m17818K4();
            this.f11590a.m17884d5();
        }

        /* renamed from: b */
        public boolean mo25510b(String str) {
            C13706o.m87929f(str, "variableName");
            Macro L2 = this.f11590a.f11555C;
            if (L2 == null) {
                C13706o.m87945v("macro");
                L2 = null;
            }
            return L2.findLocalVariableByName(str) == null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$d0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4551d0 extends C13708q implements C16265l<SelectableItem, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4551d0(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: a */
        public final void mo28968a(SelectableItem selectableItem) {
            C13706o.m87929f(selectableItem, "item");
            this.this$0.m17860X4(selectableItem);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo28968a((SelectableItem) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$e */
    /* compiled from: EditMacroActivity.kt */
    static final class C4552e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4552e(EditMacroActivity editMacroActivity, C13635d<? super C4552e> dVar) {
            super(3, dVar);
            this.this$0 = editMacroActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public static final boolean m17972r(EditMacroActivity editMacroActivity, MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == 2131363214) {
                editMacroActivity.f11577Y = 2;
            } else if (itemId == 2131363232) {
                editMacroActivity.f11577Y = 0;
            } else if (itemId == 2131363236) {
                editMacroActivity.f11577Y = 1;
            }
            C5163j2.m20275u4(editMacroActivity, editMacroActivity.f11577Y);
            editMacroActivity.m17823M4();
            return true;
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                EditMacroActivity editMacroActivity = this.this$0;
                ViewGroup O2 = editMacroActivity.f11576X;
                if (O2 == null) {
                    C13706o.m87945v("varsLayout");
                    O2 = null;
                }
                PopupMenu popupMenu = new PopupMenu(editMacroActivity, (FrameLayout) O2.findViewById(C17532R$id.varTitleLayout));
                popupMenu.inflate(C17536R$menu.local_vars_display_mode_menu);
                popupMenu.setOnMenuItemClickListener(new C4621k0(this.this$0));
                popupMenu.show();
                boolean z = false;
                popupMenu.getMenu().findItem(C17532R$id.menu_hide).setChecked(this.this$0.f11577Y == 0);
                popupMenu.getMenu().findItem(C17532R$id.menu_inline).setChecked(this.this$0.f11577Y == 1);
                MenuItem findItem = popupMenu.getMenu().findItem(C17532R$id.menu_bottom_bar);
                if (this.this$0.f11577Y == 2) {
                    z = true;
                }
                findItem.setChecked(z);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: p */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4552e(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$e0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4553e0 extends C13708q implements C16265l<SelectableItem, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4553e0(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: a */
        public final void mo28970a(SelectableItem selectableItem) {
            C13706o.m87929f(selectableItem, "item");
            this.this$0.m17872a5(selectableItem);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo28970a((SelectableItem) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$f */
    /* compiled from: AlertDialog.kt */
    public static final class C4554f implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f11591a;

        public C4554f(AlertDialog alertDialog) {
            this.f11591a = alertDialog;
        }

        public final void onShow(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$f0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4555f0 extends C13708q implements C16265l<SelectableItem, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4555f0(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: a */
        public final void mo28972a(SelectableItem selectableItem) {
            C13706o.m87929f(selectableItem, "item");
            this.this$0.m17797C3(selectableItem);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo28972a((SelectableItem) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$g */
    /* compiled from: AlertDialog.kt */
    public static final class C4556g implements DialogInterface.OnClickListener {
        public final void onClick(DialogInterface dialogInterface, int i) {
            C13706o.m87929f(dialogInterface, "dialog");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$g0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4557g0 extends C13708q implements C16265l<List<? extends SelectableItem>, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4557g0(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends SelectableItem>) (List) obj);
            return C13339u.f61331a;
        }

        public final void invoke(List<? extends SelectableItem> list) {
            C13706o.m87929f(list, "it");
            this.this$0.mo28959U4();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$h */
    /* compiled from: AlertDialog.kt */
    public static final class C4558h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditMacroActivity f11592a;

        /* renamed from: c */
        final /* synthetic */ boolean f11593c;

        public C4558h(EditMacroActivity editMacroActivity, boolean z) {
            this.f11592a = editMacroActivity;
            this.f11593c = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C13706o.m87929f(dialogInterface, "dialog");
            this.f11592a.m17894g3(this.f11593c);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$h0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4559h0 extends C13708q implements C16265l<MacroDroidVariable, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4559h0(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: a */
        public final void mo28976a(MacroDroidVariable macroDroidVariable) {
            C13706o.m87929f(macroDroidVariable, "it");
            this.this$0.m17876b5(macroDroidVariable);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo28976a((MacroDroidVariable) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$i */
    /* compiled from: EditMacroActivity.kt */
    static final class C4560i extends C13708q implements C16254a<C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4560i(EditMacroActivity editMacroActivity) {
            super(0);
            this.this$0 = editMacroActivity;
        }

        public final void invoke() {
            this.this$0.f11564L = true;
            this.this$0.m17884d5();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$i0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4561i0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4633q0<T> $adapter;
        final /* synthetic */ ImageButton $button;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4561i0(C4633q0<T> q0Var, ImageButton imageButton, C13635d<? super C4561i0> dVar) {
            super(3, dVar);
            this.$adapter = q0Var;
            this.$button = imageButton;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4561i0(this.$adapter, this.$button, dVar).invokeSuspend(C13339u.f61331a);
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

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$j */
    /* compiled from: EditMacroActivity.kt */
    public static final class C4562j implements C7366i.C7369c {

        /* renamed from: a */
        final /* synthetic */ EditMacroActivity f11594a;

        C4562j(EditMacroActivity editMacroActivity) {
            this.f11594a = editMacroActivity;
        }

        /* renamed from: a */
        public void mo27170a(C7365a aVar) {
            C13706o.m87929f(aVar, "nearbyDevice");
            ((ExpandableLayout) this.f11594a.mo28951B2(C17532R$id.nearbySharePanel)).mo75513c();
            this.f11594a.mo28953H3().mo37358P();
            this.f11594a.mo28953H3().mo37363x();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$j0 */
    /* compiled from: View.kt */
    public static final class C4563j0 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f11595a;

        /* renamed from: c */
        final /* synthetic */ int f11596c;

        /* renamed from: d */
        final /* synthetic */ LinearLayoutManager f11597d;

        /* renamed from: f */
        final /* synthetic */ RecyclerView f11598f;

        public C4563j0(View view, int i, LinearLayoutManager linearLayoutManager, RecyclerView recyclerView) {
            this.f11595a = view;
            this.f11596c = i;
            this.f11597d = linearLayoutManager;
            this.f11598f = recyclerView;
        }

        public final void run() {
            if (this.f11596c > this.f11597d.findLastCompletelyVisibleItemPosition()) {
                this.f11598f.scrollToPosition(this.f11596c);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$k */
    /* compiled from: EditMacroActivity.kt */
    static final class C4564k extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4564k(EditMacroActivity editMacroActivity, C13635d<? super C4564k> dVar) {
            super(3, dVar);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4564k(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m17831P3();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$k0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4565k0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4633q0<Action> $extractActionsAdapter;
        final /* synthetic */ RecyclerView $extractActionsList;
        final /* synthetic */ LinearLayoutManager $layoutManager;
        int label;
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4565k0(C4633q0<Action> q0Var, LinearLayoutManager linearLayoutManager, RecyclerView recyclerView, EditMacroActivity editMacroActivity, C13635d<? super C4565k0> dVar) {
            super(3, dVar);
            this.$extractActionsAdapter = q0Var;
            this.$layoutManager = linearLayoutManager;
            this.$extractActionsList = recyclerView;
            this.this$0 = editMacroActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4565k0(this.$extractActionsAdapter, this.$layoutManager, this.$extractActionsList, this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                int P = this.$extractActionsAdapter.mo29059P(true);
                if (P < this.$layoutManager.findFirstCompletelyVisibleItemPosition()) {
                    this.$extractActionsList.scrollToPosition(P);
                }
                this.this$0.m17892f5(this.$extractActionsAdapter);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$l */
    /* compiled from: EditMacroActivity.kt */
    static final class C4566l extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4566l(EditMacroActivity editMacroActivity, C13635d<? super C4566l> dVar) {
            super(3, dVar);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4566l(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m17825N3();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$l0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4567l0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4633q0<Action> $extractActionsAdapter;
        final /* synthetic */ RecyclerView $extractActionsList;
        final /* synthetic */ LinearLayoutManager $layoutManager;
        int label;
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4567l0(C4633q0<Action> q0Var, LinearLayoutManager linearLayoutManager, RecyclerView recyclerView, EditMacroActivity editMacroActivity, C13635d<? super C4567l0> dVar) {
            super(3, dVar);
            this.$extractActionsAdapter = q0Var;
            this.$layoutManager = linearLayoutManager;
            this.$extractActionsList = recyclerView;
            this.this$0 = editMacroActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4567l0(this.$extractActionsAdapter, this.$layoutManager, this.$extractActionsList, this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                int P = this.$extractActionsAdapter.mo29059P(false);
                if (P > this.$layoutManager.findLastCompletelyVisibleItemPosition()) {
                    this.$extractActionsList.scrollToPosition(P);
                }
                this.this$0.m17892f5(this.$extractActionsAdapter);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$m */
    /* compiled from: EditMacroActivity.kt */
    static final class C4568m extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4568m(EditMacroActivity editMacroActivity, C13635d<? super C4568m> dVar) {
            super(3, dVar);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4568m(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.m17828O3();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$m0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4569m0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4633q0<Action> $extractActionsAdapter;
        final /* synthetic */ RecyclerView $extractActionsList;
        final /* synthetic */ LinearLayoutManager $layoutManager;
        int label;
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4569m0(C4633q0<Action> q0Var, LinearLayoutManager linearLayoutManager, RecyclerView recyclerView, EditMacroActivity editMacroActivity, C13635d<? super C4569m0> dVar) {
            super(3, dVar);
            this.$extractActionsAdapter = q0Var;
            this.$layoutManager = linearLayoutManager;
            this.$extractActionsList = recyclerView;
            this.this$0 = editMacroActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4569m0(this.$extractActionsAdapter, this.$layoutManager, this.$extractActionsList, this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                int O = this.$extractActionsAdapter.mo29058O(true);
                if (O < this.$layoutManager.findFirstCompletelyVisibleItemPosition()) {
                    this.$extractActionsList.scrollToPosition(O);
                }
                this.this$0.m17892f5(this.$extractActionsAdapter);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$n */
    /* compiled from: EditMacroActivity.kt */
    public static final class C4570n extends BottomSheetBehavior.BottomSheetCallback {

        /* renamed from: a */
        final /* synthetic */ EditMacroActivity f11599a;

        C4570n(EditMacroActivity editMacroActivity) {
            this.f11599a = editMacroActivity;
        }

        /* renamed from: a */
        public void mo28985a(View view, float f) {
            C13706o.m87929f(view, "bottomSheet");
            EditMacroActivity editMacroActivity = this.f11599a;
            int i = C17532R$id.acceptButton;
            boolean z = true;
            float f2 = ((float) 1) - f;
            ((FloatingActionButton) editMacroActivity.mo28951B2(i)).animate().scaleX(f2).scaleY(f2).setDuration(0).start();
            ViewGroup O2 = this.f11599a.f11576X;
            ViewGroup viewGroup = null;
            if (O2 == null) {
                C13706o.m87945v("varsLayout");
                O2 = null;
            }
            int i2 = C17532R$id.addVariableButton;
            ((ImageButton) O2.findViewById(i2)).setAlpha(f);
            EditMacroActivity editMacroActivity2 = this.f11599a;
            int i3 = C17532R$id.topLevelLayout;
            ((LinearLayout) editMacroActivity2.mo28951B2(i3)).setPadding(((LinearLayout) this.f11599a.mo28951B2(i3)).getPaddingLeft(), ((LinearLayout) this.f11599a.mo28951B2(i3)).getPaddingTop(), ((LinearLayout) this.f11599a.mo28951B2(i3)).getPaddingRight(), ((int) (((float) (view.getHeight() - this.f11599a.f11578Z)) * f)) + this.f11599a.f11578Z);
            int i4 = 8;
            if (this.f11599a.f11564L || this.f11599a.f11569Q || this.f11599a.f11562J) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) this.f11599a.mo28951B2(i);
                C13706o.m87928e(floatingActionButton, "acceptButton");
                floatingActionButton.setVisibility((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) < 0 ? 0 : 8);
            } else {
                FloatingActionButton floatingActionButton2 = (FloatingActionButton) this.f11599a.mo28951B2(i);
                C13706o.m87928e(floatingActionButton2, "acceptButton");
                floatingActionButton2.setVisibility(8);
            }
            ViewGroup O22 = this.f11599a.f11576X;
            if (O22 == null) {
                C13706o.m87945v("varsLayout");
            } else {
                viewGroup = O22;
            }
            ImageButton imageButton = (ImageButton) viewGroup.findViewById(i2);
            C13706o.m87928e(imageButton, "varsLayout.addVariableButton");
            if (f <= 0.0f) {
                z = false;
            }
            if (z) {
                i4 = 0;
            }
            imageButton.setVisibility(i4);
        }

        /* renamed from: b */
        public void mo28986b(View view, int i) {
            C13706o.m87929f(view, "bottomSheet");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$n0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4571n0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C4633q0<Action> $extractActionsAdapter;
        final /* synthetic */ RecyclerView $extractActionsList;
        final /* synthetic */ LinearLayoutManager $layoutManager;
        int label;
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4571n0(C4633q0<Action> q0Var, LinearLayoutManager linearLayoutManager, RecyclerView recyclerView, EditMacroActivity editMacroActivity, C13635d<? super C4571n0> dVar) {
            super(3, dVar);
            this.$extractActionsAdapter = q0Var;
            this.$layoutManager = linearLayoutManager;
            this.$extractActionsList = recyclerView;
            this.this$0 = editMacroActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4571n0(this.$extractActionsAdapter, this.$layoutManager, this.$extractActionsList, this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                int O = this.$extractActionsAdapter.mo29058O(false);
                if (O > this.$layoutManager.findLastCompletelyVisibleItemPosition()) {
                    this.$extractActionsList.scrollToPosition(O);
                }
                this.this$0.m17892f5(this.$extractActionsAdapter);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$o */
    /* compiled from: EditMacroActivity.kt */
    static final class C4572o extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4572o(EditMacroActivity editMacroActivity, C13635d<? super C4572o> dVar) {
            super(3, dVar);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4572o(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                BottomSheetBehavior H2 = this.this$0.f11571S;
                BottomSheetBehavior bottomSheetBehavior = null;
                if (H2 == null) {
                    C13706o.m87945v("bottomSheetBehavior");
                    H2 = null;
                }
                if (H2.mo56933C() == 3) {
                    BottomSheetBehavior H22 = this.this$0.f11571S;
                    if (H22 == null) {
                        C13706o.m87945v("bottomSheetBehavior");
                    } else {
                        bottomSheetBehavior = H22;
                    }
                    bottomSheetBehavior.mo56951Y(4);
                } else {
                    BottomSheetBehavior H23 = this.this$0.f11571S;
                    if (H23 == null) {
                        C13706o.m87945v("bottomSheetBehavior");
                    } else {
                        bottomSheetBehavior = H23;
                    }
                    bottomSheetBehavior.mo56951Y(3);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$o0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4573o0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ TextView $actionBlockNameText;
        final /* synthetic */ AppCompatDialog $dialog;
        final /* synthetic */ C4633q0<Action> $extractActionsAdapter;
        int label;
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4573o0(EditMacroActivity editMacroActivity, TextView textView, C4633q0<Action> q0Var, AppCompatDialog appCompatDialog, C13635d<? super C4573o0> dVar) {
            super(3, dVar);
            this.this$0 = editMacroActivity;
            this.$actionBlockNameText = textView;
            this.$extractActionsAdapter = q0Var;
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4573o0(this.this$0, this.$actionBlockNameText, this.$extractActionsAdapter, this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.f11564L = true;
                CharSequence text = this.$actionBlockNameText.getText();
                C13706o.m87928e(text, "actionBlockNameText.text");
                if (text.length() == 0) {
                    EditMacroActivity editMacroActivity = this.this$0;
                    C4061t1.m16019t(editMacroActivity, editMacroActivity.getString(C17541R$string.invalid_action_block), this.this$0.getString(C17541R$string.please_set_a_name));
                } else if (this.this$0.m17792A3(this.$actionBlockNameText.getText().toString())) {
                    EditMacroActivity editMacroActivity2 = this.this$0;
                    C4061t1.m16019t(editMacroActivity2, editMacroActivity2.getString(C17541R$string.invalid_action_block), this.this$0.getString(C17541R$string.action_block_name_already_exists));
                } else if (this.$extractActionsAdapter.mo29056L()) {
                    EditMacroActivity editMacroActivity3 = this.this$0;
                    C4061t1.m16019t(editMacroActivity3, editMacroActivity3.getString(C17541R$string.invalid_action_block), this.this$0.getString(C17541R$string.action_block_extract_invalid_control_flow));
                } else {
                    Range<Integer> K = this.$extractActionsAdapter.mo29055K();
                    if (K != null) {
                        EditMacroActivity editMacroActivity4 = this.this$0;
                        TextView textView = this.$actionBlockNameText;
                        Macro L2 = editMacroActivity4.f11555C;
                        if (L2 == null) {
                            C13706o.m87945v("macro");
                            L2 = null;
                        }
                        ArrayList<Action> actions = L2.getActions();
                        Integer lower = K.getLower();
                        C13706o.m87928e(lower, "range.lower");
                        List<Action> subList = actions.subList(lower.intValue(), K.getUpper().intValue() + 1);
                        C13706o.m87928e(subList, "macro.actions.subList(ra…e.lower, range.upper + 1)");
                        ArrayList arrayList = new ArrayList();
                        for (T next : subList) {
                            if (next instanceof WaitUntilTriggerAction) {
                                arrayList.add(next);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            C13696i0 i0Var = C13696i0.f61931a;
                            String string = editMacroActivity4.getString(C17541R$string.action_block_extract_feature_x_not_available);
                            C13706o.m87928e(string, "getString(R.string.actio…_feature_x_not_available)");
                            String format = String.format(string, Arrays.copyOf(new Object[]{editMacroActivity4.getString(C17541R$string.action_wait_until_trigger)}, 1));
                            C13706o.m87928e(format, "format(format, *args)");
                            C4061t1.m16019t(editMacroActivity4, editMacroActivity4.getString(C17541R$string.invalid_action_block), format);
                            return C13339u.f61331a;
                        }
                        Integer lower2 = K.getLower();
                        C13706o.m87928e(lower2, "range.lower");
                        int intValue = lower2.intValue();
                        Integer upper = K.getUpper();
                        C13706o.m87928e(upper, "range.upper");
                        C13654b.m87833a(editMacroActivity4.m17919o4(intValue, upper.intValue(), textView.getText().toString()));
                    }
                    this.$dialog.dismiss();
                    EditMacroActivity.m17809G4(this.this$0, false, 1, (Object) null);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$p */
    /* compiled from: EditMacroActivity.kt */
    static final class C4574p extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4574p(EditMacroActivity editMacroActivity, C13635d<? super C4574p> dVar) {
            super(3, dVar);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4574p(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo28958T3(true);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$p0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4575p0 extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ AppCompatDialog $dialog;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4575p0(AppCompatDialog appCompatDialog, C13635d<? super C4575p0> dVar) {
            super(3, dVar);
            this.$dialog = appCompatDialog;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4575p0(this.$dialog, dVar).invokeSuspend(C13339u.f61331a);
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

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$q */
    /* compiled from: EditMacroActivity.kt */
    static final class C4576q extends C13708q implements C16265l<String, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4576q(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13339u.f61331a;
        }

        public final void invoke(String str) {
            C13706o.m87929f(str, "it");
            this.this$0.f11564L = true;
            this.this$0.m17884d5();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$q0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4577q0 extends C13708q implements C16265l<SelectableItem, C13339u> {

        /* renamed from: a */
        public static final C4577q0 f11600a = new C4577q0();

        C4577q0() {
            super(1);
        }

        /* renamed from: a */
        public final void mo28993a(SelectableItem selectableItem) {
            C13706o.m87929f(selectableItem, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo28993a((SelectableItem) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$r */
    /* compiled from: EditMacroActivity.kt */
    static final class C4578r extends C13708q implements C16265l<String, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4578r(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13339u.f61331a;
        }

        public final void invoke(String str) {
            C13706o.m87929f(str, "it");
            this.this$0.f11564L = true;
            this.this$0.m17884d5();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$r0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4579r0 extends C13708q implements C16265l<SelectableItem, C13339u> {

        /* renamed from: a */
        public static final C4579r0 f11601a = new C4579r0();

        C4579r0() {
            super(1);
        }

        /* renamed from: a */
        public final void mo28995a(SelectableItem selectableItem) {
            C13706o.m87929f(selectableItem, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo28995a((SelectableItem) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$s */
    /* compiled from: EditMacroActivity.kt */
    static final class C4580s extends C13708q implements C16265l<C1423a, C13339u> {
        final /* synthetic */ String $permissionRequired;
        final /* synthetic */ EditMacroActivity this$0;

        /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$s$a */
        /* compiled from: EditMacroActivity.kt */
        static final class C4581a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ EditMacroActivity this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4581a(EditMacroActivity editMacroActivity, C13635d<? super C4581a> dVar) {
                super(3, dVar);
                this.this$0 = editMacroActivity;
            }

            /* renamed from: h */
            public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
                return new C4581a(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    ((ExpandableLayout) this.this$0.mo28951B2(C17532R$id.nearbySharePanel)).mo75513c();
                    this.this$0.mo28953H3().mo37358P();
                    this.this$0.mo28953H3().mo37363x();
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4580s(String str, EditMacroActivity editMacroActivity) {
            super(1);
            this.$permissionRequired = str;
            this.this$0 = editMacroActivity;
        }

        /* renamed from: a */
        public final void mo28996a(C1423a aVar) {
            C13706o.m87929f(aVar, "it");
            if (aVar.mo16888b().contains(this.$permissionRequired)) {
                ((ExpandableLayout) this.this$0.mo28951B2(C17532R$id.nearbySharePanel)).mo75515e();
                C7366i H3 = this.this$0.mo28953H3();
                Macro L2 = this.this$0.f11555C;
                if (L2 == null) {
                    C13706o.m87945v("macro");
                    L2 = null;
                }
                H3.mo37353D(L2, this.this$0.f11586h0);
                ImageView imageView = (ImageView) this.this$0.mo28951B2(C17532R$id.dismissButton);
                C13706o.m87928e(imageView, "dismissButton");
                C4666m.m18147o(imageView, (C13640g) null, new C4581a(this.this$0, (C13635d<? super C4581a>) null), 1, (Object) null);
                this.this$0.mo28953H3().mo37356L("com.arlosoft.macrodroid.MACRO_SHARE");
                this.this$0.f11583e0 = true;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo28996a((C1423a) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$s0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4582s0 extends C13708q implements C16265l<SelectableItem, C13339u> {

        /* renamed from: a */
        public static final C4582s0 f11602a = new C4582s0();

        C4582s0() {
            super(1);
        }

        /* renamed from: a */
        public final void mo28998a(SelectableItem selectableItem) {
            C13706o.m87929f(selectableItem, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo28998a((SelectableItem) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$t */
    /* compiled from: EditMacroActivity.kt */
    static final class C4583t extends C13708q implements C16265l<String, C13339u> {
        final /* synthetic */ EditText $category;
        final /* synthetic */ Button $okButton;
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4583t(Button button, EditText editText, EditMacroActivity editMacroActivity) {
            super(1);
            this.$okButton = button;
            this.$category = editText;
            this.this$0 = editMacroActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13339u.f61331a;
        }

        public final void invoke(String str) {
            C13706o.m87929f(str, "it");
            Button button = this.$okButton;
            if (button != null) {
                Editable text = this.$category.getText();
                C13706o.m87928e(text, "category.text");
                button.setEnabled(text.length() > 0);
            }
            this.this$0.f11564L = true;
            this.this$0.m17884d5();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$t0 */
    /* compiled from: EditMacroActivity.kt */
    static final class C4584t0 extends C13708q implements C16265l<List<? extends SelectableItem>, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4584t0(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends SelectableItem>) (List) obj);
            return C13339u.f61331a;
        }

        public final void invoke(List<? extends SelectableItem> list) {
            C13706o.m87929f(list, "itemsList");
            this.this$0.mo28959U4();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$u */
    /* compiled from: EditMacroActivity.kt */
    static final class C4585u extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4585u(EditMacroActivity editMacroActivity, C13635d<? super C4585u> dVar) {
            super(3, dVar);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4585u(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                Intent intent = new Intent(this.this$0, AddConstraintActivity.class);
                Macro L2 = this.this$0.f11555C;
                if (L2 == null) {
                    C13706o.m87945v("macro");
                    L2 = null;
                }
                intent.putExtra("MacroId", L2.getId());
                this.this$0.startActivityForResult(intent, 909091);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$u0 */
    /* compiled from: EditMacroActivity.kt */
    public static final class C4586u0 implements C6487a {

        /* renamed from: a */
        final /* synthetic */ EditMacroActivity f11603a;

        /* renamed from: b */
        final /* synthetic */ MacroDroidVariable f11604b;

        C4586u0(EditMacroActivity editMacroActivity, MacroDroidVariable macroDroidVariable) {
            this.f11603a = editMacroActivity;
            this.f11604b = macroDroidVariable;
        }

        /* renamed from: a */
        public void mo27159a() {
            this.f11603a.f11564L = true;
            this.f11603a.m17884d5();
            this.f11603a.mo28962z4(true);
        }

        /* renamed from: b */
        public void mo27160b() {
            this.f11603a.f11564L = true;
            this.f11603a.m17884d5();
            this.f11603a.mo28962z4(true);
        }

        /* renamed from: c */
        public void mo27161c(VariableValue.DictionaryEntry dictionaryEntry) {
            C13706o.m87929f(dictionaryEntry, "removedEntry");
            this.f11603a.f11564L = true;
            this.f11603a.m17884d5();
            this.f11603a.mo28962z4(true);
        }

        /* renamed from: d */
        public void mo27162d(VariableValue.DictionaryEntry dictionaryEntry, VariableValue.DictionaryEntry dictionaryEntry2) {
            VariableValue variableValue;
            C13706o.m87929f(dictionaryEntry, "newEntry");
            this.f11603a.f11564L = true;
            this.f11603a.m17884d5();
            this.f11603a.mo28962z4(true);
            Macro L2 = this.f11603a.f11555C;
            if (L2 == null) {
                C13706o.m87945v("macro");
                L2 = null;
            }
            Set<C4068u1> localVariableUpdatedListeners = L2.getLocalVariableUpdatedListeners();
            if (localVariableUpdatedListeners != null) {
                MacroDroidVariable macroDroidVariable = this.f11604b;
                EditMacroActivity editMacroActivity = this.f11603a;
                for (C4068u1 u1Var : localVariableUpdatedListeners) {
                    if (dictionaryEntry2 != null) {
                        variableValue = dictionaryEntry2;
                    } else {
                        variableValue = VariableValue.Empty.INSTANCE;
                    }
                    Macro L22 = editMacroActivity.f11555C;
                    if (L22 == null) {
                        C13706o.m87945v("macro");
                        L22 = null;
                    }
                    u1Var.mo27212v(macroDroidVariable, dictionaryEntry, variableValue, L22.getGUID());
                }
            }
        }

        /* renamed from: e */
        public void mo27163e() {
            Macro L2 = this.f11603a.f11555C;
            if (L2 == null) {
                C13706o.m87945v("macro");
                L2 = null;
            }
            L2.getLocalVariables().remove(this.f11604b);
            this.f11603a.f11564L = true;
            this.f11603a.m17884d5();
            this.f11603a.mo28962z4(true);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$v */
    /* compiled from: EditMacroActivity.kt */
    static final class C4587v extends C13708q implements C16265l<SelectableItem, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4587v(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: a */
        public final void mo29002a(SelectableItem selectableItem) {
            C13706o.m87929f(selectableItem, "item");
            this.this$0.m17860X4(selectableItem);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo29002a((SelectableItem) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$w */
    /* compiled from: EditMacroActivity.kt */
    static final class C4588w extends C13708q implements C16265l<SelectableItem, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4588w(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: a */
        public final void mo29003a(SelectableItem selectableItem) {
            C13706o.m87929f(selectableItem, "item");
            if (!(selectableItem instanceof ElseParentAction) && !(selectableItem instanceof EndIfAction)) {
                this.this$0.m17872a5(selectableItem);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo29003a((SelectableItem) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$x */
    /* compiled from: EditMacroActivity.kt */
    static final class C4589x extends C13708q implements C16265l<SelectableItem, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4589x(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: a */
        public final void mo29004a(SelectableItem selectableItem) {
            C13706o.m87929f(selectableItem, "item");
            this.this$0.m17797C3(selectableItem);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo29004a((SelectableItem) obj);
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$y */
    /* compiled from: EditMacroActivity.kt */
    static final class C4590y extends C13708q implements C16265l<List<? extends SelectableItem>, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4590y(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends SelectableItem>) (List) obj);
            return C13339u.f61331a;
        }

        public final void invoke(List<? extends SelectableItem> list) {
            C13706o.m87929f(list, "itemsList");
            this.this$0.mo28959U4();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.EditMacroActivity$z */
    /* compiled from: EditMacroActivity.kt */
    static final class C4591z extends C13708q implements C16265l<SelectableItem, C13339u> {
        final /* synthetic */ EditMacroActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4591z(EditMacroActivity editMacroActivity) {
            super(1);
            this.this$0 = editMacroActivity;
        }

        /* renamed from: a */
        public final void mo29006a(SelectableItem selectableItem) {
            C13706o.m87929f(selectableItem, "item");
            this.this$0.m17860X4(selectableItem);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo29006a((SelectableItem) obj);
            return C13339u.f61331a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public final boolean m17792A3(String str) {
        for (ActionBlock name : mo28952F3().mo29645c()) {
            if (C13706o.m87924a(name.getName(), str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A4 */
    public static /* synthetic */ void m17793A4(EditMacroActivity editMacroActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        editMacroActivity.mo28962z4(z);
    }

    /* renamed from: B3 */
    private final boolean m17794B3(String str) {
        List<Macro> z = C4934n.m18998M().mo29710z();
        C13706o.m87928e(z, "allMacros");
        for (Macro macro : z) {
            Macro macro2 = this.f11555C;
            if (macro2 == null) {
                C13706o.m87945v("macro");
                macro2 = null;
            }
            if (!C13706o.m87924a(macro, macro2) && C13706o.m87924a(macro.getName(), str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: B4 */
    public static final void m17795B4(EditMacroActivity editMacroActivity, View view) {
        C13706o.m87929f(editMacroActivity, "this$0");
        Intent intent = new Intent(editMacroActivity, AddTriggerActivity.class);
        Macro macro = editMacroActivity.f11555C;
        Macro macro2 = null;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        intent.putExtra("MacroId", macro.getId());
        Macro macro3 = editMacroActivity.f11555C;
        if (macro3 == null) {
            C13706o.m87945v("macro");
        } else {
            macro2 = macro3;
        }
        if (macro2.getTriggerList().size() <= 0 || C5163j2.m19957E2(editMacroActivity)) {
            editMacroActivity.startActivityForResult(intent, 909091);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(editMacroActivity, C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.multiple_triggers);
        builder.setMessage((int) C17541R$string.multiple_trigger_info).setCancelable(true).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4617i0(editMacroActivity, intent));
        builder.show();
        C5163j2.m20004K5(editMacroActivity, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public final void m17797C3(SelectableItem selectableItem) {
        C13706o.m87927d(selectableItem, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.ParentAction");
        ParentAction parentAction = (ParentAction) selectableItem;
        parentAction.mo25459K3(!parentAction.mo25458J3());
        m17806F4(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: C4 */
    public static final void m17798C4(EditMacroActivity editMacroActivity, Intent intent, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(editMacroActivity, "this$0");
        C13706o.m87929f(intent, "$myStarterIntent");
        editMacroActivity.startActivityForResult(intent, 909091);
    }

    /* renamed from: D3 */
    private final void m17800D3(boolean z) {
        mo28952F3().mo29644b();
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: D4 */
    public static final void m17801D4(EditMacroActivity editMacroActivity, View view) {
        C13706o.m87929f(editMacroActivity, "this$0");
        Macro macro = null;
        editMacroActivity.f11581c0 = null;
        Intent intent = new Intent(editMacroActivity, AddActionActivity.class);
        Macro macro2 = editMacroActivity.f11555C;
        if (macro2 == null) {
            C13706o.m87945v("macro");
        } else {
            macro = macro2;
        }
        intent.putExtra("MacroId", macro.getId());
        editMacroActivity.startActivityForResult(intent, 909091);
    }

    /* renamed from: E3 */
    private final void m17803E3() {
        Object systemService = getSystemService("input_method");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(((AppCompatEditText) mo28951B2(C17532R$id.macroDescription)).getWindowToken(), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: E4 */
    public static final void m17804E4(EditMacroActivity editMacroActivity, ImageButton imageButton, View view) {
        C13706o.m87929f(editMacroActivity, "this$0");
        if (editMacroActivity.f11558F) {
            editMacroActivity.f11558F = false;
            int i = C17532R$id.actionsList;
            ((SelectableItemsRecyclerView) editMacroActivity.mo28951B2(i)).setNestedScrollingEnabled(false);
            imageButton.setImageResource(C17530R$drawable.ic_arrow_expand_white_24dp);
            CardView cardView = (CardView) editMacroActivity.mo28951B2(C17532R$id.triggersContainer);
            C13706o.m87928e(cardView, "triggersContainer");
            cardView.setVisibility(0);
            CardView cardView2 = (CardView) editMacroActivity.mo28951B2(C17532R$id.constraintsContainer);
            C13706o.m87928e(cardView2, "constraintsContainer");
            cardView2.setVisibility(0);
            if (C5163j2.m19955E0(C10378a.f23596a.mo41059a()) == 1) {
                CardView cardView3 = (CardView) editMacroActivity.mo28951B2(C17532R$id.varsInlineContainer);
                C13706o.m87928e(cardView3, "varsInlineContainer");
                cardView3.setVisibility(0);
            }
            int i2 = C17532R$id.actionsContainer;
            ViewGroup.LayoutParams layoutParams = ((CardView) editMacroActivity.mo28951B2(i2)).getLayoutParams();
            C13706o.m87927d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = -2;
            ((CardView) editMacroActivity.mo28951B2(i2)).setLayoutParams(layoutParams2);
            ((SelectableItemsRecyclerView) editMacroActivity.mo28951B2(i)).requestLayout();
            return;
        }
        editMacroActivity.f11558F = true;
        imageButton.setImageResource(C17530R$drawable.ic_arrow_compress_white_24dp);
        CardView cardView4 = (CardView) editMacroActivity.mo28951B2(C17532R$id.triggersContainer);
        C13706o.m87928e(cardView4, "triggersContainer");
        cardView4.setVisibility(8);
        CardView cardView5 = (CardView) editMacroActivity.mo28951B2(C17532R$id.constraintsContainer);
        C13706o.m87928e(cardView5, "constraintsContainer");
        cardView5.setVisibility(8);
        if (C5163j2.m19955E0(C10378a.f23596a.mo41059a()) == 1) {
            CardView cardView6 = (CardView) editMacroActivity.mo28951B2(C17532R$id.varsInlineContainer);
            C13706o.m87928e(cardView6, "varsInlineContainer");
            cardView6.setVisibility(8);
        }
        int i3 = C17532R$id.actionsContainer;
        ViewGroup.LayoutParams layoutParams3 = ((CardView) editMacroActivity.mo28951B2(i3)).getLayoutParams();
        C13706o.m87927d(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.height = -1;
        ((CardView) editMacroActivity.mo28951B2(i3)).setLayoutParams(layoutParams4);
        ((SelectableItemsRecyclerView) editMacroActivity.mo28951B2(C17532R$id.actionsList)).requestLayout();
    }

    /* renamed from: F4 */
    private final void m17806F4(boolean z) {
        String str;
        int i;
        boolean z2;
        Macro macro;
        Macro macro2 = this.f11555C;
        Macro macro3 = null;
        if (macro2 == null) {
            C13706o.m87945v("macro");
            macro2 = null;
        }
        if (macro2.getActions().size() == 0) {
            TextView textView = (TextView) mo28951B2(C17532R$id.noActionsText);
            C13706o.m87928e(textView, "noActionsText");
            textView.setVisibility(0);
            SelectableItemsRecyclerView selectableItemsRecyclerView = (SelectableItemsRecyclerView) mo28951B2(C17532R$id.actionsList);
            C13706o.m87928e(selectableItemsRecyclerView, "actionsList");
            selectableItemsRecyclerView.setVisibility(8);
            return;
        }
        TextView textView2 = (TextView) mo28951B2(C17532R$id.noActionsText);
        C13706o.m87928e(textView2, "noActionsText");
        textView2.setVisibility(8);
        int i2 = C17532R$id.actionsList;
        SelectableItemsRecyclerView selectableItemsRecyclerView2 = (SelectableItemsRecyclerView) mo28951B2(i2);
        C13706o.m87928e(selectableItemsRecyclerView2, "actionsList");
        selectableItemsRecyclerView2.setVisibility(0);
        C4633q0<Action> q0Var = this.f11559G;
        boolean N = q0Var != null ? q0Var.mo29057N() : false;
        C4633q0<Action> q0Var2 = this.f11559G;
        if (q0Var2 == null || z) {
            Macro macro4 = this.f11555C;
            if (macro4 == null) {
                C13706o.m87945v("macro");
                macro = null;
            } else {
                macro = macro4;
            }
            Macro macro5 = this.f11555C;
            if (macro5 == null) {
                C13706o.m87945v("macro");
                macro5 = null;
            }
            ArrayList<Action> actions = macro5.getActions();
            C13706o.m87928e(actions, "macro.actions");
            C4633q0<Action> q0Var3 = r0;
            str = "macro.actions";
            C4633q0<Action> q0Var4 = new C4633q0<>(this, macro, actions, new C4587v(this), new C4588w(this), new C4589x(this), this.f11568P, !this.f11562J, new C4590y(this));
            this.f11559G = q0Var3;
            C12156m mVar = new C12156m();
            C4633q0<Action> q0Var5 = this.f11559G;
            C13706o.m87926c(q0Var5);
            RecyclerView.Adapter i3 = mVar.mo68422i(q0Var5);
            C13706o.m87928e(i3, "dragDropManager.createWr…Adapter(actionsAdapter!!)");
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            ((SelectableItemsRecyclerView) mo28951B2(i2)).setItemAnimator((RecyclerView.ItemAnimator) null);
            ((SelectableItemsRecyclerView) mo28951B2(i2)).setNestedScrollingEnabled(false);
            ((SelectableItemsRecyclerView) mo28951B2(i2)).setLayoutManager(linearLayoutManager);
            ((SelectableItemsRecyclerView) mo28951B2(i2)).setAdapter(i3);
            mVar.mo68413a((SelectableItemsRecyclerView) mo28951B2(i2));
            i = 1;
            mVar.mo68419d0(true);
            mVar.mo68412Z(false);
        } else {
            if (q0Var2 != null) {
                Macro macro6 = this.f11555C;
                if (macro6 == null) {
                    C13706o.m87945v("macro");
                    macro6 = null;
                }
                ArrayList<Action> actions2 = macro6.getActions();
                C13706o.m87928e(actions2, "macro.actions");
                q0Var2.mo29067Z(actions2);
            }
            str = "macro.actions";
            i = 1;
        }
        C4633q0<Action> q0Var6 = this.f11559G;
        if (q0Var6 != null) {
            if (N) {
                Macro macro7 = this.f11555C;
                if (macro7 == null) {
                    C13706o.m87945v("macro");
                    macro7 = null;
                }
                if (macro7.getActions().size() > i) {
                    z2 = true;
                    q0Var6.mo29064W(z2);
                }
            }
            z2 = false;
            q0Var6.mo29064W(z2);
        }
        ImageButton imageButton = (ImageButton) mo28951B2(C17532R$id.reorderActionsButton);
        C13706o.m87928e(imageButton, "reorderActionsButton");
        C4633q0<Action> q0Var7 = this.f11559G;
        C13706o.m87926c(q0Var7);
        Macro macro8 = this.f11555C;
        if (macro8 == null) {
            C13706o.m87945v("macro");
        } else {
            macro3 = macro8;
        }
        ArrayList<Action> actions3 = macro3.getActions();
        C13706o.m87928e(actions3, str);
        m17852V4(imageButton, q0Var7, actions3, (SelectableItemsRecyclerView) mo28951B2(i2));
    }

    /* renamed from: G3 */
    private final int m17808G3(SelectableItem selectableItem) {
        if (selectableItem instanceof Trigger) {
            return C17542R$style.Theme_App_Dialog_Invert_Trigger;
        }
        return selectableItem instanceof Action ? C17542R$style.Theme_App_Dialog_Invert_Action : C17542R$style.Theme_App_Dialog_Invert_Constraint;
    }

    /* renamed from: G4 */
    static /* synthetic */ void m17809G4(EditMacroActivity editMacroActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        editMacroActivity.m17806F4(z);
    }

    /* renamed from: H4 */
    private final void m17811H4(boolean z) {
        String str;
        boolean z2;
        Macro macro;
        Spinner spinner = (Spinner) mo28951B2(C17532R$id.constraintAndOrSpinner);
        C13706o.m87928e(spinner, "constraintAndOrSpinner");
        Macro macro2 = this.f11555C;
        Macro macro3 = null;
        if (macro2 == null) {
            C13706o.m87945v("macro");
            macro2 = null;
        }
        spinner.setVisibility(macro2.getConstraints().size() > 1 ? 0 : 8);
        Macro macro4 = this.f11555C;
        if (macro4 == null) {
            C13706o.m87945v("macro");
            macro4 = null;
        }
        if (macro4.getConstraints().size() == 0) {
            TextView textView = (TextView) mo28951B2(C17532R$id.noConstraintsText);
            C13706o.m87928e(textView, "noConstraintsText");
            textView.setVisibility(0);
            SelectableItemsRecyclerView selectableItemsRecyclerView = (SelectableItemsRecyclerView) mo28951B2(C17532R$id.constraintsList);
            C13706o.m87928e(selectableItemsRecyclerView, "constraintsList");
            selectableItemsRecyclerView.setVisibility(8);
            return;
        }
        TextView textView2 = (TextView) mo28951B2(C17532R$id.noConstraintsText);
        C13706o.m87928e(textView2, "noConstraintsText");
        textView2.setVisibility(8);
        int i = C17532R$id.constraintsList;
        SelectableItemsRecyclerView selectableItemsRecyclerView2 = (SelectableItemsRecyclerView) mo28951B2(i);
        C13706o.m87928e(selectableItemsRecyclerView2, "constraintsList");
        selectableItemsRecyclerView2.setVisibility(0);
        C4633q0<Constraint> q0Var = this.f11561I;
        boolean N = q0Var != null ? q0Var.mo29057N() : false;
        C4633q0<Constraint> q0Var2 = this.f11561I;
        if (q0Var2 == null || z) {
            Macro macro5 = this.f11555C;
            if (macro5 == null) {
                C13706o.m87945v("macro");
                macro = null;
            } else {
                macro = macro5;
            }
            Macro macro6 = this.f11555C;
            if (macro6 == null) {
                C13706o.m87945v("macro");
                macro6 = null;
            }
            List<Constraint> constraints = macro6.getConstraints();
            C13706o.m87928e(constraints, "macro.constraints");
            C4633q0<Constraint> q0Var3 = r0;
            str = "macro.constraints";
            C4633q0<Constraint> q0Var4 = new C4633q0<>(this, macro, constraints, new C4591z(this), new C4545a0(this), new C4547b0(this), this.f11568P, !this.f11562J, new C4549c0(this));
            this.f11561I = q0Var3;
            C12156m mVar = new C12156m();
            C4633q0<Constraint> q0Var5 = this.f11561I;
            C13706o.m87926c(q0Var5);
            RecyclerView.Adapter i2 = mVar.mo68422i(q0Var5);
            C13706o.m87928e(i2, "dragDropManager.createWr…ter(constraintsAdapter!!)");
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            ((SelectableItemsRecyclerView) mo28951B2(i)).setItemAnimator((RecyclerView.ItemAnimator) null);
            ((SelectableItemsRecyclerView) mo28951B2(i)).setNestedScrollingEnabled(false);
            ((SelectableItemsRecyclerView) mo28951B2(i)).setLayoutManager(linearLayoutManager);
            ((SelectableItemsRecyclerView) mo28951B2(i)).setAdapter(i2);
            mVar.mo68413a((SelectableItemsRecyclerView) mo28951B2(i));
            mVar.mo68419d0(true);
        } else {
            if (q0Var2 != null) {
                Macro macro7 = this.f11555C;
                if (macro7 == null) {
                    C13706o.m87945v("macro");
                    macro7 = null;
                }
                List<Constraint> constraints2 = macro7.getConstraints();
                C13706o.m87928e(constraints2, "macro.constraints");
                q0Var2.mo29067Z(constraints2);
            }
            str = "macro.constraints";
        }
        C4633q0<Constraint> q0Var6 = this.f11561I;
        if (q0Var6 != null) {
            if (N) {
                Macro macro8 = this.f11555C;
                if (macro8 == null) {
                    C13706o.m87945v("macro");
                    macro8 = null;
                }
                if (macro8.getConstraints().size() > 1) {
                    z2 = true;
                    q0Var6.mo29064W(z2);
                }
            }
            z2 = false;
            q0Var6.mo29064W(z2);
        }
        ImageButton imageButton = (ImageButton) mo28951B2(C17532R$id.reorderConstraintsButton);
        C13706o.m87928e(imageButton, "reorderConstraintsButton");
        C4633q0<Constraint> q0Var7 = this.f11561I;
        C13706o.m87926c(q0Var7);
        Macro macro9 = this.f11555C;
        if (macro9 == null) {
            C13706o.m87945v("macro");
        } else {
            macro3 = macro9;
        }
        List<Constraint> constraints3 = macro3.getConstraints();
        C13706o.m87928e(constraints3, str);
        m17852V4(imageButton, q0Var7, constraints3, (SelectableItemsRecyclerView) mo28951B2(i));
    }

    /* renamed from: I4 */
    private final void m17813I4() {
        int E0 = C5163j2.m19955E0(this);
        MenuItem menuItem = this.f11579a0;
        MenuItem menuItem2 = null;
        if (menuItem == null) {
            C13706o.m87945v("localVarsMenuItem");
            menuItem = null;
        }
        SubMenu subMenu = menuItem.getSubMenu();
        MenuItem findItem = subMenu != null ? subMenu.findItem(C17532R$id.menu_hide) : null;
        boolean z = false;
        if (findItem != null) {
            findItem.setChecked(E0 == 0);
        }
        MenuItem menuItem3 = this.f11579a0;
        if (menuItem3 == null) {
            C13706o.m87945v("localVarsMenuItem");
            menuItem3 = null;
        }
        SubMenu subMenu2 = menuItem3.getSubMenu();
        MenuItem findItem2 = subMenu2 != null ? subMenu2.findItem(C17532R$id.menu_inline) : null;
        if (findItem2 != null) {
            findItem2.setChecked(E0 == 1);
        }
        MenuItem menuItem4 = this.f11579a0;
        if (menuItem4 == null) {
            C13706o.m87945v("localVarsMenuItem");
            menuItem4 = null;
        }
        SubMenu subMenu3 = menuItem4.getSubMenu();
        if (subMenu3 != null) {
            menuItem2 = subMenu3.findItem(C17532R$id.menu_bottom_bar);
        }
        if (menuItem2 != null) {
            if (E0 == 2) {
                z = true;
            }
            menuItem2.setChecked(z);
        }
    }

    /* renamed from: J4 */
    private final void m17815J4(boolean z) {
        String str;
        int i;
        Macro macro;
        Macro macro2 = this.f11555C;
        if (macro2 == null) {
            C13706o.m87945v("macro");
            macro2 = null;
        }
        ArrayList<Trigger> triggerList = macro2.getTriggerList();
        Macro macro3 = this.f11555C;
        if (macro3 == null) {
            C13706o.m87945v("macro");
            macro3 = null;
        }
        if (macro3.getTriggerList().size() == 0) {
            TextView textView = (TextView) mo28951B2(C17532R$id.noTriggersText);
            C13706o.m87928e(textView, "noTriggersText");
            textView.setVisibility(0);
            SelectableItemsRecyclerView selectableItemsRecyclerView = (SelectableItemsRecyclerView) mo28951B2(C17532R$id.triggersList);
            C13706o.m87928e(selectableItemsRecyclerView, "triggersList");
            selectableItemsRecyclerView.setVisibility(8);
            return;
        }
        TextView textView2 = (TextView) mo28951B2(C17532R$id.noTriggersText);
        C13706o.m87928e(textView2, "noTriggersText");
        textView2.setVisibility(8);
        int i2 = C17532R$id.triggersList;
        SelectableItemsRecyclerView selectableItemsRecyclerView2 = (SelectableItemsRecyclerView) mo28951B2(i2);
        C13706o.m87928e(selectableItemsRecyclerView2, "triggersList");
        selectableItemsRecyclerView2.setVisibility(0);
        C4633q0<Trigger> q0Var = this.f11560H;
        boolean N = q0Var != null ? q0Var.mo29057N() : false;
        C4633q0<Trigger> q0Var2 = this.f11560H;
        if (q0Var2 == null || z) {
            Macro macro4 = this.f11555C;
            if (macro4 == null) {
                C13706o.m87945v("macro");
                macro = null;
            } else {
                macro = macro4;
            }
            C13706o.m87928e(triggerList, "triggerList");
            C4633q0<Trigger> q0Var3 = r0;
            str = "triggerList";
            C4633q0<Trigger> q0Var4 = new C4633q0<>(this, macro, triggerList, new C4551d0(this), new C4553e0(this), new C4555f0(this), this.f11568P, !this.f11562J, new C4557g0(this));
            this.f11560H = q0Var3;
            C12156m mVar = new C12156m();
            C4633q0<Trigger> q0Var5 = this.f11560H;
            C13706o.m87926c(q0Var5);
            RecyclerView.Adapter i3 = mVar.mo68422i(q0Var5);
            C13706o.m87928e(i3, "dragDropManager.createWr…dapter(triggersAdapter!!)");
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            ((SelectableItemsRecyclerView) mo28951B2(i2)).setItemAnimator((RecyclerView.ItemAnimator) null);
            ((SelectableItemsRecyclerView) mo28951B2(i2)).setNestedScrollingEnabled(false);
            ((SelectableItemsRecyclerView) mo28951B2(i2)).setLayoutManager(linearLayoutManager);
            ((SelectableItemsRecyclerView) mo28951B2(i2)).setAdapter(i3);
            mVar.mo68413a((SelectableItemsRecyclerView) mo28951B2(i2));
            i = 1;
            mVar.mo68419d0(true);
        } else {
            if (q0Var2 != null) {
                C13706o.m87928e(triggerList, "triggerList");
                q0Var2.mo29067Z(triggerList);
            }
            str = "triggerList";
            i = 1;
        }
        C4633q0<Trigger> q0Var6 = this.f11560H;
        if (q0Var6 != null) {
            q0Var6.mo29064W(N && triggerList.size() > i);
        }
        ImageButton imageButton = (ImageButton) mo28951B2(C17532R$id.reorderTriggersButton);
        C13706o.m87928e(imageButton, "reorderTriggersButton");
        C4633q0<Trigger> q0Var7 = this.f11560H;
        C13706o.m87926c(q0Var7);
        C13706o.m87928e(triggerList, str);
        m17852V4(imageButton, q0Var7, triggerList, (SelectableItemsRecyclerView) mo28951B2(i2));
    }

    /* renamed from: K3 */
    private final void m17817K3() {
        Macro macro = this.f11555C;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        int i = C17532R$id.descriptionExpandable;
        macro.setDescriptionOpen(!((ExpandableLayout) mo28951B2(i)).mo75517g());
        ((ExpandableLayout) mo28951B2(i)).mo75524i();
    }

    /* access modifiers changed from: private */
    /* renamed from: K4 */
    public final void m17818K4() {
        runOnUiThread(new C4652z(this));
    }

    /* renamed from: L3 */
    private final void m17820L3(boolean z) {
        int size = C4934n.m18998M().mo29710z().size();
        int f0 = C5163j2.m20151f0(this);
        Macro macro = this.f11555C;
        Macro macro2 = null;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        if (!macro.isCompleted()) {
            f0--;
        }
        Macro macro3 = this.f11555C;
        if (macro3 == null) {
            C13706o.m87945v("macro");
            macro3 = null;
        }
        int S2 = Action.m9593S2(macro3.getActions());
        if (S2 >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(getString(C17541R$string.invalid_control_flow));
            sb.append(' ');
            Macro macro4 = this.f11555C;
            if (macro4 == null) {
                C13706o.m87945v("macro");
            } else {
                macro2 = macro4;
            }
            sb.append(macro2.getActions().get(S2).mo24738G0());
            C4061t1.m16019t(this, getString(C17541R$string.invalid_macro), sb.toString());
            return;
        }
        int i = C17532R$id.macroNameText;
        if (TextUtils.isEmpty(((EditText) mo28951B2(i)).getText().toString())) {
            C4061t1.m16019t(this, getString(C17541R$string.invalid_macro), getString(C17541R$string.please_set_a_macro_name));
            return;
        }
        Macro macro5 = this.f11555C;
        if (macro5 == null) {
            C13706o.m87945v("macro");
            macro5 = null;
        }
        if (macro5.getTriggerList().size() == 0) {
            C4061t1.m16019t(this, getString(C17541R$string.invalid_macro), getString(C17541R$string.please_add_a_trigger));
            return;
        }
        Macro macro6 = this.f11555C;
        if (macro6 == null) {
            C13706o.m87945v("macro");
            macro6 = null;
        }
        if (macro6.getActions().size() == 0) {
            C4061t1.m16019t(this, getString(C17541R$string.invalid_macro), getString(C17541R$string.please_add_an_action));
            return;
        }
        Macro macro7 = this.f11555C;
        if (macro7 == null) {
            C13706o.m87945v("macro");
            macro7 = null;
        }
        if (!macro7.isValid() && !this.f11569Q) {
            C4061t1.m16019t(this, getString(C17541R$string.invalid_macro), getString(C17541R$string.ensure_valid_macro));
        } else if (m17794B3(((EditText) mo28951B2(i)).getText().toString())) {
            C4061t1.m16019t(this, getString(C17541R$string.invalid_macro), getString(C17541R$string.macro_name_already_exists));
        } else if (mo28954I3().mo28009e().mo28008a() || size <= f0) {
            Macro macro8 = this.f11555C;
            if (macro8 == null) {
                C13706o.m87945v("macro");
            } else {
                macro2 = macro8;
            }
            if (!macro2.isValid()) {
                m17939v3(z);
            } else {
                m17894g3(z);
            }
        } else {
            C4061t1.m15957G0(this, mo28955J3());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L4 */
    public static final void m17821L4(EditMacroActivity editMacroActivity) {
        Macro macro;
        C13706o.m87929f(editMacroActivity, "this$0");
        Macro macro2 = editMacroActivity.f11555C;
        Macro macro3 = null;
        if (macro2 == null) {
            C13706o.m87945v("macro");
            macro = null;
        } else {
            macro = macro2;
        }
        boolean z = editMacroActivity.f11568P;
        boolean z2 = editMacroActivity.f11569Q;
        Resources resources = editMacroActivity.getResources();
        C13706o.m87928e(resources, "resources");
        editMacroActivity.f11575W = new LocalVarsAdapter(macro, z, z2, resources, false, new C4559h0(editMacroActivity), (C3740z) null);
        ViewGroup viewGroup = editMacroActivity.f11576X;
        if (viewGroup == null) {
            C13706o.m87945v("varsLayout");
            viewGroup = null;
        }
        int i = C17532R$id.localVarsList;
        LocalVarRecyclerView localVarRecyclerView = (LocalVarRecyclerView) viewGroup.findViewById(i);
        LocalVarsAdapter localVarsAdapter = editMacroActivity.f11575W;
        if (localVarsAdapter == null) {
            C13706o.m87945v("localVarsAdapter");
            localVarsAdapter = null;
        }
        localVarRecyclerView.setAdapter(localVarsAdapter);
        ViewGroup viewGroup2 = editMacroActivity.f11576X;
        if (viewGroup2 == null) {
            C13706o.m87945v("varsLayout");
            viewGroup2 = null;
        }
        TextView textView = (TextView) viewGroup2.findViewById(C17532R$id.noVarsText);
        C13706o.m87928e(textView, "varsLayout.noVarsText");
        Macro macro4 = editMacroActivity.f11555C;
        if (macro4 == null) {
            C13706o.m87945v("macro");
            macro4 = null;
        }
        int i2 = 0;
        textView.setVisibility(macro4.getLocalVariables().isEmpty() ? 0 : 8);
        ViewGroup viewGroup3 = editMacroActivity.f11576X;
        if (viewGroup3 == null) {
            C13706o.m87945v("varsLayout");
            viewGroup3 = null;
        }
        LocalVarRecyclerView localVarRecyclerView2 = (LocalVarRecyclerView) viewGroup3.findViewById(i);
        C13706o.m87928e(localVarRecyclerView2, "varsLayout.localVarsList");
        Macro macro5 = editMacroActivity.f11555C;
        if (macro5 == null) {
            C13706o.m87945v("macro");
        } else {
            macro3 = macro5;
        }
        List<MacroDroidVariable> localVariables = macro3.getLocalVariables();
        C13706o.m87928e(localVariables, "macro.localVariables");
        if (!(!localVariables.isEmpty())) {
            i2 = 8;
        }
        localVarRecyclerView2.setVisibility(i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: com.google.android.material.bottomsheet.BottomSheetBehavior} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: M4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m17823M4() {
        /*
            r12 = this;
            int r0 = com.arlosoft.macrodroid.settings.C5163j2.m19955E0(r12)
            r12.f11577Y = r0
            int r0 = com.arlosoft.macrodroid.C17532R$id.varsInlineContainer
            android.view.View r1 = r12.mo28951B2(r0)
            androidx.cardview.widget.CardView r1 = (androidx.cardview.widget.CardView) r1
            r1.removeAllViews()
            android.view.View r1 = r12.mo28951B2(r0)
            androidx.cardview.widget.CardView r1 = (androidx.cardview.widget.CardView) r1
            java.lang.String r2 = "varsInlineContainer"
            kotlin.jvm.internal.C13706o.m87928e(r1, r2)
            r3 = 8
            r1.setVisibility(r3)
            int r1 = com.arlosoft.macrodroid.C17532R$id.bottomBar
            android.view.View r4 = r12.mo28951B2(r1)
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.FrameLayout"
            kotlin.jvm.internal.C13706o.m87927d(r4, r5)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r4.removeAllViews()
            android.view.View r4 = r12.mo28951B2(r1)
            java.lang.String r6 = "bottomBar"
            kotlin.jvm.internal.C13706o.m87928e(r4, r6)
            r4.setVisibility(r3)
            int r4 = r12.f11577Y
            r7 = 0
            if (r4 == 0) goto L_0x0162
            java.lang.String r8 = "varsLayout.addVariableButton"
            r9 = 1
            java.lang.String r10 = "varsLayout"
            r11 = 0
            if (r4 == r9) goto L_0x00d9
            r0 = 2
            if (r4 == r0) goto L_0x004f
            goto L_0x018e
        L_0x004f:
            android.view.View r0 = r12.mo28951B2(r1)
            kotlin.jvm.internal.C13706o.m87927d(r0, r5)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.view.ViewGroup r2 = r12.f11576X
            if (r2 != 0) goto L_0x0060
            kotlin.jvm.internal.C13706o.m87945v(r10)
            r2 = r11
        L_0x0060:
            r4 = -1
            r5 = -2
            r0.addView(r2, r4, r5)
            android.view.View r0 = r12.mo28951B2(r1)
            kotlin.jvm.internal.C13706o.m87928e(r0, r6)
            r0.setVisibility(r7)
            android.view.ViewGroup r0 = r12.f11576X
            if (r0 != 0) goto L_0x0077
            kotlin.jvm.internal.C13706o.m87945v(r10)
            r0 = r11
        L_0x0077:
            int r1 = com.arlosoft.macrodroid.C17532R$id.addVariableButton
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            kotlin.jvm.internal.C13706o.m87928e(r0, r8)
            r0.setVisibility(r3)
            android.view.ViewGroup r0 = r12.f11576X
            if (r0 != 0) goto L_0x008d
            kotlin.jvm.internal.C13706o.m87945v(r10)
            r0 = r11
        L_0x008d:
            int r1 = com.arlosoft.macrodroid.C17532R$id.localVarsLabel
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 17
            r0.setGravity(r1)
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View> r0 = r12.f11571S
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = "bottomSheetBehavior"
            kotlin.jvm.internal.C13706o.m87945v(r0)
            goto L_0x00a5
        L_0x00a4:
            r11 = r0
        L_0x00a5:
            r0 = 4
            r11.mo56951Y(r0)
            r12.m17842S4(r9)
            int r0 = com.arlosoft.macrodroid.C17532R$id.topLevelLayout
            android.view.View r1 = r12.mo28951B2(r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.view.View r2 = r12.mo28951B2(r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            int r2 = r2.getPaddingLeft()
            android.view.View r3 = r12.mo28951B2(r0)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            int r3 = r3.getPaddingTop()
            android.view.View r0 = r12.mo28951B2(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            int r0 = r0.getPaddingRight()
            int r4 = r12.f11578Z
            r1.setPadding(r2, r3, r0, r4)
            goto L_0x018e
        L_0x00d9:
            android.view.View r1 = r12.mo28951B2(r0)
            androidx.cardview.widget.CardView r1 = (androidx.cardview.widget.CardView) r1
            android.view.ViewGroup r3 = r12.f11576X
            if (r3 != 0) goto L_0x00e7
            kotlin.jvm.internal.C13706o.m87945v(r10)
            r3 = r11
        L_0x00e7:
            r1.addView(r3)
            android.view.View r0 = r12.mo28951B2(r0)
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)
            r0.setVisibility(r7)
            android.view.ViewGroup r0 = r12.f11576X
            if (r0 != 0) goto L_0x00fe
            kotlin.jvm.internal.C13706o.m87945v(r10)
            r0 = r11
        L_0x00fe:
            int r1 = com.arlosoft.macrodroid.C17532R$id.addVariableButton
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            kotlin.jvm.internal.C13706o.m87928e(r0, r8)
            r0.setVisibility(r7)
            android.view.ViewGroup r0 = r12.f11576X
            if (r0 != 0) goto L_0x0114
            kotlin.jvm.internal.C13706o.m87945v(r10)
            r0 = r11
        L_0x0114:
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            android.view.ViewGroup r0 = r12.f11576X
            if (r0 != 0) goto L_0x0127
            kotlin.jvm.internal.C13706o.m87945v(r10)
            goto L_0x0128
        L_0x0127:
            r11 = r0
        L_0x0128:
            int r0 = com.arlosoft.macrodroid.C17532R$id.localVarsLabel
            android.view.View r0 = r11.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 16
            r0.setGravity(r1)
            r12.m17842S4(r7)
            int r0 = com.arlosoft.macrodroid.C17532R$id.topLevelLayout
            android.view.View r1 = r12.mo28951B2(r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.view.View r2 = r12.mo28951B2(r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            int r2 = r2.getPaddingLeft()
            android.view.View r3 = r12.mo28951B2(r0)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            int r3 = r3.getPaddingTop()
            android.view.View r0 = r12.mo28951B2(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            int r0 = r0.getPaddingRight()
            r1.setPadding(r2, r3, r0, r7)
            goto L_0x018e
        L_0x0162:
            r12.m17842S4(r7)
            int r0 = com.arlosoft.macrodroid.C17532R$id.topLevelLayout
            android.view.View r1 = r12.mo28951B2(r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.view.View r2 = r12.mo28951B2(r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            int r2 = r2.getPaddingLeft()
            android.view.View r3 = r12.mo28951B2(r0)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            int r3 = r3.getPaddingTop()
            android.view.View r0 = r12.mo28951B2(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            int r0 = r0.getPaddingRight()
            r1.setPadding(r2, r3, r0, r7)
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.editscreen.EditMacroActivity.m17823M4():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public final void m17825N3() {
        if (C6421r.m24721b() != null) {
            SelectableItem b = C6421r.m24721b();
            C13706o.m87927d(b, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.Action");
            Action action = (Action) b;
            Macro macro = this.f11555C;
            if (macro == null) {
                C13706o.m87945v("macro");
                macro = null;
            }
            macro.getActions().add(action);
            Macro macro2 = this.f11555C;
            if (macro2 == null) {
                C13706o.m87945v("macro");
                macro2 = null;
            }
            action.mo24687G2(macro2);
        } else if (C6421r.m24723d() != null) {
            for (SelectableItem next : C6421r.m24723d()) {
                C13706o.m87927d(next, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.Action");
                Action action2 = (Action) next;
                Macro macro3 = this.f11555C;
                if (macro3 == null) {
                    C13706o.m87945v("macro");
                    macro3 = null;
                }
                macro3.getActions().add(action2);
                Macro macro4 = this.f11555C;
                if (macro4 == null) {
                    C13706o.m87945v("macro");
                    macro4 = null;
                }
                action2.mo24687G2(macro4);
            }
        }
        C15626c.makeText(getApplicationContext(), C17541R$string.item_pasted, 0).show();
        C6421r.m24725f();
        this.f11564L = true;
        m17793A4(this, false, 1, (Object) null);
    }

    /* renamed from: N4 */
    private final boolean m17826N4(boolean z) {
        Macro macro;
        Macro macro2 = this.f11555C;
        if (macro2 == null) {
            C13706o.m87945v("macro");
            macro2 = null;
        }
        boolean isCompleted = macro2.isCompleted();
        Macro macro3 = this.f11555C;
        if (macro3 == null) {
            C13706o.m87945v("macro");
            macro3 = null;
        }
        String name = macro3.getName();
        Macro macro4 = this.f11555C;
        if (macro4 == null) {
            C13706o.m87945v("macro");
            macro4 = null;
        }
        macro4.setLastEditedTimestamp(System.currentTimeMillis());
        Macro macro5 = this.f11555C;
        if (macro5 == null) {
            C13706o.m87945v("macro");
            macro5 = null;
        }
        macro5.setDescription(String.valueOf(((AppCompatEditText) mo28951B2(C17532R$id.macroDescription)).getText()));
        Macro macro6 = this.f11555C;
        if (macro6 == null) {
            C13706o.m87945v("macro");
            macro6 = null;
        }
        macro6.setName(((EditText) mo28951B2(C17532R$id.macroNameText)).getText().toString());
        if (this.f11569Q) {
            Macro macro7 = this.f11555C;
            if (macro7 == null) {
                C13706o.m87945v("macro");
                macro7 = null;
            }
            if (!macro7.isCompleted()) {
                Macro macro8 = this.f11555C;
                if (macro8 == null) {
                    C13706o.m87945v("macro");
                    macro8 = null;
                }
                macro8.setEnabledFlag(true);
            }
        }
        Macro macro9 = this.f11555C;
        if (macro9 == null) {
            C13706o.m87945v("macro");
            macro9 = null;
        }
        macro9.setCompleted(true);
        if (this.f11569Q) {
            Macro macro10 = this.f11555C;
            if (macro10 == null) {
                C13706o.m87945v("macro");
                macro10 = null;
            }
            m17890f3(macro10);
        }
        for (ActionBlock actionBlock : mo28952F3().mo29648f()) {
            actionBlock.setIsBeingImported(false);
            mo28952F3().mo29652j(actionBlock);
            C8056a.m33602b(actionBlock);
        }
        if (z) {
            Macro macro11 = this.f11555C;
            if (macro11 == null) {
                C13706o.m87945v("macro");
                macro11 = null;
            }
            macro11.setEnabled(false);
        }
        C4934n M = C4934n.m18998M();
        Macro macro12 = this.f11555C;
        if (macro12 == null) {
            C13706o.m87945v("macro");
            macro12 = null;
        }
        M.mo29698q0(macro12, true, isCompleted);
        boolean z2 = false;
        for (Macro next : C4934n.m18998M().mo29710z()) {
            Iterator<Action> it = next.getActions().iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                Action next2 = it.next();
                if (next2 instanceof ForceMacroRunAction) {
                    ForceMacroRunAction forceMacroRunAction = (ForceMacroRunAction) next2;
                    long C3 = forceMacroRunAction.mo25116C3();
                    Macro macro13 = this.f11555C;
                    if (macro13 == null) {
                        C13706o.m87945v("macro");
                        macro13 = null;
                    }
                    if (macro13.getGUID() != C3) {
                        Macro macro14 = this.f11555C;
                        if (macro14 == null) {
                            C13706o.m87945v("macro");
                            macro14 = null;
                        }
                        if (!C13706o.m87924a(macro14.getName(), forceMacroRunAction.mo24798Z0())) {
                        }
                    }
                    Macro macro15 = this.f11555C;
                    if (macro15 == null) {
                        C13706o.m87945v("macro");
                        macro15 = null;
                    }
                    forceMacroRunAction.mo25117R3(macro15.getName());
                } else if (next2 instanceof DisableMacroAction) {
                    DisableMacroAction disableMacroAction = (DisableMacroAction) next2;
                    long s3 = disableMacroAction.mo24971s3();
                    Macro macro16 = this.f11555C;
                    if (macro16 == null) {
                        C13706o.m87945v("macro");
                        macro16 = null;
                    }
                    if (macro16.getGUID() == s3) {
                        Macro macro17 = this.f11555C;
                        if (macro17 == null) {
                            C13706o.m87945v("macro");
                            macro17 = null;
                        }
                        disableMacroAction.mo24970A3(macro17.getName());
                    }
                } else if (next2 instanceof CancelActiveMacroAction) {
                    CancelActiveMacroAction cancelActiveMacroAction = (CancelActiveMacroAction) next2;
                    long p3 = cancelActiveMacroAction.mo24799p3();
                    Macro macro18 = this.f11555C;
                    if (macro18 == null) {
                        C13706o.m87945v("macro");
                        macro18 = null;
                    }
                    if (macro18.getGUID() != p3) {
                        Macro macro19 = this.f11555C;
                        if (macro19 == null) {
                            C13706o.m87945v("macro");
                            macro19 = null;
                        }
                        if (!C13706o.m87924a(macro19.getName(), cancelActiveMacroAction.mo24798Z0())) {
                        }
                    }
                    cancelActiveMacroAction.mo24800v3(next.getName());
                }
                z3 = true;
            }
            if (!C13706o.m87924a(name, next.getName())) {
                List<Constraint> allConstraints = next.getAllConstraints();
                C13706o.m87928e(allConstraints, "macro.allConstraints");
                ArrayList<Constraint> arrayList = new ArrayList<>();
                for (T next3 : allConstraints) {
                    if (((Constraint) next3) instanceof C7363c) {
                        arrayList.add(next3);
                    }
                }
                for (Constraint constraint : arrayList) {
                    C13706o.m87927d(constraint, "null cannot be cast to non-null type com.arlosoft.macrodroid.categories.HasMacroNames");
                    C7363c cVar = (C7363c) constraint;
                    List I0 = C13566b0.m87405I0(cVar.mo28198D());
                    int size = I0.size();
                    int l = C13614t.m87750l(I0);
                    if (l >= 0) {
                        int i = 0;
                        while (I0.size() == size) {
                            if (C13706o.m87924a((String) I0.get(i), name)) {
                                Macro macro20 = this.f11555C;
                                if (macro20 == null) {
                                    C13706o.m87945v("macro");
                                    macro20 = null;
                                }
                                String name2 = macro20.getName();
                                C13706o.m87928e(name2, "this.macro.name");
                                I0.set(i, name2);
                            }
                            if (i != l) {
                                i++;
                            }
                        }
                        throw new ConcurrentModificationException();
                    }
                    cVar.mo28199l(I0);
                }
            }
            if (z3) {
                C4934n.m18998M().mo29695o0(next);
            }
            if (this.f11569Q || this.f11562J || this.f11564L || !isCompleted) {
                z2 = true;
            }
        }
        setResult(-1, new Intent());
        Macro macro21 = this.f11555C;
        if (macro21 == null) {
            C13706o.m87945v("macro");
            macro = null;
        } else {
            macro = macro21;
        }
        C5163j2.m20187j4(this, macro.getGUID());
        this.f11565M = true;
        return z2;
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public final void m17828O3() {
        SelectableItem b = C6421r.m24721b();
        C13706o.m87927d(b, "null cannot be cast to non-null type com.arlosoft.macrodroid.constraint.Constraint");
        Constraint constraint = (Constraint) b;
        Macro macro = this.f11555C;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        macro.getConstraints().add(constraint);
        Macro macro2 = this.f11555C;
        if (macro2 == null) {
            C13706o.m87945v("macro");
            macro2 = null;
        }
        constraint.mo24687G2(macro2);
        C6421r.m24725f();
        C15626c.makeText(getApplicationContext(), C17541R$string.item_pasted, 0).show();
        this.f11564L = true;
        m17793A4(this, false, 1, (Object) null);
    }

    /* renamed from: O4 */
    private final void m17829O4() {
        this.f11566N = 0;
        List<String> A = C4061t1.m15944A(getApplicationContext());
        Macro macro = this.f11555C;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        if (macro.getCategory() != null) {
            Macro macro2 = this.f11555C;
            if (macro2 == null) {
                C13706o.m87945v("macro");
                macro2 = null;
            }
            if (!A.contains(macro2.getCategory())) {
                Macro macro3 = this.f11555C;
                if (macro3 == null) {
                    C13706o.m87945v("macro");
                    macro3 = null;
                }
                A.add(macro3.getCategory());
                C10378a aVar = C10378a.f23596a;
                Locale F0 = C5163j2.m19963F0(aVar.mo41059a());
                C13706o.m87928e(F0, "getLocale(context)");
                C13706o.m87928e(A, "categories");
                C13622x.m87781y(A, new C4601a0(F0));
                A.remove(aVar.mo41059a().getString(C17541R$string.uncategorized));
                A.add(0, aVar.mo41059a().getString(C17541R$string.uncategorized));
            }
        }
        A.add(0, '[' + getString(C17541R$string.new_category) + ']');
        int size = A.size();
        for (int i = 0; i < size; i++) {
            String str = A.get(i);
            Macro macro4 = this.f11555C;
            if (macro4 == null) {
                C13706o.m87945v("macro");
                macro4 = null;
            }
            if (C13706o.m87924a(str, macro4.getCategory())) {
                this.f11566N = i;
            }
        }
        C13706o.m87928e(A, "categories");
        Object[] array = A.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.select_category);
        builder.setSingleChoiceItems((CharSequence[]) strArr, this.f11566N, (DialogInterface.OnClickListener) new C4609e0(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4604c(this, strArr));
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public final void m17831P3() {
        SelectableItem b = C6421r.m24721b();
        C13706o.m87927d(b, "null cannot be cast to non-null type com.arlosoft.macrodroid.triggers.Trigger");
        Trigger trigger = (Trigger) b;
        Macro macro = this.f11555C;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        macro.getTriggerList().add(trigger);
        Macro macro2 = this.f11555C;
        if (macro2 == null) {
            C13706o.m87945v("macro");
            macro2 = null;
        }
        trigger.mo24687G2(macro2);
        C15626c.makeText(getApplicationContext(), C17541R$string.item_pasted, 0).show();
        C6421r.m24725f();
        this.f11564L = true;
        m17793A4(this, false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: P4 */
    public static final int m17832P4(Locale locale, String str, String str2) {
        C13706o.m87929f(locale, "$locale");
        Collator instance = Collator.getInstance(locale);
        instance.setStrength(0);
        return instance.compare(str, str2);
    }

    /* renamed from: Q3 */
    private final void m17834Q3() {
        Macro macro = this.f11555C;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        boolean isCompleted = macro.isCompleted();
        int i = C17528R$color.primary;
        if (!isCompleted) {
            if (this.f11569Q) {
                i = C17528R$color.template_primary;
            }
            int color = ContextCompat.getColor(this, i);
            int i2 = C17532R$id.acceptButton;
            ((FloatingActionButton) mo28951B2(i2)).setImageResource(C17530R$drawable.ic_playlist_plus_white_24dp);
            Drawable mutate = DrawableCompat.wrap(((FloatingActionButton) mo28951B2(i2)).getDrawable()).mutate();
            C13706o.m87928e(mutate, "wrap(acceptButton.drawable).mutate()");
            DrawableCompat.setTint(mutate, color);
            return;
        }
        Drawable mutate2 = DrawableCompat.wrap(getResources().getDrawable(C17530R$drawable.ic_action_accept_white)).mutate();
        C13706o.m87928e(mutate2, "wrap(acceptDrawable).mutate()");
        DrawableCompat.setTint(mutate2, ContextCompat.getColor(this, C17528R$color.primary));
        ((FloatingActionButton) mo28951B2(C17532R$id.acceptButton)).setImageResource(C17530R$drawable.ic_action_accept_white);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q4 */
    public static final void m17835Q4(EditMacroActivity editMacroActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(editMacroActivity, "this$0");
        editMacroActivity.f11566N = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: R4 */
    public static final void m17838R4(EditMacroActivity editMacroActivity, String[] strArr, DialogInterface dialogInterface, int i) {
        Category category;
        C13706o.m87929f(editMacroActivity, "this$0");
        C13706o.m87929f(strArr, "$macroArray");
        if (editMacroActivity.f11566N == 0) {
            editMacroActivity.m17943w4();
            return;
        }
        Macro macro = editMacroActivity.f11555C;
        Macro macro2 = null;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        macro.setCategory(strArr[editMacroActivity.f11566N]);
        CategoryList categoryList = (CategoryList) MacroDroidApplication.f9883I.mo27303b().mo27293q(Category.CATEGORY_CACHE).mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
        Macro macro3 = editMacroActivity.f11555C;
        if (macro3 == null) {
            C13706o.m87945v("macro");
            macro3 = null;
        }
        macro3.setHeadingColor(0);
        if (categoryList != null) {
            Macro macro4 = editMacroActivity.f11555C;
            if (macro4 == null) {
                C13706o.m87945v("macro");
                macro4 = null;
            }
            String category2 = macro4.getCategory();
            C13706o.m87928e(category2, "macro.category");
            category = categoryList.getCategoryByName(category2);
        } else {
            category = null;
        }
        if (category != null) {
            Macro macro5 = editMacroActivity.f11555C;
            if (macro5 == null) {
                C13706o.m87945v("macro");
            } else {
                macro2 = macro5;
            }
            macro2.setHeadingColor(category.getColor());
        }
        editMacroActivity.f11564L = true;
        editMacroActivity.m17884d5();
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public static final void m17841S3(EditMacroActivity editMacroActivity, MacroDroidVariable macroDroidVariable, VariableValue variableValue, VariableValue variableValue2, long j) {
        C13706o.m87929f(editMacroActivity, "this$0");
        C13706o.m87929f(macroDroidVariable, "variable");
        C13706o.m87929f(variableValue, "newValue");
        C13706o.m87929f(variableValue2, "oldValue");
        editMacroActivity.m17818K4();
    }

    /* renamed from: S4 */
    private final void m17842S4(boolean z) {
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-2, -2);
        int dimension = (int) getResources().getDimension(C17529R$dimen.margin_medium);
        layoutParams.setMargins(dimension, dimension, dimension, dimension);
        if (z) {
            layoutParams.setAnchorId(C17532R$id.bottomBar);
            layoutParams.anchorGravity = 8388661;
        } else {
            layoutParams.gravity = 8388693;
        }
        ((FloatingActionButton) mo28951B2(C17532R$id.acceptButton)).setLayoutParams(layoutParams);
    }

    /* renamed from: T4 */
    private final void m17845T4() {
        if (!this.f11569Q) {
            LinearLayout linearLayout = (LinearLayout) mo28951B2(C17532R$id.disabledLabel);
            C13706o.m87928e(linearLayout, "disabledLabel");
            Macro macro = this.f11555C;
            if (macro == null) {
                C13706o.m87945v("macro");
                macro = null;
            }
            linearLayout.setVisibility(macro.isEnabled() ^ true ? 0 : 8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public static final void m17848U3(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: V3 */
    public static final void m17851V3(EditMacroActivity editMacroActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(editMacroActivity, "this$0");
        m17936u3(editMacroActivity, false, 1, (Object) null);
    }

    /* renamed from: V4 */
    private final <T extends SelectableItem> void m17852V4(ImageButton imageButton, C4633q0<T> q0Var, List<? extends SelectableItem> list, RecyclerView recyclerView) {
        int i = 0;
        imageButton.setSelected(false);
        if (!(q0Var.getItemCount() >= 2)) {
            i = 8;
        }
        imageButton.setVisibility(i);
        C4666m.m18147o(imageButton, (C13640g) null, new C4561i0(q0Var, imageButton, (C13635d<? super C4561i0>) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: W3 */
    public static final void m17855W3(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* renamed from: W4 */
    private final void m17856W4() {
        FloatingActionButton floatingActionButton = (FloatingActionButton) mo28951B2(C17532R$id.acceptButton);
        C13706o.m87928e(floatingActionButton, "acceptButton");
        Macro macro = this.f11555C;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        int i = 0;
        if (!(!macro.isCompleted() || this.f11562J || this.f11564L)) {
            i = 8;
        }
        floatingActionButton.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: X3 */
    public static final void m17859X3(EditMacroActivity editMacroActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(editMacroActivity, "this$0");
        m17936u3(editMacroActivity, false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: X4 */
    public final void m17860X4(SelectableItem selectableItem) {
        SelectableItem selectableItem2 = selectableItem;
        this.f11556D = selectableItem2;
        ArrayList arrayList = new ArrayList();
        if (selectableItem2 instanceof EndParentAction) {
            if ((C6421r.m24721b() != null && (C6421r.m24721b() instanceof Action)) || C6421r.m24723d() != null) {
                arrayList.add(getString(C17541R$string.paste_action_above));
            }
            arrayList.add(getString(C17541R$string.add_action_above));
        } else {
            Macro macro = null;
            if (selectableItem2 instanceof ElseParentAction) {
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
                Macro macro2 = this.f11555C;
                if (macro2 == null) {
                    C13706o.m87945v("macro");
                    macro2 = null;
                }
                C13706o.m87927d(selectableItem2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.Action");
                ParentAction parentAction = macro2.getParentAction((Action) selectableItem2);
                if (parentAction != null && parentAction.mo27822G1()) {
                    arrayList.add(getString(elseParentAction.mo27822G1() ? C17541R$string.disable : C17541R$string.enable));
                    arrayList.add(getString(selectableItem.mo27822G1() ? C17541R$string.disable_condition_or_loop_action_including_children : C17541R$string.enable_condition_or_loop_action_including_children));
                }
            } else {
                if (selectableItem.mo24788B1()) {
                    arrayList.add(getString(C17541R$string.configure));
                }
                boolean z = true;
                if (selectableItem2 instanceof Trigger) {
                    arrayList.add(getString(C17541R$string.test_trigger));
                    List<Constraint> J0 = ((Trigger) selectableItem2).mo27826J0();
                    C13706o.m87928e(J0, "item.constraints");
                    if (!J0.isEmpty()) {
                        arrayList.add(getString(C17541R$string.test_trigger) + " (" + getString(C17541R$string.testing_trigger_or_action_with_constraints) + ')');
                    }
                }
                boolean z2 = selectableItem2 instanceof Action;
                if (z2) {
                    if (!(selectableItem2 instanceof ParentAction)) {
                        arrayList.add(getString(C17541R$string.test_action));
                        List<Constraint> J02 = ((Action) selectableItem2).mo27826J0();
                        C13706o.m87928e(J02, "item.constraints");
                        if (!J02.isEmpty()) {
                            arrayList.add(getString(C17541R$string.test_action) + " (" + getString(C17541R$string.testing_trigger_or_action_with_constraints) + ')');
                        }
                    }
                    arrayList.add(getString(C17541R$string.add_action_above));
                    if ((C6421r.m24721b() != null && (C6421r.m24721b() instanceof Action)) || C6421r.m24723d() != null) {
                        arrayList.add(getString(C17541R$string.paste_action_above));
                    }
                }
                boolean z3 = selectableItem2 instanceof ParentAction;
                if (z3) {
                    arrayList.add(getString(C17541R$string.add_child_action));
                } else if (!(selectableItem2 instanceof Constraint) || (selectableItem2 instanceof LogicConstraint)) {
                    arrayList.add(getString(C17541R$string.add_constraint));
                    if (C6421r.m24721b() != null && (C6421r.m24721b() instanceof Constraint)) {
                        arrayList.add(getString(C17541R$string.paste_constraint));
                    }
                }
                if (selectableItem2 instanceof IfConditionAction) {
                    Macro macro3 = this.f11555C;
                    if (macro3 == null) {
                        C13706o.m87945v("macro");
                        macro3 = null;
                    }
                    int indexOf = macro3.getActions().indexOf(selectableItem2);
                    Macro macro4 = this.f11555C;
                    if (macro4 == null) {
                        C13706o.m87945v("macro");
                        macro4 = null;
                    }
                    int b = C6416p0.m24705b(macro4.getActions(), indexOf);
                    Macro macro5 = this.f11555C;
                    if (macro5 == null) {
                        C13706o.m87945v("macro");
                    } else {
                        macro = macro5;
                    }
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
                boolean z4 = selectableItem2 instanceof WidgetPressedTrigger;
                if (!z4) {
                    arrayList.add(getString(C17541R$string.ui_interaction_cut));
                }
                if (!z4) {
                    arrayList.add(getString(C17541R$string.action_file_operation_copy));
                }
                if (z2) {
                    arrayList.add(getString(C17541R$string.extract_to_action_block));
                }
                arrayList.add(getString(C17541R$string.delete));
                if (z3) {
                    arrayList.add(getString(C17541R$string.delete_condition_or_loop_including_children));
                }
                arrayList.add(getString(selectableItem.mo27822G1() ? C17541R$string.disable : C17541R$string.enable));
                if (z3) {
                    arrayList.add(getString(((ParentAction) selectableItem2).mo27822G1() ? C17541R$string.disable_condition_or_loop_action_including_children : C17541R$string.enable_condition_or_loop_action_including_children));
                }
                arrayList.add(getString(C17541R$string.help));
            }
        }
        if (arrayList.size() != 0) {
            Object[] array = arrayList.toArray(new String[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            AlertDialog.Builder builder = new AlertDialog.Builder(this, m17808G3(selectableItem));
            builder.setTitle((CharSequence) selectableItem.mo27831M0()).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C4606d(this, strArr, selectableItem2));
            builder.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public static final void m17863Y3(EditMacroActivity editMacroActivity, int i, int i2, boolean z, DialogInterface dialogInterface, int i3) {
        C13706o.m87929f(editMacroActivity, "this$0");
        if (editMacroActivity.mo28954I3().mo28009e().mo28008a() || i <= i2) {
            Macro macro = editMacroActivity.f11555C;
            if (macro == null) {
                C13706o.m87945v("macro");
                macro = null;
            }
            editMacroActivity.m17826N4(!macro.isEnabled());
            editMacroActivity.m17803E3();
            editMacroActivity.m17800D3(z);
            return;
        }
        C4061t1.m15957G0(editMacroActivity, editMacroActivity.mo28955J3());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* renamed from: Y4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m17864Y4(com.arlosoft.macrodroid.editscreen.EditMacroActivity r9, java.lang.String[] r10, com.arlosoft.macrodroid.common.SelectableItem r11, android.content.DialogInterface r12, int r13) {
        /*
            java.lang.Class<com.arlosoft.macrodroid.selectableitemlist.AddActionActivity> r12 = com.arlosoft.macrodroid.selectableitemlist.AddActionActivity.class
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            java.lang.String r0 = "$optionsToShow"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            java.lang.String r0 = "$item"
            kotlin.jvm.internal.C13706o.m87929f(r11, r0)
            r0 = 0
            r9.f11581c0 = r0
            r10 = r10[r13]
            r13 = 2131952388(0x7f130304, float:1.9541217E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            java.lang.String r1 = "ParentGUID"
            java.lang.String r2 = "MacroId"
            java.lang.String r3 = "macro"
            if (r13 == 0) goto L_0x004d
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r9, r12)
            com.arlosoft.macrodroid.macro.Macro r12 = r9.f11555C
            if (r12 != 0) goto L_0x0036
            kotlin.jvm.internal.C13706o.m87945v(r3)
            goto L_0x0037
        L_0x0036:
            r0 = r12
        L_0x0037:
            int r12 = r0.getId()
            r10.putExtra(r2, r12)
            long r11 = r11.mo27847f1()
            r10.putExtra(r1, r11)
            r11 = 909093(0xddf25, float:1.27391E-39)
            r9.startActivityForResult(r10, r11)
            goto L_0x05e0
        L_0x004d:
            r13 = 2131954553(0x7f130b79, float:1.9545608E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            r4 = 0
            r5 = 1
            if (r13 == 0) goto L_0x00e4
            com.arlosoft.macrodroid.common.SelectableItem r10 = com.arlosoft.macrodroid.utils.C6421r.m24721b()
            if (r10 == 0) goto L_0x006b
            com.arlosoft.macrodroid.common.SelectableItem r10 = com.arlosoft.macrodroid.utils.C6421r.m24721b()
            java.util.List r10 = kotlin.collections.C13612s.m87736e(r10)
            goto L_0x006f
        L_0x006b:
            java.util.List r10 = com.arlosoft.macrodroid.utils.C6421r.m24723d()
        L_0x006f:
            com.arlosoft.macrodroid.macro.Macro r12 = r9.f11555C
            if (r12 != 0) goto L_0x0077
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r12 = r0
        L_0x0077:
            java.util.ArrayList r12 = r12.getActions()
            int r12 = r12.size()
            r13 = 0
        L_0x0080:
            if (r13 >= r12) goto L_0x00da
            com.arlosoft.macrodroid.macro.Macro r1 = r9.f11555C
            if (r1 != 0) goto L_0x008a
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r1 = r0
        L_0x008a:
            java.util.ArrayList r1 = r1.getActions()
            java.lang.Object r1 = r1.get(r13)
            com.arlosoft.macrodroid.action.Action r1 = (com.arlosoft.macrodroid.action.Action) r1
            long r1 = r1.mo27847f1()
            long r6 = r11.mo27847f1()
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x00d7
            java.lang.String r11 = "copyItems"
            kotlin.jvm.internal.C13706o.m87928e(r10, r11)
            java.util.List r10 = kotlin.collections.C13566b0.m87444s0(r10)
            java.util.Iterator r10 = r10.iterator()
        L_0x00ad:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00da
            java.lang.Object r11 = r10.next()
            com.arlosoft.macrodroid.common.SelectableItem r11 = (com.arlosoft.macrodroid.common.SelectableItem) r11
            java.lang.String r12 = "null cannot be cast to non-null type com.arlosoft.macrodroid.action.Action"
            kotlin.jvm.internal.C13706o.m87927d(r11, r12)
            com.arlosoft.macrodroid.action.Action r11 = (com.arlosoft.macrodroid.action.Action) r11
            com.arlosoft.macrodroid.macro.Macro r12 = r9.f11555C
            if (r12 != 0) goto L_0x00c8
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r12 = r0
        L_0x00c8:
            r12.addActionAtIndex(r11, r13)
            com.arlosoft.macrodroid.macro.Macro r12 = r9.f11555C
            if (r12 != 0) goto L_0x00d3
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r12 = r0
        L_0x00d3:
            r11.mo24687G2(r12)
            goto L_0x00ad
        L_0x00d7:
            int r13 = r13 + 1
            goto L_0x0080
        L_0x00da:
            com.arlosoft.macrodroid.utils.C6421r.m24725f()
            r9.f11564L = r5
            m17793A4(r9, r4, r5, r0)
            goto L_0x05e0
        L_0x00e4:
            r13 = 2131952383(0x7f1302ff, float:1.9541207E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x0117
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r9, r12)
            com.arlosoft.macrodroid.macro.Macro r12 = r9.f11555C
            if (r12 != 0) goto L_0x00fe
            kotlin.jvm.internal.C13706o.m87945v(r3)
            goto L_0x00ff
        L_0x00fe:
            r0 = r12
        L_0x00ff:
            int r12 = r0.getId()
            r10.putExtra(r2, r12)
            long r11 = r11.mo27847f1()
            java.lang.String r13 = "ParentGUIDInsert"
            r10.putExtra(r13, r11)
            r11 = 909091(0xddf23, float:1.273908E-39)
            r9.startActivityForResult(r10, r11)
            goto L_0x05e0
        L_0x0117:
            r12 = 2131952391(0x7f130307, float:1.9541223E38)
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            if (r12 == 0) goto L_0x014a
            android.content.Intent r10 = new android.content.Intent
            java.lang.Class<com.arlosoft.macrodroid.selectableitemlist.AddConstraintActivity> r12 = com.arlosoft.macrodroid.selectableitemlist.AddConstraintActivity.class
            r10.<init>(r9, r12)
            com.arlosoft.macrodroid.macro.Macro r12 = r9.f11555C
            if (r12 != 0) goto L_0x0133
            kotlin.jvm.internal.C13706o.m87945v(r3)
            goto L_0x0134
        L_0x0133:
            r0 = r12
        L_0x0134:
            int r12 = r0.getId()
            r10.putExtra(r2, r12)
            long r11 = r11.mo27847f1()
            r10.putExtra(r1, r11)
            r11 = 909092(0xddf24, float:1.273909E-39)
            r9.startActivityForResult(r10, r11)
            goto L_0x05e0
        L_0x014a:
            r12 = 2131952690(0x7f130432, float:1.954183E38)
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            if (r12 == 0) goto L_0x016b
            com.arlosoft.macrodroid.macro.Macro r10 = r9.f11555C
            if (r10 != 0) goto L_0x015f
            kotlin.jvm.internal.C13706o.m87945v(r3)
            goto L_0x0160
        L_0x015f:
            r0 = r10
        L_0x0160:
            r11.mo24687G2(r0)
            r11.mo27877y2(r9)
            r11.mo25540W1()
            goto L_0x05e0
        L_0x016b:
            r12 = 2131955055(0x7f130d6f, float:1.9546627E38)
            java.lang.String r13 = r9.getString(r12)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            java.lang.String r1 = ""
            if (r13 == 0) goto L_0x0186
            com.arlosoft.macrodroid.action.Action r11 = (com.arlosoft.macrodroid.action.Action) r11
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r9 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            r9.<init>((java.lang.String) r1)
            r11.mo24703h3(r9)
            goto L_0x05e0
        L_0x0186:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r12 = r9.getString(r12)
            r13.append(r12)
            java.lang.String r12 = " ("
            r13.append(r12)
            r2 = 2131955057(0x7f130d71, float:1.954663E38)
            java.lang.String r6 = r9.getString(r2)
            r13.append(r6)
            r6 = 41
            r13.append(r6)
            java.lang.String r13 = r13.toString()
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x01bc
            com.arlosoft.macrodroid.action.Action r11 = (com.arlosoft.macrodroid.action.Action) r11
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r9 = new com.arlosoft.macrodroid.triggers.TriggerContextInfo
            r9.<init>((java.lang.String) r1)
            r11.mo24704i3(r9)
            goto L_0x05e0
        L_0x01bc:
            r13 = 2131955056(0x7f130d70, float:1.9546629E38)
            java.lang.String r1 = r9.getString(r13)
            boolean r1 = kotlin.jvm.internal.C13706o.m87924a(r10, r1)
            if (r1 == 0) goto L_0x01d0
            com.arlosoft.macrodroid.triggers.Trigger r11 = (com.arlosoft.macrodroid.triggers.Trigger) r11
            r11.mo31547e3()
            goto L_0x05e0
        L_0x01d0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r13 = r9.getString(r13)
            r1.append(r13)
            r1.append(r12)
            java.lang.String r12 = r9.getString(r2)
            r1.append(r12)
            r1.append(r6)
            java.lang.String r12 = r1.toString()
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            if (r12 == 0) goto L_0x01fa
            com.arlosoft.macrodroid.triggers.Trigger r11 = (com.arlosoft.macrodroid.triggers.Trigger) r11
            r11.mo31548f3()
            goto L_0x05e0
        L_0x01fa:
            r12 = 2131953819(0x7f13089b, float:1.954412E38)
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            if (r12 == 0) goto L_0x020c
            r9.m17872a5(r11)
            goto L_0x05e0
        L_0x020c:
            r12 = 2131954555(0x7f130b7b, float:1.9545613E38)
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            if (r12 == 0) goto L_0x0260
            com.arlosoft.macrodroid.common.SelectableItem r10 = com.arlosoft.macrodroid.utils.C6421r.m24721b()
            java.lang.String r12 = "null cannot be cast to non-null type com.arlosoft.macrodroid.constraint.Constraint"
            kotlin.jvm.internal.C13706o.m87927d(r10, r12)
            com.arlosoft.macrodroid.constraint.Constraint r10 = (com.arlosoft.macrodroid.constraint.Constraint) r10
            r11.mo27834R(r10)
            com.arlosoft.macrodroid.macro.Macro r12 = r9.f11555C
            if (r12 != 0) goto L_0x022f
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r12 = r0
        L_0x022f:
            r10.mo24687G2(r12)
            boolean r12 = r10 instanceof com.arlosoft.macrodroid.constraint.LogicConstraint
            if (r12 == 0) goto L_0x0256
            java.util.List r12 = r10.mo27826J0()
            java.lang.String r13 = "constraint.getConstraints()"
            kotlin.jvm.internal.C13706o.m87928e(r12, r13)
            boolean r12 = r9.m17922p4(r4, r12)
            if (r12 == 0) goto L_0x0256
            r11.mo27849i0(r10)
            android.content.Context r10 = r9.getApplicationContext()
            r11 = 2131952565(0x7f1303b5, float:1.9541576E38)
            android.widget.Toast r10 = p319lc.C15626c.makeText(r10, r11, r4)
            r10.show()
        L_0x0256:
            com.arlosoft.macrodroid.utils.C6421r.m24725f()
            r9.f11564L = r5
            m17793A4(r9, r4, r5, r0)
            goto L_0x05e0
        L_0x0260:
            r12 = 2131955624(0x7f130fa8, float:1.954778E38)
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            r13 = 2131952961(0x7f130541, float:1.954238E38)
            if (r12 == 0) goto L_0x02e8
            boolean r10 = r11 instanceof com.arlosoft.macrodroid.action.ParentAction
            if (r10 == 0) goto L_0x027b
            r12 = r11
            com.arlosoft.macrodroid.action.ParentAction r12 = (com.arlosoft.macrodroid.action.ParentAction) r12
            r9.m17924q3(r12)
            goto L_0x027e
        L_0x027b:
            com.arlosoft.macrodroid.utils.C6421r.m24726g(r11)
        L_0x027e:
            android.content.Context r12 = r9.getApplicationContext()
            android.widget.Toast r12 = p319lc.C15626c.makeText(r12, r13, r4)
            r12.show()
            r9.m17888e5()
            if (r10 == 0) goto L_0x02d4
            com.arlosoft.macrodroid.macro.Macro r10 = r9.f11555C
            if (r10 != 0) goto L_0x0296
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r10 = r0
        L_0x0296:
            java.util.ArrayList r10 = r10.getActions()
            com.arlosoft.macrodroid.macro.Macro r12 = r9.f11555C
            if (r12 != 0) goto L_0x02a2
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r12 = r0
        L_0x02a2:
            java.util.ArrayList r12 = r12.getActions()
            int r12 = r12.indexOf(r11)
            int r10 = com.arlosoft.macrodroid.utils.C6416p0.m24709f(r10, r12)
            com.arlosoft.macrodroid.macro.Macro r12 = r9.f11555C
            if (r12 != 0) goto L_0x02b6
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r12 = r0
        L_0x02b6:
            java.util.ArrayList r12 = r12.getActions()
            int r11 = r12.indexOf(r11)
            if (r11 > r10) goto L_0x02df
        L_0x02c0:
            com.arlosoft.macrodroid.macro.Macro r12 = r9.f11555C
            if (r12 != 0) goto L_0x02c8
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r12 = r0
        L_0x02c8:
            java.util.ArrayList r12 = r12.getActions()
            r12.remove(r10)
            if (r10 == r11) goto L_0x02df
            int r10 = r10 + -1
            goto L_0x02c0
        L_0x02d4:
            com.arlosoft.macrodroid.macro.Macro r10 = r9.f11555C
            if (r10 != 0) goto L_0x02dc
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r10 = r0
        L_0x02dc:
            r10.removeItem(r11)
        L_0x02df:
            r9.f11556D = r0
            r9.f11564L = r5
            m17793A4(r9, r4, r5, r0)
            goto L_0x05e0
        L_0x02e8:
            r12 = 2131951859(0x7f1300f3, float:1.9540144E38)
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            if (r12 == 0) goto L_0x0312
            boolean r10 = r11 instanceof com.arlosoft.macrodroid.action.ParentAction
            if (r10 == 0) goto L_0x02ff
            com.arlosoft.macrodroid.action.ParentAction r11 = (com.arlosoft.macrodroid.action.ParentAction) r11
            r9.m17924q3(r11)
            goto L_0x0302
        L_0x02ff:
            com.arlosoft.macrodroid.utils.C6421r.m24726g(r11)
        L_0x0302:
            android.content.Context r10 = r9.getApplicationContext()
            android.widget.Toast r10 = p319lc.C15626c.makeText(r10, r13, r4)
            r10.show()
            r9.m17888e5()
            goto L_0x05e0
        L_0x0312:
            r12 = 2131953227(0x7f13064b, float:1.954292E38)
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            java.lang.String r13 = "macro.actions"
            if (r12 == 0) goto L_0x033e
            com.arlosoft.macrodroid.macro.Macro r10 = r9.f11555C
            if (r10 != 0) goto L_0x0329
            kotlin.jvm.internal.C13706o.m87945v(r3)
            goto L_0x032a
        L_0x0329:
            r0 = r10
        L_0x032a:
            java.util.ArrayList r10 = r0.getActions()
            kotlin.jvm.internal.C13706o.m87928e(r10, r13)
            int r10 = kotlin.collections.C13566b0.m87427b0(r10, r11)
            int r10 = java.lang.Math.max(r10, r4)
            r9.m17868Z4(r10)
            goto L_0x05e0
        L_0x033e:
            r12 = 2131953020(0x7f13057c, float:1.95425E38)
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            r1 = 2131953194(0x7f13062a, float:1.9542852E38)
            r2 = 32
            r6 = 2131953971(0x7f130933, float:1.9544428E38)
            if (r12 == 0) goto L_0x03b5
            boolean r10 = r11 instanceof com.arlosoft.macrodroid.action.ParentAction
            if (r10 == 0) goto L_0x039e
            com.arlosoft.macrodroid.macro.Macro r10 = r9.f11555C
            if (r10 != 0) goto L_0x035f
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r10 = r0
        L_0x035f:
            java.util.ArrayList r10 = r10.getActions()
            int r10 = com.arlosoft.macrodroid.action.Action.m9593S2(r10)
            if (r10 < 0) goto L_0x039e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r9.getString(r6)
            r12.append(r13)
            r12.append(r2)
            com.arlosoft.macrodroid.macro.Macro r13 = r9.f11555C
            if (r13 != 0) goto L_0x0380
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r13 = r0
        L_0x0380:
            java.util.ArrayList r13 = r13.getActions()
            java.lang.Object r10 = r13.get(r10)
            com.arlosoft.macrodroid.action.Action r10 = (com.arlosoft.macrodroid.action.Action) r10
            java.lang.String r10 = r10.mo24738G0()
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            java.lang.String r12 = r9.getString(r1)
            com.arlosoft.macrodroid.common.C4061t1.m16019t(r9, r12, r10)
            r10 = 0
            goto L_0x039f
        L_0x039e:
            r10 = 1
        L_0x039f:
            if (r10 == 0) goto L_0x05e0
            com.arlosoft.macrodroid.macro.Macro r10 = r9.f11555C
            if (r10 != 0) goto L_0x03a9
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r10 = r0
        L_0x03a9:
            r10.removeItem(r11)
            r9.f11556D = r0
            r9.f11564L = r5
            m17793A4(r9, r4, r5, r0)
            goto L_0x05e0
        L_0x03b5:
            r12 = 2131953029(0x7f130585, float:1.9542517E38)
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            if (r12 == 0) goto L_0x0417
            boolean r10 = r11 instanceof com.arlosoft.macrodroid.action.ParentAction
            if (r10 == 0) goto L_0x040d
            com.arlosoft.macrodroid.macro.Macro r10 = r9.f11555C
            if (r10 != 0) goto L_0x03ce
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r10 = r0
        L_0x03ce:
            java.util.ArrayList r10 = r10.getActions()
            int r10 = com.arlosoft.macrodroid.action.Action.m9593S2(r10)
            if (r10 < 0) goto L_0x040d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r9.getString(r6)
            r12.append(r13)
            r12.append(r2)
            com.arlosoft.macrodroid.macro.Macro r13 = r9.f11555C
            if (r13 != 0) goto L_0x03ef
            kotlin.jvm.internal.C13706o.m87945v(r3)
            goto L_0x03f0
        L_0x03ef:
            r0 = r13
        L_0x03f0:
            java.util.ArrayList r13 = r0.getActions()
            java.lang.Object r10 = r13.get(r10)
            com.arlosoft.macrodroid.action.Action r10 = (com.arlosoft.macrodroid.action.Action) r10
            java.lang.String r10 = r10.mo24738G0()
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            java.lang.String r12 = r9.getString(r1)
            com.arlosoft.macrodroid.common.C4061t1.m16019t(r9, r12, r10)
            goto L_0x040e
        L_0x040d:
            r4 = 1
        L_0x040e:
            if (r4 == 0) goto L_0x05e0
            com.arlosoft.macrodroid.action.ParentAction r11 = (com.arlosoft.macrodroid.action.ParentAction) r11
            r9.m17915n3(r11)
            goto L_0x05e0
        L_0x0417:
            r12 = 2131952395(0x7f13030b, float:1.9541232E38)
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            r1 = -1
            if (r12 == 0) goto L_0x0487
            com.arlosoft.macrodroid.macro.Macro r10 = r9.f11555C
            if (r10 != 0) goto L_0x042d
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r10 = r0
        L_0x042d:
            java.util.ArrayList r10 = r10.getActions()
            kotlin.jvm.internal.C13706o.m87928e(r10, r13)
            int r10 = kotlin.collections.C13566b0.m87427b0(r10, r11)
            com.arlosoft.macrodroid.macro.Macro r11 = r9.f11555C
            if (r11 != 0) goto L_0x0440
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r11 = r0
        L_0x0440:
            java.util.ArrayList r11 = r11.getActions()
            int r11 = com.arlosoft.macrodroid.utils.C6416p0.m24705b(r11, r10)
            com.arlosoft.macrodroid.macro.Macro r12 = r9.f11555C
            if (r12 != 0) goto L_0x0450
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r12 = r0
        L_0x0450:
            java.util.ArrayList r12 = r12.getActions()
            int r10 = com.arlosoft.macrodroid.utils.C6416p0.m24704a(r12, r10)
            com.arlosoft.macrodroid.action.ElseIfConditionAction r12 = new com.arlosoft.macrodroid.action.ElseIfConditionAction
            r12.<init>()
            r9.f11581c0 = r12
            r9.f11556D = r12
            com.arlosoft.macrodroid.macro.Macro r13 = r9.f11555C
            if (r13 != 0) goto L_0x0469
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r13 = r0
        L_0x0469:
            if (r10 == r1) goto L_0x046c
            r11 = r10
        L_0x046c:
            r13.addActionAtIndex(r12, r11)
            com.arlosoft.macrodroid.macro.Macro r10 = r9.f11555C
            if (r10 != 0) goto L_0x0477
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r10 = r0
        L_0x0477:
            r12.mo24687G2(r10)
            r12.mo27877y2(r9)
            r12.mo25540W1()
            r9.f11564L = r5
            m17793A4(r9, r4, r5, r0)
            goto L_0x05e0
        L_0x0487:
            r12 = 2131952396(0x7f13030c, float:1.9541234E38)
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            if (r12 == 0) goto L_0x04f6
            com.arlosoft.macrodroid.macro.Macro r10 = r9.f11555C
            if (r10 != 0) goto L_0x049c
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r10 = r0
        L_0x049c:
            java.util.ArrayList r10 = r10.getActions()
            kotlin.jvm.internal.C13706o.m87928e(r10, r13)
            int r10 = kotlin.collections.C13566b0.m87427b0(r10, r11)
            com.arlosoft.macrodroid.macro.Macro r11 = r9.f11555C
            if (r11 != 0) goto L_0x04af
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r11 = r0
        L_0x04af:
            java.util.ArrayList r11 = r11.getActions()
            int r11 = com.arlosoft.macrodroid.utils.C6416p0.m24705b(r11, r10)
            com.arlosoft.macrodroid.macro.Macro r12 = r9.f11555C
            if (r12 != 0) goto L_0x04bf
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r12 = r0
        L_0x04bf:
            java.util.ArrayList r12 = r12.getActions()
            int r10 = com.arlosoft.macrodroid.utils.C6416p0.m24704a(r12, r10)
            com.arlosoft.macrodroid.action.ElseIfConfirmedThenAction r12 = new com.arlosoft.macrodroid.action.ElseIfConfirmedThenAction
            r12.<init>()
            r9.f11581c0 = r12
            r9.f11556D = r12
            com.arlosoft.macrodroid.macro.Macro r13 = r9.f11555C
            if (r13 != 0) goto L_0x04d8
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r13 = r0
        L_0x04d8:
            if (r10 == r1) goto L_0x04db
            r11 = r10
        L_0x04db:
            r13.addActionAtIndex(r12, r11)
            com.arlosoft.macrodroid.macro.Macro r10 = r9.f11555C
            if (r10 != 0) goto L_0x04e6
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r10 = r0
        L_0x04e6:
            r12.mo24687G2(r10)
            r12.mo27877y2(r9)
            r12.mo25540W1()
            r9.f11564L = r5
            m17793A4(r9, r4, r5, r0)
            goto L_0x05e0
        L_0x04f6:
            r12 = 2131952394(0x7f13030a, float:1.954123E38)
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            if (r12 == 0) goto L_0x053d
            com.arlosoft.macrodroid.macro.Macro r10 = r9.f11555C
            if (r10 != 0) goto L_0x050b
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r10 = r0
        L_0x050b:
            java.util.ArrayList r10 = r10.getActions()
            kotlin.jvm.internal.C13706o.m87928e(r10, r13)
            int r10 = kotlin.collections.C13566b0.m87427b0(r10, r11)
            com.arlosoft.macrodroid.macro.Macro r11 = r9.f11555C
            if (r11 != 0) goto L_0x051e
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r11 = r0
        L_0x051e:
            java.util.ArrayList r11 = r11.getActions()
            int r10 = com.arlosoft.macrodroid.utils.C6416p0.m24705b(r11, r10)
            com.arlosoft.macrodroid.macro.Macro r11 = r9.f11555C
            if (r11 != 0) goto L_0x052e
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r11 = r0
        L_0x052e:
            com.arlosoft.macrodroid.action.ElseAction r12 = new com.arlosoft.macrodroid.action.ElseAction
            r12.<init>()
            r11.addActionAtIndex(r12, r10)
            r9.f11564L = r5
            m17793A4(r9, r4, r5, r0)
            goto L_0x05e0
        L_0x053d:
            r12 = 2131953126(0x7f1305e6, float:1.9542714E38)
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            if (r12 == 0) goto L_0x0565
            r9.f11564L = r5
            r11.mo27818D2(r5)
            boolean r10 = r11 instanceof com.arlosoft.macrodroid.action.ParentAction
            if (r10 == 0) goto L_0x0560
            com.arlosoft.macrodroid.macro.Macro r10 = r9.f11555C
            if (r10 != 0) goto L_0x055b
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r10 = r0
        L_0x055b:
            com.arlosoft.macrodroid.action.Action r11 = (com.arlosoft.macrodroid.action.Action) r11
            r10.enableParentItem(r11)
        L_0x0560:
            m17793A4(r9, r4, r5, r0)
            goto L_0x05e0
        L_0x0565:
            r12 = 2131953130(0x7f1305ea, float:1.9542722E38)
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            if (r12 == 0) goto L_0x0585
            r9.f11564L = r5
            com.arlosoft.macrodroid.macro.Macro r10 = r9.f11555C
            if (r10 != 0) goto L_0x057c
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r10 = r0
        L_0x057c:
            com.arlosoft.macrodroid.action.Action r11 = (com.arlosoft.macrodroid.action.Action) r11
            r10.enableOrDisableItemAndChildren(r11, r5)
            m17793A4(r9, r4, r5, r0)
            goto L_0x05e0
        L_0x0585:
            r12 = 2131953057(0x7f1305a1, float:1.9542574E38)
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            if (r12 == 0) goto L_0x059b
            r9.f11564L = r5
            r11.mo27818D2(r4)
            m17793A4(r9, r4, r5, r0)
            goto L_0x05e0
        L_0x059b:
            r12 = 2131953058(0x7f1305a2, float:1.9542576E38)
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            if (r12 == 0) goto L_0x05bb
            r9.f11564L = r5
            com.arlosoft.macrodroid.macro.Macro r10 = r9.f11555C
            if (r10 != 0) goto L_0x05b2
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r10 = r0
        L_0x05b2:
            com.arlosoft.macrodroid.action.Action r11 = (com.arlosoft.macrodroid.action.Action) r11
            r10.enableOrDisableItemAndChildren(r11, r4)
            m17793A4(r9, r4, r5, r0)
            goto L_0x05e0
        L_0x05bb:
            r12 = 2131952389(0x7f130305, float:1.954122E38)
            java.lang.String r13 = r9.getString(r12)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 != 0) goto L_0x05d5
            r13 = 2131953106(0x7f1305d2, float:1.9542674E38)
            java.lang.String r13 = r9.getString(r13)
            boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r10, r13)
            if (r13 == 0) goto L_0x05e0
        L_0x05d5:
            java.lang.String r12 = r9.getString(r12)
            boolean r12 = kotlin.jvm.internal.C13706o.m87924a(r10, r12)
            r9.m17942w3(r11, r10, r12)
        L_0x05e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.editscreen.EditMacroActivity.m17864Y4(com.arlosoft.macrodroid.editscreen.EditMacroActivity, java.lang.String[], com.arlosoft.macrodroid.common.SelectableItem, android.content.DialogInterface, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public static final void m17867Z3(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* renamed from: Z4 */
    private final void m17868Z4(int i) {
        Macro macro;
        int i2 = i;
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog_Invert_Action);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_extract_to_action_block);
        appCompatDialog.setTitle((int) C17541R$string.extract_to_action_block);
        C4656c.m18115d(appCompatDialog, 0, 1, (Object) null);
        View findViewById = appCompatDialog.findViewById(C17532R$id.extractActionsList);
        C13706o.m87926c(findViewById);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.actionBlockNameText);
        C13706o.m87926c(findViewById2);
        TextView textView = (TextView) findViewById2;
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.okButton);
        C13706o.m87926c(findViewById3);
        Button button = (Button) findViewById3;
        View findViewById4 = appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87926c(findViewById4);
        Button button2 = (Button) findViewById4;
        View findViewById5 = appCompatDialog.findViewById(C17532R$id.topUpButton);
        C13706o.m87926c(findViewById5);
        ImageButton imageButton = (ImageButton) findViewById5;
        View findViewById6 = appCompatDialog.findViewById(C17532R$id.topDownButton);
        C13706o.m87926c(findViewById6);
        ImageButton imageButton2 = (ImageButton) findViewById6;
        View findViewById7 = appCompatDialog.findViewById(C17532R$id.bottomUpButton);
        C13706o.m87926c(findViewById7);
        ImageButton imageButton3 = (ImageButton) findViewById7;
        View findViewById8 = appCompatDialog.findViewById(C17532R$id.bottomDownButton);
        C13706o.m87926c(findViewById8);
        ImageButton imageButton4 = (ImageButton) findViewById8;
        Macro macro2 = this.f11555C;
        if (macro2 == null) {
            C13706o.m87945v("macro");
            macro = null;
        } else {
            macro = macro2;
        }
        Macro macro3 = this.f11555C;
        if (macro3 == null) {
            C13706o.m87945v("macro");
            macro3 = null;
        }
        ArrayList<Action> actions = macro3.getActions();
        C13706o.m87928e(actions, "macro.actions");
        C4633q0 q0Var = r0;
        ImageButton imageButton5 = imageButton4;
        ImageButton imageButton6 = imageButton2;
        AppCompatDialog appCompatDialog2 = appCompatDialog;
        C4633q0 q0Var2 = new C4633q0(this, macro, actions, C4577q0.f11600a, C4579r0.f11601a, C4582s0.f11602a, true, !this.f11562J, new C4584t0(this));
        q0Var.mo29065X(i2, i2);
        m17892f5(q0Var);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        C4633q0 q0Var3 = q0Var;
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        RecyclerView recyclerView2 = recyclerView;
        C4666m.m18147o(imageButton, (C13640g) null, new C4565k0(q0Var3, linearLayoutManager2, recyclerView2, this, (C13635d<? super C4565k0>) null), 1, (Object) null);
        C4666m.m18147o(imageButton6, (C13640g) null, new C4567l0(q0Var3, linearLayoutManager2, recyclerView2, this, (C13635d<? super C4567l0>) null), 1, (Object) null);
        C4666m.m18147o(imageButton3, (C13640g) null, new C4569m0(q0Var3, linearLayoutManager2, recyclerView2, this, (C13635d<? super C4569m0>) null), 1, (Object) null);
        C4666m.m18147o(imageButton5, (C13640g) null, new C4571n0(q0Var3, linearLayoutManager2, recyclerView2, this, (C13635d<? super C4571n0>) null), 1, (Object) null);
        C4666m.m18147o(button, (C13640g) null, new C4573o0(this, textView, q0Var, appCompatDialog2, (C13635d<? super C4573o0>) null), 1, (Object) null);
        AppCompatDialog appCompatDialog3 = appCompatDialog2;
        C4666m.m18147o(button2, (C13640g) null, new C4575p0(appCompatDialog3, (C13635d<? super C4575p0>) null), 1, (Object) null);
        recyclerView.setItemAnimator((RecyclerView.ItemAnimator) null);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(q0Var);
        C13706o.m87928e(OneShotPreDrawListener.add(recyclerView, new C4563j0(recyclerView, i2, linearLayoutManager, recyclerView)), "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        appCompatDialog3.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public static final void m17871a4(EditMacroActivity editMacroActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(editMacroActivity, "this$0");
        m17936u3(editMacroActivity, false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a5 */
    public final void m17872a5(SelectableItem selectableItem) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, m17808G3(selectableItem));
        builder.setTitle((CharSequence) selectableItem.mo25559a1());
        if (selectableItem.mo24673T0().mo27902t()) {
            builder.setMessage((CharSequence) C4061t1.m16007n(this, selectableItem.mo25557Q0()));
        } else {
            builder.setMessage((CharSequence) selectableItem.mo25557Q0());
        }
        builder.setNegativeButton(17039370, (DialogInterface.OnClickListener) null);
        C4061t1.m16026w0(builder.show());
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public static final void m17875b4(EditMacroActivity editMacroActivity, int i, int i2, DialogInterface dialogInterface, int i3) {
        C13706o.m87929f(editMacroActivity, "this$0");
        if (editMacroActivity.mo28954I3().mo28009e().mo28008a() || i <= i2) {
            editMacroActivity.m17820L3(false);
        } else {
            C4061t1.m15957G0(editMacroActivity, editMacroActivity.mo28955J3());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b5 */
    public final void m17876b5(MacroDroidVariable macroDroidVariable) {
        C6520o0 o0Var = C6520o0.f15162a;
        Macro macro = this.f11555C;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        o0Var.mo32704H0(this, macroDroidVariable, macro, C17542R$style.Theme_App_Dialog_LocalVariables_NoTitle, C17542R$style.Theme_App_Dialog_LocalVariables, new C4586u0(this, macroDroidVariable));
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public static final void m17879c4(EditMacroActivity editMacroActivity, boolean z, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(editMacroActivity, "this$0");
        editMacroActivity.m17933t3(z);
    }

    /* renamed from: c5 */
    private final String m17880c5(String str) {
        return new C15159j("[\\\\/:*?\"<>|]").mo74469d(C15176v.m93629D(str, ' ', '_', false, 4, (Object) null), HelpFormatter.DEFAULT_OPT_PREFIX);
    }

    /* renamed from: d4 */
    private static final String m17883d4(C13684d0 d0Var, C13684d0 d0Var2) {
        T readLine = ((BufferedReader) d0Var2.element).readLine();
        d0Var.element = readLine;
        return readLine;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        if ((r0.length() > 0) == false) goto L_0x007b;
     */
    /* renamed from: d5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m17884d5() {
        /*
            r5 = this;
            int r0 = r5.f11577Y
            r1 = 8
            java.lang.String r2 = "acceptButton"
            r3 = 0
            r4 = 2
            if (r0 != r4) goto L_0x003f
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View> r0 = r5.f11571S
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "bottomSheetBehavior"
            kotlin.jvm.internal.C13706o.m87945v(r0)
            r0 = r3
        L_0x0014:
            int r0 = r0.mo56933C()
            r4 = 3
            if (r0 != r4) goto L_0x003f
            int r0 = com.arlosoft.macrodroid.C17532R$id.acceptButton
            android.view.View r3 = r5.mo28951B2(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r3
            boolean r3 = r3.isShown()
            if (r3 == 0) goto L_0x003e
            android.view.View r3 = r5.mo28951B2(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r3
            r3.mo57882l()
            android.view.View r0 = r5.mo28951B2(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)
            r0.setVisibility(r1)
        L_0x003e:
            return
        L_0x003f:
            com.arlosoft.macrodroid.macro.Macro r0 = r5.f11555C
            java.lang.String r4 = "macro"
            if (r0 != 0) goto L_0x0049
            kotlin.jvm.internal.C13706o.m87945v(r4)
            r0 = r3
        L_0x0049:
            boolean r0 = r0.isCompleted()
            if (r0 != 0) goto L_0x0099
            com.arlosoft.macrodroid.macro.Macro r0 = r5.f11555C
            if (r0 != 0) goto L_0x0057
            kotlin.jvm.internal.C13706o.m87945v(r4)
            goto L_0x0058
        L_0x0057:
            r3 = r0
        L_0x0058:
            boolean r0 = r3.isValid()
            if (r0 == 0) goto L_0x0089
            int r0 = com.arlosoft.macrodroid.C17532R$id.macroNameText
            android.view.View r0 = r5.mo28951B2(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.text.Editable r0 = r0.getText()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x007a
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0076
            r0 = 1
            goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            if (r0 != 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r1 = 0
        L_0x007b:
            if (r1 != 0) goto L_0x0089
            int r0 = com.arlosoft.macrodroid.C17532R$id.acceptButton
            android.view.View r0 = r5.mo28951B2(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            r0.mo57926t()
            goto L_0x00cc
        L_0x0089:
            boolean r0 = r5.f11562J
            if (r0 != 0) goto L_0x00cc
            int r0 = com.arlosoft.macrodroid.C17532R$id.acceptButton
            android.view.View r0 = r5.mo28951B2(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            r0.mo57926t()
            goto L_0x00cc
        L_0x0099:
            boolean r0 = r5.f11564L
            if (r0 != 0) goto L_0x00c1
            int r0 = com.arlosoft.macrodroid.C17532R$id.acceptButton
            android.view.View r3 = r5.mo28951B2(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r3
            boolean r3 = r3.isShown()
            if (r3 == 0) goto L_0x00cc
            android.view.View r3 = r5.mo28951B2(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r3
            r3.mo57882l()
            android.view.View r0 = r5.mo28951B2(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)
            r0.setVisibility(r1)
            goto L_0x00cc
        L_0x00c1:
            int r0 = com.arlosoft.macrodroid.C17532R$id.acceptButton
            android.view.View r0 = r5.mo28951B2(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            r0.mo57926t()
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.editscreen.EditMacroActivity.m17884d5():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public static final void m17887e4(EditMacroActivity editMacroActivity, float f, int i) {
        C13706o.m87929f(editMacroActivity, "this$0");
        if (i == 0) {
            editMacroActivity.m17803E3();
        }
    }

    /* renamed from: e5 */
    private final void m17888e5() {
        SelectableItem b = C6421r.m24721b();
        int i = C17532R$id.pasteTriggerButton;
        ImageButton imageButton = (ImageButton) mo28951B2(i);
        C13706o.m87928e(imageButton, "pasteTriggerButton");
        int i2 = 8;
        imageButton.setVisibility(8);
        int i3 = C17532R$id.pasteActionButton;
        ImageButton imageButton2 = (ImageButton) mo28951B2(i3);
        C13706o.m87928e(imageButton2, "pasteActionButton");
        imageButton2.setVisibility(8);
        int i4 = C17532R$id.pasteConstraintButton;
        ImageButton imageButton3 = (ImageButton) mo28951B2(i4);
        C13706o.m87928e(imageButton3, "pasteConstraintButton");
        imageButton3.setVisibility(8);
        if (b != null) {
            if (b instanceof Trigger) {
                ImageButton imageButton4 = (ImageButton) mo28951B2(i);
                C13706o.m87928e(imageButton4, "pasteTriggerButton");
                imageButton4.setVisibility(0);
            } else if (b instanceof Action) {
                ImageButton imageButton5 = (ImageButton) mo28951B2(i3);
                C13706o.m87928e(imageButton5, "pasteActionButton");
                if (!(b instanceof ExitActionBlockAction)) {
                    i2 = 0;
                }
                imageButton5.setVisibility(i2);
            } else if (b instanceof Constraint) {
                ImageButton imageButton6 = (ImageButton) mo28951B2(i4);
                C13706o.m87928e(imageButton6, "pasteConstraintButton");
                imageButton6.setVisibility(0);
            }
        } else if (C6421r.m24723d() != null) {
            ImageButton imageButton7 = (ImageButton) mo28951B2(i3);
            C13706o.m87928e(imageButton7, "pasteActionButton");
            imageButton7.setVisibility(0);
        }
    }

    /* renamed from: f3 */
    private final void m17890f3(Macro macro) {
        Iterator<Trigger> it = macro.getTriggerList().iterator();
        while (it.hasNext()) {
            Trigger next = it.next();
            next.mo25810V();
            for (Constraint next2 : next.mo27826J0()) {
                next2.mo24687G2(macro);
                next2.mo25810V();
            }
        }
        Iterator<Action> it2 = macro.getActions().iterator();
        while (it2.hasNext()) {
            Action next3 = it2.next();
            next3.mo25810V();
            for (Constraint next4 : next3.mo27826J0()) {
                next4.mo24687G2(macro);
                next4.mo25810V();
            }
        }
        for (Constraint next5 : macro.getConstraints()) {
            next5.mo24687G2(macro);
            next5.mo25810V();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public static final void m17891f4(EditMacroActivity editMacroActivity, View view) {
        C13706o.m87929f(editMacroActivity, "this$0");
        editMacroActivity.m17820L3(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: f5 */
    public final void m17892f5(C4633q0<Action> q0Var) {
        Range<Integer> K = q0Var.mo29055K();
        C13706o.m87926c(K);
        Macro macro = this.f11555C;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        ArrayList<Action> actions = macro.getActions();
        Integer lower = K.getLower();
        C13706o.m87928e(lower, "range.lower");
        boolean z = true;
        List<Action> subList = actions.subList(lower.intValue(), K.getUpper().intValue() + 1);
        C13706o.m87928e(subList, "macro.actions.subList(ra…e.lower, range.upper + 1)");
        if (Action.m9593S2(subList) < 0) {
            z = false;
        }
        q0Var.mo29066Y(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final void m17894g3(boolean z) {
        HashSet hashSet = new HashSet();
        if (!z) {
            Macro macro = this.f11555C;
            Macro macro2 = null;
            if (macro == null) {
                C13706o.m87945v("macro");
                macro = null;
            }
            Iterator<Trigger> it = macro.getTriggerList().iterator();
            while (it.hasNext()) {
                Trigger next = it.next();
                String[] e1 = next.mo24700e1();
                hashSet.addAll(Arrays.asList(Arrays.copyOf(e1, e1.length)));
                if (!next.mo27876y1(this)) {
                    return;
                }
            }
            Macro macro3 = this.f11555C;
            if (macro3 == null) {
                C13706o.m87945v("macro");
                macro3 = null;
            }
            Iterator<Action> it2 = macro3.getActions().iterator();
            while (it2.hasNext()) {
                Action next2 = it2.next();
                String[] e12 = next2.mo24700e1();
                hashSet.addAll(Arrays.asList(Arrays.copyOf(e12, e12.length)));
                if (!next2.mo27876y1(this)) {
                    return;
                }
            }
            Macro macro4 = this.f11555C;
            if (macro4 == null) {
                C13706o.m87945v("macro");
            } else {
                macro2 = macro4;
            }
            for (Constraint next3 : macro2.getConstraints()) {
                String[] e13 = next3.mo24700e1();
                hashSet.addAll(Arrays.asList(Arrays.copyOf(e13, e13.length)));
                if (!next3.mo27876y1(this)) {
                    return;
                }
            }
        }
        if (Build.VERSION.SDK_INT < 23 || hashSet.size() == 0) {
            m17906k3(z);
            return;
        }
        Object[] array = hashSet.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        new C11102b((FragmentActivity) this).mo62231o((String[]) Arrays.copyOf(strArr, strArr.length)).mo79679I(C16971a.m100210a()).mo79685P(new C4648x(this, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: g4 */
    public static final boolean m17895g4(EditMacroActivity editMacroActivity, View view, MotionEvent motionEvent) {
        C13706o.m87929f(editMacroActivity, "this$0");
        ((EditText) editMacroActivity.mo28951B2(C17532R$id.macroNameText)).setFocusableInTouchMode(true);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public static final void m17897h3(EditMacroActivity editMacroActivity, boolean z, Boolean bool) {
        C13706o.m87929f(editMacroActivity, "this$0");
        C13706o.m87928e(bool, "granted");
        if (bool.booleanValue()) {
            editMacroActivity.m17906k3(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h4 */
    public static final void m17898h4(EditMacroActivity editMacroActivity, boolean z) {
        C13706o.m87929f(editMacroActivity, "this$0");
        if (!z) {
            ((EditText) editMacroActivity.mo28951B2(C17532R$id.macroNameText)).clearFocus();
        }
    }

    /* renamed from: i3 */
    private final void m17900i3() {
        Macro macro = this.f11555C;
        Macro macro2 = null;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        Iterator<Trigger> it = macro.getTriggerList().iterator();
        while (it.hasNext()) {
            it.next().mo27842c0();
        }
        Macro macro3 = this.f11555C;
        if (macro3 == null) {
            C13706o.m87945v("macro");
            macro3 = null;
        }
        Iterator<Action> it2 = macro3.getActions().iterator();
        while (it2.hasNext()) {
            it2.next().mo27842c0();
        }
        Macro macro4 = this.f11555C;
        if (macro4 == null) {
            C13706o.m87945v("macro");
        } else {
            macro2 = macro4;
        }
        for (Constraint c0 : macro2.getConstraints()) {
            c0.mo27842c0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public static final boolean m17901i4(EditMacroActivity editMacroActivity, View view, MotionEvent motionEvent) {
        C13706o.m87929f(editMacroActivity, "this$0");
        ((AppCompatEditText) editMacroActivity.mo28951B2(C17532R$id.macroDescription)).setCursorVisible(true);
        return false;
    }

    /* renamed from: j3 */
    private final void m17903j3(AppCompatDialog appCompatDialog, EditText editText) {
        SelectableItem selectableItem = this.f11556D;
        if (selectableItem != null) {
            selectableItem.mo27819E2(true);
        }
        SelectableItem selectableItem2 = this.f11556D;
        if (selectableItem2 != null) {
            selectableItem2.mo27815A2(String.valueOf(editText != null ? editText.getText() : null));
        }
        appCompatDialog.dismiss();
        this.f11564L = true;
        m17793A4(this, false, 1, (Object) null);
    }

    /* renamed from: j4 */
    private final void m17904j4() {
        TriggerContextInfo triggerContextInfo;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("TESTING MACRO:");
            Macro macro = this.f11555C;
            if (macro == null) {
                C13706o.m87945v("macro");
                macro = null;
            }
            sb.append(macro.getName());
            String sb2 = sb.toString();
            Macro macro2 = this.f11555C;
            if (macro2 == null) {
                C13706o.m87945v("macro");
                macro2 = null;
            }
            C4878b.m18874m(sb2, macro2.getGUID());
            Macro macro3 = this.f11555C;
            if (macro3 == null) {
                C13706o.m87945v("macro");
                macro3 = null;
            }
            if (macro3.getTriggerList().size() == 0) {
                triggerContextInfo = new TriggerContextInfo((Trigger) new EmptyTrigger());
            } else {
                Macro macro4 = this.f11555C;
                if (macro4 == null) {
                    C13706o.m87945v("macro");
                    macro4 = null;
                }
                triggerContextInfo = new TriggerContextInfo(macro4.getTriggerList().get(0));
            }
            Macro macro5 = this.f11555C;
            if (macro5 == null) {
                C13706o.m87945v("macro");
                macro5 = null;
            }
            macro5.setTriggerThatInvoked((Trigger) null);
            Macro macro6 = this.f11555C;
            if (macro6 == null) {
                C13706o.m87945v("macro");
                macro6 = null;
            }
            macro6.invokeActions(triggerContextInfo, true);
        } catch (Exception unused) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle((int) C17541R$string.macro_test_failed);
            builder.setMessage((int) C17541R$string.macro_cannot_be_run_without_trigger);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) null);
            builder.show();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: k3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17906k3(boolean r5) {
        /*
            r4 = this;
            r4.m17803E3()
            boolean r0 = r4.f11569Q
            r1 = 0
            if (r0 == 0) goto L_0x003f
            android.content.Context r0 = r4.getApplicationContext()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 2131952412(0x7f13031c, float:1.9541266E38)
            java.lang.String r3 = r4.getString(r3)
            r2.append(r3)
            java.lang.String r3 = ": "
            r2.append(r3)
            com.arlosoft.macrodroid.macro.Macro r3 = r4.f11555C
            if (r3 != 0) goto L_0x002a
            java.lang.String r3 = "macro"
            kotlin.jvm.internal.C13706o.m87945v(r3)
            r3 = r1
        L_0x002a:
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            lc.c r0 = p319lc.C15626c.m94876a(r0, r2, r3)
            r0.show()
        L_0x003d:
            r0 = r1
            goto L_0x0049
        L_0x003f:
            boolean r0 = r4.f11563K
            if (r0 == 0) goto L_0x003d
            com.arlosoft.macrodroid.homescreen.NewHomeScreenActivity$a r0 = com.arlosoft.macrodroid.homescreen.NewHomeScreenActivity.f11920O
            android.content.Intent r0 = r0.mo29282a(r4)
        L_0x0049:
            if (r0 == 0) goto L_0x0050
            r2 = 131072(0x20000, float:1.83671E-40)
            r0.addFlags(r2)
        L_0x0050:
            boolean r5 = r4.m17826N4(r5)
            if (r5 == 0) goto L_0x005b
            com.arlosoft.macrodroid.advert.AdvertActivity$a r5 = com.arlosoft.macrodroid.advert.AdvertActivity.f9860D
            r5.mo27271a(r1)
        L_0x005b:
            if (r0 == 0) goto L_0x0060
            r4.startActivity(r0)
        L_0x0060:
            r4.finish()
            p148q0.C8151a.m33870k()
            com.arlosoft.macrodroid.macro.n r5 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.List r5 = r5.mo29710z()
            int r5 = r5.size()
            r0 = 5
            if (r5 < r0) goto L_0x0078
            p148q0.C8151a.m33871l()
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.editscreen.EditMacroActivity.m17906k3(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f6 A[Catch:{ IOException -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ff A[Catch:{ IOException -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: k4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17907k4() {
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
            int r0 = com.arlosoft.macrodroid.C17532R$id.scrollView
            android.view.View r0 = r9.mo28951B2(r0)
            com.arlosoft.macrodroid.widget.LockableScrollView r0 = (com.arlosoft.macrodroid.widget.LockableScrollView) r0
            java.lang.String r1 = "scrollView"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            com.arlosoft.macrodroid.macro.Macro r1 = r9.f11555C
            java.lang.String r2 = "macro"
            r3 = 0
            if (r1 != 0) goto L_0x002a
            kotlin.jvm.internal.C13706o.m87945v(r2)
            r1 = r3
        L_0x002a:
            java.lang.String r1 = r1.getName()
            java.lang.String r4 = "macro.name"
            kotlin.jvm.internal.C13706o.m87928e(r1, r4)
            r5 = 50
            android.graphics.Bitmap r0 = com.arlosoft.macrodroid.utils.C6377e1.m24623a(r0, r1, r5)
            java.io.File r1 = new java.io.File
            java.io.File r5 = r9.getExternalFilesDir(r3)
            java.lang.String r6 = "Export"
            r1.<init>(r5, r6)
            boolean r5 = r1.exists()
            if (r5 != 0) goto L_0x004d
            r1.mkdirs()
        L_0x004d:
            java.io.File r1 = new java.io.File
            x3.a r5 = p190x3.C10378a.f23596a
            com.arlosoft.macrodroid.app.MacroDroidApplication r6 = r5.mo41059a()
            java.io.File r6 = r6.getFilesDir()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.arlosoft.macrodroid.macro.Macro r8 = r9.f11555C
            if (r8 != 0) goto L_0x0066
            kotlin.jvm.internal.C13706o.m87945v(r2)
            r8 = r3
        L_0x0066:
            java.lang.String r2 = r8.getName()
            kotlin.jvm.internal.C13706o.m87928e(r2, r4)
            java.lang.String r2 = r9.m17880c5(r2)
            r7.append(r2)
            java.lang.String r2 = ".png"
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r1.<init>(r6, r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00ed }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00ed }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            r4 = 100
            r0.compress(r3, r4, r2)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            r3.<init>()     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            com.arlosoft.macrodroid.app.MacroDroidApplication r4 = r5.mo41059a()     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            r6.<init>()     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            com.arlosoft.macrodroid.app.MacroDroidApplication r5 = r5.mo41059a()     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            r6.append(r5)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            java.lang.String r5 = ".provider"
            r6.append(r5)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            android.net.Uri r1 = androidx.core.content.FileProvider.getUriForFile(r4, r5, r1)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            r3.add(r1)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            java.lang.String r4 = "android.intent.action.SEND_MULTIPLE"
            r1.<init>(r4)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r4)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            java.lang.String r4 = "image/png"
            r1.setType(r4)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            java.lang.String r4 = "android.intent.extra.STREAM"
            r1.putParcelableArrayListExtra(r4, r3)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            r3 = 2131954276(0x7f130a64, float:1.9545047E38)
            java.lang.String r3 = r9.getString(r3)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            android.content.Intent r1 = android.content.Intent.createChooser(r1, r3)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            r9.startActivity(r1)     // Catch:{ Exception -> 0x00e8, all -> 0x00e5 }
            r0.recycle()     // Catch:{ IOException -> 0x00e0 }
            r2.close()     // Catch:{ IOException -> 0x00e0 }
            goto L_0x00f9
        L_0x00e0:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00f9
        L_0x00e5:
            r1 = move-exception
            r3 = r2
            goto L_0x00fa
        L_0x00e8:
            r1 = move-exception
            r3 = r2
            goto L_0x00ee
        L_0x00eb:
            r1 = move-exception
            goto L_0x00fa
        L_0x00ed:
            r1 = move-exception
        L_0x00ee:
            r1.printStackTrace()     // Catch:{ all -> 0x00eb }
            r0.recycle()     // Catch:{ IOException -> 0x00e0 }
            if (r3 == 0) goto L_0x00f9
            r3.close()     // Catch:{ IOException -> 0x00e0 }
        L_0x00f9:
            return
        L_0x00fa:
            r0.recycle()     // Catch:{ IOException -> 0x0103 }
            if (r3 == 0) goto L_0x0107
            r3.close()     // Catch:{ IOException -> 0x0103 }
            goto L_0x0107
        L_0x0103:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0107:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.editscreen.EditMacroActivity.m17907k4():void");
    }

    /* renamed from: l3 */
    private final void m17909l3() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), C17535R$layout.simple_spinner_item_white_text, C13614t.m87751m(getString(C17541R$string.and), getString(C17541R$string.f7057or)));
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        int i = C17532R$id.constraintAndOrSpinner;
        ((Spinner) mo28951B2(i)).setAdapter(arrayAdapter);
        Spinner spinner = (Spinner) mo28951B2(i);
        C13706o.m87928e(spinner, "constraintAndOrSpinner");
        C4666m.m18145m(spinner, new C4546b(this));
        Spinner spinner2 = (Spinner) mo28951B2(i);
        Macro macro = this.f11555C;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        spinner2.setSelection(macro.isConstraintOrCondition() ? 1 : 0, true);
    }

    /* renamed from: l4 */
    private final void m17910l4() {
        C6422r0 r0Var = C6422r0.f15045a;
        File filesDir = getFilesDir();
        C13706o.m87928e(filesDir, "filesDir");
        Macro macro = this.f11555C;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        File b = r0Var.mo32452b(filesDir, macro, mo28952F3());
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

    /* renamed from: m3 */
    private final void m17912m3() {
        ViewGroup viewGroup = this.f11576X;
        if (viewGroup == null) {
            C13706o.m87945v("varsLayout");
            viewGroup = null;
        }
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(C17532R$id.addVariableButton);
        C13706o.m87928e(imageButton, "varsLayout.addVariableButton");
        C4666m.m18147o(imageButton, (C13640g) null, new C4548c(this, (C13635d<? super C4548c>) null), 1, (Object) null);
        m17818K4();
    }

    /* renamed from: m4 */
    private final void m17913m4() {
        String str = Build.VERSION.SDK_INT < 31 ? "android.permission.ACCESS_FINE_LOCATION" : "android.permission.BLUETOOTH_CONNECT";
        C1624a.f1072f.mo19234c(this).mo19240i(new String[]{str}, new C4580s(str, this));
    }

    /* renamed from: n3 */
    private final void m17915n3(ParentAction parentAction) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Action);
        builder.setTitle((int) C17541R$string.delete);
        builder.setMessage((CharSequence) getString(C17541R$string.delete_condition_or_loop_including_children_confirm));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4619j0(this, parentAction));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C4612g.f11656a);
        builder.show();
    }

    /* renamed from: n4 */
    private final void m17916n4() {
        try {
            Macro macro = this.f11555C;
            if (macro == null) {
                C13706o.m87945v("macro");
                macro = null;
            }
            TriggerContextInfo triggerContextInfo = new TriggerContextInfo(macro.getTriggerList().get(0));
            Macro macro2 = this.f11555C;
            if (macro2 == null) {
                C13706o.m87945v("macro");
                macro2 = null;
            }
            if (macro2.canInvoke(triggerContextInfo, true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("TESTING MACRO: ");
                Macro macro3 = this.f11555C;
                if (macro3 == null) {
                    C13706o.m87945v("macro");
                    macro3 = null;
                }
                sb.append(macro3.getName());
                String sb2 = sb.toString();
                Macro macro4 = this.f11555C;
                if (macro4 == null) {
                    C13706o.m87945v("macro");
                    macro4 = null;
                }
                C4878b.m18874m(sb2, macro4.getGUID());
                Macro macro5 = this.f11555C;
                if (macro5 == null) {
                    C13706o.m87945v("macro");
                    macro5 = null;
                }
                macro5.setTriggerThatInvoked((Trigger) null);
                Macro macro6 = this.f11555C;
                if (macro6 == null) {
                    C13706o.m87945v("macro");
                    macro6 = null;
                }
                macro6.invokeActions(triggerContextInfo, true);
            }
        } catch (Exception unused) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle((int) C17541R$string.macro_test_failed);
            builder.setMessage((int) C17541R$string.macro_cannot_be_run_without_trigger);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) null);
            builder.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public static final void m17918o3(EditMacroActivity editMacroActivity, ParentAction parentAction, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(editMacroActivity, "this$0");
        C13706o.m87929f(parentAction, "$action");
        Macro macro = editMacroActivity.f11555C;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        macro.removeItemAndChildren(parentAction);
        editMacroActivity.f11556D = null;
        editMacroActivity.f11564L = true;
        m17793A4(editMacroActivity, false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: o4 */
    public final boolean m17919o4(int i, int i2, String str) {
        ActionBlock actionBlock = new ActionBlock();
        actionBlock.setName(str);
        Macro macro = null;
        if (i <= i2) {
            int i3 = i;
            while (true) {
                Macro macro2 = this.f11555C;
                if (macro2 == null) {
                    C13706o.m87945v("macro");
                    macro2 = null;
                }
                actionBlock.addAction(macro2.getActions().get(i3));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        if (Action.m9593S2(actionBlock.getActions()) >= 0) {
            return false;
        }
        mo28952F3().mo29647e(actionBlock);
        if (i <= i2) {
            while (true) {
                Macro macro3 = this.f11555C;
                if (macro3 == null) {
                    C13706o.m87945v("macro");
                    macro3 = null;
                }
                macro3.getActions().remove(i2);
                if (i2 == i) {
                    break;
                }
                i2--;
            }
        }
        ActionBlockAction actionBlockAction = new ActionBlockAction();
        actionBlockAction.mo24710D3(str);
        actionBlockAction.mo24709C3(actionBlock.getGUID());
        Macro macro4 = this.f11555C;
        if (macro4 == null) {
            C13706o.m87945v("macro");
            macro4 = null;
        }
        macro4.getActions().add(i, actionBlockAction);
        C4934n M = C4934n.m18998M();
        Macro macro5 = this.f11555C;
        if (macro5 == null) {
            C13706o.m87945v("macro");
        } else {
            macro = macro5;
        }
        M.mo29695o0(macro);
        Context applicationContext = getApplicationContext();
        C13696i0 i0Var = C13696i0.f61931a;
        String string = getString(C17541R$string.action_block_created_popup_with_name);
        C13706o.m87928e(string, "getString(R.string.actio…_created_popup_with_name)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        C13706o.m87928e(format, "format(format, *args)");
        C15626c.m94876a(applicationContext, format, 1).show();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m17921p3(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* renamed from: p4 */
    private final boolean m17922p4(int i, List<? extends Constraint> list) {
        if (i == 10) {
            return true;
        }
        for (Constraint constraint : list) {
            Macro macro = this.f11555C;
            if (macro == null) {
                C13706o.m87945v("macro");
                macro = null;
            }
            constraint.mo24687G2(macro);
            if (constraint instanceof LogicConstraint) {
                List<Constraint> J0 = constraint.mo27826J0();
                C13706o.m87928e(J0, "childConstraint.getConstraints()");
                if (m17922p4(i + 1, J0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: q3 */
    private final void m17924q3(ParentAction parentAction) {
        Macro macro = this.f11555C;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        ArrayList<Action> actions = macro.getActions();
        int indexOf = actions.indexOf(parentAction);
        int i = 0;
        if (parentAction instanceof IfConditionAction) {
            i = C6416p0.m24705b(actions, indexOf);
        } else if (parentAction instanceof LoopAction) {
            i = C6416p0.m24706c(actions, indexOf);
        }
        C16788e eVar = new C16788e(indexOf, i);
        ArrayList arrayList = new ArrayList(C13616u.m87774u(eVar, 10));
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(actions.get(((C13603n0) it).nextInt()));
        }
        C6421r.m24727h(arrayList);
    }

    /* renamed from: q4 */
    private final void m17925q4() {
        int size = C4934n.m18998M().mo29710z().size();
        int f0 = C5163j2.m20151f0(this);
        if (mo28954I3().mo28009e().mo28008a() || size < f0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle((int) C17541R$string.clone_macro);
            builder.setMessage((int) C17541R$string.do_you_wish_to_clone);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4600a(this));
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C4610f.f11654a);
            builder.show();
            return;
        }
        C4061t1.m15957G0(this, mo28955J3());
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public final void m17927r3() {
        C6520o0.m24897U(this, mo28954I3().mo28009e().mo28008a(), true, C17542R$style.Theme_App_Dialog_LocalVariables, false, false, C17535R$layout.simple_spinner_dropdown_item_2_lines_white_text, "#DDDDDD", false, (Macro) null, (Integer) null, new C4550d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: r4 */
    public static final void m17928r4(EditMacroActivity editMacroActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(editMacroActivity, "this$0");
        Macro macro = editMacroActivity.f11555C;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        Macro cloneMacro = macro.cloneMacro(true, true);
        editMacroActivity.m17803E3();
        Intent intent = new Intent(editMacroActivity, EditMacroActivity.class);
        intent.putExtra("MacroId", cloneMacro.getId());
        intent.putExtra("IsClone", true);
        editMacroActivity.startActivity(intent);
        editMacroActivity.finish();
    }

    /* renamed from: s3 */
    private final void m17930s3() {
        View inflate = getLayoutInflater().inflate(C17535R$layout.include_variables, (ViewGroup) null);
        C13706o.m87927d(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f11576X = (ViewGroup) inflate;
        BottomSheetBehavior<View> y = BottomSheetBehavior.m67638y(mo28951B2(C17532R$id.bottomBar));
        C13706o.m87928e(y, "from(bottomBar)");
        this.f11571S = y;
        m17823M4();
        ViewGroup viewGroup = this.f11576X;
        if (viewGroup == null) {
            C13706o.m87945v("varsLayout");
            viewGroup = null;
        }
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(C17532R$id.varTitleLayout);
        C13706o.m87928e(frameLayout, "varsLayout.varTitleLayout");
        C4666m.m18152t(frameLayout, (C13640g) null, false, new C4552e(this, (C13635d<? super C4552e>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public static final void m17931s4(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* renamed from: t3 */
    private final void m17933t3(boolean z) {
        setResult(0, new Intent());
        C4934n M = C4934n.m18998M();
        Macro macro = this.f11555C;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        M.mo29692k0(macro, false);
        Macro macro2 = this.f11582d0;
        if (macro2 != null) {
            C4934n.m18998M().mo29703t(macro2, true, macro2.isEnabled());
        }
        m17803E3();
        m17800D3(z);
    }

    /* renamed from: t4 */
    private final void m17934t4() {
        Macro macro = this.f11555C;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        String a = C6437u.m24740a(this, macro);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.delete_macro);
        builder.setMessage((CharSequence) a + getString(C17541R$string.are_you_sure_delete_macro));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4607d0(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C4618j.f11668a);
        builder.show();
    }

    /* renamed from: u3 */
    static /* synthetic */ void m17936u3(EditMacroActivity editMacroActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        editMacroActivity.m17933t3(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public static final void m17937u4(EditMacroActivity editMacroActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(editMacroActivity, "this$0");
        StringBuilder sb = new StringBuilder();
        sb.append("Macro Deleted - ");
        Macro macro = editMacroActivity.f11555C;
        Macro macro2 = null;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        sb.append(macro.getName());
        String sb2 = sb.toString();
        Macro macro3 = editMacroActivity.f11555C;
        if (macro3 == null) {
            C13706o.m87945v("macro");
            macro3 = null;
        }
        C4878b.m18874m(sb2, macro3.getGUID());
        C4934n M = C4934n.m18998M();
        Macro macro4 = editMacroActivity.f11555C;
        if (macro4 == null) {
            C13706o.m87945v("macro");
        } else {
            macro2 = macro4;
        }
        M.mo29692k0(macro2, true);
        editMacroActivity.m17803E3();
        AutoBackupCloudWorker.C3873a.m15060c(AutoBackupCloudWorker.f10017c, editMacroActivity, 0, 2, (Object) null);
        editMacroActivity.finish();
    }

    /* renamed from: v3 */
    private final void m17939v3(boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        C17435a.m101225c(builder, C17541R$string.add_macro);
        C17435a.m101223a(builder, C17541R$string.import_macro_needs_additional_configuration);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4558h(this, z));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C4556g());
        AlertDialog create = builder.create();
        C13706o.m87928e(create, "AlertDialog.Builder(this…Config)\n        .create()");
        create.setOnShowListener(new C4554f(create));
        create.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: v4 */
    public static final void m17940v4(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* renamed from: w3 */
    private final void m17942w3(SelectableItem selectableItem, String str, boolean z) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, m17808G3(selectableItem));
        appCompatDialog.setContentView((int) C17535R$layout.dialog_comment);
        appCompatDialog.setTitle((CharSequence) str);
        C4656c.m18114c(appCompatDialog, getResources().getDimensionPixelOffset(C17529R$dimen.margin_medium));
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        ImageButton imageButton = (ImageButton) appCompatDialog.findViewById(C17532R$id.clear_button);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.enter_comment_text);
        if (editText != null) {
            SelectableItem selectableItem2 = this.f11556D;
            editText.setText(selectableItem2 != null ? selectableItem2.mo27820F0() : null);
        }
        if (editText != null) {
            C4666m.m18154v(editText);
        }
        if (z && imageButton != null) {
            imageButton.setVisibility(8);
        }
        if (imageButton != null) {
            imageButton.setOnClickListener(new C4620k(editText));
        }
        if (button != null) {
            button.setOnClickListener(new C4640t(this, appCompatDialog, editText));
        }
        if (button2 != null) {
            button2.setOnClickListener(new C4626n(appCompatDialog));
        }
        appCompatDialog.show();
        Window window = appCompatDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    /* renamed from: w4 */
    private final void m17943w4() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog);
        appCompatDialog.setContentView((int) C17535R$layout.enter_category);
        appCompatDialog.setTitle((int) C17541R$string.new_category);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        layoutParams.copyFrom(window != null ? window.getAttributes() : null);
        if (!getResources().getBoolean(C17527R$bool.is_tablet)) {
            layoutParams.width = -1;
        }
        Window window2 = appCompatDialog.getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.enter_category_text);
        if (editText != null) {
            C4666m.m18138f(editText, new C4583t(button, editText, this));
        }
        if (button != null) {
            button.setOnClickListener(new C4636r(this, editText, appCompatDialog));
        }
        if (button2 != null) {
            button2.setOnClickListener(new C4624m(appCompatDialog));
        }
        appCompatDialog.show();
        if (editText != null) {
            C4666m.m18141i(editText);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m17945x3(EditText editText, View view) {
        if (editText != null) {
            editText.setText("");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x4 */
    public static final void m17946x4(EditMacroActivity editMacroActivity, EditText editText, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(editMacroActivity, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        Macro macro = editMacroActivity.f11555C;
        Editable editable = null;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        if (editText != null) {
            editable = editText.getText();
        }
        macro.setCategory(String.valueOf(editable));
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static final void m17948y3(EditMacroActivity editMacroActivity, AppCompatDialog appCompatDialog, EditText editText, View view) {
        C13706o.m87929f(editMacroActivity, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        editMacroActivity.m17903j3(appCompatDialog, editText);
    }

    /* access modifiers changed from: private */
    /* renamed from: y4 */
    public static final void m17949y4(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static final void m17951z3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: B2 */
    public View mo28951B2(int i) {
        Map<Integer, View> map = this.f11587i0;
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

    /* renamed from: C0 */
    public void mo27137C0(Object obj) {
        C13706o.m87929f(obj, "obj");
        SelectableItem selectableItem = this.f11556D;
        if (selectableItem != null) {
            selectableItem.mo25307s1(obj);
        }
    }

    /* renamed from: F3 */
    public final C4915a mo28952F3() {
        C4915a aVar = this.f11553A;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("actionBlockStore");
        return null;
    }

    /* renamed from: H3 */
    public final C7366i mo28953H3() {
        C7366i iVar = this.f11554B;
        if (iVar != null) {
            return iVar;
        }
        C13706o.m87945v("nearbyHelper");
        return null;
    }

    /* renamed from: I3 */
    public final C4083b mo28954I3() {
        C4083b bVar = this.f11588s;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("premiumStatusHandler");
        return null;
    }

    /* renamed from: J3 */
    public final C5070a mo28955J3() {
        C5070a aVar = this.f11589z;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("remoteConfig");
        return null;
    }

    /* renamed from: M3 */
    public final void mo28956M3() {
        if (this.f11581c0 != null) {
            Macro macro = this.f11555C;
            if (macro == null) {
                C13706o.m87945v("macro");
                macro = null;
            }
            macro.removeItem(this.f11581c0);
            this.f11581c0 = null;
            mo28962z4(true);
        }
    }

    /* renamed from: R3 */
    public final boolean mo28957R3() {
        return this.f11556D instanceof ConditionAction;
    }

    /* renamed from: T3 */
    public final void mo28958T3(boolean z) {
        int size = C4934n.m18998M().mo29710z().size();
        int f0 = C5163j2.m20151f0(this);
        Macro macro = this.f11555C;
        Macro macro2 = null;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        if (!macro.isCompleted()) {
            f0--;
        }
        if (this.f11562J && ((EditText) mo28951B2(C17532R$id.macroNameText)).length() == 0) {
            Macro macro3 = this.f11555C;
            if (macro3 == null) {
                C13706o.m87945v("macro");
                macro3 = null;
            }
            if (macro3.getActions().size() == 0) {
                Macro macro4 = this.f11555C;
                if (macro4 == null) {
                    C13706o.m87945v("macro");
                    macro4 = null;
                }
                if (macro4.getTriggerList().size() == 0) {
                    Macro macro5 = this.f11555C;
                    if (macro5 == null) {
                        C13706o.m87945v("macro");
                        macro5 = null;
                    }
                    if (macro5.getConstraints().size() == 0) {
                        Macro macro6 = this.f11555C;
                        if (macro6 == null) {
                            C13706o.m87945v("macro");
                            macro6 = null;
                        }
                        if (macro6.getLocalVariables().size() == 0) {
                            m17933t3(z);
                            return;
                        }
                    }
                }
            }
        }
        if ((this.f11569Q || this.f11563K) && !this.f11564L && !this.f11565M) {
            m17933t3(z);
            return;
        }
        int i = C17532R$id.macroNameText;
        if (((EditText) mo28951B2(i)).length() == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog);
            builder.setTitle((int) C17541R$string.invalid_macro);
            builder.setMessage((int) C17541R$string.please_set_a_macro_name);
            builder.setPositiveButton(17039360, (DialogInterface.OnClickListener) C4608e.f11652a);
            builder.setNeutralButton((int) C17541R$string.discard, (DialogInterface.OnClickListener) new C4646w(this));
            builder.show();
        } else if (m17794B3(((EditText) mo28951B2(i)).getText().toString())) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog);
            builder2.setTitle((int) C17541R$string.invalid_macro);
            builder2.setMessage((int) C17541R$string.macro_name_already_exists);
            builder2.setPositiveButton(17039360, (DialogInterface.OnClickListener) C4616i.f11665a);
            builder2.setNeutralButton((int) C17541R$string.discard, (DialogInterface.OnClickListener) new C4622l(this));
            builder2.show();
        } else {
            Macro macro7 = this.f11555C;
            if (macro7 == null) {
                C13706o.m87945v("macro");
                macro7 = null;
            }
            if (macro7.isCompleted() || this.f11562J || this.f11567O || this.f11569Q) {
                Macro macro8 = this.f11555C;
                if (macro8 == null) {
                    C13706o.m87945v("macro");
                    macro8 = null;
                }
                if (!macro8.isValid() || ((EditText) mo28951B2(i)).length() == 0) {
                    AlertDialog.Builder builder3 = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog);
                    builder3.setTitle((int) C17541R$string.invalid_macro);
                    builder3.setMessage((int) C17541R$string.do_you_wish_to_save_changes);
                    builder3.setPositiveButton((int) C17541R$string.save, (DialogInterface.OnClickListener) new C4615h0(this, size, f0, z));
                    builder3.setNeutralButton(17039360, (DialogInterface.OnClickListener) C4614h.f11660a);
                    builder3.setNegativeButton((int) C17541R$string.discard, (DialogInterface.OnClickListener) new C4611f0(this));
                    builder3.show();
                    return;
                }
            }
            Intent intent = new Intent();
            if (this.f11564L) {
                AlertDialog.Builder builder4 = new AlertDialog.Builder(this);
                builder4.setTitle((int) C17541R$string.save_changes);
                builder4.setMessage((int) C17541R$string.do_you_wish_to_save_changes);
                builder4.setPositiveButton((int) C17541R$string.save, (DialogInterface.OnClickListener) new C4613g0(this, size, f0));
                builder4.setNegativeButton((int) C17541R$string.discard, (DialogInterface.OnClickListener) new C4602b(this, z));
                builder4.show();
                return;
            }
            if (this.f11573U || this.f11574V) {
                C4934n M = C4934n.m18998M();
                Macro macro9 = this.f11555C;
                if (macro9 == null) {
                    C13706o.m87945v("macro");
                    macro9 = null;
                }
                M.mo29695o0(macro9);
            }
            Macro macro10 = this.f11555C;
            if (macro10 == null) {
                C13706o.m87945v("macro");
            } else {
                macro2 = macro10;
            }
            macro2.onEditScreenClosed();
            setResult(0, intent);
            m17803E3();
            m17800D3(z);
        }
    }

    /* renamed from: U4 */
    public final void mo28959U4() {
        this.f11564L = true;
        m17884d5();
    }

    /* renamed from: W0 */
    public void mo27140W0() {
        SelectableItem selectableItem = this.f11556D;
        if (selectableItem != null) {
            selectableItem.mo27864r1();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 909091:
            case 909092:
            case 909093:
                if (i2 == -1) {
                    this.f11564L = true;
                    return;
                }
                return;
            default:
                Macro macro = this.f11555C;
                Macro macro2 = null;
                if (macro == null) {
                    C13706o.m87945v("macro");
                    macro = null;
                }
                if (macro.getActionBeingConfigured() != null) {
                    Macro macro3 = this.f11555C;
                    if (macro3 == null) {
                        C13706o.m87945v("macro");
                    } else {
                        macro2 = macro3;
                    }
                    macro2.getActionBeingConfigured().mo24713q1(this, i, i2, intent);
                    return;
                }
                SelectableItem selectableItem = this.f11556D;
                if (selectableItem != null) {
                    selectableItem.mo24713q1(this, i, i2, intent);
                    return;
                }
                return;
        }
    }

    public void onBackPressed() {
        mo28958T3(false);
    }

    public void onCreate(Bundle bundle) {
        InputStream inputStream;
        String str;
        Macro macro;
        String str2;
        Bundle bundle2 = bundle;
        T t = "";
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_edit_macro);
        this.f11562J = getIntent().getBooleanExtra("adding_new_macro", false);
        this.f11568P = C5163j2.m20026O(this);
        this.f11569Q = getIntent().getBooleanExtra("is_template", false);
        this.f11570R = getIntent().getBooleanExtra("new_template_store", false);
        this.f11578Z = getResources().getDimensionPixelOffset(C17529R$dimen.local_var_bottom_bar_height);
        if (bundle2 != null) {
            this.f11556D = (SelectableItem) bundle2.getParcelable("selectable_item");
        }
        Intent intent = getIntent();
        if (C13706o.m87924a(intent.getAction(), "android.intent.action.VIEW")) {
            this.f11580b0 = true;
        }
        m17930s3();
        Macro macro2 = null;
        if (intent.getAction() == null || !C13706o.m87924a(intent.getAction(), "android.intent.action.VIEW") || intent.getData() != null) {
            int i = -1;
            if (intent.getAction() == null || !C13706o.m87924a(intent.getAction(), "android.intent.action.VIEW") || intent.getData() == null) {
                if (bundle2 != null) {
                    this.f11557E = bundle2.getInt("MacroId");
                    this.f11564L = bundle2.getBoolean("HasEdited");
                    this.f11567O = bundle2.getBoolean("IsClone");
                } else {
                    this.f11564L = false;
                    this.f11567O = getIntent().getBooleanExtra("IsClone", false);
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        i = extras.getInt("MacroId", -1);
                    }
                    this.f11557E = i;
                }
                Macro R = C4934n.m18998M().mo29683R(this.f11557E);
                if (R == null) {
                    finish();
                    return;
                }
                this.f11555C = R;
                if (R.isCompleted()) {
                    setTitle(C17541R$string.edit_macro);
                } else if (!this.f11562J) {
                    setTitle(this.f11567O ? C17541R$string.clone_macro : C17541R$string.view_template);
                } else {
                    setTitle(C17541R$string.add_macro);
                }
            } else {
                Uri data = getIntent().getData();
                C13706o.m87926c(data);
                String scheme = data.getScheme();
                Set<String> queryParameterNames = data.getQueryParameterNames();
                if (C13706o.m87924a(scheme, "macrodroid")) {
                    List<String> pathSegments = data.getPathSegments();
                    C13706o.m87928e(pathSegments, "uri!!.pathSegments");
                    String str3 = (String) C13566b0.m87434i0(pathSegments);
                    List<Macro> C = C4934n.m18998M().mo29673C();
                    try {
                        str = URLDecoder.decode(str3);
                    } catch (Exception unused) {
                        str = str3;
                    }
                    if (queryParameterNames.contains("showtoast")) {
                        C12408a.C12409a.m83286b().mo68758c(-1).mo68759d(false).mo68757a();
                        C12408a.m83283q(this, getString(C17541R$string.edit_macro) + ": " + str, C17530R$drawable.launcher_no_border, ViewCompat.MEASURED_STATE_MASK, 1, false, true).show();
                    }
                    Iterator<Macro> it = C.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            macro = null;
                            break;
                        }
                        macro = it.next();
                        try {
                            str2 = URLDecoder.decode(macro.getName());
                        } catch (Exception unused2) {
                            str2 = str3;
                        }
                        if (C13706o.m87924a(str2, str)) {
                            if (macro.isActionBlock) {
                                ActionBlockEditActivity.C3674a aVar = ActionBlockEditActivity.f9722X;
                                C13706o.m87927d(macro, "null cannot be cast to non-null type com.arlosoft.macrodroid.actionblock.data.ActionBlock");
                                startActivity(aVar.mo27148a(this, true, (ActionBlock) macro, false));
                                finish();
                                return;
                            }
                            this.f11557E = macro.getId();
                        }
                    }
                    if (macro == null) {
                        C15626c.m94876a(getApplicationContext(), str3 + ' ' + getString(C17541R$string.macro_not_found), 0).show();
                        finish();
                        return;
                    }
                    this.f11555C = macro;
                    setTitle(C17541R$string.edit_macro);
                } else {
                    if (C13706o.m87924a("content", scheme)) {
                        try {
                            inputStream = getContentResolver().openInputStream(data);
                        } catch (Exception e) {
                            C15626c.m94876a(getApplicationContext(), "The selected file could not be imported into MacroDroid", 1).show();
                            FirebaseCrashlytics.m6487a().mo22936d(new RuntimeException("Failed to import macro from input stream: " + e.getMessage()));
                            finish();
                            return;
                        }
                    } else {
                        try {
                            inputStream = new FileInputStream(data.getPath());
                        } catch (Exception e2) {
                            C15626c.m94876a(getApplicationContext(), "The selected file could not be imported into MacroDroid", 1).show();
                            FirebaseCrashlytics.m6487a().mo22936d(new RuntimeException("Failed to import macro from file: " + e2.getMessage()));
                            finish();
                            return;
                        }
                    }
                    C13684d0 d0Var = new C13684d0();
                    try {
                        d0Var.element = new BufferedReader(new InputStreamReader(inputStream));
                        C13684d0 d0Var2 = new C13684d0();
                        d0Var2.element = t;
                        while (m17883d4(d0Var2, d0Var) != null) {
                            t = t + ((String) d0Var2.element);
                        }
                        Object j = C10283c.m40413c().mo64006e(Macro.class, new C4921g(getApplicationContext(), true, true, true)).mo64006e(ActionBlock.class, new C4921g(getApplicationContext(), true, true, true)).mo64004c().mo63976j(t, Macro.class);
                        C13706o.m87928e(j, "gson.fromJson(json, Macro::class.java)");
                        this.f11555C = (Macro) j;
                        C4915a F3 = mo28952F3();
                        Macro macro3 = this.f11555C;
                        if (macro3 == null) {
                            C13706o.m87945v("macro");
                            macro3 = null;
                        }
                        Macro macro4 = this.f11555C;
                        if (macro4 == null) {
                            C13706o.m87945v("macro");
                            macro4 = null;
                        }
                        List<ActionBlock> actionBlocksToImport = macro4.getActionBlocksToImport();
                        C13706o.m87928e(actionBlocksToImport, "macro.actionBlocksToImport");
                        C8056a.m33601a(F3, macro3, actionBlocksToImport, true);
                        Macro macro5 = this.f11555C;
                        if (macro5 == null) {
                            C13706o.m87945v("macro");
                            macro5 = null;
                        }
                        macro5.setNewRandomGUID();
                        Macro macro6 = this.f11555C;
                        if (macro6 == null) {
                            C13706o.m87945v("macro");
                            macro6 = null;
                        }
                        macro6.setCompleted(false);
                        Macro macro7 = this.f11555C;
                        if (macro7 == null) {
                            C13706o.m87945v("macro");
                            macro7 = null;
                        }
                        m17890f3(macro7);
                        this.f11562J = true;
                        this.f11563K = true;
                        C4934n M = C4934n.m18998M();
                        Macro macro8 = this.f11555C;
                        if (macro8 == null) {
                            C13706o.m87945v("macro");
                            macro8 = null;
                        }
                        M.mo29701s(macro8, false);
                        Macro macro9 = this.f11555C;
                        if (macro9 == null) {
                            C13706o.m87945v("macro");
                            macro9 = null;
                        }
                        this.f11557E = macro9.getId();
                        if (inputStream != null) {
                            inputStream.close();
                            C13339u uVar = C13339u.f61331a;
                        }
                        BufferedReader bufferedReader = (BufferedReader) d0Var.element;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                            C13339u uVar2 = C13339u.f61331a;
                        }
                        setTitle(C17541R$string.import_macro);
                    } catch (Exception e3) {
                        C15626c.m94876a(getApplicationContext(), "The selected file could not be imported into MacroDroid", 1).show();
                        FirebaseCrashlytics.m6487a().mo22936d(new RuntimeException("Failed to import macro: " + e3.getMessage()));
                        finish();
                        if (inputStream != null) {
                            inputStream.close();
                            C13339u uVar3 = C13339u.f61331a;
                        }
                        BufferedReader bufferedReader2 = (BufferedReader) d0Var.element;
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                            C13339u uVar4 = C13339u.f61331a;
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            inputStream.close();
                            C13339u uVar5 = C13339u.f61331a;
                        }
                        BufferedReader bufferedReader3 = (BufferedReader) d0Var.element;
                        if (bufferedReader3 != null) {
                            bufferedReader3.close();
                            C13339u uVar6 = C13339u.f61331a;
                        }
                        throw th;
                    }
                }
            }
        } else {
            Macro macro10 = new Macro();
            this.f11555C = macro10;
            this.f11557E = macro10.getId();
            Macro macro11 = this.f11555C;
            if (macro11 == null) {
                C13706o.m87945v("macro");
                macro11 = null;
            }
            macro11.setCompleted(false);
            this.f11562J = true;
            C4934n M2 = C4934n.m18998M();
            Macro macro12 = this.f11555C;
            if (macro12 == null) {
                C13706o.m87945v("macro");
                macro12 = null;
            }
            M2.mo29699r(macro12);
        }
        if (!this.f11562J && !this.f11569Q) {
            Macro macro13 = this.f11555C;
            if (macro13 == null) {
                C13706o.m87945v("macro");
                macro13 = null;
            }
            this.f11582d0 = macro13.createExactClone();
        }
        Macro macro14 = this.f11555C;
        if (macro14 == null) {
            C13706o.m87945v("macro");
            macro14 = null;
        }
        if (macro14.isDescriptionOpen() || this.f11569Q) {
            ((ExpandableLayout) mo28951B2(C17532R$id.descriptionExpandable)).mo75516f(false);
        } else {
            ((ExpandableLayout) mo28951B2(C17532R$id.descriptionExpandable)).mo75514d(false);
        }
        ((ExpandableLayout) mo28951B2(C17532R$id.descriptionExpandable)).setOnExpansionUpdateListener(new C4603b0(this));
        setSupportActionBar((Toolbar) mo28951B2(C17532R$id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
            C13339u uVar7 = C13339u.f61331a;
        }
        ImageButton imageButton = (ImageButton) mo28951B2(C17532R$id.actionBack);
        C13706o.m87928e(imageButton, "actionBack");
        C4666m.m18147o(imageButton, (C13640g) null, new C4574p(this, (C13635d<? super C4574p>) null), 1, (Object) null);
        m17900i3();
        ((FloatingActionButton) mo28951B2(C17532R$id.acceptButton)).setOnClickListener(new C4628o(this));
        ((SelectableItemsRecyclerView) mo28951B2(C17532R$id.actionsList)).addItemDecoration(new C4007e1(getApplicationContext(), C17530R$drawable.line_divider_edit_macro));
        ((SelectableItemsRecyclerView) mo28951B2(C17532R$id.triggersList)).addItemDecoration(new C4007e1(getApplicationContext(), C17530R$drawable.line_divider_edit_macro));
        ((SelectableItemsRecyclerView) mo28951B2(C17532R$id.constraintsList)).addItemDecoration(new C4007e1(getApplicationContext(), C17530R$drawable.line_divider_edit_macro));
        m17909l3();
        int i2 = C17532R$id.macroNameText;
        ((EditText) mo28951B2(i2)).setInputType(540673);
        EditText editText = (EditText) mo28951B2(i2);
        Macro macro15 = this.f11555C;
        if (macro15 == null) {
            C13706o.m87945v("macro");
            macro15 = null;
        }
        editText.setText(macro15.getName());
        ((EditText) mo28951B2(i2)).setOnTouchListener(new C4644v(this));
        EditText editText2 = (EditText) mo28951B2(i2);
        C13706o.m87928e(editText2, "macroNameText");
        C4666m.m18138f(editText2, new C4576q(this));
        C16164b.m97063c(this, new C4605c0(this));
        Macro macro16 = this.f11555C;
        if (macro16 == null) {
            C13706o.m87945v("macro");
            macro16 = null;
        }
        String description = macro16.getDescription();
        if (!(description == null || description.length() == 0)) {
            int i3 = C17532R$id.macroDescription;
            AppCompatEditText appCompatEditText = (AppCompatEditText) mo28951B2(i3);
            Macro macro17 = this.f11555C;
            if (macro17 == null) {
                C13706o.m87945v("macro");
                macro17 = null;
            }
            appCompatEditText.setText(macro17.getDescription());
            ((AppCompatEditText) mo28951B2(i3)).setCursorVisible(false);
        }
        int i4 = C17532R$id.macroDescription;
        ((AppCompatEditText) mo28951B2(i4)).setOnTouchListener(new C4642u(this));
        AppCompatEditText appCompatEditText2 = (AppCompatEditText) mo28951B2(i4);
        C13706o.m87928e(appCompatEditText2, "macroDescription");
        C4666m.m18138f(appCompatEditText2, new C4578r(this));
        ((LockableScrollView) mo28951B2(C17532R$id.scrollView)).smoothScrollTo(0, 0);
        Macro macro18 = this.f11555C;
        if (macro18 == null) {
            C13706o.m87945v("macro");
            macro18 = null;
        }
        Iterator<Action> it2 = macro18.getActions().iterator();
        while (it2.hasNext()) {
            it2.next().mo24697X2();
        }
        m17845T4();
        ImageButton imageButton2 = (ImageButton) mo28951B2(C17532R$id.pasteTriggerButton);
        C13706o.m87928e(imageButton2, "pasteTriggerButton");
        C4666m.m18147o(imageButton2, (C13640g) null, new C4564k(this, (C13635d<? super C4564k>) null), 1, (Object) null);
        ImageButton imageButton3 = (ImageButton) mo28951B2(C17532R$id.pasteActionButton);
        C13706o.m87928e(imageButton3, "pasteActionButton");
        C4666m.m18147o(imageButton3, (C13640g) null, new C4566l(this, (C13635d<? super C4566l>) null), 1, (Object) null);
        ImageButton imageButton4 = (ImageButton) mo28951B2(C17532R$id.pasteConstraintButton);
        C13706o.m87928e(imageButton4, "pasteConstraintButton");
        C4666m.m18147o(imageButton4, (C13640g) null, new C4568m(this, (C13635d<? super C4568m>) null), 1, (Object) null);
        m17834Q3();
        Macro macro19 = this.f11555C;
        if (macro19 == null) {
            C13706o.m87945v("macro");
            macro19 = null;
        }
        macro19.addLocalVariableUpdatedListener(this.f11585g0);
        BottomSheetBehavior<View> bottomSheetBehavior = this.f11571S;
        if (bottomSheetBehavior == null) {
            C13706o.m87945v("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.mo56938L(new C4570n(this));
        ViewGroup viewGroup = this.f11576X;
        if (viewGroup == null) {
            C13706o.m87945v("varsLayout");
            viewGroup = null;
        }
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(C17532R$id.varTitleLayout);
        C13706o.m87928e(frameLayout, "varsLayout.varTitleLayout");
        C4666m.m18147o(frameLayout, (C13640g) null, new C4572o(this, (C13635d<? super C4572o>) null), 1, (Object) null);
        Macro macro20 = this.f11555C;
        if (macro20 == null) {
            C13706o.m87945v("macro");
        } else {
            macro2 = macro20;
        }
        C5163j2.m20219n4(this, macro2.getGUID());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C13706o.m87929f(menu, "menu");
        getMenuInflater().inflate(C17536R$menu.edit_macros_menu, menu);
        m17884d5();
        if (this.f11569Q) {
            menu.findItem(C17532R$id.menu_enable_disable_macro).setVisible(false);
            menu.findItem(C17532R$id.menu_variables).setVisible(false);
            menu.findItem(C17532R$id.add_disabled).setVisible(true);
        }
        MenuItem findItem = menu.findItem(C17532R$id.menu_allow_logging);
        Macro macro = this.f11555C;
        Macro macro2 = null;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        findItem.setChecked(!macro.isExcludedFromLog());
        MenuItem findItem2 = menu.findItem(C17532R$id.menu_local_variables_display_mode);
        C13706o.m87928e(findItem2, "menu.findItem(R.id.menu_…l_variables_display_mode)");
        this.f11579a0 = findItem2;
        MenuInflater menuInflater = getMenuInflater();
        MenuItem menuItem = this.f11579a0;
        if (menuItem == null) {
            C13706o.m87945v("localVarsMenuItem");
            menuItem = null;
        }
        menuInflater.inflate(C17536R$menu.local_vars_display_mode_menu, menuItem.getSubMenu());
        m17813I4();
        if (!this.f11564L) {
            menu.findItem(C17532R$id.menu_save_changes).setVisible(false);
        }
        Macro macro3 = this.f11555C;
        if (macro3 == null) {
            C13706o.m87945v("macro");
            macro3 = null;
        }
        if (!macro3.isCompleted()) {
            menu.findItem(C17532R$id.menu_delete).setVisible(false);
            menu.findItem(C17532R$id.menu_copy).setVisible(false);
            menu.findItem(C17532R$id.menu_share).setVisible(false);
            menu.findItem(C17532R$id.menu_share_as_image).setVisible(false);
        }
        Macro macro4 = this.f11555C;
        if (macro4 == null) {
            C13706o.m87945v("macro");
        } else {
            macro2 = macro4;
        }
        if (!macro2.isEnabled()) {
            menu.findItem(C17532R$id.menu_enable_disable_macro).setTitle(C17541R$string.action_disable_macro_enable);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Macro macro = null;
        this.f11556D = null;
        Macro macro2 = this.f11555C;
        if (macro2 != null) {
            if (macro2 == null) {
                C13706o.m87945v("macro");
            } else {
                macro = macro2;
            }
            macro.removeLocalVariableUpdatedListener(this.f11585g0);
        }
    }

    public final void onEventMainThread(MacroDeletedEvent macroDeletedEvent) {
        C13706o.m87929f(macroDeletedEvent, NotificationCompat.CATEGORY_EVENT);
        long j = macroDeletedEvent.f11749a;
        Macro macro = this.f11555C;
        if (macro == null) {
            C13706o.m87945v("macro");
            macro = null;
        }
        if (j == macro.getGUID()) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        C13706o.m87929f(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        Macro macro = null;
        switch (menuItem.getItemId()) {
            case 16908332:
                mo28958T3(true);
                break;
            case C17532R$id.add_disabled:
                m17820L3(true);
                break;
            case C17532R$id.menu_allow_logging:
                Macro macro2 = this.f11555C;
                if (macro2 == null) {
                    C13706o.m87945v("macro");
                    macro2 = null;
                }
                Macro macro3 = this.f11555C;
                if (macro3 == null) {
                    C13706o.m87945v("macro");
                    macro3 = null;
                }
                macro2.setExcludeFromLog(!macro3.isExcludedFromLog());
                Macro macro4 = this.f11555C;
                if (macro4 == null) {
                    C13706o.m87945v("macro");
                } else {
                    macro = macro4;
                }
                menuItem.setChecked(!macro.isExcludedFromLog());
                break;
            case C17532R$id.menu_bottom_bar:
                C5163j2.m20275u4(this, 2);
                m17823M4();
                m17813I4();
                break;
            case C17532R$id.menu_copy:
                m17925q4();
                break;
            case C17532R$id.menu_delete:
                m17934t4();
                break;
            case C17532R$id.menu_enable_disable_macro:
                Macro macro5 = this.f11555C;
                if (macro5 == null) {
                    C13706o.m87945v("macro");
                    macro5 = null;
                }
                Macro macro6 = this.f11555C;
                if (macro6 == null) {
                    C13706o.m87945v("macro");
                } else {
                    macro = macro6;
                }
                macro5.setEnabled(!macro.isEnabled());
                this.f11573U = true;
                invalidateOptionsMenu();
                m17845T4();
                break;
            case C17532R$id.menu_hide:
                C5163j2.m20275u4(this, 0);
                m17823M4();
                m17813I4();
                break;
            case C17532R$id.menu_inline:
                C5163j2.m20275u4(this, 1);
                m17823M4();
                m17813I4();
                break;
            case C17532R$id.menu_run:
                m17904j4();
                break;
            case C17532R$id.menu_save_changes:
                Editable text = ((EditText) mo28951B2(C17532R$id.macroNameText)).getText();
                C13706o.m87928e(text, "macroNameText.text");
                if (!(text.length() == 0)) {
                    m17900i3();
                    this.f11564L = false;
                    Macro macro7 = this.f11555C;
                    if (macro7 == null) {
                        C13706o.m87945v("macro");
                    } else {
                        macro = macro7;
                    }
                    m17826N4(!macro.isEnabled());
                    mo28962z4(true);
                    break;
                } else {
                    C4061t1.m16019t(this, getString(C17541R$string.invalid_macro), getString(C17541R$string.please_set_a_macro_name));
                    break;
                }
            case C17532R$id.menu_select_category:
                m17829O4();
                break;
            case C17532R$id.menu_share:
                m17910l4();
                break;
            case C17532R$id.menu_share_as_image:
                m17907k4();
                break;
            case C17532R$id.menu_share_nearby:
                m17913m4();
                break;
            case C17532R$id.menu_test_macro:
                m17916n4();
                break;
            case C17532R$id.menu_text_size:
                boolean z = !this.f11568P;
                this.f11568P = z;
                C5163j2.m19988I3(this, z);
                mo28962z4(true);
                break;
            case C17532R$id.menu_toggle_description:
                m17817K3();
                break;
            case C17532R$id.menu_variables:
                Macro macro8 = this.f11555C;
                if (macro8 == null) {
                    C13706o.m87945v("macro");
                } else {
                    macro = macro8;
                }
                startActivity(MacroDroidVariablesActivity.m24806a2(this, macro.getGUID()));
                break;
            case C17532R$id.show_log:
                SystemLogActivity.C4855a aVar = SystemLogActivity.f12221H;
                Macro macro9 = this.f11555C;
                if (macro9 == null) {
                    C13706o.m87945v("macro");
                } else {
                    macro = macro9;
                }
                aVar.mo29423a(this, macro.getGUID());
                break;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    public void onPause() {
        C10180a.m40075a().mo80020p(this);
        if (this.f11583e0) {
            mo28953H3().mo37358P();
            mo28953H3().mo37363x();
            mo28953H3().mo37359r();
        }
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        C13706o.m87929f(menu, "menu");
        menu.findItem(C17532R$id.menu_save_changes).setVisible(this.f11564L);
        return super.onPrepareOptionsMenu(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C13706o.m87929f(strArr, "permissions");
        C13706o.m87929f(iArr, "grantResults");
        if (i == 34) {
            SelectableItem selectableItem = this.f11556D;
            if (selectableItem != null) {
                C7439d0.m30856C(selectableItem, strArr, iArr);
            }
        } else if (i != 3000) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        } else {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                m17910l4();
            }
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onResume() {
        super.onResume();
        if (!C10180a.m40075a().mo80017g(this)) {
            C10180a.m40075a().mo80019m(this);
        }
        this.f11583e0 = false;
        Macro R = C4934n.m18998M().mo29683R(this.f11557E);
        if (R == null) {
            finish();
            return;
        }
        this.f11555C = R;
        m17793A4(this, false, 1, (Object) null);
        m17888e5();
        C4633q0<Action> q0Var = this.f11559G;
        if (q0Var != null) {
            q0Var.mo29064W(false);
        }
        C4633q0<Trigger> q0Var2 = this.f11560H;
        if (q0Var2 != null) {
            q0Var2.mo29064W(false);
        }
        C4633q0<Constraint> q0Var3 = this.f11561I;
        if (q0Var3 != null) {
            q0Var3.mo29064W(false);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((FloatingActionButton) mo28951B2(C17532R$id.acceptButton), "translationX", new float[]{0.0f});
        ofFloat.setDuration(0);
        ofFloat.start();
        m17856W4();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C13706o.m87929f(bundle, "outState");
        bundle.putInt("MacroId", this.f11557E);
        bundle.putBoolean("HasEdited", this.f11564L);
        bundle.putBoolean("IsClone", this.f11567O);
        bundle.putParcelable("selectable_item", this.f11556D);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: z4 */
    public final void mo28962z4(boolean z) {
        m17806F4(z);
        m17815J4(z);
        m17811H4(z);
        m17884d5();
        SelectableItem selectableItem = this.f11556D;
        if (selectableItem != null) {
            selectableItem.mo26119c2();
        }
        ((ImageButton) findViewById(C17532R$id.edit_macro_addTriggerButton)).setOnClickListener(new C4630p(this));
        SelectableItem selectableItem2 = this.f11556D;
        if (selectableItem2 instanceof ConditionAction) {
            C13706o.m87927d(selectableItem2, "null cannot be cast to non-null type com.arlosoft.macrodroid.action.ConditionAction");
            ((ConditionAction) selectableItem2).mo24876r3();
        }
        ((ImageButton) findViewById(C17532R$id.edit_macro_addActionButton)).setOnClickListener(new C4632q(this));
        ImageButton imageButton = (ImageButton) findViewById(C17532R$id.edit_macro_expandActionsButton);
        imageButton.setOnClickListener(new C4638s(this, imageButton));
        ImageButton imageButton2 = (ImageButton) findViewById(C17532R$id.edit_macro_addConstraintButton);
        C13706o.m87928e(imageButton2, "addConstraintButton");
        C4666m.m18147o(imageButton2, (C13640g) null, new C4585u(this, (C13635d<? super C4585u>) null), 1, (Object) null);
        m17912m3();
    }

    public final void onEventMainThread(RefreshEditMacroPageEvent refreshEditMacroPageEvent) {
        C13706o.m87929f(refreshEditMacroPageEvent, NotificationCompat.CATEGORY_EVENT);
        m17793A4(this, false, 1, (Object) null);
    }
}
