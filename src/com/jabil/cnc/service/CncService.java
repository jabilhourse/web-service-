package com.jabil.cnc.service;

import java.util.Date;


public interface CncService {
	
   //JABIL系统用户帐号是否存在验证
	public void CheckJabilAccount(String NT);
	
    //登陆验证用户名密码
    public void CheckLogin(String Factory,String UserID,String UserPas);

	//主页设备状态汇总+设备当日平均稼动率+设备当日总产量+使用率
	public String GetEQPHome(String Factory, Date StartTime);;
	
	//手机端设备详情(状态、产出、嫁动率、设备各种状态累计时间、两小时产出,两小时达成率);
    public String GetEQPDetails(String Factory,String EQPID, Date StartTime);;
   
    //电子看板（设备两小时产出）
    public String GetEQPOutputByTwoHours(String Factory);
   
    //设备实时情况（只有最新一条数据）
    public String GetEqpRealInfor(String Factory, String EQPID, Date StartTime);
   
    //主页设备状态汇总-暂不用
    public String GetEQPStatusSummaryBK(String Factory);
  
    //主页设备状态汇总
    public String GetEQPStatusSummary(String Factory);
   
    //主页获取设备当前状态的持续时间
    public String GetEQPStatusTime(String Factory);
   
    //主页区域产量
    public String GetOutputByArea(String Factory, Date workdate, int shiftNo);
   
    //主页设备状态详情(每台设备实时情况);
    public String GetEQPStatusDetail(String Factory, String Floor, String Area, String EQPID, String Status, Date StartTime);
    
    public String GetEQPOutputSummary(String Factory, Date StartTime);
   
    public String GetUtilizationRateAvg(String Factory, Date StartTime);
   
    public String GetCNCToolingLife(String Factory, String Floor, String Area, String EQPID, String TypeStr, Date StartTime);
    
    public String GetCNCEqpException(String Factory, Date StartTime);

    public String GetToolingLifeHistory(String Factory, String EQPID, String ToolID, Date StartTime, Date EndTime);

    //过程参数查询
    public String GetEqpParameterHistory(String Factory, String Floor, String Area, String EQPID, Date StartTime, Date EndTime);

    //异常主轴参数TOP10
    public String EqpParameterExecption(String Factory,String EQPID, Date StartTime);

    //产量分析
    public String GetEQPOutputsQuery(String Factory, String Floor, String Area, String EQPID, Date StartTime, Date EndTime, String strType);

    //稼动率分析
    public String GetUtilizationRateQuery(String Factory, String Floor, String Area, String EQPID, Date StartTime, Date EndTime, String strType);
    
    // 稼动率分析按区域
    public String GetUtilizationRateQueryArea(String Factory, String Floor, String Area, String EQPID, Date StartTime, Date EndTime, String strType);
   
    //状态分析Total
    public String GetEQPStatusQuery_Total(String Factory,String EQPID, Date StartTime, Date EndTime);

    //状态分析Detail
    public String GetEQPStatusQuery_Detail(String Factory, String EQPID, Date StartTime, Date EndTime);
    
    //状态分析-BK
    public String GetEQPStatusQuery(String Factory, String Floor, String Area, String EQPID, Date StartTime, Date EndTime, String strType);
   
    //异常分析
    public String GetEQPExceptionQuery(String Factory, String Floor, String Area, String EQPID, Date StartTime, Date EndTime);

    //生产报表 strType=0早班，1晚班，2早班+晚班
    public String GetEQPOutput_Detail(String Factory, String Floor, String Area, String EQPID, Date WorkDate);
   
    /// <summary>
    /// 异常信息推送
    /// </summary>
    /// <returns></returns>
    public String GetPushInfo(String Factory);
   
}

