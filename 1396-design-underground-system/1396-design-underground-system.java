class Store {
    String station = null;
    int tottime = 0;
    int trips = 0;

    Store(String st, int tot, int tr) {
        station = st;
        tottime = tot;
        trips = tr;
    }
}

class UndergroundSystem {
    HashMap<String, ArrayList<Store>> mp = null;
    HashMap<Integer, Pair<String, Integer>> check = null;

    public UndergroundSystem() {
        mp = new HashMap<>();
        check = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        check.put(id, new Pair<String, Integer>(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        String stat = check.get(id).getKey();

        int time = check.get(id).getValue();

        int tot = t - time;

        check.remove(id);

        if (!mp.containsKey(stat)) {
            mp.put(stat, new ArrayList<Store>());

            mp.get(stat).add(new Store(stationName, tot, 1));
        } else if (mp.containsKey(stat)) {
            ArrayList<Store> arr = mp.get(stat);

            Store temp = null;

            for (Store ap : arr) {
                if (ap.station.equals(stationName)) {
                    temp = ap;
                    break;
                }
            }

            if (temp != null) {
                temp.tottime += tot;

                temp.trips += 1;
            } else {
                mp.get(stat).add(new Store(stationName, tot, 1));
            }
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        ArrayList<Store> temp = mp.get(startStation);

        double ans = 0;

        for (Store m : temp) {
            if (m.station.equals(endStation)) {
                ans = (double) m.tottime / m.trips;

                break;
            }
        }

        return ans;
    }
}
/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
