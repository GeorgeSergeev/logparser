package alvioneurope.gsergeev.javagroup.clientlogimporter;

/**
 * Created by GSergeev on 11/16/2015.
 */
public class MethodInfo {
    private String className;
    private String methodName;
    private String sourcePath;
    private Integer lineNumber;
    private Boolean methodInfo;

    public MethodInfo(String source) {
        this.methodInfo=splitString(source);
    }
    public boolean checkingClosedBrackets(String string){
        if((string.indexOf('(')!=-1&&string.indexOf(')')!=-1)||(string.indexOf('(')==-1&&string.indexOf(')')==-1))
            return true;
        else
            if(string.indexOf('(')!=-1&&string.indexOf(')')==-1)
                return false;
        return false;
    }
    public boolean checkingStringToAnInt(String string){
        if(string==null||string.length()==0)
            return false;
        else {
            char a;
            for (int i=0;i<string.length();i++){
                a=string.charAt(i);
                if(!(a>='0'&&a<='9')) {
                    return false;
                }
            }
            return true;
        }
    }
    public boolean splitString(String source) {
        if (source == null || source.length() == 0 || source.indexOf("Debug:") == -1)
            return false;
        if (source.indexOf("RequestId") != -1) {
            String splitSource[] = source.split(" ");
            for (int i = 0; i < splitSource.length; i++) {
                if (splitSource.length > (i + 1) && splitSource[i].compareTo("Debug:") == 0) {
                    String[] splitSplitSource = splitSource[i+1].split("::");
                    className = splitSplitSource[0];
                    methodName = splitSplitSource[1];
                    return true;
                }
            }
        }
        else
            if(source.indexOf("void")!=-1)
        {
            String splitSource[] = source.split(" ");
            for (int i = 0; i < splitSource.length; i++) {
                if (splitSource.length > (i + 1) && splitSource[i].compareTo("void") == 0) {
                    String splitSplitSource[] = splitSource[i + 1].split("::");
                    className = splitSplitSource[0];
                    if (checkingClosedBrackets(splitSplitSource[1]))
                        methodName = splitSplitSource[1];
                    else {
                        methodName = splitSplitSource[1] + splitSource[i + 2];
                    }
                }
                if (splitSource.length > (i + 1) && splitSource[i].startsWith("..")) {
                    sourcePath = splitSource[i];
                    if (checkingStringToAnInt(splitSource[i + 1]))
                        lineNumber = Integer.parseInt(splitSource[i + 1]);
                }
            }
            return true;
        }
        return false;
    }
    public String getClassName(){
        return className;
    }
    public String getMethodName(){
        return methodName;
    }
    public String getSourcePath(){
        return sourcePath;
    }
    public Integer getLineNumber(){
        return lineNumber;
    }
    public Boolean getMethodInfo(){
        return methodInfo;
    }
}
