package com.oneclickaway.opensource.placeautocomplete.p232ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oneclickaway.opensource.placeautocomplete.C11709R;
import com.oneclickaway.opensource.placeautocomplete.data.adapter.SearchResultAdapter;
import com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem;
import com.oneclickaway.opensource.placeautocomplete.data.model.view.SearchPlacesViewModel;
import com.oneclickaway.opensource.placeautocomplete.data.room.RecentSearchesDB;
import com.oneclickaway.opensource.placeautocomplete.interfaces.SearchPlaces;
import com.oneclickaway.opensource.placeautocomplete.utils.GroupStrategy;
import com.oneclickaway.opensource.placeautocomplete.utils.LoadingManager;
import com.oneclickaway.opensource.placeautocomplete.utils.SearchPlacesStatusCodes;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p083e4.C7271c;
import p270ga.C12318a;
import p313l6.C15584a;
import p440y9.C16971a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001xB\u0007¢\u0006\u0004\bv\u0010wJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0012\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\u0012\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0012\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016R\u0016\u0010\"\u001a\u00020\u00138\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0018\u00102\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020.038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0006@\u0006X.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010E\u001a\u00020D8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010L\u001a\u00020K8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010S\u001a\u00020R8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010Y\u001a\u0002068\u0006@\u0006X.¢\u0006\u0012\n\u0004\bY\u00108\u001a\u0004\bZ\u0010:\"\u0004\b[\u0010<R\"\u0010\\\u001a\u0002068\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\\\u00108\u001a\u0004\b]\u0010:\"\u0004\b^\u0010<R\"\u0010`\u001a\u00020_8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010f\u001a\u00020_8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bf\u0010a\u001a\u0004\bg\u0010c\"\u0004\bh\u0010eR$\u0010j\u001a\u0004\u0018\u00010i8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010p\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bp\u0010F\u001a\u0004\bq\u0010H\"\u0004\br\u0010JR\"\u0010s\u001a\u00020R8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bs\u0010T\u001a\u0004\bt\u0010V\"\u0004\bu\u0010X¨\u0006y"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/ui/SearchPlaceActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/oneclickaway/opensource/placeautocomplete/interfaces/SearchPlaces$PlaceItemSelectedListener;", "Lcom/oneclickaway/opensource/placeautocomplete/interfaces/SearchPlaces$RecentItemSelectedListener;", "Landroid/view/View$OnClickListener;", "Lja/u;", "initDb", "inflateViews", "setOnClickListeners", "Lcom/oneclickaway/opensource/placeautocomplete/utils/LoadingManager;", "pageStatus", "setSecondaryStateInformation", "initializeDependency", "attachLiveObservers", "attachEraserObserver", "setViewModel", "setRecyclerView", "setOnQueryChangeListener", "initDialogForGettingPlaceDetails", "Lcom/oneclickaway/opensource/placeautocomplete/data/model/view/SearchPlacesViewModel;", "getViewModel", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Landroid/view/View;", "p0", "onClick", "Lcom/oneclickaway/opensource/placeautocomplete/utils/GroupStrategy$ListItem;", "savedItem", "onRecantsItemSelected", "Lcom/oneclickaway/opensource/placeautocomplete/data/api/bean/places_response/PredictionsItem;", "candidateItem", "onPlaceItemSelected", "viewModel", "Lcom/oneclickaway/opensource/placeautocomplete/data/model/view/SearchPlacesViewModel;", "Lcom/oneclickaway/opensource/placeautocomplete/data/adapter/SearchResultAdapter;", "searchListAdapter", "Lcom/oneclickaway/opensource/placeautocomplete/data/adapter/SearchResultAdapter;", "Landroid/app/Dialog;", "gettingPlaceDataDialog", "Landroid/app/Dialog;", "getGettingPlaceDataDialog", "()Landroid/app/Dialog;", "setGettingPlaceDataDialog", "(Landroid/app/Dialog;)V", "", "apiKey", "Ljava/lang/String;", "location", "enclosingRadius", "Landroidx/lifecycle/MutableLiveData;", "liveQueryInEditText", "Landroidx/lifecycle/MutableLiveData;", "Landroid/widget/TextView;", "searchTitleTV", "Landroid/widget/TextView;", "getSearchTitleTV", "()Landroid/widget/TextView;", "setSearchTitleTV", "(Landroid/widget/TextView;)V", "Landroid/widget/ProgressBar;", "searchProgressBar", "Landroid/widget/ProgressBar;", "getSearchProgressBar", "()Landroid/widget/ProgressBar;", "setSearchProgressBar", "(Landroid/widget/ProgressBar;)V", "Landroid/widget/LinearLayout;", "secondaryInformationLL", "Landroid/widget/LinearLayout;", "getSecondaryInformationLL", "()Landroid/widget/LinearLayout;", "setSecondaryInformationLL", "(Landroid/widget/LinearLayout;)V", "Landroid/widget/EditText;", "placeNamET", "Landroid/widget/EditText;", "getPlaceNamET", "()Landroid/widget/EditText;", "setPlaceNamET", "(Landroid/widget/EditText;)V", "Landroidx/recyclerview/widget/RecyclerView;", "searchResultsRV", "Landroidx/recyclerview/widget/RecyclerView;", "getSearchResultsRV", "()Landroid/support/v7/widget/RecyclerView;", "setSearchResultsRV", "(Landroid/support/v7/widget/RecyclerView;)V", "secondaryInfoSubTitleTV", "getSecondaryInfoSubTitleTV", "setSecondaryInfoSubTitleTV", "secondaryInfoTitleTV", "getSecondaryInfoTitleTV", "setSecondaryInfoTitleTV", "Landroid/widget/ImageView;", "backImageBtn", "Landroid/widget/ImageView;", "getBackImageBtn", "()Landroid/widget/ImageView;", "setBackImageBtn", "(Landroid/widget/ImageView;)V", "eraseCurrentEntryIV", "getEraseCurrentEntryIV", "setEraseCurrentEntryIV", "Lcom/oneclickaway/opensource/placeautocomplete/data/room/RecentSearchesDB;", "recentSearchesDB", "Lcom/oneclickaway/opensource/placeautocomplete/data/room/RecentSearchesDB;", "getRecentSearchesDB", "()Lcom/oneclickaway/opensource/placeautocomplete/data/room/RecentSearchesDB;", "setRecentSearchesDB", "(Lcom/oneclickaway/opensource/placeautocomplete/data/room/RecentSearchesDB;)V", "recentSearchesLL", "getRecentSearchesLL", "setRecentSearchesLL", "recentSearchesRV", "getRecentSearchesRV", "setRecentSearchesRV", "<init>", "()V", "Config", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: com.oneclickaway.opensource.placeautocomplete.ui.SearchPlaceActivity */
/* compiled from: SearchPlaceActivity.kt */
public final class SearchPlaceActivity extends AppCompatActivity implements SearchPlaces.PlaceItemSelectedListener, SearchPlaces.RecentItemSelectedListener, View.OnClickListener {
    /* access modifiers changed from: private */
    public String apiKey;
    public ImageView backImageBtn;
    /* access modifiers changed from: private */
    public String enclosingRadius;
    public ImageView eraseCurrentEntryIV;
    public Dialog gettingPlaceDataDialog;
    /* access modifiers changed from: private */
    public MutableLiveData<String> liveQueryInEditText = new MutableLiveData<>();
    /* access modifiers changed from: private */
    public String location;
    public EditText placeNamET;
    private RecentSearchesDB recentSearchesDB;
    private LinearLayout recentSearchesLL;
    public RecyclerView recentSearchesRV;
    /* access modifiers changed from: private */
    public SearchResultAdapter searchListAdapter;
    public ProgressBar searchProgressBar;
    public RecyclerView searchResultsRV;
    public TextView searchTitleTV;
    public TextView secondaryInfoSubTitleTV;
    public TextView secondaryInfoTitleTV;
    public LinearLayout secondaryInformationLL;
    private SearchPlacesViewModel viewModel;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB-\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u001c"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/ui/SearchPlaceActivity$Config;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lja/u;", "writeToParcel", "", "apiKey", "Ljava/lang/String;", "getApiKey", "()Ljava/lang/String;", "setApiKey", "(Ljava/lang/String;)V", "location", "getLocation", "setLocation", "enclosingRadius", "getEnclosingRadius", "setEnclosingRadius", "searchBarTitle", "getSearchBarTitle", "setSearchBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Builder", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: com.oneclickaway.opensource.placeautocomplete.ui.SearchPlaceActivity$Config */
    /* compiled from: SearchPlaceActivity.kt */
    public static final class Config implements Parcelable {
        public static final Parcelable.Creator CREATOR = new Creator();
        private String apiKey;
        private String enclosingRadius;
        private String location;
        private String searchBarTitle;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u0016J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\tJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bHÖ\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0006\u0010\u0016R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\b\u0010\u0016R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016¨\u0006\u001d"}, mo71668d2 = {"Lcom/oneclickaway/opensource/placeautocomplete/ui/SearchPlaceActivity$Config$Builder;", "Landroid/os/Parcelable;", "", "location", "setMyLocation", "enclosingRadius", "setEnclosingRadius", "searchBarTitle", "setSearchBarTitle", "Lcom/oneclickaway/opensource/placeautocomplete/ui/SearchPlaceActivity$Config;", "build", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lja/u;", "writeToParcel", "Ljava/lang/String;", "getLocation", "()Ljava/lang/String;", "setLocation", "(Ljava/lang/String;)V", "getEnclosingRadius", "getSearchBarTitle", "apiKey", "getApiKey", "setApiKey", "<init>", "place_autocomplete_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: com.oneclickaway.opensource.placeautocomplete.ui.SearchPlaceActivity$Config$Builder */
        /* compiled from: SearchPlaceActivity.kt */
        public static final class Builder implements Parcelable {
            public static final Parcelable.Creator CREATOR = new Creator();
            private String apiKey;
            private String enclosingRadius = "";
            private String location = "";
            private String searchBarTitle = "Enter Location";

