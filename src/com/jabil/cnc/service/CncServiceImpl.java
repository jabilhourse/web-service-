package com.jabil.cnc.service;

import java.util.Date;

import javax.jws.WebService;

@WebService
public class CncServiceImpl implements CncService{

	@Override
	public void CheckJabilAccount(String NT) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CheckLogin(String Factory, String UserID, String UserPas) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String GetEQPHome(String Factory, Date StartTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetEQPDetails(String Factory, String EQPID, Date StartTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetEQPOutputByTwoHours(String Factory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetEqpRealInfor(String Factory, String EQPID, Date StartTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetEQPStatusSummaryBK(String Factory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetEQPStatusSummary(String Factory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetEQPStatusTime(String Factory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetOutputByArea(String Factory, Date workdate, int shiftNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetEQPStatusDetail(String Factory, String Floor, String Area, String EQPID, String Status,
			Date StartTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetEQPOutputSummary(String Factory, Date StartTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetUtilizationRateAvg(String Factory, Date StartTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetCNCToolingLife(String Factory, String Floor, String Area, String EQPID, String TypeStr,
			Date StartTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetCNCEqpException(String Factory, Date StartTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetToolingLifeHistory(String Factory, String EQPID, String ToolID, Date StartTime, Date EndTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetEqpParameterHistory(String Factory, String Floor, String Area, String EQPID, Date StartTime,
			Date EndTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String EqpParameterExecption(String Factory, String EQPID, Date StartTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetEQPOutputsQuery(String Factory, String Floor, String Area, String EQPID, Date StartTime,
			Date EndTime, String strType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetUtilizationRateQuery(String Factory, String Floor, String Area, String EQPID, Date StartTime,
			Date EndTime, String strType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetUtilizationRateQueryArea(String Factory, String Floor, String Area, String EQPID, Date StartTime,
			Date EndTime, String strType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetEQPStatusQuery_Total(String Factory, String EQPID, Date StartTime, Date EndTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetEQPStatusQuery_Detail(String Factory, String EQPID, Date StartTime, Date EndTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetEQPStatusQuery(String Factory, String Floor, String Area, String EQPID, Date StartTime,
			Date EndTime, String strType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetEQPExceptionQuery(String Factory, String Floor, String Area, String EQPID, Date StartTime,
			Date EndTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetEQPOutput_Detail(String Factory, String Floor, String Area, String EQPID, Date WorkDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetPushInfo(String Factory) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
