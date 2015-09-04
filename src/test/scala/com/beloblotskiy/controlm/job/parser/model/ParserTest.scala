package com.beloblotskiy.controlm.job.parser.model

import scala.io.Source
import org.junit.Test
import org.junit.Assert._

/**
 * @author abelablotski
 */
class ParserTest {
  
  @Test
  def test1() = {
    val testJobXml = Source.fromURL(getClass.getResource("/single_job1.xml")).mkString
    
    val jobs = Parser.parse(testJobXml)
    assertTrue("Check number of elements in a list", jobs.length == 1)
    
    val job = jobs.head
    assertTrue("Check application name", job.application == "CTM_APP1")
    assertTrue("Check job.name", job.jobName == "CTM_JOB_NAME1")
    assertTrue("Check job.cyclic", !job.cyclic)
    assertTrue("Check job.cyclicType", job.cyclicType == "Interval")
    assertTrue("Check job.description", job.description.get == "Ctm Test Job 1")
    assertTrue("Check job.taskType", job.taskType == "Job")
    
    assertTrue("Check job.controls.length", job.controls.length == 1)
    assertTrue("Check job.controls.head.name", job.controls.head.name == "TEST_CONTROL1-RES")
    assertTrue("Check job.controls.head.controlType", job.controls.head.controlType == "E")
    
    assertTrue("Check job.inConds.length", job.inConds.length == 1)
    assertTrue("Check job.inConds.head.name", job.inConds.head.name == "INCOND1-ENDED")
    assertTrue("Check job.inConds.head.andOr", job.inConds.head.andOr == "AND")
    assertTrue("Check job.inConds.head.oDate", job.inConds.head.oDate == "STAT")
    
    assertTrue("Check job.outConds.length", job.outConds.length == 1)
    assertTrue("Check job.outConds.head.name", job.outConds.head.name == "OUTCOND1-ENDED")
    assertTrue("Check job.outConds.head.andOr", job.outConds.head.sign == "DEL")
    assertTrue("Check job.outConds.head.oDate", job.outConds.head.oDate == "STAT")
  }
  
  @Test
  def test2() = {
    val testJobXml = Source.fromURL(getClass.getResource("/single_job2.xml")).mkString
    
    val jobs = Parser.parse(testJobXml)
    assertTrue("Check number of elements in a list", jobs.length == 1)
    
    val job = jobs.head
    assertTrue("Check application name", job.application == "CTM_APP1")
    assertTrue("Check job.name", job.jobName == "CTM_JOB_NAME1")
    assertTrue("Check job.cyclic", !job.cyclic)
    assertTrue("Check job.cyclicType", job.cyclicType == "Interval")
    assertTrue("Check job.description", job.description.get == "Ctm Test Job 1")
    assertTrue("Check job.taskType", job.taskType == "Job")
    
    assertTrue("Check job.controls.length", job.controls.length == 2)
    assertTrue("Check job.controls(0).name", job.controls(0).name == "TEST_CONTROL1-RES")
    assertTrue("Check job.controls(0).controlType", job.controls(0).controlType == "E")
    assertTrue("Check job.controls(1).name", job.controls(1).name == "TEST_CONTROL2-RES")
    assertTrue("Check job.controls(1).controlType", job.controls(1).controlType == "E")
    
    assertTrue("Check job.inConds.length", job.inConds.length == 2)
    assertTrue("Check job.inConds(0).name", job.inConds(0).name == "INCOND1-ENDED")
    assertTrue("Check job.inConds(0).andOr", job.inConds(0).andOr == "AND")
    assertTrue("Check job.inConds(0).oDate", job.inConds(0).oDate == "STAT")
    assertTrue("Check job.inConds(1).name", job.inConds(1).name == "INCOND2-ENDED")
    assertTrue("Check job.inConds(1).andOr", job.inConds(1).andOr == "AND")
    assertTrue("Check job.inConds(1).oDate", job.inConds(1).oDate == "STAT")
    
    assertTrue("Check job.outConds.length", job.outConds.length == 2)
    assertTrue("Check job.outConds(0).name", job.outConds(0).name == "OUTCOND1-ENDED")
    assertTrue("Check job.outConds(0).andOr", job.outConds(0).sign == "DEL")
    assertTrue("Check job.outConds(0).oDate", job.outConds(0).oDate == "STAT")
    assertTrue("Check job.inConds(1).name", job.inConds(1).name == "INCOND2-ENDED")
    assertTrue("Check job.inConds(1).andOr", job.inConds(1).andOr == "AND")
    assertTrue("Check job.inConds(1).oDate", job.inConds(1).oDate == "STAT")
  }
}