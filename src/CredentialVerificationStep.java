public class CredentialVerificationStep implements ProcessStep {
    private final String credentialType;
    public CredentialVerificationStep(String credentialType) {
        this.credentialType = credentialType;
    }

    public void execute(Context context) {
        System.out.println("Verifying credentials for: " + credentialType);
        context.set("credentialVerified", true);
    }
    public String getName() {
        return credentialType + " Credential Verification";
    }
}
