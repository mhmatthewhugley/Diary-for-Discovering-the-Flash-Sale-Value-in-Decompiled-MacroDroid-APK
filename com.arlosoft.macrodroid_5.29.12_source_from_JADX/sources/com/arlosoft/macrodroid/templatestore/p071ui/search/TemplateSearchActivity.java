package com.arlosoft.macrodroid.templatestore.p071ui.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.extensions.C4655b;
import com.arlosoft.macrodroid.templatestore.p071ui.C5274a;
import com.arlosoft.macrodroid.templatestore.p071ui.C5275b;
import com.arlosoft.macrodroid.templatestore.p071ui.templateList.C5472t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.search.TemplateSearchActivity */
/* compiled from: TemplateSearchActivity.kt */
public final class TemplateSearchActivity extends MacroDroidDaggerBaseActivity implements C5275b {

    /* renamed from: F */
    public static final C5343a f13190F = new C5343a((C13695i) null);

    /* renamed from: A */
    private C5472t f13191A;

    /* renamed from: B */
    private SearchView f13192B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final ArrayList<C5274a> f13193C = new ArrayList<>();

    /* renamed from: D */
    public MacroDroidRoomDatabase f13194D;

    /* renamed from: E */
    public Map<Integer, View> f13195E = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f13196s = "";
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f13197z;

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.search.TemplateSearchActivity$a */
    /* compiled from: TemplateSearchActivity.kt */
    public static final class C5343a {
        private C5343a() {
        }

        public /* synthetic */ C5343a(C13695i iVar) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ Intent m20731b(C5343a aVar, Context context, String str, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return aVar.mo30535a(context, str, i);
        }

        /* renamed from: a */
        public final Intent mo30535a(Context context, String str, int i) {
            C13706o.m87929f(context, "context");
            C13706o.m87929f(str, "searchText");
            Intent intent = new Intent(context, TemplateSearchActivity.class);
            intent.putExtra("search_text", str);
            intent.putExtra("clear_update_subscription_id", i);
            return intent;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.search.TemplateSearchActivity$b */
    /* compiled from: TemplateSearchActivity.kt */
    static final class C5344b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ int $idToClear;
        int label;
        final /* synthetic */ TemplateSearchActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5344b(TemplateSearchActivity templateSearchActivity, int i, C13635d<? super C5344b> dVar) {
            super(2, dVar);
            this.this$0 = templateSearchActivity;
            this.$idToClear = i;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5344b(this.this$0, this.$idToClear, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5344b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                this.label = 1;
                if (this.this$0.mo30534W1().mo28680f().mo28766a((long) this.$idToClear, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.search.TemplateSearchActivity$c */
    /* compiled from: TemplateSearchActivity.kt */
    public static final class C5345c implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ TemplateSearchActivity f13198a;

        /* renamed from: b */
        final /* synthetic */ SearchView f13199b;

        C5345c(TemplateSearchActivity templateSearchActivity, SearchView searchView) {
            this.f13198a = templateSearchActivity;
            this.f13199b = searchView;
        }

        public boolean onQueryTextChange(String str) {
            C13706o.m87929f(str, "newText");
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            C13706o.m87929f(str, "query");
            this.f13198a.f13197z = false;
            this.f13198a.f13196s = str;
            Iterator it = this.f13198a.f13193C.iterator();
            while (it.hasNext()) {
                ((C5274a) it.next()).mo30432L(str);
            }
            this.f13199b.clearFocus();
            return true;
        }
    }

    /* renamed from: V1 */
    private final void m20724V1(int i) {
        C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(this), C15186a1.m93730b(), (C15486m0) null, new C5344b(this, i, (C13635d<? super C5344b>) null), 2, (Object) null);
    }

    /* renamed from: X1 */
    private final void m20725X1(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            String dataString = intent.getDataString();
            if (!C13706o.m87924a("android.intent.action.VIEW", action) || dataString == null) {
                String stringExtra = intent.getStringExtra("search_text");
                if (stringExtra == null) {
                    stringExtra = "";
                } else {
                    C13706o.m87928e(stringExtra, "intent.getStringExtra(EX…NITIAL_SEARCH_TEXT) ?: \"\"");
                }
                this.f13196s = stringExtra;
                this.f13197z = false;
                Iterator<C5274a> it = this.f13193C.iterator();
                while (it.hasNext()) {
                    it.next().mo30432L(mo30419z());
                }
            } else if (C15177w.m93663N(dataString, "id=", false, 2, (Object) null)) {
                String substring = dataString.substring(C15177w.m93687f0(dataString, "id=", 0, false, 6, (Object) null));
                C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
                this.f13196s = substring;
                this.f13197z = true;
                Iterator<C5274a> it2 = this.f13193C.iterator();
                while (it2.hasNext()) {
                    it2.next().mo30432L(mo30419z());
                }
            }
            SearchView searchView = this.f13192B;
            if (searchView != null) {
                searchView.setQuery(mo30419z(), false);
            }
        }
    }

    /* renamed from: R1 */
    public View mo30533R1(int i) {
        Map<Integer, View> map = this.f13195E;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: W1 */
    public final MacroDroidRoomDatabase mo30534W1() {
        MacroDroidRoomDatabase macroDroidRoomDatabase = this.f13194D;
        if (macroDroidRoomDatabase != null) {
            return macroDroidRoomDatabase;
        }
        C13706o.m87945v("roomDatabase");
        return null;
    }

    /* renamed from: Y */
    public void mo30411Y(C5274a aVar) {
        C13706o.m87929f(aVar, "listener");
        this.f13193C.add(aVar);
    }

    /* renamed from: b0 */
    public void mo30412b0(C5274a aVar) {
        C13706o.m87929f(aVar, "listener");
        this.f13193C.remove(aVar);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.activity_template_search);
        setSupportActionBar((Toolbar) mo30533R1(C17532R$id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setDisplayShowTitleEnabled(false);
        }
        this.f13196s = "";
        m20725X1(getIntent());
        C5472t b = C5472t.C5473a.m21072b(C5472t.f13410K, 0, 0, false, false, false, 24, (Object) null);
        this.f13191A = b;
        if (b == null) {
            C13706o.m87945v("templateListFragment");
            b = null;
        }
        C4655b.m18110a(this, b, C17532R$id.templateListContainer);
        int intExtra = getIntent().getIntExtra("clear_update_subscription_id", 0);
        if (intExtra > 0) {
            m20724V1(intExtra);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        SearchView searchView;
        C13706o.m87929f(menu, "menu");
        getMenuInflater().inflate(C17536R$menu.templates_search_menu, menu);
        View actionView = MenuItemCompat.getActionView(menu.findItem(C17532R$id.menu_search));
        C13706o.m87927d(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView2 = (SearchView) actionView;
        this.f13192B = searchView2;
        boolean z = false;
        if (searchView2 != null) {
            searchView2.onActionViewExpanded();
            searchView2.setQuery(mo30419z(), false);
            if (this.f13196s.length() > 0) {
                searchView2.clearFocus();
            }
            searchView2.setOnQueryTextListener(new C5345c(this, searchView2));
        }
        String stringExtra = getIntent().getStringExtra("search_text");
        if (stringExtra == null || stringExtra.length() == 0) {
            z = true;
        }
        if (!z && (searchView = this.f13192B) != null) {
            searchView.setQuery(stringExtra, true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m20725X1(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* renamed from: z */
    public String mo30419z() {
        return this.f13196s;
    }
}
