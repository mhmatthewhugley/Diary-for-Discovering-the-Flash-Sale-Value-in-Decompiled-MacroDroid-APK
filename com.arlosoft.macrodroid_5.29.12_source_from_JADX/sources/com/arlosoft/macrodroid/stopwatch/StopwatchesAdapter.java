package com.arlosoft.macrodroid.stopwatch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.StopWatchAction;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.constraint.LogicConstraint;
import com.arlosoft.macrodroid.constraint.StopWatchConstraint;
import com.arlosoft.macrodroid.editscreen.EditMacroActivity;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.StopwatchTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.apmem.tools.layouts.FlowLayout;
import p057a2.C2224m;
import p183w2.C10330a;
import p183w2.C17499j;
import p183w2.C17500k;
import p183w2.C17501l;
import p183w2.C17502m;
import p183w2.C17503n;

public class StopwatchesAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    private HashMap<String, List<Macro>> f13035a;

    /* renamed from: b */
    private final Context f13036b;

    /* renamed from: c */
    private List<String> f13037c;

    /* renamed from: d */
    private final C5219b f13038d;

    /* renamed from: e */
    private Timer f13039e = new Timer();

    /* renamed from: f */
    private final int f13040f;

    /* renamed from: g */
    private final int f13041g;

    /* renamed from: h */
    private final int f13042h;

    /* renamed from: i */
    private final int f13043i;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131362245)
        ImageView clearButton;
        @BindView(2131363886)
        FlowLayout macroList;
        @BindView(2131363513)
        ImageView playPauseButton;
        @BindView(2131363884)
        ViewGroup stopwatchContainer;
        @BindView(2131363885)
        ImageView stopwatchIcon;
        @BindView(2131363887)
        TextView stopwatchNameText;
        @BindView(2131363888)
        TextView stopwatchTime;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ViewHolder f13044a;

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f13044a = viewHolder;
            viewHolder.stopwatchContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.stopwatch_container, "field 'stopwatchContainer'", ViewGroup.class);
            viewHolder.stopwatchNameText = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.stopwatch_name, "field 'stopwatchNameText'", TextView.class);
            viewHolder.playPauseButton = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.play_pause_button, "field 'playPauseButton'", ImageView.class);
            viewHolder.stopwatchTime = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.stopwatch_time, "field 'stopwatchTime'", TextView.class);
            viewHolder.clearButton = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.clear_button, "field 'clearButton'", ImageView.class);
            viewHolder.stopwatchIcon = (ImageView) Utils.findRequiredViewAsType(view, C17532R$id.stopwatch_icon, "field 'stopwatchIcon'", ImageView.class);
            viewHolder.macroList = (FlowLayout) Utils.findRequiredViewAsType(view, C17532R$id.stopwatch_macro_list, "field 'macroList'", FlowLayout.class);
        }

        @CallSuper
        public void unbind() {
            ViewHolder viewHolder = this.f13044a;
            if (viewHolder != null) {
                this.f13044a = null;
                viewHolder.stopwatchContainer = null;
                viewHolder.stopwatchNameText = null;
                viewHolder.playPauseButton = null;
                viewHolder.stopwatchTime = null;
                viewHolder.clearButton = null;
                viewHolder.stopwatchIcon = null;
                viewHolder.macroList = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.stopwatch.StopwatchesAdapter$a */
    class C5218a extends TimerTask {

        /* renamed from: a */
        final /* synthetic */ Handler f13045a;

        C5218a(Handler handler) {
            this.f13045a = handler;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m20390b() {
            StopwatchesAdapter.this.notifyDataSetChanged();
        }

        public void run() {
            this.f13045a.post(new C5220a(this));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.stopwatch.StopwatchesAdapter$b */
    public interface C5219b {
        /* renamed from: Z0 */
        void mo30157Z0(String str);
    }

    public StopwatchesAdapter(@NonNull List<String> list, @NonNull Context context, @NonNull C5219b bVar) {
        this.f13037c = list;
        this.f13036b = context;
        this.f13038d = bVar;
        this.f13039e.scheduleAtFixedRate(new C5218a(new Handler()), 0, 1000);
        this.f13040f = context.getResources().getColor(2131101114);
        this.f13041g = context.getResources().getColor(C17528R$color.action_block_link);
        this.f13042h = context.getResources().getDimensionPixelSize(C17529R$dimen.margin_small);
        this.f13043i = context.getResources().getDimensionPixelSize(C17529R$dimen.margin_micro);
        mo30168Q();
    }

    /* renamed from: G */
    private void m20377G(String str, Macro macro) {
        if (str != null && macro != null) {
            List list = this.f13035a.get(str);
            boolean z = true;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Macro) it.next()).equals(macro)) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                list = new ArrayList();
            }
            if (z) {
                list.add(macro);
                this.f13035a.put(str, list);
            }
        }
    }

    /* renamed from: H */
    private void m20378H(Constraint constraint, Macro macro) {
        if (constraint instanceof StopWatchConstraint) {
            m20377G(((StopWatchConstraint) constraint).mo24430G(), macro);
        }
        if (constraint instanceof C2224m) {
            for (String str : ((C2224m) constraint).mo24440F()) {
                for (String next : this.f13037c) {
                    if (!TextUtils.isEmpty(str)) {
                        if (!str.contains("[stopwatch=" + next + "]")) {
                            if (!str.contains("[stopwatchtime=" + next + "]")) {
                            }
                        }
                        m20377G(next, macro);
                    }
                }
            }
        }
        if (constraint instanceof LogicConstraint) {
            for (Constraint H : ((LogicConstraint) constraint).mo27826J0()) {
                m20378H(H, macro);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m20379I(boolean z, String str, View view) {
        if (z) {
            C10330a.m40555g(this.f13036b, str);
        } else {
            C10330a.m40558j(this.f13036b, str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m20380J(String str, View view) {
        C10330a.m40556h(this.f13036b, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m20381K(String str, View view) {
        this.f13038d.mo30157Z0(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ boolean m20382L(String str, View view) {
        this.f13038d.mo30157Z0(str);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m20383M(Macro macro, View view) {
        if (macro.isActionBlock) {
            Context context = this.f13036b;
            context.startActivity(ActionBlockEditActivity.m14574Y2((Activity) context, true, (ActionBlock) macro, false));
            return;
        }
        Intent intent = new Intent(this.f13036b, EditMacroActivity.class);
        intent.putExtra("MacroId", macro.getId());
        this.f13036b.startActivity(intent);
    }

    /* renamed from: N */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        String str = this.f13037c.get(i);
        viewHolder.stopwatchNameText.setText(str);
        viewHolder.stopwatchTime.setText(C10330a.m40551c(C10330a.m40552d(this.f13036b, str)));
        boolean f = C10330a.m40554f(this.f13036b, str);
        viewHolder.stopwatchIcon.setAlpha(f ? 1.0f : 0.5f);
        if (f) {
            viewHolder.playPauseButton.setImageResource(C17530R$drawable.ic_pause_white_24dp);
            viewHolder.playPauseButton.setContentDescription(this.f13036b.getString(C17541R$string.action_control_media_pause));
        } else {
            viewHolder.playPauseButton.setImageResource(C17530R$drawable.ic_play_white_24dp);
            viewHolder.playPauseButton.setContentDescription(this.f13036b.getString(C17541R$string.start));
        }
        viewHolder.playPauseButton.setOnClickListener(new C17502m(this, f, str));
        viewHolder.clearButton.setOnClickListener(new C17500k(this, str));
        viewHolder.stopwatchContainer.setOnClickListener(new C17501l(this, str));
        viewHolder.stopwatchContainer.setOnLongClickListener(new C17503n(this, str));
        viewHolder.macroList.removeAllViews();
        List<Macro> list = this.f13035a.get(str);
        if (list != null) {
            for (Macro macro : list) {
                TextView textView = new TextView(this.f13036b);
                textView.setText(macro.getName());
                textView.setTextColor(macro.isActionBlock ? this.f13041g : this.f13040f);
                textView.setTextSize(12.0f);
                textView.setPaintFlags(textView.getPaintFlags() | 8);
                int i2 = this.f13042h;
                int i3 = this.f13043i;
                textView.setPadding(i2, i3, i2, i3);
                viewHolder.macroList.addView(textView, -2, -2);
                textView.setOnClickListener(new C17499j(this, macro));
            }
            return;
        }
        TextView textView2 = new TextView(this.f13036b);
        textView2.setText("(" + this.f13036b.getString(C17541R$string.not_used) + ")");
        textView2.setTextSize(12.0f);
        textView2.setTextColor(this.f13040f);
        int i4 = this.f13042h;
        int i5 = this.f13043i;
        textView2.setPadding(i4, i5, i4, i5);
        viewHolder.macroList.addView(textView2);
    }

    /* renamed from: O */
    public void mo30166O() {
        this.f13039e.cancel();
        this.f13039e = null;
    }

    /* renamed from: P */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.list_item_stopwatch, viewGroup, false));
    }

    /* renamed from: Q */
    public void mo30168Q() {
        this.f13035a = new HashMap<>();
        for (Macro next : C4934n.m18998M().mo29674D()) {
            Iterator<Trigger> it = next.getTriggerList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if (next2 instanceof StopwatchTrigger) {
                    m20377G(((StopwatchTrigger) next2).mo24430G(), next);
                }
                if (next2 instanceof C2224m) {
                    for (String str : ((C2224m) next2).mo24440F()) {
                        for (String next3 : this.f13037c) {
                            if (!TextUtils.isEmpty(str)) {
                                if (!str.contains("[stopwatch=" + next3 + "]")) {
                                    if (!str.contains("[stopwatchtime=" + next3 + "]")) {
                                    }
                                }
                                m20377G(next3, next);
                            }
                        }
                    }
                }
            }
            Iterator<Action> it2 = next.getActions().iterator();
            while (it2.hasNext()) {
                Action next4 = it2.next();
                if (next4 instanceof StopWatchAction) {
                    m20377G(((StopWatchAction) next4).mo24430G(), next);
                }
                if (next4 instanceof C2224m) {
                    for (String str2 : ((C2224m) next4).mo24440F()) {
                        for (String next5 : this.f13037c) {
                            if (!TextUtils.isEmpty(str2)) {
                                if (!str2.contains("[stopwatch=" + next5 + "]")) {
                                    if (!str2.contains("[stopwatchtime=" + next5 + "]")) {
                                    }
                                }
                                m20377G(next5, next);
                            }
                        }
                    }
                }
                for (Constraint H : next4.mo27826J0()) {
                    m20378H(H, next);
                }
            }
            for (Constraint H2 : next.getConstraints()) {
                m20378H(H2, next);
            }
        }
    }

    /* renamed from: R */
    public void mo30169R(List<String> list) {
        this.f13037c = list;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f13037c.size();
    }
}
