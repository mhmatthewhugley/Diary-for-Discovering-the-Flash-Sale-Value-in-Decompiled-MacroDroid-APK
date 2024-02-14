package com.arlosoft.macrodroid.videos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.videos.data.VideosData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p139o1.C8023r;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* compiled from: VideosActivity.kt */
public final class VideosActivity extends MacroDroidDaggerBaseActivity {

    /* renamed from: B */
    public static final C6603a f15336B = new C6603a((C13695i) null);

    /* renamed from: A */
    public Map<Integer, View> f15337A = new LinkedHashMap();

    /* renamed from: s */
    public C6614g f15338s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C8023r f15339z;

    /* renamed from: com.arlosoft.macrodroid.videos.VideosActivity$a */
    /* compiled from: VideosActivity.kt */
    public static final class C6603a {
        private C6603a() {
        }

        public /* synthetic */ C6603a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo32824a(Activity activity) {
            C13706o.m87929f(activity, "activity");
            activity.startActivity(new Intent(activity, VideosActivity.class));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.videos.VideosActivity$b */
    /* compiled from: VideosActivity.kt */
    static final class C6604b extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ VideosActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6604b(VideosActivity videosActivity, C13635d<? super C6604b> dVar) {
            super(3, dVar);
            this.this$0 = videosActivity;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C6604b(this.this$0, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                C8023r S1 = this.this$0.f15339z;
                C8023r rVar = null;
                if (S1 == null) {
                    C13706o.m87945v("binding");
                    S1 = null;
                }
                FrameLayout frameLayout = S1.f19422d;
                C13706o.m87928e(frameLayout, "binding.loadingView");
                frameLayout.setVisibility(0);
                C8023r S12 = this.this$0.f15339z;
                if (S12 == null) {
                    C13706o.m87945v("binding");
                } else {
                    rVar = S12;
                }
                FrameLayout frameLayout2 = rVar.f19421c;
                C13706o.m87928e(frameLayout2, "binding.errorView");
                frameLayout2.setVisibility(8);
                this.this$0.mo32823V1().mo32855i();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: T1 */
    private final void m25064T1() {
        mo32823V1().mo32854h().observe(this, new C6609c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public static final void m25065U1(VideosActivity videosActivity, VideosData videosData) {
        C13706o.m87929f(videosActivity, "this$0");
        videosActivity.m25066W1(videosData);
    }

    /* renamed from: W1 */
    private final void m25066W1(VideosData videosData) {
        C8023r rVar = this.f15339z;
        C8023r rVar2 = null;
        if (rVar == null) {
            C13706o.m87945v("binding");
            rVar = null;
        }
        FrameLayout frameLayout = rVar.f19422d;
        C13706o.m87928e(frameLayout, "binding.loadingView");
        frameLayout.setVisibility(8);
        if (videosData != null) {
            C8023r rVar3 = this.f15339z;
            if (rVar3 == null) {
                C13706o.m87945v("binding");
                rVar3 = null;
            }
            rVar3.f19425g.setLayoutManager(new GridLayoutManager(this, 2));
            C8023r rVar4 = this.f15339z;
            if (rVar4 == null) {
                C13706o.m87945v("binding");
                rVar4 = null;
            }
            rVar4.f19425g.setAdapter(new C6612f(videosData.getVideoList(), mo32823V1()));
            C8023r rVar5 = this.f15339z;
            if (rVar5 == null) {
                C13706o.m87945v("binding");
            } else {
                rVar2 = rVar5;
            }
            RecyclerView recyclerView = rVar2.f19425g;
            C13706o.m87928e(recyclerView, "binding.videoEntries");
            recyclerView.setVisibility(0);
            return;
        }
        C8023r rVar6 = this.f15339z;
        if (rVar6 == null) {
            C13706o.m87945v("binding");
        } else {
            rVar2 = rVar6;
        }
        FrameLayout frameLayout2 = rVar2.f19421c;
        C13706o.m87928e(frameLayout2, "binding.errorView");
        frameLayout2.setVisibility(0);
    }

    /* renamed from: V1 */
    public final C6614g mo32823V1() {
        C6614g gVar = this.f15338s;
        if (gVar != null) {
            return gVar;
        }
        C13706o.m87945v("viewModel");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8023r c = C8023r.m33403c(getLayoutInflater());
        C13706o.m87928e(c, "inflate(layoutInflater)");
        this.f15339z = c;
        if (c == null) {
            C13706o.m87945v("binding");
            c = null;
        }
        setContentView((View) c.getRoot());
        C8023r rVar = this.f15339z;
        if (rVar == null) {
            C13706o.m87945v("binding");
            rVar = null;
        }
        setSupportActionBar(rVar.f19424f);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setTitle((int) C17541R$string.tile_videos_title);
        }
        C8023r rVar2 = this.f15339z;
        if (rVar2 == null) {
            C13706o.m87945v("binding");
            rVar2 = null;
        }
        AppCompatButton appCompatButton = rVar2.f19423e;
        C13706o.m87928e(appCompatButton, "binding.retryButton");
        C4666m.m18147o(appCompatButton, (C13640g) null, new C6604b(this, (C13635d<? super C6604b>) null), 1, (Object) null);
        m25064T1();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C13706o.m87929f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        finish();
        return true;
    }
}
