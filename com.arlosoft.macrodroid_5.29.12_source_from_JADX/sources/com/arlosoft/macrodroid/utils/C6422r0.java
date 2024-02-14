package com.arlosoft.macrodroid.utils;

import android.app.Activity;
import android.content.Intent;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4915a;
import com.arlosoft.macrodroid.macro.Macro;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15159j;
import org.apache.commons.cli.HelpFormatter;
import p172u1.C10283c;
import p190x3.C10378a;
import p215b8.C11102b;
import p319lc.C15626c;
import p440y9.C16971a;

/* renamed from: com.arlosoft.macrodroid.utils.r0 */
/* compiled from: MacroUtils.kt */
public final class C6422r0 {

    /* renamed from: a */
    public static final C6422r0 f15045a = new C6422r0();

    private C6422r0() {
    }

    /* renamed from: c */
    private final String m24729c(Macro macro) {
        String s = C10283c.m40416f().mo63984s(macro);
        C13706o.m87928e(s, "gson.toJson(macro)");
        return s;
    }

    /* renamed from: d */
    public static final void m24730d(Activity activity, Macro macro, C4915a aVar) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(macro, "macro");
        C13706o.m87929f(aVar, "actionBlockStore");
        new C11102b((FragmentActivity) activity).mo62231o("android.permission.WRITE_EXTERNAL_STORAGE").mo79679I(C16971a.m100210a()).mo79685P(new C6419q0(activity, macro, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m24731e(Activity activity, Macro macro, C4915a aVar, boolean z) {
        C13706o.m87929f(activity, "$activity");
        C13706o.m87929f(macro, "$macro");
        C13706o.m87929f(aVar, "$actionBlockStore");
        if (z) {
            C6422r0 r0Var = f15045a;
            File filesDir = ((FragmentActivity) activity).getFilesDir();
            C13706o.m87928e(filesDir, "activity.filesDir");
            File b = r0Var.mo32452b(filesDir, macro, aVar);
            if (b != null) {
                ArrayList arrayList = new ArrayList();
                C10378a aVar2 = C10378a.f23596a;
                MacroDroidApplication a = aVar2.mo41059a();
                arrayList.add(FileProvider.getUriForFile(a, aVar2.mo41059a().getPackageName() + ".provider", b));
                Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
                intent.addFlags(268435456);
                intent.setType("text/plain");
                try {
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    activity.startActivity(Intent.createChooser(intent, activity.getString(C17541R$string.menu_share)));
                } catch (Exception e) {
                    C15626c.makeText(activity.getApplicationContext(), C17541R$string.export_failed, 0).show();
                    C4878b.m18868g("Failed to export file: " + e);
                }
            }
        }
    }

    /* renamed from: f */
    private final String m24732f(String str) {
        return new C15159j("[\\\\/:*?\"<>|]").mo74469d(C15176v.m93629D(str, ' ', '_', false, 4, (Object) null), HelpFormatter.DEFAULT_OPT_PREFIX);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fc  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File mo32452b(java.io.File r6, com.arlosoft.macrodroid.macro.Macro r7, com.arlosoft.macrodroid.macro.C4915a r8) {
        /*
            r5 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.C13706o.m87929f(r6, r0)
            java.lang.String r0 = "macro"
            kotlin.jvm.internal.C13706o.m87929f(r7, r0)
            java.lang.String r0 = "actionBlockStore"
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = r7.getActions()
            java.util.Iterator r1 = r1.iterator()
        L_0x001c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0064
            java.lang.Object r2 = r1.next()
            com.arlosoft.macrodroid.action.Action r2 = (com.arlosoft.macrodroid.action.Action) r2
            boolean r3 = r2 instanceof com.arlosoft.macrodroid.action.ActionBlockAction
            if (r3 == 0) goto L_0x003c
            com.arlosoft.macrodroid.action.ActionBlockAction r2 = (com.arlosoft.macrodroid.action.ActionBlockAction) r2
            long r2 = r2.mo24715x3()
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r2 = r8.mo29649g(r2)
            if (r2 == 0) goto L_0x001c
            r0.add(r2)
            goto L_0x001c
        L_0x003c:
            boolean r3 = r2 instanceof p057a2.C2225n
            if (r3 == 0) goto L_0x001c
            a2.n r2 = (p057a2.C2225n) r2
            java.util.List r2 = r2.mo24442i()
            java.util.List r2 = kotlin.collections.C13566b0.m87415P(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x004e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x001c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.arlosoft.macrodroid.actionblock.data.ActionBlock r3 = r8.mo29650h(r3)
            if (r3 == 0) goto L_0x004e
            r0.add(r3)
            goto L_0x004e
        L_0x0064:
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x006d
            r7.initialiseExportedActionBlocks(r8)
        L_0x006d:
            java.lang.String r8 = r5.m24729c(r7)
            java.lang.String r0 = r7.getName()
            java.lang.String r1 = "macro.name"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            java.lang.String r0 = r5.m24732f(r0)
            boolean r1 = r7.isActionBlock
            if (r1 == 0) goto L_0x0085
            java.lang.String r1 = ".ablock"
            goto L_0x0087
        L_0x0085:
            java.lang.String r1 = ".macro"
        L_0x0087:
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r6, r0)
            r6 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00c5, all -> 0x00c0 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00c5, all -> 0x00c0 }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            java.lang.String r3 = "UTF8"
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x00bd, all -> 0x00ba }
            r1.write(r8)     // Catch:{ Exception -> 0x00b8 }
            r1.close()     // Catch:{ Exception -> 0x00b8 }
            r1.close()
            r0.close()
            r7.clearExportedActionBlocks()
            return r2
        L_0x00b8:
            r7 = move-exception
            goto L_0x00c8
        L_0x00ba:
            r7 = move-exception
            r1 = r6
            goto L_0x00c3
        L_0x00bd:
            r7 = move-exception
            r1 = r6
            goto L_0x00c8
        L_0x00c0:
            r7 = move-exception
            r0 = r6
            r1 = r0
        L_0x00c3:
            r6 = r7
            goto L_0x00f5
        L_0x00c5:
            r7 = move-exception
            r0 = r6
            r1 = r0
        L_0x00c8:
            com.google.firebase.crashlytics.FirebaseCrashlytics r8 = com.google.firebase.crashlytics.FirebaseCrashlytics.m6487a()     // Catch:{ all -> 0x00f4 }
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x00f4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f4 }
            r3.<init>()     // Catch:{ all -> 0x00f4 }
            java.lang.String r4 = "Failed to write macro when sharing: "
            r3.append(r4)     // Catch:{ all -> 0x00f4 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x00f4 }
            r3.append(r7)     // Catch:{ all -> 0x00f4 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x00f4 }
            r2.<init>(r7)     // Catch:{ all -> 0x00f4 }
            r8.mo22936d(r2)     // Catch:{ all -> 0x00f4 }
            if (r1 == 0) goto L_0x00ee
            r1.close()
        L_0x00ee:
            if (r0 == 0) goto L_0x00f3
            r0.close()
        L_0x00f3:
            return r6
        L_0x00f4:
            r6 = move-exception
        L_0x00f5:
            if (r1 == 0) goto L_0x00fa
            r1.close()
        L_0x00fa:
            if (r0 == 0) goto L_0x00ff
            r0.close()
        L_0x00ff:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.utils.C6422r0.mo32452b(java.io.File, com.arlosoft.macrodroid.macro.Macro, com.arlosoft.macrodroid.macro.a):java.io.File");
    }
}
