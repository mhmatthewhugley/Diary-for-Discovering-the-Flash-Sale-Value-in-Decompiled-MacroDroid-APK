package com.arlosoft.macrodroid.logging.systemlog;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.database.room.SystemLogEntry;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.macrofilter.MacroLogFilterActivity;
import com.arlosoft.macrodroid.logging.systemlog.variablefilter.VariableLogFilterActivity;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6362a0;
import com.arlosoft.macrodroid.widget.BetterCheckBox;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15516s2;
import kotlinx.coroutines.C15561w1;
import org.jetbrains.anko.sdk27.coroutines.C16061a;
import p139o1.C8013m;
import p297ja.C13328m;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16265l;
import p370qa.C16269p;
import p370qa.C16270q;
import p370qa.C16271r;

/* compiled from: SystemLogActivity.kt */
public final class SystemLogActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: H */
    public static final C4855a f12221H = new C4855a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: I */
    public static final String f12222I = "macro_id";

    /* renamed from: A */
    private final C4876a f12223A = new C4876a(this);

    /* renamed from: B */
    private SearchView f12224B;

    /* renamed from: C */
    private String f12225C = "";

    /* renamed from: D */
    private boolean f12226D;

    /* renamed from: E */
    public C4897p f12227E;

    /* renamed from: F */
    private C15478k0 f12228F = C15482l0.m94502a(C15516s2.m94604b((C15561w1) null, 1, (Object) null).plus(C15186a1.m93731c()));

    /* renamed from: G */
    public Map<Integer, View> f12229G = new LinkedHashMap();

    /* renamed from: s */
    public SystemLogViewModel f12230s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C8013m f12231z;

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity$a */
    /* compiled from: SystemLogActivity.kt */
    public static final class C4855a {
        private C4855a() {
        }

        public /* synthetic */ C4855a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo29423a(Activity activity, long j) {
            C13706o.m87929f(activity, "activity");
            Intent intent = new Intent(activity, SystemLogActivity.class);
            intent.putExtra(SystemLogActivity.f12222I, j);
            activity.startActivity(intent);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity$b */
    /* compiled from: SystemLogActivity.kt */
    public static final class C4856b implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ int[] f12232a;

        /* renamed from: c */
        final /* synthetic */ SystemLogActivity f12233c;

        C4856b(int[] iArr, SystemLogActivity systemLogActivity) {
            this.f12232a = iArr;
            this.f12233c = systemLogActivity;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C13706o.m87929f(adapterView, "parent");
            this.f12233c.mo29421w2().mo29440H(this.f12232a[i]);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            C13706o.m87929f(adapterView, "parent");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity$c */
    /* compiled from: SystemLogActivity.kt */
    static final class C4857c extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ SystemLogActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4857c(SystemLogActivity systemLogActivity, C13635d<? super C4857c> dVar) {
            super(4, dVar);
            this.this$0 = systemLogActivity;
        }

        /* renamed from: h */
        public final Object mo29426h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C4857c cVar = new C4857c(this.this$0, dVar);
            cVar.Z$0 = z;
            return cVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo29426h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo29421w2().mo29441I(this.Z$0);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity$d */
    /* compiled from: SystemLogActivity.kt */
    static final class C4858d extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ SystemLogActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4858d(SystemLogActivity systemLogActivity, C13635d<? super C4858d> dVar) {
            super(4, dVar);
            this.this$0 = systemLogActivity;
        }

        /* renamed from: h */
        public final Object mo29427h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C4858d dVar2 = new C4858d(this.this$0, dVar);
            dVar2.Z$0 = z;
            return dVar2.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo29427h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo29421w2().mo29438F(this.Z$0);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity$e */
    /* compiled from: SystemLogActivity.kt */
    static final class C4859e extends C13665l implements C16271r<C15478k0, CompoundButton, Boolean, C13635d<? super C13339u>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ SystemLogActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4859e(SystemLogActivity systemLogActivity, C13635d<? super C4859e> dVar) {
            super(4, dVar);
            this.this$0 = systemLogActivity;
        }

        /* renamed from: h */
        public final Object mo29428h(C15478k0 k0Var, CompoundButton compoundButton, boolean z, C13635d<? super C13339u> dVar) {
            C4859e eVar = new C4859e(this.this$0, dVar);
            eVar.Z$0 = z;
            return eVar.invokeSuspend(C13339u.f61331a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return mo29428h((C15478k0) obj, (CompoundButton) obj2, ((Boolean) obj3).booleanValue(), (C13635d) obj4);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo29421w2().mo29439G(this.Z$0);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity$f */
    /* compiled from: SystemLogActivity.kt */
    static final class C4860f extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ SystemLogActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4860f(SystemLogActivity systemLogActivity, C13635d<? super C4860f> dVar) {
            super(3, dVar);
            this.this$0 = systemLogActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4860f(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.startActivity(new Intent(this.this$0, MacroLogFilterActivity.class));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity$g */
    /* compiled from: SystemLogActivity.kt */
    static final class C4861g extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ SystemLogActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4861g(SystemLogActivity systemLogActivity, C13635d<? super C4861g> dVar) {
            super(3, dVar);
            this.this$0 = systemLogActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C4861g(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.startActivity(new Intent(this.this$0, VariableLogFilterActivity.class));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity$h */
    /* compiled from: SystemLogActivity.kt */
    static final class C4862h extends C13708q implements C16265l<CombinedLoadStates, C13339u> {
        final /* synthetic */ SystemLogActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4862h(SystemLogActivity systemLogActivity) {
            super(1);
            this.this$0 = systemLogActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CombinedLoadStates) obj);
            return C13339u.f61331a;
        }

        public final void invoke(CombinedLoadStates combinedLoadStates) {
            C13706o.m87929f(combinedLoadStates, "loadState");
            if ((combinedLoadStates.getSource().getRefresh() instanceof LoadState.NotLoading) && combinedLoadStates.getAppend().getEndOfPaginationReached() && this.this$0.mo29420v2().getItemCount() < 1) {
                C8013m d2 = this.this$0.f12231z;
                if (d2 == null) {
                    C13706o.m87945v("binding");
                    d2 = null;
                }
                d2.f19352q.setDisplayedChild(2);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity$i */
    /* compiled from: SystemLogActivity.kt */
    public static final class C4863i extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        final /* synthetic */ SystemLogActivity f12234a;

        C4863i(SystemLogActivity systemLogActivity) {
            this.f12234a = systemLogActivity;
        }

        public void onItemRangeInserted(int i, int i2) {
            C8013m d2 = this.f12234a.f12231z;
            C8013m mVar = null;
            if (d2 == null) {
                C13706o.m87945v("binding");
                d2 = null;
            }
            d2.f19352q.setDisplayedChild(1);
            if (i == 0) {
                C8013m d22 = this.f12234a.f12231z;
                if (d22 == null) {
                    C13706o.m87945v("binding");
                    d22 = null;
                }
                RecyclerView.LayoutManager layoutManager = d22.f19344i.getLayoutManager();
                C13706o.m87927d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                if (((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() == 0) {
                    C8013m d23 = this.f12234a.f12231z;
                    if (d23 == null) {
                        C13706o.m87945v("binding");
                    } else {
                        mVar = d23;
                    }
                    mVar.f19344i.scrollToPosition(0);
                }
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity$j */
    /* compiled from: SystemLogActivity.kt */
    static final class C4864j extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ PagingData<SystemLogEntry> $it;
        int label;
        final /* synthetic */ SystemLogActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4864j(SystemLogActivity systemLogActivity, PagingData<SystemLogEntry> pagingData, C13635d<? super C4864j> dVar) {
            super(2, dVar);
            this.this$0 = systemLogActivity;
            this.$it = pagingData;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C4864j(this.this$0, this.$it, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4864j) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C4897p v2 = this.this$0.mo29420v2();
                PagingData<SystemLogEntry> pagingData = this.$it;
                C13706o.m87928e(pagingData, "it");
                this.label = 1;
                if (v2.submitData(pagingData, (C13635d<? super C13339u>) this) == c) {
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

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity$k */
    /* compiled from: SystemLogActivity.kt */
    static final class C4865k extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ SystemLogActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4865k(SystemLogActivity systemLogActivity, C13635d<? super C4865k> dVar) {
            super(2, dVar);
            this.this$0 = systemLogActivity;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C4865k(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4865k) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.mo29420v2().refresh();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity$l */
    /* compiled from: SystemLogActivity.kt */
    public static final class C4866l implements SearchView.OnQueryTextListener {

        /* renamed from: a */
        final /* synthetic */ SystemLogActivity f12235a;

        C4866l(SystemLogActivity systemLogActivity) {
            this.f12235a = systemLogActivity;
        }

        public boolean onQueryTextChange(String str) {
            C13706o.m87929f(str, "newText");
            this.f12235a.mo29421w2().mo29443M(str);
            return true;
        }

        public boolean onQueryTextSubmit(String str) {
            C13706o.m87929f(str, "query");
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public static final boolean m18774A2(SystemLogActivity systemLogActivity, Menu menu) {
        C13706o.m87929f(systemLogActivity, "this$0");
        C13706o.m87929f(menu, "$menu");
        systemLogActivity.m18811y2(menu, true);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public static final void m18775B2(SystemLogActivity systemLogActivity, Menu menu, View view, boolean z) {
        C13706o.m87929f(systemLogActivity, "this$0");
        C13706o.m87929f(menu, "$menu");
        if (z) {
            systemLogActivity.m18811y2(menu, false);
        }
    }

    /* renamed from: D2 */
    private final void m18776D2(String str) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "MacroDroid Log");
            intent.putExtra("android.intent.extra.TEXT", "Here is the MacroDroid log file.");
            C6362a0.m24598d(this, intent, new File(str));
            startActivity(Intent.createChooser(intent, getString(C17541R$string.share_log)));
        } catch (ActivityNotFoundException unused) {
            C15626c.m94876a(getApplicationContext(), getString(C17541R$string.no_app_found_to_share), 0).show();
        } catch (Exception e) {
            C15626c.makeText(getApplicationContext(), C17541R$string.export_failed, 0).show();
            C4878b.m18868g("Failed to export file: " + e);
        }
    }

    /* renamed from: E2 */
    private final void m18777E2() {
        View findViewById = findViewById(C17532R$id.menu_filter);
        View findViewById2 = findViewById(C17532R$id.menu_share_log);
        if (this.f12226D) {
            findViewById = findViewById2;
        }
        PopupMenu popupMenu = new PopupMenu(this, findViewById);
        popupMenu.inflate(C17536R$menu.text_size_menu);
        popupMenu.setOnMenuItemClickListener(new C4886i(this));
        try {
            popupMenu.show();
            int K0 = C5163j2.m19999K0(this);
            boolean z = true;
            popupMenu.getMenu().findItem(C17532R$id.menu_small).setChecked(K0 == 10);
            popupMenu.getMenu().findItem(C17532R$id.menu_medium).setChecked(K0 == 12);
            popupMenu.getMenu().findItem(C17532R$id.menu_large).setChecked(K0 == 14);
            MenuItem findItem = popupMenu.getMenu().findItem(C17532R$id.menu_very_large);
            if (K0 != 16) {
                z = false;
            }
            findItem.setChecked(z);
        } catch (Exception e) {
            C4878b.m18868g("Failed to display popupmenu: " + e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final boolean m18778F2(SystemLogActivity systemLogActivity, MenuItem menuItem) {
        C13706o.m87929f(systemLogActivity, "this$0");
        int i = 12;
        switch (menuItem.getItemId()) {
            case C17532R$id.menu_large:
                i = 14;
                break;
            case C17532R$id.menu_small:
                i = 10;
                break;
            case C17532R$id.menu_very_large:
                i = 16;
                break;
        }
        systemLogActivity.mo29420v2().mo29492E(i);
        C5163j2.m20315z4(systemLogActivity, i);
        return true;
    }

    /* renamed from: G2 */
    private final void m18779G2() {
        C8013m mVar = this.f12231z;
        C8013m mVar2 = null;
        if (mVar == null) {
            C13706o.m87945v("binding");
            mVar = null;
        }
        LinearLayout linearLayout = mVar.f19339d;
        C13706o.m87928e(linearLayout, "binding.filterPanel");
        C8013m mVar3 = this.f12231z;
        if (mVar3 == null) {
            C13706o.m87945v("binding");
        } else {
            mVar2 = mVar3;
        }
        LinearLayout linearLayout2 = mVar2.f19339d;
        C13706o.m87928e(linearLayout2, "binding.filterPanel");
        int i = 0;
        if (!(!(linearLayout2.getVisibility() == 0))) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    /* renamed from: f2 */
    private final void m18794f2(LogFilter logFilter) {
        C8013m mVar = this.f12231z;
        C8013m mVar2 = null;
        if (mVar == null) {
            C13706o.m87945v("binding");
            mVar = null;
        }
        mVar.f19348m.mo32876b(logFilter.getShowTriggers(), false);
        C8013m mVar3 = this.f12231z;
        if (mVar3 == null) {
            C13706o.m87945v("binding");
            mVar3 = null;
        }
        mVar3.f19346k.mo32876b(logFilter.getShowActions(), false);
        C8013m mVar4 = this.f12231z;
        if (mVar4 == null) {
            C13706o.m87945v("binding");
            mVar4 = null;
        }
        mVar4.f19347l.mo32876b(logFilter.getShowConstraints(), false);
        int ordinal = logFilter.getLogLevelEnum().ordinal() - 1;
        C8013m mVar5 = this.f12231z;
        if (mVar5 == null) {
            C13706o.m87945v("binding");
        } else {
            mVar2 = mVar5;
        }
        mVar2.f19341f.setSelection(ordinal);
    }

    /* renamed from: g2 */
    private final void m18795g2() {
        C8013m mVar = null;
        if (C5163j2.m19937B6(this)) {
            C8013m mVar2 = this.f12231z;
            if (mVar2 == null) {
                C13706o.m87945v("binding");
            } else {
                mVar = mVar2;
            }
            mVar.f19340e.f19257f.setVisibility(8);
            return;
        }
        C8013m mVar3 = this.f12231z;
        if (mVar3 == null) {
            C13706o.m87945v("binding");
            mVar3 = null;
        }
        mVar3.f19340e.f19257f.setCardBackgroundColor(ContextCompat.getColor(this, C17528R$color.system_log_primary));
        C8013m mVar4 = this.f12231z;
        if (mVar4 == null) {
            C13706o.m87945v("binding");
            mVar4 = null;
        }
        mVar4.f19340e.f19256e.setText(C17541R$string.system_log);
        C8013m mVar5 = this.f12231z;
        if (mVar5 == null) {
            C13706o.m87945v("binding");
            mVar5 = null;
        }
        mVar5.f19340e.f19254c.setText(C17541R$string.system_log_info_card);
        C8013m mVar6 = this.f12231z;
        if (mVar6 == null) {
            C13706o.m87945v("binding");
        } else {
            mVar = mVar6;
        }
        mVar.f19340e.f19255d.setOnClickListener(new C4884g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m18796h2(SystemLogActivity systemLogActivity, View view) {
        C13706o.m87929f(systemLogActivity, "this$0");
        C5163j2.m20057S2(systemLogActivity.getApplicationContext());
        C8013m mVar = systemLogActivity.f12231z;
        if (mVar == null) {
            C13706o.m87945v("binding");
            mVar = null;
        }
        mVar.f19340e.f19257f.setVisibility(8);
    }

    /* renamed from: i2 */
    private final void m18797i2(C13328m<Integer, Integer> mVar) {
        String str;
        C8013m mVar2 = null;
        if (mVar.mo70155d().intValue() == 0) {
            C8013m mVar3 = this.f12231z;
            if (mVar3 == null) {
                C13706o.m87945v("binding");
            } else {
                mVar2 = mVar3;
            }
            mVar2.f19342g.setText(getString(C17541R$string.no_macros_configured));
        } else if (mVar.mo70154c().intValue() != mVar.mo70155d().intValue()) {
            C8013m mVar4 = this.f12231z;
            if (mVar4 == null) {
                C13706o.m87945v("binding");
            } else {
                mVar2 = mVar4;
            }
            Button button = mVar2.f19342g;
            try {
                C13696i0 i0Var = C13696i0.f61931a;
                String string = getString(C17541R$string.system_log_filter_x_out_of_y_macros_enabled);
                C13706o.m87928e(string, "getString(R.string.syste…_out_of_y_macros_enabled)");
                str = String.format(string, Arrays.copyOf(new Object[]{mVar.mo70154c(), mVar.mo70155d()}, 2));
                C13706o.m87928e(str, "format(format, *args)");
            } catch (Exception unused) {
                str = mVar.mo70154c().intValue() + '/' + mVar.mo70155d().intValue() + " macros enabled";
            }
            button.setText(str);
        } else {
            C8013m mVar5 = this.f12231z;
            if (mVar5 == null) {
                C13706o.m87945v("binding");
            } else {
                mVar2 = mVar5;
            }
            mVar2.f19342g.setText(getString(C17541R$string.system_log_filter_all_macros_enabled));
        }
    }

    /* renamed from: j2 */
    private final void m18798j2() {
        int[] intArray = getResources().getIntArray(C17525R$array.log_levels_int);
        C13706o.m87928e(intArray, "if (BuildConfig.DEBUG) r…y(R.array.log_levels_int)");
        C8013m mVar = this.f12231z;
        if (mVar == null) {
            C13706o.m87945v("binding");
            mVar = null;
        }
        mVar.f19341f.setOnItemSelectedListener(new C4856b(intArray, this));
        C8013m mVar2 = this.f12231z;
        if (mVar2 == null) {
            C13706o.m87945v("binding");
            mVar2 = null;
        }
        BetterCheckBox betterCheckBox = mVar2.f19348m;
        C13706o.m87928e(betterCheckBox, "binding.showTriggers");
        C16061a.m96671b(betterCheckBox, (C13640g) null, new C4857c(this, (C13635d<? super C4857c>) null), 1, (Object) null);
        C8013m mVar3 = this.f12231z;
        if (mVar3 == null) {
            C13706o.m87945v("binding");
            mVar3 = null;
        }
        BetterCheckBox betterCheckBox2 = mVar3.f19346k;
        C13706o.m87928e(betterCheckBox2, "binding.showActions");
        C16061a.m96671b(betterCheckBox2, (C13640g) null, new C4858d(this, (C13635d<? super C4858d>) null), 1, (Object) null);
        C8013m mVar4 = this.f12231z;
        if (mVar4 == null) {
            C13706o.m87945v("binding");
            mVar4 = null;
        }
        BetterCheckBox betterCheckBox3 = mVar4.f19347l;
        C13706o.m87928e(betterCheckBox3, "binding.showConstraints");
        C16061a.m96671b(betterCheckBox3, (C13640g) null, new C4859e(this, (C13635d<? super C4859e>) null), 1, (Object) null);
        C8013m mVar5 = this.f12231z;
        if (mVar5 == null) {
            C13706o.m87945v("binding");
            mVar5 = null;
        }
        Button button = mVar5.f19342g;
        C13706o.m87928e(button, "binding.macroFilterButton");
        C4666m.m18147o(button, (C13640g) null, new C4860f(this, (C13635d<? super C4860f>) null), 1, (Object) null);
        C8013m mVar6 = this.f12231z;
        if (mVar6 == null) {
            C13706o.m87945v("binding");
            mVar6 = null;
        }
        Button button2 = mVar6.f19351p;
        C13706o.m87928e(button2, "binding.variablesFilterButton");
        C4666m.m18147o(button2, (C13640g) null, new C4861g(this, (C13635d<? super C4861g>) null), 1, (Object) null);
    }

    /* renamed from: k2 */
    private final void m18799k2(C13328m<Integer, Integer> mVar) {
        String str;
        C8013m mVar2 = null;
        if (mVar.mo70155d().intValue() == 0) {
            C8013m mVar3 = this.f12231z;
            if (mVar3 == null) {
                C13706o.m87945v("binding");
            } else {
                mVar2 = mVar3;
            }
            mVar2.f19351p.setText(getString(C17541R$string.no_variables_configured));
        } else if (mVar.mo70154c().intValue() != mVar.mo70155d().intValue()) {
            C8013m mVar4 = this.f12231z;
            if (mVar4 == null) {
                C13706o.m87945v("binding");
            } else {
                mVar2 = mVar4;
            }
            Button button = mVar2.f19351p;
            try {
                C13696i0 i0Var = C13696i0.f61931a;
                String string = getString(C17541R$string.system_log_filter_x_out_of_y_variables_enabled);
                C13706o.m87928e(string, "getString(R.string.syste…t_of_y_variables_enabled)");
                str = String.format(string, Arrays.copyOf(new Object[]{mVar.mo70154c(), mVar.mo70155d()}, 2));
                C13706o.m87928e(str, "format(format, *args)");
            } catch (Exception unused) {
                str = mVar.mo70154c().intValue() + '/' + mVar.mo70155d().intValue() + " variables enabled";
            }
            button.setText(str);
        } else {
            C8013m mVar5 = this.f12231z;
            if (mVar5 == null) {
                C13706o.m87945v("binding");
            } else {
                mVar2 = mVar5;
            }
            mVar2.f19351p.setText(getString(C17541R$string.system_log_filter_all_variables_enabled));
        }
    }

    /* renamed from: l2 */
    private final void m18800l2() {
        mo29420v2().addLoadStateListener(new C4862h(this));
        C8013m mVar = this.f12231z;
        C8013m mVar2 = null;
        if (mVar == null) {
            C13706o.m87945v("binding");
            mVar = null;
        }
        mVar.f19344i.setAdapter(mo29420v2());
        C8013m mVar3 = this.f12231z;
        if (mVar3 == null) {
            C13706o.m87945v("binding");
        } else {
            mVar2 = mVar3;
        }
        CardView cardView = mVar2.f19340e.f19257f;
        mo29420v2().registerAdapterDataObserver(new C4863i(this));
        mo29421w2().mo29450v().observe(this, new C4888k(this));
        mo29421w2().mo29451w().observe(this, new C4882e(this));
        mo29421w2().mo29452y().observe(this, new C4890m(this));
        mo29421w2().mo29447s().observe(this, new C4889l(this));
        mo29421w2().mo29449u().observe(this, new C4881d(this));
        mo29421w2().mo29435B().observe(this, new C4895n(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m18801m2(SystemLogActivity systemLogActivity, C13328m mVar) {
        C13706o.m87929f(systemLogActivity, "this$0");
        C13706o.m87928e(mVar, "it");
        systemLogActivity.m18797i2(mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m18802n2(SystemLogActivity systemLogActivity, C13328m mVar) {
        C13706o.m87929f(systemLogActivity, "this$0");
        C13706o.m87928e(mVar, "it");
        systemLogActivity.m18799k2(mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m18803o2(SystemLogActivity systemLogActivity, PagingData pagingData) {
        C13706o.m87929f(systemLogActivity, "this$0");
        C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(systemLogActivity), C15186a1.m93731c(), (C15486m0) null, new C4864j(systemLogActivity, pagingData, (C13635d<? super C4864j>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m18804p2(SystemLogActivity systemLogActivity, C13339u uVar) {
        C13706o.m87929f(systemLogActivity, "this$0");
        C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(systemLogActivity), C15186a1.m93731c(), (C15486m0) null, new C4865k(systemLogActivity, (C13635d<? super C4865k>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m18805q2(SystemLogActivity systemLogActivity, String str) {
        C13706o.m87929f(systemLogActivity, "this$0");
        C13706o.m87926c(str);
        systemLogActivity.m18776D2(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m18806r2(SystemLogActivity systemLogActivity, LogFilter logFilter) {
        C13706o.m87929f(systemLogActivity, "this$0");
        C13706o.m87928e(logFilter, "it");
        systemLogActivity.m18794f2(logFilter);
    }

    /* renamed from: s2 */
    private final void m18807s2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.clear_log);
        builder.setMessage((int) C17541R$string.are_you_sure_clear_log);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4880c(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C4883f.f12266a);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m18808t2(SystemLogActivity systemLogActivity, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(systemLogActivity, "this$0");
        C13706o.m87929f(dialogInterface, "dialog");
        systemLogActivity.mo29421w2().mo29444n();
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m18809u2(DialogInterface dialogInterface, int i) {
        C13706o.m87929f(dialogInterface, "dialog");
    }

    /* renamed from: x2 */
    private final void m18810x2() {
        boolean z = !C5163j2.m20288w1(this);
        mo29420v2().mo29491D(z);
        C5163j2.m20196k5(this, z);
        C8013m mVar = this.f12231z;
        if (mVar == null) {
            C13706o.m87945v("binding");
            mVar = null;
        }
        RecyclerView.LayoutManager layoutManager = mVar.f19344i.getLayoutManager();
        C13706o.m87927d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).setReverseLayout(z);
    }

    /* renamed from: y2 */
    private final void m18811y2(Menu menu, boolean z) {
        menu.findItem(C17532R$id.menu_filter).setVisible(z);
    }

    /* renamed from: z2 */
    private final boolean m18812z2() {
        return (getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: C2 */
    public final void mo29419C2(C4897p pVar) {
        C13706o.m87929f(pVar, "<set-?>");
        this.f12227E = pVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8013m c = C8013m.m33368c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f12231z = c;
        C8013m mVar = null;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        C8013m mVar2 = this.f12231z;
        if (mVar2 == null) {
            C13706o.m87945v("binding");
            mVar2 = null;
        }
        setSupportActionBar(mVar2.f19350o);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setTitle((CharSequence) "");
        }
        C8013m mVar3 = this.f12231z;
        if (mVar3 == null) {
            C13706o.m87945v("binding");
            mVar3 = null;
        }
        mVar3.f19349n.setText(getString(C17541R$string.system_log));
        C8013m mVar4 = this.f12231z;
        if (mVar4 == null) {
            C13706o.m87945v("binding");
            mVar4 = null;
        }
        LayoutTransition layoutTransition = mVar4.f19345j.getLayoutTransition();
        C13706o.m87928e(layoutTransition, "binding.rootContent.getLayoutTransition()");
        layoutTransition.enableTransitionType(4);
        C8013m mVar5 = this.f12231z;
        if (mVar5 == null) {
            C13706o.m87945v("binding");
            mVar5 = null;
        }
        mVar5.f19344i.setItemAnimator((RecyclerView.ItemAnimator) null);
        C8013m mVar6 = this.f12231z;
        if (mVar6 == null) {
            C13706o.m87945v("binding");
            mVar6 = null;
        }
        RecyclerView.LayoutManager layoutManager = mVar6.f19344i.getLayoutManager();
        C13706o.m87927d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).setReverseLayout(C5163j2.m20288w1(this));
        mo29419C2(new C4897p(this.f12223A, m18812z2(), C5163j2.m20288w1(this)));
        mo29420v2().mo29492E(C5163j2.m19999K0(this));
        getLifecycle().addObserver(mo29421w2());
        long longExtra = getIntent().getLongExtra(f12222I, 0);
        if (longExtra != 0) {
            mo29421w2().mo29446p(longExtra);
            this.f12226D = true;
            C8013m mVar7 = this.f12231z;
            if (mVar7 == null) {
                C13706o.m87945v("binding");
            } else {
                mVar = mVar7;
            }
            mVar.f19343h.setText(C4934n.m18998M().mo29682Q(longExtra).getName());
        } else {
            C8013m mVar8 = this.f12231z;
            if (mVar8 == null) {
                C13706o.m87945v("binding");
            } else {
                mVar = mVar8;
            }
            TextView textView = mVar.f19343h;
            C13706o.m87928e(textView, "binding.macroName");
            textView.setVisibility(8);
        }
        m18798j2();
        m18800l2();
        m18795g2();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C13706o.m87929f(menu, "menu");
        getMenuInflater().inflate(C17536R$menu.system_log_menu, menu);
        boolean z = false;
        if (this.f12226D) {
            menu.findItem(C17532R$id.menu_filter).setVisible(false);
            menu.findItem(C17532R$id.menu_clear_log).setVisible(false);
        }
        View actionView = menu.findItem(C17532R$id.menu_search).getActionView();
        C13706o.m87927d(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        this.f12224B = searchView;
        if (searchView != null) {
            searchView.setQuery(mo29422z(), false);
            if (this.f12225C.length() > 0) {
                z = true;
            }
            if (z) {
                searchView.clearFocus();
            }
            searchView.setOnCloseListener(new C4887j(this, menu));
            searchView.setOnQueryTextFocusChangeListener(new C4885h(this, menu));
            searchView.setOnQueryTextListener(new C4866l(this));
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                break;
            case C17532R$id.invert_order:
                m18810x2();
                break;
            case C17532R$id.menu_clear_log:
                m18807s2();
                break;
            case C17532R$id.menu_filter:
                m18779G2();
                break;
            case C17532R$id.menu_share_log:
                mo29421w2().mo29436D();
                break;
            case C17532R$id.menu_share_log_html:
                mo29421w2().mo29437E();
                break;
            case C17532R$id.menu_text_size:
                m18777E2();
                break;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* renamed from: v2 */
    public final C4897p mo29420v2() {
        C4897p pVar = this.f12227E;
        if (pVar != null) {
            return pVar;
        }
        C13706o.m87945v("pagingAdapter");
        return null;
    }

    /* renamed from: w2 */
    public final SystemLogViewModel mo29421w2() {
        SystemLogViewModel systemLogViewModel = this.f12230s;
        if (systemLogViewModel != null) {
            return systemLogViewModel;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    /* renamed from: z */
    public final String mo29422z() {
        return this.f12225C;
    }
}
