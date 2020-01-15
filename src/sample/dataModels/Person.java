package sample.dataModels;

public class Person {

    public enum statusOptions {
        NO_STATUS,
        WORKING,
        HOLD,
        AUTH_HOLD,
        READY,
        COMPLETE
    };

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private statusOptions status;
    private String statusString;


    public Person(String firstName, String lastName, String phoneNumber, statusOptions status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.setStatus(status);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public statusOptions getStatus() {
        return status;
    }

    public void setStatus(statusOptions status) {
        this.status = status;
        setStatusString(status);
    }git a

    public String getStatusString() {
        return statusString;
    }

    public void setStatusString(statusOptions status) {
        switch (status) {
            case HOLD:
                this.statusString = "General Hold";
                break;
            case READY:
                this.statusString = "Vehicle Ready";
                break;
            case WORKING:
                this.statusString = "Tech Working";
                break;
            case COMPLETE:
                this.statusString = "Repairs Complete";
                break;
            case AUTH_HOLD:
                this.statusString = "Authorization Hold";
                break;
            case NO_STATUS:
                this.statusString = "";
                break;
        }
    }
}
