package com.oneclickaway.opensource.placeautocomplete.data.repositories;

import com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PlaceDetails;
import com.oneclickaway.opensource.placeautocomplete.utils.LoadingManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p292io.reactivex.observers.C13230a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, mo71668d2 = {"com/oneclickaway/opensource/placeautocomplete/data/repositories/SearchPlacesRepo$requestPlaceDetails$3", "Lio/reactivex/observers/a;", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlaceDetails;", "Lja/u;", "onComplete", "it", "onNext", "", "e", "onError", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: SearchPlacesRepo.kt */
public final class SearchPlacesRepo$requestPlaceDetails$3 extends C13230a<PlaceDetails> {
    final /* synthetic */ SearchPlacesRepo this$0;

    SearchPlacesRepo$requestPlaceDetails$3(SearchPlacesRepo searchPlacesRepo) {
        this.this$0 = searchPlacesRepo;
    }

    public void onComplete() {
        this.this$0.loadingPlaceManager.postValue(LoadingManager.STATE_COMPLETED);
    }

    public void onError(Throwable th) {
        C13706o.m87930g(th, "e");
        this.this$0.loadingPlaceManager.postValue(LoadingManager.STATE_ERROR);
    }

    public void onNext(PlaceDetails placeDetails) {
        C13706o.m87930g(placeDetails, "it");
        this.this$0.placeDetails.postValue(placeDetails);
        this.this$0.addSearchedItemToRecent(placeDetails);
    }
}
