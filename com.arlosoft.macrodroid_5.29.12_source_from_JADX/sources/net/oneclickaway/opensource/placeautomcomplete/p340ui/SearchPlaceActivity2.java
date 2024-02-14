package net.oneclickaway.opensource.placeautomcomplete.p340ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.p023dx.rop.code.RegisterSpec;
import com.arlosoft.macrodroid.C17535R$layout;
import com.oneclickaway.opensource.placeautocomplete.data.adapter.RecentSearchesAdapter;
import com.oneclickaway.opensource.placeautocomplete.data.adapter.SearchResultAdapter;
import com.oneclickaway.opensource.placeautocomplete.data.api.bean.place_details.PlaceDetails;
import com.oneclickaway.opensource.placeautocomplete.data.api.bean.places_response.PredictionsItem;
import com.oneclickaway.opensource.placeautocomplete.data.model.view.SearchPlacesViewModel;
import com.oneclickaway.opensource.placeautocomplete.data.room.RecentSearchesDB;
import com.oneclickaway.opensource.placeautocomplete.interfaces.SearchPlaces;
import com.oneclickaway.opensource.placeautocomplete.p232ui.SearchPlaceActivity;
import com.oneclickaway.opensource.placeautocomplete.utils.GroupStrategy;
import com.oneclickaway.opensource.placeautocomplete.utils.LoadingManager;
import com.oneclickaway.opensource.placeautocomplete.utils.SearchPlacesStatusCodes;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p350oc.C15843a;
import p350oc.C15844b;
import p350oc.C15845c;
import p350oc.C15846d;
import p350oc.C15847e;
import p350oc.C15848f;
import p350oc.C15849g;

/* renamed from: net.oneclickaway.opensource.placeautomcomplete.ui.SearchPlaceActivity2 */
/* compiled from: SearchPlaceActivity2.kt */
public final class SearchPlaceActivity2 extends AppCompatActivity implements SearchPlaces.PlaceItemSelectedListener, SearchPlaces.RecentItemSelectedListener, View.OnClickListener {

    /* renamed from: A */
    public TextView f65174A;

    /* renamed from: B */
    public ProgressBar f65175B;

    /* renamed from: C */
    public LinearLayout f65176C;

    /* renamed from: D */
    public EditText f65177D;

    /* renamed from: E */
    public RecyclerView f65178E;

    /* renamed from: F */
    public TextView f65179F;

    /* renamed from: G */
    public TextView f65180G;

    /* renamed from: H */
    public ImageView f65181H;

    /* renamed from: I */
    public ImageView f65182I;

    /* renamed from: J */
    private RecentSearchesDB f65183J;

    /* renamed from: K */
    private LinearLayout f65184K;

    /* renamed from: L */
    public RecyclerView f65185L;

    /* renamed from: M */
    public Map<Integer, View> f65186M = new LinkedHashMap();

    /* renamed from: d */
    private SearchPlacesViewModel f65187d;

    /* renamed from: f */
    private SearchResultAdapter f65188f;

    /* renamed from: g */
    public Dialog f65189g;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f65190o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f65191p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f65192s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public MutableLiveData<String> f65193z = new MutableLiveData<>();

    /* renamed from: net.oneclickaway.opensource.placeautomcomplete.ui.SearchPlaceActivity2$a */
    /* compiled from: SearchPlaceActivity2.kt */
    public /* synthetic */ class C15794a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65194a;

