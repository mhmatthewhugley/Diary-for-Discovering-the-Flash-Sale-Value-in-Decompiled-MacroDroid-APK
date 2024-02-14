package com.arlosoft.macrodroid.selectableitemlist.classic;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.selectableitemlist.C5099g;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.WidgetPressedTrigger;
import com.arlosoft.macrodroid.widget.AddSelectableItemInfoCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p168t2.C17453d;
import p168t2.C17454e;
import p168t2.C17455f;

public abstract class SelectableItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements Filterable {

    /* renamed from: A */
    private final boolean f12780A;

    /* renamed from: B */
    protected boolean f12781B;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public List<C4001c1> f12782a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C4001c1> f12783c;

    /* renamed from: d */
    private boolean f12784d;

    /* renamed from: f */
    private LayoutTransition f12785f = new LayoutTransition();

    /* renamed from: g */
    private C5099g f12786g;

    /* renamed from: o */
    protected boolean f12787o;

    /* renamed from: p */
    protected final Macro f12788p;

    /* renamed from: s */
    protected final Activity f12789s;

    /* renamed from: z */
    private final int f12790z;

    static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131363731)
        TextView experimentalLabel1;
        @BindView(2131363739)
        ViewGroup frame;
        @BindView(2131363733)
        ViewGroup headingContainer;
        @BindView(2131363732)
        TextView headingText;
        @BindView(2131363734)
        TextView helpText;
        @BindView(2131363735)
        ImageView icon;
        @BindView(2131363736)
        View iconBackground;
        @BindView(2131363738)
        TextView itemName;
        @BindView(2131363737)
        TextView rootOnlyLabel;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f12791a;

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f12791a = viewHolder;
            viewHolder.frame = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.select_item_row_frame, "field 'frame'", ViewGroup.class);
            viewHolder.itemName = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.select_item_name, "field 'itemName'", TextView.class);
            viewHolder.rootOnlyLabel = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.select_item_info_label, "field 'rootOnlyLabel'", TextView.class);
            viewHolder.experimentalLabel1 = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.select_item_experimental_label_1, "field 'experimentalLabel1'", TextView.class);
            viewHolder.icon = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.select_item_icon, "field 'icon'", ImageView.class);
            viewHolder.helpText = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.select_item_help, "field 'helpText'", TextView.class);
            viewHolder.iconBackground = Utils.findRequiredView(view, C17532R$id.select_item_icon_background, "field 'iconBackground'");
            viewHolder.headingContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.select_item_heading_container, "field 'headingContainer'", ViewGroup.class);
            viewHolder.headingText = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.select_item_heading, "field 'headingText'", TextView.class);
        }

        @CallSuper
        public void unbind() {
            ViewHolder viewHolder = this.f12791a;
            if (viewHolder != null) {
                this.f12791a = null;
                viewHolder.frame = null;
                viewHolder.itemName = null;
                viewHolder.rootOnlyLabel = null;
                viewHolder.experimentalLabel1 = null;
                viewHolder.icon = null;
                viewHolder.helpText = null;
                viewHolder.iconBackground = null;
                viewHolder.headingContainer = null;
                viewHolder.headingText = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.selectableitemlist.classic.SelectableItemAdapter$a */
    class C5094a extends Filter {
        C5094a() {
        }

        /* access modifiers changed from: protected */
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = new ArrayList();
            String lowerCase = charSequence.toString().toLowerCase();
            for (int i = 0; i < SelectableItemAdapter.this.f12783c.size(); i++) {
                C4001c1 c1Var = (C4001c1) SelectableItemAdapter.this.f12783c.get(i);
                for (Integer intValue : c1Var.mo27895m()) {
                    int intValue2 = intValue.intValue();
                    SelectableItemAdapter.this.f12789s.getString(intValue2);
                    if (SelectableItemAdapter.this.f12789s.getString(intValue2).toLowerCase().contains(lowerCase.toString().toLowerCase()) && !arrayList.contains(c1Var)) {
                        arrayList.add(c1Var);
                    }
                }
            }
            filterResults.count = arrayList.size();
            filterResults.values = arrayList;
            return filterResults;
        }

        /* access modifiers changed from: protected */
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            List unused = SelectableItemAdapter.this.f12782a = (List) filterResults.values;
            SelectableItemAdapter.this.notifyDataSetChanged();
        }
    }

    public SelectableItemAdapter(Activity activity, Macro macro, boolean z, @NonNull C5099g gVar, int i, boolean z2) {
        setHasStableIds(true);
        this.f12789s = activity;
        this.f12788p = macro;
        this.f12787o = z;
        this.f12786g = gVar;
        this.f12790z = i;
        this.f12780A = z2;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m19668I() {
        this.f12787o = false;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m19669J(C4001c1 c1Var, View view) {
        C5099g gVar = this.f12786g;
        if (gVar != null) {
            gVar.mo30006v1(c1Var);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ boolean m19670K(C4001c1 c1Var, View view) {
        C5099g gVar = this.f12786g;
        if (gVar == null) {
            return true;
        }
        gVar.mo30017I(c1Var);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract List<C4001c1> mo30053G();

    /* access modifiers changed from: protected */
    @DrawableRes
    /* renamed from: H */
    public abstract int mo30054H();

    /* renamed from: L */
    public void mo30055L(boolean z) {
        this.f12784d = z;
        notifyDataSetChanged();
    }

    public Filter getFilter() {
        return new C5094a();
    }

    public int getItemCount() {
        return this.f12782a.size() + (this.f12787o ? 1 : 0);
    }

    public long getItemId(int i) {
        return this.f12787o ? (long) i : (long) (i + 1);
    }

    public int getItemViewType(int i) {
        return (!this.f12787o || i != 0) ? 1 : 0;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof AddSelectableItemInfoCard.ViewHolder) {
            AddSelectableItemInfoCard.m25103d(this.f12789s, (AddSelectableItemInfoCard.ViewHolder) viewHolder, this.f12790z, this.f12780A, new C17455f(this));
            return;
        }
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        C4001c1 c1Var = this.f12782a.get(i - (this.f12787o ? 1 : 0));
        viewHolder2.frame.setOnClickListener(new C17453d(this, c1Var));
        viewHolder2.frame.setOnLongClickListener(new C17454e(this, c1Var));
        viewHolder2.itemName.setText(c1Var.mo27893k());
        viewHolder2.icon.setImageDrawable(this.f12789s.getResources().getDrawable(c1Var.mo27892g()));
        viewHolder2.iconBackground.setBackgroundResource(mo30054H());
        if (c1Var.mo27899q()) {
            viewHolder2.rootOnlyLabel.setVisibility(0);
            if (c1Var.mo27902t()) {
                viewHolder2.rootOnlyLabel.setText(C17541R$string.root_or_adb_hack);
            } else {
                viewHolder2.rootOnlyLabel.setText(C17541R$string.root_only);
            }
        } else {
            viewHolder2.rootOnlyLabel.setVisibility(8);
        }
        if (c1Var.mo27898p()) {
            viewHolder2.rootOnlyLabel.setVisibility(0);
            viewHolder2.rootOnlyLabel.setText(C17541R$string.pro_version_only_short);
        }
        if (c1Var.mo27897o()) {
            viewHolder2.experimentalLabel1.setText(C17541R$string.experimental);
            viewHolder2.experimentalLabel1.setVisibility(0);
        } else if (c1Var.mo27896n()) {
            viewHolder2.experimentalLabel1.setText(C17541R$string.feature_beta_label);
            viewHolder2.experimentalLabel1.setVisibility(0);
        } else {
            viewHolder2.experimentalLabel1.setVisibility(8);
        }
        if (this.f12784d) {
            viewHolder2.frame.setLayoutTransition(this.f12785f);
            viewHolder2.helpText.setVisibility(0);
            Linkify.addLinks(viewHolder2.helpText, 15);
            viewHolder2.helpText.setText(c1Var.mo27891f());
            return;
        }
        viewHolder2.frame.setLayoutTransition((LayoutTransition) null);
        viewHolder2.helpText.setVisibility(8);
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.select_item_row, viewGroup, false));
        }
        return new AddSelectableItemInfoCard.ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.info_card, viewGroup, false));
    }

    public void refresh() {
        this.f12782a = mo30053G();
        Iterator<Trigger> it = this.f12788p.getTriggerList().iterator();
        int i = -1;
        while (it.hasNext()) {
            if (it.next() instanceof WidgetPressedTrigger) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f12782a.size()) {
                        break;
                    } else if (this.f12782a.get(i2).mo27893k() == 2131955517) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        if (i >= 0) {
            this.f12782a.remove(i);
        }
        this.f12783c = new ArrayList(this.f12782a);
        notifyDataSetChanged();
    }
}
