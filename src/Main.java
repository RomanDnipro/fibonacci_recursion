class Main{

    static int fbRecurs(int j){

        if (j < 1){
            return 0;
        }

        if (j < 3){
            return 1;
        }

        return (fbRecurs(j - 1) + fbRecurs(j - 2));
    }

    public static void main(String[] arg){
        System.out.println(fbRecurs(11));
    }
}