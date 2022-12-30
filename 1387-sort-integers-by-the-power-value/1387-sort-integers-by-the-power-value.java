class Solution {

    public int getKth(int lo, int hi, int k) {
        //List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = lo; i <= hi; i++) {
            int powValue = getPowerValue(i);
            map.put(i, powValue);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        //System.out.println("entry before: " + list);
        Collections.sort(
            list,
            new Comparator<Integer>() {

                @Override
                public int compare(Integer one, Integer two) {
                    if (map.get(one) != map.get(two)) {
                        return map.get(one) - map.get(two);
                    }
                    return one - two;
                }
            }
        );
        return list.get(k - 1);
    }

    public static int getPowerValue(int n) {
        int counter = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                counter++;
            } else {
                n = 3 * n + 1;
                counter++;
            }
        }
        return counter;
    }
}
