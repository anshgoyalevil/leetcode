class Solution {

    private void backtrack(final List<List<Integer>> result, final List<Integer> subset, final int target, final int[] candidates, final int startIndex) {
        if(target == 0) {
            result.add(new ArrayList<Integer>(subset));
            return;
        }
        for(int i = startIndex; i < candidates.length; ++ i) {
            if(i != startIndex && candidates[i] == candidates[i - 1]) {
                continue;
            }
            int remain = target - candidates[i];
            if(remain < 0) {
                break;
            }
            subset.add(candidates[i]);
            backtrack(result, subset, remain, candidates, i + 1);
            subset.remove(subset.size() - 1);
        }
    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backtrack(result, subset, target, candidates, 0);
        return result;
    }
}