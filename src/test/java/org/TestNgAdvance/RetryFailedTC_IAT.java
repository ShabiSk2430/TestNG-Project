package org.TestNgAdvance;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryFailedTC_IAT implements IAnnotationTransformer{
	public void transform(
		      ITestAnnotation annotation) {
		annotation.setRetryAnalyzer(RetryFailedTC.class);
		  }
	

}
