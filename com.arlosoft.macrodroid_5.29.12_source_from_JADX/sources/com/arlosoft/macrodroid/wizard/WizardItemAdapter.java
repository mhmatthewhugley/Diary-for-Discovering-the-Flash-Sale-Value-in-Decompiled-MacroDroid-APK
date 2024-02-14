package com.arlosoft.macrodroid.wizard;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.selectableitemlist.C5099g;
import com.arlosoft.macrodroid.triggers.WidgetPressedTrigger;
import com.arlosoft.macrodroid.utils.C6396j1;
import com.arlosoft.macrodroid.widget.AddSelectableItemInfoCard;
import java.util.ArrayList;
import java.util.List;
import p236d4.C11950o;
import p236d4.C11951p;
import p236d4.C11952q;
import p236d4.C11953r;

public class WizardItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements Filterable {

    /* renamed from: A */
    private List<? extends SelectableItem> f15467A = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Activity f15468a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C4001c1> f15469c;

    /* renamed from: d */
    private final Macro f15470d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<C4001c1> f15471f;

    /* renamed from: g */
    private boolean f15472g;

    /* renamed from: o */
    private boolean f15473o;

    /* renamed from: p */
    private int f15474p;

    /* renamed from: s */
    private C5099g f15475s;

    /* renamed from: z */
    private LayoutTransition f15476z = new LayoutTransition();

