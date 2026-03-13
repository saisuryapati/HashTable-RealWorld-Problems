package week1;

import java.util.*;

public class Problem1UsernameChecker {

    HashMap<String,Integer> usernameMap = new HashMap<>();
    HashMap<String,Integer> attemptMap = new HashMap<>();

    public boolean checkAvailability(String username){

        attemptMap.put(username,
                attemptMap.getOrDefault(username,0)+1);

        return !usernameMap.containsKey(username);
    }

    public void registerUser(String username,int id){

        usernameMap.put(username,id);
    }

    public List<String> suggestAlternatives(String username){

        List<String> suggestions = new ArrayList<>();

        for(int i=1;i<=3;i++){

            String newName = username+i;

            if(!usernameMap.containsKey(newName)){
                suggestions.add(newName);
            }
        }

        String modified = username.replace("_",".");

        if(!usernameMap.containsKey(modified)){
            suggestions.add(modified);
        }

        return suggestions;
    }

    public String getMostAttempted(){

        String result="";
        int max=0;

        for(String user:attemptMap.keySet()){

            if(attemptMap.get(user)>max){

                max=attemptMap.get(user);
                result=user;
            }
        }

        return result+" ("+max+" attempts)";
    }

    public static void main(String[] args){

        Problem1UsernameChecker system =
                new Problem1UsernameChecker();

        system.registerUser("john_doe",101);
        system.registerUser("admin",102);

        System.out.println("checkAvailability(john_doe) → "
                +system.checkAvailability("john_doe"));

        System.out.println("checkAvailability(jane_smith) → "
                +system.checkAvailability("jane_smith"));

        System.out.println("suggestAlternatives(john_doe) → "
                +system.suggestAlternatives("john_doe"));

        system.checkAvailability("admin");
        system.checkAvailability("admin");
        system.checkAvailability("admin");

        System.out.println("getMostAttempted() → "
                +system.getMostAttempted());

    }
}