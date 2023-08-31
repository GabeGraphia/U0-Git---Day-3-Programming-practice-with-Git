import java.util.HashMap;

public class Atm {
    HashMap<String, Double> map;

    public Atm() {
        map = new HashMap<String, Double>();
    }

    public void openAccount(String accName, Double deposit) throws Exception {

        if (map.containsKey(accName)) {
            throw new Exception("Account already exists dumbass");
        } else {
            map.put(accName, deposit);
        }
    }

    public void closeAccount(String accName) throws Exception {
        if (!map.containsKey(accName)) {
            throw new Exception("you dont have an account broke ass idiot");
        } else if (map.get(accName) > 0) {
            throw new Exception("you are too rich, get good");
        } else {
            map.remove(accName);
        }
    }

    public Double checkBalance(String accName) throws Exception {
        if (!map.containsKey(accName)) {
            throw new Exception("you dont have an account broke ass idiot");
        } else {
            return map.get(accName);
        }
    }

}
