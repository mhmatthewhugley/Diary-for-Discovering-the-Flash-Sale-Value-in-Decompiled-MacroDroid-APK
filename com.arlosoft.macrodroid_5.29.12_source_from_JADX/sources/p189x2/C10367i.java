package p189x2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.utils.C6413o0;
import com.arlosoft.macrodroid.utils.C6440u1;
import com.arlosoft.macrodroid.variables.C6585q0;
import com.arlosoft.macrodroid.variables.C6595s0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: x2.i */
/* compiled from: TaskerVariableAdapter.kt */
public final class C10367i extends RecyclerView.Adapter<C10370c> {

    /* renamed from: g */
    public static final C10368a f23575g = new C10368a((C13695i) null);

    /* renamed from: a */
    private final String[] f23576a;

    /* renamed from: b */
    private final Map<String, String> f23577b;

    /* renamed from: c */
    private final Activity f23578c;

    /* renamed from: d */
    private final SelectableItem f23579d;

    /* renamed from: e */
    private final int f23580e;

    /* renamed from: f */
    private final List<C10369b> f23581f;

    /* renamed from: x2.i$a */
    /* compiled from: TaskerVariableAdapter.kt */
    public static final class C10368a {
        private C10368a() {
        }

        public /* synthetic */ C10368a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: x2.i$b */
    /* compiled from: TaskerVariableAdapter.kt */
    public static final class C10369b {

        /* renamed from: a */
        private final String f23582a;

        /* renamed from: b */
        private final String f23583b;

        /* renamed from: c */
        private final String f23584c;

        public C10369b(String str, String str2, String str3) {
            C13706o.m87929f(str, "identifier");
            this.f23582a = str;
            this.f23583b = str2;
            this.f23584c = str3;
        }

        /* renamed from: a */
        public final String mo41040a() {
            return this.f23584c;
        }

        /* renamed from: b */
        public final String mo41041b() {
            return this.f23582a;
        }

        /* renamed from: c */
        public final String mo41042c() {
            return this.f23583b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10369b)) {
                return false;
            }
            C10369b bVar = (C10369b) obj;
            return C13706o.m87924a(this.f23582a, bVar.f23582a) && C13706o.m87924a(this.f23583b, bVar.f23583b) && C13706o.m87924a(this.f23584c, bVar.f23584c);
        }

