public class AccountExistenceVerificationStep implements ProcessStep{
    public void execute(Context context) {
        System.out.println("Checking if account exists");
        context.set("accountExists", true);
    }

    public String getName() {
        return "Account Existence Verification";
    }
}
