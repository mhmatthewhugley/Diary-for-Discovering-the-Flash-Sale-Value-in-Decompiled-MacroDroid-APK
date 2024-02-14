package com.arlosoft.macrodroid.macrolist;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.utils.C6415p;
import com.arlosoft.macrodroid.widget.SwitchPlus;
import java.util.List;
import p093g2.C7328a;
import p286i9.C12454b;
import p316l9.C15602a;
import p334n9.C15762b;

public class MacroListCategoryHeader extends C15602a<HeaderViewHolder, MacroListItem> {

    /* renamed from: h */
    private final Category f12412h;

    /* renamed from: i */
    private final C4940a f12413i;

    /* renamed from: j */
    private final View.OnLongClickListener f12414j;

    /* renamed from: k */
    private final int f12415k;

    /* renamed from: l */
    private boolean f12416l;

    /* renamed from: m */
    private boolean f12417m;

    /* renamed from: n */
    private boolean f12418n;

    /* renamed from: o */
    private CompoundButton.OnCheckedChangeListener f12419o;

    /* renamed from: p */
    private C7328a f12420p;

    static class HeaderViewHolder extends C15762b {
        @BindView(2131362187)
        View categoryContainer;
        @BindView(2131362859)
        TextView categoryTitle;
        @BindView(2131363075)
        ImageView lockImage;
        @BindView(2131362858)
        SwitchPlus onOffButton;

        /* renamed from: p */
        private C7328a f12421p;

        public HeaderViewHolder(@NonNull View view, @NonNull C12454b bVar, C7328a aVar) {
            super(view, bVar, false);
            ButterKnife.bind((Object) this, view);
            this.f12421p = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: F */
        public boolean mo29475F() {
            return true;
        }

        /* renamed from: I */
        public void mo29721I(@NonNull Category category, boolean z, boolean z2, int i, boolean z3, @NonNull C4940a aVar, @Nullable View.OnLongClickListener onLongClickListener, @Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener, MacroListCategoryHeader macroListCategoryHeader) {
            int b = this.f12421p.mo37294b(category.getColor());
            this.onOffButton.setOffColor(C6415p.m24699a(this.itemView.getContext(), b));
            TextView textView = this.categoryTitle;
            textView.setText(category.getName() + " (" + i + ")");
            this.categoryContainer.setBackgroundColor(b);
            this.categoryContainer.setOnClickListener(new C4960a(aVar, macroListCategoryHeader));
            this.categoryContainer.setOnLongClickListener(onLongClickListener);
            this.onOffButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.onOffButton.setChecked(z);
            this.onOffButton.setOnCheckedChangeListener(onCheckedChangeListener);
            int i2 = 0;
            this.onOffButton.setVisibility(z2 ? 0 : 8);
            ImageView imageView = this.lockImage;
            if (!category.isLocked()) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            this.lockImage.setImageResource(z3 ? C17530R$drawable.ic_lock_open_outline_white_24dp : C17530R$drawable.ic_lock_white_24dp);
        }
    }

    public class HeaderViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private HeaderViewHolder f12422a;

        @UiThread
        public HeaderViewHolder_ViewBinding(HeaderViewHolder headerViewHolder, View view) {
            this.f12422a = headerViewHolder;
            headerViewHolder.categoryContainer = Utils.findRequiredView(view, C17532R$id.category_container, "field 'categoryContainer'");
            headerViewHolder.categoryTitle = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.group_title, "field 'categoryTitle'", TextView.class);
            headerViewHolder.onOffButton = (SwitchPlus) Utils.findRequiredViewAsType(view, C17532R$id.group_on_off_button, "field 'onOffButton'", SwitchPlus.class);
            headerViewHolder.lockImage = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.lockImage, "field 'lockImage'", ImageView.class);
        }

        @CallSuper
        public void unbind() {
            HeaderViewHolder headerViewHolder = this.f12422a;
            if (headerViewHolder != null) {
                this.f12422a = null;
                headerViewHolder.categoryContainer = null;
                headerViewHolder.categoryTitle = null;
                headerViewHolder.onOffButton = null;
                headerViewHolder.lockImage = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macrolist.MacroListCategoryHeader$a */
    public interface C4940a {
        /* renamed from: a */
        void mo29313a(MacroListCategoryHeader macroListCategoryHeader);
    }

    public MacroListCategoryHeader(@NonNull Category category, int i, boolean z, boolean z2, boolean z3, @Nullable C4940a aVar, @Nullable View.OnLongClickListener onLongClickListener, C7328a aVar2) {
        this.f12412h = category;
        this.f12415k = i;
        this.f12418n = z2;
        this.f12417m = z3;
        this.f12413i = aVar;
        this.f12414j = onLongClickListener;
        this.f12416l = z;
        this.f12420p = aVar2;
        mo74945i(category.isExpanded());
    }

    /* renamed from: A */
    private int m19071A() {
        return this.f12415k;
    }

    /* renamed from: C */
    private int m19072C() {
        List<MacroListItem> n = mo74946n();
        int i = 0;
        if (n != null) {
            for (MacroListItem d : n) {
                i += d.mo74951d() ^ true ? 1 : 0;
            }
        }
        return i;
    }

    /* renamed from: B */
    public HeaderViewHolder mo29472s(View view, C12454b bVar) {
        return new HeaderViewHolder(view, bVar, this.f12420p);
    }

    /* renamed from: D */
    public void mo29714D(boolean z) {
        this.f12416l = z;
    }

    /* renamed from: E */
    public void mo29715E(boolean z) {
        this.f12417m = z;
    }

    /* renamed from: F */
    public void mo29716F(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f12419o = onCheckedChangeListener;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MacroListCategoryHeader) || this.f12415k != ((MacroListCategoryHeader) obj).m19071A()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f12415k;
    }

    /* renamed from: l */
    public int mo29471l() {
        return C17535R$layout.group_item;
    }

    /* renamed from: y */
    public void mo29469g(C12454b bVar, HeaderViewHolder headerViewHolder, int i, List list) {
        headerViewHolder.mo29721I(this.f12412h, this.f12416l, this.f12418n, m19072C(), this.f12417m, this.f12413i, this.f12414j, this.f12419o, this);
    }

    /* renamed from: z */
    public Category mo29720z() {
        return this.f12412h;
    }
}
