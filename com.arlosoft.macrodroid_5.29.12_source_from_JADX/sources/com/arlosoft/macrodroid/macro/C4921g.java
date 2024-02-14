package com.arlosoft.macrodroid.macro;

import android.content.Context;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.CellTowerConstraint;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.CellTowerTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.util.Set;
import p148q0.C8151a;

/* renamed from: com.arlosoft.macrodroid.macro.g */
/* compiled from: MacroDeserializer */
public class C4921g implements JsonDeserializer<Macro> {

    /* renamed from: a */
    private final boolean f12371a;

    /* renamed from: b */
    private final Context f12372b;

    /* renamed from: c */
    private final boolean f12373c;

    /* renamed from: d */
    private final boolean f12374d;

    /* renamed from: e */
    private final Set<String> f12375e;

    /* renamed from: com.arlosoft.macrodroid.macro.g$a */
    /* compiled from: MacroDeserializer */
    class C4922a extends Thread {

        /* renamed from: a */
        final /* synthetic */ Action f12376a;

        C4922a(Action action) {
            this.f12376a = action;
        }

        public void run() {
            this.f12376a.mo24825a0();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macro.g$b */
    /* compiled from: MacroDeserializer */
    class C4923b extends Thread {

        /* renamed from: a */
        final /* synthetic */ Constraint f12378a;

        C4923b(Constraint constraint) {
            this.f12378a = constraint;
        }

        public void run() {
            this.f12378a.mo24825a0();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macro.g$c */
    /* compiled from: MacroDeserializer */
    class C4924c extends Thread {

        /* renamed from: a */
        final /* synthetic */ Trigger f12380a;

        C4924c(Trigger trigger) {
            this.f12380a = trigger;
        }

        public void run() {
            this.f12380a.mo24825a0();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macro.g$d */
    /* compiled from: MacroDeserializer */
    class C4925d extends Thread {

        /* renamed from: a */
        final /* synthetic */ Trigger f12382a;

        C4925d(Trigger trigger) {
            this.f12382a = trigger;
        }

        public void run() {
            this.f12382a.mo24825a0();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macro.g$e */
    /* compiled from: MacroDeserializer */
    class C4926e extends Thread {

        /* renamed from: a */
        final /* synthetic */ Trigger f12384a;

        C4926e(Trigger trigger) {
            this.f12384a = trigger;
        }

        public void run() {
            this.f12384a.mo24825a0();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.macro.g$f */
    /* compiled from: MacroDeserializer */
    class C4927f extends Thread {

        /* renamed from: a */
        final /* synthetic */ Constraint f12386a;

        C4927f(Constraint constraint) {
            this.f12386a = constraint;
        }

        public void run() {
            this.f12386a.mo24825a0();
        }
    }

    public C4921g(Context context, boolean z, boolean z2, boolean z3) {
        this.f12371a = z;
        this.f12372b = context;
        this.f12373c = z2;
        this.f12374d = z3;
        this.f12375e = C5163j2.m19991J(context);
    }

    /* renamed from: b */
    private static void m18993b(JsonDeserializationContext jsonDeserializationContext, SelectableItem selectableItem, JsonArray jsonArray, boolean z, Macro macro) {
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement q = jsonArray.mo64021q(i);
            String k = q.mo64025h().mo64038q("m_classType").mo64019k();
            try {
                Class<?> cls = Class.forName("com.arlosoft.macrodroid.constraint." + k);
                JsonArray jsonArray2 = (JsonArray) q.mo64025h().mo64038q("m_childConstraints");
                q.mo64025h().mo64040t("m_childConstraints");
                Constraint constraint = (Constraint) jsonDeserializationContext.mo64023b(q, cls);
                constraint.mo24687G2(macro);
                constraint.mo25118d0();
                selectableItem.mo27834R(constraint);
                constraint.mo28119f3(selectableItem.mo27847f1());
                if (z) {
                    new C4927f(constraint).start();
                }
                if (constraint instanceof CellTowerConstraint) {
                    ((CellTowerConstraint) constraint).mo28101j3();
                }
                if (jsonArray2 != null && jsonArray2.size() > 0) {
                    m18993b(jsonDeserializationContext, constraint, jsonArray2, z, macro);
                }
            } catch (Throwable th) {
                C8151a.m33873n(new RuntimeException("Failed to restore constraint: " + th.toString()));
            }
        }
    }

    /* renamed from: d */
    private Trigger m18994d(JsonElement jsonElement, JsonDeserializationContext jsonDeserializationContext) {
        String str;
        JsonElement q = jsonElement.mo64025h().mo64038q("m_secondaryClassType");
        if (q != null) {
            str = q.mo64019k();
        } else {
            str = jsonElement.mo64025h().mo64038q("m_classType").mo64019k();
        }
        try {
            Class<?> cls = Class.forName("com.arlosoft.macrodroid.triggers." + str);
            JsonArray jsonArray = (JsonArray) jsonElement.mo64025h().mo64038q("m_constraintList");
            jsonElement.mo64025h().mo64040t("m_constraintList");
            Trigger trigger = (Trigger) jsonDeserializationContext.mo64023b(jsonElement, cls);
            if (this.f12371a) {
                new C4926e(trigger).start();
            }
            if (trigger instanceof CellTowerTrigger) {
                ((CellTowerTrigger) trigger).mo31045o3();
            }
            return trigger;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013d, code lost:
        r13 = r3;
        r3 = r4;
        r21 = r5;
        r16 = r7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x053e A[Catch:{ all -> 0x057c }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0569 A[Catch:{ all -> 0x057c }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0603  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0612  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.arlosoft.macrodroid.macro.Macro mo29657a(com.google.gson.JsonElement r23, java.lang.reflect.Type r24, com.google.gson.JsonDeserializationContext r25) throws com.google.gson.JsonParseException {
        /*
            r22 = this;
            r1 = r22
            r2 = r25
            java.lang.String r3 = "mClassLoader"
            java.lang.String r4 = "triggersToWaitFor"
            java.lang.String r5 = "m_childConstraints"
            java.lang.String r6 = ", "
            com.google.gson.JsonObject r0 = r23.mo64025h()
            java.util.Set r7 = r0.entrySet()
            java.util.Iterator r7 = r7.iterator()
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.String r9 = "isActionBlock"
            com.google.gson.JsonElement r10 = r0.mo64038q(r9)
            if (r10 == 0) goto L_0x0036
            com.google.gson.JsonElement r0 = r0.mo64038q(r9)
            boolean r0 = r0.mo64013c()
            if (r0 == 0) goto L_0x0036
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r0 = new com.arlosoft.macrodroid.actionblock.data.ActionBlock
            r0.<init>()
            goto L_0x003b
        L_0x0036:
            com.arlosoft.macrodroid.macro.Macro r0 = new com.arlosoft.macrodroid.macro.Macro
            r0.<init>()
        L_0x003b:
            r9 = r0
            java.lang.Object r0 = r8.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r11 = r8
            r12 = 0
            r8 = r0
        L_0x0045:
            if (r8 == 0) goto L_0x061b
            r0 = -1
            int r13 = r8.hashCode()     // Catch:{ all -> 0x05d2 }
            java.lang.String r14 = "m_constraintList"
            switch(r13) {
                case -1707153844: goto L_0x011a;
                case -1658969948: goto L_0x010f;
                case -1290009060: goto L_0x0104;
                case -1084456165: goto L_0x00fa;
                case -1083281635: goto L_0x00f0;
                case -603790689: goto L_0x00e5;
                case -521475539: goto L_0x00dd;
                case -169912570: goto L_0x00d3;
                case 32220970: goto L_0x00c7;
                case 195893392: goto L_0x00bc;
                case 284390675: goto L_0x00b0;
                case 439889271: goto L_0x00a4;
                case 741954969: goto L_0x0098;
                case 1075577252: goto L_0x008d;
                case 1304589679: goto L_0x0082;
                case 1537743516: goto L_0x0076;
                case 1854291942: goto L_0x006b;
                case 1947219929: goto L_0x005f;
                case 2088512079: goto L_0x0053;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x0130
        L_0x0053:
            java.lang.String r13 = "exportedActionBlocks"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 17
            goto L_0x0130
        L_0x005f:
            java.lang.String r13 = "isBeingImported"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 18
            goto L_0x0130
        L_0x006b:
            java.lang.String r13 = "m_trigger"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 2
            goto L_0x0130
        L_0x0076:
            java.lang.String r13 = "m_isOrCondition"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 8
            goto L_0x0130
        L_0x0082:
            java.lang.String r13 = "m_enabled"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 5
            goto L_0x0130
        L_0x008d:
            java.lang.String r13 = "m_triggerList"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 3
            goto L_0x0130
        L_0x0098:
            java.lang.String r13 = "isInputExpanded"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 14
            goto L_0x0130
        L_0x00a4:
            java.lang.String r13 = "lastEditedTimestamp"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 13
            goto L_0x0130
        L_0x00b0:
            java.lang.String r13 = "m_headingColor"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 10
            goto L_0x0130
        L_0x00bc:
            java.lang.String r13 = "m_category"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 7
            goto L_0x0130
        L_0x00c7:
            java.lang.String r13 = "m_description"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 9
            goto L_0x0130
        L_0x00d3:
            java.lang.String r13 = "m_actionList"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 0
            goto L_0x0130
        L_0x00dd:
            boolean r13 = r8.equals(r14)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 1
            goto L_0x0130
        L_0x00e5:
            java.lang.String r13 = "isFavourite"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 12
            goto L_0x0130
        L_0x00f0:
            java.lang.String r13 = "m_name"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 4
            goto L_0x0130
        L_0x00fa:
            java.lang.String r13 = "m_GUID"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 6
            goto L_0x0130
        L_0x0104:
            java.lang.String r13 = "m_excludeLog"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 11
            goto L_0x0130
        L_0x010f:
            java.lang.String r13 = "isOutputExpanded"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 15
            goto L_0x0130
        L_0x011a:
            java.lang.String r13 = "localVariables"
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0125 }
            if (r13 == 0) goto L_0x0130
            r0 = 16
            goto L_0x0130
        L_0x0125:
            r0 = move-exception
        L_0x0126:
            r13 = r3
            r3 = r4
            r21 = r5
            r16 = r7
            r17 = r8
            goto L_0x05dd
        L_0x0130:
            java.lang.String r13 = "Failed to restore trigger: "
            java.lang.String r15 = "com.arlosoft.macrodroid.triggers."
            java.lang.String r10 = "m_secondaryClassType"
            r24 = r12
            java.lang.String r12 = "m_classType"
            switch(r0) {
                case 0: goto L_0x0476;
                case 1: goto L_0x03c3;
                case 2: goto L_0x034a;
                case 3: goto L_0x026a;
                case 4: goto L_0x0256;
                case 5: goto L_0x0241;
                case 6: goto L_0x0232;
                case 7: goto L_0x0223;
                case 8: goto L_0x0214;
                case 9: goto L_0x0205;
                case 10: goto L_0x01f6;
                case 11: goto L_0x01e7;
                case 12: goto L_0x01d8;
                case 13: goto L_0x01c9;
                case 14: goto L_0x01b7;
                case 15: goto L_0x01a6;
                case 16: goto L_0x017f;
                case 17: goto L_0x0153;
                case 18: goto L_0x0145;
                default: goto L_0x013d;
            }
        L_0x013d:
            r13 = r3
            r3 = r4
            r21 = r5
            r16 = r7
            goto L_0x05cf
        L_0x0145:
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x0265 }
            boolean r0 = r0.mo64013c()     // Catch:{ all -> 0x0265 }
            r9.setIsBeingImported(r0)     // Catch:{ all -> 0x0265 }
            goto L_0x013d
        L_0x0153:
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonArray r0 = r0.mo64024f()     // Catch:{ all -> 0x0265 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0265 }
            r10.<init>()     // Catch:{ all -> 0x0265 }
            r12 = 0
        L_0x0163:
            int r13 = r0.size()     // Catch:{ all -> 0x0265 }
            if (r12 >= r13) goto L_0x017b
            com.google.gson.JsonElement r13 = r0.mo64021q(r12)     // Catch:{ all -> 0x0265 }
            java.lang.Class<com.arlosoft.macrodroid.actionblock.data.ActionBlock> r14 = com.arlosoft.macrodroid.actionblock.data.ActionBlock.class
            java.lang.Object r13 = r2.mo64023b(r13, r14)     // Catch:{ all -> 0x0265 }
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r13 = (com.arlosoft.macrodroid.actionblock.data.ActionBlock) r13     // Catch:{ all -> 0x0265 }
            r10.add(r13)     // Catch:{ all -> 0x0265 }
            int r12 = r12 + 1
            goto L_0x0163
        L_0x017b:
            r9.setActionBlocksToImport(r10)     // Catch:{ all -> 0x0265 }
            goto L_0x013d
        L_0x017f:
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonArray r0 = r0.mo64024f()     // Catch:{ all -> 0x0265 }
            r10 = 0
        L_0x018a:
            int r12 = r0.size()     // Catch:{ all -> 0x0265 }
            if (r10 >= r12) goto L_0x013d
            com.google.gson.JsonElement r12 = r0.mo64021q(r10)     // Catch:{ all -> 0x0265 }
            java.lang.Class<com.arlosoft.macrodroid.common.MacroDroidVariable> r13 = com.arlosoft.macrodroid.common.MacroDroidVariable.class
            java.lang.Object r12 = r2.mo64023b(r12, r13)     // Catch:{ all -> 0x0265 }
            com.arlosoft.macrodroid.common.MacroDroidVariable r12 = (com.arlosoft.macrodroid.common.MacroDroidVariable) r12     // Catch:{ all -> 0x0265 }
            java.util.List r13 = r9.getLocalVariables()     // Catch:{ all -> 0x0265 }
            r13.add(r12)     // Catch:{ all -> 0x0265 }
            int r10 = r10 + 1
            goto L_0x018a
        L_0x01a6:
            r0 = r9
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r0 = (com.arlosoft.macrodroid.actionblock.data.ActionBlock) r0     // Catch:{ all -> 0x0265 }
            java.lang.Object r10 = r11.getValue()     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonElement r10 = (com.google.gson.JsonElement) r10     // Catch:{ all -> 0x0265 }
            boolean r10 = r10.mo64013c()     // Catch:{ all -> 0x0265 }
            r0.setOutputExpanded(r10)     // Catch:{ all -> 0x0265 }
            goto L_0x013d
        L_0x01b7:
            r0 = r9
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r0 = (com.arlosoft.macrodroid.actionblock.data.ActionBlock) r0     // Catch:{ all -> 0x0265 }
            java.lang.Object r10 = r11.getValue()     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonElement r10 = (com.google.gson.JsonElement) r10     // Catch:{ all -> 0x0265 }
            boolean r10 = r10.mo64013c()     // Catch:{ all -> 0x0265 }
            r0.setInputExpanded(r10)     // Catch:{ all -> 0x0265 }
            goto L_0x013d
        L_0x01c9:
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x0265 }
            long r12 = r0.mo64018j()     // Catch:{ all -> 0x0265 }
            r9.setLastEditedTimestamp(r12)     // Catch:{ all -> 0x0265 }
            goto L_0x013d
        L_0x01d8:
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x0265 }
            boolean r0 = r0.mo64013c()     // Catch:{ all -> 0x0265 }
            r9.setIsFavourite(r0)     // Catch:{ all -> 0x0265 }
            goto L_0x013d
        L_0x01e7:
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x0265 }
            boolean r0 = r0.mo64013c()     // Catch:{ all -> 0x0265 }
            r9.setExcludeFromLog(r0)     // Catch:{ all -> 0x0265 }
            goto L_0x013d
        L_0x01f6:
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x0265 }
            int r0 = r0.mo64014d()     // Catch:{ all -> 0x0265 }
            r9.setHeadingColor(r0)     // Catch:{ all -> 0x0265 }
            goto L_0x013d
        L_0x0205:
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x0265 }
            java.lang.String r0 = r0.mo64019k()     // Catch:{ all -> 0x0265 }
            r9.setDescription(r0)     // Catch:{ all -> 0x0265 }
            goto L_0x013d
        L_0x0214:
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x0265 }
            boolean r0 = r0.mo64013c()     // Catch:{ all -> 0x0265 }
            r9.setConstraintIsOrCondition(r0)     // Catch:{ all -> 0x0265 }
            goto L_0x013d
        L_0x0223:
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x0265 }
            java.lang.String r0 = r0.mo64019k()     // Catch:{ all -> 0x0265 }
            r9.setCategory(r0)     // Catch:{ all -> 0x0265 }
            goto L_0x013d
        L_0x0232:
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x0265 }
            long r12 = r0.mo64018j()     // Catch:{ all -> 0x0265 }
            r9.setGUID(r12)     // Catch:{ all -> 0x0265 }
            goto L_0x013d
        L_0x0241:
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x0265 }
            boolean r12 = r0.mo64013c()     // Catch:{ all -> 0x0265 }
            r9.setEnabledStateDuringLoad(r12)     // Catch:{ all -> 0x0125 }
            r13 = r3
            r3 = r4
            r21 = r5
            r16 = r7
            goto L_0x05fd
        L_0x0256:
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x0265 }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x0265 }
            java.lang.String r0 = r0.mo64019k()     // Catch:{ all -> 0x0265 }
            r9.setName(r0)     // Catch:{ all -> 0x0265 }
            goto L_0x013d
        L_0x0265:
            r0 = move-exception
            r12 = r24
            goto L_0x0126
        L_0x026a:
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x033d }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x033d }
            r16 = r7
            com.google.gson.JsonArray r7 = r0.mo64024f()     // Catch:{ all -> 0x033b }
            r17 = r8
            r8 = 0
        L_0x0279:
            int r0 = r7.size()     // Catch:{ all -> 0x0339 }
            if (r8 >= r0) goto L_0x0333
            com.google.gson.JsonElement r0 = r7.mo64021q(r8)     // Catch:{ all -> 0x0339 }
            r18 = r7
            com.google.gson.JsonObject r7 = r0.mo64025h()     // Catch:{ all -> 0x0339 }
            com.google.gson.JsonElement r7 = r7.mo64038q(r10)     // Catch:{ all -> 0x0339 }
            if (r7 == 0) goto L_0x0296
            java.lang.String r7 = r7.mo64019k()     // Catch:{ all -> 0x0339 }
        L_0x0293:
            r19 = r4
            goto L_0x02a3
        L_0x0296:
            com.google.gson.JsonObject r7 = r0.mo64025h()     // Catch:{ all -> 0x0339 }
            com.google.gson.JsonElement r7 = r7.mo64038q(r12)     // Catch:{ all -> 0x0339 }
            java.lang.String r7 = r7.mo64019k()     // Catch:{ all -> 0x0339 }
            goto L_0x0293
        L_0x02a3:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0301 }
            r4.<init>()     // Catch:{ all -> 0x0301 }
            r4.append(r15)     // Catch:{ all -> 0x0301 }
            r4.append(r7)     // Catch:{ all -> 0x0301 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0301 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0301 }
            r20 = r3
            com.google.gson.JsonObject r3 = r0.mo64025h()     // Catch:{ all -> 0x02ff }
            com.google.gson.JsonElement r3 = r3.mo64038q(r14)     // Catch:{ all -> 0x02ff }
            com.google.gson.JsonArray r3 = (com.google.gson.JsonArray) r3     // Catch:{ all -> 0x02ff }
            r21 = r5
            com.google.gson.JsonObject r5 = r0.mo64025h()     // Catch:{ all -> 0x02fd }
            r5.mo64040t(r14)     // Catch:{ all -> 0x02fd }
            java.lang.Object r0 = r2.mo64023b(r0, r4)     // Catch:{ all -> 0x02fd }
            com.arlosoft.macrodroid.triggers.Trigger r0 = (com.arlosoft.macrodroid.triggers.Trigger) r0     // Catch:{ all -> 0x02fd }
            r9.addTrigger(r0)     // Catch:{ all -> 0x02fd }
            r0.mo24687G2(r9)     // Catch:{ all -> 0x02fd }
            r0.mo25118d0()     // Catch:{ all -> 0x02fd }
            boolean r4 = r1.f12371a     // Catch:{ all -> 0x02fd }
            if (r4 == 0) goto L_0x02e6
            com.arlosoft.macrodroid.macro.g$d r4 = new com.arlosoft.macrodroid.macro.g$d     // Catch:{ all -> 0x02fd }
            r4.<init>(r0)     // Catch:{ all -> 0x02fd }
            r4.start()     // Catch:{ all -> 0x02fd }
        L_0x02e6:
            if (r3 == 0) goto L_0x02f3
            int r4 = r3.size()     // Catch:{ all -> 0x02fd }
            if (r4 <= 0) goto L_0x02f3
            boolean r4 = r1.f12371a     // Catch:{ all -> 0x02fd }
            m18993b(r2, r0, r3, r4, r9)     // Catch:{ all -> 0x02fd }
        L_0x02f3:
            boolean r3 = r0 instanceof com.arlosoft.macrodroid.triggers.CellTowerTrigger     // Catch:{ all -> 0x02fd }
            if (r3 == 0) goto L_0x0327
            com.arlosoft.macrodroid.triggers.CellTowerTrigger r0 = (com.arlosoft.macrodroid.triggers.CellTowerTrigger) r0     // Catch:{ all -> 0x02fd }
            r0.mo31045o3()     // Catch:{ all -> 0x02fd }
            goto L_0x0327
        L_0x02fd:
            r0 = move-exception
            goto L_0x0306
        L_0x02ff:
            r0 = move-exception
            goto L_0x0304
        L_0x0301:
            r0 = move-exception
            r20 = r3
        L_0x0304:
            r21 = r5
        L_0x0306:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x046d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x046d }
            r4.<init>()     // Catch:{ all -> 0x046d }
            r4.append(r13)     // Catch:{ all -> 0x046d }
            r4.append(r7)     // Catch:{ all -> 0x046d }
            r4.append(r6)     // Catch:{ all -> 0x046d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x046d }
            r4.append(r0)     // Catch:{ all -> 0x046d }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x046d }
            r3.<init>(r0)     // Catch:{ all -> 0x046d }
            p148q0.C8151a.m33873n(r3)     // Catch:{ all -> 0x046d }
        L_0x0327:
            int r8 = r8 + 1
            r7 = r18
            r4 = r19
            r3 = r20
            r5 = r21
            goto L_0x0279
        L_0x0333:
            r13 = r3
            r3 = r4
            r21 = r5
            goto L_0x05cf
        L_0x0339:
            r0 = move-exception
            goto L_0x0342
        L_0x033b:
            r0 = move-exception
            goto L_0x0340
        L_0x033d:
            r0 = move-exception
            r16 = r7
        L_0x0340:
            r17 = r8
        L_0x0342:
            r12 = r24
            r13 = r3
            r3 = r4
            r21 = r5
            goto L_0x05dd
        L_0x034a:
            r20 = r3
            r19 = r4
            r21 = r5
            r16 = r7
            r17 = r8
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x046d }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x046d }
            com.google.gson.JsonObject r3 = r0.mo64025h()     // Catch:{ all -> 0x046d }
            com.google.gson.JsonElement r3 = r3.mo64038q(r10)     // Catch:{ all -> 0x046d }
            if (r3 == 0) goto L_0x0369
            java.lang.String r3 = r3.mo64019k()     // Catch:{ all -> 0x046d }
            goto L_0x0375
        L_0x0369:
            com.google.gson.JsonObject r3 = r0.mo64025h()     // Catch:{ all -> 0x046d }
            com.google.gson.JsonElement r3 = r3.mo64038q(r12)     // Catch:{ all -> 0x046d }
            java.lang.String r3 = r3.mo64019k()     // Catch:{ all -> 0x046d }
        L_0x0375:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a5 }
            r4.<init>()     // Catch:{ all -> 0x03a5 }
            r4.append(r15)     // Catch:{ all -> 0x03a5 }
            r4.append(r3)     // Catch:{ all -> 0x03a5 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x03a5 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x03a5 }
            java.lang.Object r0 = r2.mo64023b(r0, r3)     // Catch:{ all -> 0x03a5 }
            com.arlosoft.macrodroid.triggers.Trigger r0 = (com.arlosoft.macrodroid.triggers.Trigger) r0     // Catch:{ all -> 0x03a5 }
            r9.setTrigger(r0)     // Catch:{ all -> 0x03a5 }
            r0.mo24687G2(r9)     // Catch:{ all -> 0x03a5 }
            r0.mo25118d0()     // Catch:{ all -> 0x03a5 }
            boolean r3 = r1.f12371a     // Catch:{ all -> 0x03a5 }
            if (r3 == 0) goto L_0x05c0
            com.arlosoft.macrodroid.macro.g$c r3 = new com.arlosoft.macrodroid.macro.g$c     // Catch:{ all -> 0x03a5 }
            r3.<init>(r0)     // Catch:{ all -> 0x03a5 }
            r3.start()     // Catch:{ all -> 0x03a5 }
            goto L_0x05c0
        L_0x03a5:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x046d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x046d }
            r4.<init>()     // Catch:{ all -> 0x046d }
            r4.append(r13)     // Catch:{ all -> 0x046d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x046d }
            r4.append(r0)     // Catch:{ all -> 0x046d }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x046d }
            r3.<init>(r0)     // Catch:{ all -> 0x046d }
            p148q0.C8151a.m33873n(r3)     // Catch:{ all -> 0x046d }
            goto L_0x05c0
        L_0x03c3:
            r20 = r3
            r19 = r4
            r21 = r5
            r16 = r7
            r17 = r8
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x046d }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x046d }
            com.google.gson.JsonArray r3 = r0.mo64024f()     // Catch:{ all -> 0x046d }
            r4 = 0
        L_0x03d8:
            int r0 = r3.size()     // Catch:{ all -> 0x046d }
            if (r4 >= r0) goto L_0x05c0
            com.google.gson.JsonElement r0 = r3.mo64021q(r4)     // Catch:{ all -> 0x046d }
            com.google.gson.JsonObject r5 = r0.mo64025h()     // Catch:{ all -> 0x046d }
            com.google.gson.JsonElement r5 = r5.mo64038q(r12)     // Catch:{ all -> 0x046d }
            java.lang.String r5 = r5.mo64019k()     // Catch:{ all -> 0x046d }
            com.google.gson.JsonObject r7 = r0.mo64025h()     // Catch:{ all -> 0x046d }
            r8 = r21
            com.google.gson.JsonElement r7 = r7.mo64038q(r8)     // Catch:{ all -> 0x04a3 }
            com.google.gson.JsonArray r7 = (com.google.gson.JsonArray) r7     // Catch:{ all -> 0x04a3 }
            com.google.gson.JsonObject r10 = r0.mo64025h()     // Catch:{ all -> 0x04a3 }
            r10.mo64040t(r8)     // Catch:{ all -> 0x04a3 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0449 }
            r10.<init>()     // Catch:{ all -> 0x0449 }
            java.lang.String r13 = "com.arlosoft.macrodroid.constraint."
            r10.append(r13)     // Catch:{ all -> 0x0449 }
            r10.append(r5)     // Catch:{ all -> 0x0449 }
            java.lang.String r5 = r10.toString()     // Catch:{ all -> 0x0449 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0449 }
            java.lang.Object r0 = r2.mo64023b(r0, r5)     // Catch:{ all -> 0x0449 }
            com.arlosoft.macrodroid.constraint.Constraint r0 = (com.arlosoft.macrodroid.constraint.Constraint) r0     // Catch:{ all -> 0x0449 }
            r9.addConstraint(r0)     // Catch:{ all -> 0x0449 }
            r0.mo24687G2(r9)     // Catch:{ all -> 0x0449 }
            r0.mo25118d0()     // Catch:{ all -> 0x0449 }
            boolean r5 = r1.f12371a     // Catch:{ all -> 0x0449 }
            if (r5 == 0) goto L_0x0431
            com.arlosoft.macrodroid.macro.g$b r5 = new com.arlosoft.macrodroid.macro.g$b     // Catch:{ all -> 0x0449 }
            r5.<init>(r0)     // Catch:{ all -> 0x0449 }
            r5.start()     // Catch:{ all -> 0x0449 }
        L_0x0431:
            boolean r5 = r0 instanceof com.arlosoft.macrodroid.constraint.CellTowerConstraint     // Catch:{ all -> 0x0449 }
            if (r5 == 0) goto L_0x043b
            r5 = r0
            com.arlosoft.macrodroid.constraint.CellTowerConstraint r5 = (com.arlosoft.macrodroid.constraint.CellTowerConstraint) r5     // Catch:{ all -> 0x0449 }
            r5.mo28101j3()     // Catch:{ all -> 0x0449 }
        L_0x043b:
            if (r7 == 0) goto L_0x0467
            int r5 = r7.size()     // Catch:{ all -> 0x0449 }
            if (r5 <= 0) goto L_0x0467
            boolean r5 = r1.f12371a     // Catch:{ all -> 0x0449 }
            m18993b(r2, r0, r7, r5, r9)     // Catch:{ all -> 0x0449 }
            goto L_0x0467
        L_0x0449:
            r0 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x04a3 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x04a3 }
            r7.<init>()     // Catch:{ all -> 0x04a3 }
            java.lang.String r10 = "Failed to restore constraint: "
            r7.append(r10)     // Catch:{ all -> 0x04a3 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x04a3 }
            r7.append(r0)     // Catch:{ all -> 0x04a3 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x04a3 }
            r5.<init>(r0)     // Catch:{ all -> 0x04a3 }
            p148q0.C8151a.m33873n(r5)     // Catch:{ all -> 0x04a3 }
        L_0x0467:
            int r4 = r4 + 1
            r21 = r8
            goto L_0x03d8
        L_0x046d:
            r0 = move-exception
            r12 = r24
        L_0x0470:
            r3 = r19
            r13 = r20
            goto L_0x05dd
        L_0x0476:
            r20 = r3
            r19 = r4
            r16 = r7
            r17 = r8
            r8 = r5
            java.lang.Object r0 = r11.getValue()     // Catch:{ all -> 0x05c5 }
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0     // Catch:{ all -> 0x05c5 }
            com.google.gson.JsonArray r3 = r0.mo64024f()     // Catch:{ all -> 0x05c5 }
            r4 = 0
        L_0x048a:
            int r0 = r3.size()     // Catch:{ all -> 0x05c5 }
            if (r4 >= r0) goto L_0x05be
            com.google.gson.JsonElement r0 = r3.mo64021q(r4)     // Catch:{ all -> 0x05c5 }
            com.google.gson.JsonObject r5 = r0.mo64025h()     // Catch:{ all -> 0x05c5 }
            com.google.gson.JsonElement r5 = r5.mo64038q(r10)     // Catch:{ all -> 0x05c5 }
            if (r5 == 0) goto L_0x04a9
            java.lang.String r5 = r5.mo64019k()     // Catch:{ all -> 0x04a3 }
            goto L_0x04b5
        L_0x04a3:
            r0 = move-exception
            r12 = r24
            r21 = r8
            goto L_0x0470
        L_0x04a9:
            com.google.gson.JsonObject r5 = r0.mo64025h()     // Catch:{ all -> 0x05c5 }
            com.google.gson.JsonElement r5 = r5.mo64038q(r12)     // Catch:{ all -> 0x05c5 }
            java.lang.String r5 = r5.mo64019k()     // Catch:{ all -> 0x05c5 }
        L_0x04b5:
            java.lang.String r7 = "SetAutoSync"
            boolean r7 = r5.equals(r7)     // Catch:{ all -> 0x058a }
            if (r7 == 0) goto L_0x04bf
            java.lang.String r5 = "SetAutoSyncAction"
        L_0x04bf:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x058a }
            r7.<init>()     // Catch:{ all -> 0x058a }
            java.lang.String r13 = "com.arlosoft.macrodroid.action."
            r7.append(r13)     // Catch:{ all -> 0x058a }
            r7.append(r5)     // Catch:{ all -> 0x058a }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x058a }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x058a }
            com.google.gson.JsonObject r7 = r0.mo64025h()     // Catch:{ all -> 0x058a }
            java.lang.String r13 = "m_intent"
            com.google.gson.JsonElement r7 = r7.mo64038q(r13)     // Catch:{ all -> 0x058a }
            com.google.gson.JsonObject r7 = (com.google.gson.JsonObject) r7     // Catch:{ all -> 0x058a }
            if (r7 == 0) goto L_0x0501
            com.google.gson.JsonObject r7 = r7.mo64025h()     // Catch:{ all -> 0x04fc }
            java.lang.String r13 = "mExtras"
            com.google.gson.JsonElement r7 = r7.mo64038q(r13)     // Catch:{ all -> 0x04fc }
            com.google.gson.JsonObject r7 = (com.google.gson.JsonObject) r7     // Catch:{ all -> 0x04fc }
            if (r7 == 0) goto L_0x0501
            r13 = r20
            com.google.gson.JsonElement r15 = r7.mo64038q(r13)     // Catch:{ all -> 0x0582 }
            if (r15 == 0) goto L_0x0503
            r7.mo64040t(r13)     // Catch:{ all -> 0x0582 }
            goto L_0x0503
        L_0x04fc:
            r0 = move-exception
            r13 = r20
            goto L_0x0583
        L_0x0501:
            r13 = r20
        L_0x0503:
            com.google.gson.JsonObject r7 = r0.mo64025h()     // Catch:{ all -> 0x0582 }
            com.google.gson.JsonElement r7 = r7.mo64038q(r14)     // Catch:{ all -> 0x0582 }
            com.google.gson.JsonArray r7 = (com.google.gson.JsonArray) r7     // Catch:{ all -> 0x0582 }
            com.google.gson.JsonObject r15 = r0.mo64025h()     // Catch:{ all -> 0x0582 }
            r18 = r3
            r3 = r19
            com.google.gson.JsonElement r15 = r15.mo64038q(r3)     // Catch:{ all -> 0x057e }
            com.google.gson.JsonArray r15 = (com.google.gson.JsonArray) r15     // Catch:{ all -> 0x057e }
            r21 = r8
            com.google.gson.JsonObject r8 = r0.mo64025h()     // Catch:{ all -> 0x057c }
            r8.mo64040t(r14)     // Catch:{ all -> 0x057c }
            com.google.gson.JsonObject r8 = r0.mo64025h()     // Catch:{ all -> 0x057c }
            r8.mo64040t(r3)     // Catch:{ all -> 0x057c }
            java.lang.Object r0 = r2.mo64023b(r0, r5)     // Catch:{ all -> 0x057c }
            com.arlosoft.macrodroid.action.Action r0 = (com.arlosoft.macrodroid.action.Action) r0     // Catch:{ all -> 0x057c }
            r9.addAction(r0)     // Catch:{ all -> 0x057c }
            r0.mo24687G2(r9)     // Catch:{ all -> 0x057c }
            r0.mo25118d0()     // Catch:{ all -> 0x057c }
            boolean r5 = r1.f12371a     // Catch:{ all -> 0x057c }
            if (r5 == 0) goto L_0x0546
            com.arlosoft.macrodroid.macro.g$a r5 = new com.arlosoft.macrodroid.macro.g$a     // Catch:{ all -> 0x057c }
            r5.<init>(r0)     // Catch:{ all -> 0x057c }
            r5.start()     // Catch:{ all -> 0x057c }
        L_0x0546:
            if (r7 == 0) goto L_0x0553
            int r5 = r7.size()     // Catch:{ all -> 0x057c }
            if (r5 <= 0) goto L_0x0553
            boolean r5 = r1.f12371a     // Catch:{ all -> 0x057c }
            m18993b(r2, r0, r7, r5, r9)     // Catch:{ all -> 0x057c }
        L_0x0553:
            if (r15 == 0) goto L_0x05b0
            int r5 = r15.size()     // Catch:{ all -> 0x057c }
            if (r5 <= 0) goto L_0x05b0
            boolean r5 = r0 instanceof com.arlosoft.macrodroid.action.WaitUntilTriggerAction     // Catch:{ all -> 0x057c }
            if (r5 == 0) goto L_0x05b0
            java.util.Iterator r5 = r15.iterator()     // Catch:{ all -> 0x057c }
        L_0x0563:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x057c }
            if (r7 == 0) goto L_0x05b0
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x057c }
            com.google.gson.JsonElement r7 = (com.google.gson.JsonElement) r7     // Catch:{ all -> 0x057c }
            com.arlosoft.macrodroid.triggers.Trigger r7 = r1.m18994d(r7, r2)     // Catch:{ all -> 0x057c }
            if (r7 == 0) goto L_0x0563
            r8 = r0
            com.arlosoft.macrodroid.action.WaitUntilTriggerAction r8 = (com.arlosoft.macrodroid.action.WaitUntilTriggerAction) r8     // Catch:{ all -> 0x057c }
            r8.mo26120p3(r7)     // Catch:{ all -> 0x057c }
            goto L_0x0563
        L_0x057c:
            r0 = move-exception
            goto L_0x0593
        L_0x057e:
            r0 = move-exception
            r21 = r8
            goto L_0x0593
        L_0x0582:
            r0 = move-exception
        L_0x0583:
            r18 = r3
            r21 = r8
            r3 = r19
            goto L_0x0593
        L_0x058a:
            r0 = move-exception
            r18 = r3
            r21 = r8
            r3 = r19
            r13 = r20
        L_0x0593:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x05bc }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x05bc }
            r7.<init>()     // Catch:{ all -> 0x05bc }
            java.lang.String r8 = "Failed to restore action: "
            r7.append(r8)     // Catch:{ all -> 0x05bc }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x05bc }
            r7.append(r0)     // Catch:{ all -> 0x05bc }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x05bc }
            r5.<init>(r0)     // Catch:{ all -> 0x05bc }
            p148q0.C8151a.m33873n(r5)     // Catch:{ all -> 0x05bc }
        L_0x05b0:
            int r4 = r4 + 1
            r19 = r3
            r20 = r13
            r3 = r18
            r8 = r21
            goto L_0x048a
        L_0x05bc:
            r0 = move-exception
            goto L_0x05cc
        L_0x05be:
            r21 = r8
        L_0x05c0:
            r3 = r19
            r13 = r20
            goto L_0x05cf
        L_0x05c5:
            r0 = move-exception
            r21 = r8
            r3 = r19
            r13 = r20
        L_0x05cc:
            r12 = r24
            goto L_0x05dd
        L_0x05cf:
            r12 = r24
            goto L_0x05fd
        L_0x05d2:
            r0 = move-exception
            r13 = r3
            r3 = r4
            r21 = r5
            r16 = r7
            r17 = r8
            r24 = r12
        L_0x05dd:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to restore: "
            r4.append(r5)
            r5 = r17
            r4.append(r5)
            r4.append(r6)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
        L_0x05fd:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0612
            java.lang.Object r0 = r16.next()
            r11 = r0
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r0 = r11.getKey()
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0613
        L_0x0612:
            r8 = 0
        L_0x0613:
            r4 = r3
            r3 = r13
            r7 = r16
            r5 = r21
            goto L_0x0045
        L_0x061b:
            r24 = r12
            boolean r0 = r1.f12373c
            if (r0 == 0) goto L_0x0675
            java.util.Set<java.lang.String> r0 = r1.f12375e
            java.lang.String r2 = r9.getCategory()
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0670
            boolean r0 = r1.f12374d
            if (r0 == 0) goto L_0x0637
            r12 = r24
            r9.setEnabledFlag(r12)
            goto L_0x0675
        L_0x0637:
            r12 = r24
            r9.setEnabled(r12)     // Catch:{ Exception -> 0x063d }
            goto L_0x0675
        L_0x063d:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Could not enable macro: "
            r0.append(r3)
            java.lang.String r3 = r9.getName()
            r0.append(r3)
            java.lang.String r3 = " ("
            r0.append(r3)
            java.lang.String r3 = r2.toString()
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            p148q0.C8151a.m33873n(r2)
            r2 = 0
            r9.setEnabled(r2)     // Catch:{ Exception -> 0x0675 }
            goto L_0x0675
        L_0x0670:
            r12 = r24
            r9.setEnabledFlag(r12)
        L_0x0675:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.macro.C4921g.mo29657a(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext):com.arlosoft.macrodroid.macro.Macro");
    }
}
