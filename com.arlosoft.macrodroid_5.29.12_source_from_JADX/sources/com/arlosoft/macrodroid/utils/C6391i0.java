package com.arlosoft.macrodroid.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.utils.i0 */
/* compiled from: IconPackManager */
public class C6391i0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f14986a;

    /* renamed from: b */
    private HashMap<String, C6392a> f14987b = null;

    /* renamed from: com.arlosoft.macrodroid.utils.i0$a */
    /* compiled from: IconPackManager */
    public class C6392a {

        /* renamed from: a */
        public String f14988a;

        /* renamed from: b */
        public String f14989b;

        /* renamed from: c */
        private boolean f14990c = false;

        /* renamed from: d */
        private HashMap<String, String> f14991d = new HashMap<>();

        /* renamed from: e */
        private List<Bitmap> f14992e = new ArrayList();

        /* renamed from: f */
        private Bitmap f14993f = null;

        /* renamed from: g */
        private Bitmap f14994g = null;

        /* renamed from: h */
        private float f14995h = 1.0f;

        /* renamed from: i */
        private int f14996i;

        /* renamed from: j */
        Resources f14997j = null;

        public C6392a() {
        }

        /* renamed from: b */
        private Bitmap m24647b(String str) {
            int identifier = this.f14997j.getIdentifier(str, "drawable", this.f14988a);
            if (identifier <= 0) {
                return null;
            }
            Drawable drawable = this.f14997j.getDrawable(identifier);
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0159, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x015a, code lost:
            r0.printStackTrace();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:77:? A[ExcHandler: NameNotFoundException | XmlPullParserException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x000a] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo32436a() {
            /*
                r8 = this;
                com.arlosoft.macrodroid.utils.i0 r0 = com.arlosoft.macrodroid.utils.C6391i0.this
                android.content.Context r0 = r0.f14986a
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                java.lang.String r1 = r8.f14988a     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                android.content.res.Resources r0 = r0.getResourcesForApplication(r1)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                r8.f14997j = r0     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                java.lang.String r1 = "appfilter"
                java.lang.String r2 = "xml"
                java.lang.String r3 = r8.f14988a     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                int r0 = r0.getIdentifier(r1, r2, r3)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                r1 = 0
                r2 = 1
                if (r0 <= 0) goto L_0x0027
                android.content.res.Resources r3 = r8.f14997j     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                android.content.res.XmlResourceParser r0 = r3.getXml(r0)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                goto L_0x0046
            L_0x0027:
                android.content.res.Resources r0 = r8.f14997j     // Catch:{ IOException -> 0x0045, NameNotFoundException | XmlPullParserException -> 0x015d, NameNotFoundException | XmlPullParserException -> 0x015d }
                android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x0045, NameNotFoundException | XmlPullParserException -> 0x015d, NameNotFoundException | XmlPullParserException -> 0x015d }
                java.lang.String r3 = "appfilter.xml"
                java.io.InputStream r0 = r0.open(r3)     // Catch:{ IOException -> 0x0045, NameNotFoundException | XmlPullParserException -> 0x015d, NameNotFoundException | XmlPullParserException -> 0x015d }
                org.xmlpull.v1.XmlPullParserFactory r3 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ IOException -> 0x0045, NameNotFoundException | XmlPullParserException -> 0x015d, NameNotFoundException | XmlPullParserException -> 0x015d }
                r3.setNamespaceAware(r2)     // Catch:{ IOException -> 0x0045, NameNotFoundException | XmlPullParserException -> 0x015d, NameNotFoundException | XmlPullParserException -> 0x015d }
                org.xmlpull.v1.XmlPullParser r3 = r3.newPullParser()     // Catch:{ IOException -> 0x0045, NameNotFoundException | XmlPullParserException -> 0x015d, NameNotFoundException | XmlPullParserException -> 0x015d }
                java.lang.String r4 = "utf-8"
                r3.setInput(r0, r4)     // Catch:{ IOException -> 0x0043, NameNotFoundException | XmlPullParserException -> 0x015d, NameNotFoundException | XmlPullParserException -> 0x015d }
            L_0x0043:
                r0 = r3
                goto L_0x0046
            L_0x0045:
                r0 = r1
            L_0x0046:
                if (r0 == 0) goto L_0x0156
                int r3 = r0.getEventType()     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
            L_0x004c:
                if (r3 == r2) goto L_0x0156
                r4 = 2
                if (r3 != r4) goto L_0x0150
                java.lang.String r3 = r0.getName()     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                java.lang.String r4 = "iconback"
                boolean r3 = r3.equals(r4)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                r4 = 0
                if (r3 == 0) goto L_0x0082
            L_0x005e:
                int r3 = r0.getAttributeCount()     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                if (r4 >= r3) goto L_0x0150
                java.lang.String r3 = r0.getAttributeName(r4)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                java.lang.String r5 = "img"
                boolean r3 = r3.startsWith(r5)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                if (r3 == 0) goto L_0x007f
                java.lang.String r3 = r0.getAttributeValue(r4)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                android.graphics.Bitmap r3 = r8.m24647b(r3)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                if (r3 == 0) goto L_0x007f
                java.util.List<android.graphics.Bitmap> r5 = r8.f14992e     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                r5.add(r3)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
            L_0x007f:
                int r4 = r4 + 1
                goto L_0x005e
            L_0x0082:
                java.lang.String r3 = r0.getName()     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                java.lang.String r5 = "iconmask"
                boolean r3 = r3.equals(r5)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                java.lang.String r5 = "img1"
                if (r3 == 0) goto L_0x00ac
                int r3 = r0.getAttributeCount()     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                if (r3 <= 0) goto L_0x0150
                java.lang.String r3 = r0.getAttributeName(r4)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                boolean r3 = r3.equals(r5)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                if (r3 == 0) goto L_0x0150
                java.lang.String r3 = r0.getAttributeValue(r4)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                android.graphics.Bitmap r3 = r8.m24647b(r3)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                r8.f14993f = r3     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                goto L_0x0150
            L_0x00ac:
                java.lang.String r3 = r0.getName()     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                java.lang.String r6 = "iconupon"
                boolean r3 = r3.equals(r6)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                if (r3 == 0) goto L_0x00d4
                int r3 = r0.getAttributeCount()     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                if (r3 <= 0) goto L_0x0150
                java.lang.String r3 = r0.getAttributeName(r4)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                boolean r3 = r3.equals(r5)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                if (r3 == 0) goto L_0x0150
                java.lang.String r3 = r0.getAttributeValue(r4)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                android.graphics.Bitmap r3 = r8.m24647b(r3)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                r8.f14994g = r3     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                goto L_0x0150
            L_0x00d4:
                java.lang.String r3 = r0.getName()     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                java.lang.String r5 = "scale"
                boolean r3 = r3.equals(r5)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                if (r3 == 0) goto L_0x0106
                int r3 = r0.getAttributeCount()     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                if (r3 <= 0) goto L_0x0150
                java.lang.String r3 = r0.getAttributeName(r4)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                java.lang.String r5 = "factor"
                boolean r3 = r3.equals(r5)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                if (r3 == 0) goto L_0x0150
                java.lang.String r3 = r0.getAttributeValue(r4)     // Catch:{ Exception -> 0x0101 }
                java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ Exception -> 0x0101 }
                float r3 = r3.floatValue()     // Catch:{ Exception -> 0x0101 }
                r8.f14995h = r3     // Catch:{ Exception -> 0x0101 }
                goto L_0x0150
            L_0x0101:
                r3 = 1065353216(0x3f800000, float:1.0)
                r8.f14995h = r3     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                goto L_0x0150
            L_0x0106:
                java.lang.String r3 = r0.getName()     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                java.lang.String r5 = "item"
                boolean r3 = r3.equals(r5)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                if (r3 == 0) goto L_0x0150
                r3 = r1
                r5 = r3
            L_0x0114:
                int r6 = r0.getAttributeCount()     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                if (r4 >= r6) goto L_0x013e
                java.lang.String r6 = r0.getAttributeName(r4)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                java.lang.String r7 = "component"
                boolean r6 = r6.equals(r7)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                if (r6 == 0) goto L_0x012b
                java.lang.String r3 = r0.getAttributeValue(r4)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                goto L_0x013b
            L_0x012b:
                java.lang.String r6 = r0.getAttributeName(r4)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                java.lang.String r7 = "drawable"
                boolean r6 = r6.equals(r7)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                if (r6 == 0) goto L_0x013b
                java.lang.String r5 = r0.getAttributeValue(r4)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
            L_0x013b:
                int r4 = r4 + 1
                goto L_0x0114
            L_0x013e:
                java.util.HashMap<java.lang.String, java.lang.String> r4 = r8.f14991d     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                boolean r4 = r4.containsKey(r3)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                if (r4 != 0) goto L_0x0150
                java.util.HashMap<java.lang.String, java.lang.String> r4 = r8.f14991d     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                r4.put(r3, r5)     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                int r3 = r8.f14996i     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                int r3 = r3 + r2
                r8.f14996i = r3     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
            L_0x0150:
                int r3 = r0.next()     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                goto L_0x004c
            L_0x0156:
                r8.f14990c = r2     // Catch:{ NameNotFoundException | XmlPullParserException -> 0x015d, IOException -> 0x0159 }
                goto L_0x015d
            L_0x0159:
                r0 = move-exception
                r0.printStackTrace()
            L_0x015d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.utils.C6391i0.C6392a.mo32436a():void");
        }
    }

    /* renamed from: b */
    public HashMap<String, C6392a> mo32434b(boolean z) {
        if (this.f14987b == null || z) {
            this.f14987b = new HashMap<>();
            PackageManager packageManager = this.f14986a.getPackageManager();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("org.adw.launcher.THEMES"), 128);
            List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(new Intent("com.gau.go.launcherex.theme"), 128);
            ArrayList<ResolveInfo> arrayList = new ArrayList<>(queryIntentActivities);
            arrayList.addAll(queryIntentActivities2);
            for (ResolveInfo resolveInfo : arrayList) {
                C6392a aVar = new C6392a();
                String str = resolveInfo.activityInfo.packageName;
                aVar.f14988a = str;
                try {
                    aVar.f14989b = this.f14986a.getPackageManager().getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
                    this.f14987b.put(aVar.f14988a, aVar);
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return this.f14987b;
    }

    /* renamed from: c */
    public void mo32435c(Context context) {
        this.f14986a = context;
    }
}
