package alvioneurope.gsergeev.javagroup.clientlogimporter;

/**
 * Created by GSergeev on 11/16/2015.
 */
public class MethodInfo {
	private String className;
    private String methodName;
    private String sourcePath;
    private Integer lineNumber;

    public MethodInfo(String source) {

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
