package com.arlosoft.macrodroid.drawer;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.drawer.p069ui.C4481a;
import com.arlosoft.macrodroid.drawer.p069ui.C4490d;
import com.arlosoft.macrodroid.drawer.p069ui.DrawerOptionsActivity;
import com.arlosoft.macrodroid.events.CloseDrawerEvent;
import com.arlosoft.macrodroid.events.DrawerRefreshEvent;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6363a1;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import p143p1.C16090g;
import p143p1.C16091h;
import p143p1.C16092i;
import p143p1.C16093j;
import p143p1.C8057k;
import p143p1.C8058l;
import p149q1.C8152a;
import p149q1.C8153b;
import p149q1.C8159h;
import p149q1.C8163l;
import p161s1.C10180a;
import p192x5.C10387a;
import p192x5.C10390b;
import p270ga.C12318a;
import p319lc.C15626c;
import p440y9.C16971a;
import p448z9.C17071b;

public class MacroDroidDrawer extends RecyclerView implements C4481a {

    /* renamed from: A */
    MacroDroidRoomDatabase f11328A;

    /* renamed from: B */
    ItemTouchHelper.Callback f11329B = new C4456a();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8152a f11330a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8057k f11331c;

    /* renamed from: d */
    private ItemTouchHelper f11332d;

    /* renamed from: f */
    private Timer f11333f = new Timer();

    /* renamed from: g */
    private LinearLayoutManager f11334g;

    /* renamed from: o */
    private C10387a f11335o;

    /* renamed from: p */
    private C17071b f11336p;

    /* renamed from: s */
    private Handler f11337s = new Handler();

    /* renamed from: z */
    private Runnable f11338z = C16093j.f66058a;

