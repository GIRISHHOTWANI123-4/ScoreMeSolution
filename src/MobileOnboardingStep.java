public class MobileOnboardingStep implements ProcessStep{
    public void execute(Context context) {
        System.out.println("Executing Mobile Onboarding Step");
        context.set("mobileOnboarded",true);
    }
    public String getName(){
        return "Mobile Onboarding";
    }
}
