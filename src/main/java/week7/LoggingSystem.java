package week7;
//classes, records, lambdas
interface Logger{
    void logMessage(String message);
}
record RecordLogger(String name)implements Logger{
    @Override
    public void logMessage(String message){
        System.out.println("RecordLogger [" + name + "]: " + message);
    }
}
class ClassLogger implements Logger{
    private String name;
    public ClassLogger(String name){
        this.name=name;
    }
    @Override
    public void logMessage(String message){
        System.out.println("ClassLogger ["+ getName()+ "]: "+ message);
    }
    public String getName() {
        return name;
    }

}

public class LoggingSystem {
    public static void main(String[] args) {
        // Instantiate RecordLogger and log messages using lambda function
        Logger recordLogger = new RecordLogger("RecordLogger");
        recordLogger.logMessage("This is a record-based log message");

        // Instantiate ClassLogger and log messages using lambda function
        Logger classLogger = new ClassLogger("ClassLogger");
        classLogger.logMessage("This is a class-based log message");
    }
}
