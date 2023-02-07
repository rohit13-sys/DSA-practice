public class Pattern {
    public static void main(String[] args) {
        int n=5;
        pattern1(1,0,n);

    }

    static void pattern1(int row,int col,int n){

        if(row>n){
            return;
        }

        if(row!=col){
            System.out.print("* ");
            pattern1(row,col+1,n);
        }else {
            System.out.println();
            pattern1(row+1,0,n);
        }

    }
}
