package com.oneclickaway.opensource.placeautocomplete.data.repositories;

import com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PlaceDetails;
import com.oneclickaway.opensource.placeautocomplete.data.model.room.SearchSelectedItem;
import com.oneclickaway.opensource.placeautocomplete.data.room.RecentSearchesDAO;
import com.oneclickaway.opensource.placeautocomplete.data.room.RecentSearchesDB;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "call", "()Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
/* compiled from: SearchPlacesRepo.kt */
final class SearchPlacesRepo$addSearchedItemToRecent$1 implements Callable {
    final /* synthetic */ PlaceDetails $it;
    final /* synthetic */ SearchPlacesRepo this$0;

    SearchPlacesRepo$addSearchedItemToRecent$1(SearchPlacesRepo searchPlacesRepo, PlaceDetails placeDetails) {
        this.this$0 = searchPlacesRepo;
        this.$it = placeDetails;
    }

    public final C13339u call() {
        RecentSearchesDAO repDao;
        RecentSearchesDB access$initDb = this.this$0.initDb();
        if (access$initDb == null || (repDao = access$initDb.repDao()) == null) {
            return null;
        }
        repDao.addSearchItem(new SearchSelectedItem(String.valueOf(this.$it.getPlaceId()), String.valueOf(this.$it.getName()), String.valueOf(this.$it.getFormattedAddress()), System.currentTimeMillis()));
        return C13339u.f61331a;
    }
}
