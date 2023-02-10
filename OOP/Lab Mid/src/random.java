public class random {
    public static void main(String[] args) {
        int max = 6;
        int min = 0;
        int range = max - min + 1;
        int sum = 0;
        int wickets = 0;
        int n = 6;
        System.out.println("team A ");
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < n; i++) {
                int rand = (int) (Math.random() * range) + min;
                if (rand == 5) {
                    System.out.print(" 0");
                } else {
                    if (rand == 0) {
                        System.out.print(" w");
                        wickets++;
                    } else {
                        System.out.print(" " + rand);
                        sum += rand;
                    }
                }
                if (i > 6) {
                    break;
                }
                if (wickets == 10) {
                    break;
                }
            }
            System.out.println("");
            System.out.printf(" end of %d over \n", j + 1);
        }
        System.out.println(" score of Team A " + sum + " wickets " + wickets);
        System.out.println(" team B ");
        int sum1 = 0;
        int wickets1 = 0;
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < n; i++) {
                int rand = (int) (Math.random() * range) + min;
                if (rand == 5) {
                    System.out.print(" 0");
                } else {
                    if (rand == 0) {
                        System.out.print(" w");
                        wickets1++;
                    } else {
                        System.out.print(" " + rand);
                        sum1 += rand;
                    }
                }
                if (i > 6) {
                    break;
                }
                if (wickets1 == 10) {
                    break;
                }
            }
            System.out.println("");
            System.out.printf(" end of %d over \n", j + 1);
        }
        System.out.println(" score of team B " + sum1 + " wickets " + wickets1);
        if (sum > sum1)
        {
            System.out.println("Team A wins ");
        }
        else if ( sum == sum1)
        {
            System.out.println("draw");
        }

        else
        {
            System.out.println("Team B wins");
        }
    }
}
