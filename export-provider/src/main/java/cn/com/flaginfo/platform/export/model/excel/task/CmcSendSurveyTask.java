package cn.com.flaginfo.platform.export.model.excel.task;

import cn.com.flaginfo.platform.export.model.ExportResult;
import cn.com.flaginfo.platform.export.model.ExportTask;
import cn.com.flaginfo.platform.export.model.excel.ExcelJsonWriter;
import cn.com.flaginfo.platform.export.model.excel.ExcelWriter;
import cn.com.flaginfo.platform.export.model.excel.policy.CmcSendSurveyPolicy;
import cn.com.flaginfo.platform.export.model.excel.policy.Policy;

public class CmcSendSurveyTask extends ExportTask{

	@Override
	public void execute() {
		ExportResult result = new ExportResult();
		//设置导出策略
		Policy policy = new CmcSendSurveyPolicy(this);
		//设置导出writer
		ExcelWriter writer = new ExcelJsonWriter(this,policy);
		writer.setResult(result);
		//执行导出
		excuteTask(writer, policy, this, result);		
	}
	
}
