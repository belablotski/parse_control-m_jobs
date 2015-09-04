package com.beloblotskiy.controlm.job.parser.model

/**
 * @author abelablotski
 */
case class Job (dataCenter: DataCenter, 
    table: Table, 
    application: String, 
    jobName: String,
    cyclic: Boolean,
    cyclicType: String,
    description: Option[String],
    taskType: String,
    controls: List[Control],
    inConds: List[InCond],
    outConds: List[OutCond]) {
  
}