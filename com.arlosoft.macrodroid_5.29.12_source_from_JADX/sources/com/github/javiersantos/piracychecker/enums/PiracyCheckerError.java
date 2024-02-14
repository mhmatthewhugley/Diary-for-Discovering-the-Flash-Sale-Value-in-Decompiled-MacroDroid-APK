package com.github.javiersantos.piracychecker.enums;

import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, mo71668d2 = {"Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;", "", "", "toString", "text", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "H", "Companion", "NOT_LICENSED", "SIGNATURE_NOT_VALID", "INVALID_INSTALLER_ID", "USING_DEBUG_APP", "USING_APP_IN_EMULATOR", "PIRATE_APP_INSTALLED", "BLOCK_PIRATE_APP", "THIRD_PARTY_STORE_INSTALLED", "INVALID_PACKAGE_NAME", "NON_MATCHING_UID", "NOT_MARKET_MANAGED", "CHECK_IN_PROGRESS", "INVALID_PUBLIC_KEY", "MISSING_PERMISSION", "UNKNOWN", "library_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: PiracyCheckerError.kt */
public enum PiracyCheckerError {
    NOT_LICENSED("This user is not using a licensed application from Google Play."),
    SIGNATURE_NOT_VALID("This app is using another signature. The original APK has been modified."),
    INVALID_INSTALLER_ID("This app has been installed from a non-allowed source."),
    USING_DEBUG_APP("This is a debug build."),
    USING_APP_IN_EMULATOR("This app is being used in an emulator."),
    PIRATE_APP_INSTALLED("At least one pirate app has been detected on device."),
    BLOCK_PIRATE_APP("At least one pirate app has been detected and the app must be reinstalled when all unauthorized apps are uninstalled."),
    THIRD_PARTY_STORE_INSTALLED("At least one third-party store has been detected on device."),
    INVALID_PACKAGE_NAME("Application package name is invalid."),
    NON_MATCHING_UID("Application UID doesn't match."),
    NOT_MARKET_MANAGED("Not market managed error."),
    CHECK_IN_PROGRESS("License check is in progress."),
    INVALID_PUBLIC_KEY("Application public key is invalid."),
    MISSING_PERMISSION("Application misses the 'com.android.vending.CHECK_LICENSE' permission."),
    UNKNOWN("Unknown error.");
    

    /* renamed from: H */
    public static final Companion f16348H = null;
    private final String text;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo71668d2 = {"Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError$Companion;", "", "", "errorCode", "Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;", "a", "<init>", "()V", "library_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* compiled from: PiracyCheckerError.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final PiracyCheckerError mo34351a(int i) {
            switch (i) {
                case 1:
                    return PiracyCheckerError.INVALID_PACKAGE_NAME;
                case 2:
                    return PiracyCheckerError.NON_MATCHING_UID;
                case 3:
                    return PiracyCheckerError.NOT_MARKET_MANAGED;
                case 4:
                    return PiracyCheckerError.CHECK_IN_PROGRESS;
                case 5:
                    return PiracyCheckerError.INVALID_PUBLIC_KEY;
                case 6:
                    return PiracyCheckerError.MISSING_PERMISSION;
                default:
                    return PiracyCheckerError.UNKNOWN;
            }
        }
    }

    static {
        f16348H = new Companion((C13695i) null);
    }

    private PiracyCheckerError(String str) {
        this.text = str;
    }

    public String toString() {
        return this.text;
    }
}
