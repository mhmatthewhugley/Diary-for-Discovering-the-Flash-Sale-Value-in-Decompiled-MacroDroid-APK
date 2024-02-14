package com.arlosoft.macrodroid.variables;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.WaitUntilTriggerAction;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.constraint.LogicConstraint;
import com.arlosoft.macrodroid.editscreen.EditMacroActivity;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.utils.C6409o;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apmem.tools.layouts.FlowLayout;
import p057a2.C2215d;
import p057a2.C2216e;
import p057a2.C2217f;
import p057a2.C2219h;
import p057a2.C2220i;
import p057a2.C2221j;
import p057a2.C2222k;
import p057a2.C2224m;
import p081e1.C7264a;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.variables.r */
/* compiled from: MacroVariableAdapter */
class C6588r extends BaseAdapter {

    /* renamed from: A */
    private int f15277A = -1;

    /* renamed from: a */
    private final Activity f15278a;

    /* renamed from: c */
    private List<MacroDroidVariable> f15279c;

    /* renamed from: d */
    private HashMap<String, List<Macro>> f15280d;

    /* renamed from: f */
    private final int f15281f;

    /* renamed from: g */
    private final int f15282g;

    /* renamed from: o */
    private final int f15283o;

    /* renamed from: p */
    private final int f15284p;

    /* renamed from: s */
    private Macro f15285s;

    /* renamed from: z */
    private String f15286z;

    /* renamed from: com.arlosoft.macrodroid.variables.r$a */
    /* compiled from: MacroVariableAdapter */
    class C6589a implements AdapterView.OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ MacroDroidVariable f15287a;

