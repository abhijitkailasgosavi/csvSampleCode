package ocg.fileIoUtils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import ocg.fileIoUtils.CsvReader;

public interface XLSWriter {
	public void addCrfDetails(String crfName);

	public void addItem(XLSReader xlsReader, CsvReader csvReader, Integer itemCount);

	public void addResponseTextAndValue(String answer, String answerId, String answerValue);

	public void addResponseTextAndValue(String parentId, String answer, String answerId, String answerValue);

	public void crfWriter(HSSFWorkbook samplecrf);

	public void close();
}