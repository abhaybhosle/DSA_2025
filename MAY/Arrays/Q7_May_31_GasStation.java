public class Q7_May_31_GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0;
        int totalGas = 0;

        for (int val : cost) { //pehle total cost nikalo
            totalCost += val;
        }

        for (int val : gas) { //phir total gas units nikalo
            totalGas += val;
        }

        if (totalGas < totalCost) { //base case
            return -1;
        }

        int start = 0;
        int currGas = 0;

        for (int i = 0; i < gas.length; i++) {
            currGas += gas[i] - cost[i]; //logic
            if (currGas < 0) {
                start = i + 1;
                currGas = 0;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int gas[] = { 1, 2, 3, 4, 5 };
        int cost[] = { 3, 4, 5, 1, 2 };
        int res = canCompleteCircuit(gas, cost);
        System.out.println(res);
    }
}
