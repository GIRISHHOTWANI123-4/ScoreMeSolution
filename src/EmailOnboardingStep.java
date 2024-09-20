public class EmailOnboardingStep implements ProcessStep{
    public void execute(Context context) {
        System.out.println("Executing Email Onboarding Step");
        context.set("emailOnboarded",true);
    }
    public String getName(){
        return "Email Onboarding";
    }
}
