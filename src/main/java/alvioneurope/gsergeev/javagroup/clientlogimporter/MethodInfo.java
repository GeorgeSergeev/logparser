package alvioneurope.gsergeev.javagroup.clientlogimporter;

/**
 * Created by GSergeev on 11/16/2015.
 */
public class MethodInfo {
	private String className;
    private String methodName;
    private String sourcePath;
    private Integer lineNumber;
    
    public boolean splitString(String str){
    	if (str.indexOf("void") == -1) return false;
    	else{
    		String splitStr[] = str.split(" ");
    		for (int i=0;i<splitStr.length; i++){
    			if (splitStr[i].compareTo("void")== 0) {
    				className = splitStr[i+1].substring(0, splitStr[i+1].indexOf("::"));
    				methodName = splitStr[i+1].substring(splitStr[i+1].indexOf("::")+2, splitStr[i+1].indexOf("("));
    			}
    			if (splitStr[i].indexOf("..") != -1)
    				sourcePath = splitStr[i].replaceAll("\"", "");
    			if (splitStr[i].indexOf("\"") != -1)
    				sourcePath = splitStr[i].concat("/"+splitStr[i+1]).replaceAll("\"", "");
    			if ((i!=0) && splitStr[i-1].indexOf("..") != -1) 
    				lineNumber = Integer.parseInt(splitStr[i]);	
    		}
    		return true;
    	}
    }

    public MethodInfo(String source) {
    	try{
    		if (!splitString(source)){
    			throw new Exception();
    		}
    	}
    	catch (Exception e){

    	}
    }

	public String getClassName() {
		return className;
	}

	public String getMethodName() {
		return methodName;
	}

	public String getSourcePath() {
		return sourcePath;
	}

	public Integer getLineNumber() {
		return lineNumber;
	}

}