        public int hashCode() {
            int hashCode = this.f23582a.hashCode() * 31;
            String str = this.f23583b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f23584c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "VarDescriptor(identifier=" + this.f23582a + ", name=" + this.f23583b + ", description=" + this.f23584c + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C10369b(String str, String str2, String str3, int i, C13695i iVar) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    /* renamed from: x2.i$c */
    /* compiled from: TaskerVariableAdapter.kt */
    public static final class C10370c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final SelectableItem f23585a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Map<String, String> f23586b;

        /* renamed from: c */
        private final Activity f23587c;

        /* renamed from: d */
        private final int f23588d;

        /* renamed from: x2.i$c$a */
        /* compiled from: TaskerVariableAdapter.kt */
        public static final class C10371a implements AdapterView.OnItemSelectedListener {

            /* renamed from: a */
            final /* synthetic */ View f23589a;

            /* renamed from: c */
            final /* synthetic */ C10370c f23590c;

            /* renamed from: d */
            final /* synthetic */ String f23591d;

            C10371a(View view, C10370c cVar, String str) {
                this.f23589a = view;
                this.f23590c = cVar;
                this.f23591d = str;
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                View view2 = this.f23589a;
                int i2 = C17532R$id.varSpinner;
                ((Spinner) view2.findViewById(i2)).setAlpha(i == 0 ? 0.25f : 1.0f);
                if (i == 0) {
                    this.f23590c.f23586b.remove(this.f23591d);
                    return;
                }
                Map v = this.f23590c.f23586b;
                String str = this.f23591d;
                Object selectedItem = ((Spinner) this.f23589a.findViewById(i2)).getSelectedItem();
                C13706o.m87927d(selectedItem, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableOrOption.Variable");
                v.put(str, ((C6585q0.C6587b) selectedItem).mo32794b().getName());
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10370c(View view, SelectableItem selectableItem, Map<String, String> map, Activity activity, @StyleRes int i) {
            super(view);
            C13706o.m87929f(view, "itemView");
            C13706o.m87929f(selectableItem, "selectableItem");
            C13706o.m87929f(map, "variableMap");
            C13706o.m87929f(activity, "activity");
            this.f23585a = selectableItem;
            this.f23586b = map;
            this.f23587c = activity;
            this.f23588d = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: x */
        public static final void m40685x(C10370c cVar, View view) {
            C13706o.m87929f(cVar, "this$0");
            C6440u1.m24748e(cVar.f23587c, (Spinner) cVar.itemView.findViewById(C17532R$id.varSpinner), cVar.f23585a, cVar.f23588d, 2, true, new C17510k(cVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public static final void m40686y(C10370c cVar, MacroDroidVariable macroDroidVariable) {
            C13706o.m87929f(cVar, "this$0");
            List<MacroDroidVariable> p1 = cVar.f23585a.mo27860p1(2);
            ArrayList arrayList = new ArrayList();
            String string = cVar.f23587c.getString(C17541R$string.none);
            C13706o.m87928e(string, "activity.getString(R.string.none)");
            arrayList.add(0, new C6585q0.C6586a(string, 0));
            int i = 0;
            int i2 = 0;
            for (MacroDroidVariable next : p1) {
                if (C13706o.m87924a(macroDroidVariable.getName(), next.getName())) {
                    i = i2 + 1;
                }
                C13706o.m87928e(next, "variable");
                arrayList.add(new C6585q0.C6587b(next, ""));
                i2++;
            }
            C6595s0 s0Var = new C6595s0(cVar.f23587c, arrayList);
            s0Var.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
            View view = cVar.itemView;
            int i3 = C17532R$id.varSpinner;
            ((Spinner) view.findViewById(i3)).setAdapter(s0Var);
            ((Spinner) cVar.itemView.findViewById(i3)).setSelection(i, false);
        }

        /* renamed from: z */
        private final void m40687z(View view, C10369b bVar) {
            ArrayAdapter arrayAdapter;
            Object obj;
            ArrayList<MacroDroidVariable> v0 = this.f23585a.mo27870v0();
            ArrayList<MacroDroidVariable> p0 = this.f23585a.mo27859p0();
            ArrayList<MacroDroidVariable> arrayList = new ArrayList<>();
            arrayList.add(0, (Object) null);
            String b = bVar.mo41041b();
            String str = this.f23586b.get(b);
            Iterator<MacroDroidVariable> it = p0.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                i++;
                MacroDroidVariable next = it.next();
                if (C13706o.m87924a(str, next.getName())) {
                    i2 = i;
                }
                arrayList.add(next);
            }
            Iterator<MacroDroidVariable> it2 = v0.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                i3++;
                MacroDroidVariable next2 = it2.next();
                if (C13706o.m87924a(str, next2.getName())) {
                    i2 = p0.size() + i3;
                }
                arrayList.add(next2);
            }
            if (arrayList.isEmpty()) {
                arrayAdapter = new ArrayAdapter(view.getContext(), C17535R$layout.simple_spinner_item, C13612s.m87736e(view.getContext().getString(C17541R$string.no_string_variables_defined)));
            } else {
                Activity activity = this.f23587c;
                ArrayList arrayList2 = new ArrayList(C13616u.m87774u(arrayList, 10));
                for (MacroDroidVariable macroDroidVariable : arrayList) {
                    if (macroDroidVariable != null) {
                        obj = new C6585q0.C6587b(macroDroidVariable, (String) null, 2, (C13695i) null);
                    } else {
                        String string = this.f23587c.getString(C17541R$string.none);
                        C13706o.m87928e(string, "activity.getString(R.string.none)");
                        obj = new C6585q0.C6586a(string, 0);
                    }
                    arrayList2.add(obj);
                }
                arrayAdapter = new C6595s0(activity, arrayList2);
            }
            arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
            int i4 = C17532R$id.varSpinner;
            ((Spinner) view.findViewById(i4)).setAdapter(arrayAdapter);
            ((Spinner) view.findViewById(i4)).setSelection(i2, false);
            ((Spinner) view.findViewById(i4)).setOnItemSelectedListener(new C10371a(view, this, b));
            ((Spinner) view.findViewById(i4)).setAlpha(((Spinner) view.findViewById(i4)).getSelectedItemPosition() == 0 ? 0.25f : 1.0f);
        }

        /* renamed from: w */
        public final void mo41046w(C10369b bVar) {
            C13706o.m87929f(bVar, "varDescriptor");
            ((TextView) this.itemView.findViewById(C17532R$id.varName)).setText(bVar.mo41042c());
            if (bVar.mo41040a() != null) {
                if (bVar.mo41040a().length() > 0) {
                    View view = this.itemView;
                    int i = C17532R$id.varDescription;
                    ((TextView) view.findViewById(i)).setText(C6413o0.m24692a(bVar.mo41040a()));
                    TextView textView = (TextView) this.itemView.findViewById(i);
                    C13706o.m87928e(textView, "itemView.varDescription");
                    textView.setVisibility(0);
                    View view2 = this.itemView;
                    C13706o.m87928e(view2, "itemView");
                    m40687z(view2, bVar);
                    ((AppCompatButton) this.itemView.findViewById(C17532R$id.addVarButton)).setOnClickListener(new C17509j(this));
                }
            }
            TextView textView2 = (TextView) this.itemView.findViewById(C17532R$id.varDescription);
            C13706o.m87928e(textView2, "itemView.varDescription");
            textView2.setVisibility(8);
            View view22 = this.itemView;
            C13706o.m87928e(view22, "itemView");
            m40687z(view22, bVar);
            ((AppCompatButton) this.itemView.findViewById(C17532R$id.addVarButton)).setOnClickListener(new C17509j(this));
        }
    }

    /* renamed from: x2.i$d */
    /* compiled from: Comparisons.kt */
    public static final class C10372d<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C15612b.m94865a(((C10369b) t).mo41042c(), ((C10369b) t2).mo41042c());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10367i(java.lang.String[] r10, java.util.Map<java.lang.String, java.lang.String> r11, android.app.Activity r12, com.arlosoft.macrodroid.common.SelectableItem r13, @androidx.annotation.StyleRes int r14) {
        /*
            r9 = this;
            java.lang.String r0 = "relevantVariables"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            java.lang.String r0 = "variableMap"
            kotlin.jvm.internal.C13706o.m87929f(r11, r0)
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.C13706o.m87929f(r12, r0)
            java.lang.String r0 = "selectableItem"
            kotlin.jvm.internal.C13706o.m87929f(r13, r0)
            r9.<init>()
            r9.f23576a = r10
            r9.f23577b = r11
            r9.f23578c = r12
            r9.f23579d = r13
            r9.f23580e = r14
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r12 = r10.length
            r13 = 0
            r14 = 0
        L_0x0029:
            if (r14 >= r12) goto L_0x0086
            r2 = r10[r14]
            java.lang.String r0 = "\n"
            r6 = 2
            r7 = 0
            boolean r1 = kotlin.text.C15177w.m93663N(r2, r0, r13, r6, r7)
            if (r1 != 0) goto L_0x0045
            x2.i$b r6 = new x2.i$b
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r6
            r1 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            r11.add(r6)
            goto L_0x0083
        L_0x0045:
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r3 = 0
            r4 = 0
            r5 = 6
            r8 = 0
            r0 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            java.util.List r0 = kotlin.text.C15177w.m93705x0(r0, r1, r2, r3, r4, r5)
            x2.i$b r1 = new x2.i$b
            java.lang.Object r2 = r0.get(r13)
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r0.size()
            r4 = 1
            if (r3 <= r4) goto L_0x006a
            java.lang.Object r3 = r0.get(r4)
            goto L_0x006e
        L_0x006a:
            java.lang.Object r3 = r0.get(r13)
        L_0x006e:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r0.size()
            if (r4 <= r6) goto L_0x007d
            java.lang.Object r0 = r0.get(r6)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
        L_0x007d:
            r1.<init>(r2, r3, r7)
            r11.add(r1)
        L_0x0083:
            int r14 = r14 + 1
            goto L_0x0029
        L_0x0086:
            x2.i$d r10 = new x2.i$d
            r10.<init>()
            java.util.List r10 = kotlin.collections.C13566b0.m87450y0(r11, r10)
            r9.f23581f = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p189x2.C10367i.<init>(java.lang.String[], java.util.Map, android.app.Activity, com.arlosoft.macrodroid.common.SelectableItem, int):void");
    }

    /* renamed from: B */
    public void onBindViewHolder(C10370c cVar, int i) {
        C13706o.m87929f(cVar, "holder");
        cVar.mo41046w(this.f23581f.get(i));
    }

    /* renamed from: C */
    public C10370c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.list_item_tasker_variable, viewGroup, false);
        C13706o.m87928e(inflate, "from(parent.context).inf…_variable, parent, false)");
        return new C10370c(inflate, this.f23579d, this.f23577b, this.f23578c, this.f23580e);
    }

    public int getItemCount() {
        return this.f23576a.length;
    }
}
