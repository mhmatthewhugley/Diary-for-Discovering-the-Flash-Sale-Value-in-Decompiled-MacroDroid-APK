package com.arlosoft.macrodroid.macrolist;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.IfConditionAction;
import com.arlosoft.macrodroid.action.LoopAction;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.utils.C6415p;
import com.arlosoft.macrodroid.utils.C6416p0;
import com.arlosoft.macrodroid.widget.C6636d;
import com.arlosoft.macrodroid.widget.SwitchPlus;
import com.google.android.material.card.MaterialCardView;
import com.varunest.sparkbutton.SparkButton2;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p093g2.C12283l0;
import p093g2.C7328a;
import p286i9.C12454b;
import p316l9.C15605d;
import p316l9.C15607f;
import p334n9.C15763c;
import p346o8.C15819a;

public class MacroListItem extends C15605d<FullMacroViewHolder, MacroListCategoryHeader> implements C15607f<String> {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Macro f12490g;

    /* renamed from: h */
    private final View.OnLongClickListener f12491h;

    /* renamed from: i */
    private final View.OnClickListener f12492i;

    /* renamed from: j */
    private final C4959a f12493j;

    /* renamed from: k */
    private final Category f12494k;

    /* renamed from: l */
    private final int f12495l;

    /* renamed from: m */
    private final boolean f12496m;

    /* renamed from: n */
    private final boolean f12497n;

    /* renamed from: o */
    private long f12498o;

    /* renamed from: p */
    private long f12499p;

    /* renamed from: q */
    private boolean f12500q;

    /* renamed from: r */
    private boolean f12501r;

    /* renamed from: s */
    private boolean f12502s;

    /* renamed from: t */
    private C15763c f12503t;

    /* renamed from: u */
    private boolean f12504u;

    /* renamed from: v */
    private C7328a f12505v;

    /* renamed from: w */
    private boolean f12506w;

    /* renamed from: x */
    private Set<String> f12507x;

    public class FilterViewHolder extends C15763c {
    }

    public class FilterViewHolder_ViewBinding implements Unbinder {
        @UiThread
        public FilterViewHolder_ViewBinding(FilterViewHolder filterViewHolder, View view) {
            TextView textView = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.macroName, "field 'macroName'", TextView.class);
            throw null;
        }

