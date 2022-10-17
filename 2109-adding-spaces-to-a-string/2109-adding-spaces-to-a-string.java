class Solution {
    public static String addSpaces(String s, int[] spaces) {
        List<String> l = new ArrayList<>();
        int len = spaces.length;
        int prevIndex = -1;
        for(int i = 0; i < len ; i++){
            if(i  == 0) {
                l.add(s.substring(0, spaces[i]) + "-");
                prevIndex = spaces[i];
            }else{
                l.add(s.substring(prevIndex, spaces[i]) + "-");
                prevIndex = spaces[i];
            }
        }
        l.add(s.substring(prevIndex));
        //System.out.println(l);
        StringBuffer sb = new StringBuffer("");
        l.forEach(x -> {
            sb.append(x);
        });
        return sb.toString().replaceAll("-", " ");

    }
}