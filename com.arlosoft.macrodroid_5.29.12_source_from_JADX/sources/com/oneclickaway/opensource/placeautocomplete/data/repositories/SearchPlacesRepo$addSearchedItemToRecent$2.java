package com.oneclickaway.opensource.placeautocomplete.data.repositories;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p292io.reactivex.observers.C13230a;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, mo71668d2 = {"com/oneclickaway/opensource/placeautocomplete/data/repositories/SearchPlacesRepo$addSearchedItemToRecent$2", "Lio/reactivex/observers/a;", "Lja/u;", "t", "onNext", "(Lja/u;)V", "onComplete", "", "e", "onError", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: SearchPlacesRepo.kt */
public final class SearchPlacesRepo$addSearchedItemToRecent$2 extends C13230a<C13339u> {
    SearchPlacesRepo$addSearchedItemToRecent$2() {
    }

    public void onComplete() {
        Log.e(SearchPlacesRepo$addSearchedItemToRecent$2.class.getSimpleName(), "addSearchedItemToRecent: Completed");
    }

    public void onError(Throwable th) {
        C13706o.m87930g(th, "e");
        Log.e(SearchPlacesRepo$addSearchedItemToRecent$2.class.getSimpleName(), "addSearchedItemToRecent: Error");
    }

    public void onNext(C13339u uVar) {
        C13706o.m87930g(uVar, "t");
        Log.e(SearchPlacesRepo$addSearchedItemToRecent$2.class.getSimpleName(), "addSearchedItemToRecent: onNext");
    }
}
