package com.oneclickaway.opensource.placeautocomplete.data.adapter;

import android.view.View;
import com.oneclickaway.opensource.placeautocomplete.data.adapter.RecentSearchesAdapter;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lja/u;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
/* compiled from: RecentSearchesAdapter.kt */
final class RecentSearchesAdapter$GeneralItemViewHolder$setOnClickLister$1 implements View.OnClickListener {
    final /* synthetic */ RecentSearchesAdapter.GeneralItemViewHolder this$0;

    RecentSearchesAdapter$GeneralItemViewHolder$setOnClickLister$1(RecentSearchesAdapter.GeneralItemViewHolder generalItemViewHolder) {
        this.this$0 = generalItemViewHolder;
    }

    public final void onClick(View view) {
        this.this$0.this$0.getRecentOnItemItemSelectedListener().onRecantsItemSelected(this.this$0.this$0.getListSearchSelectedItem().get(this.this$0.getAdapterPosition()));
    }
}
