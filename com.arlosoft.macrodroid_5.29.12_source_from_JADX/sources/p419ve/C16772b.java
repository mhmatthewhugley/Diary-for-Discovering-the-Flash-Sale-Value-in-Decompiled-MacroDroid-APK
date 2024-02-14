package p419ve;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import org.apache.commons.p353io.FileUtils;

/* renamed from: ve.b */
/* compiled from: FileUtilsV2_2 */
public class C16772b {

    /* renamed from: a */
    public static final BigInteger f67726a;

    /* renamed from: b */
    public static final BigInteger f67727b;

    /* renamed from: c */
    public static final File[] f67728c = new File[0];

    static {
        BigInteger multiply = BigInteger.valueOf(FileUtils.ONE_KB).multiply(BigInteger.valueOf(FileUtils.ONE_EB));
        f67726a = multiply;
        f67727b = multiply.multiply(BigInteger.valueOf(FileUtils.ONE_EB));
    }

    /* renamed from: a */
    public static void m99481a(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException("File " + file + " exists and is not a directory. Unable to create directory.");
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Unable to create directory " + file);
        }
    }
}
