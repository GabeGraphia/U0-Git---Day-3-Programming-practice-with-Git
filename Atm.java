import java.util.HashMap;

public class Atm {
    HashMap<String, Double> map;

    public Atm() {
        map = new HashMap<String, Double>();
    }

    public void openAccount(String AccName, Double deposit) throws Exception {

        if (map.containsKey(AccName)) {
            throw new Exception("Account already exists dumbass");
        } else {
            map.put(AccName, deposit);
        }
    }
}