        static {
            int[] iArr = new int[LoadingManager.values().length];
            iArr[LoadingManager.STATE_NO_INTERNET.ordinal()] = 1;
            iArr[LoadingManager.STATE_ERROR.ordinal()] = 2;
            iArr[LoadingManager.STATE_NO_RESULT.ordinal()] = 3;
            iArr[LoadingManager.STATE_REFRESHING.ordinal()] = 4;
            iArr[LoadingManager.STATE_COMPLETED.ordinal()] = 5;
            iArr[LoadingManager.STATE_IDLE.ordinal()] = 6;
            f65194a = iArr;
        }
    }

    /* renamed from: net.oneclickaway.opensource.placeautomcomplete.ui.SearchPlaceActivity2$b */
    /* compiled from: SearchPlaceActivity2.kt */
    public static final class C15795b implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ SearchPlaceActivity2 f65195a;

        C15795b(SearchPlaceActivity2 searchPlaceActivity2) {
            this.f65195a = searchPlaceActivity2;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            C13706o.m87929f(view, RegisterSpec.PREFIX);
            C13706o.m87929f(keyEvent, NotificationCompat.CATEGORY_EVENT);
            if (keyEvent.getAction() != 0 || i != 66) {
                return false;
            }
            Editable text = this.f65195a.getPlaceNamET().getText();
            this.f65195a.f65193z.postValue(text.toString());
            SearchPlacesViewModel V1 = this.f65195a.getViewModel();
            String obj = text.toString();
            String R1 = this.f65195a.f65190o;
            C13706o.m87926c(R1);
            String U1 = this.f65195a.f65191p;
            if (U1 == null) {
                U1 = "";
            }
            String S1 = this.f65195a.f65192s;
            if (S1 == null) {
                S1 = "500";
            }
            V1.requestListOfSearchResults(obj, R1, U1, S1);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public static final void m95348W1(SearchPlaceActivity2 searchPlaceActivity2, String str) {
        C13706o.m87929f(searchPlaceActivity2, "this$0");
        if (str != null) {
            if (str.length() > 0) {
                searchPlaceActivity2.getEraseCurrentEntryIV().setVisibility(0);
                return;
            }
        }
        searchPlaceActivity2.getEraseCurrentEntryIV().setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public static final void m95349X1(SearchPlaceActivity2 searchPlaceActivity2, List list) {
        C13706o.m87929f(searchPlaceActivity2, "this$0");
        SearchResultAdapter searchResultAdapter = searchPlaceActivity2.f65188f;
        if (searchResultAdapter == null) {
            C13706o.m87945v("searchListAdapter");
            searchResultAdapter = null;
        }
        searchResultAdapter.setSearchCandidates(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public static final void m95350Y1(SearchPlaceActivity2 searchPlaceActivity2, PlaceDetails placeDetails) {
        C13706o.m87929f(searchPlaceActivity2, "this$0");
        if (placeDetails != null) {
            Intent intent = new Intent();
            intent.putExtra(SearchPlacesStatusCodes.INSTANCE.getPLACE_DATA(), placeDetails);
            searchPlaceActivity2.setResult(-1, intent);
        }
        searchPlaceActivity2.finishAfterTransition();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public static final void m95351Z1(SearchPlaceActivity2 searchPlaceActivity2, LoadingManager loadingManager) {
        C13706o.m87929f(searchPlaceActivity2, "this$0");
        switch (loadingManager == null ? -1 : C15794a.f65194a[loadingManager.ordinal()]) {
            case 1:
                LinearLayout linearLayout = searchPlaceActivity2.f65184K;
                C13706o.m87926c(linearLayout);
                linearLayout.setVisibility(8);
                searchPlaceActivity2.setSecondaryStateInformation(LoadingManager.STATE_NO_INTERNET);
                return;
            case 2:
                LinearLayout linearLayout2 = searchPlaceActivity2.f65184K;
                C13706o.m87926c(linearLayout2);
                linearLayout2.setVisibility(8);
                searchPlaceActivity2.setSecondaryStateInformation(LoadingManager.STATE_ERROR);
                return;
            case 3:
                LinearLayout linearLayout3 = searchPlaceActivity2.f65184K;
                C13706o.m87926c(linearLayout3);
                linearLayout3.setVisibility(8);
                searchPlaceActivity2.setSecondaryStateInformation(LoadingManager.STATE_NO_RESULT);
                return;
            case 4:
                LinearLayout linearLayout4 = searchPlaceActivity2.f65184K;
                C13706o.m87926c(linearLayout4);
                linearLayout4.setVisibility(8);
                searchPlaceActivity2.getSearchProgressBar().setVisibility(0);
                if (searchPlaceActivity2.getSecondaryInformationLL().getVisibility() != 0) {
                    searchPlaceActivity2.getSearchResultsRV().setVisibility(0);
                    return;
                }
                return;
            case 5:
                LinearLayout linearLayout5 = searchPlaceActivity2.f65184K;
                C13706o.m87926c(linearLayout5);
                linearLayout5.setVisibility(8);
                searchPlaceActivity2.getSearchResultsRV().setVisibility(0);
                searchPlaceActivity2.getSearchProgressBar().setVisibility(8);
                searchPlaceActivity2.getSecondaryInformationLL().setVisibility(8);
                return;
            case 6:
                searchPlaceActivity2.getEraseCurrentEntryIV().setVisibility(8);
                searchPlaceActivity2.getSearchResultsRV().setVisibility(8);
                searchPlaceActivity2.getSearchProgressBar().setVisibility(8);
                searchPlaceActivity2.getSecondaryInformationLL().setVisibility(8);
                LinearLayout linearLayout6 = searchPlaceActivity2.f65184K;
                C13706o.m87926c(linearLayout6);
                linearLayout6.setVisibility(0);
                return;
            default:
                System.out.print("No loading state detected");
                return;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public static final void m95352a2(SearchPlaceActivity2 searchPlaceActivity2, LoadingManager loadingManager) {
        C13706o.m87929f(searchPlaceActivity2, "this$0");
        int i = loadingManager == null ? -1 : C15794a.f65194a[loadingManager.ordinal()];
        if (i == 1) {
            searchPlaceActivity2.getGettingPlaceDataDialog().cancel();
            Toast.makeText(searchPlaceActivity2, searchPlaceActivity2.getString(2131954406), 1).show();
        } else if (i == 2) {
            searchPlaceActivity2.getGettingPlaceDataDialog().cancel();
            Toast.makeText(searchPlaceActivity2, searchPlaceActivity2.getString(2131955542), 1).show();
        } else if (i == 4) {
            searchPlaceActivity2.getGettingPlaceDataDialog().show();
        } else if (i != 5) {
            System.out.print("No loading state detected");
        } else {
            searchPlaceActivity2.getGettingPlaceDataDialog().cancel();
        }
    }

    private final void attachEraserObserver() {
        this.f65193z.observe(this, new C15847e(this));
    }

    private final void attachLiveObservers() {
        getViewModel().getLiveListOfSearchResultsStream().observe(this, new C15849g(this));
        getViewModel().getPlaceDetailsLiveDataStream().observe(this, new C15843a(this));
        getViewModel().getLoadingPredictionManager().observe(this, new C15846d(this));
        getViewModel().getLoadingPlaceManager().observe(this, new C15845c(this));
        getViewModel().getRecentSearchesManager().observe(this, new C15844b(this));
        getViewModel().getRecentSearchesData().observe(this, new C15848f(this));
        attachEraserObserver();
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public static final void m95353b2(SearchPlaceActivity2 searchPlaceActivity2, LoadingManager loadingManager) {
        C13706o.m87929f(searchPlaceActivity2, "this$0");
        if ((loadingManager == null ? -1 : C15794a.f65194a[loadingManager.ordinal()]) == 2) {
            Toast.makeText(searchPlaceActivity2, "State Error", 1).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public static final void m95354c2(SearchPlaceActivity2 searchPlaceActivity2, List list) {
        C13706o.m87929f(searchPlaceActivity2, "this$0");
        if (list != null) {
            searchPlaceActivity2.getRecentSearchesRV().setLayoutManager(new LinearLayoutManager(searchPlaceActivity2));
            searchPlaceActivity2.getRecentSearchesRV().setAdapter(new RecentSearchesAdapter(new GroupStrategy().groupDataByTime(list), searchPlaceActivity2));
        }
    }

    /* access modifiers changed from: private */
    public final SearchPlacesViewModel getViewModel() {
        SearchPlacesViewModel searchPlacesViewModel = this.f65187d;
        if (searchPlacesViewModel != null) {
            return searchPlacesViewModel;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    private final void inflateViews() {
        View findViewById = findViewById(2131363686);
        C13706o.m87928e(findViewById, "findViewById(R.id.searchTitleTV)");
        setSearchTitleTV((TextView) findViewById);
        View findViewById2 = findViewById(2131363684);
        C13706o.m87928e(findViewById2, "findViewById(R.id.searchProgressBar)");
        setSearchProgressBar((ProgressBar) findViewById2);
        View findViewById3 = findViewById(2131363703);
        C13706o.m87928e(findViewById3, "findViewById(R.id.secondaryInformationLL)");
        setSecondaryInformationLL((LinearLayout) findViewById3);
        View findViewById4 = findViewById(2131363502);
        C13706o.m87928e(findViewById4, "findViewById(R.id.placeNamET)");
        setPlaceNamET((EditText) findViewById4);
        View findViewById5 = findViewById(2131363685);
        C13706o.m87928e(findViewById5, "findViewById(R.id.searchResultsRV)");
        setSearchResultsRV((RecyclerView) findViewById5);
        View findViewById6 = findViewById(2131363702);
        C13706o.m87928e(findViewById6, "findViewById(R.id.secondaryInfoTitleTV)");
        setSecondaryInfoTitleTV((TextView) findViewById6);
        View findViewById7 = findViewById(2131363701);
        C13706o.m87928e(findViewById7, "findViewById(R.id.secondaryInfoSubTitleTV)");
        setSecondaryInfoSubTitleTV((TextView) findViewById7);
        View findViewById8 = findViewById(2131362029);
        C13706o.m87928e(findViewById8, "findViewById(R.id.backImageBtn)");
        setBackImageBtn((ImageView) findViewById8);
        View findViewById9 = findViewById(2131363589);
        C13706o.m87928e(findViewById9, "findViewById(R.id.recentSearchesRV)");
        setRecentSearchesRV((RecyclerView) findViewById9);
        this.f65184K = (LinearLayout) findViewById(2131363588);
        View findViewById10 = findViewById(2131362717);
        C13706o.m87928e(findViewById10, "findViewById(R.id.eraseCurrentEntryIV)");
        setEraseCurrentEntryIV((ImageView) findViewById10);
    }

    private final void initDb() {
        this.f65183J = RecentSearchesDB.Companion.getInstance(this);
        getViewModel().requestListOfRecentSearches();
    }

    private final void initDialogForGettingPlaceDetails() {
        setGettingPlaceDataDialog(new Dialog(this));
        getGettingPlaceDataDialog().setContentView(C17535R$layout.loading_place_details_2);
    }

    private final void initializeDependency() {
        Intent intent = getIntent();
        SearchPlacesStatusCodes searchPlacesStatusCodes = SearchPlacesStatusCodes.INSTANCE;
        if (intent.hasExtra(searchPlacesStatusCodes.getCONFIG())) {
            Bundle extras = getIntent().getExtras();
            String str = null;
            SearchPlaceActivity.Config config = extras != null ? (SearchPlaceActivity.Config) extras.getParcelable(searchPlacesStatusCodes.getCONFIG()) : null;
            this.f65190o = config != null ? config.getApiKey() : null;
            this.f65191p = config != null ? config.getLocation() : null;
            this.f65192s = config != null ? config.getEnclosingRadius() : null;
            TextView searchTitleTV = getSearchTitleTV();
            if (config != null) {
                str = config.getSearchBarTitle();
            }
            searchTitleTV.setText(str);
            return;
        }
        Toast.makeText(this, "Please mention the api key in put-extra", 1).show();
        finish();
    }

    private final void setOnClickListeners() {
        getBackImageBtn().setOnClickListener(this);
        getEraseCurrentEntryIV().setOnClickListener(this);
    }

    private final void setOnQueryChangeListener() {
        getPlaceNamET().setOnKeyListener(new C15795b(this));
    }

    private final void setRecyclerView() {
        getSearchResultsRV().setLayoutManager(new LinearLayoutManager(this));
        SearchResultAdapter searchResultAdapter = null;
        this.f65188f = new SearchResultAdapter((List) null, this, 1, (C13695i) null);
        RecyclerView searchResultsRV = getSearchResultsRV();
        SearchResultAdapter searchResultAdapter2 = this.f65188f;
        if (searchResultAdapter2 == null) {
            C13706o.m87945v("searchListAdapter");
        } else {
            searchResultAdapter = searchResultAdapter2;
        }
        searchResultsRV.setAdapter(searchResultAdapter);
    }

    private final void setSecondaryStateInformation(LoadingManager loadingManager) {
        getSearchResultsRV().setVisibility(8);
        getSearchProgressBar().setVisibility(8);
        getSecondaryInformationLL().setVisibility(0);
        int i = C15794a.f65194a[loadingManager.ordinal()];
        if (i == 1) {
            getSecondaryInfoTitleTV().setText("No internet");
            getSecondaryInfoSubTitleTV().setText("Please connect to internet and try again");
        } else if (i == 2) {
            getSecondaryInfoTitleTV().setText("Oops!");
            getSecondaryInfoSubTitleTV().setText("We're having some trouble connecting to our servers");
        } else if (i != 3) {
            System.out.print("no state detected");
        } else {
            getSecondaryInfoTitleTV().setText(getString(2131954084));
            getSecondaryInfoSubTitleTV().setText(getString(2131954581));
        }
    }

    private final void setViewModel() {
        this.f65187d = (SearchPlacesViewModel) ViewModelProviders.m535of((FragmentActivity) this).get(SearchPlacesViewModel.class);
    }

    public final ImageView getBackImageBtn() {
        ImageView imageView = this.f65181H;
        if (imageView != null) {
            return imageView;
        }
        C13706o.m87945v("backImageBtn");
        return null;
    }

    public final ImageView getEraseCurrentEntryIV() {
        ImageView imageView = this.f65182I;
        if (imageView != null) {
            return imageView;
        }
        C13706o.m87945v("eraseCurrentEntryIV");
        return null;
    }

    public final Dialog getGettingPlaceDataDialog() {
        Dialog dialog = this.f65189g;
        if (dialog != null) {
            return dialog;
        }
        C13706o.m87945v("gettingPlaceDataDialog");
        return null;
    }

    public final EditText getPlaceNamET() {
        EditText editText = this.f65177D;
        if (editText != null) {
            return editText;
        }
        C13706o.m87945v("placeNamET");
        return null;
    }

    public final RecyclerView getRecentSearchesRV() {
        RecyclerView recyclerView = this.f65185L;
        if (recyclerView != null) {
            return recyclerView;
        }
        C13706o.m87945v("recentSearchesRV");
        return null;
    }

    public final ProgressBar getSearchProgressBar() {
        ProgressBar progressBar = this.f65175B;
        if (progressBar != null) {
            return progressBar;
        }
        C13706o.m87945v("searchProgressBar");
        return null;
    }

    public final RecyclerView getSearchResultsRV() {
        RecyclerView recyclerView = this.f65178E;
        if (recyclerView != null) {
            return recyclerView;
        }
        C13706o.m87945v("searchResultsRV");
        return null;
    }

    public final TextView getSearchTitleTV() {
        TextView textView = this.f65174A;
        if (textView != null) {
            return textView;
        }
        C13706o.m87945v("searchTitleTV");
        return null;
    }

    public final TextView getSecondaryInfoSubTitleTV() {
        TextView textView = this.f65179F;
        if (textView != null) {
            return textView;
        }
        C13706o.m87945v("secondaryInfoSubTitleTV");
        return null;
    }

    public final TextView getSecondaryInfoTitleTV() {
        TextView textView = this.f65180G;
        if (textView != null) {
            return textView;
        }
        C13706o.m87945v("secondaryInfoTitleTV");
        return null;
    }

    public final LinearLayout getSecondaryInformationLL() {
        LinearLayout linearLayout = this.f65176C;
        if (linearLayout != null) {
            return linearLayout;
        }
        C13706o.m87945v("secondaryInformationLL");
        return null;
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(2130771968, 2130771969);
    }

    public void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == 2131362029) {
            onBackPressed();
        } else if (valueOf != null && valueOf.intValue() == 2131362717) {
            getPlaceNamET().getText().clear();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558464);
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
            SearchPlacesViewModel viewModel = getViewModel();
            String valueOf = String.valueOf(predictionsItem.getPlaceId());
            String str = this.f65190o;
            C13706o.m87926c(str);
            viewModel.requestPlaceDetails(valueOf, str);
        }
    }

    public void onRecantsItemSelected(GroupStrategy.ListItem listItem) {
        C13706o.m87929f(listItem, "savedItem");
        if (listItem instanceof GroupStrategy.GeneralItem) {
            SearchPlacesViewModel viewModel = getViewModel();
            String placeId = ((GroupStrategy.GeneralItem) listItem).getSearchSelectedItem().getPlaceId();
            String str = this.f65190o;
            C13706o.m87926c(str);
            viewModel.requestPlaceDetails(placeId, str);
        }
    }

    public final void setBackImageBtn(ImageView imageView) {
        C13706o.m87929f(imageView, "<set-?>");
        this.f65181H = imageView;
    }

    public final void setEraseCurrentEntryIV(ImageView imageView) {
        C13706o.m87929f(imageView, "<set-?>");
        this.f65182I = imageView;
    }

    public final void setGettingPlaceDataDialog(Dialog dialog) {
        C13706o.m87929f(dialog, "<set-?>");
        this.f65189g = dialog;
    }

    public final void setPlaceNamET(EditText editText) {
        C13706o.m87929f(editText, "<set-?>");
        this.f65177D = editText;
    }

    public final void setRecentSearchesRV(RecyclerView recyclerView) {
        C13706o.m87929f(recyclerView, "<set-?>");
        this.f65185L = recyclerView;
    }

    public final void setSearchProgressBar(ProgressBar progressBar) {
        C13706o.m87929f(progressBar, "<set-?>");
        this.f65175B = progressBar;
    }

    public final void setSearchResultsRV(RecyclerView recyclerView) {
        C13706o.m87929f(recyclerView, "<set-?>");
        this.f65178E = recyclerView;
    }

    public final void setSearchTitleTV(TextView textView) {
        C13706o.m87929f(textView, "<set-?>");
        this.f65174A = textView;
    }

    public final void setSecondaryInfoSubTitleTV(TextView textView) {
        C13706o.m87929f(textView, "<set-?>");
        this.f65179F = textView;
    }

    public final void setSecondaryInfoTitleTV(TextView textView) {
        C13706o.m87929f(textView, "<set-?>");
        this.f65180G = textView;
    }

    public final void setSecondaryInformationLL(LinearLayout linearLayout) {
        C13706o.m87929f(linearLayout, "<set-?>");
        this.f65176C = linearLayout;
    }
}
