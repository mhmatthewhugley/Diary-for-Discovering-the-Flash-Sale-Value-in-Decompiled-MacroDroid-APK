package com.oneclickaway.opensource.placeautocomplete.data.model.view;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PlaceDetails;
import com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem;
import com.oneclickaway.opensource.placeautocomplete.data.model.room.SearchSelectedItem;
import com.oneclickaway.opensource.placeautocomplete.data.repositories.SearchPlacesRepo;
import com.oneclickaway.opensource.placeautocomplete.utils.LoadingManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u0014\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\tJ\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\tJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\tJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\tJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\tJ\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\n0\tJ\u0006\u0010\u0017\u001a\u00020\u0007R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/model/view/SearchPlacesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "", "placeHint", "apiKey", "location", "radius", "Lja/u;", "requestListOfSearchResults", "Landroidx/lifecycle/LiveData;", "", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/PredictionsItem;", "getLiveListOfSearchResultsStream", "placeId", "requestPlaceDetails", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlaceDetails;", "getPlaceDetailsLiveDataStream", "Lcom/oneclickaway/opensource/placeautocomplete/utils/LoadingManager;", "getLoadingPredictionManager", "getLoadingPlaceManager", "getRecentSearchesManager", "Lcom/oneclickaway/opensource/placeautocomplete/data/model/room/SearchSelectedItem;", "getRecentSearchesData", "requestListOfRecentSearches", "Lcom/oneclickaway/opensource/placeautocomplete/data/repositories/SearchPlacesRepo;", "searchPlacesRepo", "Lcom/oneclickaway/opensource/placeautocomplete/data/repositories/SearchPlacesRepo;", "Landroid/app/Application;", "applicationContext", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: SearchPlacesViewModel.kt */
public final class SearchPlacesViewModel extends AndroidViewModel {
    private final Application applicationContext;
    private final SearchPlacesRepo searchPlacesRepo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchPlacesViewModel(Application application) {
        super(application);
        C13706o.m87930g(application, "applicationContext");
        this.applicationContext = application;
        this.searchPlacesRepo = new SearchPlacesRepo(application);
    }

    public final LiveData<List<PredictionsItem>> getLiveListOfSearchResultsStream() {
        return this.searchPlacesRepo.getLiveListOfSearchResultsStream();
    }

    public final LiveData<LoadingManager> getLoadingPlaceManager() {
        return this.searchPlacesRepo.getLoadingPlaceManager();
    }

    public final LiveData<LoadingManager> getLoadingPredictionManager() {
        return this.searchPlacesRepo.getLoadingPredictionManager();
    }

    public final LiveData<PlaceDetails> getPlaceDetailsLiveDataStream() {
        return this.searchPlacesRepo.getPlaceDetailsLiveDataStream();
    }

    public final LiveData<List<SearchSelectedItem>> getRecentSearchesData() {
        return this.searchPlacesRepo.getRecentSearches();
    }

    public final LiveData<LoadingManager> getRecentSearchesManager() {
        return this.searchPlacesRepo.getRecentSearchesManager();
    }

    public final void requestListOfRecentSearches() {
        this.searchPlacesRepo.requestListOfRecentSearches(this.applicationContext);
    }

    public final void requestListOfSearchResults(String str, String str2, String str3, String str4) {
        C13706o.m87930g(str, "placeHint");
        C13706o.m87930g(str2, "apiKey");
        C13706o.m87930g(str3, "location");
        C13706o.m87930g(str4, "radius");
        this.searchPlacesRepo.requestListOfSearchResults(str, str2, str3, str4);
    }

    public final void requestPlaceDetails(String str, String str2) {
        C13706o.m87930g(str, "placeId");
        C13706o.m87930g(str2, "apiKey");
        this.searchPlacesRepo.requestPlaceDetails(str, str2);
    }
}
