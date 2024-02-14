package com.github.javiersantos.piracychecker.enums;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R(\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b8\u0006@BX\u000e¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\u0014"}, mo71668d2 = {"Lcom/github/javiersantos/piracychecker/enums/PirateApp;", "", "", "<set-?>", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "Lcom/github/javiersantos/piracychecker/enums/AppType;", "b", "Lcom/github/javiersantos/piracychecker/enums/AppType;", "c", "()Lcom/github/javiersantos/piracychecker/enums/AppType;", "type", "", "[Ljava/lang/String;", "pack", "packageName", "<init>", "(Ljava/lang/String;[Ljava/lang/String;Lcom/github/javiersantos/piracychecker/enums/AppType;)V", "library_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: PirateApp.kt */
public final class PirateApp {

    /* renamed from: a */
    private String f16358a;

    /* renamed from: b */
    private AppType f16359b;

    /* renamed from: c */
    private String[] f16360c;

    public PirateApp(String str, String[] strArr, AppType appType) {
        C13706o.m87930g(str, "name");
        C13706o.m87930g(strArr, "pack");
        C13706o.m87930g(appType, "type");
        this.f16358a = str;
        this.f16360c = (String[]) strArr.clone();
        this.f16359b = appType;
    }

    /* renamed from: a */
    public final String mo34352a() {
        return this.f16358a;
    }

    /* renamed from: b */
    public final String mo34353b() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = this.f16360c;
        if (strArr != null) {
            for (String append : strArr) {
                sb.append(append);
            }
        }
        String sb2 = sb.toString();
        C13706o.m87925b(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: c */
    public final AppType mo34354c() {
        return this.f16359b;
    }
}
