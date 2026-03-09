package session2.lession5;

public class SuperAdmin implements UserActions,AdminActions {
    @Override
    public void logActivity(String activity) {
        System.out.println("SuperAdmin log: "+activity);

        UserActions.super.logActivity(activity);
        AdminActions.super.logActivity(activity);
    }
}
