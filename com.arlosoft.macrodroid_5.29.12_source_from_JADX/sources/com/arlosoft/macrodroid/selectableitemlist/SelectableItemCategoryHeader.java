package com.arlosoft.macrodroid.selectableitemlist;

import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.StaggeredGridLayoutManager2;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p099h1.C7364d;
import p286i9.C12454b;
import p316l9.C15602a;
import p316l9.C15605d;
import p316l9.C15608g;
import p334n9.C15762b;
import p334n9.C15763c;

/* compiled from: SelectableItemCategoryHeader.kt */
public class SelectableItemCategoryHeader extends C15602a<HeaderViewHolder, C15605d<C15763c, SelectableItemCategoryHeader>> {

    /* renamed from: h */
    private final C7364d f12759h;

    /* renamed from: i */
    private final int f12760i;

    /* renamed from: j */
    private final int f12761j;

    /* compiled from: SelectableItemCategoryHeader.kt */
    public static final class HeaderViewHolder extends C15762b {
        @BindView(2131362030)
        public View background;
        @BindView(2131362188)
        public TextView categoryName;
        @BindView(2131362187)
        public LinearLayout container;
        @BindView(2131362572)
        public View dividerBottom;
        @BindView(2131362574)
        public View dividerTop;
        @BindView(2131362906)
        public ImageView icon;

        /* renamed from: p */
        private final int f12762p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(View view, C12454b<?> bVar, int i) {
            super(view, bVar, false);
            C13706o.m87929f(view, "view");
            C13706o.m87929f(bVar, "adapter");
            this.f12762p = ContextCompat.getColor(this.itemView.getContext(), i);
            ButterKnife.bind((Object) this, view);
        }

        /* renamed from: H */
        public final void mo30032H(C7364d dVar) {
            C13706o.m87929f(dVar, "category");
            mo30033I().setText(dVar.mo37343d());
            mo30033I().setTextColor(this.f12762p);
            mo30035K().setBackgroundColor(this.f12762p);
            mo30035K().setAlpha(0.2f);
            mo30034J().setBackgroundColor(this.f12762p);
            mo30036L().setColorFilter(this.f12762p, PorterDuff.Mode.MULTIPLY);
            mo30036L().setImageResource(dVar.mo37344e());
        }

        /* renamed from: I */
        public final TextView mo30033I() {
            TextView textView = this.categoryName;
            if (textView != null) {
                return textView;
            }
            C13706o.m87945v("categoryName");
            return null;
        }

        /* renamed from: J */
        public final View mo30034J() {
            View view = this.dividerBottom;
            if (view != null) {
                return view;
            }
            C13706o.m87945v("dividerBottom");
            return null;
        }

        /* renamed from: K */
        public final View mo30035K() {
            View view = this.dividerTop;
            if (view != null) {
                return view;
            }
            C13706o.m87945v("dividerTop");
            return null;
        }

        /* renamed from: L */
        public final ImageView mo30036L() {
            ImageView imageView = this.icon;
            if (imageView != null) {
                return imageView;
            }
            C13706o.m87945v("icon");
            return null;
        }
    }

    public final class HeaderViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private HeaderViewHolder f12763a;

        @UiThread
        public HeaderViewHolder_ViewBinding(HeaderViewHolder headerViewHolder, View view) {
            this.f12763a = headerViewHolder;
            headerViewHolder.container = (LinearLayout) Utils.findRequiredViewAsType(view, C17532R$id.category_container, "field 'container'", LinearLayout.class);
            headerViewHolder.categoryName = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.category_name, "field 'categoryName'", TextView.class);
            headerViewHolder.dividerTop = Utils.findRequiredView(view, C17532R$id.divider_top, "field 'dividerTop'");
            headerViewHolder.dividerBottom = Utils.findRequiredView(view, C17532R$id.divider_bottom, "field 'dividerBottom'");
            headerViewHolder.background = Utils.findRequiredView(view, C17532R$id.background, "field 'background'");
            headerViewHolder.icon = (ImageView) Utils.findRequiredViewAsType(view, 2131362906, "field 'icon'", ImageView.class);
        }

        public void unbind() {
            HeaderViewHolder headerViewHolder = this.f12763a;
            if (headerViewHolder != null) {
                this.f12763a = null;
                headerViewHolder.container = null;
                headerViewHolder.categoryName = null;
                headerViewHolder.dividerTop = null;
                headerViewHolder.dividerBottom = null;
                headerViewHolder.background = null;
                headerViewHolder.icon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public SelectableItemCategoryHeader(C7364d dVar, int i, int i2) {
        C13706o.m87929f(dVar, "category");
        this.f12759h = dVar;
        this.f12760i = i;
        this.f12761j = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableItemCategoryHeader) || hashCode() != ((SelectableItemCategoryHeader) obj).hashCode()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f12760i;
    }

    /* renamed from: l */
    public int mo29471l() {
        return C17535R$layout.selectable_item_category;
    }

    /* renamed from: y */
    public void mo29469g(C12454b<C15608g<?>> bVar, HeaderViewHolder headerViewHolder, int i, List<?> list) {
        C13706o.m87929f(bVar, "adapter");
        C13706o.m87929f(headerViewHolder, "holder");
        C13706o.m87929f(list, "payloads");
        headerViewHolder.mo30032H(this.f12759h);
        ViewGroup.LayoutParams layoutParams = headerViewHolder.itemView.getLayoutParams();
        C13706o.m87927d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager2.LayoutParams");
        ((StaggeredGridLayoutManager2.LayoutParams) layoutParams).setFullSpan(true);
    }

    /* renamed from: z */
    public HeaderViewHolder mo29472s(View view, C12454b<C15608g<?>> bVar) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(bVar, "adapter");
        return new HeaderViewHolder(view, bVar, this.f12761j);
    }
}
