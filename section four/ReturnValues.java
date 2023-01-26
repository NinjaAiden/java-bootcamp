public class ReturnValues {

    public static void main(String[] args) {    
        double area = calculateArea(2.3, 3.6);
        double area2 = calculateArea(1.6, 2.4);
        double area3 = calculateArea(2.6, 4.2);

        printArea(2.3, 3.6, area);
        printArea(1.6, 2.4, area2);
        printArea(2.6, 4.2, area3);
        

        String englishExplanation = explainArea("English");
        String frenchExplanation = explainArea("French");
        String spanishExplanation = explainArea("Spanish");
        String italianExplanation = explainArea("Italian");

        System.out.println(englishExplanation);
        System.out.println(frenchExplanation);
        System.out.println(spanishExplanation);
        System.out.println(italianExplanation);
    }

    public static double calculateArea(double length, double width){
        if (length <0 || width <0){
            System.out.println("INVALID DIMENSIONS");
            System.exit(0);
        }

        double area = length * width;        
        return area;
    }

    public static String explainArea(String language){

        switch (language){
            case "English": return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * ancho";
            default: return "Language not available";
        }
    }

    public static void printArea(double length, double width, double area){
        System.out.println("A rectangle with a length of " + length + " and a width of " + width + "has an area of " + area);
    }
}
