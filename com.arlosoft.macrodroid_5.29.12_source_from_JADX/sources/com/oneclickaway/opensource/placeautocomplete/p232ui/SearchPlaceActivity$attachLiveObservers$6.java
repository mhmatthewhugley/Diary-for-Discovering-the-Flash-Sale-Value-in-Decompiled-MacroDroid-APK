package com.oneclickaway.opensource.placeautocomplete.p232ui;

import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.oneclickaway.opensource.placeautocomplete.data.adapter.RecentSearchesAdapter;
import com.oneclickaway.opensource.placeautocomplete.data.model.room.SearchSelectedItem;
import com.oneclickaway.opensource.placeautocomplete.utils.GroupStrategy;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"", "Lcom/oneclickaway/opensource/placeautocomplete/data/model/room/SearchSelectedItem;", "it", "Lja/u;", "onChanged", "(Ljava/util/List;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
/* renamed from: com.oneclickaway.opensource.placeautocomplete.ui.SearchPlaceActivity$attachLiveObservers$6 */
/* compiled from: SearchPlaceActivity.kt */
final class SearchPlaceActivity$attachLiveObservers$6<T> implements Observer<List<? extends SearchSelectedItem>> {
    final /* synthetic */ SearchPlaceActivity this$0;

    SearchPlaceActivity$attachLiveObservers$6(SearchPlaceActivity searchPlaceActivity) {
        this.this$0 = searchPlaceActivity;
    }

    public final void onChanged(List<SearchSelectedItem> list) {
        if (list != null) {
            this.this$0.getRecentSearchesRV().setLayoutManager(new LinearLayoutManager(this.this$0));
            this.this$0.getRecentSearchesRV().setAdapter(new RecentSearchesAdapter(new GroupStrategy().groupDataByTime(list), this.this$0));
        }
    }
}