        @CallSuper
        public void unbind() {
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class FullMacroViewHolder extends C15763c {
        @BindView(2131363088)
        TextView actionsLabel;
        @BindView(2131362065)
        View blocker;
        @BindView(2131362181)
        ViewGroup cardInfoContainer;
        @BindView(2131363091)
        MaterialCardView cardView;
        @BindView(2131363093)
        TextView constraintsLabel;
        @BindView(2131362469)
        TextView description;
        @BindView(2131362573)
        View dividerLine;
        @BindView(2131363025)
        TextView lastEditedTime;
        @BindView(2131363026)
        TextView lastInvokedTime;
        @BindView(2131363104)
        TextView macroName;
        @BindDimen(2131165594)
        int marginSmallMedium;
        @BindDimen(2131165595)
        int marginTiny;
        @BindView(2131362675)
        SwitchPlus onOffSwitch;

        /* renamed from: p */
        private MacroListItem f12508p;

        /* renamed from: s */
        private C7328a f12509s;
        @BindView(2131363853)
        SparkButton2 starIcon;
        @BindView(2131363123)
        ViewGroup titleBar;
        @BindView(2131364061)
        View topContainer;
        @BindView(2131363106)
        TextView triggerLabel;

        /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListItem$FullMacroViewHolder$a */
        class C4957a implements C15819a {

            /* renamed from: a */
            final /* synthetic */ Macro f12511a;

            /* renamed from: b */
            final /* synthetic */ C4959a f12512b;

            /* renamed from: c */
            final /* synthetic */ MacroListItem f12513c;

            C4957a(Macro macro, C4959a aVar, MacroListItem macroListItem) {
                this.f12511a = macro;
                this.f12512b = aVar;
                this.f12513c = macroListItem;
            }

            /* renamed from: a */
            public void mo29733a(ImageView imageView, boolean z) {
                this.f12511a.setIsFavourite(z);
                C4934n.m18998M().mo29695o0(this.f12511a);
                if (!z) {
                    this.f12512b.mo29314a(this.f12513c);
                }
            }

            /* renamed from: b */
            public void mo29734b(ImageView imageView, boolean z) {
            }

            /* renamed from: c */
            public void mo29735c(ImageView imageView, boolean z) {
                FullMacroViewHolder.this.topContainer.invalidate();
                FullMacroViewHolder.this.topContainer.forceLayout();
            }
        }

        /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListItem$FullMacroViewHolder$b */
        class C4958b extends C6636d {

            /* renamed from: a */
            final /* synthetic */ Macro f12515a;

            /* renamed from: b */
            final /* synthetic */ boolean f12516b;

            C4958b(Macro macro, boolean z) {
                this.f12515a = macro;
                this.f12516b = z;
            }

            public void onAnimationEnd(Animator animator) {
                FullMacroViewHolder.this.blocker.setAlpha(1.0f);
                FullMacroViewHolder.this.blocker.setVisibility((!this.f12515a.isEnabled() || this.f12516b) ? 0 : 8);
            }
        }

        public FullMacroViewHolder(@NonNull View view, @NonNull C12454b bVar, C7328a aVar) {
            super(view, bVar);
            ButterKnife.bind((Object) this, view);
            this.f12509s = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: D */
        public /* synthetic */ void m19246D(Macro macro, boolean z, CompoundButton compoundButton, boolean z2) {
            if (z2) {
                C4934n.m18998M().mo29708x(macro, true);
            } else {
                C4934n.m18998M().mo29707w(macro, true);
            }
            this.blocker.setVisibility(0);
            float f = 1.0f;
            if (!z2) {
                this.blocker.setAlpha(1.0f);
            } else {
                this.blocker.setAlpha(0.0f);
            }
            View view = this.blocker;
            float[] fArr = new float[2];
            fArr[0] = z2 ? 1.0f : 0.0f;
            if (z2) {
                f = 0.0f;
            }
            fArr[1] = f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
            ofFloat.addListener(new C4958b(macro, z));
            ofFloat.setDuration(300);
            ofFloat.start();
        }

        /* renamed from: E */
        private void m19247E(@NonNull Macro macro, @NonNull TextView textView) {
            int i;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            textView.setMaxLines(C5163j2.m19947D0(mo75399t().getContext()));
            ArrayList<Action> actions = macro.getActions();
            if (macro.getActions().size() > 0) {
                int i2 = 0;
                while (i2 < 99) {
                    if (actions.size() > i2) {
                        Action action = actions.get(i2);
                        CharSequence V0 = action.mo24875V0();
                        if (action.mo27822G1()) {
                            spannableStringBuilder.append(V0);
                        } else {
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append(V0);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(mo75399t().getContext(), C17528R$color.disabled_action_color)), length, spannableStringBuilder.length(), 33);
                        }
                        if (!(action instanceof IfConditionAction) ? !(!(action instanceof LoopAction) || (i = C6416p0.m24706c(actions, i2)) < 0) : (i = C6416p0.m24705b(actions, i2)) >= 0) {
                            i2 = i;
                        }
                        if (i2 < macro.getActions().size() - 1 && i2 < 98) {
                            spannableStringBuilder.append(", ");
                        }
                    }
                    i2++;
                }
                textView.setText(spannableStringBuilder);
                return;
            }
            textView.setText(C17541R$string.none);
        }

        /* renamed from: F */
        private void m19248F(@NonNull Macro macro, @NonNull TextView textView) {
            textView.setMaxLines(C5163j2.m19947D0(mo75399t().getContext()));
            if (macro.getConstraints().size() > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i = 0; i < 99; i++) {
                    if (macro.getConstraints().size() > i) {
                        Constraint constraint = macro.getConstraints().get(i);
                        CharSequence V0 = constraint.mo24875V0();
                        if (constraint.mo27822G1()) {
                            spannableStringBuilder.append(V0);
                        } else {
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append(V0);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(mo75399t().getContext(), C17528R$color.disabled_action_color)), length, spannableStringBuilder.length(), 33);
                        }
                        if (i < macro.getConstraints().size() - 1 && i < 98) {
                            spannableStringBuilder.append(", ");
                        }
                    }
                }
                textView.setText(spannableStringBuilder);
                return;
            }
            textView.setText(C17541R$string.none);
        }

        /* renamed from: G */
        private void m19249G(@NonNull Macro macro, @NonNull TextView textView) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            textView.setMaxLines(C5163j2.m19947D0(mo75399t().getContext()));
            if (macro.getTriggerList().size() > 0) {
                for (int i = 0; i < 99; i++) {
                    if (macro.getTriggerList().size() > i) {
                        Trigger trigger = macro.getTriggerList().get(i);
                        CharSequence V0 = trigger.mo24875V0();
                        if (trigger.mo27822G1()) {
                            spannableStringBuilder.append(V0);
                        } else {
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append(V0);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(mo75399t().getContext(), C17528R$color.disabled_trigger_color)), length, spannableStringBuilder.length(), 33);
                        }
                        if (i < macro.getTriggerList().size() - 1 && i < 98) {
                            spannableStringBuilder.append(", ");
                        }
                    }
                }
                textView.setText(spannableStringBuilder);
                return;
            }
            textView.setText(C17541R$string.none);
        }

        /* access modifiers changed from: private */
        /* renamed from: H */
        public void m19250H(boolean z) {
            this.blocker.setVisibility((!MacroListItem.this.f12490g.isEnabled() || z) ? 0 : 8);
            this.onOffSwitch.setEnabled(!z);
        }

        /* renamed from: C */
        public void mo29751C(@NonNull MacroListItem macroListItem, @NonNull Macro macro, @NonNull Category category, long j, boolean z, long j2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, @Nullable View.OnClickListener onClickListener, @Nullable View.OnLongClickListener onLongClickListener, @Nullable C4959a aVar) {
            MacroListItem macroListItem2 = macroListItem;
            Macro macro2 = macro;
            boolean z8 = z5;
            MacroListItem macroListItem3 = this.f12508p;
            if (macroListItem3 != null) {
                macroListItem3.mo29744F();
            }
            this.f12508p = macroListItem2;
            this.topContainer.setOnLongClickListener(onLongClickListener);
            this.topContainer.setOnClickListener(onClickListener);
            int b = this.f12509s.mo37294b(macro.getHeadingColor());
            int i = 8;
            this.onOffSwitch.setVisibility(z4 ? 0 : 8);
            ((RecyclerView.LayoutParams) this.cardView.getLayoutParams()).bottomMargin = this.cardView.getContext().getResources().getDimensionPixelOffset(z6 ? C17529R$dimen.macro_list_card_margin_large : C17529R$dimen.macro_list_card_margin_small);
            if (!macro.isValid()) {
                this.cardView.setStrokeColor(ContextCompat.getColor(mo75399t().getContext(), C17528R$color.macro_error_border));
                this.cardView.setStrokeWidth(mo75399t().getContext().getResources().getDimensionPixelOffset(C17529R$dimen.template_error_border_thickness));
            } else {
                this.cardView.setStrokeWidth(0);
            }
            if (b == 0) {
                this.cardView.setCardBackgroundColor(this.f12509s.mo37294b(category.getColor()));
                this.onOffSwitch.setOffColor(C6415p.m24699a(this.itemView.getContext(), category.getColor()));
            } else {
                this.cardView.setCardBackgroundColor(b);
                this.onOffSwitch.setOffColor(C6415p.m24699a(this.itemView.getContext(), b));
            }
            this.macroName.setTextColor(ContextCompat.getColor(mo75399t().getContext(), C17528R$color.text_color_macro_list_name));
            this.lastInvokedTime.setTextColor(ContextCompat.getColor(mo75399t().getContext(), C17528R$color.text_color_macro_list_secondary));
            this.lastEditedTime.setTextColor(ContextCompat.getColor(mo75399t().getContext(), C17528R$color.text_color_macro_list_secondary));
            this.macroName.setText(macro.getName());
            if (z) {
                this.lastInvokedTime.setVisibility(0);
                if (j == 0) {
                    this.lastInvokedTime.setText(C17541R$string.macro_never_activated);
                } else {
                    TextView textView = this.lastInvokedTime;
                    textView.setText(this.lastInvokedTime.getContext().getString(C17541R$string.last_activated) + " " + DateUtils.getRelativeTimeSpanString(j));
                }
            } else {
                this.lastInvokedTime.setVisibility(8);
            }
            if (z2) {
                this.lastEditedTime.setVisibility(0);
                if (j2 == 0) {
                    TextView textView2 = this.lastEditedTime;
                    textView2.setText(String.format(textView2.getContext().getString(C17541R$string.last_edited), new Object[]{this.lastEditedTime.getContext().getString(C17541R$string.last_edited_time_unknown)}));
                } else {
                    TextView textView3 = this.lastEditedTime;
                    textView3.setText(String.format(textView3.getContext().getString(C17541R$string.last_edited), new Object[]{DateUtils.getRelativeTimeSpanString(j2)}));
                }
            } else {
                this.lastEditedTime.setVisibility(8);
            }
            this.starIcon.setChecked(macro.getIsFavourite());
            C4666m.m18139g(this.starIcon, this.marginSmallMedium);
            this.starIcon.setEventListener(new C4957a(macro, aVar, macroListItem));
            this.onOffSwitch.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.onOffSwitch.setChecked(macro.isEnabled());
            this.onOffSwitch.setEnabled(!z8);
            this.blocker.setVisibility((!z4 || (macro.isEnabled() && !z8)) ? 8 : 0);
            this.onOffSwitch.setOnCheckedChangeListener(new C12283l0(this, macro, z8));
            if (!z3 || TextUtils.isEmpty(macro.getDescription())) {
                this.description.setVisibility(8);
            } else {
                this.description.setText(macro.getDescription());
                this.description.setVisibility(0);
            }
            this.cardInfoContainer.setVisibility(z7 ? 0 : 8);
            View view = this.dividerLine;
            if (z7) {
                i = 0;
            }
            view.setVisibility(i);
            if (z7) {
                m19249G(macro, this.triggerLabel);
                m19247E(macro, this.actionsLabel);
                m19248F(macro, this.constraintsLabel);
            }
        }
    }

    public class FullMacroViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private FullMacroViewHolder f12518a;

        @UiThread
        public FullMacroViewHolder_ViewBinding(FullMacroViewHolder fullMacroViewHolder, View view) {
            this.f12518a = fullMacroViewHolder;
            fullMacroViewHolder.titleBar = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.macro_title_bar, "field 'titleBar'", ViewGroup.class);
            fullMacroViewHolder.macroName = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.macroNameText, "field 'macroName'", TextView.class);
            fullMacroViewHolder.starIcon = (SparkButton2) Utils.findRequiredViewAsType(view, C17532R$id.starIcon, "field 'starIcon'", SparkButton2.class);
            fullMacroViewHolder.lastInvokedTime = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.lastInvokedTime, "field 'lastInvokedTime'", TextView.class);
            fullMacroViewHolder.lastEditedTime = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.lastEditedTime, "field 'lastEditedTime'", TextView.class);
            fullMacroViewHolder.triggerLabel = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.macroTrigger, "field 'triggerLabel'", TextView.class);
            fullMacroViewHolder.actionsLabel = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.macroActions, "field 'actionsLabel'", TextView.class);
            fullMacroViewHolder.onOffSwitch = (SwitchPlus) Utils.findRequiredViewAsType(view, C17532R$id.enabledSwitch, "field 'onOffSwitch'", SwitchPlus.class);
            fullMacroViewHolder.constraintsLabel = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.macroConstraints, "field 'constraintsLabel'", TextView.class);
            fullMacroViewHolder.description = (TextView) Utils.findRequiredViewAsType(view, 2131362469, "field 'description'", TextView.class);
            fullMacroViewHolder.blocker = Utils.findRequiredView(view, C17532R$id.blocker, "field 'blocker'");
            fullMacroViewHolder.cardView = (MaterialCardView) Utils.findRequiredViewAsType(view, C17532R$id.macroCardView, "field 'cardView'", MaterialCardView.class);
            fullMacroViewHolder.topContainer = Utils.findRequiredView(view, C17532R$id.topContainer, "field 'topContainer'");
            fullMacroViewHolder.cardInfoContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.card_info_container, "field 'cardInfoContainer'", ViewGroup.class);
            fullMacroViewHolder.dividerLine = Utils.findRequiredView(view, C17532R$id.divider_line, "field 'dividerLine'");
            Resources resources = view.getContext().getResources();
            fullMacroViewHolder.marginTiny = resources.getDimensionPixelSize(C17529R$dimen.margin_tiny);
            fullMacroViewHolder.marginSmallMedium = resources.getDimensionPixelSize(C17529R$dimen.margin_small_medium);
        }

        @CallSuper
        public void unbind() {
            FullMacroViewHolder fullMacroViewHolder = this.f12518a;
            if (fullMacroViewHolder != null) {
                this.f12518a = null;
                fullMacroViewHolder.titleBar = null;
                fullMacroViewHolder.macroName = null;
                fullMacroViewHolder.starIcon = null;
                fullMacroViewHolder.lastInvokedTime = null;
                fullMacroViewHolder.lastEditedTime = null;
                fullMacroViewHolder.triggerLabel = null;
                fullMacroViewHolder.actionsLabel = null;
                fullMacroViewHolder.onOffSwitch = null;
                fullMacroViewHolder.constraintsLabel = null;
                fullMacroViewHolder.description = null;
                fullMacroViewHolder.blocker = null;
                fullMacroViewHolder.cardView = null;
                fullMacroViewHolder.topContainer = null;
                fullMacroViewHolder.cardInfoContainer = null;
                fullMacroViewHolder.dividerLine = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListItem$a */
    public interface C4959a {
        /* renamed from: a */
        void mo29314a(MacroListItem macroListItem);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MacroListItem(@NonNull MacroListCategoryHeader macroListCategoryHeader, int i, @NonNull Macro macro, @NonNull Category category, long j, boolean z, long j2, boolean z2, boolean z3, boolean z4, @Nullable View.OnClickListener onClickListener, @Nullable View.OnLongClickListener onLongClickListener, @Nullable C4959a aVar, boolean z5, C7328a aVar2, boolean z6, Set<String> set) {
        super(macroListCategoryHeader);
        this.f12490g = macro;
        this.f12491h = onLongClickListener;
        this.f12492i = onClickListener;
        this.f12493j = aVar;
        this.f12494k = category;
        this.f12495l = i;
        this.f12496m = z;
        this.f12498o = j;
        this.f12499p = j2;
        this.f12500q = z2;
        this.f12504u = z4;
        this.f12497n = z3;
        this.f12502s = z5;
        this.f12505v = aVar2;
        this.f12506w = z6;
        this.f12507x = set;
    }

    /* renamed from: C */
    private String m19230C(String str) {
        if (str == null) {
            return null;
        }
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase();
    }

    /* renamed from: A */
    public Macro mo29740A() {
        return this.f12490g;
    }

    @NonNull
    /* renamed from: B */
    public int mo29741B() {
        return this.f12495l;
    }

    /* renamed from: D */
    public void mo29742D(boolean z) {
        this.f12501r = z;
        C15763c cVar = this.f12503t;
        if (cVar != null && (cVar instanceof FullMacroViewHolder)) {
            ((FullMacroViewHolder) cVar).m19250H(z);
        }
    }

    /* renamed from: E */
    public void mo29743E(long j) {
        this.f12498o = j;
    }

    /* renamed from: F */
    public void mo29744F() {
        this.f12503t = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MacroListItem) || this.f12495l != ((MacroListItem) obj).mo29741B()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f12495l;
    }

    /* renamed from: l */
    public int mo29471l() {
        return C17535R$layout.macro_list_row;
    }

    /* renamed from: x */
    public void mo29469g(C12454b bVar, FullMacroViewHolder fullMacroViewHolder, int i, List list) {
        FullMacroViewHolder fullMacroViewHolder2 = fullMacroViewHolder;
        fullMacroViewHolder2.mo29751C(this, this.f12490g, this.f12494k, this.f12498o, this.f12496m, this.f12499p, this.f12500q, this.f12497n, this.f12502s, this.f12501r, this.f12504u, this.f12506w, this.f12492i, this.f12491h, this.f12493j);
        this.f12503t = fullMacroViewHolder;
    }

    /* renamed from: y */
    public FullMacroViewHolder mo29472s(View view, C12454b bVar) {
        return new FullMacroViewHolder(view, bVar, this.f12505v);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0094 A[EDGE_INSN: B:43:0x0094->B:23:0x0094 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c9 A[EDGE_INSN: B:45:0x00c9->B:32:0x00c9 ?: BREAK  , SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo29747j(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "_"
            boolean r0 = r7.endsWith(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0013
            int r0 = r7.length()
            int r0 = r0 - r2
            java.lang.String r7 = r7.substring(r1, r0)
        L_0x0013:
            java.lang.String r7 = r6.m19230C(r7)
            com.arlosoft.macrodroid.macro.Macro r0 = r6.f12490g
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = r6.m19230C(r0)
            com.arlosoft.macrodroid.categories.Category r3 = r6.f12494k
            java.lang.String r3 = r3.getName()
            java.lang.String r3 = r6.m19230C(r3)
            com.arlosoft.macrodroid.macro.Macro r4 = r6.f12490g
            java.lang.String r4 = r4.getDescription()
            java.lang.String r4 = r6.m19230C(r4)
            com.arlosoft.macrodroid.categories.Category r5 = r6.f12494k
            boolean r5 = r5.isLocked()
            if (r5 == 0) goto L_0x0047
            java.util.Set<java.lang.String> r5 = r6.f12507x
            boolean r5 = r5.contains(r3)
            if (r5 != 0) goto L_0x0047
            goto L_0x00fe
        L_0x0047:
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L_0x00fd
            boolean r0 = r3.contains(r7)
            if (r0 != 0) goto L_0x00fd
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0061
            boolean r0 = r4.contains(r7)
            if (r0 == 0) goto L_0x0061
            goto L_0x00fd
        L_0x0061:
            com.arlosoft.macrodroid.macro.Macro r0 = r6.f12490g
            java.util.ArrayList r0 = r0.getTriggerList()
            java.util.Iterator r0 = r0.iterator()
        L_0x006b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0094
            java.lang.Object r3 = r0.next()
            com.arlosoft.macrodroid.triggers.Trigger r3 = (com.arlosoft.macrodroid.triggers.Trigger) r3
            java.lang.String r4 = r3.mo24738G0()
            java.lang.String r4 = r6.m19230C(r4)
            java.lang.String r3 = r3.mo25559a1()
            java.lang.String r3 = r6.m19230C(r3)
            boolean r4 = r4.contains(r7)
            if (r4 != 0) goto L_0x0093
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x006b
        L_0x0093:
            r1 = 1
        L_0x0094:
            if (r1 != 0) goto L_0x00c9
            com.arlosoft.macrodroid.macro.Macro r0 = r6.f12490g
            java.util.ArrayList r0 = r0.getActions()
            java.util.Iterator r0 = r0.iterator()
        L_0x00a0:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00c9
            java.lang.Object r3 = r0.next()
            com.arlosoft.macrodroid.action.Action r3 = (com.arlosoft.macrodroid.action.Action) r3
            java.lang.String r4 = r3.mo24738G0()
            java.lang.String r4 = r6.m19230C(r4)
            java.lang.String r3 = r3.mo25559a1()
            java.lang.String r3 = r6.m19230C(r3)
            boolean r4 = r4.contains(r7)
            if (r4 != 0) goto L_0x00c8
            boolean r3 = r3.contains(r7)
            if (r3 == 0) goto L_0x00a0
        L_0x00c8:
            r1 = 1
        L_0x00c9:
            if (r1 != 0) goto L_0x00fe
            com.arlosoft.macrodroid.macro.Macro r0 = r6.f12490g
            java.util.List r0 = r0.getConstraints()
            java.util.Iterator r0 = r0.iterator()
        L_0x00d5:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00fe
            java.lang.Object r3 = r0.next()
            com.arlosoft.macrodroid.constraint.Constraint r3 = (com.arlosoft.macrodroid.constraint.Constraint) r3
            java.lang.String r4 = r3.mo24738G0()
            java.lang.String r4 = r6.m19230C(r4)
            java.lang.String r3 = r3.mo25559a1()
            java.lang.String r3 = r6.m19230C(r3)
            boolean r4 = r4.contains(r7)
            if (r4 != 0) goto L_0x00fd
            boolean r3 = r3.contains(r7)
            if (r3 == 0) goto L_0x00d5
        L_0x00fd:
            r1 = 1
        L_0x00fe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.macrolist.MacroListItem.mo29747j(java.lang.String):boolean");
    }
}