    /* renamed from: com.arlosoft.macrodroid.drawer.MacroDroidDrawer$a */
    class C4456a extends ItemTouchHelper.Callback {
        C4456a() {
        }

        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return ItemTouchHelper.Callback.makeFlag(2, 51);
        }

        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            Collections.swap(MacroDroidDrawer.this.f11330a.drawerItems, viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            C5163j2.m19974G3(MacroDroidDrawer.this.getContext(), MacroDroidDrawer.this.f11330a);
            MacroDroidDrawer.this.f11331c.notifyItemMoved(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            return true;
        }

        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.drawer.MacroDroidDrawer$b */
    class C4457b extends TimerTask {

        /* renamed from: a */
        final /* synthetic */ Handler f11340a;

        C4457b(Handler handler) {
            this.f11340a = handler;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m17587b() {
            List<C8153b> B = MacroDroidDrawer.this.f11331c.mo38063B();
            C8058l lVar = new C8058l();
            for (int i = 0; i < B.size(); i++) {
                if (B.get(i) instanceof C8163l) {
                    MacroDroidDrawer.this.f11331c.notifyItemChanged(i, lVar);
                }
            }
        }

        public void run() {
            this.f11340a.post(new C4458a(this));
        }
    }

    public MacroDroidDrawer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MacroDroidApplication.f9885K.mo38308m(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.f11334g = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        this.f11330a = C5163j2.m20012M(getContext());
        C8057k kVar = new C8057k(getContext(), this.f11328A, this.f11330a.drawerItems, this);
        this.f11331c = kVar;
        kVar.setHasStableIds(true);
        setAdapter(this.f11331c);
        setItemAnimator((RecyclerView.ItemAnimator) null);
        this.f11332d = new ItemTouchHelper(this.f11329B);
        setPadding(0, 0, 0, getContext().getResources().getDimensionPixelOffset(C17529R$dimen.margin_medium));
        setClipToPadding(false);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(), this.f11334g.getOrientation());
        dividerItemDecoration.setDrawable(ContextCompat.getDrawable(getContext(), C17530R$drawable.drawer_divider));
        addItemDecoration(dividerItemDecoration);
        m17580o();
    }

    /* renamed from: i */
    private void m17574i() {
        this.f11330a.drawerItems.add(new C8159h());
        C5163j2.m19974G3(getContext(), this.f11330a);
        C10180a.m40075a().mo80018i(new DrawerRefreshEvent(1));
        C15626c.makeText(getContext().getApplicationContext(), C17541R$string.drawer_item_added, 0).show();
    }

    /* renamed from: j */
    private void m17575j(boolean z) {
        getContext().startActivity(DrawerOptionsActivity.m17693g3(getContext(), -1, z));
        C10180a.m40075a().mo80018i(new CloseDrawerEvent());
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m17577l(C10390b bVar) throws Exception {
        if (bVar == C10390b.SWIPED_RIGHT && !this.f11330a.leftSide) {
            C10180a.m40075a().mo80018i(new CloseDrawerEvent());
        } else if (bVar == C10390b.SWIPED_LEFT && this.f11330a.leftSide) {
            C10180a.m40075a().mo80018i(new CloseDrawerEvent());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m17578m(String[] strArr, C8153b bVar, DialogInterface dialogInterface, int i) {
        if (strArr[i].equals(getContext().getString(C17541R$string.edit))) {
            getContext().startActivity(DrawerOptionsActivity.m17687e3(getContext(), bVar.getGuid()));
            C10180a.m40075a().mo80018i(new CloseDrawerEvent());
        } else if (strArr[i].equals(getContext().getString(C17541R$string.delete))) {
            this.f11330a.drawerItems.remove(bVar);
            C5163j2.m19974G3(getContext(), this.f11330a);
            this.f11331c.mo38070J(this.f11330a.drawerItems);
            this.f11331c.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m17579n(DialogInterface dialogInterface, int i) {
        switch (i) {
            case 0:
                getContext().startActivity(DrawerOptionsActivity.m17690f3(getContext(), 1));
                break;
            case 1:
                getContext().startActivity(DrawerOptionsActivity.m17690f3(getContext(), 2));
                break;
            case 2:
                getContext().startActivity(DrawerOptionsActivity.m17690f3(getContext(), 3));
                break;
            case 3:
                getContext().startActivity(DrawerOptionsActivity.m17690f3(getContext(), 4));
                break;
            case 4:
                getContext().startActivity(DrawerOptionsActivity.m17690f3(getContext(), 5));
                break;
            case 5:
                m17575j(false);
                break;
            case 6:
                m17575j(true);
                break;
            case 7:
                getContext().startActivity(DrawerOptionsActivity.m17690f3(getContext(), 7));
                break;
            case 8:
                getContext().startActivity(DrawerOptionsActivity.m17690f3(getContext(), 8));
                break;
            case 9:
                m17574i();
                break;
        }
        C10180a.m40075a().mo80018i(new CloseDrawerEvent());
    }

    /* renamed from: o */
    private void m17580o() {
        if (C5163j2.m19998K(getContext())) {
            this.f11337s.removeCallbacksAndMessages((Object) null);
            this.f11337s.postDelayed(this.f11338z, (long) (C5163j2.m20005L(getContext()) * 1000));
        }
    }

    /* renamed from: a */
    public void mo28833a(C4490d dVar) {
        this.f11332d.startDrag(dVar);
    }

    /* renamed from: b */
    public void mo28834b(C4490d dVar) {
        C8153b y = dVar.mo28896y();
        if (y != null) {
            String[] strArr = (!y.isValid() || !y.isEditable()) ? new String[]{getContext().getString(C17541R$string.delete)} : new String[]{getContext().getString(C17541R$string.edit), getContext().getString(C17541R$string.delete)};
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), C17542R$style.Theme_App_Dialog);
            builder.setTitle((CharSequence) y.getName()).setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C16091h(this, strArr, y));
            AlertDialog create = builder.create();
            create.getWindow().setType(C6363a1.m24608b(getContext()));
            create.show();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f11335o.mo41065e(motionEvent);
        m17580o();
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Handler handler = new Handler();
        try {
            C10180a.m40075a().mo80019m(this);
        } catch (Throwable unused) {
        }
        this.f11333f.scheduleAtFixedRate(new C4457b(handler), 0, 1000);
        C10387a aVar = new C10387a(getContext().getResources().getDimensionPixelSize(C17529R$dimen.swiping_threshold), getContext().getResources().getDimensionPixelSize(C17529R$dimen.swiped_threshold));
        this.f11335o = aVar;
        this.f11336p = aVar.mo41068h().mo79688T(C12318a.m83029a()).mo79679I(C16971a.m100210a()).mo79685P(new C16092i(this));
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C10180a.m40075a().mo80020p(this);
        this.f11333f.cancel();
        this.f11337s.removeCallbacksAndMessages((Object) null);
        C17071b bVar = this.f11336p;
        if (bVar != null && !bVar.isDisposed()) {
            this.f11336p.dispose();
        }
    }

    public void onEventMainThread(DrawerRefreshEvent drawerRefreshEvent) {
        C8152a M = C5163j2.m20012M(getContext());
        this.f11330a = M;
        this.f11331c.mo38070J(M.drawerItems);
        if (drawerRefreshEvent.f11745a == 1) {
            C15626c.makeText(getContext().getApplicationContext(), C17541R$string.drawer_item_added, 0).show();
            smoothScrollToPosition(this.f11331c.getItemCount() - 1);
        }
    }

    /* renamed from: p */
    public void mo28837p() {
        Drawable wrap = DrawableCompat.wrap(getBackground());
        DrawableCompat.setTint(wrap, this.f11330a.backgroundColor);
        setBackground(wrap);
    }

    /* renamed from: q */
    public void mo28838q() {
        this.f11337s.removeCallbacksAndMessages((Object) null);
        String[] strArr = {getContext().getString(C17541R$string.app_shortcut), getContext().getString(C17541R$string.action_disable_macro_macro), getContext().getString(C17541R$string.action_action_block), getContext().getString(C17541R$string.action_share_location_option_variable), getContext().getString(C17541R$string.action_stop_watch), getContext().getString(C17541R$string.system_log), getContext().getString(C17541R$string.user_log), getContext().getString(C17541R$string.text), getContext().getString(C17541R$string.shortcut_link), getContext().getString(C17541R$string.separator)};
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), C17542R$style.Theme_App_Dialog);
        builder.setTitle((int) C17541R$string.add_drawer_item);
        builder.setItems((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C16090g(this));
        AlertDialog create = builder.create();
        create.getWindow().setType(C6363a1.m24608b(getContext()));
        create.show();
    }

    /* renamed from: r */
    public void mo28839r() {
        m17580o();
        C8057k kVar = this.f11331c;
        kVar.mo38069I(!kVar.mo38064C());
        if (this.f11331c.mo38064C()) {
            this.f11332d.attachToRecyclerView(this);
        } else {
            this.f11332d.attachToRecyclerView((RecyclerView) null);
        }
    }
}
