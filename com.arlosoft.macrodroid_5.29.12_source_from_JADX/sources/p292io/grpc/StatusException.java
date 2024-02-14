package p292io.grpc;

/* renamed from: io.grpc.StatusException */
public class StatusException extends Exception {
    private static final long serialVersionUID = -660954903976144640L;
    private final boolean fillInStackTrace;
    private final C12537b1 status;
    private final C12960q0 trailers;

    public StatusException(C12537b1 b1Var) {
        this(b1Var, (C12960q0) null);
    }

    /* renamed from: a */
    public final C12537b1 mo69022a() {
        return this.status;
    }

    public synchronized Throwable fillInStackTrace() {
        return this.fillInStackTrace ? super.fillInStackTrace() : this;
    }

    public StatusException(C12537b1 b1Var, C12960q0 q0Var) {
        this(b1Var, q0Var, true);
    }

    StatusException(C12537b1 b1Var, C12960q0 q0Var, boolean z) {
        super(C12537b1.m83682g(b1Var), b1Var.mo69061l());
        this.status = b1Var;
        this.trailers = q0Var;
        this.fillInStackTrace = z;
        fillInStackTrace();
    }
}
