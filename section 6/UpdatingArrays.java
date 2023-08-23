import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        
        String[] menu= {"Espresso", "Iced Coffee", "Macchiato"};

        menu[2] = "Latte";      // update last element of menu array

        System.out.println(Arrays.toString(menu));

        // move menu array to new larger array
        String[] newMenu = new String[5];
        for (int i = 0; i < menu.length; i++){
            newMenu[i] = menu[i];
        }

        // update empty elements
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";

        // print new menu
        System.out.println(Arrays.toString(newMenu));
    }
}
