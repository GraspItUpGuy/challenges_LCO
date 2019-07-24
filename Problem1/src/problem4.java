public class problem4 {
    public static void main(String[] args){
        int hotdog = 400;
        int pack =8;
        int i;
        for(i = 1; pack*i<hotdog; i++ ){}
        System.out.println("number of packages =" + i);

    }
}
