package com.oneclickaway.opensource.placeautocomplete.data.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.oneclickaway.opensource.placeautocomplete.C11709R;
import com.oneclickaway.opensource.placeautocomplete.interfaces.SearchPlaces;
import com.oneclickaway.opensource.placeautocomplete.utils.GroupStrategy;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002'(B\u001d\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b%\u0010&J\u001c\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\r\u001a\u00020\u00072\n\u0010\n\u001a\u00060\tR\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006)"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/adapter/RecentSearchesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/oneclickaway/opensource/placeautocomplete/data/adapter/RecentSearchesAdapter$GeneralItemViewHolder;", "generalItemViewHolder", "Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy$GeneralItem;", "generalItem", "Lja/u;", "setSearchedItem", "Lcom/oneclickaway/opensource/placeautocomplete/data/adapter/RecentSearchesAdapter$DateViewHolder;", "dateViewHolder", "Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy$DateItem;", "dateItem", "setDateView", "viewHolder", "", "position", "onBindViewHolder", "Landroid/view/ViewGroup;", "viewGroup", "itemViewType", "onCreateViewHolder", "getItemViewType", "getItemCount", "", "Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy$ListItem;", "listSearchSelectedItem", "Ljava/util/List;", "getListSearchSelectedItem", "()Ljava/util/List;", "Lcom/oneclickaway/opensource/placeautocomplete/interfaces/SearchPlaces$RecentItemSelectedListener;", "recentOnItemItemSelectedListener", "Lcom/oneclickaway/opensource/placeautocomplete/interfaces/SearchPlaces$RecentItemSelectedListener;", "getRecentOnItemItemSelectedListener", "()Lcom/oneclickaway/opensource/placeautocomplete/interfaces/SearchPlaces$RecentItemSelectedListener;", "setRecentOnItemItemSelectedListener", "(Lcom/oneclickaway/opensource/placeautocomplete/interfaces/SearchPlaces$RecentItemSelectedListener;)V", "<init>", "(Ljava/util/List;Lcom/oneclickaway/opensource/placeautocomplete/interfaces/SearchPlaces$RecentItemSelectedListener;)V", "DateViewHolder", "GeneralItemViewHolder", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: RecentSearchesAdapter.kt */
public final class RecentSearchesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final List<GroupStrategy.ListItem> listSearchSelectedItem;
    private SearchPlaces.RecentItemSelectedListener recentOnItemItemSelectedListener;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/adapter/RecentSearchesAdapter$DateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lja/u;", "inflateView", "Landroid/widget/TextView;", "groupTitleTV", "Landroid/widget/TextView;", "getGroupTitleTV", "()Landroid/widget/TextView;", "setGroupTitleTV", "(Landroid/widget/TextView;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/oneclickaway/opensource/placeautocomplete/data/adapter/RecentSearchesAdapter;Landroid/view/View;)V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* compiled from: RecentSearchesAdapter.kt */
    public final class DateViewHolder extends RecyclerView.ViewHolder {
        public TextView groupTitleTV;
        final /* synthetic */ RecentSearchesAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DateViewHolder(RecentSearchesAdapter recentSearchesAdapter, View view) {
            super(view);
            C13706o.m87930g(view, "itemView");
            this.this$0 = recentSearchesAdapter;
            inflateView();
        }

        private final void inflateView() {
            View findViewById = this.itemView.findViewById(C11709R.C11712id.groupTitleTV);
            C13706o.m87925b(findViewById, "itemView.findViewById(R.id.groupTitleTV)");
            this.groupTitleTV = (TextView) findViewById;
        }

        public final TextView getGroupTitleTV() {
            TextView textView = this.groupTitleTV;
            if (textView == null) {
                C13706o.m87945v("groupTitleTV");
            }
            return textView;
        }

        public final void setGroupTitleTV(TextView textView) {
            C13706o.m87930g(textView, "<set-?>");
            this.groupTitleTV = textView;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0013"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/adapter/RecentSearchesAdapter$GeneralItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "Lja/u;", "setOnClickLister", "inflateView", "Landroid/widget/TextView;", "recentPlaceTitleTV", "Landroid/widget/TextView;", "getRecentPlaceTitleTV", "()Landroid/widget/TextView;", "setRecentPlaceTitleTV", "(Landroid/widget/TextView;)V", "recentPlaceFormattedAddressTV", "getRecentPlaceFormattedAddressTV", "setRecentPlaceFormattedAddressTV", "<init>", "(Lcom/oneclickaway/opensource/placeautocomplete/data/adapter/RecentSearchesAdapter;Landroid/view/View;)V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* compiled from: RecentSearchesAdapter.kt */
    public final class GeneralItemViewHolder extends RecyclerView.ViewHolder {
        public TextView recentPlaceFormattedAddressTV;
        public TextView recentPlaceTitleTV;
        final /* synthetic */ RecentSearchesAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GeneralItemViewHolder(RecentSearchesAdapter recentSearchesAdapter, View view) {
            super(view);
            C13706o.m87930g(view, "itemView");
            this.this$0 = recentSearchesAdapter;
            inflateView();
            setOnClickLister(view);
        }

        private final void inflateView() {
            View findViewById = this.itemView.findViewById(C11709R.C11712id.recentPlaceFormattedAddressTV);
            C13706o.m87925b(findViewById, "itemView.findViewById(R.…tPlaceFormattedAddressTV)");
            this.recentPlaceFormattedAddressTV = (TextView) findViewById;
            View findViewById2 = this.itemView.findViewById(C11709R.C11712id.recentPlaceTitleTV);
            C13706o.m87925b(findViewById2, "itemView.findViewById(R.id.recentPlaceTitleTV)");
            this.recentPlaceTitleTV = (TextView) findViewById2;
        }

        private final void setOnClickLister(View view) {
            view.setOnClickListener(new RecentSearchesAdapter$GeneralItemViewHolder$setOnClickLister$1(this));
        }

        public final TextView getRecentPlaceFormattedAddressTV() {
            TextView textView = this.recentPlaceFormattedAddressTV;
            if (textView == null) {
                C13706o.m87945v("recentPlaceFormattedAddressTV");
            }
            return textView;
        }

        public final TextView getRecentPlaceTitleTV() {
            TextView textView = this.recentPlaceTitleTV;
            if (textView == null) {
                C13706o.m87945v("recentPlaceTitleTV");
            }
            return textView;
        }

        public final void setRecentPlaceFormattedAddressTV(TextView textView) {
            C13706o.m87930g(textView, "<set-?>");
            this.recentPlaceFormattedAddressTV = textView;
        }

        public final void setRecentPlaceTitleTV(TextView textView) {
            C13706o.m87930g(textView, "<set-?>");
            this.recentPlaceTitleTV = textView;
        }
    }

    public RecentSearchesAdapter(List<? extends GroupStrategy.ListItem> list, SearchPlaces.RecentItemSelectedListener recentItemSelectedListener) {
        C13706o.m87930g(list, "listSearchSelectedItem");
        C13706o.m87930g(recentItemSelectedListener, "recentOnItemItemSelectedListener");
        this.listSearchSelectedItem = list;
        this.recentOnItemItemSelectedListener = recentItemSelectedListener;
    }

    private final void setDateView(DateViewHolder dateViewHolder, GroupStrategy.DateItem dateItem) {
        TextView groupTitleTV = dateViewHolder.getGroupTitleTV();
        String date = dateItem.getDate();
        if (date != null) {
            String upperCase = date.toUpperCase();
            C13706o.m87925b(upperCase, "(this as java.lang.String).toUpperCase()");
            groupTitleTV.setText(upperCase);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    private final void setSearchedItem(GeneralItemViewHolder generalItemViewHolder, GroupStrategy.GeneralItem generalItem) {
        generalItemViewHolder.getRecentPlaceTitleTV().setText(generalItem.getSearchSelectedItem().getMainText());
        generalItemViewHolder.getRecentPlaceFormattedAddressTV().setText(generalItem.getSearchSelectedItem().getSecondaryText());
    }

    public int getItemCount() {
        return this.listSearchSelectedItem.size();
    }

    public int getItemViewType(int i) {
        GroupStrategy.ListItem listItem = this.listSearchSelectedItem.get(i);
        if (listItem instanceof GroupStrategy.DateItem) {
            return 101;
        }
        return listItem instanceof GroupStrategy.GeneralItem ? 102 : -1;
    }

    public final List<GroupStrategy.ListItem> getListSearchSelectedItem() {
        return this.listSearchSelectedItem;
    }

    public final SearchPlaces.RecentItemSelectedListener getRecentOnItemItemSelectedListener() {
        return this.recentOnItemItemSelectedListener;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C13706o.m87930g(viewHolder, "viewHolder");
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 101) {
            DateViewHolder dateViewHolder = (DateViewHolder) viewHolder;
            GroupStrategy.ListItem listItem = this.listSearchSelectedItem.get(i);
            if (listItem != null) {
                setDateView(dateViewHolder, (GroupStrategy.DateItem) listItem);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.oneclickaway.opensource.placeautocomplete.utils.GroupStrategy.DateItem");
        } else if (itemViewType == 102) {
            GeneralItemViewHolder generalItemViewHolder = (GeneralItemViewHolder) viewHolder;
            GroupStrategy.ListItem listItem2 = this.listSearchSelectedItem.get(i);
            if (listItem2 != null) {
                setSearchedItem(generalItemViewHolder, (GroupStrategy.GeneralItem) listItem2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.oneclickaway.opensource.placeautocomplete.utils.GroupStrategy.GeneralItem");
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87930g(viewGroup, "viewGroup");
        if (i == 102) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C11709R.C11713layout.recent_search_result_row, viewGroup, false);
            C13706o.m87925b(inflate, "LayoutInflater.from(view…  false\n                )");
            return new GeneralItemViewHolder(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C11709R.C11713layout.date_item_row, viewGroup, false);
        C13706o.m87925b(inflate2, "LayoutInflater.from(view…  false\n                )");
        return new DateViewHolder(this, inflate2);
    }

    public final void setRecentOnItemItemSelectedListener(SearchPlaces.RecentItemSelectedListener recentItemSelectedListener) {
        C13706o.m87930g(recentItemSelectedListener, "<set-?>");
        this.recentOnItemItemSelectedListener = recentItemSelectedListener;
    }
}
