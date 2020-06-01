package pattern.CoR;

/**
 * 责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。
 * 这种模式给予请求的类型，对请求的发送者和接收者进行解耦。
 * 行为型模式。
 * 通常每个接收者都包含对另一个接收者的引用。
 * 如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。
 */
public abstract class AbstractLogger {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    protected int level;

    protected AbstractLogger nextLogger;
    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger=nextLogger;
    }
    public void logMessage(int level,String message){
        if (this.level<=level){
            write(message);
        }
        if (nextLogger!=null){
            nextLogger.logMessage(level,message);
        }
    }

    abstract protected void write(String message);
}
