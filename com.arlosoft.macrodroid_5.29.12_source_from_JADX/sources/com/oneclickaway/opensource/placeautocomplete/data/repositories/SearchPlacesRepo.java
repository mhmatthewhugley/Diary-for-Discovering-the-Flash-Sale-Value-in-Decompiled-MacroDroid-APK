package com.oneclickaway.opensource.placeautocomplete.data.repositories;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.oneclickaway.opensource.placeautocomplete.data.api.base.RESTAPIManager;
import com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PlaceDetails;
import com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem;
import com.oneclickaway.opensource.placeautocomplete.data.model.room.SearchSelectedItem;
import com.oneclickaway.opensource.placeautocomplete.data.room.RecentSearchesDB;
import com.oneclickaway.opensource.placeautocomplete.utils.Commons;
import com.oneclickaway.opensource.placeautocomplete.utils.LoadingManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p270ga.C12318a;
import p414v9.C16735i;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b-\u0010,J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u0004J\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0004J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0004J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0004J&\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010J\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\bR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010 R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010 R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/repositories/SearchPlacesRepo;", "", "Lcom/oneclickaway/opensource/placeautocomplete/data/room/RecentSearchesDB;", "initDb", "Landroidx/lifecycle/LiveData;", "", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/PredictionsItem;", "getLiveListOfSearchResultsStream", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/place_details/PlaceDetails;", "getPlaceDetailsLiveDataStream", "Lcom/oneclickaway/opensource/placeautocomplete/data/model/room/SearchSelectedItem;", "getRecentSearches", "Lcom/oneclickaway/opensource/placeautocomplete/utils/LoadingManager;", "getLoadingPredictionManager", "getLoadingPlaceManager", "getRecentSearchesManager", "", "placeHint", "apiKey", "location", "radius", "Lja/u;", "requestListOfSearchResults", "placeId", "requestPlaceDetails", "Landroid/content/Context;", "mContext", "requestListOfRecentSearches", "it", "addSearchedItemToRecent", "Landroidx/lifecycle/MutableLiveData;", "listOfSearchResults", "Landroidx/lifecycle/MutableLiveData;", "placeDetails", "recentSearches", "loadingPredictionManager", "loadingPlaceManager", "recentSearchesManager", "Landroid/app/Application;", "application", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "<init>", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: SearchPlacesRepo.kt */
public final class SearchPlacesRepo {
    private Application application;
    /* access modifiers changed from: private */
    public final MutableLiveData<List<PredictionsItem>> listOfSearchResults = new MutableLiveData<>();
    /* access modifiers changed from: private */
    public final MutableLiveData<LoadingManager> loadingPlaceManager = new MutableLiveData<>();
    /* access modifiers changed from: private */
    public final MutableLiveData<LoadingManager> loadingPredictionManager = new MutableLiveData<>();
    /* access modifiers changed from: private */
    public final MutableLiveData<PlaceDetails> placeDetails = new MutableLiveData<>();
    /* access modifiers changed from: private */
    public final MutableLiveData<List<SearchSelectedItem>> recentSearches = new MutableLiveData<>();
    /* access modifiers changed from: private */
    public final MutableLiveData<LoadingManager> recentSearchesManager = new MutableLiveData<>();

    public SearchPlacesRepo(Application application2) {
        C13706o.m87930g(application2, "application");
        this.application = application2;
    }

    /* access modifiers changed from: private */
    public final RecentSearchesDB initDb() {
        return RecentSearchesDB.Companion.getInstance(this.application);
    }

    public final void addSearchedItemToRecent(PlaceDetails placeDetails2) {
        C13706o.m87930g(placeDetails2, "it");
        C16735i.m99338A(new SearchPlacesRepo$addSearchedItemToRecent$1(this, placeDetails2)).mo79688T(C12318a.m83029a()).mo79679I(C12318a.m83030b()).mo79695a(new SearchPlacesRepo$addSearchedItemToRecent$2());
    }

    public final Application getApplication() {
        return this.application;
    }

    public final LiveData<List<PredictionsItem>> getLiveListOfSearchResultsStream() {
        return this.listOfSearchResults;
    }

    public final LiveData<LoadingManager> getLoadingPlaceManager() {
        return this.loadingPlaceManager;
    }

    public final LiveData<LoadingManager> getLoadingPredictionManager() {
        return this.loadingPredictionManager;
    }

    public final LiveData<PlaceDetails> getPlaceDetailsLiveDataStream() {
        return this.placeDetails;
    }

    public final LiveData<List<SearchSelectedItem>> getRecentSearches() {
        return this.recentSearches;
    }

    public final LiveData<LoadingManager> getRecentSearchesManager() {
        return this.recentSearchesManager;
    }

    public final void requestListOfRecentSearches(Context context) {
        C13706o.m87930g(context, "mContext");
        this.recentSearchesManager.postValue(LoadingManager.STATE_REFRESHING);
        if (!Commons.INSTANCE.isNetworkConnected(this.application)) {
            this.recentSearchesManager.postValue(LoadingManager.STATE_NO_INTERNET);
        } else {
            C16735i.m99338A(new SearchPlacesRepo$requestListOfRecentSearches$1(context)).mo79688T(C12318a.m83030b()).mo79679I(C12318a.m83030b()).mo79685P(new SearchPlacesRepo$requestListOfRecentSearches$2(this));
        }
    }

    public final void requestListOfSearchResults(String str, String str2, String str3, String str4) {
        C13706o.m87930g(str, "placeHint");
        C13706o.m87930g(str2, "apiKey");
        C13706o.m87930g(str3, "location");
        C13706o.m87930g(str4, "radius");
        this.loadingPredictionManager.postValue(LoadingManager.STATE_REFRESHING);
        if (C15176v.m93643x(str)) {
            this.loadingPredictionManager.postValue(LoadingManager.STATE_IDLE);
        } else if (!Commons.INSTANCE.isNetworkConnected(this.application)) {
            this.loadingPredictionManager.postValue(LoadingManager.STATE_NO_INTERNET);
        } else {
            RESTAPIManager.INSTANCE.getInstance().getPlaceResults(str, str2, str3, str4).mo79711t(new SearchPlacesRepo$requestListOfSearchResults$1(this)).mo79688T(C12318a.m83030b()).mo79679I(C12318a.m83030b()).mo79678G(SearchPlacesRepo$requestListOfSearchResults$2.INSTANCE).mo79695a(new SearchPlacesRepo$requestListOfSearchResults$3(this));
        }
    }

    public final void requestPlaceDetails(String str, String str2) {
        C13706o.m87930g(str, "placeId");
        C13706o.m87930g(str2, "apiKey");
        this.loadingPlaceManager.postValue(LoadingManager.STATE_REFRESHING);
        if (!Commons.INSTANCE.isNetworkConnected(this.application)) {
            this.loadingPlaceManager.postValue(LoadingManager.STATE_NO_INTERNET);
        } else {
            RESTAPIManager.INSTANCE.getInstance().getPlaceDetailsFromPlaceId(str, str2).mo79679I(C12318a.m83030b()).mo79688T(C12318a.m83030b()).mo79711t(SearchPlacesRepo$requestPlaceDetails$1.INSTANCE).mo79678G(SearchPlacesRepo$requestPlaceDetails$2.INSTANCE).mo79695a(new SearchPlacesRepo$requestPlaceDetails$3(this));
        }
    }

    public final void setApplication(Application application2) {
        C13706o.m87930g(application2, "<set-?>");
        this.application = application2;
    }
}
