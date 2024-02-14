package com.oneclickaway.opensource.placeautocomplete.data.repositories;

import com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem;
import com.oneclickaway.opensource.placeautocomplete.utils.LoadingManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p292io.reactivex.observers.C13230a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, mo71668d2 = {"com/oneclickaway/opensource/placeautocomplete/data/repositories/SearchPlacesRepo$requestListOfSearchResults$3", "Lio/reactivex/observers/a;", "", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/PredictionsItem;", "Lja/u;", "onComplete", "t", "onNext", "", "e", "onError", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: SearchPlacesRepo.kt */
public final class SearchPlacesRepo$requestListOfSearchResults$3 extends C13230a<List<? extends PredictionsItem>> {
    final /* synthetic */ SearchPlacesRepo this$0;

    SearchPlacesRepo$requestListOfSearchResults$3(SearchPlacesRepo searchPlacesRepo) {
        this.this$0 = searchPlacesRepo;
    }

    public void onComplete() {
        this.this$0.loadingPredictionManager.postValue(LoadingManager.STATE_COMPLETED);
    }

    public void onError(Throwable th) {
        C13706o.m87930g(th, "e");
        this.this$0.loadingPredictionManager.postValue(LoadingManager.STATE_ERROR);
    }

    public void onNext(List<PredictionsItem> list) {
        C13706o.m87930g(list, "t");
        this.this$0.listOfSearchResults.postValue(list);
    }
}
