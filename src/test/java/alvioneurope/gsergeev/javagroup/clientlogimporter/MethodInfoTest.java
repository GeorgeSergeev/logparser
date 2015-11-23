package alvioneurope.gsergeev.javagroup.clientlogimporter;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Shushpan P. on 21.11.2015.
 */
public class MethodInfoTest {
    private MethodInfo testMethodInfo1;
    private MethodInfo testMethodInfo2;
    private MethodInfo testMethodInfo3;
    private MethodInfo testMethodInfo4;
    private MethodInfo testMethodInfo5;

    @Before
    public void setUp(){
        testMethodInfo1=new MethodInfo("2015-11-09 10:33:21.542 Debug: CommandRunner::runCommand start  RequestId  \"19216805118520151109073321000004\"  commandId  560  commandName  \"OrgElementFlatGet\"  timeout  -1  requestLength  332  operationId  \"d65dfbc7de5444d2bfed7a6d6903508a|35339af3414a4e2cbc217d19a93d8bc4\"");
        testMethodInfo2=new MethodInfo("2015-11-09 10:33:20.695 Debug: InitComponents and started");
        testMethodInfo3=new MethodInfo("2015-11-09 10:38:57.422 Debug: virtual void QMangoListForm::lockToolBar() ..\\mango_crm\\ui\\core\\qmangolistform.cpp 573 Lock list toolbar and control forms. LockCounter is   1");
        testMethodInfo4=new MethodInfo("2015-11-10 11:38:08.029 Debug: void PhoneDialPanel::on_edtDigit_textChanged(const QString&) 1");
        testMethodInfo5=new MethodInfo("Test.");
    }
    @Test
    public void testSplitString(){
        assertTrue(testMethodInfo1.getMethodInfo());
        assertFalse(testMethodInfo2.getMethodInfo());
        assertTrue(testMethodInfo3.getMethodInfo());
        assertTrue(testMethodInfo4.getMethodInfo());
        assertFalse(testMethodInfo5.getMethodInfo());
    }
}

