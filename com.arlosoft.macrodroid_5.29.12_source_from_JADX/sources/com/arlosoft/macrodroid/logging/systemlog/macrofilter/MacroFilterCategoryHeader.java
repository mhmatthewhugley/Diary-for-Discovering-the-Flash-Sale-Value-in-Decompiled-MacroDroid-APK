package com.arlosoft.macrodroid.logging.systemlog.macrofilter;

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

public class MacroFilterCategoryHeader extends C15602a<HeaderViewHolder, MacroFilterListItem> {

    /* renamed from: h */
    private final Category f12276h;

    /* renamed from: i */
    private final C4891a f12277i;

    /* renamed from: j */
    private final View.OnLongClickListener f12278j;

    /* renamed from: k */
    private final int f12279k;

    /* renamed from: l */
    private boolean f12280l;

    /* renamed from: m */
    private boolean f12281m;

    /* renamed from: n */
    private boolean f12282n;

    /* renamed from: o */
    private CompoundButton.OnCheckedChangeListener f12283o;

    /* renamed from: p */
    private C7328a f12284p;

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
        private C7328a f12285p;

        public HeaderViewHolder(@NonNull View view, @NonNull C12454b bVar, C7328a aVar) {
            super(view, bVar, false);
            ButterKnife.bind((Object) this, view);
            this.f12285p = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: F */
        public boolean mo29475F() {
            return true;
        }

        /* renamed from: I */
        public void mo29476I(@NonNull Category category, boolean z, boolean z2, int i, boolean z3, @NonNull C4891a aVar, @Nullable View.OnLongClickListener onLongClickListener, @Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener, MacroFilterCategoryHeader macroFilterCategoryHeader) {
            int b = this.f12285p.mo37294b(category.getColor());
            this.onOffButton.setOffColor(C6415p.m24699a(this.itemView.getContext(), b));
            TextView textView = this.categoryTitle;
            textView.setText(category.getName() + " (" + i + ")");
            this.categoryContainer.setBackgroundColor(b);
            this.categoryContainer.setOnClickListener(new C4894a(aVar, macroFilterCategoryHeader));
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
        private HeaderViewHolder f12286a;

        @UiThread
        public HeaderViewHolder_ViewBinding(HeaderViewHolder headerViewHolder, View view) {
            this.f12286a = headerViewHolder;
            headerViewHolder.categoryContainer = Utils.findRequiredView(view, C17532R$id.category_container, "field 'categoryContainer'");
            headerViewHolder.categoryTitle = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.group_title, "field 'categoryTitle'", TextView.class);
            headerViewHolder.onOffButton = (SwitchPlus) Utils.findRequiredViewAsType(view, C17532R$id.group_on_off_button, "field 'onOffButton'", SwitchPlus.class);
            headerViewHolder.lockImage = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.lockImage, "field 'lockImage'", ImageView.class);
        }

        @CallSuper
        public void unbind() {
            HeaderViewHolder headerViewHolder = this.f12286a;
            if (headerViewHolder != null) {
                this.f12286a = null;
                headerViewHolder.categoryContainer = null;
                headerViewHolder.categoryTitle = null;
                headerViewHolder.onOffButton = null;
                headerViewHolder.lockImage = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.macrofilter.MacroFilterCategoryHeader$a */
    public interface C4891a {
        /* renamed from: a */
        void mo29477a(MacroFilterCategoryHeader macroFilterCategoryHeader);
    }

    public MacroFilterCategoryHeader(@NonNull Category category, int i, boolean z, boolean z2, boolean z3, @Nullable C4891a aVar, @Nullable View.OnLongClickListener onLongClickListener, C7328a aVar2) {
        this.f12276h = category;
        this.f12279k = i;
        this.f12282n = z2;
        this.f12281m = z3;
        this.f12277i = aVar;
        this.f12278j = onLongClickListener;
        this.f12280l = z;
        this.f12284p = aVar2;
        mo74945i(category.isExpanded());
    }

    /* renamed from: A */
    private int m18886A() {
        return this.f12279k;
    }

    /* renamed from: C */
    private int m18887C() {
        List<MacroFilterListItem> n = mo74946n();
        int i = 0;
        if (n != null) {
            for (MacroFilterListItem d : n) {
                i += d.mo74951d() ^ true ? 1 : 0;
            }
        }
        return i;
    }

    /* renamed from: B */
    public HeaderViewHolder mo29472s(View view, C12454b bVar) {
        return new HeaderViewHolder(view, bVar, this.f12284p);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MacroFilterCategoryHeader) || this.f12279k != ((MacroFilterCategoryHeader) obj).m18886A()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f12279k;
    }

    /* renamed from: l */
    public int mo29471l() {
        return C17535R$layout.group_item;
    }

    /* renamed from: y */
    public void mo29469g(C12454b bVar, HeaderViewHolder headerViewHolder, int i, List list) {
        headerViewHolder.mo29476I(this.f12276h, this.f12280l, this.f12282n, m18887C(), this.f12281m, this.f12277i, this.f12278j, this.f12283o, this);
    }

    /* renamed from: z */
    public Category mo29474z() {
        return this.f12276h;
    }
}
