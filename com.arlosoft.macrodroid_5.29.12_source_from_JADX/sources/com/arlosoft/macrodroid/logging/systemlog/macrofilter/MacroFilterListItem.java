package com.arlosoft.macrodroid.logging.systemlog.macrofilter;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.List;
import p286i9.C12454b;
import p316l9.C15605d;
import p334n9.C15763c;

public class MacroFilterListItem extends C15605d<FilterViewHolder, MacroFilterCategoryHeader> {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Macro f12287g;

    /* renamed from: h */
    private final int f12288h;

    /* renamed from: i */
    private long f12289i = this.f12289i;

    /* renamed from: j */
    private boolean f12290j = this.f12290j;

    /* renamed from: k */
    private boolean f12291k = this.f12291k;

    /* renamed from: l */
    private C4893a f12292l;

    /* renamed from: m */
    private boolean f12293m;

    public class FilterViewHolder extends C15763c {
        @BindView(2131362790)
        CheckBox filterEnabledCheckbox;
        @BindView(2131363103)
        TextView macroName;

        /* renamed from: com.arlosoft.macrodroid.logging.systemlog.macrofilter.MacroFilterListItem$FilterViewHolder$a */
        class C4892a implements CompoundButton.OnCheckedChangeListener {

            /* renamed from: a */
            final /* synthetic */ C4893a f12295a;

            /* renamed from: b */
            final /* synthetic */ MacroFilterListItem f12296b;

            C4892a(C4893a aVar, MacroFilterListItem macroFilterListItem) {
                this.f12295a = aVar;
                this.f12296b = macroFilterListItem;
            }

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (this.f12295a != null) {
                    this.f12296b.mo29478A(z);
                    this.f12295a.mo29486a(Long.valueOf(this.f12296b.f12287g.getGUID()), z);
                }
            }
        }

        public FilterViewHolder(@NonNull View view, @NonNull C12454b bVar) {
            super(view, bVar);
            ButterKnife.bind((Object) this, view);
        }

        /* renamed from: A */
        public void mo29484A(@NonNull MacroFilterListItem macroFilterListItem, @Nullable C4893a aVar, boolean z) {
            this.macroName.setText(macroFilterListItem.f12287g.getName());
            this.filterEnabledCheckbox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.filterEnabledCheckbox.setChecked(z);
            this.filterEnabledCheckbox.setOnCheckedChangeListener(new C4892a(aVar, macroFilterListItem));
        }
    }

    public class FilterViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private FilterViewHolder f12298a;

        @UiThread
        public FilterViewHolder_ViewBinding(FilterViewHolder filterViewHolder, View view) {
            this.f12298a = filterViewHolder;
            filterViewHolder.macroName = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.macroName, "field 'macroName'", TextView.class);
            filterViewHolder.filterEnabledCheckbox = (CheckBox) Utils.findRequiredViewAsType(view, C17532R$id.filterEnabledCheckbox, "field 'filterEnabledCheckbox'", CheckBox.class);
        }

        @CallSuper
        public void unbind() {
            FilterViewHolder filterViewHolder = this.f12298a;
            if (filterViewHolder != null) {
                this.f12298a = null;
                filterViewHolder.macroName = null;
                filterViewHolder.filterEnabledCheckbox = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.macrofilter.MacroFilterListItem$a */
    public interface C4893a {
        /* renamed from: a */
        void mo29486a(Long l, boolean z);
    }

    public MacroFilterListItem(@NonNull MacroFilterCategoryHeader macroFilterCategoryHeader, int i, @NonNull Macro macro, boolean z, @Nullable C4893a aVar) {
        super(macroFilterCategoryHeader);
        this.f12287g = macro;
        this.f12288h = i;
        this.f12293m = z;
        this.f12292l = aVar;
    }

    /* renamed from: A */
    public void mo29478A(boolean z) {
        this.f12293m = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MacroFilterListItem) || this.f12288h != ((MacroFilterListItem) obj).mo29483z()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f12288h;
    }

    /* renamed from: l */
    public int mo29471l() {
        return C17535R$layout.view_macro_filter_entry;
    }

    /* renamed from: x */
    public void mo29469g(C12454b bVar, FilterViewHolder filterViewHolder, int i, List list) {
        filterViewHolder.mo29484A(this, this.f12292l, this.f12293m);
    }

    /* renamed from: y */
    public FilterViewHolder mo29472s(View view, C12454b bVar) {
        return new FilterViewHolder(view, bVar);
    }

    @NonNull
    /* renamed from: z */
    public int mo29483z() {
        return this.f12288h;
    }
}