    static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131363731)
        TextView experimentalLabel1;
        @BindView(2131363739)
        ViewGroup frame;
        @BindView(2131363734)
        TextView helpText;
        @BindView(2131363736)
        View iconBackground;
        @BindView(2131363737)
        TextView rootOnlyLabel;
        @BindView(2131363735)
        ImageView triggerIcon;
        @BindView(2131363738)
        TextView triggerName;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f15477a;

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f15477a = viewHolder;
            viewHolder.frame = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.select_item_row_frame, "field 'frame'", ViewGroup.class);
            viewHolder.triggerName = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.select_item_name, "field 'triggerName'", TextView.class);
            viewHolder.rootOnlyLabel = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.select_item_info_label, "field 'rootOnlyLabel'", TextView.class);
            viewHolder.experimentalLabel1 = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.select_item_experimental_label_1, "field 'experimentalLabel1'", TextView.class);
            viewHolder.iconBackground = Utils.findRequiredView(view, C17532R$id.select_item_icon_background, "field 'iconBackground'");
            viewHolder.triggerIcon = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.select_item_icon, "field 'triggerIcon'", ImageView.class);
            viewHolder.helpText = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.select_item_help, "field 'helpText'", TextView.class);
        }

        @CallSuper
        public void unbind() {
            ViewHolder viewHolder = this.f15477a;
            if (viewHolder != null) {
                this.f15477a = null;
                viewHolder.frame = null;
                viewHolder.triggerName = null;
                viewHolder.rootOnlyLabel = null;
                viewHolder.experimentalLabel1 = null;
                viewHolder.iconBackground = null;
                viewHolder.triggerIcon = null;
                viewHolder.helpText = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.wizard.WizardItemAdapter$a */
    class C6655a extends Filter {
        C6655a() {
        }

        /* access modifiers changed from: protected */
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = new ArrayList();
            String lowerCase = charSequence.toString().toLowerCase();
            for (int i = 0; i < WizardItemAdapter.this.f15471f.size(); i++) {
                C4001c1 c1Var = (C4001c1) WizardItemAdapter.this.f15471f.get(i);
                if (TextUtils.isEmpty(lowerCase) || WizardItemAdapter.this.f15468a.getString(c1Var.mo27893k()).toLowerCase().contains(lowerCase)) {
                    arrayList.add(c1Var);
                }
            }
            filterResults.count = arrayList.size();
            filterResults.values = arrayList;
            return filterResults;
        }

        /* access modifiers changed from: protected */
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            List unused = WizardItemAdapter.this.f15469c = (List) filterResults.values;
            WizardItemAdapter.this.notifyDataSetChanged();
        }
    }

    public WizardItemAdapter(Activity activity, Macro macro, boolean z, int i, List<C4001c1> list, C5099g gVar) {
        setHasStableIds(true);
        this.f15468a = activity;
        this.f15470d = macro;
        this.f15473o = z;
        this.f15474p = i;
        this.f15469c = list;
        this.f15475s = gVar;
        this.f15471f = new ArrayList(this.f15469c);
    }

    /* renamed from: I */
    private void m25206I(AddSelectableItemInfoCard.ViewHolder viewHolder) {
        AddSelectableItemInfoCard.m25103d(this.f15468a, viewHolder, this.f15474p, false, new C11953r(this));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewHolder.cardView.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.getMarginStart(), marginLayoutParams.topMargin, marginLayoutParams.getMarginEnd(), 0);
        viewHolder.cardView.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: J */
    private void m25207J(C4001c1 c1Var) {
        this.f15475s.mo30006v1(c1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m25208K() {
        this.f15473o = false;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m25209L(C4001c1 c1Var, View view) {
        m25207J(c1Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ boolean m25211N(C4001c1 c1Var, View view) {
        Activity activity = this.f15468a;
        int a = C6396j1.m24653a(c1Var.mo26466j());
        this.f15474p = a;
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, a);
        builder.setTitle(c1Var.mo27893k());
        if (c1Var.mo27902t()) {
            Activity activity2 = this.f15468a;
            builder.setMessage((CharSequence) C4061t1.m16007n(activity2, activity2.getString(c1Var.mo27891f())));
        } else {
            builder.setMessage(c1Var.mo27891f());
        }
        builder.setNegativeButton(17039370, (DialogInterface.OnClickListener) C11950o.f58137a);
        C4061t1.m16026w0(builder.show());
        return true;
    }

    /* renamed from: O */
    public void mo32952O(List<C4001c1> list, List<? extends SelectableItem> list2) {
        int i = -1;
        for (SelectableItem selectableItem : list2) {
            if (selectableItem instanceof WidgetPressedTrigger) {
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    } else if (list.get(i2).mo27893k() == 2131955517) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        if (i >= 0) {
            list.remove(i);
        }
        this.f15469c = list;
        this.f15471f = new ArrayList(this.f15469c);
        this.f15467A = list2;
        if (i >= 0) {
            notifyDataSetChanged();
        } else {
            notifyItemChanged(this.f15473o ? 1 : 0);
        }
    }

    /* renamed from: P */
    public void mo32953P() {
        this.f15472g = !this.f15472g;
        notifyDataSetChanged();
    }

    public Filter getFilter() {
        return new C6655a();
    }

    public int getItemCount() {
        return this.f15469c.size() + 1 + (this.f15473o ? 1 : 0);
    }

    public long getItemId(int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            return 0;
        }
        if (itemViewType != 2) {
            return (long) ((i - (this.f15473o ? 1 : 0)) + 100);
        }
        return 1;
    }

    public int getItemViewType(int i) {
        boolean z = this.f15473o;
        if (z && i == 0) {
            return 0;
        }
        if (!z || i != 1) {
            return (z || i != 0) ? 1 : 2;
        }
        return 2;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            m25206I((AddSelectableItemInfoCard.ViewHolder) viewHolder);
        } else if (itemViewType == 2) {
            ((AddedItemViewHolder) viewHolder).mo32920w(this.f15467A);
        } else {
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            C4001c1 c1Var = this.f15469c.get((i - (this.f15473o ? 1 : 0)) - 1);
            viewHolder2.frame.setOnClickListener(new C11951p(this, c1Var));
            viewHolder2.frame.setOnLongClickListener(new C11952q(this, c1Var));
            viewHolder2.triggerName.setText(c1Var.mo27893k());
            viewHolder2.triggerIcon.setImageDrawable(this.f15468a.getResources().getDrawable(c1Var.mo27892g()));
            viewHolder2.iconBackground.setBackgroundResource(c1Var.mo26464h(false));
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
            if (c1Var.mo27897o()) {
                viewHolder2.experimentalLabel1.setText(C17541R$string.experimental);
                viewHolder2.experimentalLabel1.setVisibility(0);
            } else if (c1Var.mo27896n()) {
                viewHolder2.experimentalLabel1.setText(C17541R$string.feature_beta_label);
                viewHolder2.experimentalLabel1.setVisibility(0);
            } else {
                viewHolder2.experimentalLabel1.setVisibility(8);
            }
            if (this.f15472g) {
                viewHolder2.frame.setLayoutTransition(this.f15476z);
                viewHolder2.helpText.setVisibility(0);
                viewHolder2.helpText.setText(c1Var.mo27891f());
                return;
            }
            viewHolder2.frame.setLayoutTransition((LayoutTransition) null);
            viewHolder2.helpText.setVisibility(8);
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.select_item_row, viewGroup, false));
        }
        if (i == 2) {
            return new AddedItemViewHolder(this.f15468a, LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.list_item_wizard_header, viewGroup, false), this.f15470d, this.f15474p);
        }
        return new AddSelectableItemInfoCard.ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.info_card, viewGroup, false));
    }
}
