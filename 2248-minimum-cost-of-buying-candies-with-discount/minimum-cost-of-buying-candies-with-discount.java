class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<cost.length; i++) {
            list.add(cost[i]);
        }

        int sum = 0;

        while(!(list == null || list.isEmpty())) {
            int candy1;
            int candy2;
            candy1 = list.remove(list.size() - 1);
            if(!(list == null || list.isEmpty())) {
                candy2 = list.remove(list.size() - 1);
            } else {
                sum += candy1;
                break;
            }
            
            if(!(list == null || list.isEmpty())) {
                int candy3 = list.remove(list.size() - 1);
            }
            else {
                sum += candy1 + candy2;
                break;
            }

            sum += candy1 + candy2;
        }
        
        return sum;
    }
}