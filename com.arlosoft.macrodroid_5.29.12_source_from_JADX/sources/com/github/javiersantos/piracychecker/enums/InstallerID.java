package com.github.javiersantos.piracychecker.enums;

import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo71668d2 = {"Lcom/github/javiersantos/piracychecker/enums/InstallerID;", "", "", "toString", "text", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "GOOGLE_PLAY", "AMAZON_APP_STORE", "GALAXY_APPS", "HUAWEI_APP_GALLERY", "library_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: InstallerID.kt */
public enum InstallerID {
    GOOGLE_PLAY("com.android.vending|com.google.android.feedback"),
    AMAZON_APP_STORE("com.amazon.venezia"),
    GALAXY_APPS("com.sec.android.app.samsungapps"),
    HUAWEI_APP_GALLERY("com.huawei.appmarket");
    
    private final String text;

    private InstallerID(String str) {
        this.text = str;
    }

    public String toString() {
        return this.text;
    }
}
