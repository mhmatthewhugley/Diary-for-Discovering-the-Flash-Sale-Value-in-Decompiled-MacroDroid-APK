package com.arlosoft.macrodroid.common;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.util.AtomicFile;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.constraint.LogicConstraint;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.variables.VariableValue;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p057a2.C2219h;
import p057a2.C2220i;
import p057a2.C2221j;
import p057a2.C2222k;
import p057a2.C2224m;
import p148q0.C8151a;
import p172u1.C10283c;

/* renamed from: com.arlosoft.macrodroid.common.u */
/* compiled from: MacroDroidVariableStore */
public class C4064u {

    /* renamed from: e */
    private static C4064u f10637e;

    /* renamed from: a */
    private final Map<String, MacroDroidVariable> f10638a = new HashMap();

    /* renamed from: b */
    private C4068u1 f10639b;

    /* renamed from: c */
    private List<C4068u1> f10640c = new ArrayList();

    /* renamed from: d */
    private final Object f10641d = new Object();

    /* renamed from: com.arlosoft.macrodroid.common.u$a */
    /* compiled from: MacroDroidVariableStore */
    class C4065a extends Thread {
        C4065a() {
        }

        public void run() {
            String u = C4064u.this.mo27994u();
            C4064u.this.m16039I("variablesAtomic.json", u);
            C4064u.this.m16039I("variablesAtomicBackup.json", u);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.common.u$b */
    /* compiled from: MacroDroidVariableStore */
    class C4066b extends TypeToken<List<MacroDroidVariable>> {
        C4066b() {
        }
    }

    private C4064u() {
        m16049x();
    }

    /* renamed from: A */
    private boolean m16033A() {
        boolean z = m16051z("variablesAtomic.json");
        return !z ? m16051z("variablesAtomicBackup.json") : z;
    }

    /* renamed from: B */
    private boolean m16034B() {
        boolean y = m16050y("variables.json");
        if (!y) {
            C8151a.m33860a("Failed to load variables from legacy variable file");
            C4878b.m18879r("Failed to load variables from variable file");
            y = m16050y("variables.json.backup");
            if (y) {
                C4878b.m18879r("Loaded variables from legacy variable backup");
            } else {
                C4878b.m18879r("Failed to load variables from legacy backup variable file");
            }
        } else {
            C4878b.m18879r("Loaded variables from legacy file");
        }
        return y;
    }

    /* renamed from: D */
    private boolean m16035D(SelectableItem selectableItem, MacroDroidVariable macroDroidVariable) {
        if (selectableItem instanceof C2219h) {
            MacroDroidVariable s = ((C2219h) selectableItem).mo24432s();
            if (s != null && s.getName().equals(macroDroidVariable.getName())) {
                return true;
            }
        } else if (selectableItem instanceof C2222k) {
            for (MacroDroidVariable next : ((C2222k) selectableItem).mo24437j()) {
                if (next != null && next.getName().equals(macroDroidVariable.getName())) {
                    return true;
                }
            }
        } else if (selectableItem instanceof C2220i) {
            String m = ((C2220i) selectableItem).mo24434m();
            if (m != null && m.equals(macroDroidVariable.getName())) {
                return true;
            }
        } else if (selectableItem instanceof C2221j) {
            for (String str : Arrays.asList(((C2221j) selectableItem).mo24435a())) {
                if (str != null && str.equals(macroDroidVariable.getName())) {
                    return true;
                }
            }
        }
        if (selectableItem instanceof C2224m) {
            for (String str2 : ((C2224m) selectableItem).mo24440F()) {
                if (!TextUtils.isEmpty(str2)) {
                    if (!str2.contains("[v=" + macroDroidVariable.getName())) {
                        if (str2.contains("{v=" + macroDroidVariable.getName())) {
                        }
                    }
                    return true;
                }
            }
        }
        for (Constraint g : selectableItem.mo27826J0()) {
            if (m16045g(g, macroDroidVariable)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static /* synthetic */ int m16036E(Locale locale, MacroDroidVariable macroDroidVariable, MacroDroidVariable macroDroidVariable2) {
        Collator instance = Collator.getInstance(locale);
        instance.setStrength(0);
        return instance.compare(macroDroidVariable.getName(), macroDroidVariable2.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static /* synthetic */ int m16037F(Locale locale, MacroDroidVariable macroDroidVariable, MacroDroidVariable macroDroidVariable2) {
        Collator instance = Collator.getInstance(locale);
        instance.setStrength(0);
        return instance.compare(macroDroidVariable.getName(), macroDroidVariable2.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static /* synthetic */ int m16038G(Locale locale, MacroDroidVariable macroDroidVariable, MacroDroidVariable macroDroidVariable2) {
        Collator instance = Collator.getInstance(locale);
        instance.setStrength(0);
        return instance.compare(macroDroidVariable.getName(), macroDroidVariable2.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m16039I(String str, String str2) {
        OutputStreamWriter outputStreamWriter;
        synchronized (this.f10641d) {
            AtomicFile atomicFile = new AtomicFile(new File(m16047s().getFilesDir(), str));
            try {
                FileOutputStream startWrite = atomicFile.startWrite();
                try {
                    outputStreamWriter = new OutputStreamWriter(startWrite, "UTF-8");
                    outputStreamWriter.write(str2);
                    outputStreamWriter.flush();
                    atomicFile.finishWrite(startWrite);
                    outputStreamWriter.close();
                    outputStreamWriter.close();
                    if (startWrite != null) {
                        startWrite.close();
                    }
                } catch (Throwable th) {
                    if (startWrite != null) {
                        startWrite.close();
                    }
                    throw th;
                }
            } catch (Exception e) {
                C4878b.m18868g("Failed to persist variable data: " + e.toString());
                C8151a.m33873n(new RuntimeException("Failed to persist variable data: " + e.toString()));
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return;
        throw th;
    }

    /* renamed from: O */
    private List<MacroDroidVariable> m16040O(List<MacroDroidVariable> list) {
        Collections.sort(list, new C4059t(C5163j2.m19963F0(m16047s())));
        return list;
    }

    /* renamed from: g */
    private boolean m16045g(Constraint constraint, MacroDroidVariable macroDroidVariable) {
        MacroDroidVariable s;
        if ((constraint instanceof C2219h) && (s = ((C2219h) constraint).mo24432s()) != null && s.getName().equals(macroDroidVariable.getName())) {
            return true;
        }
        if (!(constraint instanceof LogicConstraint)) {
            return false;
        }
        for (Constraint g : ((LogicConstraint) constraint).mo27826J0()) {
            if (m16045g(g, macroDroidVariable)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m16046i(String str) {
        try {
            File file = new File(MacroDroidApplication.m14845u().getFilesDir().getAbsolutePath() + "/" + str);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: s */
    private Context m16047s() {
        return MacroDroidApplication.m14845u();
    }

    /* renamed from: t */
    public static synchronized C4064u m16048t() {
        C4064u uVar;
        synchronized (C4064u.class) {
            if (f10637e == null) {
                f10637e = new C4064u();
            }
            uVar = f10637e;
        }
        return uVar;
    }

    /* renamed from: x */
    private void m16049x() {
        synchronized (this.f10641d) {
            if (!m16033A() && !C5163j2.m20198l(m16047s())) {
                C4878b.m18873l("Attempting variable store migration (V1 -> V2)");
                if (m16034B()) {
                    mo27974H();
                    m16046i("variables.json");
                    m16046i("variables.json.backup");
                    C4878b.m18873l("Variable data migration complete (V1 -> V2)");
                } else {
                    C4878b.m18873l("No legacy V1 variable data found");
                }
                C5163j2.m20194k3(m16047s(), true);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|33|34|35|36) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00f4 */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m16050y(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r0.<init>()     // Catch:{ all -> 0x00f5 }
            r1 = 0
            java.lang.String r2 = ""
            r3 = 0
            android.content.Context r4 = r8.m16047s()     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            java.io.FileInputStream r1 = r4.openFileInput(r9)     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            java.lang.String r5 = "Variable file stream length = "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            java.nio.channels.FileChannel r5 = r1.getChannel()     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            long r5 = r5.size()     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            p148q0.C8151a.m33860a(r4)     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            java.lang.String r6 = "UTF-8"
            r5.<init>(r1, r6)     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            r5 = 1024(0x400, float:1.435E-42)
            char[] r6 = new char[r5]     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            int r7 = r4.read(r6, r3, r5)     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
        L_0x0042:
            if (r7 <= 0) goto L_0x004c
            r0.append(r6, r3, r7)     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            int r7 = r4.read(r6, r3, r5)     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            goto L_0x0042
        L_0x004c:
            r4.close()     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            java.lang.String r2 = r0.toString()     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            java.lang.String r0 = "\u0000"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.replace(r0, r4)     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            r8.mo27973C(r2)     // Catch:{ FileNotFoundException -> 0x00d6, Exception -> 0x0067 }
            r1.close()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x0064:
            r9 = move-exception
            goto L_0x00f1
        L_0x0067:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0064 }
            r0.<init>()     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = "Failed to load variables: "
            r0.append(r4)     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = r9.toString()     // Catch:{ all -> 0x0064 }
            r0.append(r4)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0064 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)     // Catch:{ all -> 0x0064 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0064 }
            r0.<init>()     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = ""
            r0.append(r4)     // Catch:{ all -> 0x0064 }
            r0.append(r2)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0064 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)     // Catch:{ all -> 0x0064 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0064 }
            r0.<init>()     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = "VARIABLE IMPORT FAILED (JSON length = "
            r0.append(r4)     // Catch:{ all -> 0x0064 }
            int r4 = r2.length()     // Catch:{ all -> 0x0064 }
            r0.append(r4)     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = "): "
            r0.append(r4)     // Catch:{ all -> 0x0064 }
            r0.append(r2)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0064 }
            p148q0.C8151a.m33860a(r0)     // Catch:{ all -> 0x0064 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0064 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0064 }
            r2.<init>()     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = "Failed to import variables: "
            r2.append(r4)     // Catch:{ all -> 0x0064 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0064 }
            r2.append(r9)     // Catch:{ all -> 0x0064 }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x0064 }
            r0.<init>(r9)     // Catch:{ all -> 0x0064 }
            p148q0.C8151a.m33873n(r0)     // Catch:{ all -> 0x0064 }
            r1.close()     // Catch:{ Exception -> 0x00d4 }
        L_0x00d4:
            monitor-exit(r8)
            return r3
        L_0x00d6:
            java.lang.String r0 = "MacroDroidVariableStore"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0064 }
            r2.<init>()     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = "No variable data file found: "
            r2.append(r4)     // Catch:{ all -> 0x0064 }
            r2.append(r9)     // Catch:{ all -> 0x0064 }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x0064 }
            android.util.Log.w(r0, r9)     // Catch:{ all -> 0x0064 }
            r1.close()     // Catch:{ Exception -> 0x00ef }
        L_0x00ef:
            monitor-exit(r8)
            return r3
        L_0x00f1:
            r1.close()     // Catch:{ Exception -> 0x00f4 }
        L_0x00f4:
            throw r9     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.common.C4064u.m16050y(java.lang.String):boolean");
    }

    /* renamed from: z */
    private boolean m16051z(String str) {
        try {
            String str2 = new String(new AtomicFile(new File(m16047s().getFilesDir(), str)).readFully(), "UTF-8");
            if (str2.isEmpty()) {
                C4878b.m18879r("No variable data found in: " + str);
                return false;
            }
            boolean C = mo27973C(str2);
            C4878b.m18879r("No variables extracted from: " + str);
            return C;
        } catch (FileNotFoundException unused) {
            C4878b.m18879r("No variable file found:" + str);
            return false;
        } catch (Exception e) {
            C8151a.m33873n(e);
            C4878b.m18868g("Failed to load variables from atomic file: " + str + ", " + e.toString());
            return false;
        }
    }

    /* renamed from: C */
    public boolean mo27973C(String str) {
        for (MacroDroidVariable macroDroidVariable : (List) C10283c.m40413c().mo64008g().mo64010i().mo64004c().mo63977k(str, new C4066b().mo64307e())) {
            this.f10638a.put(macroDroidVariable.getName(), macroDroidVariable);
        }
        return this.f10638a.size() > 0;
    }

    /* renamed from: H */
    public synchronized void mo27974H() {
        new C4065a().start();
    }

    /* renamed from: J */
    public void mo27975J(C4068u1 u1Var) {
        this.f10640c.remove(u1Var);
    }

    /* renamed from: K */
    public void mo27976K(String str) {
        this.f10638a.remove(str);
        mo27974H();
    }

    /* renamed from: L */
    public void mo27977L() {
        for (MacroDroidVariable next : this.f10638a.values()) {
            next.mo27767l0(VariableValue.createForType(next.mo27743S()), false, (VariableValue) null, (Macro) null);
        }
    }

    /* renamed from: M */
    public void mo27978M(C4068u1 u1Var) {
        this.f10639b = u1Var;
    }

    /* renamed from: N */
    public void mo27979N(List<MacroDroidVariable> list) {
        this.f10638a.clear();
        for (MacroDroidVariable next : list) {
            this.f10638a.put(next.getName(), next);
        }
    }

    /* renamed from: P */
    public void mo27980P(MacroDroidVariable macroDroidVariable, VariableValue variableValue, boolean z, Macro macro) {
        VariableValue variableValue2;
        VariableValue.DictionaryEntry R = macroDroidVariable.mo27742R(variableValue.getParentKeys(), true);
        if (R != null) {
            variableValue2 = R.getVariable();
        } else {
            variableValue2 = macroDroidVariable.mo27746V();
        }
        if (!macroDroidVariable.mo27746V().equals(variableValue)) {
            macroDroidVariable.mo27767l0(variableValue, z, variableValue2, macro);
            mo27974H();
            C4068u1 u1Var = this.f10639b;
            if (u1Var != null) {
                u1Var.mo27212v(macroDroidVariable, variableValue, variableValue2, 0);
            }
            for (C4068u1 v : this.f10640c) {
                v.mo27212v(macroDroidVariable, variableValue, variableValue2, 0);
            }
        }
    }

    /* renamed from: Q */
    public void mo27981Q(MacroDroidVariable macroDroidVariable, String str) {
        String name = macroDroidVariable.getName();
        macroDroidVariable.mo27765k0(str);
        this.f10638a.remove(name);
        this.f10638a.put(str, macroDroidVariable);
        mo27974H();
    }

    /* renamed from: e */
    public void mo27982e(C4068u1 u1Var) {
        this.f10640c.add(u1Var);
    }

    /* renamed from: f */
    public void mo27983f(MacroDroidVariable macroDroidVariable) {
        this.f10638a.put(macroDroidVariable.getName(), macroDroidVariable);
        mo27974H();
    }

    /* renamed from: h */
    public void mo27984h() {
        this.f10638a.clear();
        mo27974H();
    }

    /* renamed from: j */
    public List<MacroDroidVariable> mo27985j() {
        ArrayList arrayList = new ArrayList();
        for (MacroDroidVariable next : this.f10638a.values()) {
            if (next.mo27743S() == 0) {
                arrayList.add(next);
            }
        }
        return m16040O(arrayList);
    }

    /* renamed from: k */
    public List<MacroDroidVariable> mo27986k() {
        ArrayList arrayList = new ArrayList();
        for (MacroDroidVariable next : this.f10638a.values()) {
            if (next.mo27743S() == 3) {
                arrayList.add(next);
            }
        }
        return m16040O(arrayList);
    }

    /* renamed from: l */
    public List<MacroDroidVariable> mo27987l() {
        ArrayList arrayList = new ArrayList();
        for (MacroDroidVariable next : this.f10638a.values()) {
            if (next.mo27743S() == 5 || next.mo27743S() == 4) {
                arrayList.add(next);
            }
        }
        return m16040O(arrayList);
    }

    /* renamed from: m */
    public List<MacroDroidVariable> mo27988m() {
        ArrayList arrayList = new ArrayList();
        for (MacroDroidVariable next : this.f10638a.values()) {
            if (next.mo27743S() == 4) {
                arrayList.add(next);
            }
        }
        return m16040O(arrayList);
    }

    /* renamed from: n */
    public List<MacroDroidVariable> mo27989n() {
        ArrayList arrayList = new ArrayList();
        for (MacroDroidVariable next : this.f10638a.values()) {
            if (next.mo27743S() == 1) {
                arrayList.add(next);
            }
        }
        return m16040O(arrayList);
    }

    /* renamed from: o */
    public List<MacroDroidVariable> mo27990o() {
        ArrayList arrayList = new ArrayList();
        for (MacroDroidVariable next : this.f10638a.values()) {
            if (next.mo27743S() == 1 || next.mo27743S() == 3) {
                arrayList.add(next);
            }
        }
        return m16040O(arrayList);
    }

    /* renamed from: p */
    public List<MacroDroidVariable> mo27991p() {
        ArrayList arrayList = new ArrayList();
        for (MacroDroidVariable next : this.f10638a.values()) {
            if (next.mo27743S() == 2) {
                arrayList.add(next);
            }
        }
        return m16040O(arrayList);
    }

    /* renamed from: q */
    public List<MacroDroidVariable> mo27992q(Macro macro, boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        for (MacroDroidVariable next : this.f10638a.values()) {
            boolean z3 = false;
            Iterator<Trigger> it = macro.getTriggerList().iterator();
            while (true) {
                z2 = true;
                if (it.hasNext()) {
                    if (m16035D(it.next(), next)) {
                        z3 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            Iterator<Action> it2 = macro.getActions().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (m16035D(it2.next(), next)) {
                        z3 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            Iterator<Constraint> it3 = macro.getConstraints().iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (m16035D(it3.next(), next)) {
                        break;
                    }
                } else {
                    z2 = z3;
                    break;
                }
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        if (z) {
            Collections.sort(arrayList, new C4056s(C5163j2.m19963F0(m16047s())));
        }
        return arrayList;
    }

    /* renamed from: r */
    public List<MacroDroidVariable> mo27993r(boolean z) {
        ArrayList arrayList = new ArrayList(this.f10638a.values());
        if (z) {
            Collections.sort(arrayList, new C4053r(C5163j2.m19963F0(m16047s())));
        }
        return arrayList;
    }

    /* renamed from: u */
    public String mo27994u() {
        try {
            return C10283c.m40413c().mo64004c().mo63984s(mo27993r(true));
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("ERROR - Getting JSON far variable store: " + e.getMessage()));
            return "";
        }
    }

    /* renamed from: v */
    public String mo27995v() {
        try {
            return new String(new AtomicFile(new File(m16047s().getFilesDir(), "variablesAtomic.json")).readFully(), "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: w */
    public MacroDroidVariable mo27996w(String str) {
        return this.f10638a.get(str);
    }
}
