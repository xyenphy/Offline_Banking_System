class Main
{
    public static boolean interleaved(String X, String Y, String S)
    {
        if (X.length() == 0 && Y.length() == 0 && S.length() == 0) {
            return true;
        }
 
        if (S.length() == 0) {
            return false;
        }
 
 
        boolean x = (X.length() != 0 && S.charAt(0) == X.charAt(0)) &&
                interleaved(X.substring(1), Y, S.substring(1));
 
 
        boolean y = (Y.length() != 0 && S.charAt(0) == Y.charAt(0)) &&
                interleaved(X, Y.substring(1), S.substring(1));
 
        return x || y;
    }
 
    public static void main(String[] args)
    {
        String X = "ABC";
        String Y = "DEF";
        String S = "ADEBCF";
 
        if (interleaved(X, Y, S)) {
            System.out.print("Given String is interleaving of X and Y");
        } else {
            System.out.print("Given String is not interleaving of X and Y");
        }
    }
}