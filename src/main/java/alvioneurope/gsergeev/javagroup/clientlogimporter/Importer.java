package alvioneurope.gsergeev.javagroup.clientlogimporter;

import java.util.List;

/**
 * Created by GSergeev on 11/16/2015.
 */
public class Importer {
   private List<PrimaryLogRecord> logRecordList;

   public Importer (String fileName) {

   };

   public List<PrimaryLogRecord> getLogRecordList() {
      return logRecordList;
   }
}
