package com.arlosoft.macrodroid.selectableitemlist;

import android.animation.LayoutTransition;
import android.content.Context;
import android.text.util.Linkify;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p286i9.C12454b;
import p316l9.C15605d;
import p316l9.C15607f;
import p316l9.C15608g;
import p334n9.C15763c;

/* compiled from: SelectableItemListItem.kt */
public class SelectableItemListItem extends C15605d<C15763c, SelectableItemCategoryHeader> implements C15607f<String> {

    /* renamed from: g */
    private final Context f12764g;

    /* renamed from: h */
    private final int f12765h;

    /* renamed from: i */
    private final C4001c1 f12766i;

    /* renamed from: j */
    private final C5099g f12767j;

    /* renamed from: k */
    private final C5090a f12768k;

    /* renamed from: l */
    private final boolean f12769l;

    /* compiled from: SelectableItemListItem.kt */
    public static final class ViewHolder extends C15763c {
        @BindView(2131362381)
        public CardView background;
        @BindView(2131363735)
        public ImageView constraintIcon;
        @BindView(2131363738)
        public TextView constraintName;
        @BindView(2131363739)
        public ViewGroup frame;
        @BindView(2131363734)
        public TextView helpText;
        @BindView(2131363737)
        public TextView infoLabel;

        /* renamed from: p */
        private final C5099g f12770p;

        /* renamed from: s */
        private final C5090a f12771s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view, C12454b<?> bVar, C5099g gVar, C5090a aVar) {
            super(view, bVar);
            C13706o.m87929f(view, "itemView");
            C13706o.m87929f(bVar, "adapter");
            C13706o.m87929f(aVar, "optionsProvider");
            this.f12770p = gVar;
            this.f12771s = aVar;
            ButterKnife.bind((Object) this, view);
        }

