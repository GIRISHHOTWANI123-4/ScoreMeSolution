import java.util.*;
public class UserOnboardingProcess implements Process{

    private final List<ProcessStep> processStepList = new ArrayList<>();

    public void addStep(ProcessStep step) {
        processStepList.add(step);
    }

    public void execute(Context context) {
        for (ProcessStep step : processStepList) {
            System.out.println("Executing step: " + step.getName());
            step.execute(context);
        }
    }
}
