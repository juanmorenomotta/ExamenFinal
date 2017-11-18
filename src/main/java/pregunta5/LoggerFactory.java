package pregunta5;

public class LoggerFactory {
    
    public Logger log(String message, LogType logType) {
    	
    	Logger loggerCategory = null;
    	loggerCategory = new Logger(message); 
    	loggerCategory.log(message, logType);

        return loggerCategory;
    }
}
