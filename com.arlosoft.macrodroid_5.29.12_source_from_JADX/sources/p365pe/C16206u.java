package p365pe;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* renamed from: pe.u */
/* compiled from: Ser */
final class C16206u implements Externalizable {
    private static final long serialVersionUID = 7857518227608961174L;
    private Object object;
    private byte type;

    public C16206u() {
    }

    /* renamed from: a */
    private static Object m97407a(byte b, ObjectInput objectInput) throws IOException, ClassNotFoundException {
        switch (b) {
            case 1:
                return C16198p.m97315e0(objectInput);
            case 2:
                return C16200q.m97348A(objectInput);
            case 3:
                return C16191k.m97223S0(objectInput);
            case 4:
                return C16193l.m97277m(objectInput);
            case 5:
                return C16203s.m97368e0(objectInput);
            case 6:
                return C16205t.m97399j(objectInput);
            case 7:
                return C16209w.m97420e0(objectInput);
            case 8:
                return C16211x.m97451j(objectInput);
            case 11:
                return C16187h.m97192q(objectInput);
            case 12:
                return C16179d.m97136c0(objectInput);
            case 13:
                return C16185g.m97179U(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    /* renamed from: b */
    private static void m97408b(byte b, Object obj, ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((C16198p) obj).mo78691r0(objectOutput);
                return;
            case 2:
                ((C16200q) obj).mo78693G(objectOutput);
                return;
            case 3:
                ((C16191k) obj).mo78667W0(objectOutput);
                return;
            case 4:
                ((C16193l) obj).mo78671t(objectOutput);
                return;
            case 5:
                ((C16203s) obj).mo78709m0(objectOutput);
                return;
            case 6:
                ((C16205t) obj).mo78710m(objectOutput);
                return;
            case 7:
                ((C16209w) obj).mo78726m0(objectOutput);
                return;
            case 8:
                ((C16211x) obj).mo78727m(objectOutput);
                return;
            case 11:
                ((C16187h) obj).mo78649t(objectOutput);
                return;
            case 12:
                ((C16179d) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((C16185g) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.object;
    }

    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte readByte = objectInput.readByte();
        this.type = readByte;
        this.object = m97407a(readByte, objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        m97408b(this.type, this.object, objectOutput);
    }

    C16206u(byte b, Object obj) {
        this.type = b;
        this.object = obj;
    }
}
