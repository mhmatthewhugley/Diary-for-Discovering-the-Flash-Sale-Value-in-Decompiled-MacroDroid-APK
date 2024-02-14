package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.C14478a;
import kotlin.reflect.jvm.internal.impl.protobuf.C14516o;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b */
/* compiled from: AbstractParser */
public abstract class C14481b<MessageType extends C14516o> implements C14519q<MessageType> {

    /* renamed from: a */
    private static final C14490f f63323a = C14490f.m90910c();

    /* renamed from: e */
    private MessageType m90818e(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.mo71013a()) {
            return messagetype;
        }
        throw m90819f(messagetype).mo73278a().mo73277i(messagetype);
    }

    /* renamed from: f */
    private UninitializedMessageException m90819f(MessageType messagetype) {
        if (messagetype instanceof C14478a) {
            return ((C14478a) messagetype).mo73279h();
        }
        return new UninitializedMessageException(messagetype);
    }

    /* renamed from: g */
    public MessageType mo73287d(InputStream inputStream, C14490f fVar) throws InvalidProtocolBufferException {
        return m90818e(mo73291j(inputStream, fVar));
    }

    /* renamed from: h */
    public MessageType mo73285a(InputStream inputStream, C14490f fVar) throws InvalidProtocolBufferException {
        return m90818e(mo73292k(inputStream, fVar));
    }

    /* renamed from: i */
    public MessageType mo73286b(C14485d dVar, C14490f fVar) throws InvalidProtocolBufferException {
        return m90818e(mo73293l(dVar, fVar));
    }

    /* renamed from: j */
    public MessageType mo73291j(InputStream inputStream, C14490f fVar) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return mo73292k(new C14478a.C14479a.C14480a(inputStream, C14488e.m90863B(read, inputStream)), fVar);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e.getMessage());
        }
    }

    /* renamed from: k */
    public MessageType mo73292k(InputStream inputStream, C14490f fVar) throws InvalidProtocolBufferException {
        C14488e g = C14488e.m90871g(inputStream);
        MessageType messagetype = (C14516o) mo71021c(g, fVar);
        try {
            g.mo73341a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.mo73277i(messagetype);
        }
    }

    /* renamed from: l */
    public MessageType mo73293l(C14485d dVar, C14490f fVar) throws InvalidProtocolBufferException {
        MessageType messagetype;
        try {
            C14488e q = dVar.mo73315q();
            messagetype = (C14516o) mo71021c(q, fVar);
            q.mo73341a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.mo73277i(messagetype);
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }
}
