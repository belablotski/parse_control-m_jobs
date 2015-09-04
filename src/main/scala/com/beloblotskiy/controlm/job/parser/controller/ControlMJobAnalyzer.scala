package com.beloblotskiy.controlm.job.parser.controller

import javax.servlet.http._
import scala.xml.NodeSeq
import com.beloblotskiy.controlm.job.parser.model.Parser

/**
 * @author abelablotski
 */
class ControlMJobAnalyzer extends HttpServlet {
  
  override def doGet(request: HttpServletRequest, response:HttpServletResponse) {
    response.setContentType("text/html")
    response.setCharacterEncoding("UTF-8")
    
    val jobs = List();
    
    val responseBody: NodeSeq =
      <html><body><p>{jobs.length}</p></body></html>
    response.getWriter.write(responseBody.toString)
  }
}