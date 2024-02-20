import java.util.Arrays;

class Demo15 {
    void main(String[] args) {
        final String CUSTOMERS[][] = {
                {"1", "kasun", "0715194017", "0112100100"},
                {"2", "nuwan", "0715194018", ""},
                {"3", "ruwan", "0715194019", "0112100102"},
                {"4", "supun", "0715194016", "0112100103"}
        };
        final String LINE = STR."+\{"-".repeat(5)}+\{"-".repeat(8)}+\{"-"
                .repeat(15)}+\{"-".repeat(15)}+";
        final String HEADER = "\033[43;1m|%-5s|%-8s|%-15s|%-15s|\033[0m"
                .formatted("ID", "NAME", "Tel", "Contact");
        final String ROW = "|%-5s|%-8s|%-15s|%15s|\n";
        System.out.println(LINE);
        System.out.println(HEADER);
        System.out.println(LINE);

        for (String customerDetail[] : CUSTOMERS) {
            String id = customerDetail[0];
            String name = customerDetail[1];
            String tel = customerDetail[2];
            String contact = customerDetail[3];

            System.out.printf(ROW, getId(id), name, tel, getContact(contact));


        }

    }

    String getId(String id) {
        return "C%03d".formatted(Integer.parseInt(id));
    }

    String getContact(String contact) {
        return contact.isEmpty() ? "-" : contact;
    }

}