        C6589a(MacroDroidVariable macroDroidVariable) {
            this.f15287a = macroDroidVariable;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C4064u.m16048t().mo27980P(this.f15287a, new VariableValue.BooleanValue(i == 1, (List<String>) null), true, (Macro) null);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.r$b */
    /* compiled from: MacroVariableAdapter */
    class C6590b implements C6487a {

        /* renamed from: a */
        final /* synthetic */ MacroDroidVariable f15289a;

        C6590b(MacroDroidVariable macroDroidVariable) {
            this.f15289a = macroDroidVariable;
        }

        /* renamed from: a */
        public void mo27159a() {
            C6588r.this.notifyDataSetChanged();
        }

        /* renamed from: b */
        public void mo27160b() {
            C6588r.this.notifyDataSetChanged();
        }

        /* renamed from: c */
        public void mo27161c(@NonNull VariableValue.DictionaryEntry dictionaryEntry) {
            C6588r.this.notifyDataSetChanged();
        }

        /* renamed from: d */
        public void mo27162d(@NonNull VariableValue.DictionaryEntry dictionaryEntry, @Nullable VariableValue.DictionaryEntry dictionaryEntry2) {
            C6588r.this.notifyDataSetChanged();
        }

        /* renamed from: e */
        public void mo27163e() {
            C4064u.m16048t().mo27976K(this.f15289a.getName());
            C6588r.this.notifyDataSetChanged();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.r$c */
    /* compiled from: MacroVariableAdapter */
    class C6591c implements C6409o.C6412c {

        /* renamed from: a */
        final /* synthetic */ Macro f15291a;

        C6591c(Macro macro) {
            this.f15291a = macro;
        }

        /* renamed from: a */
        public void mo24616a() {
        }

        /* renamed from: b */
        public void mo24617b() {
            C6588r.this.m25021C(this.f15291a);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.r$d */
    /* compiled from: MacroVariableAdapter */
    static class C6592d {

        /* renamed from: a */
        TextView f15293a;

        /* renamed from: b */
        TextView f15294b;

        /* renamed from: c */
        Spinner f15295c;

        /* renamed from: d */
        ImageButton f15296d;

        /* renamed from: e */
        FlowLayout f15297e;

        /* renamed from: f */
        TextView f15298f;

        /* renamed from: g */
        TextView f15299g;

        C6592d() {
        }
    }

    public C6588r(Activity activity, Macro macro) {
        this.f15278a = activity;
        this.f15285s = macro;
        mo32798E(macro);
        this.f15281f = activity.getResources().getColor(2131101114);
        this.f15282g = activity.getResources().getColor(C17528R$color.action_block_link);
        this.f15283o = activity.getResources().getDimensionPixelSize(C17529R$dimen.margin_small);
        this.f15284p = activity.getResources().getDimensionPixelSize(C17529R$dimen.margin_micro);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m25019A(Macro macro, View view) {
        m25022D(macro);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m25020B(Context context, MacroDroidVariable macroDroidVariable, List list, View view) {
        m25040q(context, macroDroidVariable, list);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m25021C(Macro macro) {
        if (macro.isActionBlock) {
            Activity activity = this.f15278a;
            activity.startActivity(ActionBlockEditActivity.m14574Y2(activity, true, (ActionBlock) macro, false));
            return;
        }
        Intent intent = new Intent(this.f15278a, EditMacroActivity.class);
        intent.putExtra("MacroId", macro.getId());
        this.f15278a.startActivity(intent);
    }

    /* renamed from: D */
    private void m25022D(Macro macro) {
        C7264a q = MacroDroidApplication.m14845u().mo27293q(Category.CATEGORY_CACHE);
        CategoryList categoryList = (CategoryList) q.mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
        if (categoryList == null) {
            categoryList = new CategoryList(new ArrayList());
        }
        Category categoryByName = categoryList.getCategoryByName(macro.getCategory());
        if (categoryByName == null || !categoryByName.isLocked()) {
            m25021C(macro);
            return;
        }
        C6409o oVar = new C6409o(q, (C6409o.C6411b) null);
        Activity activity = this.f15278a;
        oVar.mo32449u(activity, activity.getString(C17541R$string.enter_category_lock_password), "", C5163j2.m19992J0(this.f15278a), 0, new C6591c(macro));
    }

    /* renamed from: F */
    private static void m25023F(SelectableItem selectableItem, String str) {
        List<String> keys;
        List<String> keys2;
        if (selectableItem instanceof C2224m) {
            C2224m mVar = (C2224m) selectableItem;
            String[] F = mVar.mo24440F();
            for (int i = 0; i < F.length; i++) {
                if (!TextUtils.isEmpty(F[i])) {
                    if (F[i].contains("[v=" + str)) {
                        F[i] = F[i].replace("[v=" + str, "[lv=" + str);
                    }
                }
                if (!TextUtils.isEmpty(F[i])) {
                    if (F[i].contains("{v=" + str)) {
                        F[i] = F[i].replace("{v=" + str, "{lv=" + str);
                    }
                }
            }
            mVar.mo24441I(F);
        }
        if (selectableItem instanceof C2217f) {
            C2217f fVar = (C2217f) selectableItem;
            DictionaryKeys[] b = fVar.mo24428b();
            if (b != null) {
                for (int i2 = 0; i2 < b.length; i2++) {
                    if (!(b[i2] == null || (keys2 = b[i2].getKeys()) == null || keys2.isEmpty())) {
                        for (int i3 = 0; i3 < keys2.size(); i3++) {
                            if (keys2.get(i3).contains("[v=" + str)) {
                                keys2.set(i3, keys2.get(i3).replace("[v=" + str, "[lv=" + str));
                            }
                            if (keys2.get(i3).contains("{v=" + str)) {
                                keys2.set(i3, keys2.get(i3).replace("{v=" + str, "{lv=" + str));
                            }
                        }
                    }
                }
            }
            fVar.mo24429z(b);
        }
        if (selectableItem instanceof C2216e) {
            C2216e eVar = (C2216e) selectableItem;
            DictionaryKeys b2 = eVar.mo24426b();
            if (!(b2 == null || (keys = b2.getKeys()) == null || keys.isEmpty())) {
                for (int i4 = 0; i4 < keys.size(); i4++) {
                    if (keys.get(i4).contains("[v=" + str)) {
                        keys.set(i4, keys.get(i4).replace("[v=" + str, "[lv=" + str));
                    }
                    if (keys.get(i4).contains("{v=" + str)) {
                        keys.set(i4, keys.get(i4).replace("{v=" + str, "{lv=" + str));
                    }
                }
            }
            eVar.mo24427k(b2);
        }
        if (selectableItem instanceof C2215d) {
            C2215d dVar = (C2215d) selectableItem;
            List<String> u = dVar.mo24425u();
            if (u != null) {
                for (int i5 = 0; i5 < u.size(); i5++) {
                    if (u.get(i5).contains("[v=" + str)) {
                        u.set(i5, u.get(i5).replace("[v=" + str, "[lv=" + str));
                    }
                    if (u.get(i5).contains("{v=" + str)) {
                        u.set(i5, u.get(i5).replace("{v=" + str, "{lv=" + str));
                    }
                }
            }
            dVar.mo24424n(u);
        }
    }

    /* renamed from: k */
    private void m25034k(MacroDroidVariable macroDroidVariable, Macro macro) {
        if (macroDroidVariable != null && macro != null) {
            List list = this.f15280d.get(macroDroidVariable.getName());
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
                this.f15280d.put(macroDroidVariable.getName(), list);
            }
        }
    }

    /* renamed from: l */
    private void m25035l(Constraint constraint, Macro macro) {
        MacroDroidVariable next;
        if (constraint instanceof C2219h) {
            m25034k(((C2219h) constraint).mo24432s(), macro);
        }
        if (constraint instanceof C2222k) {
            for (MacroDroidVariable k : ((C2222k) constraint).mo24437j()) {
                m25034k(k, macro);
            }
        }
        if (constraint instanceof C2224m) {
            for (String str : ((C2224m) constraint).mo24440F()) {
                Iterator<MacroDroidVariable> it = this.f15279c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                    if (!TextUtils.isEmpty(str)) {
                        if (str.contains("[v=" + next.getName())) {
                            break;
                        }
                        if (str.contains("{v=" + next.getName())) {
                            break;
                        }
                    }
                }
                m25034k(next, macro);
            }
        }
        if (constraint instanceof LogicConstraint) {
            for (Constraint l : ((LogicConstraint) constraint).mo27826J0()) {
                m25035l(l, macro);
            }
        }
        m25036m(constraint);
    }

    /* renamed from: m */
    private void m25036m(SelectableItem selectableItem) {
        MacroDroidVariable next;
        MacroDroidVariable next2;
        MacroDroidVariable next3;
        if (selectableItem instanceof C2216e) {
            C2216e eVar = (C2216e) selectableItem;
            if (eVar.mo24426b() != null) {
                for (String next4 : eVar.mo24426b().getKeys()) {
                    if (next4 != null) {
                        Iterator<MacroDroidVariable> it = this.f15279c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            next3 = it.next();
                            if (!TextUtils.isEmpty(next4)) {
                                if (next4.contains("[v=" + next3.getName())) {
                                    break;
                                }
                                if (next4.contains("{v=" + next3.getName())) {
                                    break;
                                }
                            }
                        }
                        m25034k(next3, selectableItem.mo27837X0());
                    }
                }
            }
        }
        if (selectableItem instanceof C2215d) {
            C2215d dVar = (C2215d) selectableItem;
            if (dVar.mo24425u() != null) {
                for (String next5 : dVar.mo24425u()) {
                    if (next5 != null) {
                        Iterator<MacroDroidVariable> it2 = this.f15279c.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            next2 = it2.next();
                            if (!TextUtils.isEmpty(next5)) {
                                if (next5.contains("[v=" + next2.getName())) {
                                    break;
                                }
                                if (next5.contains("{v=" + next2.getName())) {
                                    break;
                                }
                            }
                        }
                        m25034k(next2, selectableItem.mo27837X0());
                    }
                }
            }
        }
        if (selectableItem instanceof C2217f) {
            for (DictionaryKeys dictionaryKeys : ((C2217f) selectableItem).mo24428b()) {
                if (dictionaryKeys != null) {
                    for (String next6 : dictionaryKeys.getKeys()) {
                        if (next6 != null) {
                            Iterator<MacroDroidVariable> it3 = this.f15279c.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                next = it3.next();
                                if (!TextUtils.isEmpty(next6)) {
                                    if (next6.contains("[v=" + next.getName())) {
                                        break;
                                    }
                                    if (next6.contains("{v=" + next.getName())) {
                                        break;
                                    }
                                }
                            }
                            m25034k(next, selectableItem.mo27837X0());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: n */
    private void m25037n(Trigger trigger, Macro macro) {
        MacroDroidVariable w;
        String m;
        MacroDroidVariable w2;
        if (trigger instanceof C2219h) {
            m25034k(((C2219h) trigger).mo24432s(), macro);
        }
        if (!(!(trigger instanceof C2220i) || (m = ((C2220i) trigger).mo24434m()) == null || (w2 = C4064u.m16048t().mo27996w(m)) == null)) {
            m25034k(w2, macro);
        }
        if (trigger instanceof C2222k) {
            for (MacroDroidVariable k : ((C2222k) trigger).mo24437j()) {
                m25034k(k, macro);
            }
        }
        if (trigger instanceof C2221j) {
            for (String str : ((C2221j) trigger).mo24435a()) {
                if (!(str == null || (w = C4064u.m16048t().mo27996w(str)) == null)) {
                    m25034k(w, macro);
                }
            }
        }
        boolean z = trigger instanceof C2224m;
        if (z) {
            for (String str2 : ((C2224m) trigger).mo24440F()) {
                for (MacroDroidVariable next : this.f15279c) {
                    if (!TextUtils.isEmpty(str2)) {
                        if (!str2.contains("[v=" + next.getName())) {
                            if (!str2.contains("{v=" + next.getName())) {
                            }
                        }
                        m25034k(next, macro);
                    }
                }
            }
        }
        if (z) {
            for (String str3 : ((C2224m) trigger).mo24440F()) {
                for (MacroDroidVariable next2 : this.f15279c) {
                    if (!TextUtils.isEmpty(str3)) {
                        if (!str3.contains("[v=" + next2.getName())) {
                            if (!str3.contains("{v=" + next2.getName())) {
                            }
                        }
                        m25034k(next2, macro);
                    }
                }
            }
        }
        m25036m(trigger);
        for (Constraint l : trigger.mo27826J0()) {
            m25035l(l, macro);
        }
    }

    /* renamed from: o */
    private void m25038o(MacroDroidVariable macroDroidVariable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f15278a, C17542R$style.Theme_App_Dialog_Variables);
        builder.setTitle((int) C17541R$string.delete_variable);
        builder.setMessage((CharSequence) this.f15278a.getString(C17541R$string.are_you_sure_delete_variable));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6507i(this, macroDroidVariable));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C6509j.f15137a);
        builder.show();
    }

    /* renamed from: p */
    private static void m25039p(Constraint constraint, String str) {
        m25023F(constraint, str);
        if (constraint instanceof LogicConstraint) {
            for (Constraint p : ((LogicConstraint) constraint).mo27826J0()) {
                m25039p(p, str);
            }
        }
    }

    /* renamed from: q */
    private void m25040q(Context context, MacroDroidVariable macroDroidVariable, List<Macro> list) {
        macroDroidVariable.mo27763j0(true);
        list.get(0).getLocalVariables().add(macroDroidVariable);
        C4934n.m18998M().mo29696p0(list.get(0), true);
        C4064u.m16048t().mo27976K(macroDroidVariable.getName());
        if (this.f15285s != null) {
            this.f15279c = C4064u.m16048t().mo27992q(this.f15285s, true);
        } else {
            this.f15279c = C4064u.m16048t().mo27993r(true);
        }
        for (Macro next : C4934n.m18998M().mo29710z()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (it.hasNext()) {
                Trigger next2 = it.next();
                m25023F(next2, macroDroidVariable.getName());
                for (Constraint p : next2.mo27826J0()) {
                    m25039p(p, macroDroidVariable.getName());
                }
            }
            Iterator<Action> it2 = next.getActions().iterator();
            while (it2.hasNext()) {
                Action next3 = it2.next();
                m25023F(next3, macroDroidVariable.getName());
                for (Constraint p2 : next3.mo27826J0()) {
                    m25039p(p2, macroDroidVariable.getName());
                }
            }
            for (Constraint p3 : next.getConstraints()) {
                m25039p(p3, macroDroidVariable.getName());
            }
        }
        try {
            C15626c.m94876a(context, String.format(context.getString(C17541R$string.variable_added_as_local_to_macro), new Object[]{list.get(0).getName()}), 0).show();
        } catch (Exception unused) {
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m25041t(MacroDroidVariable macroDroidVariable, DialogInterface dialogInterface, int i) {
        C4064u.m16048t().mo27976K(macroDroidVariable.getName());
        if (this.f15285s != null) {
            this.f15279c = C4064u.m16048t().mo27992q(this.f15285s, true);
        } else {
            this.f15279c = C4064u.m16048t().mo27993r(true);
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m25043v(View view) {
        mo32798E(this.f15285s);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m25044w(MacroDroidVariable macroDroidVariable, View view) {
        C6520o0.m24932o0(this.f15278a, macroDroidVariable, new C6513l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m25045x(MacroDroidVariable macroDroidVariable, View view) {
        m25038o(macroDroidVariable);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m25046y(View view) {
        if (this.f15285s != null) {
            this.f15279c = C4064u.m16048t().mo27992q(this.f15285s, true);
        } else {
            this.f15279c = C4064u.m16048t().mo27993r(true);
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m25047z(MacroDroidVariable macroDroidVariable, C6592d dVar, View view) {
        if (this.f15279c.size() <= 0) {
            return;
        }
        if (macroDroidVariable.mo27751a0() || macroDroidVariable.mo27748X()) {
            C6520o0.m24871D0(this.f15278a, macroDroidVariable, macroDroidVariable.getName(), macroDroidVariable.getName(), macroDroidVariable.mo27770n(), false, (VariableValue.Dictionary) null, new ArrayList(), new C6590b(macroDroidVariable));
            return;
        }
        C6520o0.m24938r0(this.f15278a, macroDroidVariable, (DictionaryKeys) null, new C6511k(this), false, (DialogInterface.OnDismissListener) null);
        dVar.f15294b.clearFocus();
    }

    /* renamed from: E */
    public void mo32798E(@Nullable Macro macro) {
        List<MacroDroidVariable> list;
        MacroDroidVariable w;
        String m;
        MacroDroidVariable w2;
        int i;
        this.f15285s = macro;
        if (macro != null) {
            list = C4064u.m16048t().mo27992q(macro, true);
        } else {
            list = C4064u.m16048t().mo27993r(true);
        }
        this.f15279c = new ArrayList();
        for (MacroDroidVariable next : list) {
            if ((TextUtils.isEmpty(this.f15286z) || next.getName().toLowerCase().contains(this.f15286z.toLowerCase())) && ((i = this.f15277A) < 0 || i == next.mo27743S())) {
                this.f15279c.add(next);
            }
        }
        this.f15280d = new HashMap<>();
        for (Macro next2 : C4934n.m18998M().mo29676F()) {
            Iterator<Trigger> it = next2.getTriggerListWithAwaitingActions().iterator();
            while (it.hasNext()) {
                m25037n(it.next(), next2);
            }
            Iterator<Action> it2 = next2.getActions().iterator();
            while (it2.hasNext()) {
                Action next3 = it2.next();
                if (next3 instanceof C2219h) {
                    m25034k(((C2219h) next3).mo24432s(), next2);
                }
                if (next3 instanceof C2222k) {
                    for (MacroDroidVariable k : ((C2222k) next3).mo24437j()) {
                        m25034k(k, next2);
                    }
                }
                if (!(!(next3 instanceof C2220i) || (m = ((C2220i) next3).mo24434m()) == null || (w2 = C4064u.m16048t().mo27996w(m)) == null)) {
                    m25034k(w2, next2);
                }
                if (next3 instanceof C2221j) {
                    for (String str : ((C2221j) next3).mo24435a()) {
                        if (!(str == null || (w = C4064u.m16048t().mo27996w(str)) == null)) {
                            m25034k(w, next2);
                        }
                    }
                }
                if (next3 instanceof C2224m) {
                    for (String str2 : ((C2224m) next3).mo24440F()) {
                        for (MacroDroidVariable next4 : this.f15279c) {
                            if (!TextUtils.isEmpty(str2)) {
                                if (!str2.contains("[v=" + next4.getName() + "]")) {
                                    if (!str2.contains("{v=" + next4.getName() + "}")) {
                                        if (!str2.contains("[v=" + next4.getName() + "[")) {
                                            if (!str2.contains("{v=" + next4.getName() + "[")) {
                                            }
                                        }
                                    }
                                }
                                m25034k(next4, next2);
                            }
                        }
                    }
                }
                if (next3 instanceof WaitUntilTriggerAction) {
                    Iterator<Trigger> it3 = ((WaitUntilTriggerAction) next3).mo26117B3().iterator();
                    while (it3.hasNext()) {
                        m25037n(it3.next(), next2);
                    }
                }
                m25036m(next3);
                for (Constraint l : next3.mo27826J0()) {
                    m25035l(l, next2);
                }
            }
            for (Constraint l2 : next2.getConstraints()) {
                m25035l(l2, next2);
            }
        }
    }

    /* renamed from: G */
    public void mo32799G(String str) {
        this.f15286z = str;
    }

    /* renamed from: H */
    public void mo32800H(int i) {
        this.f15277A = i;
    }

    public int getCount() {
        return this.f15279c.size();
    }

    public Object getItem(int i) {
        return this.f15279c.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C6592d dVar;
        MacroDroidVariable macroDroidVariable = this.f15279c.get(i);
        if (view == null) {
            view = ((LayoutInflater) this.f15278a.getSystemService("layout_inflater")).inflate(C17535R$layout.variable_cell, (ViewGroup) null);
            dVar = new C6592d();
            dVar.f15293a = (TextView) view.findViewById(C17532R$id.variable_cell_variable_name);
            dVar.f15294b = (TextView) view.findViewById(C17532R$id.variable_cell_variable_value);
            dVar.f15295c = (Spinner) view.findViewById(C17532R$id.variable_cell_variable_boolean_spinner);
            dVar.f15296d = (ImageButton) view.findViewById(C17532R$id.variable_cell_delete_button);
            dVar.f15297e = (FlowLayout) view.findViewById(C17532R$id.variable_cell_macro_list);
            dVar.f15298f = (TextView) view.findViewById(C17532R$id.variable_cell_badge);
            dVar.f15299g = (TextView) view.findViewById(C17532R$id.convert_to_local);
            view.setTag(dVar);
        } else {
            dVar = (C6592d) view.getTag();
        }
        dVar.f15293a.setText(macroDroidVariable.getName());
        dVar.f15293a.setOnClickListener(new C6519o(this, macroDroidVariable));
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f15278a.getString(C17541R$string.false_label));
        arrayList.add(this.f15278a.getString(C17541R$string.true_label));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.f15278a, C17535R$layout.simple_spinner_item_white_text_variables, arrayList);
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        dVar.f15295c.setAdapter(arrayAdapter);
        TextView textView = dVar.f15294b;
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), 2131101114));
        int S = macroDroidVariable.mo27743S();
        if (S == 0) {
            dVar.f15295c.setVisibility(0);
            dVar.f15294b.setVisibility(8);
            dVar.f15295c.setSelection(macroDroidVariable.mo27762j() ? 1 : 0);
        } else if (S == 1) {
            dVar.f15295c.setVisibility(8);
            dVar.f15294b.setText(String.valueOf(macroDroidVariable.mo27731A()));
            dVar.f15294b.setVisibility(0);
            dVar.f15294b.setRawInputType(2);
        } else if (S == 2) {
            dVar.f15295c.setVisibility(8);
            dVar.f15294b.setText(macroDroidVariable.mo27739N().substring(0, Math.min(macroDroidVariable.mo27739N().length(), 80)));
            dVar.f15294b.setVisibility(0);
            dVar.f15294b.setRawInputType(524288);
            if (TextUtils.isEmpty(macroDroidVariable.mo27739N())) {
                String string = dVar.f15294b.getContext().getString(C17541R$string.empty);
                dVar.f15294b.setText(string.substring(0, 1).toUpperCase() + string.substring(1));
                TextView textView2 = dVar.f15294b;
                textView2.setTextColor(ContextCompat.getColor(textView2.getContext(), C17528R$color.white_very_transparent));
            }
        } else if (S == 3) {
            dVar.f15295c.setVisibility(8);
            dVar.f15294b.setText(String.valueOf(macroDroidVariable.mo27766l()));
            dVar.f15294b.setVisibility(0);
            dVar.f15294b.setInputType(12290);
        } else if (S == 4 || S == 5) {
            dVar.f15295c.setVisibility(8);
            dVar.f15294b.setVisibility(0);
            dVar.f15294b.setText(String.format(this.f15278a.getString(C17541R$string.variable_multi_entry_num_entries), new Object[]{Integer.valueOf(macroDroidVariable.mo27770n().getEntries().size())}));
        }
        dVar.f15298f.setText(macroDroidVariable.mo27744T(this.f15278a));
        dVar.f15295c.setOnItemSelectedListener(new C6589a(macroDroidVariable));
        dVar.f15296d.setOnClickListener(new C6517n(this, macroDroidVariable));
        dVar.f15294b.setOnClickListener(new C6582p(this, macroDroidVariable, dVar));
        dVar.f15297e.removeAllViews();
        List<Macro> list = this.f15280d.get(macroDroidVariable.getName());
        if (list != null) {
            for (Macro macro : list) {
                TextView textView3 = new TextView(this.f15278a);
                textView3.setText(macro.getName());
                textView3.setTextColor(macro.isActionBlock ? this.f15282g : this.f15281f);
                textView3.setTextSize(12.0f);
                textView3.setPaintFlags(textView3.getPaintFlags() | 8);
                int i2 = this.f15283o;
                int i3 = this.f15284p;
                textView3.setPadding(i2, i3, i2, i3);
                dVar.f15297e.addView(textView3, -2, -2);
                textView3.setOnClickListener(new C6584q(this, macro));
            }
            if (list.size() == 1) {
                dVar.f15299g.setVisibility(0);
                TextView textView4 = dVar.f15299g;
                textView4.setPaintFlags(8 | textView4.getPaintFlags());
                dVar.f15299g.setOnClickListener(new C6515m(this, view.getContext(), macroDroidVariable, list));
            } else {
                dVar.f15299g.setVisibility(8);
            }
        } else {
            dVar.f15299g.setVisibility(8);
            TextView textView5 = new TextView(this.f15278a);
            textView5.setText("(" + this.f15278a.getString(C17541R$string.not_used) + ")");
            textView5.setTextSize(12.0f);
            textView5.setTextColor(this.f15281f);
            int i4 = this.f15283o;
            int i5 = this.f15284p;
            textView5.setPadding(i4, i5, i4, i5);
            dVar.f15297e.addView(textView5);
        }
        return view;
    }

    /* renamed from: r */
    public HashMap<String, List<Macro>> mo32805r() {
        return this.f15280d;
    }

    /* renamed from: s */
    public int mo32806s(MacroDroidVariable macroDroidVariable) {
        for (int i = 0; i < this.f15279c.size(); i++) {
            if (macroDroidVariable == this.f15279c.get(i)) {
                return i;
            }
        }
        return 0;
    }
}
