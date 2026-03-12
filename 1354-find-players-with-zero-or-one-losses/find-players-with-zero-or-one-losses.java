class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> lost = new HashMap<>();
        for(int[] it : matches){
            int lose = it[1];
            lost.put(lose, lost.getOrDefault(lose,0) + 1);
        }
        ArrayList<Integer> notlost = new ArrayList<>();
        ArrayList<Integer> onelost = new ArrayList<>();
        for(int[] it : matches){
            int won = it[0];
            int lose = it[1];

            if(lost.get(lose) == 1){
                onelost.add(lose);
            }

            if(!lost.containsKey(won)){
                notlost.add(won);
                lost.put(won,2);
            }
        }

        Collections.sort(notlost);
        Collections.sort(onelost);

        return Arrays.asList(notlost,onelost);
    }
}