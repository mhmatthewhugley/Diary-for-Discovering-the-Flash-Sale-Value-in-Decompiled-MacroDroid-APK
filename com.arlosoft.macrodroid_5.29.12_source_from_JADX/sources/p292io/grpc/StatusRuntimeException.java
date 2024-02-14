package p292io.grpc;

/* renamed from: io.grpc.StatusRuntimeException */
public class StatusRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    private final boolean fillInStackTrace;
    private final C12537b1 status;
    private final C12960q0 trailers;

    public StatusRuntimeException(C12537b1 b1Var) {
        this(b1Var, (C12960q0) null);
    }

    /* renamed from: a */
    public final C12537b1 mo69024a() {
        return this.status;
    }

    public synchronized Throwable fillInStackTrace() {
        return this.fillInStackTrace ? super.fillInStackTrace() : this;
    }

    public StatusRuntimeException(C12537b1 b1Var, C12960q0 q0Var) {
        this(b1Var, q0Var, true);
    }

    StatusRuntimeException(C12537b1 b1Var, C12960q0 q0Var, boolean z) {
        super(C12537b1.m83682g(b1Var), b1Var.mo69061l());
        this.status = b1Var;
        this.trailers = q0Var;
        this.fillInStackTrace = z;
        fillInStackTrace();
    }
}
