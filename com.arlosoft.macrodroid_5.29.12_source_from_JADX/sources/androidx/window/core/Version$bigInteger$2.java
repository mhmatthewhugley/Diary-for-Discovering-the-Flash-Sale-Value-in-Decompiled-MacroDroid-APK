package androidx.window.core;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C13708q;
import p370qa.C16254a;

@Metadata(mo71667d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo71668d2 = {"<anonymous>", "Ljava/math/BigInteger;", "kotlin.jvm.PlatformType", "invoke"}, mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: Version.kt */
final class Version$bigInteger$2 extends C13708q implements C16254a<BigInteger> {
    final /* synthetic */ Version this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Version$bigInteger$2(Version version) {
        super(0);
        this.this$0 = version;
    }

    public final BigInteger invoke() {
        return BigInteger.valueOf((long) this.this$0.getMajor()).shiftLeft(32).or(BigInteger.valueOf((long) this.this$0.getMinor())).shiftLeft(32).or(BigInteger.valueOf((long) this.this$0.getPatch()));
    }
}