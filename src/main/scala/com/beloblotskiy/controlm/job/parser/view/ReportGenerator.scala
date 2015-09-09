package com.beloblotskiy.controlm.job.parser.view

import scala.xml.NodeSeq
import com.beloblotskiy.controlm.job.parser.model.Job

/**
 * @author v-abelablotski
 */
object ReportGenerator {

  /**
   * Report about loading process.
   */
  def generateLoadingReport(loadingResults: List[(String, String, List[Job])]): NodeSeq = {
    
    def genReportRow(path: String, errorMsg: String, jobs: List[Job]): NodeSeq = {
      <td>{path}</td><td>{if (errorMsg.length == 0) "Ok" else errorMsg }</td><td>{jobs.length}</td>
    }
    
    def genReportRows(loadingResults: List[(String, String, List[Job])]): NodeSeq = {
      for {r <- loadingResults } 
        yield <tr>{genReportRow(r._1, r._2, r._3)}</tr>
    }
    
    <table border="1">
			<tr>
				<th>File</th><th>Status</th><th>Number of jobs</th>
			</tr>
			{genReportRows(loadingResults)}
		</table>
  }
  
}