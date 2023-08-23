public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 100;    //gryffindor points
        int ravenclaw = 500;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;

        if((gryffindor - ravenclaw) >= 300){
            System.out.println("Gryffindor wins the cup!");
        }else if(gryffindor >= ravenclaw){
            System.out.println("In second place, Gryffindor!");
        }else if((gryffindor - ravenclaw) >=100){
            System.out.println("In third place, Gryffindor!");
        }else{
            System.out.println("Gryffindor has come in last!");
        }
        
    }
}