        /* access modifiers changed from: private */
        /* renamed from: E */
        public static final void m19649E(ViewHolder viewHolder, C4001c1 c1Var, View view) {
            C13706o.m87929f(viewHolder, "this$0");
            C13706o.m87929f(c1Var, "$selectableItemInfo");
            C5099g gVar = viewHolder.f12770p;
            if (gVar != null) {
                gVar.mo30006v1(c1Var);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: F */
        public static final boolean m19650F(ViewHolder viewHolder, C4001c1 c1Var, View view) {
            C13706o.m87929f(viewHolder, "this$0");
            C13706o.m87929f(c1Var, "$selectableItemInfo");
            C5099g gVar = viewHolder.f12770p;
            if (gVar == null) {
                return true;
            }
            gVar.mo30017I(c1Var);
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: G */
        public static final void m19651G(ViewHolder viewHolder, C4001c1 c1Var, View view) {
            C13706o.m87929f(viewHolder, "this$0");
            C13706o.m87929f(c1Var, "$selectableItemInfo");
            C5099g gVar = viewHolder.f12770p;
            if (gVar != null) {
                gVar.mo30006v1(c1Var);
            }
        }

        /* renamed from: D */
        public final void mo30043D(C4001c1 c1Var, boolean z) {
            C13706o.m87929f(c1Var, "selectableItemInfo");
            mo30047K().getX();
            Context context = mo75399t().getContext();
            mo30047K().setOnClickListener(new C5101i(this, c1Var));
            mo30047K().setOnLongClickListener(new C5103k(this, c1Var));
            mo30046J().setText(c1Var.mo27893k());
            mo30045I().setImageDrawable(ContextCompat.getDrawable(context, c1Var.mo27892g()));
            if (z) {
                mo30044H().setCardBackgroundColor(ContextCompat.getColor(context, C17528R$color.condition_primary));
            } else {
                mo30044H().setCardBackgroundColor(ContextCompat.getColor(context, c1Var.mo26465i(false)));
            }
            mo30049M().setText("");
            if (c1Var.mo27899q()) {
                mo30049M().setVisibility(0);
                if (!c1Var.mo27902t()) {
                    mo30049M().setText(C17541R$string.root_only);
                } else if (C5163j2.m20304y1(context)) {
                    mo30049M().setText(C17541R$string.root_or_adb_hack);
                } else {
                    mo30049M().setText(C17541R$string.adb_hack);
                }
            } else if (c1Var.mo27897o()) {
                mo30049M().setText(this.itemView.getContext().getText(C17541R$string.experimental));
                mo30049M().setVisibility(0);
            } else if (c1Var.mo27896n()) {
                mo30049M().setText(this.itemView.getContext().getText(C17541R$string.feature_beta_label));
                mo30049M().setVisibility(0);
            } else {
                mo30049M().setVisibility(8);
            }
            if (this.f12771s.mo30018Y0()) {
                mo30047K().setLayoutTransition(C5104l.f12809a);
                mo30048L().setVisibility(0);
                mo30048L().setText(c1Var.mo27891f());
                Linkify.addLinks(mo30048L(), 15);
                mo30048L().setOnClickListener(new C5102j(this, c1Var));
                return;
            }
            mo30047K().setLayoutTransition((LayoutTransition) null);
            mo30048L().setVisibility(8);
        }

        /* renamed from: H */
        public final CardView mo30044H() {
            CardView cardView = this.background;
            if (cardView != null) {
                return cardView;
            }
            C13706o.m87945v("background");
            return null;
        }

        /* renamed from: I */
        public final ImageView mo30045I() {
            ImageView imageView = this.constraintIcon;
            if (imageView != null) {
                return imageView;
            }
            C13706o.m87945v("constraintIcon");
            return null;
        }

        /* renamed from: J */
        public final TextView mo30046J() {
            TextView textView = this.constraintName;
            if (textView != null) {
                return textView;
            }
            C13706o.m87945v("constraintName");
            return null;
        }

        /* renamed from: K */
        public final ViewGroup mo30047K() {
            ViewGroup viewGroup = this.frame;
            if (viewGroup != null) {
                return viewGroup;
            }
            C13706o.m87945v(TypedValues.Attributes.S_FRAME);
            return null;
        }

        /* renamed from: L */
        public final TextView mo30048L() {
            TextView textView = this.helpText;
            if (textView != null) {
                return textView;
            }
            C13706o.m87945v("helpText");
            return null;
        }

        /* renamed from: M */
        public final TextView mo30049M() {
            TextView textView = this.infoLabel;
            if (textView != null) {
                return textView;
            }
            C13706o.m87945v("infoLabel");
            return null;
        }
    }

    public final class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f12772a;

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f12772a = viewHolder;
            viewHolder.frame = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.select_item_row_frame, "field 'frame'", ViewGroup.class);
            viewHolder.constraintName = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.select_item_name, "field 'constraintName'", TextView.class);
            viewHolder.infoLabel = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.select_item_info_label, "field 'infoLabel'", TextView.class);
            viewHolder.constraintIcon = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.select_item_icon, "field 'constraintIcon'", ImageView.class);
            viewHolder.helpText = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.select_item_help, "field 'helpText'", TextView.class);
            viewHolder.background = (CardView) Utils.findRequiredViewAsType(view, 2131362381, "field 'background'", CardView.class);
        }

        public void unbind() {
            ViewHolder viewHolder = this.f12772a;
            if (viewHolder != null) {
                this.f12772a = null;
                viewHolder.frame = null;
                viewHolder.constraintName = null;
                viewHolder.infoLabel = null;
                viewHolder.constraintIcon = null;
                viewHolder.helpText = null;
                viewHolder.background = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.selectableitemlist.SelectableItemListItem$a */
    /* compiled from: SelectableItemListItem.kt */
    public interface C5090a {
        /* renamed from: Y0 */
        boolean mo30018Y0();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectableItemListItem(Context context, SelectableItemCategoryHeader selectableItemCategoryHeader, int i, C4001c1 c1Var, C5099g gVar, C5090a aVar, boolean z, int i2, C13695i iVar) {
        this(context, selectableItemCategoryHeader, i, c1Var, gVar, aVar, (i2 & 64) != 0 ? false : z);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SelectableItemListItem) || this.f12765h != ((SelectableItemListItem) obj).mo30042z()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f12765h;
    }

    /* renamed from: l */
    public int mo29471l() {
        return C17535R$layout.select_item_box;
    }

    /* renamed from: w */
    public void mo29469g(C12454b<C15608g<?>> bVar, C15763c cVar, int i, List<?> list) {
        C13706o.m87929f(bVar, "adapter");
        C13706o.m87929f(cVar, "holder");
        C13706o.m87929f(list, "payloads");
        bVar.mo68886e1(i);
        C13706o.m87928e(bVar.mo68869U0(), "adapter.currentItems");
        C4001c1 c1Var = this.f12766i;
        C13706o.m87926c(c1Var);
        ((ViewHolder) cVar).mo30043D(c1Var, this.f12769l);
    }

    /* renamed from: x */
    public ViewHolder mo29472s(View view, C12454b<C15608g<?>> bVar) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(bVar, "adapter");
        return new ViewHolder(view, bVar, this.f12767j, this.f12768k);
    }

    /* renamed from: y */
    public boolean mo29747j(String str) {
        C13706o.m87929f(str, "filterText");
        C4001c1 c1Var = this.f12766i;
        C13706o.m87926c(c1Var);
        List<Integer> m = c1Var.mo27895m();
        ArrayList arrayList = new ArrayList();
        for (T next : m) {
            String string = this.f12764g.getString(((Number) next).intValue());
            C13706o.m87928e(string, "context.getString(it)");
            Locale locale = Locale.ROOT;
            String lowerCase = string.toLowerCase(locale);
            C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String lowerCase2 = str.toLowerCase(locale);
            C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (C15177w.m93663N(lowerCase, lowerCase2, false, 2, (Object) null)) {
                arrayList.add(next);
            }
        }
        return C13566b0.m87410M(arrayList);
    }

    /* renamed from: z */
    public final int mo30042z() {
        return this.f12765h;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectableItemListItem(Context context, SelectableItemCategoryHeader selectableItemCategoryHeader, int i, C4001c1 c1Var, C5099g gVar, C5090a aVar, boolean z) {
        super(selectableItemCategoryHeader);
        C13706o.m87929f(context, "context");
        C13706o.m87929f(selectableItemCategoryHeader, "header");
        C13706o.m87929f(gVar, "itemChosenListener");
        C13706o.m87929f(aVar, "optionsProvider");
        this.f12764g = context;
        this.f12765h = i;
        this.f12766i = c1Var;
        this.f12767j = gVar;
        this.f12768k = aVar;
        this.f12769l = z;
    }
}
