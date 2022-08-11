class Solution {
String[] comb = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> lc(String digits) {
        if (digits.length() == 0) {
            List<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = digits.charAt(0);

        String ros = digits.substring(1);

        List<String> rres = lc(ros);

        List<String> mres = new ArrayList<>();

        for (int i = 0; i < comb[ch - '0'].length(); i++) {
            char chcode = comb[ch - '0'].charAt(i);
            for (String rstr : rres) {
                mres.add(chcode + rstr);
            }
        }

        return mres;
    }

    

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            List<String> arr = new ArrayList<>();
            return arr;
        }
        else{
            return lc(digits);
        }
    }
}
