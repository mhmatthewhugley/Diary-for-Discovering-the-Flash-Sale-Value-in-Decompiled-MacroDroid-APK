package com.oneclickaway.opensource.placeautocomplete.data.repositories;

import com.oneclickaway.opensource.placeautocomplete.data.model.room.SearchSelectedItem;
import com.oneclickaway.opensource.placeautocomplete.utils.LoadingManager;
import java.util.List;
import kotlin.Metadata;
import p216ba.C11113d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"", "Lcom/oneclickaway/opensource/placeautocomplete/data/model/room/SearchSelectedItem;", "it", "Lja/u;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
/* compiled from: SearchPlacesRepo.kt */
final class SearchPlacesRepo$requestListOfRecentSearches$2<T> implements C11113d<List<? extends SearchSelectedItem>> {
    final /* synthetic */ SearchPlacesRepo this$0;

    SearchPlacesRepo$requestListOfRecentSearches$2(SearchPlacesRepo searchPlacesRepo) {
        this.this$0 = searchPlacesRepo;
    }

    public final void accept(List<SearchSelectedItem> list) {
        if (list == null || !list.isEmpty()) {
            this.this$0.recentSearchesManager.postValue(LoadingManager.STATE_COMPLETED);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(String.valueOf(list));
            this.this$0.recentSearches.postValue(list);
            return;
        }
        this.this$0.recentSearchesManager.postValue(LoadingManager.STATE_NO_RESULT);
    }
}
