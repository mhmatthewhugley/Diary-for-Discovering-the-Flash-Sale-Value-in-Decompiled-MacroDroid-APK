package com.github.javiersantos.piracychecker.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.android.p023dx.rop.code.RegisterSpec;
import com.github.javiersantos.piracychecker.C6918R;
import com.github.javiersantos.piracychecker.enums.AppType;
import com.github.javiersantos.piracychecker.enums.PirateApp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a<\u0010\u000e\u001a\u0004\u0018\u00010\f*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0001\u001a\u0012\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006H\u0000\u001a\f\u0010\u0011\u001a\u00020\u0006*\u00020\u0000H\u0000\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a\u0016\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002\u001a\f\u0010\u0016\u001a\u00020\u0006*\u00020\u0000H\u0002\u001a\b\u0010\u0017\u001a\u00020\u0006H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u001b\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u001c\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001H\u0002¨\u0006\u001d"}, mo71668d2 = {"Landroid/content/Context;", "", "title", "content", "Landroidx/appcompat/app/AlertDialog;", "a", "", "lpf", "stores", "folders", "apks", "Ljava/util/ArrayList;", "Lcom/github/javiersantos/piracychecker/enums/PirateApp;", "extraApps", "e", "deepCheck", "h", "g", "d", "Landroid/content/Intent;", "intent", "i", "f", "j", "permission", "k", "other", "c", "b", "library_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* compiled from: LibraryUtils.kt */
public final class LibraryUtilsKt {
    /* renamed from: a */
    public static final AlertDialog m26247a(Context context, String str, String str2) {
        C13706o.m87930g(context, "$this$buildUnlicensedDialog");
        C13706o.m87930g(str, "title");
        C13706o.m87930g(str2, "content");
        if (((Activity) (!(context instanceof Activity) ? null : context)) == null || ((Activity) context).isFinishing()) {
            return null;
        }
        return new AlertDialog.Builder(context).setCancelable(false).setTitle((CharSequence) str).setMessage((CharSequence) str2).setPositiveButton((CharSequence) context.getString(C6918R.string.app_unlicensed_close), (DialogInterface.OnClickListener) new LibraryUtilsKt$buildUnlicensedDialog$$inlined$let$lambda$1(context, str, str2)).create();
    }

    /* renamed from: b */
    private static final boolean m26248b(String str, String str2) {
        return C15177w.m93659L(str, str2, true);
    }

    /* renamed from: c */
    private static final boolean m26249c(String str, String str2) {
        return C15176v.m93641v(str, str2, true);
    }

