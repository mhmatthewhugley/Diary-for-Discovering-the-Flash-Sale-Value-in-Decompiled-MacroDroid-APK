package com.arlosoft.macrodroid.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.settings.C5163j2;

public class AddSelectableItemInfoCard {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131362965)
        public View cardView;
        @BindView(2131362962)
        public TextView detail;
        @BindView(2131362963)
        public Button gotIt;
        @BindView(2131362968)
        public ViewGroup infoCard;
        @BindView(2131362964)
        public TextView title;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f15378a;

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f15378a = viewHolder;
            viewHolder.cardView = Utils.findRequiredView(view, C17532R$id.infoCardView, "field 'cardView'");
            viewHolder.infoCard = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.info_card, "field 'infoCard'", ViewGroup.class);
            viewHolder.title = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardTitle, "field 'title'", TextView.class);
            viewHolder.detail = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.infoCardDetail, "field 'detail'", TextView.class);
            viewHolder.gotIt = (Button) Utils.findRequiredViewAsType(view, C17532R$id.infoCardGotIt, "field 'gotIt'", Button.class);
        }

        @CallSuper
        public void unbind() {
            ViewHolder viewHolder = this.f15378a;
            if (viewHolder != null) {
                this.f15378a = null;
                viewHolder.cardView = null;
                viewHolder.infoCard = null;
                viewHolder.title = null;
                viewHolder.detail = null;
                viewHolder.gotIt = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.widget.AddSelectableItemInfoCard$a */
    public interface C6628a {
        /* renamed from: a */
        void mo30052a();
    }

    /* renamed from: d */
    public static void m25103d(Context context, ViewHolder viewHolder, int i, boolean z, C6628a aVar) {
        viewHolder.infoCard.setBackgroundColor(ContextCompat.getColor(context, 2131101114));
        if (i == 0) {
            viewHolder.title.setText(C17541R$string.triggers);
            viewHolder.detail.setText(C17541R$string.info_card_triggers_description);
            viewHolder.infoCard.setBackgroundColor(ContextCompat.getColor(context, C17528R$color.trigger_primary));
            viewHolder.gotIt.setOnClickListener(new C6633a(context, aVar));
        } else if (i != 1) {
            viewHolder.title.setText(C17541R$string.constraints);
            viewHolder.detail.setText(C17541R$string.info_card_constraints_description);
            viewHolder.infoCard.setBackgroundColor(ContextCompat.getColor(context, z ? C17528R$color.condition_primary : C17528R$color.constraints_primary));
            viewHolder.gotIt.setOnClickListener(new C6635c(context, aVar));
        } else {
            viewHolder.title.setText(C17541R$string.actions);
            viewHolder.detail.setText(C17541R$string.info_card_actions_description);
            viewHolder.infoCard.setBackgroundColor(ContextCompat.getColor(context, C17528R$color.actions_primary));
            viewHolder.gotIt.setOnClickListener(new C6634b(context, aVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m25104e(Context context, C6628a aVar, View view) {
        C5163j2.m20064T2(context);
        if (aVar != null) {
            aVar.mo30052a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m25105f(Context context, C6628a aVar, View view) {
        C5163j2.m19973G2(context);
        if (aVar != null) {
            aVar.mo30052a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m25106g(Context context, C6628a aVar, View view) {
        C5163j2.m20008L2(context);
        if (aVar != null) {
            aVar.mo30052a();
        }
    }

    /* renamed from: h */
    public static boolean m25107h(Context context, int i) {
        if (i == 0) {
            return C5163j2.m19945C6(context);
        }
        if (i == 1) {
            return C5163j2.m20253r6(context);
        }
        if (i != 2) {
            return true;
        }
        return C5163j2.m20285v6(context);
    }
}
