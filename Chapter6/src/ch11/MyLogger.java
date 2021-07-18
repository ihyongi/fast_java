package ch11;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {

	/*
	 * java.util.logging
		자바에서 기본적으로 제공되는 log package
		파일이나 콘솔에 로그 내용을 출력할 수 있음
		jre/lib/logging.properties 파일을 편집하여 로그의 출력방식 로그 레벨을 변경 할 수 있음
		logging 패키지에서 제공하는 로그 레벨은 severe, warning, info, config, fine, finer, finest 임
		오픈소스로는 log4j를 많이 사용하고 있음

	 */
	
	//식별자
	Logger logger = Logger.getLogger("mylogger");
	private static MyLogger instance = new MyLogger();
	
	//레벨별로
	public static final String errorLog = "log.txt";
	public static final String warningLog = "warning.txt";
	public static final String fineLog = "fine.txt";
	
	private FileHandler logFile = null;
	private FileHandler warningFile = null;
	private FileHandler fineFile = null;

	private MyLogger(){
	
			try {
				logFile = new FileHandler(errorLog, true);
				warningFile = new FileHandler(warningLog, true);
				fineFile = new FileHandler(fineLog, true);
				
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			logFile.setFormatter(new SimpleFormatter());
			warningFile.setFormatter(new SimpleFormatter());
			fineFile.setFormatter(new SimpleFormatter());
			
			logger.setLevel(Level.ALL); //로그 다찍겠다
			fineFile.setLevel(Level.FINE); //파인레벨부터 찍어라
			warningFile.setLevel(Level.WARNING); //warning부터 찍어라
			
			logger.addHandler(logFile);
			logger.addHandler(warningFile);
			logger.addHandler(fineFile);
	}	
	
	
	public static MyLogger getLogger(){
		
		return instance;
	}

	
	public void log(String msg){
		
		logger.finest(msg);
		logger.finer(msg);
		logger.fine(msg);
		logger.config(msg);
		logger.info(msg);
		logger.warning(msg);
		logger.severe(msg);
		
	}
	
	public void fine(String msg){
		logger.fine(msg);
	}
	
	public void warning(String msg){
		logger.warning(msg);
	}

}
