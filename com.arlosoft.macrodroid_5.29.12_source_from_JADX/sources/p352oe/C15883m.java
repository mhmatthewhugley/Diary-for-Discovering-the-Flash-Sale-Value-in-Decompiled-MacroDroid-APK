package p352oe;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* renamed from: oe.m */
/* compiled from: Ser */
final class C15883m implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    private Object object;
    private byte type;

    public C15883m() {
    }

    /* renamed from: a */
    static Object m95769a(DataInput dataInput) throws IOException {
        return m95770b(dataInput.readByte(), dataInput);
    }

    /* renamed from: b */
    private static Object m95770b(byte b, DataInput dataInput) throws IOException {
        if (b == 64) {
            return C15873i.m95701C(dataInput);
        }
        switch (b) {
            case 1:
                return C15857c.m95502j(dataInput);
            case 2:
                return C15858d.m95510T(dataInput);
            case 3:
                return C15861e.m95536F0(dataInput);
            case 4:
                return C15864f.m95604t0(dataInput);
            case 5:
                return C15867g.m95650Y(dataInput);
            case 6:
                return C15895s.m95867c0(dataInput);
            case 7:
                return C15894r.m95855C(dataInput);
            case 8:
                return C15892q.m95837J(dataInput);
            default:
                switch (b) {
                    case 66:
                        return C15880k.m95746E(dataInput);
                    case 67:
                        return C15884n.m95773G(dataInput);
                    case 68:
                        return C15887o.m95796J(dataInput);
                    case 69:
                        return C15876j.m95717H(dataInput);
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    /* renamed from: c */
    static void m95771c(byte b, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b);
        if (b != 64) {
            switch (b) {
                case 1:
                    ((C15857c) obj).mo75656k(dataOutput);
                    return;
                case 2:
                    ((C15858d) obj).mo75666X(dataOutput);
                    return;
                case 3:
                    ((C15861e) obj).mo75697P0(dataOutput);
                    return;
                case 4:
                    ((C15864f) obj).mo75722A0(dataOutput);
                    return;
                case 5:
                    ((C15867g) obj).mo75773k0(dataOutput);
                    return;
                case 6:
                    ((C15895s) obj).mo75888s0(dataOutput);
                    return;
                case 7:
                    ((C15894r) obj).mo75870E(dataOutput);
                    return;
                case 8:
                    ((C15892q) obj).mo75867P(dataOutput);
                    return;
                default:
                    switch (b) {
                        case 66:
                            ((C15880k) obj).mo75815N(dataOutput);
                            return;
                        case 67:
                            ((C15884n) obj).mo75833L(dataOutput);
                            return;
                        case 68:
                            ((C15887o) obj).mo75849U(dataOutput);
                            return;
                        case 69:
                            ((C15876j) obj).mo75801V(dataOutput);
                            return;
                        default:
                            throw new InvalidClassException("Unknown serialized type");
                    }
            }
        } else {
            ((C15873i) obj).mo75785E(dataOutput);
        }
    }

    private Object readResolve() {
        return this.object;
    }

    public void readExternal(ObjectInput objectInput) throws IOException {
        byte readByte = objectInput.readByte();
        this.type = readByte;
        this.object = m95770b(readByte, objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        m95771c(this.type, this.object, objectOutput);
    }

    C15883m(byte b, Object obj) {
        this.type = b;
        this.object = obj;
    }
}
