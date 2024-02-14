package p447z7;

import java.util.Map;
import org.apache.commons.p353io.FilenameUtils;

/* renamed from: z7.f */
/* compiled from: FetchResponse */
public class C17054f extends C17056h {

    /* renamed from: m */
    private static final char[] f68465m = {FilenameUtils.EXTENSION_SEPARATOR, 'H', 'E', 'A', 'D', 'E', 'R'};

    /* renamed from: n */
    private static final char[] f68466n = {FilenameUtils.EXTENSION_SEPARATOR, 'T', 'E', 'X', 'T'};

    /* renamed from: k */
    private C17058j[] f68467k;

    /* renamed from: l */
    private Map<String, Object> f68468l;

    /* renamed from: v */
    public Map<String, Object> mo80280v() {
        return this.f68468l;
    }

    /* renamed from: w */
    public C17058j mo80281w(int i) {
        return this.f68467k[i];
    }

    /* renamed from: x */
    public <T extends C17058j> T mo80282x(Class<T> cls) {
        int i = 0;
        while (true) {
            C17058j[] jVarArr = this.f68467k;
            if (i >= jVarArr.length) {
                return null;
            }
            if (cls.isInstance(jVarArr[i])) {
                return (C17058j) cls.cast(this.f68467k[i]);
            }
            i++;
        }
    }

    /* renamed from: y */
    public int mo80283y() {
        return this.f68467k.length;
    }
}