            @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 15})
            /* renamed from: com.oneclickaway.opensource.placeautocomplete.ui.SearchPlaceActivity$Config$Builder$Creator */
            public static class Creator implements Parcelable.Creator {
                public final Object createFromParcel(Parcel parcel) {
                    C13706o.m87930g(parcel, "in");
                    return new Builder(parcel.readString());
                }

                public final Object[] newArray(int i) {
                    return new Builder[i];
                }
            }

            public Builder(String str) {
                C13706o.m87930g(str, "apiKey");
                this.apiKey = str;
            }

            public final Config build() {
                return new Config(this.apiKey, this.location, this.enclosingRadius, this.searchBarTitle);
            }

            public int describeContents() {
                return 0;
            }

            public final String getApiKey() {
                return this.apiKey;
            }

            public final String getEnclosingRadius() {
                return this.enclosingRadius;
            }

            public final String getLocation() {
                return this.location;
            }

            public final String getSearchBarTitle() {
                return this.searchBarTitle;
            }

            public final void setApiKey(String str) {
                C13706o.m87930g(str, "<set-?>");
                this.apiKey = str;
            }

            /* renamed from: setEnclosingRadius  reason: collision with other method in class */
            public final void m101287setEnclosingRadius(String str) {
                C13706o.m87930g(str, "<set-?>");
                this.enclosingRadius = str;
            }

