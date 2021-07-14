import java.math.BigInteger;

public class TestingGround {
    public static void main(String[] args) {
//        Random random = new Random();
//        Integer a = random.nextInt(10);
//        Double b = random.nextInt(10) + 1 + 0.1 * random.nextInt(10);
//
//        System.out.println(a);
//        System.out.println(b);
//        Integer hash = a.hashCode(), hashb = b.hashCode();
//        System.out.println(hash);
//        System.out.println(hashb);
//        String s = String.valueOf(a);
//        hash = s.hashCode();
//        System.out.println(hash);
//        hash -= 48;
//        System.out.println(hash);
//
//
//        String s = "1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,2,3,0,4,0,0,0,4,0,3";
//
//        // ENCODE the string
//        StringTokenizer tokenizer = new StringTokenizer(s,",");
//        StringBuilder b = new StringBuilder();
//        b.append("1");  // This is a primer character, in case we end up with a bunch of zeroes at the beginning
//        while(tokenizer.hasMoreTokens()) {
//            String token = tokenizer.nextToken().trim();
//            if(token.length()==1) {
//                b.append("0");
//                b.append(token);
//            }
//            else {
//                b.append(token);
//            }
//        }
//
//        System.out.println(b);
//        // We get this String: 101020000000000000000000000000000000000010202030004000000040003
//
//        String encoded = (new BigInteger(b.toString())).toString(36);
//        System.out.println(encoded);
//        System.out.println(encoded.length());
//        // We get this String: kcocwisb8v46v8lbqjw0n3oaad49dkfdbc5zl9vn
//
//
//        // DECODE the string
//
//        String decoded = (new BigInteger(encoded, 36)).toString();
//        System.out.println(decoded);
//        // We should get this String: 101020000000000000000000000000000000000010202030004000000040003
//
//        StringBuilder p = new StringBuilder();
//        int index = 1;   // we skip the first "1", it was our primer
//        while(index<decoded.length()) {
//            if(index>1) {
//                p.append(",");
//            }
//            p.append(Integer.parseInt(decoded.substring(index,index+2)));
//            index = index+2;
//        }
//
//        System.out.println(p);
//        // We should get this String: 1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,2,3,0,4,0,0,0,4,0,3

        String s = "73-2-9-8-1-02-59-05-83-02-02-10-01-21-03-26-00-02-02-01-11-02-03-12-11";
        StringBuilder b = new StringBuilder();

        String[] vect = s.split("-");
        for (int i = 0; i<vect.length;++i)
            if (vect[i].length()==1)
                vect[i] = "0".concat(vect[i]);
            for (int i = 0; i<vect.length;++i){
                System.out.print(vect[i]);
            }
        System.out.println();

        String [] mass = s.split("-");
        for (String i:mass){
            if (i.length() == 1){
                b.append(0);
                b.append(i);
            }
            else b.append(i);
        }

        String encoded = (new BigInteger(b.toString())).toString(36);
        System.out.println(encoded);
        System.out.println(encoded.length());
        // We get this String: kcocwisb8v46v8lbqjw0n3oaad49dkfdbc5zl9vn


        // DECODE the string

        String decoded = (new BigInteger(encoded, 36)).toString();
        System.out.println(decoded);
        System.out.println(decoded.length());
        String ss = "s";
        ss = "0".concat(ss);
        System.out.println(ss);

    }
}