    /* renamed from: d */
    private static final ArrayList<PirateApp> m26250d(ArrayList<PirateApp> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        AppType appType = AppType.PIRATE;
        arrayList2.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "c", "h", "e", "l", "p", "u", "s", ".", "l", "a", "c", "k", "y", "p", "a", "t", "c", "h"}, appType));
        arrayList2.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "d", "i", "m", "o", "n", RegisterSpec.PREFIX, "i", "d", "e", "o", ".", "l", "u", "c", "k", "y", "p", "a", "t", "c", "h", "e", "r"}, appType));
        arrayList2.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "f", "o", "r", "p", "d", "a", ".", "l", "p"}, appType));
        arrayList2.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "a", "n", "d", "r", "o", "i", "d", ".", RegisterSpec.PREFIX, "e", "n", "d", "i", "n", "g", ".", "b", "i", "l", "l", "i", "n", "g", ".", "I", "n", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "p", "p", "B", "i", "l", "l", "i", "n", "g", ExifInterface.LATITUDE_SOUTH, "e", "r", RegisterSpec.PREFIX, "i", "c", "e"}, appType));
        arrayList2.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "a", "n", "d", "r", "o", "i", "d", ".", RegisterSpec.PREFIX, "e", "n", "d", "i", "n", "g", ".", "b", "i", "l", "l", "i", "n", "g", ".", "I", "n", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "p", "p", "B", "i", "l", "l", "i", "n", "g", ExifInterface.LATITUDE_SOUTH, "o", "r", RegisterSpec.PREFIX, "i", "c", "e"}, appType));
        arrayList2.add(new PirateApp("LuckyPatcher", new String[]{"c", "o", "m", ".", "a", "n", "d", "r", "o", "i", "d", ".", RegisterSpec.PREFIX, "e", "n", "d", "i", "n", "c"}, appType));
        arrayList2.add(new PirateApp("UretPatcher", new String[]{"u", "r", "e", "t", ".", "j", "a", "s", "i", ExifInterface.GPS_MEASUREMENT_2D, "1", "6", "9", ".", "p", "a", "t", "c", "h", "e", "r"}, appType));
        arrayList2.add(new PirateApp("UretPatcher", new String[]{"z", "o", "n", "e", ".", "j", "a", "s", "i", ExifInterface.GPS_MEASUREMENT_2D, "1", "6", "9", ".", "u", "r", "e", "t", "p", "a", "t", "c", "h", "e", "r"}, appType));
        arrayList2.add(new PirateApp("ActionLauncherPatcher", new String[]{"p", ".", "j", "a", "s", "i", ExifInterface.GPS_MEASUREMENT_2D, "1", "6", "9", ".", "a", "l", ExifInterface.GPS_MEASUREMENT_3D}, appType));
        arrayList2.add(new PirateApp("Freedom", new String[]{"c", "c", ".", "m", "a", "d", "k", "i", "t", "e", ".", "f", "r", "e", "e", "d", "o", "m"}, appType));
        arrayList2.add(new PirateApp("Freedom", new String[]{"c", "c", ".", "c", "z", ".", "m", "a", "d", "k", "i", "t", "e", ".", "f", "r", "e", "e", "d", "o", "m"}, appType));
        arrayList2.add(new PirateApp("CreeHack", new String[]{"o", "r", "g", ".", "c", "r", "e", "e", "p", "l", "a", "y", "s", ".", "h", "a", "c", "k"}, appType));
        arrayList2.add(new PirateApp("HappyMod", new String[]{"c", "o", "m", ".", "h", "a", "p", "p", "y", "m", "o", "d", ".", "a", "p", "k"}, appType));
        arrayList2.add(new PirateApp("Game Hacker", new String[]{"o", "r", "g", ".", "s", "b", "t", "o", "o", "l", "s", ".", "g", "a", "m", "e", "h", "a", "c", "k"}, appType));
        arrayList2.add(new PirateApp("Game Killer Cheats", new String[]{"c", "o", "m", ".", "z", "u", "n", "e", ".", "g", "a", "m", "e", "k", "i", "l", "l", "e", "r"}, appType));
        arrayList2.add(new PirateApp("AGK - App Killer", new String[]{"c", "o", "m", ".", "a", "a", "g", ".", "k", "i", "l", "l", "e", "r"}, appType));
        arrayList2.add(new PirateApp("Game Killer", new String[]{"c", "o", "m", ".", "k", "i", "l", "l", "e", "r", "a", "p", "p", ".", "g", "a", "m", "e", "k", "i", "l", "l", "e", "r"}, appType));
        arrayList2.add(new PirateApp("Game Killer", new String[]{"c", "n", ".", "l", "m", ".", "s", "q"}, appType));
        arrayList2.add(new PirateApp("Game CheatIng Hacker", new String[]{"n", "e", "t", ".", "s", "c", "h", "w", "a", "r", "z", "i", "s", ".", "g", "a", "m", "e", "_", "c", "i", "h"}, appType));
        arrayList2.add(new PirateApp("Game Hacker", new String[]{"c", "o", "m", ".", "b", "a", "s", "e", "a", "p", "p", "f", "u", "l", "l", ".", "f", "w", "d"}, appType));
        arrayList2.add(new PirateApp("Content Guard Disabler", new String[]{"c", "o", "m", ".", "g", "i", "t", "h", "u", "b", ".", "o", "n", "e", "m", "i", "n", "u", "s", "o", "n", "e", ".", "d", "i", "s", "a", "b", "l", "e", "c", "o", "n", "t", "e", "n", "t", "g", "u", "a", "r", "d"}, appType));
        arrayList2.add(new PirateApp("Content Guard Disabler", new String[]{"c", "o", "m", ".", "o", "n", "e", "m", "i", "n", "u", "s", "o", "n", "e", ".", "d", "i", "s", "a", "b", "l", "e", "c", "o", "n", "t", "e", "n", "t", "g", "u", "a", "r", "d"}, appType));
        AppType appType2 = AppType.STORE;
        arrayList2.add(new PirateApp("Aptoide", new String[]{"c", "m", ".", "a", "p", "t", "o", "i", "d", "e", ".", "p", "t"}, appType2));
        arrayList2.add(new PirateApp("BlackMart", new String[]{"o", "r", "g", ".", "b", "l", "a", "c", "k", "m", "a", "r", "t", ".", "m", "a", "r", "k", "e", "t"}, appType2));
        arrayList2.add(new PirateApp("BlackMart", new String[]{"c", "o", "m", ".", "b", "l", "a", "c", "k", "m", "a", "r", "t", "a", "l", "p", "h", "a"}, appType2));
        arrayList2.add(new PirateApp("Mobogenie", new String[]{"c", "o", "m", ".", "m", "o", "b", "o", "g", "e", "n", "i", "e"}, appType2));
        arrayList2.add(new PirateApp("1Mobile", new String[]{"m", "e", ".", "o", "n", "e", "m", "o", "b", "i", "l", "e", ".", "a", "n", "d", "r", "o", "i", "d"}, appType2));
        arrayList2.add(new PirateApp("GetApk", new String[]{"c", "o", "m", ".", "r", "e", "p", "o", "d", "r", "o", "i", "d", ".", "a", "p", "p"}, appType2));
        arrayList2.add(new PirateApp("GetJar", new String[]{"c", "o", "m", ".", "g", "e", "t", "j", "a", "r", ".", "r", "e", "w", "a", "r", "d", "s"}, appType2));
        arrayList2.add(new PirateApp("SlideMe", new String[]{"c", "o", "m", ".", "s", "l", "i", "d", "e", "m", "e", ".", "s", "a", "m", ".", "m", "a", "n", "a", "g", "e", "r"}, appType2));
        arrayList2.add(new PirateApp("ACMarket", new String[]{"n", "e", "t", ".", "a", "p", "p", "c", "a", "k", "e"}, appType2));
        arrayList2.add(new PirateApp("ACMarket", new String[]{"a", "c", ".", "m", "a", "r", "k", "e", "t", ".", "s", "t", "o", "r", "e"}, appType2));
        arrayList2.add(new PirateApp("AppCake", new String[]{"c", "o", "m", ".", "a", "p", "p", "c", "a", "k", "e"}, appType2));
        arrayList2.add(new PirateApp("Z Market", new String[]{"c", "o", "m", ".", "z", "m", "a", "p", "p"}, appType2));
        arrayList2.add(new PirateApp("Modded Play Store", new String[]{"c", "o", "m", ".", "d", RegisterSpec.PREFIX, ".", "m", "a", "r", "k", "e", "t", "m", "o", "d", ".", "i", "n", "s", "t", "a", "l", "l", "e", "r"}, appType2));
        arrayList2.add(new PirateApp("Mobilism Market", new String[]{"o", "r", "g", ".", "m", "o", "b", "i", "l", "i", "s", "m", ".", "a", "n", "d", "r", "o", "i", "d"}, appType2));
        arrayList2.add(new PirateApp("All-in-one Downloader", new String[]{"c", "o", "m", ".", "a", "l", "l", "i", "n", "o", "n", "e", ".", "f", "r", "e", "e"}, appType2));
        arrayList2.addAll(arrayList);
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList2) {
            if (hashSet.add(((PirateApp) next).mo34353b())) {
                arrayList3.add(next);
            }
        }
        return new ArrayList<>(arrayList3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a3 A[Catch:{ Exception -> 0x01ce }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.github.javiersantos.piracychecker.enums.PirateApp m26251e(android.content.Context r16, boolean r17, boolean r18, boolean r19, boolean r20, java.util.ArrayList<com.github.javiersantos.piracychecker.enums.PirateApp> r21) {
        /*
            r0 = r16
            java.lang.String r1 = ".apk"
            java.lang.String r2 = "$this$getPirateApp"
            kotlin.jvm.internal.C13706o.m87930g(r0, r2)
            java.lang.String r2 = "extraApps"
            r3 = r21
            kotlin.jvm.internal.C13706o.m87930g(r3, r2)
            r2 = 0
            if (r17 != 0) goto L_0x001c
            if (r18 != 0) goto L_0x001c
            boolean r4 = r21.isEmpty()
            if (r4 == 0) goto L_0x001c
            return r2
        L_0x001c:
            java.util.ArrayList r3 = m26250d(r21)
            r4 = 2
            r6 = 0
            android.content.pm.PackageManager r7 = r16.getPackageManager()     // Catch:{ Exception -> 0x00aa }
            if (r7 == 0) goto L_0x002f
            r8 = 128(0x80, float:1.794E-43)
            java.util.List r8 = r7.getInstalledApplications(r8)     // Catch:{ Exception -> 0x00aa }
            goto L_0x0030
        L_0x002f:
            r8 = r2
        L_0x0030:
            java.util.Iterator r9 = r3.iterator()     // Catch:{ Exception -> 0x00aa }
            r10 = 0
        L_0x0035:
            boolean r11 = r9.hasNext()     // Catch:{ Exception -> 0x00aa }
            if (r11 == 0) goto L_0x00aa
            java.lang.Object r11 = r9.next()     // Catch:{ Exception -> 0x00aa }
            com.github.javiersantos.piracychecker.enums.PirateApp r11 = (com.github.javiersantos.piracychecker.enums.PirateApp) r11     // Catch:{ Exception -> 0x00aa }
            if (r17 == 0) goto L_0x004d
            com.github.javiersantos.piracychecker.enums.AppType r12 = r11.mo34354c()     // Catch:{ Exception -> 0x00aa }
            com.github.javiersantos.piracychecker.enums.AppType r13 = com.github.javiersantos.piracychecker.enums.AppType.PIRATE     // Catch:{ Exception -> 0x00aa }
            if (r12 != r13) goto L_0x004d
            r12 = 1
            goto L_0x004e
        L_0x004d:
            r12 = 0
        L_0x004e:
            if (r18 == 0) goto L_0x005a
            com.github.javiersantos.piracychecker.enums.AppType r13 = r11.mo34354c()     // Catch:{ Exception -> 0x00aa }
            com.github.javiersantos.piracychecker.enums.AppType r14 = com.github.javiersantos.piracychecker.enums.AppType.STORE     // Catch:{ Exception -> 0x00aa }
            if (r13 != r14) goto L_0x005a
            r13 = 1
            goto L_0x005b
        L_0x005a:
            r13 = 0
        L_0x005b:
            com.github.javiersantos.piracychecker.enums.AppType r14 = r11.mo34354c()     // Catch:{ Exception -> 0x00aa }
            com.github.javiersantos.piracychecker.enums.AppType r15 = com.github.javiersantos.piracychecker.enums.AppType.OTHER     // Catch:{ Exception -> 0x00aa }
            if (r14 != r15) goto L_0x0065
            r14 = 1
            goto L_0x0066
        L_0x0065:
            r14 = 0
        L_0x0066:
            if (r12 != 0) goto L_0x006c
            if (r13 != 0) goto L_0x006c
            if (r14 == 0) goto L_0x00a7
        L_0x006c:
            if (r8 == 0) goto L_0x0098
            boolean r10 = r8.isEmpty()     // Catch:{ Exception -> 0x00aa }
            if (r10 == 0) goto L_0x0075
            goto L_0x0098
        L_0x0075:
            java.util.Iterator r10 = r8.iterator()     // Catch:{ Exception -> 0x00aa }
        L_0x0079:
            boolean r12 = r10.hasNext()     // Catch:{ Exception -> 0x00aa }
            if (r12 == 0) goto L_0x0098
            java.lang.Object r12 = r10.next()     // Catch:{ Exception -> 0x00aa }
            android.content.pm.ApplicationInfo r12 = (android.content.pm.ApplicationInfo) r12     // Catch:{ Exception -> 0x00aa }
            java.lang.String r12 = r12.packageName     // Catch:{ Exception -> 0x00aa }
            java.lang.String r13 = "it.packageName"
            kotlin.jvm.internal.C13706o.m87925b(r12, r13)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r13 = r11.mo34353b()     // Catch:{ Exception -> 0x00aa }
            boolean r12 = kotlin.text.C15177w.m93663N(r12, r13, r6, r4, r2)     // Catch:{ Exception -> 0x00aa }
            if (r12 == 0) goto L_0x0079
            r10 = 1
            goto L_0x0099
        L_0x0098:
            r10 = 0
        L_0x0099:
            if (r10 != 0) goto L_0x00a7
            java.lang.String r10 = r11.mo34353b()     // Catch:{ Exception -> 0x00aa }
            android.content.Intent r10 = r7.getLaunchIntentForPackage(r10)     // Catch:{ Exception -> 0x00aa }
            boolean r10 = m26255i(r0, r10)     // Catch:{ Exception -> 0x00aa }
        L_0x00a7:
            if (r10 == 0) goto L_0x0035
            goto L_0x00ab
        L_0x00aa:
            r11 = r2
        L_0x00ab:
            if (r19 != 0) goto L_0x00af
            if (r20 == 0) goto L_0x01dc
        L_0x00af:
            if (r11 != 0) goto L_0x01dc
            boolean r0 = m26252f(r16)
            if (r0 == 0) goto L_0x01dc
            java.util.Iterator r0 = r3.iterator()
            r3 = 0
            r7 = 0
            r8 = 0
        L_0x00be:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x01dc
            java.lang.Object r9 = r0.next()
            com.github.javiersantos.piracychecker.enums.PirateApp r9 = (com.github.javiersantos.piracychecker.enums.PirateApp) r9
            java.lang.String r10 = r9.mo34353b()
            java.lang.String r12 = "/data/data/"
            java.lang.String r13 = "/data/app/"
            if (r20 == 0) goto L_0x0155
            java.io.File r14 = new java.io.File     // Catch:{ Exception -> 0x0151 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0151 }
            r15.<init>()     // Catch:{ Exception -> 0x0151 }
            r15.append(r13)     // Catch:{ Exception -> 0x0151 }
            r15.append(r10)     // Catch:{ Exception -> 0x0151 }
            java.lang.String r5 = "-1/base.apk"
            r15.append(r5)     // Catch:{ Exception -> 0x0151 }
            java.lang.String r5 = r15.toString()     // Catch:{ Exception -> 0x0151 }
            r14.<init>(r5)     // Catch:{ Exception -> 0x0151 }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0151 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0151 }
            r15.<init>()     // Catch:{ Exception -> 0x0151 }
            r15.append(r13)     // Catch:{ Exception -> 0x0151 }
            r15.append(r10)     // Catch:{ Exception -> 0x0151 }
            java.lang.String r2 = "-2/base.apk"
            r15.append(r2)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r2 = r15.toString()     // Catch:{ Exception -> 0x01ce }
            r5.<init>(r2)     // Catch:{ Exception -> 0x01ce }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x01ce }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r15.<init>()     // Catch:{ Exception -> 0x01ce }
            r15.append(r13)     // Catch:{ Exception -> 0x01ce }
            r15.append(r10)     // Catch:{ Exception -> 0x01ce }
            r15.append(r1)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r15 = r15.toString()     // Catch:{ Exception -> 0x01ce }
            r2.<init>(r15)     // Catch:{ Exception -> 0x01ce }
            java.io.File r15 = new java.io.File     // Catch:{ Exception -> 0x01ce }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r4.<init>()     // Catch:{ Exception -> 0x01ce }
            r4.append(r12)     // Catch:{ Exception -> 0x01ce }
            r4.append(r10)     // Catch:{ Exception -> 0x01ce }
            r4.append(r1)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x01ce }
            r15.<init>(r4)     // Catch:{ Exception -> 0x01ce }
            boolean r4 = r14.exists()     // Catch:{ Exception -> 0x01ce }
            if (r4 != 0) goto L_0x014f
            boolean r4 = r5.exists()     // Catch:{ Exception -> 0x01ce }
            if (r4 != 0) goto L_0x014f
            boolean r2 = r2.exists()     // Catch:{ Exception -> 0x01ce }
            if (r2 != 0) goto L_0x014f
            boolean r2 = r15.exists()     // Catch:{ Exception -> 0x01ce }
            if (r2 == 0) goto L_0x014d
            goto L_0x014f
        L_0x014d:
            r3 = 0
            goto L_0x0155
        L_0x014f:
            r3 = 1
            goto L_0x0155
        L_0x0151:
            r14 = r2
            r13 = 2
            goto L_0x01d0
        L_0x0155:
            if (r19 == 0) goto L_0x01ce
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x01ce }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r4.<init>()     // Catch:{ Exception -> 0x01ce }
            r4.append(r12)     // Catch:{ Exception -> 0x01ce }
            r4.append(r10)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x01ce }
            r2.<init>(r4)     // Catch:{ Exception -> 0x01ce }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x01ce }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r5.<init>()     // Catch:{ Exception -> 0x01ce }
            java.io.File r12 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x01ce }
            r5.append(r12)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r12 = "/Android/data/"
            r5.append(r12)     // Catch:{ Exception -> 0x01ce }
            r5.append(r10)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01ce }
            r4.<init>(r5)     // Catch:{ Exception -> 0x01ce }
            boolean r2 = r2.exists()     // Catch:{ Exception -> 0x01ce }
            if (r2 != 0) goto L_0x0197
            boolean r2 = r4.exists()     // Catch:{ Exception -> 0x01ce }
            if (r2 == 0) goto L_0x0195
            goto L_0x0197
        L_0x0195:
            r7 = 0
            goto L_0x0198
        L_0x0197:
            r7 = 1
        L_0x0198:
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x01ce }
            r2.<init>(r13)     // Catch:{ Exception -> 0x01ce }
            boolean r4 = r2.exists()     // Catch:{ Exception -> 0x01ce }
            if (r4 == 0) goto L_0x01ce
            java.io.File[] r2 = r2.listFiles()     // Catch:{ Exception -> 0x01ce }
            if (r2 == 0) goto L_0x01aa
            goto L_0x01ac
        L_0x01aa:
            java.io.File[] r2 = new java.io.File[r6]     // Catch:{ Exception -> 0x01ce }
        L_0x01ac:
            int r4 = r2.length     // Catch:{ Exception -> 0x01ce }
            r5 = 0
        L_0x01ae:
            if (r5 >= r4) goto L_0x01ce
            r12 = r2[r5]     // Catch:{ Exception -> 0x01ce }
            java.lang.String r13 = "f"
            kotlin.jvm.internal.C13706o.m87925b(r12, r13)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r12 = r12.getName()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r13 = "f.name"
            kotlin.jvm.internal.C13706o.m87925b(r12, r13)     // Catch:{ Exception -> 0x01ce }
            r13 = 2
            r14 = 0
            boolean r12 = kotlin.text.C15176v.m93634I(r12, r10, r6, r13, r14)     // Catch:{ Exception -> 0x01cc }
            if (r12 == 0) goto L_0x01c9
            r8 = 1
        L_0x01c9:
            int r5 = r5 + 1
            goto L_0x01ae
        L_0x01cc:
            goto L_0x01d0
        L_0x01ce:
            r13 = 2
            r14 = 0
        L_0x01d0:
            if (r8 != 0) goto L_0x01db
            if (r3 != 0) goto L_0x01db
            if (r7 == 0) goto L_0x01d7
            goto L_0x01db
        L_0x01d7:
            r2 = r14
            r4 = 2
            goto L_0x00be
        L_0x01db:
            r11 = r9
        L_0x01dc:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.javiersantos.piracychecker.utils.LibraryUtilsKt.m26251e(android.content.Context, boolean, boolean, boolean, boolean, java.util.ArrayList):com.github.javiersantos.piracychecker.enums.PirateApp");
    }

    /* renamed from: f */
    private static final boolean m26252f(Context context) {
        try {
            if (m26257k(context, "android.permission.READ_EXTERNAL_STORAGE")) {
                if (context == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                } else if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, "android.permission.READ_EXTERNAL_STORAGE")) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static final boolean m26253g(Context context) {
        C13706o.m87930g(context, "$this$isDebug");
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:131|132|133|(1:139)|140|141|(1:143)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:140:0x01bc */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01eb  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m26254h(boolean r16) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = android.os.Build.PRODUCT     // Catch:{ Exception -> 0x0005 }
            goto L_0x0006
        L_0x0005:
            r1 = r0
        L_0x0006:
            java.lang.String r2 = "product"
            kotlin.jvm.internal.C13706o.m87925b(r1, r2)
            java.lang.String r2 = "sdk"
            boolean r3 = m26248b(r1, r2)
            java.lang.String r4 = "google_sdk"
            java.lang.String r6 = "vbox86p"
            java.lang.String r7 = "Droid4X"
            java.lang.String r8 = "ttVM_Hdragon"
            java.lang.String r9 = "nox"
            java.lang.String r10 = "Andy"
            r11 = 1
            if (r3 != 0) goto L_0x0057
            boolean r3 = m26248b(r1, r10)
            if (r3 != 0) goto L_0x0057
            boolean r3 = m26248b(r1, r8)
            if (r3 != 0) goto L_0x0057
            boolean r3 = m26248b(r1, r4)
            if (r3 != 0) goto L_0x0057
            boolean r3 = m26248b(r1, r7)
            if (r3 != 0) goto L_0x0057
            boolean r3 = m26248b(r1, r9)
            if (r3 != 0) goto L_0x0057
            java.lang.String r3 = "sdk_x86"
            boolean r3 = m26248b(r1, r3)
            if (r3 != 0) goto L_0x0057
            java.lang.String r3 = "sdk_google"
            boolean r3 = m26248b(r1, r3)
            if (r3 != 0) goto L_0x0057
            boolean r1 = m26248b(r1, r6)
            if (r1 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r1 = 0
            goto L_0x0058
        L_0x0057:
            r1 = 1
        L_0x0058:
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x005b }
            goto L_0x005c
        L_0x005b:
            r3 = r0
        L_0x005c:
            java.lang.String r12 = "manufacturer"
            kotlin.jvm.internal.C13706o.m87925b(r3, r12)
            java.lang.String r12 = "unknown"
            boolean r12 = m26249c(r3, r12)
            java.lang.String r13 = "TiantianVM"
            if (r12 != 0) goto L_0x008d
            java.lang.String r12 = "Genymotion"
            boolean r12 = m26249c(r3, r12)
            if (r12 != 0) goto L_0x008d
            boolean r12 = m26248b(r3, r10)
            if (r12 != 0) goto L_0x008d
            java.lang.String r12 = "MIT"
            boolean r12 = m26248b(r3, r12)
            if (r12 != 0) goto L_0x008d
            boolean r12 = m26248b(r3, r9)
            if (r12 != 0) goto L_0x008d
            boolean r3 = m26248b(r3, r13)
            if (r3 == 0) goto L_0x008f
        L_0x008d:
            int r1 = r1 + 1
        L_0x008f:
            java.lang.String r3 = android.os.Build.BRAND     // Catch:{ Exception -> 0x0092 }
            goto L_0x0093
        L_0x0092:
            r3 = r0
        L_0x0093:
            java.lang.String r12 = "brand"
            kotlin.jvm.internal.C13706o.m87925b(r3, r12)
            java.lang.String r12 = "generic"
            boolean r14 = m26249c(r3, r12)
            java.lang.String r15 = "generic_x86"
            if (r14 != 0) goto L_0x00b6
            boolean r14 = m26249c(r3, r15)
            if (r14 != 0) goto L_0x00b6
            java.lang.String r14 = "TTVM"
            boolean r14 = m26249c(r3, r14)
            if (r14 != 0) goto L_0x00b6
            boolean r3 = m26248b(r3, r10)
            if (r3 == 0) goto L_0x00b8
        L_0x00b6:
            int r1 = r1 + 1
        L_0x00b8:
            java.lang.String r3 = android.os.Build.DEVICE     // Catch:{ Exception -> 0x00bb }
            goto L_0x00bc
        L_0x00bb:
            r3 = r0
        L_0x00bc:
            java.lang.String r14 = "device"
            kotlin.jvm.internal.C13706o.m87925b(r3, r14)
            boolean r14 = m26248b(r3, r12)
            java.lang.String r5 = "generic_x86_64"
            if (r14 != 0) goto L_0x00f3
            boolean r14 = m26248b(r3, r15)
            if (r14 != 0) goto L_0x00f3
            boolean r14 = m26248b(r3, r10)
            if (r14 != 0) goto L_0x00f3
            boolean r14 = m26248b(r3, r8)
            if (r14 != 0) goto L_0x00f3
            boolean r14 = m26248b(r3, r7)
            if (r14 != 0) goto L_0x00f3
            boolean r14 = m26248b(r3, r9)
            if (r14 != 0) goto L_0x00f3
            boolean r14 = m26248b(r3, r5)
            if (r14 != 0) goto L_0x00f3
            boolean r3 = m26248b(r3, r6)
            if (r3 == 0) goto L_0x00f5
        L_0x00f3:
            int r1 = r1 + 1
        L_0x00f5:
            java.lang.String r3 = android.os.Build.MODEL     // Catch:{ Exception -> 0x00f8 }
            goto L_0x00f9
        L_0x00f8:
            r3 = r0
        L_0x00f9:
            java.lang.String r14 = "model"
            kotlin.jvm.internal.C13706o.m87925b(r3, r14)
            boolean r2 = m26249c(r3, r2)
            if (r2 != 0) goto L_0x012c
            boolean r2 = m26249c(r3, r4)
            if (r2 != 0) goto L_0x012c
            boolean r2 = m26248b(r3, r7)
            if (r2 != 0) goto L_0x012c
            boolean r2 = m26248b(r3, r13)
            if (r2 != 0) goto L_0x012c
            boolean r2 = m26248b(r3, r10)
            if (r2 != 0) goto L_0x012c
            java.lang.String r2 = "Android SDK built for x86_64"
            boolean r2 = m26249c(r3, r2)
            if (r2 != 0) goto L_0x012c
            java.lang.String r2 = "Android SDK built for x86"
            boolean r2 = m26249c(r3, r2)
            if (r2 == 0) goto L_0x012e
        L_0x012c:
            int r1 = r1 + 1
        L_0x012e:
            java.lang.String r2 = android.os.Build.HARDWARE     // Catch:{ Exception -> 0x0131 }
            goto L_0x0132
        L_0x0131:
            r2 = r0
        L_0x0132:
            java.lang.String r3 = "hardware"
            kotlin.jvm.internal.C13706o.m87925b(r2, r3)
            java.lang.String r3 = "goldfish"
            boolean r3 = m26249c(r2, r3)
            if (r3 != 0) goto L_0x0155
            java.lang.String r3 = "vbox86"
            boolean r3 = m26249c(r2, r3)
            if (r3 != 0) goto L_0x0155
            boolean r3 = m26248b(r2, r9)
            if (r3 != 0) goto L_0x0155
            java.lang.String r3 = "ttVM_x86"
            boolean r2 = m26248b(r2, r3)
            if (r2 == 0) goto L_0x0157
        L_0x0155:
            int r1 = r1 + 1
        L_0x0157:
            java.lang.String r0 = android.os.Build.FINGERPRINT     // Catch:{ Exception -> 0x015a }
            goto L_0x015b
        L_0x015a:
        L_0x015b:
            java.lang.String r2 = "fingerprint"
            kotlin.jvm.internal.C13706o.m87925b(r0, r2)
            boolean r2 = m26248b(r0, r12)
            if (r2 != 0) goto L_0x019e
            java.lang.String r2 = "generic/sdk/generic"
            boolean r2 = m26248b(r0, r2)
            if (r2 != 0) goto L_0x019e
            java.lang.String r2 = "generic_x86/sdk_x86/generic_x86"
            boolean r2 = m26248b(r0, r2)
            if (r2 != 0) goto L_0x019e
            boolean r2 = m26248b(r0, r10)
            if (r2 != 0) goto L_0x019e
            boolean r2 = m26248b(r0, r8)
            if (r2 != 0) goto L_0x019e
            boolean r2 = m26248b(r0, r5)
            if (r2 != 0) goto L_0x019e
            java.lang.String r2 = "generic/google_sdk/generic"
            boolean r2 = m26248b(r0, r2)
            if (r2 != 0) goto L_0x019e
            boolean r2 = m26248b(r0, r6)
            if (r2 != 0) goto L_0x019e
            java.lang.String r2 = "generic/vbox86p/vbox86p"
            boolean r0 = m26248b(r0, r2)
            if (r0 == 0) goto L_0x01a0
        L_0x019e:
            int r1 = r1 + 1
        L_0x01a0:
            if (r16 == 0) goto L_0x01ef
            r0 = 7937(0x1f01, float:1.1122E-41)
            java.lang.String r0 = android.opengl.GLES20.glGetString(r0)     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x01bc
            java.lang.String r2 = "Bluestacks"
            boolean r2 = m26248b(r0, r2)     // Catch:{ Exception -> 0x01bc }
            if (r2 != 0) goto L_0x01ba
            java.lang.String r2 = "Translator"
            boolean r0 = m26248b(r0, r2)     // Catch:{ Exception -> 0x01bc }
            if (r0 == 0) goto L_0x01bc
        L_0x01ba:
            int r1 = r1 + 10
        L_0x01bc:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x01ee }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ee }
            r2.<init>()     // Catch:{ Exception -> 0x01ee }
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x01ee }
            r2.append(r3)     // Catch:{ Exception -> 0x01ee }
            char r3 = java.io.File.separatorChar     // Catch:{ Exception -> 0x01ee }
            r2.append(r3)     // Catch:{ Exception -> 0x01ee }
            java.lang.String r3 = "windows"
            r2.append(r3)     // Catch:{ Exception -> 0x01ee }
            char r3 = java.io.File.separatorChar     // Catch:{ Exception -> 0x01ee }
            r2.append(r3)     // Catch:{ Exception -> 0x01ee }
            java.lang.String r3 = "BstSharedFolder"
            r2.append(r3)     // Catch:{ Exception -> 0x01ee }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01ee }
            r0.<init>(r2)     // Catch:{ Exception -> 0x01ee }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x01ee }
            if (r0 == 0) goto L_0x01ef
            int r1 = r1 + 10
            goto L_0x01ef
        L_0x01ee:
        L_0x01ef:
            r0 = 3
            if (r1 <= r0) goto L_0x01f4
            r5 = 1
            goto L_0x01f5
        L_0x01f4:
            r5 = 0
        L_0x01f5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.javiersantos.piracychecker.utils.LibraryUtilsKt.m26254h(boolean):boolean");
    }

    /* renamed from: i */
    private static final boolean m26255i(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities == null) {
                queryIntentActivities = C13614t.m87748j();
            }
            return !queryIntentActivities.isEmpty();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: j */
    private static final boolean m26256j() {
        return Build.VERSION.SDK_INT >= 23;
    }

    /* renamed from: k */
    private static final boolean m26257k(Context context, String str) {
        if (!m26256j() || ContextCompat.checkSelfPermission(context, str) == 0) {
            return false;
        }
        return true;
    }
}
