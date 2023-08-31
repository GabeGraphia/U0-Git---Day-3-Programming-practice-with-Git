import java.util.HashMap;

public class Atm {
    HashMap<String, Double> map;

    public Atm() {
        map = new HashMap<String, Double>();
    }

    public void openAccount(String accName, Double deposit) throws Exception {
        checkIfValid(accName);
        checkIfValid(deposit);
        if (map.containsKey(accName)) {
            throw new Exception("Account already exists dumbass");
        } else {
            map.put(accName, deposit);
        }
    }

    public void closeAccount(String accName) throws Exception {
        checkIfValid(accName);
        if (!map.containsKey(accName)) {
            throw new Exception("you dont have an account broke ass idiot");
        } else if (map.get(accName) > 0) {
            throw new Exception("you are too rich, get good");
        } else {
            map.remove(accName);
        }
    }

    public Double checkBalance(String accName) throws Exception {
        checkIfValid(accName);
        if (!map.containsKey(accName)) {
            throw new Exception("you dont have an account broke ass idiot");
        } else {
            return map.get(accName);
        }
    }

    public Double depositMoney(String accName, Double amount) throws Exception {
        checkIfValid(accName);
        checkIfValid(amount);
        if (map.containsKey(accName)) {
            map.put(accName, map.get(accName) + amount);
            return amount;
        } else {
            throw new Exception("no account");
        }

    }

    private void checkIfValid(Object obj) throws Exception {
        if (obj == null) {
            throw new Exception("WTF?");
        }
    }

}
