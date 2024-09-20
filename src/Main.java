public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        UserOnboardingProcess onboardingProcess = new UserOnboardingProcess();
        onboardingProcess.addStep(new MobileOnboardingStep());
        onboardingProcess.addStep(new CredentialVerificationStep("Aadhaar"));
        onboardingProcess.addStep(new AccountExistenceVerificationStep());

        onboardingProcess.execute(context);


    }
}
