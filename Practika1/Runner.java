package by.gsu.pms;

public class Runner {

    public static void main(String[] args) {
        businessTrip[] costs = {
                new businessTrip("Vlad", 20, 4),
                new businessTrip("Daniil", 60, 20),
                null,
                new businessTrip("Afanaciy", 42, 6),
                new businessTrip("Anton", 15, 3),
                new businessTrip("Petya", 90, 30),
                new businessTrip(),
        };

        for (businessTrip cost : costs) {
            if (cost != null) {
                cost.show();
            }
        }

        costs[costs.length - 1].setTransport(5);

        System.out.println("Duration = " + (costs[0].getDays() + costs[1].getDays()));

        for (businessTrip cost : costs) {
            System.out.println(cost);
        }

        int sum = 0;
        for (businessTrip cost : costs) {
            if (cost != null) {
                sum += cost.getTotal();
            }
        }
        System.out.println("Total expenses = " + sum);

        int maxTotal = 0;
        String account = "";
        for (businessTrip cost : costs) {
            if (cost != null && cost.getTotal() > maxTotal) {
                account = cost.getAccount();
            }
        }
        System.out.println(account);
    }
}
