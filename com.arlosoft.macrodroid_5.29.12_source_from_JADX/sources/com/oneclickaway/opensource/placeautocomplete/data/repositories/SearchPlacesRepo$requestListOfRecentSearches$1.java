package com.oneclickaway.opensource.placeautocomplete.data.repositories;

import android.content.Context;
import com.oneclickaway.opensource.placeautocomplete.data.model.room.SearchSelectedItem;
import com.oneclickaway.opensource.placeautocomplete.data.room.RecentSearchesDAO;
import com.oneclickaway.opensource.placeautocomplete.data.room.RecentSearchesDB;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;

@Metadata(mo71666bv = {1, 0, 3}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo71668d2 = {"<anonymous>", "", "Lcom/oneclickaway/opensource/placeautocomplete/data/model/room/SearchSelectedItem;", "call"}, mo71669k = 3, mo71670mv = {1, 1, 15})
/* compiled from: SearchPlacesRepo.kt */
final class SearchPlacesRepo$requestListOfRecentSearches$1 implements Callable {
    final /* synthetic */ Context $mContext;

    SearchPlacesRepo$requestListOfRecentSearches$1(Context context) {
        this.$mContext = context;
    }

    public final List<SearchSelectedItem> call() {
        RecentSearchesDAO repDao;
        RecentSearchesDB instance = RecentSearchesDB.Companion.getInstance(this.$mContext);
        if (instance == null || (repDao = instance.repDao()) == null) {
            return null;
        }
        return repDao.getRecentSearches();
    }
}
