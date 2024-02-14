package com.arlosoft.macrodroid.editscreen;

import android.app.Activity;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.ActionBlockAction;
import com.arlosoft.macrodroid.action.ElseParentAction;
import com.arlosoft.macrodroid.action.EndIfAction;
import com.arlosoft.macrodroid.action.EndLoopAction;
import com.arlosoft.macrodroid.action.ForceMacroRunAction;
import com.arlosoft.macrodroid.action.IfConditionAction;
import com.arlosoft.macrodroid.action.LoopAction;
import com.arlosoft.macrodroid.action.ParentAction;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.extensions.C4657d;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.utils.C6364b;
import com.arlosoft.macrodroid.utils.C6413o0;
import com.arlosoft.macrodroid.utils.C6416p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13682c0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15478k0;
import p258f6.C12237a;
import p270ga.C12318a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;
import p370qa.C16270q;
import p414v9.C16735i;
import p440y9.C16971a;

/* compiled from: SelectableItemsViewHolder.kt */
public final class SelectableItemsViewHolder extends C12237a {

    /* renamed from: G */
    public static final C4594a f11619G = new C4594a((C13695i) null);

    /* renamed from: H */
    private static final int f11620H = C4657d.m18117b(32);

    /* renamed from: I */
    private static final int f11621I = C4657d.m18117b(6);

    /* renamed from: J */
    private static final int f11622J = C4657d.m18117b(26);

    /* renamed from: K */
    private static final int f11623K = C4657d.m18117b(5);

    /* renamed from: L */
    private static final int f11624L = C4657d.m18117b(4);

    /* renamed from: A */
    private final int f11625A;

    /* renamed from: B */
    private final int f11626B;

    /* renamed from: C */
    private final int f11627C;

    /* renamed from: D */
    private final int f11628D;

    /* renamed from: E */
    private final int f11629E;

    /* renamed from: F */
    private Boolean f11630F;

    /* renamed from: c */
    private final Activity f11631c;
    @BindView(2131362256)
    public ImageView collapseExpandButton;
    @BindView(2131362365)
    public ViewGroup constraintContainer;
    @BindView(2131362366)
    public View constraintLinkUnderAction;

    /* renamed from: d */
    private final Macro f11632d;
    @BindView(2131362587)
    public View dragHandle;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C16265l<SelectableItem, C13339u> f11633f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C16265l<SelectableItem, C13339u> f11634g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C16265l<SelectableItem, C13339u> f11635o;

    /* renamed from: p */
    private final C16735i<Boolean> f11636p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C16265l<SelectableItem, C13339u> f11637s;
    @BindView(2131364065)
    public ViewGroup topLevelContainer;
    @BindView(2131364066)
    public ViewGroup topLevelExtrasContainer;

    /* renamed from: z */
    private final int f11638z;

    /* renamed from: com.arlosoft.macrodroid.editscreen.SelectableItemsViewHolder$a */
    /* compiled from: SelectableItemsViewHolder.kt */
    public static final class C4594a {
        private C4594a() {
        }

