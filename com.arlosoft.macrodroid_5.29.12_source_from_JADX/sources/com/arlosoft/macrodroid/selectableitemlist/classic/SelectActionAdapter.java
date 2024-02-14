package com.arlosoft.macrodroid.selectableitemlist.classic;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.selectableitemlist.C5099g;
import com.arlosoft.macrodroid.selectableitemlist.classic.SelectableItemAdapter;
import com.arlosoft.macrodroid.widget.AddSelectableItemInfoCard;
import java.util.List;
import p128m0.C7712c0;
import p128m0.C7776k;
import p128m0.C7779k1;
import p128m0.C7787l1;
import p128m0.C7809o1;
import p128m0.C7889z1;

public class SelectActionAdapter extends SelectableItemAdapter {

    /* renamed from: C */
    private final boolean f12778C;

    static class ViewHolder extends SelectableItemAdapter.ViewHolder {
        @BindView(2131363733)
        ViewGroup headingContainer;
        @BindView(2131363732)
        TextView headingText;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    public class ViewHolder_ViewBinding extends SelectableItemAdapter.ViewHolder_ViewBinding {

        /* renamed from: b */
        private ViewHolder f12779b;

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            super(viewHolder, view);
            this.f12779b = viewHolder;
            viewHolder.headingContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.select_item_heading_container, "field 'headingContainer'", ViewGroup.class);
            viewHolder.headingText = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.select_item_heading, "field 'headingText'", TextView.class);
        }

        public void unbind() {
            ViewHolder viewHolder = this.f12779b;
            if (viewHolder != null) {
                this.f12779b = null;
                viewHolder.headingContainer = null;
                viewHolder.headingText = null;
                super.unbind();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public SelectActionAdapter(Activity activity, Macro macro, boolean z, @NonNull C5099g gVar, boolean z2) {
        super(activity, macro, z, gVar, 1, false);
        this.f12778C = z2;
        refresh();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public List<C4001c1> mo30053G() {
        List<C4001c1> Y2 = Action.m9594Y2(this.f12789s.getApplicationContext(), this.f12788p, false);
        if (this.f12778C) {
            Y2.add(0, C7712c0.m32158v());
            Y2.add(0, C7776k.m32466v());
            Y2.add(0, C7809o1.m32627u());
            Y2.add(0, C7889z1.m33015u());
            Y2.add(0, C7787l1.m32517v());
            Y2.add(0, C7779k1.m32478u());
        }
        return Y2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public int mo30054H() {
        return C17530R$drawable.circular_icon_background_action;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        super.onBindViewHolder(viewHolder, i);
        if (!(viewHolder instanceof AddSelectableItemInfoCard.ViewHolder)) {
            int i2 = i - (this.f12787o ? 1 : 0);
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            if (this.f12781B || !this.f12778C || !(i2 == 0 || i2 == 6)) {
                viewHolder2.headingContainer.setVisibility(8);
                return;
            }
            viewHolder2.headingContainer.setVisibility(0);
            boolean z = this.f12787o;
            int i3 = C17541R$string.control_flow;
            if (z) {
                TextView textView = viewHolder2.headingText;
                if (i != 1) {
                    i3 = C17541R$string.actions;
                }
                textView.setText(i3);
                return;
            }
            TextView textView2 = viewHolder2.headingText;
            if (i != 0) {
                i3 = C17541R$string.actions;
            }
            textView2.setText(i3);
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.select_item_row, viewGroup, false));
        }
        return super.onCreateViewHolder(viewGroup, i);
    }
}
