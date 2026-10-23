package week3;



/**
 *
 * @author kevin
 */
public class NESTEDIFVALIDATOR {
    public static void main(String[] args) {
        String name = ("Kevin Cosme");
        String pw = ("kc411");
        String acc = ("Acc1");
        if("Acc1".equals(acc)){
            if ("Kevin Cosme".equals(name)){
              if("kc411".equals(pw)){
                System.out.println("Account logged in");
              }else{System.out.println("Wrong Username or Password");}
                }else{System.out.println("wrong Username or Password");}
                    }else{System.out.println("Account not found");}
        }
    }