        public /* synthetic */ C4594a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.SelectableItemsViewHolder$b */
    /* compiled from: SelectableItemsViewHolder.kt */
    static final class C4595b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ SelectableItem $item;
        int label;
        final /* synthetic */ SelectableItemsViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4595b(SelectableItemsViewHolder selectableItemsViewHolder, SelectableItem selectableItem, C13635d<? super C4595b> dVar) {
            super(3, dVar);
            this.this$0 = selectableItemsViewHolder;
            this.$item = selectableItem;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4595b(this.this$0, this.$item, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C16265l x = this.this$0.f11635o;
                if (x != null) {
                    x.invoke(this.$item);
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.SelectableItemsViewHolder$c */
    /* compiled from: SelectableItemsViewHolder.kt */
    static final class C4596c extends C13708q implements C16254a<C13339u> {
        final /* synthetic */ SelectableItem $item;
        final /* synthetic */ SelectableItemsViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4596c(SelectableItemsViewHolder selectableItemsViewHolder, SelectableItem selectableItem) {
            super(0);
            this.this$0 = selectableItemsViewHolder;
            this.$item = selectableItem;
        }

        public final void invoke() {
            C16265l A = this.this$0.f11637s;
            if (A != null) {
                A.invoke(this.$item);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.SelectableItemsViewHolder$d */
    /* compiled from: SelectableItemsViewHolder.kt */
    static final class C4597d extends C13708q implements C16254a<C13339u> {
        final /* synthetic */ SelectableItem $item;
        final /* synthetic */ C13682c0 $lastClick;
        final /* synthetic */ SelectableItemsViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4597d(C13682c0 c0Var, SelectableItemsViewHolder selectableItemsViewHolder, SelectableItem selectableItem) {
            super(0);
            this.$lastClick = c0Var;
            this.this$0 = selectableItemsViewHolder;
            this.$item = selectableItem;
        }

        public final void invoke() {
            this.$lastClick.element = System.currentTimeMillis();
            C16265l y = this.this$0.f11633f;
            if (y != null) {
                y.invoke(this.$item);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.SelectableItemsViewHolder$e */
    /* compiled from: SelectableItemsViewHolder.kt */
    static final class C4598e extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ SelectableItem $item;
        int label;
        final /* synthetic */ SelectableItemsViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4598e(SelectableItemsViewHolder selectableItemsViewHolder, SelectableItem selectableItem, C13635d<? super C4598e> dVar) {
            super(3, dVar);
            this.this$0 = selectableItemsViewHolder;
            this.$item = selectableItem;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4598e(this.this$0, this.$item, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C16265l unused2 = this.this$0.f11633f;
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.editscreen.SelectableItemsViewHolder$f */
    /* compiled from: SelectableItemsViewHolder.kt */
    static final class C4599f extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ SelectableItem $item;
        int label;
        final /* synthetic */ SelectableItemsViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4599f(SelectableItemsViewHolder selectableItemsViewHolder, SelectableItem selectableItem, C13635d<? super C4599f> dVar) {
            super(3, dVar);
            this.this$0 = selectableItemsViewHolder;
            this.$item = selectableItem;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4599f(this.this$0, this.$item, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C16265l unused2 = this.this$0.f11634g;
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectableItemsViewHolder(Activity activity, Macro macro, View view, C16265l<? super SelectableItem, C13339u> lVar, C16265l<? super SelectableItem, C13339u> lVar2, C16265l<? super SelectableItem, C13339u> lVar3, C16735i<Boolean> iVar, C16265l<? super SelectableItem, C13339u> lVar4) {
        super(view);
        C13706o.m87929f(activity, "context");
        C13706o.m87929f(macro, "macro");
        C13706o.m87929f(view, "itemView");
        C13706o.m87929f(iVar, "isRootedSubject");
        this.f11631c = activity;
        this.f11632d = macro;
        this.f11633f = lVar;
        this.f11634g = lVar2;
        this.f11635o = lVar3;
        this.f11636p = iVar;
        this.f11637s = lVar4;
        this.f11638z = activity.getResources().getDimensionPixelSize(C17529R$dimen.action_child_indent);
        this.f11625A = activity.getResources().getDimensionPixelSize(C17529R$dimen.logic_edit_entry_height);
        this.f11626B = activity.getResources().getDimensionPixelSize(C17529R$dimen.logic_edit_small_entry_height);
        this.f11627C = activity.getResources().getDimensionPixelSize(C17529R$dimen.constraint_level_offset);
        this.f11628D = activity.getResources().getDimensionPixelSize(C17529R$dimen.constraint_level_offset);
        this.f11629E = activity.getResources().getDimensionPixelSize(C17529R$dimen.edit_entry_horizontal_padding);
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: C */
    private final void m18018C(Action action, ImageView imageView, ViewGroup viewGroup, ImageView imageView2, boolean z, boolean z2, View view) {
        boolean z3 = action instanceof EndLoopAction;
        if (z3) {
            ArrayList<Action> actions = this.f11632d.getActions();
            int h = C6416p0.m24711h(this.f11632d.getActions(), this.f11632d.getActions().indexOf(action));
            if (h >= 0 && !actions.get(h).mo27822G1()) {
                viewGroup.setAlpha(0.5f);
            }
        }
        boolean z4 = action instanceof EndIfAction;
        if (z4 || (action instanceof ElseParentAction)) {
            ArrayList<Action> actions2 = this.f11632d.getActions();
            int g = C6416p0.m24710g(this.f11632d.getActions(), this.f11632d.getActions().indexOf(action));
            if (g >= 0 && !actions2.get(g).mo27822G1()) {
                viewGroup.setAlpha(0.5f);
            }
        }
        if ((action instanceof IfConditionAction) || (action instanceof LoopAction) || z4 || z3 || (action instanceof ElseParentAction)) {
            imageView.setBackgroundResource(C17530R$drawable.circular_icon_background_condition);
        } else {
            imageView.setBackgroundResource(C17530R$drawable.circular_icon_background_action_dark);
        }
        imageView2.setVisibility(z ? 0 : 8);
        if (z2) {
            view.setBackgroundResource(C17530R$drawable.constraint_link_end);
        } else {
            view.setBackgroundResource(C17530R$drawable.constraint_link_joiner);
        }
    }

    /* renamed from: D */
    private final void m18019D(SelectableItem selectableItem, TextView textView, boolean z) {
        textView.setText(selectableItem.mo27820F0());
        String F0 = selectableItem.mo27820F0();
        int i = 0;
        textView.setVisibility((F0 == null || F0.length() == 0) ^ true ? 0 : 8);
        if (z && selectableItem.mo27833P0()) {
            i = 2;
        }
        textView.setTypeface((Typeface) null, i);
    }

    /* renamed from: E */
    private final void m18020E(Constraint constraint, ImageView imageView, boolean z, boolean z2, boolean z3, View view, boolean z4) {
        if (z) {
            imageView.setBackgroundResource(C17530R$drawable.circular_icon_background_constraint_dark);
        } else {
            imageView.setBackgroundResource(C17530R$drawable.circular_icon_background_constraint);
        }
        if (z4) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        if (z3) {
            view.setBackgroundResource(C17530R$drawable.constraint_link_end);
        } else {
            view.setBackgroundResource(C17530R$drawable.constraint_link_joiner);
        }
    }

    /* renamed from: F */
    private final void m18021F(boolean z, SelectableItem selectableItem, TextView textView, ImageView imageView, ViewGroup viewGroup) {
        boolean z2;
        TextView textView2 = textView;
        ImageView imageView2 = imageView;
        ViewGroup viewGroup2 = viewGroup;
        if (!z) {
            List<String> k0 = selectableItem.mo25570k0();
            if (k0 != null) {
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = k0.iterator();
                while (true) {
                    z2 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    Activity activity = this.f11631c;
                    C13706o.m87927d(next, "null cannot be cast to non-null type kotlin.String");
                    if (ContextCompat.checkSelfPermission(activity, next) != 0) {
                        if (sb.length() <= 0) {
                            z2 = false;
                        }
                        if (z2) {
                            sb.append(" + ");
                        }
                        sb.append(next);
                    }
                }
                if (sb.length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    String sb2 = sb.toString();
                    C13706o.m87928e(sb2, "permissions.toString()");
                    String str = this.f11631c.getString(C17541R$string.rooted_or_adb_hack_required) + ' ' + sb2;
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new UnderlineSpan(), C15177w.m93682a0(str, sb2, 0, false, 6, (Object) null), str.length(), 0);
                    textView2.setText(spannableString);
                    textView2.setVisibility(0);
                    textView2.setOnClickListener(new C4639s0(this, selectableItem));
                    viewGroup2.setBackgroundResource(C17530R$drawable.item_error_border);
                    imageView2.setVisibility(0);
                    return;
                }
                return;
            }
            textView2.setText(this.f11631c.getString(C17541R$string.rooted_device_required));
            textView2.setVisibility(0);
            viewGroup2.setBackgroundResource(C17530R$drawable.item_error_border);
            imageView2.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static final void m18022G(SelectableItemsViewHolder selectableItemsViewHolder, SelectableItem selectableItem, View view) {
        C13706o.m87929f(selectableItemsViewHolder, "this$0");
        C13706o.m87929f(selectableItem, "$item");
        C6364b.m24611b(selectableItemsViewHolder.f11631c, selectableItem.mo25570k0(), new C4596c(selectableItemsViewHolder, selectableItem));
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [android.graphics.Typeface, kotlin.coroutines.g, java.lang.Object, kotlin.coroutines.d] */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r13v6 */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* renamed from: H */
    private final void m18023H(View view, SelectableItem selectableItem, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C16735i<Boolean> iVar, boolean z6, boolean z7) {
        ImageView imageView;
        TextView textView;
        String str;
        LinearLayout linearLayout;
        boolean z8;
        View view2;
        ViewGroup viewGroup;
        boolean z9;
        ? r13;
        int i;
        TextView textView2;
        int i2;
        View view3 = view;
        SelectableItem selectableItem2 = selectableItem;
        boolean z10 = z6;
        C13682c0 c0Var = new C13682c0();
        ViewGroup viewGroup2 = (ViewGroup) view3.findViewById(C17532R$id.topLevelContainer);
        ImageView imageView2 = (ImageView) view3.findViewById(C17532R$id.macro_edit_entry_icon);
        TextView textView3 = (TextView) view3.findViewById(C17532R$id.macro_edit_entry_name);
        TextView textView4 = (TextView) view3.findViewById(C17532R$id.macro_edit_entry_detail);
        View findViewById = view3.findViewById(C17532R$id.start_spacing);
        ImageView imageView3 = (ImageView) view3.findViewById(C17532R$id.macro_edit_warning_icon);
        TextView textView5 = (TextView) view3.findViewById(C17532R$id.macro_edit_entry_warning_text);
        TextView textView6 = (TextView) view3.findViewById(C17532R$id.macro_edit_entry_comment);
        String N0 = selectableItem.mo24938N0();
        C13706o.m87928e(imageView3, "warningIcon");
        imageView3.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) view3.findViewById(C17532R$id.collapsed_parent_icons);
        C13706o.m87928e(textView5, "warningText");
        textView5.setVisibility(8);
        ImageView imageView4 = (ImageView) view3.findViewById(C17532R$id.dragHandle);
        viewGroup2.setBackgroundResource(0);
        imageView3.setVisibility(8);
        if (N0 != null) {
            textView5.setText(N0);
            textView5.setVisibility(0);
            textView5.setOnClickListener(new C4637r0(selectableItem2, this));
            linearLayout = linearLayout2;
            str = "container";
            textView = textView6;
            imageView = imageView3;
            view2 = findViewById;
            z8 = true;
        } else {
            if (selectableItem.mo25764K1()) {
                Boolean bool = this.f11630F;
                if (bool != null) {
                    C13706o.m87926c(bool);
                    boolean booleanValue = bool.booleanValue();
                    C13706o.m87928e(viewGroup2, "container");
                    linearLayout = linearLayout2;
                    str = "container";
                    textView = textView6;
                    imageView = imageView3;
                    m18021F(booleanValue, selectableItem, textView5, imageView3, viewGroup2);
                } else {
                    linearLayout = linearLayout2;
                    str = "container";
                    textView = textView6;
                    imageView = imageView3;
                    C4643u0 u0Var = r0;
                    view2 = findViewById;
                    C4643u0 u0Var2 = new C4643u0(this, selectableItem, textView5, imageView, viewGroup2);
                    iVar.mo79690V(1).mo79688T(C12318a.m83030b()).mo79679I(C16971a.m100210a()).mo79685P(u0Var);
                    z8 = false;
                }
            } else {
                linearLayout = linearLayout2;
                str = "container";
                textView = textView6;
                imageView = imageView3;
            }
            view2 = findViewById;
            z8 = false;
        }
        imageView2.setImageDrawable(ContextCompat.getDrawable(this.f11631c, selectableItem.mo25558S0()));
        C13706o.m87928e(imageView2, "icon");
        imageView2.setVisibility(0);
        boolean z11 = selectableItem2 instanceof ParentAction;
        if (z11) {
            ParentAction parentAction = (ParentAction) selectableItem2;
            if (parentAction.mo25458J3()) {
                textView3.setText(parentAction.mo25226E0());
            } else {
                textView3.setText(parentAction.mo27831M0());
            }
        } else {
            textView3.setText(selectableItem.mo27831M0());
        }
        textView3.setTypeface((Typeface) null, (!z10 || !selectableItem.mo27878z1()) ? 0 : 2);
        textView3.setGravity(8388627);
        TextView textView7 = textView;
        C13706o.m87928e(textView7, "commentText");
        m18019D(selectableItem2, textView7, z10);
        viewGroup2.setAlpha(selectableItem.mo27822G1() ? 1.0f : 0.5f);
        C13706o.m87928e(viewGroup2, str);
        ImageView imageView5 = imageView4;
        View view4 = view2;
        TextView textView8 = textView4;
        ImageView imageView6 = imageView2;
        C4666m.m18150r(viewGroup2, 0, new C4597d(c0Var, this, selectableItem2), 1, (Object) null);
        viewGroup2.setOnLongClickListener(new C4641t0(c0Var, this, selectableItem2));
        if (selectableItem2 instanceof Action) {
            C13706o.m87928e(imageView5, "grabHandle");
            C13706o.m87928e(view4, "spacing");
            r13 = 0;
            z9 = z11;
            viewGroup = viewGroup2;
            m18018C((Action) selectableItem2, imageView6, viewGroup2, imageView5, z2, z, view4);
        } else {
            View view5 = view4;
            ImageView imageView7 = imageView6;
            z9 = z11;
            viewGroup = viewGroup2;
            if (selectableItem2 instanceof Constraint) {
                C13706o.m87928e(view5, "spacing");
                m18020E((Constraint) selectableItem2, imageView7, z3, z4, z, view5, z5);
                r13 = null;
            } else {
                r13 = null;
                if (selectableItem2 instanceof Trigger) {
                    imageView7.setBackgroundResource(C17530R$drawable.circular_icon_background_trigger_dark);
                    r13 = null;
                }
            }
        }
        if (!selectableItem.mo24824M1() || z8) {
            viewGroup.setBackgroundResource(C17530R$drawable.item_error_border);
            i = 0;
            imageView.setVisibility(0);
        } else {
            i = 0;
        }
        String O0 = selectableItem.mo24672O0();
        if (!(O0 == null || O0.length() == 0)) {
            textView2 = textView8;
            C13706o.m87928e(textView2, "itemDetail");
            textView2.setVisibility(i);
            textView2.setTypeface(r13, (!z10 || !selectableItem.mo27878z1()) ? 0 : 2);
            if (selectableItem.mo24712J1()) {
                textView2.setText(C6413o0.m24692a(O0));
            } else {
                textView2.setText(O0);
            }
            if ((selectableItem2 instanceof ForceMacroRunAction) || (selectableItem2 instanceof ActionBlockAction)) {
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                C4666m.m18147o(textView2, r13, new C4598e(this, selectableItem2, r13), 1, r13);
                C4666m.m18152t(textView2, (C13640g) null, false, new C4599f(this, selectableItem2, r13), 3, (Object) null);
            }
            i2 = 8;
        } else {
            textView2 = textView8;
            C13706o.m87928e(textView2, "itemDetail");
            i2 = 8;
            textView2.setVisibility(8);
        }
        if (z9) {
            ParentAction parentAction2 = (ParentAction) selectableItem2;
            if (parentAction2.mo25458J3()) {
                textView2.setVisibility(i2);
                LinearLayout linearLayout3 = linearLayout;
                C13706o.m87928e(linearLayout3, "collapsedParentIcons");
                linearLayout3.setVisibility(i);
                List<Integer> I3 = parentAction2.mo25457I3();
                linearLayout3.removeAllViews();
                int i3 = z4 ? f11622J : f11620H;
                int i4 = z4 ? f11623K : f11621I;
                for (Integer next : I3) {
                    ImageView imageView8 = new ImageView(this.f11631c);
                    imageView8.setLayoutParams(new LinearLayoutCompat.LayoutParams(i3, i3));
                    C13706o.m87928e(next, "i");
                    imageView8.setImageResource(next.intValue());
                    C4666m.m18155w(imageView8, (Integer) null, (Integer) null, Integer.valueOf(f11624L), (Integer) null);
                    imageView8.setPadding(i4, i4, i4, i4);
                    imageView8.setBackgroundResource(C17530R$drawable.roundrect_icon_background_action_dark);
                    linearLayout3.addView(imageView8);
                }
                return;
            }
        }
        LinearLayout linearLayout4 = linearLayout;
        C13706o.m87928e(linearLayout4, "collapsedParentIcons");
        linearLayout4.setVisibility(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static final void m18024I(SelectableItem selectableItem, SelectableItemsViewHolder selectableItemsViewHolder, View view) {
        C13706o.m87929f(selectableItem, "$item");
        C13706o.m87929f(selectableItemsViewHolder, "this$0");
        selectableItem.mo27877y2(selectableItemsViewHolder.f11631c);
        selectableItem.mo25283x1();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static final void m18025J(SelectableItemsViewHolder selectableItemsViewHolder, SelectableItem selectableItem, TextView textView, ImageView imageView, ViewGroup viewGroup, Boolean bool) {
        C13706o.m87929f(selectableItemsViewHolder, "this$0");
        C13706o.m87929f(selectableItem, "$item");
        selectableItemsViewHolder.f11630F = bool;
        C13706o.m87926c(bool);
        boolean booleanValue = bool.booleanValue();
        C13706o.m87928e(textView, "warningText");
        C13706o.m87928e(imageView, "warningIcon");
        C13706o.m87928e(viewGroup, "container");
        selectableItemsViewHolder.m18021F(booleanValue, selectableItem, textView, imageView, viewGroup);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static final boolean m18026K(C13682c0 c0Var, SelectableItemsViewHolder selectableItemsViewHolder, SelectableItem selectableItem, View view) {
        C16265l<SelectableItem, C13339u> lVar;
        C13706o.m87929f(c0Var, "$lastClick");
        C13706o.m87929f(selectableItemsViewHolder, "this$0");
        C13706o.m87929f(selectableItem, "$item");
        if (System.currentTimeMillis() - c0Var.element <= 750 || (lVar = selectableItemsViewHolder.f11634g) == null) {
            return true;
        }
        lVar.invoke(selectableItem);
        return true;
    }

    /* renamed from: L */
    private final void m18027L(View view) {
        TextView textView = (TextView) view.findViewById(C17532R$id.macro_edit_entry_detail);
        if (textView != null) {
            textView.setMaxLines(1);
        }
    }

    /* renamed from: O */
    private final int m18028O(boolean z) {
        return z ? this.f11627C : this.f11628D;
    }

    /* renamed from: R */
    private final int m18029R(boolean z) {
        return z ? C17535R$layout.macro_edit_entry_small : C17535R$layout.macro_edit_entry;
    }

    /* renamed from: U */
    private final void m18030U(SelectableItem selectableItem, View view, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i2;
        View view2 = view;
        int i3 = i;
        boolean z6 = z3;
        ViewGroup viewGroup = (ViewGroup) view2.findViewById(C17532R$id.topLevelExtrasContainer);
        ViewGroup viewGroup2 = (ViewGroup) view2.findViewById(C17532R$id.constraintContainer);
        View findViewById = view2.findViewById(C17532R$id.constraintLinkUnderAction);
        View findViewById2 = view2.findViewById(C17532R$id.macro_edit_entry_extras_joiner);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        C13706o.m87927d(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(layoutParams2.getMarginStart() + i3);
        findViewById.setLayoutParams(layoutParams2);
        C13706o.m87928e(findViewById, "constraintLinkUnderAction");
        boolean z7 = false;
        findViewById.setVisibility(0);
        C13706o.m87928e(findViewById2, "link");
        findViewById2.setVisibility(z2 ? 0 : 8);
        viewGroup2.removeAllViews();
        int i4 = 0;
        for (Constraint next : selectableItem.mo27826J0()) {
            int i5 = i4 + 1;
            View inflate = LayoutInflater.from(this.f11631c).inflate(m18029R(z6), viewGroup2, z7);
            TextView textView = (TextView) inflate.findViewById(C17532R$id.macro_edit_entry_detail);
            ViewGroup.LayoutParams layoutParams3 = inflate.getLayoutParams();
            C13706o.m87927d(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.setMarginStart(i3);
            inflate.setLayoutParams(layoutParams4);
            C13706o.m87928e(inflate, "constraintView");
            C13706o.m87928e(next, "childConstraint");
            int i6 = i5;
            Constraint constraint = next;
            m18023H(inflate, next, i5 == selectableItem.mo27826J0().size(), false, z, z3, false, this.f11636p, z4, z5);
            View view3 = inflate;
            viewGroup2.addView(view3);
            textView.setMaxLines(1);
            if (constraint.mo27826J0() == null || constraint.mo27826J0().size() <= 0) {
                i2 = i6;
            } else {
                i2 = i6;
                m18030U(constraint, view3, z, m18028O(z6), i2 < selectableItem.mo27826J0().size(), z3, z4, z5);
            }
            i3 = i;
            i4 = i2;
            z7 = false;
        }
        C13706o.m87928e(viewGroup, "topLevelExtrasContainer");
        viewGroup.setVisibility(0);
        C13706o.m87928e(viewGroup2, "extrasContainer");
        viewGroup2.setVisibility(0);
    }

    /* renamed from: V */
    private final void m18031V(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0103 A[EDGE_INSN: B:114:0x0103->B:51:0x0103 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fe A[LOOP:0: B:24:0x0079->B:49:0x00fe, LOOP_END] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29016B(com.arlosoft.macrodroid.common.SelectableItem r22, java.util.List<? extends com.arlosoft.macrodroid.common.SelectableItem> r23, int r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            r21 = this;
            r11 = r21
            r12 = r22
            r0 = r23
            r1 = r24
            r13 = r25
            java.lang.String r2 = "item"
            kotlin.jvm.internal.C13706o.m87929f(r12, r2)
            java.lang.String r2 = "items"
            kotlin.jvm.internal.C13706o.m87929f(r0, r2)
            android.view.ViewGroup r2 = r21.mo29021S()
            r14 = 1
            r15 = 0
            if (r32 == 0) goto L_0x002c
            boolean r3 = r12 instanceof com.arlosoft.macrodroid.action.Action
            if (r3 == 0) goto L_0x002c
            r3 = r12
            com.arlosoft.macrodroid.action.Action r3 = (com.arlosoft.macrodroid.action.Action) r3
            boolean r3 = r3.mo27821F1()
            if (r3 != 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x002d
        L_0x002c:
            r3 = 1
        L_0x002d:
            r10 = 8
            if (r3 == 0) goto L_0x0033
            r3 = 0
            goto L_0x0035
        L_0x0033:
            r3 = 8
        L_0x0035:
            r2.setVisibility(r3)
            if (r32 == 0) goto L_0x0054
            boolean r2 = r12 instanceof com.arlosoft.macrodroid.action.Action
            if (r2 == 0) goto L_0x0054
            r2 = r12
            com.arlosoft.macrodroid.action.Action r2 = (com.arlosoft.macrodroid.action.Action) r2
            boolean r2 = r2.mo27821F1()
            if (r2 == 0) goto L_0x0054
            android.view.ViewGroup r2 = r21.mo29021S()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
            r3.<init>((int) r15, (int) r15)
            r2.setLayoutParams(r3)
            goto L_0x006a
        L_0x0054:
            android.view.ViewGroup r2 = r21.mo29021S()
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            r3 = -1
            r2.width = r3
            android.view.ViewGroup r2 = r21.mo29021S()
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            r3 = -2
            r2.height = r3
        L_0x006a:
            android.widget.ImageView r2 = r21.mo29017M()
            r2.setVisibility(r10)
            boolean r2 = r12 instanceof com.arlosoft.macrodroid.action.Action
            if (r2 == 0) goto L_0x013c
            if (r1 < 0) goto L_0x0102
            r2 = 0
            r3 = 0
        L_0x0079:
            java.lang.Object r4 = r0.get(r2)     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            com.arlosoft.macrodroid.action.Action r4 = (com.arlosoft.macrodroid.action.Action) r4     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            boolean r5 = r4 instanceof com.arlosoft.macrodroid.action.ParentAction     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            if (r5 == 0) goto L_0x008e
            boolean r5 = r4.mo27822G1()     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            if (r5 == 0) goto L_0x008e
            if (r2 == r1) goto L_0x008e
            int r3 = r3 + 1
            goto L_0x00cb
        L_0x008e:
            boolean r4 = r4 instanceof com.arlosoft.macrodroid.action.EndParentAction     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            if (r4 == 0) goto L_0x00cb
            int r4 = com.arlosoft.macrodroid.utils.C6416p0.m24712i(r0, r2)     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            if (r4 < 0) goto L_0x00a7
            java.lang.Object r4 = r0.get(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            com.arlosoft.macrodroid.action.Action r4 = (com.arlosoft.macrodroid.action.Action) r4     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            boolean r4 = r4.mo27822G1()     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            if (r4 == 0) goto L_0x00cb
            int r3 = r3 + -1
            goto L_0x00cb
        L_0x00a7:
            java.lang.String r5 = "Invalid start index for End action"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r5)     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            com.google.firebase.crashlytics.FirebaseCrashlytics r5 = com.google.firebase.crashlytics.FirebaseCrashlytics.m6487a()     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            java.lang.Exception r6 = new java.lang.Exception     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            r7.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            java.lang.String r8 = "Invalid start index for End action: startIndex = "
            r7.append(r8)     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            r7.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            java.lang.String r4 = r7.toString()     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            r6.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            r5.mo22936d(r6)     // Catch:{ IndexOutOfBoundsException -> 0x00ca }
            goto L_0x00cb
        L_0x00ca:
        L_0x00cb:
            boolean r4 = r12 instanceof com.arlosoft.macrodroid.action.ParentAction
            if (r4 == 0) goto L_0x00fc
            if (r32 == 0) goto L_0x00fc
            android.widget.ImageView r4 = r21.mo29017M()
            r4.setVisibility(r15)
            android.widget.ImageView r4 = r21.mo29017M()
            r5 = r12
            com.arlosoft.macrodroid.action.ParentAction r5 = (com.arlosoft.macrodroid.action.ParentAction) r5
            boolean r5 = r5.mo25458J3()
            if (r5 == 0) goto L_0x00e9
            r5 = 2131231170(0x7f0801c2, float:1.8078413E38)
            goto L_0x00ec
        L_0x00e9:
            r5 = 2131231993(0x7f0804f9, float:1.8080083E38)
        L_0x00ec:
            r4.setImageResource(r5)
            android.widget.ImageView r4 = r21.mo29017M()
            com.arlosoft.macrodroid.editscreen.SelectableItemsViewHolder$b r5 = new com.arlosoft.macrodroid.editscreen.SelectableItemsViewHolder$b
            r6 = 0
            r5.<init>(r11, r12, r6)
            com.arlosoft.macrodroid.extensions.C4666m.m18147o(r4, r6, r5, r14, r6)
        L_0x00fc:
            if (r2 == r1) goto L_0x0103
            int r2 = r2 + 1
            goto L_0x0079
        L_0x0102:
            r3 = 0
        L_0x0103:
            boolean r2 = r12 instanceof com.arlosoft.macrodroid.action.ElseParentAction
            if (r2 == 0) goto L_0x012d
            int r1 = com.arlosoft.macrodroid.utils.C6416p0.m24710g(r23, r24)
            if (r1 < 0) goto L_0x011c
            java.lang.Object r0 = r0.get(r1)
            com.arlosoft.macrodroid.action.Action r0 = (com.arlosoft.macrodroid.action.Action) r0
            boolean r0 = r0.mo27822G1()
            if (r0 == 0) goto L_0x012d
            int r3 = r3 + -1
            goto L_0x012d
        L_0x011c:
            java.lang.String r0 = "Invalid start index for Else action"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            com.google.firebase.crashlytics.FirebaseCrashlytics r1 = com.google.firebase.crashlytics.FirebaseCrashlytics.m6487a()
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>(r0)
            r1.mo22936d(r2)
        L_0x012d:
            android.view.ViewGroup r0 = r21.mo29021S()
            int r1 = r11.f11629E
            int r2 = r11.f11638z
            int r3 = r3 * r2
            int r3 = r3 + r1
            r0.setPadding(r3, r15, r1, r15)
            goto L_0x0145
        L_0x013c:
            android.view.ViewGroup r0 = r21.mo29021S()
            int r1 = r11.f11629E
            r0.setPadding(r1, r15, r1, r15)
        L_0x0145:
            android.view.ViewGroup r1 = r21.mo29021S()
            r3 = 0
            r5 = 1
            r7 = 1
            v9.i<java.lang.Boolean> r8 = r11.f11636p
            r0 = r21
            r2 = r22
            r4 = r26
            r6 = r25
            r9 = r27
            r10 = r28
            r0.m18023H(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = r12 instanceof com.arlosoft.macrodroid.action.ConditionAction
            if (r0 != 0) goto L_0x022a
            java.util.List r0 = r22.mo27826J0()
            if (r0 == 0) goto L_0x022a
            java.util.List r0 = r22.mo27826J0()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x022a
            android.view.View r0 = r21.mo29019P()
            r0.setVisibility(r15)
            android.view.ViewGroup r0 = r21.mo29018N()
            r0.removeAllViews()
            java.util.List r0 = r22.mo27826J0()
            java.util.Iterator r16 = r0.iterator()
            r0 = 0
        L_0x0188:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0221
            java.lang.Object r1 = r16.next()
            r10 = r1
            com.arlosoft.macrodroid.constraint.Constraint r10 = (com.arlosoft.macrodroid.constraint.Constraint) r10
            int r9 = r0 + 1
            android.app.Activity r0 = r11.f11631c
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r11.m18029R(r13)
            android.view.ViewGroup r2 = r21.mo29018N()
            android.view.View r8 = r0.inflate(r1, r2, r15)
            java.lang.String r0 = "constraintView"
            kotlin.jvm.internal.C13706o.m87928e(r8, r0)
            r11.m18027L(r8)
            java.lang.String r0 = "constraint"
            kotlin.jvm.internal.C13706o.m87928e(r10, r0)
            java.util.List r0 = r22.mo27826J0()
            int r0 = r0.size()
            if (r9 != r0) goto L_0x01c2
            r3 = 1
            goto L_0x01c3
        L_0x01c2:
            r3 = 0
        L_0x01c3:
            r4 = 0
            boolean r7 = r12 instanceof com.arlosoft.macrodroid.constraint.Constraint
            r17 = 0
            v9.i<java.lang.Boolean> r6 = r11.f11636p
            r0 = r21
            r1 = r8
            r2 = r10
            r5 = r7
            r18 = r6
            r6 = r25
            r19 = r7
            r7 = r17
            r14 = r8
            r8 = r18
            r15 = r9
            r9 = r27
            r20 = r10
            r10 = r28
            r0.m18023H(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            android.view.ViewGroup r0 = r21.mo29018N()
            r0.addView(r14)
            java.util.List r0 = r20.mo27826J0()
            if (r0 == 0) goto L_0x021c
            java.util.List r0 = r20.mo27826J0()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x021c
            int r4 = r11.m18028O(r13)
            java.util.List r0 = r22.mo27826J0()
            int r0 = r0.size()
            if (r15 >= r0) goto L_0x020b
            r5 = 1
            goto L_0x020c
        L_0x020b:
            r5 = 0
        L_0x020c:
            r0 = r21
            r1 = r20
            r2 = r14
            r3 = r19
            r6 = r25
            r7 = r27
            r8 = r28
            r0.m18030U(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x021c:
            r0 = r15
            r14 = 1
            r15 = 0
            goto L_0x0188
        L_0x0221:
            android.view.ViewGroup r0 = r21.mo29022T()
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x023a
        L_0x022a:
            android.view.ViewGroup r0 = r21.mo29022T()
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r21.mo29019P()
            r0.setVisibility(r1)
        L_0x023a:
            android.view.View r0 = r21.mo29020Q()
            r1 = r26
            r11.m18031V(r0, r1)
            if (r33 == 0) goto L_0x029b
            if (r29 == 0) goto L_0x025a
            if (r30 == 0) goto L_0x025a
            android.view.ViewGroup r0 = r21.mo29021S()
            if (r31 == 0) goto L_0x0253
            r1 = 2131230887(0x7f0800a7, float:1.807784E38)
            goto L_0x0256
        L_0x0253:
            r1 = 2131230886(0x7f0800a6, float:1.8077837E38)
        L_0x0256:
            r0.setBackgroundResource(r1)
            goto L_0x029b
        L_0x025a:
            if (r29 == 0) goto L_0x026d
            android.view.ViewGroup r0 = r21.mo29021S()
            if (r31 == 0) goto L_0x0266
            r1 = 2131230888(0x7f0800a8, float:1.8077841E38)
            goto L_0x0269
        L_0x0266:
            r1 = 2131230885(0x7f0800a5, float:1.8077835E38)
        L_0x0269:
            r0.setBackgroundResource(r1)
            goto L_0x029b
        L_0x026d:
            if (r30 == 0) goto L_0x0280
            android.view.ViewGroup r0 = r21.mo29021S()
            if (r31 == 0) goto L_0x0279
            r1 = 2131230883(0x7f0800a3, float:1.8077831E38)
            goto L_0x027c
        L_0x0279:
            r1 = 2131230882(0x7f0800a2, float:1.807783E38)
        L_0x027c:
            r0.setBackgroundResource(r1)
            goto L_0x029b
        L_0x0280:
            if (r28 == 0) goto L_0x0293
            android.view.ViewGroup r0 = r21.mo29021S()
            if (r31 == 0) goto L_0x028c
            r1 = 2131230884(0x7f0800a4, float:1.8077833E38)
            goto L_0x028f
        L_0x028c:
            r1 = 2131230881(0x7f0800a1, float:1.8077827E38)
        L_0x028f:
            r0.setBackgroundResource(r1)
            goto L_0x029b
        L_0x0293:
            android.view.ViewGroup r0 = r21.mo29021S()
            r1 = 0
            r0.setBackgroundResource(r1)
        L_0x029b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.editscreen.SelectableItemsViewHolder.mo29016B(com.arlosoft.macrodroid.common.SelectableItem, java.util.List, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: M */
    public final ImageView mo29017M() {
        ImageView imageView = this.collapseExpandButton;
        if (imageView != null) {
            return imageView;
        }
        C13706o.m87945v("collapseExpandButton");
        return null;
    }

    /* renamed from: N */
    public final ViewGroup mo29018N() {
        ViewGroup viewGroup = this.constraintContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        C13706o.m87945v("constraintContainer");
        return null;
    }

    /* renamed from: P */
    public final View mo29019P() {
        View view = this.constraintLinkUnderAction;
        if (view != null) {
            return view;
        }
        C13706o.m87945v("constraintLinkUnderAction");
        return null;
    }

    /* renamed from: Q */
    public final View mo29020Q() {
        View view = this.dragHandle;
        if (view != null) {
            return view;
        }
        C13706o.m87945v("dragHandle");
        return null;
    }

    /* renamed from: S */
    public final ViewGroup mo29021S() {
        ViewGroup viewGroup = this.topLevelContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        C13706o.m87945v("topLevelContainer");
        return null;
    }

    /* renamed from: T */
    public final ViewGroup mo29022T() {
        ViewGroup viewGroup = this.topLevelExtrasContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        C13706o.m87945v("topLevelExtrasContainer");
        return null;
    }
}