            public final void setLocation(String str) {
                C13706o.m87930g(str, "<set-?>");
                this.location = str;
            }

            public final Builder setMyLocation(String str) {
                C13706o.m87930g(str, "location");
                this.location = str;
                return this;
            }

            /* renamed from: setSearchBarTitle  reason: collision with other method in class */
            public final void m101288setSearchBarTitle(String str) {
                C13706o.m87930g(str, "<set-?>");
                this.searchBarTitle = str;
            }

            public void writeToParcel(Parcel parcel, int i) {
                C13706o.m87930g(parcel, "parcel");
                parcel.writeString(this.apiKey);
            }

            public final Builder setEnclosingRadius(String str) {
                C13706o.m87930g(str, "enclosingRadius");
                this.enclosingRadius = str;
                return this;
            }

            public final Builder setSearchBarTitle(String str) {
                C13706o.m87930g(str, "searchBarTitle");
                this.searchBarTitle = str;
                return this;
            }
        }

        @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 15})
        /* renamed from: com.oneclickaway.opensource.placeautocomplete.ui.SearchPlaceActivity$Config$Creator */
        public static class Creator implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                C13706o.m87930g(parcel, "in");
                return new Config(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final Object[] newArray(int i) {
                return new Config[i];
            }
        }

        public Config(String str, String str2, String str3, String str4) {
            C13706o.m87930g(str, "apiKey");
            C13706o.m87930g(str2, "location");
            C13706o.m87930g(str3, "enclosingRadius");
            C13706o.m87930g(str4, "searchBarTitle");
            this.apiKey = str;
            this.location = str2;
            this.enclosingRadius = str3;
            this.searchBarTitle = str4;
        }

        public int describeContents() {
            return 0;
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getEnclosingRadius() {
            return this.enclosingRadius;
        }

        public final String getLocation() {
            return this.location;
        }

        public final String getSearchBarTitle() {
            return this.searchBarTitle;
        }

        public final void setApiKey(String str) {
            C13706o.m87930g(str, "<set-?>");
            this.apiKey = str;
        }

        public final void setEnclosingRadius(String str) {
            C13706o.m87930g(str, "<set-?>");
            this.enclosingRadius = str;
        }

        public final void setLocation(String str) {
            C13706o.m87930g(str, "<set-?>");
            this.location = str;
        }

        public final void setSearchBarTitle(String str) {
            C13706o.m87930g(str, "<set-?>");
            this.searchBarTitle = str;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C13706o.m87930g(parcel, "parcel");
            parcel.writeString(this.apiKey);
            parcel.writeString(this.location);
            parcel.writeString(this.enclosingRadius);
            parcel.writeString(this.searchBarTitle);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Config(String str, String str2, String str3, String str4, int i, C13695i iVar) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "Enter Location" : str4);
        }
    }

    @Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 1, 15})
    /* renamed from: com.oneclickaway.opensource.placeautocomplete.ui.SearchPlaceActivity$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[LoadingManager.values().length];
            $EnumSwitchMapping$0 = iArr;
            LoadingManager loadingManager = LoadingManager.STATE_NO_INTERNET;
            iArr[loadingManager.ordinal()] = 1;
            LoadingManager loadingManager2 = LoadingManager.STATE_ERROR;
            iArr[loadingManager2.ordinal()] = 2;
            LoadingManager loadingManager3 = LoadingManager.STATE_NO_RESULT;
            iArr[loadingManager3.ordinal()] = 3;
            int[] iArr2 = new int[LoadingManager.values().length];
            $EnumSwitchMapping$1 = iArr2;
            LoadingManager loadingManager4 = LoadingManager.STATE_REFRESHING;
            iArr2[loadingManager4.ordinal()] = 1;
            LoadingManager loadingManager5 = LoadingManager.STATE_COMPLETED;
            iArr2[loadingManager5.ordinal()] = 2;
            iArr2[loadingManager.ordinal()] = 3;
            iArr2[loadingManager2.ordinal()] = 4;
            iArr2[loadingManager3.ordinal()] = 5;
            iArr2[LoadingManager.STATE_IDLE.ordinal()] = 6;
            int[] iArr3 = new int[LoadingManager.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[loadingManager4.ordinal()] = 1;
            iArr3[loadingManager5.ordinal()] = 2;
            iArr3[loadingManager.ordinal()] = 3;
            iArr3[loadingManager2.ordinal()] = 4;
            int[] iArr4 = new int[LoadingManager.values().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[loadingManager5.ordinal()] = 1;
            iArr4[loadingManager4.ordinal()] = 2;
            iArr4[loadingManager2.ordinal()] = 3;
            iArr4[loadingManager.ordinal()] = 4;
            iArr4[loadingManager3.ordinal()] = 5;
        }
    }

    public static final /* synthetic */ SearchResultAdapter access$getSearchListAdapter$p(SearchPlaceActivity searchPlaceActivity) {
        SearchResultAdapter searchResultAdapter = searchPlaceActivity.searchListAdapter;
        if (searchResultAdapter == null) {
            C13706o.m87945v("searchListAdapter");
        }
        return searchResultAdapter;
    }

    private final void attachEraserObserver() {
        this.liveQueryInEditText.observe(this, new SearchPlaceActivity$attachEraserObserver$1(this));
    }

    private final void attachLiveObservers() {
        getViewModel().getLiveListOfSearchResultsStream().observe(this, new SearchPlaceActivity$attachLiveObservers$1(this));
        getViewModel().getPlaceDetailsLiveDataStream().observe(this, new SearchPlaceActivity$attachLiveObservers$2(this));
        getViewModel().getLoadingPredictionManager().observe(this, new SearchPlaceActivity$attachLiveObservers$3(this));
        getViewModel().getLoadingPlaceManager().observe(this, new SearchPlaceActivity$attachLiveObservers$4(this));
        getViewModel().getRecentSearchesManager().observe(this, new SearchPlaceActivity$attachLiveObservers$5(this));
        getViewModel().getRecentSearchesData().observe(this, new SearchPlaceActivity$attachLiveObservers$6(this));
        attachEraserObserver();
    }

    /* access modifiers changed from: private */
    public final SearchPlacesViewModel getViewModel() {
        SearchPlacesViewModel searchPlacesViewModel = this.viewModel;
        if (searchPlacesViewModel == null) {
            C13706o.m87945v("viewModel");
        }
        return searchPlacesViewModel;
    }

    private final void inflateViews() {
        View findViewById = findViewById(C11709R.C11712id.searchTitleTV);
        C13706o.m87925b(findViewById, "findViewById(R.id.searchTitleTV)");
        this.searchTitleTV = (TextView) findViewById;
        View findViewById2 = findViewById(C11709R.C11712id.searchProgressBar);
        C13706o.m87925b(findViewById2, "findViewById(R.id.searchProgressBar)");
        this.searchProgressBar = (ProgressBar) findViewById2;
        View findViewById3 = findViewById(C11709R.C11712id.secondaryInformationLL);
        C13706o.m87925b(findViewById3, "findViewById(R.id.secondaryInformationLL)");
        this.secondaryInformationLL = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(C11709R.C11712id.placeNamET);
        C13706o.m87925b(findViewById4, "findViewById(R.id.placeNamET)");
        this.placeNamET = (EditText) findViewById4;
        View findViewById5 = findViewById(C11709R.C11712id.searchResultsRV);
        C13706o.m87925b(findViewById5, "findViewById(R.id.searchResultsRV)");
        this.searchResultsRV = (RecyclerView) findViewById5;
        View findViewById6 = findViewById(C11709R.C11712id.secondaryInfoTitleTV);
        C13706o.m87925b(findViewById6, "findViewById(R.id.secondaryInfoTitleTV)");
        this.secondaryInfoTitleTV = (TextView) findViewById6;
        View findViewById7 = findViewById(C11709R.C11712id.secondaryInfoSubTitleTV);
        C13706o.m87925b(findViewById7, "findViewById(R.id.secondaryInfoSubTitleTV)");
        this.secondaryInfoSubTitleTV = (TextView) findViewById7;
        View findViewById8 = findViewById(C11709R.C11712id.backImageBtn);
        C13706o.m87925b(findViewById8, "findViewById(R.id.backImageBtn)");
        this.backImageBtn = (ImageView) findViewById8;
        View findViewById9 = findViewById(C11709R.C11712id.recentSearchesRV);
        C13706o.m87925b(findViewById9, "findViewById(R.id.recentSearchesRV)");
        this.recentSearchesRV = (RecyclerView) findViewById9;
        this.recentSearchesLL = (LinearLayout) findViewById(C11709R.C11712id.recentSearchesLL);
        View findViewById10 = findViewById(C11709R.C11712id.eraseCurrentEntryIV);
        C13706o.m87925b(findViewById10, "findViewById(R.id.eraseCurrentEntryIV)");
        this.eraseCurrentEntryIV = (ImageView) findViewById10;
    }

    private final void initDb() {
        this.recentSearchesDB = RecentSearchesDB.Companion.getInstance(this);
        getViewModel().requestListOfRecentSearches();
    }

    private final void initDialogForGettingPlaceDetails() {
        Dialog dialog = new Dialog(this);
        this.gettingPlaceDataDialog = dialog;
        dialog.setContentView(C11709R.C11713layout.loading_place_details);
        Dialog dialog2 = this.gettingPlaceDataDialog;
        if (dialog2 == null) {
            C13706o.m87945v("gettingPlaceDataDialog");
        }
        C7271c.m30018u(this).mo37182l().mo37173L0(Integer.valueOf(C11709R.raw.loading_spinner)).mo37169G0((ImageView) dialog2.findViewById(C11709R.C11712id.progressImageIV));
    }

    private final void initializeDependency() {
        Intent intent = getIntent();
        SearchPlacesStatusCodes searchPlacesStatusCodes = SearchPlacesStatusCodes.INSTANCE;
        if (intent.hasExtra(searchPlacesStatusCodes.getCONFIG())) {
            Intent intent2 = getIntent();
            C13706o.m87925b(intent2, "intent");
            Bundle extras = intent2.getExtras();
            String str = null;
            Config config = extras != null ? (Config) extras.getParcelable(searchPlacesStatusCodes.getCONFIG()) : null;
            this.apiKey = config != null ? config.getApiKey() : null;
            this.location = config != null ? config.getLocation() : null;
            this.enclosingRadius = config != null ? config.getEnclosingRadius() : null;
            TextView textView = this.searchTitleTV;
            if (textView == null) {
                C13706o.m87945v("searchTitleTV");
            }
            if (config != null) {
                str = config.getSearchBarTitle();
            }
            textView.setText(str);
            return;
        }
        Toast.makeText(this, "Please mention the api key in put-extra", 1).show();
        finish();
    }

    private final void setOnClickListeners() {
        ImageView imageView = this.backImageBtn;
        if (imageView == null) {
            C13706o.m87945v("backImageBtn");
        }
        imageView.setOnClickListener(this);
        ImageView imageView2 = this.eraseCurrentEntryIV;
        if (imageView2 == null) {
            C13706o.m87945v("eraseCurrentEntryIV");
        }
        imageView2.setOnClickListener(this);
    }

    private final void setOnQueryChangeListener() {
        EditText editText = this.placeNamET;
        if (editText == null) {
            C13706o.m87945v("placeNamET");
        }
        C15584a.m94764a(editText).mo79705l(500, TimeUnit.MILLISECONDS).mo79679I(C16971a.m100210a()).mo79688T(C12318a.m83030b()).mo79689U(new SearchPlaceActivity$setOnQueryChangeListener$1(this));
    }

    private final void setRecyclerView() {
        RecyclerView recyclerView = this.searchResultsRV;
        if (recyclerView == null) {
            C13706o.m87945v("searchResultsRV");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.searchListAdapter = new SearchResultAdapter((List) null, this, 1, (C13695i) null);
        RecyclerView recyclerView2 = this.searchResultsRV;
        if (recyclerView2 == null) {
            C13706o.m87945v("searchResultsRV");
        }
        SearchResultAdapter searchResultAdapter = this.searchListAdapter;
        if (searchResultAdapter == null) {
            C13706o.m87945v("searchListAdapter");
        }
        recyclerView2.setAdapter(searchResultAdapter);
    }

    /* access modifiers changed from: private */
    public final void setSecondaryStateInformation(LoadingManager loadingManager) {
        RecyclerView recyclerView = this.searchResultsRV;
        if (recyclerView == null) {
            C13706o.m87945v("searchResultsRV");
        }
        recyclerView.setVisibility(8);
        ProgressBar progressBar = this.searchProgressBar;
        if (progressBar == null) {
            C13706o.m87945v("searchProgressBar");
        }
        progressBar.setVisibility(8);
        LinearLayout linearLayout = this.secondaryInformationLL;
        if (linearLayout == null) {
            C13706o.m87945v("secondaryInformationLL");
        }
        linearLayout.setVisibility(0);
        int i = WhenMappings.$EnumSwitchMapping$0[loadingManager.ordinal()];
        if (i == 1) {
            TextView textView = this.secondaryInfoTitleTV;
            if (textView == null) {
                C13706o.m87945v("secondaryInfoTitleTV");
            }
            textView.setText("No internet");
            TextView textView2 = this.secondaryInfoSubTitleTV;
            if (textView2 == null) {
                C13706o.m87945v("secondaryInfoSubTitleTV");
            }
            textView2.setText("Please connect to internet and try again");
        } else if (i == 2) {
            TextView textView3 = this.secondaryInfoTitleTV;
            if (textView3 == null) {
                C13706o.m87945v("secondaryInfoTitleTV");
            }
            textView3.setText("Oops!");
            TextView textView4 = this.secondaryInfoSubTitleTV;
            if (textView4 == null) {
                C13706o.m87945v("secondaryInfoSubTitleTV");
            }
            textView4.setText("We're having some trouble connecting to our servers");
        } else if (i != 3) {
            System.out.print("no state detected");
        } else {
            TextView textView5 = this.secondaryInfoTitleTV;
            if (textView5 == null) {
                C13706o.m87945v("secondaryInfoTitleTV");
            }
            textView5.setText(getString(C11709R.string.location_not_found));
            TextView textView6 = this.secondaryInfoSubTitleTV;
            if (textView6 == null) {
                C13706o.m87945v("secondaryInfoSubTitleTV");
            }
            textView6.setText(getString(C11709R.string.please_check_spell_errors));
        }
    }

    private final void setViewModel() {
        ViewModel viewModel2 = ViewModelProviders.m535of((FragmentActivity) this).get(SearchPlacesViewModel.class);
        C13706o.m87925b(viewModel2, "ViewModelProviders.of(th…cesViewModel::class.java)");
        this.viewModel = (SearchPlacesViewModel) viewModel2;
    }

    public final ImageView getBackImageBtn() {
        ImageView imageView = this.backImageBtn;
        if (imageView == null) {
            C13706o.m87945v("backImageBtn");
        }
        return imageView;
    }

    public final ImageView getEraseCurrentEntryIV() {
        ImageView imageView = this.eraseCurrentEntryIV;
        if (imageView == null) {
            C13706o.m87945v("eraseCurrentEntryIV");
        }
        return imageView;
    }

    public final Dialog getGettingPlaceDataDialog() {
        Dialog dialog = this.gettingPlaceDataDialog;
        if (dialog == null) {
            C13706o.m87945v("gettingPlaceDataDialog");
        }
        return dialog;
    }

    public final EditText getPlaceNamET() {
        EditText editText = this.placeNamET;
        if (editText == null) {
            C13706o.m87945v("placeNamET");
        }
        return editText;
    }

    public final RecentSearchesDB getRecentSearchesDB() {
        return this.recentSearchesDB;
    }

    public final LinearLayout getRecentSearchesLL() {
        return this.recentSearchesLL;
    }

    public final RecyclerView getRecentSearchesRV() {
        RecyclerView recyclerView = this.recentSearchesRV;
        if (recyclerView == null) {
            C13706o.m87945v("recentSearchesRV");
        }
        return recyclerView;
    }

    public final ProgressBar getSearchProgressBar() {
        ProgressBar progressBar = this.searchProgressBar;
        if (progressBar == null) {
            C13706o.m87945v("searchProgressBar");
        }
        return progressBar;
    }

    public final RecyclerView getSearchResultsRV() {
        RecyclerView recyclerView = this.searchResultsRV;
        if (recyclerView == null) {
            C13706o.m87945v("searchResultsRV");
        }
        return recyclerView;
    }

    public final TextView getSearchTitleTV() {
        TextView textView = this.searchTitleTV;
        if (textView == null) {
            C13706o.m87945v("searchTitleTV");
        }
        return textView;
    }

    public final TextView getSecondaryInfoSubTitleTV() {
        TextView textView = this.secondaryInfoSubTitleTV;
        if (textView == null) {
            C13706o.m87945v("secondaryInfoSubTitleTV");
        }
        return textView;
    }

    public final TextView getSecondaryInfoTitleTV() {
        TextView textView = this.secondaryInfoTitleTV;
        if (textView == null) {
            C13706o.m87945v("secondaryInfoTitleTV");
        }
        return textView;
    }

    public final LinearLayout getSecondaryInformationLL() {
        LinearLayout linearLayout = this.secondaryInformationLL;
        if (linearLayout == null) {
            C13706o.m87945v("secondaryInformationLL");
        }
        return linearLayout;
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(C11709R.anim.abc_fade_in, C11709R.anim.abc_fade_out);
    }

    public void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i = C11709R.C11712id.backImageBtn;
        if (valueOf != null && valueOf.intValue() == i) {
            onBackPressed();
            return;
        }
        int i2 = C11709R.C11712id.eraseCurrentEntryIV;
        if (valueOf != null && valueOf.intValue() == i2) {
            EditText editText = this.placeNamET;
            if (editText == null) {
                C13706o.m87945v("placeNamET");
            }
            editText.getText().clear();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C11709R.C11713layout.activity_search_place);
        setViewModel();
        initDb();
        inflateViews();
        initializeDependency();
        initDialogForGettingPlaceDetails();
        setOnClickListeners();
        setRecyclerView();
        setOnQueryChangeListener();
        attachLiveObservers();
    }

    public void onPlaceItemSelected(PredictionsItem predictionsItem) {
        if (predictionsItem != null) {
            SearchPlacesViewModel viewModel2 = getViewModel();
            String valueOf = String.valueOf(predictionsItem.getPlaceId());
            String str = this.apiKey;
            if (str == null) {
                C13706o.m87939p();
            }
            viewModel2.requestPlaceDetails(valueOf, str);
        }
    }

    public void onRecantsItemSelected(GroupStrategy.ListItem listItem) {
        C13706o.m87930g(listItem, "savedItem");
        if (listItem instanceof GroupStrategy.GeneralItem) {
            SearchPlacesViewModel viewModel2 = getViewModel();
            String placeId = ((GroupStrategy.GeneralItem) listItem).getSearchSelectedItem().getPlaceId();
            String str = this.apiKey;
            if (str == null) {
                C13706o.m87939p();
            }
            viewModel2.requestPlaceDetails(placeId, str);
        }
    }

    public final void setBackImageBtn(ImageView imageView) {
        C13706o.m87930g(imageView, "<set-?>");
        this.backImageBtn = imageView;
    }

    public final void setEraseCurrentEntryIV(ImageView imageView) {
        C13706o.m87930g(imageView, "<set-?>");
        this.eraseCurrentEntryIV = imageView;
    }

    public final void setGettingPlaceDataDialog(Dialog dialog) {
        C13706o.m87930g(dialog, "<set-?>");
        this.gettingPlaceDataDialog = dialog;
    }

    public final void setPlaceNamET(EditText editText) {
        C13706o.m87930g(editText, "<set-?>");
        this.placeNamET = editText;
    }

    public final void setRecentSearchesDB(RecentSearchesDB recentSearchesDB2) {
        this.recentSearchesDB = recentSearchesDB2;
    }

    public final void setRecentSearchesLL(LinearLayout linearLayout) {
        this.recentSearchesLL = linearLayout;
    }

    public final void setRecentSearchesRV(RecyclerView recyclerView) {
        C13706o.m87930g(recyclerView, "<set-?>");
        this.recentSearchesRV = recyclerView;
    }

    public final void setSearchProgressBar(ProgressBar progressBar) {
        C13706o.m87930g(progressBar, "<set-?>");
        this.searchProgressBar = progressBar;
    }

    public final void setSearchResultsRV(RecyclerView recyclerView) {
        C13706o.m87930g(recyclerView, "<set-?>");
        this.searchResultsRV = recyclerView;
    }

    public final void setSearchTitleTV(TextView textView) {
        C13706o.m87930g(textView, "<set-?>");
        this.searchTitleTV = textView;
    }

    public final void setSecondaryInfoSubTitleTV(TextView textView) {
        C13706o.m87930g(textView, "<set-?>");
        this.secondaryInfoSubTitleTV = textView;
    }

    public final void setSecondaryInfoTitleTV(TextView textView) {
        C13706o.m87930g(textView, "<set-?>");
        this.secondaryInfoTitleTV = textView;
    }

    public final void setSecondaryInformationLL(LinearLayout linearLayout) {
        C13706o.m87930g(linearLayout, "<set-?>");
        this.secondaryInformationLL = linearLayout;
    }
}
