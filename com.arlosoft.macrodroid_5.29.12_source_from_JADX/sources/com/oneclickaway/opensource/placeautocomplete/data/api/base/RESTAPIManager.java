package com.oneclickaway.opensource.placeautocomplete.data.api.base;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C16002z;
import p219bd.C11150a;
import p454af.C17104g;
import p456bf.C17108a;
import retrofit2.C17301t;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/data/api/base/RESTAPIManager;", "", "Lokhttp3/z;", "getOkhttpClient", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/base/SearchPlaceApi;", "getInstance", "", "BASE_URL", "Ljava/lang/String;", "<init>", "()V", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: RESTAPIManager.kt */
public final class RESTAPIManager {
    private static String BASE_URL = "https://maps.googleapis.com/maps/api/place/";
    public static final RESTAPIManager INSTANCE = new RESTAPIManager();

    private RESTAPIManager() {
    }

    private final C16002z getOkhttpClient() {
        C16002z.C16003a aVar = new C16002z.C16003a();
        aVar.mo76374a(new C11150a().mo62339c(C11150a.C11151a.BODY));
        aVar.mo76377d(100, TimeUnit.SECONDS);
        aVar.mo76371M(true);
        C16002z c = aVar.mo76376c();
        C13706o.m87925b(c, "okhttpBuilder.build()");
        return c;
    }

    public final SearchPlaceApi getInstance() {
        Object b = new C17301t.C17303b().mo80614g(getOkhttpClient()).mo80610c(BASE_URL).mo80608a(C17104g.m100577d()).mo80609b(C17108a.m100594f()).mo80612e().mo80599b(SearchPlaceApi.class);
        C13706o.m87925b(b, "retroFit.create(SearchPlaceApi::class.java)");
        return (SearchPlaceApi) b;
    }
}
