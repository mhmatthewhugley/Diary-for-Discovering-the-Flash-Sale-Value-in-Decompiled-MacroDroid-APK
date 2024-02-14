package p307ka;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0013"}, mo71668d2 = {"Lka/h;", "Ljava/io/Externalizable;", "", "readResolve", "Ljava/io/ObjectOutput;", "output", "Lja/u;", "writeExternal", "Ljava/io/ObjectInput;", "input", "readExternal", "", "collection", "", "tag", "<init>", "(Ljava/util/Collection;I)V", "()V", "a", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: ka.h */
/* compiled from: ListBuilder.kt */
public final class C13438h implements Externalizable {

    /* renamed from: a */
    public static final C13439a f61514a = new C13439a((C13695i) null);
    private static final long serialVersionUID = 0;
    private Collection<?> collection;
    private final int tag;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, mo71668d2 = {"Lka/h$a;", "", "", "serialVersionUID", "J", "", "tagList", "I", "tagSet", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: ka.h$a */
    /* compiled from: ListBuilder.kt */
    public static final class C13439a {
        private C13439a() {
        }

        public /* synthetic */ C13439a(C13695i iVar) {
            this();
        }
    }

    public C13438h(Collection<?> collection2, int i) {
        C13706o.m87929f(collection2, "collection");
        this.collection = collection2;
        this.tag = i;
    }

    private final Object readResolve() {
        return this.collection;
    }

    public void readExternal(ObjectInput objectInput) {
        Collection<?> collection2;
        C13706o.m87929f(objectInput, "input");
        byte readByte = objectInput.readByte();
        byte b = readByte & 1;
        if ((readByte & -2) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i = 0;
                if (b == 0) {
                    List d = C13612s.m87735d(readInt);
                    while (i < readInt) {
                        d.add(objectInput.readObject());
                        i++;
                    }
                    collection2 = C13612s.m87732a(d);
                } else if (b == 1) {
                    Set b2 = C13625y0.m87799b(readInt);
                    while (i < readInt) {
                        b2.add(objectInput.readObject());
                        i++;
                    }
                    collection2 = C13625y0.m87798a(b2);
                } else {
                    throw new InvalidObjectException("Unsupported collection type tag: " + b + FilenameUtils.EXTENSION_SEPARATOR);
                }
                this.collection = collection2;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + FilenameUtils.EXTENSION_SEPARATOR);
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public void writeExternal(ObjectOutput objectOutput) {
        C13706o.m87929f(objectOutput, "output");
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        for (Object writeObject : this.collection) {
            objectOutput.writeObject(writeObject);
        }
    }

    public C13438h() {
        this(C13614t.m87748j(), 0);
    }
}
