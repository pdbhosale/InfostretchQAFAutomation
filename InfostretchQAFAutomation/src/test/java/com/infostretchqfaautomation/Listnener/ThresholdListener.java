package com.infostretchqfaautomation.Listnener;

import com.qmetry.qaf.automation.step.QAFTestStepAdapter;
import com.qmetry.qaf.automation.step.StepExecutionTracker;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;

public class ThresholdListener extends QAFTestStepAdapter {

	@Override
    public void afterExecute(StepExecutionTracker stepExecutionTracker) {
	long duration = (stepExecutionTracker.getEndTime() - stepExecutionTracker.getStartTime()) / 1000;
        if (stepExecutionTracker.getStep().getThreshold() > duration)
            stepExecutionTracker.setVerificationError("Threshold value is exceed");
    }

}
